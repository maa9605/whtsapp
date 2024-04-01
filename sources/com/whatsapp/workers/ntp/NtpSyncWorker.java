package com.whatsapp.workers.ntp;

import X.AbstractC09650eU;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.C01H;
import X.C0C5;
import X.C42011us;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes2.dex */
public class NtpSyncWorker extends Worker {
    public static volatile long A04;
    public C42011us A00;
    public final Context A01;
    public final AnonymousClass012 A02;
    public final C01H A03;

    public NtpSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A01 = context;
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A00 = c0c5.A1s();
        this.A03 = c0c5.A14();
        this.A02 = c0c5.A0d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|(11:154|155|(1:157)|11|12|13|14|15|16|(3:17|(4:19|20|21|(18:23|(2:25|(1:27)(1:28))|29|30|31|32|d3|40|(1:42)|(1:44)|45|(1:47)|48|(1:50)|51|52|53|(3:55|(1:57)|58)(0))(1:126))(2:146|147)|137)|(4:60|61|62|(2:64|65)(2:66|67))(7:68|(4:70|(1:72)|73|(2:75|(2:77|78)(1:79))(2:80|(4:102|(1:104)(1:111)|105|(1:107)(2:108|(1:110)))(6:84|(1:86)(5:92|(1:94)(2:95|(2:97|(2:99|100))(1:101))|88|(1:90)|91)|87|88|(0)|91)))|112|(2:114|(1:116)(1:117))|118|62|(0)(0)))|10|11|12|13|14|15|16|(3:17|(0)(0)|137)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f7, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f8, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("NtpSyncWorker/sync; unable to resolve ntp server ");
        r1.append(r4);
        com.whatsapp.util.Log.w(r1.toString(), r2);
        r2 = new X.C09640eT();
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0268 A[Catch: all -> 0x0333, TryCatch #8 {all -> 0x0333, blocks: (B:17:0x0054, B:18:0x0057, B:19:0x0066, B:20:0x0073, B:22:0x0079, B:71:0x019f, B:73:0x01a3, B:75:0x01a7, B:86:0x01bb, B:87:0x01d6, B:89:0x01da, B:91:0x01e1, B:92:0x01e8, B:130:0x02b5, B:97:0x021c, B:98:0x0223, B:102:0x022f, B:104:0x0237, B:116:0x025e, B:118:0x0268, B:119:0x026d, B:105:0x023d, B:107:0x0243, B:108:0x0246, B:115:0x0259, B:113:0x0252, B:120:0x027e, B:122:0x0289, B:123:0x028e, B:125:0x0294, B:127:0x02a6, B:129:0x02ac, B:126:0x029d, B:131:0x02c4, B:133:0x02c8, B:135:0x02e4, B:136:0x02f6, B:60:0x016d, B:67:0x0191, B:69:0x0195, B:70:0x0198, B:65:0x018d, B:138:0x02f8, B:23:0x007f, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:56:0x0150, B:30:0x00a6, B:32:0x00c8, B:33:0x00d3, B:38:0x00eb, B:39:0x00ec, B:44:0x0104, B:46:0x0115, B:47:0x011b, B:49:0x0128, B:50:0x0137, B:52:0x014c, B:53:0x014d, B:55:0x014f, B:57:0x0151, B:59:0x0153, B:64:0x0173), top: B:159:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: all -> 0x0333, TRY_LEAVE, TryCatch #8 {all -> 0x0333, blocks: (B:17:0x0054, B:18:0x0057, B:19:0x0066, B:20:0x0073, B:22:0x0079, B:71:0x019f, B:73:0x01a3, B:75:0x01a7, B:86:0x01bb, B:87:0x01d6, B:89:0x01da, B:91:0x01e1, B:92:0x01e8, B:130:0x02b5, B:97:0x021c, B:98:0x0223, B:102:0x022f, B:104:0x0237, B:116:0x025e, B:118:0x0268, B:119:0x026d, B:105:0x023d, B:107:0x0243, B:108:0x0246, B:115:0x0259, B:113:0x0252, B:120:0x027e, B:122:0x0289, B:123:0x028e, B:125:0x0294, B:127:0x02a6, B:129:0x02ac, B:126:0x029d, B:131:0x02c4, B:133:0x02c8, B:135:0x02e4, B:136:0x02f6, B:60:0x016d, B:67:0x0191, B:69:0x0195, B:70:0x0198, B:65:0x018d, B:138:0x02f8, B:23:0x007f, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:56:0x0150, B:30:0x00a6, B:32:0x00c8, B:33:0x00d3, B:38:0x00eb, B:39:0x00ec, B:44:0x0104, B:46:0x0115, B:47:0x011b, B:49:0x0128, B:50:0x0137, B:52:0x014c, B:53:0x014d, B:55:0x014f, B:57:0x0151, B:59:0x0153, B:64:0x0173), top: B:159:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195 A[Catch: all -> 0x0333, TryCatch #8 {all -> 0x0333, blocks: (B:17:0x0054, B:18:0x0057, B:19:0x0066, B:20:0x0073, B:22:0x0079, B:71:0x019f, B:73:0x01a3, B:75:0x01a7, B:86:0x01bb, B:87:0x01d6, B:89:0x01da, B:91:0x01e1, B:92:0x01e8, B:130:0x02b5, B:97:0x021c, B:98:0x0223, B:102:0x022f, B:104:0x0237, B:116:0x025e, B:118:0x0268, B:119:0x026d, B:105:0x023d, B:107:0x0243, B:108:0x0246, B:115:0x0259, B:113:0x0252, B:120:0x027e, B:122:0x0289, B:123:0x028e, B:125:0x0294, B:127:0x02a6, B:129:0x02ac, B:126:0x029d, B:131:0x02c4, B:133:0x02c8, B:135:0x02e4, B:136:0x02f6, B:60:0x016d, B:67:0x0191, B:69:0x0195, B:70:0x0198, B:65:0x018d, B:138:0x02f8, B:23:0x007f, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:56:0x0150, B:30:0x00a6, B:32:0x00c8, B:33:0x00d3, B:38:0x00eb, B:39:0x00ec, B:44:0x0104, B:46:0x0115, B:47:0x011b, B:49:0x0128, B:50:0x0137, B:52:0x014c, B:53:0x014d, B:55:0x014f, B:57:0x0151, B:59:0x0153, B:64:0x0173), top: B:159:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bb A[Catch: all -> 0x0333, TryCatch #8 {all -> 0x0333, blocks: (B:17:0x0054, B:18:0x0057, B:19:0x0066, B:20:0x0073, B:22:0x0079, B:71:0x019f, B:73:0x01a3, B:75:0x01a7, B:86:0x01bb, B:87:0x01d6, B:89:0x01da, B:91:0x01e1, B:92:0x01e8, B:130:0x02b5, B:97:0x021c, B:98:0x0223, B:102:0x022f, B:104:0x0237, B:116:0x025e, B:118:0x0268, B:119:0x026d, B:105:0x023d, B:107:0x0243, B:108:0x0246, B:115:0x0259, B:113:0x0252, B:120:0x027e, B:122:0x0289, B:123:0x028e, B:125:0x0294, B:127:0x02a6, B:129:0x02ac, B:126:0x029d, B:131:0x02c4, B:133:0x02c8, B:135:0x02e4, B:136:0x02f6, B:60:0x016d, B:67:0x0191, B:69:0x0195, B:70:0x0198, B:65:0x018d, B:138:0x02f8, B:23:0x007f, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:56:0x0150, B:30:0x00a6, B:32:0x00c8, B:33:0x00d3, B:38:0x00eb, B:39:0x00ec, B:44:0x0104, B:46:0x0115, B:47:0x011b, B:49:0x0128, B:50:0x0137, B:52:0x014c, B:53:0x014d, B:55:0x014f, B:57:0x0151, B:59:0x0153, B:64:0x0173), top: B:159:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d6 A[Catch: all -> 0x0333, TryCatch #8 {all -> 0x0333, blocks: (B:17:0x0054, B:18:0x0057, B:19:0x0066, B:20:0x0073, B:22:0x0079, B:71:0x019f, B:73:0x01a3, B:75:0x01a7, B:86:0x01bb, B:87:0x01d6, B:89:0x01da, B:91:0x01e1, B:92:0x01e8, B:130:0x02b5, B:97:0x021c, B:98:0x0223, B:102:0x022f, B:104:0x0237, B:116:0x025e, B:118:0x0268, B:119:0x026d, B:105:0x023d, B:107:0x0243, B:108:0x0246, B:115:0x0259, B:113:0x0252, B:120:0x027e, B:122:0x0289, B:123:0x028e, B:125:0x0294, B:127:0x02a6, B:129:0x02ac, B:126:0x029d, B:131:0x02c4, B:133:0x02c8, B:135:0x02e4, B:136:0x02f6, B:60:0x016d, B:67:0x0191, B:69:0x0195, B:70:0x0198, B:65:0x018d, B:138:0x02f8, B:23:0x007f, B:25:0x0083, B:27:0x0094, B:29:0x0098, B:56:0x0150, B:30:0x00a6, B:32:0x00c8, B:33:0x00d3, B:38:0x00eb, B:39:0x00ec, B:44:0x0104, B:46:0x0115, B:47:0x011b, B:49:0x0128, B:50:0x0137, B:52:0x014c, B:53:0x014d, B:55:0x014f, B:57:0x0151, B:59:0x0153, B:64:0x0173), top: B:159:0x0054 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.AbstractC09650eU A00(X.C42011us r20, android.content.Context r21, X.C01H r22, X.AnonymousClass012 r23) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.workers.ntp.NtpSyncWorker.A00(X.1us, android.content.Context, X.01H, X.012):X.0eU");
    }

    @Override // androidx.work.Worker
    public AbstractC09650eU A03() {
        return A00(this.A00, this.A01, this.A03, this.A02);
    }
}
