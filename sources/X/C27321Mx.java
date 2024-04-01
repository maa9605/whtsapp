package X;

import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.1Mx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27321Mx {
    public final byte[] A00;
    public final byte[] A01;

    public C27321Mx(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public static String A00(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 45) {
                break;
            }
            i++;
        }
        if (i == length) {
            Log.e("BackupFooter/verify-jid/empty-suffix");
            return "";
        }
        return new String(bArr, i, length - i).trim();
    }

    public C0HN A01(C0Fi c0Fi, String str, String str2) {
        C000200d.A14("BackupFooter/verify-integrity/actual-digest/  ", str);
        String A04 = C02A.A04(this.A00);
        StringBuilder sb = new StringBuilder("BackupFooter/verify-integrity/expected-digest/");
        sb.append(A04);
        Log.i(sb.toString());
        if (str.equals(A04)) {
            Log.i("BackupFooter/verify-integrity/digest-matches/success");
            if (this.A01 != null && str2 != null && A02(str2)) {
                c0Fi.A01("BackupFooter/verify-integrity/jid-mismatch", 4);
                return new C0HN(4, null);
            }
            return new C0HN(1, null);
        }
        c0Fi.A01(C000200d.A0J("BackupFooter/verify-integrity/failed expected-digest:", A04, " actual-digest:", str), 4);
        return new C0HN(2, null);
    }

    public boolean A02(String str) {
        byte[] bArr = this.A01;
        if (bArr != null) {
            String A00 = A00(bArr);
            if (str.endsWith(A00)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("BackupFooter/has-jid-user-mismatch/expected-jid-user-ends-with: ");
            sb.append(A00);
            sb.append(" ");
            sb.append(" actual-jid-user: ");
            sb.append(str);
            Log.e(sb.toString());
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("BackupFooter{digest=");
        A0P.append(Arrays.toString(this.A00));
        A0P.append(", jidSuffix=");
        byte[] bArr = this.A01;
        A0P.append(bArr != null ? Arrays.toString(bArr) : "null");
        A0P.append('}');
        return A0P.toString();
    }
}
