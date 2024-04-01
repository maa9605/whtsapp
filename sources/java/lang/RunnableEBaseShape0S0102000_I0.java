package java.lang;

import X.AbstractC02750Cs;
import X.AnonymousClass024;
import X.C3ZE;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.status.playback.widget.StatusEditText;
import com.whatsapp.text.ReadMoreTextView;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0102000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03 = 0;

    public RunnableEBaseShape0S0102000_I0(StatusEditText statusEditText, int i, int i2) {
        this.A02 = statusEditText;
        this.A00 = i;
        this.A01 = i2;
    }

    public RunnableEBaseShape0S0102000_I0(ReadMoreTextView readMoreTextView) {
        this.A02 = readMoreTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A03) {
            case 0:
                EditText editText = (EditText) this.A02;
                int i = this.A00;
                int i2 = this.A01;
                int length = editText.getText() != null ? editText.getText().length() : 0;
                if (i > length || i2 > length) {
                    return;
                }
                editText.setSelection(i, i2);
                return;
            case 1:
                ReadMoreTextView readMoreTextView = (ReadMoreTextView) this.A02;
                if (readMoreTextView.A00 == 0 || readMoreTextView.A06) {
                    return;
                }
                int width = (readMoreTextView.getWidth() - readMoreTextView.getPaddingLeft()) - readMoreTextView.getPaddingRight();
                int height = (readMoreTextView.getHeight() - readMoreTextView.getPaddingTop()) - readMoreTextView.getPaddingBottom();
                if ((this.A01 == width && this.A00 == height) || readMoreTextView.getLayout() == null) {
                    return;
                }
                this.A01 = width;
                this.A00 = height;
                CharSequence charSequence = readMoreTextView.A05;
                C3ZE c3ze = ReadMoreTextView.A0C;
                Layout A6r = c3ze.A6r(AnonymousClass024.A09(charSequence), readMoreTextView, width);
                boolean z = A6r.getLineCount() > readMoreTextView.A00;
                readMoreTextView.A07 = z;
                if (z) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(readMoreTextView.A04);
                    spannableStringBuilder.setSpan(new AbstractC02750Cs(readMoreTextView.getContext(), readMoreTextView.A01) { // from class: X.3xn
                        {
                            RunnableEBaseShape0S0102000_I0.this = this;
                        }

                        @Override // X.InterfaceC02760Ct
                        public void onClick(View view) {
                            RunnableEBaseShape0S0102000_I0 runnableEBaseShape0S0102000_I0 = RunnableEBaseShape0S0102000_I0.this;
                            ReadMoreTextView readMoreTextView2 = (ReadMoreTextView) runnableEBaseShape0S0102000_I0.A02;
                            C3ZD c3zd = readMoreTextView2.A03;
                            if (c3zd == null || !c3zd.AIV()) {
                                readMoreTextView2.A06 = true;
                                runnableEBaseShape0S0102000_I0.A01 = 0;
                                runnableEBaseShape0S0102000_I0.A00 = 0;
                                readMoreTextView2.setText(readMoreTextView2.A05);
                                readMoreTextView2.setMaxLines(Integer.MAX_VALUE);
                                readMoreTextView2.A0A.removeCallbacks(readMoreTextView2.A0B);
                            }
                        }
                    }, 0, spannableStringBuilder.length(), 18);
                    if (readMoreTextView.A08) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 18);
                    }
                    int lineCount = A6r.getLineCount();
                    SpannableStringBuilder spannableStringBuilder2 = null;
                    for (int lineEnd = A6r.getLineEnd(readMoreTextView.A00 - 1); lineEnd > 0 && lineCount > readMoreTextView.A00; lineEnd--) {
                        spannableStringBuilder2 = new SpannableStringBuilder(readMoreTextView.A05.subSequence(0, lineEnd));
                        spannableStringBuilder2.append((CharSequence) "... ").append((CharSequence) spannableStringBuilder);
                        lineCount = c3ze.A6r(AnonymousClass024.A09(spannableStringBuilder2), readMoreTextView, width).getLineCount();
                    }
                    if (TextUtils.equals(readMoreTextView.getText(), spannableStringBuilder2)) {
                        return;
                    }
                    ReadMoreTextView.setVisibleText(readMoreTextView, spannableStringBuilder2);
                    return;
                } else if (TextUtils.equals(readMoreTextView.getText(), readMoreTextView.A05)) {
                    return;
                } else {
                    ReadMoreTextView.setVisibleText(readMoreTextView, readMoreTextView.A05);
                    return;
                }
            default:
                return;
        }
    }
}
