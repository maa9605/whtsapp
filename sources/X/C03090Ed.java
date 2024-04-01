package X;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Ed */
/* loaded from: classes.dex */
public class C03090Ed {
    public static volatile C03090Ed A0B;
    public final C001200o A00;
    public final C005102h A01;
    public final C002301c A02;
    public final C05E A03;
    public final C013306k A04;
    public final C05C A05;
    public final C0DW A06;
    public final C0DV A07;
    public final C014406v A08 = C014406v.A00("MessagelessPaymentNotification", "notification", "COMMON");
    public final C0CB A09;
    public final InterfaceC002901k A0A;

    public C03090Ed(C001200o c001200o, InterfaceC002901k interfaceC002901k, C002301c c002301c, C0DV c0dv, C0CB c0cb, C05C c05c, C05E c05e, C0DW c0dw, C005102h c005102h, C013306k c013306k) {
        this.A00 = c001200o;
        this.A0A = interfaceC002901k;
        this.A02 = c002301c;
        this.A07 = c0dv;
        this.A09 = c0cb;
        this.A05 = c05c;
        this.A03 = c05e;
        this.A06 = c0dw;
        this.A01 = c005102h;
        this.A04 = c013306k;
    }

    public static C03090Ed A00() {
        if (A0B == null) {
            synchronized (C03090Ed.class) {
                if (A0B == null) {
                    A0B = new C03090Ed(C001200o.A01, C002801j.A00(), C002301c.A00(), C0DV.A00(), C0CB.A00(), C05C.A00(), C05E.A00(), C0DW.A00(), C005102h.A00(), C013306k.A07());
                }
            }
        }
        return A0B;
    }

    public final void A01() {
        ArrayList arrayList;
        Intent intent;
        if (this.A06.A04()) {
            C05E c05e = this.A03;
            c05e.A05();
            if (!c05e.A01) {
                this.A08.A07(null, "message store not yet ready", null);
                return;
            }
            synchronized (this) {
                String A02 = this.A05.A02("unread_messageless_transaction_ids");
                if (!TextUtils.isEmpty(A02)) {
                    C013306k c013306k = this.A04;
                    List asList = Arrays.asList(A02.split(";"));
                    StringBuilder A0P = C000200d.A0P("id IN (\"");
                    A0P.append(TextUtils.join("\",\"", asList));
                    A0P.append("\")");
                    String obj = A0P.toString();
                    c013306k.A0h();
                    C0CD A03 = c013306k.A04.A03();
                    Cursor A0A = A03.A02.A0A(c013306k.A0h() ? "pay_transaction" : "pay_transactions", c013306k.A0h() ? C013306k.A0A : C013306k.A09, obj, null, null, "100");
                    if (A0A != null) {
                        arrayList = new ArrayList(A0A.getCount());
                        while (A0A.moveToNext()) {
                            try {
                                arrayList.add(c013306k.A0K(A0A));
                            } catch (C011305p e) {
                                c013306k.A08.A08("readTransactionsByIds/InvalidJidException - Skipped transaction with invalid JID", e);
                            }
                        }
                        C014406v c014406v = c013306k.A08;
                        StringBuilder sb = new StringBuilder();
                        sb.append("readTransactionsByIds returned: ");
                        sb.append(arrayList.size());
                        c014406v.A07(null, sb.toString(), null);
                        A0A.close();
                        A03.close();
                    } else {
                        A03.close();
                        arrayList = new ArrayList();
                    }
                } else {
                    arrayList = new ArrayList();
                }
            }
            C001200o c001200o = this.A00;
            Application application = c001200o.A00;
            if (arrayList.isEmpty()) {
                this.A01.A05(null, 17);
                this.A08.A03("no unread payment notifications");
                return;
            }
            C005402l A00 = C0DU.A00(application);
            A00.A0I = "status";
            A00.A03 = 1;
            A00.A05(16, true);
            A00.A03(4);
            A00.A07.icon = R.drawable.notifybar;
            if (arrayList.size() == 1) {
                AnonymousClass093 anonymousClass093 = (AnonymousClass093) arrayList.get(0);
                C0DV c0dv = this.A07;
                AbstractC27991Pp A9Z = c0dv.A03().A9Z();
                if (A9Z == null) {
                    return;
                }
                String A01 = A9Z.A01(anonymousClass093);
                if (TextUtils.isEmpty(A01)) {
                    this.A08.A07(null, "no available payment notification text", null);
                    A02(anonymousClass093.A0I);
                    return;
                }
                A00.A0A(c001200o.A00.getString(R.string.payment));
                A00.A0B(A01);
                A00.A09(A01);
                Intent putExtra = new Intent(application, c0dv.A03().ACL()).putExtra("extra_transaction_id", anonymousClass093.A0I);
                AbstractC005302j abstractC005302j = anonymousClass093.A0A;
                boolean z = anonymousClass093.A0O;
                String str = anonymousClass093.A0J;
                if (!putExtra.hasExtra("fMessageKeyJid") && !putExtra.hasExtra("fMessageKeyFromMe") && !putExtra.hasExtra("fMessageKeyId")) {
                    putExtra.putExtra("fMessageKeyId", str).putExtra("fMessageKeyFromMe", z).putExtra("fMessageKeyJid", C003101m.A07(abstractC005302j));
                    putExtra.addFlags(335544320);
                    A00.A09 = PendingIntent.getActivity(application, 0, putExtra, 268435456);
                } else {
                    throw new IllegalArgumentException("Intent already contains key.");
                }
            } else {
                A00.A0A(c001200o.A00.getString(R.string.payment));
                A00.A09(this.A02.A0A(R.plurals.notification_new_message, arrayList.size(), Integer.valueOf(arrayList.size())));
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AnonymousClass093) it.next()).A0O()) {
                            intent = new Intent(application, this.A07.A03().ACK());
                            break;
                        }
                    } else {
                        intent = new Intent(application, this.A07.A03().AC6());
                        break;
                    }
                }
                intent.addFlags(335544320);
                A00.A09 = PendingIntent.getActivity(application, 0, intent, 268435456);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                C005402l A002 = C0DU.A00(application);
                A002.A0I = "status";
                A002.A03 = 1;
                A002.A0A(c001200o.A00.getString(R.string.payment));
                A002.A09(this.A02.A0A(R.plurals.notification_new_message, arrayList.size(), Integer.valueOf(arrayList.size())));
                A002.A08 = A002.A01();
                A002.A07.icon = R.drawable.notifybar;
            }
            A00.A07.deleteIntent = PendingIntent.getBroadcast(application, 17, new Intent(application, C03190Es.class), 134217728);
            if (Build.VERSION.SDK_INT >= 26) {
                A00.A0J = ((C03400Fo) this.A09.A04()).A0C();
            }
            Notification A012 = A00.A01();
            try {
                this.A08.A07(null, "NotificationManager/notify", null);
                this.A01.A03(null, 17, A012);
            } catch (SecurityException e2) {
                if (!C0K7.A06(e2.toString())) {
                    throw e2;
                }
            }
        }
    }

    public final synchronized void A02(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A08.A04("removeUnreadMessagelessPaymentTransaction empty transaction id");
            return;
        }
        C05C c05c = this.A05;
        String A02 = c05c.A02("unread_messageless_transaction_ids");
        if (A02 == null) {
            A02 = "";
        }
        HashSet hashSet = new HashSet(Arrays.asList(TextUtils.split(A02, ";")));
        if (hashSet.remove(str)) {
            C014406v c014406v = this.A08;
            StringBuilder sb = new StringBuilder();
            sb.append("removeUnreadMessagelessPaymentTransaction/removed id:");
            sb.append(str);
            c014406v.A07(null, sb.toString(), null);
        }
        c05c.A06("unread_messageless_transaction_ids", TextUtils.join(";", hashSet));
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A02((String) it.next());
        }
        if (TextUtils.isEmpty(this.A05.A02("unread_messageless_transaction_ids"))) {
            this.A01.A05(null, 17);
        }
    }
}
