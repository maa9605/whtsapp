package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0xb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C20480xb {
    public static final AbstractC016307p A00;

    static {
        final EnumC20560xj enumC20560xj = EnumC20560xj.VIEW;
        A00 = new AbstractC016307p(enumC20560xj) { // from class: X.1pb
            @Override // X.AbstractC016307p
            public long A04() {
                return 0L;
            }

            @Override // X.AbstractC016307p
            public Object A07(Context context) {
                return null;
            }
        };
    }

    public static RenderTreeNode A00(InterfaceC016607s interfaceC016607s, AbstractC016307p abstractC016307p, Rect rect, RenderTreeNode renderTreeNode) {
        Rect rect2;
        int i;
        if (interfaceC016607s.ABo() == 0 && interfaceC016607s.ABq() == 0 && interfaceC016607s.ABp() == 0 && interfaceC016607s.ABn() == 0) {
            rect2 = null;
        } else {
            rect2 = new Rect(interfaceC016607s.ABo(), interfaceC016607s.ABq(), interfaceC016607s.ABp(), interfaceC016607s.ABn());
        }
        Object AAq = interfaceC016607s.AAq();
        if (renderTreeNode != null) {
            List list = renderTreeNode.A00;
            i = list != null ? list.size() : 0;
        } else {
            i = 0;
        }
        return new RenderTreeNode(renderTreeNode, abstractC016307p, AAq, rect, rect2, i);
    }

    public static void A01(Context context, InterfaceC016607s interfaceC016607s, RenderTreeNode renderTreeNode, int i, int i2, ArrayList arrayList) {
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (interfaceC016607s.getWidth() == 0 && interfaceC016607s.getHeight() == 0) {
            return;
        }
        Rect rect = new Rect(i, i2, interfaceC016607s.getWidth() + i, interfaceC016607s.getHeight() + i2);
        arrayList.size();
        AbstractC016307p ACm = interfaceC016607s.ACm();
        if (ACm != null) {
            int A8v = interfaceC016607s.A8v();
            RenderTreeNode A002 = A00(interfaceC016607s, ACm, rect, renderTreeNode);
            if (A8v > 0) {
                arrayList.add(A002);
                List list = renderTreeNode.A00;
                if (list == null) {
                    list = new ArrayList(4);
                    renderTreeNode.A00 = list;
                }
                list.add(A002);
            } else {
                arrayList.add(A002);
                List list2 = renderTreeNode.A00;
                if (list2 == null) {
                    list2 = new ArrayList(4);
                    renderTreeNode.A00 = list2;
                }
                list2.add(A002);
                A002 = renderTreeNode;
            }
            renderTreeNode2 = A002;
            i = 0;
            i2 = 0;
        }
        for (int i3 = 0; i3 < interfaceC016607s.A8v(); i3++) {
            A01(context, interfaceC016607s.A8q(i3), renderTreeNode2, interfaceC016607s.AE7(i3) + i, interfaceC016607s.AE8(i3) + i2, arrayList);
        }
    }
}
