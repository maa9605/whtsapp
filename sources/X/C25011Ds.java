package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.1Ds */
/* loaded from: classes.dex */
public class C25011Ds {
    public final C021209s A00;

    public C25011Ds(C021209s c021209s) {
        this.A00 = c021209s;
    }

    public static InterfaceC020509l A00(C09P c09p, C021109r c021109r, C021209s c021209s) {
        C33321fi c33321fi = (C33321fi) c021209s.A00.get(R.id.bloks_interpreter_callback);
        if (c33321fi != null) {
            try {
                C1YX.A00("LispyEvaluation", null);
                int[] iArr = c33321fi.A01;
                iArr[0] = iArr[0] + 1;
            } finally {
                if (c33321fi != null) {
                    c33321fi.A00();
                }
            }
        }
        return AnonymousClass088.A0d(c09p, c021109r, c021209s);
    }
}
