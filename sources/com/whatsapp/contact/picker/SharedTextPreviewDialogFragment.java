package com.whatsapp.contact.picker;

import X.AbstractC000600i;
import X.ActivityC02330At;
import X.AnonymousClass223;
import X.AnonymousClass377;
import X.C000200d;
import X.C000500h;
import X.C000700j;
import X.C002301c;
import X.C002701i;
import X.C003701t;
import X.C018308n;
import X.C01B;
import X.C02O;
import X.C04310Jr;
import X.C05920Qu;
import X.C0DJ;
import X.C0LX;
import X.C1Lh;
import X.C26901Le;
import X.C2MB;
import X.C2MI;
import X.C40081rY;
import X.C43871y8;
import X.C455822q;
import X.C47682Ce;
import X.C48362Ey;
import X.InterfaceC002901k;
import X.InterfaceC04830Lz;
import X.InterfaceC09180cm;
import X.InterfaceC26921Lg;
import X.InterfaceC58072qX;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class SharedTextPreviewDialogFragment extends Hilt_SharedTextPreviewDialogFragment {
    public View A00;
    public ImageButton A01;
    public C018308n A02;
    public AbstractC000600i A03;
    public C01B A04;
    public C05920Qu A05;
    public SharedTextPreviewScrollView A06;
    public C000500h A07;
    public C43871y8 A08;
    public C40081rY A09;
    public C48362Ey A0A;
    public C47682Ce A0B;
    public C2MI A0C;
    public C003701t A0D;
    public C455822q A0E;
    public MentionableEntry A0F;
    public C02O A0G;
    public C2MB A0H;
    public InterfaceC002901k A0I;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public final Handler A0Q = new Handler(Looper.getMainLooper());
    public Runnable A0J = null;
    public boolean A0O = false;
    public boolean A0P = true;
    public final InterfaceC09180cm A0R = new InterfaceC09180cm() { // from class: X.376
        {
            SharedTextPreviewDialogFragment.this = this;
        }

        @Override // X.InterfaceC09180cm
        public void AHj() {
            SharedTextPreviewDialogFragment.this.A0F.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            C002701i.A1H(SharedTextPreviewDialogFragment.this.A0F, iArr, 0);
        }
    };

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 27 && i2 == -1) {
            ActivityC02330At A09 = A09();
            if (A09 != null) {
                this.A02.A06(A09(), new Intent(A09, HomeActivity.class));
                A09().finish();
            }
            A16(false, false);
        }
    }

    @Override // com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment, X.C0BA
    public boolean A0o(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.A0A.isShowing()) {
                this.A0A.dismiss();
            }
            A0A().getWindow().setSoftInputMode(2);
        }
        if (menuItem.getItemId() == 16908332) {
            A16(false, false);
            return true;
        }
        return false;
    }

    @Override // com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment, X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        String replaceFirst;
        super.A0p(layoutInflater, viewGroup, bundle);
        ((BaseSharedPreviewDialogFragment) this).A04.addView(A0A().getLayoutInflater().inflate(R.layout.shared_text_preview_relative_layout, (ViewGroup) null, false));
        this.A06 = (SharedTextPreviewScrollView) ((BaseSharedPreviewDialogFragment) this).A04.findViewById(R.id.subject_layout);
        this.A0F = (MentionableEntry) ((BaseSharedPreviewDialogFragment) this).A04.findViewById(R.id.mentionable_entry);
        this.A00 = ((BaseSharedPreviewDialogFragment) this).A04.findViewById(R.id.stub);
        C002301c c002301c = ((BaseSharedPreviewDialogFragment) this).A0D;
        MentionableEntry mentionableEntry = this.A0F;
        if (c002301c.A0N()) {
            mentionableEntry.setPadding(2, mentionableEntry.getPaddingTop(), mentionableEntry.getPaddingRight(), mentionableEntry.getPaddingBottom());
        } else {
            mentionableEntry.setPadding(mentionableEntry.getPaddingLeft(), mentionableEntry.getPaddingTop(), 2, mentionableEntry.getPaddingBottom());
        }
        this.A0F.addTextChangedListener(new AnonymousClass377(this));
        this.A0F.setInputType(131073);
        ImageButton imageButton = (ImageButton) ((BaseSharedPreviewDialogFragment) this).A04.findViewById(R.id.emoji_btn);
        this.A01 = imageButton;
        C48362Ey c48362Ey = new C48362Ey(A09(), this.A0E, this.A0H, this.A03, this.A09, this.A08, this.A0B, ((BaseSharedPreviewDialogFragment) this).A0C, ((BaseSharedPreviewDialogFragment) this).A0D, this.A0C, this.A07, this.A0G, (KeyboardPopupLayout) ((BaseSharedPreviewDialogFragment) this).A00.findViewById(R.id.emoji_edit_text_layout), imageButton, this.A0F);
        this.A0A = c48362Ey;
        AnonymousClass223 anonymousClass223 = new AnonymousClass223(((BaseSharedPreviewDialogFragment) this).A0E, c48362Ey, A09(), this.A09, this.A0B, ((BaseSharedPreviewDialogFragment) this).A0D, this.A0G);
        anonymousClass223.A00 = new InterfaceC04830Lz() { // from class: X.36T
            {
                SharedTextPreviewDialogFragment.this = this;
            }

            @Override // X.InterfaceC04830Lz
            public final void AJj(C2CI c2ci) {
                SharedTextPreviewDialogFragment.this.A0R.AJi(c2ci.A00);
            }
        };
        C48362Ey c48362Ey2 = this.A0A;
        c48362Ey2.A0A(this.A0R);
        c48362Ey2.A0C = new RunnableEBaseShape1S0200000_I0_1(this, anonymousClass223, 7);
        String A01 = C04310Jr.A01(this.A0M);
        if (A01 != null && (replaceFirst = this.A0M.replaceFirst(Pattern.quote(A01), "")) != null && replaceFirst.trim().isEmpty()) {
            StringBuilder A0P = C000200d.A0P("\n\n");
            A0P.append(this.A0M);
            this.A0M = A0P.toString();
            z = false;
        } else {
            z = true;
        }
        A18();
        this.A0F.setText(C002701i.A0g(this.A0M, A09(), this.A09));
        A1B(this.A0F.getText(), true);
        this.A0F.requestFocus();
        Window window = ((DialogFragment) this).A03.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
            MentionableEntry mentionableEntry2 = this.A0F;
            mentionableEntry2.setSelection(z ? mentionableEntry2.getText().length() : 0);
            SharedTextPreviewScrollView sharedTextPreviewScrollView = this.A06;
            sharedTextPreviewScrollView.A00 = new InterfaceC58072qX() { // from class: X.36R
                {
                    SharedTextPreviewDialogFragment.this = this;
                }

                @Override // X.InterfaceC58072qX
                public final void AJn() {
                    SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = SharedTextPreviewDialogFragment.this;
                    int selectionStart = sharedTextPreviewDialogFragment.A0F.getSelectionStart();
                    if (selectionStart == sharedTextPreviewDialogFragment.A0F.getSelectionEnd() && sharedTextPreviewDialogFragment.A0P) {
                        MentionableEntry mentionableEntry3 = sharedTextPreviewDialogFragment.A0F;
                        int offsetForPosition = mentionableEntry3.getOffsetForPosition(mentionableEntry3.getX() + sharedTextPreviewDialogFragment.A0F.getWidth(), sharedTextPreviewDialogFragment.A06.getScrollY());
                        int abs = Math.abs(sharedTextPreviewDialogFragment.A0F.getLayout().getLineTop(0) - sharedTextPreviewDialogFragment.A0F.getLayout().getLineBottom(0));
                        MentionableEntry mentionableEntry4 = sharedTextPreviewDialogFragment.A0F;
                        int offsetForPosition2 = mentionableEntry4.getOffsetForPosition(mentionableEntry4.getX() + sharedTextPreviewDialogFragment.A0F.getWidth(), (sharedTextPreviewDialogFragment.A06.getHeight() + sharedTextPreviewDialogFragment.A06.getScrollY()) - abs);
                        if (selectionStart < offsetForPosition) {
                            sharedTextPreviewDialogFragment.A0F.setSelection(offsetForPosition);
                        } else if (selectionStart > offsetForPosition2) {
                            sharedTextPreviewDialogFragment.A0F.setSelection(offsetForPosition2);
                        }
                    } else if (!sharedTextPreviewDialogFragment.A0P) {
                        sharedTextPreviewDialogFragment.A0P = true;
                    }
                    sharedTextPreviewDialogFragment.A19();
                }
            };
            sharedTextPreviewScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2qD
                {
                    SharedTextPreviewDialogFragment.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    SharedTextPreviewDialogFragment.this.A19();
                }
            });
            this.A06.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.2qB
                {
                    SharedTextPreviewDialogFragment.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    SharedTextPreviewDialogFragment.this.A19();
                }
            });
            this.A06.setOverScrollMode(2);
            ((BaseSharedPreviewDialogFragment) this).A03.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 7));
            ((DialogFragment) this).A03.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.2qC
                {
                    SharedTextPreviewDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = SharedTextPreviewDialogFragment.this;
                    if (i == 4 && sharedTextPreviewDialogFragment.A0A.isShowing()) {
                        sharedTextPreviewDialogFragment.A0A.dismiss();
                        return true;
                    }
                    return false;
                }
            });
            A19();
            return ((BaseSharedPreviewDialogFragment) this).A00;
        }
        throw null;
    }

    @Override // com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        String string = A02.getString("message");
        C000700j.A04(string, "null message");
        this.A0M = string;
        Boolean valueOf = Boolean.valueOf(A02.getBoolean("has_text_from_url"));
        C000700j.A04(valueOf, "null hasTextFromUrl");
        this.A0N = valueOf.booleanValue();
        return super.A0z(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x000b, code lost:
        if (r0 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A19() {
        /*
            r5 = this;
            com.whatsapp.conversation.conversationrow.WebPagePreviewView r0 = r5.A0B
            if (r0 == 0) goto Ld
            int r0 = r0.getVisibility()
            r1 = 2131166174(0x7f0703de, float:1.7946586E38)
            if (r0 == 0) goto L10
        Ld:
            r1 = 2131166175(0x7f0703df, float:1.7946588E38)
        L10:
            X.0At r0 = r5.A0A()
            android.content.res.Resources r0 = r0.getResources()
            int r3 = r0.getDimensionPixelSize(r1)
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A06
            int r0 = r0.getPaddingBottom()
            if (r0 == r3) goto L39
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r4 = r5.A06
            int r2 = r4.getPaddingLeft()
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A06
            int r1 = r0.getPaddingTop()
            com.whatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A06
            int r0 = r0.getPaddingRight()
            r4.setPadding(r2, r1, r0, r3)
        L39:
            r0 = 2
            int[] r2 = new int[r0]
            int[] r1 = new int[r0]
            android.view.View r0 = r5.A00
            r0.getLocationOnScreen(r2)
            android.widget.RelativeLayout r0 = r5.A05
            r0.getLocationOnScreen(r1)
            r0 = 1
            r1 = r1[r0]
            r0 = r2[r0]
            int r1 = r1 - r0
            if (r1 >= r3) goto L55
            r0 = 0
            int r3 = java.lang.Math.max(r0, r1)
        L55:
            android.widget.ImageButton r0 = r5.A01
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0)
            r2.bottomMargin = r3
            r0 = 9
            r2.addRule(r0)
            r1 = 8
            r0 = 2131364776(0x7f0a0ba8, float:1.8349399E38)
            r2.addRule(r1, r0)
            android.widget.ImageButton r0 = r5.A01
            r0.setLayoutParams(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A19():void");
    }

    public final void A1A() {
        ViewGroup viewGroup;
        if (((BaseSharedPreviewDialogFragment) this).A0B == null || (viewGroup = ((BaseSharedPreviewDialogFragment) this).A02) == null || viewGroup.getVisibility() != 0 || this.A0O) {
            return;
        }
        this.A0O = true;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, ((BaseSharedPreviewDialogFragment) this).A02.getHeight());
        translateAnimation.setDuration(150L);
        translateAnimation.setAnimationListener(new C0DJ() { // from class: X.37A
            {
                SharedTextPreviewDialogFragment.this = this;
            }

            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = SharedTextPreviewDialogFragment.this;
                ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0B.setVisibility(8);
                ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A02.setVisibility(8);
                ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A01.setVisibility(8);
                ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0B = null;
                sharedTextPreviewDialogFragment.A18();
                sharedTextPreviewDialogFragment.A19();
                sharedTextPreviewDialogFragment.A0O = false;
            }
        });
        ((BaseSharedPreviewDialogFragment) this).A0B.startAnimation(translateAnimation);
    }

    public final void A1B(Editable editable, boolean z) {
        String A01 = C04310Jr.A01(editable.toString());
        this.A0L = A01;
        if (A01 != null && !A01.equals(this.A0K)) {
            this.A0K = null;
            C05920Qu c05920Qu = this.A05;
            if (c05920Qu == null || !TextUtils.equals(c05920Qu.A0G, A01)) {
                A1C(C1Lh.A00(A01));
                if (this.A05 == null) {
                    Runnable runnable = this.A0J;
                    if (runnable != null) {
                        this.A0Q.removeCallbacks(runnable);
                        this.A0J = null;
                    }
                    if (z) {
                        C1Lh.A01(((BaseSharedPreviewDialogFragment) this).A07, this.A0I, this.A04, ((BaseSharedPreviewDialogFragment) this).A0D, A01, new InterfaceC26921Lg() { // from class: X.36Q
                            {
                                SharedTextPreviewDialogFragment.this = this;
                            }

                            @Override // X.InterfaceC26921Lg
                            public final void AMf(C05920Qu c05920Qu2, boolean z2) {
                                SharedTextPreviewDialogFragment.this.A1C(c05920Qu2);
                            }
                        });
                        return;
                    }
                    RunnableEBaseShape0S1100000_I0 runnableEBaseShape0S1100000_I0 = new RunnableEBaseShape0S1100000_I0(this, A01, 11);
                    this.A0J = runnableEBaseShape0S1100000_I0;
                    this.A0Q.postDelayed(runnableEBaseShape0S1100000_I0, 700L);
                    return;
                }
                return;
            }
            return;
        }
        A1C(null);
    }

    public final void A1C(C05920Qu c05920Qu) {
        C26901Le c26901Le;
        if (A09() == null) {
            return;
        }
        if (c05920Qu != null) {
            if (TextUtils.equals(this.A0L, c05920Qu.A0G)) {
                if (c05920Qu.A0C()) {
                    this.A05 = c05920Qu;
                    if (((BaseSharedPreviewDialogFragment) this).A0B == null) {
                        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(A0A());
                        ((BaseSharedPreviewDialogFragment) this).A0B = webPagePreviewView;
                        View findViewById = webPagePreviewView.findViewById(R.id.link_preview_content);
                        ((BaseSharedPreviewDialogFragment) this).A0B.setForeground(null);
                        ((BaseSharedPreviewDialogFragment) this).A0B.setMinimumHeight(A01().getDimensionPixelSize(R.dimen.share_preview_footer_max_height));
                        findViewById.setBackgroundResource(0);
                        findViewById.setEnabled(false);
                        ((BaseSharedPreviewDialogFragment) this).A02.addView(((BaseSharedPreviewDialogFragment) this).A0B);
                        C0LX.A06(((BaseSharedPreviewDialogFragment) this).A0D, ((BaseSharedPreviewDialogFragment) this).A0B.findViewById(R.id.title), 0, A01().getDimensionPixelSize(R.dimen.link_preview_cancel_button_padding));
                        ((BaseSharedPreviewDialogFragment) this).A0B.setProgressBarVisibility(false);
                        ((BaseSharedPreviewDialogFragment) this).A0B.findViewById(R.id.link_preview_content).setMinimumHeight(A01().getDimensionPixelSize(R.dimen.link_preview_min_height));
                        View findViewById2 = ((BaseSharedPreviewDialogFragment) this).A0B.findViewById(R.id.cancel);
                        findViewById2.setVisibility(0);
                        findViewById2.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 32));
                        View findViewById3 = ((BaseSharedPreviewDialogFragment) this).A0B.findViewById(R.id.thumb);
                        C05920Qu c05920Qu2 = this.A05;
                        if (c05920Qu2 != null && (c26901Le = c05920Qu2.A07) != null && c26901Le.A02 != null) {
                            String str = c26901Le.A01;
                            if ("video/mp4".equals(str) || "image/gif".equals(str)) {
                                findViewById.setEnabled(true);
                            }
                        }
                        findViewById.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(findViewById3, this, 4));
                    }
                    A19();
                    if (((BaseSharedPreviewDialogFragment) this).A02.getVisibility() != 0 && ((BaseSharedPreviewDialogFragment) this).A0B != null && !this.A0O) {
                        this.A0O = true;
                        int[] iArr = {0, 0};
                        this.A0F.getLocationOnScreen(iArr);
                        int height = this.A0F.getHeight() + iArr[1];
                        int[] iArr2 = {0, 0};
                        ((BaseSharedPreviewDialogFragment) this).A00.findViewById(R.id.recipients_container).getLocationOnScreen(iArr2);
                        int i = iArr2[1];
                        int abs = Math.abs(height - i);
                        int dimensionPixelSize = A01().getDimensionPixelSize(R.dimen.share_preview_footer_max_height) - A01().getDimensionPixelSize(R.dimen.share_preview_footer_min_height);
                        if (abs <= dimensionPixelSize && (i != 0 || height != 0)) {
                            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -dimensionPixelSize);
                            translateAnimation.setDuration(150L);
                            translateAnimation.setAnimationListener(new C0DJ() { // from class: X.379
                                {
                                    SharedTextPreviewDialogFragment.this = this;
                                }

                                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                                public void onAnimationEnd(Animation animation) {
                                    SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = SharedTextPreviewDialogFragment.this;
                                    sharedTextPreviewDialogFragment.A18();
                                    TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A02.getHeight(), 0.0f);
                                    translateAnimation2.setDuration(150L);
                                    ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A02.setVisibility(0);
                                    ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A01.setVisibility(0);
                                    int selectionStart = sharedTextPreviewDialogFragment.A0F.getSelectionStart();
                                    int selectionEnd = sharedTextPreviewDialogFragment.A0F.getSelectionEnd();
                                    MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A0F;
                                    mentionableEntry.setText(mentionableEntry.getStringText());
                                    sharedTextPreviewDialogFragment.A0F.setSelection(selectionStart, selectionEnd);
                                    sharedTextPreviewDialogFragment.A0P = false;
                                    ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0B.startAnimation(translateAnimation2);
                                }
                            });
                            this.A06.startAnimation(translateAnimation);
                        } else {
                            A18();
                            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, ((BaseSharedPreviewDialogFragment) this).A02.getHeight(), 0.0f);
                            translateAnimation2.setDuration(150L);
                            translateAnimation2.setDuration(150L);
                            ((BaseSharedPreviewDialogFragment) this).A02.setVisibility(0);
                            ((BaseSharedPreviewDialogFragment) this).A01.setVisibility(0);
                            ((BaseSharedPreviewDialogFragment) this).A0B.startAnimation(translateAnimation2);
                        }
                        this.A0O = false;
                    }
                    this.A0F.requestFocus();
                    WebPagePreviewView webPagePreviewView2 = ((BaseSharedPreviewDialogFragment) this).A0B;
                    if (webPagePreviewView2 != null) {
                        webPagePreviewView2.A01(c05920Qu, null);
                        return;
                    }
                    throw null;
                }
                this.A05 = null;
                A1A();
                return;
            }
            return;
        }
        this.A05 = null;
        A1A();
    }

    @Override // com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            A09.getWindow().setSoftInputMode(3);
        }
        super.onDismiss(dialogInterface);
    }
}
