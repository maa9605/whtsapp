package X;

import android.os.Handler;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;

/* renamed from: X.3L3  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3L3 implements C3H4 {
    public final /* synthetic */ C48742Gm A00;
    public final /* synthetic */ Runnable A01;

    public C3L3(C48742Gm c48742Gm, Runnable runnable) {
        this.A00 = c48742Gm;
        this.A01 = runnable;
    }

    public void A00() {
        C48742Gm c48742Gm = this.A00;
        c48742Gm.A0N.A05 = true;
        if (c48742Gm.A0I.A02 || c48742Gm.A0J.A01 != null) {
            Handler handler = c48742Gm.A07;
            Runnable runnable = this.A01;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 400L);
        }
    }

    public void A01() {
        C48742Gm c48742Gm = this.A00;
        C48752Gn c48752Gn = c48742Gm.A0N;
        c48752Gn.A05 = false;
        C63542zx c63542zx = c48742Gm.A0I;
        if (c63542zx.A02 || c48742Gm.A0J.A01 != null) {
            C2HF c2hf = c48742Gm.A0M;
            C2HG c2hg = c2hf.A01;
            c48742Gm.A07.removeCallbacks(this.A01);
            if (c48742Gm.A0A()) {
                return;
            }
            if (c2hg == null) {
                c48742Gm.A0C.A04(true);
            } else if (c2hg.A0C() || c63542zx.A02) {
                ColorPickerComponent colorPickerComponent = c48742Gm.A0C;
                if (!(colorPickerComponent.A06.getVisibility() == 0)) {
                    colorPickerComponent.A00();
                }
            }
            c48752Gn.A01();
            c48742Gm.A0G.setSystemUiVisibility(1280);
            c48752Gn.A0B.setUndoButtonVisibility(c2hf.A03.A00.isEmpty() ^ true ? 0 : 8);
            c48752Gn.A09(c48742Gm.A0D.A01, c48742Gm.A09.A0N());
            c48742Gm.A02.A02();
        }
    }

    public void A02(C2HG c2hg) {
        C48742Gm c48742Gm;
        boolean A0D = c2hg.A0D();
        if (!A0D && !c2hg.A0C()) {
            c48742Gm = this.A00;
            c48742Gm.A0C.A04(true);
        } else {
            C48742Gm c48742Gm2 = this.A00;
            c48742Gm = c48742Gm2;
            ColorPickerComponent colorPickerComponent = c48742Gm2.A0C;
            colorPickerComponent.A00();
            if (c2hg.A0C()) {
                int color = c2hg.A02.getColor();
                if (color != 0) {
                    colorPickerComponent.setColorAndInvalidate(color);
                }
                colorPickerComponent.setColorPaletteAndInvalidate(!(c2hg instanceof C68693Lb) ? 1 : ((C68693Lb) c2hg).A01);
            }
            if (A0D) {
                colorPickerComponent.setSizeAndInvalidate(c48742Gm2.A0G.A00 * c2hg.A00());
            }
        }
        c48742Gm.A05();
    }
}
