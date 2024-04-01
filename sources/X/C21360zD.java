package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* renamed from: X.0zD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21360zD {
    public static final C21360zD A02 = new C21360zD(new int[]{2}, 8);
    public final int A00;
    public final int[] A01;

    public C21360zD(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.A01 = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    public static C21360zD A00(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (registerReceiver != null && registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new C21360zD(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return A02;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21360zD) {
            C21360zD c21360zD = (C21360zD) obj;
            return Arrays.equals(this.A01, c21360zD.A01) && this.A00 == c21360zD.A00;
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("AudioCapabilities[maxChannelCount=");
        A0P.append(this.A00);
        A0P.append(", supportedEncodings=");
        A0P.append(Arrays.toString(this.A01));
        A0P.append("]");
        return A0P.toString();
    }
}
