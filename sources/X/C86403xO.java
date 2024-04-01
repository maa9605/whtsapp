package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.3xO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86403xO extends C82153q3 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public C86403xO(C003701t c003701t, C018508q c018508q, InterfaceC002901k interfaceC002901k, C012005w c012005w, C40081rY c40081rY, C01B c01b, C018308n c018308n, C41471ty c41471ty, C02E c02e, C002301c c002301c, C42441vk c42441vk, C42471vn c42471vn, C2Q4 c2q4, C43791xz c43791xz, C2Q5 c2q5, AbstractC53802hX abstractC53802hX, AnonymousClass092 anonymousClass092) {
        super(c003701t, c018508q, interfaceC002901k, c012005w, c40081rY, c01b, c018308n, c41471ty, c02e, c002301c, c42441vk, c42471vn, c2q4, c43791xz, c2q5, abstractC53802hX, anonymousClass092);
        this.A02 = 3;
        this.A09.setId(R.id.status_playback_gif);
    }

    @Override // X.C82153q3, X.C3XV
    public long A00() {
        int i = this.A02;
        if (i > 0) {
            return i * this.A03;
        }
        long A00 = super.A00();
        return A0I(A00) * A00;
    }

    @Override // X.C82153q3, X.C3XV
    public void A04() {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0.0f;
        super.A04();
        AbstractC48662Ge abstractC48662Ge = ((C82153q3) this).A02;
        if (abstractC48662Ge == null) {
            return;
        }
        abstractC48662Ge.A01 = new InterfaceC73113b7() { // from class: X.3pq
            @Override // X.InterfaceC73113b7
            public final void AIq(AbstractC48662Ge abstractC48662Ge2) {
                C86403xO c86403xO = C86403xO.this;
                if (abstractC48662Ge2.A02() != 0) {
                    c86403xO.A04++;
                }
                c86403xO.A01++;
                if (c86403xO.A03 == 0) {
                    int A03 = ((C82153q3) c86403xO).A02.A03();
                    c86403xO.A03 = A03;
                    if (A03 > 1) {
                        c86403xO.A02 = c86403xO.A0I(A03);
                    } else {
                        c86403xO.A03 = 0;
                    }
                }
                int i = c86403xO.A04;
                int i2 = c86403xO.A02;
                if (i < i2 && c86403xO.A01 < (i2 << 2)) {
                    c86403xO.A00 = 0.0f;
                    abstractC48662Ge2.A0A(0);
                    abstractC48662Ge2.A08();
                    return;
                }
                ((C3XV) c86403xO).A05.A00();
            }
        };
    }

    @Override // X.C82153q3, X.C3XV
    public void A05() {
        AbstractC48662Ge abstractC48662Ge = ((C82153q3) this).A02;
        if (abstractC48662Ge != null) {
            abstractC48662Ge.A01 = null;
        }
        super.A05();
    }

    public final int A0I(long j) {
        if (((C82153q3) this).A02 instanceof C82063pu) {
            return 1;
        }
        if (j == 0) {
            return 3;
        }
        return (int) Math.max(3L, 6000 / j);
    }
}
