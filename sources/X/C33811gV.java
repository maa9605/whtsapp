package X;

import android.view.View;

/* renamed from: X.1gV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33811gV implements InterfaceC017307z {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public View A06;

    public C33811gV() {
    }

    public C33811gV(C25231Eo c25231Eo) {
    }

    @Override // X.InterfaceC017307z
    public boolean ASi(AnonymousClass087 anonymousClass087, AnonymousClass084 anonymousClass084, InterfaceC020509l interfaceC020509l) {
        if (AnonymousClass088.A20(anonymousClass084, C25181Ej.A04)) {
            try {
                float A01 = C08i.A01((String) AnonymousClass088.A0q(interfaceC020509l));
                this.A04 = A01;
                View view = this.A06;
                if (view != null) {
                    view.setTranslationX(A01);
                }
                return true;
            } catch (C018208m e) {
                StringBuilder sb = new StringBuilder("Could not parse translation_x value. ");
                sb.append(e);
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (AnonymousClass088.A20(anonymousClass084, C25181Ej.A05)) {
            try {
                float A012 = C08i.A01((String) AnonymousClass088.A0q(interfaceC020509l));
                this.A05 = A012;
                View view2 = this.A06;
                if (view2 != null) {
                    view2.setTranslationY(A012);
                }
                return true;
            } catch (C018208m e2) {
                StringBuilder sb2 = new StringBuilder("Could not parse translation_y value. ");
                sb2.append(e2);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else if (AnonymousClass088.A20(anonymousClass084, C25181Ej.A02)) {
            float floatValue = ((Number) interfaceC020509l).floatValue();
            this.A02 = floatValue;
            View view3 = this.A06;
            if (view3 != null) {
                view3.setScaleX(floatValue);
            }
            return true;
        } else if (AnonymousClass088.A20(anonymousClass084, C25181Ej.A03)) {
            float floatValue2 = ((Number) interfaceC020509l).floatValue();
            this.A03 = floatValue2;
            View view4 = this.A06;
            if (view4 != null) {
                view4.setScaleY(floatValue2);
            }
            return true;
        } else if (AnonymousClass088.A20(anonymousClass084, C25181Ej.A00)) {
            float floatValue3 = ((Number) interfaceC020509l).floatValue();
            this.A00 = floatValue3;
            View view5 = this.A06;
            if (view5 != null) {
                view5.setAlpha(floatValue3);
            }
            return true;
        } else if (AnonymousClass088.A20(anonymousClass084, C25181Ej.A01)) {
            float floatValue4 = ((Number) interfaceC020509l).floatValue();
            this.A01 = floatValue4;
            View view6 = this.A06;
            if (view6 != null) {
                view6.setRotation(floatValue4);
            }
            return true;
        } else {
            return false;
        }
    }
}
