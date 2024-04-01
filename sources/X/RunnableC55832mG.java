package X;

import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2mG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC55832mG extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass323 A00;
    public final /* synthetic */ AnonymousClass324 A01;
    public final /* synthetic */ C2SD A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ RunnableC55832mG(AnonymousClass323 anonymousClass323, AnonymousClass324 anonymousClass324, Map map, boolean z, C2SD c2sd) {
        this.A00 = anonymousClass323;
        this.A01 = anonymousClass324;
        this.A03 = map;
        this.A04 = z;
        this.A02 = c2sd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        AnonymousClass323 anonymousClass323 = this.A00;
        AnonymousClass324 anonymousClass324 = this.A01;
        Map map = this.A03;
        boolean z = this.A04;
        C2SD c2sd = this.A02;
        C0HC c0hc = new C0HC("gdrive/backup/selector/download-size-calc");
        try {
            C40171rh c40171rh = anonymousClass324.A01;
            AtomicBoolean atomicBoolean = anonymousClass323.A0F;
            long A02 = c40171rh.A02();
            long j2 = 0;
            if (z) {
                j = A02;
                if (A02 > 0) {
                    c2sd.A00(Boolean.FALSE);
                }
            } else {
                j = 0;
            }
            StringBuilder A0P = C000200d.A0P("gdrive/backup/selector/calc-approx-total-download total size:");
            long j3 = c40171rh.A04;
            A0P.append(j3);
            A0P.append(" dbSize: ");
            A0P.append(A02);
            A0P.append(" includeDbSize: ");
            C000200d.A1V(A0P, z);
            if (j3 < 0) {
                Log.e("gdrive/backup/selector/calc-approx-total-download totalSize is negative.");
            }
            if (A02 < 0) {
                Log.e("gdrive/backup/selector/calc-approx-total-download dbSize is negative.");
            }
            long j4 = j3 - A02;
            C012005w c012005w = anonymousClass323.A01;
            if (c012005w.A0D().exists()) {
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                int i = map.size() < 10 ? 1 : 20;
                int i2 = 0;
                long j5 = 0;
                while (true) {
                    if (i2 < strArr.length) {
                        if (atomicBoolean.get()) {
                            Log.i("gdrive/backup/selector/calc-approx-media-download-size/interrupted");
                            j4 = -1;
                            break;
                        }
                        String str = strArr[i2];
                        if (str == null) {
                            Log.e("gdrive/backup/selector/calc-approx-media-download-size file upload path is null, unexpected.");
                        } else {
                            AbstractC000600i abstractC000600i = anonymousClass323.A00;
                            AnonymousClass034 anonymousClass034 = anonymousClass323.A07;
                            String A06 = C40061rW.A06(abstractC000600i, anonymousClass034, str, anonymousClass323.A08.A00);
                            if (A06 == null) {
                                C000200d.A14("gdrive/backup/selector/calc-approx-media-download-size/no-local-path-mapping ", str);
                            } else {
                                Object obj = map.get(str);
                                if (obj != null) {
                                    C40051rV c40051rV = (C40051rV) obj;
                                    File file = new File(A06);
                                    if (C40061rW.A0J(file, c012005w)) {
                                        if (!file.exists() || file.length() == 0) {
                                            long j6 = c40051rV.A00;
                                            j2 += j6;
                                            j5 += j6;
                                            c2sd.A00(Boolean.FALSE);
                                        } else if (!z) {
                                            j2 += c40051rV.A00;
                                        } else if (i2 % i == 0) {
                                            long j7 = c40051rV.A00;
                                            j2 += j7;
                                            if (AnonymousClass088.A0B(A06, c40051rV, anonymousClass034, anonymousClass323.A09) == 4) {
                                                j5 += j7;
                                                c2sd.A00(Boolean.FALSE);
                                            }
                                        }
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        }
                        i2++;
                    } else if (j2 == 0) {
                        if (j5 > 0) {
                            StringBuilder A0S = C000200d.A0S("gdrive/backup/selector/calc-approx-media-download unexpected situation, how can toBeDownloadedSampleSize=", j5, " be greater than totalSampleSize=");
                            A0S.append(j2);
                            Log.e(A0S.toString());
                        }
                        j4 = 0;
                    } else {
                        j4 = (long) (((j5 * 1.0d) / j2) * j4);
                    }
                }
            }
            long j8 = j + j4;
            c2sd.A00(Boolean.valueOf(j8 == 0));
            long A022 = z ? j8 - c40171rh.A02() : j8;
            RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) anonymousClass323.A0E.get();
            if (restoreFromBackupActivity != null) {
                restoreFromBackupActivity.A1h(j8, A022);
            }
        } catch (C2GU e) {
            Log.e(e);
        }
        c0hc.A01();
    }
}
