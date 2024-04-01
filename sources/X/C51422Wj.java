package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.StopLiveLocationDialogFragment;
import com.whatsapp.location.WaMapView;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;

/* renamed from: X.2Wj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51422Wj extends AbstractC51432Wk {
    public C0L7 A00;
    public C41461tx A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final ViewGroup A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final TextEmojiLabel A0H;
    public final TextEmojiLabel A0I;
    public final ThumbnailButton A0J;
    public final C0Zn A0K;
    public final WaMapView A0L;

    public C51422Wj(Context context, C0KC c0kc, C0Zn c0Zn) {
        super(context, c0kc);
        this.A0K = c0Zn;
        this.A0E = (ImageView) findViewById(R.id.thumb);
        this.A09 = findViewById(R.id.thumb_button);
        this.A0F = (TextView) findViewById(R.id.control_btn);
        this.A03 = findViewById(R.id.control_frame);
        this.A06 = findViewById(R.id.progress_bar);
        this.A0G = (TextView) findViewById(R.id.live_location_label);
        this.A04 = findViewById(R.id.live_location_label_holder);
        this.A0A = (ViewGroup) findViewById(R.id.map_frame);
        this.A0J = (ThumbnailButton) findViewById(R.id.contact_thumbnail);
        this.A02 = findViewById(R.id.contact_thumbnail_overlay);
        this.A05 = findViewById(R.id.message_info_holder);
        this.A08 = findViewById(R.id.text_and_date);
        this.A07 = findViewById(R.id.btn_divider);
        this.A0I = (TextEmojiLabel) findViewById(R.id.stop_share_btn);
        this.A0H = (TextEmojiLabel) findViewById(R.id.live_location_caption);
        this.A0B = (ImageView) findViewById(R.id.live_location_icon_1);
        this.A0C = (ImageView) findViewById(R.id.live_location_icon_2);
        this.A0D = (ImageView) findViewById(R.id.live_location_icon_3);
        this.A0L = (WaMapView) findViewById(R.id.map_holder);
        C000200d.A0b(this.A0H);
        this.A0H.setAutoLinkMask(0);
        this.A0H.setLinksClickable(false);
        this.A0H.setFocusable(false);
        this.A0H.setClickable(false);
        this.A0H.setLongClickable(false);
        A0j();
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0e(false);
        A0j();
    }

    @Override // X.AbstractC48182Ef
    public void A0W(AbstractC005302j abstractC005302j) {
        AnonymousClass092 fMessage = super.getFMessage();
        if (fMessage.A0n.A02) {
            if (((AbstractC48182Ef) this).A0I.A0A(abstractC005302j)) {
                C0Zn c0Zn = this.A0K;
                C02L c02l = ((AbstractC48182Ef) this).A0I;
                c02l.A05();
                C0K1 c0k1 = c02l.A01;
                if (c0k1 != null) {
                    c0Zn.A02(c0k1, this.A0J);
                    return;
                }
                throw null;
            }
            return;
        }
        UserJid A0B = fMessage.A0B();
        if (abstractC005302j.equals(A0B)) {
            this.A0K.A02(this.A0Z.A02(A0B), this.A0J);
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        long A06;
        ImageView imageView;
        ImageView imageView2;
        View view;
        int dimensionPixelSize;
        final C0KC c0kc = (C0KC) super.getFMessage();
        View view2 = this.A09;
        View.OnLongClickListener onLongClickListener = this.A19;
        view2.setOnLongClickListener(onLongClickListener);
        TextEmojiLabel textEmojiLabel = this.A0I;
        textEmojiLabel.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.38U
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view3) {
                AnonymousClass094 anonymousClass094 = c0kc.A0n;
                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                if (abstractC005302j != null) {
                    if (anonymousClass094.A02) {
                        String str = anonymousClass094.A01;
                        StopLiveLocationDialogFragment stopLiveLocationDialogFragment = new StopLiveLocationDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("jid", abstractC005302j.getRawString());
                        bundle.putString("id", str);
                        stopLiveLocationDialogFragment.A0P(bundle);
                        ((ActivityC02290Ap) C018308n.A00(C51422Wj.this.getContext())).AUh(stopLiveLocationDialogFragment);
                        return;
                    }
                    C51422Wj c51422Wj = C51422Wj.this;
                    C41471ty c41471ty = ((AbstractC48202Eh) c51422Wj).A0K;
                    if (c41471ty != null) {
                        Context context = c51422Wj.getContext();
                        if (abstractC005302j != null) {
                            c41471ty.A0A(context, abstractC005302j, null);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
        });
        textEmojiLabel.setOnLongClickListener(onLongClickListener);
        View view3 = this.A03;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.A08;
        if (view4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        this.A0A.setVisibility(0);
        long A05 = ((AbstractC48182Ef) this).A0X.A05();
        C41461tx c41461tx = this.A01;
        if (c41461tx != null) {
            AnonymousClass094 anonymousClass094 = c0kc.A0n;
            boolean z = anonymousClass094.A02;
            if (z) {
                A06 = c41461tx.A07(c0kc);
            } else {
                A06 = c41461tx.A06(c0kc);
            }
            boolean A0R = C23X.A0R(c0kc, A06, ((AbstractC48182Ef) this).A0X);
            View view5 = this.A05;
            if (view5 != null) {
                view5.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.media_message_thumb));
            }
            ImageView imageView3 = this.A0B;
            if (A0R) {
                imageView3.setVisibility(0);
                imageView = this.A0C;
                imageView.setVisibility(0);
                imageView2 = this.A0D;
                imageView2.setVisibility(0);
            } else {
                imageView3.setVisibility(8);
                imageView = this.A0C;
                imageView.setVisibility(8);
                imageView2 = this.A0D;
                imageView2.setVisibility(8);
            }
            imageView.clearAnimation();
            imageView2.clearAnimation();
            if (A0R && A06 > A05) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(1000L);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setAnimationListener(new C0DJ() { // from class: X.38V
                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        animation.setStartOffset(300L);
                    }
                });
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setDuration(1000L);
                alphaAnimation2.setStartOffset(300L);
                alphaAnimation2.setInterpolator(new DecelerateInterpolator());
                alphaAnimation2.setRepeatCount(-1);
                alphaAnimation2.setRepeatMode(2);
                imageView.startAnimation(alphaAnimation);
                imageView2.startAnimation(alphaAnimation2);
            }
            this.A04.setVisibility(0);
            Context context = getContext();
            C02L c02l = ((AbstractC48182Ef) this).A0I;
            C41471ty c41471ty = ((AbstractC48202Eh) this).A0K;
            if (c41471ty != null) {
                View.OnClickListener A062 = C23X.A06(c0kc, A0R, context, c02l, c41471ty);
                TextView textView = this.A0G;
                Resources resources = getResources();
                if (A0R) {
                    textView.setTextColor(resources.getColor(R.color.conversation_row_date));
                    view = this.A07;
                    view.setVisibility(0);
                    textEmojiLabel.setVisibility(0);
                } else {
                    textView.setTextColor(resources.getColor(R.color.live_location_expired_text));
                    view = this.A07;
                    view.setVisibility(8);
                    textEmojiLabel.setVisibility(8);
                }
                view2.setOnClickListener(A062);
                textView.setText(C23X.A0D(getContext(), c0kc, A0R, ((AbstractC48182Ef) this).A0X, ((AbstractC48202Eh) this).A0J, this.A01));
                View view6 = this.A02;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                WaMapView waMapView = this.A0L;
                C41471ty c41471ty2 = ((AbstractC48202Eh) this).A0K;
                if (c41471ty2 != null) {
                    waMapView.A02(c41471ty2, c0kc, A0R);
                    if (waMapView.getVisibility() == 0) {
                        ThumbnailButton thumbnailButton = this.A0J;
                        C02L c02l2 = ((AbstractC48182Ef) this).A0I;
                        C0L7 c0l7 = this.A00;
                        if (c0l7 != null) {
                            C0Zn c0Zn = this.A0K;
                            C0DK c0dk = this.A0Z;
                            if (z) {
                                c02l2.A05();
                                C0K1 c0k1 = c02l2.A01;
                                if (c0k1 != null) {
                                    c0Zn.A02(c0k1, thumbnailButton);
                                } else {
                                    throw null;
                                }
                            } else {
                                UserJid A0B = c0kc.A0B();
                                if (A0B != null) {
                                    c0Zn.A02(c0dk.A02(A0B), thumbnailButton);
                                } else {
                                    c0l7.A05(thumbnailButton, R.drawable.avatar_contact);
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (!TextUtils.isEmpty(c0kc.A03)) {
                        A0a(c0kc.A03, this.A0H, c0kc, true);
                        view.setVisibility(A0R ? 0 : 8);
                        textEmojiLabel.setPadding(getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding_top), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding));
                    } else {
                        A0a("", this.A0H, c0kc, true);
                        view.setVisibility(8);
                        textEmojiLabel.setPadding(getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding_top_no_comment), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding_bottom_no_comment));
                    }
                    if (view4 != null) {
                        if (TextUtils.isEmpty(c0kc.A03)) {
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(11);
                            layoutParams.addRule(8, R.id.live_location_info_holder);
                            view4.setLayoutParams(layoutParams);
                            ViewGroup viewGroup = this.A1C;
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_live_location_label_padding_right) + viewGroup.getMeasuredWidth();
                        } else {
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(3, R.id.live_location_info_holder);
                            view4.setLayoutParams(layoutParams2);
                            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_live_location_label_padding_right);
                        }
                        if (((AbstractC48202Eh) this).A0J.A0M()) {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dimensionPixelSize;
                        } else {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dimensionPixelSize;
                        }
                    }
                    TextView textView2 = this.A0F;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    int i = ((C0KD) c0kc).A02;
                    if (i == 1) {
                        View view7 = this.A06;
                        if (z) {
                            view7.setVisibility(0);
                            if (view3 != null) {
                                view3.setVisibility(0);
                            }
                            view2.setOnClickListener(null);
                        } else {
                            view7.setVisibility(0);
                        }
                    } else if (z && i != 2 && A0R) {
                        View view8 = this.A06;
                        if (view8 != null) {
                            view8.setVisibility(8);
                        }
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            textView2.setText(R.string.retry);
                            textView2.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this));
                        }
                        if (view3 != null) {
                            view3.setVisibility(0);
                        }
                        view.setVisibility(8);
                        textEmojiLabel.setVisibility(8);
                        view2.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this));
                    } else {
                        View view9 = this.A06;
                        if (view9 != null) {
                            view9.setVisibility(8);
                        }
                    }
                    if (waMapView.getVisibility() == 8) {
                        InterfaceC43821y3 interfaceC43821y3 = new InterfaceC43821y3() { // from class: X.38W
                            @Override // X.InterfaceC43821y3
                            public void AKM() {
                            }

                            @Override // X.InterfaceC43821y3
                            public int ADA() {
                                return C51422Wj.this.getResources().getDimensionPixelSize(R.dimen.conversation_row_message_thumb_size);
                            }

                            @Override // X.InterfaceC43821y3
                            public void AUc(View view10, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                                ImageView imageView4 = C51422Wj.this.A0E;
                                if (bitmap != null) {
                                    imageView4.setImageBitmap(bitmap);
                                } else {
                                    imageView4.setImageResource(R.drawable.media_location);
                                }
                            }

                            @Override // X.InterfaceC43821y3
                            public void AUo(View view10) {
                                ImageView imageView4 = C51422Wj.this.A0E;
                                imageView4.setImageDrawable(null);
                                imageView4.setBackgroundColor(-7829368);
                            }
                        };
                        C42471vn c42471vn = this.A11;
                        ImageView imageView4 = this.A0E;
                        if (c42471vn != null) {
                            c42471vn.A09(c0kc, imageView4, interfaceC43821y3, anonymousClass094);
                            return;
                        }
                        throw null;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public C0KC getFMessage() {
        return (C0KC) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_live_location_left_large;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_live_location_right_large;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0KC);
        super.setFMessage(anonymousClass092);
    }
}
