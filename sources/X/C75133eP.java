package X;

import android.util.Base64;

/* renamed from: X.3eP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75133eP {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final byte[] A04;

    public C75133eP(String str, String str2, String str3, byte[] bArr) {
        this.A02 = str;
        this.A00 = str3;
        this.A01 = str2;
        this.A03 = Base64.encodeToString(bArr, 2);
        this.A04 = bArr;
    }
}
