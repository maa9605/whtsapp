package X;

import java.io.File;

/* renamed from: X.0It */
/* loaded from: classes.dex */
public class C04150It {
    public final InterfaceC43611xg A00;
    public final C04140Is A01;
    public final C43591xe A02;
    public final C22a A03;
    public final C456422x A04;

    public int A01() {
        return 0;
    }

    public C04150It(C04140Is c04140Is, C43591xe c43591xe, C22a c22a, InterfaceC43611xg interfaceC43611xg) {
        this.A01 = c04140Is;
        this.A02 = c43591xe;
        this.A03 = c22a;
        this.A00 = interfaceC43611xg;
        this.A04 = new C456422x();
    }

    public C04150It(C43591xe c43591xe, C454622d c454622d) {
        InterfaceC43611xg interfaceC43611xg = c454622d.A0H;
        C04140Is A00 = c454622d.A00();
        C22a c22a = c454622d.A0K.A02;
        this.A01 = A00;
        this.A02 = c43591xe;
        this.A03 = c22a;
        this.A00 = interfaceC43611xg;
        this.A04 = new C456422x();
    }

    public int A00() {
        return this.A02.A01;
    }

    public C0DC A02() {
        return this.A02.A05;
    }

    public File A03() {
        File file = this.A02.A06;
        if (file != null) {
            return file;
        }
        throw null;
    }

    public String toString() {
        return C000200d.A0L(new StringBuilder("[job_id="), this.A01.A0C, "]");
    }
}
