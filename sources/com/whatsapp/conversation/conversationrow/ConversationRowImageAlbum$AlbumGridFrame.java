package com.whatsapp.conversation.conversationrow;

import X.AbstractC658338s;
import X.C2JE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ConversationRowImageAlbum$AlbumGridFrame extends AbstractC658338s {
    public int A00;

    public ConversationRowImageAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.conversation_video_thumb_padding);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int A01 = isInEditMode() ? 800 : (C2JE.A01(getContext()) * 72) / 100;
        if (mode != 0) {
            A01 = Math.min(A01, View.MeasureSpec.getSize(i));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((A01 - this.A00) >> 1, 1073741824);
        int i3 = 0;
        do {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec);
            i3++;
        } while (i3 < 4);
        setMeasuredDimension(A01, A01);
    }
}
