package X;

import android.view.View;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Yb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29721Yb implements InterfaceC016607s {
    public int A00;
    public int A01;
    public InterfaceC016607s A03;
    public final C016107n A05;
    public final AbstractC016307p A06;
    public final C29711Ya A07;
    public final AbstractC20840yL A08;
    public final AbstractC016907v A09;
    public long A02 = Long.MIN_VALUE;
    public final List A0A = new ArrayList();
    public boolean A04 = false;

    public C29721Yb(C016107n c016107n, AbstractC016907v abstractC016907v, AbstractC20840yL abstractC20840yL, C29711Ya c29711Ya, AbstractC016307p abstractC016307p) {
        this.A09 = abstractC016907v;
        this.A06 = abstractC016307p;
        this.A08 = abstractC20840yL;
        this.A05 = c016107n;
        this.A07 = c29711Ya;
    }

    @Override // X.InterfaceC016607s
    public InterfaceC016607s A8q(int i) {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.A8q(i);
        }
        return (InterfaceC016607s) this.A0A.get(i);
    }

    @Override // X.InterfaceC016607s
    public int A8v() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.A8v();
        }
        return this.A0A.size();
    }

    @Override // X.InterfaceC016607s
    public int AAT() {
        if (this.A04) {
            return this.A00;
        }
        return View.MeasureSpec.makeMeasureSpec((int) this.A08.getLayoutHeight(), 1073741824);
    }

    @Override // X.InterfaceC016607s
    public Object AAq() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.AAq();
        }
        return this.A08;
    }

    @Override // X.InterfaceC016607s
    public int ABn() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.ABn();
        }
        return C20580xl.A00(this.A08.getLayoutPadding(EnumC20800yE.BOTTOM));
    }

    @Override // X.InterfaceC016607s
    public int ABo() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.ABo();
        }
        return C20580xl.A00(this.A08.getLayoutPadding(EnumC20800yE.LEFT));
    }

    @Override // X.InterfaceC016607s
    public int ABp() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.ABp();
        }
        return C20580xl.A00(this.A08.getLayoutPadding(EnumC20800yE.RIGHT));
    }

    @Override // X.InterfaceC016607s
    public int ABq() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.ABq();
        }
        return C20580xl.A00(this.A08.getLayoutPadding(EnumC20800yE.TOP));
    }

    @Override // X.InterfaceC016607s
    public AbstractC016307p ACm() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.ACm();
        }
        return this.A06;
    }

    @Override // X.InterfaceC016607s
    public int AE3() {
        if (this.A04) {
            return this.A01;
        }
        return View.MeasureSpec.makeMeasureSpec((int) this.A08.getLayoutWidth(), 1073741824);
    }

    @Override // X.InterfaceC016607s
    public int AE7(int i) {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.AE7(i);
        }
        float[] fArr = ((YogaNodeJNIBase) this.A08.getChildAt(i)).arr;
        return (int) (fArr != null ? fArr[3] : 0.0f);
    }

    @Override // X.InterfaceC016607s
    public int AE8(int i) {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            return interfaceC016607s.AE8(i);
        }
        float[] fArr = ((YogaNodeJNIBase) this.A08.getChildAt(i)).arr;
        return (int) (fArr != null ? fArr[4] : 0.0f);
    }

    @Override // X.InterfaceC016607s
    public int getHeight() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            int height = interfaceC016607s.getHeight();
            AbstractC20840yL abstractC20840yL = this.A08;
            return height + C20580xl.A00(abstractC20840yL.getLayoutPadding(EnumC20800yE.TOP)) + C20580xl.A00(abstractC20840yL.getLayoutPadding(EnumC20800yE.BOTTOM));
        }
        return (int) this.A08.getLayoutHeight();
    }

    @Override // X.InterfaceC016607s
    public int getWidth() {
        InterfaceC016607s interfaceC016607s = this.A03;
        if (interfaceC016607s != null) {
            int width = interfaceC016607s.getWidth();
            AbstractC20840yL abstractC20840yL = this.A08;
            return width + C20580xl.A00(abstractC20840yL.getLayoutPadding(EnumC20800yE.LEFT)) + C20580xl.A00(abstractC20840yL.getLayoutPadding(EnumC20800yE.RIGHT));
        }
        return (int) this.A08.getLayoutWidth();
    }
}
