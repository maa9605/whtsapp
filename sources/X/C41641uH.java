package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.1uH */
/* loaded from: classes2.dex */
public class C41641uH {
    public static volatile C41641uH A0w;
    public final Handler A00 = new Handler(Looper.getMainLooper()) { // from class: X.2Tf
        public C25L A00;
        public C0MP A01;
        public boolean A02;
        public boolean A03;

        {
            C41641uH.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (this.A00 == null) {
                    C41641uH c41641uH = C41641uH.this;
                    C25L c25l = new C25L(c41641uH.A0N.A00, c41641uH, c41641uH.A0M, c41641uH.A04, c41641uH.A0p, c41641uH.A02, c41641uH.A06, c41641uH.A0k, c41641uH.A0l, c41641uH.A03, c41641uH.A0B, c41641uH.A0Z, c41641uH.A0c, c41641uH.A0A, c41641uH.A0U, c41641uH.A0n, c41641uH.A0D, c41641uH.A0s, c41641uH.A0E, c41641uH.A0G, c41641uH.A0S, c41641uH.A0L, c41641uH.A0H, c41641uH.A0d, c41641uH.A0Q, c41641uH.A0o, c41641uH.A0h, c41641uH.A0g, c41641uH.A07, c41641uH.A0C, c41641uH.A0T, c41641uH.A0j, c41641uH.A0I, c41641uH.A0Y, c41641uH.A05, c41641uH.A0f, c41641uH.A0R, c41641uH.A0X, c41641uH.A0v, c41641uH.A0e, c41641uH.A0K, c41641uH.A0P, c41641uH.A0F, c41641uH.A0W, c41641uH.A0u, c41641uH.A08, c41641uH.A0t, c41641uH.A0O, c41641uH.A0a, c41641uH.A0m, c41641uH.A0b, c41641uH.A09, c41641uH.A0J, c41641uH.A0r, c41641uH.A01, c41641uH.A0V, c41641uH.A0q);
                    this.A00 = c25l;
                    c25l.A0F();
                    this.A03 = true;
                }
                Object obj = message.obj;
                if (obj != null) {
                    C49032Ic c49032Ic = (C49032Ic) obj;
                    C25L c25l2 = this.A00;
                    if (c25l2 == null) {
                        throw null;
                    }
                    c25l2.A0m(c49032Ic);
                    return;
                }
                throw null;
            } else if (i == 2) {
                Log.i("voice-service-wrapper/handler WHAT_STOP_SERVICE");
                this.A03 = false;
                if (this.A02) {
                    return;
                }
                sendEmptyMessage(3);
            } else if (i == 3) {
                Log.i("voice-service-wrapper/handler WHAT_SERVICE_ON_DESTROY");
                C25L c25l3 = this.A00;
                if (c25l3 != null) {
                    c25l3.A0G();
                    this.A00 = null;
                }
            } else if (i == 4) {
                Log.i("voice-service-wrapper/handler WHAT_SERVICE_ON_BIND");
                if (this.A00 == null) {
                    C41641uH c41641uH2 = C41641uH.this;
                    C25L c25l4 = new C25L(c41641uH2.A0N.A00, c41641uH2, c41641uH2.A0M, c41641uH2.A04, c41641uH2.A0p, c41641uH2.A02, c41641uH2.A06, c41641uH2.A0k, c41641uH2.A0l, c41641uH2.A03, c41641uH2.A0B, c41641uH2.A0Z, c41641uH2.A0c, c41641uH2.A0A, c41641uH2.A0U, c41641uH2.A0n, c41641uH2.A0D, c41641uH2.A0s, c41641uH2.A0E, c41641uH2.A0G, c41641uH2.A0S, c41641uH2.A0L, c41641uH2.A0H, c41641uH2.A0d, c41641uH2.A0Q, c41641uH2.A0o, c41641uH2.A0h, c41641uH2.A0g, c41641uH2.A07, c41641uH2.A0C, c41641uH2.A0T, c41641uH2.A0j, c41641uH2.A0I, c41641uH2.A0Y, c41641uH2.A05, c41641uH2.A0f, c41641uH2.A0R, c41641uH2.A0X, c41641uH2.A0v, c41641uH2.A0e, c41641uH2.A0K, c41641uH2.A0P, c41641uH2.A0F, c41641uH2.A0W, c41641uH2.A0u, c41641uH2.A08, c41641uH2.A0t, c41641uH2.A0O, c41641uH2.A0a, c41641uH2.A0m, c41641uH2.A0b, c41641uH2.A09, c41641uH2.A0J, c41641uH2.A0r, c41641uH2.A01, c41641uH2.A0V, c41641uH2.A0q);
                    this.A00 = c25l4;
                    c25l4.A0F();
                }
                this.A02 = true;
                C0MP c0mp = (C0MP) message.obj;
                this.A01 = c0mp;
                c0mp.AOY(this.A00);
            } else if (i != 5) {
            } else {
                if (!this.A02) {
                    Log.w("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called while isBound is false");
                    return;
                }
                Object obj2 = message.obj;
                C0MP c0mp2 = this.A01;
                if (obj2 != c0mp2) {
                    StringBuilder A0P = C000200d.A0P("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called with mismatch voiceServiceBinderComponent, actual ");
                    A0P.append(c0mp2);
                    A0P.append(", given ");
                    A0P.append(message.obj);
                    Log.w(A0P.toString());
                    return;
                }
                Log.i("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND");
                this.A01 = null;
                this.A02 = false;
                if (this.A03) {
                    return;
                }
                sendEmptyMessage(3);
            }
        }
    };
    public final C03020Dv A01;
    public final AbstractC000600i A02;
    public final C012005w A03;
    public final C018508q A04;
    public final C04g A05;
    public final C02L A06;
    public final C0E4 A07;
    public final C0E5 A08;
    public final C03150Ej A09;
    public final C01B A0A;
    public final C0EL A0B;
    public final C010005b A0C;
    public final C05300Od A0D;
    public final C470029d A0E;
    public final C0G2 A0F;
    public final C05W A0G;
    public final C018708s A0H;
    public final C41581uB A0I;
    public final C2AY A0J;
    public final C0E7 A0K;
    public final C02E A0L;
    public final AnonymousClass012 A0M;
    public final C001200o A0N;
    public final C005102h A0O;
    public final C000500h A0P;
    public final C002301c A0Q;
    public final C01J A0R;
    public final C01R A0S;
    public final C0HY A0T;
    public final C0EA A0U;
    public final C0FA A0V;
    public final C41401tr A0W;
    public final C0EC A0X;
    public final C0HA A0Y;
    public final AnonymousClass011 A0Z;
    public final C04000Ia A0a;
    public final C00S A0b;
    public final C0EG A0c;
    public final C41521u3 A0d;
    public final C0EJ A0e;
    public final C0DU A0f;
    public final C22I A0g;
    public final C47872Cx A0h;
    public final C0ER A0i;
    public final C0CB A0j;
    public final C03070Ea A0k;
    public final InterfaceC002901k A0l;
    public final C50792Te A0m;
    public final C05480Ox A0n;
    public final C50782Td A0o;
    public final JNIUtils A0p;
    public final C459824m A0q;
    public final C49762Mg A0r;
    public final C0L6 A0s;
    public final C0EW A0t;
    public final C2QS A0u;
    public final VoipCameraManager A0v;

    public C41641uH(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, JNIUtils jNIUtils, AbstractC000600i abstractC000600i, C02L c02l, C03070Ea c03070Ea, InterfaceC002901k interfaceC002901k, C012005w c012005w, C0EL c0el, AnonymousClass011 anonymousClass011, C0EG c0eg, C01B c01b, C0EA c0ea, C05480Ox c05480Ox, C05300Od c05300Od, C0L6 c0l6, C470029d c470029d, C05W c05w, C01R c01r, C02E c02e, C018708s c018708s, C41521u3 c41521u3, C002301c c002301c, C50782Td c50782Td, C47872Cx c47872Cx, C22I c22i, C0ER c0er, C0E4 c0e4, C010005b c010005b, C41581uB c41581uB, C0HA c0ha, C04g c04g, C0DU c0du, C01J c01j, C0EC c0ec, C0HY c0hy, C0CB c0cb, VoipCameraManager voipCameraManager, C0EJ c0ej, C0E7 c0e7, C000500h c000500h, C0G2 c0g2, C41401tr c41401tr, C2QS c2qs, C0E5 c0e5, C0EW c0ew, C005102h c005102h, C04000Ia c04000Ia, C50792Te c50792Te, C00S c00s, C03150Ej c03150Ej, C2AY c2ay, C49762Mg c49762Mg, C03020Dv c03020Dv, C0FA c0fa, C459824m c459824m) {
        this.A0N = c001200o;
        this.A0M = anonymousClass012;
        this.A04 = c018508q;
        this.A0p = jNIUtils;
        this.A02 = abstractC000600i;
        this.A06 = c02l;
        this.A0k = c03070Ea;
        this.A0l = interfaceC002901k;
        this.A03 = c012005w;
        this.A0B = c0el;
        this.A0Z = anonymousClass011;
        this.A0c = c0eg;
        this.A0A = c01b;
        this.A0U = c0ea;
        this.A0n = c05480Ox;
        this.A0D = c05300Od;
        this.A0s = c0l6;
        this.A0E = c470029d;
        this.A0G = c05w;
        this.A0S = c01r;
        this.A0L = c02e;
        this.A0H = c018708s;
        this.A0d = c41521u3;
        this.A0Q = c002301c;
        this.A0o = c50782Td;
        this.A0h = c47872Cx;
        this.A0g = c22i;
        this.A0i = c0er;
        this.A07 = c0e4;
        this.A0C = c010005b;
        this.A0I = c41581uB;
        this.A0Y = c0ha;
        this.A05 = c04g;
        this.A0f = c0du;
        this.A0R = c01j;
        this.A0X = c0ec;
        this.A0T = c0hy;
        this.A0j = c0cb;
        this.A0v = voipCameraManager;
        this.A0e = c0ej;
        this.A0K = c0e7;
        this.A0P = c000500h;
        this.A0F = c0g2;
        this.A0W = c41401tr;
        this.A0u = c2qs;
        this.A08 = c0e5;
        this.A0t = c0ew;
        this.A0O = c005102h;
        this.A0a = c04000Ia;
        this.A0m = c50792Te;
        this.A0b = c00s;
        this.A09 = c03150Ej;
        this.A0J = c2ay;
        this.A0r = c49762Mg;
        this.A01 = c03020Dv;
        this.A0V = c0fa;
        this.A0q = c459824m;
    }

    public static C41641uH A00() {
        if (A0w == null) {
            synchronized (C41641uH.class) {
                if (A0w == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C018508q A002 = C018508q.A00();
                    JNIUtils jNIUtils = JNIUtils.getInstance();
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    C02L A004 = C02L.A00();
                    C03070Ea A005 = C03070Ea.A00();
                    InterfaceC002901k A006 = C002801j.A00();
                    C012005w A007 = C012005w.A00();
                    C0EL A008 = C0EL.A00();
                    AnonymousClass011 A009 = AnonymousClass011.A00();
                    C0EG A0010 = C0EG.A00();
                    C01B A0011 = C01B.A00();
                    C0EA A0012 = C0EA.A00();
                    C05480Ox c05480Ox = C05480Ox.A00;
                    C05300Od A0013 = C05300Od.A00();
                    C0L6 A0014 = C0L6.A00();
                    C470029d A0015 = C470029d.A00();
                    C05W A0016 = C05W.A00();
                    C01R c01r = C01R.A02;
                    C02E A0017 = C02E.A00();
                    C018708s A0018 = C018708s.A00();
                    C41521u3 A0019 = C41521u3.A00();
                    C002301c A0020 = C002301c.A00();
                    if (C50782Td.A02 == null) {
                        synchronized (C50782Td.class) {
                            if (C50782Td.A02 == null) {
                                C50782Td.A02 = new C50782Td(C05Y.A01(), C01J.A00());
                            }
                        }
                    }
                    C50782Td c50782Td = C50782Td.A02;
                    C47872Cx c47872Cx = C47872Cx.A03;
                    C22I A0021 = C22I.A00();
                    C0ER A0022 = C0ER.A00();
                    C0E4 A0023 = C0E4.A00();
                    C010005b c010005b = C010005b.A07;
                    C41581uB A0024 = C41581uB.A00();
                    C0HA A0025 = C0HA.A00();
                    C04g A0026 = C04g.A00();
                    C0DU A01 = C0DU.A01();
                    C01J A0027 = C01J.A00();
                    C0EC A0028 = C0EC.A00();
                    C0HY A0029 = C0HY.A00();
                    C0CB A0030 = C0CB.A00();
                    VoipCameraManager voipCameraManager = VoipCameraManager.getInstance();
                    C0EJ A0031 = C0EJ.A00();
                    C0E7 A0032 = C0E7.A00();
                    C000500h A0033 = C000500h.A00();
                    C0G2 A0034 = C0G2.A00();
                    C41401tr A012 = C41401tr.A01();
                    C2QS A0035 = C2QS.A00();
                    C0E5 A0036 = C0E5.A00();
                    C0EW A0037 = C0EW.A00();
                    C005102h A0038 = C005102h.A00();
                    C04000Ia A0039 = C04000Ia.A00();
                    if (C50792Te.A0E == null) {
                        synchronized (C50792Te.class) {
                            if (C50792Te.A0E == null) {
                                C50792Te.A0E = new C50792Te(c001200o, C002801j.A00(), C01B.A00(), C0L5.A01(), C0L7.A02(), C05W.A00(), C02E.A00(), C018708s.A00(), C0CB.A00(), C011505r.A00(), C005102h.A00(), C0C8.A00(), C03020Dv.A00(), C0LF.A00());
                            }
                        }
                    }
                    C50792Te c50792Te = C50792Te.A0E;
                    C00S c00s = C00S.A00;
                    if (c00s != null) {
                        A0w = new C41641uH(c001200o, A00, A002, jNIUtils, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, c05480Ox, A0013, A0014, A0015, A0016, c01r, A0017, A0018, A0019, A0020, c50782Td, c47872Cx, A0021, A0022, A0023, c010005b, A0024, A0025, A0026, A01, A0027, A0028, A0029, A0030, voipCameraManager, A0031, A0032, A0033, A0034, A012, A0035, A0036, A0037, A0038, A0039, c50792Te, c00s, C03150Ej.A00(), C2AY.A00, C49762Mg.A00(), C03020Dv.A00(), C0FA.A00, C459824m.A00());
                    } else {
                        throw null;
                    }
                }
            }
        }
        return A0w;
    }
}
