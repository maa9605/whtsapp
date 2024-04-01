package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;

/* renamed from: X.2vd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61122vd {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().toString());
        sb.append("/DCIM/Camera");
        String obj = sb.toString();
        A01 = obj;
        A00 = String.valueOf(obj.toLowerCase().hashCode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if ((r1 & 1) != 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.InterfaceC52142a8 A00(X.C001200o r13, X.AbstractC000600i r14, X.C01B r15, X.C2AQ r16, X.C02F r17, X.C02C r18, X.C61112vc r19) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61122vd.A00(X.00o, X.00i, X.01B, X.2AQ, X.02F, X.02C, X.2vc):X.2a8");
    }

    public static boolean A01(ContentResolver contentResolver) {
        Uri mediaScannerUri = MediaStore.getMediaScannerUri();
        boolean z = false;
        String[] strArr = {"volume"};
        Cursor cursor = null;
        if (contentResolver != null) {
            try {
                cursor = contentResolver.query(mediaScannerUri, strArr, null, null, null);
            } catch (UnsupportedOperationException unused) {
            }
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1) {
                        cursor.moveToFirst();
                        z = "external".equals(cursor.getString(0));
                    }
                    return z;
                } finally {
                }
            }
        }
        return false;
    }
}
