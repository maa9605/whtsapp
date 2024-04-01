package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.06C */
/* loaded from: classes.dex */
public class C06C {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C04460Kg A08;
    public Jid A09;
    public UserJid A0A;
    public C04410Kb A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public Locale A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;

    public C06C(C04460Kg c04460Kg, String str, int i, String str2) {
        this.A04 = -1L;
        this.A0R = true;
        this.A08 = c04460Kg;
        this.A0F = str;
        this.A0C = Integer.valueOf(i);
        this.A0J = str2;
    }

    public C06C(Jid jid) {
        this.A04 = -1L;
        this.A0R = true;
        this.A09 = jid;
        this.A0X = true;
        this.A08 = null;
        if (C003101m.A0U(jid)) {
            this.A0B = C04410Kb.A04;
        }
    }

    public C06C(Jid jid, boolean z, String str, long j, String str2, int i, String str3) {
        this.A04 = -1L;
        this.A0R = true;
        this.A09 = jid;
        this.A0X = z;
        this.A0F = str2;
        if ((j > 0 || j == -2) && AnonymousClass024.A0m(str)) {
            this.A08 = new C04460Kg(j, str);
        }
        this.A0C = Integer.valueOf(i);
        this.A0J = str3;
    }

    public static boolean A00(List list, AbstractC27811Ow abstractC27811Ow) {
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    C06C c06c = (C06C) it.next();
                    C06C c06c2 = abstractC27811Ow.A00;
                    if (c06c != c06c2) {
                        Jid jid = c06c2.A09;
                        if (jid == null) {
                            Log.e("wacontact/updatecontact/invalid");
                        } else if (jid.equals(c06c.A09) && abstractC27811Ow.A00(c06c)) {
                        }
                        if (z) {
                        }
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    public long A01() {
        return this.A04;
    }

    public Jid A02() {
        return this.A09;
    }

    public Jid A03(Class cls) {
        if (cls.isInstance(this.A09)) {
            return (Jid) cls.cast(this.A09);
        }
        return null;
    }

    public String A04() {
        C04460Kg c04460Kg = this.A08;
        if (c04460Kg != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c04460Kg.A00);
            sb.append(":");
            sb.append(c04460Kg.A01);
            return sb.toString();
        }
        return C003101m.A07(this.A09);
    }

    public String A05() {
        return this.A0N;
    }

    public String A06(int i, float f) {
        StringBuilder sb = new StringBuilder();
        sb.append(A04());
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(f);
        return sb.toString();
    }

    public void A07(long j) {
        this.A04 = j;
    }

    public void A08(String str) {
        this.A0N = str;
    }

    public boolean A09() {
        return A0B() && this.A03 == 3;
    }

    public boolean A0A() {
        int i;
        if (C003101m.A0P(this.A09) || !TextUtils.isEmpty(this.A0F)) {
            return false;
        }
        return A05() == null || (i = this.A03) == 2 || i == 1;
    }

    public boolean A0B() {
        int i;
        return (A05() == null || (i = this.A03) == 0 || i == -1) ? false : true;
    }

    public boolean A0C() {
        Jid jid = this.A09;
        if (jid == null) {
            StringBuilder A0P = C000200d.A0P("row_id=");
            A0P.append(A01());
            A0P.append(" jid=");
            if (jid == null) {
                jid = "(null)";
            }
            A0P.append(jid);
            A0P.append(" key=");
            C04460Kg c04460Kg = this.A08;
            if (c04460Kg == null) {
                A0P.append("(null)");
            } else {
                A0P.append(c04460Kg.A00);
                A0P.append("-");
                A0P.append(c04460Kg.A01);
            }
            A0P.append(" phone=");
            A0P.append(this.A0C);
            A0P.append(" iswa=");
            A0P.append(this.A0X);
            if (A01() != -1) {
                StringBuilder A0P2 = C000200d.A0P("problematic contact:");
                A0P2.append(A0P.toString());
                Log.e(A0P2.toString());
                return false;
            }
            return false;
        }
        return C003101m.A0U(jid);
    }

    public boolean A0D() {
        return C003101m.A0P(this.A09);
    }

    public boolean A0E() {
        return A0B() && A09();
    }

    public boolean A0F() {
        return A0C() && this.A0S;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C06C c06c = (C06C) obj;
        if (AnonymousClass024.A0l(this.A09, c06c.A09)) {
            C04460Kg c04460Kg = this.A08;
            C04460Kg c04460Kg2 = c06c.A08;
            if (c04460Kg == null) {
                return c04460Kg2 == null;
            }
            return c04460Kg.equals(c04460Kg2);
        }
        return false;
    }

    public int hashCode() {
        C04460Kg c04460Kg = this.A08;
        if (c04460Kg != null) {
            return c04460Kg.hashCode();
        }
        Jid jid = this.A09;
        if (jid != null) {
            return jid.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("row_id=");
        A0P.append(A01());
        A0P.append(" jid=");
        Jid jid = this.A09;
        if (jid == null) {
            jid = "(null)";
        }
        A0P.append(jid);
        A0P.append(" key=");
        C04460Kg c04460Kg = this.A08;
        if (c04460Kg == null) {
            A0P.append("(null)");
        } else {
            A0P.append(c04460Kg.A00);
            A0P.append("-");
            A0P.append(AnonymousClass024.A0J(c04460Kg.A01, 4));
        }
        A0P.append(" phone=");
        A0P.append(this.A0C);
        A0P.append(" iswa=");
        A0P.append(this.A0X);
        if (A0C()) {
            A0P.append(" status=");
            A0P.append(this.A0L);
        }
        return A0P.toString();
    }
}
