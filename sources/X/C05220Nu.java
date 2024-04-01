package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0Nu */
/* loaded from: classes.dex */
public class C05220Nu implements InterfaceC010405f {
    public InterfaceC04730Lp A00;
    public final int A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C06K A03;
    public final C06M A04;
    public final UserJid A05;
    public final C05Y A06;
    public final String A07;

    public C05220Nu(int i, UserJid userJid, String str, C05Y c05y, C06K c06k, C06M c06m) {
        this.A01 = i;
        this.A05 = userJid;
        this.A07 = str;
        this.A06 = c05y;
        this.A03 = c06k;
        this.A04 = c06m;
    }

    public void A00(InterfaceC04730Lp interfaceC04730Lp) {
        C04P[] c04pArr;
        UserJid userJid;
        this.A00 = interfaceC04730Lp;
        C05Y c05y = this.A06;
        String A02 = c05y.A02();
        String str = this.A07;
        if (str != null) {
            userJid = this.A05;
            c04pArr = new C04P[]{new C04P("jid", userJid), new C04P("tag", str, null, (byte) 0)};
        } else {
            userJid = this.A05;
            c04pArr = new C04P[]{new C04P("jid", userJid)};
        }
        c05y.A06(132, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:biz", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("business_profile", new C04P[]{new C04P("v", this.A01)}, new C02590Ca("profile", c04pArr, null, null))), this, 32000L);
        C000200d.A1J(C000200d.A0P("sendGetBusinessProfile jid="), userJid);
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.i("sendGetBusinessProfile/delivery-error");
        this.A02.post(new RunnableEBaseShape0S1100000_I0(this, str, 9));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.i("sendGetBusinessProfile/response-error");
        this.A02.post(new RunnableEBaseShape0S1200000_I0(this, str, c02590Ca, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x01bb, code lost:
        if (r20.booleanValue() == false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e6 A[LOOP:1: B:116:0x00e0->B:118:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0153  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    @Override // X.InterfaceC010405f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void APJ(java.lang.String r27, X.C02590Ca r28) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05220Nu.APJ(java.lang.String, X.0Ca):void");
    }
}
