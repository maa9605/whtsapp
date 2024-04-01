package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.29U  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C29U {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public static final String[] A08 = {"raw_contact_id", "display_name", "data1", "data2", "data3", "sort_key", "account_type"};
    public static final String[] A07 = {"com.whatsapp", "com.whatsapp.w4b"};

    public C29U(long j, String str, String str2, int i, String str3, String str4, String str5) {
        if (str2 != null) {
            this.A01 = j;
            this.A03 = str;
            this.A05 = str2;
            this.A00 = i;
            this.A04 = str3;
            this.A06 = str4;
            this.A02 = str5;
            return;
        }
        throw new NullPointerException("number must not be null");
    }

    public static Cursor A00(C02E c02e, String str) {
        Log.i("phone/getcursor/query/start");
        ContentResolver A072 = c02e.A07();
        if (A072 == null) {
            Log.w("phone/getcursor/cr null");
            return null;
        }
        Cursor query = A072.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, A08, A01(), null, null);
        Log.i("phone/getcursor/query/end");
        if (query != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            sb.append(query.getCount());
            Log.i(sb.toString());
        }
        return query;
    }

    public static String A01() {
        StringBuilder sb = new StringBuilder("(");
        sb.append("account_type");
        sb.append(" IS NULL OR (");
        sb.append("account_type");
        sb.append(" NOT IN (");
        int i = 0;
        while (true) {
            String[] strArr = A07;
            int length = strArr.length - 1;
            if (i < length) {
                DatabaseUtils.appendEscapedSQLString(sb, strArr[i]);
                sb.append(",");
                i++;
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, strArr[length]);
                sb.append(")))");
                Log.i(sb.toString());
                return sb.toString();
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (C29U.class != obj.getClass()) {
            return false;
        }
        C29U c29u = (C29U) obj;
        return this.A01 == c29u.A01 && TextUtils.equals(this.A03, c29u.A03) && TextUtils.equals(this.A05, c29u.A05) && this.A00 == c29u.A00 && TextUtils.equals(this.A04, c29u.A04) && TextUtils.equals(this.A06, c29u.A06);
    }

    public int hashCode() {
        long j = this.A01;
        int i = (((((((int) (j >>> 32)) + 0) * 31) + ((int) j)) * 31) + this.A00) * 31;
        String str = this.A05;
        return i + (str != null ? str.hashCode() : 0);
    }
}
