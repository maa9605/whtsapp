package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.06v */
/* loaded from: classes.dex */
public class C014406v {
    public String A00;
    public String A01;
    public String A02;
    public final C014506w A03;

    public C014406v(C014506w c014506w, String str, String str2, String str3) {
        this.A03 = c014506w;
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public static C014406v A00(String str, String str2, String str3) {
        if (C014506w.A03 == null) {
            synchronized (C014506w.class) {
                if (C014506w.A03 == null) {
                    C014506w.A03 = new C014506w(AnonymousClass012.A00());
                }
            }
        }
        return new C014406v(C014506w.A03, str, str2, str3);
    }

    public static String A01(String str, String str2) {
        StringBuilder A0P = C000200d.A0P("PAY: ");
        StringBuilder sb = new StringBuilder(" - ");
        sb.append(str);
        sb.append(":");
        A0P.append(sb.toString());
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(str2);
            A0P.append(sb2.toString());
        }
        return A0P.toString();
    }

    public final StringBuilder A02(String str, String str2) {
        StringBuilder A0P = C000200d.A0P("PAY: ");
        if (!TextUtils.isEmpty(this.A01)) {
            A0P.append(String.format("[%s]", this.A01));
        }
        if (TextUtils.isEmpty(str)) {
            str = this.A02;
        }
        A0P.append(String.format("[%s]", str));
        A0P.append(String.format("[%s]", this.A03.A01));
        StringBuilder sb = new StringBuilder(" - ");
        sb.append(this.A00);
        sb.append(":");
        A0P.append(sb.toString());
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(str2);
            A0P.append(sb2.toString());
        }
        return A0P;
    }

    public void A03(String str) {
        this.A03.A01();
        A02(null, str);
    }

    public void A04(String str) {
        this.A03.A01();
        C014506w.A00(A02(null, str).toString(), null);
    }

    public void A05(String str) {
        this.A03.A01();
        A02(null, str);
    }

    public void A06(String str, String str2, Throwable th) {
        this.A03.A01();
        C014506w.A00(A02(str, str2).toString(), th);
    }

    public void A07(String str, String str2, C03630Gl[] c03630GlArr) {
        int length;
        this.A03.A01();
        StringBuilder A02 = A02(str, str2);
        if (c03630GlArr != null && (length = c03630GlArr.length) > 0) {
            A02.append(" [");
            for (int i = 0; i < length; i++) {
                C03630Gl c03630Gl = c03630GlArr[i];
                StringBuilder A0P = C000200d.A0P("{");
                A0P.append(c03630Gl.A00);
                A0P.append(" : ");
                A0P.append(c03630Gl.A01);
                A0P.append("}");
                A02.append(A0P.toString());
                if (i != length - 1) {
                    A02.append(",");
                }
            }
            A02.append("]");
        }
        Log.i(A02.toString());
    }

    public void A08(String str, Throwable th) {
        this.A03.A01();
        C014506w.A00(A02(null, str).toString(), th);
    }
}
