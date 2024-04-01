package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.AnonymousClass094;
import X.C000200d;
import X.C003101m;
import X.C02180Ae;
import X.C05200Ns;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import X.C1u5;
import X.C76113g4;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

/* loaded from: classes2.dex */
public final class ReceiptProcessingJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C1u5 A00;
    public final boolean[] keyFromMe;
    public final String[] keyId;
    public final String[] keyRemoteChatJidRawString;
    public final String participantDeviceJidRawString;
    public final C05200Ns receiptPrivacyMode;
    public final String remoteJidRawString;
    public final int status;
    public final long timestamp;

    public ReceiptProcessingJob(AnonymousClass094[] anonymousClass094Arr, Jid jid, DeviceJid deviceJid, int i, long j, C05200Ns c05200Ns) {
        super(new JobParameters(new LinkedList(), true, "ReceiptProcessingGroup"));
        int length = anonymousClass094Arr.length;
        String[] strArr = new String[length];
        this.keyId = strArr;
        boolean[] zArr = new boolean[length];
        this.keyFromMe = zArr;
        String[] strArr2 = new String[length];
        this.keyRemoteChatJidRawString = strArr2;
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = anonymousClass094Arr[i2].A01;
            AnonymousClass094 anonymousClass094 = anonymousClass094Arr[i2];
            zArr[i2] = anonymousClass094.A02;
            strArr2[i2] = C003101m.A07(anonymousClass094.A00);
        }
        this.remoteJidRawString = jid.getRawString();
        this.participantDeviceJidRawString = C003101m.A07(deviceJid);
        this.status = i;
        this.timestamp = j;
        this.receiptPrivacyMode = c05200Ns;
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("ReceiptProcessingJob/onAdded ");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("ReceiptProcessingJob/onCanceled/cancel job param=");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        StringBuilder A0P = C000200d.A0P("ReceiptProcessingJob/onRun/start param=");
        A0P.append(A07());
        Log.i(A0P.toString());
        int length = this.keyId.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            AbstractC005302j A02 = AbstractC005302j.A02(this.keyRemoteChatJidRawString[i]);
            if (A02 != null) {
                arrayList.add(new AnonymousClass094(A02, this.keyFromMe[i], this.keyId[i]));
            }
        }
        C76113g4 c76113g4 = new C76113g4((AnonymousClass094[]) arrayList.toArray(new AnonymousClass094[0]), Jid.get(this.remoteJidRawString), DeviceJid.getNullable(this.participantDeviceJidRawString), this.status, this.timestamp, null, false, this.receiptPrivacyMode);
        C1u5 c1u5 = this.A00;
        if (c1u5 != null) {
            C0Ml c0Ml = new C0Ml();
            c1u5.A06(new RunnableEBaseShape2S0300000_I1(c0Ml, c1u5, c76113g4, 7), 13);
            c0Ml.get();
            return;
        }
        throw null;
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("ReceiptProcessingJob/onShouldRetry/exception while running param=");
        A0P.append(A07());
        Log.w(A0P.toString());
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; remoteJid=");
        A0P.append(Jid.getNullable(this.remoteJidRawString));
        A0P.append("; number of keys=");
        A0P.append(this.keyId.length);
        A0P.append("; receiptPrivacyMode=");
        A0P.append(this.receiptPrivacyMode);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A1S();
    }
}
