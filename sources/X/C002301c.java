package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.01c */
/* loaded from: classes.dex */
public class C002301c {
    public static final boolean A0B;
    public static volatile C002301c A0C;
    public static volatile boolean A0D;
    public Context A00;
    public C0DF A01;
    public DateFormat A02;
    public DateFormat A03;
    public Locale A04;
    public Locale A05;
    public boolean A06;
    public final C001200o A07;
    public final C000500h A08;
    public final Object A09 = new Object();
    public final Set A0A = new HashSet();

    static {
        A0B = Build.VERSION.SDK_INT < 26;
    }

    public C002301c(C001200o c001200o, C000500h c000500h) {
        this.A07 = c001200o;
        this.A08 = c000500h;
        Context A01 = A01();
        this.A00 = A01;
        Locale A0H = C003101m.A0H(A01.getResources().getConfiguration());
        this.A05 = A0H;
        this.A04 = A0H;
        C002501g.A00 = null;
        C002501g.A01 = null;
        C002501g.A02 = null;
    }

    public static C002301c A00() {
        if (A0C == null) {
            synchronized (C002301c.class) {
                if (A0C == null) {
                    A0C = new C002301c(C001200o.A01, C000500h.A00());
                }
            }
        }
        return A0C;
    }

    public Context A01() {
        Context baseContext;
        Context baseContext2 = this.A07.A00.getBaseContext();
        while ((baseContext2 instanceof ContextWrapper) && (baseContext = ((ContextWrapper) baseContext2).getBaseContext()) != null) {
            baseContext2 = baseContext;
        }
        return baseContext2;
    }

    public final C0DF A02() {
        C0DF c0df;
        synchronized (this.A09) {
            if (this.A01 == null) {
                C0HC c0hc = new C0HC("WhatsAppLocale/setDerivedFieldsUnderLock/fieldCreationTimer");
                this.A01 = new C0DF(this.A00, this.A04);
                c0hc.A01();
            }
            c0df = this.A01;
        }
        return c0df;
    }

    public String A03() {
        String country = A0I().getCountry();
        if (country != null && AbstractC003201n.A03.matcher(country).matches()) {
            return country;
        }
        C000200d.A18("verifynumber/requestcode/invalid-country '", country, "'");
        return "ZZ";
    }

    public String A04() {
        String language = A0I().getLanguage();
        if (language != null && AbstractC003201n.A02.matcher(language).matches()) {
            return language;
        }
        C000200d.A18("verifynumber/requestcode/invalid-language '", language, "'");
        return "zz";
    }

    public String A05(int i) {
        C0Ob c0Ob = A02().A02.A00;
        if (c0Ob == null) {
            Log.e("CldrResources/getString: CLDR data not loaded");
            return "";
        }
        return C0DG.A02(c0Ob, i);
    }

    public String A06(int i) {
        C0DF A02 = A02();
        if (A02.A07) {
            return this.A00.getResources().getString(i);
        }
        String A04 = A02.A03.A04(i, false, -1);
        return A04 == null ? this.A00.getResources().getString(i) : A04;
    }

    public String A07(int i) {
        return this.A00.getResources().getString(i);
    }

    public String A08(int i, long j) {
        C0DF A02 = A02();
        if (A02.A07) {
            return this.A00.getResources().getQuantityString(i, j != 1 ? 2 : 1);
        }
        String A04 = A02.A03.A04(i, true, Long.valueOf(j));
        return A04 != null ? A04 : this.A00.getResources().getQuantityString(i, (int) j);
    }

    public String A09(int i, long j, Object... objArr) {
        return String.format(A0I(), A02().A02.A03(i, Long.valueOf(j)), objArr);
    }

    public String A0A(int i, long j, Object... objArr) {
        return String.format(A0I(), A08(i, j), objArr);
    }

    public String A0B(int i, TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            return A06(resourceId);
        }
        return null;
    }

    public String A0C(int i, Object... objArr) {
        return String.format(A0I(), A05(i), objArr);
    }

    public String A0D(int i, Object... objArr) {
        return String.format(A0I(), A06(i), objArr);
    }

    public String A0E(String str) {
        C0SI c0si = A02().A01;
        C07X c07x = c0si.A01;
        if (str == null) {
            return null;
        }
        return c0si.A03(str, c07x).toString();
    }

    public String A0F(String str) {
        C0SI c0si = A02().A01;
        C07X c07x = C07Y.A04;
        if (c0si != null) {
            if (str != null) {
                return c0si.A03(str, c07x).toString();
            }
            return null;
        }
        throw null;
    }

    public NumberFormat A0G() {
        return (NumberFormat) A02().A04.clone();
    }

    public NumberFormat A0H() {
        return (NumberFormat) A02().A05.clone();
    }

    public Locale A0I() {
        return C003101m.A0H(this.A00.getResources().getConfiguration());
    }

    public void A0J() {
        if (this.A06) {
            Locale.setDefault(this.A04);
            A0L();
        }
    }

    public final void A0K() {
        synchronized (this.A09) {
            this.A01 = null;
        }
        this.A03 = null;
        this.A02 = null;
        C002501g.A00 = null;
        C002501g.A01 = null;
        C002501g.A02 = null;
    }

    public final void A0L() {
        if (this.A00.getResources().getConfiguration().locale.equals(this.A04)) {
            return;
        }
        if (A0B) {
            Context A01 = A01();
            this.A00 = A01;
            Resources resources = A01.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = this.A04;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        } else {
            Configuration configuration2 = new Configuration();
            configuration2.setLocale(this.A04);
            this.A00 = A01().createConfigurationContext(configuration2);
        }
        A0K();
    }

    public boolean A0M() {
        return !A02().A06;
    }

    public boolean A0N() {
        return A02().A06;
    }

    public String[] A0O(int[] iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = A06(iArr[i]);
        }
        return strArr;
    }
}
