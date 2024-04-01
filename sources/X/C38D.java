package X;

import android.text.TextUtils;

/* renamed from: X.38D */
/* loaded from: classes2.dex */
public class C38D extends C05920Qu {
    public C0CZ A00;
    public boolean A01;

    @Override // X.C05920Qu
    public boolean A0C() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C38D(X.C0CZ r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.A06
            r1.<init>(r0)
            r1.A09 = r0
            r1.A0F(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38D.<init>(X.0CZ):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C38D(X.C2JV r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.A02
            r1.<init>(r0)
            r1.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38D.<init>(X.2JV):void");
    }

    @Override // X.C05920Qu
    public boolean A0D() {
        return this.A01;
    }

    public C0CZ A0E() {
        C0CZ c0cz = this.A00;
        if (c0cz != null) {
            return c0cz;
        }
        String str = this.A09;
        if (str == null) {
            return null;
        }
        return new C0CZ(null, null, 0, null, null, null, null, null, null, str);
    }

    public void A0F(C0CZ c0cz) {
        this.A00 = c0cz;
        this.A0D = c0cz.A08;
        this.A0A = c0cz.A02;
        this.A09 = c0cz.A06;
        this.A0F = c0cz.A09;
        byte[] bArr = c0cz.A00;
        if (bArr != null && bArr.length > 0) {
            this.A0F = bArr;
        }
        String str = c0cz.A07;
        if (!TextUtils.isEmpty(str)) {
            this.A0B = str;
        }
        String str2 = c0cz.A03;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.A08 = new C72973at(str2, -1, -1);
    }
}
