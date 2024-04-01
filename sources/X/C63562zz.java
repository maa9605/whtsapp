package X;

import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.2zz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C63562zz {
    public RectF A00;
    public C2HG A01;
    public final C67793Gw A02;
    public final C63512zu A03;
    public final C63552zy A04;
    public final AnonymousClass309 A05;
    public final C637130o A06;

    public C63562zz(C63512zu c63512zu, C637130o c637130o, AnonymousClass309 anonymousClass309, C67793Gw c67793Gw) {
        this.A03 = c63512zu;
        this.A04 = new C63552zy(c63512zu);
        this.A06 = c637130o;
        this.A05 = anonymousClass309;
        this.A02 = c67793Gw;
    }

    public final void A00() {
        C63512zu c63512zu = this.A03;
        if (c63512zu.A07 == null) {
            return;
        }
        RectF rectF = new RectF();
        c63512zu.A09.mapRect(rectF, c63512zu.A07);
        int i = c63512zu.A04;
        int i2 = c63512zu.A03;
        float width = rectF.width() / rectF.height();
        float f = i;
        float f2 = i2;
        if (width > f / f2) {
            f2 = f / width;
        } else {
            f = f2 * width;
        }
        float f3 = i / 2;
        float f4 = i2 / 2;
        float f5 = f / 2.0f;
        float f6 = f2 / 2.0f;
        RectF rectF2 = new RectF(f3 - f5, f4 - f6, f3 + f5, f4 + f6);
        RectF rectF3 = this.A00;
        if (rectF3 == null || !rectF3.equals(rectF2)) {
            this.A00 = rectF2;
            AnonymousClass309 anonymousClass309 = this.A05;
            anonymousClass309.A02.set(rectF2);
            for (AnonymousClass308 anonymousClass308 : anonymousClass309.A05.values()) {
                View view = anonymousClass308.A06;
                if (view != null) {
                    anonymousClass308.A07.removeView(view);
                }
            }
            anonymousClass309.A05.clear();
            Map map = anonymousClass309.A05;
            Handler handler = anonymousClass309.A09;
            ViewGroup viewGroup = anonymousClass309.A0A;
            map.put(1, new C3H9(1, handler, viewGroup, anonymousClass309.A02, anonymousClass309.A03));
            anonymousClass309.A05.put(2, new C3H9(2, handler, viewGroup, anonymousClass309.A02, anonymousClass309.A03));
            anonymousClass309.A05.put(3, new C3HA(handler, viewGroup, anonymousClass309.A02, anonymousClass309.A03));
        }
    }
}
