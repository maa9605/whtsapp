package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.MediaData;
import com.whatsapp.SerializablePoint;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;

/* renamed from: X.06J */
/* loaded from: classes.dex */
public class C06J {
    public static volatile C06J A05;
    public final AnonymousClass034 A00;
    public final C05A A01;
    public final C05E A02;
    public final C05C A03;
    public final C05L A04;

    public C06J(C05A c05a, AnonymousClass034 anonymousClass034, C05C c05c, C05L c05l, C05E c05e) {
        this.A01 = c05a;
        this.A00 = anonymousClass034;
        this.A03 = c05c;
        this.A04 = c05l;
        this.A02 = c05e;
    }

    public static C09H A00(byte[] bArr, String str) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            try {
                Object readObject = objectInputStream.readObject();
                if (!(readObject instanceof MediaData)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected type of media data (");
                    sb.append(readObject);
                    sb.append(" )");
                    Log.e(sb.toString());
                    objectInputStream.close();
                    return null;
                }
                C09H A00 = C09H.A00((MediaData) readObject);
                objectInputStream.close();
                return A00;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        objectInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            StringBuilder sb2 = new StringBuilder("failure fetching media data by hash; hash=");
            sb2.append(str);
            Log.w(sb2.toString(), e);
            return null;
        }
    }

    public static C06J A01() {
        if (A05 == null) {
            synchronized (C06J.class) {
                if (A05 == null) {
                    C05A A00 = C05A.A00();
                    AnonymousClass034 A002 = AnonymousClass034.A00();
                    C05C A003 = C05C.A00();
                    C05L A004 = C05L.A00();
                    C05E A005 = C05E.A00();
                    C05P.A00();
                    A05 = new C06J(A00, A002, A003, A004, A005);
                }
            }
        }
        return A05;
    }

    public static final void A02(C0CF c0cf, long j, long j2, String str, String str2, String str3, long j3, String str4, String str5, Integer num, int i, String str6, boolean z, String str7) {
        c0cf.A04(1, j);
        c0cf.A04(2, j2);
        if (str == null) {
            c0cf.A02(4);
        } else {
            c0cf.A05(4, str);
        }
        if (str2 == null) {
            c0cf.A02(25);
        } else {
            c0cf.A05(25, str2);
        }
        if (str3 == null) {
            c0cf.A02(26);
        } else {
            c0cf.A05(26, str3);
        }
        c0cf.A04(27, j3);
        if (str4 == null) {
            c0cf.A02(28);
        } else {
            c0cf.A05(28, str4);
        }
        if (str5 == null) {
            c0cf.A02(29);
        } else {
            c0cf.A05(29, str5);
        }
        if (num != null) {
            c0cf.A04(31, num.intValue());
            c0cf.A04(30, 0L);
        } else {
            c0cf.A04(31, 0L);
            c0cf.A04(30, i);
        }
        if (str6 == null) {
            c0cf.A02(32);
        } else {
            c0cf.A05(32, str6);
        }
        c0cf.A04(35, z ? 1L : 0L);
        if (str7 == null) {
            c0cf.A02(36);
        } else {
            c0cf.A05(36, str7);
        }
    }

    public C09H A03(Cursor cursor) {
        C09H c09h = new C09H();
        c09h.A0L = C05T.A04(cursor, cursor.getColumnIndexOrThrow("autotransfer_retry_enabled"));
        c09h.A0I = cursor.getString(cursor.getColumnIndexOrThrow("media_job_uuid"));
        c09h.A0P = C05T.A04(cursor, cursor.getColumnIndexOrThrow("transferred"));
        c09h.A0O = C05T.A04(cursor, cursor.getColumnIndexOrThrow("transcoded"));
        c09h.A0A = cursor.getLong(cursor.getColumnIndexOrThrow("file_size"));
        c09h.A07 = cursor.getInt(cursor.getColumnIndexOrThrow("suspicious_content"));
        c09h.A0D = cursor.getLong(cursor.getColumnIndexOrThrow("trim_from"));
        c09h.A0E = cursor.getLong(cursor.getColumnIndexOrThrow("trim_to"));
        c09h.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("face_x"));
        c09h.A03 = cursor.getInt(cursor.getColumnIndexOrThrow("face_y"));
        c09h.A0U = cursor.getBlob(cursor.getColumnIndexOrThrow("media_key"));
        c09h.A0B = cursor.getLong(cursor.getColumnIndexOrThrow("media_key_timestamp"));
        c09h.A08 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        c09h.A06 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        c09h.A0M = C05T.A04(cursor, cursor.getColumnIndexOrThrow("has_streaming_sidecar"));
        c09h.A05 = cursor.getInt(cursor.getColumnIndexOrThrow("gif_attribution"));
        c09h.A00 = cursor.getFloat(cursor.getColumnIndexOrThrow("thumbnail_height_width_ratio"));
        c09h.A0G = cursor.getString(cursor.getColumnIndexOrThrow("direct_path"));
        c09h.A0R = cursor.getBlob(cursor.getColumnIndexOrThrow("first_scan_sidecar"));
        c09h.A04 = cursor.getInt(cursor.getColumnIndexOrThrow("first_scan_length"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("file_path"));
        c09h.A0K = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_hash"));
        c09h.A0J = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_enc_hash"));
        c09h.A0N = C05T.A04(cursor, cursor.getColumnIndexOrThrow("mute_video"));
        c09h.A0F = A06(string);
        return c09h;
    }

    public C09H A04(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
                Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                if (readObject instanceof C09H) {
                    C09H c09h = (C09H) readObject;
                    if (c09h != null) {
                        File file = c09h.A0F;
                        if (file != null) {
                            c09h.A0F = A06(file.getPath());
                        }
                        return c09h;
                    }
                    throw null;
                } else if (readObject instanceof MediaData) {
                    MediaData mediaData = (MediaData) readObject;
                    if (mediaData != null) {
                        C09H A00 = C09H.A00(mediaData);
                        File file2 = A00.A0F;
                        if (file2 != null) {
                            A00.A0F = A06(file2.getPath());
                        }
                        return A00;
                    }
                    throw null;
                } else {
                    return null;
                }
            } finally {
            }
        } catch (IOException | ClassCastException | ClassNotFoundException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException e) {
            Log.e("CachedMessageStore/getMessageMediaData", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x001e, code lost:
        if (X.C003101m.A0U(r20) != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0172 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:129:0x00a5, B:131:0x00ab, B:132:0x00b1, B:134:0x00c3, B:136:0x00cb, B:138:0x00d5, B:140:0x00d9, B:142:0x00df, B:181:0x0184, B:180:0x0179, B:172:0x0128, B:173:0x0134, B:174:0x0140, B:175:0x0147, B:176:0x014e, B:177:0x015a, B:178:0x0166, B:179:0x0172, B:143:0x00e4, B:145:0x00f0, B:147:0x00f6, B:149:0x00fc), top: B:205:0x00a5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C27631Od A05(X.AbstractC005302j r20) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06J.A05(X.02j):X.1Od");
    }

    public final File A06(String str) {
        return this.A00.A05(str == null ? null : new File(str));
    }

    public final void A07(long j, C09H c09h) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        if (c09h == null || c09h.A0V == null) {
            return;
        }
        C0CD A04 = this.A02.A04();
        try {
            C03790Hb A00 = A04.A00();
            C05L c05l = this.A04;
            C0CF A01 = c05l.A01("INSERT INTO message_media_interactive_annotation(message_row_id, location_latitude, location_longitude, location_name, sort_order) VALUES (?, ?, ?, ?, ?)");
            C0CF A012 = c05l.A01("INSERT INTO message_media_interactive_annotation_vertex(message_media_interactive_annotation_row_id, x, y, sort_order) VALUES (?, ?, ?, ?)");
            int i = 0;
            for (InteractiveAnnotation interactiveAnnotation : c09h.A0V) {
                A01.A04(1, j);
                A01.A03(2, interactiveAnnotation.serializableLocation.latitude);
                A01.A03(3, interactiveAnnotation.serializableLocation.longitude);
                A01.A05(4, interactiveAnnotation.serializableLocation.name);
                A01.A04(5, i);
                long A013 = A01.A01();
                i++;
                SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
                if (serializablePointArr != null) {
                    int i2 = 0;
                    for (SerializablePoint serializablePoint : serializablePointArr) {
                        A012.A04(1, A013);
                        A012.A03(2, serializablePoint.x);
                        A012.A03(3, serializablePoint.y);
                        A012.A04(4, i2);
                        A012.A01();
                        i2++;
                    }
                }
            }
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void A08(long j, AnonymousClass097 anonymousClass097, C0CF c0cf) {
        int i;
        Integer num;
        if (anonymousClass097 instanceof C09E) {
            num = Integer.valueOf(((C09E) anonymousClass097).A00);
            i = 0;
        } else {
            i = anonymousClass097.A00;
            num = null;
        }
        C03900Hp A0E = anonymousClass097.A0E();
        byte[] A08 = A0E != null ? A0E.A08() : null;
        String str = anonymousClass097.A09;
        String str2 = anonymousClass097.A07;
        long j2 = anonymousClass097.A01;
        String A1B = anonymousClass097.A1B();
        String str3 = anonymousClass097.A06;
        String str4 = anonymousClass097.A05;
        c0cf.A04(1, j);
        if (str == null) {
            c0cf.A02(11);
        } else {
            c0cf.A05(11, str);
        }
        if (str2 == null) {
            c0cf.A02(12);
        } else {
            c0cf.A05(12, str2);
        }
        c0cf.A04(13, j2);
        if (A1B == null) {
            c0cf.A02(14);
        } else {
            c0cf.A05(14, A1B);
        }
        if (str3 == null) {
            c0cf.A02(15);
        } else {
            c0cf.A05(15, str3);
        }
        if (num != null) {
            c0cf.A04(17, num.intValue());
            c0cf.A04(16, 0L);
        } else {
            c0cf.A04(17, 0L);
            c0cf.A04(16, i);
        }
        if (str4 == null) {
            c0cf.A02(18);
        } else {
            c0cf.A05(18, str4);
        }
        if (A08 != null) {
            c0cf.A00.bindBlob(19, A08);
        } else {
            c0cf.A02(19);
        }
        C09H c09h = anonymousClass097.A02;
        if (c09h != null) {
            if (c09h != null) {
                String str5 = c09h.A0I;
                if (str5 == null) {
                    c0cf.A02(2);
                } else {
                    c0cf.A05(2, str5);
                }
                c0cf.A04(3, c09h.A0P ? 1L : 0L);
                c0cf.A04(5, c09h.A0A);
                byte[] bArr = c09h.A0U;
                if (bArr == null) {
                    c0cf.A02(6);
                } else {
                    c0cf.A00.bindBlob(6, bArr);
                }
                c0cf.A04(7, c09h.A0B);
                c0cf.A04(8, c09h.A08);
                c0cf.A04(9, c09h.A06);
                String str6 = c09h.A0G;
                if (str6 == null) {
                    c0cf.A02(10);
                } else {
                    c0cf.A05(10, str6);
                }
                File file = c09h.A0F;
                if (file != null) {
                    c0cf.A05(4, this.A00.A07(file));
                    return;
                } else {
                    c0cf.A02(4);
                    return;
                }
            }
            throw null;
        }
    }

    public void A09(C09H c09h, C0CF c0cf) {
        c0cf.A04(3, c09h.A0L ? 1L : 0L);
        String str = c09h.A0I;
        if (str == null) {
            c0cf.A02(5);
        } else {
            c0cf.A05(5, str);
        }
        c0cf.A04(6, c09h.A0P ? 1L : 0L);
        c0cf.A04(7, c09h.A0O ? 1L : 0L);
        c0cf.A04(9, c09h.A0A);
        c0cf.A04(10, c09h.A07);
        c0cf.A04(11, c09h.A0D);
        c0cf.A04(12, c09h.A0E);
        c0cf.A04(13, c09h.A02);
        c0cf.A04(14, c09h.A03);
        byte[] bArr = c09h.A0U;
        if (bArr == null) {
            c0cf.A02(15);
        } else {
            c0cf.A00.bindBlob(15, bArr);
        }
        c0cf.A04(16, c09h.A0B);
        c0cf.A04(17, c09h.A08);
        c0cf.A04(18, c09h.A06);
        c0cf.A04(19, c09h.A0M ? 1L : 0L);
        c0cf.A04(20, c09h.A05);
        c0cf.A03(21, c09h.A00);
        String str2 = c09h.A0G;
        if (str2 == null) {
            c0cf.A02(22);
        } else {
            c0cf.A05(22, str2);
        }
        byte[] bArr2 = c09h.A0R;
        if (bArr2 != null) {
            c0cf.A00.bindBlob(23, bArr2);
        } else {
            c0cf.A02(23);
        }
        c0cf.A04(24, c09h.A04);
        File file = c09h.A0F;
        if (file != null) {
            c0cf.A05(8, this.A00.A07(file));
        } else {
            c0cf.A02(8);
        }
        String str3 = c09h.A0K;
        if (str3 == null) {
            c0cf.A02(33);
        } else {
            c0cf.A05(33, str3);
        }
        String str4 = c09h.A0J;
        if (str4 == null) {
            c0cf.A02(34);
        } else {
            c0cf.A05(34, str4);
        }
        c0cf.A04(37, c09h.A0N ? 1L : 0L);
    }

    public void A0A(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof AnonymousClass097) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if (!C003101m.A0T(anonymousClass094.A00)) {
                C000200d.A1L(C000200d.A0P("MediaCoreMessageStore/insertOrUpdateMessage/message must have row_id set; key="), anonymousClass094, anonymousClass092.A0p > 0);
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
                if (!A0E()) {
                    if (anonymousClass092.A0p > 0) {
                        long j = anonymousClass092.A0p;
                        String A02 = this.A03.A02("migration_message_media_index");
                        if (j > (A02 != null ? Long.parseLong(A02) : 0L)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C000200d.A1L(C000200d.A0P("MediaCoreMessageStore/insertOrUpdateMessage/message in main storage; key="), anonymousClass094, anonymousClass092.A09 == 1);
                C0CD A04 = this.A02.A04();
                try {
                    C03790Hb A00 = A04.A00();
                    try {
                        C0CF A01 = this.A04.A01("INSERT INTO message_media(message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        A0D(anonymousClass097, A01);
                        C000700j.A0A(A01.A01() == anonymousClass092.A0p, "MediaCoreMessageStore/insertOrUpdateMessage/inserted row should have same row_id");
                        A07(anonymousClass097.A0p, anonymousClass097.A02);
                    } catch (SQLiteConstraintException e) {
                        C0CF A012 = this.A04.A01("UPDATE message_media   SET message_row_id = ?,chat_row_id = ?,autotransfer_retry_enabled = ?,multicast_id = ?,media_job_uuid = ?,transferred = ?,transcoded = ?,file_path = ?,file_size = ?,suspicious_content = ?,trim_from = ?,trim_to = ?,face_x = ?,face_y = ?,media_key = ?,media_key_timestamp = ?,width = ?,height = ?,has_streaming_sidecar = ?,gif_attribution = ?,thumbnail_height_width_ratio = ?,direct_path = ?,first_scan_sidecar = ?,first_scan_length = ?,message_url = ?,mime_type = ?,file_length = ?,media_name = ?,file_hash = ?,media_duration = ?,page_count = ?,enc_file_hash = ?,partial_media_hash = ?,partial_media_enc_hash = ?,is_animated_sticker = ?,original_file_hash = ?,mute_video = ? WHERE message_row_id = ?");
                        A0D(anonymousClass097, A012);
                        A012.A05(38, Long.toString(anonymousClass092.A0p));
                        if (A012.A00() != 1) {
                            throw e;
                        }
                    }
                    A00.A00();
                    A00.close();
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
            }
        }
    }

    public void A0B(AnonymousClass097 anonymousClass097) {
        File file;
        if (!A0E()) {
            Log.w("MediaCoreMessageStore/fillMediaInfo/mediaCoreMessageStore not ready");
            C09H c09h = anonymousClass097.A02;
            if (c09h != null && (file = c09h.A0F) != null) {
                c09h.A0F = this.A00.A05(file);
                return;
            }
            return;
        }
        C000200d.A1L(C000200d.A0P("MediaCoreMessageStore/fillMediaInfo/message must have row_id set; key="), anonymousClass097.A0n, anonymousClass097.A0p > 0);
        String[] strArr = {Long.toString(anonymousClass097.A0p)};
        C05E c05e = this.A02;
        C0CD A03 = c05e.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video FROM message_media WHERE message_row_id=?", strArr);
            if (A07.moveToNext()) {
                C09H A032 = A03(A07);
                long j = anonymousClass097.A0p;
                C000700j.A09(j > 0, "MediaCoreMessageStore/loadInteractiveAnnotations/invalid row_id");
                C0CD A033 = c05e.A03();
                C0CE c0ce = A033.A02;
                Cursor A072 = c0ce.A07("SELECT _id, message_row_id, location_latitude, location_longitude, location_name, sort_order FROM message_media_interactive_annotation WHERE message_row_id=? ORDER BY sort_order", new String[]{Long.toString(j)});
                int count = A072.getCount();
                InteractiveAnnotation[] interactiveAnnotationArr = new InteractiveAnnotation[count];
                int i = 0;
                while (A072.moveToNext()) {
                    Cursor A073 = c0ce.A07("SELECT message_media_interactive_annotation_row_id, x, y, sort_order FROM message_media_interactive_annotation_vertex WHERE message_media_interactive_annotation_row_id=? ORDER BY sort_order", new String[]{Long.toString(A072.getLong(A072.getColumnIndexOrThrow("_id")))});
                    try {
                        SerializablePoint[] serializablePointArr = new SerializablePoint[A073.getCount()];
                        int i2 = 0;
                        while (A073.moveToNext()) {
                            serializablePointArr[i2] = new SerializablePoint(A073.getDouble(A073.getColumnIndexOrThrow("x")), A073.getDouble(A073.getColumnIndexOrThrow("y")));
                            i2++;
                        }
                        A073.close();
                        interactiveAnnotationArr[i] = new InteractiveAnnotation(A072.getDouble(A072.getColumnIndexOrThrow("location_latitude")), A072.getDouble(A072.getColumnIndexOrThrow("location_longitude")), A072.getString(A072.getColumnIndexOrThrow("location_name")), serializablePointArr);
                        i++;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            if (A073 != null) {
                                try {
                                    A073.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th2;
                        }
                    }
                }
                A072.close();
                A033.close();
                if (count == 0) {
                    interactiveAnnotationArr = null;
                }
                A032.A0V = interactiveAnnotationArr;
                anonymousClass097.A1C(A07, A032);
            }
            A07.close();
            A03.close();
            if (anonymousClass097.A02 == null) {
                StringBuilder A0P = C000200d.A0P("MediaCoreMessageStore/fillMediaInfo; media was not found for message: id=");
                A0P.append(anonymousClass097.A0p);
                A0P.append(", type=");
                A0P.append((int) anonymousClass097.A0m);
                Log.e(A0P.toString());
                anonymousClass097.A02 = new C09H();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    A03.close();
                } catch (Throwable unused2) {
                }
                throw th4;
            }
        }
    }

    public void A0C(AnonymousClass097 anonymousClass097, long j) {
        C000200d.A1L(C000200d.A0P("MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/message in main storage; key="), anonymousClass097.A0n, ((AnonymousClass092) anonymousClass097).A09 == 2);
        C0CD A04 = this.A02.A04();
        try {
            C03790Hb A00 = A04.A00();
            try {
                C0CF A01 = this.A04.A01("INSERT INTO message_quoted_media(message_row_id, media_job_uuid, transferred, file_path, file_size, media_key, media_key_timestamp, width, height, direct_path, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, thumbnail) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                A08(j, anonymousClass097, A01);
                C000700j.A0A(j == A01.A01(), "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/inserted row should have same row_id");
            } catch (SQLiteConstraintException e) {
                C0CF A012 = this.A04.A01("UPDATE message_quoted_media   SET message_row_id = ?, media_job_uuid = ?, transferred = ?, file_path = ?, file_size = ?, media_key = ?, media_key_timestamp = ?, width = ?, height = ?, direct_path = ?, message_url = ?, mime_type = ?, file_length = ?, media_name = ?, file_hash = ?, media_duration = ?, page_count = ?, enc_file_hash = ?, thumbnail = ?  WHERE message_row_id = ?");
                A08(j, anonymousClass097, A012);
                A012.A05(20, Long.toString(j));
                if (A012.A00() != 1) {
                    throw e;
                }
            }
            A00.A00();
            A00.close();
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
    }

    public final void A0D(AnonymousClass097 anonymousClass097, C0CF c0cf) {
        int A04;
        C09H c09h = anonymousClass097.A02;
        if (c09h != null) {
            A09(c09h, c0cf);
        }
        long j = anonymousClass097.A0p;
        C05A c05a = this.A01;
        AbstractC005302j abstractC005302j = anonymousClass097.A0n.A00;
        if (abstractC005302j != null) {
            long A052 = c05a.A05(abstractC005302j);
            String A0H = anonymousClass097.A0H();
            String str = anonymousClass097.A09;
            String str2 = anonymousClass097.A07;
            long j2 = anonymousClass097.A01;
            String A1B = anonymousClass097.A1B();
            String str3 = anonymousClass097.A06;
            Integer num = null;
            boolean z = false;
            if (anonymousClass097 instanceof C09E) {
                num = Integer.valueOf(((C09E) anonymousClass097).A00);
                A04 = 0;
            } else {
                A04 = anonymousClass097.A04();
            }
            String A0K = anonymousClass097.A0K();
            if ((anonymousClass097 instanceof C04040Ie) && ((C04040Ie) anonymousClass097).A00) {
                z = true;
            }
            A02(c0cf, j, A052, A0H, str, str2, j2, A1B, str3, num, A04, A0K, z, anonymousClass097.A0B);
            return;
        }
        throw null;
    }

    public boolean A0E() {
        String A02;
        C05E c05e = this.A02;
        C0CD A03 = c05e.A03();
        try {
            c05e.A05();
            boolean z = true;
            if (c05e.A06.A0P(A03)) {
                return true;
            }
            if (this.A01.A0G() && (A02 = this.A03.A02("media_message_ready")) != null) {
                if (Integer.parseInt(A02) == 2) {
                    A03.close();
                    return z;
                }
            }
            z = false;
            A03.close();
            return z;
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
}
