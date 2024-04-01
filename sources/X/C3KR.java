package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.HashMap;

/* renamed from: X.3KR  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KR extends C3BL {
    public static final String[] A00 = {"_id", "_data", "datetaken", "title", "mini_thumb_magic", "mime_type", "date_modified", "_size"};

    public C3KR(C001200o c001200o, C2AQ c2aq, C02C c02c, Uri uri, int i, String str) {
        super(c001200o, c2aq, c02c, uri, i, str);
    }

    @Override // X.InterfaceC52142a8
    public HashMap A8a() {
        Uri build = this.A04.buildUpon().appendQueryParameter("distinct", "true").build();
        ContentResolver contentResolver = this.A03;
        String[] strArr = {"bucket_display_name", "bucket_id"};
        String str = this.A09;
        Cursor query = MediaStore.Images.Media.query(contentResolver, build, strArr, str != null ? C000200d.A0L(C000200d.A0P("bucket_id = '"), str, "'") : null, null, A02());
        try {
            HashMap hashMap = new HashMap();
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(1), query.getString(0));
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
