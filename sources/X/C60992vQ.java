package X;

import android.graphics.BitmapFactory;

/* renamed from: X.2vQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60992vQ {
    public int A00 = 1;
    public BitmapFactory.Options A01;
    public boolean A02;

    public C60992vQ() {
    }

    public C60992vQ(C60982vP c60982vP) {
    }

    public String toString() {
        String str;
        int i = this.A00;
        if (i == 0) {
            str = "Cancel";
        } else {
            str = i == 1 ? "Allow" : "?";
        }
        StringBuilder A0W = C000200d.A0W("thread state = ", str, ", options = ");
        A0W.append(this.A01);
        return A0W.toString();
    }
}
