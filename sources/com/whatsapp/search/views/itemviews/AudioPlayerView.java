package com.whatsapp.search.views.itemviews;

import X.AbstractC51822Yg;
import X.AnonymousClass029;
import X.C000200d;
import X.C002301c;
import X.C02160Ac;
import X.C08540bf;
import X.C0AT;
import X.C0LX;
import X.C0We;
import X.C71303Vp;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

/* loaded from: classes2.dex */
public class AudioPlayerView extends AbstractC51822Yg {
    public ImageButton A00;
    public CircularProgressBar A01;
    public C002301c A02;
    public VoiceNoteSeekBar A03;

    public AudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.inflate(context, R.layout.message_audio_player, this);
        setOrientation(0);
        setGravity(17);
        this.A00 = (ImageButton) C0AT.A0D(this, R.id.control_btn);
        this.A03 = (VoiceNoteSeekBar) C0AT.A0D(this, R.id.audio_seekbar);
        CircularProgressBar circularProgressBar = (CircularProgressBar) C0AT.A0D(this, R.id.progress_bar_1);
        this.A01 = circularProgressBar;
        circularProgressBar.setMax(100);
        this.A01.A0C = C02160Ac.A00(context, R.color.media_message_progress_determinate);
        this.A01.A0B = 536870912;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A0L);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            View findViewById = findViewById(R.id.controls);
            if (findViewById != null) {
                C0LX.A08(this.A02, findViewById, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), dimensionPixelSize3, findViewById.getPaddingBottom());
                View findViewById2 = findViewById(R.id.audio_seekbar);
                if (findViewById2 != null) {
                    findViewById2.setPadding(findViewById2.getPaddingLeft(), dimensionPixelSize2, findViewById2.getPaddingRight(), dimensionPixelSize);
                    if (dimensionPixelSize4 > 0) {
                        C0LX.A05(this.A02, findViewById2, dimensionPixelSize4, ((ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams()).rightMargin);
                    }
                    View findViewById3 = findViewById(R.id.control_button_container);
                    if (findViewById3 == null) {
                        throw null;
                    }
                    if (dimensionPixelSize5 > 0) {
                        ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                        layoutParams.height = dimensionPixelSize5;
                        layoutParams.width = dimensionPixelSize5;
                        findViewById3.setLayoutParams(layoutParams);
                    }
                    if (dimensionPixelSize6 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
                        C0LX.A05(this.A02, findViewById3, dimensionPixelSize6, marginLayoutParams.rightMargin);
                        findViewById3.setLayoutParams(marginLayoutParams);
                    }
                    if (dimensionPixelSize7 > 0) {
                        ViewGroup.LayoutParams layoutParams2 = this.A01.getLayoutParams();
                        layoutParams2.height = dimensionPixelSize7;
                        layoutParams2.width = dimensionPixelSize7;
                        this.A01.setLayoutParams(layoutParams2);
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    public ProgressBar getProgressBar() {
        return this.A01;
    }

    public int getSeekbarProgress() {
        return this.A03.getProgress();
    }

    public void setOnControlButtonClickListener(View.OnClickListener onClickListener) {
        this.A00.setOnClickListener(onClickListener);
    }

    public void setOnControlButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A00.setOnLongClickListener(onLongClickListener);
    }

    public void setPlayButtonState(int i) {
        if (i == 0) {
            this.A00.setImageDrawable(new C0We(this.A02, C02160Ac.A03(getContext(), R.drawable.inline_audio_play)));
            this.A00.setContentDescription(getContext().getString(R.string.play));
        } else if (i == 1) {
            this.A00.setImageResource(R.drawable.inline_audio_pause);
            this.A00.setContentDescription(getContext().getString(R.string.pause));
        } else if (i == 2) {
            this.A00.setImageResource(R.drawable.inline_audio_upload);
            this.A00.setContentDescription(getContext().getString(R.string.button_upload));
        } else if (i == 3) {
            this.A00.setImageResource(R.drawable.inline_audio_download);
            this.A00.setContentDescription(getContext().getString(R.string.button_download));
        } else if (i == 4) {
            this.A00.setImageResource(R.drawable.inline_audio_cancel);
            this.A00.setContentDescription(getContext().getString(R.string.cancel));
        } else {
            throw new IllegalStateException(C000200d.A0D("setPlayButtonState: Did not handle playstate: ", i));
        }
    }

    public void setPlaybackListener(C71303Vp c71303Vp) {
        this.A03.setOnSeekBarChangeListener(c71303Vp);
    }

    public void setSeekbarColor(int i) {
        this.A03.setProgressColor(i);
    }

    public void setSeekbarContentDescription(long j) {
        this.A03.setContentDescription(getContext().getString(R.string.voice_message_time_elapsed, AnonymousClass029.A0i(this.A02, j)));
    }

    public void setSeekbarLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A03.setOnLongClickListener(onLongClickListener);
    }

    public void setSeekbarMax(int i) {
        this.A03.setMax(i);
    }

    public void setSeekbarProgress(int i) {
        this.A03.setProgress(i);
    }
}
