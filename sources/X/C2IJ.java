package X;

import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.jid.Jid;
import java.lang.ref.WeakReference;

/* renamed from: X.2IJ */
/* loaded from: classes2.dex */
public abstract class C2IJ extends C0HS {
    public final C0HE A00 = new C0HE();
    public final C018508q A01;
    public final C2NE A02;
    public final C03690Gr A03;
    public final C40411sD A04;
    public final C43081wp A05;
    public final AbstractC005302j A06;
    public final C0DW A07;
    public final C0DV A08;
    public final WeakReference A09;

    public C2IJ(C018508q c018508q, C0DV c0dv, C03690Gr c03690Gr, C40411sD c40411sD, C43081wp c43081wp, C2NE c2ne, C0DW c0dw, ChatInfoActivity chatInfoActivity, C06C c06c) {
        this.A01 = c018508q;
        this.A08 = c0dv;
        this.A03 = c03690Gr;
        this.A04 = c40411sD;
        this.A05 = c43081wp;
        this.A02 = c2ne;
        this.A07 = c0dw;
        this.A09 = new WeakReference(chatInfoActivity);
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 == null) {
            throw null;
        }
        this.A06 = (AbstractC005302j) A03;
    }

    @Override // X.C0HS
    public /* bridge */ /* synthetic */ Object A07(Object[] objArr) {
        if (this instanceof C49222Jd) {
            A0A((Void[]) objArr);
            return null;
        } else if (!(this instanceof C2IG)) {
            return A0A((Void[]) objArr);
        } else {
            A0A((Void[]) objArr);
            return null;
        }
    }

    @Override // X.C0HS
    public void A08() {
        this.A00.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0028, code lost:
        if (r0 > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Void A0A(java.lang.Void... r14) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2IJ.A0A(java.lang.Void[]):java.lang.Void");
    }
}
