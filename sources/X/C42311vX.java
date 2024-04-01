package X;

import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.1vX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42311vX {
    public static final int A08 = 2;
    public static final int A09 = 50;
    public static final int A0A = 100;
    public static final String A0B = "GoogleMigrateIntegrationManager";
    public C3MK A00;
    public C3MS A01;
    public final C42221vO A02;
    public final C42271vT A03;
    public final C42241vQ A04;
    public final C42291vV A05;
    public final C42301vW A06;
    public final C42281vU A07;

    public C42311vX(C42271vT c42271vT, C42281vU c42281vU, C42221vO c42221vO, C42291vV c42291vV, C42241vQ c42241vQ, C42301vW c42301vW) {
        this.A03 = c42271vT;
        this.A07 = c42281vU;
        this.A02 = c42221vO;
        this.A05 = c42291vV;
        this.A04 = c42241vQ;
        this.A06 = c42301vW;
    }

    public static /* synthetic */ int A00(int i, int i2) {
        return ((i + 1) * 50) + ((i2 * 50) / 100);
    }

    public static void A01() {
    }

    public static /* synthetic */ void A02() {
    }

    private synchronized void A03() {
        if (this.A00 == null) {
            C3MK c3mk = new C3MK() { // from class: X.3gA
                @Override // X.C3MK
                public void ANO(int i, int i2) {
                    C42311vX c42311vX = C42311vX.this;
                    int i3 = ((0 + 1) * 50) + ((((i * 100) / i2) * 50) / 100);
                    C000200d.A1F(C000200d.A0R("GoogleMigrateIntegrationManager/filePrefetcherObserver/weighted processed percentage = ", i3, " processed = ", i, "total count = "), i2);
                    c42311vX.A05.A02(i3);
                }
            };
            this.A00 = c3mk;
            this.A04.A00(c3mk);
        }
        if (this.A01 == null) {
            C3MS c3ms = new C3MS() { // from class: X.3gB
                @Override // X.C3MS
                public void AIk() {
                    C42291vV c42291vV = C42311vX.this.A05;
                    synchronized (c42291vV.A00) {
                        Iterator it = c42291vV.A00.iterator();
                        while (true) {
                            C0G5 c0g5 = (C0G5) it;
                            if (c0g5.hasNext()) {
                                ((C3MM) c0g5.next()).AIk();
                            }
                        }
                    }
                }

                @Override // X.C3MS
                public void ANP(long j, long j2) {
                    C42311vX c42311vX = C42311vX.this;
                    int i = ((1 + 1) * 50) + ((((int) ((100 * j) / j2)) * 50) / 100);
                    StringBuilder sb = new StringBuilder("GoogleMigrateIntegrationManager/messageImporterObserver/weighted processed percentage = ");
                    sb.append(i);
                    sb.append(" processed = ");
                    sb.append(j);
                    sb.append("total count = ");
                    sb.append(j2);
                    Log.i(sb.toString());
                    c42311vX.A05.A02(i);
                }
            };
            this.A01 = c3ms;
            A00(c3ms);
        }
    }

    private synchronized void A04() {
        C3MK c3mk = this.A00;
        if (c3mk != null) {
            this.A04.A01(c3mk);
            this.A00 = null;
        }
        C3MS c3ms = this.A01;
        if (c3ms != null) {
            A01(c3ms);
            this.A01 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0.getFileDescriptor() == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05() {
        /*
            r4 = this;
            X.1vO r0 = r4.A02
            if (r0 == 0) goto L57
            X.3oL r3 = r0.A00()     // Catch: java.lang.Throwable -> L3b X.C3W1 -> L42 java.lang.SecurityException -> L44
            android.os.IInterface r0 = r3.A00()     // Catch: java.lang.Throwable -> L34
            com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService r0 = (com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService) r0     // Catch: java.lang.Throwable -> L34
            android.os.ParcelFileDescriptor r0 = r0.AAD()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L1b
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> L34
            r2 = 1
            if (r0 != 0) goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData/hasFileDescriptor = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L34
            r1.append(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L34
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> L34
            r3.close()     // Catch: java.lang.Throwable -> L3b X.C3W1 -> L42 java.lang.SecurityException -> L44
            return
        L34:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L3a
        L3a:
            throw r0     // Catch: java.lang.Throwable -> L3b X.C3W1 -> L42 java.lang.SecurityException -> L44
        L3b:
            r1 = move-exception
            java.lang.String r0 = "GoogleMigrateClient/hasWhatsAppData()"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L42:
            r2 = move-exception
            goto L45
        L44:
            r2 = move-exception
        L45:
            java.lang.String r1 = "GoogleMigrateClient/hasWhatsAppData(): "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            return
        L57:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42311vX.A05():void");
    }

    public void A06() {
        try {
            A03();
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.A03.A06(cancellationSignal);
            this.A07.A06(cancellationSignal);
        } catch (IOException e) {
            Log.e("GoogleMigrateIntegrationManger/importData", e);
            A08(1);
        }
    }

    public void A07() {
        this.A03.A03();
        A04();
    }

    public void A08(int i) {
        C42291vV c42291vV = this.A05;
        synchronized (c42291vV.A00) {
            Iterator it = c42291vV.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C3MM) c0g5.next()).AJp(i);
                }
            }
        }
    }
}
