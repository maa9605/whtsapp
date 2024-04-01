package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.math.BigInteger;

/* renamed from: X.48u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C898848u {
    public static volatile C898848u A01;
    public final JniBridge A00;

    public C898848u(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }

    public static String A00(BigInteger bigInteger) {
        if (bigInteger == null) {
            return null;
        }
        try {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (length < 4) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = length - 1; i >= length - 4; i--) {
                sb.append(String.format("%02X", Byte.valueOf(byteArray[i])));
            }
            return sb.toString();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("PAY: JweCompactSerializer/getCertID: ");
            sb2.append(e);
            Log.e(sb2.toString());
            return null;
        }
    }
}
