package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.06I */
/* loaded from: classes.dex */
public class C06I {
    public static volatile C06I A04;
    public final C05A A00;
    public final C06J A01;
    public final C05E A02;
    public final C05C A03;

    public C06I(C05A c05a, C05C c05c, C05E c05e, C06J c06j) {
        this.A00 = c05a;
        this.A03 = c05c;
        this.A02 = c05e;
        this.A01 = c06j;
    }

    public static C06I A00() {
        if (A04 == null) {
            synchronized (C06I.class) {
                if (A04 == null) {
                    C05A A00 = C05A.A00();
                    C05C A002 = C05C.A00();
                    C05L.A00();
                    A04 = new C06I(A00, A002, C05E.A00(), C06J.A01());
                }
            }
        }
        return A04;
    }

    public static AnonymousClass094 A01(Cursor cursor) {
        return new AnonymousClass094(AbstractC005302j.A02(cursor.getString(cursor.getColumnIndexOrThrow("key_remote_jid"))), cursor.getInt(cursor.getColumnIndexOrThrow("key_from_me")) == 1, cursor.getString(cursor.getColumnIndexOrThrow("key_id")));
    }

    public static final void A02(AnonymousClass092 anonymousClass092) {
        boolean z = anonymousClass092.A0p > 0;
        StringBuilder A0P = C000200d.A0P("ThumbnailMessageStore/isThumbnailV2Ready/message must have row_id set; key=");
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        C000200d.A1L(A0P, anonymousClass094, z);
        C000200d.A1L(C000200d.A0P("ThumbnailMessageStore/isThumbnailV2Ready/message in main storage; key="), anonymousClass094, anonymousClass092.A09 == 1);
    }

    public final void A03(long j) {
        C0CD A042 = this.A02.A04();
        try {
            A042.A02.A01("message_thumbnail", "message_row_id = ?", new String[]{String.valueOf(j)});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A042.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void A04(long j, byte[] bArr) {
        C0CD A042 = this.A02.A04();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("thumbnail", bArr);
            C000700j.A0A(A042.A02.A06("message_thumbnail", contentValues, 5) == j, "ThumbnailMessageStore/insertOrUpdateThumbnailV2/inserted row should has same row_id");
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A042.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void A05(AnonymousClass094 anonymousClass094) {
        try {
            C0CD A042 = this.A02.A04();
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                String rawString = abstractC005302j.getRawString();
                C0CE c0ce = A042.A02;
                String[] strArr = new String[3];
                strArr[0] = rawString;
                strArr[1] = String.valueOf(anonymousClass094.A02 ? 1 : 0);
                String str = anonymousClass094.A01;
                strArr[2] = str;
                int A01 = c0ce.A01("message_thumbnails", "key_remote_jid = ? AND key_from_me = ? AND key_id = ?", strArr);
                StringBuilder sb = new StringBuilder();
                sb.append("thumbnailmsgstore/deleteMessageThumbnail/");
                sb.append(str);
                sb.append("/");
                sb.append(A01);
                Log.i(sb.toString());
                A042.close();
                return;
            }
            throw null;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("thumbnailmsgstore/deleteMessageThumbnail", e);
        }
    }

    public final void A06(AnonymousClass094 anonymousClass094, byte[] bArr) {
        try {
            C0CD A042 = this.A02.A04();
            try {
                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                if (abstractC005302j != null) {
                    String rawString = abstractC005302j.getRawString();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("thumbnail", bArr);
                    contentValues.put("key_remote_jid", rawString);
                    contentValues.put("key_from_me", String.valueOf(anonymousClass094.A02 ? 1 : 0));
                    contentValues.put("key_id", anonymousClass094.A01);
                    contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                    A042.A02.A04("message_thumbnails", contentValues);
                    A042.close();
                    return;
                }
                throw null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A042.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("thumbnailmsgstore/insertOrUpdateMessageThumbnail", e);
        } catch (Error e2) {
            e = e2;
            Log.e(e);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            Log.e(e);
            throw e;
        }
    }

    public void A07(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C04040Ie) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            String str = anonymousClass097.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C06J c06j = this.A01;
            String[] strArr = {anonymousClass097.A06, String.valueOf(anonymousClass097.A0p)};
            String str2 = c06j.A0E() ? "SELECT COUNT(1) FROM message_media WHERE file_hash = ? AND message_row_id != ?" : "SELECT COUNT(1) FROM messages WHERE media_hash = ? AND _id != ?";
            C0CD A03 = c06j.A02.A03();
            try {
                Cursor A07 = A03.A02.A07(str2, strArr);
                if (A07.moveToNext()) {
                    boolean z = A07.getLong(0) == 0;
                    A07.close();
                    A03.close();
                    if (!z) {
                        return;
                    }
                } else {
                    A07.close();
                    A03.close();
                }
                C0CD A042 = this.A02.A04();
                try {
                    A042.A02.A01("media_hash_thumbnail", "media_hash = ?", new String[]{str});
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        try {
                            A042.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        A03.close();
                    } catch (Throwable unused2) {
                    }
                    throw th3;
                }
            }
        } else if (A0C(anonymousClass092.A0p)) {
            A02(anonymousClass092);
            A03(anonymousClass092.A0p);
        } else {
            A05(anonymousClass092.A0n);
        }
    }

    public void A08(Collection collection) {
        C0CD A042 = this.A02.A04();
        try {
            C03790Hb A00 = A042.A00();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C06J c06j = this.A01;
                String[] strArr = {str};
                String str2 = c06j.A0E() ? "SELECT COUNT(1) FROM message_media WHERE file_hash=?" : "SELECT COUNT(1) FROM messages WHERE media_hash=?";
                C0CD A03 = c06j.A02.A03();
                Cursor A07 = A03.A02.A07(str2, strArr);
                if (A07.moveToNext()) {
                    boolean z = A07.getLong(0) == 0;
                    A07.close();
                    A03.close();
                    if (!z) {
                        A042.A02.A01("media_hash_thumbnail", "media_hash = ?", new String[]{str});
                    }
                } else {
                    A07.close();
                    A03.close();
                }
            }
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A042.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A09(byte[] bArr, long j, AnonymousClass094 anonymousClass094) {
        if (!A0C(j)) {
            A06(anonymousClass094, bArr);
            return;
        }
        boolean z = j > 0;
        StringBuilder sb = new StringBuilder("ThumbnailMessageStore/insertOrUpdateMessageThumbnail/message must have row_id set; key=");
        sb.append(anonymousClass094);
        C000700j.A09(z, sb.toString());
        if (bArr != null) {
            A04(j, bArr);
        }
    }

    public void A0A(byte[] bArr, AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C04040Ie) {
            String str = ((AnonymousClass097) anonymousClass092).A06;
            if (TextUtils.isEmpty(str) || A0E(str) != null) {
                return;
            }
            C0CD A042 = this.A02.A04();
            try {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("media_hash", str);
                contentValues.put("thumbnail", bArr);
                A042.A02.A02("media_hash_thumbnail", contentValues);
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A042.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } else if (A0C(anonymousClass092.A0p)) {
            A02(anonymousClass092);
            if (bArr != null) {
                A04(anonymousClass092.A0p, bArr);
            }
        } else {
            A06(anonymousClass092.A0n, bArr);
        }
    }

    public boolean A0B() {
        String A02 = this.A03.A02("thumbnail_ready");
        return A02 != null && Integer.parseInt(A02) == 2;
    }

    public final boolean A0C(long j) {
        if (A0B()) {
            return true;
        }
        return j > 0 && this.A03.A01("migration_message_thumbnail_index", 0L) >= j;
    }

    public byte[] A0D(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 == null) {
            return null;
        }
        if (anonymousClass092 instanceof C04040Ie) {
            return A0E(((AnonymousClass097) anonymousClass092).A06);
        }
        if (A0C(anonymousClass092.A0p)) {
            A02(anonymousClass092);
            C000200d.A1L(C000200d.A0P("ThumbnailMessageStore/getThumbnailV2/message must have row_id set; key="), anonymousClass092.A0n, anonymousClass092.A0p > 0);
            try {
                Cursor A07 = this.A02.A03().A02.A07("SELECT thumbnail FROM message_thumbnail WHERE message_row_id = ?", new String[]{Long.toString(anonymousClass092.A0p)});
                r9 = A07.moveToNext() ? A07.getBlob(A07.getColumnIndexOrThrow("thumbnail")) : null;
                A07.close();
                return r9;
            } finally {
            }
        } else {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                String rawString = abstractC005302j.getRawString();
                C0CD A03 = this.A02.A03();
                try {
                    C0CE c0ce = A03.A02;
                    String[] strArr = new String[3];
                    strArr[0] = rawString;
                    strArr[1] = String.valueOf(anonymousClass094.A02 ? 1 : 0);
                    strArr[2] = anonymousClass094.A01;
                    Cursor A072 = c0ce.A07("SELECT thumbnail FROM message_thumbnails WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?", strArr);
                    if (A072 == null) {
                        Log.e("thumbnailmsgstore/getMessageThumbnail no cursor");
                    } else if (A072.moveToLast()) {
                        r9 = A072.getBlob(0);
                    }
                    if (A072 != null) {
                        A072.close();
                    }
                    A03.close();
                    return r9;
                } finally {
                    try {
                        throw th;
                    } finally {
                        try {
                            A03.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            throw null;
        }
    }

    public final byte[] A0E(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArr = {str};
        C0CD A03 = this.A02.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT thumbnail FROM media_hash_thumbnail WHERE media_hash = ?", strArr);
            if (!A07.moveToNext()) {
                A07.close();
                A03.close();
                return null;
            }
            byte[] blob = A07.getBlob(A07.getColumnIndexOrThrow("thumbnail"));
            A07.close();
            A03.close();
            return blob;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
