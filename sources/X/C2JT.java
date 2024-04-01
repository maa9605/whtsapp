package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import com.whatsapp.picker.search.StickerSearchDialogFragment;

/* renamed from: X.2JT */
/* loaded from: classes2.dex */
public class C2JT implements TextWatcher {
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        if (this instanceof C83373s1) {
            ((C83373s1) this).A00.setEnabled(charSequence.length() > 0);
        } else if (this instanceof C78853kd) {
            C78853kd c78853kd = (C78853kd) this;
            StickerSearchDialogFragment stickerSearchDialogFragment = c78853kd.A01;
            Runnable runnable = stickerSearchDialogFragment.A0D;
            if (runnable != null) {
                stickerSearchDialogFragment.A05.removeCallbacks(runnable);
            }
            View view = c78853kd.A00;
            RunnableEBaseShape2S0300000_I1 runnableEBaseShape2S0300000_I1 = new RunnableEBaseShape2S0300000_I1(view, c78853kd, charSequence, 6);
            stickerSearchDialogFragment.A0D = runnableEBaseShape2S0300000_I1;
            stickerSearchDialogFragment.A05.postDelayed(runnableEBaseShape2S0300000_I1, 500L);
            view.setVisibility(0);
        } else if (this instanceof C78823ka) {
            C78823ka c78823ka = (C78823ka) this;
            Runnable runnable2 = c78823ka.A00;
            if (runnable2 != null) {
                c78823ka.A02.A05.removeCallbacks(runnable2);
            }
            RunnableEBaseShape6S0200000_I1 runnableEBaseShape6S0200000_I1 = new RunnableEBaseShape6S0200000_I1(c78823ka, charSequence, 8);
            c78823ka.A00 = runnableEBaseShape6S0200000_I1;
            c78823ka.A02.A05.postDelayed(runnableEBaseShape6S0200000_I1, 500L);
            c78823ka.A01.setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
        } else if (this instanceof C2JS) {
            C2JS c2js = (C2JS) this;
            Runnable runnable3 = c2js.A00;
            if (runnable3 != null) {
                c2js.A01.A0R.removeCallbacks(runnable3);
            }
            RunnableEBaseShape3S0200000_I0_3 runnableEBaseShape3S0200000_I0_3 = new RunnableEBaseShape3S0200000_I0_3(c2js, charSequence, 5);
            c2js.A00 = runnableEBaseShape3S0200000_I0_3;
            c2js.A01.A0R.postDelayed(runnableEBaseShape3S0200000_I0_3, 500L);
        } else if (this instanceof C3D2) {
            ((C3D2) this).A00.setEnabled(charSequence.length() > 0);
        } else if (this instanceof C49272Jj) {
            C49272Jj c49272Jj = (C49272Jj) this;
            Runnable runnable4 = c49272Jj.A00;
            if (runnable4 != null) {
                c49272Jj.A02.A05.removeCallbacks(runnable4);
            }
            RunnableEBaseShape2S0200000_I0_2 runnableEBaseShape2S0200000_I0_2 = new RunnableEBaseShape2S0200000_I0_2(c49272Jj, charSequence, 15);
            c49272Jj.A00 = runnableEBaseShape2S0200000_I0_2;
            c49272Jj.A02.A05.postDelayed(runnableEBaseShape2S0200000_I0_2, 500L);
            c49272Jj.A01.setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
        } else if (!(this instanceof C49342Jr)) {
            if (this instanceof AnonymousClass377) {
                AnonymousClass377 anonymousClass377 = (AnonymousClass377) this;
                boolean z = false;
                if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
                    z = true;
                }
                anonymousClass377.A00 = z;
            }
        } else {
            C49342Jr c49342Jr = (C49342Jr) this;
            Runnable runnable5 = c49342Jr.A00;
            if (runnable5 != null) {
                c49342Jr.A02.A04.removeCallbacks(runnable5);
            }
            RunnableEBaseShape2S0200000_I0_2 runnableEBaseShape2S0200000_I0_22 = new RunnableEBaseShape2S0200000_I0_2(c49342Jr, charSequence, 6);
            c49342Jr.A00 = runnableEBaseShape2S0200000_I0_22;
            c49342Jr.A02.A04.postDelayed(runnableEBaseShape2S0200000_I0_22, 500L);
            c49342Jr.A01.setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
        }
    }
}
