package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.10p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C219910p {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public C21030yg A07;
    public boolean A08;
    public int A01 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    public int[] A0D = new int[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public long[] A0E = new long[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public long[] A0F = new long[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public int[] A0B = new int[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public int[] A0C = new int[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public C21830zy[] A0H = new C21830zy[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public C21030yg[] A0G = new C21030yg[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public boolean A09 = true;
    public boolean A0A = true;

    public final long A00(int i) {
        int i2;
        long j = this.A05;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int i3 = this.A04 + (i - 1);
            int i4 = this.A01;
            if (i3 >= i4) {
                i3 -= i4;
            }
            for (int i5 = 0; i5 < i; i5++) {
                j2 = Math.max(j2, this.A0F[i3]);
                if ((this.A0B[i3] & 1) != 0) {
                    break;
                }
                i3--;
                if (i3 == -1) {
                    i3 = i4 - 1;
                }
            }
        }
        this.A05 = Math.max(j, j2);
        int i6 = this.A02 - i;
        this.A02 = i6;
        this.A00 += i;
        int i7 = this.A04 + i;
        this.A04 = i7;
        int i8 = this.A01;
        if (i7 >= i8) {
            i7 -= i8;
            this.A04 = i7;
        }
        int i9 = this.A03 - i;
        this.A03 = i9;
        if (i9 < 0) {
            this.A03 = 0;
        }
        if (i6 == 0) {
            if (i7 == 0) {
                i7 = i8;
            }
            return this.A0E[i7 - 1] + this.A0C[i2];
        }
        return this.A0E[i7];
    }

    public synchronized boolean A01() {
        return this.A03 != this.A02;
    }
}
