package X;

import android.media.AudioAttributes;

/* renamed from: X.0zC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21350zC {
    public static final C21350zC A02 = new C21350zC();
    public AudioAttributes A00;
    public final int A01 = 1;

    public AudioAttributes A00() {
        AudioAttributes audioAttributes = this.A00;
        if (audioAttributes == null) {
            AudioAttributes build = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(this.A01).build();
            this.A00 = build;
            return build;
        }
        return audioAttributes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C21350zC.class == obj.getClass() && this.A01 == ((C21350zC) obj).A01;
    }

    public int hashCode() {
        return 506447 + this.A01;
    }
}
