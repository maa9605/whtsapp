package X;

import android.database.Cursor;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.0KC */
/* loaded from: classes.dex */
public class C0KC extends C0KD implements AnonymousClass098, AnonymousClass099 {
    public int A00;
    public long A01;
    public C0K0 A02;
    public String A03;

    public C0KC(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 16);
    }

    public C0KC(AnonymousClass094 anonymousClass094, long j, C21Y c21y, boolean z) {
        super(anonymousClass094, j, (byte) 16);
        ((AnonymousClass092) this).A01 = 1;
        ((C0KD) this).A00 = c21y.A00;
        ((C0KD) this).A01 = c21y.A01;
        if ((c21y.A04 & 256) == 256) {
            A0E().A04(c21y.A08.A06(), z);
        }
        if ((c21y.A04 & 32) == 32) {
            this.A03 = c21y.A0A;
        }
        this.A01 = c21y.A07;
    }

    public C0KC(AnonymousClass094 anonymousClass094, long j, Location location, String str, int i, List list) {
        super(anonymousClass094, j, (byte) 16);
        if (location != null) {
            ((C0KD) this).A00 = location.getLatitude();
            ((C0KD) this).A01 = location.getLongitude();
        }
        ((AnonymousClass092) this).A01 = 1;
        A0Y(1);
        this.A00 = i;
        this.A03 = str;
        A0v(list);
    }

    public C0KC(C0KC c0kc, AnonymousClass094 anonymousClass094, long j) {
        super(c0kc, anonymousClass094, j);
        this.A00 = c0kc.A00;
        this.A01 = c0kc.A01;
        this.A03 = c0kc.A03;
        this.A02 = c0kc.A02;
    }

    @Override // X.AnonymousClass092
    public int A04() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public long A08() {
        return this.A01;
    }

    @Override // X.AnonymousClass092
    public String A0J() {
        return this.A03;
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        C0K0 c0k0 = this.A02;
        if (c0k0 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c0k0.A06.getRawString());
            sb.append(",");
            sb.append(Double.toString(c0k0.A00));
            sb.append(",");
            sb.append(Double.toString(c0k0.A01));
            sb.append(",");
            sb.append(Long.toString(c0k0.A05));
            return sb.toString();
        }
        return null;
    }

    @Override // X.AnonymousClass092
    public void A0W(int i) {
        this.A00 = i;
    }

    @Override // X.AnonymousClass092
    public void A0a(long j) {
        this.A01 = j;
    }

    @Override // X.AnonymousClass092
    public void A0o(String str) {
        this.A03 = str;
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        if (str != null) {
            String[] split = str.split(",");
            if (split.length == 4) {
                UserJid nullable = UserJid.getNullable(split[0]);
                if (nullable != null) {
                    C0K0 c0k0 = new C0K0(nullable);
                    this.A02 = c0k0;
                    c0k0.A00 = Double.parseDouble(split[1]);
                    c0k0.A01 = Double.parseDouble(split[2]);
                    c0k0.A05 = Long.parseLong(split[3]);
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return this.A03;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
        this.A03 = str;
    }

    @Override // X.C0KD
    public void A19(Cursor cursor, C02L c02l) {
        UserJid A0B;
        super.A19(cursor, c02l);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("live_location_share_duration"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("live_location_sequence_number"));
        double d = cursor.getDouble(cursor.getColumnIndexOrThrow("live_location_final_latitude"));
        double d2 = cursor.getDouble(cursor.getColumnIndexOrThrow("live_location_final_longitude"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("live_location_final_timestamp"));
        if (d == 0.0d && d2 == 0.0d && j == 0) {
            return;
        }
        if (this.A0n.A02) {
            c02l.A05();
            A0B = c02l.A03;
        } else {
            A0B = A0B();
        }
        if (A0B != null) {
            C0K0 c0k0 = new C0K0(A0B);
            c0k0.A00 = d;
            c0k0.A01 = d2;
            c0k0.A05 = j;
            this.A02 = c0k0;
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C03900Hp A0E = A0E();
        C40541sR c40541sR = c40551sS.A01;
        C21X c21x = (C21X) ((C40531sQ) c40541sR.A00).A10().AVX();
        double d = ((C0KD) this).A00;
        c21x.A02();
        C21Y c21y = (C21Y) c21x.A00;
        c21y.A04 |= 1;
        c21y.A00 = d;
        double d2 = ((C0KD) this).A01;
        c21x.A02();
        C21Y c21y2 = (C21Y) c21x.A00;
        c21y2.A04 |= 2;
        c21y2.A01 = d2;
        boolean z = c40551sS.A03;
        if (!z && A0E.A08() != null) {
            C0AN A00 = C0AN.A00(A0E.A08());
            c21x.A02();
            C21Y.A09((C21Y) c21x.A00, A00);
        }
        C0CM c0cm = c40551sS.A02;
        byte[] bArr = c40551sS.A05;
        if (AnonymousClass029.A1U(this, c0cm, bArr)) {
            C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, z, c0cm, bArr);
            c21x.A02();
            C21Y.A0A((C21Y) c21x.A00, A0G);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            String str = this.A03;
            c21x.A02();
            C21Y.A0B((C21Y) c21x.A00, str);
        }
        long j = this.A01;
        c21x.A02();
        C21Y c21y3 = (C21Y) c21x.A00;
        c21y3.A04 |= 64;
        c21y3.A07 = j;
        c40541sR.A02();
        C40531sQ.A0S((C40531sQ) c40541sR.A00, c21x);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0KC(this, anonymousClass094, this.A0E);
    }
}
