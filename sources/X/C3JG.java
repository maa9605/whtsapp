package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;

/* renamed from: X.3JG  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JG extends C2GQ {
    public final C01B A00;
    public final C05M A01;

    public C3JG(ActivityC02320As activityC02320As, C018508q c018508q, InterfaceC002901k interfaceC002901k, C05M c05m, C40081rY c40081rY, C01B c01b, C0L7 c0l7, C06040Rh c06040Rh, C018708s c018708s, C002301c c002301c, C1M7 c1m7, AnonymousClass008 anonymousClass008, C2AR c2ar, C03320Ff c03320Ff, C06M c06m, C0LF c0lf, C0DK c0dk, C03360Fk c03360Fk, AbstractC005302j abstractC005302j, C06C c06c) {
        super(activityC02320As, c018508q, interfaceC002901k, c40081rY, c0l7, c06040Rh, c018708s, c002301c, c1m7, anonymousClass008, c2ar, c03320Ff, c06m, c0lf, c0dk, c03360Fk, abstractC005302j, c06c);
        this.A01 = c05m;
        this.A00 = c01b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r4.A01.A03(r3) <= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03() {
        /*
            r4 = this;
            X.06C r1 = r4.A0D
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r3 = r1.A03(r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.01B r1 = r4.A00
            X.03B r0 = X.C01C.A0n
            boolean r0 = r1.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L20
            if (r3 == 0) goto L20
            X.05M r0 = r4.A01
            int r0 = r0.A03(r3)
            r1 = 1
            if (r0 > 0) goto L21
        L20:
            r1 = 0
        L21:
            com.whatsapp.WaImageView r0 = r4.A0B
            if (r1 != 0) goto L27
            r2 = 8
        L27:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3JG.A03():void");
    }

    @Override // X.C2GQ, X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A03.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, activity, 3));
        AnonymousClass088.A1V(this.A03, R.string.accessibility_action_click_conversation_title_for_contact_info);
        A03();
    }
}
