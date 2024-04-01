package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.04x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C009604x {
    public final C01B A00;
    public final AnonymousClass050 A01;
    public final C009704y A02;
    public final C04r A03;
    public final C04o A04;
    public final C009304p A05;
    public final C009804z A06;
    public final C01J A07;
    public final C01R A08;

    public C009604x(C01B c01b, C01R c01r, C01J c01j, C04o c04o, C009304p c009304p, C04q c04q, C04r c04r, C04s c04s, C04u c04u) {
        this.A00 = c01b;
        this.A08 = c01r;
        this.A07 = c01j;
        this.A05 = c009304p;
        this.A02 = new C009704y(c01r, c01j, c04q);
        this.A06 = new C009804z(c01r, c04s);
        this.A04 = c04o;
        this.A03 = c04r;
        this.A01 = new AnonymousClass050(c01r, c01j, c04u);
    }

    public static C05020My A00(int i, C05010Mx c05010Mx) {
        byte[] A00 = c05010Mx.A00().A00.A00();
        int length = A00.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(A00, 1, bArr, 0, length);
        return new C05020My(AnonymousClass029.A1d(i), bArr, null);
    }

    public C1R9 A01() {
        try {
            C27301Mv A03 = this.A03.A03();
            C1R8 c1r8 = new C1R8(A03.A01);
            InterfaceC02660Ch A15 = AnonymousClass029.A15(A03.A00);
            Log.i("axolotl loading identity key pair");
            return new C1R9(c1r8, A15);
        } catch (C02650Cg unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public C1RS A02(C0XR c0xr) {
        try {
            return new C1RS(this.A07.A0C(C002701i.A0U(c0xr)).A00());
        } catch (IOException unused) {
            throw new AssertionError("serialize/deserialize failed from Session object");
        }
    }

    public void A03(C0XR c0xr, C1R8 c1r8) {
        C0IP c0ip;
        if (c1r8 == null) {
            c0ip = null;
        } else {
            try {
                c0ip = new C0IP(C002701i.A0S(c1r8.A00.A00()));
            } catch (C05240Nw unused) {
                throw new AssertionError("Conversion between ECPublicKey and CurvePublicKey should never fail");
            }
        }
        this.A07.A0M(C002701i.A0U(c0xr), c0ip);
    }

    public void A04(C0XR c0xr, C1RS c1rs) {
        this.A08.A00();
        try {
            if (c1rs.A01.A0I().length != 0) {
                this.A05.A02(C002701i.A0U(c0xr), c1rs.A01());
                return;
            }
            throw new IOException("Alice base key missing from session");
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot store invalid session", e);
        }
    }
}
