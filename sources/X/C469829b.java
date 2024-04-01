package X;

import android.content.Intent;
import android.os.ConditionVariable;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.29b */
/* loaded from: classes2.dex */
public class C469829b {
    public static volatile C469829b A0d;
    public int A00;
    public final C005002g A0K;
    public final C01B A0L;
    public final C0G2 A0N;
    public final C000800k A0O;
    public final C0E7 A0P;
    public final C02E A0Q;
    public final C001200o A0R;
    public final C000500h A0S;
    public final C05E A0T;
    public final C02O A0U;
    public final C42151vF A0V;
    public final C05G A0W;
    public final InterfaceC002901k A0X;
    public boolean A07 = true;
    public final AtomicBoolean A0b = new AtomicBoolean(false);
    public final AtomicBoolean A0Y = new AtomicBoolean(false);
    public final AtomicBoolean A0a = new AtomicBoolean(false);
    public final AtomicBoolean A0Z = new AtomicBoolean(false);
    public final AtomicBoolean A0c = new AtomicBoolean(false);
    public boolean A08 = false;
    public final ConditionVariable A0D = new ConditionVariable(false);
    public final ConditionVariable A0F = new ConditionVariable(false);
    public final ConditionVariable A0E = new ConditionVariable(false);
    public boolean A04 = false;
    public boolean A06 = false;
    public boolean A05 = false;
    public final ConditionVariable A0J = new ConditionVariable(false);
    public boolean A0C = false;
    public final ConditionVariable A0G = new ConditionVariable(false);
    public final ConditionVariable A0I = new ConditionVariable(false);
    public final ConditionVariable A0H = new ConditionVariable(false);
    public boolean A09 = false;
    public boolean A0B = false;
    public boolean A0A = false;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A03 = false;
    public final AbstractC40111rb A0M = new C2CZ(this);

    public C469829b(C001200o c001200o, InterfaceC002901k interfaceC002901k, C005002g c005002g, C01B c01b, C42151vF c42151vF, C02E c02e, C05E c05e, C0E7 c0e7, C000500h c000500h, C0G2 c0g2, C05G c05g, C02O c02o, C000800k c000800k) {
        this.A0R = c001200o;
        this.A0X = interfaceC002901k;
        this.A0K = c005002g;
        this.A0L = c01b;
        this.A0V = c42151vF;
        this.A0Q = c02e;
        this.A0T = c05e;
        this.A0P = c0e7;
        this.A0S = c000500h;
        this.A0N = c0g2;
        this.A0W = c05g;
        this.A0U = c02o;
        this.A0O = c000800k;
    }

    public static C469829b A00() {
        if (A0d == null) {
            synchronized (C469829b.class) {
                if (A0d == null) {
                    A0d = new C469829b(C001200o.A01, C002801j.A00(), C005002g.A00(), C01B.A00(), C42151vF.A00(), C02E.A00(), C05E.A00(), C0E7.A00(), C000500h.A00(), C0G2.A00(), C05G.A00(), C02O.A00(), C000800k.A02);
                }
            }
        }
        return A0d;
    }

    public void A01() {
        C000700j.A00();
        C000500h c000500h = this.A0S;
        if (C40061rW.A0I(c000500h)) {
            AtomicBoolean atomicBoolean = this.A0Z;
            if (!atomicBoolean.get()) {
                A06(Environment.getExternalStorageState());
                A03();
                A04();
                if (this.A0B && this.A06 && this.A0C) {
                    C40061rW.A0F(this.A0R.A00, new Intent("action_restore_media"));
                    Log.i("gdrive-conditions-manager/trigger-pending-media-restore");
                    return;
                }
                StringBuilder A0P = C000200d.A0P("gdrive-conditions-manager/trigger-nothing media-restore-pending: ");
                A0P.append(C40061rW.A0I(c000500h));
                A0P.append(" media-restore-running: ");
                A0P.append(atomicBoolean.get());
                A0P.append(" network_available_for_media_restore: ");
                A0P.append(this.A0B);
                A0P.append(" battery_available_for_media_restore: ");
                A0P.append(this.A06);
                A0P.append(" sdcard_available: ");
                C000200d.A1V(A0P, this.A0C);
                return;
            }
        }
        if (C40061rW.A0H(c000500h)) {
            AtomicBoolean atomicBoolean2 = this.A0Y;
            if (!atomicBoolean2.get()) {
                A06(Environment.getExternalStorageState());
                A03();
                A04();
                if (this.A09 && this.A04 && this.A0C) {
                    Intent intent = new Intent("action_backup");
                    intent.putExtra("only_if_pending", true);
                    C40061rW.A0F(this.A0R.A00, intent);
                    Log.i("gdrive-conditions-manager/trigger-pending-backup");
                    return;
                }
                StringBuilder A0P2 = C000200d.A0P("gdrive-conditions-manager/trigger-nothing is-backup-pending: ");
                A0P2.append(C40061rW.A0H(c000500h));
                A0P2.append(" is-backup-running: ");
                A0P2.append(atomicBoolean2.get());
                A0P2.append(" network_available_for_backup: ");
                A0P2.append(this.A09);
                A0P2.append(" battery_available_for_backup: ");
                A0P2.append(this.A04);
                A0P2.append(" sdcard_available: ");
                C000200d.A1V(A0P2, this.A0C);
                return;
            }
        }
        if (!this.A0b.get() && !this.A0c.get()) {
            Log.i("gdrive-conditions-manager/trigger-nothing/nothing-pending");
            return;
        }
        Log.i("gdrive-conditions-manager/service-running/recalculate-network-and-sdcard");
        A06(Environment.getExternalStorageState());
        A03();
        A04();
    }

    public void A02() {
        this.A0X.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 24));
    }

    public void A03() {
        int parseInt;
        try {
            C000500h c000500h = this.A0S;
            this.A01 = c000500h.A04();
            if (c000500h != null) {
                try {
                    parseInt = Integer.parseInt(c000500h.A00.getString("gdrive_media_restore_network_setting", String.valueOf(0)));
                } catch (NumberFormatException e) {
                    Log.e("wa-shared-preferences/get-media-restore-network-setting", e);
                }
                this.A02 = parseInt;
                return;
            }
            throw null;
        } catch (NumberFormatException e2) {
            Log.e(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0037, code lost:
        if (r5.A09 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x014a A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #0 {, blocks: (B:90:0x0001, B:97:0x0018, B:99:0x0030, B:101:0x0034, B:104:0x003a, B:166:0x014a, B:105:0x0041, B:108:0x0051, B:110:0x0057, B:112:0x005b, B:113:0x0065, B:115:0x0069, B:123:0x0083, B:124:0x0088, B:118:0x0073, B:121:0x007e, B:126:0x0095, B:128:0x009b, B:130:0x00b3, B:132:0x00b7, B:135:0x00bc, B:136:0x00c4, B:138:0x00ca, B:140:0x00d0, B:142:0x00e8, B:144:0x00ec, B:147:0x00f1, B:148:0x00f8, B:150:0x0110, B:152:0x0114, B:155:0x0119, B:156:0x0120, B:158:0x0138, B:160:0x013c, B:163:0x0141), top: B:172:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A04() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469829b.A04():void");
    }

    public final void A05(C0G3 c0g3) {
        double A00 = c0g3.A00();
        boolean z = false;
        int i = !Double.isNaN(A00) ? (int) A00 : 0;
        this.A0E.open();
        boolean z2 = true;
        this.A05 = true;
        if (!this.A08 && !c0g3.A02()) {
            this.A0D.close();
            this.A0F.close();
            if (!this.A04 && !this.A06) {
                z2 = false;
            }
            this.A04 = false;
            this.A06 = false;
        } else {
            this.A0D.open();
            this.A0F.open();
            z = (this.A04 && this.A06) ? true : true;
            this.A04 = true;
            this.A06 = true;
            z2 = z;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder("gdrive-conditions-manager/can-use-battery/battery-level/");
            sb.append(i);
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder("gdrive-conditions-manager/can-use-battery-for-backup/");
            sb2.append(this.A04);
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder("gdrive-conditions-manager/can-use-battery-for-media-restore/");
            sb3.append(this.A06);
            Log.i(sb3.toString());
            C000200d.A1V(new StringBuilder("gdrive-conditions-manager/ignore-battery-status/"), this.A08);
        }
    }

    public void A06(String str) {
        C000700j.A00();
        if ("mounted".equals(str)) {
            this.A0J.open();
            if (!this.A0C) {
                this.A0C = true;
                if (A07()) {
                    A01();
                    return;
                }
                return;
            }
            return;
        }
        this.A0J.close();
        this.A0C = false;
    }

    public boolean A07() {
        if (!this.A0L.A0E(C01C.A0x)) {
            Log.i("gdrive-conditions-manager/is-access-possible gdrive disabled");
            return false;
        }
        C001200o c001200o = this.A0R;
        int A02 = AnonymousClass029.A02(c001200o.A00);
        if (A02 == 0) {
            return true;
        }
        try {
            c001200o.A00.getPackageManager().getPackageInfo("com.android.vending", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-conditions-manager/is-access-possible Google Play services are missing and can be installed,  status code: ");
            sb.append(C40061rW.A03(A02));
            Log.i(sb.toString());
            return true;
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("gdrive-conditions-manager/is-access-possible Google Play services are missing and cannot be installed, status code: ");
            A0P.append(C40061rW.A03(A02));
            Log.i(A0P.toString());
            Log.i("gdrive-conditions-manager/is-access-possible", e);
            return false;
        }
    }

    public boolean A08() {
        if (!A07()) {
            Log.i("gdrive-conditions-manager/should-start/false/gdrive-access-not-allowed");
            return false;
        } else if (!this.A0W.A02()) {
            Log.i("gdrive-conditions-manager/should-start/false/reg-not-verified");
            return false;
        } else if (this.A0V.A00) {
            Log.i("gdrive-conditions-manager/should-start/false/login-failed");
            return false;
        } else {
            C005002g c005002g = this.A0K;
            if (c005002g.A04()) {
                Log.i("gdrive-conditions-manager/should-start/false/clock-wrong");
                return false;
            } else if (c005002g.A03()) {
                Log.i("gdrive-conditions-manager/should-start/false/software-expired");
                return false;
            } else if (this.A0T.A01() <= 1) {
                Log.i("gdrive-conditions-manager/should-start/false/message-count-low");
                return false;
            } else {
                C000500h c000500h = this.A0S;
                int A03 = c000500h.A03();
                if (A03 != 0) {
                    if (A03 != 1 && A03 != 2 && A03 != 3 && A03 != 4) {
                        C000200d.A0p("gdrive-conditions-manager/should-start/unexpected-backup-freq/", A03);
                    } else if (c000500h.A0F() != null) {
                        return false;
                    }
                }
                try {
                    long j = c000500h.A00.getLong("gdrive_next_prompt_for_setup_timestamp", -1L);
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - j;
                    String.format(Locale.ENGLISH, "saved time: %d, current time: %d, difference: %d", Long.valueOf(j), Long.valueOf(currentTimeMillis), Long.valueOf(j2));
                    if (j >= 0) {
                        if (j2 <= 0) {
                            return false;
                        }
                        Log.i("gdrive-conditions-manager/sufficient-time-passed-since-last-user-prompt/true");
                    }
                } catch (NumberFormatException e) {
                    Log.e("gdrive-conditions-manager/sufficient-time-passed-since-last-user-prompt/", e);
                }
                return true;
            }
        }
    }

    public boolean A09() {
        if (this.A0Y.get()) {
            if (!this.A0G.block(1800000L)) {
                Log.e("gdrive-conditions-manager/network-wait/backup 1800000 milliseconds, giving up now.");
                return false;
            }
            return true;
        } else if (this.A0Z.get()) {
            if (!this.A0I.block(1800000L)) {
                Log.e("gdrive-conditions-manager/network-wait/media-restore 1800000 milliseconds, giving up now.");
                return true;
            }
            return true;
        } else if (this.A0H.block(1800000L)) {
            return true;
        } else {
            Log.e("gdrive-conditions-manager/network-wait/message-restore 1800000 milliseconds, giving up now.");
            return false;
        }
    }

    public boolean A0A(int i) {
        C000700j.A00();
        if (i != 0 && i != 1) {
            C000200d.A0p("gdrive-conditions-manager/set-backup-network-setting/incorrect-value/", i);
            return false;
        }
        this.A01 = i;
        A04();
        this.A0S.A0D().putString("interface_gdrive_backup_network_setting", String.valueOf(i)).apply();
        return true;
    }
}
