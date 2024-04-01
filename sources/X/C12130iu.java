package X;

/* renamed from: X.0iu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12130iu {
    public int A00;
    public final Object[] A01 = new Object[256];

    public void A00(Object obj) {
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.A00 = i + 1;
        }
    }
}
