package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.2L8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2L8 {
    public C0IP A00;
    public String A01;
    public String A02;
    public byte[] A03;
    public byte[] A04;

    public C2L8(String str, byte[] bArr, String str2, C0IP c0ip, byte[] bArr2) {
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = str2;
        this.A00 = c0ip;
        this.A04 = bArr2;
    }

    public static C2L8 A00(String str) {
        C0IP c0ip;
        byte[] decode;
        String[] split = str.split(",");
        int length = split.length;
        if (length < 3) {
            Log.e("qrData/processQR/error/invalid_code parts");
            return null;
        }
        boolean z = length >= 4;
        if (z) {
            try {
                c0ip = new C0IP(C002701i.A0S(AnonymousClass029.A1h(new byte[]{5}, Base64.decode(split[2], 0))));
                decode = Base64.decode(split[3], 0);
            } catch (C05240Nw unused) {
                Log.e("qrData/processQR/error/invalid identity key");
                return null;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("qrData/processQR/error/");
                sb.append(e);
                Log.e(sb.toString());
                return null;
            }
        } else {
            c0ip = null;
            decode = null;
        }
        try {
            return new C2L8(split[0], Base64.decode(split[1], 0), z ? null : split[2], c0ip, decode);
        } catch (IllegalArgumentException unused2) {
            Log.e("qrData/processQR/error/invalid public key");
            return null;
        }
    }
}
