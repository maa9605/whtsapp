package X;

import android.database.Cursor;

/* renamed from: X.0QC  reason: invalid class name */
/* loaded from: classes.dex */
public class C0QC extends C0QB implements InterfaceC05660Pp {
    @Override // X.C0QB, X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_media_fixer_retry";
    }

    @Override // X.C0QB, X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_media_fixer_index";
    }

    public C0QC(C05A c05a, C05C c05c, C05L c05l, C06J c06j, C05670Pr c05670Pr) {
        super(c05a, c05c, c05l, c06j, "media_migration_fixer", 3, c05670Pr);
    }

    @Override // X.C0QB, X.AbstractC05100Nh
    public int A0Q() {
        return this.A09.A02(this.A0B);
    }

    @Override // X.C0QB, X.AbstractC05100Nh
    public void A0Y() {
        super.A0Y();
        C05C c05c = ((C0QB) this).A02;
        c05c.A04("media_message_fixer_ready", 3);
        c05c.A04("media_message_ready", 2);
    }

    @Override // X.C0QB, X.AbstractC05100Nh
    public boolean A0b() {
        String A02 = ((C0QB) this).A02.A02("media_message_fixer_ready");
        return A02 != null && Integer.parseInt(A02) == 3;
    }

    @Override // X.C0QB
    public boolean A0c(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        C0CD A03 = this.A05.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video FROM message_media WHERE message_row_id=?", new String[]{String.valueOf(j)});
            if (!A07.moveToNext()) {
                A07.close();
                A03.close();
                return true;
            }
            ((C0QB) this).A01.A03(A07);
            A07.close();
            A03.close();
            return false;
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

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        ((C0QB) this).A02.A03("media_message_fixer_ready");
    }
}
