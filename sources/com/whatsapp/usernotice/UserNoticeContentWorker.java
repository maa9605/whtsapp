package com.whatsapp.usernotice;

import X.AbstractC09650eU;
import X.AnonymousClass024;
import X.AnonymousClass035;
import X.C02180Ae;
import X.C09640eT;
import X.C0C5;
import X.C0JL;
import X.C0OF;
import X.C1VE;
import X.C1VF;
import X.C40781sr;
import X.C40791ss;
import X.C40811su;
import X.C41451tw;
import X.C41921uj;
import X.C41941ul;
import android.content.Context;
import android.net.TrafficStats;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class UserNoticeContentWorker extends Worker {
    public final C41451tw A00;
    public final AnonymousClass035 A01;
    public final C41921uj A02;
    public final C41941ul A03;

    public UserNoticeContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A03 = c0c5.A1j();
        this.A01 = c0c5.A1d();
        this.A00 = c0c5.A17();
        this.A02 = c0c5.A1i();
    }

    @Override // androidx.work.Worker
    public AbstractC09650eU A03() {
        String str;
        C0OF c0of = super.A01.A01;
        int A02 = c0of.A02("notice_id");
        Object obj = c0of.A00.get("url");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (A02 != -1 && str != null) {
            if (super.A01.A00 > 4) {
                this.A03.A02(2);
                return new C1VE();
            }
            TrafficStats.setThreadStatsTag(16);
            try {
                C0JL c0jl = (C0JL) this.A00.A01().A01(str, this.A01, null);
                try {
                    if (c0jl.A6H() != 200) {
                        this.A03.A02(2);
                        C09640eT c09640eT = new C09640eT();
                        c0jl.A01.disconnect();
                        return c09640eT;
                    }
                    byte[] A0o = AnonymousClass024.A0o(c0jl.AAe());
                    C40781sr A0X = C02180Ae.A0X(A02, new ByteArrayInputStream(A0o));
                    if (A0X == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("UserNoticeContentManager/storeUserNoticeContent/cannot parse response for notice: ");
                        sb.append(A02);
                        Log.i(sb.toString());
                        this.A03.A02(3);
                        C09640eT c09640eT2 = new C09640eT();
                        c0jl.A01.disconnect();
                        return c09640eT2;
                    }
                    if (!this.A02.A08(A02, "content.json", new ByteArrayInputStream(A0o))) {
                        C09640eT c09640eT3 = new C09640eT();
                        c0jl.A01.disconnect();
                        return c09640eT3;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C40791ss c40791ss = A0X.A02;
                    if (c40791ss != null) {
                        arrayList.add("banner_icon_light.png");
                        arrayList2.add(c40791ss.A03);
                        arrayList.add("banner_icon_dark.png");
                        arrayList2.add(c40791ss.A02);
                    }
                    C40811su c40811su = A0X.A04;
                    if (c40811su != null) {
                        arrayList.add("modal_icon_light.png");
                        arrayList2.add(c40811su.A06);
                        arrayList.add("modal_icon_dark.png");
                        arrayList2.add(c40811su.A05);
                    }
                    C40811su c40811su2 = A0X.A03;
                    if (c40811su2 != null) {
                        arrayList.add("blocking_modal_icon_light.png");
                        arrayList2.add(c40811su2.A06);
                        arrayList.add("blocking_modal_icon_dark.png");
                        arrayList2.add(c40811su2.A05);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("file_name_list", arrayList.toArray(new String[0]));
                    hashMap.put("url_list", arrayList2.toArray(new String[0]));
                    C0OF c0of2 = new C0OF(hashMap);
                    C0OF.A01(c0of2);
                    C1VF c1vf = new C1VF(c0of2);
                    c0jl.A01.disconnect();
                    return c1vf;
                } finally {
                }
            } catch (IOException e) {
                Log.e("UserNoticeContentWorker/doWork/fetch failed ", e);
                this.A03.A02(2);
                return new C1VE();
            } finally {
                TrafficStats.clearThreadStatsTag();
            }
        } else {
            this.A03.A02(2);
            return new C1VE();
        }
    }
}
