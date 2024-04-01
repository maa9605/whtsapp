package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.2AW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AW {
    public static volatile C2AW A02;
    public final C06F A00 = new C06F(30);
    public final C40451sH A01;

    public C2AW(C40451sH c40451sH) {
        this.A01 = c40451sH;
    }

    public static C2AW A00() {
        if (A02 == null) {
            synchronized (C2AW.class) {
                if (A02 == null) {
                    A02 = new C2AW(C40451sH.A00());
                }
            }
        }
        return A02;
    }

    public synchronized C2CG A01(String str) {
        C06F c06f = this.A00;
        C2CG c2cg = (C2CG) c06f.A04(str);
        if (c2cg != null) {
            return c2cg;
        }
        C0CD c0cd = new C0CD(null, this.A01, false);
        Cursor A07 = c0cd.A02.A07("SELECT media_id, file_hash, media_key, mime_type, upload_url, direct_path, enc_file_hash, file_size, width, height FROM web_upload_media_data_store WHERE media_id=?", new String[]{str});
        if (A07 == null || !A07.moveToLast()) {
            if (A07 != null) {
                A07.close();
            }
            c0cd.close();
            return null;
        }
        C2CG c2cg2 = new C2CG(A07.getString(0), A07.getString(1), A07.getBlob(2), A07.getString(3), A07.getString(4), A07.getString(5), A07.getString(6), A07.getInt(7), A07.getInt(8), A07.getInt(9));
        c06f.A08(str, c2cg2);
        A07.close();
        c0cd.close();
        return c2cg2;
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void A02(String str) {
        C0CD A01;
        C000700j.A00();
        this.A00.A05(str);
        try {
            A01 = this.A01.A01();
        } catch (SQLiteDatabaseCorruptException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("WebUploadMediaKeyStore/delete/");
            sb.append(str);
            Log.e(sb.toString(), e);
        }
        try {
            C03790Hb A00 = A01.A00();
            A01.A02.A01("web_upload_media_data_store", "media_id =?", new String[]{str});
            A00.A00();
            A00.close();
            A01.close();
        } finally {
        }
    }
}
