package X;

import android.os.Message;
import com.whatsapp.jid.Jid;

/* renamed from: X.273 */
/* loaded from: classes2.dex */
public class AnonymousClass273 implements C0EK {
    public static volatile AnonymousClass273 A0A;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C0E4 A02;
    public final C0E6 A03;
    public final C01J A04;
    public final C01R A05;
    public final C41461tx A06;
    public final C05Y A07;
    public final C0EG A08;
    public final C0EJ A09;

    public AnonymousClass273(C018508q c018508q, AbstractC000600i abstractC000600i, C0EG c0eg, C0E6 c0e6, C05Y c05y, C01R c01r, C0E4 c0e4, C01J c01j, C0EJ c0ej, C41461tx c41461tx) {
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A08 = c0eg;
        this.A03 = c0e6;
        this.A07 = c05y;
        this.A02 = c0e4;
        this.A04 = c01j;
        this.A09 = c0ej;
        this.A06 = c41461tx;
        this.A05 = c01r;
    }

    public final void A00(String str, Jid jid, int i) {
        C05Y c05y = this.A07;
        Message obtain = Message.obtain(null, 0, 225, i, jid);
        obtain.getData().putString("id", str);
        c05y.A0C(obtain);
    }

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{114, 120, 115, 116, 117, 170, 172, 206};
    }

    /* JADX WARN: Removed duplicated region for block: B:531:0x04eb  */
    @Override // X.C0EK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AEN(int r30, android.os.Message r31) {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass273.AEN(int, android.os.Message):boolean");
    }
}
