package X;

/* renamed from: X.0N8  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0N8 extends C0N0 {
    public int A00;
    public int A01;
    public long A05;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0G;
    public String A0H;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public long A06 = -1;
    public int A03 = 0;
    public String A0F = "ACTIVE";
    public String A0I = "ACTIVE";
    public int A02 = 8;
    public int A04 = -1;

    @Override // X.C0N0
    public String A06() {
        return null;
    }

    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -891611359) {
            if (hashCode != 930084620) {
                if (hashCode == 1053567612 && str.equals("DISABLED")) {
                    return str;
                }
            } else if (str.equals("REQUIRES_VERIFICATION")) {
                return str;
            }
        } else if (str.equals("ENABLED")) {
            return str;
        }
        return null;
    }

    @Override // X.C0N0
    public String A07() {
        return this.A0B;
    }

    @Override // X.C0N0
    public boolean A09() {
        return this.A0X;
    }

    public String A0A() {
        return (this.A0U && "ACTIVE".equals(this.A0I)) ? this.A0X ? "ENABLED" : "REQUIRES_VERIFICATION" : "DISABLED";
    }

    public String A0B() {
        if (this.A0V && "ACTIVE".equals(this.A0I)) {
            String str = this.A0F;
            return (str == null || "ACTIVE".equals(str)) ? "ENABLED" : "REQUIRES_VERIFICATION";
        }
        return "DISABLED";
    }

    public String A0C() {
        return (this.A0V && "ACTIVE".equals(this.A0I)) ? this.A0X ? "ENABLED" : "REQUIRES_VERIFICATION" : "DISABLED";
    }
}
