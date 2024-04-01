package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2jw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55142jw extends C0HS {
    public long A00;
    public ProgressDialog A01;
    public String A02;
    public String A03;
    public final C04940Mo A04;
    public final InterfaceC05880Qp A05 = new InterfaceC05880Qp() { // from class: X.3Cz
        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            throw new IllegalStateException("must not be called");
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            throw new IllegalStateException("must not be called");
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            C55142jw c55142jw = C55142jw.this;
            c55142jw.A00 = -2L;
            C000200d.A1N(C000200d.A0P("searchSupportTask/externalStorage/avail external storage not calculated, state="), c55142jw.A03);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            C55142jw.this.A00 = -2L;
            Log.i("searchSupportTask/externalStorage/avail external storage not calculated, permission denied");
        }
    };
    public final C000400f A06;
    public final C000500h A07;
    public final C002301c A08;
    public final C018808t A09;
    public final C28I A0A;
    public final C40071rX A0B;
    public final C006602x A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final WeakReference A0G;
    public final List A0H;
    public final Uri[] A0I;

    public C55142jw(ActivityC02290Ap activityC02290Ap, C006602x c006602x, C40071rX c40071rX, C002301c c002301c, C04940Mo c04940Mo, C000400f c000400f, C018808t c018808t, C000500h c000500h, C28I c28i, String str, String str2, List list, String str3, Uri[] uriArr) {
        this.A0G = new WeakReference(activityC02290Ap);
        this.A0C = c006602x;
        this.A0B = c40071rX;
        this.A08 = c002301c;
        this.A04 = c04940Mo;
        this.A06 = c000400f;
        this.A09 = c018808t;
        this.A07 = c000500h;
        this.A0A = c28i;
        this.A0D = str;
        this.A0F = str2;
        this.A0H = list;
        this.A0E = str3;
        this.A0I = uriArr;
    }

    @Override // X.C0HS
    public void A06() {
        String string;
        Context context = (Context) this.A0G.get();
        if (context == null) {
            return;
        }
        if (this.A01 == null) {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.A01 = progressDialog;
            progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.2ws
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C55142jw.this.A05(true);
                }
            });
            this.A01.setCancelable(false);
        }
        if (this.A01.isShowing()) {
            return;
        }
        ProgressDialog progressDialog2 = this.A01;
        if (this.A09.A01()) {
            string = context.getString(R.string.contact_us_faq_search_dialog_message);
        } else {
            string = context.getString(R.string.searching);
        }
        progressDialog2.setMessage(string);
        this.A01.setIndeterminate(true);
        this.A01.show();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        JSONArray jSONArray;
        int length;
        Uri[] uriArr;
        Context context = (Context) this.A0G.get();
        if (context != null) {
            C000400f c000400f = this.A06;
            long A03 = c000400f.A03();
            this.A03 = Environment.getExternalStorageState();
            if (c000400f.A09(this.A05)) {
                this.A00 = c000400f.A02();
            }
            C04940Mo c04940Mo = this.A04;
            String str = this.A0D;
            String str2 = this.A0F;
            long j = this.A00;
            String str3 = this.A03;
            List list = this.A0H;
            String A01 = c04940Mo.A01(context, str, str2, null, true, j, A03, str3, true, list);
            this.A02 = A01;
            C000200d.A1N(C000200d.A0P("searchSupportTask/doInBackground/debugInfo: "), A01);
            try {
                Uri.Builder A00 = C40071rX.A00();
                A00.appendPath("client_search.php");
                A00.appendQueryParameter("platform", "android");
                C002301c c002301c = this.A08;
                A00.appendQueryParameter("lg", c002301c.A04());
                A00.appendQueryParameter("lc", c002301c.A03());
                A00.appendQueryParameter("eea", this.A0C.A07(C01C.A0I) ? "1" : "0");
                String str4 = this.A0E;
                A00.appendQueryParameter("query", str4);
                A00.appendQueryParameter("manufacturer", Build.MANUFACTURER);
                A00.appendQueryParameter("os_version", Build.VERSION.RELEASE);
                A00.appendQueryParameter("ccode", this.A07.A0H());
                A00.appendQueryParameter("app_version", "2.21.9.15");
                URLConnection openConnection = new URL(A00.toString()).openConnection();
                openConnection.setConnectTimeout(30000);
                openConnection.setReadTimeout(30000);
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                String obj = UUID.randomUUID().toString();
                StringBuilder sb = new StringBuilder();
                sb.append("multipart/form-data; boundary=");
                sb.append(obj);
                httpURLConnection.setRequestProperty("Content-Type", sb.toString());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(openConnection.getOutputStream());
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--");
                    sb2.append(obj);
                    sb2.append("\r\n");
                    bufferedOutputStream.write(sb2.toString().getBytes());
                    bufferedOutputStream.write("Content-Disposition: form-data; name=\"debug_info\"\r\n\r\n".getBytes());
                    bufferedOutputStream.write(this.A02.getBytes());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("\r\n--");
                    sb3.append(obj);
                    sb3.append("--\r\n");
                    bufferedOutputStream.write(sb3.toString().getBytes());
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    InputStream inputStream = openConnection.getInputStream();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb4 = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb4.append(readLine);
                        }
                        String obj2 = sb4.toString();
                        C61892wt c61892wt = null;
                        if (!TextUtils.isEmpty(obj2) && (length = (jSONArray = new JSONArray(obj2)).length()) != 0) {
                            ArrayList arrayList = new ArrayList(length);
                            ArrayList arrayList2 = new ArrayList(length);
                            ArrayList arrayList3 = new ArrayList(length);
                            ArrayList arrayList4 = new ArrayList(length);
                            for (int i = 0; i < length; i++) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                arrayList.add(optJSONObject.getString("title"));
                                arrayList2.add(optJSONObject.getString("description"));
                                arrayList3.add(optJSONObject.getString("url"));
                                arrayList4.add(optJSONObject.getString("id"));
                            }
                            ArrayList arrayList5 = new ArrayList();
                            for (Uri uri : this.A0I) {
                                if (uri != null) {
                                    arrayList5.add(uri);
                                }
                            }
                            c61892wt = new C61892wt(length, arrayList, arrayList2, arrayList3, arrayList4, str4, arrayList5, this.A02, list);
                        }
                        bufferedReader.close();
                        if (inputStream != null) {
                            inputStream.close();
                            return c61892wt;
                        }
                        return c61892wt;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                        throw th4;
                    }
                }
            } catch (IOException | JSONException e) {
                StringBuilder sb5 = new StringBuilder("searchSupportTask/doInBackground/error: ");
                sb5.append(e);
                Log.e(sb5.toString(), e);
            }
        }
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C61892wt c61892wt = (C61892wt) obj;
        if (this.A0G.get() != null) {
            if (c61892wt != null) {
                try {
                    int i = c61892wt.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append("searchSupportTask/onPostExecute/result/count: ");
                    sb.append(i);
                    Log.i(sb.toString());
                    if (i > 0) {
                        C28I c28i = this.A0A;
                        if (c28i != null) {
                            c28i.AOP(c61892wt);
                        }
                        ProgressDialog progressDialog = this.A01;
                        if (progressDialog == null || !progressDialog.isShowing()) {
                            return;
                        }
                        this.A01.cancel();
                        return;
                    }
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("searchSupportTask/onPostExecute/error: ");
                    sb2.append(e);
                    Log.e(sb2.toString(), e);
                }
            }
            C28I c28i2 = this.A0A;
            if (c28i2 != null) {
                c28i2.AJl();
            }
            ProgressDialog progressDialog2 = this.A01;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            this.A01.cancel();
        }
    }
}
