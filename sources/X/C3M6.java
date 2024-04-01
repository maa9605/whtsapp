package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.3M6  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3M6 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ C2AK A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C3M6(C2AK c2ak, String str, String str2, long j, Jid jid) {
        this.A02 = c2ak;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A01 = jid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2AK c2ak = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        long j = this.A00;
        Jid jid = this.A01;
        if (c2ak.A1M.A04()) {
            if (!TextUtils.isEmpty(str) && !C43981yK.A0H(str, C52652b6.A01)) {
                c2ak.A19.A01(str, new C04500Kk(str2));
            } else {
                StringBuilder sb = new StringBuilder("app/xmpp/recv/web_action/set_push_name/error/is_biz/");
                sb.append(false);
                Log.w(sb.toString());
                c2ak.A0z.A0F(str2, 400);
            }
        }
        c2ak.A0s.A08(str2, j, jid);
        C41991uq c41991uq = c2ak.A1N;
        c41991uq.A08();
        c41991uq.A09();
    }
}
