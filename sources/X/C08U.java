package X;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.search.verification.client.R;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.iid.Registrar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.08U */
/* loaded from: classes.dex */
public class C08U {
    public final Context A00;
    public final SharedPreferences A01;
    public final C08W A02;
    public final C02200Ag A03;
    public final String A04;
    public final AtomicBoolean A07;
    public static final List A0A = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");
    public static final List A0B = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    public static final List A0C = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");
    public static final List A0D = Arrays.asList(new String[0]);
    public static final Set A0F = Collections.emptySet();
    public static final Object A09 = new Object();
    public static final Executor A0G = new Executor() { // from class: X.08V
        public static final Handler A00 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            A00.post(runnable);
        }
    };
    public static final Map A0E = new C006702y();
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final List A05 = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    public C08U(Context context, C08W c08w) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ?? arrayList;
        C07K.A1P(context);
        this.A00 = context;
        C07K.A1T("[DEFAULT]");
        this.A04 = "[DEFAULT]";
        C07K.A1P(c08w);
        this.A02 = c08w;
        StringBuilder sb = new StringBuilder("com.google.firebase.common.prefs:");
        sb.append("[DEFAULT]");
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        this.A01 = sharedPreferences;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = this.A01.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = this.A00.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.A00.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
        }
        this.A07 = new AtomicBoolean(z);
        Bundle bundle2 = null;
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager2.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", "ComponentDiscoveryService has no service info.");
                } else {
                    bundle2 = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle2 == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str : bundle2.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle2.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                Class<?> cls = Class.forName(str2);
                if (Registrar.class.isAssignableFrom(cls)) {
                    arrayList2.add(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str2, "com.google.firebase.components.ComponentRegistrar"));
                }
            } catch (ClassNotFoundException e) {
                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str2), e);
            } catch (IllegalAccessException e2) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str2), e2);
            } catch (InstantiationException e3) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str2), e3);
            } catch (NoSuchMethodException e4) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str2), e4);
            } catch (InvocationTargetException e5) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str2), e5);
            }
        }
        Executor executor = A0G;
        C017508d c017508d = new C017508d(C0BF.class, new Class[0]);
        c017508d.A01(new C0BG(AbstractC019809e.class, 2));
        C0BH c0bh = new C08f() { // from class: X.0BH
            @Override // X.C08f
            public Object A6i(AbstractC02210Ah abstractC02210Ah) {
                Set A03 = abstractC02210Ah.A03(AbstractC019809e.class);
                C0BX c0bx = C0BX.A01;
                if (c0bx == null) {
                    synchronized (C0BX.class) {
                        c0bx = C0BX.A01;
                        if (c0bx == null) {
                            c0bx = new C0BX();
                            C0BX.A01 = c0bx;
                        }
                    }
                }
                return new C0BF(A03, c0bx);
            }
        };
        C07K.A1Q(c0bh, "Null factory");
        c017508d.A01 = c0bh;
        C02200Ag c02200Ag = new C02200Ag(executor, arrayList2, C017408c.A00(context, Context.class, new Class[0]), C017408c.A00(this, C08U.class, new Class[0]), C017408c.A00(c08w, C08W.class, new Class[0]), AnonymousClass088.A0Y("fire-android", ""), AnonymousClass088.A0Y("fire-core", "16.1.0"), c017508d.A00());
        this.A03 = c02200Ag;
        c02200Ag.A02(C0BL.class);
    }

    public static C08U A00() {
        C08U c08u;
        synchronized (A09) {
            c08u = (C08U) A0E.get("[DEFAULT]");
            if (c08u == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(C232515u.A00());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return c08u;
    }

    public static C08U A01(Context context) {
        synchronized (A09) {
            Map map = A0E;
            if (map.containsKey("[DEFAULT]")) {
                return A00();
            }
            C07K.A1P(context);
            Resources resources = context.getResources();
            String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
            String string = identifier == 0 ? null : resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
            String string2 = identifier2 == 0 ? null : resources.getString(identifier2);
            int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
            String string3 = identifier3 == 0 ? null : resources.getString(identifier3);
            int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
            String string4 = identifier4 == 0 ? null : resources.getString(identifier4);
            int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
            String string5 = identifier5 == 0 ? null : resources.getString(identifier5);
            int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
            String string6 = identifier6 == 0 ? null : resources.getString(identifier6);
            int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
            C08W c08w = new C08W(string, string2, string3, string4, string5, string6, identifier7 != 0 ? resources.getString(identifier7) : null);
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (C08X.A00.get() == null) {
                    C08X c08x = new C08X();
                    if (C08X.A00.compareAndSet(null, c08x)) {
                        C08Z.A00(application);
                        C08Z c08z = C08Z.A04;
                        synchronized (c08z) {
                            c08z.A01.add(c08x);
                        }
                    }
                }
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            C07K.A1c(map.containsKey("[DEFAULT]") ? false : true, "FirebaseApp name [DEFAULT] already exists!");
            C07K.A1Q(context, "Application context cannot be null.");
            C08U c08u = new C08U(context, c08w);
            map.put("[DEFAULT]", c08u);
            c08u.A04();
            return c08u;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(Class cls, Object obj, Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                try {
                } catch (ClassNotFoundException unused) {
                    if (!A0F.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is not linked. Skipping initialization.");
                        Log.d("FirebaseApp", sb.toString());
                    } else {
                        throw new IllegalStateException(C000200d.A0H(str, " is missing, but is required. Check if it has been removed by Proguard."));
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb2 = new StringBuilder("Failed to initialize ");
                    sb2.append(str);
                    Log.wtf("FirebaseApp", sb2.toString(), e);
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(C000200d.A0H(str, "#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e2) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e2);
                }
                if (A0D.contains(str)) {
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, obj);
            }
        }
    }

    public final void A03() {
        C07K.A1c(!this.A08.get(), "FirebaseApp was deleted");
    }

    public final void A04() {
        Queue queue;
        Set<Map.Entry> emptySet;
        Context context = this.A00;
        boolean A07 = C02160Ac.A07(context);
        if (A07) {
            if (C24531Bw.A01.get() == null) {
                C24531Bw c24531Bw = new C24531Bw(context);
                if (C24531Bw.A01.compareAndSet(null, c24531Bw)) {
                    context.registerReceiver(c24531Bw, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        } else {
            C02200Ag c02200Ag = this.A03;
            A03();
            boolean equals = "[DEFAULT]".equals(this.A04);
            for (Map.Entry entry : c02200Ag.A01.entrySet()) {
                C0BT c0bt = (C0BT) entry.getValue();
                int i = ((C017408c) entry.getKey()).A00;
                if (i == 1 || (i == 2 && equals)) {
                    c0bt.get();
                }
            }
            C0BK c0bk = c02200Ag.A00;
            synchronized (c0bk) {
                Queue queue2 = c0bk.A00;
                queue = null;
                if (queue2 != null) {
                    queue = queue2;
                    c0bk.A00 = null;
                }
            }
            if (queue != null) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    it.next();
                    C07K.A1P(null);
                    synchronized (c0bk) {
                        Queue queue3 = c0bk.A00;
                        if (queue3 != null) {
                            queue3.add(null);
                        } else {
                            synchronized (c0bk) {
                                Map map = (Map) c0bk.A01.get(null);
                                emptySet = map == null ? Collections.emptySet() : map.entrySet();
                            }
                            for (Map.Entry entry2 : emptySet) {
                                ((Executor) entry2.getValue()).execute(new Runnable(entry2) { // from class: X.1By
                                    public final Map.Entry A00;

                                    {
                                        this.A00 = entry2;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        C02430Bh c02430Bh = ((C02440Bj) this.A00.getKey()).A00;
                                        synchronized (c02430Bh) {
                                            if (c02430Bh.A00()) {
                                                c02430Bh.A03.A06();
                                            }
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
        }
        A02(C08U.class, this, A0A, A07);
        A03();
        if ("[DEFAULT]".equals(this.A04)) {
            A02(C08U.class, this, A0B, A07);
            A02(Context.class, context, A0C, A07);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C08U) {
            String str = this.A04;
            C08U c08u = (C08U) obj;
            c08u.A03();
            return str.equals(c08u.A04);
        }
        return false;
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        C08L A0q = C07K.A0q(this);
        A0q.A00("name", this.A04);
        A0q.A00("options", this.A02);
        return A0q.toString();
    }
}
