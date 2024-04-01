package X;

import android.content.Context;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4B7  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4B7 {
    public final String A00;
    public final C4B3 A01;

    public C4B7(C4B3 c4b3, String str) {
        this.A01 = c4b3;
        this.A00 = str;
    }

    public C4BB A00(Context context, String str, String str2, String str3, JSONObject jSONObject) {
        C4B3 c4b3;
        String str4;
        try {
            String string = jSONObject.getString("txnId");
            String string2 = jSONObject.getString("credential");
            C90434Az A00 = C90434Az.A00(context);
            String string3 = A00.A02.A00.getString("k0", "");
            if (A00.A07()) {
                string3 = A00.A01("k0", "aes_k0", string3);
            }
            Matcher matcher = Pattern.compile("\\{([^}]*)\\}").matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            C4BB c4bb = null;
            if (matcher.find()) {
                String group = matcher.group();
                String substring = group.substring(1, group.length() - 1);
                try {
                    c4b3 = this.A01;
                    str4 = this.A00;
                } catch (C4B4 e) {
                    StringBuilder A0P = C000200d.A0P("PAY: ");
                    A0P.append(e.toString());
                    Log.e(A0P.toString());
                }
                if (str4 != null && str4.isEmpty()) {
                    throw new C4B4(C4B5.KEY_CODE_EMPTY);
                }
                ArrayList arrayList = new ArrayList();
                for (C4B1 c4b1 : C4B3.A01) {
                    if (c4b1.A00.equals(str4)) {
                        arrayList.add(c4b1);
                    }
                }
                if (arrayList.size() != 0) {
                    C4B1 c4b12 = (C4B1) arrayList.get(new SecureRandom().nextInt(arrayList.size()));
                    c4b3.A00 = c4b12.A02;
                    StringBuilder sb = new StringBuilder(500);
                    try {
                        String encodeToString = Base64.encodeToString(C02180Ae.A1i(C02180Ae.A1e(substring), C02180Ae.A1d(string3)), 2);
                        sb.append(string2);
                        sb.append("|");
                        sb.append(string);
                        sb.append("|");
                        sb.append(encodeToString);
                        try {
                            byte[] bytes = sb.toString().getBytes();
                            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(c4b3.A00.getBytes("utf-8"), 2)));
                            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                            cipher.init(1, generatePublic);
                            C4BB c4bb2 = new C4BB(new C4B6(c4b12.A01, c4b12.A00, Base64.encodeToString(cipher.doFinal(bytes), 2)));
                            c4bb = c4bb2;
                            c4bb2.type = str2;
                            c4bb2.subType = str3;
                            C4B6 c4b6 = c4bb2.data;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("2.0|");
                            sb2.append(c4b6.encryptedBase64String);
                            c4b6.encryptedBase64String = sb2.toString();
                            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(c4bb.data.encryptedBase64String.replaceAll("\n", "")));
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (Exception unused) {
                        throw new C4B4(C4B5.UNKNOWN_ERROR);
                    }
                } else {
                    throw new C4B4(C4B5.KEY_CODE_INVALID);
                }
            }
            if (stringBuffer.length() > 0) {
                matcher.appendTail(stringBuffer);
            }
            if (c4bb != null) {
                c4bb.data.encryptedBase64String = stringBuffer.toString();
            }
            return c4bb;
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }
}
