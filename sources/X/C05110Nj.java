package X;

import android.content.Context;

/* renamed from: X.0Nj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05110Nj {
    public final Context A00;
    public final C0Ni A01;
    public final String A02;
    public final String A03;

    public C05110Nj(C0Ni c0Ni, Context context, String str) {
        String str2;
        String[] strArr = C19130uu.A00;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = null;
                break;
            }
            str2 = strArr[i];
            if (C05120Nk.A01(context, str2)) {
                break;
            }
            i++;
        }
        this.A03 = str2;
        this.A01 = c0Ni;
        this.A00 = context;
        this.A02 = str;
    }
}
