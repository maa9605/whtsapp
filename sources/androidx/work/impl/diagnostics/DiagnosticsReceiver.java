package androidx.work.impl.diagnostics;

import X.AbstractC16430qO;
import X.C0OJ;
import X.C0OM;
import X.C0OO;
import X.C0OP;
import X.C0OR;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = AbstractC16430qO.A01("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC16430qO A002 = AbstractC16430qO.A00();
        String str = A00;
        A002.A02(str, "Requesting diagnostics", new Throwable[0]);
        try {
            C0OP A003 = C0OP.A00(context);
            C0OM A004 = new C0OJ(DiagnosticsWorker.class).A00();
            if (A003 != null) {
                List singletonList = Collections.singletonList(A004);
                if (!singletonList.isEmpty()) {
                    new C0OR(A003, null, C0OO.KEEP, singletonList, null).A02();
                    return;
                }
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            throw null;
        } catch (IllegalStateException e) {
            AbstractC16430qO.A00().A03(str, "WorkManager is not initialized", e);
        }
    }
}
