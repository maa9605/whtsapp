package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.mediacomposer.doodle.DoodleView;

/* renamed from: X.3XV */
/* loaded from: classes2.dex */
public abstract class C3XV {
    public final C08o A00;
    public final C018508q A01;
    public final C02E A02;
    public final C002301c A03;
    public final C42441vk A04;
    public final AbstractC53802hX A05;

    public abstract long A00();

    public abstract void A04();

    public abstract void A05();

    public C3XV(C018508q c018508q, C02E c02e, C002301c c002301c, C42441vk c42441vk, C08o c08o, AbstractC53802hX abstractC53802hX) {
        this.A01 = c018508q;
        this.A02 = c02e;
        this.A03 = c002301c;
        this.A04 = c42441vk;
        this.A00 = c08o;
        this.A05 = abstractC53802hX;
    }

    public Context A01() {
        return this.A05.A00.A0A();
    }

    public View A02() {
        if (this instanceof C82153q3) {
            return ((C82153q3) this).A09;
        }
        if (this instanceof C82123q0) {
            return ((C82123q0) this).A00;
        }
        if (!(this instanceof C82113pz)) {
            return ((C82083pw) this).A05;
        }
        return ((C82113pz) this).A01;
    }

    public void A03() {
        if (!(this instanceof C82153q3)) {
            if (this instanceof C82123q0) {
                ((C82123q0) this).A05.A01();
                return;
            } else if (!(this instanceof C82113pz)) {
                ((C82083pw) this).A07.A01();
                return;
            } else {
                ((C82113pz) this).A06.A01();
                return;
            }
        }
        C82153q3 c82153q3 = (C82153q3) this;
        c82153q3.A0D();
        if (!c82153q3.A04) {
            c82153q3.A0C();
            if (c82153q3.A02 != null) {
                c82153q3.A0D();
                c82153q3.A02.A08();
            } else {
                C000200d.A1K(C000200d.A0P("statusplaybackvideo/no player for "), c82153q3.A0G.A0n);
            }
            DoodleView doodleView = c82153q3.A0E;
            if (doodleView != null) {
                doodleView.A02();
            }
            c82153q3.A0F();
        }
    }

    public void A06(boolean z) {
        if (this instanceof C82153q3) {
            C82153q3 c82153q3 = (C82153q3) this;
            c82153q3.A04 = z;
            AbstractC53812hY abstractC53812hY = ((C3XV) c82153q3).A05.A00;
            if (abstractC53812hY.A05) {
                AbstractC48662Ge abstractC48662Ge = c82153q3.A02;
                if (z) {
                    if (abstractC48662Ge != null) {
                        abstractC48662Ge.A06();
                        Bitmap A04 = c82153q3.A02.A04();
                        if (A04 != null) {
                            c82153q3.A0F.A06(A04);
                            c82153q3.A06 = true;
                        }
                    }
                    c82153q3.A08.setVisibility(0);
                    c82153q3.A0G();
                } else if (abstractC48662Ge == null) {
                    c82153q3.A0D();
                    c82153q3.A04();
                } else {
                    c82153q3.A0D();
                    abstractC53812hY.A0G();
                }
            }
        }
    }

    public boolean A07() {
        if (this instanceof C82153q3) {
            C82153q3 c82153q3 = (C82153q3) this;
            return C40731sm.A0m(((C3XV) c82153q3).A04, c82153q3.A0G);
        } else if (this instanceof C82123q0) {
            C82123q0 c82123q0 = (C82123q0) this;
            return C40731sm.A0m(((C3XV) c82123q0).A04, c82123q0.A04);
        } else if (!(this instanceof C82113pz)) {
            C82083pw c82083pw = (C82083pw) this;
            return C40731sm.A0m(((C3XV) c82083pw).A04, c82083pw.A06);
        } else {
            C82113pz c82113pz = (C82113pz) this;
            return C40731sm.A0m(((C3XV) c82113pz).A04, c82113pz.A05);
        }
    }

    public boolean A08() {
        View view;
        return (this instanceof C82113pz) && (view = ((C82113pz) this).A00) != null && view.getVisibility() == 0;
    }
}
