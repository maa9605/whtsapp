package X;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.2b0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52602b0 {
    public C52592az A00;
    public C52592az A01;
    public C52592az A02;
    public Calendar A03;
    public final C002301c A04;

    public C52602b0(C002301c c002301c) {
        this.A04 = c002301c;
        C52592az c52592az = new C52592az(c002301c, 1, Calendar.getInstance());
        this.A01 = c52592az;
        c52592az.add(6, -2);
        C52592az c52592az2 = new C52592az(c002301c, 2, Calendar.getInstance());
        this.A02 = c52592az2;
        c52592az2.add(6, -7);
        C52592az c52592az3 = new C52592az(c002301c, 3, Calendar.getInstance());
        this.A00 = c52592az3;
        c52592az3.add(6, -28);
        Calendar calendar = Calendar.getInstance();
        this.A03 = calendar;
        calendar.add(6, -366);
    }

    public C52592az A00(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        if (calendar.after(this.A01)) {
            return this.A01;
        }
        if (calendar.after(this.A02)) {
            return this.A02;
        }
        if (calendar.after(this.A00)) {
            return this.A00;
        }
        boolean after = calendar.after(this.A03);
        C002301c c002301c = this.A04;
        if (after) {
            return new C52592az(c002301c, 4, new GregorianCalendar(calendar.get(1), calendar.get(2), 1));
        }
        return new C52592az(c002301c, 5, new GregorianCalendar(calendar.get(1), 1, 1));
    }
}
