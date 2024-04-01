package X;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2W6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2W6 extends C2W7 {
    public int A00;
    public C06810Vc A01;
    public C03230Ew A02;
    public C0W5 A03;
    public C06M A04;
    public C0L7 A05;
    public C2J8 A06;
    public C41321tj A07;
    public C38K A08;
    public C58932rw A09;
    public C0WZ A0A;
    public C0EA A0B;
    public C42471vn A0C;
    public InterfaceC002901k A0D;
    public C23W A0E;
    public C04110Ip A0F;
    public boolean A0G;
    public final ImageView A0H;
    public final LinearLayout A0I;
    public final LinearLayout A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final TextView A0M;
    public final TextView A0N;
    public final TextView A0O;
    public final TextView A0P;
    public final C0Zn A0Q;
    public final C23K A0R;
    public final ArrayList A0S;
    public final ArrayList A0T;

    public C2W6(Context context, AnonymousClass092 anonymousClass092, C0Zn c0Zn, C23K c23k) {
        super(context, anonymousClass092);
        this.A0S = new ArrayList();
        this.A0T = new ArrayList();
        this.A0Q = c0Zn;
        this.A0R = c23k;
        this.A0P = (TextView) findViewById(R.id.vcard_text);
        this.A0K = (TextView) findViewById(R.id.account_type);
        this.A0N = (TextView) findViewById(R.id.description);
        this.A0H = (ImageView) findViewById(R.id.picture);
        this.A0O = (TextView) findViewById(R.id.msg_contact_btn);
        this.A0L = (TextView) findViewById(R.id.action_contact_btn);
        this.A0I = (LinearLayout) findViewById(R.id.action_view_business_container);
        this.A0M = (TextView) findViewById(R.id.action_view_business);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.contact_card);
        this.A0J = linearLayout;
        linearLayout.setOnLongClickListener(this.A19);
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
        AnonymousClass092 fMessage = getFMessage();
        this.A0P.setTag(fMessage.A0n);
        C23W c23w = this.A0E;
        if (c23w != null) {
            this.A0R.A03(c23w);
        }
        C23W c23w2 = (C23W) this.A0R.A00(fMessage);
        this.A0E = c23w2;
        ((C0CI) c23w2).A01.A03(new C0CG() { // from class: X.37z
            /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
                if (android.text.TextUtils.isEmpty(r0.A08.A08) != false) goto L102;
             */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01a2  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01c3  */
            @Override // X.C0CG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void A54(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 550
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C656437z.A54(java.lang.Object):void");
            }
        }, ((AbstractC48182Ef) this).A0G.A06);
        A0k(C02180Ae.A0i(getContext(), fMessage));
        this.A05.A05(this.A0H, R.drawable.avatar_contact);
        if (fMessage.A14(1024)) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.web_page_preview_holder);
            if (viewGroup != null) {
                C3TK A00 = C3TK.A00(fMessage);
                viewGroup.setVisibility(0);
                if (this.A09 == null) {
                    C58932rw c58932rw = new C58932rw(getContext(), this.A02, this.A0A, this.A0C, A0F());
                    this.A09 = c58932rw;
                    viewGroup.addView(c58932rw.A0A, -1, -2);
                    this.A09.A0A.setOnLongClickListener(this.A19);
                }
                boolean A0i = A0i(A00.A03);
                this.A0G = A0i;
                this.A09.A01(fMessage, A0i, this, A00);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.web_page_preview_holder);
        if (viewGroup2 == null) {
            return;
        }
        C58932rw c58932rw2 = this.A09;
        if (c58932rw2 != null) {
            viewGroup2.removeView(c58932rw2.A0A);
            this.A09 = null;
        }
        viewGroup2.setVisibility(8);
    }

    public final void A0k(String str) {
        String A0K = AnonymousClass024.A0K(str, 128);
        Context context = getContext();
        TextView textView = this.A0P;
        textView.setText(A0G(C002701i.A0e(A0K, context, textView.getPaint(), this.A0l)));
    }

    public final boolean A0l(C04110Ip c04110Ip) {
        boolean z;
        if (c04110Ip == null) {
            return false;
        }
        List list = c04110Ip.A05;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AbstractC48182Ef) this).A0I.A0A(((C09010cT) it.next()).A01)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (list.size() > 0 && !z) {
                return true;
            }
        }
        List<C75903fj> list2 = c04110Ip.A02;
        if (list2 != null) {
            for (C75903fj c75903fj : list2) {
                if (c75903fj.A01 == ContactsContract.CommonDataKinds.Email.class) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_contact_left;
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_contact_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        if (this.A0G) {
            return (C2JE.A01(getContext()) * 72) / 100;
        }
        return super.getMainChildMaxWidth();
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_contact_right;
    }

    @Override // X.AbstractC48182Ef, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C38K c38k = this.A08;
        if (c38k != null) {
            c38k.A05(true);
            this.A08 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A0P.getText());
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.A0P.getText());
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
            boolean r0 = r3 instanceof X.C0D8
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
        throw new UnsupportedOperationException("Method not decompiled: X.C2W6.setFMessage(X.092):void");
    }
}
