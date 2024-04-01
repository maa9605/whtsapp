package java.lang;

import X.AnonymousClass029;
import X.AnonymousClass273;
import X.C000200d;
import X.C002701i;
import X.C010805j;
import X.C01J;
import X.C04420Kc;
import X.C05240Nw;
import X.C0IO;
import X.C0IP;
import X.C0OC;
import X.C27381Nd;
import X.C2E4;
import X.C41401tr;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.List;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0401000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableEBaseShape0S0401000_I0(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C01J c01j;
        C27381Nd A05;
        switch (this.A05) {
            case 0:
                final AnonymousClass273 anonymousClass273 = (AnonymousClass273) this.A01;
                DeviceJid deviceJid = (DeviceJid) this.A02;
                int i = this.A00;
                final C04420Kc c04420Kc = (C04420Kc) this.A03;
                C010805j c010805j = (C010805j) this.A04;
                StringBuilder sb = new StringBuilder("axolotl received a location notification; jid=");
                sb.append(deviceJid);
                sb.append("; retryCount=");
                sb.append(i);
                Log.i(sb.toString());
                final C0IO A0T = C002701i.A0T(deviceJid);
                C0OC c0oc = new C0OC() { // from class: X.3EH
                    @Override // X.C0OC
                    public final void AEI(byte[] bArr) {
                        AnonymousClass273 anonymousClass2732 = AnonymousClass273.this;
                        C04420Kc c04420Kc2 = c04420Kc;
                        C0IO c0io = A0T;
                        byte[] A0O = C0Ho.A0O(bArr, null, null);
                        if (A0O == null) {
                            StringBuilder sb2 = new StringBuilder("axolotl derived invalid plaintext; stanzaKey=");
                            sb2.append(c04420Kc2);
                            Log.w(sb2.toString());
                            return;
                        }
                        try {
                            C40531sQ A0A = C40531sQ.A0A(A0O);
                            List A0C = C0Ho.A0C(A0A);
                            if (((AbstractCollection) A0C).size() == 0) {
                                if ((A0A.A00 & 16384) != 16384) {
                                    return;
                                }
                                StringBuilder sb3 = new StringBuilder("axolotl received sender key distribution message; stanzaKey=");
                                sb3.append(c04420Kc2);
                                Log.i(sb3.toString());
                                C2G1 c2g1 = A0A.A0U;
                                if (c2g1 == null) {
                                    c2g1 = C2G1.A03;
                                }
                                int i2 = c2g1.A00;
                                if ((i2 & 1) == 1 && (i2 & 2) == 2) {
                                    C0QS c0qs = new C0QS(C0Zq.A00.getRawString(), c0io);
                                    C01J c01j2 = anonymousClass2732.A04;
                                    byte[] A06 = c2g1.A01.A06();
                                    c01j2.A0H.A00();
                                    AnonymousClass051 anonymousClass051 = c01j2.A00;
                                    try {
                                        new C1RJ(anonymousClass051.A00.A01).A01(C002701i.A15(c0qs), new C38141nc(A06));
                                        return;
                                    } catch (C1RB e) {
                                        Log.w("axolotl", e);
                                        StringBuilder sb4 = new StringBuilder("axolotl received invalid sender key distribution message; stanzaKey=");
                                        sb4.append(c04420Kc2);
                                        Log.w(sb4.toString());
                                        return;
                                    } catch (C1RD e2) {
                                        Log.w("axolotl", e2);
                                        StringBuilder sb5 = new StringBuilder("axolotl received legacy sender key distribution message; stanzaKey=");
                                        sb5.append(c04420Kc2);
                                        Log.w(sb5.toString());
                                        return;
                                    }
                                }
                                StringBuilder sb6 = new StringBuilder("axolotl received incomplete sender key distribution message; stanzaKey=");
                                sb6.append(c04420Kc2);
                                Log.w(sb6.toString());
                                return;
                            }
                            StringBuilder sb7 = new StringBuilder("axolotl received an invalid protobuf; stanzaKey=");
                            sb7.append(c04420Kc2);
                            sb7.append("; messageTypes=");
                            sb7.append(A0C);
                            Log.w(sb7.toString());
                        } catch (C0JX e3) {
                            StringBuilder sb8 = new StringBuilder("axolotl derived plaintext does not represent valid protocol buffer; stanzaKey=");
                            sb8.append(c04420Kc2);
                            Log.w(sb8.toString(), e3);
                        }
                    }
                };
                int i2 = c010805j.A00;
                if (i2 == 0) {
                    c01j = anonymousClass273.A04;
                    A05 = c01j.A04(A0T, c010805j.A02, c0oc);
                } else if (i2 == 1) {
                    c01j = anonymousClass273.A04;
                    A05 = c01j.A05(A0T, c010805j.A02, c0oc);
                } else {
                    StringBuilder sb2 = new StringBuilder("axolotl unrecognized ciphertext type; stanzaKey=");
                    sb2.append(c04420Kc);
                    sb2.append("; type=");
                    C000200d.A1G(sb2, i2);
                    return;
                }
                int i3 = A05.A00;
                if (i3 != 0) {
                    C000200d.A0r("axolotl error; status=", i3);
                    if (i3 == -1005 || i3 == -1008 || i3 == -1003 || i3 == -1002) {
                        int A02 = c01j.A08.A02();
                        anonymousClass273.A01.A02.post(new RunnableEBaseShape0S0202000_I0(anonymousClass273, c04420Kc, A02, i, 0));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C2E4 c2e4 = (C2E4) this.A01;
                DeviceJid deviceJid2 = (DeviceJid) this.A02;
                byte[] bArr = (byte[]) this.A03;
                byte[] bArr2 = (byte[]) this.A04;
                byte b = (byte) this.A00;
                if (!deviceJid2.isPrimary()) {
                    C41401tr c41401tr = c2e4.A0N;
                    if (!c41401tr.A0A(deviceJid2, bArr, bArr2, b)) {
                        Log.e("recvmessagelistener/on-get-identity-success/invalid device identity");
                        c41401tr.A07(deviceJid2, true);
                        return;
                    }
                }
                try {
                    c2e4.A0H.A0M(C002701i.A0T(deviceJid2), new C0IP(C002701i.A0S(AnonymousClass029.A1h(new byte[]{b}, bArr2))));
                    c2e4.A01.A02.post(new RunnableEBaseShape3S0200000_I0_3(c2e4, deviceJid2, 17));
                    return;
                } catch (C05240Nw e) {
                    Log.e("recvmessagelistener/on-get-identity-success/invalidkey/", e);
                    return;
                }
            default:
                return;
        }
    }
}
