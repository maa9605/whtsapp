package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* renamed from: X.45d */
/* loaded from: classes3.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC889645d implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public View A01;
    public AnonymousClass087 A02;
    public C09P A03;
    public C09P A04;
    public String A05;
    public boolean A06;

    public final void A00() {
        AnonymousClass087 anonymousClass087 = this.A02;
        if (anonymousClass087 != null) {
            this.A06 = false;
            C09P c09p = this.A04;
            if (c09p != null) {
                int i = this.A00;
                ArrayList arrayList = new ArrayList();
                InterfaceC020509l A0f = AnonymousClass088.A0f(this.A05);
                if (arrayList.size() == 0) {
                    arrayList.add(A0f);
                    C25031Du.A00(i, c09p, new C021109r(arrayList), anonymousClass087);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0016, code lost:
        if (r2 == 8) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x002f, code lost:
        if (r2 == 8) goto L36;
     */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onGlobalLayout() {
        /*
            r6 = this;
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L1e
            X.087 r0 = r6.A02
            if (r0 == 0) goto L1e
            boolean r0 = r6.A06
            if (r0 == 0) goto L1f
            int r2 = r1.getVisibility()
            r0 = 4
            if (r2 == r0) goto L18
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L1f
            r6.A00()
        L1e:
            return
        L1f:
            boolean r0 = r6.A06
            if (r0 != 0) goto L1e
            android.view.View r0 = r6.A01
            int r2 = r0.getVisibility()
            r0 = 4
            if (r2 == r0) goto L31
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L32
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L1e
            X.087 r5 = r6.A02
            if (r5 == 0) goto L1e
            r0 = 1
            r6.A06 = r0
            X.09P r4 = r6.A03
            if (r4 == 0) goto L1e
            int r3 = r6.A00
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = r6.A05
            X.09l r1 = X.AnonymousClass088.A0f(r0)
            int r0 = r2.size()
            if (r0 != 0) goto L5e
            r2.add(r1)
            X.09r r0 = new X.09r
            r0.<init>(r2)
            X.C25031Du.A00(r3, r4, r0, r5)
            return
        L5e:
            java.lang.String r1 = "arguments have to be continuous"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserver$OnGlobalLayoutListenerC889645d.onGlobalLayout():void");
    }
}
