package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0Ka */
/* loaded from: classes.dex */
public class C04400Ka {
    public static volatile C04400Ka A0F;
    public long A00;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C010005b A03;
    public final C04470Kh A04;
    public final AnonymousClass012 A05;
    public final C001200o A06;
    public final C003701t A07;
    public final C0HA A08;
    public final C04490Kj A09;
    public final C05Y A0A;
    public final AnonymousClass035 A0B;
    public final C03510Fz A0C;
    public final C004902f A0D;
    public final InterfaceC002901k A0E;

    public C04400Ka(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C004902f c004902f, InterfaceC002901k interfaceC002901k, C05Y c05y, C03510Fz c03510Fz, C010005b c010005b, C0HA c0ha, AnonymousClass035 anonymousClass035, C04470Kh c04470Kh, C04490Kj c04490Kj) {
        this.A06 = c001200o;
        this.A05 = anonymousClass012;
        this.A07 = c003701t;
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A0D = c004902f;
        this.A0E = interfaceC002901k;
        this.A0A = c05y;
        this.A0C = c03510Fz;
        this.A03 = c010005b;
        this.A08 = c0ha;
        this.A0B = anonymousClass035;
        this.A04 = c04470Kh;
        this.A09 = c04490Kj;
    }

    public static C04400Ka A00() {
        if (A0F == null) {
            synchronized (C04400Ka.class) {
                if (A0F == null) {
                    A0F = new C04400Ka(C001200o.A01, AnonymousClass012.A00(), C003701t.A00(), C018508q.A00(), AbstractC000600i.A00(), C004902f.A00(), C002801j.A00(), C05Y.A01(), C03510Fz.A03, C010005b.A07, C0HA.A00(), AnonymousClass035.A00(), C04470Kh.A00(), C04490Kj.A00());
                }
            }
        }
        return A0F;
    }

    public void A01(AbstractC005302j abstractC005302j, int i) {
        if (i != 500 && i != 501 && i != 503) {
            if (i == 401 && abstractC005302j != null && !C003101m.A0U(abstractC005302j)) {
                this.A04.A04(abstractC005302j);
                return;
            }
            return;
        }
        this.A00 = this.A05.A05() + 3600000;
    }

    public void A02(final AbstractC005302j abstractC005302j, final int i, final int i2, final InterfaceC04440Ke interfaceC04440Ke) {
        if (C003101m.A0W(abstractC005302j) && !C003101m.A0P(abstractC005302j) && this.A00 < this.A05.A05()) {
            C03510Fz c03510Fz = this.A0C;
            if (c03510Fz != null) {
                if (((i2 & 1) != 0 && c03510Fz.A01.A02(abstractC005302j)) || ((i2 & 2) != 0 && c03510Fz.A02.A02(abstractC005302j))) {
                    C018508q c018508q = this.A02;
                    c018508q.A02.post(new Runnable() { // from class: X.1Q2
                        {
                            C04400Ka.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            C04400Ka c04400Ka = C04400Ka.this;
                            int i3 = i;
                            int i4 = i2;
                            AbstractC005302j abstractC005302j2 = abstractC005302j;
                            InterfaceC04440Ke interfaceC04440Ke2 = interfaceC04440Ke;
                            StringBuilder A0R = C000200d.A0R("ProfilePhotoManager/sendGetProfilePhoto photoId:", i3, " type:", i4, " jid:");
                            A0R.append(abstractC005302j2);
                            Log.i(A0R.toString());
                            C003701t c003701t = c04400Ka.A07;
                            AbstractC000600i abstractC000600i = c04400Ka.A01;
                            C05Y c05y = c04400Ka.A0A;
                            String str2 = i4 == 1 ? "image" : i4 == 2 ? "preview" : "image";
                            if (i3 > 0) {
                                str = Integer.toString(i3);
                            } else {
                                str = null;
                            }
                            C37951nJ c37951nJ = new C37951nJ(c003701t, abstractC000600i, c05y, str2, str, new C37851n9(c04400Ka.A06, c04400Ka.A0D, c04400Ka.A0E, c04400Ka.A0C, c04400Ka.A08, c04400Ka.A0B, c04400Ka.A04, c04400Ka.A09, c04400Ka, interfaceC04440Ke2));
                            C05Y c05y2 = c37951nJ.A03;
                            String A02 = c05y2.A02();
                            String str3 = c37951nJ.A06;
                            boolean equals = "image".equals(str3);
                            ArrayList arrayList = new ArrayList();
                            if (equals || c37951nJ.A00()) {
                                C000200d.A1A("query", "url", arrayList);
                            }
                            String str4 = c37951nJ.A05;
                            if (str4 == null) {
                                arrayList.add(new C04P("type", str3, null, (byte) 0));
                            } else {
                                arrayList.add(new C04P("id", str4, null, (byte) 0));
                                arrayList.add(new C04P("type", str3, null, (byte) 0));
                            }
                            c05y2.A07(26, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:profile:picture", null, (byte) 0), new C04P("to", abstractC005302j2), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("picture", (C04P[]) arrayList.toArray(new C04P[0]), null, null)), c37951nJ, 0L);
                        }
                    });
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public void A03(C04510Kl c04510Kl) {
        C04P[] c04pArr;
        C02590Ca c02590Ca;
        C04P[] c04pArr2;
        C02590Ca c02590Ca2;
        C02590Ca[] c02590CaArr;
        C02590Ca[] c02590CaArr2;
        AbstractC005302j abstractC005302j = c04510Kl.A0J;
        if (C003101m.A0W(abstractC005302j) && this.A03.A06 && this.A00 < this.A05.A05()) {
            Log.w("app/sendSetProfilePhoto");
            C37961nK c37961nK = new C37961nK(abstractC005302j, c04510Kl.A0L, this.A0A, c04510Kl);
            byte[] bArr = c04510Kl.A06;
            c37961nK.A00 = bArr == null;
            C04500Kk c04500Kk = c37961nK.A04;
            String A02 = c04500Kk != null ? c04500Kk.A01 : c37961nK.A02.A02();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C04P("id", A02, null, (byte) 0));
            arrayList2.add(new C04P("xmlns", "w:profile:picture", null, (byte) 0));
            arrayList2.add(new C04P("to", c37961nK.A01));
            arrayList2.add(new C04P("type", "set", null, (byte) 0));
            if (c04500Kk != null) {
                arrayList2.add(new C04P("web", c04500Kk.A00, null, (byte) 0));
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new C04P("type", "image", null, (byte) 0));
            if (!arrayList4.isEmpty()) {
                c04pArr = (C04P[]) arrayList4.toArray(new C04P[0]);
            } else {
                c04pArr = null;
            }
            if (!arrayList3.isEmpty() && (c02590CaArr2 = (C02590Ca[]) arrayList3.toArray(new C02590Ca[0])) != null) {
                c02590Ca = new C02590Ca("picture", c04pArr, c02590CaArr2, null);
            } else {
                c02590Ca = new C02590Ca("picture", c04pArr, null, bArr);
            }
            arrayList.add(c02590Ca);
            C05Y c05y = c37961nK.A02;
            if (!arrayList2.isEmpty()) {
                c04pArr2 = (C04P[]) arrayList2.toArray(new C04P[0]);
            } else {
                c04pArr2 = null;
            }
            if (!arrayList.isEmpty() && (c02590CaArr = (C02590Ca[]) arrayList.toArray(new C02590Ca[0])) != null) {
                c02590Ca2 = new C02590Ca("iq", c04pArr2, c02590CaArr, null);
            } else {
                c02590Ca2 = new C02590Ca("iq", c04pArr2, null, null);
            }
            c05y.A0B(25, A02, c02590Ca2, c37961nK, 0L);
        }
    }
}
