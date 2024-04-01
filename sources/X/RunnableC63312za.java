package X;

import java.util.List;

/* renamed from: X.2za  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC63312za extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ C09H A01;
    public final /* synthetic */ C67673Gk A02;
    public final /* synthetic */ AnonymousClass092 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ byte[] A07;

    public /* synthetic */ RunnableC63312za(C67673Gk c67673Gk, C09H c09h, byte b, String str, AnonymousClass092 anonymousClass092, String str2, List list, byte[] bArr) {
        this.A02 = c67673Gk;
        this.A01 = c09h;
        this.A00 = b;
        this.A04 = str;
        this.A03 = anonymousClass092;
        this.A05 = str2;
        this.A06 = list;
        this.A07 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C67673Gk c67673Gk = this.A02;
        C09H c09h = this.A01;
        byte b = this.A00;
        String str = this.A04;
        AnonymousClass092 anonymousClass092 = this.A03;
        String str2 = this.A05;
        List list = this.A06;
        byte[] bArr = this.A07;
        C018608r c018608r = c67673Gk.A06;
        C41491u0 c41491u0 = c67673Gk.A0D;
        List list2 = c67673Gk.A0L;
        byte b2 = b;
        if (c67673Gk.A0Q) {
            b2 = 42;
            if (b == 3) {
                b2 = 43;
            }
        }
        c018608r.A0C(c41491u0.A02(list2, c09h, b2, C67673Gk.A00(c67673Gk.A00), str, null, anonymousClass092, AnonymousClass029.A0y(str2), c67673Gk.A0O, 0, list), bArr);
    }
}
