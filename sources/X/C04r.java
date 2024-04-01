package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.04r  reason: invalid class name */
/* loaded from: classes.dex */
public class C04r {
    public final C04j A00;
    public final AnonymousClass012 A01;

    public C04r(AnonymousClass012 anonymousClass012, C04j c04j) {
        this.A01 = anonymousClass012;
        this.A00 = c04j;
    }

    public static void A00(C0IO c0io) {
        StringBuilder sb = new StringBuilder("axolotl trusting ");
        sb.append(c0io);
        sb.append(" key pair");
        Log.i(sb.toString());
    }

    public int A01() {
        C0CD A01 = this.A00.A01();
        try {
            Cursor A09 = A01.A02.A09("identities", new String[]{"next_prekey_id"}, "recipient_id = ? AND device_id = ?", new String[]{String.valueOf(-1), String.valueOf(0)}, null, "SignalIdentityKeyStore/getNextPreKeyId");
            if (A09.moveToNext()) {
                int i = A09.getInt(0);
                A09.close();
                A01.close();
                return i;
            }
            throw new SQLiteException("Missing entry for self in identities table");
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

    public int A02() {
        C0CD A01 = this.A00.A01();
        try {
            Cursor A09 = A01.A02.A09("identities", new String[]{"registration_id"}, "recipient_id = ? AND device_id = ?", new String[]{String.valueOf(-1), String.valueOf(0)}, null, "SignalIdentityKeyStore/getRegistrationId");
            if (A09.moveToNext()) {
                int i = A09.getInt(0);
                A09.close();
                A01.close();
                return i;
            }
            throw new SQLiteException("Missing entry for self in identities table");
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

    public C27301Mv A03() {
        C0CD A01 = this.A00.A01();
        try {
            Cursor A09 = A01.A02.A09("identities", new String[]{"public_key", "private_key"}, "recipient_id = ? AND device_id = ?", new String[]{String.valueOf(-1), String.valueOf(0)}, null, "SignalIdentityKeyStore/getIdentityKeyPair");
            if (A09.moveToNext()) {
                C27301Mv c27301Mv = new C27301Mv(A09.getBlob(0), A09.getBlob(1));
                A09.close();
                A01.close();
                return c27301Mv;
            }
            throw new SQLiteException("Missing entry for self in identities table");
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

    public boolean A04(C0IO c0io) {
        C0CD A02 = this.A00.A02();
        try {
            long A01 = A02.A02.A01("identities", "recipient_id = ? AND device_id = ? ", new String[]{c0io.A01, String.valueOf(c0io.A00)});
            StringBuilder sb = new StringBuilder();
            sb.append("axolotl deleted ");
            sb.append(A01);
            sb.append(" identities for ");
            sb.append(c0io);
            Log.i(sb.toString());
            boolean z = A01 > 0;
            A02.close();
            return z;
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

    public byte[] A05(C0IO c0io) {
        C0CD A01 = this.A00.A01();
        try {
            Cursor A09 = A01.A02.A09("identities", new String[]{"public_key", "timestamp"}, "recipient_id = ? AND device_id = ? ", new String[]{c0io.A01, String.valueOf(c0io.A00)}, null, "SignalIdentityKeyStore/getIdentityPublicKey");
            if (!A09.moveToNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl found no identity entry for ");
                sb.append(c0io);
                Log.i(sb.toString());
                A09.close();
                A01.close();
                return null;
            }
            byte[] blob = A09.getBlob(0);
            Date date = new Date(A09.getLong(1) * 1000);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("axolotl found an identity entry for ");
            sb2.append(c0io);
            sb2.append(" dated ");
            sb2.append(date);
            Log.i(sb2.toString());
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
