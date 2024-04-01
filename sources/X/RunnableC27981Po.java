package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.1Po  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC27981Po implements Runnable {
    public final /* synthetic */ AnonymousClass093 A00;
    public final /* synthetic */ C03090Ed A01;

    public /* synthetic */ RunnableC27981Po(C03090Ed c03090Ed, AnonymousClass093 anonymousClass093) {
        this.A01 = c03090Ed;
        this.A00 = anonymousClass093;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C03090Ed c03090Ed = this.A01;
        String str = this.A00.A0I;
        synchronized (c03090Ed) {
            if (TextUtils.isEmpty(str)) {
                c03090Ed.A08.A04("addUnreadMessagelessPaymentTransaction empty transaction id");
            } else {
                C05C c05c = c03090Ed.A05;
                String A02 = c05c.A02("unread_messageless_transaction_ids");
                if (A02 == null) {
                    A02 = "";
                }
                HashSet hashSet = new HashSet(Arrays.asList(TextUtils.split(A02, ";")));
                hashSet.add(str);
                String join = TextUtils.join(";", hashSet);
                C014406v c014406v = c03090Ed.A08;
                StringBuilder sb = new StringBuilder();
                sb.append("addUnreadMessagelessPaymentTransaction/unreadTransactions:");
                sb.append(join);
                c014406v.A07(null, sb.toString(), null);
                c05c.A06("unread_messageless_transaction_ids", join);
            }
        }
        c03090Ed.A01();
    }
}
