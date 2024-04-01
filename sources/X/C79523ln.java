package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.3ln  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79523ln extends C0HS {
    public final C04480Ki A00;
    public final C05W A01;
    public final C2L9 A02;
    public final UserJid A03;
    public final C41681uL A04;
    public final String A05;
    public final WeakReference A06;

    public C79523ln(C05W c05w, C04480Ki c04480Ki, C2L9 c2l9, C41681uL c41681uL, AbstractC52172aB abstractC52172aB, UserJid userJid, String str) {
        this.A01 = c05w;
        this.A00 = c04480Ki;
        this.A02 = c2l9;
        this.A04 = c41681uL;
        this.A06 = new WeakReference(abstractC52172aB);
        this.A03 = userJid;
        this.A05 = str;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        C05W c05w = this.A01;
        UserJid userJid = this.A03;
        C06C A0A = c05w.A0A(userJid);
        String str = this.A05;
        if (str != null && !str.isEmpty() && !str.equals(A0A.A0O)) {
            A0A.A0O = str;
            C04480Ki c04480Ki = this.A00;
            c04480Ki.A00.post(new RunnableEBaseShape6S0200000_I1(this, A0A, 13));
        }
        if (A0A.A08 != null) {
            return EnumC40721sl.UP_TO_DATE_UNCHANGED;
        }
        return this.A02.A01(C22H.A01, userJid);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        EnumC40721sl enumC40721sl = (EnumC40721sl) obj;
        AbstractC52172aB abstractC52172aB = (AbstractC52172aB) this.A06.get();
        if (abstractC52172aB == null || abstractC52172aB.A03) {
            return;
        }
        abstractC52172aB.A02(enumC40721sl);
    }
}
