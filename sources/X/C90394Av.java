package X;

import android.util.Base64;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.4Av  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90394Av {
    public final String A00;
    public final C90404Aw A01;

    public C90394Av(C90404Aw c90404Aw) {
        String[] split;
        this.A01 = c90404Aw;
        StringBuilder sb = new StringBuilder();
        for (String str : new String(Base64.decode("MS03LTItNA==", -1)).split("-")) {
            Properties properties = this.A01.A03;
            sb.append(properties != null ? properties.getProperty(str) : null);
        }
        this.A00 = new String(Base64.decode(sb.toString(), -1));
    }

    public String A00(JSONObject jSONObject) {
        String str = this.A00;
        if (str == null || str.isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\[([^\\]]*)\\]").matcher(str);
        StringBuffer stringBuffer = new StringBuffer((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        while (matcher.find()) {
            String group = matcher.group();
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(jSONObject.optString(group.substring(1, group.length() - 1))));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
