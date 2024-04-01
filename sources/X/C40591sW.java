package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import java.util.Map;

/* renamed from: X.1sW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40591sW {
    public final byte A00;
    public final Jid A01;
    public final VoipStanzaChildNode A02;
    public final VoipStanzaChildNode A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        r1 = com.whatsapp.jid.DeviceJid.of(r2.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        r0 = X.AnonymousClass029.A0K(r10, "enc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        r7.put(r1, r0);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C40591sW(com.whatsapp.jid.Jid r14, java.lang.String r15, com.whatsapp.protocol.VoipStanzaChildNode r16, java.lang.String r17) {
        /*
            r13 = this;
            r13.<init>()
            boolean r0 = X.C003101m.A0R(r14)
            if (r0 == 0) goto Lc1
            r13.A01 = r14
            r13.A04 = r15
            r2 = r16
            r13.A03 = r2
            r0 = r17
            r13.A05 = r0
            java.lang.String r0 = "destination"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.AnonymousClass029.A0K(r2, r0)
            r13.A02 = r0
            r4 = 0
            if (r0 == 0) goto L8b
            com.whatsapp.protocol.VoipStanzaChildNode[] r8 = r0.getChildrenCopy()
            r12 = 0
            if (r8 != 0) goto L32
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no children under destination"
            com.whatsapp.util.Log.i(r0)
            java.lang.String r0 = "no <dest> node"
            X.C000700j.A08(r4, r0)
            throw r12
        L32:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r6 = r8.length
            r5 = 0
        L39:
            if (r5 >= r6) goto L88
            r10 = r8[r5]
            X.04P[] r11 = r10.getAttributesCopy()
            if (r11 != 0) goto L4e
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no attribute in <to>"
            com.whatsapp.util.Log.e(r0)
            java.lang.String r0 = "no attr in <to>"
            X.C000700j.A08(r4, r0)
            throw r12
        L4e:
            int r9 = r11.length
            r3 = 0
        L50:
            if (r3 >= r9) goto L7d
            r2 = r11[r3]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "jid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r1 == 0) goto L7d
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.AnonymousClass029.A0K(r10, r0)
            if (r0 == 0) goto L78
            byte[] r0 = r0.getDataCopy()
        L72:
            r7.put(r1, r0)
            int r5 = r5 + 1
            goto L39
        L78:
            r0 = r12
            goto L72
        L7a:
            int r3 = r3 + 1
            goto L50
        L7d:
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no deviceJid in <to>"
            com.whatsapp.util.Log.e(r0)
            java.lang.String r0 = "no deviceJid in <to>"
            X.C000700j.A08(r4, r0)
            throw r12
        L88:
            r13.A06 = r7
            return
        L8b:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)
            r5 = r1
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r2 = X.AnonymousClass029.A0K(r2, r0)
            if (r2 == 0) goto Lb6
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r14)
            if (r1 == 0) goto Lbf
            byte[] r0 = r2.getDataCopy()
            r3.put(r1, r0)
            java.lang.Byte r1 = X.AnonymousClass029.A0P(r2)
            if (r1 != 0) goto Lb6
            java.lang.String r0 = "invalid retry count!"
            X.C000700j.A08(r4, r0)
            r1 = r5
        Lb6:
            byte r0 = r1.byteValue()
            r13.A00 = r0
            r13.A06 = r3
            return
        Lbf:
            r0 = 0
            throw r0
        Lc1:
            java.lang.String r1 = "CallOfferStanza: Wrong jid type: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40591sW.<init>(com.whatsapp.jid.Jid, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode, java.lang.String):void");
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("jid=");
        A0P.append(this.A01);
        A0P.append(" callId=");
        A0P.append(this.A04);
        A0P.append(" payload=");
        A0P.append(this.A03);
        A0P.append(" format=");
        A0P.append(this.A02 != null ? "fan-out" : "legacy");
        return A0P.toString();
    }
}
