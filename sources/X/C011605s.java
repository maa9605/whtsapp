package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.05s */
/* loaded from: classes.dex */
public class C011605s implements InterfaceC011705t {
    public static final int A0K = (int) ((Runtime.getRuntime().maxMemory() / 1024) / 16);
    public static volatile C011605s A0L;
    public Handler A00;
    public C06F A01;
    public C0JH A02;
    public C0JH A03;
    public C04560Kx A04;
    public C04560Kx A05;
    public WeakReference A06;
    public final AbstractC000600i A07;
    public final C011805u A08;
    public final C001200o A09;
    public final C003701t A0A;
    public volatile C0JH A0J;
    public final Object A0G = new Object();
    public final Object A0F = new Object();
    public final Object A0B = new Object();
    public final Object A0E = new Object();
    public final Object A0D = new Object();
    public final List A0I = new ArrayList();
    public final Object A0H = new Object();
    public final Object A0C = new Object();

    public C011605s(C003701t c003701t, C001200o c001200o, AbstractC000600i abstractC000600i, C011805u c011805u, ComponentCallbacks2C011905v componentCallbacks2C011905v) {
        this.A0A = c003701t;
        this.A09 = c001200o;
        this.A07 = abstractC000600i;
        this.A08 = c011805u;
        componentCallbacks2C011905v.A00(this);
    }

    public static C011605s A00() {
        if (A0L == null) {
            synchronized (C011605s.class) {
                if (A0L == null) {
                    A0L = new C011605s(C003701t.A00(), C001200o.A01, AbstractC000600i.A00(), C011805u.A02, ComponentCallbacks2C011905v.A00());
                }
            }
        }
        return A0L;
    }

    public final synchronized Handler A01() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("cache-cleaner", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper()) { // from class: X.0fT
                {
                    C011605s.this = this;
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (message.arg1 == 0) {
                        boolean z = true;
                        C011605s c011605s = C011605s.this;
                        synchronized (c011605s.A0F) {
                            C0JH c0jh = c011605s.A03;
                            if (c0jh != null) {
                                c0jh.A03(59000);
                                if (c011605s.A03.A00.A01() > 0) {
                                    z = false;
                                }
                            }
                        }
                        synchronized (c011605s.A0B) {
                            C0JH c0jh2 = c011605s.A02;
                            if (c0jh2 != null) {
                                c0jh2.A03(59000);
                                if (c011605s.A02.A00.A01() > 0) {
                                    z = false;
                                }
                            }
                        }
                        synchronized (c011605s.A0G) {
                            if (c011605s.A0J != null) {
                                c011605s.A0J.A03(59000);
                                if (c011605s.A0J.A00.A01() > 0) {
                                    z = false;
                                }
                            }
                        }
                        if (!z) {
                            sendEmptyMessageDelayed(0, 60000L);
                        }
                    }
                }
            };
            this.A00 = handler;
        }
        return handler;
    }

    public C0JH A02() {
        C0JH c0jh;
        synchronized (this.A0B) {
            c0jh = this.A02;
            if (c0jh == null) {
                c0jh = new C0JH((int) (Runtime.getRuntime().maxMemory() / 8192)) { // from class: X.0fQ
                    {
                        C011605s.this = this;
                    }

                    @Override // X.C0JH
                    public int A00(Object obj, Object obj2) {
                        return ((Bitmap) obj2).getByteCount() >> 10;
                    }

                    @Override // X.C0JH
                    public void A02() {
                        Handler A01 = C011605s.this.A01();
                        if (A01.hasMessages(0)) {
                            return;
                        }
                        A01.sendEmptyMessageDelayed(0, 60000L);
                    }

                    @Override // X.C0JH
                    public void A06(boolean z, Object obj, Object obj2, Object obj3) {
                        String str = (String) obj;
                        Bitmap bitmap = (Bitmap) obj2;
                        if (z) {
                            for (C0JI c0ji : C011605s.this.A0I) {
                                c0ji.ANo(str, bitmap);
                            }
                        }
                    }
                };
                this.A02 = c0jh;
            }
        }
        return c0jh;
    }

    public C0JH A03() {
        C0JH c0jh;
        synchronized (this.A0F) {
            c0jh = this.A03;
            if (c0jh == null) {
                c0jh = new C0JH((int) ((Runtime.getRuntime().maxMemory() / 1024) / 6)) { // from class: X.0JQ
                    {
                        C011605s.this = this;
                    }

                    @Override // X.C0JH
                    public int A00(Object obj, Object obj2) {
                        return ((Bitmap) obj2).getByteCount() >> 10;
                    }

                    @Override // X.C0JH
                    public void A02() {
                        Handler A01 = C011605s.this.A01();
                        if (A01.hasMessages(0)) {
                            return;
                        }
                        A01.sendEmptyMessageDelayed(0, 60000L);
                    }
                };
                this.A03 = c0jh;
            }
        }
        return c0jh;
    }

    public C0JH A04() {
        if (this.A0J == null) {
            synchronized (this.A0G) {
                if (this.A0J == null) {
                    this.A0J = new C0JH(A0K) { // from class: X.1ke
                        {
                            C011605s.this = this;
                        }

                        @Override // X.C0JH
                        public int A00(Object obj, Object obj2) {
                            return ((Bitmap) obj2).getByteCount() >> 10;
                        }

                        @Override // X.C0JH
                        public void A02() {
                            Handler A01 = C011605s.this.A01();
                            if (A01.hasMessages(0)) {
                                return;
                            }
                            A01.sendEmptyMessageDelayed(0, 60000L);
                        }
                    };
                }
            }
        }
        return this.A0J;
    }

    public C04560Kx A05() {
        C04560Kx c04560Kx;
        synchronized (this.A0D) {
            c04560Kx = this.A04;
            if (c04560Kx == null) {
                c04560Kx = new C04560Kx(this.A09, this.A07, 32, "gif_content_obj_store", this.A0A.A0C(505));
                this.A04 = c04560Kx;
            }
        }
        return c04560Kx;
    }

    public C04560Kx A06() {
        C04560Kx c04560Kx;
        synchronized (this.A0E) {
            c04560Kx = this.A05;
            if (c04560Kx == null) {
                c04560Kx = new C04560Kx(this.A09, this.A07, 256, "gif_preview_obj_store", this.A0A.A0C(505));
                this.A05 = c04560Kx;
            }
        }
        return c04560Kx;
    }

    public List A07() {
        synchronized (this.A0C) {
            WeakReference weakReference = this.A06;
            if (weakReference != null) {
                return (List) weakReference.get();
            }
            return null;
        }
    }

    public void A08() {
        synchronized (this.A0H) {
            C06F c06f = this.A01;
            if (c06f != null) {
                c06f.A07(-1);
            }
        }
    }

    public final synchronized void A09(int i) {
        A0A(null);
        List A07 = A07();
        if (A07 != null) {
            A07.clear();
        }
        A02().A03(i);
        A03().A03(i);
        if (this.A0J != null) {
            this.A0J.A03(SearchActionVerificationClientService.NOTIFICATION_ID);
        }
        A08();
        C011805u c011805u = this.A08;
        synchronized (c011805u) {
            c011805u.A01.clear();
        }
        A0A(null);
    }

    public void A0A(String str) {
        Runtime runtime = Runtime.getRuntime();
        synchronized (this.A0F) {
            C0JH c0jh = this.A03;
            if (c0jh != null) {
                c0jh.A00.A01();
                this.A03.A00.A00();
            }
        }
        synchronized (this.A0B) {
            C0JH c0jh2 = this.A02;
            if (c0jh2 != null) {
                c0jh2.A00.A01();
                this.A02.A00.A00();
            }
        }
        synchronized (this.A0E) {
            C04560Kx c04560Kx = this.A05;
            if (c04560Kx != null) {
                c04560Kx.A07();
                this.A05.A06();
            }
        }
        synchronized (this.A0D) {
            C04560Kx c04560Kx2 = this.A04;
            if (c04560Kx2 != null) {
                c04560Kx2.A07();
                this.A04.A06();
            }
        }
        synchronized (this.A0H) {
            C06F c06f = this.A01;
            if (c06f != null) {
                c06f.A01();
                this.A01.A00();
            }
        }
        synchronized (this.A0G) {
            if (this.A0J != null) {
                this.A0J.A00.A01();
                this.A0J.A00.A00();
            }
        }
        C011805u c011805u = this.A08;
        synchronized (c011805u) {
            c011805u.A01.size();
        }
        runtime.freeMemory();
        runtime.totalMemory();
        runtime.maxMemory();
    }

    public void A0B(List list) {
        synchronized (this.A0C) {
            if (list != null) {
                this.A06 = new WeakReference(list);
            } else {
                this.A06 = null;
            }
        }
    }

    @Override // X.InterfaceC011705t
    public void AHI() {
        A09(0);
    }

    @Override // X.InterfaceC011705t
    public void AHJ() {
        A09(SearchActionVerificationClientService.NOTIFICATION_ID);
    }
}
