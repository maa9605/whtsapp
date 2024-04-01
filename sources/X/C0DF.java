package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.format.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.0DF */
/* loaded from: classes.dex */
public final class C0DF {
    public boolean A00;
    public final C0SI A01;
    public final C0DG A02;
    public final C003801u A03;
    public final NumberFormat A04;
    public final NumberFormat A05;
    public final boolean A06;
    public final boolean A07;

    public C0DF(Context context, Locale locale) {
        C0SI c0si;
        this.A06 = C07050Wl.A00(locale) == 1;
        this.A07 = AbstractC003201n.A0A(locale);
        if (Build.VERSION.SDK_INT >= 21 && "sr".equals(locale.getLanguage())) {
            locale.getScript();
        }
        boolean z = false;
        this.A00 = (AbstractC003201n.A00(locale) == 0 || DateFormat.is24HourFormat(context)) ? true : true;
        boolean z2 = this.A06;
        C07X c07x = C0SI.A05;
        if (c07x != c07x) {
            c0si = new C0SI(z2, c07x);
        } else if (z2) {
            c0si = C0SI.A04;
        } else {
            c0si = C0SI.A03;
        }
        this.A01 = c0si;
        this.A05 = NumberFormat.getPercentInstance(locale);
        this.A04 = NumberFormat.getInstance(locale);
        C0DG.A06 = C002301c.A0D;
        this.A02 = new C0DG(context, context.getResources(), locale);
        C003801u.A07 = C002301c.A0D;
        Resources resources = context.getResources();
        C0DG c0dg = this.A02;
        this.A03 = new C003801u(context, resources, c0dg.A02, c0dg.A01);
    }
}
