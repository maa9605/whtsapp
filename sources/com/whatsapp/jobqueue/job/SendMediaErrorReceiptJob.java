package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.AnonymousClass029;
import X.C000200d;
import X.C003101m;
import X.C01B;
import X.C01C;
import X.C02A;
import X.C04420Kc;
import X.C05Y;
import X.C0C5;
import X.C0I7;
import X.C0Ml;
import X.C0Z6;
import X.C41501u1;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes.dex */
public final class SendMediaErrorReceiptJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C01B A00;
    public transient C41501u1 A01;
    public transient C05Y A02;
    public final byte[] mediaKey;
    public final String messageId;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendMediaErrorReceiptJob(X.AnonymousClass097 r5) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r2 = 1
            java.lang.String r1 = "media-error-receipt"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            X.094 r1 = r5.A0n
            X.02j r0 = r1.A00
            if (r0 == 0) goto L3f
            java.lang.String r0 = r0.getRawString()
            r4.remoteJidRawJid = r0
            X.02j r0 = r5.A0G
            java.lang.String r0 = X.C003101m.A07(r0)
            r4.remoteResourceRawJid = r0
            java.lang.String r0 = r1.A01
            r4.messageId = r0
            X.09H r0 = r5.A02
            if (r0 == 0) goto L3d
            byte[] r0 = r0.A0U
            if (r0 == 0) goto L3b
            r4.mediaKey = r0
            return
        L3b:
            r0 = 0
            throw r0
        L3d:
            r0 = 0
            throw r0
        L3f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob.<init>(X.097):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        C000200d.A1O(C000200d.A0P("SendMediaErrorReceiptJob/canceled send played receipts job id="), this.messageId);
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        AbstractC005302j abstractC005302j;
        byte[] bArr;
        AbstractC005302j A02 = AbstractC005302j.A02(this.remoteJidRawJid);
        if (!TextUtils.isEmpty(this.remoteResourceRawJid)) {
            abstractC005302j = AbstractC005302j.A02(this.remoteResourceRawJid);
        } else {
            abstractC005302j = null;
        }
        String str = this.messageId;
        boolean A0P = C003101m.A0P(abstractC005302j);
        AbstractC005302j abstractC005302j2 = A02;
        if (A0P) {
            abstractC005302j2 = abstractC005302j;
        }
        if (abstractC005302j2 != null) {
            if (C003101m.A0U(A02) || C003101m.A0Z(A02)) {
                A02 = abstractC005302j;
            } else if (!A0P) {
                A02 = null;
            }
            byte[] bArr2 = null;
            HashMap hashMap = new HashMap();
            C04420Kc c04420Kc = new C04420Kc(abstractC005302j2, "receipt", str, "server-error", null, A02, null, null, 0L, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
            if (this.A00.A0E(C01C.A1W)) {
                if (this.A01 != null) {
                    bArr2 = C02A.A0C(12);
                    C41501u1 c41501u1 = this.A01;
                    String str2 = this.messageId;
                    if (c41501u1 != null) {
                        if (JniBridge.getInstance() != null) {
                            Object jvidispatchOO = JniBridge.jvidispatchOO(1, str2);
                            byte[] bArr3 = this.mediaKey;
                            String str3 = this.messageId;
                            C41501u1.A01(bArr3, bArr2);
                            if (c41501u1.A00.A00 != null) {
                                bArr = (byte[]) JniBridge.jvidispatchOOOOO(0, str3, jvidispatchOO, bArr3, bArr2);
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                bArr = null;
            }
            ((C0Ml) this.A02.A04(c04420Kc, Message.obtain(null, 0, 77, 0, new C0Z6(abstractC005302j2, A02, this.messageId, bArr, bArr2)))).get();
            return;
        }
        throw null;
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("SendMediaErrorReceiptJob/exception while running sent played receipt job id=");
        A0P.append(this.messageId);
        Log.w(A0P.toString(), exc);
        return true;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A00 = c0c5.A0Q();
        this.A02 = c0c5.A1H();
        this.A01 = c0c5.A1F();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.remoteJidRawJid)) {
            if (TextUtils.isEmpty(this.messageId)) {
                throw new InvalidObjectException("messageId must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("remoteJid must not be empty");
    }
}
