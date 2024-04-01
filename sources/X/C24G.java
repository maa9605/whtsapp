package X;

/* renamed from: X.24G  reason: invalid class name */
/* loaded from: classes2.dex */
public class C24G {
    public static volatile C24G A01;
    public final C06F A00 = new C06F(5);

    public synchronized C24I A00(C44981zy c44981zy) {
        C06F c06f = this.A00;
        C24I c24i = (C24I) c06f.A04(c44981zy);
        if (c24i != null) {
            return c24i;
        }
        C24I c24i2 = new C24I(c44981zy);
        c06f.A08(c44981zy, c24i2);
        return c24i2;
    }
}
