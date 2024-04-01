package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3Jt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68443Jt extends C3AA {
    public final /* synthetic */ C03560Ge A00;
    public final /* synthetic */ UserJid A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68443Jt(C03560Ge c03560Ge, UserJid userJid) {
        super(null);
        this.A00 = c03560Ge;
        this.A01 = userJid;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        boolean z;
        C013406l c013406l = this.A00.A01;
        UserJid userJid = this.A01;
        synchronized (c013406l) {
            String[] strArr = {userJid.getRawString()};
            C0CD A03 = c013406l.A01.A03();
            int A01 = A03.A02.A01("contacts", "jid=?", strArr);
            if (A01 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentStore removeOneContact deleted num rows: ");
                sb.append(A01);
                Log.i(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PAY: PaymentStore removeOneContact could not delete all rows: ");
                sb2.append(A01);
                Log.w(sb2.toString());
            }
            z = A01 >= 0;
            A03.close();
        }
        return Boolean.valueOf(z);
    }
}
