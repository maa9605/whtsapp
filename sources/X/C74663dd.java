package X;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.whatsapp.voipcalling.VoipCallControlRingingDotsIndicator;

/* renamed from: X.3dd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74663dd extends Animation {
    public final float A00 = 0.14f;
    public final float A01 = 0.66f;
    public final int A02 = 800;
    public final int A03 = 100;
    public final VoipCallControlRingingDotsIndicator A04;

    public C74663dd(VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator) {
        this.A04 = voipCallControlRingingDotsIndicator;
        setDuration(1500);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        int i;
        VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator;
        int i2 = 0;
        do {
            i = i2 + 1;
            int duration = ((int) (((float) getDuration()) * f)) - (this.A03 * i);
            int i3 = this.A02;
            int i4 = i3 >> 1;
            float f2 = duration <= i4 ? duration / i4 : (i3 - duration) / i4;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            voipCallControlRingingDotsIndicator = this.A04;
            float f3 = this.A00;
            float f4 = ((this.A01 - f3) * f2) + f3;
            if (voipCallControlRingingDotsIndicator != null) {
                if (i2 >= 0 && i2 < 3) {
                    voipCallControlRingingDotsIndicator.A03[i2] = f4;
                }
                i2 = i;
            } else {
                throw null;
            }
        } while (i < 3);
        voipCallControlRingingDotsIndicator.invalidate();
    }
}
