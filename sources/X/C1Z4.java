package X;

/* renamed from: X.1Z4  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Z4 implements InterfaceC21060yj {
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final AnonymousClass127 A08;
    public final boolean A09;

    public C1Z4(AnonymousClass127 anonymousClass127, int i, int i2, int i3, int i4) {
        A00(i3, 0, "bufferForPlaybackMs", "0");
        A00(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        A00(i, i3, "minBufferMs", "bufferForPlaybackMs");
        A00(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        A00(i2, i, "maxBufferMs", "minBufferMs");
        A00(0, 0, "backBufferDurationMs", "0");
        this.A08 = anonymousClass127;
        this.A07 = C20910yU.A00(i);
        this.A06 = C20910yU.A00(i2);
        this.A05 = C20910yU.A00(i3);
        this.A04 = C20910yU.A00(i4);
        this.A02 = -1;
        this.A09 = true;
        this.A03 = C20910yU.A00(0);
    }

    public static void A00(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        C002701i.A1L(z, sb.toString());
    }

    public final void A01(boolean z) {
        this.A00 = 0;
        this.A01 = false;
        if (z) {
            AnonymousClass127 anonymousClass127 = this.A08;
            synchronized (anonymousClass127) {
                if (anonymousClass127.A05) {
                    anonymousClass127.A01(0);
                }
            }
        }
    }
}
