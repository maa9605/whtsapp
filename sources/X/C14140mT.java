package X;

import android.util.SparseBooleanArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import java.util.Map;

/* renamed from: X.0mT */
/* loaded from: classes.dex */
public final class C14140mT {
    public static final InterfaceC14110mQ A05 = new InterfaceC14110mQ() { // from class: X.1Tp
        @Override // X.InterfaceC14110mQ
        public boolean AF5(int i, float[] fArr) {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[0];
                if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    return true;
                }
            }
            return false;
        }
    };
    public final C14130mS A01;
    public final List A02;
    public final List A03;
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final Map A04 = new C006702y();

    public C14140mT(List list, List list2) {
        this.A02 = list;
        this.A03 = list2;
        int size = this.A02.size();
        int i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        C14130mS c14130mS = null;
        for (int i2 = 0; i2 < size; i2++) {
            C14130mS c14130mS2 = (C14130mS) this.A02.get(i2);
            int i3 = c14130mS2.A06;
            if (i3 > i) {
                c14130mS = c14130mS2;
                i = i3;
            }
        }
        this.A01 = c14130mS;
    }
}
