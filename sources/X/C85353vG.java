package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Random;

/* renamed from: X.3vG */
/* loaded from: classes2.dex */
public class C85353vG implements InterfaceC49192Iy {
    public String A00;
    public final C018508q A01;
    public final C001200o A02;
    public final C2AV A03;
    public final C41521u3 A04;
    public final C2Iz A05;
    public final C41981up A06;
    public final InterfaceC43021wi A07 = new C85343vF(this);
    public final C41991uq A08;

    @Override // X.InterfaceC49192Iy
    public C20M A9m() {
        return null;
    }

    public C85353vG(C018508q c018508q, C001200o c001200o, C41981up c41981up, C41991uq c41991uq, C41521u3 c41521u3, C2AV c2av, C2Iz c2Iz) {
        this.A01 = c018508q;
        this.A02 = c001200o;
        this.A06 = c41981up;
        this.A08 = c41991uq;
        this.A04 = c41521u3;
        this.A03 = c2av;
        this.A05 = c2Iz;
    }

    @Override // X.InterfaceC49192Iy
    public void AEJ(String str) {
        C41991uq c41991uq = this.A08;
        if (c41991uq != null) {
            String[] split = str.split(",");
            if (split.length < 3) {
                Log.e("qrsession/processQR/error/invalid_code parts");
            } else {
                byte[] bArr = new byte[64];
                c41991uq.A0P.nextBytes(bArr);
                C75133eP c75133eP = new C75133eP(split[0], split[1], split[2], bArr);
                if (this.A06.A04()) {
                    this.A04.A0J(false);
                }
                String str2 = c75133eP.A01;
                byte[] bArr2 = c75133eP.A04;
                if (c41991uq != null) {
                    C0XQ A0Q = C002701i.A0Q();
                    try {
                        C0IR A0S = C002701i.A0S(C42891wV.A00(new byte[]{5}, Base64.decode(str2, 0)));
                        C0R8 c0r8 = A0Q.A00;
                        if (c0r8.A00 == 5) {
                            byte[] A1Y = C002701i.A1Y(C40631sa.A00().A04(A0S.A01, c0r8.A01), null, 80);
                            byte[] bArr3 = new byte[32];
                            System.arraycopy(A1Y, 0, bArr3, 0, 32);
                            byte[] bArr4 = new byte[32];
                            System.arraycopy(A1Y, 32, bArr4, 0, 32);
                            byte[] bArr5 = new byte[16];
                            System.arraycopy(A1Y, 64, bArr5, 0, 16);
                            byte[] A02 = C42891wV.A02(bArr3, bArr5, bArr2);
                            byte[] bArr6 = A0Q.A01.A01;
                            if (A02 == null) {
                                Log.e("qrsession/encryptSecret fail null enc: true");
                            } else {
                                byte[] A01 = C42891wV.A01(bArr4, C42891wV.A00(bArr6, A02));
                                if (A01 == null) {
                                    Log.e("qrsession/encryptSecret fail null hmac: true");
                                } else {
                                    String encodeToString = Base64.encodeToString(C42891wV.A00(bArr6, C42891wV.A00(A01, A02)), 2);
                                    if (encodeToString != null) {
                                        C2AV c2av = this.A03;
                                        String str3 = c75133eP.A02;
                                        String str4 = c75133eP.A03;
                                        String str5 = c75133eP.A00;
                                        c2av.A05(str3, str4, str5, encodeToString, 0);
                                        Context applicationContext = this.A02.A00.getApplicationContext();
                                        String str6 = str5;
                                        C000500h c000500h = c41991uq.A0H;
                                        if (str5 != null) {
                                            SharedPreferences sharedPreferences = c000500h.A00;
                                            String string = sharedPreferences.getString("web_session_verification_browser_ids", null);
                                            if (string != null) {
                                                str6 = C000200d.A0I(string, ",", str5);
                                            }
                                            C000200d.A0i(c000500h, "web_session_verification_browser_ids", str6);
                                            if (sharedPreferences.getLong("web_session_verification_when_millis", -1L) < 0) {
                                                long currentTimeMillis = System.currentTimeMillis() + ((long) (new Random().nextDouble() * 1.08E7d)) + 3600000;
                                                if (c000500h != null) {
                                                    if (currentTimeMillis >= 0) {
                                                        C000200d.A0h(c000500h, "web_session_verification_when_millis", currentTimeMillis);
                                                        c41991uq.A0D(applicationContext, currentTimeMillis);
                                                    } else {
                                                        throw new IllegalArgumentException("When millis cannot be less than 0");
                                                    }
                                                } else {
                                                    throw null;
                                                }
                                            }
                                            this.A00 = str5;
                                            this.A05.A00();
                                            return;
                                        }
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            throw new AssertionError("PublicKey or PrivateKey type is invalid");
                        }
                    } catch (C05240Nw | IllegalArgumentException e) {
                        Log.e("qrsession/encryptSecret/curve error ", e);
                    }
                } else {
                    throw null;
                }
            }
            this.A05.A01();
            return;
        }
        throw null;
    }
}
