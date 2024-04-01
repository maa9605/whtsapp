package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2vV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61042vV {
    public int A00;
    public final int A02;
    public final C3BE A03;
    public long A01 = SystemClock.uptimeMillis();
    public final List A04 = new ArrayList();

    public C61042vV(C3BE c3be, int i) {
        this.A03 = c3be;
        this.A02 = i;
    }

    public void A00(C61052vW c61052vW) {
        if (this.A00 < this.A02) {
            C3BE c3be = this.A03;
            List singletonList = Collections.singletonList(c61052vW);
            if (c3be != null) {
                ((C0HS) c3be).A02.A00(singletonList);
            } else {
                throw null;
            }
        } else {
            List list = this.A04;
            list.add(c61052vW);
            if (this.A01 + 1000 < SystemClock.uptimeMillis()) {
                ArrayList arrayList = new ArrayList(list);
                list.clear();
                C3BE c3be2 = this.A03;
                if (c3be2 != null) {
                    ((C0HS) c3be2).A02.A00(arrayList);
                    this.A01 = SystemClock.uptimeMillis();
                } else {
                    throw null;
                }
            }
        }
        this.A00++;
    }
}
