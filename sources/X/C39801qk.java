package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;

/* renamed from: X.1qk */
/* loaded from: classes.dex */
public final class C39801qk extends AbstractC31511cO {
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final C39771qh A04;
    public final C39781qi A05;
    public final C17I A06;
    public final C17I A07;
    public final C17S A08;
    public final C39861qq A09;
    public final C17Z A0A;

    public C39801qk(AnonymousClass176 anonymousClass176, AnonymousClass178 anonymousClass178) {
        super(anonymousClass176);
        C07K.A1P(anonymousClass178);
        this.A00 = Long.MIN_VALUE;
        this.A08 = new C17S(anonymousClass176);
        this.A05 = new C39781qi(anonymousClass176);
        this.A09 = new C39861qq(anonymousClass176);
        this.A04 = new C39771qh(anonymousClass176);
        this.A0A = new C17Z(((AnonymousClass174) this).A00.A03);
        this.A06 = new C17I(anonymousClass176) { // from class: X.1cQ
            {
                C39801qk.this = this;
            }

            @Override // X.C17I
            public final void A01() {
                final C39801qk c39801qk = C39801qk.this;
                c39801qk.A0K(new C17K() { // from class: X.1cS
                    @Override // X.C17K
                    public final void AWy(Throwable th) {
                        c39801qk.A0H();
                    }
                });
            }
        };
        this.A07 = new C17I(anonymousClass176) { // from class: X.1cR
            {
                C39801qk.this = this;
            }

            @Override // X.C17I
            public final void A01() {
                C39801qk c39801qk = C39801qk.this;
                if (c39801qk != null) {
                    try {
                        C39781qi c39781qi = c39801qk.A05;
                        C13H.A00();
                        c39781qi.A0C();
                        C17Z c17z = c39781qi.A01;
                        if (c17z.A01(86400000L)) {
                            c17z.A00();
                            c39781qi.A03("Deleting stale hits (if any)");
                            SQLiteDatabase A0E = c39781qi.A0E();
                            if (((AnonymousClass174) c39781qi).A00.A03 != null) {
                                c39781qi.A06("Deleted stale hits, count", Integer.valueOf(A0E.delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
                            } else {
                                throw null;
                            }
                        }
                        c39801qk.A0H();
                    } catch (SQLiteException e) {
                        c39801qk.A08("Failed to delete stale hits", e);
                    }
                    c39801qk.A07.A02(86400000L);
                    return;
                }
                throw null;
            }
        };
    }

    @Override // X.AbstractC31511cO
    public final void A0D() {
        this.A05.A0B();
        this.A09.A0B();
        this.A04.A0B();
    }

    public final long A0E() {
        long longValue = ((Number) C17L.A0D.A00).longValue();
        C39881qs c39881qs = ((AnonymousClass174) this).A00.A09;
        AnonymousClass176.A01(c39881qs);
        c39881qs.A0C();
        if (c39881qs.A03) {
            AnonymousClass176.A01(c39881qs);
            c39881qs.A0C();
            return c39881qs.A00 * 1000;
        }
        return longValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0050 A[LOOP:1: B:56:0x0050->B:63:0x006a, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F() {
        /*
            r8 = this;
            X.C13H.A00()
            X.C13H.A00()
            r8.A0C()
            X.17M r0 = X.C17L.A0B
            java.lang.Object r0 = r0.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1a
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r8.A04(r0)
        L1a:
            X.1qh r7 = r8.A04
            boolean r0 = r7.A0G()
            if (r0 != 0) goto L28
            java.lang.String r0 = "Service not connected"
            r8.A03(r0)
            return
        L28:
            X.1qi r6 = r8.A05
            boolean r0 = r6.A0J()
            if (r0 != 0) goto L9c
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r8.A03(r0)
        L35:
            X.17M r0 = X.C17L.A0H     // Catch: android.database.sqlite.SQLiteException -> L93
            java.lang.Object r0 = r0.A00     // Catch: android.database.sqlite.SQLiteException -> L93
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: android.database.sqlite.SQLiteException -> L93
            int r0 = r0.intValue()     // Catch: android.database.sqlite.SQLiteException -> L93
            long r0 = (long) r0     // Catch: android.database.sqlite.SQLiteException -> L93
            java.util.List r5 = r6.A0F(r0)     // Catch: android.database.sqlite.SQLiteException -> L93
            java.util.AbstractList r5 = (java.util.AbstractList) r5
            boolean r0 = r5.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> L93
            if (r0 == 0) goto L50
            r8.A0H()     // Catch: android.database.sqlite.SQLiteException -> L93
            goto L88
        L50:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L35
            r0 = 0
            java.lang.Object r1 = r5.get(r0)
            X.17P r1 = (X.C17P) r1
            boolean r0 = r7.A0H(r1)
            if (r0 != 0) goto L67
            r8.A0H()
            return
        L67:
            r5.remove(r1)
            long r3 = r1.A01     // Catch: android.database.sqlite.SQLiteException -> L89
            X.C13H.A00()     // Catch: android.database.sqlite.SQLiteException -> L89
            r6.A0C()     // Catch: android.database.sqlite.SQLiteException -> L89
            r0 = 1
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L89
            r2.<init>(r0)     // Catch: android.database.sqlite.SQLiteException -> L89
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L89
            r2.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L89
            java.lang.String r0 = "Deleting hit, id"
            r6.A06(r0, r1)     // Catch: android.database.sqlite.SQLiteException -> L89
            r6.A0I(r2)     // Catch: android.database.sqlite.SQLiteException -> L89
            goto L50
        L88:
            return
        L89:
            r1 = move-exception
            java.lang.String r0 = "Failed to remove hit that was send for delivery"
            r8.A09(r0, r1)
            r8.A0J()
            return
        L93:
            r1 = move-exception
            java.lang.String r0 = "Failed to read hits from store"
            r8.A09(r0, r1)
            r8.A0J()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39801qk.A0F():void");
    }

    public final void A0G() {
        if (!this.A03 && ((Boolean) C17L.A0B.A00).booleanValue()) {
            C39771qh c39771qh = this.A04;
            if (c39771qh.A0G()) {
                return;
            }
            long longValue = ((Number) C17L.A07.A00).longValue();
            C17Z c17z = this.A0A;
            if (c17z.A01(longValue)) {
                c17z.A00();
                A03("Connecting to service");
                if (c39771qh != null) {
                    C13H.A00();
                    c39771qh.A0C();
                    if (c39771qh.A00 == null) {
                        AnonymousClass179 anonymousClass179 = c39771qh.A01;
                        if (anonymousClass179 != null) {
                            C13H.A00();
                            Intent intent = new Intent("com.google.android.gms.analytics.service.START");
                            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
                            C39771qh c39771qh2 = anonymousClass179.A02;
                            Context context = ((AnonymousClass174) c39771qh2).A00.A00;
                            intent.putExtra("app_package_name", context.getPackageName());
                            C231815n A00 = C231815n.A00();
                            synchronized (anonymousClass179) {
                                anonymousClass179.A00 = null;
                                anonymousClass179.A01 = true;
                                AnonymousClass179 anonymousClass1792 = c39771qh2.A01;
                                if (A00 != null) {
                                    boolean A01 = C231815n.A01(context, intent, anonymousClass1792, 129);
                                    c39771qh2.A06("Bind to service requested", Boolean.valueOf(A01));
                                    if (!A01) {
                                        anonymousClass179.A01 = false;
                                        return;
                                    }
                                    try {
                                        anonymousClass179.wait(((Long) C17L.A06.A00).longValue());
                                    } catch (InterruptedException unused) {
                                        c39771qh2.A04("Wait for service connect was interrupted");
                                    }
                                    anonymousClass179.A01 = false;
                                    C17Q c17q = anonymousClass179.A00;
                                    anonymousClass179.A00 = null;
                                    if (c17q == null) {
                                        c39771qh2.A05("Successfully bound to service but never got onServiceConnected callback");
                                    }
                                    if (c17q != null) {
                                        c39771qh.A00 = c17q;
                                        c39771qh.A0F();
                                    } else {
                                        return;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    A03("Connected to service");
                    c17z.A00 = 0L;
                    A0F();
                    return;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0089, code lost:
        if (r1 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0H() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39801qk.A0H():void");
    }

    public final void A0I() {
        AnonymousClass176 anonymousClass176 = ((AnonymousClass174) this).A00;
        C39831qn c39831qn = anonymousClass176.A06;
        AnonymousClass176.A01(c39831qn);
        if (c39831qn.A01 && !c39831qn.A02) {
            C13H.A00();
            A0C();
            try {
                C39781qi c39781qi = this.A05;
                C13H.A00();
                c39781qi.A0C();
                String str = C39781qi.A04;
                try {
                    Cursor rawQuery = c39781qi.A0E().rawQuery(str, null);
                    if (rawQuery.moveToFirst()) {
                        long j = rawQuery.getLong(0);
                        rawQuery.close();
                        if (j != 0) {
                            if (anonymousClass176.A03 != null) {
                                if (Math.abs(System.currentTimeMillis() - j) <= ((Number) C17L.A0G.A00).longValue()) {
                                    A06("Dispatch alarm scheduled (ms)", Long.valueOf(((Number) C17L.A0F.A00).longValue()));
                                    c39831qn.A0C();
                                    C07K.A1c(c39831qn.A01, "Receiver not registered");
                                    long longValue = ((Number) C17L.A0F.A00).longValue();
                                    if (longValue > 0) {
                                        c39831qn.A0F();
                                        AnonymousClass176 anonymousClass1762 = ((AnonymousClass174) c39831qn).A00;
                                        if (anonymousClass1762.A03 != null) {
                                            long elapsedRealtime = SystemClock.elapsedRealtime() + longValue;
                                            c39831qn.A02 = true;
                                            if (Build.VERSION.SDK_INT >= 24) {
                                                c39831qn.A03("Scheduling upload with JobScheduler");
                                                Context context = anonymousClass1762.A00;
                                                ComponentName componentName = new ComponentName(context, "com.google.android.gms.analytics.AnalyticsJobService");
                                                int A0E = c39831qn.A0E();
                                                PersistableBundle persistableBundle = new PersistableBundle();
                                                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                                                JobInfo build = new JobInfo.Builder(A0E, componentName).setMinimumLatency(longValue).setOverrideDeadline(longValue << 1).setExtras(persistableBundle).build();
                                                c39831qn.A06("Scheduling job. JobID", Integer.valueOf(A0E));
                                                C235117a.A00(context, build);
                                                return;
                                            }
                                            c39831qn.A03("Scheduling upload with AlarmManager");
                                            AlarmManager alarmManager = c39831qn.A03;
                                            Context context2 = anonymousClass1762.A00;
                                            alarmManager.setInexactRepeating(2, elapsedRealtime, longValue, PendingIntent.getBroadcast(context2, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context2, "com.google.android.gms.analytics.AnalyticsReceiver")), 0));
                                            return;
                                        }
                                        throw null;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw null;
                        }
                        return;
                    }
                    rawQuery.close();
                } catch (SQLiteException e) {
                    c39781qi.A02(6, "Database error", str, e, null);
                    throw e;
                }
            } catch (SQLiteException e2) {
                A09("Failed to get min/max hit times from local store", e2);
            }
        }
    }

    public final void A0J() {
        C17I c17i = this.A06;
        if (c17i.A02 != 0) {
            A03("All hits dispatched or no network/service. Going to power save mode");
        }
        c17i.A02 = 0L;
        c17i.A00().removeCallbacks(c17i.A01);
        C39831qn c39831qn = ((AnonymousClass174) this).A00.A06;
        AnonymousClass176.A01(c39831qn);
        if (c39831qn.A02) {
            c39831qn.A0F();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:360:0x00cc, code lost:
        A03("Store is empty, nothing to dispatch");
        A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x00f9, code lost:
        A02(6, "Database contains successfully uploaded hit", java.lang.Long.valueOf(r0), java.lang.Integer.valueOf(r7.size()), null);
        A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x05d4, code lost:
        r4.A0H();
        r4.A0G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x05de, code lost:
        r4.A0H();
        r4.A0G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x05e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x05e9, code lost:
        A09("Failed to commit local dispatch transaction", r0);
        A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0648, code lost:
        r4.A0H();
        r4.A0G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0651, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0652, code lost:
        A09("Failed to commit local dispatch transaction", r0);
        A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x068d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x068e, code lost:
        A09("Failed to commit local dispatch transaction", r0);
        A0J();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0207 A[Catch: all -> 0x067b, TryCatch #16 {Exception -> 0x06ce, blocks: (B:350:0x0058, B:353:0x007f, B:601:0x0694, B:603:0x06a1, B:604:0x06a8, B:606:0x06ae, B:354:0x0086, B:357:0x00c3, B:551:0x05d4, B:600:0x068e, B:552:0x05de, B:554:0x05e9, B:557:0x05fa, B:559:0x0605, B:581:0x0637, B:583:0x0641, B:584:0x0648, B:586:0x0652, B:550:0x05ca, B:588:0x065a, B:591:0x066a, B:593:0x0674, B:355:0x00a8, B:356:0x00bb, B:358:0x00c6, B:360:0x00cc, B:361:0x00d6, B:362:0x00e3, B:363:0x00e7, B:365:0x00ed, B:367:0x00f9, B:368:0x0112, B:370:0x011a, B:371:0x011f, B:373:0x0125, B:375:0x0135, B:376:0x0143, B:556:0x05f2, B:377:0x0168, B:379:0x016e, B:381:0x018e, B:383:0x01a4, B:385:0x01b2, B:402:0x01e6, B:404:0x01f4, B:405:0x01f6, B:413:0x0207, B:414:0x0238, B:416:0x023e, B:418:0x0255, B:420:0x025f, B:421:0x026b, B:422:0x0277, B:424:0x0288, B:425:0x0295, B:427:0x029b, B:428:0x029d, B:430:0x02ae, B:432:0x02b4, B:433:0x02b9, B:435:0x02c0, B:437:0x02c8, B:439:0x02e0, B:441:0x02ea, B:443:0x02f1, B:461:0x03b1, B:479:0x03dd, B:481:0x03eb, B:483:0x0402, B:541:0x0596, B:470:0x03c3, B:480:0x03e8, B:472:0x03c8, B:567:0x0617, B:571:0x0621, B:572:0x0624, B:569:0x061c, B:475:0x03ce, B:540:0x058e, B:440:0x02e5, B:542:0x059a, B:543:0x05a0, B:545:0x05a6, B:546:0x05b5, B:580:0x062f, B:484:0x040e, B:485:0x041d, B:487:0x0423, B:489:0x0436, B:490:0x0442, B:493:0x045f, B:497:0x0473, B:499:0x04a6, B:500:0x04ab, B:506:0x04d6, B:534:0x0575, B:578:0x062d, B:536:0x057a, B:498:0x048d, B:509:0x04dd, B:511:0x04e5, B:512:0x04f3, B:514:0x0504, B:516:0x0514, B:518:0x052e, B:524:0x055d, B:525:0x0562, B:538:0x0584, B:519:0x0533, B:520:0x0539, B:522:0x0553, B:523:0x0558, B:408:0x01fc, B:386:0x01b5, B:388:0x01bd, B:389:0x01c0, B:391:0x01c8, B:392:0x01cb, B:394:0x01d3, B:395:0x01d6, B:397:0x01de, B:547:0x05c1, B:590:0x0662, B:502:0x04b7, B:504:0x04c3, B:505:0x04cd, B:532:0x056e), top: B:634:0x0058, inners: #2, #9, #17, #18, #24, #25, #26, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0402 A[Catch: all -> 0x067b, TryCatch #16 {Exception -> 0x06ce, blocks: (B:350:0x0058, B:353:0x007f, B:601:0x0694, B:603:0x06a1, B:604:0x06a8, B:606:0x06ae, B:354:0x0086, B:357:0x00c3, B:551:0x05d4, B:600:0x068e, B:552:0x05de, B:554:0x05e9, B:557:0x05fa, B:559:0x0605, B:581:0x0637, B:583:0x0641, B:584:0x0648, B:586:0x0652, B:550:0x05ca, B:588:0x065a, B:591:0x066a, B:593:0x0674, B:355:0x00a8, B:356:0x00bb, B:358:0x00c6, B:360:0x00cc, B:361:0x00d6, B:362:0x00e3, B:363:0x00e7, B:365:0x00ed, B:367:0x00f9, B:368:0x0112, B:370:0x011a, B:371:0x011f, B:373:0x0125, B:375:0x0135, B:376:0x0143, B:556:0x05f2, B:377:0x0168, B:379:0x016e, B:381:0x018e, B:383:0x01a4, B:385:0x01b2, B:402:0x01e6, B:404:0x01f4, B:405:0x01f6, B:413:0x0207, B:414:0x0238, B:416:0x023e, B:418:0x0255, B:420:0x025f, B:421:0x026b, B:422:0x0277, B:424:0x0288, B:425:0x0295, B:427:0x029b, B:428:0x029d, B:430:0x02ae, B:432:0x02b4, B:433:0x02b9, B:435:0x02c0, B:437:0x02c8, B:439:0x02e0, B:441:0x02ea, B:443:0x02f1, B:461:0x03b1, B:479:0x03dd, B:481:0x03eb, B:483:0x0402, B:541:0x0596, B:470:0x03c3, B:480:0x03e8, B:472:0x03c8, B:567:0x0617, B:571:0x0621, B:572:0x0624, B:569:0x061c, B:475:0x03ce, B:540:0x058e, B:440:0x02e5, B:542:0x059a, B:543:0x05a0, B:545:0x05a6, B:546:0x05b5, B:580:0x062f, B:484:0x040e, B:485:0x041d, B:487:0x0423, B:489:0x0436, B:490:0x0442, B:493:0x045f, B:497:0x0473, B:499:0x04a6, B:500:0x04ab, B:506:0x04d6, B:534:0x0575, B:578:0x062d, B:536:0x057a, B:498:0x048d, B:509:0x04dd, B:511:0x04e5, B:512:0x04f3, B:514:0x0504, B:516:0x0514, B:518:0x052e, B:524:0x055d, B:525:0x0562, B:538:0x0584, B:519:0x0533, B:520:0x0539, B:522:0x0553, B:523:0x0558, B:408:0x01fc, B:386:0x01b5, B:388:0x01bd, B:389:0x01c0, B:391:0x01c8, B:392:0x01cb, B:394:0x01d3, B:395:0x01d6, B:397:0x01de, B:547:0x05c1, B:590:0x0662, B:502:0x04b7, B:504:0x04c3, B:505:0x04cd, B:532:0x056e), top: B:634:0x0058, inners: #2, #9, #17, #18, #24, #25, #26, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x040e A[Catch: all -> 0x067b, TryCatch #16 {Exception -> 0x06ce, blocks: (B:350:0x0058, B:353:0x007f, B:601:0x0694, B:603:0x06a1, B:604:0x06a8, B:606:0x06ae, B:354:0x0086, B:357:0x00c3, B:551:0x05d4, B:600:0x068e, B:552:0x05de, B:554:0x05e9, B:557:0x05fa, B:559:0x0605, B:581:0x0637, B:583:0x0641, B:584:0x0648, B:586:0x0652, B:550:0x05ca, B:588:0x065a, B:591:0x066a, B:593:0x0674, B:355:0x00a8, B:356:0x00bb, B:358:0x00c6, B:360:0x00cc, B:361:0x00d6, B:362:0x00e3, B:363:0x00e7, B:365:0x00ed, B:367:0x00f9, B:368:0x0112, B:370:0x011a, B:371:0x011f, B:373:0x0125, B:375:0x0135, B:376:0x0143, B:556:0x05f2, B:377:0x0168, B:379:0x016e, B:381:0x018e, B:383:0x01a4, B:385:0x01b2, B:402:0x01e6, B:404:0x01f4, B:405:0x01f6, B:413:0x0207, B:414:0x0238, B:416:0x023e, B:418:0x0255, B:420:0x025f, B:421:0x026b, B:422:0x0277, B:424:0x0288, B:425:0x0295, B:427:0x029b, B:428:0x029d, B:430:0x02ae, B:432:0x02b4, B:433:0x02b9, B:435:0x02c0, B:437:0x02c8, B:439:0x02e0, B:441:0x02ea, B:443:0x02f1, B:461:0x03b1, B:479:0x03dd, B:481:0x03eb, B:483:0x0402, B:541:0x0596, B:470:0x03c3, B:480:0x03e8, B:472:0x03c8, B:567:0x0617, B:571:0x0621, B:572:0x0624, B:569:0x061c, B:475:0x03ce, B:540:0x058e, B:440:0x02e5, B:542:0x059a, B:543:0x05a0, B:545:0x05a6, B:546:0x05b5, B:580:0x062f, B:484:0x040e, B:485:0x041d, B:487:0x0423, B:489:0x0436, B:490:0x0442, B:493:0x045f, B:497:0x0473, B:499:0x04a6, B:500:0x04ab, B:506:0x04d6, B:534:0x0575, B:578:0x062d, B:536:0x057a, B:498:0x048d, B:509:0x04dd, B:511:0x04e5, B:512:0x04f3, B:514:0x0504, B:516:0x0514, B:518:0x052e, B:524:0x055d, B:525:0x0562, B:538:0x0584, B:519:0x0533, B:520:0x0539, B:522:0x0553, B:523:0x0558, B:408:0x01fc, B:386:0x01b5, B:388:0x01bd, B:389:0x01c0, B:391:0x01c8, B:392:0x01cb, B:394:0x01d3, B:395:0x01d6, B:397:0x01de, B:547:0x05c1, B:590:0x0662, B:502:0x04b7, B:504:0x04c3, B:505:0x04cd, B:532:0x056e), top: B:634:0x0058, inners: #2, #9, #17, #18, #24, #25, #26, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x05a6 A[Catch: all -> 0x067b, LOOP:4: B:543:0x05a0->B:545:0x05a6, LOOP_END, TRY_LEAVE, TryCatch #16 {Exception -> 0x06ce, blocks: (B:350:0x0058, B:353:0x007f, B:601:0x0694, B:603:0x06a1, B:604:0x06a8, B:606:0x06ae, B:354:0x0086, B:357:0x00c3, B:551:0x05d4, B:600:0x068e, B:552:0x05de, B:554:0x05e9, B:557:0x05fa, B:559:0x0605, B:581:0x0637, B:583:0x0641, B:584:0x0648, B:586:0x0652, B:550:0x05ca, B:588:0x065a, B:591:0x066a, B:593:0x0674, B:355:0x00a8, B:356:0x00bb, B:358:0x00c6, B:360:0x00cc, B:361:0x00d6, B:362:0x00e3, B:363:0x00e7, B:365:0x00ed, B:367:0x00f9, B:368:0x0112, B:370:0x011a, B:371:0x011f, B:373:0x0125, B:375:0x0135, B:376:0x0143, B:556:0x05f2, B:377:0x0168, B:379:0x016e, B:381:0x018e, B:383:0x01a4, B:385:0x01b2, B:402:0x01e6, B:404:0x01f4, B:405:0x01f6, B:413:0x0207, B:414:0x0238, B:416:0x023e, B:418:0x0255, B:420:0x025f, B:421:0x026b, B:422:0x0277, B:424:0x0288, B:425:0x0295, B:427:0x029b, B:428:0x029d, B:430:0x02ae, B:432:0x02b4, B:433:0x02b9, B:435:0x02c0, B:437:0x02c8, B:439:0x02e0, B:441:0x02ea, B:443:0x02f1, B:461:0x03b1, B:479:0x03dd, B:481:0x03eb, B:483:0x0402, B:541:0x0596, B:470:0x03c3, B:480:0x03e8, B:472:0x03c8, B:567:0x0617, B:571:0x0621, B:572:0x0624, B:569:0x061c, B:475:0x03ce, B:540:0x058e, B:440:0x02e5, B:542:0x059a, B:543:0x05a0, B:545:0x05a6, B:546:0x05b5, B:580:0x062f, B:484:0x040e, B:485:0x041d, B:487:0x0423, B:489:0x0436, B:490:0x0442, B:493:0x045f, B:497:0x0473, B:499:0x04a6, B:500:0x04ab, B:506:0x04d6, B:534:0x0575, B:578:0x062d, B:536:0x057a, B:498:0x048d, B:509:0x04dd, B:511:0x04e5, B:512:0x04f3, B:514:0x0504, B:516:0x0514, B:518:0x052e, B:524:0x055d, B:525:0x0562, B:538:0x0584, B:519:0x0533, B:520:0x0539, B:522:0x0553, B:523:0x0558, B:408:0x01fc, B:386:0x01b5, B:388:0x01bd, B:389:0x01c0, B:391:0x01c8, B:392:0x01cb, B:394:0x01d3, B:395:0x01d6, B:397:0x01de, B:547:0x05c1, B:590:0x0662, B:502:0x04b7, B:504:0x04c3, B:505:0x04cd, B:532:0x056e), top: B:634:0x0058, inners: #2, #9, #17, #18, #24, #25, #26, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x05ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x03c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:659:0x05c9 A[EDGE_INSN: B:659:0x05c9->B:549:0x05c9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r40v0, types: [X.174, X.1qk, X.1cO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(X.C17K r41) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39801qk.A0K(X.17K):void");
    }
}
