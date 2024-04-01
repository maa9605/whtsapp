package X;

/* renamed from: X.11n */
/* loaded from: classes.dex */
public final class C222311n {
    public final int A00;
    public final C222111l A01;
    public final Object A02;
    public final C21180yv[] A03;

    public C222311n(C21180yv[] c21180yvArr, InterfaceC222011k[] interfaceC222011kArr, Object obj) {
        this.A03 = c21180yvArr;
        this.A01 = new C222111l(interfaceC222011kArr);
        this.A02 = obj;
        this.A00 = c21180yvArr.length;
    }

    public boolean A00(C222311n c222311n, int i) {
        return c222311n != null && C08M.A08(this.A03[i], c222311n.A03[i]) && C08M.A08(this.A01.A02[i], c222311n.A01.A02[i]);
    }
}
