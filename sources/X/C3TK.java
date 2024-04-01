package X;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.3TK */
/* loaded from: classes2.dex */
public class C3TK {
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;

    public C3TK(String str, String str2, String str3, String str4, boolean z, int i) {
        int i2;
        this.A01 = null;
        int i3 = 0;
        this.A03 = false;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            this.A02 = null;
        } else {
            String A01 = C04310Jr.A01(str3);
            if (A01 != null) {
                this.A02 = A01;
                this.A01 = str4;
                if (TextUtils.isEmpty(str4)) {
                    this.A01 = A01;
                }
            } else {
                this.A02 = null;
            }
        }
        if (TextUtils.isEmpty(this.A02)) {
            return;
        }
        String str5 = this.A02;
        String str6 = this.A01;
        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
            i3 = C72973at.A01(str6);
        }
        this.A00 = i3;
        boolean z2 = false;
        if (i3 != 0 && z && ((i3 != 4 || ((i2 = Build.VERSION.SDK_INT) != 21 && i2 != 22)) && i == 1)) {
            z2 = true;
        }
        this.A03 = z2;
    }

    public C3TK(String str, String str2, boolean z, int i) {
        this.A01 = null;
        this.A03 = false;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = i;
    }

    public static C3TK A00(AnonymousClass092 anonymousClass092) {
        int i;
        C0CZ c0cz = anonymousClass092.A0H;
        boolean z = false;
        if (c0cz != null) {
            if (c0cz.A01 == 2) {
                String str = c0cz.A03;
                int A01 = C72973at.A01(str);
                String str2 = c0cz.A06;
                if (A01 != 0 && 1 != 0 && ((A01 != 4 || ((i = Build.VERSION.SDK_INT) != 21 && i != 22)) && 1 == 1)) {
                    z = true;
                }
                return new C3TK(str2, str, z, A01);
            }
            return new C3TK(c0cz.A06, c0cz.A07, false, 0);
        } else if (anonymousClass092 instanceof C0JJ) {
            C0JJ c0jj = (C0JJ) anonymousClass092;
            return new C3TK(c0jj.A04, c0jj.A02, c0jj.A0G(), c0jj.A05, c0jj.A1D() != null, c0jj.A00);
        } else {
            return new C3TK(null, null, false, 0);
        }
    }
}
