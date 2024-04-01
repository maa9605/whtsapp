package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1sF */
/* loaded from: classes2.dex */
public class C40431sF {
    public static volatile C40431sF A0I;
    public C42541vu A00;
    public C42521vs A01;
    public C42561vw A02;
    public C42551vv A03;
    public final AbstractC000600i A04;
    public final C02L A05;
    public final C0F2 A06;
    public final C03310Fe A07;
    public final AnonymousClass034 A08;
    public final C000400f A09;
    public final C001200o A0A;
    public final C03290Fc A0B;
    public final C04Z A0C;
    public final C003701t A0D;
    public final C03350Fj A0E;
    public final C0Fi A0F;
    public final C03280Fb A0G;
    public final File A0H;

    public C40431sF(C001200o c001200o, C003701t c003701t, AbstractC000600i abstractC000600i, C03280Fb c03280Fb, C02L c02l, AnonymousClass034 anonymousClass034, C04Z c04z, C03290Fc c03290Fc, C03310Fe c03310Fe, C000400f c000400f, C0Fi c0Fi, C03350Fj c03350Fj, C0F2 c0f2) {
        this.A0A = c001200o;
        this.A0D = c003701t;
        this.A04 = abstractC000600i;
        this.A0G = c03280Fb;
        this.A05 = c02l;
        this.A08 = anonymousClass034;
        this.A0C = c04z;
        this.A0B = c03290Fc;
        this.A07 = c03310Fe;
        this.A09 = c000400f;
        this.A0F = c0Fi;
        this.A0E = c03350Fj;
        this.A06 = c0f2;
        this.A0H = new File(anonymousClass034.A02(), "stickers.db");
    }

    public static C40431sF A00() {
        if (A0I == null) {
            synchronized (C40431sF.class) {
                if (A0I == null) {
                    A0I = new C40431sF(C001200o.A01, C003701t.A00(), AbstractC000600i.A00(), C03280Fb.A00(), C02L.A00(), AnonymousClass034.A00(), C04Z.A00(), C03290Fc.A00(), C03310Fe.A00(), C000400f.A00(), C0Fi.A00(), C03350Fj.A01(), C0F2.A00());
                }
            }
        }
        return A0I;
    }

    public C42531vt A01(String str) {
        C000700j.A00();
        C42521vs A04 = A04();
        if (A04 != null) {
            AbstractList abstractList = (AbstractList) A04.A01("downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id)", new String[]{str}, "id = ?", "getDownloadableStickerPacks/QUERY");
            if (abstractList.isEmpty()) {
                return null;
            }
            if (abstractList.size() < 2) {
                return (C42531vt) abstractList.get(0);
            }
            throw new IllegalStateException(C000200d.A0H("StickerPack/getDownloadablePackById/there should only be one sticker that matches this id:", str));
        }
        throw null;
    }

    public C42531vt A02(String str) {
        C000700j.A00();
        AbstractList abstractList = (AbstractList) A04().A00(str);
        if (abstractList.size() <= 0) {
            return null;
        }
        if (abstractList.size() < 2) {
            C42531vt c42531vt = (C42531vt) abstractList.get(0);
            if (c42531vt == null) {
                return c42531vt;
            }
            c42531vt.A04 = A03().A00(str);
            return c42531vt;
        }
        throw new IllegalStateException(C000200d.A0H("StickerPack/getInstalledPackById/there should only be one sticker that matches this id:", str));
    }

    public final synchronized C42541vu A03() {
        C42541vu c42541vu;
        c42541vu = this.A00;
        if (c42541vu == null) {
            c42541vu = new C42541vu(A06());
            this.A00 = c42541vu;
        }
        return c42541vu;
    }

    public final synchronized C42521vs A04() {
        C42521vs c42521vs;
        c42521vs = this.A01;
        if (c42521vs == null) {
            c42521vs = new C42521vs(A06());
            this.A01 = c42521vs;
        }
        return c42521vs;
    }

    public final synchronized C42561vw A05() {
        C42561vw c42561vw;
        c42561vw = this.A02;
        if (c42561vw == null) {
            c42561vw = new C42561vw(A06());
            this.A02 = c42561vw;
        }
        return c42561vw;
    }

    public synchronized C42551vv A06() {
        C42551vv c42551vv;
        c42551vv = this.A03;
        if (c42551vv == null) {
            c42551vv = new C42551vv(this.A0A.A00, this.A04, this.A0C);
            this.A03 = c42551vv;
        }
        return c42551vv;
    }

    public File A07() {
        return this.A0A.A00.getDatabasePath("stickers.db");
    }

    public File A08(EnumC03450Ft enumC03450Ft) {
        File file;
        C000400f c000400f = this.A09;
        if (c000400f.A08()) {
            Log.i("sticker-db-storage/backup/skip no media or read-only media");
            return null;
        }
        if (enumC03450Ft == EnumC03450Ft.UNENCRYPTED) {
            try {
                file = c000400f.A06();
            } catch (IOException e) {
                Log.e("sticker-db-storage/make temp file failed", e);
                file = null;
            }
        } else {
            AnonymousClass034 anonymousClass034 = this.A08;
            EnumC03450Ft enumC03450Ft2 = EnumC03450Ft.CRYPT13;
            File A02 = anonymousClass034.A02();
            if (enumC03450Ft == enumC03450Ft2) {
                file = new File(A02, "stickers.db.crypt1");
            } else {
                StringBuilder A0P = C000200d.A0P("stickers.db.crypt");
                A0P.append(enumC03450Ft.version);
                file = new File(A02, A0P.toString());
            }
        }
        if (file == null) {
            return null;
        }
        if (file.exists() && file.isDirectory()) {
            file.delete();
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            Iterator it = A09().iterator();
            while (it.hasNext()) {
                File file2 = (File) it.next();
                if (!file2.equals(file) && file2.exists()) {
                    file2.delete();
                }
            }
            StringBuilder sb = new StringBuilder("sticker-db-storage/backup/to ");
            sb.append(file);
            Log.i(sb.toString());
            ReentrantReadWriteLock.WriteLock writeLock = A06().A05.writeLock();
            writeLock.lock();
            try {
                C0HI A03 = C0HH.A00(enumC03450Ft, this.A0G, this.A05, this.A0B, this.A07, c000400f, this.A0F, file).A03(this.A0A.A00);
                if (A03 == null) {
                    return null;
                }
                try {
                    A03.AWI(A07());
                    File[] listFiles = this.A06.A03().listFiles();
                    if (listFiles != null) {
                        for (File file3 : listFiles) {
                            A03.AWI(file3);
                        }
                    }
                    A03.close();
                    return file;
                } finally {
                }
            } catch (Exception e2) {
                Log.e("sticker-db-storage/backup failed", e2);
                return null;
            } finally {
                writeLock.unlock();
            }
        } else {
            throw null;
        }
    }

    public final ArrayList A09() {
        List A05 = C03460Fu.A05(EnumC03450Ft.CRYPT13, EnumC03450Ft.A00());
        ((AbstractCollection) A05).add(".crypt1");
        File file = this.A0H;
        ArrayList A04 = C03460Fu.A04(file, A05);
        C03460Fu.A0C(A04, file);
        return A04;
    }

    public final synchronized void A0A() {
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        C42551vv c42551vv = this.A03;
        if (c42551vv != null) {
            c42551vv.close();
            this.A03 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0040, code lost:
        if (r4 <= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0B(X.C42531vt r11, boolean r12) {
        /*
            r10 = this;
            X.C000700j.A00()
            X.1vs r0 = r10.A04()
            java.lang.String r8 = r11.A0D
            X.1vv r0 = r0.A00
            X.0CD r5 = r0.A03()
            r7 = 1
            java.lang.String[] r3 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L7d
            r9 = 0
            r3[r9] = r8     // Catch: java.lang.Throwable -> L7d
            X.0CE r2 = r5.A02     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = "installed_sticker_packs"
            java.lang.String r0 = "installed_id LIKE ?"
            int r4 = r2.A01(r1, r0, r3)     // Catch: java.lang.Throwable -> L7d
            r5.close()
            X.1vu r0 = r10.A03()
            X.1vv r0 = r0.A00
            X.0CD r3 = r0.A03()
            java.lang.String r6 = "sticker_pack_id LIKE ?"
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L76
            r2[r9] = r8     // Catch: java.lang.Throwable -> L76
            X.0CE r1 = r3.A02     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "stickers"
            int r0 = r1.A01(r0, r6, r2)     // Catch: java.lang.Throwable -> L76
            r3.close()
            if (r0 <= 0) goto L42
            r5 = 1
            if (r4 > 0) goto L43
        L42:
            r5 = 0
        L43:
            if (r12 != 0) goto L75
            X.1vw r4 = r10.A05()
            monitor-enter(r4)
            X.1vv r0 = r4.A00     // Catch: java.lang.Throwable -> L72
            X.0CD r3 = r0.A03()     // Catch: java.lang.Throwable -> L72
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L6b
            r2[r9] = r8     // Catch: java.lang.Throwable -> L6b
            X.0CE r1 = r3.A02     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "sticker_pack_order"
            int r1 = r1.A01(r0, r6, r2)     // Catch: java.lang.Throwable -> L6b
            r3.close()     // Catch: java.lang.Throwable -> L72
            monitor-exit(r4)
            r0 = 0
            if (r1 <= 0) goto L64
            r0 = 1
        L64:
            if (r5 == 0) goto L69
            if (r0 == 0) goto L69
            return r7
        L69:
            r7 = 0
            return r7
        L6b:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6d
        L6d:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L71
        L71:
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L75:
            return r5
        L76:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L7c
        L7c:
            throw r0
        L7d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L83
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40431sF.A0B(X.1vt, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0025, code lost:
        if (r4 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A0C(java.io.File r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r12.A0A()     // Catch: java.lang.Throwable -> L4e
            java.io.File r3 = r12.A07()     // Catch: java.lang.Throwable -> L4e
            X.0F2 r0 = r12.A06     // Catch: java.lang.Throwable -> L4e
            java.io.File r2 = r0.A03()     // Catch: java.lang.Throwable -> L4e
            r11 = r13
            java.lang.String r1 = r13.getName()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            java.lang.String r0 = "stickers.db"
            int r1 = X.C03460Fu.A00(r1, r0)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            if (r1 <= 0) goto L42
            X.0Ft r4 = X.EnumC03450Ft.CRYPT13     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            int r0 = r4.version     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            if (r1 < r0) goto L27
            X.0Ft r4 = X.EnumC03450Ft.A02(r1)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            if (r4 == 0) goto L42
        L27:
            X.0Fb r5 = r12.A0G     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            X.02L r6 = r12.A05     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            X.0Fc r7 = r12.A0B     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            X.0Fe r8 = r12.A07     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            X.00f r9 = r12.A09     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            X.0Fi r10 = r12.A0F     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            X.0HH r1 = X.C0HH.A00(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            X.3rW r0 = new X.3rW     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            boolean r0 = r1.A06(r0)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            monitor-exit(r12)
            return r0
        L42:
            X.0Ft r4 = X.EnumC03450Ft.UNENCRYPTED     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L4e
            goto L27
        L45:
            r1 = move-exception
            java.lang.String r0 = "sticker-db-storage/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L4e
            r0 = 0
            monitor-exit(r12)
            return r0
        L4e:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40431sF.A0C(java.io.File):boolean");
    }
}
