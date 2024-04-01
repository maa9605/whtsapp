package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.util.List;

/* renamed from: X.2W8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2W8 extends C2W9 {
    public C0L7 A00;
    public C05W A01;
    public C0EA A02;
    public C23W A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final C0Zn A07;
    public final C23K A08;
    public final ImageView[] A09;

    /* JADX WARN: Multi-variable type inference failed */
    public C2W8(Context context, AnonymousClass092 anonymousClass092, C0Zn c0Zn, C23K c23k) {
        super(context, anonymousClass092);
        this.A09 = new ImageView[3];
        this.A07 = c0Zn;
        this.A08 = c23k;
        this.A05 = (TextView) findViewById(R.id.vcard_text);
        this.A09[0] = findViewById(R.id.picture);
        this.A09[1] = findViewById(R.id.picture2);
        this.A09[2] = findViewById(R.id.picture3);
        this.A06 = (TextView) findViewById(R.id.view_contacts_btn);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.contact_card);
        this.A04 = linearLayout;
        linearLayout.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this));
        this.A04.setOnLongClickListener(this.A19);
        A0j();
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0e(false);
        A0j();
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        boolean z;
        C06C A0A;
        boolean z2;
        AnonymousClass092 fMessage = getFMessage();
        int A04 = C02180Ae.A04(fMessage);
        TextView textView = this.A05;
        AnonymousClass094 anonymousClass094 = fMessage.A0n;
        textView.setTag(anonymousClass094);
        C23W c23w = this.A03;
        if (c23w != null) {
            this.A08.A03(c23w);
        }
        C23W c23w2 = (C23W) this.A08.A00(fMessage);
        this.A03 = c23w2;
        ((C0CI) c23w2).A01.A03(new C0CG() { // from class: X.380
            @Override // X.C0CG
            public final void A54(Object obj) {
                C2W8 c2w8 = C2W8.this;
                C72753aX c72753aX = (C72753aX) obj;
                if (c72753aX.A01.A0n.equals(c2w8.A05.getTag())) {
                    int i = c72753aX.A00;
                    C04110Ip c04110Ip = c72753aX.A03;
                    c2w8.A0k(i, c04110Ip == null ? null : c04110Ip.A08(), c72753aX.A02);
                }
            }
        }, ((AbstractC48182Ef) this).A0G.A06);
        A0k(A04, null, null);
        if (A04 == 2) {
            this.A09[2].setVisibility(4);
        } else {
            this.A09[2].setVisibility(0);
        }
        if (!anonymousClass094.A02) {
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (C003101m.A0U(abstractC005302j)) {
                C05W c05w = this.A01;
                AbstractC005302j A0A2 = fMessage.A0A();
                if (A0A2 != null) {
                    A0A = c05w.A0A(A0A2);
                    z2 = (!this.A0p.A0O((C011005l) abstractC005302j)) & this.A02.A06(abstractC005302j) & true;
                } else {
                    throw null;
                }
            } else {
                C05W c05w2 = this.A01;
                if (abstractC005302j != null) {
                    A0A = c05w2.A0A(abstractC005302j);
                    z2 = true;
                } else {
                    throw null;
                }
            }
            boolean z3 = z2 & (A0A.A08 == null);
            C0EA c0ea = this.A02;
            Jid A03 = A0A.A03(AbstractC005302j.class);
            if (A03 == null) {
                throw null;
            }
            z = z3 & c0ea.A06((AbstractC005302j) A03);
        } else {
            z = false;
        }
        View findViewById = findViewById(R.id.button_div);
        if (!z) {
            TextView textView2 = this.A06;
            textView2.setVisibility(0);
            textView2.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this));
            return;
        }
        this.A06.setVisibility(8);
        findViewById.setVisibility(8);
    }

    public final void A0k(int i, String str, List list) {
        int i2 = 0;
        do {
            if (list != null && i2 < list.size()) {
                this.A07.A07((C04110Ip) list.get(i2), this.A09[i2]);
            } else {
                this.A00.A05(this.A09[i2], R.drawable.avatar_contact);
            }
            i2++;
        } while (i2 < 3);
        if (str != null) {
            int i3 = i - 1;
            String A0A = ((AbstractC48202Eh) this).A0J.A0A(R.plurals.contacts_array_title, i3, str, Integer.valueOf(i3));
            Context context = getContext();
            TextView textView = this.A05;
            textView.setText(A0G(C002701i.A0e(A0A, context, textView.getPaint(), this.A0l)));
            return;
        }
        this.A05.setText(((AbstractC48202Eh) this).A0J.A0A(R.plurals.n_contacts_message_title, i, Integer.valueOf(i)));
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_contacts_array_left;
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_contacts_array_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_contacts_array_right;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (X.C0DB.A0d(r3) != false) goto L8;
     */
    @Override // X.AbstractC48202Eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setFMessage(X.AnonymousClass092 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C0DA
            if (r0 != 0) goto Lb
            boolean r1 = X.C0DB.A0d(r3)
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            X.C000700j.A07(r0)
            super.setFMessage(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2W8.setFMessage(X.092):void");
    }
}
