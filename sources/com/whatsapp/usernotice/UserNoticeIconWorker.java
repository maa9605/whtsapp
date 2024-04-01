package com.whatsapp.usernotice;

import X.AbstractC09650eU;
import X.AnonymousClass029;
import X.AnonymousClass035;
import X.C09640eT;
import X.C0C5;
import X.C0JL;
import X.C0OF;
import X.C1VE;
import X.C1VF;
import X.C41451tw;
import X.C41921uj;
import X.C41941ul;
import android.content.Context;
import android.net.TrafficStats;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public class UserNoticeIconWorker extends Worker {
    public final C41451tw A00;
    public final AnonymousClass035 A01;
    public final C41921uj A02;
    public final C41941ul A03;

    public UserNoticeIconWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A03 = c0c5.A1j();
        this.A01 = c0c5.A1d();
        this.A00 = c0c5.A17();
        this.A02 = c0c5.A1i();
    }

    @Override // androidx.work.Worker
    public AbstractC09650eU A03() {
        String[] strArr;
        String[] strArr2;
        C0OF c0of = super.A01.A01;
        int A02 = c0of.A02("notice_id");
        Object obj = c0of.A00.get("file_name_list");
        if (obj instanceof String[]) {
            strArr = (String[]) obj;
        } else {
            strArr = null;
        }
        Object obj2 = c0of.A00.get("url_list");
        if (obj2 instanceof String[]) {
            strArr2 = (String[]) obj2;
        } else {
            strArr2 = null;
        }
        if (A02 != -1 && strArr != null && strArr2 != null) {
            if (super.A01.A00 > 4) {
                this.A03.A02(4);
                return new C1VE();
            }
            TrafficStats.setThreadStatsTag(16);
            for (int i = 0; i < strArr2.length; i++) {
                try {
                    C0JL c0jl = (C0JL) this.A00.A01().A01(strArr2[i], this.A01, null);
                    try {
                        if (c0jl.A6H() != 200) {
                            this.A03.A02(4);
                            C1VE c1ve = new C1VE();
                            c0jl.A01.disconnect();
                            return c1ve;
                        } else if (!this.A02.A08(A02, strArr[i], c0jl.AAe())) {
                            C09640eT c09640eT = new C09640eT();
                            c0jl.A01.disconnect();
                            return c09640eT;
                        } else {
                            TrafficStats.clearThreadStatsTag();
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    Log.e("UserNoticeContentWorker/doWork/fetch failed ", e);
                    this.A03.A02(4);
                    return new C1VE();
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            }
            return new C1VF();
        }
        this.A03.A02(4);
        return new C1VE();
    }
}
