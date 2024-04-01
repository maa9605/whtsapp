package X;

import java.util.List;

/* renamed from: X.1J9  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1J9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C018608r A01;
    public final /* synthetic */ AnonymousClass092 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ byte[] A06;

    public /* synthetic */ C1J9(C018608r c018608r, List list, String str, byte[] bArr, int i, AnonymousClass092 anonymousClass092, boolean z) {
        this.A01 = c018608r;
        this.A04 = list;
        this.A03 = str;
        this.A06 = bArr;
        this.A00 = i;
        this.A02 = anonymousClass092;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0g(this.A04, this.A03, this.A06, this.A00, this.A02, this.A05);
    }
}
