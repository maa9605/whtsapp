package X;

import android.app.Activity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.3ZX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ZX {
    public final View A00;
    public final C48362Ey A03;
    public final AnonymousClass223 A04;
    public final MentionableEntry A05;
    public final C2MB A06;
    public final InterfaceC09180cm A02 = new InterfaceC09180cm() { // from class: X.3sI
        @Override // X.InterfaceC09180cm
        public void AHj() {
            C3ZX.this.A05.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            C002701i.A1H(C3ZX.this.A05, iArr, 1024);
        }
    };
    public final ViewTreeObserver.OnGlobalLayoutListener A01 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3ZW
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
            if (r1.A03.isShowing() != false) goto L14;
         */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onGlobalLayout() {
            /*
                r5 = this;
                X.3ZX r1 = X.C3ZX.this
                android.view.View r4 = r1.A00
                boolean r0 = X.C2MB.A00(r4)
                r3 = 0
                if (r0 != 0) goto L14
                X.2Ey r0 = r1.A03
                boolean r0 = r0.isShowing()
                r2 = 0
                if (r0 == 0) goto L15
            L14:
                r2 = 1
            L15:
                r0 = 2131362790(0x7f0a03e6, float:1.834537E38)
                android.view.View r1 = r4.findViewById(r0)
                r0 = 8
                if (r2 == 0) goto L21
                r0 = 0
            L21:
                r1.setVisibility(r0)
                r0 = 2131363688(0x7f0a0768, float:1.8347192E38)
                android.view.View r0 = r4.findViewById(r0)
                if (r2 == 0) goto L2f
                r3 = 8
            L2f:
                r0.setVisibility(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C3ZW.onGlobalLayout():void");
        }
    };

    public C3ZX(Activity activity, C455822q c455822q, C2MB c2mb, AbstractC000600i abstractC000600i, C40081rY c40081rY, C43871y8 c43871y8, C47682Ce c47682Ce, C02E c02e, C002301c c002301c, C2MI c2mi, C000500h c000500h, C02O c02o, View view, C06C c06c, String str, List list, boolean z) {
        this.A00 = view;
        this.A06 = c2mb;
        MentionableEntry mentionableEntry = (MentionableEntry) C0AT.A0D(view, R.id.caption);
        this.A05 = mentionableEntry;
        mentionableEntry.setInputEnterDone(true);
        this.A05.setFilters(new InputFilter[]{new C09190cp(1024)});
        this.A05.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.3ZV
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C3ZX c3zx = C3ZX.this;
                if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                    c3zx.A05.A01();
                    return true;
                }
                return false;
            }
        });
        MentionableEntry mentionableEntry2 = this.A05;
        mentionableEntry2.addTextChangedListener(new C52662b7(c40081rY, c02e, c002301c, c02o, mentionableEntry2, (TextView) view.findViewById(R.id.counter), 1024, 30, true));
        if (c06c != null && c06c.A0C()) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.mention_attach);
            MentionableEntry mentionableEntry3 = this.A05;
            if (z) {
                mentionableEntry3.A04 = view;
                mentionableEntry3.A0C(viewGroup, (C011005l) c06c.A03(C011005l.class), false, false, false);
            } else {
                mentionableEntry3.A0C(viewGroup, (C011005l) c06c.A03(C011005l.class), true, true, true);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.A05.setMentionableText(str, list);
        }
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.emoji_picker_btn);
        C48362Ey c48362Ey = new C48362Ey(activity, c455822q, c2mb, abstractC000600i, c40081rY, c43871y8, c47682Ce, c02e, c002301c, c2mi, c000500h, c02o, (InterfaceC08240b0) activity.findViewById(R.id.main), imageButton, this.A05);
        this.A03 = c48362Ey;
        if (z) {
            c48362Ey.A00 = R.drawable.ib_emoji;
            c48362Ey.A03 = R.drawable.ib_keyboard;
            imageButton.setImageDrawable(C02180Ae.A0O(imageButton.getContext(), R.drawable.ib_emoji, R.color.ibEmojiIconTint));
        } else {
            c48362Ey.A00 = R.drawable.input_emoji_white;
            c48362Ey.A03 = R.drawable.input_kbd_white;
        }
        AnonymousClass223 anonymousClass223 = new AnonymousClass223((EmojiSearchContainer) view.findViewById(R.id.emoji_search_container), this.A03, activity, c40081rY, c47682Ce, c002301c, c02o);
        this.A04 = anonymousClass223;
        anonymousClass223.A00 = new InterfaceC04830Lz() { // from class: X.3sG
            @Override // X.InterfaceC04830Lz
            public final void AJj(C2CI c2ci) {
                C3ZX.this.A02.AJi(c2ci.A00);
            }
        };
        C48362Ey c48362Ey2 = this.A03;
        c48362Ey2.A0A(this.A02);
        c48362Ey2.A0C = new RunnableEBaseShape9S0100000_I1_1(this, 19);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
    }
}
