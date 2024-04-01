package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.0Po  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05650Po extends AbstractC05100Nh implements InterfaceC05660Pp {
    public Map A00;
    public Set A01;
    public final AbstractC000600i A02;
    public final C60182u3 A03;
    public final Random A04;

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 50;
    }

    public abstract String A0c(Cursor cursor);

    public AbstractC05650Po(C05670Pr c05670Pr) {
        super("message_main_verification", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
        this.A04 = new Random();
        this.A02 = c05670Pr.A00;
        this.A03 = new C60182u3();
        this.A00 = new HashMap();
    }

    @Override // X.AbstractC05100Nh
    public Cursor A09(long j, int i, C0CD c0cd) {
        long j2;
        C0CE c0ce = c0cd.A02;
        String A0L = C000200d.A0L(new StringBuilder(), C60372uN.A00, " OFFSET ?");
        String[] strArr = new String[3];
        strArr[0] = String.valueOf(j);
        strArr[1] = String.valueOf(i);
        long j3 = 50;
        C60182u3 c60182u3 = this.A03;
        int i2 = c60182u3.A00;
        if (i2 < 1) {
            j2 = 0;
        } else {
            int nextInt = c60182u3.A02.nextInt(i2);
            int i3 = c60182u3.A01;
            int i4 = nextInt;
            if (i3 > -1) {
                i4 = ((i2 - i3) - 1) + nextInt;
            }
            c60182u3.A01 = nextInt;
            j2 = i4;
        }
        strArr[2] = String.valueOf(j3 * j2);
        StringBuilder A0P = C000200d.A0P("MIGRATION_GET_QUERY_FOR_");
        A0P.append(this.A0B);
        A0P.toString();
        return c0ce.A07(A0L, strArr);
    }

    @Override // X.AbstractC05100Nh
    public boolean A0P(C47982Di c47982Di) {
        int i;
        C48072Dr c48072Dr = this.A09;
        String str = this.A0B;
        JSONObject A04 = c48072Dr.A04(str);
        if (A04 != null) {
            i = A04.optInt("run_sampling");
        } else {
            i = 0;
        }
        if (i > 0 && this.A04.nextInt(i) == 0) {
            return super.A0P(c47982Di);
        }
        C000200d.A1Q(C000200d.A0P("DatabaseMigrationVerifier/doMigration; name="), str, "; sampled, skipping.");
        return true;
    }

    @Override // X.AbstractC05100Nh
    public int A0Q() {
        JSONObject A04 = this.A09.A04(this.A0B);
        return (A04 == null || !A04.optBoolean("enabled")) ? 2 : 3;
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        A0f();
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            i++;
            String A0c = A0c(cursor);
            if (!TextUtils.isEmpty(A0c)) {
                Set set = this.A01;
                if (set == null) {
                    set = new HashSet();
                    this.A01 = set;
                }
                String valueOf = String.valueOf(j);
                set.add(valueOf);
                Set set2 = this.A01;
                int size = set2 != null ? set2.size() : 0;
                this.A00.put(valueOf, A0c);
                if (size >= 50) {
                    A0e();
                }
            }
        }
        Set set3 = this.A01;
        if (set3 != null && !set3.isEmpty()) {
            String join = TextUtils.join(",", this.A01);
            if (!TextUtils.isEmpty(join)) {
                this.A06.A06("message_main_verification_failed_message_ids", join);
            }
        }
        return new Pair(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AbstractC05100Nh
    public void A0Y() {
        super.A0Y();
        this.A06.A05("message_main_verification_start_index", ((C0QJ) this).A04.A04());
    }

    @Override // X.AbstractC05100Nh
    public void A0Z() {
        A0f();
        Set set = this.A01;
        if (set == null || set.size() <= 0) {
            return;
        }
        A0e();
    }

    @Override // X.AbstractC05100Nh
    public void A0a() {
        C0CD A04 = this.A05.A04();
        try {
            int i = 0;
            if (A0b()) {
                JSONObject A042 = this.A09.A04(this.A0B);
                if (A042 != null) {
                    i = A042.optInt("new_data_sampling");
                }
            } else {
                JSONObject A043 = this.A09.A04(this.A0B);
                if (A043 != null) {
                    i = A043.optInt("old_data_sampling");
                }
            }
            C60182u3 c60182u3 = this.A03;
            c60182u3.A00 = i;
            c60182u3.A01 = -1;
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

    public final void A0d() {
        this.A01 = null;
        this.A00.clear();
        C0CD A04 = this.A05.A04();
        try {
            this.A06.A03("message_main_verification_failed_message_ids");
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

    public final void A0e() {
        HashSet<String> hashSet;
        int i;
        C0CD A03 = this.A05.A03();
        try {
            Set set = this.A01;
            if (set == null || set.isEmpty()) {
                hashSet = null;
            } else {
                hashSet = new HashSet();
                for (String str : this.A01) {
                    if (this.A00.containsKey(str)) {
                        hashSet.add(this.A00.get(str));
                    } else {
                        C0CE c0ce = A03.A02;
                        String str2 = C60372uN.A01;
                        String[] strArr = {str};
                        StringBuilder sb = new StringBuilder();
                        sb.append("MIGRATION_GET_FAILED_ROW_QUERY_FOR_");
                        sb.append(this.A0B);
                        sb.toString();
                        Cursor A07 = c0ce.A07(str2, strArr);
                        if (A07.moveToFirst()) {
                            String A0c = A0c(A07);
                            if (!TextUtils.isEmpty(A0c)) {
                                hashSet.add(A0c);
                            }
                        }
                        A07.close();
                    }
                }
            }
            A03.close();
            A0d();
            if (hashSet == null || hashSet.size() <= 0) {
                return;
            }
            for (String str3 : hashSet) {
                StringBuilder A0P = C000200d.A0P("DatabaseMigrationVerifier/collectFailureLogsAndThrowError/error; name=");
                String str4 = this.A0B;
                A0P.append(str4);
                A0P.append(" ,Message: ");
                A0P.append(str3);
                Log.e(A0P.toString());
                JSONObject A04 = this.A09.A04(str4);
                if (A04 != null) {
                    i = A04.optInt("critical_event_sampling");
                } else {
                    i = 0;
                }
                String A0H = C000200d.A0H("verification-failed-", str4);
                if (i != 0 && this.A04.nextInt(i) == 0) {
                    this.A02.A09(A0H, str3, false);
                }
            }
            final String A0L = C000200d.A0L(new StringBuilder(), this.A0B, ": verification failed");
            throw new RuntimeException(A0L) { // from class: X.2u2
            };
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

    public final void A0f() {
        String A02 = this.A06.A02("message_main_verification_failed_message_ids");
        if (A02 != null) {
            this.A01 = new HashSet(Arrays.asList(A02.split(",")));
        }
    }

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        A0d();
    }
}
