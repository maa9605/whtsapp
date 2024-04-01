package X;

import android.database.Cursor;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.0LP */
/* loaded from: classes.dex */
public class C0LP extends C0KD implements AnonymousClass098, AnonymousClass099, C0D9 {
    public String A00;
    public String A01;
    public String A02;

    @Override // X.AnonymousClass092
    public String A16() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
    }

    public C0LP(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 5);
    }

    public C0LP(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, (byte) 30);
    }

    public C0LP(AnonymousClass094 anonymousClass094, long j, C48432Ff c48432Ff, boolean z) {
        super(anonymousClass094, j, (byte) 5);
        A1F(c48432Ff, z);
    }

    public C0LP(AnonymousClass094 anonymousClass094, long j, Location location) {
        super(anonymousClass094, j, (byte) 5);
        if (location != null) {
            ((C0KD) this).A00 = location.getLatitude();
            ((C0KD) this).A01 = location.getLongitude();
        }
        A0Y(1);
    }

    public C0LP(AnonymousClass094 anonymousClass094, long j, PlaceInfo placeInfo) {
        super(anonymousClass094, j, (byte) 5);
        A0Y(1);
        ((C0KD) this).A00 = placeInfo.A01;
        ((C0KD) this).A01 = placeInfo.A02;
        this.A01 = placeInfo.A06;
        this.A00 = placeInfo.A04;
        this.A02 = placeInfo.A0A;
    }

    public C0LP(C0LP c0lp, AnonymousClass094 anonymousClass094, long j) {
        super(c0lp, anonymousClass094, j, false, (byte) 5);
        this.A01 = c0lp.A01;
        this.A00 = c0lp.A00;
        this.A02 = c0lp.A02;
    }

    public C0LP(C0LP c0lp, AnonymousClass094 anonymousClass094, long j, boolean z) {
        super(c0lp, anonymousClass094, j, z, c0lp.A0m);
        this.A01 = c0lp.A01;
        this.A00 = c0lp.A00;
        this.A02 = c0lp.A02;
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        return A1D();
    }

    @Override // X.AnonymousClass092
    public String A0O() {
        return this.A02;
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(10);
            if (indexOf == -1) {
                this.A01 = str;
                return;
            }
            this.A01 = str.substring(0, indexOf);
            if (str.length() <= indexOf) {
                return;
            }
            this.A00 = str.substring(indexOf + 1);
        }
    }

    @Override // X.AnonymousClass092
    public void A0t(String str) {
        this.A02 = str;
    }

    @Override // X.C0KD
    public void A18(Cursor cursor) {
        super.A18(cursor);
        this.A01 = cursor.getString(cursor.getColumnIndexOrThrow("place_name"));
        this.A00 = cursor.getString(cursor.getColumnIndexOrThrow("place_address"));
        this.A02 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
    }

    @Override // X.C0KD
    public void A19(Cursor cursor, C02L c02l) {
        super.A19(cursor, c02l);
        this.A01 = cursor.getString(cursor.getColumnIndexOrThrow("place_name"));
        this.A00 = cursor.getString(cursor.getColumnIndexOrThrow("place_address"));
        this.A02 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
    }

    @Override // X.AnonymousClass098
    /* renamed from: A1A */
    public C0LP A6G(AnonymousClass094 anonymousClass094) {
        return new C0LP(this, anonymousClass094, this.A0E, true);
    }

    @Override // X.C0D9
    /* renamed from: A1B */
    public C0LP A6F(AnonymousClass094 anonymousClass094, long j) {
        return new C0LP(this, anonymousClass094, j, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001a, code lost:
        if (r1.startsWith(r2) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A1C() {
        /*
            r4 = this;
            java.lang.String r2 = r4.A01
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L62
            if (r1 == 0) goto L24
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1c
            if (r2 == 0) goto L22
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L24
        L1c:
            java.lang.String r3 = r4.A00
            if (r3 != 0) goto L34
            r0 = 0
            throw r0
        L22:
            r0 = 0
            throw r0
        L24:
            java.lang.String r0 = r4.A1D()
            if (r0 == 0) goto L32
            java.lang.String r3 = r4.A1D()
            if (r3 != 0) goto L34
            r0 = 0
            throw r0
        L32:
            java.lang.String r3 = ""
        L34:
            java.lang.String r0 = "https://maps.google.com/maps?q="
            java.lang.StringBuilder r2 = X.C000200d.A0P(r0)
            java.lang.String r1 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r3.replaceAll(r1, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r2.append(r0)
            java.lang.String r0 = "&sll="
            r2.append(r0)
            double r0 = r4.A00
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            double r0 = r4.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L62:
            java.lang.String r0 = r4.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LP.A1C():java.lang.String");
    }

    public String A1D() {
        String str = this.A01;
        String str2 = this.A00;
        if (str2 != null) {
            StringBuilder A0V = C000200d.A0V(str, "\n");
            A0V.append(str2);
            return A0V.toString();
        }
        return str;
    }

    public void A1E(C02L c02l, boolean z, C0CM c0cm, byte[] bArr, C48422Fe c48422Fe) {
        C03900Hp A0E = A0E();
        double d = ((C0KD) this).A00;
        c48422Fe.A02();
        C48432Ff c48432Ff = (C48432Ff) c48422Fe.A00;
        c48432Ff.A04 |= 1;
        c48432Ff.A00 = d;
        double d2 = ((C0KD) this).A01;
        c48422Fe.A02();
        C48432Ff c48432Ff2 = (C48432Ff) c48422Fe.A00;
        c48432Ff2.A04 |= 2;
        c48432Ff2.A01 = d2;
        if (!TextUtils.isEmpty(this.A02)) {
            String str = this.A02;
            c48422Fe.A02();
            C48432Ff.A0D((C48432Ff) c48422Fe.A00, str);
        }
        if (!TextUtils.isEmpty(this.A01)) {
            String str2 = this.A01;
            c48422Fe.A02();
            C48432Ff.A0B((C48432Ff) c48422Fe.A00, str2);
        }
        if (!TextUtils.isEmpty(this.A00)) {
            String str3 = this.A00;
            c48422Fe.A02();
            C48432Ff.A0C((C48432Ff) c48422Fe.A00, str3);
        }
        if (!z && A0E.A08() != null) {
            C0AN A00 = C0AN.A00(A0E.A08());
            c48422Fe.A02();
            C48432Ff.A09((C48432Ff) c48422Fe.A00, A00);
        }
        if (AnonymousClass029.A1U(this, c0cm, bArr)) {
            C40521sP A0G = AnonymousClass029.A0G(c02l, this, z, c0cm, bArr);
            c48422Fe.A02();
            C48432Ff.A0A((C48432Ff) c48422Fe.A00, A0G);
        }
    }

    public void A1F(C48432Ff c48432Ff, boolean z) {
        ((C0KD) this).A00 = c48432Ff.A00;
        ((C0KD) this).A01 = c48432Ff.A01;
        int i = c48432Ff.A04;
        if ((i & 16) == 16) {
            this.A02 = c48432Ff.A0B;
        }
        if ((i & 4) == 4) {
            this.A01 = c48432Ff.A0A;
        }
        if ((i & 8) == 8) {
            this.A00 = c48432Ff.A08;
        }
        if ((i & 1024) == 1024) {
            A0E().A04(c48432Ff.A06.A06(), z);
            ((C0KD) this).A02 = 2;
        }
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48422Fe c48422Fe = (C48422Fe) ((C40531sQ) c40541sR.A00).A11().AVX();
        A1E(c40551sS.A00, c40551sS.A03, c40551sS.A02, c40551sS.A05, c48422Fe);
        if (C40731sm.A0n(this)) {
            C2GC c2gc = (C2GC) c40541sR.A04().AVX();
            C40731sm.A0f(c2gc, A0D().A00);
            c2gc.A02();
            C2FI.A0D((C2FI) c2gc.A00, c48422Fe);
            EnumC55382kK enumC55382kK = EnumC55382kK.LOCATION;
            c2gc.A02();
            C2FI.A0A((C2FI) c2gc.A00, enumC55382kK);
            c40541sR.A02();
            C40531sQ.A0C((C40531sQ) c40541sR.A00, (C2FI) c2gc.A01());
            return;
        }
        c40541sR.A02();
        C40531sQ.A0T((C40531sQ) c40541sR.A00, c48422Fe);
    }
}
