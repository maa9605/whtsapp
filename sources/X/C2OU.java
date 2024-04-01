package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0500000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2OU */
/* loaded from: classes2.dex */
public class C2OU {
    public static volatile C2OU A0D;
    public final C018508q A00;
    public final AnonymousClass012 A01;
    public final C0DK A02;
    public final C0C9 A03;
    public final C0C8 A04;
    public final C0EO A05;
    public final C0GZ A06;
    public final C2MY A07;
    public final C2OT A08;
    public final C463026g A09;
    public final C0DV A0A;
    public final C05U A0B;
    public final InterfaceC002901k A0C;

    public C2OU(AnonymousClass012 anonymousClass012, C018508q c018508q, InterfaceC002901k interfaceC002901k, C0EO c0eo, C05U c05u, C0DV c0dv, C0C9 c0c9, C0GZ c0gz, C2OT c2ot, C463026g c463026g, C2MY c2my, C0C8 c0c8, C0DK c0dk) {
        this.A01 = anonymousClass012;
        this.A00 = c018508q;
        this.A0C = interfaceC002901k;
        this.A05 = c0eo;
        this.A0B = c05u;
        this.A0A = c0dv;
        this.A03 = c0c9;
        this.A06 = c0gz;
        this.A08 = c2ot;
        this.A09 = c463026g;
        this.A07 = c2my;
        this.A04 = c0c8;
        this.A02 = c0dk;
    }

    public static C2OU A00() {
        if (A0D == null) {
            synchronized (C2OU.class) {
                if (A0D == null) {
                    A0D = new C2OU(AnonymousClass012.A00(), C018508q.A00(), C002801j.A00(), C0EO.A00(), C05U.A01(), C0DV.A00(), C0C9.A00(), C0GZ.A00(), C2OT.A00(), C463026g.A00(), C2MY.A00(), C0C8.A00(), C0DK.A00());
                }
            }
        }
        return A0D;
    }

    public void A01(Context context, AnonymousClass093 anonymousClass093) {
        C0DX c0dx;
        int AC8;
        InterfaceC03590Gh A02 = this.A0A.A02(anonymousClass093.A0E);
        if (A02 != null) {
            c0dx = A02.ACJ(anonymousClass093.A0G);
        } else {
            c0dx = null;
        }
        if (c0dx != null && (AC8 = c0dx.AC8()) != 0) {
            ((C0B5) context).AUl(0, R.string.unblock_payment_id_error_default, context.getString(AC8));
        } else {
            ((C0B5) context).AUl(0, R.string.payment_unblock_error, new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0014, code lost:
        if (r4.A00.A0H(com.whatsapp.jid.UserJid.of(r0)) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0040, code lost:
        if (((X.C45A) r1.A03().A9C()).A07(r3) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(android.content.Context r12, X.AnonymousClass093 r13, boolean r14, final X.C3NX r15) {
        /*
            r11 = this;
            X.2OT r4 = r11.A08
            r3 = 0
            if (r4 == 0) goto L62
            com.whatsapp.jid.UserJid r0 = r13.A0B
            if (r0 == 0) goto L16
            X.1rr r1 = r4.A00
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r1.A0H(r0)
            r2 = 1
            if (r0 != 0) goto L17
        L16:
            r2 = 0
        L17:
            X.0K8 r0 = r13.A09
            if (r0 == 0) goto L1f
            java.lang.String r3 = r0.A0A()
        L1f:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L42
            X.0DV r1 = r4.A04
            X.0DX r0 = r1.A03()
            X.0Gp r0 = r0.A9C()
            if (r0 == 0) goto L42
            X.0DX r0 = r1.A03()
            X.0Gp r0 = r0.A9C()
            X.45A r0 = (X.C45A) r0
            boolean r1 = r0.A07(r3)
            r0 = 1
            if (r1 != 0) goto L43
        L42:
            r0 = 0
        L43:
            if (r2 != 0) goto L4b
            if (r0 != 0) goto L4b
            r15.APE()
            return
        L4b:
            android.app.Activity r5 = X.C018308n.A00(r12)
            com.whatsapp.jid.UserJid r6 = r13.A0B
            X.0K8 r0 = r13.A09
            java.lang.String r7 = r0.A0A()
            r8 = 0
            X.3hT r10 = new X.3hT
            r10.<init>()
            r9 = r14
            r4.A01(r5, r6, r7, r8, r9, r10)
            return
        L62:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2OU.A02(android.content.Context, X.093, boolean, X.3NX):void");
    }

    public void A03(View view, C2OS c2os, AnonymousClass093 anonymousClass093, AnonymousClass092 anonymousClass092, boolean z, AbstractC27991Pp abstractC27991Pp, Button button) {
        AnonymousClass093 A0N;
        int i;
        C894547b c894547b;
        int i2;
        View findViewById = view.findViewById(R.id.request_decline_button);
        if (findViewById != null) {
            View findViewById2 = view.findViewById(R.id.request_pay_button);
            if (findViewById2 != null) {
                Context context = view.getContext();
                if (anonymousClass092 == null) {
                    A0N = null;
                } else {
                    C0DV c0dv = this.A0A;
                    c0dv.A04();
                    A0N = c0dv.A07.A0N(anonymousClass092.A0n.A01);
                }
                if (A06(anonymousClass093) || (A0N != null && !A0N.A0J())) {
                    if (z) {
                        view.setVisibility(8);
                        return;
                    }
                    findViewById2.setEnabled(false);
                    findViewById.setEnabled(false);
                    view.setVisibility(0);
                    return;
                }
                int i3 = anonymousClass093.A02;
                if (i3 == 20 && anonymousClass093.A01 == 12) {
                    findViewById2.setEnabled(true);
                    findViewById2.setOnClickListener(new ViewOnClickEBaseShape0S0500000_I0(this, context, anonymousClass093, anonymousClass092, c2os, 2));
                    findViewById.setEnabled(true);
                    findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0500000_I0(this, context, anonymousClass093, anonymousClass092, c2os, 3));
                    view.setVisibility(0);
                    return;
                } else if (abstractC27991Pp != null && i3 == 40 && ((i = anonymousClass093.A01) == 20 || i == 417 || i == 418)) {
                    C4CZ c4cz = (C4CZ) abstractC27991Pp;
                    C4GJ c4gj = (C4GJ) anonymousClass093.A09;
                    if (c4gj.A06 != null) {
                        if (i == 20) {
                            if (c4gj.A04 - ((AbstractC27991Pp) c4cz).A00.A03.A05() <= 0) {
                                return;
                            }
                            TextView textView = (TextView) findViewById2;
                            textView.setEnabled(true);
                            textView.setOnClickListener(new View$OnClickListenerC69283Nv(c4cz, context, anonymousClass093, c2os));
                            textView.setText(R.string.upi_mandate_payment_bottom_sheet_approve_payment_cta);
                            findViewById.setEnabled(true);
                            findViewById.setOnClickListener(new View$OnClickListenerC69253Ns(c4cz, context, anonymousClass093, c2os));
                            view.setVisibility(0);
                            if (button == null) {
                                return;
                            }
                            button.setVisibility(8);
                            return;
                        } else if (i != 417 && i != 418) {
                            view.setVisibility(8);
                            return;
                        } else {
                            findViewById2.setVisibility(8);
                            findViewById.setVisibility(8);
                            if (button != null && (c894547b = c4gj.A06) != null && c894547b.A0B) {
                                if (anonymousClass093.A01 == 418) {
                                    i2 = 0;
                                    button.setEnabled(false);
                                    button.setText(R.string.payments_request_canceling);
                                } else {
                                    i2 = 0;
                                    button.setEnabled(true);
                                    button.setText(R.string.cancel);
                                    button.setOnClickListener(new View$OnClickListenerC69263Nt(context, anonymousClass093));
                                }
                                button.setVisibility(i2);
                                view.setVisibility(i2);
                                return;
                            }
                            view.setVisibility(8);
                            return;
                        }
                    }
                    return;
                } else {
                    view.setVisibility(8);
                    return;
                }
            }
            throw null;
        }
        throw null;
    }

    public final void A04(View view, C2OS c2os, AnonymousClass093 anonymousClass093, boolean z, Button button) {
        UserJid userJid = anonymousClass093.A0C;
        View findViewById = view.findViewById(R.id.request_decline_button);
        if (findViewById != null) {
            View findViewById2 = view.findViewById(R.id.request_pay_button);
            if (findViewById2 == null) {
                throw null;
            }
            if (userJid == null || A06(anonymousClass093)) {
                view.setVisibility(8);
                return;
            }
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            view.setVisibility(8);
            if (z && button != null) {
                view.setVisibility(0);
                button.setVisibility(0);
                A05(button, anonymousClass093.A01 == 19, anonymousClass093, true);
                if (anonymousClass093.A01 != 19) {
                    button.setOnClickListener(new ViewOnClickEBaseShape0S0500000_I0(this, button, c2os, anonymousClass093, userJid, 1));
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    public final void A05(TextView textView, boolean z, AnonymousClass093 anonymousClass093, boolean z2) {
        if (z) {
            textView.setText(R.string.payments_request_canceling);
            textView.setEnabled(false);
            int i = anonymousClass093.A01;
            if (i != 19) {
                anonymousClass093.A01 = 19;
                C0DV c0dv = this.A0A;
                c0dv.A04();
                c0dv.A07.A0j(new AnonymousClass094(anonymousClass093.A0A, anonymousClass093.A0O, anonymousClass093.A0J), anonymousClass093, i, -1L, 0);
                return;
            }
            return;
        }
        textView.setEnabled(true);
        int i2 = R.string.cancel;
        if (z2) {
            i2 = R.string.payments_cancel_request;
        }
        textView.setText(i2);
        int i3 = anonymousClass093.A01;
        if (i3 == 12) {
            return;
        }
        anonymousClass093.A01 = 12;
        C0DV c0dv2 = this.A0A;
        c0dv2.A04();
        c0dv2.A07.A0j(new AnonymousClass094(anonymousClass093.A0A, anonymousClass093.A0O, anonymousClass093.A0J), anonymousClass093, i3, -1L, 0);
    }

    public final synchronized boolean A06(AnonymousClass093 anonymousClass093) {
        AbstractC005302j abstractC005302j = anonymousClass093.A0A;
        boolean z = false;
        if (abstractC005302j != null) {
            C06C A02 = this.A02.A02(abstractC005302j);
            if (A02.A0C()) {
                C0C8 c0c8 = this.A04;
                Jid A03 = A02.A03(C011005l.class);
                if (A03 != null) {
                    if (c0c8.A01((GroupJid) A03).A0B(c0c8.A01) && A02.A0Q) {
                        Jid A032 = A02.A03(C011005l.class);
                        if (A032 != null) {
                            if (!c0c8.A06((GroupJid) A032)) {
                                z = true;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
            return z;
        }
        return false;
    }
}
