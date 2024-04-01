package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;

/* renamed from: X.2WR  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2WR extends C2WS {
    public InterfaceC43821y3 A00;
    public C42471vn A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;
    public final TextAndDateLayout A09;

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return 0;
    }

    public C2WR(Context context, C04570Ky c04570Ky) {
        super(context, c04570Ky);
        this.A00 = new InterfaceC43821y3() { // from class: X.38P
            @Override // X.InterfaceC43821y3
            public int ADA() {
                return 96;
            }

            @Override // X.InterfaceC43821y3
            public void AKM() {
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                ImageView imageView = C2WR.this.A06;
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setImageResource(R.drawable.avatar_group);
                }
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                C2WR.this.A06.setImageResource(R.drawable.avatar_group);
            }
        };
        this.A08 = (TextEmojiLabel) findViewById(R.id.group_name);
        this.A06 = (ImageView) findViewById(R.id.avatar);
        this.A09 = (TextAndDateLayout) findViewById(R.id.text_and_date);
        this.A03 = findViewById(R.id.button_div);
        this.A07 = (TextEmojiLabel) findViewById(R.id.group_invite_caption);
        this.A05 = findViewById(R.id.view_contacts_btn);
        this.A04 = findViewById(R.id.expired_invitation_container);
        this.A02 = findViewById(R.id.action_text);
        A0j();
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0j();
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r4.A06 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0j() {
        /*
            r10 = this;
            X.092 r4 = super.getFMessage()
            X.0Ky r4 = (X.C04570Ky) r4
            com.whatsapp.TextEmojiLabel r1 = r10.A08
            java.lang.String r0 = r4.A04
            r1.setText(r0)
            X.C003301p.A06(r1)
            java.lang.String r6 = r4.A03
            X.012 r0 = r10.A0X
            long r7 = r0.A05()
            long r2 = r4.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            boolean r0 = r4.A06
            r9 = 0
            if (r0 == 0) goto L27
        L26:
            r9 = 1
        L27:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r2 = 1
            r5 = 8
            r3 = 0
            if (r0 != 0) goto Lb4
            com.whatsapp.TextEmojiLabel r0 = r10.A07
            r10.A0a(r6, r0, r4, r2)
            android.view.View r1 = r10.A03
            r0 = 0
            if (r9 == 0) goto L3d
            r0 = 8
        L3d:
            r1.setVisibility(r0)
        L40:
            com.whatsapp.components.TextAndDateLayout r8 = r10.A09
            if (r8 == 0) goto L6b
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r7 = 7
            r6 = -2
            r0 = -1
            if (r1 == 0) goto La1
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r0, r6)
            r0 = 2131363303(0x7f0a05e7, float:1.834641E38)
            r1.addRule(r7, r0)
            r1.addRule(r5, r0)
            r8.setLayoutParams(r1)
            android.view.ViewGroup r2 = r10.A1C
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r2.measure(r1, r0)
        L6b:
            r0 = 6
            com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0 r1 = new com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0
            r1.<init>(r4, r10, r0)
            if (r9 == 0) goto L8e
            r0 = 0
            r10.setOnClickListener(r0)
            r10.setClickable(r3)
            android.view.View r0 = r10.A05
            r0.setVisibility(r5)
            android.view.View r0 = r10.A04
            r0.setVisibility(r3)
        L84:
            X.1vn r2 = r10.A01
            android.widget.ImageView r1 = r10.A06
            X.1y3 r0 = r10.A00
            r2.A0C(r4, r1, r0, r3)
            return
        L8e:
            r10.setOnClickListener(r1)
            android.view.View r0 = r10.A02
            r0.setOnClickListener(r1)
            android.view.View r0 = r10.A04
            r0.setVisibility(r5)
            android.view.View r0 = r10.A05
            r0.setVisibility(r3)
            goto L84
        La1:
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0, r6)
            r1 = 2131363303(0x7f0a05e7, float:1.834641E38)
            r2.addRule(r7, r1)
            r0 = 3
            r2.addRule(r0, r1)
            r8.setLayoutParams(r2)
            goto L6b
        Lb4:
            com.whatsapp.TextEmojiLabel r1 = r10.A07
            java.lang.String r0 = ""
            r10.A0a(r0, r1, r4, r2)
            android.view.View r0 = r10.A03
            r0.setVisibility(r5)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2WR.A0j():void");
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public C04570Ky getFMessage() {
        return (C04570Ky) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_group_invite_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_group_invite_right;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C04570Ky);
        super.setFMessage(anonymousClass092);
    }
}
