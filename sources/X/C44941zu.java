package X;

import android.database.Cursor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1zu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44941zu {
    public static volatile C44941zu A01;
    public final C44291yp A00;

    public C44941zu(C44291yp c44291yp) {
        this.A00 = c44291yp;
    }

    public int A00() {
        C0CD A012 = this.A00.A01();
        try {
            Cursor A07 = A012.A02.A07("SELECT MAX ( epoch ) FROM crypto_info", null);
            if (A07 != null) {
                if (A07.moveToFirst()) {
                    int i = (int) A07.getLong(0);
                    A07.close();
                    A012.close();
                    return i;
                }
                A07.close();
            }
            A012.close();
            return 0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A012.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public C44961zw A01() {
        C0CD A012 = this.A00.A01();
        try {
            Cursor A07 = A012.A02.A07("SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info ORDER BY epoch DESC, device_id ASC LIMIT 1", null);
            if (A07 != null) {
                if (A07.moveToFirst()) {
                    C44961zw A02 = A02(A07);
                    A07.close();
                    A012.close();
                    return A02;
                }
                A07.close();
            }
            A012.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A012.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final C44961zw A02(Cursor cursor) {
        try {
            C44971zx A00 = C44971zx.A00((AnonymousClass201) C0AZ.A03(AnonymousClass201.A05, cursor.getBlob(cursor.getColumnIndex("fingerprint"))));
            if (A00 != null) {
                return new C44961zw(new C44651zQ((int) cursor.getLong(cursor.getColumnIndex("device_id")), (int) cursor.getLong(cursor.getColumnIndex("epoch"))), new C44981zy(cursor.getBlob(cursor.getColumnIndex("key_data")), cursor.getLong(cursor.getColumnIndex("timestamp")), A00));
            }
            throw null;
        } catch (C0JX e) {
            throw new IllegalStateException("SyncdCryptoStore/createSyncdKey", e);
        }
    }

    public void A03(long j, Collection collection) {
        HashSet hashSet = new HashSet(collection);
        hashSet.remove(null);
        if (hashSet.isEmpty()) {
            return;
        }
        C0CD A02 = this.A00.A02();
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C44651zQ c44651zQ = (C44651zQ) it.next();
                A02.A02.A0D("UPDATE crypto_info SET stale_timestamp = ?  WHERE device_id = ?  AND epoch = ? ", new String[]{String.valueOf(j), String.valueOf(c44651zQ.A01()), String.valueOf(c44651zQ.A02())});
            }
            A02.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
