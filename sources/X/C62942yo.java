package X;

import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import java.util.concurrent.FutureTask;

/* renamed from: X.2yo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62942yo {
    public boolean A00;
    public final AbstractC000600i A01;
    public final C012005w A02;
    public final C0E3 A03;
    public final C01B A04;
    public final C0EL A05;
    public final C000400f A06;
    public final C003701t A07;
    public final C04000Ia A08;
    public final C0HW A09;
    public final C04140Is A0A;
    public final C41571uA A0B;
    public final C43221x3 A0C;
    public final C43211x2 A0D;
    public final C04010Ib A0E;
    public final C06350Ss A0F;
    public final C0IY A0G;
    public final C43101wr A0H;
    public final C41961un A0I;
    public final InterfaceC002901k A0J;
    public final URL A0K;

    public C62942yo(C003701t c003701t, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C012005w c012005w, C0HW c0hw, C01B c01b, C0IY c0iy, C41961un c41961un, C0E3 c0e3, C43101wr c43101wr, C000400f c000400f, C41571uA c41571uA, C04000Ia c04000Ia, URL url, C04010Ib c04010Ib, C06350Ss c06350Ss, C0EL c0el, C04140Is c04140Is, C43221x3 c43221x3, C43211x2 c43211x2) {
        this.A07 = c003701t;
        this.A01 = abstractC000600i;
        this.A0J = interfaceC002901k;
        this.A02 = c012005w;
        this.A09 = c0hw;
        this.A04 = c01b;
        this.A0G = c0iy;
        this.A0I = c41961un;
        this.A03 = c0e3;
        this.A0H = c43101wr;
        this.A06 = c000400f;
        this.A0B = c41571uA;
        this.A08 = c04000Ia;
        this.A0K = url;
        this.A0E = c04010Ib;
        this.A0F = c06350Ss;
        this.A05 = c0el;
        this.A0A = c04140Is;
        this.A0C = c43221x3;
        this.A0D = c43211x2;
    }

    public static C04020Ic A00(C04010Ib c04010Ib, File file, File file2, URL url, C62932yn c62932yn, String str, String str2, C43221x3 c43221x3) {
        int A01 = C40841sx.A01(c04010Ib, file2, url, c62932yn, str);
        FutureTask futureTask = ((C0CH) c43221x3).A02;
        if (futureTask.isCancelled()) {
            return new C04020Ic(13, null, false);
        }
        if (A01 != 0) {
            return new C04020Ic(A01, null, true);
        }
        if (file.equals(file2)) {
            return new C04020Ic(0, c62932yn.A02, true, null);
        }
        int A02 = C40841sx.A02(c04010Ib, str2, url);
        if (futureTask.isCancelled()) {
            return new C04020Ic(13, null, false);
        }
        if (A02 != 0) {
            if (A02 != 1) {
                if (A02 == 2) {
                    return new C04020Ic(7, null, true);
                }
                throw new AssertionError("unknown result encountered in switch");
            }
            return new C04020Ic(1, null, true);
        }
        String str3 = c04010Ib.A0E;
        String str4 = "enc";
        if (str3 != null) {
            String A0T = C41961un.A0T(str3);
            if (!TextUtils.isEmpty(A0T)) {
                str4 = A0T;
            }
        }
        return new C04020Ic(0, str4, true, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x034f, code lost:
        if (r3 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0206, code lost:
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0222, code lost:
        if (r2.A04(r2, r10, false, r37, r4.A03, r4.A0Q, r4.A0P) != false) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0570 A[Catch: all -> 0x05d2, TRY_LEAVE, TryCatch #33 {all -> 0x05d2, blocks: (B:259:0x0560, B:261:0x0570, B:273:0x059d), top: B:488:0x0560 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x059d A[Catch: all -> 0x05d2, TRY_ENTER, TRY_LEAVE, TryCatch #33 {all -> 0x05d2, blocks: (B:259:0x0560, B:261:0x0570, B:273:0x059d), top: B:488:0x0560 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0688 A[Catch: all -> 0x07f1, TRY_LEAVE, TryCatch #53 {all -> 0x07f1, blocks: (B:16:0x0097, B:17:0x0099, B:42:0x0162, B:44:0x0168, B:58:0x01d6, B:60:0x01dc, B:398:0x073b, B:400:0x0741, B:353:0x06a8, B:355:0x06ae, B:167:0x042b, B:169:0x0431, B:407:0x0778, B:409:0x077e, B:416:0x07a2, B:418:0x07a8, B:340:0x0682, B:342:0x0688, B:308:0x061a, B:310:0x0620, B:266:0x058a, B:268:0x0590, B:278:0x05b6, B:280:0x05bc, B:181:0x0458, B:183:0x045e, B:218:0x050e, B:220:0x0514, B:389:0x06f3, B:391:0x06f9, B:429:0x07c1, B:18:0x00a3, B:25:0x00b5, B:27:0x00bb, B:41:0x015f, B:372:0x06cf, B:57:0x01d3, B:397:0x0707, B:352:0x06a5, B:166:0x0428, B:406:0x074f, B:415:0x078c, B:339:0x067f, B:307:0x0617, B:265:0x0587, B:277:0x05b3, B:180:0x0455, B:217:0x050b, B:388:0x06e9), top: B:504:0x0097, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0741 A[Catch: all -> 0x07f1, TRY_LEAVE, TryCatch #53 {all -> 0x07f1, blocks: (B:16:0x0097, B:17:0x0099, B:42:0x0162, B:44:0x0168, B:58:0x01d6, B:60:0x01dc, B:398:0x073b, B:400:0x0741, B:353:0x06a8, B:355:0x06ae, B:167:0x042b, B:169:0x0431, B:407:0x0778, B:409:0x077e, B:416:0x07a2, B:418:0x07a8, B:340:0x0682, B:342:0x0688, B:308:0x061a, B:310:0x0620, B:266:0x058a, B:268:0x0590, B:278:0x05b6, B:280:0x05bc, B:181:0x0458, B:183:0x045e, B:218:0x050e, B:220:0x0514, B:389:0x06f3, B:391:0x06f9, B:429:0x07c1, B:18:0x00a3, B:25:0x00b5, B:27:0x00bb, B:41:0x015f, B:372:0x06cf, B:57:0x01d3, B:397:0x0707, B:352:0x06a5, B:166:0x0428, B:406:0x074f, B:415:0x078c, B:339:0x067f, B:307:0x0617, B:265:0x0587, B:277:0x05b3, B:180:0x0455, B:217:0x050b, B:388:0x06e9), top: B:504:0x0097, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01af A[Catch: all -> 0x06bf, TRY_LEAVE, TryCatch #21 {all -> 0x06bf, blocks: (B:53:0x0187, B:54:0x019c, B:56:0x01af, B:65:0x01e9, B:67:0x01ef, B:69:0x01f4, B:74:0x020a, B:350:0x0698, B:76:0x0224, B:84:0x024c), top: B:472:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9 A[Catch: all -> 0x06bf, TRY_ENTER, TryCatch #21 {all -> 0x06bf, blocks: (B:53:0x0187, B:54:0x019c, B:56:0x01af, B:65:0x01e9, B:67:0x01ef, B:69:0x01f4, B:74:0x020a, B:350:0x0698, B:76:0x0224, B:84:0x024c), top: B:472:0x0187 }] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.security.MessageDigest] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.OutputStream, X.2tX] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C04020Ic A01(java.io.File r49, java.net.URL r50, X.C05080Nf r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 2071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62942yo.A01(java.io.File, java.net.URL, X.0Nf, boolean):X.0Ic");
    }
}
