package X;

import java.util.List;

/* renamed from: X.1px  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39331px extends C1ZL implements AnonymousClass114 {
    public long A00;
    public AnonymousClass114 A01;

    @Override // X.AnonymousClass114
    public List A9J(long j) {
        return this.A01.A9J(j - this.A00);
    }

    @Override // X.AnonymousClass114
    public long AA1(int i) {
        return this.A01.AA1(i) + this.A00;
    }

    @Override // X.AnonymousClass114
    public int AA2() {
        return this.A01.AA2();
    }

    @Override // X.AnonymousClass114
    public int ABa(long j) {
        return this.A01.ABa(j - this.A00);
    }
}
