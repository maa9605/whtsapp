package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Yz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07610Yz {
    public long A00;
    public String A01;
    public List A02;
    public List A03;

    /* renamed from: A00 */
    public C07610Yz clone() {
        C07610Yz c07610Yz = new C07610Yz();
        c07610Yz.A01 = this.A01;
        c07610Yz.A00 = this.A00;
        List list = this.A03;
        if (list != null && !list.isEmpty()) {
            c07610Yz.A03 = new ArrayList(this.A03);
        }
        if (A02()) {
            c07610Yz.A02 = new ArrayList(this.A02);
        }
        return c07610Yz;
    }

    public boolean A01() {
        return A03() || !TextUtils.isEmpty(this.A01);
    }

    public boolean A02() {
        List list = this.A02;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean A03() {
        List list = this.A03;
        return !(list == null || list.isEmpty()) || A02();
    }
}
