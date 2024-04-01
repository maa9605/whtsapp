package com.whatsapp.mediacomposer.bottombar;

import X.AbstractC67733Gq;
import X.C0AT;
import X.C67723Gp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* loaded from: classes2.dex */
public class BottomBarView extends AbstractC67733Gq {
    public C67723Gp A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final ImageView A07;
    public final TextView A08;
    public final RecyclerView A09;
    public final TextEmojiLabel A0A;
    public final TextEmojiLabel A0B;
    public final WaImageView A0C;
    public final WaImageView A0D;

    public BottomBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RelativeLayout.inflate(context, getLayout(), this);
        RecyclerView recyclerView = (RecyclerView) C0AT.A0D(this, R.id.thumbnails);
        this.A09 = recyclerView;
        recyclerView.setItemAnimator(null);
        this.A09.A0i = true;
        this.A0A = (TextEmojiLabel) C0AT.A0D(this, R.id.caption);
        this.A07 = (ImageView) C0AT.A0D(this, R.id.send);
        this.A05 = (ViewGroup) C0AT.A0D(this, R.id.caption_layout);
        this.A03 = C0AT.A0D(this, R.id.status_media_privacy);
        this.A0B = (TextEmojiLabel) C0AT.A0D(this, R.id.privacy_text);
        this.A06 = (ImageView) C0AT.A0D(this, R.id.privacy_prompt_icon);
        this.A0C = (WaImageView) C0AT.A0D(this, R.id.add_btn);
        this.A0D = (WaImageView) C0AT.A0D(this, R.id.view_once_toggle);
        this.A02 = C0AT.A0D(this, R.id.filter_swipe);
        this.A08 = (TextView) C0AT.A0D(this, R.id.filter_swipe_text);
        this.A04 = findViewById(R.id.view_once_toggle_spacer);
        this.A01 = findViewById(R.id.add_btn_spacer);
    }

    public WaImageView getAddButton() {
        return this.A0C;
    }

    public View getAddButtonSeparator() {
        throw new UnsupportedOperationException("addButtonSeparator does not exist in V2");
    }

    public View getAddButtonSpacer() {
        View view = this.A01;
        if (view != null) {
            return view;
        }
        throw null;
    }

    public View getCaptionAndPrivacyLayout() {
        return this.A05;
    }

    public ViewGroup getCaptionLayout() {
        return this.A05;
    }

    public TextEmojiLabel getCaptionTextView() {
        return this.A0A;
    }

    public TextView getFilterSwipeTextView() {
        return this.A08;
    }

    public View getFilterSwipeView() {
        return this.A02;
    }

    public int getLayout() {
        return R.layout.media_composer_bottom_bar;
    }

    public View getPrivacyDivider() {
        throw new UnsupportedOperationException("privacyDivider does not exist in V2");
    }

    public View getPrivacyLayout() {
        return this.A03;
    }

    public ImageView getPrivacyPromptIcon() {
        return this.A06;
    }

    public TextEmojiLabel getPrivacyTextView() {
        return this.A0B;
    }

    public ImageView getSendButton() {
        return this.A07;
    }

    public RecyclerView getThumbnailsView() {
        return this.A09;
    }

    public WaImageView getViewOnceButton() {
        return this.A0D;
    }

    public View getViewOnceButtonSpacer() {
        View view = this.A04;
        if (view != null) {
            return view;
        }
        throw null;
    }
}
