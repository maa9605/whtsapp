package X;

import android.text.TextUtils;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2mM */
/* loaded from: classes2.dex */
public class C55892mM {
    public final AbstractC000600i A00;
    public final C012005w A01;
    public final C469829b A02;
    public final C638931g A03;
    public final GoogleBackupService A04;
    public final AbstractC40111rb A05;
    public final C40101ra A06;
    public final AnonymousClass034 A07;
    public final C02F A08;
    public final C000500h A09;
    public final AnonymousClass011 A0A;
    public final C37461mS A0B;
    public final C42701wB A0C;
    public final String A0D;
    public final AtomicLong A0E = new AtomicLong(0);
    public final AtomicLong A0F;
    public final AtomicLong A0G;

    public C55892mM(AbstractC000600i abstractC000600i, C012005w c012005w, AnonymousClass011 anonymousClass011, AnonymousClass034 anonymousClass034, C40101ra c40101ra, C42701wB c42701wB, C02F c02f, C000500h c000500h, C469829b c469829b, String str, C638931g c638931g, GoogleBackupService googleBackupService, C37461mS c37461mS, AtomicLong atomicLong, AtomicLong atomicLong2, AbstractC40111rb abstractC40111rb) {
        this.A00 = abstractC000600i;
        this.A01 = c012005w;
        this.A0A = anonymousClass011;
        this.A07 = anonymousClass034;
        this.A06 = c40101ra;
        this.A0C = c42701wB;
        this.A08 = c02f;
        this.A09 = c000500h;
        this.A0D = str;
        this.A03 = c638931g;
        this.A04 = googleBackupService;
        this.A0F = atomicLong2;
        this.A0G = atomicLong;
        this.A05 = abstractC40111rb;
        this.A02 = c469829b;
        this.A0B = c37461mS;
        c37461mS.A0A = 2;
    }

    public final boolean A00(Map map) {
        int i;
        boolean z;
        boolean z2 = this.A09.A00.getBoolean("gdrive_restore_overwrite_local_files", false);
        HashSet hashSet = new HashSet();
        hashSet.add(this.A01.A0D().getName());
        if (this.A02.A00 == 2) {
            C37461mS c37461mS = this.A0B;
            if (c37461mS == null) {
                throw null;
            }
            c37461mS.A0B = 0L;
        }
        TextUtils.join(",", hashSet);
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        C0HC c0hc = new C0HC("gdrive/restore-media/get-files-to-be-downloaded");
        AtomicReference atomicReference = new AtomicReference(null);
        Set keySet = map.keySet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        CountDownLatch countDownLatch = new CountDownLatch(keySet.size());
        int size = keySet.size();
        if (this.A08.A06()) {
            Iterator it = keySet.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (i2 % 100 == 0) {
                        C000200d.A0t("gdrive/restore-media/get-files-to-be-downloaded ", i2, "/", size);
                    }
                    i2++;
                    if (!this.A05.A00()) {
                        break;
                    }
                    C2GU c2gu = (C2GU) atomicReference.get();
                    if (c2gu != null) {
                        if (c2gu instanceof C2GT) {
                            throw ((C2GT) c2gu);
                        }
                        throw new IllegalStateException(c2gu);
                    }
                    C638931g c638931g = this.A03;
                    long j = i2;
                    long j2 = size;
                    int i3 = c638931g.A01;
                    if (j2 > 0) {
                        i3 = (int) ((100 * j) / j2);
                    }
                    if (i3 != c638931g.A01) {
                        Log.i(String.format(Locale.ENGLISH, "gdrive-service/media-restore-preparation-progress %d/%d (%d%%)", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i3)));
                        c638931g.A01 = i3;
                        synchronized (((AnonymousClass038) c638931g).A00) {
                            Iterator it2 = ((AnonymousClass038) c638931g).A00.iterator();
                            while (true) {
                                C0G5 c0g5 = (C0G5) it2;
                                if (!c0g5.hasNext()) {
                                    break;
                                }
                                ((InterfaceC470229f) c0g5.next()).ALx(c638931g.A01);
                            }
                        }
                    }
                    C40051rV c40051rV = (C40051rV) map.get(str);
                    String A06 = C40061rW.A06(this.A00, this.A07, str, this.A04);
                    if (A06 == null) {
                        StringBuilder sb = new StringBuilder("gdrive/restore-media/get-files-to-be-downloaded/skipping-null-download-path relative path: ");
                        sb.append(str);
                        Log.e(sb.toString());
                        countDownLatch.countDown();
                    } else {
                        File file = new File(A06);
                        Iterator it3 = hashSet.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (str.startsWith((String) it3.next())) {
                                    C55732m6.A02.execute(new RunnableC55852mI(this, atomicBoolean, z2, file, c40051rV, str, synchronizedList, atomicReference, countDownLatch));
                                    break;
                                }
                            } else {
                                TextUtils.join(",", hashSet);
                                countDownLatch.countDown();
                                break;
                            }
                        }
                    }
                } else {
                    C2GU c2gu2 = (C2GU) atomicReference.get();
                    if (c2gu2 != null) {
                        if (c2gu2 instanceof C2GT) {
                            throw ((C2GT) c2gu2);
                        }
                        throw new IllegalStateException(c2gu2);
                    }
                    try {
                        Log.i("gdrive/restore-media/get-files-to-be-downloaded waiting for all files to be processed.");
                        countDownLatch.await();
                        if (atomicBoolean.get()) {
                            StringBuilder A0P = C000200d.A0P("gdrive/restore-media/restore-files/num-files-to-be-downloaded/");
                            A0P.append(synchronizedList.size());
                            Log.i(A0P.toString());
                            c0hc.A01();
                            long j3 = this.A09.A00.getLong("gdrive_already_downloaded_bytes", 0L);
                            this.A0G.set(j3);
                            for (Object obj : synchronizedList) {
                                C40051rV c40051rV2 = (C40051rV) map.get(obj);
                                if (c40051rV2 != null) {
                                    this.A0G.addAndGet(c40051rV2.A00);
                                }
                            }
                            Collections.sort(synchronizedList, new Comparator() { // from class: X.2mA
                                public static final Pattern A00 = Pattern.compile(".*(\\d\\d\\d\\d\\d\\d\\d\\d).*");
                                public static final Pattern A01 = Pattern.compile("WA(\\d\\d\\d\\d)");

                                @Override // java.util.Comparator
                                public int compare(Object obj2, Object obj3) {
                                    int i4;
                                    int i5;
                                    String str2 = (String) obj2;
                                    String str3 = (String) obj3;
                                    Pattern pattern = A00;
                                    Matcher matcher = pattern.matcher(str2);
                                    Matcher matcher2 = pattern.matcher(str3);
                                    int i6 = 0;
                                    if (matcher.find()) {
                                        i4 = Integer.parseInt(matcher.group(1));
                                    } else {
                                        i4 = 0;
                                    }
                                    if (matcher2.find()) {
                                        i5 = Integer.parseInt(matcher2.group(1));
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i4 == i5) {
                                        Pattern pattern2 = A01;
                                        Matcher matcher3 = pattern2.matcher(str2);
                                        Matcher matcher4 = pattern2.matcher(str3);
                                        if (matcher3.find()) {
                                            i4 = Integer.parseInt(matcher3.group(1));
                                        } else {
                                            i4 = 0;
                                        }
                                        if (matcher4.find()) {
                                            i6 = Integer.parseInt(matcher4.group(1));
                                        }
                                    } else {
                                        i6 = i5;
                                    }
                                    return -(i4 - i6);
                                }
                            });
                            C469829b c469829b = this.A02;
                            int A062 = AnonymousClass029.A06(c469829b.A0U, c469829b.A0Q);
                            StringBuilder A0P2 = C000200d.A0P("gdrive-conditions-manager/calc-max-concurrent-reads/network_type=");
                            A0P2.append(c469829b.A00);
                            A0P2.append(", year class = ");
                            A0P2.append(A062);
                            Log.i(A0P2.toString());
                            int i4 = 4;
                            if (c469829b.A00 != 1 || A062 < 2011) {
                                i4 = Math.min(4, 2);
                            }
                            this.A0B.A03 = Double.valueOf(synchronizedList.size());
                            this.A0B.A0D = Long.valueOf(i4);
                            ArrayList arrayList = new ArrayList();
                            AtomicInteger atomicInteger = new AtomicInteger(0);
                            this.A0F.set(j3);
                            this.A0E.set(0L);
                            CountDownLatch countDownLatch2 = new CountDownLatch(synchronizedList.size());
                            AtomicReference atomicReference2 = new AtomicReference(null);
                            C000200d.A0q("gdrive-util/max concurrent reads ", i4);
                            ThreadPoolExecutor A0s = C02180Ae.A0s(0, i4, TimeUnit.SECONDS, "Google Drive Read Worker #");
                            Iterator it4 = synchronizedList.iterator();
                            int i5 = 0;
                            while (it4.hasNext()) {
                                String str2 = (String) it4.next();
                                i5++;
                                if (i5 % 100 == 0) {
                                    StringBuilder A0Q = C000200d.A0Q("gdrive/restore-media/restore-files enqueuing download  ", i5, "/");
                                    A0Q.append(synchronizedList.size());
                                    A0Q.append(": ");
                                    A0Q.append(str2);
                                    Log.i(A0Q.toString());
                                }
                                C40051rV c40051rV3 = (C40051rV) map.get(str2);
                                if (c40051rV3 != null) {
                                    A0s.execute(new RunnableEBaseShape0S1600000_I1(this, c40051rV3, atomicReference2, arrayList, str2, atomicInteger, countDownLatch2, 1));
                                } else {
                                    Log.e("gdrive/restore-media/restore-files resId cannot be null, skipping.");
                                    countDownLatch2.countDown();
                                }
                            }
                            i = 0;
                            try {
                                Log.i("gdrive/restore-media/restore-files waiting for all files to be restored.");
                                countDownLatch2.await();
                                C2GU c2gu3 = (C2GU) atomicReference2.get();
                                if (c2gu3 != null) {
                                    if (!(c2gu3 instanceof C639631n)) {
                                        if (!(c2gu3 instanceof C639531m)) {
                                            if (!(c2gu3 instanceof C640431v)) {
                                                if (!(c2gu3 instanceof C640231t)) {
                                                    if (!(c2gu3 instanceof C639831p)) {
                                                        if (c2gu3 instanceof C2GT) {
                                                            throw ((C2GT) c2gu3);
                                                        }
                                                    } else {
                                                        throw ((C639831p) c2gu3);
                                                    }
                                                } else {
                                                    throw ((C640231t) c2gu3);
                                                }
                                            } else {
                                                throw ((C640431v) c2gu3);
                                            }
                                        } else {
                                            throw ((C639531m) c2gu3);
                                        }
                                    } else {
                                        throw ((C639631n) c2gu3);
                                    }
                                }
                                if (arrayList.size() > 0) {
                                    C000200d.A1W(arrayList, C000200d.A0P("gdrive/restore-media/restore-files/failed-files/"));
                                    AbstractC000600i abstractC000600i = this.A00;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(arrayList.size());
                                    sb2.append(" files ");
                                    sb2.append(" out of total ");
                                    sb2.append(synchronizedList.size());
                                    abstractC000600i.A09("gdrive/restore-media/failed to restore files", sb2.toString(), true);
                                }
                                StringBuilder A0P3 = C000200d.A0P("gdrive/restore-media/restore-files waiting for restore to finish: ");
                                A0P3.append(this.A0F.get());
                                A0P3.append("/");
                                A0P3.append(this.A0G);
                                A0P3.append(" (");
                                A0P3.append(this.A0E.get());
                                A0P3.append(" failed)");
                                Log.i(A0P3.toString());
                                if (this.A0F.get() > 0 || this.A0E.get() > 0) {
                                    this.A03.A0G(this.A0F.get(), this.A0E.get(), this.A0G.get());
                                }
                                z = true;
                            } catch (InterruptedException e) {
                                Log.e(e);
                                z = false;
                            }
                        }
                    } catch (InterruptedException e2) {
                        Log.e(e2);
                    }
                }
            }
        } else {
            throw new C2GT();
        }
        this.A09.A0T(i);
        return z;
        Log.e("gdrive/restore-media/restore-files failed to get list of files to be restored.");
        c0hc.A01();
        z = false;
        i = 0;
        this.A09.A0T(i);
        return z;
    }
}
