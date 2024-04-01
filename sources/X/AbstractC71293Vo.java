package X;

import android.widget.SeekBar;

/* renamed from: X.3Vo */
/* loaded from: classes2.dex */
public abstract class AbstractC71293Vo implements SeekBar.OnSeekBarChangeListener {
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void A00(int i) {
        if (this instanceof C80993oB) {
            C51802Yb c51802Yb = ((C80993oB) this).A00;
            c51802Yb.A06.setDescription(AnonymousClass029.A0g(c51802Yb.A05, i));
        } else if (!(this instanceof C80983oA)) {
            C2W4 c2w4 = ((C38I) this).A00;
            c2w4.setDuration(AnonymousClass029.A0g(((AbstractC48202Eh) c2w4).A0J, i));
        } else {
            C2YR c2yr = ((C80983oA) this).A00;
            c2yr.A00.setDuration(AnonymousClass029.A0g(c2yr.A03, i));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this instanceof C38I) {
            C2W4 c2w4 = ((C38I) this).A00;
            C09560eJ.A02(c2w4.getFMessage(), c2w4.A06.A03.getProgress());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this instanceof C38I) {
            C2W4 c2w4 = ((C38I) this).A00;
            C09560eJ.A02(c2w4.getFMessage(), c2w4.A06.A03.getProgress());
        }
    }
}
