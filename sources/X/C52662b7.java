package X;

import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2b7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52662b7 extends C2JT {
    public int A00;
    public Runnable A01;
    public final int A02;
    public final int A03;
    public final EditText A04;
    public final TextView A05;
    public final C02E A06;
    public final C002301c A07;
    public final C40081rY A08;
    public final C02O A09;
    public final boolean A0A;

    public C52662b7(C40081rY c40081rY, C02E c02e, C002301c c002301c, C02O c02o, EditText editText, TextView textView, int i, int i2, boolean z) {
        this.A08 = c40081rY;
        this.A06 = c02e;
        this.A07 = c002301c;
        this.A09 = c02o;
        this.A04 = editText;
        this.A05 = textView;
        this.A02 = i;
        this.A03 = i2;
        this.A0A = z;
        C0AT.A0c(editText, new C0AS() { // from class: X.3s5
            @Override // X.C0AS
            public void A02(View view, AccessibilityEvent accessibilityEvent) {
                C52662b7 c52662b7;
                Runnable runnable;
                this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() != 65536 || (runnable = (c52662b7 = C52662b7.this).A01) == null) {
                    return;
                }
                c52662b7.A05.removeCallbacks(runnable);
            }
        });
        if (textView != null) {
            long j = i;
            textView.setContentDescription(c002301c.A0A(R.plurals.text_limit_characters_remaining_description, j, Integer.valueOf(i)));
            if (i == 0 || i2 != 0) {
                return;
            }
            textView.setText(c002301c.A0G().format(j));
        }
    }

    public final void A00(int i) {
        TextView textView = this.A05;
        RunnableEBaseShape0S0101000_I0 runnableEBaseShape0S0101000_I0 = new RunnableEBaseShape0S0101000_I0(this, i, 11);
        this.A01 = runnableEBaseShape0S0101000_I0;
        textView.postDelayed(runnableEBaseShape0S0101000_I0, 1000L);
        textView.setVisibility(0);
        C002301c c002301c = this.A07;
        long j = i;
        textView.setText(c002301c.A0G().format(j));
        textView.setContentDescription(c002301c.A0A(R.plurals.text_limit_characters_remaining_description, j, Integer.valueOf(i)));
    }

    @Override // X.C2JT, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        EditText editText;
        if (this.A0A) {
            editText = this.A04;
            AnonymousClass029.A17(editText.getContext(), this.A08, this.A06, this.A09, editable, editText.getPaint());
        } else {
            editText = this.A04;
            C002701i.A1D(editable, editText.getContext(), editText.getPaint(), 1.3f, this.A08);
        }
        int i = this.A02;
        if (i > 0) {
            Runnable runnable = this.A01;
            if (runnable != null) {
                this.A05.removeCallbacks(runnable);
            }
            String obj = editable.toString();
            int A01 = C43981yK.A01(obj);
            TextView textView = this.A05;
            if (textView != null) {
                int i2 = i - A01;
                int i3 = this.A03;
                if (i3 > 0) {
                    if (i2 < i3) {
                        A00(i2);
                    } else {
                        textView.setVisibility(8);
                    }
                } else if (i2 == i) {
                    textView.setVisibility(4);
                } else {
                    A00(i2);
                }
            }
            if (A01 >= i && this.A00 == 0) {
                int inputType = editText.getInputType();
                this.A00 = inputType;
                if (inputType != 0) {
                    editText.setInputType(inputType | 524288);
                    editText.setText(obj);
                    editText.setSelection(obj.length());
                    return;
                }
                return;
            }
            int i4 = this.A00;
            if (i4 == 0) {
                return;
            }
            editText.setInputType(i4);
            this.A00 = 0;
        }
    }
}
