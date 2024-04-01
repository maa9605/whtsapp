package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.04s */
/* loaded from: classes.dex */
public class C04s {
    public final C04j A00;
    public final AnonymousClass012 A01;

    public C04s(AnonymousClass012 anonymousClass012, C04j c04j) {
        this.A01 = anonymousClass012;
        this.A00 = c04j;
    }

    public void A00(int i, byte[] bArr) {
        C0CD A02 = this.A00.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("prekey_id", Integer.valueOf(i));
            contentValues.put("timestamp", Long.valueOf(this.A01.A05() / 1000));
            contentValues.put("record", bArr);
            A02.A02.A05("signed_prekeys", contentValues);
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl stored signed pre key with id ");
            sb.append(i);
            Log.i(sb.toString());
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public byte[] A01(int i) {
        C0CD A01 = this.A00.A01();
        try {
            Cursor A09 = A01.A02.A09("signed_prekeys", new String[]{"record"}, "prekey_id = ?", new String[]{String.valueOf(i)}, null, "SignalSignedPreKeyStore/getSignedPreKey");
            if (!A09.moveToNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append("no signed prekey available with id ");
                sb.append(i);
                Log.e(sb.toString());
                A09.close();
                A01.close();
                return null;
            }
            byte[] blob = A09.getBlob(0);
            A09.close();
            A01.close();
            return blob;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
