package com.whatsapp.jobqueue.job;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AnonymousClass012;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.C000200d;
import X.C02180Ae;
import X.C05U;
import X.C0C5;
import X.C0C9;
import X.C0DB;
import X.C0E6;
import X.C0EG;
import X.C0I7;
import X.C2G3;
import X.C40531sQ;
import X.C41291tg;
import X.C47812Cr;
import X.C47822Cs;
import X.C62362xm;
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
public final class RehydrateHsmJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient Context A00;
    public transient AbstractC000600i A01;
    public transient C0E6 A02;
    public transient C41291tg A03;
    public transient AnonymousClass012 A04;
    public transient C0C9 A05;
    public transient C0EG A06;
    public transient C40531sQ A07;
    public transient C05U A08;
    public final Long existingMessageRowId;
    public final int expiration;
    public final long expireTimeMs;
    public final String id;
    public final String jid;
    public final Locale[] locales;
    public final String participant;
    public final long timestamp;
    public final int verifiedLevel;
    public final Long verifiedSender;

    /* JADX WARN: Code restructure failed: missing block: B:63:0x000b, code lost:
        if (X.C003101m.A0P(r15) != false) goto L57;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RehydrateHsmJob(X.C002301c r11, X.C05U r12, X.C40531sQ r13, java.lang.String r14, X.AbstractC005302j r15, X.AbstractC005302j r16, long r17, long r19, java.lang.Long r21, int r22, java.lang.Long r23, int r24) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RehydrateHsmJob.<init>(X.01c, X.05U, X.1sQ, java.lang.String, X.02j, X.02j, long, long, java.lang.Long, int, java.lang.Long, int):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("RehydrateHsmJob/onRun/info: job added");
        A0P.append(A07());
        Log.i(A0P.toString());
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof VNameCertificateRequirement) {
                VNameCertificateRequirement vNameCertificateRequirement = (VNameCertificateRequirement) requirement;
                UserJid A00 = vNameCertificateRequirement.A00();
                if (!(vNameCertificateRequirement.A00.A00(vNameCertificateRequirement.A00()) != null)) {
                    if (!GetVNameCertificateJob.A02.containsKey(vNameCertificateRequirement.jid) && A00 != null) {
                        this.A02.A00.A01(new GetVNameCertificateJob(A00));
                    }
                }
            } else if (requirement instanceof HsmMessagePackRequirement) {
                HsmMessagePackRequirement hsmMessagePackRequirement = (HsmMessagePackRequirement) requirement;
                C41291tg c41291tg = this.A03;
                Locale[] localeArr = hsmMessagePackRequirement.locales;
                String str = hsmMessagePackRequirement.namespace;
                synchronized (c41291tg.A03) {
                    c41291tg.A04.remove(Pair.create(localeArr, str));
                }
                if (!hsmMessagePackRequirement.A00() && !GetHsmMessagePackJob.A01(this.locales, hsmMessagePackRequirement.namespace, hsmMessagePackRequirement.elementName)) {
                    this.A02.A00.A01(new GetHsmMessagePackJob(hsmMessagePackRequirement.locales, hsmMessagePackRequirement.namespace, hsmMessagePackRequirement.elementName));
                }
            } else {
                continue;
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("RehydrateHsmJob/onCanceled/w: canceled rehydrate hsm job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        StringBuilder A0P = C000200d.A0P("RehydrateHsmJob/onRun/info: starting job, param=");
        A0P.append(A07());
        Log.i(A0P.toString());
        if (this.A07 == null) {
            StringBuilder A0P2 = C000200d.A0P("RehydrateHsmJob/onRun/error: missing message, param=");
            A0P2.append(A07());
            Log.e(A0P2.toString());
            this.A01.A09("rehydratehsmjob/run/message missing", null, true);
            A08(null);
        } else if (this.A04.A05() >= this.expireTimeMs) {
            StringBuilder A0P3 = C000200d.A0P("RehydrateHsmJob/onRun/error: job expired, param=");
            A0P3.append(A07());
            Log.e(A0P3.toString());
            A08(null);
        } else {
            C2G3 A0v = this.A07.A0v();
            try {
                C62362xm.A02(A0v, A07());
                C47812Cr A00 = C62362xm.A00(this.A03, this.locales, A0v.A09, A07());
                C47822Cs A01 = C41291tg.A01(A00, A0v.A06);
                if (A01 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("RehydrateHsmJob/onRun/error: translation is null, param=");
                    sb.append(A07());
                    Log.e(sb.toString());
                    A08(1001);
                    return;
                }
                String A012 = C62362xm.A01(this.A00, A00, A0v, A01, A07(), false, false);
                C47812Cr A03 = this.A03.A03(this.locales, A0v.A09);
                if (A03 != null) {
                    Locale locale = new Locale(A03.A05, A03.A04);
                    AnonymousClass092 A02 = this.A08.A02(new AnonymousClass094(AbstractC005302j.A02(this.jid), false, this.id), this.timestamp, (byte) 0);
                    A02.A0d(AbstractC005302j.A02(this.participant));
                    A02.A0l(A012);
                    Long l = this.verifiedSender;
                    if (l != null) {
                        A02.A0U = l;
                    }
                    A02.A0A = this.verifiedLevel;
                    A02.A0U(8);
                    A02.A0V(this.expiration);
                    Long l2 = this.existingMessageRowId;
                    if (l2 != null) {
                        A02.A0p = l2.longValue();
                        AnonymousClass092 A0F = this.A05.A0F(A02.A0n);
                        if (A0F == null) {
                            this.A05.A0m(A02, 11);
                        } else {
                            byte b = A0F.A0m;
                            if (b == 11) {
                                Log.i("rehydrateHsmJob/message-exists-already-replace-decryption-failure");
                                this.A05.A0j(A02);
                            } else if (b == 31) {
                                Log.i("rehydrateHsmJob/message-exists-already-replace-multi-device-placeholder");
                                this.A05.A0j(A02);
                            } else {
                                StringBuilder A0P4 = C000200d.A0P("rehydrateHsmJob/message-exists-already-non-decryption-failure type=");
                                A0P4.append(C0DB.A06(b));
                                Log.i(A0P4.toString());
                                A02.A0f(A0F);
                                this.A05.A0m(A02, 11);
                            }
                        }
                    } else {
                        this.A05.A0j(A02);
                    }
                    C41291tg c41291tg = this.A03;
                    c41291tg.A01.A01(locale, A03.A06);
                    return;
                }
                throw null;
            } catch (HSMRehydrationUtil$SendStructUnavailableException e) {
                A08(e.errorCode);
            }
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A05() {
        return this.A04.A05() >= this.expireTimeMs || super.A05();
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("RehydrateHsmJob/onShouldRetry/w: exception while rehydrating message");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return false;
    }

    public final String A07() {
        AbstractC005302j A02 = AbstractC005302j.A02(this.jid);
        StringBuilder A0P = C000200d.A0P("; id=");
        A0P.append(this.id);
        A0P.append("; jid=");
        A0P.append(A02);
        A0P.append("; participant=");
        A0P.append(this.participant);
        A0P.append("; persistentId=");
        A0P.append(super.A01);
        return A0P.toString();
    }

    public final void A08(Integer num) {
        this.A06.A0C(AbstractC005302j.A02(this.jid), this.id, AbstractC005302j.A02(this.participant), num, null, null);
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = context.getApplicationContext();
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A04 = c0c5.A0d();
        this.A01 = c0c5.A0F();
        this.A06 = c0c5.A1M();
        c0c5.A0w();
        this.A02 = c0c5.A0S();
        c0c5.A1N();
        this.A08 = c0c5.A1R();
        this.A05 = c0c5.A0n();
        this.A03 = c0c5.A0U();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A07 = C40531sQ.A0A((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A0P = C000200d.A0P("RehydrateHsmJob/readObject/error: missing message bytes ");
            A0P.append(A07());
            Log.e(A0P.toString());
        }
        if (this.A07 == null) {
            StringBuilder A0P2 = C000200d.A0P("RehydrateHsmJob/readObject/error: message is null");
            A0P2.append(A07());
            Log.e(A0P2.toString());
        }
        C40531sQ c40531sQ = this.A07;
        if (c40531sQ != null && (c40531sQ.A00 & 8192) != 8192) {
            StringBuilder A0P3 = C000200d.A0P("message must contain an HSM");
            A0P3.append(A07());
            throw new InvalidObjectException(A0P3.toString());
        } else if (this.id != null) {
            if (this.jid != null) {
                if (this.timestamp > 0) {
                    if (this.expireTimeMs > 0) {
                        Locale[] localeArr = this.locales;
                        if (localeArr == null || localeArr.length == 0) {
                            StringBuilder A0P4 = C000200d.A0P("locales[] must not be empty");
                            A0P4.append(A07());
                            throw new InvalidObjectException(A0P4.toString());
                        }
                        return;
                    }
                    StringBuilder A0P5 = C000200d.A0P("expireTimeMs must be non-negative");
                    A0P5.append(A07());
                    throw new InvalidObjectException(A0P5.toString());
                }
                StringBuilder A0P6 = C000200d.A0P("timestamp must be valid");
                A0P6.append(A07());
                throw new InvalidObjectException(A0P6.toString());
            }
            StringBuilder A0P7 = C000200d.A0P("jid must not be null");
            A0P7.append(A07());
            throw new InvalidObjectException(A0P7.toString());
        } else {
            StringBuilder A0P8 = C000200d.A0P("id must not be null");
            A0P8.append(A07());
            throw new InvalidObjectException(A0P8.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A07.A0B());
    }
}
