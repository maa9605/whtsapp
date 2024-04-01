package com.whatsapp.conversation.conversationrow;

import X.AbstractC658238r;
import X.C02160Ac;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ConversationRowAudioPreview extends AbstractC658238r {
    public ImageView A00;
    public TextView A01;
    public WaveformVisualizerView A02;

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.conversation_row_audio_preview, this);
        ((ImageView) findViewById(R.id.picture)).setImageDrawable(C02160Ac.A03(context, R.drawable.audio_message_thumb));
        this.A02 = (WaveformVisualizerView) findViewById(R.id.visualizer);
        this.A00 = (ImageView) findViewById(R.id.icon);
        this.A01 = (TextView) findViewById(R.id.duration);
    }

    public void A00() {
        this.A02.setVisibility(8);
        this.A00.setVisibility(0);
    }

    public void A01() {
        this.A02.setVisibility(0);
        this.A00.setVisibility(8);
    }

    public void setDuration(String str) {
        this.A01.setText(str);
    }
}
