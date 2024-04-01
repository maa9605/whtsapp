package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.AnonymousClass029;
import X.AnonymousClass094;
import X.C000200d;
import X.C003101m;
import X.C05200Ns;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import X.C1u5;
import X.C76123g5;
import android.content.Context;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

/* loaded from: classes2.dex */
public final class ReceiptMultiTargetProcessingJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C1u5 A00;
    public final boolean keyFromMe;
    public final String keyId;
    public final String keyRemoteChatJidRawString;
    public final String[] participantDeviceJidRawString;
    public final C05200Ns receiptPrivacyMode;
    public final String remoteJidString;
    public final int status;
    public final long[] timestamp;

    public ReceiptMultiTargetProcessingJob(AnonymousClass094 anonymousClass094, Jid jid, int i, List list, C05200Ns c05200Ns) {
        super(new JobParameters(new LinkedList(), true, "ReceiptProcessingGroup"));
        int size = list.size();
        this.keyId = anonymousClass094.A01;
        this.keyFromMe = anonymousClass094.A02;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            this.keyRemoteChatJidRawString = abstractC005302j.getRawString();
            this.remoteJidString = jid.getRawString();
            this.status = i;
            this.participantDeviceJidRawString = new String[size];
            this.timestamp = new long[size];
            this.receiptPrivacyMode = c05200Ns;
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                this.participantDeviceJidRawString[i2] = C003101m.A07((Jid) pair.first);
                long[] jArr = this.timestamp;
                Object obj = pair.second;
                if (obj == null) {
                    throw null;
                }
                jArr[i2] = ((Number) obj).longValue();
            }
            return;
        }
        throw null;
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("ReceiptMultiTargetProcessingJob/onAdded ");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("ReceiptMultiTargetProcessingJob/onCanceled/cancel job param=");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        StringBuilder A0P = C000200d.A0P("ReceiptMultiTargetProcessingJob/onRun/start param=");
        A0P.append(A07());
        Log.i(A0P.toString());
        AnonymousClass094 anonymousClass094 = new AnonymousClass094(AbstractC005302j.A01(this.keyRemoteChatJidRawString), this.keyFromMe, this.keyId);
        Jid jid = Jid.get(this.remoteJidString);
        int length = this.participantDeviceJidRawString.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            DeviceJid nullable = DeviceJid.getNullable(this.participantDeviceJidRawString[i]);
            if (nullable != null) {
                arrayList.add(new Pair(nullable, Long.valueOf(this.timestamp[i])));
            }
        }
        C76123g5 c76123g5 = new C76123g5(anonymousClass094, jid, this.status, arrayList, null, false, this.receiptPrivacyMode);
        C1u5 c1u5 = this.A00;
        if (c1u5 != null) {
            C0Ml c0Ml = new C0Ml();
            c1u5.A06(new RunnableEBaseShape2S0300000_I1(c0Ml, c1u5, c76123g5, 7), 13);
            c0Ml.get();
            return;
        }
        throw null;
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("ReceiptMultiTargetProcessingJob/onShouldRetry/exception while running param=");
        A0P.append(A07());
        Log.w(A0P.toString());
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; keyRemoteJid=");
        A0P.append(Jid.getNullable(this.keyRemoteChatJidRawString));
        A0P.append("; remoteJid=");
        A0P.append(Jid.getNullable(this.remoteJidString));
        A0P.append("; number of participants=");
        A0P.append(this.participantDeviceJidRawString.length);
        A0P.append("; recepitPrivacyMode=");
        A0P.append(this.receiptPrivacyMode);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) AnonymousClass029.A0X(context.getApplicationContext())).A1S();
    }
}
