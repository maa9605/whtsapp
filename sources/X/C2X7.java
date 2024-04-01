package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;

/* renamed from: X.2X7 */
/* loaded from: classes2.dex */
public class C2X7 extends C2X8 implements C2X9 {
    public C41771uU A00;
    public C42451vl A01;
    public boolean A02;
    public boolean A03;
    public final View A04;
    public final View A05;
    public final C58892rs A06;

    public C2X7(Context context, C04040Ie c04040Ie, C43791xz c43791xz) {
        super(context, c04040Ie);
        this.A06 = new C58892rs(this, c43791xz, ((AbstractC48182Ef) this).A0J, ((AbstractC48182Ef) this).A0K, ((AbstractC48182Ef) this).A0N, ((AbstractC48202Eh) this).A0J, ((C2JE) this).A07, ((C2JE) this).A02, this.A01, this.A00);
        this.A04 = findViewById(R.id.name_in_group);
        this.A05 = findViewById(R.id.sticker_bubble_header);
        A00(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0026, code lost:
        if ((((X.AbstractC48202Eh) r7).A0X instanceof X.C68313Ja) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00(boolean r8) {
        /*
            r7 = this;
            X.097 r2 = super.getFMessage()
            X.0Ie r2 = (X.C04040Ie) r2
            X.092 r0 = r2.A0C()
            r4 = 0
            if (r0 != 0) goto L28
            X.0CZ r0 = r2.A0H
            if (r0 != 0) goto L28
            X.094 r1 = r2.A0n
            X.02j r0 = r1.A00
            boolean r0 = X.C003101m.A0U(r0)
            if (r0 == 0) goto Lb7
            boolean r0 = r1.A02
            if (r0 != 0) goto Lb7
            X.38p r0 = r7.A0X
            boolean r0 = r0 instanceof X.C68313Ja
            if (r0 != 0) goto Lb4
            r0 = 0
        L26:
            if (r0 != 0) goto Lb7
        L28:
            r0 = 1
        L29:
            r7.A03 = r0
            r6 = 0
            if (r8 == 0) goto L49
            X.0Ll r3 = r7.getRowsContainer()
            if (r3 == 0) goto L45
            boolean r4 = r3.AFv(r2)
            if (r4 == 0) goto Lad
            X.2rs r0 = r7.A06
            com.whatsapp.stickers.StickerView r1 = r0.A0M
            X.38f r0 = new X.38f
            r0.<init>()
            r1.A01 = r0
        L45:
            X.2rs r0 = r7.A06
            r0.A08 = r4
        L49:
            X.2rs r3 = r7.A06
            android.view.View$OnLongClickListener r0 = r7.A19
            com.whatsapp.stickers.StickerView r1 = r3.A0M
            r1.setOnLongClickListener(r0)
            boolean r0 = r7.A02
            r1.A02 = r0
            r3.A03(r2, r8)
            X.097 r0 = r7.getFMessage()
            boolean r0 = X.C0DB.A0n(r0)
            if (r0 == 0) goto L9b
            r3.A01()
        L66:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165528(0x7f070158, float:1.7945276E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup r4 = r7.A1C
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            X.092 r0 = r2.A0C()
            if (r0 != 0) goto Lc4
            X.0CZ r0 = r2.A0H
            if (r0 != 0) goto Lc4
            android.content.Context r1 = r4.getContext()
            X.097 r0 = super.getFMessage()
            X.094 r0 = r0.A0n
            boolean r0 = r0.A02
            if (r0 == 0) goto Lba
            r0 = 2131231008(0x7f080120, float:1.8078085E38)
            android.graphics.drawable.Drawable r0 = X.C02160Ac.A03(r1, r0)
            if (r0 != 0) goto Lcb
            throw r6
        L9b:
            X.097 r0 = r7.getFMessage()
            boolean r0 = X.C0DB.A0o(r0)
            if (r0 == 0) goto La9
            r3.A02()
            goto L66
        La9:
            r3.A00()
            goto L66
        Lad:
            X.2rs r0 = r7.A06
            com.whatsapp.stickers.StickerView r0 = r0.A0M
            r0.A01 = r6
            goto L45
        Lb4:
            r0 = 1
            goto L26
        Lb7:
            r0 = 0
            goto L29
        Lba:
            r0 = 2131230999(0x7f080117, float:1.8078067E38)
            android.graphics.drawable.Drawable r0 = X.C02160Ac.A03(r1, r0)
            if (r0 != 0) goto Lcb
            throw r6
        Lc4:
            r7.setDateWrapperBackground(r6)
            int r0 = -r5
            r3.topMargin = r0
            goto Ld0
        Lcb:
            r7.setDateWrapperBackground(r0)
            r3.topMargin = r5
        Ld0:
            r4.setLayoutParams(r3)
            r7.A0M()
            r7.A0l(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X7.A00(boolean):void");
    }

    @Override // X.AbstractC48202Eh
    public int A02() {
        if (this.A03) {
            if (super.getFMessage().A0C() == null && super.getFMessage().A0H == null) {
                View view = this.A05;
                if (view != null) {
                    return view.getBottom() + ((AbstractC48202Eh) this).A0C.getTop();
                }
            } else {
                return super.A02();
            }
        }
        return super.A02();
    }

    @Override // X.AbstractC48202Eh
    public int A03() {
        View view;
        return (!this.A03 || (view = this.A05) == null) ? super.A03() : view.getPaddingTop() + ((AbstractC48202Eh) this).A0C.getTop();
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A00(false);
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0M() {
        int A00;
        CircularProgressBar circularProgressBar = this.A06.A0C;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A00;
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A00(z2);
        }
    }

    @Override // X.C2X9
    public void AUy() {
        this.A06.A0M.A00();
    }

    @Override // X.AbstractC48202Eh
    public int getBubbleAlpha() {
        if (this.A03) {
            return super.getBubbleAlpha();
        }
        return 0;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_sticker_right;
    }

    @Override // X.AbstractC48202Eh
    public int getContentWidth() {
        View view;
        if (this.A03 && super.getFMessage().A0C() == null && super.getFMessage().A0H == null && this.A05 != null && (view = this.A04) != null) {
            return view.getMeasuredWidth();
        }
        return super.getContentWidth();
    }

    @Override // X.C2JE
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass097 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public C04040Ie getFMessage() {
        return (C04040Ie) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_sticker_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_sticker_right;
    }

    private void setDateWrapperBackground(Drawable drawable) {
        ViewGroup viewGroup = this.A1C;
        int dimensionPixelOffset = viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.conversation_row_sticker_date_padding_horizontal);
        int paddingBottom = viewGroup.getPaddingBottom();
        int paddingTop = viewGroup.getPaddingTop();
        viewGroup.setBackground(drawable);
        viewGroup.setPadding(dimensionPixelOffset, paddingTop, dimensionPixelOffset, paddingBottom);
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C04040Ie);
        super.setFMessage(anonymousClass092);
    }
}
