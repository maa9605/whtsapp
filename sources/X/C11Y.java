package X;

/* renamed from: X.11Y  reason: invalid class name */
/* loaded from: classes.dex */
public final class C11Y implements Comparable {
    public final int A00;
    public final C11U A01;

    public C11Y(int i, C11U c11u) {
        this.A00 = i;
        this.A01 = c11u;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.A00 - ((C11Y) obj).A00;
    }
}
