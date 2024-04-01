package X;

import com.google.android.search.verification.client.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.49j  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C900249j {
    public static volatile C900249j A01;
    public final C002301c A00;

    public C900249j(C002301c c002301c) {
        this.A00 = c002301c;
    }

    public static C900249j A00() {
        if (A01 == null) {
            synchronized (C900249j.class) {
                if (A01 == null) {
                    A01 = new C900249j(C002301c.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.4Ef] */
    public C91254Ef A01(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        final C002301c c002301c = this.A00;
        final int i = calendar.get(6);
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(calendar.get(1), calendar.get(2), 1);
        return new C900349k(c002301c, i, gregorianCalendar) { // from class: X.4Ef
            @Override // X.C900349k, java.util.Calendar
            public String toString() {
                long timeInMillis = getTimeInMillis();
                if (timeInMillis <= 0) {
                    return this.whatsAppLocale.A06(R.string.unknown);
                }
                C002301c c002301c2 = this.whatsAppLocale;
                return new SimpleDateFormat(c002301c2.A05(177), c002301c2.A0I()).format(new Date(timeInMillis));
            }
        };
    }

    public C900349k A02(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        return new C900349k(this.A00, calendar.get(6), new GregorianCalendar(calendar.get(1), calendar.get(2), calendar.get(5)));
    }

    public List A03(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        C900349k c900349k = null;
        while (it.hasNext()) {
            C900349k A02 = A02(((AnonymousClass093) it.next()).A04);
            if (c900349k != null) {
                if (!c900349k.equals(A02)) {
                    arrayList.add(c900349k);
                } else {
                    c900349k.count++;
                }
            }
            A02.count = 0;
            c900349k = A02;
            c900349k.count++;
        }
        if (c900349k != null) {
            arrayList.add(c900349k);
        }
        return arrayList;
    }
}
