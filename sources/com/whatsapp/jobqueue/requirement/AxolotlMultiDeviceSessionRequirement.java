package com.whatsapp.jobqueue.requirement;

import X.AbstractC005302j;
import X.AnonymousClass029;
import X.C000200d;
import X.C003101m;
import X.C009304p;
import X.C011305p;
import X.C01J;
import X.C07920aJ;
import X.C0C5;
import X.C0E9;
import X.C0I7;
import X.C0IO;
import X.C41401tr;
import android.content.Context;
import android.database.Cursor;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public class AxolotlMultiDeviceSessionRequirement implements Requirement, C0I7 {
    public transient C01J A01;
    public transient C0E9 A02;
    public transient C41401tr A03;
    public transient AbstractC005302j A04;
    public transient Collection A06;
    public transient List A07;
    public transient boolean A08;
    public volatile transient int A09;
    public final String messageKeyId;
    public final String remoteRawJid;
    public final HashSet targetDeviceRawJids;
    public transient int A00 = 100;
    public transient Object A05 = new Object();

    public AxolotlMultiDeviceSessionRequirement(String str, AbstractC005302j abstractC005302j, Set set) {
        this.messageKeyId = str;
        this.A04 = abstractC005302j;
        this.remoteRawJid = abstractC005302j.getRawString();
        HashSet hashSet = new HashSet();
        C003101m.A0N(set, hashSet);
        this.targetDeviceRawJids = hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r1 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A00() {
        /*
            r11 = this;
            java.lang.Object r6 = r11.A05
            monitor-enter(r6)
            int r10 = r11.A00     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r11.A08     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L9b
            java.util.HashSet r0 = r11.targetDeviceRawJids     // Catch: java.lang.Throwable -> L9f
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L16
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9f
            r0 = 1
            if (r1 == 0) goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L3a
            java.lang.Class<com.whatsapp.jid.DeviceJid> r1 = com.whatsapp.jid.DeviceJid.class
            java.util.HashSet r0 = r11.targetDeviceRawJids     // Catch: java.lang.Throwable -> L9f
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L9f
            r4.<init>()     // Catch: java.lang.Throwable -> L9f
            X.C003101m.A0M(r1, r0, r4)     // Catch: java.lang.Throwable -> L9f
            r11.A06 = r4     // Catch: java.lang.Throwable -> L9f
            X.0E9 r3 = r11.A02     // Catch: java.lang.Throwable -> L9f
            X.094 r2 = new X.094     // Catch: java.lang.Throwable -> L9f
            X.02j r1 = r11.A04     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r11.messageKeyId     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r1, r8, r0)     // Catch: java.lang.Throwable -> L9f
            java.util.Set r0 = r3.A04(r2)     // Catch: java.lang.Throwable -> L9f
            r4.retainAll(r0)     // Catch: java.lang.Throwable -> L9f
            goto L4b
        L3a:
            X.0E9 r3 = r11.A02     // Catch: java.lang.Throwable -> L9f
            X.094 r2 = new X.094     // Catch: java.lang.Throwable -> L9f
            X.02j r1 = r11.A04     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r11.messageKeyId     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r1, r8, r0)     // Catch: java.lang.Throwable -> L9f
            java.util.Set r0 = r3.A04(r2)     // Catch: java.lang.Throwable -> L9f
            r11.A06 = r0     // Catch: java.lang.Throwable -> L9f
        L4b:
            java.util.Collection r0 = r11.A06     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L94
            java.util.Collection r0 = r11.A06     // Catch: java.lang.Throwable -> L9f
            java.util.List r9 = X.C002701i.A11(r0)     // Catch: java.lang.Throwable -> L9f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9f
            r0.<init>()     // Catch: java.lang.Throwable -> L9f
            r11.A07 = r0     // Catch: java.lang.Throwable -> L9f
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r5 = r9.size()     // Catch: java.lang.Throwable -> L9f
            int r5 = r5 / r10
            int r4 = r9.size()     // Catch: java.lang.Throwable -> L9f
            int r4 = r4 % r10
            r3 = 0
        L6d:
            if (r3 >= r5) goto L7f
            java.util.List r2 = r11.A07     // Catch: java.lang.Throwable -> L9f
            int r1 = r3 * r10
            int r3 = r3 + 1
            int r0 = r3 * r10
            java.util.List r0 = r9.subList(r1, r0)     // Catch: java.lang.Throwable -> L9f
            r2.add(r0)     // Catch: java.lang.Throwable -> L9f
            goto L6d
        L7f:
            if (r4 <= 0) goto L97
            java.util.List r2 = r11.A07     // Catch: java.lang.Throwable -> L9f
            int r1 = r9.size()     // Catch: java.lang.Throwable -> L9f
            int r1 = r1 - r4
            int r0 = r9.size()     // Catch: java.lang.Throwable -> L9f
            java.util.List r0 = r9.subList(r1, r0)     // Catch: java.lang.Throwable -> L9f
            r2.add(r0)     // Catch: java.lang.Throwable -> L9f
            goto L97
        L94:
            r0 = 0
            r11.A07 = r0     // Catch: java.lang.Throwable -> L9f
        L97:
            r11.A08 = r8     // Catch: java.lang.Throwable -> L9f
            r11.A09 = r7     // Catch: java.lang.Throwable -> L9f
        L9b:
            java.util.List r0 = r11.A07     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9f
            return r0
        L9f:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.A00():java.util.List");
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean AFd() {
        List A00 = A00();
        if (A00 == null || A00.isEmpty()) {
            return true;
        }
        int i = this.A09;
        do {
            C01J c01j = this.A01;
            List list = (List) A00.get(this.A09);
            int size = list.size();
            C009304p c009304p = c01j.A0C;
            Cursor A002 = c009304p.A00(list);
            try {
                boolean z = false;
                if (A002.getCount() != size) {
                    A002.getCount();
                    A002.close();
                    z = false;
                } else {
                    int i2 = 0;
                    while (A002.moveToNext()) {
                        byte[] blob = A002.getBlob(0);
                        C0IO c0io = new C0IO(String.valueOf(A002.getLong(1)), A002.getInt(2));
                        try {
                            C01J.A02(new C07920aJ(blob));
                            i2++;
                        } catch (IOException unused) {
                            c009304p.A01(c0io);
                            A002.close();
                            z = false;
                        }
                    }
                    A002.close();
                    if (size == i2) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
                int i3 = this.A09 + 1;
                this.A09 = i3;
                if (i3 == A00.size()) {
                    this.A09 = 0;
                }
            } finally {
            }
        } while (this.A09 != i);
        return true;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A01 = c0c5.A0j();
        this.A02 = c0c5.A0v();
        C41401tr A0z = c0c5.A0z();
        this.A03 = A0z;
        A0z.A00.put(this, new Object());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A04 = AbstractC005302j.A01(this.remoteRawJid);
            this.A00 = 100;
            this.A05 = new Object();
        } catch (C011305p unused) {
            StringBuilder A0P = C000200d.A0P("invalid jid=");
            A0P.append(this.remoteRawJid);
            throw new InvalidObjectException(A0P.toString());
        }
    }
}
