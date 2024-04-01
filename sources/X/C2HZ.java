package X;

import android.app.Activity;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.2HZ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2HZ {
    public final View A00;
    public final View A01;
    public final ImageButton A03;
    public final C48362Ey A05;
    public final AnonymousClass223 A06;
    public final MentionableEntry A07;
    public final C2MB A08;
    public final InterfaceC09180cm A04 = new InterfaceC09180cm() { // from class: X.3Eh
        @Override // X.InterfaceC09180cm
        public void AHj() {
            C2HZ.this.A07.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            C002701i.A1H(C2HZ.this.A07, iArr, 1024);
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener A02 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2yJ
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C2HZ c2hz = C2HZ.this;
            if (C2MB.A00(c2hz.A01)) {
                if (!c2hz.A05.isShowing()) {
                    View view = c2hz.A00;
                    if (view.getVisibility() == 8) {
                        view.startAnimation(C2HZ.A00(true));
                        view.setVisibility(0);
                    }
                }
            } else if (c2hz.A05.isShowing()) {
            } else {
                View view2 = c2hz.A00;
                if (view2.getVisibility() != 0) {
                    return;
                }
                view2.startAnimation(C2HZ.A00(false));
                view2.setVisibility(8);
            }
        }
    };

    public C2HZ(Activity activity, C455822q c455822q, C2MB c2mb, AbstractC000600i abstractC000600i, C40081rY c40081rY, C43871y8 c43871y8, C47682Ce c47682Ce, C02E c02e, C002301c c002301c, C2MI c2mi, C000500h c000500h, C02O c02o, View view, AbstractC005302j abstractC005302j) {
        this.A01 = view;
        this.A08 = c2mb;
        this.A00 = view.findViewById(R.id.emoji_btn_holder);
        MentionableEntry mentionableEntry = (MentionableEntry) view.findViewById(R.id.comment);
        this.A07 = mentionableEntry;
        mentionableEntry.setInputEnterDone(true);
        this.A07.setFilters(new InputFilter[]{new C09190cp(1024)});
        this.A07.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.2xv
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C2HZ c2hz = C2HZ.this;
                if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                    c2hz.A07.A01();
                    return true;
                }
                return false;
            }
        });
        MentionableEntry mentionableEntry2 = this.A07;
        mentionableEntry2.addTextChangedListener(new C52662b7(c40081rY, c02e, c002301c, c02o, mentionableEntry2, (TextView) view.findViewById(R.id.counter), 1024, 30, true));
        if (C003101m.A0U(abstractC005302j)) {
            this.A07.A0C((ViewGroup) view.findViewById(R.id.mention_attach), C011005l.A03(abstractC005302j), false, true, true);
        }
        this.A03 = (ImageButton) view.findViewById(R.id.emoji_picker_btn);
        this.A05 = new C48362Ey(activity, c455822q, c2mb, abstractC000600i, c40081rY, c43871y8, c47682Ce, c02e, c002301c, c2mi, c000500h, c02o, (InterfaceC08240b0) activity.findViewById(R.id.main), this.A03, this.A07);
        AnonymousClass223 anonymousClass223 = new AnonymousClass223((EmojiSearchContainer) view.findViewById(R.id.emoji_search_container), this.A05, activity, c40081rY, c47682Ce, c002301c, c02o);
        this.A06 = anonymousClass223;
        anonymousClass223.A00 = new InterfaceC04830Lz() { // from class: X.3E5
            @Override // X.InterfaceC04830Lz
            public final void AJj(C2CI c2ci) {
                C2HZ.this.A04.AJi(c2ci.A00);
            }
        };
        C48362Ey c48362Ey = this.A05;
        c48362Ey.A0A(this.A04);
        c48362Ey.A0C = new RunnableEBaseShape3S0100000_I0_3(this, 29);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    public static Animation A00(boolean z) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, z ? -1.0f : 0.0f, 1, z ? 0.0f : -1.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(100L);
        return translateAnimation;
    }
}
