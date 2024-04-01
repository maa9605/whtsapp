package X;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: X.0zG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21390zG {
    public float A00 = 1.0f;
    public int A01;
    public final AudioManager A02;
    public final C21370zE A03;
    public final InterfaceC21380zF A04;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0zE] */
    public C21390zG(Context context, InterfaceC21380zF interfaceC21380zF) {
        this.A02 = context != null ? (AudioManager) context.getApplicationContext().getSystemService("audio") : null;
        this.A04 = interfaceC21380zF;
        this.A03 = new AudioManager.OnAudioFocusChangeListener() { // from class: X.0zE
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                C21390zG c21390zG;
                if (i == -3) {
                    c21390zG = C21390zG.this;
                    if (c21390zG != null) {
                        c21390zG.A01 = 3;
                    } else {
                        throw null;
                    }
                } else if (i == -2) {
                    c21390zG = C21390zG.this;
                    c21390zG.A01 = 2;
                    C06260Si c06260Si = ((C1Z7) c21390zG.A04).A00;
                    c06260Si.A08(c06260Si.ACR(), 0);
                } else if (i == -1) {
                    c21390zG = C21390zG.this;
                    c21390zG.A01 = -1;
                    C06260Si c06260Si2 = ((C1Z7) c21390zG.A04).A00;
                    c06260Si2.A08(c06260Si2.ACR(), -1);
                    c21390zG.A00();
                } else if (i != 1) {
                    C000200d.A0s("Unknown focus change type: ", i, "AudioFocusManager");
                    return;
                } else {
                    c21390zG = C21390zG.this;
                    c21390zG.A01 = 1;
                    C06260Si c06260Si3 = ((C1Z7) c21390zG.A04).A00;
                    c06260Si3.A08(c06260Si3.ACR(), 1);
                }
                float f = c21390zG.A01 == 3 ? 0.2f : 1.0f;
                if (c21390zG.A00 != f) {
                    c21390zG.A00 = f;
                    ((C1Z7) c21390zG.A04).A00.A02();
                }
            }
        };
        this.A01 = 0;
    }

    public final void A00() {
        if (this.A01 == 0) {
            return;
        }
        if (C08M.A00 < 26) {
            AudioManager audioManager = this.A02;
            if (audioManager == null) {
                throw null;
            }
            audioManager.abandonAudioFocus(this.A03);
        }
        this.A01 = 0;
    }
}
