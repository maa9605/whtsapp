package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.22X */
/* loaded from: classes2.dex */
public class C22X {
    public static volatile C22X A0H;
    public final C012005w A00;
    public final AnonymousClass012 A01;
    public final C001200o A02;
    public final C06T A03;
    public final C05A A04;
    public final C0C9 A05;
    public final C0EO A06;
    public final C05B A07;
    public final C40411sD A08;
    public final C0H1 A09;
    public final C00A A0A;
    public final C05N A0B;
    public final C05E A0C;
    public final C05C A0D;
    public final C0EB A0E;
    public final C02O A0F;
    public final AtomicBoolean A0G = new AtomicBoolean(false);

    public C22X(AnonymousClass012 anonymousClass012, C05B c05b, C05A c05a, C001200o c001200o, C012005w c012005w, C0EB c0eb, C0EO c0eo, C0H1 c0h1, C0C9 c0c9, C00A c00a, C40411sD c40411sD, C05C c05c, C06T c06t, C05E c05e, C02O c02o, C05N c05n) {
        this.A01 = anonymousClass012;
        this.A07 = c05b;
        this.A04 = c05a;
        this.A02 = c001200o;
        this.A00 = c012005w;
        this.A0E = c0eb;
        this.A06 = c0eo;
        this.A09 = c0h1;
        this.A05 = c0c9;
        this.A0A = c00a;
        this.A08 = c40411sD;
        this.A0D = c05c;
        this.A03 = c06t;
        this.A0C = c05e;
        this.A0F = c02o;
        this.A0B = c05n;
    }

    public static C22X A00() {
        if (A0H == null) {
            synchronized (C22X.class) {
                if (A0H == null) {
                    A0H = new C22X(AnonymousClass012.A00(), C05B.A00(), C05A.A00(), C001200o.A01, C012005w.A00(), C0EB.A00(), C0EO.A00(), C0H1.A00(), C0C9.A00(), C00A.A00, C40411sD.A00(), C05C.A00(), C06T.A02, C05E.A00(), C02O.A00(), C05N.A00());
                }
            }
        }
        return A0H;
    }

    public AnonymousClass092 A01(UserJid userJid) {
        C0Hr A07 = this.A0E.A07(userJid);
        if (A07 == null) {
            StringBuilder sb = new StringBuilder("statusmsgstore/getlaststatusmessage/no status for ");
            sb.append(userJid);
            Log.w(sb.toString());
            return null;
        }
        AnonymousClass092 anonymousClass092 = A07.A08;
        if (anonymousClass092 == null) {
            AnonymousClass092 A0C = this.A05.A0C(A07.A06);
            A07.A08 = A0C;
            return A0C;
        }
        return anonymousClass092;
    }

    public List A02(UserJid userJid) {
        C04580Kz c04580Kz;
        Cursor A07;
        long parseLong;
        C000700j.A00();
        ArrayList arrayList = new ArrayList();
        C0CD A03 = this.A0C.A03();
        try {
            if (userJid == null) {
                C0CE c0ce = A03.A02;
                String str = C0HD.A0v;
                C05A c05a = this.A04;
                c04580Kz = C04580Kz.A00;
                A07 = c0ce.A07(str, new String[]{String.valueOf(c05a.A05(c04580Kz))});
            } else if (C011405q.A00.equals(userJid)) {
                C0CE c0ce2 = A03.A02;
                String str2 = C0HD.A1D;
                C05A c05a2 = this.A04;
                c04580Kz = C04580Kz.A00;
                A07 = c0ce2.A07(str2, new String[]{String.valueOf(c05a2.A05(c04580Kz))});
            } else {
                C0CE c0ce3 = A03.A02;
                String str3 = C0HD.A1C;
                C05A c05a3 = this.A04;
                c04580Kz = C04580Kz.A00;
                A07 = c0ce3.A07(str3, new String[]{String.valueOf(c05a3.A05(c04580Kz)), String.valueOf(this.A07.A02(userJid)), userJid.getRawString()});
            }
            try {
                if (userJid != null) {
                    try {
                        if (this.A0E.A07(userJid) == null) {
                            if (A07 != null) {
                                A07.close();
                            }
                            return arrayList;
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                long A05 = this.A01.A05();
                long j = A05 - 86400000;
                C05C c05c = this.A0D;
                String A02 = c05c.A02("status_psa_exipration_time");
                long parseLong2 = A02 == null ? 0L : Long.parseLong(A02);
                String A022 = c05c.A02("status_psa_viewed_time");
                if (A022 != null) {
                    parseLong = Long.parseLong(A022);
                } else {
                    parseLong = 0;
                }
                boolean z = false;
                while (A07.moveToNext()) {
                    AnonymousClass092 A032 = this.A05.A0H.A03(A07, c04580Kz);
                    if (A032 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("statusmsgstore/status-null-message for ");
                        sb.append(userJid);
                        Log.e(sb.toString());
                    } else if (A032.A0m != 15 && !C0Ho.A0N(A032)) {
                        try {
                            long j2 = A032.A0E;
                            if (j2 > j) {
                                arrayList.add(A032);
                            } else if (!C003101m.A0Y(A032.A0A()) || (j2 <= parseLong && A05 >= parseLong2 && parseLong2 != 0)) {
                                z = true;
                            } else {
                                arrayList.add(A032);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
                if (z) {
                    A03(false);
                }
                A07.close();
                A03.close();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } finally {
                    try {
                        A03.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void A03(boolean z) {
        if (z) {
            this.A03.A01(new RunnableEBaseShape2S0100000_I0_2(this, 36), 40);
        } else if (!this.A0G.compareAndSet(false, true)) {
        } else {
            this.A03.A01(new RunnableEBaseShape2S0100000_I0_2(this, 35), 41);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x015e, code lost:
        if (X.C0Ho.A0N(r9) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:352:0x018f A[Catch: all -> 0x0298, TryCatch #17 {all -> 0x0298, blocks: (B:312:0x00cf, B:340:0x0162, B:362:0x01bf, B:364:0x01c9, B:365:0x0200, B:367:0x0206, B:320:0x00e8, B:322:0x00ee, B:324:0x00fe, B:326:0x0102, B:346:0x0175, B:348:0x017b, B:350:0x0181, B:352:0x018f, B:355:0x01a7, B:357:0x01ab, B:359:0x01b2, B:361:0x01b6, B:353:0x0198, B:327:0x013d, B:329:0x0143, B:331:0x014b, B:335:0x0154, B:337:0x015a, B:332:0x014e), top: B:508:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0198 A[Catch: all -> 0x0298, TryCatch #17 {all -> 0x0298, blocks: (B:312:0x00cf, B:340:0x0162, B:362:0x01bf, B:364:0x01c9, B:365:0x0200, B:367:0x0206, B:320:0x00e8, B:322:0x00ee, B:324:0x00fe, B:326:0x0102, B:346:0x0175, B:348:0x017b, B:350:0x0181, B:352:0x018f, B:355:0x01a7, B:357:0x01ab, B:359:0x01b2, B:361:0x01b6, B:353:0x0198, B:327:0x013d, B:329:0x0143, B:331:0x014b, B:335:0x0154, B:337:0x015a, B:332:0x014e), top: B:508:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(boolean r38) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22X.A04(boolean):void");
    }
}
