package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.22P */
/* loaded from: classes2.dex */
public class C22P {
    public static volatile C22P A09;
    public final C018508q A00;
    public final C02L A01;
    public final C05X A02;
    public final C04960Mq A03;
    public final C40261rr A04;
    public final C41581uB A05;
    public final C000500h A06;
    public final C0EG A07;
    public final C04400Ka A08;

    public C22P(C018508q c018508q, C05X c05x, C02L c02l, C0EG c0eg, C40261rr c40261rr, C41581uB c41581uB, C04400Ka c04400Ka, C000500h c000500h, C04960Mq c04960Mq) {
        this.A00 = c018508q;
        this.A02 = c05x;
        this.A01 = c02l;
        this.A07 = c0eg;
        this.A04 = c40261rr;
        this.A05 = c41581uB;
        this.A08 = c04400Ka;
        this.A06 = c000500h;
        this.A03 = c04960Mq;
    }

    public static C22P A00() {
        if (A09 == null) {
            synchronized (C22P.class) {
                if (A09 == null) {
                    A09 = new C22P(C018508q.A00(), C05X.A00(), C02L.A00(), C0EG.A00(), C40261rr.A00(), C41581uB.A00(), C04400Ka.A00(), C000500h.A00(), C04960Mq.A00());
                }
            }
        }
        return A09;
    }

    public synchronized void A01(C22R c22r, boolean z, boolean z2) {
        boolean z3 = c22r.A05;
        if (!z3 && !c22r.A03 && !c22r.A04 && !c22r.A02 && !c22r.A01) {
            if (z) {
                this.A07.A0P("account_sync", null);
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSyncManager/fetchAllAccountInfo/fetch account info: ");
        StringBuilder sb2 = new StringBuilder("AccountSyncRequest:");
        sb2.append(z3 ? "S" : "");
        boolean z4 = c22r.A03;
        sb2.append(z4 ? "Pi" : "");
        boolean z5 = c22r.A04;
        sb2.append(z5 ? "Pr" : "");
        boolean z6 = c22r.A02;
        sb2.append(z6 ? "D" : "");
        boolean z7 = c22r.A01;
        sb2.append(z7 ? "B" : "");
        sb.append(sb2.toString());
        Log.i(sb.toString());
        C000500h c000500h = this.A06;
        AnonymousClass281 anonymousClass281 = new AnonymousClass281(this, c000500h, c22r, z);
        if (z2) {
            if (z3) {
                int i = c000500h.A00.getInt("account_sync_status_num_retries", 0);
                if (c22r.A00) {
                    int i2 = i - 1;
                    if (i <= 1) {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        C000200d.A0f(c000500h, "account_sync_status_num_retries");
                    } else {
                        C000200d.A0g(c000500h, "account_sync_status_num_retries", i2);
                    }
                } else {
                    C000200d.A0g(c000500h, "account_sync_status_num_retries", 3);
                }
            }
            if (z4) {
                int i3 = c000500h.A00.getInt("account_sync_picture_num_retries", 0);
                if (c22r.A00) {
                    int i4 = i3 - 1;
                    if (i3 <= 1) {
                        i4 = 0;
                    }
                    if (i4 == 0) {
                        C000200d.A0f(c000500h, "account_sync_picture_num_retries");
                    } else {
                        C000200d.A0g(c000500h, "account_sync_picture_num_retries", i4);
                    }
                } else {
                    C000200d.A0g(c000500h, "account_sync_picture_num_retries", 3);
                }
            }
            if (z5) {
                int i5 = c000500h.A00.getInt("account_sync_privacy_num_retries", 0);
                if (c22r.A00) {
                    int i6 = i5 - 1;
                    if (i5 <= 1) {
                        i6 = 0;
                    }
                    if (i6 == 0) {
                        C000200d.A0f(c000500h, "account_sync_privacy_num_retries");
                    } else {
                        C000200d.A0g(c000500h, "account_sync_privacy_num_retries", i6);
                    }
                } else {
                    C000200d.A0g(c000500h, "account_sync_privacy_num_retries", 3);
                }
            }
            if (z7) {
                int i7 = c000500h.A00.getInt("account_sync_blocklist_num_retries", 0);
                if (c22r.A00) {
                    int i8 = i7 - 1;
                    if (i7 <= 1) {
                        i8 = 0;
                    }
                    if (i8 == 0) {
                        C000200d.A0f(c000500h, "account_sync_blocklist_num_retries");
                    } else {
                        C000200d.A0g(c000500h, "account_sync_blocklist_num_retries", i8);
                    }
                } else {
                    C000200d.A0g(c000500h, "account_sync_blocklist_num_retries", 3);
                }
            }
        }
        if (z3) {
            this.A02.A02(new AnonymousClass282(this, anonymousClass281));
        }
        if (z4) {
            C04400Ka c04400Ka = this.A08;
            C02L c02l = this.A01;
            c02l.A05();
            c04400Ka.A02(c02l.A03, 0, 1, anonymousClass281);
        }
        if (z5) {
            this.A03.A01(anonymousClass281);
        }
        if (z7) {
            this.A04.A0D(anonymousClass281);
        }
        if (z6) {
            C41581uB c41581uB = this.A05;
            C02L c02l2 = this.A01;
            c02l2.A05();
            c41581uB.A02(new UserJid[]{c02l2.A03}, 2);
        }
    }
}
