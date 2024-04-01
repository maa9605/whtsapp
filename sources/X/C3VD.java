package X;

/* renamed from: X.3VD  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3VD {
    public int A00 = -1;
    public String A01;
    public boolean A02;
    public final ActivityC02290Ap A03;
    public final C000500h A04;

    public C3VD(ActivityC02290Ap activityC02290Ap, C000500h c000500h) {
        this.A03 = activityC02290Ap;
        this.A04 = c000500h;
    }

    public void A00() {
        this.A02 = false;
        C28E.A00 = this.A04.A00.getString("registration_failure_reason", "");
        String str = this.A01;
        if (str != null) {
            this.A03.AUm(str);
        }
        int i = this.A00;
        if (i != -1) {
            C002701i.A19(this.A03, i);
        }
        this.A01 = null;
        this.A00 = -1;
    }

    public void A01(int i) {
        if (this.A02) {
            this.A00 = i;
        } else {
            C002701i.A19(this.A03, i);
        }
    }

    public void A02(int i) {
        if (!this.A02) {
            ActivityC02290Ap activityC02290Ap = this.A03;
            if (!activityC02290Ap.isFinishing()) {
                activityC02290Ap.AUj(i);
                return;
            }
        }
        ActivityC02290Ap activityC02290Ap2 = this.A03;
        activityC02290Ap2.getString(i);
        this.A01 = activityC02290Ap2.getString(i);
    }

    public void A03(String str) {
        if (!this.A02) {
            ActivityC02290Ap activityC02290Ap = this.A03;
            if (!activityC02290Ap.isFinishing()) {
                activityC02290Ap.AUm(str);
                return;
            }
        }
        this.A01 = str;
    }
}
