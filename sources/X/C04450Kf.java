package X;

/* renamed from: X.0Kf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04450Kf extends C04360Jw {
    public String A00;
    public String A01;

    public C04450Kf(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, 1);
    }

    public C04450Kf(C04420Kc c04420Kc, C02630Ce c02630Ce, long j) {
        super(c04420Kc, c02630Ce, j, 1);
    }

    @Override // X.C04360Jw, X.AnonymousClass092
    public Object A0F() {
        return this.A01;
    }

    @Override // X.AnonymousClass092
    public String A0G() {
        return A19();
    }

    @Override // X.C04360Jw, X.AnonymousClass092
    public void A0k(Object obj) {
        if (obj instanceof String) {
            this.A01 = (String) obj;
        }
    }

    @Override // X.AnonymousClass092
    public void A0l(String str) {
        synchronized (this.A0o) {
            this.A00 = str;
        }
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public String A16() {
        String str;
        synchronized (this.A0o) {
            str = this.A00;
        }
        return str;
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public void A17(String str) {
        synchronized (this.A0o) {
            this.A00 = str;
        }
    }

    public String A19() {
        String str;
        synchronized (this.A0o) {
            str = this.A00;
        }
        return str;
    }
}
