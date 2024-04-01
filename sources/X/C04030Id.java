package X;

/* renamed from: X.0Id  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04030Id {
    public boolean A00;
    public boolean A01;
    public byte[] A02;
    public int[] A03;
    public final AnonymousClass097 A04;
    public transient boolean A05;

    public C04030Id(AnonymousClass097 anonymousClass097) {
        this.A04 = anonymousClass097;
    }

    public static boolean A00(C0DC c0dc) {
        return c0dc == C0DC.A0N || c0dc == C0DC.A0M || c0dc == C0DC.A0A || c0dc == C0DC.A0P || c0dc == C0DC.A0Q || c0dc == C0DC.A0C || c0dc == C0DC.A0L || c0dc == C0DC.A0H || c0dc == C0DC.A06;
    }

    public synchronized void A01() {
        this.A03 = null;
        this.A02 = null;
        C09H c09h = this.A04.A02;
        if (c09h != null) {
            c09h.A0M = false;
            this.A01 = true;
            this.A00 = true;
        } else {
            throw null;
        }
    }

    public synchronized void A02(byte[] bArr, int[] iArr) {
        if (iArr != null) {
            this.A03 = iArr;
        }
        if (bArr != null && bArr.length > 0) {
            AnonymousClass097 anonymousClass097 = this.A04;
            if (anonymousClass097.A1G() || this.A03 != null) {
                C09H c09h = anonymousClass097.A02;
                if (c09h != null) {
                    c09h.A0M = true;
                    this.A02 = bArr;
                    this.A00 = true;
                } else {
                    throw null;
                }
            }
        }
        C09H c09h2 = this.A04.A02;
        if (c09h2 != null) {
            c09h2.A0M = false;
            this.A02 = null;
            this.A00 = true;
        } else {
            throw null;
        }
    }

    public synchronized void A03(byte[] bArr, int[] iArr) {
        A02(bArr, iArr);
        this.A01 = true;
    }

    public boolean A04() {
        C09H c09h = this.A04.A02;
        if (c09h != null) {
            return c09h.A0M;
        }
        throw null;
    }

    public synchronized boolean A05() {
        return this.A00;
    }

    public synchronized byte[] A06() {
        return this.A02;
    }

    public synchronized int[] A07() {
        return this.A03;
    }
}
