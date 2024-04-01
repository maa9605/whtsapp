package X;

import android.content.SharedPreferences;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2Ix */
/* loaded from: classes2.dex */
public class C49182Ix implements InterfaceC49192Iy {
    public C20M A00;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C451020k A03;
    public final C49172Iw A04 = new C49172Iw(this);
    public final C44441z5 A05;
    public final C44471z8 A06;
    public final C44331yt A07;
    public final AnonymousClass012 A08;
    public final C000500h A09;
    public final C01J A0A;
    public final C01R A0B;
    public final C41711uO A0C;
    public final C05Y A0D;
    public final C2Iz A0E;
    public final InterfaceC002901k A0F;

    public C49182Ix(AnonymousClass012 anonymousClass012, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C05Y c05y, C01R c01r, C44331yt c44331yt, C2Iz c2Iz, C01J c01j, C000500h c000500h, C41711uO c41711uO, C44441z5 c44441z5, C44471z8 c44471z8) {
        this.A08 = anonymousClass012;
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A0F = interfaceC002901k;
        this.A0D = c05y;
        this.A0B = c01r;
        this.A0E = c2Iz;
        this.A07 = c44331yt;
        this.A0A = c01j;
        this.A09 = c000500h;
        this.A0C = c41711uO;
        this.A03 = new C451020k(anonymousClass012, interfaceC002901k, c01r, c01j, c000500h, c41711uO);
        this.A05 = c44441z5;
        this.A06 = c44471z8;
    }

    public final void A00(C2L8 c2l8, long j, boolean z) {
        SharedPreferences sharedPreferences = this.A09.A00;
        AnonymousClass298 A00 = C451020k.A00(sharedPreferences.getInt("adv_raw_id", -1), sharedPreferences.getInt("adv_current_key_index", -1), j);
        try {
            C451020k c451020k = this.A03;
            C0IP c0ip = c2l8.A00;
            if (c0ip != null) {
                byte[] bArr = c0ip.A00.A01;
                C0JY c0jy = (C0JY) c451020k.A03.A00.submit(new CallableC57422pI(c451020k)).get();
                if (c0jy != null) {
                    C0R8 c0r8 = c0jy.A00;
                    C0IR c0ir = c0jy.A01.A00;
                    byte[] A1h = AnonymousClass029.A1h(C02M.A04, A00.A0B(), bArr);
                    C0CT AVX = C29C.A05.AVX();
                    C0AN A09 = A00.A09();
                    AVX.A02();
                    C29C c29c = (C29C) AVX.A00;
                    c29c.A00 |= 1;
                    c29c.A03 = A09;
                    C0AN A002 = C0AN.A00(c0ir.A01);
                    AVX.A02();
                    C29C c29c2 = (C29C) AVX.A00;
                    c29c2.A00 |= 2;
                    c29c2.A01 = A002;
                    C0AN A003 = C0AN.A00(C002701i.A1W(c0r8, A1h));
                    AVX.A02();
                    C29C c29c3 = (C29C) AVX.A00;
                    c29c3.A00 |= 4;
                    c29c3.A02 = A003;
                    C29C c29c4 = (C29C) AVX.A01();
                    byte[] bArr2 = c2l8.A04;
                    byte[] A0B = c29c4.A0B();
                    try {
                        Mac mac = Mac.getInstance("HmacSHA256");
                        mac.init(new SecretKeySpec(bArr2, "HmacSHA256"));
                        byte[] doFinal = mac.doFinal(A0B);
                        C0CT AVX2 = C87033z0.A03.AVX();
                        C0AN A092 = c29c4.A09();
                        AVX2.A02();
                        C87033z0 c87033z0 = (C87033z0) AVX2.A00;
                        c87033z0.A00 |= 1;
                        c87033z0.A01 = A092;
                        C0AN A004 = C0AN.A00(doFinal);
                        AVX2.A02();
                        C87033z0 c87033z02 = (C87033z0) AVX2.A00;
                        c87033z02.A00 |= 2;
                        c87033z02.A02 = A004;
                        AnonymousClass296 A03 = c451020k.A03(A00);
                        this.A02.A02.post(new RunnableEBaseShape0S0510000_I0(this, c2l8, A03, (C87033z0) AVX2.A01(), c451020k.A04(A03), z, 0));
                        return;
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to calculate hmac-sha256", e);
                    }
                }
                throw null;
            }
            throw null;
        } catch (Exception e2) {
            Log.e("CompanionDeviceQrHandler/handleQrCode", e2);
            if (!(e2 instanceof ExecutionException) && !(e2 instanceof InterruptedException)) {
                throw new RuntimeException("Failed to generate adv protobufs", e2);
            }
            this.A02.A02.post(new RunnableEBaseShape1S0100000_I0_1(this, 17));
        }
    }

    public final void A01(C2L8 c2l8, AnonymousClass296 anonymousClass296, C87033z0 c87033z0, AnonymousClass297 anonymousClass297, boolean z) {
        long j;
        C2L7 c2l7 = new C2L7(this.A08, this.A02, this.A01, this.A0D, this.A04);
        C05Y c05y = c2l7.A07;
        String A02 = c05y.A02();
        c2l7.A00 = c2l8;
        c2l7.A01 = anonymousClass296;
        c2l7.A02 = z;
        String str = c2l8.A02;
        byte[] bArr = c2l8.A03;
        if (anonymousClass296 != null) {
            j = anonymousClass296.A04;
        } else {
            j = -1;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C02590Ca("ref", (C04P[]) null, str));
        C000200d.A1D("pub-key", bArr, arrayList);
        if (c87033z0 != null && anonymousClass297 != null) {
            arrayList.add(new C02590Ca("device-identity", null, null, c87033z0.A0B()));
            arrayList.add(new C02590Ca("key-index-list", new C04P[]{new C04P("ts", j)}, null, anonymousClass297.A0B()));
        }
        C000200d.A1C("app/sendPairDeviceRequest success: ", c05y.A0B(219, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "md", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("pair-device", new C04P[0], (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)), c2l7, 0L));
    }

    @Override // X.InterfaceC49192Iy
    public C20M A9m() {
        return this.A00;
    }

    @Override // X.InterfaceC49192Iy
    public void AEJ(String str) {
        C2L8 A00 = C2L8.A00(str);
        if (A00 == null) {
            this.A0E.A01();
        } else if (A00.A01 != null) {
            this.A0E.A00();
            A01(A00, null, null, null, false);
        } else if (A00.A00 != null && A00.A04 != null) {
            long A01 = this.A03.A01();
            if (A01 == -1) {
                DevicePairQrScannerActivity devicePairQrScannerActivity = this.A0E.A00;
                devicePairQrScannerActivity.A04.AG4(1);
                devicePairQrScannerActivity.A01.A07(R.string.companion_device_time_incorrect_error, 1);
                return;
            }
            this.A0E.A00();
            this.A0F.AS1(new RunnableEBaseShape0S1200100_I0(this, str, A01, A00, 1));
        } else {
            this.A0E.A01();
        }
    }
}
