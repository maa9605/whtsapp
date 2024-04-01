package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.List;

/* renamed from: X.1YW */
/* loaded from: classes.dex */
public class C1YW {
    public C08T A00;
    public boolean A01;
    public boolean A02;
    public long[] A03;
    public final Context A04;
    public final C05I A05 = new C05I();
    public final C08P A06;

    public C1YW(C08P c08p) {
        this.A04 = c08p.getContext();
        this.A06 = c08p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
        if (((android.view.View) r1).isLayoutRequested() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(android.content.Context r21, com.facebook.rendercore.RenderTreeNode r22, X.C20450xY r23) {
        /*
            r1 = r22
            X.07p r5 = r1.A07
            java.lang.Object r11 = r1.A08
            r3 = r23
            com.facebook.rendercore.RenderTreeNode r0 = r3.A01
            X.07p r6 = r0.A07
            java.lang.Object r10 = r0.A08
            java.lang.Object r4 = r3.A02
            r3.A01 = r1
            if (r6 == r5) goto L6f
            java.lang.Class r1 = r5.getClass()
            java.lang.String r0 = "Update Item: "
            X.C1YX.A00(r0, r1)
            java.util.List r0 = r5.A00
            if (r0 != 0) goto La6
            r0 = 0
        L22:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            java.util.List r0 = r6.A00
            if (r0 != 0) goto La1
            r0 = 0
        L2c:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r0)
            java.util.List r0 = r5.A01
            if (r0 != 0) goto L9c
            r0 = 0
        L36:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.List r0 = r6.A01
            if (r0 != 0) goto L97
            r0 = 0
        L40:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.List r7 = r6.A00
            java.util.List r8 = r5.A00
            java.util.Map r9 = r6.A02
            X.AbstractC016307p.A02(r7, r8, r9, r10, r11, r12, r13)
            java.util.List r14 = r6.A01
            java.util.List r15 = r5.A01
            java.util.Map r0 = r6.A03
            r17 = r10
            r18 = r11
            r20 = r1
            r19 = r2
            r16 = r0
            X.AbstractC016307p.A02(r14, r15, r16, r17, r18, r19, r20)
            r0 = r21
            X.AbstractC016307p.A01(r13, r0, r4, r10)
            X.AbstractC016307p.A01(r1, r0, r4, r10)
            X.AbstractC016307p.A00(r2, r0, r4, r11)
            X.AbstractC016307p.A00(r12, r0, r4, r11)
        L6f:
            long r4 = r5.A04()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L90
            java.lang.Object r1 = r3.A02
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L88
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1.isLayoutRequested()
            r2 = 1
            if (r0 != 0) goto L89
        L88:
            r2 = 0
        L89:
            com.facebook.rendercore.RenderTreeNode r1 = r3.A01
            java.lang.Object r0 = r3.A02
            X.C07K.A1L(r1, r0, r2)
        L90:
            X.C20500xd.A00()
            X.C20500xd.A00()
            return
        L97:
            int r0 = r0.size()
            goto L40
        L9c:
            int r0 = r0.size()
            goto L36
        La1:
            int r0 = r0.size()
            goto L2c
        La6:
            int r0 = r0.size()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1YW.A00(android.content.Context, com.facebook.rendercore.RenderTreeNode, X.0xY):void");
    }

    public void A01() {
        if (this.A03 == null) {
            return;
        }
        RenderTreeNode renderTreeNode = this.A00.A02;
        int i = 0;
        while (true) {
            List list = renderTreeNode.A00;
            if (i >= (list != null ? list.size() : 0)) {
                break;
            }
            A03((RenderTreeNode) renderTreeNode.A00.get(i));
            i++;
        }
        C05I c05i = this.A05;
        C20450xY c20450xY = (C20450xY) c05i.A04(0L, null);
        if (c20450xY != null) {
            if (c20450xY.A03) {
                Context context = this.A04;
                RenderTreeNode renderTreeNode2 = c20450xY.A01;
                AbstractC016307p.A01(renderTreeNode2.A07.A00, context, c20450xY.A02, renderTreeNode2.A08);
                if (0 != 0) {
                    throw null;
                }
                c20450xY.A03 = false;
            }
            c05i.A07(0L);
            AbstractC016307p.A01(renderTreeNode.A07.A01, this.A04, c20450xY.A02, renderTreeNode.A08);
            if (0 != 0) {
                throw null;
            }
        }
        this.A03 = null;
        this.A02 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x004f, code lost:
        if (r13 <= (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0051, code lost:
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.C08T r24) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1YW.A02(X.08T):void");
    }

    public final void A03(RenderTreeNode renderTreeNode) {
        AbstractC016307p abstractC016307p = renderTreeNode.A07;
        C05I c05i = this.A05;
        long A04 = abstractC016307p.A04();
        C20450xY c20450xY = (C20450xY) c05i.A04(A04, null);
        if (c20450xY == null) {
            return;
        }
        Object obj = c20450xY.A02;
        if (A04 == 0) {
            return;
        }
        c05i.A07(A04);
        List list = renderTreeNode.A00;
        if (list != null && list.size() > 0) {
            C08P c08p = (C08P) obj;
            int i = 0;
            while (true) {
                List list2 = renderTreeNode.A00;
                if (i >= (list2 != null ? list2.size() : 0)) {
                    break;
                }
                A03((RenderTreeNode) renderTreeNode.A00.get(i));
                i++;
            }
            if (c08p.getMountItemCount() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
            }
        }
        C08P c08p2 = c20450xY.A00;
        if (c20450xY.A03) {
            Context context = this.A04;
            RenderTreeNode renderTreeNode2 = c20450xY.A01;
            AbstractC016307p.A01(renderTreeNode2.A07.A00, context, c20450xY.A02, renderTreeNode2.A08);
            if (0 != 0) {
                throw null;
            }
            c20450xY.A03 = false;
        }
        c08p2.A02(renderTreeNode.A03, c20450xY);
        if (obj instanceof View) {
            ((View) obj).setPadding(0, 0, 0, 0);
        }
        Context context2 = this.A04;
        AbstractC016307p.A01(abstractC016307p.A01, context2, obj, renderTreeNode.A08);
        if (0 != 0) {
            throw null;
        }
        AbstractC016307p abstractC016307p2 = c20450xY.A01.A07;
        Object obj2 = c20450xY.A02;
        C13040kV A00 = C20470xa.A00(context2, abstractC016307p2.getClass());
        if (A00 != null) {
            A00.A01(obj2);
        }
    }
}
