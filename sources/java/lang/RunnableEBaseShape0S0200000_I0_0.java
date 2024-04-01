package java.lang;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0200000_I0_0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape0S0200000_I0_0(ViewGroup viewGroup, MotionEvent motionEvent) {
        this.A02 = 39;
        this.A01 = viewGroup;
        this.A00 = motionEvent;
    }

    public RunnableEBaseShape0S0200000_I0_0(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1264:0x0579, code lost:
        if (r1 != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1395:0x0900, code lost:
        r14 = r18.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1397:0x0908, code lost:
        if (r14.hasNext() == false) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1398:0x090a, code lost:
        r3 = (X.AbstractC44611zM) r14.next();
        r10 = new X.C49252Jh(r3.A06(), r3.A03, r3.A00, r3.A06);
        r2 = new X.AnonymousClass206(r10);
        r12.add(new X.C0FK(r10, r2));
        r1.add(r2.A02);
        r3.A00 = r0;
        r12.add(new X.C0FK(r3, new X.AnonymousClass206(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:1399:0x0943, code lost:
        r26 = r0.A03(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1400:0x094f, code lost:
        if (r26.containsValue(null) != false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1401:0x0951, code lost:
        r25 = new java.util.ArrayList();
        r24 = new java.util.ArrayList();
        r23 = new java.util.ArrayList();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1403:0x0965, code lost:
        if (r11 >= r12.size()) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1404:0x0967, code lost:
        r0 = ((X.C0FK) r12.get(r11)).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1405:0x0971, code lost:
        if (r0 == null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1406:0x0973, code lost:
        r0 = (X.AbstractC44611zM) r0;
        r24.add(r0);
        r0 = ((X.C0FK) r12.get(r11)).A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1407:0x098a, code lost:
        if (r0 == null) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1408:0x098c, code lost:
        r0 = (X.AnonymousClass206) r0;
        r14 = r26.get(r0.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1409:0x099a, code lost:
        if (r14 == null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1410:0x099c, code lost:
        r14 = (X.C44961zw) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1411:0x099e, code lost:
        r0 = r5.A05;
        r13 = r0.A00.A00(r14.A00);
        r1 = r0.A04;
        r18 = r1.getBytes(X.C1z2.A01);
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1412:0x09ba, code lost:
        if (r0 == null) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1413:0x09bc, code lost:
        r2 = r0.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1414:0x09c0, code lost:
        r16 = X.C02A.A0C(16);
        r15 = X.C02A.A0C(java.lang.Math.max(0, (0 - r18.length) - r2.length));
        r3 = X.C459024e.A05.AVX();
        r2 = new X.C02230Aj(r1.getBytes(X.C02220Ai.A00));
        r3.A02();
        r1 = (X.C459024e) r3.A00;
        r1.A00 |= 1;
        r1.A02 = r2;
        r2 = X.C0AN.A01(r15, 0, r15.length);
        r3.A02();
        r1 = (X.C459024e) r3.A00;
        r1.A00 |= 4;
        r1.A03 = r2;
        r2 = r0.A00;
        r3.A02();
        r1 = (X.C459024e) r3.A00;
        r1.A00 |= 8;
        r1.A01 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1415:0x0a1e, code lost:
        r2 = X.C1z2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1416:0x0a21, code lost:
        if (r0 == null) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1417:0x0a23, code lost:
        r3.A02();
        r1 = (X.C459024e) r3.A00;
        r1.A04 = r0;
        r1.A00 |= 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1418:0x0a34, code lost:
        r16 = X.AnonymousClass029.A1h(r16, X.C1z2.A01(1, r16, r3.A01().A0B(), r13.A03));
        r1 = r14.A01;
        r14 = r0.A01;
        r2 = new X.C458924d(r1, X.C1z2.A02("HmacSHA256", r18, r13.A00), r14, X.AnonymousClass029.A1h(r16, r0.A03(r1, r14.A01, r13.A04, r16)));
        r14 = X.C458624a.A02.AVX();
        r3 = X.C0AN.A00(r2.A03);
        r14.A02();
        r1 = (X.C458624a) r14.A00;
        r1.A00 |= 1;
        r1.A01 = r3;
        r13 = X.C458724b.A02.AVX();
        r3 = X.C0AN.A00(r2.A02);
        r13.A02();
        r1 = (X.C458724b) r13.A00;
        r1.A00 |= 1;
        r1.A01 = r3;
        r3 = X.C24Z.A02.AVX();
        r10 = X.C0AN.A00(r2.A01.A00);
        r3.A02();
        r1 = (X.C24Z) r3.A00;
        r1.A00 |= 1;
        r1.A01 = r10;
        r10 = X.C24Y.A04.AVX();
        r10.A02();
        r1 = (X.C24Y) r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1419:0x0ae0, code lost:
        if (r1 == null) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1420:0x0ae2, code lost:
        r1.A02 = (X.C458624a) r14.A01();
        r1.A00 |= 1;
        r10.A02();
        r1 = (X.C24Y) r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1421:0x0af7, code lost:
        if (r1 == null) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1422:0x0af9, code lost:
        r1.A03 = (X.C458724b) r13.A01();
        r1.A00 |= 2;
        r10.A02();
        r1 = (X.C24Y) r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1423:0x0b0e, code lost:
        if (r1 == null) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1424:0x0b10, code lost:
        r1.A01 = (X.C24Z) r3.A01();
        r1.A00 |= 4;
        r3 = X.C24X.A03.AVX();
        r13 = r2.A00.A00;
        r3.A02();
        r1 = (X.C24X) r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1425:0x0b2f, code lost:
        if (r13 == null) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1426:0x0b31, code lost:
        r1.A00 |= 1;
        r1.A01 = r13.value;
        r3.A02();
        r1 = (X.C24X) r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1427:0x0b42, code lost:
        if (r1 == null) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1428:0x0b44, code lost:
        r1.A02 = (X.C24Y) r10.A01();
        r1.A00 |= 2;
        r25.add(r3.A01());
        r2 = r2.A04;
        r0.A02 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1429:0x0b67, code lost:
        if (r0.A01 != X.C44841zk.A03) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1430:0x0b69, code lost:
        r23.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1431:0x0b6e, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1432:0x0b72, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1433:0x0b73, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1434:0x0b74, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1435:0x0b75, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1436:0x0b76, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1439:0x0b79, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1440:0x0b7a, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/encryptMutations: ", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1441:0x0b86, code lost:
        throw new X.C44921zs(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1442:0x0b87, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1443:0x0b88, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1444:0x0b89, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1445:0x0b8a, code lost:
        r10 = r5.A03(r8, X.AnonymousClass205.A01(r24), r23);
        r2 = r5.A06.A01(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1446:0x0b9c, code lost:
        if (r2 != null) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1447:0x0b9e, code lost:
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1448:0x0ba1, code lost:
        r13 = r2.longValue() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1449:0x0ba6, code lost:
        r2 = r5.A05;
        r3 = r2.A05(r8, r13, r10, r4);
        r11 = new java.util.ArrayList();
        r1 = r24.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1451:0x0bc2, code lost:
        if (r1.hasNext() == false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1452:0x0bc4, code lost:
        r11.add(((X.AbstractC44611zM) r1.next()).A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1453:0x0bd0, code lost:
        r1 = r2.A04(r8, r13, r4, X.AnonymousClass029.A1e(r11), r3);
        r2 = new X.C49242Jg(r8, r24, r10);
        r2.A03 = r25;
        r2.A01 = null;
        r2.A05 = r3;
        r2.A04 = r1;
        r2.A00 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1454:0x0bfa, code lost:
        if (r0.A0E(X.C01C.A1O) == false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1456:0x0bfe, code lost:
        if (r5.A01 == null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1457:0x0c00, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1458:0x0c05, code lost:
        r2.A02 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1459:0x0c08, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1460:0x0c0a, code lost:
        r10 = r2.A00();
        r5 = r9.A00.A07(X.C01C.A3P);
        r3 = r1.A07(X.C01C.A3T) * 1000;
        r8 = r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1461:0x0c22, code lost:
        if (r8 == null) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1463:0x0c2a, code lost:
        if (r10.A02.size() > r5) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1465:0x0c33, code lost:
        if (r8.AD4() > r3) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1466:0x0c35, code lost:
        r6.A00(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1467:0x0c3a, code lost:
        r10 = X.C24W.A01.AVX();
        r4 = r8.A04;
        r10.A02();
        r3 = (X.C24W) r10.A00;
        r1 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1468:0x0c50, code lost:
        if (((X.C0CY) r1).A00 != false) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1469:0x0c52, code lost:
        r3.A00 = X.C0AZ.A05(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1470:0x0c58, code lost:
        X.C0Aa.A08(r4, r3.A00);
        r5 = new X.C2K3(r2, r6);
        r8 = r9.A01;
        r1 = r10.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1471:0x0c68, code lost:
        if (r8 == null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1472:0x0c6a, code lost:
        r4 = r8.A00.A06();
        X.AnonymousClass024.A0b(r1.A0B(), r4);
        r4.getAbsolutePath();
        r0 = X.C454422b.A01(new X.C22a(false, false), 0, X.C0DC.A0E, android.net.Uri.fromFile(r4), null, false, false, null, false);
        r3 = r8.A01;
        r2 = r3.A05(r0, false);
        r2.A0S = "mms";
        r2.A09.A03(new X.AnonymousClass365(), null);
        r3.A0D(r2, null);
        com.whatsapp.util.Log.i("external-mutations-uploader start media upload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:1473:0x0cb1, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1474:0x0cb2, code lost:
        com.whatsapp.util.Log.e("external-mutations-uploader", r1);
        r6.A01(new X.C24P("prepare-syncd-mutations-helper/startPrepareJob/onError: IOException", null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:1475:0x0cc3, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1477:0x0ccb, code lost:
        throw new X.C24P("Missing keys exception", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1482:0x0cda, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1483:0x0cdb, code lost:
        throw null;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v237, types: [X.1zj] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 5510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape0S0200000_I0_0.run():void");
    }
}
