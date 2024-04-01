package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.0xU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C20410xU {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ C1YV A03;

    public C20410xU(C1YV c1yv) {
        this.A03 = c1yv;
    }

    public static void A00(C20410xU c20410xU) {
        if (c20410xU.A02 != null) {
            C1YV c1yv = c20410xU.A03;
            C20450xY[] c20450xYArr = c1yv.A07;
            int length = c20450xYArr == null ? 0 : c20450xYArr.length;
            for (int i = c20410xU.A00; i < length; i++) {
                C20450xY c20450xY = c1yv.A07[i];
                if (c20450xY != null) {
                    if (c20450xY.A01.A07.A04 == EnumC20560xj.VIEW) {
                        c20410xU.A00 = i + 1;
                        return;
                    } else if (c20450xY.A03) {
                        ((Drawable) c20450xY.A02).draw(c20410xU.A02);
                    }
                }
            }
            c20410xU.A00 = c20410xU.A01;
        }
    }
}
