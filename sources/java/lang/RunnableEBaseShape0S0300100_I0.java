package java.lang;

import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass273;
import X.C000200d;
import X.C002701i;
import X.C010805j;
import X.C01C;
import X.C01J;
import X.C0OC;
import X.C0QS;
import X.C0Zq;
import X.C41431tu;
import X.C48132Dx;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0300100_I0 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableEBaseShape0S0300100_I0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        int length;
        String string;
        byte[] decode;
        switch (this.A04) {
            case 0:
                C41431tu c41431tu = (C41431tu) this.A01;
                byte[] bArr2 = (byte[]) this.A02;
                byte[] bArr3 = (byte[]) this.A03;
                C48132Dx c48132Dx = c41431tu.A04;
                String string2 = c48132Dx.A00().getString("blinding_factor", null);
                if (string2 != null) {
                    bArr = Base64.decode(string2, 8);
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    Log.e("PrivateStatsToken/processSignedBlindedToken blindingFactor is null");
                    c48132Dx.A03(4);
                    c41431tu.A06(false, 4);
                    return;
                }
                AnonymousClass012 anonymousClass012 = c41431tu.A02;
                anonymousClass012.A03();
                NativeVOPRFExtension nativeVOPRFExtension = c41431tu.A00;
                if (nativeVOPRFExtension == null) {
                    nativeVOPRFExtension = new NativeVOPRFExtension();
                    c41431tu.A00 = nativeVOPRFExtension;
                }
                byte[] A01 = nativeVOPRFExtension.A01(bArr2, bArr2.length, bArr, bArr.length, bArr3, bArr3.length);
                anonymousClass012.A03();
                if (A01 != null && (length = A01.length) != 1) {
                    if (c41431tu.A0E) {
                        string = c48132Dx.A00().getString("next_original_token", null);
                    } else {
                        string = c48132Dx.A00().getString("original_token", null);
                    }
                    if (string != null && (decode = Base64.decode(string, 8)) != null) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                            messageDigest.update(decode, 0, decode.length);
                            messageDigest.update(A01, 0, length);
                            byte[] digest = messageDigest.digest();
                            if (digest != null) {
                                synchronized (c41431tu) {
                                    c48132Dx.A02(0);
                                    c48132Dx.A05("shared_secret", Base64.encodeToString(digest, 10));
                                    c48132Dx.A04("time_to_live", c41431tu.A01.A07(C01C.A0B) - new Random().nextInt(10800));
                                    c48132Dx.A04("base_timestamp", anonymousClass012.A05() / 1000);
                                    c48132Dx.A05("blinding_factor", null);
                                    if (c41431tu.A0E) {
                                        c48132Dx.A05("original_token", string);
                                        c48132Dx.A05("next_original_token", null);
                                        c41431tu.A0E = false;
                                    }
                                    long A03 = anonymousClass012.A03();
                                    c41431tu.A03.A02(1, A03 - c41431tu.A0A, A03 - c41431tu.A0B, c41431tu.A09);
                                    c41431tu.A0C = null;
                                    c41431tu.A0F = null;
                                    c41431tu.A09 = 0;
                                    c41431tu.A0D = false;
                                    c41431tu.A0A = 0L;
                                    c41431tu.A0B = 0L;
                                    if (c48132Dx.A00().getInt("first_token_stage", 0) == 1) {
                                        c48132Dx.A01(2);
                                        c48132Dx.A04("first_token_request_timestamp", 0L);
                                        c48132Dx.A04("first_token_delay_time", 0L);
                                    }
                                    c48132Dx.A03(0);
                                }
                                return;
                            }
                        } catch (NoSuchAlgorithmException e) {
                            Log.e("PrivateStatsToken/computeSharedSecret got exception = ", e);
                        }
                        c48132Dx.A03(14);
                        c41431tu.A06(false, 4);
                        return;
                    }
                    Log.e("PrivateStatsToken/processSignedBlindedToken originalToken is null");
                    c48132Dx.A03(1);
                    c41431tu.A06(false, 4);
                    return;
                }
                Log.e("PrivateStatsToken/processSignedBlindedToken failed to unblind the token");
                c48132Dx.A03(8);
                c41431tu.A06(false, 4);
                return;
            case 1:
                final AnonymousClass273 anonymousClass273 = (AnonymousClass273) this.A01;
                final UserJid userJid = (UserJid) this.A02;
                final long j = this.A00;
                C0QS c0qs = new C0QS(C0Zq.A00.getRawString(), C002701i.A0T(DeviceJid.of(userJid)));
                C01J c01j = anonymousClass273.A04;
                int i = c01j.A06(c0qs, ((C010805j) this.A03).A02, new C0OC() { // from class: X.3EJ
                    @Override // X.C0OC
                    public final void AEI(byte[] bArr4) {
                        AnonymousClass273 anonymousClass2732 = anonymousClass273;
                        UserJid userJid2 = userJid;
                        long j2 = j;
                        byte[] A0O = C0Ho.A0O(bArr4, null, null);
                        if (A0O != null) {
                            try {
                                C40531sQ A0A = C40531sQ.A0A(A0O);
                                if ((A0A.A00 & 65536) == 65536) {
                                    C41461tx c41461tx = anonymousClass2732.A06;
                                    C000200d.A0x("LocationSharingManager/onReceiveLocation; location.jid=", userJid2);
                                    long A05 = c41461tx.A0G.A05();
                                    C0K0 A012 = C41461tx.A01(userJid2, A0A, null);
                                    A012.A05 = A05 - (1000 * j2);
                                    if (c41461tx.A0k(A012)) {
                                        for (InterfaceC453921s interfaceC453921s : c41461tx.A0Y) {
                                            interfaceC453921s.ANe(A012);
                                        }
                                        c41461tx.A0Q.A0A(userJid2, A0A, j2);
                                        return;
                                    }
                                    StringBuilder A0P = C000200d.A0P("LocationSharingManager/onReceiveLocation/sharer not in any group; remote_resource=");
                                    A0P.append(A012.A06);
                                    Log.w(A0P.toString());
                                    return;
                                }
                                StringBuilder sb = new StringBuilder("axolotl e2eMessage is missing live location message; jid=");
                                sb.append(userJid2);
                                Log.w(sb.toString());
                            } catch (C0JX e2) {
                                StringBuilder sb2 = new StringBuilder("axolotl derived plaintext does not represent valid protocol buffer; jid=");
                                sb2.append(userJid2);
                                Log.w(sb2.toString(), e2);
                            }
                        }
                    }
                }).A00;
                if (i != 0) {
                    C000200d.A0r("axolotl error while decrypt-group-using-fast-fatchet; status=", i);
                    if (i == -1005 || i == -1008) {
                        anonymousClass273.A06.A0V(userJid, AnonymousClass029.A1c(c01j.A08.A02()), 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
