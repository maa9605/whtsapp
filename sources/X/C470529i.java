package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

/* renamed from: X.29i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C470529i {
    public static volatile C470529i A04;
    public final C001200o A00;
    public final C000500h A01;
    public final AnonymousClass011 A02;
    public final InterfaceC002901k A03;

    public C470529i(C001200o c001200o, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C000500h c000500h) {
        this.A00 = c001200o;
        this.A03 = interfaceC002901k;
        this.A02 = anonymousClass011;
        this.A01 = c000500h;
    }

    public final void A00() {
        ActivityManager activityManager = (ActivityManager) this.A00.A00.getSystemService("activity");
        if (activityManager == null) {
            Log.e("Android11ExitReasonReporter Could not get activity manager");
            return;
        }
        ListIterator<ApplicationExitInfo> listIterator = activityManager.getHistoricalProcessExitReasons(null, 0, 100).listIterator();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        C000500h c000500h = this.A01;
        SharedPreferences sharedPreferences = c000500h.A00;
        long j = sharedPreferences.getLong("last_exit_reason_sync_timestamp", -1L);
        while (listIterator.hasNext()) {
            ApplicationExitInfo next = listIterator.next();
            if (next.getTimestamp() <= j) {
                break;
            }
            arrayList.add(next);
            Integer valueOf = Integer.valueOf(next.getReason());
            if (hashMap.containsKey(valueOf)) {
                hashMap.put(valueOf, Integer.valueOf(((Number) hashMap.get(valueOf)).intValue() + 1));
            } else {
                hashMap.put(valueOf, 1);
            }
        }
        ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
        while (listIterator2.hasPrevious()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) listIterator2.previous();
            C36831lR c36831lR = new C36831lR();
            c36831lR.A00 = Boolean.valueOf(ActivityManager.isLowMemoryKillReportSupported());
            c36831lR.A01 = Double.valueOf(applicationExitInfo.getPss());
            c36831lR.A04 = Long.valueOf(applicationExitInfo.getReason());
            c36831lR.A07 = applicationExitInfo.getDescription();
            c36831lR.A05 = Long.valueOf(applicationExitInfo.getTimestamp());
            c36831lR.A02 = Double.valueOf(applicationExitInfo.getRss());
            c36831lR.A06 = Long.valueOf(applicationExitInfo.getStatus());
            c36831lR.A03 = Long.valueOf(applicationExitInfo.getImportance());
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream != null) {
                    while (new BufferedReader(new InputStreamReader(traceInputStream)).readLine() != null) {
                    }
                }
            } catch (IOException e) {
                Log.e("Android11ExitReasonReporter/could not get exit info", e);
            }
            this.A02.A0B(c36831lR, null, false);
            C000200d.A0h(c000500h, "last_exit_reason_sync_timestamp", applicationExitInfo.getTimestamp());
        }
        C36841lS c36841lS = new C36841lS();
        c36841lS.A01 = hashMap.toString();
        c36841lS.A00 = Long.valueOf(sharedPreferences.getLong("last_exit_reason_sync_timestamp", -1L));
        this.A02.A0B(c36841lS, null, false);
    }
}
