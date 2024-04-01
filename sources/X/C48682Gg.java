package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.util.SparseArray;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2Gg */
/* loaded from: classes2.dex */
public class C48682Gg implements InterfaceC48692Gh {
    public static final boolean A0I = AbstractC48662Ge.A01();
    public int A00;
    public int A01;
    public C40481sK A02;
    public C40481sK A03;
    public C3IE A04;
    public C3IF A05;
    public C3IF A06;
    public MediaViewFragment A07;
    public Runnable A08;
    public boolean A09;
    public boolean A0A;
    public final C0C9 A0D;
    public final C40411sD A0E;
    public final AbstractC005302j A0F;
    public final AnonymousClass097 A0G;
    public final InterfaceC002901k A0H;
    public final SparseArray A0C = new SparseArray();
    public final ContentObserver A0B = new C48672Gf(this);

    @Override // X.InterfaceC48692Gh
    public void AMI() {
    }

    @Override // X.InterfaceC48692Gh
    public void AVn(int i) {
    }

    public C48682Gg(MediaViewFragment mediaViewFragment, InterfaceC002901k interfaceC002901k, AnonymousClass097 anonymousClass097, AbstractC005302j abstractC005302j, C0C9 c0c9, C40411sD c40411sD) {
        this.A07 = mediaViewFragment;
        this.A0G = anonymousClass097;
        this.A0H = interfaceC002901k;
        this.A0F = abstractC005302j;
        this.A0D = c0c9;
        this.A0E = c40411sD;
        this.A0C.put(0, anonymousClass097);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.3IF, X.0HS] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.3IF, X.0HS] */
    @Override // X.InterfaceC48692Gh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass097 ABE(int r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48682Gg.ABE(int):X.097");
    }

    @Override // X.InterfaceC48692Gh
    public int ACW(AnonymousClass094 anonymousClass094) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A0C;
            if (i < sparseArray.size()) {
                int keyAt = sparseArray.keyAt(i);
                if (anonymousClass094.equals(((AnonymousClass092) sparseArray.get(keyAt)).A0n)) {
                    return this.A00 + keyAt;
                }
                i++;
            } else {
                return -2;
            }
        }
    }

    @Override // X.InterfaceC48692Gh
    public void ASy(Runnable runnable) {
        this.A08 = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3IE, X.0HS] */
    @Override // X.InterfaceC48692Gh
    public void AV0() {
        ?? r2 = new C0HS(this, this.A0F, this.A0G, this.A0D, this.A0E) { // from class: X.3IE
            public C40481sK A00;
            public C40481sK A01;
            public boolean A02;
            public boolean A03;
            public final C0C9 A04;
            public final C40411sD A05;
            public final AbstractC005302j A06;
            public final C48682Gg A07;
            public final AnonymousClass097 A08;

            {
                this.A06 = r2;
                this.A08 = r3;
                this.A07 = this;
                this.A04 = r4;
                this.A05 = r5;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                Log.i("mediaview/task/getmsgs");
                C0C9 c0c9 = this.A04;
                AbstractC005302j abstractC005302j = this.A06;
                C40411sD c40411sD = this.A05;
                AnonymousClass097 anonymousClass097 = this.A08;
                Cursor A06 = c40411sD.A06(abstractC005302j, anonymousClass097.A0p, 512);
                boolean z = C48682Gg.A0I;
                this.A00 = new C40481sK(c0c9, abstractC005302j, A06, z);
                if (A04()) {
                    this.A00.close();
                    Log.i("GetMediaMessagesTask cancelled");
                    return -1;
                }
                this.A01 = new C40481sK(c0c9, abstractC005302j, c40411sD.A07(abstractC005302j, anonymousClass097.A0p, 512), z);
                if (A04()) {
                    this.A00.close();
                    this.A01.close();
                    Log.i("GetMediaMessagesTask cancelled");
                    return -1;
                }
                this.A02 = this.A00.getCount() < 512;
                this.A00.moveToPosition(0);
                if (this.A00.getCount() == 0) {
                    this.A00.close();
                    C40481sK c40481sK = new C40481sK(c0c9, abstractC005302j, c40411sD.A06(abstractC005302j, anonymousClass097.A0p, 0), z);
                    this.A00 = c40481sK;
                    c40481sK.moveToPosition(0);
                    this.A02 = true;
                    StringBuilder A0P = C000200d.A0P("mediaview/navigator/getmsgs head-upgraded:");
                    A0P.append(this.A00.getCount());
                    Log.i(A0P.toString());
                }
                this.A03 = this.A01.getCount() < 512;
                this.A01.moveToPosition(0);
                if (this.A01.getCount() == 0) {
                    this.A01.close();
                    C40481sK c40481sK2 = new C40481sK(c0c9, abstractC005302j, c40411sD.A07(abstractC005302j, anonymousClass097.A0p, 0), z);
                    this.A01 = c40481sK2;
                    c40481sK2.moveToPosition(0);
                    this.A03 = true;
                    StringBuilder A0P2 = C000200d.A0P("mediaview/navigator/getmsgs tail-upgraded:");
                    A0P2.append(this.A01.getCount());
                    Log.i(A0P2.toString());
                }
                return Integer.valueOf(this.A01.getCount() + this.A00.getCount());
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                if (((Number) obj).intValue() >= 0) {
                    C48682Gg c48682Gg = this.A07;
                    C40481sK c40481sK = this.A00;
                    boolean z = this.A02;
                    C40481sK c40481sK2 = this.A01;
                    boolean z2 = this.A03;
                    MediaViewFragment mediaViewFragment = c48682Gg.A07;
                    if (mediaViewFragment.A09() == null || ((ActivityC02290Ap) mediaViewFragment.A0A()).AFE()) {
                        return;
                    }
                    c48682Gg.close();
                    c48682Gg.A0C.put(0, c48682Gg.A0G);
                    c48682Gg.A02 = c40481sK;
                    c48682Gg.A09 = z;
                    c48682Gg.A03 = c40481sK2;
                    c48682Gg.A0A = z2;
                    c48682Gg.A00 = c40481sK.getCount();
                    int count = c40481sK2.getCount();
                    c48682Gg.A01 = count;
                    StringBuilder A0P = C000200d.A0P("MediaMessagesNavigator/navigator/set-cursors/ head-count:");
                    A0P.append(c48682Gg.A00);
                    A0P.append(" head-full:");
                    A0P.append(z);
                    A0P.append(" tail-count:");
                    A0P.append(count);
                    A0P.append(" tail-full:");
                    A0P.append(z2);
                    Log.i(A0P.toString());
                    ContentObserver contentObserver = c48682Gg.A0B;
                    c40481sK.registerContentObserver(contentObserver);
                    c40481sK2.registerContentObserver(contentObserver);
                    c48682Gg.A07.A1I(c48682Gg.A00);
                }
            }
        };
        this.A04 = r2;
        this.A0H.ARy(r2, new Void[0]);
    }

    @Override // X.InterfaceC48692Gh
    public void AVA() {
        C3IE c3ie = this.A04;
        if (c3ie == null || c3ie.A04()) {
            return;
        }
        A05(true);
    }

    @Override // X.InterfaceC48692Gh
    public void close() {
        AVA();
        C40481sK c40481sK = this.A02;
        if (c40481sK != null) {
            c40481sK.close();
        }
        this.A02 = null;
        C40481sK c40481sK2 = this.A03;
        if (c40481sK2 != null) {
            c40481sK2.close();
        }
        this.A03 = null;
        C3IF c3if = this.A05;
        if (c3if != null) {
            ((C0HS) c3if).A02.cancel(true);
        }
        this.A05 = null;
        C3IF c3if2 = this.A06;
        if (c3if2 != null) {
            ((C0HS) c3if2).A02.cancel(true);
        }
        this.A06 = null;
        this.A09 = false;
        this.A0A = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0C.clear();
    }

    @Override // X.InterfaceC48692Gh
    public int getCount() {
        return this.A00 + 1 + this.A01;
    }
}
