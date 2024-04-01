package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.29S  reason: invalid class name */
/* loaded from: classes2.dex */
public class C29S implements InterfaceC010405f {
    public final AbstractC000600i A00;
    public final C29Q A01;
    public final C05Y A02;
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final boolean A04;

    public C29S(AbstractC000600i abstractC000600i, C05Y c05y, boolean z, C29Q c29q) {
        this.A00 = abstractC000600i;
        this.A02 = c05y;
        this.A04 = z;
        this.A01 = c29q;
    }

    public static final C29N A00(C02590Ca c02590Ca, String str) {
        Long l;
        String str2;
        String str3;
        if (c02590Ca.A0D("error") != null) {
            C02590Ca A0E = c02590Ca.A0E("error");
            Long valueOf = Long.valueOf(A0E.A07("backoff", 7200L) * 1000);
            C04P A0A = A0E.A0A("text");
            if (A0A != null) {
                str3 = A0A.A03;
            } else {
                str3 = null;
            }
            int A05 = A0E.A05("code", -1);
            long A07 = A0E.A07("backoff", -1L);
            StringBuilder A0X = C000200d.A0X("connection/unisynciq/parse/", str, "/error/", "error_text= ", str3);
            A0X.append(", code: ");
            A0X.append(A05);
            A0X.append(", backoff:");
            A0X.append(A07);
            Log.w(A0X.toString());
            return new C29N(false, null, valueOf, Integer.valueOf(A05));
        }
        C04P A0A2 = c02590Ca.A0A("refresh");
        if (A0A2 != null && (str2 = A0A2.A03) != null) {
            l = Long.valueOf(Long.parseLong(str2) * 1000);
        } else {
            l = null;
        }
        return new C29N(true, l, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d0, code lost:
        if (r0 != false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [byte[], X.0Ca[], X.04P[]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [byte[], X.0Ca[], X.04P[]] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [byte[], com.whatsapp.jid.Jid, X.0Ca[], X.04P[]] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], X.0Ca[], com.whatsapp.jid.Jid, X.04P[]] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [byte[], X.0Ca[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.concurrent.Future A01(java.lang.String r40, X.C2TY r41, long r42) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29S.A01(java.lang.String, X.2TY, long):java.util.concurrent.Future");
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C58112qb c58112qb = (C58112qb) this.A03.remove(str);
        if (c58112qb != null) {
            c58112qb.A00.A00(new C3TL(str));
        } else {
            Log.w("UniSyncProtocolHelper/onDeliveryFailure missing request");
        }
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        String str2;
        String str3;
        C58112qb c58112qb = (C58112qb) this.A03.remove(str);
        if (c58112qb != null) {
            C02590Ca A0D = c02590Ca.A0D("error");
            long j = -1;
            int i = 0;
            if (A0D != null) {
                C04P A0A = A0D.A0A("code");
                if (A0A != null && (str3 = A0A.A03) != null) {
                    i = Integer.parseInt(str3);
                }
                C04P A0A2 = A0D.A0A("backoff");
                if (A0A2 != null && (str2 = A0A2.A03) != null) {
                    j = Long.parseLong(str2) * 1000;
                }
            }
            if (!c58112qb.A02) {
                StringBuilder A0P = C000200d.A0P("UniSyncProtocolHelper/handleSyncContactError sid=");
                String str4 = c58112qb.A01;
                C000200d.A1S(A0P, str4, " code=", i, " backoff=");
                C000200d.A1I(A0P, j);
                this.A01.AEK(str4, 0, i, j);
            }
            c58112qb.A00.A01(null);
            return;
        }
        Log.w("UniSyncProtocolHelper/onError missing request");
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01b0 A[SYNTHETIC] */
    @Override // X.InterfaceC010405f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void APJ(java.lang.String r43, X.C02590Ca r44) {
        /*
            Method dump skipped, instructions count: 1403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29S.APJ(java.lang.String, X.0Ca):void");
    }
}
