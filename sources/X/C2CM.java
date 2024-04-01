package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2CM  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2CM extends C24U implements InterfaceC04070Ih {
    public final C0JM A00;
    public final C0Ml A01;
    public final File A02;
    public final /* synthetic */ C47552Br A03;

    @Override // X.InterfaceC04070Ih
    public void AJX(boolean z) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CM(C47552Br c47552Br, C0JM c0jm, File file) {
        super(c47552Br.A03, c47552Br.A02, c47552Br.A07, c47552Br.A04, c47552Br.A05, c47552Br.A00.A06);
        this.A03 = c47552Br;
        this.A01 = new C0Ml();
        this.A00 = c0jm;
        this.A02 = file;
    }

    @Override // X.C0L1
    public C43211x2 A00(C04020Ic c04020Ic) {
        C43211x2 c43211x2 = new C43211x2();
        C0JM c0jm = this.A00;
        int i = c0jm.A03;
        synchronized (c43211x2) {
            c43211x2.A0C = Integer.valueOf(i);
        }
        int i2 = c0jm.A02;
        synchronized (c43211x2) {
            c43211x2.A0B = Integer.valueOf(i2);
        }
        boolean A02 = c04020Ic.A02();
        synchronized (c43211x2) {
            c43211x2.A05 = Boolean.valueOf(A02);
        }
        synchronized (c43211x2) {
            c43211x2.A06 = Boolean.FALSE;
        }
        return c43211x2;
    }

    @Override // X.C0L1
    public Object A03() {
        C0F2 c0f2 = this.A03.A01;
        C0JM c0jm = this.A00;
        String str = c0jm.A0B;
        if (c0f2 != null) {
            File A03 = c0f2.A03();
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace('/', '-'));
            sb.append(".tmp");
            new File(A03, sb.toString());
            C0DC c0dc = C0DC.A0I;
            String str2 = c0jm.A07;
            String str3 = c0jm.A05;
            if (str2 != null) {
                return new C63152zE(new C1MF(str2, "sticker", null, str3, null), this.A02, c0jm.A09, c0jm.A0B, c0dc);
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C0L1, X.InterfaceC04060Ig
    public void A61(boolean z) {
        Log.i("StickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download");
        A04();
    }

    @Override // X.InterfaceC04070Ih
    public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
    }
}
