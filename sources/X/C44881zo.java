package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1zo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44881zo extends AbstractC44611zM {
    public final UserJid A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r1[0].equals(r3) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C44881zo(java.lang.String r14, long r15, X.C44651zQ r17, boolean r18, com.whatsapp.jid.UserJid r19, java.lang.String r20, java.lang.String r21, X.C44841zk r22) {
        /*
            r13 = this;
            r3 = r20
            r1 = r21
            r8 = 2
            java.lang.String r12 = "critical_unblock_low"
            r10 = r18
            r9 = r17
            r4 = r13
            r7 = r14
            r11 = r22
            r5 = r15
            r4.<init>(r5, r7, r8, r9, r10, r11, r12)
            r0 = r19
            r13.A00 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = ""
            if (r0 == 0) goto L20
            r1 = r2
        L20:
            r13.A01 = r1
            if (r20 == 0) goto L39
            java.lang.String r0 = " "
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            if (r0 == 0) goto L36
            r0 = 0
            r0 = r1[r0]
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L39
        L36:
            r13.A02 = r3
            return
        L39:
            r3 = r2
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44881zo.<init>(java.lang.String, long, X.1zQ, boolean, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, X.1zk):void");
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        if (this.A05.equals(C44841zk.A02)) {
            return null;
        }
        C0CT AVX = C20L.A03.AVX();
        String str = this.A01;
        AVX.A02();
        C20L c20l = (C20L) AVX.A00;
        if (str != null) {
            c20l.A00 |= 1;
            c20l.A02 = str;
            String str2 = this.A02;
            if (!TextUtils.isEmpty(str2)) {
                AVX.A02();
                C20L c20l2 = (C20L) AVX.A00;
                if (str2 != null) {
                    c20l2.A00 |= 2;
                    c20l2.A01 = str2;
                } else {
                    throw null;
                }
            }
            C877940o A01 = super.A01();
            A01.A02();
            AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
            if (anonymousClass204 != null) {
                anonymousClass204.A04 = (C20L) AVX.A01();
                anonymousClass204.A00 |= 4;
                return A01;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("ContactMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", contactJid=");
        A0P.append(this.A00);
        A0P.append(", givenName=");
        A0P.append(this.A02);
        A0P.append(", displayName=");
        A0P.append(this.A01);
        A0P.append(", timestamp=");
        A0P.append(this.A04);
        A0P.append(", areDependenciesMissing=");
        A0P.append(A05());
        A0P.append(", operation=");
        A0P.append(this.A05);
        A0P.append(", collectionName=");
        A0P.append(this.A06);
        A0P.append(", keyId=");
        A0P.append(super.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
