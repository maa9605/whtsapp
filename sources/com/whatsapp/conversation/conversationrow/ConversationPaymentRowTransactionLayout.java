package com.whatsapp.conversation.conversationrow;

import X.AbstractC658138q;
import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class ConversationPaymentRowTransactionLayout extends AbstractC658138q {
    public ViewGroup A00;

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        TextView textView = (TextView) getChildAt(0);
        TextView textView2 = (TextView) getChildAt(1);
        if (textView2.getVisibility() == 0) {
            textView = textView2;
        } else if (textView.getVisibility() != 0) {
            textView = null;
        }
        super.onMeasure(i, i2);
        if (textView == null || this.A00 == null) {
            return;
        }
        boolean z = textView.getLayout() == null;
        int size = View.MeasureSpec.getSize(i);
        Layout layout = textView.getLayout();
        if (layout == null) {
            Log.e("ConversationRowTransactionPill/onMeasure/error getting textView layout");
        } else if (layout.getLineCount() > 1) {
            int desiredWidth = (int) Layout.getDesiredWidth(textView.getText().subSequence(layout.getLineStart(layout.getLineCount() - 1), layout.getLineEnd(layout.getLineCount() - 1)), textView.getPaint());
            int measuredWidth = textView.getMeasuredWidth();
            if (!z && textView.getText() != null && TextUtils.indexOf(textView.getText(), '\n') >= 0) {
                measuredWidth = Math.min(measuredWidth, textView.getPaddingLeft() + textView.getPaddingRight() + ((int) Math.ceil(Layout.getDesiredWidth(textView.getText(), textView.getPaint()))));
            }
            if ((size - getPaddingLeft()) - getPaddingRight() >= this.A00.getMeasuredWidth() + measuredWidth) {
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + this.A00.getMeasuredWidth() + measuredWidth, getMeasuredHeight());
            } else if ((measuredWidth - textView.getPaddingLeft()) - textView.getPaddingRight() < this.A00.getMeasuredWidth() + desiredWidth) {
                setMeasuredDimension(getMeasuredWidth(), this.A00.getMeasuredHeight() + getMeasuredHeight());
            }
        } else {
            if ((size - getPaddingLeft()) - getPaddingRight() >= this.A00.getMeasuredWidth() + textView.getMeasuredWidth()) {
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.A00.getMeasuredWidth() + textView.getMeasuredWidth();
                if (paddingRight > getMeasuredWidth()) {
                    setMeasuredDimension(paddingRight, getMeasuredHeight());
                    return;
                }
                return;
            }
            setMeasuredDimension(getMeasuredWidth(), this.A00.getMeasuredHeight() + getMeasuredHeight());
        }
    }

    public void setDateWrapper(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
