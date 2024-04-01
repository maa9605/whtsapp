package X;

/* renamed from: X.1fi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33321fi {
    public final /* synthetic */ C020209i A00;
    public final /* synthetic */ int[] A01;

    public C33321fi(int[] iArr, C020209i c020209i) {
        this.A01 = iArr;
        this.A00 = c020209i;
    }

    public void A00() {
        C20500xd.A00();
        int[] iArr = this.A01;
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            this.A00.A02();
        } else if (i >= 0) {
        } else {
            throw new IllegalStateException("negative recursion level");
        }
    }
}
