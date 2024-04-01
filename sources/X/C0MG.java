package X;

import android.content.SharedPreferences;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0MG  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MG implements SharedPreferences.Editor {
    public final /* synthetic */ SharedPreferencesC004602c A03;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public boolean A00 = false;

    public C0MG(SharedPreferencesC004602c sharedPreferencesC004602c) {
        this.A03 = sharedPreferencesC004602c;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088 A[Catch: all -> 0x00a3, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0009, B:7:0x0012, B:9:0x0023, B:10:0x0028, B:11:0x002a, B:46:0x009c, B:14:0x002e, B:16:0x0033, B:18:0x0039, B:20:0x003f, B:21:0x0042, B:22:0x004c, B:24:0x0052, B:27:0x0066, B:29:0x006c, B:31:0x0072, B:34:0x0079, B:39:0x0088, B:35:0x007d, B:37:0x0083, B:41:0x008d, B:43:0x0092, B:44:0x0099, B:45:0x009b), top: B:55:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C0MH A00() {
        /*
            r12 = this;
            X.02c r8 = r12.A03
            java.lang.Object r6 = r8.A0A
            monitor-enter(r6)
            int r0 = r8.A00     // Catch: java.lang.Throwable -> La6
            if (r0 <= 0) goto L12
            java.util.Map r1 = r8.A04     // Catch: java.lang.Throwable -> La6
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> La6
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La6
            r8.A04 = r0     // Catch: java.lang.Throwable -> La6
        L12:
            java.util.Map r7 = r8.A04     // Catch: java.lang.Throwable -> La6
            int r0 = r8.A00     // Catch: java.lang.Throwable -> La6
            r1 = 1
            int r0 = r0 + r1
            r8.A00 = r0     // Catch: java.lang.Throwable -> La6
            java.util.Map r0 = r8.A0D     // Catch: java.lang.Throwable -> La6
            boolean r11 = r0.isEmpty()     // Catch: java.lang.Throwable -> La6
            r11 = r11 ^ r1
            if (r11 == 0) goto L2c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La6
            r5.<init>()     // Catch: java.lang.Throwable -> La6
        L28:
            java.lang.Object r4 = r12.A01     // Catch: java.lang.Throwable -> La6
            monitor-enter(r4)     // Catch: java.lang.Throwable -> La6
            goto L2e
        L2c:
            r5 = 0
            goto L28
        L2e:
            boolean r0 = r12.A00     // Catch: java.lang.Throwable -> La3
            r9 = 0
            if (r0 == 0) goto L42
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L3e
            r7.clear()     // Catch: java.lang.Throwable -> La3
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r12.A00 = r9     // Catch: java.lang.Throwable -> La3
            r9 = r0
        L42:
            java.util.Map r3 = r12.A02     // Catch: java.lang.Throwable -> La3
            java.util.Set r0 = r3.entrySet()     // Catch: java.lang.Throwable -> La3
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> La3
        L4c:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> La3
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> La3
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La3
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> La3
            if (r1 == r12) goto L7d
            if (r1 == 0) goto L7d
            boolean r0 = r7.containsKey(r2)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L79
            java.lang.Object r0 = r7.get(r2)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L79
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L79
            goto L4c
        L79:
            r7.put(r2, r1)     // Catch: java.lang.Throwable -> La3
            goto L86
        L7d:
            boolean r0 = r7.containsKey(r2)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L4c
            r7.remove(r2)     // Catch: java.lang.Throwable -> La3
        L86:
            if (r11 == 0) goto L8b
            r5.add(r2)     // Catch: java.lang.Throwable -> La3
        L8b:
            r9 = 1
            goto L4c
        L8d:
            r3.clear()     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto L99
            long r2 = r8.A01     // Catch: java.lang.Throwable -> La3
            r0 = 1
            long r2 = r2 + r0
            r8.A01 = r2     // Catch: java.lang.Throwable -> La3
        L99:
            long r1 = r8.A01     // Catch: java.lang.Throwable -> La3
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La6
            X.0MH r0 = new X.0MH
            r0.<init>(r1, r5, r7)
            return r0
        La3:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La3
            throw r0     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MG.A00():X.0MH");
    }

    public final void A01(C0MH c0mh) {
        List list = c0mh.A01;
        if (list == null || list.size() == 0) {
            return;
        }
        SharedPreferencesC004602c sharedPreferencesC004602c = this.A03;
        synchronized (sharedPreferencesC004602c.A0A) {
            Map map = sharedPreferencesC004602c.A0D;
            if (map.isEmpty()) {
                return;
            }
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                String str = (String) list.get(size);
                Map map2 = (Map) map.get(str);
                if (map2 != null) {
                    A02(map2, str);
                }
                Map map3 = (Map) map.get(sharedPreferencesC004602c.A0C);
                if (map3 != null) {
                    A02(map3, str);
                }
            }
        }
    }

    public final void A02(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            ((Handler) entry.getValue()).post(new RunnableEBaseShape0S1200000_I0(this, str, entry.getKey(), 15));
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        C0MH A00 = A00();
        this.A03.A01(A00, false);
        A01(A00);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        synchronized (this.A01) {
            this.A00 = true;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        C0MH A00 = A00();
        this.A03.A01(A00, true);
        try {
            A00.A03.await();
            A01(A00);
            return A00.A04;
        } catch (InterruptedException e) {
            Log.e("LightSharedPreferencesImpl/Commit: Got exception:", e);
            return false;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.A01) {
            this.A02.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.A01) {
            this.A02.put(str, Float.valueOf(f));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.A01) {
            this.A02.put(str, Integer.valueOf(i));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.A01) {
            this.A02.put(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.A01) {
            this.A02.put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this.A01) {
            this.A02.put(str, set == null ? null : new HashSet(set));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        synchronized (this.A01) {
            this.A02.put(str, this);
        }
        return this;
    }
}
