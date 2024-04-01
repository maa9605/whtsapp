package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: X.1PM  reason: invalid class name */
/* loaded from: classes.dex */
public class C1PM extends AbstractC35941jz {
    @Override // X.AbstractC35941jz
    public int A08() {
        return 16;
    }

    public C1PM(C03280Fb c03280Fb, C02L c02l, C03290Fc c03290Fc, C03310Fe c03310Fe, C000400f c000400f, C0Fi c0Fi, File file) {
        super(c03280Fb, c02l, c03290Fc, c03310Fe, c000400f, c0Fi, file);
    }

    @Override // X.AbstractC35941jz
    public C0HN A09(C27321Mx c27321Mx, String str) {
        byte[] bArr = c27321Mx.A01;
        if (bArr != null) {
            return new C0HN(2, C27321Mx.A00(bArr));
        }
        return c27321Mx.A01(this.A04, str, null);
    }

    @Override // X.AbstractC35941jz
    public C27321Mx A0B(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[16];
        if (randomAccessFile.read(bArr) == 16) {
            return new C27321Mx(bArr, null);
        }
        Log.e("backup/cannot read footer, footer is null");
        return null;
    }

    @Override // X.AbstractC35941jz
    public C27321Mx A0C(byte[] bArr) {
        return new C27321Mx(bArr, null);
    }

    @Override // X.AbstractC35941jz
    public AbstractC59942tf A0D(Context context) {
        try {
            C0HZ A03 = C03460Fu.A03(context);
            if (A03 == null) {
                this.A04.A01("msgstore/backupDatabase/key is null", 3);
                return null;
            }
            C03780Ha c03780Ha = A03.A00;
            return new C68413Jp(c03780Ha, A03.A02, A03.A01, c03780Ha.A01, "2.21.9.15", A0H());
        } catch (Exception e) {
            Log.w("msgstore/backupDatabase/key/error", e);
            return null;
        }
    }

    @Override // X.AbstractC35941jz
    public AbstractC59942tf A0E(InputStream inputStream) {
        String str;
        C87083z5 A09 = C87083z5.A09(inputStream);
        String str2 = null;
        if (A09.A0j() == EnumC79083l3.WA_PROVIDED && (A09.A00 & 2) == 2) {
            C87123z9 A0l = A09.A0l();
            C03780Ha c03780Ha = new C03780Ha(A0l.A01.A06(), A0l.A05, A0l.A04.A06(), A0l.A03.A06(), A0l.A02.A06());
            C03290Fc c03290Fc = this.A03;
            if (c03290Fc != null) {
                C05740Qa c05740Qa = (C05740Qa) c03290Fc.A01.get(new C05750Qb(c03780Ha.A00, c03780Ha.A04));
                if (c05740Qa == null) {
                    StringBuilder A0P = C000200d.A0P("msgstore/restore/cipher result is null for ");
                    A0P.append(A0F());
                    Log.e(A0P.toString());
                    return null;
                }
                c03780Ha.toString();
                byte[] bArr = c05740Qa.A02;
                Arrays.toString(bArr);
                if ((A09.A00 & 8) == 8) {
                    C87063z3 A0i = A09.A0i();
                    int i = A0i.A00;
                    if ((i & 1) == 1) {
                        str = A0i.A01;
                    } else {
                        str = null;
                    }
                    if ((i & 4) == 4) {
                        str2 = A0i.A03;
                    }
                } else {
                    str = null;
                }
                return new C68413Jp(c03780Ha, c05740Qa.A01, bArr, c03780Ha.A01, str, str2);
            }
            throw null;
        }
        StringBuilder A0P2 = C000200d.A0P("msgstore/restore/failed to read cipher from the file ");
        A0P2.append(A0F());
        Log.e(A0P2.toString());
        return null;
    }

    @Override // X.AbstractC35941jz
    public EnumC03450Ft A0F() {
        return EnumC03450Ft.CRYPT14;
    }
}
