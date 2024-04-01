package X;

import android.content.SharedPreferences;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0Ea */
/* loaded from: classes.dex */
public class C03070Ea {
    public static volatile C03070Ea A05;
    public final C01B A00;
    public final AnonymousClass012 A01;
    public final C000500h A02;
    public final C05Y A03;
    public final C0EZ A04;

    public C03070Ea(AnonymousClass012 anonymousClass012, C01B c01b, C05Y c05y, C000500h c000500h, C0EZ c0ez) {
        this.A01 = anonymousClass012;
        this.A00 = c01b;
        this.A03 = c05y;
        this.A02 = c000500h;
        this.A04 = c0ez;
    }

    public static C03070Ea A00() {
        if (A05 == null) {
            synchronized (C03070Ea.class) {
                if (A05 == null) {
                    A05 = new C03070Ea(AnonymousClass012.A00(), C01B.A00(), C05Y.A01(), C000500h.A00(), C0EZ.A00());
                }
            }
        }
        return A05;
    }

    public synchronized int A01() {
        C000500h c000500h = this.A02;
        if (c000500h.A09() == 0 && C01C.A05()) {
            return c000500h.A00.getInt("tos_v2_current_stage_id", 0);
        }
        return 0;
    }

    public synchronized int A02() {
        int i;
        C000500h c000500h = this.A02;
        if (c000500h.A09() == 0 && C01C.A05()) {
            SharedPreferences sharedPreferences = c000500h.A00;
            int i2 = sharedPreferences.getInt("tos_v2_current_stage_id", 0);
            if (i2 == 3) {
                return 3;
            }
            if (i2 == 0) {
                c000500h.A0D().putInt("tos_v2_current_stage_id", 1).apply();
                i = 1;
            } else {
                i = i2;
            }
            StringBuilder sb = new StringBuilder("tos_v2_stage_start_time");
            sb.append(i);
            long j = sharedPreferences.getLong(sb.toString(), 0L);
            if (j == 0) {
                j = this.A01.A05();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tosupdate/init stage:");
                sb2.append(i);
                sb2.append(" start:");
                sb2.append(j);
                Log.i(sb2.toString());
                SharedPreferences.Editor edit = sharedPreferences.edit();
                StringBuilder sb3 = new StringBuilder("tos_v2_stage_start_time");
                sb3.append(i);
                edit.putLong(sb3.toString(), j).apply();
            }
            C01B c01b = this.A00;
            AnonymousClass012 anonymousClass012 = this.A01;
            if (j + c01b.A08(i) <= anonymousClass012.A05()) {
                while (true) {
                    i++;
                    if (c01b.A08(i) != 0 || i >= 3) {
                        break;
                    }
                }
                long A052 = anonymousClass012.A05();
                c000500h.A0D().putInt("tos_v2_current_stage_id", i).apply();
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                StringBuilder sb4 = new StringBuilder("tos_v2_stage_start_time");
                sb4.append(i);
                edit2.putLong(sb4.toString(), A052).apply();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("tosupdate/advance stage:");
                sb5.append(i);
                sb5.append(" start:");
                sb5.append(A052);
                Log.i(sb5.toString());
            }
            if (i2 != i && this.A03.A0C(Message.obtain(null, 0, 99, i))) {
                C000200d.A0q("tosupdate/send/stage ", i);
            }
            return i;
        }
        return 0;
    }

    public void A03() {
        if (this.A03.A0C(Message.obtain(null, 0, 100, 0))) {
            Log.i("tosupdate/send/accept");
        }
    }

    public synchronized void A04() {
        int[] iArr;
        SharedPreferences.Editor remove = this.A02.A00.edit().remove("tos_v2_current_stage_id").remove("tos_v2_last_stage_1_display_time").remove("tos_v2_page_2_ack").remove("tos_v2_accepted_time").remove("tos_v2_accepted_ack");
        for (int i : C02M.A0A) {
            StringBuilder sb = new StringBuilder("tos_v2_stage_start_time");
            sb.append(i);
            remove.remove(sb.toString());
            StringBuilder sb2 = new StringBuilder("tos_v2_stage_start_ack");
            sb2.append(i);
            remove.remove(sb2.toString());
        }
        remove.apply();
        C01B c01b = this.A00;
        if (c01b != null) {
            synchronized (C01C.class) {
                C01C.A0J.clear();
                c01b.A00.edit().remove("tos_update_v2").apply();
            }
        } else {
            throw null;
        }
    }

    public boolean A05() {
        if (this.A00 != null) {
            int A01 = A01();
            return (A01 == 2 || A01 == 3) ? false : true;
        }
        throw null;
    }

    public synchronized boolean A06() {
        int A01 = A01();
        if (A01 == 1) {
            return this.A02.A00.getLong("tos_v2_last_stage_1_display_time", 0L) + 86400000 < this.A01.A05();
        }
        return A01 == 2 || A01 == 3;
    }
}
