package X;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Environment;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0CC */
/* loaded from: classes.dex */
public class C0CC {
    public static volatile C0CC A0Z;
    public File A01;
    public File A02;
    public final AbstractC000600i A04;
    public final C018508q A05;
    public final C02L A06;
    public final C01B A07;
    public final C03310Fe A08;
    public final AnonymousClass034 A09;
    public final C000400f A0A;
    public final C001200o A0B;
    public final C005102h A0C;
    public final C02F A0D;
    public final C000500h A0E;
    public final C03290Fc A0F;
    public final C0HY A0G;
    public final C03710Gt A0H;
    public final C41561u9 A0I;
    public final C42711wC A0J;
    public final C05F A0K;
    public final C05N A0L;
    public final C05E A0M;
    public final C42721wD A0N;
    public final C05L A0O;
    public final C003701t A0P;
    public final AnonymousClass011 A0Q;
    public final C41511u2 A0R;
    public final C02O A0S;
    public final C42701wB A0T;
    public final C03350Fj A0U;
    public final C0Fi A0V;
    public final C03280Fb A0W;
    public final Set A0Y = new HashSet();
    public int A00 = 3;
    public final Object A0X = new Object();
    public final C0HK A03 = new C0HK();

    public C0CC(C001200o c001200o, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C03280Fb c03280Fb, C02L c02l, AnonymousClass011 anonymousClass011, C01B c01b, AnonymousClass034 anonymousClass034, C03290Fc c03290Fc, C03310Fe c03310Fe, C41561u9 c41561u9, C0HY c0hy, C000400f c000400f, C05L c05l, C42701wB c42701wB, C05F c05f, C41511u2 c41511u2, C05E c05e, C03710Gt c03710Gt, C02F c02f, C000500h c000500h, C005102h c005102h, C0Fi c0Fi, C42711wC c42711wC, C02O c02o, C42721wD c42721wD, C03350Fj c03350Fj, C05N c05n) {
        this.A0B = c001200o;
        this.A0P = c003701t;
        this.A05 = c018508q;
        this.A04 = abstractC000600i;
        this.A0W = c03280Fb;
        this.A06 = c02l;
        this.A0Q = anonymousClass011;
        this.A07 = c01b;
        this.A09 = anonymousClass034;
        this.A0F = c03290Fc;
        this.A08 = c03310Fe;
        this.A0I = c41561u9;
        this.A0G = c0hy;
        this.A0A = c000400f;
        this.A0O = c05l;
        this.A0T = c42701wB;
        this.A0K = c05f;
        this.A0R = c41511u2;
        this.A0M = c05e;
        this.A0H = c03710Gt;
        this.A0D = c02f;
        this.A0E = c000500h;
        this.A0C = c005102h;
        this.A0V = c0Fi;
        this.A0J = c42711wC;
        this.A0S = c02o;
        this.A0N = c42721wD;
        this.A0U = c03350Fj;
        this.A0L = c05n;
    }

    public static int A00(File file) {
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 536870928);
            Cursor rawQuery = openDatabase.rawQuery("SELECT COUNT(*) from messages", null);
            if (rawQuery == null) {
                openDatabase.close();
                return -1;
            } else if (!rawQuery.moveToNext()) {
                rawQuery.close();
                openDatabase.close();
                return -1;
            } else {
                int i = rawQuery.getInt(0) - 1;
                rawQuery.close();
                openDatabase.close();
                return i;
            }
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("msgstore/getMessageCountInDb error while trying to retrieve messages count in ");
            A0P.append(file.getAbsolutePath());
            Log.e(A0P.toString(), e);
            return -1;
        }
    }

    public static C0CC A01() {
        if (A0Z == null) {
            synchronized (C0CC.class) {
                if (A0Z == null) {
                    A0Z = new C0CC(C001200o.A01, C003701t.A00(), C018508q.A00(), AbstractC000600i.A00(), C03280Fb.A00(), C02L.A00(), AnonymousClass011.A00(), C01B.A00(), AnonymousClass034.A00(), C03290Fc.A00(), C03310Fe.A00(), C41561u9.A00(), C0HY.A00(), C000400f.A00(), C05L.A00(), C42701wB.A01(), C05F.A01, C41511u2.A00(), C05E.A00(), C03710Gt.A00(), C02F.A00(), C000500h.A00(), C005102h.A00(), C0Fi.A00(), C42711wC.A00(), C02O.A00(), C42721wD.A00(), C03350Fj.A01(), C05N.A00());
                }
            }
        }
        return A0Z;
    }

    public static EnumC03450Ft A02(String str) {
        int A00 = C03460Fu.A00(str, "msgstore.db");
        if (A00 > 0) {
            return EnumC03450Ft.A02(A00);
        }
        return null;
    }

    public static boolean A03(File file) {
        try {
            if (file.exists()) {
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 536870928);
                String stringForQuery = DatabaseUtils.stringForQuery(openDatabase, "PRAGMA integrity_check", null);
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/fieldstat/isdatabaseintegrityok ");
                sb.append(stringForQuery);
                Log.i(sb.toString());
                boolean equalsIgnoreCase = "ok".equalsIgnoreCase(stringForQuery);
                if (openDatabase != null) {
                    openDatabase.close();
                }
                return equalsIgnoreCase;
            }
            return false;
        } catch (Exception e) {
            Log.e("msgstore/fieldstat/isdatabaseintegrityok/error ", e);
            return false;
        }
    }

    public static final boolean A04(File file, String str) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists()) {
                return true;
            }
            StringBuilder sb = new StringBuilder("msgstore/");
            sb.append(str);
            sb.append("/createdir");
            Log.i(sb.toString());
            if (parentFile.mkdirs()) {
                return true;
            }
            C000200d.A19("msgstore/", str, "/createdir failed");
            return false;
        }
        throw null;
    }

    public int A05() {
        long length = A0F().length();
        long A02 = this.A0A.A02();
        if (A02 <= 7 * length) {
            int max = Math.max((int) (A02 / length), 2);
            StringBuilder sb = new StringBuilder("msgstore/backup/backupexpirationInDays not enough space to store full backup history, saving backups only for ");
            sb.append(max);
            sb.append(" days");
            Log.i(sb.toString());
            return max;
        }
        return 7;
    }

    public int A06() {
        for (EnumC03450Ft enumC03450Ft : EnumC03450Ft.values()) {
            A0G(enumC03450Ft);
        }
        return A0H().size();
    }

    /* JADX WARN: Removed duplicated region for block: B:403:0x049e A[Catch: all -> 0x04e0, TRY_LEAVE, TryCatch #25 {all -> 0x04e0, blocks: (B:305:0x0157, B:307:0x016b, B:308:0x0174, B:309:0x0192, B:311:0x019d, B:312:0x01b6, B:314:0x01d7, B:317:0x01e3, B:319:0x01ef, B:321:0x0207, B:322:0x0242, B:323:0x0245, B:324:0x0248, B:331:0x02a0, B:333:0x02b8, B:405:0x04bc, B:358:0x0399, B:360:0x03b1, B:406:0x04bd, B:370:0x0409, B:372:0x0421, B:407:0x04be, B:401:0x0486, B:403:0x049e, B:410:0x04c1, B:387:0x0443, B:389:0x045b, B:408:0x04bf, B:325:0x0256, B:327:0x027a, B:328:0x0284, B:330:0x029c, B:334:0x02bd, B:336:0x02cf, B:337:0x02d4, B:339:0x02de, B:340:0x02e8, B:342:0x030d, B:343:0x0310, B:345:0x033e, B:346:0x0347, B:348:0x034f, B:361:0x03b8, B:364:0x03c6, B:365:0x03d2, B:367:0x03df, B:369:0x03f5, B:357:0x0392, B:349:0x0356, B:351:0x036a, B:352:0x0371, B:354:0x037f, B:355:0x0389, B:400:0x046c, B:384:0x0434, B:386:0x043e, B:409:0x04c0), top: B:481:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x04c1 A[Catch: all -> 0x04e0, TRY_ENTER, TryCatch #25 {all -> 0x04e0, blocks: (B:305:0x0157, B:307:0x016b, B:308:0x0174, B:309:0x0192, B:311:0x019d, B:312:0x01b6, B:314:0x01d7, B:317:0x01e3, B:319:0x01ef, B:321:0x0207, B:322:0x0242, B:323:0x0245, B:324:0x0248, B:331:0x02a0, B:333:0x02b8, B:405:0x04bc, B:358:0x0399, B:360:0x03b1, B:406:0x04bd, B:370:0x0409, B:372:0x0421, B:407:0x04be, B:401:0x0486, B:403:0x049e, B:410:0x04c1, B:387:0x0443, B:389:0x045b, B:408:0x04bf, B:325:0x0256, B:327:0x027a, B:328:0x0284, B:330:0x029c, B:334:0x02bd, B:336:0x02cf, B:337:0x02d4, B:339:0x02de, B:340:0x02e8, B:342:0x030d, B:343:0x0310, B:345:0x033e, B:346:0x0347, B:348:0x034f, B:361:0x03b8, B:364:0x03c6, B:365:0x03d2, B:367:0x03df, B:369:0x03f5, B:357:0x0392, B:349:0x0356, B:351:0x036a, B:352:0x0371, B:354:0x037f, B:355:0x0389, B:400:0x046c, B:384:0x0434, B:386:0x043e, B:409:0x04c0), top: B:481:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x050f A[Catch: all -> 0x05af, TRY_LEAVE, TryCatch #22 {all -> 0x05af, blocks: (B:298:0x010f, B:300:0x012f, B:302:0x0137, B:304:0x013c, B:404:0x04a3, B:422:0x0506, B:424:0x050f, B:425:0x0514, B:427:0x0521, B:429:0x052a, B:430:0x0532, B:436:0x058b, B:421:0x04fb, B:418:0x04e1, B:419:0x04f9, B:303:0x013a, B:442:0x05ae), top: B:483:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x058b A[Catch: all -> 0x05af, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x05af, blocks: (B:298:0x010f, B:300:0x012f, B:302:0x0137, B:304:0x013c, B:404:0x04a3, B:422:0x0506, B:424:0x050f, B:425:0x0514, B:427:0x0521, B:429:0x052a, B:430:0x0532, B:436:0x058b, B:421:0x04fb, B:418:0x04e1, B:419:0x04f9, B:303:0x013a, B:442:0x05ae), top: B:483:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0599  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A07(X.C0HG r40) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CC.A07(X.0HG):int");
    }

    public long A08() {
        long j = 0;
        try {
            File A0B = A0B();
            if (A0B != null) {
                j = A0B.lastModified();
                return j;
            }
            return 0L;
        } catch (IOException e) {
            Log.i("msgstore/lastbackupfiletime", e);
            return j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:682:0x01bc, code lost:
        if (r7.getMessage().contains("mac check in GCM failed") != false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x0252, code lost:
        if (r1 != 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x03f0, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x03f3, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x03f8, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x03fb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0471, code lost:
        if (r13.exists() == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0491, code lost:
        if (r13.exists() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x04b8, code lost:
        if (r13.exists() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x04bb, code lost:
        X.AnonymousClass024.A0f(A0D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x04c7, code lost:
        if (r13.exists() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x04c9, code lost:
        com.whatsapp.util.Log.i("msgstore/integritycheck/corrupt-db-was-deleted/restore-from-backup-copy");
        A0I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x04d6, code lost:
        if (r13.exists() != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x04d8, code lost:
        com.whatsapp.util.Log.i("msgstore/integritycheck/corrupt-db-was-deleted/restore-from-backup-copy");
        A0I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x04e1, code lost:
        if (r5 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0543, code lost:
        if (r12.A01.size() != 0) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x071e, code lost:
        if (r0 != false) goto L373;
     */
    /* JADX WARN: Removed duplicated region for block: B:1097:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:1199:0x01eb A[ADDED_TO_REGION, EDGE_INSN: B:1199:0x01eb->B:690:0x01eb ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1207:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1216:0x0670 A[EDGE_INSN: B:1216:0x0670->B:912:0x0670 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x01d8 A[Catch: Exception -> 0x0241, TryCatch #64 {Exception -> 0x0241, blocks: (B:641:0x00e3, B:642:0x0105, B:644:0x0119, B:645:0x011e, B:647:0x0122, B:650:0x0132, B:653:0x0142, B:655:0x0153, B:656:0x015a, B:657:0x0170, B:662:0x0175, B:664:0x017b, B:684:0x01c0, B:685:0x01d2, B:687:0x01d8, B:689:0x01e4, B:690:0x01eb, B:667:0x0188, B:669:0x018e, B:672:0x0197, B:674:0x019d, B:676:0x01a3, B:679:0x01ac, B:681:0x01b2), top: B:1173:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:909:0x0662 A[LOOP:3: B:878:0x0581->B:909:0x0662, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:910:0x0666  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C03860Hk A09(int r51, java.util.List r52, X.C34531hf r53) {
        /*
            Method dump skipped, instructions count: 3607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CC.A09(int, java.util.List, X.1hf):X.0Hk");
    }

    public C03860Hk A0A(boolean z, InterfaceC42751wG interfaceC42751wG) {
        C03860Hk A00;
        long max;
        long max2;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        C05E c05e = this.A0M;
        c05e.A05();
        ReentrantReadWriteLock.WriteLock writeLock = c05e.A08;
        writeLock.lock();
        try {
            Log.i("msgstore-manager/initialize");
            synchronized (this) {
                c05e.A05();
                if (!c05e.A01) {
                    C03860Hk ARr = interfaceC42751wG.ARr();
                    boolean z4 = false;
                    boolean z5 = ARr.A00 == 1;
                    try {
                        c05e.A05();
                        c05e.A06.AE6();
                        z4 = z5;
                    } catch (SQLiteException unused) {
                    }
                    if (z4) {
                        c05e.A05();
                        c05e.A01 = true;
                        C41561u9 c41561u9 = this.A0I;
                        c41561u9.A02.A01(new RunnableEBaseShape2S0100000_I0_2(c41561u9, 30), 32);
                        this.A0G.A07();
                        C03710Gt c03710Gt = this.A0H;
                        if (!c03710Gt.A00) {
                            C05E c05e2 = c03710Gt.A04;
                            C0CD A03 = c05e2.A03();
                            if (c03710Gt.A00) {
                                A03.close();
                            } else {
                                c05e2.A05();
                                if (!c05e2.A06.A0R("deleted_chat_jobs")) {
                                    c03710Gt.A00 = true;
                                    c03710Gt.A01 = true;
                                    A03.close();
                                } else {
                                    C03870Hl c03870Hl = null;
                                    Cursor A07 = A03.A02.A07("SELECT _id, key_remote_jid, block_size, deleted_message_id, deleted_starred_message_id, deleted_message_categories, delete_files FROM deleted_chat_jobs", null);
                                    if (A07 != null) {
                                        if (A07.moveToFirst()) {
                                            long j3 = A07.getLong(0);
                                            AbstractC005302j A02 = AbstractC005302j.A02(A07.getString(1));
                                            if (A02 != null) {
                                                long A05 = c03710Gt.A02.A05(A02);
                                                if (A05 >= 0) {
                                                    int i = A07.getInt(2);
                                                    String string = A07.getString(A07.getColumnIndexOrThrow("deleted_message_categories"));
                                                    if (TextUtils.isEmpty(string)) {
                                                        j = Math.max(A07.getLong(A07.getColumnIndexOrThrow("deleted_message_id")), 1L);
                                                        j2 = Math.max(A07.getLong(A07.getColumnIndexOrThrow("deleted_starred_message_id")), 1L);
                                                        z3 = A07.getInt(A07.getColumnIndexOrThrow("delete_files")) != 0;
                                                        z2 = false;
                                                        max = 1;
                                                        max2 = 1;
                                                    } else {
                                                        max = Math.max(A07.getLong(A07.getColumnIndexOrThrow("deleted_message_id")), 1L);
                                                        max2 = Math.max(A07.getLong(A07.getColumnIndexOrThrow("deleted_starred_message_id")), 1L);
                                                        z2 = A07.getInt(A07.getColumnIndexOrThrow("delete_files")) != 0;
                                                        z3 = false;
                                                        j = 1;
                                                        j2 = 1;
                                                    }
                                                    c03870Hl = new C03870Hl(j3, A05, A02, i, j, j2, z3, max, max2, z2, string, false);
                                                }
                                            }
                                            c03710Gt.A04(c03870Hl);
                                        }
                                        A07.close();
                                    }
                                    c03710Gt.A00 = true;
                                    A03.close();
                                }
                            }
                        }
                        this.A0T.A03();
                    } else if (z) {
                        Log.i("msgstore-manager/initialize/re-creating db");
                        C05E c05e3 = this.A0L.A01;
                        c05e3.A05();
                        c05e3.A07();
                        Log.i("msgstore-manager/initialize/db recreated");
                        A00 = C03860Hk.A00(2);
                    }
                    return ARr;
                }
                Log.i("msgstore-manager/initialize/restoring-from-backup/6");
                A00 = C03860Hk.A00(6);
                return A00;
            }
        } finally {
            c05e.A05();
            writeLock.unlock();
        }
    }

    public File A0B() {
        String externalStorageState = Environment.getExternalStorageState();
        C02F c02f = this.A0D;
        if (c02f != null) {
            if (("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && c02f.A02("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                ArrayList A0H = A0H();
                for (int size = A0H.size() - 1; size >= 0; size--) {
                    File file = (File) A0H.get(size);
                    if (file.length() > 0) {
                        StringBuilder A0P = C000200d.A0P("msgstore/lastbackupfile/file ");
                        A0P.append(file.getName());
                        A0P.append(" size=");
                        A0P.append(file.length());
                        Log.i(A0P.toString());
                        return file;
                    }
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("msgstore/lastbackupfiletime/media_unavailable ");
            sb.append(externalStorageState);
            Log.i(sb.toString());
            throw new IOException("External media not readable");
        }
        throw null;
    }

    public File A0C() {
        File[] A0K = A0K();
        if (A0K.length != 0) {
            for (File file : A0K) {
                if (file.exists()) {
                    StringBuilder A0P = C000200d.A0P("msgstore/get-latest-db-backup-for-gdrive ");
                    A0P.append(file.getAbsolutePath());
                    Log.i(A0P.toString());
                    return file;
                }
            }
            StringBuilder A0P2 = C000200d.A0P("msgstore/get-latest-db-backup-for-gdrive/no-file-exists ");
            A0P2.append(A0K[0].getAbsolutePath());
            Log.i(A0P2.toString());
            return A0K[0];
        }
        throw new IllegalStateException("msgstore/backup/list-of-backup-files-is-null");
    }

    public final File A0D() {
        File file;
        synchronized (this.A0X) {
            file = this.A01;
            if (file == null) {
                file = this.A0B.A00.getDatabasePath("msgstore.db-backup");
                this.A01 = file;
            }
        }
        return file;
    }

    public final File A0E() {
        File file;
        synchronized (this.A0X) {
            file = this.A02;
            if (file == null) {
                file = new File(new File(this.A09.A03, "Databases"), "msgstore.db");
                this.A02 = file;
            }
        }
        return file;
    }

    public final File A0F() {
        C05E c05e = this.A0M;
        c05e.A05();
        return c05e.A07;
    }

    public File A0G(EnumC03450Ft enumC03450Ft) {
        if (enumC03450Ft == EnumC03450Ft.UNENCRYPTED) {
            return A0E();
        }
        File file = new File(this.A09.A03, "Databases");
        StringBuilder A0P = C000200d.A0P("msgstore.db");
        StringBuilder A0P2 = C000200d.A0P(".crypt");
        A0P2.append(enumC03450Ft.version);
        A0P.append(A0P2.toString());
        return new File(file, A0P.toString());
    }

    public ArrayList A0H() {
        ArrayList A04 = C03460Fu.A04(A0E(), C03460Fu.A05(EnumC03450Ft.A01(), EnumC03450Ft.A00()));
        C03460Fu.A0C(A04, A0E());
        return A04;
    }

    public final void A0I() {
        if (A0F().exists() && !A0F().delete()) {
            Log.w("msgstore/copybackuptodb/failed to delete db before copying from backup up.");
        }
        File A0D = A0D();
        if (A0D.exists()) {
            AnonymousClass024.A0d(this.A0A, A0D, A0F(), false);
        } else {
            Log.w("msgstore/copybackuptodb/no backup db to copy.");
        }
    }

    public final void A0J(boolean z) {
        if (z) {
            this.A0R.A05(true);
        }
        this.A03.A0A(Boolean.FALSE);
        C05E c05e = this.A0M;
        c05e.A05();
        c05e.A08.unlock();
    }

    public File[] A0K() {
        EnumC03450Ft[] A04 = EnumC03450Ft.A04(EnumC03450Ft.A01(), EnumC03450Ft.A00());
        int length = A04.length;
        File[] fileArr = new File[length];
        for (int i = 0; i < length; i++) {
            fileArr[i] = A0G(A04[(length - i) - 1]);
        }
        TextUtils.join(", ", fileArr);
        return fileArr;
    }
}
