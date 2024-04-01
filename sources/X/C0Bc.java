package X;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.0Bc  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Bc {
    public final C08U A00;
    public final C0BY A01;
    public final C0Bd A02;
    public final C0BF A03;
    public final Executor A04;

    public C0Bc(C08U c08u, C0BY c0by, Executor executor, C0BF c0bf) {
        c08u.A03();
        C0Bd c0Bd = new C0Bd(c08u.A00, c0by);
        this.A00 = c08u;
        this.A01 = c0by;
        this.A02 = c0Bd;
        this.A04 = executor;
        this.A03 = c0bf;
    }

    public static final C0AC A00(C0AC c0ac) {
        Executor executor = C1CJ.A00;
        AnonymousClass191 anonymousClass191 = new AnonymousClass191() { // from class: X.1f3
            @Override // X.AnonymousClass191
            public final /* bridge */ /* synthetic */ Object AVU(C0AC c0ac2) {
                return null;
            }
        };
        C0AD c0ad = (C0AD) c0ac;
        C0AD c0ad2 = new C0AD();
        c0ad.A03.A01(new C32031dL(executor, anonymousClass191, c0ad2));
        c0ad.A07();
        return c0ad2;
    }

    public final C0AC A01(C0AC c0ac) {
        Executor executor = this.A04;
        AnonymousClass191 anonymousClass191 = new AnonymousClass191() { // from class: X.1f4
            @Override // X.AnonymousClass191
            public final Object AVU(C0AC c0ac2) {
                Object obj;
                C0AD c0ad = (C0AD) c0ac2;
                synchronized (c0ad.A04) {
                    C07K.A1c(c0ad.A02, "Task is not yet complete");
                    if (!c0ad.A05) {
                        if (IOException.class.isInstance(c0ad.A00)) {
                            throw ((Throwable) IOException.class.cast(c0ad.A00));
                        }
                        Exception exc = c0ad.A00;
                        if (exc == null) {
                            obj = c0ad.A01;
                        } else {
                            throw new AnonymousClass193(exc);
                        }
                    } else {
                        throw new CancellationException("Task is already canceled.");
                    }
                }
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string == null && (string = bundle.getString("unregistered")) == null) {
                        String string2 = bundle.getString("error");
                        if ("RST".equals(string2)) {
                            throw new IOException("INSTANCE_ID_RESET");
                        }
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        String valueOf = String.valueOf(bundle);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                        sb.append("Unexpected response: ");
                        sb.append(valueOf);
                        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    return string;
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        };
        C0AD c0ad = (C0AD) c0ac;
        if (c0ad != null) {
            C0AD c0ad2 = new C0AD();
            c0ad.A03.A01(new C32031dL(executor, anonymousClass191, c0ad2));
            c0ad.A07();
            return c0ad2;
        }
        throw null;
    }

    public final C0AC A02(String str, String str2, String str3, final Bundle bundle) {
        String str4;
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String obj;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        C08U c08u = this.A00;
        c08u.A03();
        bundle.putString("gmp_app_id", c08u.A02.A01);
        C0BY c0by = this.A01;
        bundle.putString("gmsv", Integer.toString(c0by.A02()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", c0by.A04());
        synchronized (c0by) {
            if (c0by.A03 == null) {
                c0by.A05();
            }
            str4 = c0by.A03;
        }
        bundle.putString("app_ver_name", str4);
        bundle.putString("cliv", "fiid-12451000");
        C0BF c0bf = this.A03;
        Set set = c0bf.A00.A00;
        synchronized (set) {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        if (unmodifiableSet.isEmpty()) {
            obj = c0bf.A01;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(c0bf.A01);
            sb.append(' ');
            synchronized (set) {
                unmodifiableSet2 = Collections.unmodifiableSet(set);
            }
            sb.append(C0BF.A00(unmodifiableSet2));
            obj = sb.toString();
        }
        bundle.putString("Firebase-Client", obj);
        final C0NR c0nr = new C0NR();
        this.A04.execute(new Runnable(this, bundle, c0nr) { // from class: X.1CQ
            public final Bundle A00;
            public final C0NR A01;
            public final C0Bc A02;

            {
                this.A02 = this;
                this.A00 = bundle;
                this.A01 = c0nr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                final int i;
                boolean z;
                C0Bc c0Bc = this.A02;
                final Bundle bundle2 = this.A00;
                C0NR c0nr2 = this.A01;
                if (c0Bc != null) {
                    try {
                        C0Bd c0Bd = c0Bc.A02;
                        if (c0Bd.A05.A02() >= 12000000) {
                            C1C1 A00 = C1C1.A00(c0Bd.A03);
                            synchronized (A00) {
                                i = A00.A00;
                                A00.A00 = i + 1;
                            }
                            C0AC A01 = A00.A01(new C1C9(i, bundle2) { // from class: X.1f0
                                @Override // X.C1C9
                                public final boolean A03() {
                                    return false;
                                }

                                @Override // X.C1C9
                                public final void A00(Bundle bundle3) {
                                    Bundle bundle4 = bundle3.getBundle("data");
                                    if (bundle4 == null) {
                                        bundle4 = Bundle.EMPTY;
                                    }
                                    A02(bundle4);
                                }
                            });
                            try {
                                C07K.A1U("Must not be called on the main application thread");
                                C07K.A1Q(A01, "Task must not be null");
                                C0AD c0ad = (C0AD) A01;
                                synchronized (c0ad.A04) {
                                    z = c0ad.A02;
                                }
                                if (z) {
                                    obj2 = AnonymousClass088.A0m(A01);
                                } else {
                                    C0AE c0ae = new C0AE();
                                    Executor executor = C0AI.A01;
                                    A01.A02(executor, c0ae);
                                    A01.A01(executor, c0ae);
                                    A01.A00(executor, c0ae);
                                    c0ae.A00.await();
                                    obj2 = AnonymousClass088.A0m(A01);
                                }
                            } catch (InterruptedException | ExecutionException e) {
                                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                    String valueOf = String.valueOf(e);
                                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
                                    sb2.append("Error making request: ");
                                    sb2.append(valueOf);
                                    Log.d("FirebaseInstanceId", sb2.toString());
                                }
                                if ((e.getCause() instanceof C1C8) && ((C1C8) e.getCause()).errorCode == 4) {
                                    Bundle A002 = c0Bd.A00(bundle2);
                                    obj2 = A002;
                                    if (A002 != null) {
                                        boolean containsKey = A002.containsKey("google.messenger");
                                        obj2 = A002;
                                        if (containsKey) {
                                            Bundle A003 = c0Bd.A00(bundle2);
                                            obj2 = A003;
                                            if (A003 != null) {
                                                boolean containsKey2 = A003.containsKey("google.messenger");
                                                obj2 = A003;
                                                if (containsKey2) {
                                                    obj2 = null;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                        } else {
                            Bundle A004 = c0Bd.A00(bundle2);
                            obj2 = A004;
                            if (A004 != null) {
                                boolean containsKey3 = A004.containsKey("google.messenger");
                                obj2 = A004;
                                if (containsKey3) {
                                    Bundle A005 = c0Bd.A00(bundle2);
                                    obj2 = A005;
                                    if (A005 != null) {
                                        boolean containsKey4 = A005.containsKey("google.messenger");
                                        obj2 = A005;
                                        if (containsKey4) {
                                            obj2 = null;
                                        }
                                    }
                                }
                            }
                        }
                        c0nr2.A00.A09(obj2);
                        return;
                    } catch (IOException e2) {
                        c0nr2.A00.A08(e2);
                        return;
                    }
                }
                throw null;
            }
        });
        return c0nr.A00;
    }
}
