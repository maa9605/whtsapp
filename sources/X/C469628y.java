package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.28y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C469628y {
    public C468528n A00 = null;
    public Map A01;
    public Set A02;
    public final C0KQ A03;

    public C469628y(C0KQ c0kq) {
        this.A03 = c0kq;
        A01();
    }

    public final void A00() {
        C0KQ c0kq;
        Set<C468528n> set;
        try {
            C468528n c468528n = this.A00;
            if (c468528n != null && c468528n.A02()) {
                c0kq = this.A03;
                c0kq.A02().edit().putString("current_running_sync", this.A00.A01()).apply();
            } else {
                c0kq = this.A03;
                c0kq.A02().edit().remove("current_running_sync").apply();
            }
        } catch (JSONException unused) {
            c0kq = this.A03;
            c0kq.A02().edit().remove("current_running_sync").apply();
        }
        if (this.A02.isEmpty()) {
            c0kq.A02().edit().remove("queued_running_sync_set").apply();
            return;
        }
        HashSet hashSet = new HashSet();
        synchronized (this) {
            set = this.A02;
        }
        for (C468528n c468528n2 : set) {
            try {
                if (c468528n2.A02()) {
                    hashSet.add(c468528n2.A01());
                }
            } catch (JSONException unused2) {
            }
        }
        boolean isEmpty = hashSet.isEmpty();
        SharedPreferences.Editor edit = c0kq.A02().edit();
        if (isEmpty) {
            edit.remove("queued_running_sync_set").apply();
        } else {
            edit.putStringSet("queued_running_sync_set", hashSet).apply();
        }
    }

    public synchronized void A01() {
        this.A02 = new HashSet();
        this.A01 = new HashMap();
    }

    public synchronized void A02(C468528n c468528n, Runnable runnable, long j) {
        this.A02.add(c468528n);
        this.A01.put(c468528n, new AnonymousClass290(runnable, j));
        A00();
    }
}
