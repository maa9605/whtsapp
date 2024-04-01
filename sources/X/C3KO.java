package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.HashMap;

/* renamed from: X.3KO  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KO extends C3BL implements InterfaceC52142a8 {
    public static final String[] A00 = {"image/jpeg", "image/png"};
    public static final String[] A01 = {"_id", "_data", "datetaken", "mini_thumb_magic", "orientation", "title", "mime_type", "date_modified", "_size"};

    public C3KO(C001200o c001200o, C2AQ c2aq, C02C c02c, Uri uri, int i, String str) {
        super(c001200o, c2aq, c02c, uri, i, str);
    }

    @Override // X.InterfaceC52142a8
    public HashMap A8a() {
        String[] strArr;
        Uri build = this.A04.buildUpon().appendQueryParameter("distinct", "true").build();
        ContentResolver contentResolver = this.A03;
        String[] strArr2 = {"bucket_display_name", "bucket_id"};
        String str = this.A09;
        String str2 = str == null ? "(mime_type in (?, ?))" : "(mime_type in (?, ?)) AND bucket_id = ?";
        String[] strArr3 = A00;
        if (str != null) {
            int length = strArr3.length;
            strArr = new String[length + 1];
            System.arraycopy(strArr3, 0, strArr, 0, length);
            strArr[length] = str;
        } else {
            strArr = strArr3;
        }
        Cursor query = MediaStore.Images.Media.query(contentResolver, build, strArr2, str2, strArr, null);
        try {
            HashMap hashMap = new HashMap();
            if (query != null) {
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    hashMap.put(string2, string);
                }
            }
            if (query != null) {
                query.close();
            }
            return hashMap;
        } finally {
        }
    }
}
