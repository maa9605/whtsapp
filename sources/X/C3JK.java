package X;

import android.app.Activity;

/* renamed from: X.3JK  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JK extends C2GQ {
    public final C01B A00;
    public final C58462rB A01;
    public final C0C8 A02;
    public final InterfaceC61762wg A03;
    public final C456823b A04;
    public final C011005l A05;

    public C3JK(ActivityC02320As activityC02320As, C018508q c018508q, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C01B c01b, C0L7 c0l7, C06040Rh c06040Rh, C018708s c018708s, C002301c c002301c, C1M7 c1m7, AnonymousClass008 anonymousClass008, C2AR c2ar, C03320Ff c03320Ff, C06M c06m, C456823b c456823b, C0C8 c0c8, C0LF c0lf, C0DK c0dk, C03360Fk c03360Fk, C011005l c011005l, C06C c06c) {
        super(activityC02320As, c018508q, interfaceC002901k, c40081rY, c0l7, c06040Rh, c018708s, c002301c, c1m7, anonymousClass008, c2ar, c03320Ff, c06m, c0lf, c0dk, c03360Fk, c011005l, c06c);
        this.A03 = new InterfaceC61762wg() { // from class: X.37T
            @Override // X.InterfaceC61762wg
            public final void AGo(AbstractC005302j abstractC005302j) {
                C3JK c3jk = C3JK.this;
                if (c3jk.A0Y.equals(abstractC005302j)) {
                    c3jk.A01();
                }
            }
        };
        this.A04 = c456823b;
        this.A02 = c0c8;
        this.A05 = c011005l;
        this.A00 = c01b;
        this.A01 = new C58462rB(interfaceC002901k, c018708s, c011005l, new InterfaceC58452rA() { // from class: X.37W
            @Override // X.InterfaceC58452rA
            public final void AKs() {
                C3JK.this.A02();
            }
        });
    }

    @Override // X.C2GQ
    public void A01() {
        super.A01();
        this.A01.A00();
        A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3.A0D.A00 <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03() {
        /*
            r3 = this;
            X.01B r1 = r3.A00
            X.03B r0 = X.C01C.A0n
            boolean r0 = r1.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L12
            X.06C r0 = r3.A0D
            int r0 = r0.A00
            r1 = 1
            if (r0 > 0) goto L13
        L12:
            r1 = 0
        L13:
            com.whatsapp.WaImageView r0 = r3.A0B
            if (r1 != 0) goto L19
            r2 = 8
        L19:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3JK.A03():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (r0 == false) goto L11;
     */
    @Override // X.C2GQ, X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            super.onActivityCreated(r4, r5)
            X.06C r1 = r3.A0D
            boolean r0 = r1.A0S
            if (r0 == 0) goto L31
            r1 = 2131890831(0x7f12128f, float:1.9416365E38)
        Lc:
            android.widget.TextView r0 = r3.A08
            r0.setText(r1)
            android.view.ViewGroup r2 = r3.A03
            r1 = 4
            com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1 r0 = new com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1
            r0.<init>(r3, r4, r1)
            r2.setOnClickListener(r0)
            android.view.ViewGroup r1 = r3.A03
            r0 = 2131886121(0x7f120029, float:1.9406812E38)
            X.AnonymousClass088.A1V(r1, r0)
            r3.A03()
            X.23b r0 = r3.A04
            X.2wg r1 = r3.A03
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            return
        L31:
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L42
            X.0C8 r1 = r3.A02
            X.05l r0 = r3.A05
            boolean r0 = r1.A06(r0)
            r1 = 2131888530(0x7f120992, float:1.9411698E38)
            if (r0 != 0) goto Lc
        L42:
            r1 = 2131890106(0x7f120fba, float:1.9414894E38)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3JK.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // X.C2GQ, X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        C456823b c456823b = this.A04;
        c456823b.A00.remove(this.A03);
        C58462rB c58462rB = this.A01;
        C655237n c655237n = c58462rB.A00;
        if (c655237n != null) {
            c655237n.A0A();
            c58462rB.A00 = null;
        }
    }
}
