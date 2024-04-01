package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0E5  reason: invalid class name */
/* loaded from: classes.dex */
public class C0E5 {
    public static volatile C0E5 A08;
    public boolean A00;
    public boolean A01;
    public final Handler A02;
    public final C0E6 A03;
    public final AnonymousClass012 A04;
    public final C0J5 A05;
    public final Map A06;
    public final Map A07;

    public C0E5(AnonymousClass012 anonymousClass012, C0E6 c0e6) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A06 = new HashMap();
        this.A07 = new HashMap();
        this.A05 = new C0J5(10L, 610L);
        this.A04 = anonymousClass012;
        this.A02 = handler;
        this.A03 = c0e6;
    }

    public static C0E5 A00() {
        if (A08 == null) {
            synchronized (C0E5.class) {
                if (A08 == null) {
                    A08 = new C0E5(AnonymousClass012.A00(), C0E6.A00());
                }
            }
        }
        return A08;
    }

    public synchronized void A01() {
        if (this.A01) {
            this.A01 = false;
            this.A00 = false;
            this.A05.A02();
            A02();
        }
    }

    public final synchronized void A02() {
        Map map = this.A07;
        if (!map.isEmpty()) {
            long A04 = this.A04.A04();
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                if (((Boolean) entry.getValue()).booleanValue()) {
                    arrayList2.add(entry.getKey());
                }
                this.A06.put(entry.getKey(), Pair.create(Long.valueOf(A04), entry.getValue()));
            }
            this.A03.A00.A01(new BulkGetPreKeyJob((DeviceJid[]) arrayList.toArray(new DeviceJid[0]), arrayList2.isEmpty() ? null : (DeviceJid[]) arrayList2.toArray(new DeviceJid[0]), 9));
            map.clear();
            this.A00 = false;
        }
    }

    public synchronized void A03(DeviceJid[] deviceJidArr, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("prekeysmanager/getprekeys request for jids:");
        sb.append(Arrays.toString(deviceJidArr));
        Log.i(sb.toString());
        AnonymousClass012 anonymousClass012 = this.A04;
        long A04 = anonymousClass012.A04();
        Map map = this.A06;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Pair) ((Map.Entry) it.next()).getValue()).first).longValue() + 60000 < A04) {
                it.remove();
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long A042 = anonymousClass012.A04();
        for (DeviceJid deviceJid : deviceJidArr) {
            if (!map.containsKey(deviceJid)) {
                arrayList.add(deviceJid);
                map.put(deviceJid, Pair.create(Long.valueOf(A042), Boolean.valueOf(z)));
                if (z) {
                    arrayList2.add(deviceJid);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.A03.A00.A01(new BulkGetPreKeyJob((DeviceJid[]) arrayList.toArray(new DeviceJid[0]), arrayList2.isEmpty() ? null : (DeviceJid[]) arrayList2.toArray(new DeviceJid[0]), i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prekeysmanager/sending getprekeys for jids:");
            sb2.append(Arrays.toString(deviceJidArr));
            Log.i(sb2.toString());
        }
        A01();
    }
}
