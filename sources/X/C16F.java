package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.16F */
/* loaded from: classes.dex */
public final class C16F {
    public static int A01 = -1;
    public static C16I A02;
    public static C16J A03;
    public static Boolean A04;
    public static String A05;
    public final Context A00;
    public static final ThreadLocal A09 = new ThreadLocal();
    public static final C16B A06 = new C16B() { // from class: X.1c5
        @Override // X.C16B
        public final int AAx(Context context, String str) {
            try {
                ClassLoader classLoader = context.getApplicationContext().getClassLoader();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
                sb.append("com.google.android.gms.dynamite.descriptors.");
                sb.append(str);
                sb.append(".ModuleDescriptor");
                Class<?> loadClass = classLoader.loadClass(sb.toString());
                Field declaredField = loadClass.getDeclaredField("MODULE_ID");
                Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
                if (!declaredField.get(null).equals(str)) {
                    String valueOf = String.valueOf(declaredField.get(null));
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
                    sb2.append("Module descriptor id '");
                    sb2.append(valueOf);
                    sb2.append("' didn't match expected id '");
                    sb2.append(str);
                    sb2.append("'");
                    Log.e("DynamiteModule", sb2.toString());
                    return 0;
                }
                return declaredField2.getInt(null);
            } catch (ClassNotFoundException unused) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
                sb3.append("Local module descriptor class for ");
                sb3.append(str);
                sb3.append(" not found.");
                Log.w("DynamiteModule", sb3.toString());
                return 0;
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
                return 0;
            }
        }

        @Override // X.C16B
        public final int AWa(Context context, String str, boolean z) {
            Class<?> loadClass;
            Field declaredField;
            try {
            } catch (Throwable th) {
                try {
                    C07K.A1P(context);
                    C07K.A1P(th);
                    throw th;
                } catch (Exception e) {
                    Log.e("CrashUtils", "Error adding exception to DropBox!", e);
                    throw th;
                }
            }
            synchronized (C16F.class) {
                Boolean bool = C16F.A04;
                if (bool == null) {
                    try {
                        loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName());
                        declaredField = loadClass.getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String valueOf = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (loadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    C16F.A04(classLoader);
                                } catch (C16A unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int A00 = C16F.A00(context, str, z);
                                String str2 = C16F.A05;
                                if (str2 == null || str2.isEmpty()) {
                                    return A00;
                                }
                                PathClassLoader pathClassLoader = new PathClassLoader(str2, ClassLoader.getSystemClassLoader()) { // from class: X.16H
                                    @Override // java.lang.ClassLoader
                                    public final Class loadClass(String str3, boolean z2) {
                                        if (!str3.startsWith("java.") && !str3.startsWith("android.")) {
                                            try {
                                                return findClass(str3);
                                            } catch (ClassNotFoundException unused2) {
                                            }
                                        }
                                        return super.loadClass(str3, z2);
                                    }
                                };
                                C16F.A04(pathClassLoader);
                                declaredField.set(null, pathClassLoader);
                                C16F.A04 = Boolean.TRUE;
                                return A00;
                            } catch (C16A unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        C16F.A04 = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return C16F.A00(context, str, z);
                    } catch (C16A e3) {
                        String valueOf2 = String.valueOf(e3.getMessage());
                        Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                C16I A032 = C16F.A03(context);
                if (A032 == null) {
                    return 0;
                }
                try {
                    if (A032.AX1() >= 2) {
                        return A032.AX2(new BinderC06190Rw(context), str, z);
                    }
                    Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                    return A032.AWb(new BinderC06190Rw(context), str, z);
                } catch (RemoteException e4) {
                    String valueOf3 = String.valueOf(e4.getMessage());
                    Log.w("DynamiteModule", valueOf3.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf3) : new String("Failed to retrieve remote module version: "));
                    return 0;
                }
                C07K.A1P(context);
                C07K.A1P(th);
                throw th;
            }
        }
    };
    public static final C16D A08 = new C16D() { // from class: X.1c6
        @Override // X.C16D
        public final C16C AWj(Context context, String str, C16B c16b) {
            C16C c16c = new C16C();
            int AWa = c16b.AWa(context, str, true);
            c16c.A01 = AWa;
            if (AWa != 0) {
                c16c.A02 = 1;
            } else {
                int AAx = c16b.AAx(context, str);
                c16c.A00 = AAx;
                if (AAx != 0) {
                    c16c.A02 = -1;
                    return c16c;
                }
            }
            return c16c;
        }
    };
    public static final C16D A07 = new C16D() { // from class: X.1c7
        @Override // X.C16D
        public final C16C AWj(Context context, String str, C16B c16b) {
            C16C c16c = new C16C();
            c16c.A00 = c16b.AAx(context, str);
            int AWa = c16b.AWa(context, str, true);
            c16c.A01 = AWa;
            int i = c16c.A00;
            if (i == 0 && AWa == 0) {
                c16c.A02 = 0;
                return c16c;
            } else if (AWa >= i) {
                c16c.A02 = 1;
                return c16c;
            } else {
                c16c.A02 = -1;
                return c16c;
            }
        }
    };

    public C16F(Context context) {
        C07K.A1P(context);
        this.A00 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            r6 = 0
            android.content.ContentResolver r4 = r7.getContentResolver()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            if (r9 == 0) goto L3f
            java.lang.String r3 = "api_force_staging"
        L9:
            int r0 = r3.length()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            int r2 = r0 + 42
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            int r0 = r0.length()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            int r2 = r2 + r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            r1.<init>(r2)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            java.lang.String r0 = "content://com.google.android.gms.chimera/"
            r1.append(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            r1.append(r3)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            r1.append(r8)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            android.net.Uri r5 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            r7 = r6
            r8 = r6
            r9 = r6
            android.database.Cursor r6 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La8
            if (r6 == 0) goto L80
            goto L42
        L3f:
            java.lang.String r3 = "api"
            goto L9
        L42:
            boolean r0 = r6.moveToFirst()     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            if (r0 == 0) goto L80
            r0 = 0
            int r2 = r6.getInt(r0)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            if (r2 <= 0) goto L7c
            java.lang.Class<X.16F> r1 = X.C16F.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            r0 = 2
            java.lang.String r0 = r6.getString(r0)     // Catch: java.lang.Throwable -> L79
            X.C16F.A05 = r0     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "loaderVersion"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L79
            if (r0 < 0) goto L67
            int r0 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L79
            X.C16F.A01 = r0     // Catch: java.lang.Throwable -> L79
        L67:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            java.lang.ThreadLocal r0 = X.C16F.A09     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            X.16E r1 = (X.C16E) r1     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            if (r1 == 0) goto L7c
            android.database.Cursor r0 = r1.A00     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            if (r0 != 0) goto L7c
            r1.A00 = r6     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            return r2
        L79:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
        L7c:
            r6.close()
            return r2
        L80:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            java.lang.String r1 = "Failed to connect to dynamite module ContentResolver."
            X.16A r0 = new X.16A     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
            throw r0     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La1
        L8f:
            r2 = move-exception
            goto L92
        L91:
            r2 = move-exception
        L92:
            boolean r0 = r2 instanceof X.C16A     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L97
            throw r2     // Catch: java.lang.Throwable -> L9f
        L97:
            java.lang.String r1 = "V2 version check failed"
            X.16A r0 = new X.16A     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            goto La2
        La1:
            r0 = move-exception
        La2:
            if (r6 == 0) goto La9
            r6.close()
            throw r0
        La8:
            r0 = move-exception
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16F.A00(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0246, code lost:
        if (r11.A00 != 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01c5 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C16F A01(android.content.Context r14, X.C16D r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16F.A01(android.content.Context, X.16D, java.lang.String):X.16F");
    }

    public static C16F A02(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new C16F(context.getApplicationContext());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0039, code lost:
        if (r1 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C16I A03(android.content.Context r6) {
        /*
            java.lang.Class<X.16F> r5 = X.C16F.class
            monitor-enter(r5)
            X.16I r0 = X.C16F.A02     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L9
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            return r0
        L9:
            X.0Rz r0 = X.C06220Rz.A00     // Catch: java.lang.Throwable -> L69
            int r0 = r0.A00(r6)     // Catch: java.lang.Throwable -> L69
            r4 = 0
            if (r0 == 0) goto L14
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            return r4
        L14:
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r6.createPackageContext(r1, r0)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            java.lang.Object r2 = r0.newInstance()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            if (r2 == 0) goto L60
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            boolean r0 = r1 instanceof X.C16I     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            if (r0 == 0) goto L3e
            X.16I r1 = (X.C16I) r1     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            if (r1 == 0) goto L60
        L3b:
            X.C16F.A02 = r1     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            goto L44
        L3e:
            X.1c8 r1 = new X.1c8     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            r1.<init>(r2)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L69
            goto L3b
        L44:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            return r1
        L46:
            r0 = move-exception
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r2 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L69
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L62
            java.lang.String r0 = r2.concat(r1)     // Catch: java.lang.Throwable -> L69
        L5d:
            android.util.Log.e(r3, r0)     // Catch: java.lang.Throwable -> L69
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            goto L68
        L62:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L69
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L69
            goto L5d
        L68:
            return r4
        L69:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16F.A03(android.content.Context):X.16I");
    }

    public static void A04(ClassLoader classLoader) {
        C16J c16j = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C16J) {
                    c16j = (C16J) queryLocalInterface;
                } else {
                    c16j = new C31361c9(iBinder);
                }
            }
            A03 = c16j;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C16A("Failed to instantiate dynamite loader", e);
        }
    }
}
