package com.whatsapp.settings.chat.wallpaper;

import X.AbstractActivityC50042Pi;
import X.AbstractC005302j;
import X.AbstractC40441sG;
import X.AnonymousClass029;
import X.C003301p;
import X.C018708s;
import X.C02180Ae;
import X.C03410Fp;
import X.C05W;
import X.C06C;
import X.C0AT;
import X.C0L5;
import X.C0L7;
import X.C0U1;
import X.C0VJ;
import X.C42571vx;
import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;

/* loaded from: classes2.dex */
public class WallpaperCurrentPreviewActivity extends AbstractActivityC50042Pi {
    public View A00;
    public SeekBar A01;
    public C0U1 A02;
    public C0L7 A03;
    public C05W A04;
    public C018708s A05;
    public C0L5 A06;
    public AbstractC40441sG A07;
    public C42571vx A08;
    public WallpaperImagePreview A09;

    public static Intent A00(Activity activity, AbstractC005302j abstractC005302j) {
        Intent intent = new Intent(activity, WallpaperCurrentPreviewActivity.class);
        intent.putExtra("chat_jid", abstractC005302j);
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x000d, code lost:
        if (r0 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(android.app.Activity r2, android.content.Intent r3, X.C42571vx r4) {
        /*
            X.02j r0 = X.C03410Fp.A05(r3)
            if (r0 == 0) goto L16
            if (r4 == 0) goto Lf
            boolean r0 = r4.A03
            r1 = 2131890755(0x7f121243, float:1.941621E38)
            if (r0 == 0) goto L12
        Lf:
            r1 = 2131890753(0x7f121241, float:1.9416207E38)
        L12:
            r2.setTitle(r1)
            return
        L16:
            boolean r0 = X.AnonymousClass029.A1K(r2)
            r1 = 2131890767(0x7f12124f, float:1.9416235E38)
            if (r0 == 0) goto L12
            r1 = 2131890756(0x7f121244, float:1.9416213E38)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity.A01(android.app.Activity, android.content.Intent, X.1vx):void");
    }

    public static void A02(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (layoutParams.width * f);
        layoutParams.height = (int) (layoutParams.height * f);
        view.setLayoutParams(layoutParams);
    }

    public final void A1G(AbstractC005302j abstractC005302j) {
        this.A08 = this.A07.A04(abstractC005302j, this);
        A01(this, getIntent(), this.A08);
        Drawable A0A = this.A07.A0A(this.A08);
        if (A0A != null) {
            this.A09.setImageDrawable(A0A);
        }
        if (this.A01.getVisibility() == 0) {
            C42571vx c42571vx = this.A08;
            if (c42571vx == null) {
                this.A01.setProgress(0);
                return;
            }
            Integer num = c42571vx.A01;
            this.A01.setProgress(num != null ? num.intValue() : 0);
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 199 && i2 == -1) {
            A1G(C03410Fp.A05(getIntent()));
        }
    }

    @Override // X.AbstractActivityC50042Pi, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wallpaper_current_preview);
        A0k((Toolbar) C0VJ.A0A(this, R.id.wallpaper_preview_toolbar));
        C0U1 A0c = A0c();
        if (A0c != null) {
            this.A02 = A0c;
            A0c.A0L(true);
            A01(this, getIntent(), this.A08);
            C0VJ.A0A(this, R.id.change_current_wallpaper).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 34));
            this.A00 = C0VJ.A0A(this, R.id.wallpaper_dimmer_container);
            C003301p.A06((TextView) C0VJ.A0A(this, R.id.wallpaper_dimmer_title));
            this.A01 = (SeekBar) C0VJ.A0A(this, R.id.wallpaper_dimmer_seekbar);
            Point A00 = AbstractC40441sG.A00(this);
            View A0A = C0VJ.A0A(this, R.id.wallpaper_dimmer_container);
            A0A.measure(View.MeasureSpec.makeMeasureSpec(A00.x, 1073741824), View.MeasureSpec.makeMeasureSpec(A00.y, 0));
            View A0A2 = C0VJ.A0A(this, R.id.change_current_wallpaper);
            A0A2.measure(View.MeasureSpec.makeMeasureSpec(A00.x, 1073741824), View.MeasureSpec.makeMeasureSpec(A00.y, 0));
            TextView textView = (TextView) C0VJ.A0A(this, R.id.wallpaper_current_preview_theme_description);
            if (AnonymousClass029.A1K(this)) {
                textView.setText(R.string.wallpaper_preview_light_theme_description);
            } else {
                textView.setText(R.string.wallpaper_preview_dark_theme_description);
            }
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new TypedValue().data, new int[]{16843499});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
            float min = Math.min(0.56f, (((A00.y - A0A.getMeasuredHeight()) - A0A2.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.wallpaper_preview_top_padding)) / (A00.y + dimensionPixelSize));
            Point A002 = AbstractC40441sG.A00(this);
            int i = (int) (A002.x * min);
            int i2 = (int) (A002.y * min);
            ViewGroup.LayoutParams layoutParams = C0VJ.A0A(this, R.id.wallpaper_preview_toolbar_container).getLayoutParams();
            int i3 = (int) (layoutParams.height * min);
            View A0A3 = C0VJ.A0A(this, R.id.wallpaper_preview_toolbar_container);
            ViewGroup.LayoutParams layoutParams2 = A0A3.getLayoutParams();
            layoutParams2.height = i3;
            layoutParams2.width = i;
            A0A3.setLayoutParams(layoutParams2);
            View A0A4 = C0VJ.A0A(this, R.id.current_wallpaper_preview_view_container);
            ViewGroup.LayoutParams layoutParams3 = A0A4.getLayoutParams();
            layoutParams3.height = i2;
            layoutParams3.width = i;
            A0A4.setLayoutParams(layoutParams3);
            int i4 = i2 + layoutParams.height;
            View A0A5 = C0VJ.A0A(this, R.id.wallpaper_preview_outline_container);
            ViewGroup.LayoutParams layoutParams4 = A0A5.getLayoutParams();
            layoutParams4.height = i4;
            layoutParams4.width = i;
            A0A5.setLayoutParams(layoutParams4);
            View A0A6 = C0VJ.A0A(this, R.id.change_current_wallpaper);
            ViewGroup.LayoutParams layoutParams5 = A0A6.getLayoutParams();
            layoutParams5.width = i;
            A0A6.setLayoutParams(layoutParams5);
            ViewOnClickCListenerShape10S0100000_I0_2 viewOnClickCListenerShape10S0100000_I0_2 = new ViewOnClickCListenerShape10S0100000_I0_2(this, 35);
            A0A6.setOnClickListener(viewOnClickCListenerShape10S0100000_I0_2);
            C0VJ.A0A(this, R.id.current_wallpaper_preview_view_container).setOnClickListener(viewOnClickCListenerShape10S0100000_I0_2);
            ViewGroup viewGroup = (ViewGroup) C0VJ.A0A(this, R.id.text_entry_layout);
            viewGroup.setFocusable(false);
            viewGroup.setDescendantFocusability(393216);
            AbstractC005302j A05 = C03410Fp.A05(getIntent());
            this.A09 = (WallpaperImagePreview) C0VJ.A0A(this, R.id.current_wallpaper_preview_view);
            if (A05 != null) {
                textView.setVisibility(4);
            } else {
                textView.setVisibility(0);
            }
            A1G(A05);
            ImageView imageView = (ImageView) C0VJ.A0A(this, R.id.conversation_contact_photo);
            A02(imageView, min);
            A02(C0VJ.A0A(this, R.id.send_container), min);
            A02(C0VJ.A0A(this, R.id.voice_note_btn), min);
            A02(C0VJ.A0A(this, R.id.emoji_picker_btn), min);
            A02(C0VJ.A0A(this, R.id.input_attach_button), min);
            A02(C0VJ.A0A(this, R.id.camera_btn), min);
            View A0A7 = C0VJ.A0A(this, R.id.input_layout_content);
            ViewGroup.LayoutParams layoutParams6 = A0A7.getLayoutParams();
            layoutParams6.height = (int) (layoutParams6.height * min);
            A0A7.setLayoutParams(layoutParams6);
            WallpaperMockChatView wallpaperMockChatView = (WallpaperMockChatView) C0VJ.A0A(this, R.id.wallpaper_preview_default_chat_view);
            wallpaperMockChatView.setMessages(getString(R.string.library_preview_chat_content_swipe_left), getString(R.string.library_preview_chat_content_swipe_right));
            wallpaperMockChatView.A00.setVisibility(4);
            wallpaperMockChatView.A03.setVisibility(4);
            wallpaperMockChatView.A03.setMinLines(1);
            wallpaperMockChatView.A03.setMaxLines(1);
            wallpaperMockChatView.A02.setMinEms(5);
            wallpaperMockChatView.A02.setText("");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wallpaperMockChatView.A02.getLayoutParams();
            marginLayoutParams.bottomMargin = wallpaperMockChatView.A04.getPaddingTop() + wallpaperMockChatView.A03.getPaddingBottom();
            wallpaperMockChatView.A02.setLayoutParams(marginLayoutParams);
            wallpaperMockChatView.A01.setVisibility(4);
            wallpaperMockChatView.A04.setVisibility(4);
            wallpaperMockChatView.A04.setMinLines(1);
            wallpaperMockChatView.A04.setMaxLines(1);
            TextView textView2 = wallpaperMockChatView.A03;
            textView2.setTextSize(0, (int) (textView2.getTextSize() * min));
            TextView textView3 = wallpaperMockChatView.A02;
            textView3.setTextSize(0, (int) (textView3.getTextSize() * min));
            TextView textView4 = wallpaperMockChatView.A04;
            textView4.setTextSize(0, (int) (textView4.getTextSize() * min));
            TextView textView5 = (TextView) C0VJ.A0A(this, R.id.conversation_contact_name);
            textView5.setTextSize(0, (int) (textView5.getTextSize() * min));
            if (A05 == null) {
                textView5.setText(R.string.wallpaper_generic_contact_name);
                this.A03.A05(imageView, R.drawable.avatar_contact);
            } else {
                C06C A0A8 = this.A04.A0A(A05);
                this.A06.A03((int) (imageView.getResources().getDimensionPixelSize(R.dimen.small_avatar_size) * min), -1.0f).A02(A0A8, imageView);
                textView5.setText(this.A05.A08(A0A8, false));
            }
            if (!AnonymousClass029.A1K(this)) {
                this.A00.setVisibility(8);
            } else {
                this.A00.setVisibility(0);
                this.A01.setThumb(new LayerDrawable(new Drawable[]{C02180Ae.A0N(this, R.drawable.wallpaper_dimmer_seekbar_button_background), C02180Ae.A0O(this, R.drawable.ic_dim, R.color.wallpaper_dimmer_seekbar)}));
                this.A01.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.3WV
                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    {
                        WallpaperCurrentPreviewActivity.this = this;
                    }

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onProgressChanged(SeekBar seekBar, int i5, boolean z) {
                        WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity;
                        C42571vx c42571vx;
                        Drawable drawable;
                        if (seekBar == null || !z || (c42571vx = (wallpaperCurrentPreviewActivity = WallpaperCurrentPreviewActivity.this).A08) == null || (drawable = c42571vx.A00) == null) {
                            return;
                        }
                        C03410Fp.A06(wallpaperCurrentPreviewActivity, drawable, seekBar.getProgress());
                        wallpaperCurrentPreviewActivity.A09.setImageDrawable(drawable);
                    }

                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if (seekBar == null) {
                            return;
                        }
                        int progress = seekBar.getProgress();
                        WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity = WallpaperCurrentPreviewActivity.this;
                        AbstractC005302j A052 = C03410Fp.A05(wallpaperCurrentPreviewActivity.getIntent());
                        AbstractC40441sG abstractC40441sG = wallpaperCurrentPreviewActivity.A07;
                        if (abstractC40441sG instanceof C42501vq) {
                            C42501vq c42501vq = (C42501vq) abstractC40441sG;
                            Object obj = c42501vq.A0B(A052, wallpaperCurrentPreviewActivity).A00;
                            if (obj != null) {
                                C03380Fm c03380Fm = (C03380Fm) obj;
                                c42501vq.A0G(A052, new C03380Fm(c03380Fm.A01, c03380Fm.A02, Integer.valueOf(progress)), wallpaperCurrentPreviewActivity);
                                return;
                            }
                            throw null;
                        }
                    }
                });
            }
            C0AT.A0V(C0VJ.A0A(this, R.id.conversation_contact_name), 2);
            C0AT.A0V(C0VJ.A0A(this, R.id.emoji_picker_btn), 2);
            C0AT.A0V(C0VJ.A0A(this, R.id.entry), 2);
            C0AT.A0V(C0VJ.A0A(this, R.id.input_attach_button), 2);
            C0AT.A0V(C0VJ.A0A(this, R.id.camera_btn), 2);
            C0AT.A0V(C0VJ.A0A(this, R.id.voice_note_btn), 2);
            C0AT.A0V(((WallpaperMockChatView) C0VJ.A0A(this, R.id.wallpaper_preview_default_chat_view)).A07, 2);
            return;
        }
        throw null;
    }
}
