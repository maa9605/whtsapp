package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0E4 */
/* loaded from: classes.dex */
public class C0E4 {
    public static volatile C0E4 A0H;
    public boolean A02;
    public boolean A03;
    public C05020My[] A04;
    public final C018508q A05;
    public final C010005b A06;
    public final AnonymousClass012 A07;
    public final C000500h A08;
    public final C01J A09;
    public final C01R A0A;
    public final C05Y A0B;
    public final C0EZ A0C;
    public final C465627i A0D;
    public final AbstractC465527h A0E;
    public final InterfaceC002901k A0G;
    public long A01 = 0;
    public long A00 = 0;
    public final C0J5 A0F = new C0J5(10, 610);

    public C0E4(AnonymousClass012 anonymousClass012, C018508q c018508q, InterfaceC002901k interfaceC002901k, C05Y c05y, C01R c01r, C010005b c010005b, C01J c01j, C000500h c000500h, C0EZ c0ez, AbstractC465527h abstractC465527h, C465627i c465627i) {
        this.A07 = anonymousClass012;
        this.A05 = c018508q;
        this.A0G = interfaceC002901k;
        this.A0B = c05y;
        this.A0A = c01r;
        this.A06 = c010005b;
        this.A09 = c01j;
        this.A08 = c000500h;
        this.A0C = c0ez;
        this.A0E = abstractC465527h;
        this.A0D = c465627i;
    }

    public static C0E4 A00() {
        if (A0H == null) {
            synchronized (C0E4.class) {
                if (A0H == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C018508q A002 = C018508q.A00();
                    InterfaceC002901k A003 = C002801j.A00();
                    C05Y A01 = C05Y.A01();
                    C01R c01r = C01R.A02;
                    C010005b c010005b = C010005b.A07;
                    C01J A004 = C01J.A00();
                    C000500h A005 = C000500h.A00();
                    C0EZ A006 = C0EZ.A00();
                    AbstractC465527h A007 = AbstractC465527h.A00();
                    if (C465627i.A00 == null) {
                        synchronized (C465627i.class) {
                            if (C465627i.A00 == null) {
                                C465627i.A00 = new C465627i();
                            }
                        }
                    }
                    A0H = new C0E4(A00, A002, A003, A01, c01r, c010005b, A004, A005, A006, A007, C465627i.A00);
                }
            }
        }
        return A0H;
    }

    public void A01() {
        this.A09.A0K();
        A04();
    }

    public synchronized void A02() {
        this.A00 = 0L;
    }

    public synchronized void A03() {
        if (this.A06.A06) {
            long j = this.A00;
            if (j == 0 || this.A07.A04() - j > 60000) {
                this.A0B.A09(Message.obtain(null, 0, 88, 0));
                this.A00 = this.A07.A04();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/send-get-pre-key-digest/skip-digest-check last:");
        sb.append(this.A00);
        Log.i(sb.toString());
    }

    public synchronized void A04() {
        long A04 = this.A07.A04();
        if (this.A06.A06) {
            long j = this.A01;
            if (j == 0 || A04 - j > 180000) {
                A06(A04);
                A07(true);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MyPreKeysManager/sendSetPreKey/skip last:");
        sb.append(this.A01);
        Log.i(sb.toString());
    }

    public final synchronized void A05() {
        if (this.A03) {
            this.A03 = false;
            this.A0F.A02();
        }
    }

    public final synchronized void A06(long j) {
        this.A01 = j;
    }

    public final void A07(final boolean z) {
        this.A0A.A00();
        C01J c01j = this.A09;
        int A02 = c01j.A08.A02();
        final byte[] A0W = c01j.A0W();
        c01j.A0H.A00();
        C009604x c009604x = c01j.A00.A00;
        c009604x.A08.A00();
        List A01 = c009604x.A04.A01();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A01).iterator();
        while (it.hasNext()) {
            C05000Mw c05000Mw = (C05000Mw) it.next();
            try {
                arrayList.add(C009604x.A00(c05000Mw.A00, new C05010Mx(c05000Mw.A01)));
            } catch (IOException e) {
                StringBuilder A0P = C000200d.A0P("error reading prekey ");
                A0P.append(c05000Mw.A00);
                Log.e(A0P.toString(), e);
            }
        }
        StringBuilder A0P2 = C000200d.A0P("axolotl reporting back ");
        A0P2.append(arrayList.size());
        A0P2.append(" prekeys for sending to the server");
        Log.i(A0P2.toString());
        final C05020My[] c05020MyArr = (C05020My[]) arrayList.toArray(new C05020My[0]);
        final C05020My A0F = c01j.A0F();
        final byte[] A1c = AnonymousClass029.A1c(A02);
        C018508q c018508q = this.A05;
        c018508q.A02.post(new Runnable() { // from class: X.1I0
            {
                C0E4.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0E4 c0e4 = C0E4.this;
                byte[] bArr = A0W;
                byte[] bArr2 = A1c;
                C05020My[] c05020MyArr2 = c05020MyArr;
                C05020My c05020My = A0F;
                boolean z2 = z;
                C000700j.A01();
                if (z2) {
                    c0e4.A05();
                }
                synchronized (c0e4) {
                    c0e4.A02 = true;
                    c0e4.A04 = c05020MyArr2;
                }
                C05Y c05y = c0e4.A0B;
                Bundle bundle = new Bundle();
                bundle.putByteArray("identity", bArr);
                bundle.putByteArray("registration", bArr2);
                bundle.putByte("type", (byte) 5);
                int length = c05020MyArr2.length;
                C0Z2[] c0z2Arr = new C0Z2[length];
                for (int i = 0; i < length; i++) {
                    c0z2Arr[i] = new C0Z2(c05020MyArr2[i]);
                }
                bundle.putParcelableArray("preKeys", c0z2Arr);
                bundle.putParcelable("signedPreKey", new C0Z2(c05020My));
                bundle.putByteArray("vname", null);
                c05y.A09(Message.obtain(null, 0, 85, 0, bundle));
            }
        });
    }
}
