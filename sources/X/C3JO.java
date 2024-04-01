package X;

import android.view.ViewGroup;
import com.whatsapp.Conversation;

/* renamed from: X.3JO */
/* loaded from: classes2.dex */
public class C3JO extends C37Y implements InterfaceC06800Vb {
    public boolean A00;
    public boolean A01;
    public final C09I A02;
    public final C58472rC A03;
    public final C02E A04;
    public final C2MH A05;

    public C3JO(Conversation conversation, AnonymousClass012 anonymousClass012, C09I c09i, C2MH c2mh, C02E c02e, ViewGroup viewGroup, C0EE c0ee, C000500h c000500h) {
        super(conversation, viewGroup, 20);
        this.A02 = c09i;
        this.A05 = c2mh;
        this.A04 = c02e;
        this.A03 = new C58472rC(anonymousClass012, c0ee, c000500h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000c, code lost:
        if (r4.A0m != 31) goto L16;
     */
    @Override // X.InterfaceC06800Vb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AN9(X.AnonymousClass092 r4) {
        /*
            r3 = this;
            boolean r0 = r3.A01
            if (r0 == 0) goto L5
            return
        L5:
            if (r4 == 0) goto Le
            byte r2 = r4.A0m
            r1 = 31
            r0 = 1
            if (r2 == r1) goto Lf
        Le:
            r0 = 0
        Lf:
            r3.A01 = r0
            boolean r0 = r3.A03()
            if (r0 == 0) goto L20
            boolean r0 = r3.A04()
            if (r0 != 0) goto L20
            r3.A00()
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3JO.AN9(X.092):void");
    }
}
