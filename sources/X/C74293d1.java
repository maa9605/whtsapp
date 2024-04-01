package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.3d1 */
/* loaded from: classes2.dex */
public class C74293d1 {
    public final C04g A01;
    public final C0E4 A02;
    public final C0E5 A03;
    public final C41581uB A04;
    public final C2AY A06;
    public final C01J A07;
    public final C01R A08;
    public final C0FA A0A;
    public final C41401tr A0B;
    public final AnonymousClass011 A0C;
    public final C84683u9 A0D;
    public volatile Future A0F;
    public final Set A0E = Collections.newSetFromMap(new ConcurrentHashMap());
    public final InterfaceC41531u4 A05 = new InterfaceC41531u4() { // from class: X.3tV
        {
            C74293d1.this = this;
        }

        @Override // X.InterfaceC41531u4
        public final void AHg(DeviceJid deviceJid) {
            C74293d1 c74293d1 = C74293d1.this;
            if (deviceJid != null) {
                c74293d1.A0E.remove(deviceJid);
                c74293d1.A0D.A00(deviceJid);
            }
        }
    };
    public final InterfaceC04210Jh A00 = new InterfaceC04210Jh() { // from class: X.3tq
        @Override // X.InterfaceC04210Jh
        public void AKj(DeviceJid deviceJid, int i) {
        }

        @Override // X.InterfaceC04210Jh
        public void AL0(DeviceJid deviceJid) {
        }

        {
            C74293d1.this = this;
        }

        @Override // X.InterfaceC04210Jh
        public void AL1(DeviceJid deviceJid) {
            C84683u9 c84683u9 = C74293d1.this.A0D;
            if (c84683u9 != null) {
                StringBuilder sb = new StringBuilder("VoiceService/notifyDeviceIdentityChanged ");
                sb.append(deviceJid);
                Log.i(sb.toString());
                C25L.A02(c84683u9.A00, deviceJid, false);
                return;
            }
            throw null;
        }

        @Override // X.InterfaceC04210Jh
        public void AL2(DeviceJid deviceJid) {
            C84683u9 c84683u9 = C74293d1.this.A0D;
            if (c84683u9 != null) {
                StringBuilder sb = new StringBuilder("VoiceService/notifyDeviceIdentityDeleted ");
                sb.append(deviceJid);
                Log.i(sb.toString());
                C25L.A02(c84683u9.A00, deviceJid, true);
                return;
            }
            throw null;
        }
    };
    public final InterfaceC04220Ji A09 = new InterfaceC04220Ji() { // from class: X.3tr
        {
            C74293d1.this = this;
        }

        @Override // X.InterfaceC04220Ji
        public void AQD(UserJid userJid, Set set, Set set2) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid = (DeviceJid) it.next();
                C84683u9 c84683u9 = C74293d1.this.A0D;
                if (c84683u9 != null) {
                    StringBuilder sb = new StringBuilder("VoiceService/notifyDeviceRemoved ");
                    sb.append(deviceJid);
                    Log.i(sb.toString());
                    C000700j.A08(!deviceJid.isPrimary(), "primary device should never be removed");
                    C25L.A02(c84683u9.A00, deviceJid, true);
                } else {
                    throw null;
                }
            }
        }
    };

    public C74293d1(AnonymousClass011 anonymousClass011, C01R c01r, C0E4 c0e4, C41581uB c41581uB, C04g c04g, C01J c01j, C41401tr c41401tr, C0E5 c0e5, C2AY c2ay, C0FA c0fa, C84683u9 c84683u9) {
        this.A0C = anonymousClass011;
        this.A08 = c01r;
        this.A02 = c0e4;
        this.A04 = c41581uB;
        this.A01 = c04g;
        this.A07 = c01j;
        this.A0B = c41401tr;
        this.A03 = c0e5;
        this.A06 = c2ay;
        this.A0A = c0fa;
        this.A0D = c84683u9;
    }

    /* JADX WARN: Removed duplicated region for block: B:301:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x02c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C74283d0 A00(X.C27V r31) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74293d1.A00(X.27V):X.3d0");
    }

    public final void A01(DeviceJid deviceJid) {
        if (!this.A0E.add(deviceJid)) {
            StringBuilder sb = new StringBuilder("voip/encryption/startGetPreKeyJob do nothing, PreKey already sent for ");
            sb.append(deviceJid);
            Log.i(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("voip/encryption/startGetPreKeyJob for ");
        sb2.append(deviceJid);
        Log.i(sb2.toString());
        this.A03.A03(new DeviceJid[]{deviceJid}, false, 7);
    }

    public boolean A02(final DeviceJid deviceJid, final String str, byte[] bArr, final int i) {
        if (i >= 0 && i <= 4) {
            if (bArr != null && bArr.length == 4) {
                final int A08 = AnonymousClass029.A08(bArr);
                StringBuilder A0R = C000200d.A0R("voip/receive_message/onPeerE2EDecryptionFailed peer e2e decryption failure; remoteRegistrationId=", A08, " retryCount: ", i, " from: ");
                A0R.append(deviceJid);
                Log.i(A0R.toString());
                try {
                    C01R c01r = this.A08;
                    DeviceJid deviceJid2 = (DeviceJid) c01r.A00.submit(new Callable() { // from class: X.3bx
                        {
                            C74293d1.this = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C74293d1 c74293d1 = C74293d1.this;
                            DeviceJid deviceJid3 = deviceJid;
                            String str2 = str;
                            int i2 = A08;
                            int i3 = i;
                            AnonymousClass094 anonymousClass094 = new AnonymousClass094(deviceJid3.userJid, true, str2);
                            C0IO A0T = C002701i.A0T(deviceJid3);
                            C01J c01j = c74293d1.A07;
                            C07920aJ A0C = c01j.A0C(A0T);
                            C07930aK c07930aK = A0C.A01;
                            byte[] A00 = c07930aK.A00();
                            if (!A0C.A00 && c07930aK.A00.A03 == i2) {
                                if (i3 > 2 && c01j.A0V(A0T, anonymousClass094)) {
                                    StringBuilder sb = new StringBuilder("voip/receive_message/onPeerE2EDecryptionFailed reg id is equal and has same basekey. Fetching new prekey for: ");
                                    sb.append(anonymousClass094);
                                    Log.i(sb.toString());
                                    c74293d1.A01(deviceJid3);
                                    return null;
                                }
                                if (i3 == 2) {
                                    C000200d.A0z("voip/receive_message/onPeerE2EDecryptionFailed recording base key. ", anonymousClass094);
                                    c01j.A0H.A00();
                                    c01j.A09.A01(A0T, anonymousClass094, A00);
                                }
                                return deviceJid3;
                            }
                            StringBuilder A0P = C000200d.A0P("voip/receive_message/onPeerE2EDecryptionFailed registration id is not equal. stored= ");
                            C000200d.A1H(A0P, c07930aK.A00.A03, ", incoming=", i2, ". Fetching new prekey for: ");
                            A0P.append(anonymousClass094);
                            Log.i(A0P.toString());
                            c74293d1.A01(deviceJid3);
                            return null;
                        }
                    }).get();
                    if (deviceJid2 != null) {
                        this.A0D.A00(deviceJid2);
                    }
                    return true;
                } catch (InterruptedException e) {
                    Log.i("voip/receive_message/onPeerE2EDecryptionFailed session retry threw: ", e);
                    return false;
                } catch (ExecutionException e2) {
                    Log.i("voip/receive_message/onPeerE2EDecryptionFailed session retry threw: ", e2);
                    return false;
                }
            }
            StringBuilder A0P = C000200d.A0P("voip/receive_message/onPeerE2EDecryptionFailed e2e decryption failure; invalid remote remoteRegBytes id; remoteRegistrationId=");
            A0P.append(Arrays.toString(bArr));
            Log.i(A0P.toString());
            return false;
        }
        C000200d.A0q("voip/receive_message/onPeerE2EDecryptionFailed do nothing for retry count: ", i);
        return true;
    }
}
