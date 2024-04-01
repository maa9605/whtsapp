package X;

import com.google.android.search.verification.client.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.0VZ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0VZ {
    public static volatile C0VZ A02;
    public final AnonymousClass012 A00;
    public final C002301c A01;

    public C0VZ(AnonymousClass012 anonymousClass012, C002301c c002301c) {
        this.A00 = anonymousClass012;
        this.A01 = c002301c;
    }

    public static C0VZ A00() {
        if (A02 == null) {
            synchronized (C0VZ.class) {
                if (A02 == null) {
                    A02 = new C0VZ(AnonymousClass012.A00(), C002301c.A00());
                }
            }
        }
        return A02;
    }

    public static final String A01(long j) {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
        calendar.setTimeInMillis(j);
        calendar.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(calendar.getTime());
    }

    public String A02(long j, long j2) {
        if (A01(j).equals(A01(j2))) {
            return C000200d.A09(j2, this.A00, this.A01);
        }
        C002301c c002301c = this.A01;
        AnonymousClass012 anonymousClass012 = this.A00;
        return c002301c.A0D(R.string.upi_mandate_payment_transaction_detail_date_row_description_date_range, C000200d.A09(j, anonymousClass012, c002301c), C000200d.A09(j2, anonymousClass012, c002301c));
    }

    public String A03(C014006r c014006r, String str) {
        InterfaceC013706o interfaceC013706o = C013806p.A05;
        C002301c c002301c = this.A01;
        String A81 = interfaceC013706o.A81(c002301c, c014006r);
        return "MAX".equals(str) ? c002301c.A0D(R.string.upi_mandate_bottom_row_item_amount_upto, A81) : A81;
    }
}
