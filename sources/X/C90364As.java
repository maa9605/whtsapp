package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4As */
/* loaded from: classes3.dex */
public class C90364As {
    public final C00J A00;
    public final C00J A01;
    public final C00J A02;

    public C90364As(C00J c00j, C00J c00j2, C00J c00j3) {
        this.A00 = c00j;
        this.A02 = c00j2;
        this.A01 = c00j3;
    }

    public void A00(final String str, Map map, final InterfaceC90354Ar interfaceC90354Ar) {
        String str2;
        C04P[] c04pArr;
        C02590Ca c02590Ca;
        C04P[] c04pArr2;
        C02590Ca c02590Ca2;
        C04P[] c04pArr3;
        C02590Ca c02590Ca3;
        C04P[] c04pArr4;
        C02590Ca c02590Ca4;
        C02590Ca c02590Ca5;
        C02590Ca[] c02590CaArr;
        C02590Ca[] c02590CaArr2;
        C02590Ca[] c02590CaArr3;
        C02590Ca[] c02590CaArr4;
        C00J c00j = this.A00;
        final boolean A0E = ((C90334Ap) c00j.get()).A00.A0E(C01C.A0S);
        final InterfaceC010405f interfaceC010405f = new InterfaceC010405f() { // from class: X.4GB
            {
                C90364As.this = this;
            }

            @Override // X.InterfaceC010405f
            public void AJI(String str3) {
                interfaceC90354Ar.ANz(null, str, new C0L4(C000200d.A0H("WaBloksIqBuilder - delivery failure iqId=", str3)));
            }

            @Override // X.InterfaceC010405f
            public void AJx(String str3, C02590Ca c02590Ca6) {
                String str4;
                Exception c0l4;
                C04P A0A = c02590Ca6.A0D("error").A0A("code");
                if (A0A != null) {
                    str4 = A0A.A03;
                } else {
                    str4 = null;
                }
                int parseInt = Integer.parseInt(str4);
                InterfaceC90354Ar interfaceC90354Ar2 = interfaceC90354Ar;
                String str5 = str;
                if (parseInt == 475) {
                    final C90364As c90364As = C90364As.this;
                    c0l4 = new C74993eB(C000200d.A0H("WaBloksIqBuilder - sendIq error iqId=", str3)) { // from class: X.4GD
                    };
                } else {
                    c0l4 = new C0L4(C000200d.A0H("WaBloksIqBuilder - sendIq error iqId=", str3));
                }
                interfaceC90354Ar2.ANz(null, str5, c0l4);
            }

            /* JADX WARN: Code restructure failed: missing block: B:88:0x004e, code lost:
                if (r3 == null) goto L28;
             */
            @Override // X.InterfaceC010405f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void APJ(java.lang.String r7, X.C02590Ca r8) {
                /*
                    r6 = this;
                    r5 = 0
                    java.lang.String r0 = "layout"
                    X.0Ca r0 = r8.A0D(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
                    if (r0 == 0) goto L35
                    byte[] r0 = r0.A01     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
                    if (r0 == 0) goto L34
                    java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
                    r4.<init>(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
                    int r0 = r0.length     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
                    if (r0 == 0) goto L27
                    java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
                    r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
                    X.4Ar r1 = r2     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L4c
                    java.lang.String r0 = r3     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L4c
                    r1.ANz(r3, r0, r5)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L4c
                    r3.close()     // Catch: java.io.IOException -> L47
                    return
                L25:
                    r2 = move-exception
                    goto L3a
                L27:
                    java.lang.String r1 = "WaBloksIqBuilder - Received Zero-Length Payload"
                    X.0L4 r0 = new X.0L4     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
                    throw r0     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
                L2f:
                    r1 = move-exception
                    goto L50
                L31:
                    r2 = move-exception
                    r3 = r4
                    goto L3a
                L34:
                    throw r5     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
                L35:
                    throw r5     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
                L36:
                    r1 = move-exception
                    throw r1
                L38:
                    r2 = move-exception
                    r3 = r5
                L3a:
                    X.4Ar r1 = r2     // Catch: java.lang.Throwable -> L4c
                    java.lang.String r0 = r3     // Catch: java.lang.Throwable -> L4c
                    r1.ANz(r5, r0, r2)     // Catch: java.lang.Throwable -> L4c
                    if (r3 == 0) goto L4b
                    r3.close()     // Catch: java.io.IOException -> L47
                    return
                L47:
                    r0 = move-exception
                    com.whatsapp.util.Log.e(r0)
                L4b:
                    return
                L4c:
                    r1 = move-exception
                    r4 = r3
                    if (r3 == 0) goto L58
                L50:
                    r4.close()     // Catch: java.io.IOException -> L54
                    throw r1
                L54:
                    r0 = move-exception
                    com.whatsapp.util.Log.e(r0)
                L58:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4GB.APJ(java.lang.String, X.0Ca):void");
            }
        };
        C00J c00j2 = this.A01;
        String A02 = ((C05Y) c00j2.get()).A02();
        if (map != null) {
            str2 = (String) map.get("params");
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        int i = 1;
        i = ("com.bloks.www.minishops.whatsapp.privacy_notice".equals(str) || "com.bloks.www.minishops.whatsapp.products_preview_h_scroll".equals(str)) ? 2 : 2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C04P("smax_id", i));
        arrayList2.add(new C04P("id", A02, null, (byte) 0));
        arrayList2.add(new C04P("xmlns", "fb:shops", null, (byte) 0));
        arrayList2.add(new C04P("type", "get", null, (byte) 0));
        arrayList2.add(new C04P("to", C04260Jm.A00));
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        byte[] bytes = str != null ? str.getBytes() : null;
        if (!arrayList4.isEmpty()) {
            c04pArr = (C04P[]) arrayList4.toArray(new C04P[0]);
        } else {
            c04pArr = null;
        }
        if (!arrayList3.isEmpty() && (c02590CaArr4 = (C02590Ca[]) arrayList3.toArray(new C02590Ca[0])) != null) {
            c02590Ca = new C02590Ca("app_id", c04pArr, c02590CaArr4, null);
        } else {
            c02590Ca = new C02590Ca("app_id", c04pArr, null, bytes);
        }
        arrayList.add(c02590Ca);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        byte[] bytes2 = (((C90334Ap) c00j.get()).A00.A0E(C01C.A0T) ? "a2b9281ba17eb1dfb485e5e67dae6a2b02bd20c9517e50d04a3403240400fce6" : "99cf72c694661d4e5743da2a4fb4dcc75c2e18169de42f0ce35d9aff73003393").getBytes();
        if (!arrayList6.isEmpty()) {
            c04pArr2 = (C04P[]) arrayList6.toArray(new C04P[0]);
        } else {
            c04pArr2 = null;
        }
        if (!arrayList5.isEmpty() && (c02590CaArr3 = (C02590Ca[]) arrayList5.toArray(new C02590Ca[0])) != null) {
            c02590Ca2 = new C02590Ca("version", c04pArr2, c02590CaArr3, null);
        } else {
            c02590Ca2 = new C02590Ca("version", c04pArr2, null, bytes2);
        }
        arrayList.add(c02590Ca2);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        byte[] bytes3 = str2 == null ? null : str2.getBytes();
        if (!arrayList8.isEmpty()) {
            c04pArr3 = (C04P[]) arrayList8.toArray(new C04P[0]);
        } else {
            c04pArr3 = null;
        }
        if (!arrayList7.isEmpty() && (c02590CaArr2 = (C02590Ca[]) arrayList7.toArray(new C02590Ca[0])) != null) {
            c02590Ca3 = new C02590Ca("params", c04pArr3, c02590CaArr2, null);
        } else {
            c02590Ca3 = new C02590Ca("params", c04pArr3, null, bytes3);
        }
        arrayList.add(c02590Ca3);
        if (!arrayList2.isEmpty()) {
            c04pArr4 = (C04P[]) arrayList2.toArray(new C04P[0]);
        } else {
            c04pArr4 = null;
        }
        if (!arrayList.isEmpty() && (c02590CaArr = (C02590Ca[]) arrayList.toArray(new C02590Ca[0])) != null) {
            c02590Ca4 = new C02590Ca("iq", c04pArr4, c02590CaArr, null);
        } else {
            c02590Ca4 = new C02590Ca("iq", c04pArr4, null, null);
        }
        StringBuilder A0P = C000200d.A0P("wabloks.");
        String obj = c02590Ca4.toString();
        StringBuilder sb = new StringBuilder(" id='");
        sb.append(A02);
        sb.append("'");
        A0P.append(obj.replace(sb.toString(), ""));
        final String obj2 = A0P.toString();
        if (A0E && (c02590Ca5 = (C02590Ca) ((C46M) this.A02.get()).A01("wabloks.245", obj2)) != null) {
            try {
                interfaceC010405f.APJ(A02, c02590Ca5);
                return;
            } catch (C0L4 e) {
                Log.e(e);
                return;
            }
        }
        ((C05Y) c00j2.get()).A07(245, A02, c02590Ca4, new InterfaceC010405f() { // from class: X.4GC
            public final /* synthetic */ String A03 = "wabloks.245";

            {
                C90364As.this = this;
            }

            @Override // X.InterfaceC010405f
            public void AJI(String str3) {
                interfaceC010405f.AJI(str3);
            }

            @Override // X.InterfaceC010405f
            public void AJx(String str3, C02590Ca c02590Ca6) {
                interfaceC010405f.AJx(str3, c02590Ca6);
            }

            @Override // X.InterfaceC010405f
            public void APJ(String str3, C02590Ca c02590Ca6) {
                if (A0E) {
                    String str4 = this.A03;
                    String str5 = obj2;
                    C46L A00 = ((C46M) C90364As.this.A02.get()).A00(str4);
                    A00.A00.A08(str5, new C46K(c02590Ca6));
                }
                interfaceC010405f.APJ(str3, c02590Ca6);
            }
        }, 32000L);
    }
}
