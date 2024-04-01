package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.0JK */
/* loaded from: classes.dex */
public class C0JK {
    public final C004902f A00;

    public C0JK(C004902f c004902f) {
        this.A00 = c004902f;
    }

    public static InterfaceC02170Ad A00(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.connect();
        return new C0JL(httpURLConnection);
    }

    public InterfaceC02170Ad A01(String str, AnonymousClass035 anonymousClass035, String str2) {
        try {
            try {
                URLConnection openConnection = new URL(Uri.parse(str).toString()).openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setSSLSocketFactory(anonymousClass035.A04());
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(30000);
                    if (str2 != null) {
                        httpsURLConnection.addRequestProperty("If-None-Match", str2);
                    }
                    httpsURLConnection.setRequestProperty("User-Agent", this.A00.A02());
                    return new C0JL(httpsURLConnection);
                }
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection");
            } catch (IOException e) {
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection", e);
            }
        } catch (MalformedURLException e2) {
            Log.e("WaHttpUrlConnectionClient/createDownloadableFilesConnection/malformed-url : ", e2);
            throw e2;
        }
    }

    public InterfaceC02170Ad A02(String str, String str2, boolean z) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestProperty("User-Agent", this.A00.A02());
        if (z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (str2 != null) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(str2.getBytes("UTF-8"));
                outputStream.close();
            } finally {
            }
        }
        httpURLConnection.connect();
        return new C0JL(httpURLConnection);
    }
}
