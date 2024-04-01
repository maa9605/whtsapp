package X;

/* renamed from: X.3ms  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C80193ms implements C3VZ {
    public final C41891ug A00;

    @Override // X.C3VZ
    public int ABO() {
        return 15;
    }

    public C80193ms(C41891ug c41891ug) {
        this.A00 = c41891ug;
    }

    @Override // X.C3VZ
    public void A6S() {
        C41891ug c41891ug = this.A00;
        C41861ud c41861ud = c41891ug.A01;
        if (c41861ud.A01() == 7) {
            C16480qT A01 = c41891ug.A01();
            if (A01 == null) {
                c41891ug.A02();
                return;
            }
            if (A01.A04.contains(Long.toString(c41861ud.A02()))) {
                return;
            }
            c41891ug.A00.A02("com.whatsapp.schedulers.work.PERIODIC");
            c41891ug.A02();
        }
    }

    @Override // X.C3VZ
    public boolean AFj() {
        C16480qT A01 = this.A00.A01();
        if (A01 == null) {
            return false;
        }
        return !A01.A03.A00();
    }

    @Override // X.C3VZ
    public void ASC() {
        this.A00.A02();
    }

    @Override // X.C3VZ
    public void cancel() {
        this.A00.A00.A02("com.whatsapp.schedulers.work.PERIODIC");
    }
}
