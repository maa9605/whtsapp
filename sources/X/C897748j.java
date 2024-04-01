package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.Calendar;

/* renamed from: X.48j */
/* loaded from: classes3.dex */
public class C897748j {
    public static volatile C897748j A04;
    public final C897548h A01;
    public final C006602x A03;
    public final C014406v A02 = C014406v.A00("PaymentsDobManager", "infra", "COMMON");
    public String A00 = "0";

    public C897748j(C006602x c006602x, C897548h c897548h) {
        this.A03 = c006602x;
        this.A01 = c897548h;
    }

    public static C897748j A00() {
        if (A04 == null) {
            synchronized (C897748j.class) {
                if (A04 == null) {
                    C006602x A00 = C006602x.A00();
                    if (C897548h.A01 == null) {
                        synchronized (C897548h.class) {
                            if (C897548h.A01 == null) {
                                C897548h.A01 = new C897548h(AnonymousClass012.A00());
                            }
                        }
                    }
                    A04 = new C897748j(A00, C897548h.A01);
                }
            }
        }
        return A04;
    }

    public C02590Ca A01(int i, int i2, int i3) {
        C897548h c897548h = this.A01;
        if (c897548h != null) {
            if (i2 >= 0 && i2 <= 11) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(i, i2, i3);
                calendar.setLenient(false);
                try {
                    calendar.getTime();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(c897548h.A00.A05());
                    int i4 = calendar2.get(1) - calendar.get(1);
                    int i5 = calendar.get(2);
                    int i6 = calendar2.get(2);
                    if (i5 > i6 || (i5 == i6 && calendar.get(5) > calendar2.get(5))) {
                        i4--;
                    }
                    String str = "2";
                    if (this.A03.A05()) {
                        if (i4 < 16) {
                            this.A00 = "2";
                        } else if (i4 < 18) {
                            this.A00 = "1";
                            str = "1";
                        } else {
                            this.A00 = "0";
                            str = "0";
                        }
                    } else if (i4 < 13) {
                        this.A00 = "2";
                    } else if (i4 < 18) {
                        this.A00 = "1";
                        str = "1";
                    } else {
                        this.A00 = "0";
                        str = "0";
                    }
                    if (str.equals("0")) {
                        return new C02590Ca("dob", new C04P[]{new C04P("state", "0", null, (byte) 0), new C04P("day", i3), new C04P("month", i2 + 1), new C04P("year", i)}, null, null);
                    }
                    return new C02590Ca("dob", new C04P[]{new C04P("state", str, null, (byte) 0)}, null, null);
                } catch (Exception unused) {
                    StringBuilder A0R = C000200d.A0R("Date format invalid. Year: ", i, " Month: ", i2, " Day: ");
                    A0R.append(i3);
                    throw new IllegalArgumentException(A0R.toString());
                }
            }
            throw new IllegalArgumentException(C000200d.A0D("Months are 0 indexed, invalid month: ", i2));
        }
        throw null;
    }

    public boolean A02(ActivityC02290Ap activityC02290Ap, C28Q c28q) {
        C014406v c014406v = this.A02;
        StringBuilder sb = new StringBuilder("maybeHandleUnderageError: ");
        sb.append(c28q);
        c014406v.A07(null, sb.toString(), null);
        if (c28q.A00 == 2896001) {
            PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_is_underage_unavailability", true);
            paymentsUnavailableDialogFragment.A0P(bundle);
            activityC02290Ap.AUh(paymentsUnavailableDialogFragment);
            return true;
        }
        return false;
    }
}
