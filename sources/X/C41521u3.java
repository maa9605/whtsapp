package X;

import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1u3 */
/* loaded from: classes2.dex */
public class C41521u3 implements C0EH, InterfaceC41531u4, C0EI {
    public static volatile C41521u3 A0J;
    public final AbstractC000600i A00;
    public final C03940Hu A01;
    public final C02L A02;
    public final C01B A03;
    public final C0E6 A04;
    public final C010005b A05;
    public final C0G2 A06;
    public final C0G4 A07;
    public final C03730Gv A08;
    public final C0C8 A09;
    public final C0EB A0A;
    public final C42821wN A0B;
    public final C05Y A0C;
    public final C0EN A0D;
    public final InterfaceC002901k A0E;
    public final C41981up A0F;
    public final C41991uq A0G;
    public static InterfaceC03930Ht A0I = new InterfaceC03930Ht() { // from class: X.3g0
        @Override // X.InterfaceC03930Ht
        public final int AE1(byte b) {
            return b == 3 ? 100 : 1;
        }
    };
    public static InterfaceC03930Ht A0H = new InterfaceC03930Ht() { // from class: X.3g1
        @Override // X.InterfaceC03930Ht
        public final int AE1(byte b) {
            return b == 1 ? 100 : 1;
        }
    };

    public C41521u3(AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C41981up c41981up, C41991uq c41991uq, C01B c01b, C0EB c0eb, C0EN c0en, C0E6 c0e6, C05Y c05y, C42821wN c42821wN, C010005b c010005b, C03940Hu c03940Hu, C0G2 c0g2, C03730Gv c03730Gv, C0C8 c0c8, C0G4 c0g4) {
        this.A00 = abstractC000600i;
        this.A02 = c02l;
        this.A0E = interfaceC002901k;
        this.A0F = c41981up;
        this.A0G = c41991uq;
        this.A03 = c01b;
        this.A0A = c0eb;
        this.A0D = c0en;
        this.A04 = c0e6;
        this.A0C = c05y;
        this.A0B = c42821wN;
        this.A05 = c010005b;
        this.A01 = c03940Hu;
        this.A06 = c0g2;
        this.A08 = c03730Gv;
        this.A09 = c0c8;
        this.A07 = c0g4;
    }

    public static C41521u3 A00() {
        if (A0J == null) {
            synchronized (C0EG.class) {
                if (A0J == null) {
                    AbstractC000600i A00 = AbstractC000600i.A00();
                    C02L A002 = C02L.A00();
                    InterfaceC002901k A003 = C002801j.A00();
                    C41981up A004 = C41981up.A00();
                    C41991uq A005 = C41991uq.A00();
                    C01B A006 = C01B.A00();
                    C0EB A007 = C0EB.A00();
                    C0EN A008 = C0EN.A00();
                    C0E6 A009 = C0E6.A00();
                    C0GU.A00();
                    C05Y A01 = C05Y.A01();
                    C018708s.A00();
                    C42821wN A0010 = C42821wN.A00();
                    C010005b c010005b = C010005b.A07;
                    C0CB.A00();
                    C03940Hu A0011 = C03940Hu.A00();
                    AnonymousClass075.A00();
                    A0J = new C41521u3(A00, A002, A003, A004, A005, A006, A007, A008, A009, A01, A0010, c010005b, A0011, C0G2.A00(), C03730Gv.A00(), C0C8.A00(), C0G4.A00());
                }
            }
        }
        return A0J;
    }

    public void A01(int i, AbstractC005302j abstractC005302j, long j, int i2) {
        if (C003101m.A0a(abstractC005302j)) {
            return;
        }
        A0D(new C03950Hv(abstractC005302j, i, j, 0L), i2);
    }

    public void A02(int i, String str, String str2) {
        if (!this.A05.A06 || str == null) {
            return;
        }
        this.A0C.A09(Message.obtain(null, 0, 49, 0, new C03960Hw(i, str, str2)));
    }

    public void A03(int i, boolean z, int i2) {
        if (this.A0F.A04()) {
            this.A0C.A0A(Message.obtain(null, 0, 257, 0, new C03980Hy(i, z, i2)), "clear-ga-banner", false);
        }
    }

    public final void A04(C0G3 c0g3, boolean z) {
        if (this.A05.A06 && this.A0F.A04()) {
            double A00 = c0g3.A00();
            if (Double.isNaN(A00)) {
                return;
            }
            C41991uq c41991uq = this.A0G;
            C03990Hz c03990Hz = new C03990Hz((int) A00, c0g3.A01(), z);
            if (c03990Hz.equals(c41991uq.A0T.getAndSet(c03990Hz))) {
                return;
            }
            this.A0C.A09(Message.obtain(null, 0, 56, 0, new C0I0(c03990Hz)));
        }
    }

    public void A05(C0I1 c0i1, boolean z) {
        C41981up c41981up = this.A0F;
        if ((c41981up.A04() || z) && C003101m.A0P(c0i1)) {
            ArrayList arrayList = new ArrayList(this.A09.A01(c0i1).A04().A02());
            C02L c02l = this.A02;
            c02l.A05();
            arrayList.remove(c02l.A03);
            C42831wO c42831wO = new C42831wO(this, c0i1, z);
            ((AbstractC42841wP) c42831wO).A00 = c41981up.A01().A03;
            C41991uq c41991uq = this.A0G;
            C0I2 c0i2 = new C0I2(c41991uq, c42831wO);
            String A03 = c41991uq.A03();
            C0E6 c0e6 = this.A04;
            c0e6.A00.A01(new SendWebForwardJob(A03, c41981up.A01().A03, Message.obtain(null, 0, 51, 0, new C0I5(A03, c0i1, arrayList, c0i2))));
        }
    }

    public void A06(AbstractC005302j abstractC005302j, Collection collection, int i) {
        C41981up c41981up = this.A0F;
        if (!c41981up.A04() || abstractC005302j == null || collection == null || collection.size() == 0) {
            return;
        }
        C42861wS c42861wS = new C42861wS(this, abstractC005302j, collection, i);
        ((AbstractC42841wP) c42861wS).A00 = c41981up.A01().A03;
        C41991uq c41991uq = this.A0G;
        C0I2 c0i2 = new C0I2(c41991uq, c42861wS);
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass092) it.next()).A0n);
        }
        String A03 = c41991uq.A03();
        C0E6 c0e6 = this.A04;
        String str = c41981up.A01().A03;
        C03950Hv c03950Hv = new C03950Hv(abstractC005302j, 2);
        c03950Hv.A00 = i;
        c0e6.A00.A01(new SendWebForwardJob(A03, str, Message.obtain(null, 0, 54, 0, new C0I9(A03, abstractC005302j, arrayList, c03950Hv, c0i2))));
    }

    public void A07(AbstractC005302j abstractC005302j, boolean z) {
        if (abstractC005302j == null || C003101m.A0a(abstractC005302j)) {
            return;
        }
        C41981up c41981up = this.A0F;
        if (c41981up.A04()) {
            C42871wT c42871wT = new C42871wT(this, abstractC005302j, z);
            ((AbstractC42841wP) c42871wT).A00 = c41981up.A01().A03;
            C41991uq c41991uq = this.A0G;
            C0I2 c0i2 = new C0I2(c41991uq, c42871wT);
            String A03 = c41991uq.A03();
            C0E6 c0e6 = this.A04;
            c0e6.A00.A01(new SendWebForwardJob(A03, c41981up.A01().A03, Message.obtain(null, 0, 48, 0, new C0IA(A03, abstractC005302j, z, c0i2))));
        }
    }

    public void A08(Jid jid, String str, boolean z, String str2, String str3, long j, String str4) {
        C41991uq c41991uq;
        C42881wU c42881wU;
        StringBuilder A0W = C000200d.A0W("app/xmpp/recv/qr_terminate recv: ", str2, " local: ");
        C41981up c41981up = this.A0F;
        A0W.append(c41981up.A01().A03);
        A0W.append(" clear: ");
        A0W.append(z);
        Log.i(A0W.toString());
        if (c41981up.A04() && c41981up.A01().A03.equals(str2)) {
            Handler handler = this.A01.A00;
            handler.removeMessages(5);
            handler.removeMessages(3);
            handler.removeMessages(4);
            c41991uq = this.A0G;
            c41991uq.A07 = false;
            c41991uq.A0B();
            c41991uq.A0C(j, c41991uq.A0L.A01().A00);
            c41991uq.A0F(z);
        } else {
            c41991uq = this.A0G;
            c41991uq.A0C(j, str3);
        }
        if (str2 != null) {
            if (!str2.equals(c41981up.A01().A03) && str3 != null && z && c41991uq.A05().containsKey(str3)) {
                c41991uq.A0H(false, str3);
                c41991uq.A0A();
            }
        } else if (str4 != null && str3 != null && z && (c42881wU = (C42881wU) c41991uq.A05().get(str3)) != null) {
            byte[] decode = Base64.decode(c42881wU.A0A, 0);
            byte[] bArr = new byte[32];
            System.arraycopy(decode, 0, bArr, 0, 32);
            byte[] bArr2 = new byte[32];
            System.arraycopy(decode, 32, bArr2, 0, 32);
            byte[] A01 = C42891wV.A01(bArr2, bArr);
            if (A01 != null && Base64.encodeToString(A01, 2).equals(str4)) {
                c41991uq.A0H(false, str3);
                c41991uq.A0A();
            }
        }
        this.A0D.A09(str, 0L, jid, null, "web");
    }

    public void A09(UserJid userJid) {
        if (this.A05.A06 && this.A0F.A04() && userJid != null) {
            this.A0E.AS1(new RunnableEBaseShape3S0200000_I0_3(this, userJid, 23));
        }
    }

    public void A0A(UserJid userJid, C40531sQ c40531sQ, long j) {
        if (!this.A0F.A04() || c40531sQ == null || userJid == null) {
            return;
        }
        this.A0C.A09(Message.obtain(null, 0, 155, 0, new C0IB(userJid, c40531sQ.A0B(), j)));
    }

    public void A0B(AnonymousClass094 anonymousClass094, int i) {
        C41981up c41981up = this.A0F;
        if (c41981up.A04()) {
            if (i != 0 && i != 5 && i != 13 && i != 7 && i != 8) {
                Log.e("app/xmpp/send/qr_msg_status invalid status");
                return;
            }
            C42901wW c42901wW = new C42901wW(this, anonymousClass094, i);
            ((AbstractC42841wP) c42901wW).A00 = c41981up.A01().A03;
            C41991uq c41991uq = this.A0G;
            C0I2 c0i2 = new C0I2(c41991uq, c42901wW);
            String A03 = c41991uq.A03();
            C0E6 c0e6 = this.A04;
            c0e6.A00.A01(new SendWebForwardJob(A03, c41981up.A01().A03, Message.obtain(null, 0, 47, 0, new C0IC(A03, anonymousClass094, i, c0i2))));
        }
    }

    public void A0C(AnonymousClass092 anonymousClass092, String str) {
        if (anonymousClass092 == null || str == null) {
            return;
        }
        C41981up c41981up = this.A0F;
        if (c41981up.A04() && (anonymousClass092.A0A() instanceof UserJid)) {
            C42911wX c42911wX = new C42911wX(this, anonymousClass092, str);
            ((AbstractC42841wP) c42911wX).A00 = c41981up.A01().A03;
            C41991uq c41991uq = this.A0G;
            C0I2 c0i2 = new C0I2(c41991uq, c42911wX);
            String A03 = c41991uq.A03();
            C0E6 c0e6 = this.A04;
            c0e6.A00.A01(new SendWebForwardJob(A03, c41981up.A01().A03, Message.obtain(null, 0, 127, 0, new C0ID(A03, (UserJid) anonymousClass092.A0A(), str, anonymousClass092.A0n, c0i2))));
        }
    }

    public void A0D(C03950Hv c03950Hv, int i) {
        if (C003101m.A0a(c03950Hv.A06)) {
            return;
        }
        A0I(Collections.singletonList(c03950Hv), Integer.valueOf(i));
    }

    public void A0E(C03890Hn c03890Hn) {
        C41981up c41981up = this.A0F;
        if (c41981up.A04()) {
            AnonymousClass094 anonymousClass094 = c03890Hn.A0n;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (C003101m.A0Z(abstractC005302j)) {
                String A02 = C0EB.A02(this.A0A.A08());
                C42911wX c42911wX = new C42911wX(this, c03890Hn, A02);
                ((AbstractC42841wP) c42911wX).A00 = c41981up.A01().A03;
                C41991uq c41991uq = this.A0G;
                C0I2 c0i2 = new C0I2(c41991uq, c42911wX);
                String A03 = c41991uq.A03();
                if (c03890Hn.A0G instanceof UserJid) {
                    C0E6 c0e6 = this.A04;
                    c0e6.A00.A01(new SendWebForwardJob(anonymousClass094.A01, c41981up.A01().A03, Message.obtain(null, 0, 154, 0, new C0IE(A03, (UserJid) c03890Hn.A0G, A02, anonymousClass094, c03890Hn.A00, c0i2))));
                    return;
                }
                return;
            }
            C0E6 c0e62 = this.A04;
            String str = anonymousClass094.A01;
            c0e62.A00.A01(new SendWebForwardJob(str, c41981up.A01().A03, Message.obtain(null, 0, 128, 0, new C0IF(str, c03890Hn.A00, anonymousClass094.A02, abstractC005302j, c03890Hn.A0G))));
        }
    }

    public void A0F(String str, int i) {
        if (this.A05.A06 && this.A0F.A04() && str != null) {
            this.A0C.A09(Message.obtain(null, 0, 57, 0, new C0IG(str, i)));
        }
    }

    public void A0G(String str, String str2) {
        if (this.A0F.A04()) {
            C000700j.A03(str2);
            this.A0C.A09(Message.obtain(null, 0, 199, 0, new C0IH(str, "delete", str2)));
        }
    }

    public void A0H(String str, String str2) {
        if (this.A0F.A04()) {
            C000700j.A08(!"delete".equals(str2), "sendWebStickerPacksUpdate should not handle delete event, use sendWebStickerPacksDelete for that");
            this.A0C.A09(Message.obtain(null, 0, 199, 0, new C0IH(str, str2, null)));
        }
    }

    public void A0I(List list, Integer num) {
        C41981up c41981up = this.A0F;
        if (c41981up.A04()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C03950Hv c03950Hv = (C03950Hv) it.next();
                if (!C003101m.A0a(c03950Hv.A06)) {
                    if (num != null) {
                        c03950Hv.A00 = num.intValue();
                    }
                    arrayList.add(c03950Hv);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            C42921wY c42921wY = new C42921wY(this, arrayList);
            ((AbstractC42841wP) c42921wY).A00 = c41981up.A01().A03;
            C41991uq c41991uq = this.A0G;
            C0I2 c0i2 = new C0I2(c41991uq, c42921wY);
            String A03 = c41991uq.A03();
            C0E6 c0e6 = this.A04;
            c0e6.A00.A01(new SendWebForwardJob(A03, c41981up.A01().A03, Message.obtain(null, 0, 52, 0, new C0II(A03, arrayList, c0i2))));
        }
    }

    public void A0J(boolean z) {
        if (this.A05.A06) {
            C41981up c41981up = this.A0F;
            if (c41981up.A04()) {
                this.A0C.A09(Message.obtain(null, 0, 44, 0, new C0IJ(z)));
                A08(null, null, z, c41981up.A01().A03, c41981up.A01().A00, 0L, null);
            }
        }
    }

    public boolean A0K(String str) {
        C41991uq c41991uq = this.A0G;
        Number number = (Number) c41991uq.A06(true).get(str);
        if (number == null) {
            c41991uq.A0E(str, -1);
            return false;
        }
        int intValue = number.intValue();
        if (intValue < 0) {
            return true;
        }
        A0F(str, intValue);
        return true;
    }

    @Override // X.InterfaceC41531u4
    public void AHg(DeviceJid deviceJid) {
        if (deviceJid != null) {
            A09(deviceJid.userJid);
        }
    }

    @Override // X.C0EH
    public void AHw(C0G3 c0g3) {
        A04(c0g3, this.A07.A00);
    }

    @Override // X.C0EI
    public void AN8(boolean z) {
        A04(this.A06.A00, z);
    }
}
