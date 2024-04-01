package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.4I6  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4I6 implements InterfaceC021309t {
    public final Set A00;

    public C4I6() {
        AnonymousClass036 anonymousClass036 = new AnonymousClass036(1);
        this.A00 = anonymousClass036;
        anonymousClass036.addAll(Arrays.asList("wa.action.shops.TOSaccept"));
    }

    @Override // X.InterfaceC021309t
    public InterfaceC020509l A7h(C33971gl c33971gl, C021109r c021109r, C021209s c021209s) {
        C04P[] c04pArr;
        C02590Ca c02590Ca;
        C04P[] c04pArr2;
        C02590Ca[] c02590CaArr;
        C02590Ca c02590Ca2;
        C02590Ca[] c02590CaArr2;
        String str = c33971gl.A00;
        if (str.hashCode() == 257050555 && str.equals("wa.action.shops.TOSaccept")) {
            int intValue = ((Number) c021109r.A00(0)).intValue();
            PrivacyNoticeFragment privacyNoticeFragment = (PrivacyNoticeFragment) ((C892046c) c021209s.A00.get(R.id.bloks_global_bloks_host)).A01.A0Q.A01("TOSFragment");
            if (privacyNoticeFragment != null) {
                final C90264Ai c90264Ai = (C90264Ai) privacyNoticeFragment.A02.get();
                final C85133uu c85133uu = new C85133uu(privacyNoticeFragment);
                C00J c00j = c90264Ai.A00;
                String A02 = ((C05Y) c00j.get()).A02();
                C05Y c05y = (C05Y) c00j.get();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C04P("id", A02, null, (byte) 0));
                arrayList2.add(new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0));
                arrayList2.add(new C04P("type", "set", null, (byte) 0));
                arrayList2.add(new C04P("to", C04260Jm.A00));
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new C04P("tos_version", intValue));
                if (!arrayList4.isEmpty()) {
                    c04pArr = (C04P[]) arrayList4.toArray(new C04P[0]);
                } else {
                    c04pArr = null;
                }
                if (!arrayList3.isEmpty() && (c02590CaArr2 = (C02590Ca[]) arrayList3.toArray(new C02590Ca[0])) != null) {
                    c02590Ca = new C02590Ca("shops_notice", c04pArr, c02590CaArr2, null);
                } else {
                    c02590Ca = new C02590Ca("shops_notice", c04pArr, null, null);
                }
                arrayList.add(c02590Ca);
                if (!arrayList2.isEmpty()) {
                    c04pArr2 = (C04P[]) arrayList2.toArray(new C04P[0]);
                } else {
                    c04pArr2 = null;
                }
                if (!arrayList.isEmpty()) {
                    c02590CaArr = (C02590Ca[]) arrayList.toArray(new C02590Ca[0]);
                } else {
                    c02590CaArr = null;
                }
                if (c02590CaArr == null) {
                    c02590Ca2 = new C02590Ca("iq", c04pArr2, null, null);
                } else {
                    c02590Ca2 = new C02590Ca("iq", c04pArr2, c02590CaArr, null);
                }
                c05y.A0B(249, A02, c02590Ca2, new InterfaceC010405f() { // from class: X.4Fz
                    @Override // X.InterfaceC010405f
                    public void AJI(String str2) {
                        c85133uu.A00.A10(0);
                    }

                    @Override // X.InterfaceC010405f
                    public void AJx(String str2, C02590Ca c02590Ca3) {
                        c85133uu.A00.A10(1);
                    }

                    @Override // X.InterfaceC010405f
                    public void APJ(String str2, C02590Ca c02590Ca3) {
                        String str3;
                        C04P A0A = c02590Ca3.A0D("shops_notice").A0A("tos_version");
                        if (A0A != null) {
                            str3 = A0A.A03;
                        } else {
                            str3 = null;
                        }
                        ((InterfaceC41261td) C90264Ai.this.A01.get()).AS9(Integer.valueOf(str3).intValue());
                        c85133uu.A00.A10(2);
                    }
                }, 32000L);
            } else {
                Log.e("Bloks: Invalid fragment tag");
            }
            return C0A6.A00;
        }
        return C0A6.A00;
    }
}
