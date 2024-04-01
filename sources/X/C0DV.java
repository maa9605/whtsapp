package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0DV */
/* loaded from: classes.dex */
public class C0DV {
    public static volatile C0DV A0H;
    public C03560Ge A00;
    public InterfaceC03570Gf A01;
    public C03600Gi A02;
    public boolean A03;
    public final AbstractC000600i A04;
    public final C01B A05;
    public final C002301c A06;
    public final C013306k A07;
    public final C013406l A08;
    public final C0GZ A09;
    public final C03540Gc A0A;
    public final C03550Gd A0B;
    public final C0GR A0C;
    public final C0DW A0D;
    public final C03530Gb A0E;
    public final C014406v A0F = C014406v.A00("PaymentsManager", "infra", "COMMON");
    public final InterfaceC002901k A0G;

    public C0DV(AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C013406l c013406l, C01B c01b, C002301c c002301c, C0GZ c0gz, C03530Gb c03530Gb, C0DW c0dw, C0GR c0gr, C03540Gc c03540Gc, C013306k c013306k, C03550Gd c03550Gd) {
        this.A04 = abstractC000600i;
        this.A0G = interfaceC002901k;
        this.A08 = c013406l;
        this.A05 = c01b;
        this.A06 = c002301c;
        this.A09 = c0gz;
        this.A0E = c03530Gb;
        this.A0D = c0dw;
        this.A0C = c0gr;
        this.A0A = c03540Gc;
        this.A07 = c013306k;
        this.A0B = c03550Gd;
    }

    public static C0DV A00() {
        if (A0H == null) {
            synchronized (C0DV.class) {
                if (A0H == null) {
                    AbstractC000600i A00 = AbstractC000600i.A00();
                    InterfaceC002901k A002 = C002801j.A00();
                    C013406l A003 = C013406l.A00();
                    C01B A004 = C01B.A00();
                    C002301c A005 = C002301c.A00();
                    C0GZ A006 = C0GZ.A00();
                    if (C03530Gb.A04 == null) {
                        synchronized (C03530Gb.class) {
                            if (C03530Gb.A04 == null) {
                                C03530Gb.A04 = new C03530Gb(C013406l.A00(), C0DW.A00());
                            }
                        }
                    }
                    A0H = new C0DV(A00, A002, A003, A004, A005, A006, C03530Gb.A04, C0DW.A00(), C0GR.A00(), C03540Gc.A04, C013306k.A07(), C03550Gd.A00());
                }
            }
        }
        return A0H;
    }

    public C03560Ge A01() {
        A04();
        C03560Ge c03560Ge = this.A00;
        if (c03560Ge != null) {
            return c03560Ge;
        }
        throw null;
    }

    public synchronized InterfaceC03590Gh A02(String str) {
        A04();
        InterfaceC03570Gf interfaceC03570Gf = this.A01;
        if (interfaceC03570Gf == null) {
            return null;
        }
        return interfaceC03570Gf.initializeFactory(str);
    }

    public synchronized C0DX A03() {
        C03600Gi c03600Gi;
        A04();
        c03600Gi = this.A02;
        if (c03600Gi == null) {
            throw null;
        }
        return c03600Gi;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x004f A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #3 {, blocks: (B:48:0x0001, B:52:0x0007, B:54:0x000b, B:56:0x0013, B:60:0x004b, B:62:0x004f, B:65:0x0058, B:66:0x006a, B:70:0x0085, B:71:0x0086, B:72:0x008e, B:74:0x0091, B:75:0x0092, B:59:0x0049, B:58:0x002d, B:73:0x008f, B:67:0x006b, B:69:0x0071), top: B:89:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058 A[Catch: all -> 0x00b0, TRY_ENTER, TryCatch #3 {, blocks: (B:48:0x0001, B:52:0x0007, B:54:0x000b, B:56:0x0013, B:60:0x004b, B:62:0x004f, B:65:0x0058, B:66:0x006a, B:70:0x0085, B:71:0x0086, B:72:0x008e, B:74:0x0091, B:75:0x0092, B:59:0x0049, B:58:0x002d, B:73:0x008f, B:67:0x006b, B:69:0x0071), top: B:89:0x0001 }] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.0Gj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A04() {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.A03     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L7
            monitor-exit(r8)
            return
        L7:
            X.0Gf r0 = r8.A01     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L49
            java.lang.Class<X.0DV> r0 = X.C0DV.class
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lb0
            if (r1 == 0) goto L49
            java.lang.String r0 = "com.whatsapp.payments.PaymentConfiguration"
            java.lang.Class r2 = r1.loadClass(r0)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lb0
            java.lang.String r1 = "getInstance"
            r3 = 0
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lb0
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lb0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lb0
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lb0
            X.0Gf r0 = (X.InterfaceC03570Gf) r0     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lb0
            goto L4b
        L2c:
            r2 = move-exception
            X.00i r3 = r8.A04     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "PAY: PaymentsManager/getConfig/exception: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb0
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "PaymentsManager"
            java.lang.String r2 = X.C014406v.A01(r0, r1)     // Catch: java.lang.Throwable -> Lb0
            r1 = 1
            java.lang.String r0 = "PaymentsManager/getConfig"
            r3.A09(r0, r2, r1)     // Catch: java.lang.Throwable -> Lb0
        L49:
            X.0Gf r0 = r8.A01     // Catch: java.lang.Throwable -> Lb0
        L4b:
            r8.A01 = r0     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L58
            X.06v r1 = r8.A0F     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "initialize/paymentConfig is null"
            r1.A04(r0)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r8)
            return
        L58:
            X.0GR r2 = r8.A0C     // Catch: java.lang.Throwable -> Lb0
            X.0DX r1 = r0.getService()     // Catch: java.lang.Throwable -> Lb0
            X.0Gi r0 = new X.0Gi     // Catch: java.lang.Throwable -> Lb0
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> Lb0
            r8.A02 = r0     // Catch: java.lang.Throwable -> Lb0
            X.06l r6 = r8.A08     // Catch: java.lang.Throwable -> Lb0
            X.0Gf r0 = r8.A01     // Catch: java.lang.Throwable -> Lb0
            r1 = r6
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb0
            r6.A02 = r0     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r6.A07     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L85
            X.00o r0 = r6.A05     // Catch: java.lang.Throwable -> Lad
            android.app.Application r3 = r0.A00     // Catch: java.lang.Throwable -> Lad
            X.00i r4 = r6.A03     // Catch: java.lang.Throwable -> Lad
            X.04Z r5 = r6.A06     // Catch: java.lang.Throwable -> Lad
            X.04l r7 = r6.A00     // Catch: java.lang.Throwable -> Lad
            X.0Gj r2 = new X.0Gj     // Catch: java.lang.Throwable -> Lad
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lad
            r6.A01 = r2     // Catch: java.lang.Throwable -> Lad
            r0 = 1
            r6.A07 = r0     // Catch: java.lang.Throwable -> Lad
        L85:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb0
            X.06k r3 = r8.A07     // Catch: java.lang.Throwable -> Lb0
            X.0Gf r0 = r8.A01     // Catch: java.lang.Throwable -> Lb0
            r3.A00 = r0     // Catch: java.lang.Throwable -> Lb0
            X.0Gb r1 = r8.A0E     // Catch: java.lang.Throwable -> Lb0
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb0
            r1.A00 = r0     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb0
            X.01k r2 = r8.A0G     // Catch: java.lang.Throwable -> Lb0
            X.0Gf r1 = r8.A01     // Catch: java.lang.Throwable -> Lb0
            X.0Ge r0 = new X.0Ge     // Catch: java.lang.Throwable -> Lb0
            r0.<init>(r2, r6, r1, r3)     // Catch: java.lang.Throwable -> Lb0
            r8.A00 = r0     // Catch: java.lang.Throwable -> Lb0
            r0 = 1
            r8.A03 = r0     // Catch: java.lang.Throwable -> Lb0
            X.06v r2 = r8.A0F     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "initialized"
            r0 = 0
            r2.A07(r0, r1, r0)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r8)
            return
        Laa:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb0
            throw r0     // Catch: java.lang.Throwable -> Lb0
        Lad:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb0
            throw r0     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DV.A04():void");
    }

    public void A05(InterfaceC03640Gm interfaceC03640Gm) {
        Map map;
        boolean z;
        A04();
        C03540Gc c03540Gc = this.A0A;
        if (c03540Gc != null) {
            synchronized (c03540Gc) {
                map = c03540Gc.A00;
                z = map.size() > 0;
            }
            if (z) {
                synchronized (c03540Gc) {
                    HashSet hashSet = new HashSet();
                    for (String str : map.keySet()) {
                        if (map.get(str) == interfaceC03640Gm) {
                            hashSet.add(str);
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        map.remove((String) it.next());
                    }
                }
            }
        }
    }

    public synchronized void A06(boolean z, boolean z2) {
        this.A0F.A07(null, "reset", null);
        A04();
        this.A03 = false;
        C0GR c0gr = this.A0C;
        synchronized (c0gr) {
            c0gr.A05.A03("reset country");
            c0gr.A00 = null;
            c0gr.A01 = null;
            c0gr.A02 = false;
        }
        if (this.A08.A07 && !z2) {
            this.A00.A01();
        }
        this.A0A.A00();
        if (z) {
            C0GZ c0gz = this.A09;
            synchronized (c0gz) {
                c0gz.A00.A0I(c0gz.A02);
            }
        } else {
            C0GZ c0gz2 = this.A09;
            synchronized (c0gz2) {
                String A07 = c0gz2.A00.A07(c0gz2.A02);
                boolean z3 = c0gz2.A00.A04().getBoolean("payments_sandbox", false);
                c0gz2.A00.A0I(c0gz2.A02);
                if (!TextUtils.isEmpty(A07)) {
                    try {
                        JSONObject jSONObject = new JSONObject(A07);
                        Iterator<String> keys = jSONObject.keys();
                        ArrayList arrayList = new ArrayList();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!"tos_no_wallet".equals(next)) {
                                arrayList.add(next);
                            } else if (z3) {
                                C000200d.A0l(c0gz2.A00, "payments_sandbox", z3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            jSONObject.remove((String) it.next());
                        }
                        C0EU c0eu = c0gz2.A00;
                        boolean z4 = c0gz2.A02;
                        String obj = jSONObject.toString();
                        if (z4) {
                            C000200d.A0k(c0eu, "payments_setup_completed_steps", obj);
                        } else {
                            C000200d.A0k(c0eu, "payments_merchant_setup_completed_steps", obj);
                        }
                    } catch (JSONException e) {
                        c0gz2.A03.A08("clearAllButTos threw: ", e);
                    }
                }
                C014406v c014406v = c0gz2.A03;
                StringBuilder sb = new StringBuilder();
                sb.append("clearAllButTos ended with steps: ");
                sb.append(c0gz2.A00.A07(c0gz2.A02));
                sb.append(" sandbox: ");
                sb.append(c0gz2.A00.A04().getBoolean("payments_sandbox", false));
                c014406v.A07(null, sb.toString(), null);
            }
        }
        InterfaceC03660Go A9B = this.A02.A9B();
        if (A9B != null) {
            A9B.A74();
        }
        InterfaceC03670Gp A9C = this.A02.A9C();
        if (A9C != null) {
            C45A c45a = (C45A) A9C;
            c45a.A01();
            c45a.A02();
        }
    }
}
