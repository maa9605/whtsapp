package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;

/* renamed from: X.3JN  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JN extends C2GQ {
    public final C58462rB A00;

    public C3JN(ActivityC02320As activityC02320As, C018508q c018508q, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C0L7 c0l7, C06040Rh c06040Rh, C018708s c018708s, C002301c c002301c, C1M7 c1m7, AnonymousClass008 anonymousClass008, C2AR c2ar, C03320Ff c03320Ff, C06M c06m, C0LF c0lf, C0DK c0dk, C03360Fk c03360Fk, C0I1 c0i1, C06C c06c) {
        super(activityC02320As, c018508q, interfaceC002901k, c40081rY, c0l7, c06040Rh, c018708s, c002301c, c1m7, anonymousClass008, c2ar, c03320Ff, c06m, c0lf, c0dk, c03360Fk, c0i1, c06c);
        this.A00 = new C58462rB(interfaceC002901k, c018708s, c0i1, new InterfaceC58452rA() { // from class: X.37X
            @Override // X.InterfaceC58452rA
            public final void AKs() {
                C3JN.this.A02();
            }
        });
    }

    @Override // X.C2GQ
    public void A01() {
        super.A01();
        this.A00.A00();
    }

    @Override // X.C2GQ, X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A08.setText(R.string.tap_for_list_info);
        this.A03.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, activity, 5));
        AnonymousClass088.A1V(this.A03, R.string.accessibility_action_click_conversation_title_for_broadcast_list_info);
    }

    @Override // X.C2GQ, X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        C58462rB c58462rB = this.A00;
        C655237n c655237n = c58462rB.A00;
        if (c655237n != null) {
            c655237n.A0A();
            c58462rB.A00 = null;
        }
    }
}
