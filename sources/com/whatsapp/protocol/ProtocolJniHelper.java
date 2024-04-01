package com.whatsapp.protocol;

import X.C011305p;
import X.C02590Ca;
import X.C04P;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class ProtocolJniHelper {
    public static final ProtocolJniHelper INSTANCE = new ProtocolJniHelper();

    public Object createKeyValue(String str, String str2, Object obj, byte b) {
        return new C04P(str, str2, (Jid) obj, b);
    }

    public Object createNewJid(String str) {
        try {
            return Jid.get(str);
        } catch (C011305p e) {
            Log.w("ProtocolJniHelper/createNewJid", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if ((r8[0] instanceof X.C04P) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object createProtocolTreeNode(java.lang.String r7, java.lang.Object[] r8, java.lang.Object[] r9, byte[] r10) {
        /*
            r6 = this;
            r2 = 1
            r5 = 0
            if (r8 == 0) goto Lb
            r0 = r8[r5]
            boolean r0 = r0 instanceof X.C04P
            r1 = 0
            if (r0 == 0) goto Lc
        Lb:
            r1 = 1
        Lc:
            if (r9 == 0) goto L15
            r0 = r9[r5]
            boolean r0 = r0 instanceof X.C02590Ca
            if (r0 != 0) goto L15
            r2 = 0
        L15:
            if (r1 == 0) goto L3e
            if (r2 == 0) goto L3e
            r4 = 0
            if (r8 == 0) goto L29
            int r3 = r8.length
            X.04P[] r2 = new X.C04P[r3]
            r1 = 0
        L20:
            if (r1 >= r3) goto L2a
            r0 = r8[r1]
            r2[r1] = r0
            int r1 = r1 + 1
            goto L20
        L29:
            r2 = r4
        L2a:
            if (r9 == 0) goto L38
            int r1 = r9.length
            X.0Ca[] r4 = new X.C02590Ca[r1]
        L2f:
            if (r5 >= r1) goto L38
            r0 = r9[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L2f
        L38:
            X.0Ca r0 = new X.0Ca
            r0.<init>(r7, r2, r4, r10)
            return r0
        L3e:
            java.lang.String r1 = "ProtocolJniHelper/createProtocolTreeNode"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.ProtocolJniHelper.createProtocolTreeNode(java.lang.String, java.lang.Object[], java.lang.Object[], byte[]):java.lang.Object");
    }

    public Object[] getAttributesFromProtocolTreeNode(Object obj) {
        if (obj instanceof C02590Ca) {
            return ((C02590Ca) obj).A0I();
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getAttributesFromProtocolTreeNode");
    }

    public Object[] getChildrenFromProtocolTreeNode(Object obj) {
        if ((obj instanceof C02590Ca) && obj != null) {
            return ((C02590Ca) obj).A03;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getChildrenFromProtocolTreeNode");
    }

    public byte[] getDataFromProtocolTreeNode(Object obj) {
        if (obj instanceof C02590Ca) {
            return ((C02590Ca) obj).A01;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getDataFromProtocolTreeNode");
    }

    public static ProtocolJniHelper getInstance() {
        return INSTANCE;
    }

    public String getKeyFromKeyValue(Object obj) {
        if (obj instanceof C04P) {
            return ((C04P) obj).A02;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getKeyFromKeyValue");
    }

    public String getTagFromProtocolTreeNode(Object obj) {
        if (obj instanceof C02590Ca) {
            return ((C02590Ca) obj).A00;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getTagFromProtocolTreeNode");
    }

    public byte getTypeFromKeyValue(Object obj) {
        if (obj instanceof C04P) {
            return ((C04P) obj).A00;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getTypeFromKeyValue");
    }

    public String getValueStringFromKeyValue(Object obj) {
        if (obj instanceof C04P) {
            return ((C04P) obj).A03;
        }
        throw new IllegalArgumentException("ProtocolJniHelper/getValueStringFromKeyValue");
    }
}
