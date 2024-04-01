package X;

import java.util.regex.Pattern;

/* renamed from: X.1s6 */
/* loaded from: classes2.dex */
public class C40371s6 {
    public static final C00J A03 = C007203d.A00(new InterfaceC007103c() { // from class: X.3DD
        @Override // X.InterfaceC007103c
        public final Object get() {
            return Pattern.compile("\\+12225551[0-9]{3}");
        }
    });
    public static volatile C40371s6 A04;
    public final C04630Le A00;
    public final C0C8 A01;
    public final C00C A02;

    public C40371s6(C00C c00c, C04630Le c04630Le, C0C8 c0c8) {
        this.A02 = c00c;
        this.A00 = c04630Le;
        this.A01 = c0c8;
    }

    public static C40371s6 A00() {
        if (A04 == null) {
            synchronized (C40371s6.class) {
                if (A04 == null) {
                    A04 = new C40371s6(C00C.A00(), C04630Le.A00, C0C8.A00());
                }
            }
        }
        return A04;
    }

    public static boolean A01(String str) {
        if (str == null) {
            return false;
        }
        return ((Pattern) A03.get()).matcher(str).matches();
    }

    public boolean A02(C06C c06c) {
        if (this.A02.A00.A07(C01C.A3x) != 20) {
            if (this.A00 != null) {
                return A01(C04630Le.A01((AbstractC005302j) c06c.A03(AbstractC005302j.class)));
            }
            throw null;
        }
        return true;
    }
}
