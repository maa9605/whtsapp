package X;

import com.whatsapp.util.Log;

/* renamed from: X.2La */
/* loaded from: classes2.dex */
public abstract class C2La {
    public final C0HK A00 = new C0HK();
    public final C018508q A01;
    public final C0E6 A02;
    public final C05W A03;
    public final C41321tj A04;
    public final C000400f A05;
    public final C03290Fc A06;
    public final C49552Lb A07;
    public final C41181tV A08;
    public final C42711wC A09;
    public final C23Y A0A;
    public final C02960Do A0B;
    public final C0C8 A0C;
    public final C0CC A0D;
    public final C42431vj A0E;
    public final C05N A0F;
    public final C0EB A0G;
    public final C2CS A0H;
    public final C49562Lc A0I;
    public final C0ES A0J;
    public final C40291rx A0K;
    public final C41511u2 A0L;
    public final C0EG A0M;
    public final C2Aa A0N;
    public final C0CB A0O;
    public final AbstractC40441sG A0P;
    public final C26S A0Q;
    public final C40431sF A0R;
    public final InterfaceC002901k A0S;

    public C2La(C018508q c018508q, InterfaceC002901k interfaceC002901k, C41181tV c41181tV, C0EG c0eg, C0EB c0eb, C0E6 c0e6, C05W c05w, C23Y c23y, C40291rx c40291rx, C03290Fc c03290Fc, C2CS c2cs, C0ES c0es, C40431sF c40431sF, AbstractC40441sG abstractC40441sG, C0CB c0cb, C000400f c000400f, C41321tj c41321tj, C0CC c0cc, C41511u2 c41511u2, C2Aa c2Aa, C02960Do c02960Do, C49552Lb c49552Lb, C26S c26s, C42711wC c42711wC, C0C8 c0c8, C42431vj c42431vj, C05N c05n, C49562Lc c49562Lc) {
        this.A01 = c018508q;
        this.A0S = interfaceC002901k;
        this.A08 = c41181tV;
        this.A0M = c0eg;
        this.A0G = c0eb;
        this.A02 = c0e6;
        this.A03 = c05w;
        this.A0A = c23y;
        this.A0K = c40291rx;
        this.A06 = c03290Fc;
        this.A0H = c2cs;
        this.A0J = c0es;
        this.A0R = c40431sF;
        this.A0P = abstractC40441sG;
        this.A0O = c0cb;
        this.A05 = c000400f;
        this.A04 = c41321tj;
        this.A0D = c0cc;
        this.A0L = c41511u2;
        this.A0N = c2Aa;
        this.A0B = c02960Do;
        this.A07 = c49552Lb;
        this.A0Q = c26s;
        this.A0C = c0c8;
        this.A09 = c42711wC;
        this.A0E = c42431vj;
        this.A0F = c05n;
        this.A0I = c49562Lc;
    }

    public void A00() {
        C2S4 c2s4 = (C2S4) this;
        Log.i("PrepareDirectTransferMsgStoreHelper/createAndRunPrepareMessageStoreTask");
        C2S5 c2s5 = new C2S5(c2s4);
        c2s4.A00 = c2s5;
        c2s4.A0S.ARy(c2s5, new Object[0]);
    }

    public void A01() {
    }

    public void A02() {
        if (!this.A0N.A0F()) {
            this.A00.A0A(0);
        } else {
            A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
        if (r1 == 3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.C03860Hk r14) {
        /*
            r13 = this;
            r0 = r13
            X.2S4 r0 = (X.C2S4) r0
            X.26I r10 = r0.A03
            r12 = 0
            if (r10 == 0) goto Laf
            boolean r0 = r14 instanceof X.C07400Yb
            if (r0 == 0) goto La7
            r10.A03()
            int r11 = r14.A00
            X.00h r0 = r10.A05
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "migrate_from_other_app_attempt_count"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            r9 = 8
            r8 = 7
            r7 = 6
            r6 = 5
            r5 = 2
            r4 = 1
            r3 = 3
            switch(r11) {
                case 0: goto L64;
                case 1: goto L61;
                case 2: goto L27;
                case 3: goto L5e;
                case 4: goto L5b;
                case 5: goto L59;
                case 6: goto L57;
                case 7: goto L54;
                case 8: goto L52;
                case 9: goto L50;
                case 10: goto L4e;
                case 11: goto L4b;
                case 12: goto L48;
                case 13: goto L45;
                case 14: goto L42;
                case 15: goto L3f;
                case 16: goto L3c;
                case 17: goto L39;
                case 18: goto L36;
                case 19: goto L27;
                case 20: goto L33;
                default: goto L27;
            }
        L27:
            java.lang.String r0 = "state is not recognized or not used = "
            java.lang.String r1 = X.C000200d.A0D(r0, r11)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L33:
            r0 = 19
            goto L65
        L36:
            r0 = 15
            goto L65
        L39:
            r0 = 14
            goto L65
        L3c:
            r0 = 13
            goto L65
        L3f:
            r0 = 12
            goto L65
        L42:
            r0 = 11
            goto L65
        L45:
            r0 = 10
            goto L65
        L48:
            r0 = 9
            goto L65
        L4b:
            r0 = 8
            goto L65
        L4e:
            r0 = 7
            goto L65
        L50:
            r0 = 6
            goto L65
        L52:
            r0 = 5
            goto L65
        L54:
            r0 = 18
            goto L65
        L57:
            r0 = 2
            goto L65
        L59:
            r0 = 1
            goto L65
        L5b:
            r0 = 17
            goto L65
        L5e:
            r0 = 16
            goto L65
        L61:
            r0 = 20
            goto L65
        L64:
            r0 = 3
        L65:
            r10.A06(r1, r0)
            if (r11 == r4) goto L6d
            r4 = 0
            if (r1 != r3) goto L85
        L6d:
            X.1vG r2 = r10.A0A
            if (r2 == 0) goto La6
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "migration_state_on_provider_side"
            r1.putInt(r0, r5)
            java.lang.String r0 = "InterAppCommunicationManager/setDirectMigrationStateOnProviderSide"
            com.whatsapp.util.Log.i(r0)
            java.lang.String r0 = "com.whatsapp.registration.directmigration.setMigrationStateOnProviderSide"
            r2.A03(r0, r1)
        L85:
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/afterMessageStoreVerified/success = "
            X.C000200d.A1C(r0, r4)
            if (r4 == 0) goto L90
            r10.A05(r5)
            return
        L90:
            if (r11 != r6) goto L96
            r10.A05(r6)
            return
        L96:
            if (r11 != r7) goto L9c
            r10.A05(r7)
            return
        L9c:
            if (r11 != r8) goto La2
            r10.A05(r9)
            return
        La2:
            r10.A05(r3)
            return
        La6:
            throw r12
        La7:
            java.lang.String r1 = "should only use RestoreFromDirectMigrationStatus class here"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        Laf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2La.A03(X.0Hk):void");
    }
}
