package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.04o */
/* loaded from: classes.dex */
public class C04o {
    public final C01B A00;
    public final C04j A01;
    public final AnonymousClass012 A02;

    public C04o(AnonymousClass012 anonymousClass012, C04j c04j, C01B c01b) {
        this.A02 = anonymousClass012;
        this.A01 = c04j;
        this.A00 = c01b;
    }

    public int A00() {
        C0CD A01 = this.A01.A01();
        try {
            Cursor A07 = A01.A02.A07("SELECT COUNT(*) FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0", null);
            if (A07.moveToNext()) {
                int i = A07.getInt(0);
                A07.close();
                A01.close();
                return i;
            }
            throw new SQLiteException("unable to fetch count from table");
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

    public List A01() {
        ArrayList arrayList = new ArrayList();
        C0CD A01 = this.A01.A01();
        try {
            Cursor A0A = A01.A02.A0A("prekeys", new String[]{"prekey_id", "record"}, "sent_to_server = 0 AND direct_distribution = 0", null, null, String.valueOf(this.A00.A07(C01C.A2q)));
            while (A0A.moveToNext()) {
                arrayList.add(new C05000Mw(A0A.getInt(0), A0A.getBlob(1)));
            }
            A0A.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A02(int i) {
        C0CD A02 = this.A01.A02();
        try {
            C0CE c0ce = A02.A02;
            String[] strArr = {String.valueOf(i)};
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl deleted ");
            sb.append(c0ce.A01("prekeys", "prekey_id = ?", strArr));
            sb.append(" pre keys with id ");
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

    public void A03(int[] iArr) {
        C04j c04j = this.A01;
        C0CD A02 = c04j.A02();
        try {
            C03790Hb A00 = A02.A00();
            long A05 = this.A02.A05() / 1000;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i < length) {
                    int min = Math.min(i + 200, length);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sent_to_server", Boolean.TRUE);
                    contentValues.put("upload_timestamp", Long.valueOf(A05));
                    StringBuilder sb = new StringBuilder("?");
                    String[] strArr = new String[min - i];
                    for (int i2 = i; i2 < min; i2++) {
                        strArr[i2 - i] = String.valueOf(iArr[i2]);
                        if (i2 != i) {
                            sb.append(",?");
                        }
                    }
                    C0CD A022 = c04j.A02();
                    C0CE c0ce = A022.A02;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("prekey_id IN (");
                    sb2.append((Object) sb);
                    sb2.append(")");
                    int A002 = c0ce.A00("prekeys", contentValues, sb2.toString(), strArr);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("updated ");
                    sb3.append(A002);
                    sb3.append(" prekeys; values=");
                    sb3.append(contentValues);
                    Log.i(sb3.toString());
                    A022.close();
                    i = min;
                } else {
                    C0CD A023 = c04j.A02();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("upload_timestamp", Long.valueOf(A05));
                    A023.A02.A02("prekey_uploads", contentValues2);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("axolotl addPreKeyUpload ts:");
                    sb4.append(A05);
                    Log.i(sb4.toString());
                    A023.close();
                    A00.A00();
                    A00.close();
                    return;
                }
            }
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

    public byte[] A04(int i) {
        C0CD A01 = this.A01.A01();
        try {
            Cursor A09 = A01.A02.A09("prekeys", new String[]{"record"}, "prekey_id = ?", new String[]{String.valueOf(i)}, null, "SignalPreKeyStore/getPreKey");
            if (!A09.moveToNext()) {
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
