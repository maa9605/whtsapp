package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0xO */
/* loaded from: classes.dex */
public class C20350xO {
    public static int A0D;
    public double A01;
    public double A03;
    public C20360xP A05;
    public final C20380xR A0B;
    public final String A0C;
    public final C20340xN A08 = new C20340xN();
    public final C20340xN A09 = new C20340xN();
    public final C20340xN A0A = new C20340xN();
    public boolean A07 = true;
    public double A02 = 0.005d;
    public double A00 = 0.005d;
    public CopyOnWriteArraySet A06 = new CopyOnWriteArraySet();
    public double A04 = 0.0d;

    public C20350xO(C20380xR c20380xR) {
        this.A0B = c20380xR;
        StringBuilder A0P = C000200d.A0P("spring:");
        int i = A0D;
        A0D = i + 1;
        A0P.append(i);
        this.A0C = A0P.toString();
        this.A05 = C20360xP.A02;
    }

    public void A00(double d) {
        if (this.A01 == d && A01()) {
            return;
        }
        this.A03 = this.A08.A00;
        this.A01 = d;
        this.A0B.A00(this.A0C);
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public boolean A01() {
        C20340xN c20340xN = this.A08;
        if (Math.abs(c20340xN.A01) <= 0.005d) {
            return Math.abs(this.A01 - c20340xN.A00) <= 0.005d || this.A05.A01 == 0.0d;
        }
        return false;
    }
}
