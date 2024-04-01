package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.2KK */
/* loaded from: classes2.dex */
public class C2KK {
    public static volatile C2KK A02;
    public C0GG A00 = null;
    public final C47412Bc A01;

    public C2KK(C47412Bc c47412Bc) {
        this.A01 = c47412Bc;
    }

    public static final int A00(Jid jid, C49382Kc c49382Kc, C0CD c0cd) {
        return c0cd.A02.A00("cart_item", A01(jid, c49382Kc), "business_id=?  AND product_id=?", new String[]{jid.getRawString(), c49382Kc.A01.A09});
    }

    public static ContentValues A01(Jid jid, C49382Kc c49382Kc) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        C468628o c468628o = c49382Kc.A01;
        BigDecimal bigDecimal = c468628o.A0C;
        if (bigDecimal != null) {
            l = Long.valueOf(bigDecimal.multiply(new BigDecimal(1000.0d)).longValue());
        } else {
            l = null;
        }
        C40091rZ c40091rZ = c468628o.A05;
        if (c40091rZ != null) {
            l2 = Long.valueOf(c40091rZ.A00.multiply(new BigDecimal(1000.0d)).longValue());
            Date date = c40091rZ.A02;
            if (date != null) {
                l3 = Long.valueOf(date.getTime());
            } else {
                l3 = null;
            }
            Date date2 = c40091rZ.A01;
            if (date2 != null) {
                l4 = Long.valueOf(date2.getTime());
            } else {
                l4 = null;
            }
        } else {
            l2 = null;
            l3 = null;
            l4 = null;
        }
        C09R c09r = c468628o.A03;
        String str2 = c09r != null ? c09r.A00 : null;
        ContentValues contentValues = new ContentValues();
        contentValues.put("business_id", jid.getRawString());
        contentValues.put("product_id", c468628o.A09);
        contentValues.put("product_title", c468628o.A0B);
        contentValues.put("product_price_1000", l);
        contentValues.put("product_currency_code", str2);
        List list = c468628o.A0D;
        if (!list.isEmpty()) {
            str = ((C2A2) list.get(0)).A02;
        } else {
            str = "";
        }
        contentValues.put("product_image_id", str);
        contentValues.put("product_quantity", Long.valueOf(c49382Kc.A00));
        contentValues.put("product_sale_price_1000", l2);
        contentValues.put("product_sale_start_date", l3);
        contentValues.put("product_sale_end_date", l4);
        return contentValues;
    }

    public static C2KK A02() {
        if (A02 == null) {
            synchronized (C2KK.class) {
                if (A02 == null) {
                    A02 = new C2KK(C47412Bc.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C49382Kc A03(android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2KK.A03(android.database.Cursor):X.2Kc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x003b, code lost:
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C49382Kc A04(com.whatsapp.jid.Jid r7, java.lang.String r8) {
        /*
            r6 = this;
            X.2Bc r2 = r6.A01
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.A05
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            X.2Bi r0 = r2.A02()
            r5 = 0
            X.0CD r4 = new X.0CD
            r4.<init>(r1, r0, r5)
            X.0CE r3 = r4.A02     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date FROM cart_item WHERE business_id=? AND product_id=?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r7.getRawString()     // Catch: java.lang.Throwable -> L44
            r1[r5] = r0     // Catch: java.lang.Throwable -> L44
            r0 = 1
            r1[r0] = r8     // Catch: java.lang.Throwable -> L44
            android.database.Cursor r1 = r3.A07(r2, r1)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L3a
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L3a
            X.2Kc r0 = A03(r1)     // Catch: java.lang.Throwable -> L33
            goto L3d
        L33:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L39
        L39:
            throw r0     // Catch: java.lang.Throwable -> L44
        L3a:
            r0 = 0
            if (r1 == 0) goto L40
        L3d:
            r1.close()     // Catch: java.lang.Throwable -> L44
        L40:
            r4.close()
            return r0
        L44:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2KK.A04(com.whatsapp.jid.Jid, java.lang.String):X.2Kc");
    }

    public synchronized C0GG A05(InterfaceC002901k interfaceC002901k) {
        C0GG c0gg;
        c0gg = this.A00;
        if (c0gg == null) {
            c0gg = new C2KH(this, interfaceC002901k);
            this.A00 = c0gg;
        }
        return c0gg;
    }

    public Future A06(Jid jid) {
        C0Ml c0Ml = new C0Ml();
        try {
            C47412Bc c47412Bc = this.A01;
            C0CD c0cd = new C0CD(c47412Bc.A05.readLock(), c47412Bc.A02(), false);
            Cursor A07 = c0cd.A02.A07("SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date FROM cart_item WHERE business_id=?", new String[]{jid.getRawString()});
            try {
                ArrayList arrayList = new ArrayList();
                if (A07 != null) {
                    while (A07.moveToNext()) {
                        arrayList.add(A03(A07));
                    }
                }
                c0Ml.A01 = arrayList;
                c0Ml.A02 = true;
                c0Ml.A03.countDown();
                if (A07 != null) {
                    A07.close();
                }
                c0cd.close();
                return c0Ml;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (A07 != null) {
                        try {
                            A07.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Exception e) {
            c0Ml.A00(e);
            return c0Ml;
        }
    }

    public void A07(Jid jid) {
        C0CD A01 = this.A01.A01();
        try {
            A01.A02.A0D("DELETE FROM cart_item WHERE business_id=?", new String[]{jid.getRawString()});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A08(Jid jid, C49382Kc c49382Kc) {
        C0CD A01 = this.A01.A01();
        try {
            C03790Hb A00 = A01.A00();
            String str = c49382Kc.A01.A09;
            C0CE c0ce = A01.A02;
            Cursor A07 = c0ce.A07("SELECT product_quantity FROM cart_item WHERE business_id=? AND product_id=?", new String[]{jid.getRawString(), str});
            if (A07 != null) {
                try {
                    r2 = A07.moveToNext() ? A07.getInt(A07.getColumnIndexOrThrow("product_quantity")) : 0;
                    A07.close();
                } finally {
                }
            }
            if (r2 > 0) {
                A00(jid, c49382Kc, A01);
            } else {
                c0ce.A02("cart_item", A01(jid, c49382Kc));
            }
            A00.A00();
            A00.close();
            A01.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A09(Jid jid, String str) {
        C0CD A01 = this.A01.A01();
        try {
            A01.A02.A0D("DELETE FROM cart_item WHERE business_id=? AND product_id=?", new String[]{jid.getRawString(), str});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
