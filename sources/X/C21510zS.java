package X;

import android.media.AudioTrack;

/* renamed from: X.0zS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21510zS {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final C21500zR A05;

    public C21510zS(AudioTrack audioTrack) {
        if (C08M.A00 >= 19) {
            this.A05 = new C21500zR(audioTrack);
            A00();
            return;
        }
        this.A05 = null;
        A01(3);
    }

    public void A00() {
        if (this.A05 != null) {
            A01(0);
        }
    }

    public final void A01(int i) {
        this.A00 = i;
        if (i == 0) {
            this.A03 = 0L;
            this.A01 = -1L;
            this.A02 = System.nanoTime() / 1000;
            this.A04 = 5000L;
        } else if (i == 1) {
            this.A04 = 5000L;
        } else if (i == 2 || i == 3) {
            this.A04 = 10000000L;
        } else if (i == 4) {
            this.A04 = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }
}
