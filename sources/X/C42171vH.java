package X;

import com.whatsapp.Conversation;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1vH */
/* loaded from: classes2.dex */
public class C42171vH implements C0EQ {
    public static volatile C42171vH A0P;
    public boolean A00;
    public boolean A01;
    public final C018508q A02;
    public final C02L A03;
    public final C03150Ej A04;
    public final C01B A05;
    public final C03310Fe A06;
    public final C469829b A07;
    public final C470029d A08;
    public final C0G2 A09;
    public final C000400f A0A;
    public final C02E A0B;
    public final C001200o A0C;
    public final C000500h A0D;
    public final C002301c A0E;
    public final C0C9 A0F;
    public final C2CT A0G = new AnonymousClass038() { // from class: X.2CT
    };
    public final C0CC A0H;
    public final C2CS A0I;
    public final C0EG A0J;
    public final C0CB A0K;
    public final AbstractC40441sG A0L;
    public final C40431sF A0M;
    public final C0Fi A0N;
    public final InterfaceC002901k A0O;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2CT] */
    public C42171vH(C001200o c001200o, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C0EG c0eg, C01B c01b, C470029d c470029d, C02E c02e, C002301c c002301c, C2CS c2cs, C0C9 c0c9, C03310Fe c03310Fe, C40431sF c40431sF, C0CB c0cb, C000400f c000400f, C0CC c0cc, C42501vq c42501vq, C000500h c000500h, C0G2 c0g2, C03150Ej c03150Ej, C0Fi c0Fi, C469829b c469829b) {
        this.A0C = c001200o;
        this.A02 = c018508q;
        this.A03 = c02l;
        this.A0O = interfaceC002901k;
        this.A0J = c0eg;
        this.A05 = c01b;
        this.A08 = c470029d;
        this.A0B = c02e;
        this.A0E = c002301c;
        this.A0I = c2cs;
        this.A0F = c0c9;
        this.A06 = c03310Fe;
        this.A0M = c40431sF;
        this.A0L = c42501vq;
        this.A0K = c0cb;
        this.A0A = c000400f;
        this.A0H = c0cc;
        this.A0D = c000500h;
        this.A09 = c0g2;
        this.A04 = c03150Ej;
        this.A0N = c0Fi;
        this.A07 = c469829b;
        c03150Ej.A01(new C0PH() { // from class: X.3A3
            {
                C42171vH.this = this;
            }

            @Override // X.C0PH
            public final void AOK(boolean z) {
                C42171vH c42171vH = C42171vH.this;
                if (c42171vH.A02(z)) {
                    c42171vH.A01(-1L, new C2CW(c42171vH, null));
                }
            }
        });
    }

    public static C42171vH A00() {
        if (A0P == null) {
            synchronized (C42171vH.class) {
                if (A0P == null) {
                    A0P = new C42171vH(C001200o.A01, C018508q.A00(), C02L.A00(), C002801j.A00(), C0EG.A00(), C01B.A00(), C470029d.A00(), C02E.A00(), C002301c.A00(), C2CS.A00(), C0C9.A00(), C03310Fe.A00(), C40431sF.A00(), C0CB.A00(), C000400f.A00(), C0CC.A01(), C42501vq.A03(), C000500h.A00(), C0G2.A00(), C03150Ej.A00(), C0Fi.A00(), C469829b.A00());
                }
            }
        }
        return A0P;
    }

    public void A01(long j, C2CU c2cu) {
        C2CT c2ct = this.A0G;
        c2ct.A00(c2cu);
        this.A0O.ARy(new C0HS(this.A0C, j, this.A08, this.A0B, this.A0L, c2ct, this.A0I, this.A0F, this.A0M, this.A0K, this, this.A0H) { // from class: X.2CV
            public final long A00;
            public final C470029d A01;
            public final C02E A02;
            public final C001200o A03;
            public final C0C9 A04;
            public final C2CT A05;
            public final C42171vH A06;
            public final C0CC A07;
            public final C2CS A08;
            public final C0CB A09;
            public final AbstractC40441sG A0A;
            public final C40431sF A0B;

            {
                this.A03 = r1;
                this.A00 = j;
                this.A01 = r4;
                this.A02 = r5;
                this.A0A = r6;
                this.A05 = c2ct;
                this.A08 = r8;
                this.A04 = r9;
                this.A0B = r10;
                this.A09 = r11;
                this.A06 = this;
                this.A07 = r13;
            }

            @Override // X.C0HS
            public void A03(Object[] objArr) {
                C2CT c2ct2 = this.A05;
                int intValue = ((Integer[]) objArr)[0].intValue();
                synchronized (c2ct2.A00) {
                    Iterator it = new ArrayList(c2ct2.A00.A01).iterator();
                    while (it.hasNext()) {
                        ((C2CU) it.next()).ANR(intValue);
                    }
                }
            }

            @Override // X.C0HS
            public void A06() {
                C2CT c2ct2 = this.A05;
                synchronized (c2ct2.A00) {
                    Iterator it = new ArrayList(c2ct2.A00.A01).iterator();
                    while (it.hasNext()) {
                        ((C2CU) it.next()).AHx();
                    }
                }
                this.A01.A01(1, true);
            }

            /* JADX WARN: Code restructure failed: missing block: B:444:0x04d7, code lost:
                if (r5.isHeld() != false) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:466:0x0515, code lost:
                if (r5.isHeld() != false) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:467:0x0517, code lost:
                r5.release();
                com.whatsapp.util.Log.i("localbackupmanager/backup/wl/release");
             */
            /* JADX WARN: Finally extract failed */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r55) {
                /*
                    Method dump skipped, instructions count: 1365
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2CV.A07(java.lang.Object[]):java.lang.Object");
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Conversation conversation;
                Integer num = (Integer) obj;
                StringBuilder sb = new StringBuilder("local/backup/done ");
                sb.append(num);
                Log.i(sb.toString());
                C0C9 c0c9 = this.A04;
                C0OU c0ou = (C0OU) Conversation.A58.get();
                if (c0ou.A02) {
                    conversation = c0ou.A00();
                    StringBuilder A0P2 = C000200d.A0P("conversation/ondbwasclosed/session/active/changecursor/jid ");
                    A0P2.append(conversation.A2a);
                    A0P2.toString();
                } else {
                    conversation = c0ou.A00;
                    if (conversation == null || conversation.isFinishing()) {
                        conversation = null;
                    } else {
                        StringBuilder A0P3 = C000200d.A0P("conversation/ondbwasclosed/session/inactive/changecursor/jid ");
                        A0P3.append(conversation.A2a);
                        A0P3.toString();
                    }
                }
                if (conversation != null) {
                    C27661Og A08 = c0c9.A08(conversation.A2a, conversation.A0A, conversation.A1Z(), conversation.A09);
                    conversation.A1S.A0N.clear();
                    conversation.A1S.A0I.clear();
                    conversation.A0A = A08.A01;
                    conversation.A1S.changeCursor(A08.A00);
                }
                C2CT c2ct2 = this.A05;
                int intValue = num.intValue();
                synchronized (c2ct2.A00) {
                    Iterator it = new ArrayList(c2ct2.A00.A01).iterator();
                    while (it.hasNext()) {
                        ((C2CU) it.next()).AH0(intValue);
                    }
                }
                this.A01.A01(1, false);
            }
        }, new Void[0]);
    }

    public final boolean A02(boolean z) {
        C02L c02l = this.A03;
        c02l.A05();
        return c02l.A00 != null && this.A00 && z && !this.A0A.A08() && this.A09.A00.A02();
    }

    @Override // X.C0EQ
    public void AKy() {
        if (A02(this.A04.A00)) {
            A01(-1L, new C2CW(this, null));
        }
    }
}
