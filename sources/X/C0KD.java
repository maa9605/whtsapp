package X;

import android.database.Cursor;
import com.whatsapp.MediaData;

/* renamed from: X.0KD */
/* loaded from: classes.dex */
public abstract class C0KD extends AnonymousClass092 {
    public double A00;
    public double A01;
    public int A02;

    public C0KD(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, b);
        super.A01 = 1;
        this.A02 = 0;
    }

    public C0KD(C0KD c0kd, AnonymousClass094 anonymousClass094, long j) {
        super(c0kd, anonymousClass094, j, true, c0kd.A0m);
        super.A01 = 1;
        this.A00 = c0kd.A00;
        this.A01 = c0kd.A01;
        this.A02 = c0kd.A02;
    }

    public C0KD(C0KD c0kd, AnonymousClass094 anonymousClass094, long j, boolean z, byte b) {
        super(c0kd, anonymousClass094, j, z, b);
        super.A01 = 1;
        this.A00 = c0kd.A00;
        this.A01 = c0kd.A01;
        this.A02 = c0kd.A02;
    }

    @Override // X.AnonymousClass092
    public double A01() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public double A02() {
        return this.A01;
    }

    @Override // X.AnonymousClass092
    public C03900Hp A0E() {
        C03900Hp A0E = super.A0E();
        if (A0E != null) {
            return A0E;
        }
        throw null;
    }

    @Override // X.AnonymousClass092
    public Object A0F() {
        int i = this.A02;
        if (i == 1) {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.AnonymousClass092
    public void A0S(double d) {
        this.A00 = d;
    }

    @Override // X.AnonymousClass092
    public void A0T(double d) {
        this.A01 = d;
    }

    @Override // X.AnonymousClass092
    public void A0k(Object obj) {
        C09H c09h;
        if (obj instanceof C09H) {
            c09h = (C09H) obj;
        } else if (obj instanceof MediaData) {
            c09h = C09H.A00((MediaData) obj);
        } else if (obj instanceof Integer) {
            this.A02 = ((Number) obj).intValue();
            return;
        } else if (obj == null) {
            this.A02 = 2;
            return;
        } else {
            StringBuilder A0P = C000200d.A0P("FMessageLocation/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
            A0P.append(obj.getClass());
            C000700j.A08(false, A0P.toString());
            this.A02 = 2;
            return;
        }
        if (c09h.A0P) {
            this.A02 = 2;
        } else if (c09h.A0a) {
            this.A02 = 1;
        } else {
            this.A02 = 0;
        }
    }

    public void A18(Cursor cursor) {
        this.A00 = cursor.getDouble(cursor.getColumnIndexOrThrow("latitude"));
        this.A01 = cursor.getDouble(cursor.getColumnIndexOrThrow("longitude"));
        A0E().A04(cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail")), true);
    }

    public void A19(Cursor cursor, C02L c02l) {
        this.A00 = cursor.getDouble(cursor.getColumnIndexOrThrow("latitude"));
        this.A01 = cursor.getDouble(cursor.getColumnIndexOrThrow("longitude"));
        this.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("map_download_status"));
    }
}
