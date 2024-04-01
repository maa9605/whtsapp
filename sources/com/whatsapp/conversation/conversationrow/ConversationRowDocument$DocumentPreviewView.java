package com.whatsapp.conversation.conversationrow;

import X.AbstractC68323Jb;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class ConversationRowDocument$DocumentPreviewView extends AbstractC68323Jb {
    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        if (getDrawable() != null) {
            Matrix imageMatrix = getImageMatrix();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            float f = intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth ? measuredHeight / intrinsicHeight : measuredWidth / intrinsicWidth;
            float f2 = measuredHeight;
            imageMatrix.setRectToRect(new RectF(0.0f, 0.0f, intrinsicWidth, f2 / f), new RectF(0.0f, 0.0f, measuredWidth, f2), Matrix.ScaleToFit.FILL);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }
}
