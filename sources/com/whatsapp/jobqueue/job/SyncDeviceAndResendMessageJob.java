package com.whatsapp.jobqueue.job;

import X.AbstractC005302j;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.C000200d;
import X.C003101m;
import X.C03890Hn;
import X.C05Q;
import X.C0C5;
import X.C0E8;
import X.C0E9;
import X.C0I7;
import X.C0Ml;
import X.C22H;
import X.C41321tj;
import X.C41331tk;
import X.C41511u2;
import X.EnumC40721sl;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

/* loaded from: classes2.dex */
public class SyncDeviceAndResendMessageJob extends Job implements C0I7 {
    public transient C41321tj A00;
    public transient C41331tk A01;
    public transient AnonymousClass012 A02;
    public transient C05Q A03;
    public transient C0E8 A04;
    public transient C0E9 A05;
    public transient C41511u2 A06;
    public transient AnonymousClass094 A07;
    public final long expirationMs;
    public final String messageId;
    public final String messageRawChatJid;
    public final String[] rawUserJids;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SyncDeviceAndResendMessageJob(X.AnonymousClass094 r5, com.whatsapp.jid.UserJid[] r6, long r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r2 = 1
            r1 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r2, r1)
            r4.<init>(r0)
            X.C000700j.A0B(r6)
            int r3 = r6.length
            r2 = 0
        L1c:
            if (r2 >= r3) goto L28
            r1 = r6[r2]
            java.lang.String r0 = "invalid jid"
            X.C000700j.A04(r1, r0)
            int r2 = r2 + 1
            goto L1c
        L28:
            r4.A07 = r5
            java.util.List r0 = java.util.Arrays.asList(r6)
            java.lang.String[] r0 = X.C003101m.A0d(r0)
            r4.rawUserJids = r0
            java.lang.String r0 = r5.A01
            r4.messageId = r0
            X.02j r0 = r5.A00
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.getRawString()
            r4.messageRawChatJid = r0
            r4.expirationMs = r7
            return
        L45:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob.<init>(X.094, com.whatsapp.jid.UserJid[], long):void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        StringBuilder A0P = C000200d.A0P("SyncDeviceAndResendMessageJob/onAdded/sync devices job added param=");
        A0P.append(A07());
        Log.i(A0P.toString());
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("SyncDeviceAndResendMessageJob/onCanceled/param=");
        A0P.append(A07());
        Log.w(A0P.toString());
        C41331tk c41331tk = this.A01;
        AnonymousClass094 anonymousClass094 = this.A07;
        synchronized (c41331tk.A02) {
            c41331tk.A02.remove(anonymousClass094);
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A04() {
        Set A03;
        StringBuilder A0P = C000200d.A0P("SyncDeviceAndResendMessageJob/onRun/param=");
        A0P.append(A07());
        Log.i(A0P.toString());
        if (this.expirationMs > 0 && this.A02.A05() > this.expirationMs) {
            Log.w("SyncDeviceAndResendMessageJob/onRun/skipping job due to expiration");
            return;
        }
        try {
            C41321tj c41321tj = this.A00;
            List A0G = C003101m.A0G(this.rawUserJids);
            if (!((AbstractCollection) A0G).isEmpty()) {
                if (((EnumC40721sl) c41321tj.A03(A0G, C22H.A0B).get()).A00()) {
                    AnonymousClass094 anonymousClass094 = this.A07;
                    AnonymousClass092 A05 = this.A03.A05(anonymousClass094);
                    if (A05 == null) {
                        StringBuilder sb = new StringBuilder("SyncDeviceAndResendMessageJob/revokeMessage/message ");
                        sb.append(anonymousClass094);
                        sb.append(" no longer exist");
                        Log.i(sb.toString());
                        return;
                    }
                    Set A04 = this.A05.A04(anonymousClass094);
                    C0E8 c0e8 = this.A04;
                    if (c0e8 != null) {
                        if (A05 instanceof C03890Hn) {
                            A03 = c0e8.A02(A05);
                        } else {
                            A03 = (A05.A0n.A02 && A05.A0C == 0) ? c0e8.A03(A05) : null;
                        }
                        StringBuilder sb2 = new StringBuilder("SyncDeviceAndResendMessageJob/original list = ");
                        sb2.append(A04);
                        Log.i(sb2.toString());
                        StringBuilder sb3 = new StringBuilder("SyncDeviceAndResendMessageJob/new list = ");
                        sb3.append(A03);
                        Log.i(sb3.toString());
                        if (A03 != null) {
                            A03.removeAll(A04);
                            if (!A03.isEmpty()) {
                                C0E9 c0e9 = this.A05;
                                if (c0e9 != null) {
                                    A03.size();
                                    c0e9.A06(A05, A03, false);
                                    C0Ml c0Ml = new C0Ml();
                                    this.A06.A03(A05, null, null, A03, false, false, 0L, this.expirationMs, null, c0Ml);
                                    c0Ml.get();
                                    return;
                                }
                                throw null;
                            }
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw new IllegalArgumentException("jid list is empty");
        } catch (Exception e) {
            StringBuilder A0P2 = C000200d.A0P("SyncDeviceAndResendMessageJob/onRun/error, param=");
            A0P2.append(A07());
            Log.e(A0P2.toString());
            throw e;
        }
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("SyncDeviceAndResendMessageJob/onShouldReply/param=");
        A0P.append(A07());
        A0P.append(" ;exception=");
        A0P.append(exc);
        Log.w(A0P.toString());
        return true;
    }

    public final String A07() {
        StringBuilder A0P = C000200d.A0P("; rawJids=");
        A0P.append(Arrays.toString(this.rawUserJids));
        A0P.append("; key=");
        A0P.append(this.A07);
        A0P.append("; timeoutMs=");
        A0P.append(this.expirationMs);
        return A0P.toString();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A02 = c0c5.A0d();
        this.A03 = c0c5.A0l();
        this.A00 = c0c5.A0Z();
        this.A05 = c0c5.A0v();
        this.A06 = c0c5.A1L();
        this.A01 = c0c5.A0a();
        this.A04 = c0c5.A0r();
        C41331tk c41331tk = this.A01;
        AnonymousClass094 anonymousClass094 = this.A07;
        synchronized (c41331tk.A02) {
            c41331tk.A02.add(anonymousClass094);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr != null && (r5 = strArr.length) != 0) {
            HashSet hashSet = new HashSet();
            for (String str : strArr) {
                UserJid nullable = UserJid.getNullable(str);
                if (nullable != null) {
                    hashSet.add(nullable);
                } else {
                    throw new InvalidObjectException(C000200d.A0H("invalid jid:", str));
                }
            }
            AbstractC005302j A02 = AbstractC005302j.A02(this.messageRawChatJid);
            if (A02 != null) {
                this.A07 = new AnonymousClass094(A02, true, this.messageId);
                return;
            }
            StringBuilder A0P = C000200d.A0P("invalid jid:");
            A0P.append(this.messageRawChatJid);
            throw new InvalidObjectException(A0P.toString());
        }
        throw new InvalidObjectException("rawJids must not be empty");
    }
}
