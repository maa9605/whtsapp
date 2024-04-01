package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: X.00p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C001300p {
    public static final Set A00 = new HashSet();
    public static final boolean A01;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder A0V = C000200d.A0V("VM with version ", property);
        A0V.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", A0V.toString());
        A01 = z;
    }

    public static Field A00(Object obj, String str) {
        Class<?> cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                    return declaredField;
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder A0W = C000200d.A0W("Field ", str, " not found in ");
        A0W.append(cls);
        throw new NoSuchFieldException(A0W.toString());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.02I] */
    public static void A01(Context context) {
        Log.i("MultiDex", "Installing application");
        try {
            if (A01) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    final File file = new File(applicationInfo.sourceDir);
                    File file2 = new File(applicationInfo.dataDir);
                    Set set = A00;
                    synchronized (set) {
                        if (!set.contains(file)) {
                            set.add(file);
                            int i = Build.VERSION.SDK_INT;
                            if (i > 20) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("MultiDex is not guaranteed to work in SDK version ");
                                sb.append(i);
                                sb.append(": SDK version higher than ");
                                sb.append(20);
                                sb.append(" should be backed by ");
                                sb.append("runtime with built-in multidex capabilty but it's not the ");
                                sb.append("case here: java.vm.version=\"");
                                sb.append(System.getProperty("java.vm.version"));
                                sb.append("\"");
                                Log.w("MultiDex", sb.toString());
                            }
                            try {
                                ClassLoader classLoader = context.getClassLoader();
                                if (classLoader instanceof BaseDexClassLoader) {
                                    if (classLoader != null) {
                                        try {
                                            File file3 = new File(context.getFilesDir(), "secondary-dexes");
                                            if (file3.isDirectory()) {
                                                StringBuilder A0P = C000200d.A0P("Clearing old secondary dex dir (");
                                                A0P.append(file3.getPath());
                                                A0P.append(").");
                                                Log.i("MultiDex", A0P.toString());
                                                File[] listFiles = file3.listFiles();
                                                if (listFiles == null) {
                                                    StringBuilder A0P2 = C000200d.A0P("Failed to list secondary dex dir content (");
                                                    A0P2.append(file3.getPath());
                                                    A0P2.append(").");
                                                    Log.w("MultiDex", A0P2.toString());
                                                } else {
                                                    for (File file4 : listFiles) {
                                                        StringBuilder A0P3 = C000200d.A0P("Trying to delete old file ");
                                                        A0P3.append(file4.getPath());
                                                        A0P3.append(" of size ");
                                                        A0P3.append(file4.length());
                                                        Log.i("MultiDex", A0P3.toString());
                                                        if (!file4.delete()) {
                                                            StringBuilder A0P4 = C000200d.A0P("Failed to delete old file ");
                                                            A0P4.append(file4.getPath());
                                                            Log.w("MultiDex", A0P4.toString());
                                                        } else {
                                                            StringBuilder A0P5 = C000200d.A0P("Deleted old file ");
                                                            A0P5.append(file4.getPath());
                                                            Log.i("MultiDex", A0P5.toString());
                                                        }
                                                    }
                                                    if (!file3.delete()) {
                                                        StringBuilder A0P6 = C000200d.A0P("Failed to delete secondary dex dir ");
                                                        A0P6.append(file3.getPath());
                                                        Log.w("MultiDex", A0P6.toString());
                                                    } else {
                                                        StringBuilder A0P7 = C000200d.A0P("Deleted old secondary dex dir ");
                                                        A0P7.append(file3.getPath());
                                                        Log.i("MultiDex", A0P7.toString());
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                                        }
                                        File file5 = new File(file2, "code_cache");
                                        try {
                                            A02(file5);
                                        } catch (IOException unused) {
                                            file5 = new File(context.getFilesDir(), "code_cache");
                                            A02(file5);
                                        }
                                        final File file6 = new File(file5, "secondary-dexes");
                                        A02(file6);
                                        ?? r2 = new Closeable(file, file6) { // from class: X.02I
                                            public final long A00;
                                            public final File A01;
                                            public final File A02;
                                            public final RandomAccessFile A03;
                                            public final FileChannel A04;
                                            public final FileLock A05;

                                            {
                                                StringBuilder A0P8 = C000200d.A0P("MultiDexExtractor(");
                                                A0P8.append(file.getPath());
                                                A0P8.append(", ");
                                                A0P8.append(file6.getPath());
                                                A0P8.append(")");
                                                Log.i("MultiDex", A0P8.toString());
                                                this.A02 = file;
                                                this.A01 = file6;
                                                this.A00 = A00(file);
                                                File file7 = new File(file6, "MultiDex.lock");
                                                RandomAccessFile randomAccessFile = new RandomAccessFile(file7, "rw");
                                                this.A03 = randomAccessFile;
                                                try {
                                                    this.A04 = randomAccessFile.getChannel();
                                                    try {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("Blocking on lock ");
                                                        sb2.append(file7.getPath());
                                                        Log.i("MultiDex", sb2.toString());
                                                        this.A05 = this.A04.lock();
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(file7.getPath());
                                                        sb3.append(" locked");
                                                        Log.i("MultiDex", sb3.toString());
                                                    } catch (IOException | Error | RuntimeException e) {
                                                        A02(this.A04);
                                                        throw e;
                                                    }
                                                } catch (IOException | Error | RuntimeException e2) {
                                                    A02(this.A03);
                                                    throw e2;
                                                }
                                            }

                                            public static long A00(File file7) {
                                                RandomAccessFile randomAccessFile = new RandomAccessFile(file7, "r");
                                                try {
                                                    long length = randomAccessFile.length() - 22;
                                                    if (length >= 0) {
                                                        long j = length - 65536;
                                                        long j2 = j >= 0 ? j : 0L;
                                                        int reverseBytes = Integer.reverseBytes(101010256);
                                                        do {
                                                            randomAccessFile.seek(length);
                                                            if (randomAccessFile.readInt() == reverseBytes) {
                                                                randomAccessFile.skipBytes(2);
                                                                randomAccessFile.skipBytes(2);
                                                                randomAccessFile.skipBytes(2);
                                                                randomAccessFile.skipBytes(2);
                                                                C02J c02j = new C02J();
                                                                c02j.A01 = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                                                                c02j.A00 = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                                                                CRC32 crc32 = new CRC32();
                                                                long j3 = c02j.A01;
                                                                randomAccessFile.seek(c02j.A00);
                                                                byte[] bArr = new byte[16384];
                                                                int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
                                                                while (read != -1) {
                                                                    crc32.update(bArr, 0, read);
                                                                    j3 -= read;
                                                                    if (j3 == 0) {
                                                                        break;
                                                                    }
                                                                    read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
                                                                }
                                                                long value = crc32.getValue();
                                                                randomAccessFile.close();
                                                                return value == -1 ? value - 1 : value;
                                                            }
                                                            length--;
                                                        } while (length >= j2);
                                                        throw new ZipException("End Of Central Directory signature not found");
                                                    }
                                                    StringBuilder A0P8 = C000200d.A0P("File too short to be a zip file: ");
                                                    A0P8.append(randomAccessFile.length());
                                                    throw new ZipException(A0P8.toString());
                                                } catch (Throwable th2) {
                                                    randomAccessFile.close();
                                                    throw th2;
                                                }
                                            }

                                            public static void A01(Context context2, long j, long j2, List list) {
                                                SharedPreferences.Editor edit = context2.getSharedPreferences("multidex.version", 4).edit();
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("");
                                                sb2.append("timestamp");
                                                edit.putLong(sb2.toString(), j);
                                                edit.putLong(C000200d.A0L(new StringBuilder(), "", "crc"), j2);
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("");
                                                sb3.append("dex.number");
                                                edit.putInt(sb3.toString(), list.size() + 1);
                                                Iterator it = list.iterator();
                                                int i2 = 2;
                                                while (it.hasNext()) {
                                                    C02K c02k = (C02K) it.next();
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append("");
                                                    sb4.append("dex.crc.");
                                                    sb4.append(i2);
                                                    edit.putLong(sb4.toString(), c02k.crc);
                                                    StringBuilder sb5 = new StringBuilder();
                                                    sb5.append("");
                                                    sb5.append("dex.time.");
                                                    sb5.append(i2);
                                                    edit.putLong(sb5.toString(), c02k.lastModified());
                                                    i2++;
                                                }
                                                edit.commit();
                                            }

                                            public static void A02(Closeable closeable) {
                                                try {
                                                    closeable.close();
                                                } catch (IOException e) {
                                                    Log.w("MultiDex", "Failed to close resource", e);
                                                }
                                            }

                                            public final List A03() {
                                                StringBuilder sb2 = new StringBuilder();
                                                File file7 = this.A02;
                                                sb2.append(file7.getName());
                                                sb2.append(".classes");
                                                String obj = sb2.toString();
                                                File file8 = this.A01;
                                                File[] listFiles2 = file8.listFiles(new FileFilter() { // from class: X.0mK
                                                    @Override // java.io.FileFilter
                                                    public boolean accept(File file9) {
                                                        return !file9.getName().equals("MultiDex.lock");
                                                    }
                                                });
                                                if (listFiles2 == null) {
                                                    StringBuilder A0P8 = C000200d.A0P("Failed to list secondary dex dir content (");
                                                    A0P8.append(file8.getPath());
                                                    A0P8.append(").");
                                                    Log.w("MultiDex", A0P8.toString());
                                                } else {
                                                    for (File file9 : listFiles2) {
                                                        StringBuilder A0P9 = C000200d.A0P("Trying to delete old file ");
                                                        A0P9.append(file9.getPath());
                                                        A0P9.append(" of size ");
                                                        A0P9.append(file9.length());
                                                        Log.i("MultiDex", A0P9.toString());
                                                        if (!file9.delete()) {
                                                            StringBuilder A0P10 = C000200d.A0P("Failed to delete old file ");
                                                            A0P10.append(file9.getPath());
                                                            Log.w("MultiDex", A0P10.toString());
                                                        } else {
                                                            StringBuilder A0P11 = C000200d.A0P("Deleted old file ");
                                                            A0P11.append(file9.getPath());
                                                            Log.i("MultiDex", A0P11.toString());
                                                        }
                                                    }
                                                }
                                                ArrayList arrayList = new ArrayList();
                                                ZipFile zipFile = new ZipFile(file7);
                                                int i2 = 2;
                                                try {
                                                    ZipEntry entry = zipFile.getEntry("classes2.dex");
                                                    while (entry != null) {
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(obj);
                                                        sb3.append(i2);
                                                        sb3.append(".zip");
                                                        C02K c02k = new C02K(file8, sb3.toString());
                                                        arrayList.add(c02k);
                                                        StringBuilder sb4 = new StringBuilder();
                                                        sb4.append("Extraction is needed for file ");
                                                        sb4.append(c02k);
                                                        Log.i("MultiDex", sb4.toString());
                                                        int i3 = 0;
                                                        boolean z = false;
                                                        while (i3 < 3 && !z) {
                                                            i3++;
                                                            InputStream inputStream = zipFile.getInputStream(entry);
                                                            File createTempFile = File.createTempFile(C000200d.A0H("tmp-", obj), ".zip", c02k.getParentFile());
                                                            StringBuilder A0P12 = C000200d.A0P("Extracting ");
                                                            A0P12.append(createTempFile.getPath());
                                                            Log.i("MultiDex", A0P12.toString());
                                                            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                                                            try {
                                                                ZipEntry zipEntry = new ZipEntry("classes.dex");
                                                                zipEntry.setTime(entry.getTime());
                                                                zipOutputStream.putNextEntry(zipEntry);
                                                                byte[] bArr = new byte[16384];
                                                                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                                                                    zipOutputStream.write(bArr, 0, read);
                                                                }
                                                                zipOutputStream.closeEntry();
                                                                zipOutputStream.close();
                                                                if (createTempFile.setReadOnly()) {
                                                                    StringBuilder sb5 = new StringBuilder();
                                                                    sb5.append("Renaming to ");
                                                                    sb5.append(c02k.getPath());
                                                                    Log.i("MultiDex", sb5.toString());
                                                                    if (createTempFile.renameTo(c02k)) {
                                                                        A02(inputStream);
                                                                        createTempFile.delete();
                                                                        try {
                                                                            c02k.crc = A00(c02k);
                                                                            z = true;
                                                                        } catch (IOException e) {
                                                                            StringBuilder sb6 = new StringBuilder();
                                                                            sb6.append("Failed to read crc from ");
                                                                            sb6.append(c02k.getAbsolutePath());
                                                                            Log.w("MultiDex", sb6.toString(), e);
                                                                            z = false;
                                                                        }
                                                                        StringBuilder sb7 = new StringBuilder();
                                                                        sb7.append("Extraction ");
                                                                        sb7.append(z ? "succeeded" : "failed");
                                                                        sb7.append(" '");
                                                                        sb7.append(c02k.getAbsolutePath());
                                                                        sb7.append("': length ");
                                                                        sb7.append(c02k.length());
                                                                        sb7.append(" - crc: ");
                                                                        sb7.append(c02k.crc);
                                                                        Log.i("MultiDex", sb7.toString());
                                                                        if (!z) {
                                                                            c02k.delete();
                                                                            if (c02k.exists()) {
                                                                                StringBuilder sb8 = new StringBuilder();
                                                                                sb8.append("Failed to delete corrupted secondary dex '");
                                                                                sb8.append(c02k.getPath());
                                                                                sb8.append("'");
                                                                                Log.w("MultiDex", sb8.toString());
                                                                            }
                                                                        }
                                                                    } else {
                                                                        StringBuilder sb9 = new StringBuilder();
                                                                        sb9.append("Failed to rename \"");
                                                                        sb9.append(createTempFile.getAbsolutePath());
                                                                        sb9.append("\" to \"");
                                                                        sb9.append(c02k.getAbsolutePath());
                                                                        sb9.append("\"");
                                                                        throw new IOException(sb9.toString());
                                                                    }
                                                                } else {
                                                                    StringBuilder sb10 = new StringBuilder();
                                                                    sb10.append("Failed to mark readonly \"");
                                                                    sb10.append(createTempFile.getAbsolutePath());
                                                                    sb10.append("\" (tmp of \"");
                                                                    sb10.append(c02k.getAbsolutePath());
                                                                    sb10.append("\")");
                                                                    throw new IOException(sb10.toString());
                                                                }
                                                            } catch (Throwable th2) {
                                                                zipOutputStream.close();
                                                                throw th2;
                                                            }
                                                        }
                                                        if (z) {
                                                            i2++;
                                                            StringBuilder sb11 = new StringBuilder();
                                                            sb11.append("classes");
                                                            sb11.append(i2);
                                                            sb11.append(".dex");
                                                            entry = zipFile.getEntry(sb11.toString());
                                                        } else {
                                                            StringBuilder sb12 = new StringBuilder();
                                                            sb12.append("Could not create zip file ");
                                                            sb12.append(c02k.getAbsolutePath());
                                                            sb12.append(" for secondary dex (");
                                                            sb12.append(i2);
                                                            sb12.append(")");
                                                            throw new IOException(sb12.toString());
                                                        }
                                                    }
                                                    try {
                                                        zipFile.close();
                                                        return arrayList;
                                                    } catch (IOException e2) {
                                                        Log.w("MultiDex", "Failed to close resource", e2);
                                                        return arrayList;
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        zipFile.close();
                                                        throw th3;
                                                    } catch (IOException e3) {
                                                        Log.w("MultiDex", "Failed to close resource", e3);
                                                        throw th3;
                                                    }
                                                }
                                            }

                                            /* JADX WARN: Code restructure failed: missing block: B:12:0x008c, code lost:
                                                if (r1 != 0) goto L40;
                                             */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
                                            /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
                                            /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
                                            /* JADX WARN: Type inference failed for: r0v31, types: [java.util.AbstractCollection, java.util.ArrayList] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            public java.util.List A04(android.content.Context r25, boolean r26) {
                                                /*
                                                    Method dump skipped, instructions count: 504
                                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C02I.A04(android.content.Context, boolean):java.util.List");
                                            }

                                            @Override // java.io.Closeable, java.lang.AutoCloseable
                                            public void close() {
                                                this.A05.release();
                                                this.A04.close();
                                                this.A03.close();
                                            }
                                        };
                                        try {
                                            try {
                                                A03(classLoader, file6, r2.A04(context, false));
                                            } catch (IOException e) {
                                                Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e);
                                                A03(classLoader, file6, r2.A04(context, true));
                                            }
                                            try {
                                            } catch (IOException e2) {
                                                throw e2;
                                            }
                                        } finally {
                                            try {
                                                r2.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                    }
                                } else {
                                    Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                                }
                            } catch (RuntimeException e3) {
                                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e3);
                            }
                        }
                    }
                    Log.i("MultiDex", "install done");
                    return;
                }
            } catch (RuntimeException e4) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e4);
            }
            Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
        } catch (Exception e5) {
            Log.e("MultiDex", "MultiDex installation failure", e5);
            StringBuilder A0P8 = C000200d.A0P("MultiDex installation failed (");
            A0P8.append(e5.getMessage());
            A0P8.append(").");
            throw new RuntimeException(A0P8.toString());
        }
    }

    public static void A02(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder A0P = C000200d.A0P("Failed to create dir ");
                A0P.append(file.getPath());
                A0P.append(". Parent file is null.");
                Log.e("MultiDex", A0P.toString());
            } else {
                StringBuilder A0P2 = C000200d.A0P("Failed to create dir ");
                A0P2.append(file.getPath());
                A0P2.append(". parent file is a dir ");
                A0P2.append(parentFile.isDirectory());
                A0P2.append(", a file ");
                A0P2.append(parentFile.isFile());
                A0P2.append(", exists ");
                A0P2.append(parentFile.exists());
                A0P2.append(", readable ");
                A0P2.append(parentFile.canRead());
                A0P2.append(", writable ");
                A0P2.append(parentFile.canWrite());
                Log.e("MultiDex", A0P2.toString());
            }
            StringBuilder A0P3 = C000200d.A0P("Failed to create directory ");
            A0P3.append(file.getPath());
            throw new IOException(A0P3.toString());
        }
    }

    public static void A03(ClassLoader classLoader, File file, List list) {
        InterfaceC14040mJ interfaceC14040mJ;
        Object obj;
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Object obj2 = A00(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            Class<?> cls = obj2.getClass();
            while (cls != null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    A04(obj2, "dexElements", (Object[]) declaredMethod.invoke(obj2, arrayList2, file, arrayList));
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (Throwable) it.next());
                        }
                        Field A002 = A00(obj2, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr = (IOException[]) A002.get(obj2);
                        if (iOExceptionArr == null) {
                            obj = arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            int size = arrayList.size();
                            int length = iOExceptionArr.length;
                            obj = new IOException[size + length];
                            arrayList.toArray(obj);
                            System.arraycopy(iOExceptionArr, 0, obj, arrayList.size(), length);
                        }
                        A002.set(obj2, obj);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            StringBuilder A0W = C000200d.A0W("Method ", "makeDexElements", " with parameters ");
            A0W.append(Arrays.asList(clsArr));
            A0W.append(" not found in ");
            A0W.append(cls);
            throw new NoSuchMethodException(A0W.toString());
        }
        Object obj3 = A00(classLoader, "pathList").get(classLoader);
        final Class<?> cls2 = Class.forName("dalvik.system.DexPathList$Element");
        try {
            try {
                interfaceC14040mJ = new InterfaceC14040mJ(cls2) { // from class: X.1Tm
                    public final Constructor A00;

                    {
                        Constructor constructor = cls2.getConstructor(File.class, ZipFile.class, DexFile.class);
                        this.A00 = constructor;
                        constructor.setAccessible(true);
                    }

                    @Override // X.InterfaceC14040mJ
                    public Object AGf(File file2, DexFile dexFile) {
                        return this.A00.newInstance(file2, new ZipFile(file2), dexFile);
                    }
                };
            } catch (NoSuchMethodException unused2) {
                interfaceC14040mJ = new InterfaceC14040mJ(cls2) { // from class: X.1Tn
                    public final Constructor A00;

                    {
                        Constructor constructor = cls2.getConstructor(File.class, File.class, DexFile.class);
                        this.A00 = constructor;
                        constructor.setAccessible(true);
                    }

                    @Override // X.InterfaceC14040mJ
                    public Object AGf(File file2, DexFile dexFile) {
                        return this.A00.newInstance(file2, file2, dexFile);
                    }
                };
            }
        } catch (NoSuchMethodException unused3) {
            interfaceC14040mJ = new InterfaceC14040mJ(cls2) { // from class: X.1To
                public final Constructor A00;

                {
                    Constructor constructor = cls2.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                    this.A00 = constructor;
                    constructor.setAccessible(true);
                }

                @Override // X.InterfaceC14040mJ
                public Object AGf(File file2, DexFile dexFile) {
                    return this.A00.newInstance(file2, Boolean.FALSE, file2, dexFile);
                }
            };
        }
        int size2 = list.size();
        Object[] objArr = new Object[size2];
        for (int i = 0; i < size2; i++) {
            File file2 = (File) list.get(i);
            String path = file2.getPath();
            File parentFile = file2.getParentFile();
            String name = file2.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(name.substring(0, name.length() - 4));
            sb.append(".dex");
            objArr[i] = interfaceC14040mJ.AGf(file2, DexFile.loadDex(path, new File(parentFile, sb.toString()).getPath(), 0));
        }
        try {
            A04(obj3, "dexElements", objArr);
        } catch (NoSuchFieldException e) {
            Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
            A04(obj3, "pathElements", objArr);
        }
    }

    public static void A04(Object obj, String str, Object[] objArr) {
        Field A002 = A00(obj, str);
        Object[] objArr2 = (Object[]) A002.get(obj);
        Class<?> componentType = objArr2.getClass().getComponentType();
        int length = objArr2.length;
        int length2 = objArr.length;
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(objArr2, 0, newInstance, 0, length);
        System.arraycopy(objArr, 0, newInstance, length, length2);
        A002.set(obj, newInstance);
    }
}
