package X;

/* renamed from: X.3EK  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3EK {
    public final /* synthetic */ C2H2 A00;

    public final void A00(float f) {
        C2H2 c2h2 = this.A00;
        int i = (int) f;
        c2h2.A00 = i;
        int max = Math.max(i, c2h2.A02);
        c2h2.A0K.setPadding(0, 0, 0, max);
        c2h2.A0K.requestLayout();
        c2h2.A0F(max);
    }
}
