package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.09E */
/* loaded from: classes.dex */
public class C09E extends AnonymousClass097 implements AnonymousClass098, AnonymousClass099 {
    public int A00;

    public C09E(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 9);
    }

    public C09E(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, (byte) 26);
    }

    public C09E(AnonymousClass094 anonymousClass094, long j, C24B c24b, boolean z, boolean z2) {
        super(anonymousClass094, j, (byte) 9);
        A1J(c24b, z, z2);
    }

    public C09E(C09E c09e, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super(c09e, anonymousClass094, j, c09h, false, (byte) 9);
        this.A00 = c09e.A00;
    }

    public C09E(C09E c09e, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z) {
        super(c09e, anonymousClass094, j, c09h, z, c09e.A0m);
        this.A00 = c09e.A00;
    }

    @Override // X.AnonymousClass097, X.AnonymousClass092
    public int A04() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public C03900Hp A0E() {
        C03900Hp A0E = super.A0E();
        if (A0E != null) {
            return A0E;
        }
        throw null;
    }

    @Override // X.AnonymousClass097, X.AnonymousClass092
    public String A0N() {
        return A1B();
    }

    @Override // X.AnonymousClass097, X.AnonymousClass092
    public void A0W(int i) {
        this.A00 = i;
    }

    @Override // X.AnonymousClass097
    public String A1B() {
        String str = ((AnonymousClass097) this).A08;
        if (TextUtils.isEmpty(str)) {
            String A0T = C41961un.A0T(((AnonymousClass097) this).A07);
            if (TextUtils.isEmpty(A0T)) {
                return ((AnonymousClass097) this).A04;
            }
            return C000200d.A0M(new StringBuilder(), ((AnonymousClass097) this).A04, ".", A0T);
        }
        return str;
    }

    @Override // X.AnonymousClass097
    public void A1C(Cursor cursor, C09H c09h) {
        super.A1C(cursor, c09h);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("page_count"));
    }

    @Override // X.AnonymousClass097
    public void A1D(Cursor cursor, C09H c09h) {
        super.A1D(cursor, c09h);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("page_count"));
    }

    @Override // X.AnonymousClass097
    /* renamed from: A1H */
    public C09E A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            return new C09E(this, anonymousClass094, j, c09h, false);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x020f, code lost:
        if (r15.A0U != null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1I(X.C02L r9, X.C2FV r10, boolean r11, boolean r12, X.C0CM r13, byte[] r14, X.C09H r15, X.C03900Hp r16) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09E.A1I(X.02L, X.2FV, boolean, boolean, X.0CM, byte[], X.09H, X.0Hp):void");
    }

    public void A1J(C24B c24b, boolean z, boolean z2) {
        C09H c09h = new C09H();
        ((AnonymousClass097) this).A02 = c09h;
        if ((c24b.A00 & 64) == 64) {
            C0Ho.A0J(this, c09h, c24b.A09.A06());
        } else if (!z) {
            StringBuilder A0P = C000200d.A0P("FMessageDocument/missing media key; message.key=");
            A0P.append(this.A0n);
            Log.w(A0P.toString());
            throw new C22W(16);
        }
        if ((c24b.A00 & 1024) == 1024) {
            c09h.A0B = c24b.A05 * 1000;
        }
        byte[] A06 = c24b.A08.A06();
        if (A06.length > 0) {
            ((AnonymousClass092) this).A01 = 1;
            A0E().A04(A06, z2);
        }
        if (!z || (c24b.A00 & 16) == 16) {
            long j = c24b.A04;
            if (j >= 0) {
                ((AnonymousClass097) this).A01 = j;
            } else {
                StringBuilder A0P2 = C000200d.A0P("FMessageDocument/bogus media size received; file_length=");
                A0P2.append(j);
                A0P2.append("; message.key=");
                A0P2.append(this.A0n);
                Log.w(A0P2.toString());
                throw new C22W(13);
            }
        }
        if (!z || (c24b.A00 & 8) == 8) {
            byte[] A062 = c24b.A07.A06();
            int length = A062.length;
            if (length == 32) {
                ((AnonymousClass097) this).A06 = Base64.encodeToString(A062, 2);
            } else {
                StringBuilder A0P3 = C000200d.A0P("FMessageDocument/bogus sha-256 hash received; length=");
                A0P3.append(length);
                A0P3.append("; message.key=");
                A0P3.append(this.A0n);
                Log.w(A0P3.toString());
                throw new C22W(14);
            }
        }
        if ((c24b.A00 & 256) == 256) {
            byte[] A063 = c24b.A06.A06();
            int length2 = A063.length;
            if (length2 == 32) {
                ((AnonymousClass097) this).A05 = Base64.encodeToString(A063, 2);
            } else {
                StringBuilder A0P4 = C000200d.A0P("FMessageDocument/bogus sha-256 hash received; length=");
                A0P4.append(length2);
                A0P4.append("; message.key=");
                A0P4.append(this.A0n);
                Log.w(A0P4.toString());
                throw new C22W(14);
            }
        }
        if (!z || (c24b.A00 & 1) == 1) {
            A1E(c24b.A0I);
        }
        if (!TextUtils.isEmpty(c24b.A0H)) {
            ((AnonymousClass097) this).A04 = AnonymousClass024.A0K(c24b.A0H, 65536);
        }
        this.A00 = c24b.A01;
        if (!TextUtils.isEmpty(c24b.A0E)) {
            ((AnonymousClass097) this).A08 = AnonymousClass024.A0K(c24b.A0E, 65536);
        }
        if (z && (c24b.A00 & 512) != 512) {
            StringBuilder A0P5 = C000200d.A0P("FMessageAudio/message without direct path received; message.key=");
            A0P5.append(this.A0n);
            A0P5.append("; message.senderJid=");
            A0P5.append(this.A0G);
            Log.w(A0P5.toString());
        } else {
            c09h.A0G = c24b.A0D;
        }
        int i = c24b.A00;
        if ((i & 4096) == 4096 && (i & 16384) == 16384 && (i & 8192) == 8192 && (i & 64) == 64) {
            C05610Pk c05610Pk = new C05610Pk();
            c05610Pk.A03 = c24b.A0G;
            c05610Pk.A05 = Base64.encodeToString(c24b.A0B.A06(), 2);
            c05610Pk.A04 = Base64.encodeToString(c24b.A0A.A06(), 2);
            c05610Pk.A07 = c24b.A09.A06();
            int i2 = c24b.A00;
            if ((i2 & 1024) == 1024) {
                c05610Pk.A02 = c24b.A05 * 1000;
            }
            if ((i2 & 32768) == 32768) {
                c05610Pk.A08 = c24b.A08.A06();
            }
            int i3 = c24b.A00;
            if ((i3 & 262144) == 262144) {
                c05610Pk.A01 = c24b.A03;
            }
            if ((i3 & C42271vT.A09) == 131072) {
                c05610Pk.A00 = c24b.A02;
            }
            this.A0N = c05610Pk;
            A0U(2048);
        }
        ((AnonymousClass097) this).A07 = c24b.A0F;
        if (c24b.A0J) {
            ((AnonymousClass092) this).A04 = 7;
        }
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        boolean z;
        C09H c09h = ((AnonymousClass097) this).A02;
        C03900Hp A0E = A0E();
        if (c09h != null && ((z = c40551sS.A04) || c09h.A0U != null)) {
            C02L c02l = c40551sS.A00;
            C40541sR c40541sR = c40551sS.A01;
            C2FV c2fv = (C2FV) ((C40531sQ) c40541sR.A00).A0q().AVX();
            A1I(c02l, c2fv, z, c40551sS.A03, c40551sS.A02, c40551sS.A05, c09h, A0E);
            if (C40731sm.A0n(this)) {
                C2GC c2gc = (C2GC) c40541sR.A04().AVX();
                C40731sm.A0f(c2gc, A0D().A00);
                c2gc.A02();
                C2FI.A0B((C2FI) c2gc.A00, c2fv);
                EnumC55382kK enumC55382kK = EnumC55382kK.DOCUMENT;
                c2gc.A02();
                C2FI.A0A((C2FI) c2gc.A00, enumC55382kK);
                c40541sR.A02();
                C40531sQ.A0C((C40531sQ) c40541sR.A00, (C2FI) c2gc.A01());
                return;
            }
            c40541sR.A02();
            C40531sQ.A0J((C40531sQ) c40541sR.A00, c2fv);
            return;
        }
        StringBuilder A0P = C000200d.A0P("FMessageDocument/unable to send encrypted media message due to missing mediaKey; message.key=");
        A0P.append(this.A0n);
        A0P.append("; media_wa_type=");
        C000200d.A1G(A0P, this.A0m);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C09E(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }
}
