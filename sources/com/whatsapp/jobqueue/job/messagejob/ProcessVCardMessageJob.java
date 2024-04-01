package com.whatsapp.jobqueue.job.messagejob;

import X.AbstractC005302j;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.C001200o;
import X.C002301c;
import X.C003101m;
import X.C02180Ae;
import X.C02L;
import X.C03790Hb;
import X.C04110Ip;
import X.C04120Iq;
import X.C05E;
import X.C05W;
import X.C06C;
import X.C06K;
import X.C06S;
import X.C09010cT;
import X.C0C5;
import X.C0CD;
import X.C0CE;
import X.C0D5;
import X.C0DA;
import X.C40951t8;
import android.content.ContentValues;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ProcessVCardMessageJob extends AsyncMessageJob {
    public transient C06K A00;
    public transient C05W A01;
    public transient C001200o A02;
    public transient C002301c A03;
    public transient C0D5 A04;
    public transient C06S A05;
    public transient C40951t8 A06;

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
    public String A08() {
        return "processVCard";
    }

    public ProcessVCardMessageJob(long j) {
        super(j);
    }

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
    public Object A07(AnonymousClass092 anonymousClass092) {
        List A0q = C02180Ae.A0q(this.A06, anonymousClass092);
        if (A0q != null) {
            return C04110Ip.A02(this.A02, this.A01, this.A03, this.A00, A0q);
        }
        return Collections.emptyList();
    }

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
    public void A09(AnonymousClass092 anonymousClass092, Object obj) {
        UserJid A0B;
        List<C04120Iq> list = (List) obj;
        if (anonymousClass092 instanceof C0DA) {
            ((C0DA) anonymousClass092).A02 = list;
        }
        this.A04.A0N(anonymousClass092, null);
        C06S c06s = this.A05;
        if (c06s != null) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if (anonymousClass094.A02) {
                C02L c02l = c06s.A00;
                c02l.A05();
                A0B = c02l.A03;
            } else {
                A0B = anonymousClass092.A0B();
            }
            if (A0B != null) {
                C06C A09 = c06s.A02.A09(A0B);
                if (!c06s.A00.A0A(A0B) && (A09 == null || A09.A08 == null)) {
                    return;
                }
                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                C05E c05e = c06s.A0A;
                C0CD A03 = c05e.A03();
                try {
                    C03790Hb A00 = A03.A00();
                    for (C04120Iq c04120Iq : list) {
                        String str = c04120Iq.A00;
                        C04110Ip c04110Ip = c04120Iq.A01;
                        long j = anonymousClass092.A0p;
                        List list2 = c04110Ip.A05;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((C09010cT) it.next()).A01 != null) {
                                    ContentValues contentValues = new ContentValues();
                                    Long valueOf = Long.valueOf(j);
                                    contentValues.put("message_row_id", valueOf);
                                    contentValues.put("sender_jid", A0B.getRawString());
                                    contentValues.put("chat_jid", C003101m.A07(abstractC005302j));
                                    contentValues.put("vcard", str);
                                    C0CD A04 = c05e.A04();
                                    C03790Hb A002 = A04.A00();
                                    C0CE c0ce = A04.A02;
                                    long A02 = c0ce.A02("messages_vcards", contentValues);
                                    for (C09010cT c09010cT : c04110Ip.A05) {
                                        if (c09010cT.A01 != null) {
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("message_row_id", valueOf);
                                            contentValues2.put("vcard_row_id", Long.valueOf(A02));
                                            contentValues2.put("vcard_jid", C003101m.A07(c09010cT.A01));
                                            c0ce.A02("messages_vcards_jids", contentValues2);
                                        }
                                    }
                                    A002.A00();
                                    A002.close();
                                    A04.close();
                                }
                            }
                        }
                        c06s.A09(c04120Iq, anonymousClass092.A0p);
                    }
                    A00.A00();
                    A00.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        try {
                            A03.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob, X.C0I7
    public void ASu(Context context) {
        super.ASu(context);
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A02 = c0c5.A0e();
        this.A06 = c0c5.A1o();
        this.A01 = c0c5.A0W();
        this.A03 = c0c5.A0h();
        this.A04 = c0c5.A0o();
        this.A05 = c0c5.A0y();
        this.A00 = c0c5.A0T();
    }
}
