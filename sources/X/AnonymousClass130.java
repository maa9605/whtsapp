package X;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: X.130  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass130 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C19580vf A00;

    public AnonymousClass130(C19580vf c19580vf, MediaCodec mediaCodec) {
        this.A00 = c19580vf;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        C19580vf c19580vf = this.A00;
        if (this != c19580vf.A0P) {
            return;
        }
        C21030yg A0G = c19580vf.A0G(j);
        if (A0G != null) {
            c19580vf.A0f(((AbstractC24681Cl) c19580vf).A08, A0G.A0F, A0G.A08);
        }
        c19580vf.A0b();
        c19580vf.A0Y();
        c19580vf.A0P(j);
    }
}
