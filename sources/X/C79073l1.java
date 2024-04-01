package X;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.profile.WebImagePicker;
import com.whatsapp.util.Log;

/* renamed from: X.3l1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79073l1 extends C0HS {
    public ProgressDialog A00;
    public final C3TA A01;
    public final /* synthetic */ WebImagePicker A02;

    public C79073l1(WebImagePicker webImagePicker, C3TA c3ta) {
        this.A02 = webImagePicker;
        this.A01 = c3ta;
    }

    @Override // X.C0HS
    public void A03(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.setProgress(numArr[0].intValue());
        }
    }

    @Override // X.C0HS
    public void A06() {
        WebImagePicker webImagePicker = this.A02;
        ProgressDialog progressDialog = new ProgressDialog(webImagePicker);
        this.A00 = progressDialog;
        progressDialog.setProgressStyle(1);
        this.A00.setMessage(webImagePicker.getString(R.string.photo_loading));
        this.A00.setCancelable(true);
        this.A00.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.3T1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C79073l1 c79073l1 = C79073l1.this;
                ProgressDialog progressDialog2 = c79073l1.A00;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                }
                c79073l1.A00 = null;
                c79073l1.A05(true);
                WebImagePicker webImagePicker2 = c79073l1.A02;
                if (webImagePicker2.A0C == c79073l1) {
                    webImagePicker2.A0C = null;
                }
            }
        });
        this.A00.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x019c, code lost:
        if (r4 == null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169 A[Catch: all -> 0x01a8, TryCatch #9 {all -> 0x01a8, blocks: (B:81:0x0163, B:83:0x0169, B:84:0x016e, B:89:0x0178, B:91:0x017e, B:93:0x0184, B:95:0x0190, B:98:0x0198), top: B:111:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e A[Catch: all -> 0x01a8, TryCatch #9 {all -> 0x01a8, blocks: (B:81:0x0163, B:83:0x0169, B:84:0x016e, B:89:0x0178, B:91:0x017e, B:93:0x0184, B:95:0x0190, B:98:0x0198), top: B:111:0x0002 }] */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79073l1.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Number number = (Number) obj;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.A00 = null;
        WebImagePicker webImagePicker = this.A02;
        if (webImagePicker.A0C == this) {
            webImagePicker.A0C = null;
        }
        int intValue = number.intValue();
        if (intValue == 0) {
            Intent intent = new Intent();
            intent.putExtra("webImageSource", this.A01.A06);
            webImagePicker.setResult(-1, intent);
            webImagePicker.finish();
        } else if (A04()) {
        } else {
            StringBuilder sb = new StringBuilder("webimage/download/error ");
            sb.append(number);
            Log.e(sb.toString());
            if (intValue == 2) {
                boolean A01 = C000400f.A01();
                int i = R.string.insufficient_space_for_download_shared_storage;
                if (A01) {
                    i = R.string.insufficient_space_for_download;
                }
                webImagePicker.AUj(i);
                return;
            }
            ((ActivityC02290Ap) webImagePicker).A0A.A07(R.string.error_load_image, 1);
        }
    }
}
