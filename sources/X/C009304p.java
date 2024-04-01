package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.04p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C009304p {
    public final C04j A00;
    public final AnonymousClass012 A01;

    public C009304p(AnonymousClass012 anonymousClass012, C04j c04j) {
        this.A01 = anonymousClass012;
        this.A00 = c04j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r2 > 100) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.database.Cursor A00(java.util.List r8) {
        /*
            r7 = this;
            int r2 = r8.size()
            if (r2 <= 0) goto Lb
            r1 = 100
            r0 = 1
            if (r2 <= r1) goto Lc
        Lb:
            r0 = 0
        Lc:
            X.C000700j.A06(r0)
            int r3 = r8.size()
            java.lang.String r0 = "SELECT record, recipient_id, device_id FROM sessions INNER JOIN (SELECT ? AS r, ? AS d"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r6 = 1
            r1 = 1
        L1c:
            if (r1 >= r3) goto L26
            java.lang.String r0 = " UNION ALL SELECT ? AS r, ? AS d"
            r2.append(r0)
            int r1 = r1 + 1
            goto L1c
        L26:
            java.lang.String r0 = ") AS joined ON joined.r = sessions.recipient_id AND joined.d = sessions.device_id"
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            int r0 = r3 << 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r2 = 0
        L34:
            if (r2 >= r3) goto L54
            int r1 = r2 << 1
            java.lang.Object r0 = r8.get(r2)
            X.0IO r0 = (X.C0IO) r0
            java.lang.String r0 = r0.A01
            r4[r1] = r0
            int r1 = r1 + r6
            java.lang.Object r0 = r8.get(r2)
            X.0IO r0 = (X.C0IO) r0
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r1] = r0
            int r2 = r2 + 1
            goto L34
        L54:
            X.0FK r3 = new X.0FK
            r3.<init>(r5, r4)
            X.04j r0 = r7.A00
            X.0CE r2 = r0.ACk()
            java.lang.Object r1 = r3.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r3.A01
            java.lang.String[] r0 = (java.lang.String[]) r0
            android.database.Cursor r0 = r2.A07(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009304p.A00(java.util.List):android.database.Cursor");
    }

    public void A01(C0IO c0io) {
        C0CD A02 = this.A00.A02();
        try {
            C0CE c0ce = A02.A02;
            String[] strArr = {c0io.A01, String.valueOf(c0io.A00)};
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl deleted ");
            sb.append(c0ce.A01("sessions", "recipient_id = ? AND device_id = ? ", strArr));
            sb.append(" sessions with ");
            sb.append(c0io);
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

    /* JADX WARN: Finally extract failed */
    public void A02(C0IO c0io, byte[] bArr) {
        String str = c0io.A01;
        int i = c0io.A00;
        C0CD A02 = this.A00.A02();
        try {
            C03790Hb A00 = A02.A00();
            ContentValues contentValues = new ContentValues();
            contentValues.put("record", bArr);
            C0CE c0ce = A02.A02;
            if (c0ce.A00("sessions", contentValues, "recipient_id = ? AND device_id = ? ", new String[]{str, String.valueOf(i)}) == 0) {
                long A05 = this.A01.A05() / 1000;
                contentValues.put("recipient_id", str);
                contentValues.put("device_id", Integer.valueOf(i));
                contentValues.put("timestamp", Long.valueOf(A05));
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl inserting new session for ");
                sb.append(c0io);
                sb.append(" at ");
                sb.append(A05);
                Log.i(sb.toString());
                c0ce.A02("sessions", contentValues);
            }
            A00.A00();
            A00.close();
            A02.close();
            StringBuilder sb2 = new StringBuilder("axolotl stored session for ");
            sb2.append(c0io);
            Log.i(sb2.toString());
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

    public byte[] A03(C0IO c0io) {
        C0CD A01 = this.A00.A01();
        try {
            Cursor A09 = A01.A02.A09("sessions", new String[]{"record"}, "recipient_id = ? AND device_id = ? ", new String[]{c0io.A01, String.valueOf(c0io.A00)}, null, "SignalSessionStore/getSession");
            if (!A09.moveToNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl cant load a session record for ");
                sb.append(c0io);
                Log.i(sb.toString());
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
