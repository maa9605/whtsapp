package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2mJ */
/* loaded from: classes2.dex */
public class C55862mJ {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public final AbstractC000600i A07;
    public final C012005w A08;
    public final C01B A09;
    public final C03310Fe A0A;
    public final C469829b A0B;
    public final C638931g A0C;
    public final GoogleBackupService A0D;
    public final C49792Mk A0E;
    public final AbstractC40111rb A0F;
    public final C40101ra A0G;
    public final AnonymousClass034 A0H;
    public final C001200o A0I;
    public final C02F A0J;
    public final C000500h A0K;
    public final C0CC A0L;
    public final C05E A0M;
    public final AnonymousClass011 A0N;
    public final C0S0 A0O;
    public final C05Y A0P;
    public final AnonymousClass025 A0Q;
    public final String A0R;
    public final List A0S;
    public final AtomicLong A0W;
    public final AtomicLong A0Y;
    public final boolean A0Z;
    public final AtomicLong A0X = new AtomicLong(0);
    public final AtomicInteger A0U = new AtomicInteger(0);
    public final AtomicLong A0V = new AtomicLong(0);
    public final Map A0T = new ConcurrentHashMap();

    public C55862mJ(C001200o c001200o, AbstractC000600i abstractC000600i, final C012005w c012005w, AnonymousClass011 anonymousClass011, AnonymousClass034 anonymousClass034, final C01B c01b, C05Y c05y, C03310Fe c03310Fe, C0CC c0cc, C05E c05e, C49792Mk c49792Mk, C02F c02f, final C000500h c000500h, C469829b c469829b, String str, List list, AtomicLong atomicLong, AtomicLong atomicLong2, C40101ra c40101ra, AbstractC40111rb abstractC40111rb, GoogleBackupService googleBackupService, boolean z, C638931g c638931g, C0S0 c0s0) {
        this.A0I = c001200o;
        this.A0R = str;
        this.A07 = abstractC000600i;
        this.A0S = list;
        this.A08 = c012005w;
        this.A0C = c638931g;
        this.A0N = anonymousClass011;
        this.A0H = anonymousClass034;
        this.A09 = c01b;
        this.A0Y = atomicLong;
        this.A0P = c05y;
        this.A0F = abstractC40111rb;
        this.A0A = c03310Fe;
        this.A0G = c40101ra;
        this.A0Z = z;
        this.A0W = atomicLong2;
        this.A0D = googleBackupService;
        this.A0L = c0cc;
        this.A0M = c05e;
        this.A0E = c49792Mk;
        this.A0J = c02f;
        this.A0K = c000500h;
        this.A0B = c469829b;
        this.A0O = c0s0;
        c0s0.A0B = 2;
        this.A0Q = new AnonymousClass025() { // from class: X.31y
            @Override // X.AnonymousClass025
            public final Object A5q(Object obj) {
                return Boolean.valueOf(C40061rW.A0K((File) obj, c000500h, c01b, c012005w));
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0035, code lost:
        if (r2.A02() != false) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02cb  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.29b] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00() {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55862mJ.A00():void");
    }

    public final void A01(File file, String str) {
        if (this.A0T.get(C40061rW.A07(this.A0H, this.A0I.A00, file)) != null) {
            return;
        }
        StringBuilder sb = new StringBuilder("gdrive/backup/files/");
        sb.append(str);
        sb.append("/cancel-backup");
        Log.e(sb.toString());
        StringBuilder sb2 = new StringBuilder("File ");
        sb2.append(file);
        sb2.append(" not backed up");
        throw new C640331u(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:398:0x01f8, code lost:
        if (r12.length() <= 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:579:0x07b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02() {
        /*
            Method dump skipped, instructions count: 2091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55862mJ.A02():boolean");
    }

    public final boolean A03(List list, AtomicReference atomicReference) {
        if (!this.A0B.A0Y.get()) {
            Log.i("gdrive/backup/cancelled.");
            return true;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            Log.i("gdrive/backup", th);
            if (!(th instanceof C639631n)) {
                if (!(th instanceof C639531m)) {
                    if (!(th instanceof C640031r)) {
                        if (!(th instanceof C639731o)) {
                            if (!(th instanceof C640231t)) {
                                if (!(th instanceof C2GT)) {
                                    if (!(th instanceof C639831p)) {
                                        if (th instanceof C639431l) {
                                            throw th;
                                        }
                                    } else {
                                        throw th;
                                    }
                                } else {
                                    throw th;
                                }
                            } else {
                                throw th;
                            }
                        } else {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                } else {
                    throw th;
                }
            } else {
                throw th;
            }
        }
        AtomicLong atomicLong = this.A0W;
        if (atomicLong.get() > 0) {
            AtomicLong atomicLong2 = this.A0X;
            if ((atomicLong2.get() * 100.0d) / atomicLong.get() > 1.0d) {
                StringBuilder A0P = C000200d.A0P("gdrive/backup/too-many-failures/");
                A0P.append((atomicLong2.get() * 100.0d) / atomicLong.get());
                A0P.append("% bytes");
                Log.i(A0P.toString());
                return true;
            }
        }
        if (list.size() > 0) {
            AtomicInteger atomicInteger = this.A0U;
            if ((atomicInteger.get() * 100.0d) / list.size() > 1.0d) {
                StringBuilder A0P2 = C000200d.A0P("gdrive/backup/too-many-failures/");
                A0P2.append((atomicInteger.get() * 100.0d) / list.size());
                A0P2.append("% files");
                Log.i(A0P2.toString());
                return true;
            }
            return false;
        }
        return false;
    }
}
