package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1Zx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30141Zx implements AnonymousClass114 {
    public static final C30141Zx A01 = new C30141Zx();
    public final List A00;

    @Override // X.AnonymousClass114
    public int AA2() {
        return 1;
    }

    @Override // X.AnonymousClass114
    public int ABa(long j) {
        return j < 0 ? 0 : -1;
    }

    public C30141Zx() {
        this.A00 = Collections.emptyList();
    }

    public C30141Zx(AnonymousClass113 anonymousClass113) {
        this.A00 = Collections.singletonList(anonymousClass113);
    }

    @Override // X.AnonymousClass114
    public List A9J(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // X.AnonymousClass114
    public long AA1(int i) {
        C002701i.A1J(i == 0);
        return 0L;
    }
}
