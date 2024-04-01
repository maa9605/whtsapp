package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.3KK  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KK extends C3BL implements InterfaceC52142a8 {
    public static final String[] A00 = {"_id", "_data", "mime_type", "media_type", "date_modified", "datetaken", "orientation", "_size"};

    public C3KK(C001200o c001200o, C2AQ c2aq, C02C c02c, Uri uri, int i, String str) {
        super(c001200o, c2aq, c02c, uri, i, str);
    }

    @Override // X.InterfaceC52142a8
    public HashMap A8a() {
        HashMap hashMap = new HashMap();
        Uri build = this.A04.buildUpon().appendQueryParameter("distinct", "true").build();
        ContentResolver contentResolver = this.A03;
        String[] strArr = {"bucket_display_name", "bucket_id"};
        String str = this.A09;
        Cursor query = contentResolver.query(build, strArr, str == null ? "media_type in (1, 3)" : "media_type in (1, 3) and bucket_id=?", str == null ? null : new String[]{str}, null);
        if (query == null) {
            return hashMap;
        }
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (string == null) {
                    string = "";
                }
                hashMap.put(string2, string);
            } finally {
            }
        }
        query.close();
        return hashMap;
    }
}
