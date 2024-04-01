package X;

import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.2Aj */
/* loaded from: classes2.dex */
public class C47222Aj implements C0IZ, C0EQ {
    public static volatile C47222Aj A07;
    public long A00;
    public long A01;
    public long A02;
    public final C005002g A03;
    public final AnonymousClass012 A04;
    public final C0HA A05;
    public final C47762Cm A06;

    public C47222Aj(AnonymousClass012 anonymousClass012, C005002g c005002g, C0HA c0ha, C47762Cm c47762Cm) {
        this.A04 = anonymousClass012;
        this.A03 = c005002g;
        this.A05 = c0ha;
        this.A06 = c47762Cm;
    }

    public static C47222Aj A00() {
        if (A07 == null) {
            synchronized (C47222Aj.class) {
                if (A07 == null) {
                    A07 = new C47222Aj(AnonymousClass012.A00(), C005002g.A00(), C0HA.A00(), C47762Cm.A00());
                }
            }
        }
        return A07;
    }

    public void A01() {
        long A05 = this.A04.A05() / 1000;
        long j = this.A00;
        if (A05 == j) {
            return;
        }
        boolean z = A05 < j;
        long max = Math.max(j, A05);
        if (A05 - j > 30 || z) {
            A03();
            if (A06(A05) || z) {
                this.A06.A01().edit().putLong("timespent_end_time", max).apply();
                A05(z);
                A04(A05);
            }
            this.A02 = A05;
        }
        this.A00 = A05;
    }

    public void A02() {
        C47762Cm c47762Cm = this.A06;
        if (c47762Cm.A01().getLong("timespent_saved_start_time", 0L) > 0) {
            long j = c47762Cm.A01().getLong("timespent_summary_sequence", 0L);
            C0HA c0ha = this.A05;
            long j2 = c47762Cm.A01().getLong("timespent_saved_start_time", 0L);
            long j3 = c47762Cm.A01().getLong("timespent_saved_duration", 0L);
            long j4 = c47762Cm.A01().getLong("timespent_saved_session_total", 0L);
            long j5 = c47762Cm.A01().getLong("timespent_saved_foreground_count", 0L);
            boolean z = c47762Cm.A01().getBoolean("timespent_saved_time_altered", false);
            if (c0ha != null) {
                C0PT c0pt = new C0PT();
                c0pt.A03 = Long.valueOf(j2);
                c0pt.A00 = Long.valueOf(j3);
                c0pt.A02 = Long.valueOf(j4);
                c0pt.A05 = Long.valueOf(j);
                c0pt.A01 = Long.valueOf(j5);
                c0pt.A04 = Long.valueOf(z ? 1L : 0L);
                c0ha.A0B.A09(c0pt, 1);
                AnonymousClass011.A01(c0pt, "");
                c47762Cm.A01().edit().putLong("timespent_saved_start_time", 0L).putLong("timespent_saved_duration", 0L).putLong("timespent_saved_session_total", 0L).putLong("timespent_saved_foreground_count", 0L).putBoolean("timespent_saved_time_altered", false).putLong("timespent_summary_sequence", (j % 9999) + 1).apply();
                return;
            }
            throw null;
        }
    }

    public final void A03() {
        long j = this.A02;
        if (j > 0) {
            long j2 = this.A00;
            long j3 = ((j2 - j) + 1) - this.A01;
            C47762Cm c47762Cm = this.A06;
            c47762Cm.A01().edit().putLong("timespent_last_activity_time", j2).putLong("timespent_session_total", c47762Cm.A01().getLong("timespent_session_total", 0L) + j3).apply();
            this.A02 = 0L;
            this.A00 = 0L;
            this.A01 = 0L;
        }
    }

    public final void A04(long j) {
        long time = this.A03.A02().getTime() / 1000;
        if (1620966675 > j || time < j) {
            return;
        }
        C47762Cm c47762Cm = this.A06;
        if (c47762Cm.A01().getLong("timespent_start_time", 0L) == 0) {
            c47762Cm.A01().edit().putLong("timespent_start_time", j).apply();
        }
    }

    public final void A05(boolean z) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
        calendar.add(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        C47762Cm c47762Cm = this.A06;
        c47762Cm.A01().edit().putLong("timespent_rollover_time", calendar.getTimeInMillis() / 1000).apply();
        A02();
        SharedPreferences.Editor edit = c47762Cm.A01().edit();
        long j = c47762Cm.A01().getLong("timespent_start_time", 0L);
        if (j > 0) {
            edit.putLong("timespent_saved_start_time", j).putLong("timespent_saved_duration", (c47762Cm.A01().getLong("timespent_end_time", 0L) - j) + 1).putLong("timespent_saved_session_total", c47762Cm.A01().getLong("timespent_session_total", 0L)).putLong("timespent_saved_foreground_count", c47762Cm.A01().getLong("timespent_foreground_count", 0L)).putBoolean("timespent_saved_time_altered", z);
        }
        edit.putLong("timespent_start_time", 0L).putLong("timespent_session_total", 0L).putLong("timespent_end_time", 0L).putLong("timespent_foreground_count", 0L).apply();
    }

    public final boolean A06(long j) {
        return this.A06.A01().getLong("timespent_rollover_time", 0L) < j || j < this.A00;
    }

    @Override // X.C0IZ
    public void AHG() {
        long A05 = this.A04.A05() / 1000;
        long j = this.A00;
        boolean z = A05 < j;
        long max = Math.max(j, A05);
        A03();
        this.A06.A01().edit().putLong("timespent_end_time", max).apply();
        if (A06(A05) || z) {
            A05(z);
        }
    }

    @Override // X.C0IZ
    public void AHH() {
        long A05 = this.A04.A05() / 1000;
        C47762Cm c47762Cm = this.A06;
        long j = c47762Cm.A01().getLong("timespent_last_activity_time", 0L);
        this.A00 = j;
        boolean z = A05 < j;
        if (A06(A05) || z) {
            A05(z);
        }
        A04(A05);
        this.A01 = A05 == this.A00 ? 1L : 0L;
        this.A02 = A05;
        this.A00 = A05;
        c47762Cm.A01().edit().putLong("timespent_foreground_count", c47762Cm.A01().getLong("timespent_foreground_count", 0L) + 1).apply();
    }

    @Override // X.C0EQ
    public void AKy() {
        A02();
    }
}
