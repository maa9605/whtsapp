package X;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0EP  reason: invalid class name */
/* loaded from: classes.dex */
public class C0EP implements C0EQ {
    public static volatile C0EP A0D;
    public C05760Qc A00;
    public final C03010Du A01;
    public final C018608r A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C000500h A05;
    public final C0C9 A06;
    public final C05E A07;
    public final C00B A08;
    public final C43091wq A09;
    public final C41511u2 A0A;
    public final C2EJ A0B;
    public final InterfaceC002901k A0C;

    public C0EP(AnonymousClass012 anonymousClass012, C03010Du c03010Du, InterfaceC002901k interfaceC002901k, C018608r c018608r, C43091wq c43091wq, C0C9 c0c9, C41511u2 c41511u2, C00B c00b, C000500h c000500h, C05E c05e, C0E7 c0e7, C2EJ c2ej) {
        this.A04 = anonymousClass012;
        this.A01 = c03010Du;
        this.A0C = interfaceC002901k;
        this.A02 = c018608r;
        this.A09 = c43091wq;
        this.A06 = c0c9;
        this.A0A = c41511u2;
        this.A08 = c00b;
        this.A05 = c000500h;
        this.A07 = c05e;
        this.A03 = c0e7;
        this.A0B = c2ej;
    }

    public static C0EP A00() {
        if (A0D == null) {
            synchronized (C0EP.class) {
                if (A0D == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C03010Du A002 = C03010Du.A00();
                    InterfaceC002901k A003 = C002801j.A00();
                    C018608r A02 = C018608r.A02();
                    C43091wq A01 = C43091wq.A01();
                    C0C9 A004 = C0C9.A00();
                    C41511u2 A005 = C41511u2.A00();
                    C00B A006 = C00B.A00();
                    C000500h A007 = C000500h.A00();
                    C05E A008 = C05E.A00();
                    C0E7 A009 = C0E7.A00();
                    if (C2EJ.A03 == null) {
                        synchronized (C2EJ.class) {
                            if (C2EJ.A03 == null) {
                                C2EJ.A03 = new C2EJ(C001200o.A01, C005102h.A00());
                            }
                        }
                    }
                    A0D = new C0EP(A00, A002, A003, A02, A01, A004, A005, A006, A007, A008, A009, C2EJ.A03);
                }
            }
        }
        return A0D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Qc, X.0HS] */
    public void A01() {
        C05760Qc c05760Qc = this.A00;
        if (c05760Qc != null) {
            c05760Qc.A05(true);
        }
        ?? r2 = new C0HS() { // from class: X.0Qc
            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                final C0EP c0ep = C0EP.this;
                ArrayList A02 = c0ep.A08.A02();
                if (A02.isEmpty()) {
                    return null;
                }
                final int A03 = c0ep.A03.A03(true);
                HashMap hashMap = new HashMap();
                Iterator it = A02.iterator();
                while (it.hasNext()) {
                    final AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                    if (c0ep.A02(anonymousClass092)) {
                        if (anonymousClass092.A0u == 0) {
                            anonymousClass092.A0u = c0ep.A04.A04();
                        }
                        anonymousClass092.A0z = c0ep.A06.A05(anonymousClass092);
                        if (anonymousClass092.A0m == 16) {
                            final C0KD c0kd = (C0KD) anonymousClass092;
                            if (c0kd.A02 == 2) {
                                c0ep.A0A.A02(anonymousClass092);
                            } else {
                                final C018608r c018608r = c0ep.A02;
                                C018508q c018508q = c018608r.A04;
                                c018508q.A02.post(new Runnable() { // from class: X.1Is
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C018608r.this.A0W(c0kd);
                                    }
                                });
                            }
                        } else if (anonymousClass092 instanceof AnonymousClass097) {
                            final AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
                            final C09H c09h = anonymousClass097.A02;
                            if (anonymousClass097.A09 != null && (c09h == null || c09h.A0F == null)) {
                                c0ep.A0A.A02(anonymousClass097);
                            } else if (C0D6.A00(((AnonymousClass092) anonymousClass097).A08, 2) < 0) {
                                boolean z = false;
                                if (A03 == 1 || A03 == 2 || (anonymousClass097 instanceof AnonymousClass095) || ((anonymousClass097 instanceof C09G) && ((AnonymousClass092) anonymousClass097).A04 == 1)) {
                                    z = true;
                                }
                                if (z) {
                                    String str = anonymousClass097.A0A;
                                    if (str == null) {
                                        c0ep.A01.A05(anonymousClass097, false, false);
                                    } else {
                                        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
                                        if (abstractCollection == null) {
                                            abstractCollection = new ArrayList();
                                            hashMap.put(anonymousClass097.A0A, abstractCollection);
                                        }
                                        abstractCollection.add(anonymousClass097);
                                    }
                                }
                            } else {
                                c0ep.A0A.A04(anonymousClass097, true, true, new Runnable() { // from class: X.1Ir
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C0EP c0ep2 = C0EP.this;
                                        AnonymousClass097 anonymousClass0972 = anonymousClass097;
                                        int i = A03;
                                        AnonymousClass092 anonymousClass0922 = anonymousClass092;
                                        C09H c09h2 = c09h;
                                        boolean z2 = false;
                                        if (i == 1 || i == 2 || (anonymousClass0972 instanceof AnonymousClass095) || ((anonymousClass0972 instanceof C09G) && ((AnonymousClass092) anonymousClass0972).A04 == 1)) {
                                            z2 = true;
                                        }
                                        if (c09h2 != null) {
                                            c09h2.A0P = false;
                                        }
                                        ((AnonymousClass092) anonymousClass0972).A08 = 0;
                                        if (z2) {
                                            c0ep2.A01.A05(anonymousClass0972, false, false);
                                        } else {
                                            c0ep2.A06.A0W(anonymousClass0922, -1);
                                        }
                                    }
                                });
                            }
                        } else {
                            c0ep.A0A.A02(anonymousClass092);
                        }
                    }
                }
                for (ArrayList arrayList : hashMap.values()) {
                    c0ep.A01.A02(new C04130Ir(arrayList), false, false);
                }
                return null;
            }
        };
        this.A00 = r2;
        this.A0C.ARy(r2, new Void[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
        if (r5.A05(r4) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(X.AnonymousClass092 r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EP.A02(X.092):boolean");
    }

    @Override // X.C0EQ
    public void AKy() {
        C05E c05e = this.A07;
        c05e.A05();
        if (c05e.A01) {
            Iterator it = this.A08.A02().iterator();
            while (it.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                long A05 = this.A04.A05();
                long j = anonymousClass092.A0E;
                if (10800000 + j < A05 && j + 86400000 >= A05 && A02(anonymousClass092)) {
                    C000500h c000500h = this.A05;
                    if (c000500h.A00.getLong("last_unsent_notification_time", 0L) + 86400000 < A05) {
                        Log.i("Posting notification about unsent messages");
                        C000200d.A0h(c000500h, "last_unsent_notification_time", A05);
                        C2EJ c2ej = this.A0B;
                        Application application = c2ej.A00.A00;
                        String string = application.getString(R.string.messages_failed_notification_title);
                        String string2 = application.getString(R.string.messages_failed_notification_message);
                        PendingIntent activity = PendingIntent.getActivity(application, 1, new Intent(application, HomeActivity.class), 0);
                        C005402l A00 = C0DU.A00(application);
                        A00.A0J = "failure_notifications@1";
                        A00.A0B(string);
                        A00.A07.when = System.currentTimeMillis();
                        A00.A03(3);
                        A00.A05(16, true);
                        A00.A0A(string);
                        A00.A09(string2);
                        A00.A09 = activity;
                        A00.A07.icon = R.drawable.notifybar;
                        c2ej.A01.A03(null, 6, A00.A01());
                        c2ej.A02 = true;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
