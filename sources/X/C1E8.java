package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1E8  reason: invalid class name */
/* loaded from: classes.dex */
public class C1E8 {
    public int A03;
    public int A04;
    public RecyclerView A06;
    public boolean A08;
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public String A07 = "";
    public AbstractC15200oF A05 = new AbstractC15200oF() { // from class: X.1gE
        @Override // X.AbstractC15200oF
        public void A01(RecyclerView recyclerView, int i, int i2) {
            if (i != 0) {
                C1E8.this.A03 += i;
            }
            if (i2 != 0) {
                C1E8.this.A04 += i2;
            }
        }
    };
}
