package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.1nm */
/* loaded from: classes.dex */
public class C38241nm extends C28361Rm implements C0DE {
    public int A00;
    public int A01;
    public C38231nl A02;
    public AbstractC10640gP A03;
    public boolean A04;

    public C38241nm() {
        this(null, null);
    }

    public C38241nm(C38231nl c38231nl, Resources resources) {
        this.A01 = -1;
        this.A00 = -1;
        C38231nl c38231nl2 = new C38231nl(c38231nl, this, resources);
        super.A04(c38231nl2);
        this.A02 = c38231nl2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0225, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append(r27.getPositionDescription());
        r2.append(": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x023f, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C38241nm A00(android.content.Context r25, android.content.res.Resources r26, org.xmlpull.v1.XmlPullParser r27, android.util.AttributeSet r28, android.content.res.Resources.Theme r29) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38241nm.A00(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):X.1nm");
    }

    @Override // X.C28361Rm, X.C10680gT
    public AbstractC10670gS A03() {
        return new C38231nl(this.A02, this, null);
    }

    @Override // X.C28361Rm, X.C10680gT
    public void A04(AbstractC10670gS abstractC10670gS) {
        super.A04(abstractC10670gS);
        if (abstractC10670gS instanceof C38231nl) {
            this.A02 = (C38231nl) abstractC10670gS;
        }
    }

    @Override // X.C28361Rm
    public C28351Rl A05() {
        return new C38231nl(this.A02, this, null);
    }

    @Override // X.C10680gT, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC10640gP abstractC10640gP = this.A03;
        if (abstractC10640gP != null) {
            abstractC10640gP.A02();
            this.A03 = null;
            A02(this.A01);
            this.A01 = -1;
            this.A00 = -1;
        }
    }

    @Override // X.C28361Rm, X.C10680gT, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.A04) {
            super.mutate();
            if (this == this) {
                this.A02.A04();
                this.A04 = true;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00df, code lost:
        if (A02(r5) != false) goto L13;
     */
    @Override // X.C28361Rm, X.C10680gT, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38241nm.onStateChange(int[]):boolean");
    }

    @Override // X.C10680gT, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC10640gP abstractC10640gP = this.A03;
        if (abstractC10640gP != null && (visible || z2)) {
            if (!z) {
                jumpToCurrentState();
                return visible;
            }
            abstractC10640gP.A01();
        }
        return visible;
    }
}
