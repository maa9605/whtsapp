package X;

import android.media.AudioManager;
import com.whatsapp.util.Log;

/* renamed from: X.2sB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59082sB implements AudioManager.OnAudioFocusChangeListener {
    public final C03120Eg A00;

    public C59082sB(C03120Eg c03120Eg) {
        this.A00 = c03120Eg;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        C09560eJ A01 = this.A00.A01();
        StringBuilder A0Q = C000200d.A0Q("messageaudioplayer/onaudiofocuschanged ", i, " current player:");
        A0Q.append(A01 != null);
        Log.i(A0Q.toString());
        if (!AnonymousClass024.A0c() || A01 == null) {
            return;
        }
        if (i != -2 && i != -1) {
            if (i == 1 && A01.A0R) {
                A01.A0F(0);
            }
        } else if (!A01.A0K()) {
        } else {
            A01.A04();
        }
    }
}
