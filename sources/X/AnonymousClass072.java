package X;

import java.util.HashMap;

/* renamed from: X.072  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass072 {
    public static HashMap A01;
    public static final String A02 = C000200d.A0L(new StringBuilder(), C02M.A02, "_light_debug");
    public static volatile AnonymousClass072 A03;
    public final C02O A00;

    static {
        HashMap hashMap = new HashMap();
        A01 = hashMap;
        hashMap.put("smax_payment_br.xml", "payments/smax_payment_br.xml");
        A01.put("smax_payment_in.xml", "payments/smax_payment_in.xml");
        A01.put("smax_payment_compliance.xml", "payments/smax_payment_compliance.xml");
        A01.put("smax_payment_br_dogfooding.xml", "payments/smax_payment_br_dogfooding.xml");
        A01.put("smax_payment_in_dogfooding.xml", "payments/smax_payment_in_dogfooding.xml");
        A01.put("smax_payment_us_dogfooding.xml", "payments/smax_payment_us_dogfooding.xml");
        A01.put("smax_payment_id.xml", "");
        A01.put("smax_payment_mx.xml", "");
        A01.put("smax_payment_id_dogfooding.xml", "");
        A01.put("smax_payment_mx_dogfooding.xml", "");
    }

    public AnonymousClass072(C02O c02o) {
        this.A00 = c02o;
    }

    public static AnonymousClass072 A00() {
        if (A03 == null) {
            synchronized (C000500h.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass072(C02O.A00());
                }
            }
        }
        return A03;
    }
}
