package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1yr */
/* loaded from: classes2.dex */
public class C44311yr {
    public static volatile C44311yr A0B;
    public final C02L A00;
    public final C01B A01;
    public final C0E6 A02;
    public final C44331yt A03;
    public final AnonymousClass012 A04;
    public final C000500h A05;
    public final C41711uO A06;
    public final C41421tt A07;
    public final C44941zu A08;
    public final C44951zv A09;
    public final C05V A0A;

    public C44311yr(AnonymousClass012 anonymousClass012, C02L c02l, C01B c01b, C0E6 c0e6, C44941zu c44941zu, C44331yt c44331yt, C41421tt c41421tt, C05V c05v, C000500h c000500h, C44951zv c44951zv, C41711uO c41711uO) {
        this.A04 = anonymousClass012;
        this.A00 = c02l;
        this.A01 = c01b;
        this.A02 = c0e6;
        this.A08 = c44941zu;
        this.A03 = c44331yt;
        this.A07 = c41421tt;
        this.A0A = c05v;
        this.A05 = c000500h;
        this.A09 = c44951zv;
        this.A06 = c41711uO;
    }

    public static C44311yr A00() {
        if (A0B == null) {
            synchronized (C44311yr.class) {
                if (A0B == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C02L A002 = C02L.A00();
                    C01B A003 = C01B.A00();
                    C0E6 A004 = C0E6.A00();
                    if (C44941zu.A01 == null) {
                        synchronized (C44941zu.class) {
                            if (C44941zu.A01 == null) {
                                C44941zu.A01 = new C44941zu(C44291yp.A00());
                            }
                        }
                    }
                    C44941zu c44941zu = C44941zu.A01;
                    C44331yt A005 = C44331yt.A00();
                    C41421tt A006 = C41421tt.A00();
                    C05V A01 = C05V.A01();
                    C000500h A007 = C000500h.A00();
                    if (C44951zv.A01 == null) {
                        synchronized (C44951zv.class) {
                            if (C44951zv.A01 == null) {
                                C44951zv.A01 = new C44951zv(C44291yp.A00());
                            }
                        }
                    }
                    A0B = new C44311yr(A00, A002, A003, A004, c44941zu, A005, A006, A01, A007, C44951zv.A01, C41711uO.A00());
                }
            }
        }
        return A0B;
    }

    public C44961zw A01() {
        if (A0C()) {
            return null;
        }
        int A00 = this.A08.A00();
        if (A00 == 0) {
            A00 = new SecureRandom().nextInt(65536);
        }
        int i = A00 + 1;
        if (this.A00 != null) {
            C44651zQ c44651zQ = new C44651zQ(0, i);
            byte[] A0C = C02A.A0C(32);
            long A05 = this.A04.A05();
            SharedPreferences sharedPreferences = this.A05.A00;
            C44961zw c44961zw = new C44961zw(c44651zQ, new C44981zy(A0C, A05, new C44971zx(sharedPreferences.getInt("adv_raw_id", -1), sharedPreferences.getInt("adv_current_key_index", -1), A07())));
            StringBuilder sb = new StringBuilder("SyncdKeyManager/generateAndShareNewKey syncdKey = ");
            sb.append(c44961zw);
            Log.i(sb.toString());
            AbstractCollection abstractCollection = (AbstractCollection) this.A06.A04();
            if (abstractCollection.isEmpty()) {
                A09();
                A0A(Collections.singleton(c44961zw));
                return c44961zw;
            }
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                A0B(true, new HashMap(Collections.singletonMap(c44961zw.A01, c44961zw)), ((C0JV) it.next()).A05);
            }
            return null;
        }
        throw null;
    }

    public C44961zw A02() {
        C44961zw A01 = this.A08.A01();
        if (A01 == null) {
            return null;
        }
        long millis = TimeUnit.DAYS.toMillis(this.A01.A07(C01C.A3R));
        long A05 = this.A04.A05();
        C44981zy c44981zy = A01.A00;
        if (A05 - c44981zy.A00 <= millis && A0D(c44981zy)) {
            return A01;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0165, code lost:
        if (r5.get(null) != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap A03(java.lang.String r18, java.util.Collection r19) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44311yr.A03(java.lang.String, java.util.Collection):java.util.HashMap");
    }

    public final HashMap A04(Collection collection) {
        C44961zw A02;
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C44651zQ c44651zQ = (C44651zQ) it.next();
            if (c44651zQ != null) {
                C44941zu c44941zu = this.A08;
                C0CD A01 = c44941zu.A00.A01();
                try {
                    Cursor A07 = A01.A02.A07("SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info WHERE device_id = ?  AND epoch = ? ", new String[]{String.valueOf(c44651zQ.A01()), String.valueOf(c44651zQ.A02())});
                    if (A07 == null || !A07.moveToFirst()) {
                        if (A07 != null) {
                            A07.close();
                        }
                        A01.close();
                        A02 = null;
                    } else {
                        A02 = c44941zu.A02(A07);
                        A07.close();
                        A01.close();
                    }
                } finally {
                }
            } else {
                A02 = A02();
            }
            hashMap.put(c44651zQ, A02);
        }
        return hashMap;
    }

    public Set A05() {
        C44951zv c44951zv = this.A09;
        if (c44951zv != null) {
            HashSet hashSet = new HashSet();
            C0CD A01 = c44951zv.A00.A01();
            try {
                Cursor A07 = A01.A02.A07("SELECT DISTINCT collection_name FROM missing_keys", null);
                while (A07.moveToNext()) {
                    hashSet.add(A07.getString(A07.getColumnIndex("collection_name")));
                }
                A07.close();
                return hashSet;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A01.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        throw null;
    }

    public Set A06() {
        List A05 = this.A07.A05((byte) 39);
        HashSet hashSet = new HashSet();
        Iterator it = ((AbstractCollection) A05).iterator();
        while (it.hasNext()) {
            hashSet.addAll(Collections.unmodifiableSet(((C44991zz) it.next()).A00));
        }
        return hashSet;
    }

    public final Set A07() {
        HashSet hashSet = new HashSet();
        Iterator it = ((AbstractCollection) this.A06.A04()).iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((C0JV) it.next()).A03));
        }
        if (this.A00 != null) {
            hashSet.add(0);
            return hashSet;
        }
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    public void A08() {
        Log.i("SyncdKeyManager/dailyCronJob");
        C44941zu c44941zu = this.A08;
        if (c44941zu != null) {
            HashSet hashSet = new HashSet();
            C44291yp c44291yp = c44941zu.A00;
            C0CD A01 = c44291yp.A01();
            try {
                Cursor A07 = A01.A02.A07("SELECT crypto_info.device_id,  crypto_info.epoch FROM crypto_info LEFT JOIN syncd_mutations on crypto_info.device_id = syncd_mutations.device_id AND crypto_info.epoch = syncd_mutations.epoch WHERE syncd_mutations._id IS NULL AND crypto_info.stale_timestamp = 0 ", null);
                while (A07.moveToNext()) {
                    hashSet.add(new C44651zQ((int) A07.getLong(A07.getColumnIndex("device_id")), (int) A07.getLong(A07.getColumnIndex("epoch"))));
                }
                A07.close();
                A01.close();
                C44961zw A02 = A02();
                if (A02 != null) {
                    hashSet.remove(A02.A01);
                }
                long A05 = this.A04.A05();
                c44941zu.A03(A05, hashSet);
                try {
                    c44291yp.A02().A02.A0D("DELETE FROM crypto_info WHERE stale_timestamp != 0  AND stale_timestamp <= ? ", new String[]{String.valueOf(A05 - TimeUnit.DAYS.toMillis(this.A01.A07(C01C.A3S)))});
                } finally {
                }
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
        } else {
            throw null;
        }
    }

    public final void A09() {
        int i;
        C44961zw A01 = this.A08.A01();
        if (A01 == null) {
            i = 3;
        } else {
            i = 1;
            if (!A0D(A01.A00)) {
                i = 2;
            }
        }
        C44331yt c44331yt = this.A03;
        if (c44331yt != null) {
            C0JW c0jw = new C0JW();
            c0jw.A00 = Integer.valueOf(i);
            c44331yt.A04.A0B(c0jw, null, false);
            return;
        }
        throw null;
    }

    public void A0A(Set set) {
        C0CD A02 = this.A08.A00.A02();
        try {
            C03790Hb A00 = A02.A00();
            C0CF A0B2 = A02.A02.A0B("INSERT OR IGNORE INTO crypto_info (device_id, epoch, key_data, timestamp, fingerprint) VALUES (?, ?, ?, ?, ?)");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C44961zw c44961zw = (C44961zw) it.next();
                SQLiteStatement sQLiteStatement = A0B2.A00;
                sQLiteStatement.clearBindings();
                C44651zQ c44651zQ = c44961zw.A01;
                sQLiteStatement.bindLong(1, c44651zQ.A01());
                sQLiteStatement.bindLong(2, c44651zQ.A02());
                C44981zy c44981zy = c44961zw.A00;
                sQLiteStatement.bindBlob(3, c44981zy.A02);
                sQLiteStatement.bindLong(4, c44981zy.A00);
                sQLiteStatement.bindBlob(5, c44981zy.A01.A01().A0B());
                if (A0B2.A01() == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SyncdCryptoStore/saveKey failed to store key: ");
                    sb.append(c44651zQ);
                    Log.e(sb.toString());
                }
            }
            A00.A00();
            A00.close();
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

    public void A0B(boolean z, HashMap hashMap, DeviceJid deviceJid) {
        C02L c02l = this.A00;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid == null || hashMap.isEmpty()) {
            return;
        }
        C05V c05v = this.A0A;
        C44911zr c44911zr = new C44911zr(C05V.A00(c05v.A01, c05v.A00, userJid, true), this.A04.A05());
        ((C0JU) c44911zr).A00 = deviceJid;
        c44911zr.A1C(hashMap);
        c44911zr.A01 = z;
        if (this.A07.A02(c44911zr) < 0) {
            Log.e("SyncdKeyManager/shareKeys unable to add peer message");
            return;
        }
        C0E6 c0e6 = this.A02;
        c0e6.A00.A01(new SendPeerMessageJob(c44911zr, deviceJid, null, 0));
    }

    public boolean A0C() {
        Iterator it = ((AbstractCollection) this.A07.A05((byte) 38)).iterator();
        while (it.hasNext()) {
            C44911zr c44911zr = (C44911zr) it.next();
            if (!((C0JU) c44911zr).A01 && c44911zr.A01) {
                return true;
            }
        }
        return false;
    }

    public boolean A0D(C44981zy c44981zy) {
        C44971zx c44971zx = c44981zy.A01;
        int i = c44971zx.A01;
        SharedPreferences sharedPreferences = this.A05.A00;
        if (i != sharedPreferences.getInt("adv_raw_id", -1)) {
            Log.i("SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: rawId did not match");
            return false;
        }
        int i2 = sharedPreferences.getInt("adv_current_key_index", -1);
        HashSet hashSet = new HashSet(c44971zx.A02);
        for (int i3 = c44971zx.A00 + 1; i3 <= i2; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        if (A07().equals(hashSet)) {
            return true;
        }
        Log.i("SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: one of a peer device is no longer registered");
        return false;
    }
}
