package X;

import android.media.AudioManager;
import com.google.android.search.verification.client.R;

/* renamed from: X.1vf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42391vf {
    public static volatile C42391vf A04;
    public long A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public final C018508q A02;
    public final C02E A03;

    public C42391vf(C018508q c018508q, C02E c02e) {
        this.A02 = c018508q;
        this.A03 = c02e;
    }

    public static C42391vf A00() {
        if (A04 == null) {
            synchronized (C42391vf.class) {
                if (A04 == null) {
                    A04 = new C42391vf(C018508q.A00(), C02E.A00());
                }
            }
        }
        return A04;
    }

    public boolean A01() {
        AudioManager A0A = this.A03.A0A();
        if (A0A == null || A0A.getStreamVolume(3) != 0) {
            return true;
        }
        if (System.currentTimeMillis() - this.A00 > 2000) {
            this.A00 = System.currentTimeMillis();
            this.A02.A07(R.string.please_turn_volume_up, 0);
        }
        return false;
    }
}
