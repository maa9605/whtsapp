package X;

import com.google.android.search.verification.client.R;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.49k  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C900349k extends GregorianCalendar {
    public int count;
    public int id;
    public C002301c whatsAppLocale;

    public C900349k(C002301c c002301c, int i, Calendar calendar) {
        this.whatsAppLocale = c002301c;
        this.id = i;
        setTime(calendar.getTime());
    }

    @Override // java.util.Calendar
    public String toString() {
        DateFormat A0I;
        long timeInMillis = getTimeInMillis();
        if (timeInMillis <= 0) {
            return this.whatsAppLocale.A06(R.string.unknown);
        }
        C002301c c002301c = this.whatsAppLocale;
        Locale A0I2 = c002301c.A0I();
        Calendar calendar = Calendar.getInstance(A0I2);
        calendar.setTimeInMillis(timeInMillis);
        if (calendar.get(1) == Calendar.getInstance(A0I2).get(1)) {
            A0I = C002501g.A0H(c002301c);
        } else {
            A0I = C002501g.A0I(c002301c, 0);
        }
        return A0I.format(calendar.getTime());
    }
}
