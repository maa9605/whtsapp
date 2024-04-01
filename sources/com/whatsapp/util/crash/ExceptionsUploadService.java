package com.whatsapp.util.crash;

import X.AbstractServiceC05030Na;
import X.AbstractServiceC50442Rt;
import X.AnonymousClass024;
import X.C002601h;
import X.C72693aR;
import X.C72713aT;
import X.C72723aU;
import X.C72733aV;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes2.dex */
public class ExceptionsUploadService extends AbstractServiceC50442Rt {
    public C002601h A00;
    public C72693aR A01;
    public C72713aT A02;
    public C72723aU A03;
    public C72733aV A04;

    public static File A01(Context context, File file) {
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            name = "source";
        }
        return AnonymousClass024.A07(file, name, context.getFilesDir());
    }

    public static void A02(Context context, boolean z) {
        Intent intent = new Intent(context, ExceptionsUploadService.class);
        intent.putExtra("app_version_changed", z);
        AbstractServiceC05030Na.A00(context, ExceptionsUploadService.class, 1, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:481:0x031d, code lost:
        r14.group(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x032a, code lost:
        if ("com.whatsapp".equals(r14.group(r13)) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x032c, code lost:
        r4 = r12.A01.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0332, code lost:
        if (r4 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0338, code lost:
        if (r4.isRoaming() != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x033a, code lost:
        r14 = r12.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x033e, code lost:
        monitor-enter(X.C40001rG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x033f, code lost:
        if (r14 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0343, code lost:
        monitor-enter(X.C01B.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0344, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0357, code lost:
        if ((new java.util.Random().nextInt(100) + 1) <= r14.A07(X.C01C.A2l)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0359, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x035a, code lost:
        monitor-exit(X.C01B.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x035b, code lost:
        monitor-exit(X.C40001rG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x035c, code lost:
        if (r6 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x035e, code lost:
        r6 = false;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0376, code lost:
        r12.A07.A00.A0A(true, false, false, false, new java.util.HashSet(java.util.Collections.singletonList("anr")), A01(r12.A02.A00, r8), "android_anr");
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0388, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0389, code lost:
        if (r18 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x038c, code lost:
        r7.A0D().putLong("anr_file_timestamp", r1).apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0398, code lost:
        r8.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x039b, code lost:
        r13 = r12.A04.A02();
        r8 = r8.getName();
        r7 = new X.C36751lJ();
        r1 = r8.indexOf("_");
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x03b1, code lost:
        if (r1 > 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x03b4, code lost:
        r1 = r8.substring(r6 == true ? 1 : 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x03b9, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x03bb, code lost:
        if (r1 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x03bd, code lost:
        r7.A03 = r1;
        r2 = r1.length() + 1;
        r1 = r8.indexOf(".", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x03ca, code lost:
        if (r1 < 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x03cc, code lost:
        r2 = r8.substring(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x03d0, code lost:
        if (r2 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x03d6, code lost:
        if (r13.containsKey(r2) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x03d8, code lost:
        r7.A02 = X.C002601h.A01((java.io.File) r13.get(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x03e4, code lost:
        r7.A00 = 6;
        r7.A01 = 1L;
        r7.A05 = "anr";
        r12.A05.A0B(r7, null, true);
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0401, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0405, code lost:
        r6 = false;
        com.whatsapp.util.Log.i("ANRExceptionUploadHelper/roamingorunknown/skip");
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x040c, code lost:
        r6 = false;
        r7.A0D().putLong("anr_file_timestamp", r1).apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0419, code lost:
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x041c, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0423, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x042c, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x042d, code lost:
        com.whatsapp.util.Log.e("ANRExceptionUploadHelper/failed ", r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v30 */
    @Override // X.AbstractServiceC05030Na
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 1847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.crash.ExceptionsUploadService.A05(android.content.Intent):void");
    }
}
