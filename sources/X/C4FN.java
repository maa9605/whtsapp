package X;

import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4FN  reason: invalid class name */
/* loaded from: classes3.dex */
public final class C4FN extends C0MU {
    public final C0HK A00 = new C0HK(new C4AW(2, null));
    public final C0E7 A01;
    public final AnonymousClass012 A02;
    public final C0EU A03;
    public final C463026g A04;
    public final C4A2 A05;
    public final C49682Lx A06;

    public C4FN(Uri uri, AnonymousClass012 anonymousClass012, C4A2 c4a2, C49682Lx c49682Lx, C0EU c0eu, C0E7 c0e7, C463026g c463026g) {
        String lastPathSegment = uri.getLastPathSegment();
        this.A02 = anonymousClass012;
        this.A05 = c4a2;
        this.A06 = c49682Lx;
        this.A03 = c0eu;
        this.A01 = c0e7;
        this.A04 = c463026g;
        if (c0e7.A05()) {
            this.A04.A0E("get", new C02590Ca("account", new C04P[]{new C04P("action", "verify-deep-link", null, (byte) 0), new C04P("device-id", this.A06.A02(), null, (byte) 0)}, new C02590Ca("link", new C04P[]{new C04P("payload", lastPathSegment, null, (byte) 0)}, null, null)), new InterfaceC010405f() { // from class: X.4FM
                @Override // X.InterfaceC010405f
                public void AJI(String str) {
                    C4FN.this.A02();
                }

                @Override // X.InterfaceC010405f
                public void AJx(String str, C02590Ca c02590Ca) {
                    try {
                        C02590Ca A00 = C4FN.A00(c02590Ca, "error");
                        int A05 = A00.A05("code", 500);
                        C04P A0A = A00.A0A("text");
                        C4FN.this.A03(A05, new C4A0(A05, A0A != null ? A0A.A03 : "Unknown!"));
                    } catch (C0L4 | NullPointerException e) {
                        C4FN.this.A03(500, e);
                    }
                }

                @Override // X.InterfaceC010405f
                public void APJ(String str, C02590Ca c02590Ca) {
                    try {
                        int A05 = C4FN.A00(C4FN.A00(c02590Ca, "account"), "link").A05("status", 0);
                        C4FN c4fn = C4FN.this;
                        if (c4fn == null) {
                            throw null;
                        }
                        if (A05 == 1) {
                            c4fn.A03.A0F(TimeUnit.DAYS.toMillis(365L) + c4fn.A02.A05());
                            C0HK c0hk = c4fn.A00;
                            if (c4fn.A05 != null) {
                                c0hk.A0A(new C4AW(0, new C4A1(R.string.virality_payments_enabled_title, R.string.virality_payments_enabled_description)));
                                return;
                            }
                            throw null;
                        }
                        c4fn.A03(500, new IllegalArgumentException(C000200d.A0D("Status is ", A05)));
                    } catch (C0L4 | NullPointerException e) {
                        C4FN.this.A03(500, e);
                    }
                }
            });
        } else {
            A02();
        }
    }

    public static C02590Ca A00(C02590Ca c02590Ca, String str) {
        C02590Ca A0D = c02590Ca.A0D(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" not found!");
        C000700j.A04(A0D, sb.toString());
        return A0D;
    }

    public final void A02() {
        C0HK c0hk = this.A00;
        new C4A0(0, "No Internet!");
        c0hk.A0A(new C4AW(1, new C4A1(R.string.virality_payments_not_enabled_title, R.string.virality_payments_not_enabled_description_no_internet)));
    }

    public final void A03(int i, Throwable th) {
        StringBuilder sb = new StringBuilder("PAY ViralityLinkViewModel verifyInviteCode on ErrorCode : ");
        sb.append(i);
        Log.e(sb.toString(), th);
        C0HK c0hk = this.A00;
        C4A2 c4a2 = this.A05;
        if (c4a2 != null) {
            c0hk.A0A(new C4AW(1, new C4A1(R.string.virality_payments_not_enabled_title, c4a2.A00(i))));
            return;
        }
        throw null;
    }
}
