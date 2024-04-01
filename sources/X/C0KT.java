package X;

import com.whatsapp.util.Log;

/* renamed from: X.0KT  reason: invalid class name */
/* loaded from: classes.dex */
public class C0KT extends AnonymousClass092 {
    public int A00;

    @Override // X.AnonymousClass092
    public boolean A13() {
        return false;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
    }

    public C0KT(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 12);
    }

    public C0KT(AnonymousClass094 anonymousClass094, long j, byte[] bArr, int i) {
        super(anonymousClass094, j, (byte) 12);
        StringBuilder A0P = C000200d.A0P("FMessageFuture/futureproof/size=");
        A0P.append(Integer.valueOf(bArr.length));
        Log.w(A0P.toString());
        A0w(bArr);
        this.A00 = i;
    }

    @Override // X.AnonymousClass092
    public int A04() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A0W(int i) {
        this.A00 = i;
    }
}
