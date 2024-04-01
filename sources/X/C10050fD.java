package X;

import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.0fD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10050fD extends AbstractC04290Jp {
    public int A00;
    public int A01;
    public long A02;
    public C0D3 A03;

    public C10050fD(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 8);
        this.A01 = 0;
    }

    @Override // X.AnonymousClass092
    public int A04() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public long A08() {
        return this.A01;
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        if (((AbstractC04290Jp) this).A00) {
            return Long.toString(this.A02);
        }
        return null;
    }

    @Override // X.AnonymousClass092
    public void A0W(int i) {
        if (i > 0) {
            ((AbstractC04290Jp) this).A00 = true;
            this.A00 = i;
        }
    }

    @Override // X.AnonymousClass092
    public void A0a(long j) {
        if (j > 0) {
            ((AbstractC04290Jp) this).A00 = true;
            this.A01 = (int) j;
        }
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        long A03 = AnonymousClass024.A03(str, 0L);
        A03 = (A03 < 0 || A03 > 2147483648L) ? 0L : 0L;
        this.A02 = A03;
        if (A03 > 0) {
            ((AbstractC04290Jp) this).A00 = true;
        }
    }

    @Override // X.AbstractC04290Jp
    public C0D3 A18() {
        C0D3 c0d3;
        synchronized (this.A0o) {
            c0d3 = this.A03;
            if (c0d3 == null) {
                boolean z = ((AbstractC04290Jp) this).A01;
                int i = this.A00;
                int i2 = 5;
                int i3 = 2;
                if (i > 0) {
                    i3 = 5;
                } else if (this.A0n.A02) {
                    switch (this.A01) {
                        case 1:
                        case C0M6.A01 /* 20 */:
                            break;
                        case 2:
                        case 22:
                            i2 = 4;
                            break;
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 15:
                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        case 17:
                        case 19:
                            i2 = 3;
                            break;
                        case 4:
                        case 5:
                        case 9:
                            i2 = 2;
                            break;
                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                        case 12:
                        case 13:
                        case 14:
                        case 18:
                            i2 = 1;
                            break;
                        case 21:
                            i2 = 6;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    i3 = i2;
                }
                c0d3 = C0D3.A01(this, z, i, i3, this.A02, false);
                this.A03 = c0d3;
            }
        }
        return c0d3;
    }
}
