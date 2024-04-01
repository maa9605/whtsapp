package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity;
import com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4Da  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90944Da implements InterfaceC06790Va {
    public static volatile C90944Da A03;
    public C002301c A00;
    public C894947f A01;
    public C90564Bm A02;

    @Override // X.InterfaceC06790Va
    public int AA0(int i) {
        return 0;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFB(int i) {
        return i == 11510;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFM(int i) {
        return i == 11482;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFN(int i) {
        return i == 11459;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFO(int i) {
        return i == 11504;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFP(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFQ(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFR(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFS(int i) {
        return i == 11503;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFT(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFW(int i) {
        return i == 11468;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFe(int i) {
        return false;
    }

    @Override // X.InterfaceC06790Va
    public boolean AFu(int i) {
        return i == 11455 || i == 11502;
    }

    @Override // X.InterfaceC06790Va
    public int AGN() {
        return 100000;
    }

    @Override // X.InterfaceC06790Va
    public int AGO() {
        return 10;
    }

    public C90944Da(C002301c c002301c, C894947f c894947f, C90564Bm c90564Bm) {
        this.A00 = c002301c;
        this.A01 = c894947f;
        this.A02 = c90564Bm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001d, code lost:
        if (r3 != 443) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(int r3, X.C3NV r4) {
        /*
            if (r3 > 0) goto L18
            if (r4 == 0) goto L1f
            monitor-enter(r4)
            int r2 = r4.A01     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r4)
            monitor-enter(r4)
            int r1 = r4.A02     // Catch: java.lang.Throwable -> Lc
            goto L12
        Lc:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lf:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L12:
            monitor-exit(r4)
            int r0 = r4.A00
            if (r2 <= 0) goto L8b
            r3 = r2
        L18:
            r0 = 443(0x1bb, float:6.21E-43)
            r2 = 2131888993(0x7f120b61, float:1.9412637E38)
            if (r3 == r0) goto L39
        L1f:
            r2 = 0
            r0 = 6
            if (r3 == r0) goto L87
            r0 = 7
            if (r3 == r0) goto L87
            r0 = 405(0x195, float:5.68E-43)
            if (r3 == r0) goto L83
            r0 = 406(0x196, float:5.69E-43)
            if (r3 == r0) goto L7f
            r0 = 409(0x199, float:5.73E-43)
            if (r3 == r0) goto L7b
            r0 = 410(0x19a, float:5.75E-43)
            if (r3 == r0) goto L77
            switch(r3) {
                case -2: goto L87;
                case 400: goto L5f;
                case 403: goto L5f;
                case 426: goto L63;
                case 460: goto L67;
                case 500: goto L6b;
                case 503: goto L6b;
                case 10702: goto L6b;
                case 10780: goto L6f;
                case 11474: goto L6b;
                case 11484: goto L6b;
                case 11497: goto L6f;
                case 11537: goto L6f;
                case 11540: goto L6f;
                case 17009: goto L73;
                default: goto L39;
            }
        L39:
            java.lang.String r1 = "PAY: getErrorString errorCode: "
            java.lang.String r0 = " states last error: "
            java.lang.StringBuilder r1 = X.C000200d.A0Q(r1, r3, r0)
            if (r4 == 0) goto L5c
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L49:
            r1.append(r0)
            java.lang.String r0 = " resId returned: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            return r2
        L5c:
            java.lang.String r0 = "null"
            goto L49
        L5f:
            r2 = 2131888887(0x7f120af7, float:1.9412422E38)
            goto L39
        L63:
            r2 = 2131888817(0x7f120ab1, float:1.941228E38)
            goto L39
        L67:
            r2 = 2131888822(0x7f120ab6, float:1.941229E38)
            goto L39
        L6b:
            r2 = 2131888702(0x7f120a3e, float:1.9412047E38)
            goto L39
        L6f:
            r2 = 2131888802(0x7f120aa2, float:1.941225E38)
            goto L39
        L73:
            r2 = 2131890382(0x7f1210ce, float:1.9415454E38)
            goto L39
        L77:
            r2 = 2131888820(0x7f120ab4, float:1.9412286E38)
            goto L39
        L7b:
            r2 = 2131888819(0x7f120ab3, float:1.9412284E38)
            goto L39
        L7f:
            r2 = 2131888818(0x7f120ab2, float:1.9412282E38)
            goto L39
        L83:
            r2 = 2131888821(0x7f120ab5, float:1.9412288E38)
            goto L39
        L87:
            r2 = 2131888421(0x7f120925, float:1.9411477E38)
            goto L39
        L8b:
            if (r1 <= 0) goto L8f
            r3 = r1
            goto L18
        L8f:
            if (r0 <= 0) goto L1f
            r3 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90944Da.A00(int, X.3NV):int");
    }

    public static C90944Da A01() {
        if (A03 == null) {
            synchronized (C90944Da.class) {
                if (A03 == null) {
                    A03 = new C90944Da(C002301c.A00(), C894947f.A00(), C90564Bm.A00());
                }
            }
        }
        return A03;
    }

    public static void A02(ActivityC02290Ap activityC02290Ap, C78333jk c78333jk, Runnable runnable, boolean z) {
        Intent intent = new Intent(activityC02290Ap, IndiaUpiPaymentsTosActivity.class);
        intent.putExtra("extra_show_updated_tos", z);
        if (c78333jk != null) {
            c78333jk.A00.A1Z(intent);
        }
        if (z) {
            activityC02290Ap.startActivityForResult(intent, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        activityC02290Ap.A14(intent);
        activityC02290Ap.finish();
    }

    public static boolean A03(AbstractActivityC92444Kp abstractActivityC92444Kp, String str, int i, boolean z) {
        if (z && i == 404) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: ");
            sb.append(abstractActivityC92444Kp);
            sb.append(" op: ");
            sb.append(str);
            sb.append(" payment account error: ");
            sb.append(i);
            sb.append("; restartPaymentsAccountSetupAndFinish");
            Log.e(sb.toString());
            abstractActivityC92444Kp.A1W();
            Intent intent = new Intent(abstractActivityC92444Kp, IndiaUpiPaymentsAccountSetupActivity.class);
            abstractActivityC92444Kp.A1Z(intent);
            abstractActivityC92444Kp.A14(intent);
            abstractActivityC92444Kp.finish();
            return true;
        } else if (i == 440) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PAY: ");
            sb2.append(abstractActivityC92444Kp);
            sb2.append(" op: ");
            sb2.append(str);
            sb2.append(" tos not accepted; showTosAndFinish");
            Log.e(sb2.toString());
            A02(abstractActivityC92444Kp, new C78333jk(abstractActivityC92444Kp), new C3R7(abstractActivityC92444Kp), false);
            return true;
        } else if (i == 442) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("PAY: ");
            sb3.append(abstractActivityC92444Kp);
            sb3.append(" op: ");
            sb3.append(str);
            sb3.append(" tos v2 not accepted; showTosAndFinish");
            Log.e(sb3.toString());
            A02(abstractActivityC92444Kp, new C78333jk(abstractActivityC92444Kp), new C3R7(abstractActivityC92444Kp), true);
            return true;
        } else if (i == 443) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("PAY: ");
            sb4.append(abstractActivityC92444Kp);
            sb4.append(" op: ");
            sb4.append(str);
            sb4.append(" payment unsupported for client version");
            Log.e(sb4.toString());
            C78333jk c78333jk = new C78333jk(abstractActivityC92444Kp);
            C3R7 c3r7 = new C3R7(abstractActivityC92444Kp);
            if (c3r7 != null) {
                c3r7.run();
            }
            Intent intent2 = new Intent(abstractActivityC92444Kp, PaymentsUpdateRequiredActivity.class);
            intent2.addFlags(335544320);
            if (c78333jk != null) {
                c78333jk.A00.A1Z(intent2);
            }
            abstractActivityC92444Kp.A14(intent2);
            abstractActivityC92444Kp.finish();
            return true;
        } else {
            return false;
        }
    }

    @Override // X.InterfaceC06790Va
    public String A9F(int i) {
        if (i == 2826003) {
            return this.A00.A0A(R.plurals.payments_max_requests_reached, 5L, 5);
        }
        return null;
    }

    @Override // X.InterfaceC06790Va
    public int A9z(int i, C3NV c3nv) {
        return A00(i, null);
    }

    @Override // X.InterfaceC06790Va
    public void AEH(String str) {
        if (str.equals("11456") || str.equals("11471")) {
            C000200d.A14("PAY: IndiaUpiErrorHelper/handlePaymentTransactionError handle:", str);
            this.A02.A0C();
            this.A01.A04.A01();
            this.A01.A08();
        }
    }
}
