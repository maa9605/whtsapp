package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0QE  reason: invalid class name */
/* loaded from: classes.dex */
public class C0QE extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05C A00;
    public final C06I A01;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "thumbnail_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 128;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT messages._id, message_thumbnails.thumbnail, message_thumbnails.key_remote_jid, message_thumbnails.key_from_me, message_thumbnails.key_id  FROM messages, message_thumbnails  WHERE messages._id > ? AND message_thumbnails.key_remote_jid = messages.key_remote_jid AND message_thumbnails.key_from_me = messages.key_from_me AND message_thumbnails.key_id = messages.key_id ORDER BY messages._id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_thumbnail_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_thumbnail_index";
    }

    public C0QE(C06I c06i, C05C c05c, C05670Pr c05670Pr) {
        super("message_thumbnail", 2, c05670Pr);
        this.A01 = c06i;
        this.A00 = c05c;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0028 A[SYNTHETIC] */
    @Override // X.AbstractC05100Nh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A0T(android.database.Cursor r10) {
        /*
            r9 = this;
            java.lang.String r0 = "_id"
            int r5 = r10.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "thumbnail"
            int r4 = r10.getColumnIndexOrThrow(r0)
            r8 = 0
            r1 = -1
        Lf:
            boolean r0 = r10.moveToNext()
            if (r0 == 0) goto L69
            boolean r0 = r10.isNull(r5)
            if (r0 == 0) goto L52
            java.lang.String r0 = "DatabaseUtils/safeGetLong/the value in the cursor is null"
            com.whatsapp.util.Log.e(r0)
        L20:
            r1 = -1
        L22:
            r6 = 1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L40
            byte[] r6 = r10.getBlob(r4)
            if (r6 == 0) goto L3d
            int r0 = r6.length
            if (r0 <= 0) goto L3d
            X.06I r3 = r9.A01
            r3.A04(r1, r6)
            X.094 r0 = X.C06I.A01(r10)
            r3.A05(r0)
        L3d:
            int r8 = r8 + 1
            goto Lf
        L40:
            java.lang.String r3 = "ThumbnailMessageStore/processBatch/invalid row id, id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
            goto Lf
        L52:
            long r1 = r10.getLong(r5)     // Catch: java.lang.IllegalStateException -> L57
            goto L22
        L57:
            r1 = move-exception
            java.lang.String r0 = "DatabaseUtils/safeGetLong/failed once"
            com.whatsapp.util.Log.e(r0, r1)
            long r1 = r10.getLong(r5)     // Catch: java.lang.IllegalStateException -> L62
            goto L22
        L62:
            r1 = move-exception
            java.lang.String r0 = "DatabaseUtils/safeGetLong/failed twice, returning default value"
            com.whatsapp.util.Log.e(r0, r1)
            goto L20
        L69:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QE.A0T(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A01.A0B();
    }

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        int i;
        do {
            C0CD A04 = this.A05.A04();
            try {
                C0CE c0ce = A04.A02;
                Cursor A07 = c0ce.A07("SELECT * FROM message_thumbnail ORDER BY message_row_id DESC LIMIT ?", new String[]{String.valueOf(128)});
                i = 0;
                while (A07.moveToNext()) {
                    byte[] blob = A07.getBlob(A07.getColumnIndexOrThrow("thumbnail"));
                    if (blob == null) {
                        Log.e("ThumbnailMessageStore/ThumbnailMessageDatabaseMigration/resetMigration/error thumbnail shouldn't be empty in new table");
                    } else {
                        long j = A07.getLong(A07.getColumnIndexOrThrow("message_row_id"));
                        Cursor A072 = c0ce.A07("SELECT key_remote_jid, key_from_me, key_id FROM messages WHERE _id = ?", new String[]{String.valueOf(j)});
                        try {
                            if (A072.moveToNext()) {
                                this.A01.A06(C06I.A01(A072), blob);
                            } else {
                                Log.e("ThumbnailMessageStore/ThumbnailMessageDatabaseMigration/resetMigration/error cannot find message key in original store.");
                            }
                            this.A01.A03(j);
                            i++;
                            A072.close();
                        } finally {
                        }
                    }
                }
                A07.close();
                A04.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A04.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } while (i != 0);
        C05C c05c = this.A00;
        c05c.A03("thumbnail_ready");
        c05c.A03("migration_message_thumbnail_index");
        c05c.A03("migration_message_thumbnail_retry");
    }
}
