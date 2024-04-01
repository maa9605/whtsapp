package com.whatsapp.payments.ui;

import X.C000700j;
import X.C003701t;
import X.C02160Ac;
import X.C06570Tx;
import X.C06C;
import X.C0DV;
import X.C0DW;
import X.C0GZ;
import X.C0HK;
import X.C0We;
import X.C3NU;
import X.C3RC;
import X.C4LM;
import X.C58002qQ;
import X.C78373jo;
import X.InterfaceC05620Pl;
import X.RunnableC69873Qc;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class PaymentInvitePickerActivity extends C4LM {
    public C003701t A00;
    public C0GZ A01;
    public C0DW A02;
    public C0DV A03;
    public C78373jo A04;

    @Override // X.AbstractActivityC40691si
    public int A1T() {
        return Integer.MAX_VALUE;
    }

    @Override // X.AbstractActivityC40691si
    public int A1U() {
        return 1;
    }

    @Override // X.AbstractActivityC40691si
    public int A1R() {
        return R.string.payments_invite_others_title;
    }

    @Override // X.AbstractActivityC40691si
    public int A1S() {
        return R.plurals.payments_invite_limit_warning;
    }

    @Override // X.AbstractActivityC40691si
    public int A1V() {
        return R.string.next;
    }

    @Override // X.AbstractActivityC40691si
    public Drawable A1W() {
        return new C0We(this.A0S, C02160Ac.A03(this, R.drawable.ic_fab_next));
    }

    @Override // X.AbstractActivityC40691si
    public void A1b() {
        ArrayList arrayList = new ArrayList(A1X());
        final C3RC c3rc = new C3RC(this.A00, this.A03, this.A01, this.A04, this, new RunnableC69873Qc(this, arrayList));
        C000700j.A06(false);
        C3NU ACB = c3rc.A03.A03().ACB();
        if (ACB != null) {
            C0HK c0hk = c3rc.A04.A00;
            c0hk.A0B(0);
            DialogFragment ACA = ACB.ACA(arrayList, false);
            c3rc.A00.AUh(ACA);
            c0hk.A05(ACA, new InterfaceC05620Pl() { // from class: X.3jn
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    Runnable runnable;
                    C3RC c3rc2 = c3rc;
                    int intValue = ((Number) obj).intValue();
                    if (intValue != 1 && intValue == 2 && (runnable = c3rc2.A05) != null) {
                        runnable.run();
                    }
                }
            });
        }
    }

    @Override // X.AbstractActivityC40691si
    public void A1j(C58002qQ c58002qQ, C06C c06c) {
        super.A1j(c58002qQ, c06c);
        c58002qQ.A02.setText(R.string.payments_multi_invite_picker_subtitle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x006a, code lost:
        if (r1.A06(r7.ACI()) != 3) goto L34;
     */
    @Override // X.AbstractActivityC40691si
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1m(java.util.ArrayList r9) {
        /*
            r8 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.05W r0 = r8.A0J
            X.060 r2 = r0.A05
            r1 = 1
            r0 = 0
            r2.A0V(r3, r1, r0, r0)
            X.0DV r0 = r8.A03
            X.0DX r0 = r0.A03()
            X.3NU r7 = r0.ACB()
            if (r7 == 0) goto L94
            X.0DV r0 = r8.A03
            r0.A04()
            X.06l r1 = r0.A08
            monitor-enter(r1)
            java.util.List r0 = r1.A0C()     // Catch: java.lang.Throwable -> L91
            monitor-exit(r1)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r2 = r0.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r1 = r2.next()
            X.0TN r1 = (X.C0TN) r1
            com.whatsapp.jid.UserJid r0 = r1.A03
            r5.put(r0, r1)
            goto L32
        L44:
            java.util.Iterator r6 = r3.iterator()
        L48:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r4 = r6.next()
            X.06C r4 = (X.C06C) r4
            com.whatsapp.jid.Jid r0 = r4.A02()
            java.lang.Object r1 = r5.get(r0)
            X.0TN r1 = (X.C0TN) r1
            if (r1 == 0) goto L6c
            int r0 = r7.ACI()
            int r1 = r1.A06(r0)
            r0 = 3
            r3 = 1
            if (r1 == r0) goto L6d
        L6c:
            r3 = 0
        L6d:
            X.1rr r1 = r8.A0G
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A03(r2)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A0H(r0)
            if (r0 != 0) goto L48
            X.0DW r1 = r8.A02
            com.whatsapp.jid.Jid r0 = r4.A03(r2)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L48
            if (r3 != 0) goto L48
            r9.add(r4)
            goto L48
        L91:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentInvitePickerActivity.A1m(java.util.ArrayList):void");
    }

    @Override // X.C4LM, X.AbstractActivityC40691si, X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04 = (C78373jo) new C06570Tx(this).A00(C78373jo.class);
    }
}
