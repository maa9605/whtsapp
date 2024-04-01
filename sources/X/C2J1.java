package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.2J1 */
/* loaded from: classes2.dex */
public class C2J1 {
    public final /* synthetic */ C20R A00;

    public C2J1(C20R c20r) {
        this.A00 = c20r;
    }

    public void A00(String str) {
        C20R c20r = this.A00;
        if (c20r.A1F(R.string.connectivity_check_connection)) {
            return;
        }
        c20r.A0A = true;
        C20R.A01(c20r);
        c20r.A07.AS1(new RunnableEBaseShape0S1100000_I0(this, str, 10));
    }

    public void A01(String str) {
        C20R c20r = this.A00;
        if (c20r.A1F(R.string.connectivity_check_connection)) {
            return;
        }
        if (c20r != null) {
            C000200d.A14("websessions/clear bid=", str);
            boolean A01 = c20r.A08.A01().A01(str);
            c20r.A09.A0H(true, str);
            if (A01) {
                c20r.A06.A0J(true);
                return;
            }
            return;
        }
        throw null;
    }
}
