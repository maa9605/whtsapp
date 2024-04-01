package com.whatsapp.jobqueue.job;

import X.AnonymousClass029;
import X.C000200d;
import X.C01J;
import X.C01R;
import X.C05020My;
import X.C05Y;
import X.C0C5;
import X.C0E4;
import X.C0I7;
import X.C0Ml;
import X.C0Z2;
import X.C48862Hc;
import android.content.Context;
import android.os.Message;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public final class RotateSignedPreKeyJob extends Job implements C0I7 {
    public static final long serialVersionUID = 1;
    public transient C0E4 A00;
    public transient C01J A01;
    public transient C01R A02;
    public transient C05Y A03;
    public final byte[] data;
    public final byte[] id;
    public final byte[] signature;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RotateSignedPreKeyJob(byte[] r5, byte[] r6, byte[] r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            java.lang.String r1 = "RotateSignedPreKeyJob"
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            if (r5 == 0) goto L7e
            int r3 = r5.length
            if (r3 == 0) goto L7e
            r4.id = r5
            if (r6 == 0) goto L78
            int r2 = r6.length
            if (r2 == 0) goto L78
            r4.data = r6
            if (r7 == 0) goto L72
            int r1 = r7.length
            if (r1 == 0) goto L72
            r4.signature = r7
            r0 = 3
            if (r3 != r0) goto L5f
            r0 = 32
            if (r2 != r0) goto L4c
            r0 = 64
            if (r1 != r0) goto L39
            return
        L39:
            java.lang.String r0 = "invalid signed pre-key signature length: "
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L4c:
            java.lang.String r0 = "invalid signed pre-key length: "
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L5f:
            java.lang.String r0 = "invalid signed pre-key id length: "
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L72:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L78:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L7e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RotateSignedPreKeyJob.<init>(byte[], byte[], byte[]):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("rotate signed pre key job added");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("canceled rotate signed pre key job");
        A0P.append(A07());
        Log.w(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        StringBuilder A0P = C000200d.A0P("starting rotate signed pre key job");
        A0P.append(A07());
        Log.i(A0P.toString());
        C01R c01r = this.A02;
        if (!Arrays.equals(this.id, ((C05020My) c01r.A00.submit(new Callable() { // from class: X.2xb
            {
                RotateSignedPreKeyJob.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RotateSignedPreKeyJob.this.A01.A0F();
            }
        }).get()).A01)) {
            StringBuilder A0P2 = C000200d.A0P("aborting rotate signed pre key job due to id mismatch with latest");
            A0P2.append(A07());
            Log.w(A0P2.toString());
            return;
        }
        String A02 = this.A03.A02();
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicReference atomicReference = new AtomicReference();
        C05Y c05y = this.A03;
        C05020My c05020My = new C05020My(this.id, this.data, this.signature);
        Message obtain = Message.obtain(null, 0, 86, 0, new C48862Hc(this, atomicInteger, atomicReference));
        obtain.getData().putString("iqId", A02);
        obtain.getData().putParcelable("signedPreKey", new C0Z2(c05020My));
        ((C0Ml) c05y.A05(A02, obtain, false)).get();
        int i = atomicInteger.get();
        if (i == 503) {
            StringBuilder A0P3 = C000200d.A0P("server 503 error during rotate signed pre key job");
            A0P3.append(A07());
            throw new Exception(A0P3.toString());
        } else if (i == 409) {
            StringBuilder sb = new StringBuilder();
            sb.append("server error code returned during rotate signed pre key job; errorCode=");
            sb.append(i);
            sb.append(A07());
            Log.w(sb.toString());
            Object obj = atomicReference.get();
            if (obj != null) {
                C01R c01r2 = this.A02;
                c01r2.A00.submit(new RunnableEBaseShape2S0200000_I0_2(this, obj, 32));
            }
        } else if (i == 0) {
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("server error code returned during rotate signed pre key job; errorCode=");
            sb2.append(i);
            sb2.append(A07());
            Log.w(sb2.toString());
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("exception while running rotate signed pre key job");
        A0P.append(A07());
        Log.w(A0P.toString(), exc);
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; signedPreKeyId=");
        A0P.append(AnonymousClass029.A09(this.id));
        A0P.append("; persistentId=");
        A0P.append(super.A01);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A03 = c0c5.A1H();
        this.A02 = c0c5.A0k();
        this.A00 = c0c5.A0O();
        this.A01 = c0c5.A0j();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] bArr = this.id;
        if (bArr != null) {
            byte[] bArr2 = this.data;
            if (bArr2 != null) {
                byte[] bArr3 = this.signature;
                if (bArr3 != null) {
                    int length = bArr.length;
                    if (length == 3) {
                        int length2 = bArr2.length;
                        if (length2 == 32) {
                            int length3 = bArr3.length;
                            if (length3 == 64) {
                                return;
                            }
                            StringBuilder A0P = C000200d.A0P("invalid signed pre-key signature length: ");
                            A0P.append(length3);
                            throw new InvalidObjectException(A0P.toString());
                        }
                        StringBuilder A0P2 = C000200d.A0P("invalid signed pre-key length: ");
                        A0P2.append(length2);
                        throw new InvalidObjectException(A0P2.toString());
                    }
                    StringBuilder A0P3 = C000200d.A0P("invalid signed pre-key id length: ");
                    A0P3.append(length);
                    throw new InvalidObjectException(A0P3.toString());
                }
                throw new InvalidObjectException("signature cannot be null");
            }
            throw new InvalidObjectException("data cannot be null");
        }
        throw new InvalidObjectException("id cannot be null");
    }
}
