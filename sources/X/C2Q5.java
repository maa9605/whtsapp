package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2Q5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Q5 {
    public static volatile C2Q5 A08;
    public AudioFocusRequest A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public Handler A02;
    public Object A03;
    public List A04;
    public boolean A05;
    public final C02E A06;
    public final Runnable A07 = new RunnableEBaseShape6S0100000_I0_6(this, 40);

    public C2Q5(C02E c02e) {
        this.A06 = c02e;
    }

    public static C2Q5 A00() {
        if (A08 == null) {
            synchronized (C2Q5.class) {
                if (A08 == null) {
                    A08 = new C2Q5(C02E.A00());
                }
            }
        }
        return A08;
    }

    public final AudioFocusRequest A01() {
        AudioFocusRequest audioFocusRequest = this.A00;
        if (audioFocusRequest == null) {
            AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).build();
            this.A00 = build;
            return build;
        }
        return audioFocusRequest;
    }

    public final void A02() {
        if (this.A03 != null) {
            Log.i("AudioManager/audio-focus-abandoned");
            this.A03 = null;
            AudioManager A0A = this.A06.A0A();
            if (A0A != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    A0A.abandonAudioFocusRequest(A01());
                    return;
                }
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
                if (onAudioFocusChangeListener == null) {
                    onAudioFocusChangeListener = C71713Xe.A00;
                    this.A01 = onAudioFocusChangeListener;
                }
                A0A.abandonAudioFocus(onAudioFocusChangeListener);
            }
        }
    }
}
