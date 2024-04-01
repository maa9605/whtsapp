package X;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: X.1wQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42851wQ {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public final SharedPreferences A08;

    public C42851wQ(C02O c02o) {
        SharedPreferences A01 = c02o.A01("qr_data");
        this.A08 = A01;
        this.A03 = A01.getString("ref", null);
        String string = this.A08.getString("key", null);
        byte[] decode = string == null ? null : Base64.decode(string, 0);
        this.A07 = decode;
        this.A05 = null;
        this.A06 = null;
        if (decode != null) {
            byte[] bArr = new byte[32];
            this.A05 = bArr;
            this.A06 = new byte[32];
            System.arraycopy(decode, 0, bArr, 0, 32);
            System.arraycopy(this.A07, 32, this.A06, 0, 32);
        }
        this.A02 = this.A08.getString("token", null);
        this.A00 = this.A08.getString("browser", null);
        this.A01 = this.A08.getString("epoch", null);
        this.A04 = this.A08.getBoolean("browser_changed", false);
    }

    public final void A00(String str) {
        this.A08.edit().remove(str).commit();
    }

    public boolean A01(String str) {
        String str2 = this.A00;
        return str2 != null && str2.equals(str);
    }

    public final boolean A02(String str, String str2) {
        return this.A08.edit().putString(str, str2).commit();
    }
}