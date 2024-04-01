package X;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.4BI  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4BI {
    public JSONArray A00;

    public C4BI(Context context) {
        this.A00 = new JSONArray();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream open = context.getAssets().open("npci/npci_otp_rules.json");
            byte[] bArr = new byte[4096];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            open.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray != null) {
                try {
                    this.A00 = new JSONArray(new String(byteArray));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
