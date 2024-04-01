package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannedString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.util.List;

/* renamed from: X.2Gy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class DialogC48832Gy extends Dialog {
    public ImageButton A00;
    public C48362Ey A01;
    public AnonymousClass223 A02;
    public MentionableEntry A03;
    public CharSequence A04;
    public CharSequence A05;
    public String A06;
    public List A07;
    public boolean A08;
    public final AbstractC000600i A09;
    public final ActivityC02290Ap A0A;
    public final InterfaceC09180cm A0B;
    public final C02E A0C;
    public final C000500h A0D;
    public final C002301c A0E;
    public final C43871y8 A0F;
    public final C40081rY A0G;
    public final C47682Ce A0H;
    public final C2MI A0I;
    public final C455822q A0J;
    public final AbstractC005302j A0K;
    public final C48822Gw A0L;
    public final C02O A0M;
    public final C2MB A0N;
    public final boolean A0O;

    public DialogC48832Gy(ActivityC02290Ap activityC02290Ap, C455822q c455822q, C2MB c2mb, AbstractC000600i abstractC000600i, C40081rY c40081rY, C43871y8 c43871y8, C47682Ce c47682Ce, C02E c02e, C002301c c002301c, C2MI c2mi, C000500h c000500h, C48822Gw c48822Gw, C02O c02o, AbstractC005302j abstractC005302j, CharSequence charSequence, boolean z) {
        super(activityC02290Ap, R.style.DoodleTextDialog);
        this.A0B = new InterfaceC09180cm() { // from class: X.3Gg
            @Override // X.InterfaceC09180cm
            public void AHj() {
                DialogC48832Gy.this.A03.dispatchKeyEvent(new KeyEvent(0, 67));
            }

            @Override // X.InterfaceC09180cm
            public void AJi(int[] iArr) {
                C002701i.A1H(DialogC48832Gy.this.A03, iArr, 1024);
            }
        };
        this.A0K = abstractC005302j;
        this.A05 = charSequence;
        this.A0O = z;
        this.A0A = activityC02290Ap;
        this.A0J = c455822q;
        this.A0N = c2mb;
        this.A09 = abstractC000600i;
        this.A0G = c40081rY;
        this.A0F = c43871y8;
        this.A0H = c47682Ce;
        this.A0C = c02e;
        this.A0E = c002301c;
        this.A0I = c2mi;
        this.A0D = c000500h;
        this.A0L = c48822Gw;
        this.A0M = c02o;
    }

    public static final void A00(View view, View view2, Integer num) {
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            view.setVisibility(8);
            view2.setVisibility(0);
        } else if (intValue == 2) {
            view.setActivated(false);
            view.setEnabled(true);
            view.setVisibility(0);
            view2.setVisibility(8);
        } else if (intValue == 3) {
            view.setActivated(true);
            view.setEnabled(true);
            view.setVisibility(0);
            view2.setVisibility(8);
        } else {
            StringBuilder sb = new StringBuilder("Unexpected value: ");
            sb.append(num);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        if (this.A01.isShowing()) {
            this.A01.dismiss();
        }
        this.A06 = this.A03.getStringText();
        this.A07 = this.A03.getMentions();
        this.A04 = new SpannedString(this.A03.getText());
        this.A03.A07();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Animation translateAnimation;
        super.onCreate(bundle);
        C002301c c002301c = this.A0E;
        C0LX.A09(c002301c, getWindow());
        boolean z = this.A0O;
        int i = R.layout.capture_send_dialog_old;
        if (z) {
            i = R.layout.capture_send_dialog;
        }
        View inflate = getLayoutInflater().inflate(i, (ViewGroup) null, false);
        setContentView(inflate);
        getWindow().setLayout(-1, -1);
        ActivityC02290Ap activityC02290Ap = this.A0A;
        if ((activityC02290Ap.getWindow().getAttributes().flags & 1024) != 0) {
            getWindow().setFlags(1024, 1024);
            getWindow().clearFlags(256);
        }
        getWindow().setSoftInputMode(1);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.main);
        keyboardPopupLayout.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 48));
        ImageView imageView = (ImageView) findViewById(R.id.send);
        AbstractC005302j abstractC005302j = this.A0K;
        if (abstractC005302j != null) {
            imageView.setImageDrawable(new C0We(c002301c, C02160Ac.A03(activityC02290Ap, R.drawable.input_send)));
            imageView.setContentDescription(activityC02290Ap.getString(R.string.send));
        } else {
            imageView.setImageResource(R.drawable.ic_done);
            imageView.setContentDescription(activityC02290Ap.getString(R.string.done));
        }
        imageView.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 49));
        MentionableEntry mentionableEntry = (MentionableEntry) findViewById(R.id.caption);
        this.A03 = mentionableEntry;
        mentionableEntry.setText(this.A05);
        this.A03.setSelection(this.A05.length(), this.A05.length());
        this.A03.setInputEnterDone(true);
        this.A03.setFilters(new InputFilter[]{new C09190cp(1024)});
        this.A03.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.2zY
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                DialogC48832Gy dialogC48832Gy = DialogC48832Gy.this;
                if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                    dialogC48832Gy.A03.A01();
                    return true;
                }
                return false;
            }
        });
        MentionableEntry mentionableEntry2 = this.A03;
        C40081rY c40081rY = this.A0G;
        C02E c02e = this.A0C;
        C02O c02o = this.A0M;
        mentionableEntry2.addTextChangedListener(new C52662b7(c40081rY, c02e, c002301c, c02o, mentionableEntry2, (TextView) findViewById(R.id.counter), 1024, 30, true));
        this.A03.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.2zX
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                DialogC48832Gy dialogC48832Gy = DialogC48832Gy.this;
                if (i2 == 6) {
                    dialogC48832Gy.dismiss();
                    return true;
                }
                return false;
            }
        });
        ((C2LR) this.A03).A00 = new InterfaceC58412r6() { // from class: X.3GU
            @Override // X.InterfaceC58412r6
            public final boolean ALE(int i2, KeyEvent keyEvent) {
                DialogC48832Gy dialogC48832Gy = DialogC48832Gy.this;
                if (i2 == 4 && keyEvent.getAction() == 1) {
                    dialogC48832Gy.dismiss();
                    return false;
                }
                return false;
            }
        };
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mention_attach);
        if (C003101m.A0U(abstractC005302j)) {
            MentionableEntry mentionableEntry3 = this.A03;
            if (z) {
                mentionableEntry3.A04 = inflate;
                mentionableEntry3.A0C(viewGroup, C011005l.A03(abstractC005302j), false, false, false);
            } else {
                mentionableEntry3.A0C(viewGroup, C011005l.A03(abstractC005302j), true, true, true);
            }
        }
        ImageButton imageButton = (ImageButton) findViewById(R.id.emoji_picker_btn);
        this.A00 = imageButton;
        C455822q c455822q = this.A0J;
        C2MB c2mb = this.A0N;
        AbstractC000600i abstractC000600i = this.A09;
        C43871y8 c43871y8 = this.A0F;
        C47682Ce c47682Ce = this.A0H;
        C48362Ey c48362Ey = new C48362Ey(activityC02290Ap, c455822q, c2mb, abstractC000600i, c40081rY, c43871y8, c47682Ce, c02e, c002301c, this.A0I, this.A0D, c02o, keyboardPopupLayout, imageButton, this.A03);
        this.A01 = c48362Ey;
        c48362Ey.A0C = new RunnableEBaseShape3S0100000_I0_3(this, 48);
        AnonymousClass223 anonymousClass223 = new AnonymousClass223((EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A01, activityC02290Ap, c40081rY, c47682Ce, c002301c, c02o);
        this.A02 = anonymousClass223;
        anonymousClass223.A00 = new InterfaceC04830Lz() { // from class: X.3GS
            @Override // X.InterfaceC04830Lz
            public final void AJj(C2CI c2ci) {
                DialogC48832Gy.this.A0B.AJi(c2ci.A00);
            }
        };
        this.A01.A0A(this.A0B);
        findViewById(R.id.emoji_btn_holder).setVisibility(0);
        findViewById(R.id.no_emoji_padding).setVisibility(8);
        if (z) {
            translateAnimation = new AlphaAnimation(0.0f, 1.0f);
            C48362Ey c48362Ey2 = this.A01;
            c48362Ey2.A00 = R.drawable.ib_emoji;
            c48362Ey2.A03 = R.drawable.ib_keyboard;
            this.A00.setImageDrawable(C02180Ae.A0O(getContext(), R.drawable.ib_emoji, R.color.ibEmojiIconTint));
        } else {
            C48362Ey c48362Ey3 = this.A01;
            c48362Ey3.A00 = R.drawable.input_emoji_white;
            c48362Ey3.A03 = R.drawable.input_kbd_white;
            this.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.capture_preview_caption_left_padding) + (-this.A00.getMeasuredWidth());
            if (!c002301c.A0M()) {
                dimensionPixelSize = -dimensionPixelSize;
            }
            translateAnimation = new TranslateAnimation(dimensionPixelSize, 0.0f, 0.0f, 0.0f);
        }
        translateAnimation.setDuration(220L);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        findViewById(R.id.emoji_btn_holder).startAnimation(translateAnimation);
        findViewById(R.id.caption).startAnimation(translateAnimation);
        getWindow().setSoftInputMode(5);
        this.A03.A02(true);
        final WaImageView waImageView = (WaImageView) C0AT.A0D(keyboardPopupLayout, R.id.view_once_toggle);
        final View A0D = C0AT.A0D(keyboardPopupLayout, R.id.view_once_toggle_spacer);
        C48822Gw c48822Gw = this.A0L;
        InterfaceC05620Pl interfaceC05620Pl = new InterfaceC05620Pl() { // from class: X.3GT
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                DialogC48832Gy.A00(waImageView, A0D, (Integer) obj);
            }
        };
        C0HK c0hk = c48822Gw.A04;
        c0hk.A05(activityC02290Ap, interfaceC05620Pl);
        A00(waImageView, A0D, Integer.valueOf(((Number) c0hk.A01()).intValue()));
        int i2 = R.color.selector_media_preview_button_old;
        if (z) {
            i2 = R.color.selector_media_preview_button;
        }
        waImageView.setImageDrawable(C02160Ac.A03(getContext(), R.drawable.view_once_selector));
        C07O.A0h(waImageView, C02160Ac.A02(getContext(), i2));
        waImageView.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 41));
    }
}
