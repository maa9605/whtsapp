package X;

/* renamed from: X.0Xx */
/* loaded from: classes.dex */
public abstract class AbstractC07360Xx extends AbstractC07340Xv {
    public int A00;
    public int A01;
    public String A02;
    public C07Q[] A03;

    public boolean A02() {
        return false;
    }

    public AbstractC07360Xx() {
        super(null);
        this.A03 = null;
        this.A01 = 0;
    }

    public AbstractC07360Xx(AbstractC07360Xx abstractC07360Xx) {
        super(null);
        this.A03 = null;
        this.A01 = 0;
        this.A02 = abstractC07360Xx.A02;
        this.A00 = abstractC07360Xx.A00;
        this.A03 = C07O.A1D(abstractC07360Xx.A03);
    }

    public C07Q[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public void setPathData(C07Q[] c07qArr) {
        C07Q[] c07qArr2 = this.A03;
        if (!C07O.A1A(c07qArr2, c07qArr)) {
            this.A03 = C07O.A1D(c07qArr);
            return;
        }
        for (int i = 0; i < c07qArr.length; i++) {
            c07qArr2[i].A00 = c07qArr[i].A00;
            for (int i2 = 0; i2 < c07qArr[i].A01.length; i2++) {
                c07qArr2[i].A01[i2] = c07qArr[i].A01[i2];
            }
        }
    }
}
