package X;

import android.view.Choreographer;

/* renamed from: X.0RI  reason: invalid class name */
/* loaded from: classes.dex */
public class C0RI {
    public C09910ez A02;
    public final Choreographer A05;
    public long A00 = -1;
    public long A01 = -1;
    public boolean A03 = false;
    public final Choreographer.FrameCallback A04 = new Choreographer.FrameCallback() { // from class: X.0f0
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            C0RI c0ri = C0RI.this;
            if (!c0ri.A03) {
                c0ri.A05.removeFrameCallback(this);
            } else if (c0ri.A00 == -1) {
                c0ri.A00 = j;
                c0ri.A01 = j;
                c0ri.A05.postFrameCallback(this);
            } else {
                long j2 = j - c0ri.A01;
                c0ri.A01 = j;
                C09910ez c09910ez = c0ri.A02;
                if (c09910ez != null) {
                    C0RH c0rh = c09910ez.A00;
                    double d = c0rh.A06;
                    long max = Math.max(Math.round(j2 / d), 1L);
                    long min = Math.min(max - 1, 100L);
                    double d2 = min;
                    c0rh.A01 += d2;
                    if (min > 4) {
                        c0rh.A00 = (d2 / 4.0d) + c0rh.A00;
                    }
                    c0rh.A02 = (long) ((d * max) + c0rh.A02);
                }
                c0ri.A05.postFrameCallback(this);
            }
        }
    };

    public C0RI(Choreographer choreographer, C09910ez c09910ez) {
        this.A05 = choreographer;
        this.A02 = c09910ez;
    }
}
