package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.support.faq.FaqItemActivity;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.3s2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83383s2 extends C0HS {
    public ProgressDialog A00;
    public final C49622Lq A01;
    public final C41451tw A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public C83383s2(ActivityC02290Ap activityC02290Ap, C49622Lq c49622Lq, C41451tw c41451tw, String str, String str2) {
        this.A05 = new WeakReference(activityC02290Ap);
        this.A01 = c49622Lq;
        this.A02 = c41451tw;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.C0HS
    public void A06() {
        Context context = (Context) this.A05.get();
        if (context == null) {
            return;
        }
        if (this.A00 == null) {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.A00 = progressDialog;
            progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.3Ys
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C83383s2.this.A05(true);
                }
            });
            this.A00.setCanceledOnTouchOutside(false);
        }
        if (this.A00.isShowing()) {
            return;
        }
        this.A00.setMessage(context.getString(R.string.help_loading_progress_label));
        this.A00.setIndeterminate(true);
        this.A00.show();
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        try {
            try {
                C0JL c0jl = (C0JL) this.A02.A01().A02(this.A04, null, false);
                InputStreamReader inputStreamReader = new InputStreamReader(c0jl.AAe());
                try {
                    char[] cArr = new char[2048];
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    for (int read = inputStreamReader.read(cArr, 0, 2048); read != -1; read = inputStreamReader.read(cArr, 0, 2048)) {
                        i += read;
                        if (i <= 65536) {
                            sb.append(cArr, 0, read);
                        } else {
                            throw new IOException("The response from server is too big.");
                        }
                    }
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    String optString = jSONObject.optString("title");
                    jSONObject.optString("platform");
                    jSONObject.optString("lang");
                    C72183Yz c72183Yz = new C72183Yz(optString, jSONObject.optString("url"), jSONObject.optString("id"), jSONObject.optString("description"), jSONObject.optBoolean("open_flow", true));
                    inputStreamReader.close();
                    c0jl.A01.disconnect();
                    return c72183Yz;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                }
            } catch (Exception e) {
                Log.e("http/get-help/httperror", e);
                return null;
            }
        } catch (Exception e2) {
            Log.e("Could not fetch help response", e2);
            return null;
        }
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        ProgressDialog progressDialog;
        String str;
        C72183Yz c72183Yz = (C72183Yz) obj;
        if (c72183Yz != null && c72183Yz.A00 == 200 && (str = c72183Yz.A03) != null) {
            String str2 = c72183Yz.A04;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = c72183Yz.A02;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = c72183Yz.A01;
                    if (!TextUtils.isEmpty(str4)) {
                        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A05.get();
                        if (activityC02290Ap != null) {
                            Intent intent = new Intent(activityC02290Ap, FaqItemActivity.class);
                            intent.putExtra("title", str);
                            intent.putExtra("content", str4);
                            intent.putExtra("url", str2);
                            intent.putExtra("article_id", str3);
                            intent.putExtra("show_contact_support_button", c72183Yz.A05);
                            intent.putExtra("contact_us_context", this.A03);
                            intent.putExtra("describe_problem_fields", (Bundle) null);
                            activityC02290Ap.A14(intent);
                            activityC02290Ap.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        }
                        progressDialog = this.A00;
                        if (progressDialog == null && progressDialog.isShowing()) {
                            this.A00.cancel();
                            return;
                        }
                    }
                }
            }
        }
        ActivityC02290Ap activityC02290Ap2 = (ActivityC02290Ap) this.A05.get();
        if (activityC02290Ap2 != null) {
            this.A01.A00(activityC02290Ap2, this.A03, false, null);
        }
        progressDialog = this.A00;
        if (progressDialog == null) {
        }
    }
}
