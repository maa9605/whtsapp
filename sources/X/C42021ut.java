package X;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1ut */
/* loaded from: classes2.dex */
public class C42021ut {
    public static volatile C42021ut A0B;
    public final C001200o A00;
    public final C005102h A01;
    public final C002301c A02;
    public final C05E A03;
    public final C05C A04;
    public final C013406l A05;
    public final C0DW A06;
    public final C0DV A07;
    public final C014406v A08 = C014406v.A00("PaymentMethodUpdateNotification", "notification", "COMMON");
    public final C0CB A09;
    public final InterfaceC002901k A0A;

    public C42021ut(C001200o c001200o, InterfaceC002901k interfaceC002901k, C013406l c013406l, C002301c c002301c, C0DV c0dv, C0CB c0cb, C05C c05c, C05E c05e, C0DW c0dw, C005102h c005102h) {
        this.A00 = c001200o;
        this.A0A = interfaceC002901k;
        this.A05 = c013406l;
        this.A02 = c002301c;
        this.A07 = c0dv;
        this.A09 = c0cb;
        this.A04 = c05c;
        this.A03 = c05e;
        this.A06 = c0dw;
        this.A01 = c005102h;
    }

    public static C42021ut A00() {
        if (A0B == null) {
            synchronized (C42021ut.class) {
                if (A0B == null) {
                    A0B = new C42021ut(C001200o.A01, C002801j.A00(), C013406l.A00(), C002301c.A00(), C0DV.A00(), C0CB.A00(), C05C.A00(), C05E.A00(), C0DW.A00(), C005102h.A00());
                }
            }
        }
        return A0B;
    }

    public void A01() {
        this.A0A.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 45));
    }

    public final void A02() {
        C05C c05c;
        ArrayList arrayList;
        String str;
        String str2;
        if (this.A06.A02()) {
            C05E c05e = this.A03;
            c05e.A05();
            if (!c05e.A01) {
                this.A08.A07(null, "message store not yet ready", null);
                return;
            }
            synchronized (this) {
                c05c = this.A04;
                String A02 = c05c.A02("unread_payment_method_credential_ids");
                if (TextUtils.isEmpty(A02)) {
                    arrayList = new ArrayList();
                } else {
                    List<String> asList = Arrays.asList(TextUtils.split(A02, ";"));
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : asList) {
                        arrayList2.add(TextUtils.split(str3, ":")[0]);
                    }
                    if (!TextUtils.isEmpty(A02)) {
                        C013406l c013406l = this.A05;
                        if (c013406l.A07) {
                            StringBuilder A0P = C000200d.A0P("credential_id IN (\"");
                            A0P.append(TextUtils.join("\",\"", arrayList2));
                            A0P.append("\")");
                            String obj = A0P.toString();
                            C0CD A022 = c013406l.A01.A02();
                            Cursor A0A = A022.A02.A0A("methods", AbstractC03620Gk.A07, obj, null, null, "100");
                            if (A0A != null) {
                                arrayList = new ArrayList(A0A.getCount());
                                while (A0A.moveToNext()) {
                                    arrayList.add(c013406l.A07(A0A));
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("PAY: PaymentTransactionStore readPaymentMethodByCredentialIds returned: ");
                                sb.append(arrayList.size());
                                Log.i(sb.toString());
                                A0A.close();
                                A022.close();
                            } else {
                                A022.close();
                                arrayList = new ArrayList();
                            }
                        }
                    }
                    arrayList = new ArrayList();
                }
            }
            Application application = this.A00.A00;
            C49H ACD = this.A07.A03().ACD();
            if (!arrayList.isEmpty() && ACD != null) {
                C005402l A00 = C0DU.A00(application);
                A00.A0I = "status";
                A00.A03 = 1;
                A00.A05(16, true);
                A00.A03(4);
                A00.A07.icon = R.drawable.notifybar;
                if (arrayList.size() == 1) {
                    C0N2 c0n2 = (C0N2) arrayList.get(0);
                    String str4 = c0n2.A07;
                    String A023 = c05c.A02("unread_payment_method_credential_ids");
                    if (!TextUtils.isEmpty(A023)) {
                        for (String str5 : Arrays.asList(TextUtils.split(A023, ";"))) {
                            String[] split = TextUtils.split(str5, ":");
                            if (TextUtils.equals(split[0], str4)) {
                                str = split[1];
                                break;
                            }
                        }
                    }
                    str = null;
                    String A024 = ACD.A02(c0n2, str);
                    if (str == null) {
                        str2 = ACD.A00.getString(R.string.view);
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(A024)) {
                        this.A08.A07(null, "no available payment notification text", null);
                        A03(c0n2.A07);
                        return;
                    }
                    A00.A0B(A024);
                    A00.A09(A024);
                    C05170Np c05170Np = new C05170Np();
                    c05170Np.A07(A024);
                    A00.A08(c05170Np);
                    A00.A09 = ACD.A01(application, c0n2, str);
                    if (!TextUtils.isEmpty(str2)) {
                        A00.A04(R.drawable.ic_fab_check, str2, ACD.A01(application, c0n2, str));
                    }
                } else {
                    int size = arrayList.size();
                    A00.A09(this.A02.A0A(R.plurals.notification_new_payment_method_update, size, Integer.valueOf(size)));
                    A00.A09 = ACD.A01(application, null, null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    C005402l A002 = C0DU.A00(application);
                    A002.A0I = "status";
                    A002.A03 = 1;
                    A002.A09(this.A02.A0A(R.plurals.notification_new_payment_method_update, arrayList.size(), Integer.valueOf(arrayList.size())));
                    A002.A04(R.drawable.ic_fab_check, ACD.A00.getString(R.string.view), ACD.A01(application, null, null));
                    A002.A08 = A002.A01();
                    A002.A07.icon = R.drawable.notifybar;
                }
                A00.A07.deleteIntent = PendingIntent.getBroadcast(application, 22, new Intent(application, C42091v3.class), 134217728);
                if (Build.VERSION.SDK_INT >= 26) {
                    A00.A0J = ((C03400Fo) this.A09.A04()).A0C();
                }
                Notification A01 = A00.A01();
                try {
                    this.A08.A07(null, "NotificationManager/notify", null);
                    this.A01.A03(null, 22, A01);
                    return;
                } catch (SecurityException e) {
                    if (!C0K7.A06(e.toString())) {
                        throw e;
                    }
                    return;
                }
            }
            this.A01.A05(null, 22);
            this.A08.A07(null, "no unread payment notifications", null);
        }
    }

    public final synchronized void A03(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A08.A04("removeUnreadPaymentMethodUpdate empty credentialId");
            return;
        }
        C05C c05c = this.A04;
        String A02 = c05c.A02("unread_payment_method_credential_ids");
        if (A02 == null) {
            A02 = "";
        }
        String[] split = TextUtils.split(A02, ";");
        HashSet hashSet = new HashSet();
        for (String str2 : split) {
            if (!TextUtils.equals(TextUtils.split(str2, ":")[0], str)) {
                hashSet.add(str2);
            } else {
                C014406v c014406v = this.A08;
                StringBuilder sb = new StringBuilder();
                sb.append("removeUnreadPaymentMethodUpdate/removed credentialId:");
                sb.append(str);
                c014406v.A07(null, sb.toString(), null);
            }
        }
        c05c.A06("unread_payment_method_credential_ids", TextUtils.join(";", hashSet));
    }
}
