package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

/* renamed from: X.2Ze  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC51972Ze extends AppCompatSeekBar implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public AbstractC51972Ze(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A2y((VoiceNoteSeekBar) this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A00;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A00 = c2ub;
        }
        return c2ub.generatedComponent();
    }
}
