package X;

import java.util.regex.Pattern;

/* renamed from: X.01q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C003401q {
    public static volatile C003401q A05;
    public InterfaceC003501r A00;
    public final C001200o A01;
    public final C002301c A02;
    public final C05M A03;
    public final InterfaceC003501r A04 = new InterfaceC003501r() { // from class: X.0FM
        @Override // X.InterfaceC003501r
        public String A7y(double d, String str) {
            return str;
        }

        @Override // X.InterfaceC003501r
        public double AAK(String str) {
            return 0.0d;
        }
    };

    public C003401q(C001200o c001200o, C05M c05m, C002301c c002301c) {
        this.A01 = c001200o;
        this.A03 = c05m;
        this.A02 = c002301c;
    }

    public static C003401q A00() {
        if (A05 == null) {
            synchronized (C003401q.class) {
                if (A05 == null) {
                    A05 = new C003401q(C001200o.A01, C05M.A00(), C002301c.A00());
                }
            }
        }
        return A05;
    }

    public final synchronized InterfaceC003501r A01() {
        InterfaceC003501r interfaceC003501r;
        interfaceC003501r = this.A00;
        if (interfaceC003501r == null) {
            if ("ru".equals(this.A02.A04())) {
                interfaceC003501r = new InterfaceC003501r() { // from class: X.1nU
                    public final C72523a8[] A02 = {new C72523a8(Pattern.compile("\\bя\\s+\\S*ла\\b", 2), 1.0d), new C72523a8(Pattern.compile("\\bя\\s+\\S*лась\\b", 2), 1.5d), new C72523a8(Pattern.compile("\\bя\\s+\\S*л\\b", 2), -1.0d), new C72523a8(Pattern.compile("\\bя\\s+\\S*лся\\b", 2), -1.5d)};
                    public final Pattern A01 = Pattern.compile("[:\"«»„“”]");
                    public final Pattern A00 = Pattern.compile("\\(-?а\\)");

                    @Override // X.InterfaceC003501r
                    public String A7y(double d, String str) {
                        if (d > 8.0d) {
                            return this.A00.matcher(str).replaceAll("а");
                        }
                        return d < -8.0d ? this.A00.matcher(str).replaceAll("") : str;
                    }

                    @Override // X.InterfaceC003501r
                    public double AAK(String str) {
                        C72523a8[] c72523a8Arr;
                        if (this.A01.matcher(str).find()) {
                            return 0.0d;
                        }
                        for (C72523a8 c72523a8 : this.A02) {
                            if (c72523a8.A01.matcher(str).find()) {
                                return c72523a8.A00;
                            }
                        }
                        return 0.0d;
                    }
                };
                this.A00 = interfaceC003501r;
            } else {
                interfaceC003501r = this.A04;
                this.A00 = interfaceC003501r;
            }
        }
        return interfaceC003501r;
    }

    public String A02(AbstractC005302j abstractC005302j, int i, int i2, Object... objArr) {
        if (A01() != this.A04 && abstractC005302j != null) {
            InterfaceC003501r A01 = A01();
            C0IT c0it = (C0IT) this.A03.A0C().get(abstractC005302j);
            double d = c0it == null ? 0.0d : c0it.A00;
            C002301c c002301c = this.A02;
            return String.format(c002301c.A0I(), A01.A7y(d, c002301c.A08(i, i2)), objArr);
        }
        C002301c c002301c2 = this.A02;
        return String.format(c002301c2.A0I(), c002301c2.A08(i, i2), objArr);
    }

    public String A03(AbstractC005302j abstractC005302j, int i, Object... objArr) {
        if (A01() != this.A04 && abstractC005302j != null) {
            InterfaceC003501r A01 = A01();
            C0IT c0it = (C0IT) this.A03.A0C().get(abstractC005302j);
            return String.format(this.A02.A0I(), A01.A7y(c0it == null ? 0.0d : c0it.A00, this.A01.A00.getString(i)), objArr);
        }
        return this.A01.A00.getString(i, objArr);
    }
}
