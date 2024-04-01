package X;

import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1xr */
/* loaded from: classes2.dex */
public class C43721xr {
    public final byte A00;
    public final int A01;
    public final int A02;
    public final AbstractC000600i A03;
    public final C01B A04;
    public final C04000Ia A05;
    public final C0J3 A06;
    public final C43371xI A07;
    public final C0HW A08;
    public final C0J7 A09;
    public final C63252zU A0A;
    public final C456622z A0B;
    public final C05Y A0C;
    public final C43711xq A0D;
    public final String A0E;
    public final boolean A0F;

    public C43721xr(C003701t c003701t, AbstractC000600i abstractC000600i, C0HW c0hw, C01B c01b, C05Y c05y, C43371xI c43371xI, C04000Ia c04000Ia, C0J3 c0j3, C0J7 c0j7, String str, C43711xq c43711xq, byte b, int i, int i2) {
        this.A03 = abstractC000600i;
        this.A08 = c0hw;
        this.A04 = c01b;
        this.A0C = c05y;
        this.A07 = c43371xI;
        this.A05 = c04000Ia;
        this.A06 = c0j3;
        this.A09 = c0j7;
        this.A0E = str;
        this.A0D = c43711xq;
        this.A00 = b;
        this.A01 = i;
        this.A02 = i2;
        c04000Ia.A06();
        this.A0B = new C456622z();
        this.A0A = new C63252zU();
        boolean A0E = c01b.A0E(C01C.A1b);
        int A03 = c003701t.A03(136);
        if (A03 != -1) {
            A0E = true;
            if (A03 != 1) {
                A0E = false;
            }
        }
        this.A0F = A0E;
    }

    public C48162Eb A00() {
        C456622z c456622z = this.A0B;
        if (c456622z != null) {
            SystemClock.elapsedRealtime();
            C48162Eb c48162Eb = (C48162Eb) this.A09.A00(new C0SC() { // from class: X.3GI
                {
                    C43721xr.this = this;
                }

                @Override // X.C0SC
                public final C1PV ARu(C05080Nf c05080Nf) {
                    C43721xr c43721xr = C43721xr.this;
                    C0Qt c0Qt = C0Qt.FAILURE;
                    C48162Eb c48162Eb2 = null;
                    if (c43721xr.A0F) {
                        if (c43721xr.A06.A01()) {
                            Log.i("resumecheck/chatd resume check throttled");
                        } else {
                            AbstractC000600i abstractC000600i = c43721xr.A03;
                            C01B c01b = c43721xr.A04;
                            C05Y c05y = c43721xr.A0C;
                            C63252zU c63252zU = c43721xr.A0A;
                            String str = c43721xr.A0E;
                            C43711xq c43711xq = c43721xr.A0D;
                            String str2 = ((C0J8) c43711xq).A01;
                            c43711xq.A03();
                            String str3 = c43711xq.A01;
                            if (str3 != null) {
                                int i = c43721xr.A02;
                                String str4 = c05080Nf.A01;
                                if (str4 != null) {
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    C2zJ c2zJ = new C2zJ(abstractC000600i, str2, str, str3, str4, i);
                                    C3GO c3go = new C3GO(c01b, c05y, c2zJ);
                                    C05Y c05y2 = c3go.A02;
                                    String A02 = c05y2.A02();
                                    C2zJ c2zJ2 = c3go.A01;
                                    ArrayList arrayList = new ArrayList(Arrays.asList(new C04P("media_type", c2zJ2.A05, null, (byte) 0), new C04P("hash", c2zJ2.A04, null, (byte) 0), new C04P("token", c2zJ2.A06, null, (byte) 0), new C04P("auth", c2zJ2.A03, null, (byte) 0)));
                                    if (c3go.A00.A0E(C01C.A1Y)) {
                                        arrayList.add(new C04P("resume", String.valueOf(c2zJ2.A01), null, (byte) 0));
                                    }
                                    c05y2.A06(162, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:m", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("resume_check", (C04P[]) arrayList.toArray(new C04P[0]), null, null)), c3go, 20000L);
                                    try {
                                        c3go.A03.get(20000L, TimeUnit.MILLISECONDS);
                                        c63252zU.A02 = SystemClock.uptimeMillis() - uptimeMillis;
                                        c63252zU.A00 = 0L;
                                        c63252zU.A03 = Boolean.TRUE;
                                        synchronized (c2zJ) {
                                            c48162Eb2 = c2zJ.A00;
                                            if (c48162Eb2 == null) {
                                                throw null;
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e(e);
                                        c48162Eb2 = new C48162Eb();
                                        c48162Eb2.A03 = c0Qt;
                                        c48162Eb2.A05 = "timeout exception";
                                    }
                                    c48162Eb2.A04 = c43721xr.A07.A01(c48162Eb2.A04);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                    if (c48162Eb2 == null || c48162Eb2.A03 == c0Qt) {
                        Uri.Builder A022 = c43721xr.A0D.A02(c05080Nf);
                        A022.appendQueryParameter("resume", "1");
                        C3GL c3gl = new C3GL(c43721xr.A08, c43721xr.A05, A022.build().toString(), c43721xr.A0A);
                        c3gl.A00 = new C48162Eb();
                        C04000Ia c04000Ia = c3gl.A01;
                        String str5 = c3gl.A04;
                        C05070Ne A01 = c04000Ia.A01(str5, c3gl);
                        try {
                            int A012 = A01.A01(c05080Nf);
                            C63252zU c63252zU2 = c3gl.A03;
                            c63252zU2.A00 = A01.A00;
                            c63252zU2.A02 = A01.A01;
                            c63252zU2.A01 = A012;
                            c63252zU2.A03 = A01.A02;
                            if (A012 < 0 || A012 >= 400) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("mediaupload/MMS upload resume form post failed/error=");
                                sb.append(A012);
                                sb.append("; url=");
                                sb.append(str5);
                                Log.w(sb.toString());
                                C48162Eb c48162Eb3 = c3gl.A00;
                                c48162Eb3.A01 = A012;
                                c48162Eb3.A03 = c0Qt;
                            }
                        } catch (IOException e2) {
                            StringBuilder A0P = C000200d.A0P("mediaupload/MMS upload resume form post failed; url=");
                            A0P.append(str5);
                            Log.w(A0P.toString(), e2);
                            if (C0HW.A05(e2)) {
                                c3gl.A00.A03 = C0Qt.WATLS_ERROR;
                            } else {
                                c3gl.A00.A03 = c0Qt;
                            }
                            C63252zU c63252zU3 = c3gl.A03;
                            c63252zU3.A00 = A01.A00;
                            c63252zU3.A02 = A01.A01;
                            c63252zU3.A03 = A01.A02;
                        }
                        c48162Eb2 = c3gl.A00;
                        c48162Eb2.A04 = c43721xr.A07.A01(c48162Eb2.A04);
                    }
                    C0Qt c0Qt2 = c48162Eb2.A03;
                    if (c0Qt2 == null) {
                        c48162Eb2.A03 = c0Qt;
                        c0Qt2 = c0Qt;
                    }
                    if (c0Qt2 == C0Qt.WATLS_ERROR) {
                        Log.i("resumecheck/attempting fallback MMS upload form post - watls error");
                        c43721xr.A05.A04();
                        return C1PV.A03(c48162Eb2, c48162Eb2.A01);
                    } else if (c0Qt2 == c0Qt) {
                        Log.i("resumecheck/attempting fallback MMS upload form post");
                        return C1PV.A03(c48162Eb2, c48162Eb2.A01);
                    } else {
                        if (c0Qt2 == C0Qt.RESUME) {
                            c43721xr.A0B.A02 = Long.valueOf(c48162Eb2.A02);
                        }
                        return C1PV.A02(c48162Eb2);
                    }
                }
            });
            if (c48162Eb == null || c48162Eb.A03 == null) {
                StringBuilder A0P = C000200d.A0P("resumecheck/failed; no routes; hash=");
                A0P.append(this.A0E);
                String obj = A0P.toString();
                c48162Eb = new C48162Eb();
                c48162Eb.A03 = C0Qt.FAILURE;
                c48162Eb.A05 = obj;
            }
            C0Qt c0Qt = c48162Eb.A03;
            if (c0Qt != null) {
                if (c456622z != null) {
                    SystemClock.elapsedRealtime();
                    int ordinal = c0Qt.ordinal();
                    int i = 1;
                    if (ordinal != 0) {
                        i = 3;
                        if (ordinal != 1) {
                            i = 2;
                        }
                    }
                    c456622z.A01 = Integer.valueOf(i);
                    C63252zU c63252zU = this.A0A;
                    c456622z.A00 = new C456522y(c63252zU.A00, c63252zU.A02, c63252zU.A03, c63252zU.A01);
                    return c48162Eb;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
