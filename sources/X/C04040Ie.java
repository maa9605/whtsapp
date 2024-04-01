package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0Ie */
/* loaded from: classes.dex */
public class C04040Ie extends AnonymousClass097 implements AnonymousClass098, AnonymousClass099 {
    public boolean A00;
    public transient C04050If A01;
    public transient Integer A02;

    public C04040Ie(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 20);
    }

    public C04040Ie(AnonymousClass094 anonymousClass094, long j, C48572Ft c48572Ft, boolean z) {
        super(anonymousClass094, j, (byte) 20);
        C0AN c0an;
        int i;
        C09H c09h = new C09H();
        ((AnonymousClass097) this).A02 = c09h;
        if ((c48572Ft.A00 & 8) == 8) {
            C0Ho.A0J(this, c09h, c48572Ft.A09.A06());
        }
        int i2 = c48572Ft.A00;
        if ((i2 & 512) == 512) {
            c09h.A0B = c48572Ft.A05 * 1000;
        }
        if (!z || (i2 & 2) == 2) {
            byte[] A06 = c48572Ft.A07.A06();
            int length = A06.length;
            if (length == 32) {
                ((AnonymousClass097) this).A06 = Base64.encodeToString(A06, 2);
            } else {
                StringBuilder A0P = C000200d.A0P("FMessageSticker/bogus sha-256 hash received; length=");
                A0P.append(length);
                A0P.append("; message.key=");
                A0P.append(anonymousClass094);
                Log.w(A0P.toString());
                throw new C22W(14);
            }
        }
        if ((c48572Ft.A00 & 4) == 4) {
            byte[] A062 = c48572Ft.A06.A06();
            int length2 = A062.length;
            if (length2 == 32) {
                ((AnonymousClass097) this).A05 = Base64.encodeToString(A062, 2);
            } else {
                StringBuilder A0P2 = C000200d.A0P("FMessageSticker/bogus sha-256 hash received; length=");
                A0P2.append(length2);
                A0P2.append("; message.key=");
                A0P2.append(anonymousClass094);
                Log.w(A0P2.toString());
                throw new C22W(14);
            }
        }
        if (!z || (c48572Ft.A00 & 16) == 16) {
            String str = c48572Ft.A0D;
            if ("image/webp".equalsIgnoreCase(str)) {
                ((AnonymousClass097) this).A07 = str;
            } else {
                StringBuilder A0P3 = C000200d.A0P("FMessageSticker/invalid sticker mime type; mimetype=");
                A0P3.append(str);
                A0P3.append("; message.key=");
                A0P3.append(anonymousClass094);
                Log.w(A0P3.toString());
                throw new C22W(17);
            }
        }
        if ((c48572Ft.A00 & 1) == 1) {
            A1E(c48572Ft.A0E);
        }
        int i3 = c48572Ft.A00;
        if ((i3 & 64) == 64 && (i3 & 32) == 32) {
            c09h.A06 = c48572Ft.A02;
            c09h.A08 = c48572Ft.A03;
        }
        if (!z || (i3 & 128) == 128) {
            c09h.A0G = c48572Ft.A0C;
        }
        if ((i3 & 256) == 256) {
            long j2 = c48572Ft.A04;
            if (j2 >= 0) {
                ((AnonymousClass097) this).A01 = j2;
            } else {
                StringBuilder A0P4 = C000200d.A0P("FMessageSticker/bogus media size received; fileLength=");
                A0P4.append(j2);
                A0P4.append("; message.key=");
                A0P4.append(anonymousClass094);
                Log.w(A0P4.toString());
                throw new C22W(13);
            }
        }
        if ((i3 & 1024) == 1024 && (i = c48572Ft.A01) > 0) {
            c09h.A04 = i;
        }
        if ((i3 & 2048) == 2048 && (c0an = c48572Ft.A08) != null) {
            c09h.A0R = c0an.A06();
        }
        this.A00 = c48572Ft.A0F;
    }

    public C04040Ie(C04040Ie c04040Ie, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z) {
        super(c04040Ie, anonymousClass094, j, c09h, z, c04040Ie.A0m);
        this.A01 = c04040Ie.A01;
        this.A00 = c04040Ie.A00;
    }

    @Override // X.AnonymousClass097
    public AnonymousClass097 A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        return new C04040Ie(this, anonymousClass094, j, c09h, false);
    }

    @Override // X.AnonymousClass097
    public void A1C(Cursor cursor, C09H c09h) {
        super.A1C(cursor, c09h);
        this.A00 = C05T.A04(cursor, cursor.getColumnIndexOrThrow("is_animated_sticker"));
    }

    public C0JM A1H() {
        C0JM c0jm = new C0JM();
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null) {
            File file = c09h.A0F;
            if (file != null && file.exists()) {
                c0jm.A08 = c09h.A0F.getAbsolutePath();
                c0jm.A01 = 1;
            } else {
                String str = ((AnonymousClass097) this).A08;
                if (str != null) {
                    c0jm.A08 = str;
                    c0jm.A01 = 3;
                }
            }
            c0jm.A0B = ((AnonymousClass097) this).A06;
            c0jm.A07 = ((AnonymousClass097) this).A05;
            c0jm.A03 = c09h.A08;
            c0jm.A02 = c09h.A06;
            c0jm.A0A = ((AnonymousClass097) this).A07;
            byte[] bArr = c09h.A0U;
            if (bArr != null) {
                c0jm.A09 = Base64.encodeToString(bArr, 1);
            }
            String str2 = c09h.A0G;
            if (str2 != null) {
                c0jm.A05 = str2;
            }
        }
        return c0jm;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null && (c40551sS.A04 || c09h.A0U != null)) {
            C40541sR c40541sR = c40551sS.A01;
            C48562Fs c48562Fs = (C48562Fs) ((C40531sQ) c40541sR.A00).A18().AVX();
            byte[] bArr = c09h.A0U;
            if (bArr != null) {
                C0AN A00 = C0AN.A00(bArr);
                c48562Fs.A02();
                C48572Ft.A0B((C48572Ft) c48562Fs.A00, A00);
            } else {
                Log.w("FMessageSticker/buildE2eMessage/sticker media key missing");
            }
            long j = c09h.A0B;
            if (j > 0) {
                c48562Fs.A02();
                C48572Ft c48572Ft = (C48572Ft) c48562Fs.A00;
                c48572Ft.A00 |= 512;
                c48572Ft.A05 = j / 1000;
            }
            if (!TextUtils.isEmpty(((AnonymousClass097) this).A05)) {
                C0AN A002 = C0AN.A00(Base64.decode(((AnonymousClass097) this).A05, 0));
                c48562Fs.A02();
                C48572Ft.A0A((C48572Ft) c48562Fs.A00, A002);
            }
            if (!TextUtils.isEmpty(((AnonymousClass097) this).A06)) {
                C0AN A003 = C0AN.A00(Base64.decode(((AnonymousClass097) this).A06, 0));
                c48562Fs.A02();
                C48572Ft.A09((C48572Ft) c48562Fs.A00, A003);
            }
            int i = c09h.A06;
            if (i > 0 && c09h.A08 > 0) {
                c48562Fs.A02();
                C48572Ft c48572Ft2 = (C48572Ft) c48562Fs.A00;
                c48572Ft2.A00 |= 32;
                c48572Ft2.A02 = i;
                int i2 = c09h.A08;
                c48562Fs.A02();
                C48572Ft c48572Ft3 = (C48572Ft) c48562Fs.A00;
                c48572Ft3.A00 |= 64;
                c48572Ft3.A03 = i2;
            }
            C0CM c0cm = c40551sS.A02;
            byte[] bArr2 = c40551sS.A05;
            if (AnonymousClass029.A1U(this, c0cm, bArr2)) {
                C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c0cm, bArr2);
                c48562Fs.A02();
                C48572Ft.A0D((C48572Ft) c48562Fs.A00, A0G);
            }
            String str = ((AnonymousClass097) this).A09;
            if (str != null) {
                c48562Fs.A02();
                C48572Ft.A0E((C48572Ft) c48562Fs.A00, str);
            }
            String str2 = ((AnonymousClass097) this).A07;
            if (str2 != null) {
                c48562Fs.A02();
                C48572Ft.A0F((C48572Ft) c48562Fs.A00, str2);
            }
            if (!TextUtils.isEmpty(c09h.A0G)) {
                String str3 = c09h.A0G;
                c48562Fs.A02();
                C48572Ft.A0G((C48572Ft) c48562Fs.A00, str3);
            }
            long j2 = ((AnonymousClass097) this).A01;
            if (j2 > 0) {
                c48562Fs.A02();
                C48572Ft c48572Ft4 = (C48572Ft) c48562Fs.A00;
                c48572Ft4.A00 |= 256;
                c48572Ft4.A04 = j2;
            }
            int i3 = c09h.A04;
            if (i3 > 0) {
                c48562Fs.A02();
                C48572Ft c48572Ft5 = (C48572Ft) c48562Fs.A00;
                c48572Ft5.A00 |= 1024;
                c48572Ft5.A01 = i3;
            }
            byte[] bArr3 = c09h.A0R;
            if (bArr3 != null) {
                C0AN A004 = C0AN.A00(bArr3);
                c48562Fs.A02();
                C48572Ft.A0C((C48572Ft) c48562Fs.A00, A004);
            }
            boolean z = this.A00;
            c48562Fs.A02();
            C48572Ft c48572Ft6 = (C48572Ft) c48562Fs.A00;
            c48572Ft6.A00 |= 4096;
            c48572Ft6.A0F = z;
            c40541sR.A02();
            C40531sQ.A0a((C40531sQ) c40541sR.A00, c48562Fs);
            return;
        }
        StringBuilder A0P = C000200d.A0P("FMessageSticker/unable to send encrypted media message due to missing mediaKey; message.key=");
        A0P.append(this.A0n);
        A0P.append("; media_wa_type=");
        C000200d.A1G(A0P, this.A0m);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C04040Ie(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }
}
