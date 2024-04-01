package X;

import android.content.SharedPreferences;
import android.net.NetworkInfo;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ws  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43111ws {
    public static volatile C43111ws A04;
    public final C0E7 A00;
    public final AnonymousClass012 A01;
    public final C003701t A02;
    public final C43491xU A03;

    public C43111ws(AnonymousClass012 anonymousClass012, C003701t c003701t, C0E7 c0e7, C43491xU c43491xU) {
        this.A01 = anonymousClass012;
        this.A02 = c003701t;
        this.A00 = c0e7;
        this.A03 = c43491xU;
    }

    public static int A00(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 4;
        }
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type != 0) {
            return type == 1 ? 3 : 4;
        }
        switch (subtype) {
            case 1:
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 0;
            case 5:
            case 6:
            case 12:
                return 1;
            case 7:
                return 0;
            case 8:
            case 9:
            case 10:
                return 1;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return 0;
            case 13:
                return 2;
            case 14:
                return 1;
            case 15:
                return 2;
            default:
                return 4;
        }
    }

    public static C43111ws A01() {
        if (A04 == null) {
            synchronized (C43111ws.class) {
                if (A04 == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C0E7 A003 = C0E7.A00();
                    if (C43491xU.A02 == null) {
                        synchronized (C43491xU.class) {
                            if (C43491xU.A02 == null) {
                                C43491xU.A02 = new C43491xU(C02O.A00());
                            }
                        }
                    }
                    A04 = new C43111ws(A00, A002, A003, C43491xU.A02);
                }
            }
        }
        return A04;
    }

    public synchronized Float A02(int i) {
        int intValue;
        int A00 = A00(this.A00.A04());
        int A05 = (int) ((((this.A01.A05() / 1000) / 60) / 60) % 24);
        C43501xV c43501xV = new C43501xV(this.A03.A01(i, A05, A00));
        if (!c43501xV.A03() && this.A02.A0C(154)) {
            List A01 = this.A03.A01(i, (A05 + 23) % 24, A00);
            List A012 = this.A03.A01(i, (A05 + 1) % 24, A00);
            Iterator it = ((AbstractSequentialList) A01).iterator();
            Iterator it2 = ((AbstractSequentialList) A012).iterator();
            boolean z = false;
            while (!c43501xV.A03()) {
                if (!z && it.hasNext()) {
                    intValue = ((Integer) it.next()).intValue();
                    z = true;
                } else if (it2.hasNext()) {
                    intValue = ((Integer) it2.next()).intValue();
                    z = false;
                } else if (it.hasNext()) {
                    intValue = ((Integer) it.next()).intValue();
                } else {
                    return null;
                }
                c43501xV.A02(intValue);
            }
            return Float.valueOf(c43501xV.A03() ? (float) C43501xV.A00(c43501xV.A02) : -1.0f);
        }
        return Float.valueOf(c43501xV.A03() ? (float) C43501xV.A00(c43501xV.A02) : -1.0f);
    }

    public synchronized void A03(C0DC c0dc, long j, long j2, int i) {
        SharedPreferences sharedPreferences;
        int A00 = A00(this.A00.A04());
        int A05 = (int) ((((this.A01.A05() / 1000) / 60) / 60) % 24);
        if (A00 == 0 || A00 == 4 || (!(c0dc == C0DC.A0A || c0dc == C0DC.A0C || c0dc == C0DC.A0P) || j < 51200 || j2 < 100)) {
            return;
        }
        C43491xU c43491xU = this.A03;
        C43501xV c43501xV = new C43501xV(c43491xU.A01(i, A05, A00));
        c43501xV.A02((int) (((float) j) / ((float) j2)));
        List<Integer> list = c43501xV.A02;
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(num.intValue());
            sb.append(",");
        }
        synchronized (c43491xU) {
            sharedPreferences = c43491xU.A00;
            if (sharedPreferences == null) {
                sharedPreferences = c43491xU.A01.A01("media_bandwidth_shared_preferences_v2");
                c43491xU.A00 = sharedPreferences;
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C43491xU.A00(i, A05, A00), sb.toString());
        edit.apply();
    }
}
