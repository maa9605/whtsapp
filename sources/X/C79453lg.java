package X;

import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.3lg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79453lg extends C0HS {
    public final C012005w A00;
    public final C018508q A01;
    public final C02L A02;
    public final String A03;
    public final WeakReference A04;

    public C79453lg(C018508q c018508q, C02L c02l, C012005w c012005w, ActivityC02290Ap activityC02290Ap, String str) {
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A00 = c012005w;
        this.A04 = new WeakReference(activityC02290Ap);
        this.A03 = str;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        if (bitmap != null) {
            File A01 = AbstractC012105x.A01(this.A00.A0B(), "shared_qr_code.png");
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(A01);
            } catch (FileNotFoundException e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                AnonymousClass024.A0R(fileOutputStream2);
                bitmap.recycle();
                throw th;
            }
            try {
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, fileOutputStream);
                    AnonymousClass024.A0R(fileOutputStream);
                    bitmap.recycle();
                    return A01;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    AnonymousClass024.A0R(fileOutputStream2);
                    bitmap.recycle();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                e = e2;
                Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
                AnonymousClass024.A0R(fileOutputStream);
                bitmap.recycle();
                return null;
            }
        }
        throw null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        File file = (File) obj;
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A04.get();
        if (activityC02290Ap != null) {
            activityC02290Ap.ARS();
            if (file == null) {
                this.A01.A07(R.string.share_failed, 0);
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            Object[] objArr = new Object[2];
            C02L c02l = this.A02;
            objArr[0] = c02l.A02();
            c02l.A05();
            C0K1 c0k1 = c02l.A01;
            if (c0k1 != null) {
                objArr[1] = C04630Le.A00(c0k1);
                intent.putExtra("android.intent.extra.SUBJECT", activityC02290Ap.getString(R.string.contact_qr_email_subject, objArr));
                intent.putExtra("android.intent.extra.TEXT", this.A03);
                intent.putExtra("android.intent.extra.STREAM", AnonymousClass024.A04(activityC02290Ap.getApplicationContext(), file));
                intent.setType("image/png");
                intent.addFlags(524288);
                activityC02290Ap.A14(Intent.createChooser(intent, null));
                return;
            }
            throw null;
        }
    }
}
