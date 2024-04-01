package X;

import android.net.Uri;
import android.os.Build;
import android.os.ConditionVariable;
import com.whatsapp.Mp4Ops;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.FileUtils$OsRename;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1x3 */
/* loaded from: classes2.dex */
public final class C43221x3 extends C0CH implements Comparable, InterfaceC04060Ig {
    public C0J7 A00;
    public C04140Is A01;
    public C06350Ss A02;
    public File A03;
    public URL A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final ConditionVariable A08;
    public final C0IX A09;
    public final AbstractC000600i A0A;
    public final C012005w A0B;
    public final C0E3 A0C;
    public final Mp4Ops A0D;
    public final C01B A0E;
    public final C0EL A0F;
    public final C000400f A0M;
    public final AnonymousClass012 A0N;
    public final C001200o A0O;
    public final C40411sD A0P;
    public final C003701t A0Q;
    public final C04000Ia A0R;
    public final C41491u0 A0S;
    public final C0HW A0T;
    public final C43111ws A0U;
    public final C43131wu A0V;
    public final C43121wt A0W;
    public final C41571uA A0X;
    public final C43211x2 A0Y;
    public final C04010Ib A0Z;
    public final C43091wq A0a;
    public final C02O A0b;
    public final C0IY A0d;
    public final C0CB A0e;
    public final C43101wr A0f;
    public final C40941t7 A0g;
    public final C41961un A0h;
    public final C43141wv A0i;
    public final InterfaceC002901k A0j;
    public final C40951t8 A0k;
    public final boolean A0o;
    public volatile int A0p;
    public volatile boolean A0q;
    public volatile boolean A0r;
    public final CountDownLatch A0m = new CountDownLatch(1);
    public final LinkedList A0l = new LinkedList();
    public final AtomicBoolean A0n = new AtomicBoolean();
    public final C0CK A0J = new C0CK();
    public final C0CK A0L = new C0CK();
    public final C0CK A0I = new C0CK();
    public final C0CK A0K = new C0CK();
    public final C0CK A0H = new C0CK();
    public final C0CK A0G = new C0CK();
    public final C1QJ A0c = new C1QJ() { // from class: X.3FR
        {
            C43221x3.this = this;
        }

        @Override // X.C1QJ
        public final void AMQ(C02600Cb c02600Cb) {
            C43221x3 c43221x3 = C43221x3.this;
            if (c02600Cb != null && c43221x3.A00 != null) {
                AnonymousClass012 anonymousClass012 = c43221x3.A0N;
                AbstractC000600i abstractC000600i = c43221x3.A0A;
                C01B c01b = c43221x3.A0E;
                C04010Ib c04010Ib = c43221x3.A0Z;
                C40601sX c40601sX = C38001nO.A01(anonymousClass012, abstractC000600i, c01b, c02600Cb, c04010Ib.A08.A02, c04010Ib.A0B, c04010Ib.A0A, false).A01;
                C05080Nf A9V = c43221x3.A00.A00.A9V();
                if (A9V != null && c40601sX != null && !A9V.A05.equals(c40601sX.A04)) {
                    c43221x3.A0n.set(true);
                }
            }
        }
    };

    public C43221x3(C001200o c001200o, AnonymousClass012 anonymousClass012, Mp4Ops mp4Ops, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C0HW c0hw, C012005w c012005w, C0EL c0el, C0IX c0ix, C01B c01b, C40951t8 c40951t8, C41491u0 c41491u0, C0IY c0iy, C41961un c41961un, C0E3 c0e3, C43091wq c43091wq, C43101wr c43101wr, C43111ws c43111ws, C0CB c0cb, C40411sD c40411sD, C43121wt c43121wt, C000400f c000400f, C41571uA c41571uA, C43131wu c43131wu, C43141wv c43141wv, C04000Ia c04000Ia, C02O c02o, ConditionVariable conditionVariable, C04010Ib c04010Ib, int i, long j, int i2, boolean z) {
        boolean z2 = true;
        this.A0O = c001200o;
        this.A0N = anonymousClass012;
        this.A0D = mp4Ops;
        this.A0Q = c003701t;
        this.A0A = abstractC000600i;
        this.A0j = interfaceC002901k;
        this.A0T = c0hw;
        this.A0B = c012005w;
        this.A0F = c0el;
        this.A09 = c0ix;
        this.A0E = c01b;
        this.A0k = c40951t8;
        this.A0S = c41491u0;
        this.A0d = c0iy;
        this.A0h = c41961un;
        this.A0C = c0e3;
        this.A0a = c43091wq;
        this.A0f = c43101wr;
        this.A0U = c43111ws;
        this.A0e = c0cb;
        this.A0P = c40411sD;
        this.A0W = c43121wt;
        this.A0M = c000400f;
        this.A0X = c41571uA;
        this.A0i = c43141wv;
        this.A0R = c04000Ia;
        this.A0b = c02o;
        this.A08 = conditionVariable;
        this.A0Z = c04010Ib;
        this.A0p = i;
        this.A0V = c43131wu;
        C06350Ss c06350Ss = new C06350Ss(c04010Ib.A08, this.A0p, c04000Ia.A06() ? 4 : 0);
        this.A02 = c06350Ss;
        boolean z3 = c04010Ib.A0B != null;
        this.A0o = z3;
        c06350Ss.A0O = z3;
        this.A0q = false;
        this.A07 = j;
        this.A06 = i2;
        this.A0Y = new C43211x2();
        StringBuilder A0P = C000200d.A0P("MediaDownload/initialized;mediaHash=");
        A0P.append(c04010Ib.A0C);
        A0P.append(" autoDownload=");
        A0P.append(this.A0p);
        A0P.append(" streamable=");
        boolean A00 = c04010Ib.A00();
        A0P.append(A00);
        Log.i(A0P.toString());
        C0CG c0cg = new C0CG() { // from class: X.3Fc
            {
                C43221x3.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C43221x3 c43221x3 = C43221x3.this;
                C04020Ic c04020Ic = (C04020Ic) obj;
                StringBuilder A0P2 = C000200d.A0P("MediaDownload/onPostExecute; mediaHash=");
                A0P2.append(c43221x3.A0Z.A0C);
                A0P2.append(" status=");
                A0P2.append(c04020Ic);
                Log.i(A0P2.toString());
                c43221x3.A08(c04020Ic);
                c43221x3.A09(c04020Ic);
            }
        };
        Executor executor = c018508q.A06;
        ((C0CI) this).A01.A03(c0cg, executor);
        ((C0CH) this).A00.A03(new C0CG() { // from class: X.3Fg
            {
                C43221x3.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C43221x3 c43221x3 = C43221x3.this;
                StringBuilder A0P2 = C000200d.A0P("MediaDownload/oncancelled; mediaHash=");
                A0P2.append(c43221x3.A0Z.A0C);
                A0P2.append(" url=");
                A0P2.append(c43221x3.A04);
                Log.i(A0P2.toString());
                c43221x3.A08(new C04020Ic(13, null, false));
            }
        }, executor);
        ((C0CI) this).A00.A03(new C0CG() { // from class: X.3Ff
            {
                C43221x3.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C43221x3 c43221x3 = C43221x3.this;
                if (obj instanceof IOException) {
                    C04020Ic c04020Ic = new C04020Ic(9, null, false);
                    StringBuilder A0P2 = C000200d.A0P("MediaDownload/onPostExecute; mediaHash=");
                    A0P2.append(c43221x3.A0Z.A0C);
                    A0P2.append(" status=");
                    A0P2.append(c04020Ic);
                    Log.i(A0P2.toString());
                    c43221x3.A08(c04020Ic);
                    c43221x3.A09(c04020Ic);
                } else if (!(obj instanceof CancellationException)) {
                } else {
                    c43221x3.A09(new C04020Ic(13, null, false));
                }
            }
        }, executor);
        if (A00) {
            C40941t7 c40941t7 = new C40941t7();
            this.A0g = c40941t7;
            long j2 = c04010Ib.A06;
            synchronized (c40941t7) {
                c40941t7.A04 = j2;
            }
        }
        C0CK c0ck = this.A0H;
        if (2 != this.A0p && 3 != this.A0p) {
            z2 = false;
        }
        c0ck.A04(new C62922ym(z2, A00));
        this.A05 = z;
    }

    public static void A00(C012005w c012005w, C43091wq c43091wq, C04010Ib c04010Ib, C43211x2 c43211x2, C43221x3 c43221x3, File file) {
        C0DC c0dc = c04010Ib.A08;
        if (C0HW.A01(c0dc) && "application/pdf".equals(c04010Ib.A0E)) {
            C72583aG c72583aG = new C72583aG(file);
            try {
                c72583aG.A05();
                c43211x2.A07(c72583aG.A03 ? 3 : 0);
            } catch (C72573aF e) {
                c43211x2.A07(3);
                Log.e("MediaDownload/Failed to parse document", e);
            } catch (IOException e2) {
                Log.e("MediaDownload/Failed to parse document", e2);
            }
        } else if (!C0HW.A03(c0dc) && c0dc != C0DC.A05 && c0dc != C0DC.A0D) {
            if (c0dc == C0DC.A0I && WebpUtils.verifyWebpFileIntegrity(file.getAbsolutePath()) == null) {
                Log.w("MediaDownload/suspicious sticker found, file deleted");
                c43211x2.A07(1);
                A01(c012005w, file);
            }
        } else if (c43091wq.A04(c0dc, file)) {
            try {
                Mp4Ops.A04(file, false);
            } catch (C04100In e3) {
                if (!((C0CH) c43221x3).A02.isCancelled() && e3.errorCode < 300) {
                    Log.w("MediaDownload/suspicious video/audio found, file deleted");
                    c43211x2.A07(1);
                    A01(c012005w, file);
                }
            }
        }
    }

    public static boolean A01(C012005w c012005w, File file) {
        File A0G = c012005w.A0G(file);
        if (A0G.exists() && !A0G.delete()) {
            StringBuilder sb = new StringBuilder("MediaDownload/MMS failed to delete stream check success file ");
            sb.append(A0G);
            Log.w(sb.toString());
        }
        return file.delete();
    }

    public static boolean A02(File file, File file2) {
        if (Build.VERSION.SDK_INT < 21) {
            boolean renameTo = file.renameTo(file2);
            if (!renameTo) {
                Log.i("media-file-utils/download file rename failed");
            }
            return renameTo;
        }
        if (FileUtils$OsRename.attempt(file, file2) > 0) {
            if (FileUtils$OsRename.attempt(file, file2) > 0) {
                Log.i("media-file-utils/Second try rename failed");
                return false;
            }
            Log.i("media-file-utils/Second try rename succeeded");
        }
        return true;
    }

    @Override // X.C0CH, X.C0CI
    public void A03() {
        super.A03();
        this.A0J.A01();
        this.A0I.A01();
        this.A0K.A01();
        this.A0H.A01();
        this.A0G.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:364:0x02ed, code lost:
        if (r5 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x02ef, code lost:
        r3 = X.C000200d.A0P("MediaDownload/call/file exists for hash; mediaHash=");
        r3.append(r8);
        r3.append(" directoryType=");
        r3.append(r1.A01);
        r3.append(" file=");
        r3.append(r5.getAbsolutePath());
        com.whatsapp.util.Log.i(r3.toString());
        r0 = r35.A0a;
        r6 = r35.A0Y;
        A00(r3, r0, r1, r6, r35, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0325, code lost:
        if (r35.A0g == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0327, code lost:
        r3 = A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x032f, code lost:
        if (r3.exists() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0335, code lost:
        if (r3.delete() != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0337, code lost:
        com.whatsapp.util.Log.w("MediaDownload/call/unable to delete chunk store file on file hash match");
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0340, code lost:
        if (X.C0HW.A04(r3) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0342, code lost:
        X.C40841sx.A0Z(r3, r35.A0E, r35.A0h, r35.A0f, r1, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0353, code lost:
        A0B(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0363, code lost:
        return new X.C04020Ic(0, X.AnonymousClass024.A0G(r5.getAbsolutePath()), false, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0364, code lost:
        r35.A02.A0A = java.lang.Long.valueOf(r35.A03.length());
        A05();
        r10 = r1.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0377, code lost:
        if (r10 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x037b, code lost:
        if (r1.A0U != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0383, code lost:
        return new X.C04020Ic(5, null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0384, code lost:
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x038d, code lost:
        if (r6.A0B().booleanValue() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x038f, code lost:
        if (r19 != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0394, code lost:
        if (r35.A0p == 1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0398, code lost:
        if (r35.A0p != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x039a, code lost:
        com.whatsapp.util.Log.i("MediaDownload/download media using native API's");
        r5 = new X.C85293vA(r35.A09, r35);
        r23 = X.C02180Ae.A05(r3);
        r24 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x03ae, code lost:
        if (r35.A0p == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x03b0, code lost:
        r24 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x03b2, code lost:
        r6 = r3.A0N(r3, r10, r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x03bc, code lost:
        if (r6 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x03be, code lost:
        r29 = android.util.Base64.decode(r10, 2);
        r30 = android.util.Base64.decode(r8, 2);
        r31 = X.AnonymousClass029.A0a(r35.A0N, r3.A03());
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x03d0, code lost:
        if (r31 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x03d2, code lost:
        r32 = r1.toString();
        r25 = r6.getPath();
        r26 = r35.A03.getPath();
        r6 = r1.A0A;
        r3 = r1.A0U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x03e4, code lost:
        if (r3 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x03e6, code lost:
        r3 = new X.C85283v9(r5, r5, new X.C75113eN(r23, r24, r25, r26, r6, r3, r29, r30, r31, r32));
        r5.A00 = r3;
        r6 = (X.C04020Ic) X.C2DZ.A00(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x03fe, code lost:
        if (r6 != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0400, code lost:
        r6 = new X.C04020Ic(17, null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0407, code lost:
        if (r6 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0409, code lost:
        com.whatsapp.util.Log.w("MediaDownload/call/didn't get a selected route");
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0415, code lost:
        return new X.C04020Ic(11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0416, code lost:
        r4 = r3.A02;
        r5 = r1.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x041e, code lost:
        if (r35.A0p == 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0420, code lost:
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0421, code lost:
        if (r3 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0423, code lost:
        if (r4 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0425, code lost:
        r3 = r3.A02("image", r10, r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x042d, code lost:
        r35.A00 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0431, code lost:
        if (r1.A0J == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0433, code lost:
        r35.A0r = true;
        r3.A00(r35.A0c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x043d, code lost:
        r6 = (X.C04020Ic) r35.A00.A00(new X.C3FT());
        r35.A02.A0G = java.lang.Long.valueOf(r35.A00.A01.get());
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x045c, code lost:
        r3 = r3.A02(r4, r10, r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0469, code lost:
        if (r6.A02() == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x046b, code lost:
        r3 = r35.A02;
        r3.A03(r3.A0R, r3.A01(), r35.A02.A00(), 1);
        r4 = r35.A0a;
        r10 = r35.A0Y;
        A00(r3, r4, r1, r10, r35, r35.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0497, code lost:
        if (((X.C0CH) r35).A02.isCancelled() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x049e, code lost:
        return new X.C04020Ic(13, null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x049f, code lost:
        X.C40841sx.A0Z(r3, r35.A0E, r35.A0h, r35.A0f, r1, r10, r35.A03);
        A0B(r35.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x04bf, code lost:
        if (((X.C0CH) r35).A02.isCancelled() == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x04c6, code lost:
        return new X.C04020Ic(13, null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x04cc, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x04cd, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x04ce, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x04cf, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:?, code lost:
        return r6;
     */
    @Override // X.C0CH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A04() {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43221x3.A04():java.lang.Object");
    }

    public final File A06() {
        StringBuilder sb = new StringBuilder();
        String str = this.A0Z.A0C;
        if (str != null) {
            sb.append(str.replace('/', '-'));
            sb.append(".chk.tmp");
            return this.A0B.A0L(sb.toString());
        }
        throw null;
    }

    public void A07(int i) {
        this.A0p = i;
        C06350Ss c06350Ss = this.A02;
        synchronized (c06350Ss) {
            c06350Ss.A00 = i;
        }
    }

    public void A08(C04020Ic c04020Ic) {
        StringBuilder A0P = C000200d.A0P("MediaDownload/updateMessageAfterExecution/mediaHash=");
        C04010Ib c04010Ib = this.A0Z;
        String str = c04010Ib.A0C;
        A0P.append(str);
        A0P.append(" url=");
        A0P.append(this.A04);
        A0P.append(" status=");
        A0P.append(c04020Ic);
        Log.i(A0P.toString());
        if (this.A0r) {
            this.A0d.A01(this.A0c);
        }
        boolean A02 = c04020Ic.A02();
        C43211x2 c43211x2 = this.A0Y;
        int i = c04010Ib.A01;
        c43211x2.A0A(A02, c04020Ic, i);
        if (A02) {
            long length = this.A03.length();
            synchronized (c43211x2) {
                c43211x2.A0E = Long.valueOf(length);
            }
            C40941t7 c40941t7 = this.A0g;
            if (c40941t7 != null) {
                c40941t7.A05(2);
            }
            if (!c04010Ib.A0R && c43211x2.A00() != 1) {
                if (c43211x2.A00() == 3) {
                    Log.i("MediaDownload/updateMessageAfterExecution/keeping suspicious download file");
                }
                File file = c04020Ic.A02;
                if (file != null) {
                    file.getAbsolutePath();
                    this.A03.getAbsolutePath();
                    this.A03.getAbsolutePath();
                    c43211x2.A09(file);
                    this.A03.delete();
                } else {
                    File file2 = c04010Ib.A09;
                    if (file2 != null && !file2.exists() && A02(this.A03, file2)) {
                        c43211x2.A09(file2);
                    } else {
                        boolean z = c04010Ib.A0Q;
                        boolean z2 = c04010Ib.A0M;
                        boolean z3 = c04010Ib.A0S;
                        C0DC c0dc = c04010Ib.A08;
                        int i2 = c04010Ib.A03;
                        String str2 = c04010Ib.A0F;
                        String str3 = c04020Ic.A03;
                        String str4 = c04010Ib.A0G;
                        if (str3 == null) {
                            if (str4 != null) {
                                str3 = AnonymousClass024.A0G(str4);
                            } else {
                                str3 = null;
                            }
                        }
                        File A0H = C0DD.A0H(z, z2, z3, c0dc, i2, i, str2, str3, this.A0O, this.A0B, this.A0b);
                        c43211x2.A09(A0H);
                        A02(this.A03, A0H);
                    }
                }
            }
            if (c40941t7 != null) {
                c40941t7.A07(c43211x2.A03());
                c40941t7.A05(3);
                synchronized (c40941t7) {
                    c40941t7.A0F.clear();
                }
                c40941t7.A03();
                File A0N = this.A0B.A0N(c04010Ib.A0M, c04010Ib.A0B, str, c04010Ib.A0G);
                if (A0N != null) {
                    A0N.delete();
                } else {
                    throw null;
                }
            }
        } else {
            C40941t7 c40941t72 = this.A0g;
            if (c40941t72 != null) {
                int i3 = c04020Ic.A01;
                boolean A01 = C04020Ic.A01(i3);
                synchronized (c40941t72) {
                    c40941t72.A0B = A01;
                    c40941t72.A02 = i3;
                }
                c40941t72.A05(4);
                synchronized (c40941t72) {
                    c40941t72.A0F.clear();
                }
            }
            File file3 = this.A03;
            if (file3 != null && file3.length() == 0) {
                A01(this.A0B, this.A03);
            }
            int i4 = c04020Ic.A01;
            if (i4 == 5 || i4 == 12 || i4 == 4) {
                c43211x2.A05();
            }
        }
        A0A(c43211x2);
        LinkedList linkedList = this.A0l;
        synchronized (linkedList) {
            C43211x2 A022 = c43211x2.A02();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((InterfaceC04070Ih) it.next()).AJY(c04020Ic, A022);
            }
            linkedList.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0052, code lost:
        if (r0.A0C == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x018b, code lost:
        if (r11 == 15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0279, code lost:
        if (r1 == 3) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09(X.C04020Ic r19) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43221x3.A09(X.0Ic):void");
    }

    public void A0A(C43211x2 c43211x2) {
        StringBuilder A0P = C000200d.A0P("MediaDownload/publishDownloadDataWhenComplete; mediaHash=");
        A0P.append(this.A0Z.A0C);
        A0P.append(" downloadData=");
        A0P.append(c43211x2.toString());
        Log.i(A0P.toString());
        this.A0G.A04(c43211x2.A02());
    }

    public final void A0B(File file) {
        C01B c01b = this.A0E;
        int i = this.A0Z.A03;
        long length = file.length();
        if (i == 7 && length < c01b.A07(C01C.A45) * 1024) {
            C40951t8 c40951t8 = this.A0k;
            Uri fromFile = Uri.fromFile(file);
            if (c40951t8 != null) {
                try {
                    List A00 = C40961t9.A00(c40951t8.A02(fromFile));
                    if (A00 != null) {
                        C43211x2 c43211x2 = this.A0Y;
                        Integer valueOf = Integer.valueOf(A00.size());
                        synchronized (c43211x2) {
                            c43211x2.A07 = valueOf;
                        }
                        return;
                    }
                    return;
                } catch (IOException e) {
                    Log.e("vcardloader/splitvcards/exception", e);
                    return;
                }
            }
            throw null;
        }
    }

    @Override // X.InterfaceC04060Ig
    public void A59(InterfaceC04070Ih interfaceC04070Ih) {
        LinkedList linkedList = this.A0l;
        synchronized (linkedList) {
            linkedList.add(interfaceC04070Ih);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003a, code lost:
        if (r3 == false) goto L7;
     */
    @Override // X.InterfaceC04060Ig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A61(boolean r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L5
            r7.A03()
        L5:
            java.lang.String r0 = "MediaDownload/cancelMediaDownload/mediaHash="
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            X.0Ib r6 = r7.A0Z
            java.lang.String r0 = r6.A0C
            r1.append(r0)
            r1.append(r0)
            java.lang.String r0 = " url="
            r1.append(r0)
            java.net.URL r0 = r7.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            r7.cancel()
            X.1x2 r5 = r7.A0Y
            java.lang.Boolean r0 = r5.A04()
            r4 = 0
            if (r0 == 0) goto L53
            java.lang.Boolean r0 = r5.A04()
            boolean r3 = r0.booleanValue()
            if (r3 != 0) goto L4f
        L3c:
            r2 = 13
            r0 = 0
            X.0Ic r1 = new X.0Ic
            r1.<init>(r2, r0, r4, r0)
            int r0 = r6.A01
            r5.A0A(r4, r1, r0)
            r5.A05()
            r7.A0A(r5)
        L4f:
            java.util.LinkedList r2 = r7.A0l
            monitor-enter(r2)
            goto L55
        L53:
            r3 = 0
            goto L3c
        L55:
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L6e
        L59:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L69
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L6e
            X.0Ih r0 = (X.InterfaceC04070Ih) r0     // Catch: java.lang.Throwable -> L6e
            r0.AJX(r3)     // Catch: java.lang.Throwable -> L6e
            goto L59
        L69:
            r2.clear()     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6e
            return
        L6e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43221x3.A61(boolean):void");
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof C43221x3) {
            long j = ((C43221x3) obj).A07;
            long j2 = this.A07;
            if (j < j2) {
                return -1;
            }
            return j2 < j ? 1 : 0;
        }
        return 0;
    }
}
