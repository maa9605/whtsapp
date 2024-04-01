package X;

import android.net.Uri;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.1xq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43711xq extends C0J8 {
    public String A00;
    public String A01;
    public final C43401xL A02;
    public final boolean A03;
    public final boolean A04;

    public C43711xq(C43401xL c43401xL, String str, String str2, String str3, boolean z, boolean z2) {
        super(str, str2, str3);
        if (!z) {
            this.A00 = super.A03;
        }
        this.A02 = c43401xL;
        this.A03 = z;
        this.A04 = z2;
    }

    public final Uri.Builder A02(C05080Nf c05080Nf) {
        A03();
        C000700j.A08(this.A01 != null, "Upload token has not been set");
        Uri.Builder A01 = A01(c05080Nf);
        A01.appendQueryParameter("token", this.A01);
        if (this.A04) {
            A01.appendQueryParameter("_nc_rmr", "1");
        }
        return A01;
    }

    public final void A03() {
        byte[] A1g;
        if (this.A01 == null) {
            C43401xL c43401xL = this.A02;
            if (c43401xL != null) {
                String str = super.A02;
                if (c43401xL != null) {
                    byte[] decode = Base64.decode(str, 2);
                    byte[] bArr = c43401xL.A00;
                    if (bArr != null) {
                        if (decode != null) {
                            int length = bArr.length;
                            int length2 = decode.length;
                            A1g = new byte[length + length2];
                            System.arraycopy(bArr, 0, A1g, 0, length);
                            System.arraycopy(decode, 0, A1g, length, length2);
                        }
                        A1g = C02180Ae.A1g(bArr);
                    } else {
                        if (decode != null) {
                            A1g = C02180Ae.A1g(decode);
                        }
                        A1g = C02180Ae.A1g(bArr);
                    }
                    try {
                        this.A01 = AnonymousClass024.A0I(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(A1g), 2));
                        return;
                    } catch (NoSuchAlgorithmException e) {
                        throw new AssertionError(e);
                    }
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.C0J9
    public String A8B(C05080Nf c05080Nf, C01B c01b, boolean z) {
        Uri.Builder A02 = A02(c05080Nf);
        if (this.A03) {
            A02.appendQueryParameter("stream", "1");
        }
        return A02.build().toString();
    }
}
