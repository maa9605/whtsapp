package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import java.util.Calendar;

/* renamed from: X.0Rh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06040Rh {
    public static volatile C06040Rh A07;
    public final C05W A00;
    public final C018708s A01;
    public final AnonymousClass012 A02;
    public final C001200o A03;
    public final C002301c A04;
    public final C22I A05;
    public final C003401q A06;

    public C06040Rh(C001200o c001200o, AnonymousClass012 anonymousClass012, C003401q c003401q, C05W c05w, C018708s c018708s, C002301c c002301c, C22I c22i) {
        this.A03 = c001200o;
        this.A02 = anonymousClass012;
        this.A06 = c003401q;
        this.A00 = c05w;
        this.A01 = c018708s;
        this.A04 = c002301c;
        this.A05 = c22i;
    }

    public String A00(C06C c06c) {
        String A01 = A01(c06c);
        if (A01 != null) {
            return A01;
        }
        C22I c22i = this.A05;
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            long A032 = c22i.A03((AbstractC005302j) A03);
            if (A032 == 0) {
                return "";
            }
            if (A032 == 1) {
                return this.A03.A00.getString(R.string.conversation_contact_online);
            }
            toString();
            return A03(c06c, this.A02.A06(A032), true);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A01(X.C06C r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06040Rh.A01(X.06C):java.lang.String");
    }

    public String A02(C06C c06c) {
        if (A01(c06c) == null) {
            C22I c22i = this.A05;
            Jid A03 = c06c.A03(AbstractC005302j.class);
            if (A03 != null) {
                long A032 = c22i.A03((AbstractC005302j) A03);
                Jid A033 = c06c.A03(AbstractC005302j.class);
                if (A033 != null) {
                    if (1 != c22i.A03((AbstractC005302j) A033)) {
                        return A03(c06c, this.A02.A06(A032), false);
                    }
                    return null;
                }
                throw null;
            }
            throw null;
        }
        return null;
    }

    public final String A03(C06C c06c, long j, boolean z) {
        int i;
        int A00 = C02620Cd.A00(this.A02.A05(), j);
        if (A00 <= 6) {
            if (A00 != 0) {
                if (A00 != 1) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j);
                    switch (calendar.get(7)) {
                        case 1:
                            i = R.string.sunday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_sun_with_placeholder;
                                break;
                            }
                            break;
                        case 2:
                            i = R.string.monday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_mon_with_placeholder;
                                break;
                            }
                            break;
                        case 3:
                            i = R.string.tuesday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_tue_with_placeholder;
                                break;
                            }
                            break;
                        case 4:
                            i = R.string.wednesday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_wed_with_placeholder;
                                break;
                            }
                            break;
                        case 5:
                            i = R.string.thursday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_thu_with_placeholder;
                                break;
                            }
                            break;
                        case 6:
                            i = R.string.friday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_fri_with_placeholder;
                                break;
                            }
                            break;
                        case 7:
                            i = R.string.saturday_at;
                            if (z) {
                                i = R.string.conversation_last_seen_sat_with_placeholder;
                                break;
                            }
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = R.string.yesterday_at;
                    if (z) {
                        i = R.string.conversation_last_seen_yesterday_with_placeholder;
                    }
                }
            } else {
                i = R.string.today_at;
                if (z) {
                    i = R.string.conversation_last_seen_today_with_placeholder;
                }
            }
            C002301c c002301c = this.A04;
            String A002 = AbstractC40621sZ.A00(c002301c, j);
            if (z) {
                A002 = this.A06.A03((AbstractC005302j) c06c.A03(AbstractC005302j.class), i, A002);
            }
            return AbstractC40621sZ.A01(c002301c, A002, j);
        }
        String A0e = AnonymousClass029.A0e(this.A04, A00, j);
        return z ? this.A06.A03((AbstractC005302j) c06c.A03(AbstractC005302j.class), R.string.conversation_last_seen_with_placeholder, A0e) : A0e;
    }
}
