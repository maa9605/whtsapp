package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1wt */
/* loaded from: classes2.dex */
public class C43121wt {
    public static volatile C43121wt A04;
    public final C06F A00 = new C06F() { // from class: X.1xp
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(30);
            C43121wt.this = this;
        }

        @Override // X.C06F
        public void A09(boolean z, Object obj, Object obj2, Object obj3) {
            C04140Is c04140Is = (C04140Is) obj2;
            if (z) {
                C43121wt.this.A07(c04140Is);
            }
        }
    };
    public final AnonymousClass012 A01;
    public final C40451sH A02;
    public final InterfaceC002901k A03;

    public C43121wt(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C40451sH c40451sH) {
        this.A01 = anonymousClass012;
        this.A03 = interfaceC002901k;
        this.A02 = c40451sH;
    }

    public static C43121wt A00() {
        if (A04 == null) {
            synchronized (C43121wt.class) {
                if (A04 == null) {
                    A04 = new C43121wt(AnonymousClass012.A00(), C002801j.A00(), C40451sH.A00());
                }
            }
        }
        return A04;
    }

    public final ContentValues A01(C04140Is c04140Is) {
        String str = c04140Is.A0C;
        long j = c04140Is.A0A;
        long j2 = c04140Is.A0B;
        long j3 = c04140Is.A08;
        long j4 = c04140Is.A03;
        long j5 = c04140Is.A06;
        long j6 = c04140Is.A07;
        int i = c04140Is.A02;
        int i2 = c04140Is.A00;
        long j7 = c04140Is.A09;
        int i3 = c04140Is.A01;
        long j8 = c04140Is.A04;
        long j9 = c04140Is.A05;
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", str);
        contentValues.put("job_type", Long.valueOf(j));
        contentValues.put("create_time", Long.valueOf(j2));
        contentValues.put("transfer_start_time", Long.valueOf(j3));
        contentValues.put("last_update_time", Long.valueOf(this.A01.A05()));
        contentValues.put("user_initiated_attempt_count", Long.valueOf(j4));
        contentValues.put("overall_cumulative_time", Long.valueOf(j5));
        contentValues.put("overall_cumulative_user_visible_time", Long.valueOf(j6));
        contentValues.put("streaming_playback_count", Integer.valueOf(i));
        contentValues.put("media_key_reuse_type", Integer.valueOf(i2));
        contentValues.put("transferred_bytes", Long.valueOf(j7));
        contentValues.put("reupload_attempt_count", Integer.valueOf(i3));
        contentValues.put("last_reupload_attempt_timestamp", Long.valueOf(j8));
        contentValues.put("last_reupload_success_timestamp", Long.valueOf(j9));
        return contentValues;
    }

    public C04140Is A02(int i, String str) {
        AnonymousClass012 anonymousClass012 = this.A01;
        long A05 = anonymousClass012.A05();
        long A052 = anonymousClass012.A05();
        long A053 = anonymousClass012.A05();
        C000700j.A07(A05 > 0);
        C000700j.A07(A053 > 0);
        if (str != null) {
            C04140Is c04140Is = new C04140Is(str, i, A05, A052, 0, 0L, 0L, 0, 0, 0L, 0, 0L, 0L);
            this.A03.AS1(new RunnableEBaseShape2S0200000_I0_2(this, c04140Is, 48));
            return c04140Is;
        }
        throw null;
    }

    public synchronized C04140Is A03(String str, int i) {
        C000700j.A00();
        C06F c06f = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        C04140Is c04140Is = (C04140Is) c06f.A04(sb.toString());
        if (c04140Is != null) {
            return c04140Is;
        }
        C0CD c0cd = new C0CD(null, this.A02, false);
        Cursor A07 = c0cd.A02.A07("SELECT + _id, uuid, job_type , create_time, transfer_start_time, last_update_time, user_initiated_attempt_count, overall_cumulative_time, overall_cumulative_user_visible_time, streaming_playback_count, media_key_reuse_type, doodle_id, transferred_bytes, reupload_attempt_count, last_reupload_attempt_timestamp, last_reupload_success_timestamp FROM media_job WHERE uuid=? AND job_type=?", new String[]{str, Integer.toString(i)});
        if (A07 == null || !A07.moveToLast()) {
            if (A07 != null) {
                A07.close();
            }
            c0cd.close();
            return null;
        }
        String string = A07.getString(1);
        int i2 = A07.getInt(2);
        long j = A07.getLong(3);
        long j2 = A07.getLong(4);
        long j3 = A07.getLong(5);
        int i3 = A07.getInt(6);
        long j4 = A07.getLong(7);
        long j5 = A07.getLong(8);
        int i4 = A07.getInt(9);
        int i5 = A07.getInt(10);
        long j6 = A07.getLong(12);
        int i6 = A07.getInt(13);
        long j7 = A07.getLong(14);
        long j8 = A07.getLong(15);
        C000700j.A07(j > 0);
        C000700j.A07(j3 > 0);
        if (string != null) {
            C04140Is c04140Is2 = new C04140Is(string, i2, j, j2, i3, j4, j5, i4, i5, j6, i6, j7, j8);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c04140Is2.A0C);
            sb2.append(c04140Is2.A0A);
            c06f.A08(sb2.toString(), c04140Is2);
            A07.close();
            c0cd.close();
            return c04140Is2;
        }
        throw null;
    }

    public synchronized void A04() {
        Log.i("mediajob/deletedatabases");
        C40451sH c40451sH = this.A02;
        synchronized (c40451sH) {
            c40451sH.AE6().A00.close();
            File databasePath = c40451sH.A03.A00.getDatabasePath("media.db");
            databasePath.delete();
            C002501g.A0O(databasePath, "MediaDbHelper");
        }
    }

    public void A05(C04140Is c04140Is) {
        if (A07(c04140Is)) {
            C06F c06f = this.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(c04140Is.A0C);
            sb.append(c04140Is.A0A);
            c06f.A08(sb.toString(), c04140Is);
        }
    }

    public synchronized void A06(C04140Is c04140Is) {
        C000700j.A00();
        try {
            C0CD A01 = this.A02.A01();
            try {
                C03790Hb A00 = A01.A00();
                C0CE c0ce = A01.A02;
                String str = c04140Is.A0C;
                int i = c04140Is.A0A;
                c0ce.A01("media_job", "uuid = ? AND job_type = ? ", new String[]{str, Integer.toString(i)});
                A00.A00();
                C06F c06f = this.A00;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                c06f.A05(sb.toString());
                A00.close();
            } finally {
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("mediajobdb/delete", e);
        }
    }

    public final synchronized boolean A07(C04140Is c04140Is) {
        C000700j.A00();
        try {
            try {
                this.A02.A01().A02.A00("media_job", A01(c04140Is), "uuid = ? AND job_type = ? ", new String[]{c04140Is.A0C, Integer.toString(c04140Is.A0A)});
            } finally {
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("mediajobdb/update", e);
            return false;
        } catch (Error e2) {
            e = e2;
            Log.e(e);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            Log.e(e);
            throw e;
        }
        return true;
    }
}
