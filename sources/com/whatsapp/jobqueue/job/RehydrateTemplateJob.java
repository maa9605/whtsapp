package com.whatsapp.jobqueue.job;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass024;
import X.C000200d;
import X.C000700j;
import X.C01B;
import X.C05U;
import X.C0C9;
import X.C0E6;
import X.C0EA;
import X.C0EG;
import X.C0I7;
import X.C37571md;
import X.C40531sQ;
import X.C41291tg;
import X.C41451tw;
import X.C41521u3;
import android.content.Context;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.requirement.HsmMessagePackRequirement;
import com.whatsapp.jobqueue.requirement.VNameCertificateRequirement;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Locale;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class RehydrateTemplateJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient Context A00;
    public transient AbstractC000600i A01;
    public transient C01B A02;
    public transient C0E6 A03;
    public transient C41291tg A04;
    public transient AnonymousClass012 A05;
    public transient C0C9 A06;
    public transient AnonymousClass011 A07;
    public transient C41451tw A08;
    public transient C0EG A09;
    public transient C40531sQ A0A;
    public final transient C05U A0B;
    public final int expiration;
    public final long expireTimeMs;
    public final String id;
    public final String jid;
    public final Locale[] locales;
    public final String participant;
    public final long timestamp;
    public final int verifiedLevel;
    public final Long verifiedSender;

    /* JADX WARN: Code restructure failed: missing block: B:84:0x000c, code lost:
        if (X.C003101m.A0P(r16) != false) goto L78;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RehydrateTemplateJob(X.C05U r12, X.C002301c r13, X.C40531sQ r14, java.lang.String r15, X.AbstractC005302j r16, X.AbstractC005302j r17, long r18, long r20, java.lang.Long r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RehydrateTemplateJob.<init>(X.05U, X.01c, X.1sQ, java.lang.String, X.02j, X.02j, long, long, java.lang.Long, int, int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("RehydrateTemplateJob/onAdded/info hsm rehydrate job added, loggableParam=");
        A0P.append(A07());
        Log.i(A0P.toString());
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof VNameCertificateRequirement) {
                VNameCertificateRequirement vNameCertificateRequirement = (VNameCertificateRequirement) requirement;
                UserJid A00 = vNameCertificateRequirement.A00();
                if (!(vNameCertificateRequirement.A00.A00(vNameCertificateRequirement.A00()) != null)) {
                    if (!GetVNameCertificateJob.A02.containsKey(vNameCertificateRequirement.jid) && A00 != null) {
                        this.A03.A00.A01(new GetVNameCertificateJob(A00));
                    }
                }
            } else if (requirement instanceof HsmMessagePackRequirement) {
                HsmMessagePackRequirement hsmMessagePackRequirement = (HsmMessagePackRequirement) requirement;
                C41291tg c41291tg = this.A04;
                Locale[] localeArr = hsmMessagePackRequirement.locales;
                String str = hsmMessagePackRequirement.namespace;
                synchronized (c41291tg.A03) {
                    c41291tg.A04.remove(Pair.create(localeArr, str));
                }
                if (!hsmMessagePackRequirement.A00()) {
                    Locale[] localeArr2 = this.locales;
                    C000700j.A0B(localeArr2);
                    if (!GetHsmMessagePackJob.A01(localeArr2, hsmMessagePackRequirement.namespace, hsmMessagePackRequirement.elementName)) {
                        this.A03.A00.A01(new GetHsmMessagePackJob(hsmMessagePackRequirement.locales, hsmMessagePackRequirement.namespace, hsmMessagePackRequirement.elementName));
                    }
                }
            } else {
                continue;
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("RehydrateTemplateJob/onCanceled/error canceled rehydrate hsm job, loggableParam=");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:458:0x013b, code lost:
        if (r8 == null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0421, code lost:
        if ((Integer.MIN_VALUE & r2) != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0448, code lost:
        if (r1 != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x045b, code lost:
        if (r3.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0468, code lost:
        if ((r2 & 64) != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0475, code lost:
        if ((r2 & 256) != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x047e, code lost:
        if (r3.equals("application/msword") != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x048b, code lost:
        if ((r2 & 16) != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0494, code lost:
        if (r3.equals("application/vnd.ms-excel") != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0498, code lost:
        if ((r2 & 4) == 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x04a1, code lost:
        if (r3.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x04a5, code lost:
        if ((r2 & 2) == 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x04af, code lost:
        if (r3.equals("application/vnd.ms-powerpoint") != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x04b8, code lost:
        if (r3.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation") != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x04bc, code lost:
        if ((r2 & 8) == 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x04ca, code lost:
        if ((r2 & 1) != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x04d8, code lost:
        if ((r2 & 128) != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x04e6, code lost:
        if ((r2 & 32) != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x05b2, code lost:
        A09(1007, "title", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x05ba, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:509:0x01eb A[Catch: HSMRehydrationUtil$SendStructUnavailableException -> 0x0358, TryCatch #11 {HSMRehydrationUtil$SendStructUnavailableException -> 0x0358, blocks: (B:507:0x01e4, B:509:0x01eb, B:510:0x01ef), top: B:763:0x01e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0294 A[Catch: HSMRehydrationUtil$SendStructUnavailableException -> 0x0380, TryCatch #2 {HSMRehydrationUtil$SendStructUnavailableException -> 0x0380, blocks: (B:524:0x022a, B:537:0x0244, B:539:0x0248, B:555:0x0271, B:556:0x0275, B:558:0x0279, B:559:0x027b, B:561:0x0294, B:543:0x0250, B:546:0x0256, B:548:0x025e, B:551:0x0264, B:553:0x026c), top: B:745:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x02eb A[Catch: HSMRehydrationUtil$SendStructUnavailableException -> 0x0384, TryCatch #0 {HSMRehydrationUtil$SendStructUnavailableException -> 0x0384, blocks: (B:583:0x02c9, B:584:0x02cd, B:586:0x02d1, B:587:0x02d3, B:588:0x02e5, B:590:0x02eb, B:591:0x02ef, B:593:0x0304, B:594:0x0308, B:595:0x0329, B:596:0x032c, B:567:0x02a0, B:570:0x02a6, B:572:0x02ae, B:575:0x02b5, B:580:0x02bf, B:581:0x02c3, B:579:0x02bc), top: B:741:0x02c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0304 A[Catch: HSMRehydrationUtil$SendStructUnavailableException -> 0x0384, TryCatch #0 {HSMRehydrationUtil$SendStructUnavailableException -> 0x0384, blocks: (B:583:0x02c9, B:584:0x02cd, B:586:0x02d1, B:587:0x02d3, B:588:0x02e5, B:590:0x02eb, B:591:0x02ef, B:593:0x0304, B:594:0x0308, B:595:0x0329, B:596:0x032c, B:567:0x02a0, B:570:0x02a6, B:572:0x02ae, B:575:0x02b5, B:580:0x02bf, B:581:0x02c3, B:579:0x02bc), top: B:741:0x02c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0329 A[Catch: HSMRehydrationUtil$SendStructUnavailableException -> 0x0384, TryCatch #0 {HSMRehydrationUtil$SendStructUnavailableException -> 0x0384, blocks: (B:583:0x02c9, B:584:0x02cd, B:586:0x02d1, B:587:0x02d3, B:588:0x02e5, B:590:0x02eb, B:591:0x02ef, B:593:0x0304, B:594:0x0308, B:595:0x0329, B:596:0x032c, B:567:0x02a0, B:570:0x02a6, B:572:0x02ae, B:575:0x02b5, B:580:0x02bf, B:581:0x02c3, B:579:0x02bc), top: B:741:0x02c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:596:0x032c A[Catch: HSMRehydrationUtil$SendStructUnavailableException -> 0x0384, TRY_LEAVE, TryCatch #0 {HSMRehydrationUtil$SendStructUnavailableException -> 0x0384, blocks: (B:583:0x02c9, B:584:0x02cd, B:586:0x02d1, B:587:0x02d3, B:588:0x02e5, B:590:0x02eb, B:591:0x02ef, B:593:0x0304, B:594:0x0308, B:595:0x0329, B:596:0x032c, B:567:0x02a0, B:570:0x02a6, B:572:0x02ae, B:575:0x02b5, B:580:0x02bf, B:581:0x02c3, B:579:0x02bc), top: B:741:0x02c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:732:0x05e0  */
    @Override // org.whispersystems.jobqueue.Job
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04() {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RehydrateTemplateJob.A04():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A05() {
        return this.A05.A05() >= this.expireTimeMs || super.A05();
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("RehydrateTemplateJob/onShouldRetry/error exception while rehydrating hsm message, exception=");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return false;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; id=");
        A0P.append(this.id);
        A0P.append("; jid=");
        A0P.append(this.jid);
        A0P.append("; participant=");
        A0P.append(this.participant);
        A0P.append("; persistentId=");
        A0P.append(super.A01);
        return A0P.toString();
    }

    public final String A08(String str, int i, int i2, int i3) {
        String A0L = AnonymousClass024.A0L(str, i);
        if (str != null && !str.equals(A0L)) {
            C37571md c37571md = new C37571md();
            c37571md.A02 = Long.valueOf(str.length());
            c37571md.A00 = Integer.valueOf(i2);
            if (i2 == 4) {
                c37571md.A01 = Long.valueOf(i3);
            }
            this.A07.A09(c37571md, 1);
            AnonymousClass011.A01(c37571md, "");
        }
        return A0L;
    }

    public final void A09(Integer num, String str, String str2) {
        this.A09.A0C(AbstractC005302j.A02(this.jid), this.id, AbstractC005302j.A02(this.participant), num, str, str2);
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = context.getApplicationContext();
        this.A05 = AnonymousClass012.A00();
        this.A01 = AbstractC000600i.A00();
        this.A07 = AnonymousClass011.A00();
        this.A09 = C0EG.A00();
        this.A02 = C01B.A00();
        C0EA.A00();
        this.A03 = C0E6.A00();
        C41521u3.A00();
        this.A06 = C0C9.A00();
        this.A04 = C41291tg.A00();
        this.A08 = C41451tw.A00();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0A = C40531sQ.A0A((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A0P = C000200d.A0P("RehydrateTemplateJob/readObject/error hsm missing message bytes, loggableParam=");
            A0P.append(A07());
            Log.e(A0P.toString());
        }
        if (this.A0A == null) {
            StringBuilder A0P2 = C000200d.A0P("RehydrateTemplateJob/readObject/error message is null, loggableParam=");
            A0P2.append(A07());
            Log.e(A0P2.toString());
        }
        if (this.id != null) {
            if (this.jid != null) {
                if (this.timestamp > 0) {
                    if (this.expireTimeMs > 0) {
                        return;
                    }
                    StringBuilder A0P3 = C000200d.A0P("expireTimeMs must be non-negative");
                    A0P3.append(A07());
                    throw new InvalidObjectException(A0P3.toString());
                }
                StringBuilder A0P4 = C000200d.A0P("timestamp must be valid");
                A0P4.append(A07());
                throw new InvalidObjectException(A0P4.toString());
            }
            StringBuilder A0P5 = C000200d.A0P("jid must not be null");
            A0P5.append(A07());
            throw new InvalidObjectException(A0P5.toString());
        }
        StringBuilder A0P6 = C000200d.A0P("id must not be null");
        A0P6.append(A07());
        throw new InvalidObjectException(A0P6.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0A.A0B());
    }
}
