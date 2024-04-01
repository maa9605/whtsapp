package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.0F8  reason: invalid class name */
/* loaded from: classes.dex */
public class C0F8 {
    public static volatile C0F8 A03;
    public C07E A00;
    public final AnonymousClass012 A01;
    public final C0F9 A02;

    public C0F8(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C001200o c001200o, C04Z c04z) {
        this.A01 = anonymousClass012;
        this.A02 = new C0F9(c001200o.A00, abstractC000600i, c04z);
    }

    public static C0F8 A00() {
        if (A03 == null) {
            synchronized (C0F8.class) {
                if (A03 == null) {
                    A03 = new C0F8(AnonymousClass012.A00(), AbstractC000600i.A00(), C001200o.A01, C04Z.A00());
                }
            }
        }
        return A03;
    }

    public C07E A01() {
        C07E c07e;
        synchronized (this) {
            if (this.A00 == null) {
                C0CD c0cd = new C0CD(null, this.A02, false);
                Cursor A09 = c0cd.A02.A09("devices", C27831Oy.A00, null, null, null, "getDevices/QUERY_DEVICES");
                try {
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("device_id");
                    int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("platform_type");
                    int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("device_os");
                    int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("last_active");
                    int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("login_time");
                    int columnIndexOrThrow6 = A09.getColumnIndexOrThrow("logout_time");
                    int columnIndexOrThrow7 = A09.getColumnIndexOrThrow("adv_key_index");
                    int columnIndexOrThrow8 = A09.getColumnIndexOrThrow("full_sync_required");
                    int columnIndexOrThrow9 = A09.getColumnIndexOrThrow("place_name");
                    HashMap hashMap = new HashMap();
                    while (A09.moveToNext()) {
                        DeviceJid nullable = DeviceJid.getNullable(A09.getString(columnIndexOrThrow));
                        if (nullable != null) {
                            hashMap.put(nullable, new C0JV(nullable, C0L3.A00(A09.getInt(columnIndexOrThrow2)), A09.getString(columnIndexOrThrow3), A09.getLong(columnIndexOrThrow4), A09.getLong(columnIndexOrThrow5), A09.getLong(columnIndexOrThrow6), A09.getInt(columnIndexOrThrow7), 1 == A09.getInt(columnIndexOrThrow8), A09.getString(columnIndexOrThrow9)));
                        }
                    }
                    this.A00 = new C07E(hashMap, null);
                    A09.close();
                    c0cd.close();
                } finally {
                }
            }
            c07e = this.A00;
        }
        return c07e;
    }

    public void A02(C07D c07d) {
        C0CD A00 = this.A02.A00();
        try {
            C03790Hb A002 = A00.A00();
            synchronized (this) {
                String[] A0d = C003101m.A0d(c07d.A02());
                String join = TextUtils.join(", ", Collections.nCopies(A0d.length, "?"));
                StringBuilder sb = new StringBuilder();
                sb.append("device_id IN (");
                sb.append(join);
                sb.append(")");
                A00.A02.A01("devices", sb.toString(), A0d);
                A002.A00();
                this.A00 = null;
            }
            A002.close();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A00.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
