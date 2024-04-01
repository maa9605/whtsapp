package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDiskIOException;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1sD */
/* loaded from: classes2.dex */
public class C40411sD {
    public static volatile C40411sD A0F;
    public final AbstractC000600i A00;
    public final C012005w A01;
    public final C01B A02;
    public final AnonymousClass034 A03;
    public final C001200o A04;
    public final C05Q A05;
    public final C05A A06;
    public final C0C9 A07;
    public final C06J A08;
    public final C0H1 A09;
    public final C05F A0A;
    public final C05N A0B;
    public final C05E A0C;
    public final C05O A0D;
    public final C02O A0E;

    public C40411sD(C05A c05a, C001200o c001200o, AbstractC000600i abstractC000600i, C012005w c012005w, C05O c05o, AnonymousClass034 anonymousClass034, C01B c01b, C0H1 c0h1, C0C9 c0c9, C05Q c05q, C05F c05f, C05E c05e, C06J c06j, C02O c02o, C05N c05n) {
        this.A06 = c05a;
        this.A04 = c001200o;
        this.A00 = abstractC000600i;
        this.A01 = c012005w;
        this.A0D = c05o;
        this.A03 = anonymousClass034;
        this.A02 = c01b;
        this.A09 = c0h1;
        this.A07 = c0c9;
        this.A05 = c05q;
        this.A0A = c05f;
        this.A0C = c05e;
        this.A08 = c06j;
        this.A0E = c02o;
        this.A0B = c05n;
    }

    public static C40411sD A00() {
        if (A0F == null) {
            synchronized (C40411sD.class) {
                if (A0F == null) {
                    C05A A00 = C05A.A00();
                    C001200o c001200o = C001200o.A01;
                    AbstractC000600i A002 = AbstractC000600i.A00();
                    C002801j.A00();
                    C012005w A003 = C012005w.A00();
                    C05O A004 = C05O.A00();
                    AnonymousClass034 A005 = AnonymousClass034.A00();
                    C01B A006 = C01B.A00();
                    C0H1 A007 = C0H1.A00();
                    C0C9 A008 = C0C9.A00();
                    C05Q A009 = C05Q.A00();
                    C05F c05f = C05F.A01;
                    C05E A0010 = C05E.A00();
                    C05P.A00();
                    A0F = new C40411sD(A00, c001200o, A002, A003, A004, A005, A006, A007, A008, A009, c05f, A0010, C06J.A01(), C02O.A00(), C05N.A00());
                }
            }
        }
        return A0F;
    }

    public int A01(AbstractC005302j abstractC005302j, C0HB c0hb, int i) {
        String str;
        C09H c09h;
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaMessagesCount:");
        sb.append(abstractC005302j);
        Log.i(sb.toString());
        C0HC c0hc = new C0HC();
        c0hc.A02 = "mediamsgstore/getMediaMessagesCount/";
        c0hc.A03 = true;
        c0hc.A03();
        int i2 = 0;
        String[] strArr = {String.valueOf(this.A06.A05(abstractC005302j))};
        if (this.A02.A0E(C01C.A22)) {
            str = C0HD.A0Z;
        } else {
            str = C0HD.A0a;
        }
        try {
            C0CD A03 = this.A0C.A03();
            Cursor A07 = A03.A02.A07(str, strArr);
            try {
                if (A07 == null) {
                    Log.e("mediamsgstore/getMediaMessagesCount/db/cursor is null");
                } else {
                    while (A07.moveToNext() && !c0hb.AUW()) {
                        AnonymousClass092 A032 = this.A05.A03(A07, abstractC005302j);
                        if ((A032 instanceof AnonymousClass097) && (c09h = ((AnonymousClass097) A032).A02) != null && (A032.A0n.A02 || c09h.A0P)) {
                            File file = c09h.A0F;
                            if (file != null && new File(Uri.fromFile(file).getPath()).exists() && (i2 = i2 + 1) > i) {
                                A07.close();
                                A03.close();
                                return i2;
                            }
                        }
                    }
                    A07.close();
                }
                A03.close();
                c0hc.A01();
                StringBuilder sb2 = new StringBuilder("mediamsgstore/getMediaMessagesCount/count:");
                sb2.append(i2);
                Log.i(sb2.toString());
                return i2;
            } finally {
            }
        } catch (SQLiteDiskIOException e) {
            this.A0A.A00(1);
            throw e;
        }
    }

    public Cursor A02(AbstractC005302j abstractC005302j, byte b) {
        C0CD A03 = this.A0C.A03();
        try {
            return A03.A02.A07(C0HD.A0X, new String[]{String.valueOf(this.A06.A05(abstractC005302j)), Byte.toString(b)});
        } catch (Throwable th) {
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

    public Cursor A03(AbstractC005302j abstractC005302j, long j) {
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaMessagesOrderedByIDAscCursor jid:");
        sb.append(abstractC005302j);
        sb.append(", fileSize:");
        sb.append(j);
        Log.i(sb.toString());
        C0CD A03 = this.A0C.A03();
        try {
            return A03.A02.A07(C0HD.A01(abstractC005302j != null, j, this.A08.A0E(), true), A0F(abstractC005302j, j));
        } catch (Throwable th) {
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

    public Cursor A04(AbstractC005302j abstractC005302j, long j) {
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaAndDocMessagesOrderedByIDDescCursor jid:");
        sb.append(abstractC005302j);
        sb.append(", fileSize:");
        sb.append(j);
        Log.i(sb.toString());
        C0CD A03 = this.A0C.A03();
        try {
            return A03.A02.A07(C0HD.A01(abstractC005302j != null, j, this.A08.A0E(), false), A0F(abstractC005302j, j));
        } catch (Throwable th) {
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

    public Cursor A05(AbstractC005302j abstractC005302j, long j) {
        String A0L;
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaMessagesOrderedBySizeCursor jid:");
        sb.append(abstractC005302j);
        sb.append(", fileSize:");
        sb.append(j);
        Log.i(sb.toString());
        C0CD A03 = this.A0C.A03();
        try {
            boolean A0E = this.A08.A0E();
            boolean z = abstractC005302j != null;
            if (A0E) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0HD.A0S);
                sb2.append(z ? " AND message.chat_row_id = ?" : "");
                A0L = C000200d.A0L(sb2, j > 0 ? " AND file_size > ?" : "", " ORDER BY file_size DESC");
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C0HD.A0T);
                sb3.append(z ? " AND chat_row_id = ?" : "");
                A0L = C000200d.A0L(sb3, j > 0 ? " AND media_size > ?" : "", " ORDER BY media_size DESC");
            }
            return A03.A02.A07(A0L, A0F(abstractC005302j, j));
        } catch (Throwable th) {
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

    public Cursor A06(AbstractC005302j abstractC005302j, long j, int i) {
        C000200d.A0v("mediamsgstore/getMediaMessagesHeadCursor:", abstractC005302j);
        C0CD A03 = this.A0C.A03();
        try {
            StringBuilder sb = new StringBuilder(C0HD.A0b);
            C05P.A04(true, sb);
            if (i > 0) {
                sb.append(" LIMIT ");
                sb.append(i);
            }
            return A03.A02.A07(sb.toString(), new String[]{String.valueOf(this.A06.A05(abstractC005302j)), String.valueOf(j)});
        } catch (Throwable th) {
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

    public Cursor A07(AbstractC005302j abstractC005302j, long j, int i) {
        C000200d.A0v("mediamsgstore/getMediaMessagesTailCursor:", abstractC005302j);
        C0CD A03 = this.A0C.A03();
        try {
            StringBuilder sb = new StringBuilder(C0HD.A0b);
            C05P.A04(false, sb);
            if (i > 0) {
                sb.append(" LIMIT ");
                sb.append(i);
            }
            return A03.A02.A07(sb.toString(), new String[]{String.valueOf(this.A06.A05(abstractC005302j)), String.valueOf(j)});
        } catch (Throwable th) {
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

    public Cursor A08(AbstractC005302j abstractC005302j, Byte[] bArr) {
        C0CD A03 = this.A0C.A03();
        try {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (Byte b : bArr) {
                StringBuilder sb = new StringBuilder("'");
                sb.append(b);
                sb.append("'");
                arrayList.add(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("SELECT ");
            C000200d.A1U(sb2, C0HD.A10, " FROM ", "available_message_view", " WHERE message_type IN (");
            sb2.append(TextUtils.join(",", arrayList));
            sb2.append(")");
            sb2.append(" AND ");
            sb2.append("chat_row_id  = ?");
            sb2.append(" ORDER BY _id DESC");
            return A03.A02.A07(sb2.toString(), new String[]{String.valueOf(this.A06.A05(abstractC005302j))});
        } catch (Throwable th) {
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

    public C42481vo A09(String str, byte b, boolean z) {
        C06J c06j;
        boolean A0E;
        String str2;
        String[] strArr;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        C09H A03;
        C000700j.A00();
        C0CD A032 = this.A0C.A03();
        try {
            c06j = this.A08;
            A0E = c06j.A0E();
            if (b == 0) {
                str2 = A0E ? C0HD.A0d : "SELECT thumb_image, media_enc_hash, timestamp,media_hash,media_wa_type,media_url FROM legacy_available_messages_view WHERE media_hash=? AND  media_enc_hash IS NOT NULL AND media_wa_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' )  ORDER BY _id DESC";
                strArr = new String[]{str};
            } else {
                str2 = A0E ? C0HD.A0c : "SELECT thumb_image, media_enc_hash, timestamp,media_hash,media_wa_type,media_url FROM messages AS messages INDEXED BY media_hash_index WHERE media_hash = ? AND media_enc_hash IS NOT NULL AND media_wa_type = ? AND _id NOT IN  (  SELECT _id FROM deleted_messages_ids_view ) ORDER BY _id DESC";
                strArr = new String[]{str, Byte.toString(b)};
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A032.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
        try {
            Cursor A07 = A032.A02.A07(str2, strArr);
            if (A07 != null) {
                try {
                    if (A0E) {
                        columnIndexOrThrow = A07.getColumnIndexOrThrow("enc_file_hash");
                        columnIndexOrThrow2 = A07.getColumnIndexOrThrow("timestamp");
                        columnIndexOrThrow3 = A07.getColumnIndexOrThrow("file_hash");
                        columnIndexOrThrow4 = A07.getColumnIndexOrThrow("message_type");
                        columnIndexOrThrow5 = A07.getColumnIndexOrThrow("media_url");
                    } else {
                        columnIndexOrThrow = A07.getColumnIndexOrThrow("media_enc_hash");
                        columnIndexOrThrow2 = A07.getColumnIndexOrThrow("timestamp");
                        columnIndexOrThrow3 = A07.getColumnIndexOrThrow("media_hash");
                        columnIndexOrThrow4 = A07.getColumnIndexOrThrow("media_wa_type");
                        columnIndexOrThrow5 = A07.getColumnIndexOrThrow("media_url");
                    }
                    while (A07.moveToNext()) {
                        if (A0E) {
                            A03 = c06j.A03(A07);
                        } else {
                            byte[] blob = A07.getBlob(A07.getColumnIndexOrThrow("thumb_image"));
                            if (blob != null) {
                                A03 = C06J.A00(blob, str);
                            } else {
                                continue;
                            }
                        }
                        if (A03 != null) {
                            String string = A07.getString(columnIndexOrThrow);
                            long j = A07.getLong(columnIndexOrThrow2);
                            A07.getString(columnIndexOrThrow3);
                            byte b2 = (byte) A07.getLong(columnIndexOrThrow4);
                            String string2 = A07.getString(columnIndexOrThrow5);
                            File file = A03.A0F;
                            if (file != null) {
                                file.getAbsolutePath();
                                A03.A0F.exists();
                                byte[] bArr = A03.A0U;
                                if (bArr != null && bArr.length == 32) {
                                    if (A03.A0P) {
                                        if (!A03.A0F.isAbsolute()) {
                                            A03.A0F = this.A03.A06(A03.A0F.getPath());
                                        }
                                        if (A03.A0F.exists()) {
                                            C42481vo c42481vo = new C42481vo(A03, string, j, b2, string2);
                                            A07.close();
                                            A032.close();
                                            return c42481vo;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                C42481vo c42481vo2 = new C42481vo(A03, string, j, b2, string2);
                                A07.close();
                                A032.close();
                                return c42481vo2;
                            }
                        } else {
                            continue;
                        }
                    }
                    A07.close();
                } finally {
                }
            }
            A032.close();
            return null;
        } catch (SQLiteDiskIOException e) {
            this.A0A.A00(1);
            throw e;
        }
    }

    public AnonymousClass097 A0A(String str) {
        if (str == null) {
            return null;
        }
        C0CD A03 = this.A0C.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video FROM message_media WHERE original_file_hash=?", new String[]{str});
            if (A07 != null && A07.moveToNext()) {
                AnonymousClass092 A01 = this.A05.A01(A07.getLong(A07.getColumnIndexOrThrow("message_row_id")));
                if (A01 instanceof AnonymousClass097) {
                    AnonymousClass097 anonymousClass097 = (AnonymousClass097) A01;
                    A07.close();
                    A03.close();
                    return anonymousClass097;
                }
            }
            if (A07 != null) {
                A07.close();
            }
            A03.close();
            return null;
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

    public ArrayList A0B(AbstractC005302j abstractC005302j, int i, C0HB c0hb, int i2) {
        String str;
        AnonymousClass097 anonymousClass097;
        C09H c09h;
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaMessages:");
        sb.append(abstractC005302j);
        sb.append(" limit:");
        sb.append(i);
        Log.i(sb.toString());
        C0HC c0hc = new C0HC();
        c0hc.A02 = "mediamsgstore/getMediaMessages/";
        c0hc.A03 = true;
        c0hc.A03();
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(this.A06.A05(abstractC005302j));
        if (i2 == 2) {
            str = C0HD.A0Y;
        } else if (i2 == 3) {
            str = C0HD.A0Z;
        } else {
            str = C0HD.A0a;
        }
        try {
            C0CD A03 = this.A0C.A03();
            Cursor A07 = A03.A02.A07(str, new String[]{valueOf});
            if (A07 == null) {
                Log.e("mediamsgstore/getMediaMessages/db/cursor is null");
            } else {
                while (A07.moveToNext() && (c0hb == null || !c0hb.AUW())) {
                    AnonymousClass092 A032 = this.A05.A03(A07, abstractC005302j);
                    if ((A032 instanceof AnonymousClass097) && (c09h = (anonymousClass097 = (AnonymousClass097) A032).A02) != null && (anonymousClass097.A0n.A02 || c09h.A0P)) {
                        File file = c09h.A0F;
                        if (file != null && new File(Uri.fromFile(file).getPath()).exists()) {
                            arrayList.add(anonymousClass097);
                            if (arrayList.size() >= i) {
                                break;
                            }
                        }
                    }
                }
            }
            if (A07 != null) {
                A07.close();
            }
            A03.close();
            c0hc.A01();
            C000200d.A1W(arrayList, new StringBuilder("mediamsgstore/getMediaMessages/size:"));
            return arrayList;
        } catch (SQLiteDiskIOException e) {
            this.A0A.A00(1);
            throw e;
        }
    }

    public Collection A0C(File file, String str, C0HE c0he) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A0E(str, (byte) 0, c0he)).iterator();
        while (it.hasNext()) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) it.next();
            C09H c09h = anonymousClass097.A02;
            if (c09h != null && file.equals(c09h.A0F)) {
                arrayList.add(anonymousClass097);
            }
        }
        return arrayList;
    }

    public Collection A0D(String str, byte b) {
        File file;
        AbstractCollection abstractCollection = (AbstractCollection) A0E(str, b, null);
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) it.next();
            C09H c09h = anonymousClass097.A02;
            if (c09h != null && c09h.A0P && (file = c09h.A0F) != null && file.exists()) {
                arrayList.add(anonymousClass097);
            }
        }
        return arrayList;
    }

    public Collection A0E(String str, byte b, C0HE c0he) {
        String str2;
        String[] strArr;
        C000700j.A00();
        if (b == 0) {
            if (this.A08.A0E()) {
                str2 = C0HD.A0W;
            } else {
                str2 = C42491vp.A01;
            }
            strArr = new String[]{str};
        } else {
            if (this.A08.A0E()) {
                str2 = C0HD.A0V;
            } else {
                str2 = C42491vp.A00;
            }
            strArr = new String[]{str, Byte.toString(b)};
        }
        ArrayList arrayList = new ArrayList();
        C0CD A03 = this.A0C.A03();
        try {
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
        try {
            Cursor A08 = A03.A02.A08(str2, strArr, c0he);
            while (((CursorWrapper) A08).moveToNext()) {
                try {
                    if (c0he != null) {
                        c0he.A02();
                    }
                    AnonymousClass092 A02 = this.A05.A02(A08);
                    if (A02 instanceof AnonymousClass097) {
                        arrayList.add((AnonymousClass097) A02);
                    }
                } finally {
                }
            }
            ((CursorWrapper) A08).close();
            A03.close();
            return arrayList;
        } catch (SQLiteDiskIOException e) {
            this.A0A.A00(1);
            throw e;
        }
    }

    public final String[] A0F(AbstractC005302j abstractC005302j, long j) {
        ArrayList arrayList = new ArrayList();
        if (abstractC005302j != null) {
            arrayList.add(String.valueOf(this.A06.A05(abstractC005302j)));
        }
        if (j > 0) {
            arrayList.add(String.valueOf(j));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
