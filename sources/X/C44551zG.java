package X;

import android.app.Application;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.Mp4Ops;
import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.1zG */
/* loaded from: classes2.dex */
public class C44551zG {
    public static volatile C44551zG A0J;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C0F2 A02;
    public final C01B A03;
    public final C000400f A04;
    public final C0E7 A05;
    public final C003701t A06;
    public final AnonymousClass011 A07;
    public final C41491u0 A08;
    public final C43121wt A09;
    public final C41571uA A0A;
    public final C455522n A0B;
    public final C455322l A0C;
    public final C43091wq A0D;
    public final C455422m A0E;
    public final C43101wr A0F;
    public final C41961un A0G;
    public final InterfaceC002901k A0H;
    public final Executor A0I;

    public C44551zG(C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C01B c01b, C455322l c455322l, C41491u0 c41491u0, C41961un c41961un, C43091wq c43091wq, C43101wr c43101wr, C455422m c455422m, C43121wt c43121wt, C000400f c000400f, C41571uA c41571uA, C455522n c455522n, C0E7 c0e7, C0F2 c0f2) {
        this.A06 = c003701t;
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A0H = interfaceC002901k;
        this.A07 = anonymousClass011;
        this.A03 = c01b;
        this.A0C = c455322l;
        this.A08 = c41491u0;
        this.A0G = c41961un;
        this.A0D = c43091wq;
        this.A0F = c43101wr;
        this.A0E = c455422m;
        this.A09 = c43121wt;
        this.A04 = c000400f;
        this.A0A = c41571uA;
        this.A0B = c455522n;
        this.A05 = c0e7;
        this.A02 = c0f2;
        this.A0I = new ExecutorC43191x0(c018508q);
    }

    public static C44551zG A00() {
        C455922r c455922r;
        if (A0J == null) {
            synchronized (C44551zG.class) {
                if (A0J == null) {
                    C003701t A00 = C003701t.A00();
                    C018508q A002 = C018508q.A00();
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    InterfaceC002901k A004 = C002801j.A00();
                    AnonymousClass011 A005 = AnonymousClass011.A00();
                    C01B A006 = C01B.A00();
                    C455322l A007 = C455322l.A00();
                    C41491u0 A008 = C41491u0.A00();
                    C41961un A0S = C41961un.A0S();
                    C43091wq A01 = C43091wq.A01();
                    C43101wr A012 = C43101wr.A01();
                    C455422m A009 = C455422m.A00();
                    C43121wt A0010 = C43121wt.A00();
                    C000400f A0011 = C000400f.A00();
                    C41571uA A0012 = C41571uA.A00();
                    if (C455522n.A06 == null) {
                        synchronized (C455522n.class) {
                            if (C455522n.A06 == null) {
                                C001200o c001200o = C001200o.A01;
                                AnonymousClass011 A0013 = AnonymousClass011.A00();
                                C41961un A0S2 = C41961un.A0S();
                                if (C455622o.A01 == null) {
                                    synchronized (C455622o.class) {
                                        if (C455622o.A01 == null) {
                                            C003701t.A00();
                                            C455622o.A01 = new C455622o(C455822q.A00(), C002801j.A00());
                                        }
                                    }
                                }
                                C455622o c455622o = C455622o.A01;
                                synchronized (C455922r.class) {
                                    if (C455922r.A04 == null) {
                                        InterfaceC002901k A0014 = C002801j.A00();
                                        if (C456022s.A0M == null) {
                                            synchronized (C456022s.class) {
                                                if (C456022s.A0M == null) {
                                                    Mp4Ops A0015 = Mp4Ops.A00();
                                                    C003701t A0016 = C003701t.A00();
                                                    AbstractC000600i A0017 = AbstractC000600i.A00();
                                                    C012005w A0018 = C012005w.A00();
                                                    AnonymousClass011 A0019 = AnonymousClass011.A00();
                                                    C01B A0020 = C01B.A00();
                                                    C41961un A0S3 = C41961un.A0S();
                                                    C02E A0021 = C02E.A00();
                                                    C43091wq A013 = C43091wq.A01();
                                                    C43101wr A014 = C43101wr.A01();
                                                    C0KV A0022 = C0KV.A00();
                                                    C40411sD A0023 = C40411sD.A00();
                                                    C000400f A0024 = C000400f.A00();
                                                    C42591vz A09 = C42591vz.A09();
                                                    C000500h A0025 = C000500h.A00();
                                                    C02C A0026 = C02C.A00();
                                                    if (C456122t.A04 == null) {
                                                        synchronized (C456122t.class) {
                                                            if (C456122t.A04 == null) {
                                                                C456122t.A04 = new C456122t(c001200o, C003701t.A00(), AbstractC000600i.A00(), C01B.A00());
                                                            }
                                                        }
                                                    }
                                                    C456022s.A0M = new C456022s(c001200o, A0015, A0016, A0017, A0018, A0019, A0020, A0S3, A0021, A013, A014, A0022, A0023, A0024, A09, A0025, A0026, C456122t.A04, C0GT.A00(), C0F2.A00(), C43171wy.A00());
                                                }
                                            }
                                        }
                                        C455922r.A04 = new C455922r(A0014, C456022s.A0M);
                                    }
                                    c455922r = C455922r.A04;
                                }
                                if (C456222u.A04 == null) {
                                    synchronized (C456222u.class) {
                                        if (C456222u.A04 == null) {
                                            C003701t.A00();
                                            InterfaceC002901k A0027 = C002801j.A00();
                                            C012005w A0028 = C012005w.A00();
                                            C40081rY A0029 = C40081rY.A00();
                                            C43811y1.A00();
                                            C456222u.A04 = new C456222u(A0027, A0028, A0029, C002301c.A00(), C43791xz.A00());
                                        }
                                    }
                                }
                                C455522n.A06 = new C455522n(c001200o, A0013, A0S2, c455622o, c455922r, C456222u.A04);
                            }
                        }
                    }
                    A0J = new C44551zG(A00, A002, A003, A004, A005, A006, A007, A008, A0S, A01, A012, A009, A0010, A0011, A0012, C455522n.A06, C0E7.A00(), C0F2.A00());
                }
            }
        }
        return A0J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0010, code lost:
        if (r3.A0G.A00() != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C454622d r3, int r4) {
        /*
            X.0CK r0 = r3.A0C
            java.lang.Object r0 = r0.A00()
            r2 = 1
            if (r0 != 0) goto L12
            X.0CK r0 = r3.A0G
            java.lang.Object r1 = r0.A00()
            r0 = 0
            if (r1 == 0) goto L13
        L12:
            r0 = 1
        L13:
            X.C000700j.A07(r0)
            if (r4 != r2) goto L35
            X.0CK r0 = r3.A07
            java.lang.Object r0 = r0.A00()
            X.0KW r0 = (X.C0KW) r0
            if (r0 == 0) goto L35
            java.io.File r1 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L35
            boolean r0 = X.AnonymousClass024.A0f(r1)
            if (r0 == 0) goto L35
            r1.getAbsolutePath()
        L35:
            X.0CK r1 = r3.A09
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44551zG.A01(X.22d, int):void");
    }

    public static void A02(File file) {
        if (file == null) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("size=");
        A0P.append(file.length());
        A0P.append(" exists=");
        A0P.append(file.exists());
        A0P.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:394:0x0300, code lost:
        if (r0.intValue() == 3) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0296 A[Catch: all -> 0x0391, TryCatch #0 {, blocks: (B:258:0x0081, B:260:0x008b, B:283:0x0114, B:284:0x0119, B:298:0x015e, B:309:0x0195, B:311:0x019d, B:313:0x01a5, B:314:0x01aa, B:316:0x01c2, B:317:0x01d3, B:319:0x01d7, B:320:0x01dd, B:322:0x01e1, B:324:0x01e5, B:337:0x020d, B:338:0x0211, B:342:0x021a, B:343:0x0222, B:345:0x022c, B:348:0x0235, B:350:0x023b, B:352:0x023f, B:354:0x024b, B:355:0x024f, B:361:0x0267, B:362:0x026f, B:364:0x027d, B:368:0x028e, B:370:0x0296, B:373:0x029f, B:375:0x02af, B:379:0x02bb, B:381:0x02bf, B:382:0x02db, B:384:0x02df, B:388:0x02e9, B:390:0x02ef, B:392:0x02f3, B:393:0x02fc, B:395:0x0302, B:397:0x0306, B:399:0x0324, B:401:0x032a, B:403:0x033a, B:378:0x02b7, B:366:0x0288, B:404:0x0341, B:406:0x035b, B:408:0x0361, B:409:0x0365, B:413:0x036d, B:327:0x01ec, B:329:0x01f0, B:330:0x01f5, B:333:0x0202, B:416:0x0390, B:304:0x017d, B:305:0x0184, B:308:0x0191, B:306:0x0185, B:307:0x018a, B:294:0x0153, B:295:0x015a, B:262:0x0090, B:263:0x0096, B:264:0x009d, B:265:0x00a4, B:266:0x00aa, B:267:0x00b0, B:268:0x00b7, B:269:0x00be, B:270:0x00c5, B:271:0x00cc, B:272:0x00d2, B:273:0x00d9, B:274:0x00e0, B:275:0x00e7, B:276:0x00ee, B:277:0x00f4, B:278:0x00fb, B:280:0x0104, B:281:0x010b), top: B:423:0x0081, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02af A[Catch: all -> 0x0391, TryCatch #0 {, blocks: (B:258:0x0081, B:260:0x008b, B:283:0x0114, B:284:0x0119, B:298:0x015e, B:309:0x0195, B:311:0x019d, B:313:0x01a5, B:314:0x01aa, B:316:0x01c2, B:317:0x01d3, B:319:0x01d7, B:320:0x01dd, B:322:0x01e1, B:324:0x01e5, B:337:0x020d, B:338:0x0211, B:342:0x021a, B:343:0x0222, B:345:0x022c, B:348:0x0235, B:350:0x023b, B:352:0x023f, B:354:0x024b, B:355:0x024f, B:361:0x0267, B:362:0x026f, B:364:0x027d, B:368:0x028e, B:370:0x0296, B:373:0x029f, B:375:0x02af, B:379:0x02bb, B:381:0x02bf, B:382:0x02db, B:384:0x02df, B:388:0x02e9, B:390:0x02ef, B:392:0x02f3, B:393:0x02fc, B:395:0x0302, B:397:0x0306, B:399:0x0324, B:401:0x032a, B:403:0x033a, B:378:0x02b7, B:366:0x0288, B:404:0x0341, B:406:0x035b, B:408:0x0361, B:409:0x0365, B:413:0x036d, B:327:0x01ec, B:329:0x01f0, B:330:0x01f5, B:333:0x0202, B:416:0x0390, B:304:0x017d, B:305:0x0184, B:308:0x0191, B:306:0x0185, B:307:0x018a, B:294:0x0153, B:295:0x015a, B:262:0x0090, B:263:0x0096, B:264:0x009d, B:265:0x00a4, B:266:0x00aa, B:267:0x00b0, B:268:0x00b7, B:269:0x00be, B:270:0x00c5, B:271:0x00cc, B:272:0x00d2, B:273:0x00d9, B:274:0x00e0, B:275:0x00e7, B:276:0x00ee, B:277:0x00f4, B:278:0x00fb, B:280:0x0104, B:281:0x010b), top: B:423:0x0081, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02bf A[Catch: all -> 0x0391, TryCatch #0 {, blocks: (B:258:0x0081, B:260:0x008b, B:283:0x0114, B:284:0x0119, B:298:0x015e, B:309:0x0195, B:311:0x019d, B:313:0x01a5, B:314:0x01aa, B:316:0x01c2, B:317:0x01d3, B:319:0x01d7, B:320:0x01dd, B:322:0x01e1, B:324:0x01e5, B:337:0x020d, B:338:0x0211, B:342:0x021a, B:343:0x0222, B:345:0x022c, B:348:0x0235, B:350:0x023b, B:352:0x023f, B:354:0x024b, B:355:0x024f, B:361:0x0267, B:362:0x026f, B:364:0x027d, B:368:0x028e, B:370:0x0296, B:373:0x029f, B:375:0x02af, B:379:0x02bb, B:381:0x02bf, B:382:0x02db, B:384:0x02df, B:388:0x02e9, B:390:0x02ef, B:392:0x02f3, B:393:0x02fc, B:395:0x0302, B:397:0x0306, B:399:0x0324, B:401:0x032a, B:403:0x033a, B:378:0x02b7, B:366:0x0288, B:404:0x0341, B:406:0x035b, B:408:0x0361, B:409:0x0365, B:413:0x036d, B:327:0x01ec, B:329:0x01f0, B:330:0x01f5, B:333:0x0202, B:416:0x0390, B:304:0x017d, B:305:0x0184, B:308:0x0191, B:306:0x0185, B:307:0x018a, B:294:0x0153, B:295:0x015a, B:262:0x0090, B:263:0x0096, B:264:0x009d, B:265:0x00a4, B:266:0x00aa, B:267:0x00b0, B:268:0x00b7, B:269:0x00be, B:270:0x00c5, B:271:0x00cc, B:272:0x00d2, B:273:0x00d9, B:274:0x00e0, B:275:0x00e7, B:276:0x00ee, B:277:0x00f4, B:278:0x00fb, B:280:0x0104, B:281:0x010b), top: B:423:0x0081, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x02df A[Catch: all -> 0x0391, TryCatch #0 {, blocks: (B:258:0x0081, B:260:0x008b, B:283:0x0114, B:284:0x0119, B:298:0x015e, B:309:0x0195, B:311:0x019d, B:313:0x01a5, B:314:0x01aa, B:316:0x01c2, B:317:0x01d3, B:319:0x01d7, B:320:0x01dd, B:322:0x01e1, B:324:0x01e5, B:337:0x020d, B:338:0x0211, B:342:0x021a, B:343:0x0222, B:345:0x022c, B:348:0x0235, B:350:0x023b, B:352:0x023f, B:354:0x024b, B:355:0x024f, B:361:0x0267, B:362:0x026f, B:364:0x027d, B:368:0x028e, B:370:0x0296, B:373:0x029f, B:375:0x02af, B:379:0x02bb, B:381:0x02bf, B:382:0x02db, B:384:0x02df, B:388:0x02e9, B:390:0x02ef, B:392:0x02f3, B:393:0x02fc, B:395:0x0302, B:397:0x0306, B:399:0x0324, B:401:0x032a, B:403:0x033a, B:378:0x02b7, B:366:0x0288, B:404:0x0341, B:406:0x035b, B:408:0x0361, B:409:0x0365, B:413:0x036d, B:327:0x01ec, B:329:0x01f0, B:330:0x01f5, B:333:0x0202, B:416:0x0390, B:304:0x017d, B:305:0x0184, B:308:0x0191, B:306:0x0185, B:307:0x018a, B:294:0x0153, B:295:0x015a, B:262:0x0090, B:263:0x0096, B:264:0x009d, B:265:0x00a4, B:266:0x00aa, B:267:0x00b0, B:268:0x00b7, B:269:0x00be, B:270:0x00c5, B:271:0x00cc, B:272:0x00d2, B:273:0x00d9, B:274:0x00e0, B:275:0x00e7, B:276:0x00ee, B:277:0x00f4, B:278:0x00fb, B:280:0x0104, B:281:0x010b), top: B:423:0x0081, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x032a A[Catch: all -> 0x0391, TryCatch #0 {, blocks: (B:258:0x0081, B:260:0x008b, B:283:0x0114, B:284:0x0119, B:298:0x015e, B:309:0x0195, B:311:0x019d, B:313:0x01a5, B:314:0x01aa, B:316:0x01c2, B:317:0x01d3, B:319:0x01d7, B:320:0x01dd, B:322:0x01e1, B:324:0x01e5, B:337:0x020d, B:338:0x0211, B:342:0x021a, B:343:0x0222, B:345:0x022c, B:348:0x0235, B:350:0x023b, B:352:0x023f, B:354:0x024b, B:355:0x024f, B:361:0x0267, B:362:0x026f, B:364:0x027d, B:368:0x028e, B:370:0x0296, B:373:0x029f, B:375:0x02af, B:379:0x02bb, B:381:0x02bf, B:382:0x02db, B:384:0x02df, B:388:0x02e9, B:390:0x02ef, B:392:0x02f3, B:393:0x02fc, B:395:0x0302, B:397:0x0306, B:399:0x0324, B:401:0x032a, B:403:0x033a, B:378:0x02b7, B:366:0x0288, B:404:0x0341, B:406:0x035b, B:408:0x0361, B:409:0x0365, B:413:0x036d, B:327:0x01ec, B:329:0x01f0, B:330:0x01f5, B:333:0x0202, B:416:0x0390, B:304:0x017d, B:305:0x0184, B:308:0x0191, B:306:0x0185, B:307:0x018a, B:294:0x0153, B:295:0x015a, B:262:0x0090, B:263:0x0096, B:264:0x009d, B:265:0x00a4, B:266:0x00aa, B:267:0x00b0, B:268:0x00b7, B:269:0x00be, B:270:0x00c5, B:271:0x00cc, B:272:0x00d2, B:273:0x00d9, B:274:0x00e0, B:275:0x00e7, B:276:0x00ee, B:277:0x00f4, B:278:0x00fb, B:280:0x0104, B:281:0x010b), top: B:423:0x0081, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x027d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C0KX A03(X.C04140Is r19, X.C22v r20, X.C456322w r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44551zG.A03(X.0Is, X.22v, X.22w, int, int, int):X.0KX");
    }

    public C0KX A04(C454622d c454622d, int i, int i2) {
        return A03(c454622d.A00(), c454622d.A01(), (C456322w) c454622d.A0G.A00(), i, i2, c454622d.A01().A00());
    }

    public C454622d A05(C454422b c454422b, boolean z) {
        InterfaceC43611xg anonymousClass231;
        C43591xe c43591xe = c454422b.A00;
        C0DC c0dc = c43591xe.A05;
        if (c43591xe.A0A) {
            anonymousClass231 = new AnonymousClass230(c0dc);
        } else {
            anonymousClass231 = new AnonymousClass231(c0dc);
        }
        C41491u0 c41491u0 = this.A08;
        C43121wt c43121wt = c41491u0.A0J;
        String str = c454422b.A03;
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        C04140Is A02 = c43121wt.A02(0, str);
        C454622d c454622d = new C454622d(A02, c454422b, new C22v(c41491u0.A0Q, c43121wt, A02, z), anonymousClass231);
        c454622d.A08.A04(c454622d.A00().A0C);
        c454622d.A01().A02();
        return c454622d;
    }

    public C454622d A06(C454422b c454422b, boolean z) {
        C43121wt c43121wt;
        C04140Is A03;
        InterfaceC43611xg anonymousClass231;
        C41491u0 c41491u0 = this.A08;
        if (c41491u0 != null) {
            String str = c454422b.A03;
            if (str != null && (A03 = (c43121wt = c41491u0.A0J).A03(str, 0)) != null) {
                C22v c22v = new C22v(c41491u0.A0Q, c43121wt, A03, z);
                C43591xe c43591xe = c454422b.A00;
                C0DC c0dc = c43591xe.A05;
                if (c43591xe.A0A) {
                    anonymousClass231 = new AnonymousClass230(c0dc);
                } else {
                    anonymousClass231 = new AnonymousClass231(c0dc);
                }
                C454622d c454622d = new C454622d(A03, c454422b, c22v, anonymousClass231);
                if (z) {
                    c454622d.A00().A03++;
                }
                this.A09.A05(c454622d.A00());
                c454622d.A08.A04(c454622d.A00().A0C);
                c454622d.A01().A02();
                return c454622d;
            }
            return A05(c454422b, z);
        }
        throw null;
    }

    public void A07(C454622d c454622d) {
        c454622d.A02 = true;
        C455522n c455522n = this.A0B;
        c455522n.A04.A00(c454622d.A03().A05).A06(c454622d);
        c455522n.A02.A06(c454622d);
        c455522n.A03.A06(c454622d);
        C455422m c455422m = this.A0E;
        c455422m.A06(c454622d);
        AnonymousClass234 anonymousClass234 = c454622d.A01;
        if (anonymousClass234 != null) {
            c455422m.A06(anonymousClass234);
        }
    }

    public void A08(C454622d c454622d) {
        C456322w c456322w = (C456322w) c454622d.A0G.A00();
        if (c456322w != null) {
            A0C(c454622d, c456322w);
            return;
        }
        AnonymousClass235 anonymousClass235 = (AnonymousClass235) c454622d.A0C.A00();
        if (anonymousClass235 != null) {
            A0E(anonymousClass235, c454622d);
        }
    }

    public void A09(final C454622d c454622d) {
        final AnonymousClass232 A03 = c454622d.A03();
        final C455522n c455522n = this.A0B;
        if (c455522n != null) {
            final C0KY c0ky = new C0KY(c455522n.A01);
            final AnonymousClass236 anonymousClass236 = new AnonymousClass236(c0ky);
            if (!A03.A0C && A03.A07 == null) {
                AnonymousClass237 anonymousClass237 = anonymousClass236.A07;
                AnonymousClass238 anonymousClass238 = anonymousClass236.A06;
                AnonymousClass239 anonymousClass239 = anonymousClass236.A05;
                String str = A03.A0B;
                if (str != null) {
                    File A00 = A03.A00();
                    StringBuilder sb = new StringBuilder();
                    sb.append(UUID.randomUUID().toString());
                    sb.append(".tmp");
                    C23A c23a = new C23A(c454622d, c0ky, anonymousClass237, anonymousClass238, anonymousClass239, str, c455522n.A00(A00, sb.toString()));
                    c455522n.A04.A00(A03.A05).A01(c23a.A02, c23a);
                } else {
                    throw null;
                }
            } else {
                C0DC c0dc = A03.A05;
                if (c0dc == C0DC.A04) {
                    c455522n.A02.A07(c454622d, A03.A08, c455522n.A00.A00, new C23C() { // from class: X.3Fr
                        @Override // X.C23C
                        public final void ALS(C2EK c2ek) {
                            C455522n c455522n2 = c455522n;
                            C22e c22e = c454622d;
                            AnonymousClass232 anonymousClass232 = A03;
                            AnonymousClass236 anonymousClass2362 = anonymousClass236;
                            C0KY c0ky2 = c0ky;
                            C455622o c455622o = c455522n2.A03;
                            File file = anonymousClass232.A07;
                            String str2 = anonymousClass232.A0B;
                            int i = anonymousClass232.A00;
                            C67453Fo c67453Fo = new C67453Fo(c455522n2, anonymousClass2362, c22e, c0ky2, anonymousClass232, c2ek);
                            if (file != null) {
                                c67453Fo.A00(file, false);
                            } else if (str2 != null) {
                                InterfaceRunnableC62892yj interfaceRunnableC62892yj = new InterfaceRunnableC62892yj(c455622o.A00, c22e, str2, i, c67453Fo) { // from class: X.3Fk
                                    public final int A00;
                                    public final C455822q A01;
                                    public final C22e A02;
                                    public final C67453Fo A03;
                                    public final String A04;

                                    {
                                        this.A01 = r1;
                                        this.A02 = c22e;
                                        this.A04 = str2;
                                        this.A00 = i;
                                        this.A03 = c67453Fo;
                                    }

                                    @Override // X.InterfaceRunnableC62892yj
                                    public C22e ABB() {
                                        return this.A02;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        File file2;
                                        C455822q c455822q = this.A01;
                                        String str3 = this.A04;
                                        int i2 = this.A00;
                                        File file3 = null;
                                        if (c455822q != null) {
                                            C000700j.A00();
                                            C04560Kx A05 = c455822q.A06.A05();
                                            C3KT c3kt = new C3KT(c455822q.A05, c455822q.A02, c455822q.A03, c455822q.A07, str3, i2, c455822q.A08, A05, C455822q.A0C);
                                            C61382w3 A0A = c3kt.A0A();
                                            AnonymousClass240 anonymousClass240 = c3kt.A05;
                                            String str4 = c3kt.A06;
                                            byte[] bArr = null;
                                            if (A0A == null) {
                                                file2 = null;
                                            } else {
                                                file2 = A0A.A02;
                                                bArr = A0A.A03;
                                            }
                                            anonymousClass240.AKO(str4, file2, bArr);
                                            GifCacheItemSerializable A032 = A05.A03(str3);
                                            if (A032 == null || (file3 = A032.A00()) == null) {
                                                StringBuilder A0P = C000200d.A0P("MediaLoadGifJob/failed to load, name: ");
                                                A0P.append(str3);
                                                A0P.append(", attribution:");
                                                A0P.append(i2);
                                                Log.e(A0P.toString());
                                            }
                                            this.A03.A00(file3, true);
                                            return;
                                        }
                                        throw null;
                                    }
                                };
                                c455622o.A01(interfaceRunnableC62892yj.ABB(), interfaceRunnableC62892yj);
                            } else {
                                throw null;
                            }
                        }
                    });
                } else if (c0dc != C0DC.A0N && c0dc != C0DC.A0Q) {
                    C0DC c0dc2 = C0DC.A05;
                    if (c0dc != c0dc2 && c0dc != C0DC.A0D) {
                        C0DC c0dc3 = C0DC.A0A;
                        if (c0dc != c0dc3 && c0dc != C0DC.A0P && c0dc != C0DC.A0C && c0dc != C0DC.A0H && c0dc != C0DC.A06) {
                            C0DC c0dc4 = C0DC.A0I;
                            if (c0dc == c0dc4) {
                                File file = A03.A07;
                                String str2 = A03.A0B;
                                String str3 = A03.A09;
                                C04050If c04050If = A03.A06;
                                AnonymousClass237 anonymousClass2372 = anonymousClass236.A07;
                                AnonymousClass238 anonymousClass2382 = anonymousClass236.A06;
                                AnonymousClass239 anonymousClass2392 = anonymousClass236.A05;
                                File A002 = A03.A00();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(UUID.randomUUID().toString());
                                sb2.append(".webp");
                                C23D c23d = new C23D(c454622d, file, str2, str3, c04050If, c0ky, anonymousClass2372, anonymousClass2382, anonymousClass2392, c455522n.A00(A002, sb2.toString()));
                                c455522n.A04.A00(c0dc4).A01(((C23B) c23d).A02, c23d);
                            }
                        } else {
                            String str4 = A03.A0B;
                            if (str4 != null) {
                                AnonymousClass237 anonymousClass2373 = anonymousClass236.A07;
                                AnonymousClass238 anonymousClass2383 = anonymousClass236.A06;
                                AnonymousClass239 anonymousClass2393 = anonymousClass236.A05;
                                File A003 = A03.A00();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(UUID.randomUUID().toString());
                                sb3.append(".jpg");
                                File A004 = c455522n.A00(A003, sb3.toString());
                                C454522c c454522c = A03.A04;
                                if (c454522c != null) {
                                    C23E c23e = new C23E(c454622d, str4, c0ky, anonymousClass2373, anonymousClass2383, anonymousClass2393, A004, c454522c, A03.A0E, A03.A0D);
                                    c455522n.A04.A00(c0dc3).A01(((C23B) c23e).A02, c23e);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        AnonymousClass237 anonymousClass2374 = anonymousClass236.A07;
                        AnonymousClass238 anonymousClass2384 = anonymousClass236.A06;
                        AnonymousClass239 anonymousClass2394 = anonymousClass236.A05;
                        File file2 = A03.A07;
                        if (file2 != null) {
                            boolean z = A03.A0G;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(UUID.randomUUID().toString());
                            sb4.append(".aac");
                            C23F c23f = new C23F(c454622d, c0ky, anonymousClass2374, anonymousClass2384, anonymousClass2394, file2, z, c455522n.A00(file2, sb4.toString()));
                            c455522n.A04.A00(c0dc2).A01(c23f.A02, c23f);
                        } else {
                            throw null;
                        }
                    }
                } else {
                    c455522n.A02.A07(c454622d, A03.A08, c455522n.A00.A00, new C23C() { // from class: X.3Fs
                        @Override // X.C23C
                        public final void ALS(C2EK c2ek) {
                            final C455522n c455522n2 = c455522n;
                            final C22e c22e = c454622d;
                            C0KY c0ky2 = c0ky;
                            final AnonymousClass232 anonymousClass232 = A03;
                            final AnonymousClass236 anonymousClass2362 = anonymousClass236;
                            AnonymousClass237 anonymousClass2375 = new AnonymousClass237() { // from class: X.3Fp
                                @Override // X.AnonymousClass237
                                public final void AKW(AnonymousClass235 anonymousClass235) {
                                    C455522n c455522n3 = c455522n2;
                                    C22e c22e2 = c22e;
                                    AnonymousClass232 anonymousClass2322 = anonymousClass232;
                                    AnonymousClass236 anonymousClass2363 = anonymousClass2362;
                                    if (anonymousClass235.A02) {
                                        C456222u c456222u = c455522n3.A02;
                                        String str5 = anonymousClass2322.A08;
                                        Application application = c455522n3.A00.A00;
                                        if (str5 != null) {
                                            C68643Kv c68643Kv = new C68643Kv(c456222u.A00, c456222u.A02, c22e2, str5, application);
                                            c456222u.A01(c68643Kv.ABB(), c68643Kv);
                                        }
                                    }
                                    anonymousClass2363.A04.A04(anonymousClass235);
                                }
                            };
                            AnonymousClass238 anonymousClass2385 = anonymousClass2362.A06;
                            AnonymousClass239 anonymousClass2395 = anonymousClass2362.A05;
                            File file3 = anonymousClass232.A07;
                            if (file3 != null) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(UUID.randomUUID().toString());
                                sb5.append(".mp4");
                                C23P c23p = new C23P(c22e, c0ky2, anonymousClass2375, anonymousClass2385, anonymousClass2395, file3, c455522n2.A00(file3, sb5.toString()), anonymousClass232.A02, anonymousClass232.A03, c2ek, anonymousClass232.A0G, anonymousClass232.A0D, anonymousClass232.A0F);
                                c455522n2.A04.A00(C0DC.A0N).A01(((C23B) c23p).A02, c23p);
                                return;
                            }
                            throw null;
                        }
                    });
                }
            }
            C22v A01 = c454622d.A01();
            C0KY c0ky2 = anonymousClass236.A00;
            synchronized (A01) {
                A01.A03 = c0ky2;
            }
            A0B(c454622d, anonymousClass236);
            return;
        }
        throw null;
    }

    public void A0A(final C454622d c454622d, C04150It c04150It) {
        C455422m c455422m = this.A0E;
        StringBuilder sb = new StringBuilder("mediauploadqueue/enqueue ");
        sb.append(c04150It);
        Log.i(sb.toString());
        final C43431xO c43431xO = (C43431xO) c455422m.A01(c454622d, c04150It);
        C22v A01 = c454622d.A01();
        C456422x c456422x = c43431xO.A0P.A04;
        synchronized (A01) {
            A01.A04 = c456422x;
        }
        int A012 = c04150It.A01();
        boolean z = true;
        if (A012 != 3 && A012 != 1) {
            z = false;
        }
        if (!z) {
            c43431xO.A0B.A03(c454622d.A0N, this.A0I);
        }
        C0CG c0cg = new C0CG() { // from class: X.3F4
            {
                C44551zG.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C44551zG c44551zG = C44551zG.this;
                C454622d c454622d2 = c454622d;
                C43431xO c43431xO2 = c43431xO;
                C22v A013 = c454622d2.A01();
                synchronized (A013) {
                    A013.A09 = true;
                }
                c44551zG.A0H.AS1(new RunnableEBaseShape0S0300000_I0_0(c44551zG, c454622d2, obj, 24));
                c43431xO2.A03();
            }
        };
        Executor executor = this.A0I;
        c43431xO.A0E.A03(c0cg, executor);
        c43431xO.A0C.A03(new C0CG() { // from class: X.3F3
            {
                C44551zG.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                boolean z2;
                C0DI A0L;
                Bitmap bitmap;
                Bitmap A08;
                byte[] A00;
                C44551zG c44551zG = C44551zG.this;
                final C454622d c454622d2 = c454622d;
                C63202zM c63202zM = (C63202zM) obj;
                C0DC c0dc = c454622d2.A03().A05;
                C22a c22a = c454622d2.A0K.A02;
                if (!c44551zG.A0F(c0dc, c22a.A00, c454622d2.A02().A0E)) {
                    c454622d2.A03 = null;
                    return;
                }
                byte[] bArr = c454622d2.A03;
                if (bArr == null) {
                    return;
                }
                try {
                    File A06 = c44551zG.A04.A06();
                    AnonymousClass024.A0b(bArr, A06);
                    A06.getAbsolutePath();
                    C43591xe c43591xe = new C43591xe(C0DC.A00(c454622d2.A03().A05.A00), A06, 0L, null, null, null, 0, true, "mms", true, false, null, 0, false, c63202zM);
                    C41491u0 c41491u0 = c44551zG.A08;
                    byte b = c454622d2.A03().A05.A00;
                    int i = c454622d2.A03().A01;
                    C22v A013 = c454622d2.A01();
                    synchronized (A013) {
                        z2 = A013.A0F;
                    }
                    String str = c454622d2.A00().A0C;
                    C43121wt c43121wt = c41491u0.A0J;
                    C04140Is A03 = c43121wt.A03(str, 2);
                    if (A03 == null) {
                        A03 = c43121wt.A02(2, str);
                    } else if (z2) {
                        A03.A03++;
                    }
                    C22v c22v = new C22v(c41491u0.A0Q, c43121wt, A03, z2);
                    synchronized (c22v) {
                        c22v.A05 = Integer.valueOf(C002701i.A00(b, i, false));
                    }
                    AnonymousClass234 anonymousClass234 = new AnonymousClass234(A03, c22v);
                    C0DC c0dc2 = c43591xe.A05;
                    if (c0dc2 == C0DC.A08 && (bitmap = (A0L = C002701i.A0L(A06, new C0DH(96, 96, null, true, null))).A02) != null && (A00 = C2z2.A00((A08 = C0DD.A08(bitmap, null, 96, 96)), 48, false)) != null) {
                        Pair pair = new Pair(Integer.valueOf(A0L.A01), Integer.valueOf(A0L.A00));
                        A08.getWidth();
                        A08.getHeight();
                        c454622d2.A04.A04(new C23J(A00, pair, null, null));
                    }
                    C04150It c04150It2 = new C04150It(anonymousClass234.A00, c43591xe, c22a, new AnonymousClass230(c0dc2));
                    C22v c22v2 = anonymousClass234.A01;
                    C456422x c456422x2 = c04150It2.A04;
                    synchronized (c22v2) {
                        c22v2.A04 = c456422x2;
                    }
                    c454622d2.A01 = anonymousClass234;
                    C455422m c455422m2 = c44551zG.A0E;
                    StringBuilder sb2 = new StringBuilder("mediauploadqueue/enqueue ");
                    sb2.append(c04150It2);
                    Log.i(sb2.toString());
                    ((C43431xO) c455422m2.A01(anonymousClass234, c04150It2)).A0E.A03(new C0CG() { // from class: X.3FN
                        @Override // X.C0CG
                        public final void A54(Object obj2) {
                            c454622d2.A0D.A04(obj2);
                        }
                    }, c44551zG.A0I);
                } catch (IOException e) {
                    Log.e("MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file", e);
                    c454622d2.A03 = null;
                }
            }
        }, null);
        if (z) {
            return;
        }
        c43431xO.A0D.A03(c454622d.A0O, executor);
    }

    public final void A0B(final C454622d c454622d, final AnonymousClass236 anonymousClass236) {
        anonymousClass236.A02.A03(c454622d.A0L, null);
        anonymousClass236.A03.A03(c454622d.A0M, null);
        anonymousClass236.A04.A03(new C0CG() { // from class: X.3F6
            {
                C44551zG.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C44551zG c44551zG = C44551zG.this;
                C454622d c454622d2 = c454622d;
                AnonymousClass236 anonymousClass2362 = anonymousClass236;
                AnonymousClass235 anonymousClass235 = (AnonymousClass235) obj;
                synchronized (c454622d2.A01()) {
                    SystemClock.uptimeMillis();
                }
                File file = anonymousClass235.A01;
                boolean z = false;
                if (file != null) {
                    c454622d2.A07.A04(new C0KW(file, false));
                }
                c454622d2.A0C.A04(anonymousClass235);
                C41571uA c41571uA = c44551zG.A0A;
                C0DC c0dc = c454622d2.A03().A05;
                if (c41571uA != null) {
                    if (C0HW.A02(c0dc)) {
                        if ((C23X.A01(c41571uA.A05, c41571uA.A03.A03(false)) & 1) != 0) {
                            z = true;
                        }
                    }
                    C22v A01 = c454622d2.A01();
                    synchronized (A01) {
                        A01.A0A = true;
                    }
                    if (c454622d2.A0S == null && !c454622d2.A02 && !z) {
                        C22v A012 = c454622d2.A01();
                        C456422x c456422x = new C456422x();
                        synchronized (A012) {
                            A012.A04 = c456422x;
                        }
                        c454622d2.A05(14);
                    } else {
                        c44551zG.A0E(anonymousClass235, c454622d2);
                    }
                    anonymousClass2362.A02.A01();
                    anonymousClass2362.A03.A01();
                    anonymousClass2362.A04.A01();
                    anonymousClass2362.A01.A01();
                    return;
                }
                throw null;
            }
        }, null);
        anonymousClass236.A01.A03(new C0CG() { // from class: X.3F2
            {
                C44551zG.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C44551zG c44551zG = C44551zG.this;
                Number number = (Number) obj;
                if (c454622d.A0S != null) {
                    c44551zG.A01.A04(number.intValue());
                }
            }
        }, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0073, code lost:
        if (r7 == 0) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0C(final X.C454622d r22, X.C456322w r23) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44551zG.A0C(X.22d, X.22w):void");
    }

    public void A0D(C454622d c454622d, String str) {
        StringBuilder sb = new StringBuilder("app/mediajobmanager/enqueuemediaupload ");
        sb.append(str);
        Log.i(sb.toString());
        AnonymousClass232 A03 = c454622d.A03();
        C0DC c0dc = A03.A05;
        boolean z = A03.A0G;
        boolean z2 = A03.A0C;
        File file = A03.A07;
        if (z && !this.A0D.A03(c0dc, file)) {
            StringBuilder sb2 = new StringBuilder("app/mediajobmanager/enqueuemediaupload we cannot transcode media that needs transcoding ");
            sb2.append(str);
            Log.e(sb2.toString());
            c454622d.A05(21);
        } else if (c0dc == C0DC.A07 && C0DD.A00(A03.A0A) == -1) {
            StringBuilder sb3 = new StringBuilder("app/mediajobmanager/enqueuemediaupload we are unable to determine the mimetype of this document ");
            sb3.append(str);
            Log.e(sb3.toString());
            c454622d.A05(21);
        } else if (c454622d.A0C.A00() != null) {
            A08(c454622d);
        } else {
            if (!z && c0dc != C0DC.A0N && c0dc != C0DC.A0Q && c0dc != C0DC.A04 && c0dc != C0DC.A0M && c0dc != C0DC.A0K && !this.A0D.A04(c0dc, file)) {
                if (z2) {
                    if (file == null) {
                        StringBuilder A0P = C000200d.A0P("app/mediajobmanager queuing media into upload queue with null file, media_type=");
                        A0P.append(c0dc);
                        A0P.append("; media_name=");
                        A0P.append(A03.A0B);
                        A0P.append(" ");
                        A0P.append(str);
                        Log.e(A0P.toString());
                        c454622d.A05(7);
                        return;
                    }
                    A0A(c454622d, new C04150It(c454622d.A02(), c454622d));
                }
            } else if (z2) {
                A09(c454622d);
                return;
            }
            if (file == null) {
                A09(c454622d);
                return;
            }
            A0A(c454622d, new C04150It(c454622d.A02(), c454622d));
        }
    }

    public final void A0E(AnonymousClass235 anonymousClass235, C454622d c454622d) {
        if (!c454622d.A0Q.compareAndSet(false, true)) {
            return;
        }
        if (c454622d.A02) {
            A01(c454622d, 1);
        } else if (anonymousClass235.A02) {
            byte[] bArr = anonymousClass235.A03;
            C04150It c04150It = new C04150It(c454622d.A02(), c454622d);
            if (!A0F(c454622d.A03().A05, c454622d.A0K.A02.A00, c454622d.A02().A0E)) {
                c454622d.A03 = null;
            } else if (bArr != null) {
                c454622d.A03 = bArr;
            }
            if (!c454622d.A02) {
                A0A(c454622d, c04150It);
                return;
            }
            StringBuilder sb = new StringBuilder("mediatranscodequeue/success/all-cancelled ");
            sb.append(c454622d);
            Log.i(sb.toString());
        } else {
            A01(c454622d, 20);
        }
    }

    public boolean A0F(C0DC c0dc, boolean z, int[] iArr) {
        C003701t c003701t = this.A06;
        if (!c003701t.A0C(247) || c0dc != C0DC.A07) {
            if (!c003701t.A0C(246)) {
                return false;
            }
            if (((c0dc != C0DC.A0A || (iArr != null && iArr.length >= 2)) && c0dc != C0DC.A0N && c0dc != C0DC.A04) || !z) {
                return false;
            }
        }
        return true;
    }
}
