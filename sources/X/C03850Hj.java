package X;

import android.os.SystemClock;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Hj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03850Hj extends AbstractC42741wF {
    public final /* synthetic */ AbstractC06480Tm A00;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if ((r3.A01 instanceof com.whatsapp.backup.google.RestoreFromBackupActivity) == false) goto L8;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C03850Hj(X.AbstractC06480Tm r3, boolean r4, boolean r5) {
        /*
            r2 = this;
            r2.A00 = r3
            if (r5 == 0) goto Lb
            android.app.Activity r0 = r3.A01
            boolean r1 = r0 instanceof com.whatsapp.backup.google.RestoreFromBackupActivity
            r0 = 0
            if (r1 != 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03850Hj.<init>(X.0Tm, boolean, boolean):void");
    }

    @Override // X.C0HS
    public void A03(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        AbstractC06480Tm abstractC06480Tm = this.A00;
        ((C06490Tn) abstractC06480Tm).A00.A1Q(numArr[0].intValue());
        ProgressDialogC06500To progressDialogC06500To = AbstractC06480Tm.A08;
        if (progressDialogC06500To != null) {
            int progress = progressDialogC06500To.getProgress();
            int intValue = numArr[0].intValue();
            if (progress != intValue) {
                AbstractC06480Tm.A08.setProgress(intValue);
            }
        }
    }

    @Override // X.AbstractC42741wF
    public C03860Hk A0A() {
        C03860Hk A00;
        AbstractC06480Tm abstractC06480Tm = this.A00;
        abstractC06480Tm.A05.A01();
        if (((AbstractC42741wF) this).A02) {
            Log.i("PrepareMessageStoreTask/initializeMessageStore/frombackup");
            final C34531hf c34531hf = new C34531hf(this);
            final C0CC c0cc = abstractC06480Tm.A0D;
            boolean z = ((AbstractC42741wF) this).A01;
            if (c0cc != null) {
                C03860Hk A0A = c0cc.A0A(z, new InterfaceC42751wG() { // from class: X.3A4
                    @Override // X.InterfaceC42751wG
                    public final C03860Hk ARr() {
                        C0CC c0cc2 = C0CC.this;
                        C34531hf c34531hf2 = c34531hf;
                        c0cc2.A0N.A01();
                        c0cc2.A0L.A02();
                        int A06 = c0cc2.A06();
                        int i = (A06 * 100) / (A06 + 1);
                        ArrayList A0H = c0cc2.A0H();
                        if (A0H.size() <= 0) {
                            Log.i("msgstore/restore/backupfiles/none-found");
                            return C03860Hk.A00(0);
                        }
                        Iterator it = A0H.iterator();
                        while (it.hasNext()) {
                            File file = (File) it.next();
                            StringBuilder A0P = C000200d.A0P("msgstore/restore/backupfiles ");
                            A0P.append(file.getName());
                            A0P.append(" (");
                            A0P.append(file.length());
                            A0P.append(")");
                            Log.i(A0P.toString());
                        }
                        if (C0CC.A04(c0cc2.A0F(), "restore")) {
                            AnonymousClass024.A0f(c0cc2.A0F());
                        }
                        return c0cc2.A09(i, A0H, c34531hf2);
                    }
                });
                if (!((AbstractC42741wF) this).A00) {
                    C41541u6 c41541u6 = abstractC06480Tm.A03;
                    if (c41541u6.A0W()) {
                        c41541u6.A0P();
                    }
                }
                return A0A;
            }
            throw null;
        }
        Log.i("PrepareMessageStoreTask/initializeMessageStore/newstore");
        C05E c05e = abstractC06480Tm.A0F.A01;
        c05e.A05();
        ReentrantReadWriteLock.WriteLock writeLock = c05e.A08;
        writeLock.lock();
        try {
            Log.i("msgstore-manager/initialize");
            synchronized (c05e) {
                if (!c05e.A01) {
                    c05e.A06();
                    c05e.A07();
                    A00 = C03860Hk.A00(2);
                } else {
                    A00 = C03860Hk.A00(0);
                }
            }
            return A00;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // X.AbstractC42741wF
    public void A0B() {
        if (((AbstractC42741wF) this).A00 && ((AbstractC42741wF) this).A02) {
            try {
                C0CB c0cb = this.A00.A0O;
                synchronized (c0cb) {
                    ArrayList A0C = c0cb.A0C();
                    if (!A0C.isEmpty()) {
                        File file = (File) A0C.get(0);
                        C03420Fq c03420Fq = c0cb.A00;
                        if (c03420Fq != null) {
                            c03420Fq.close();
                            c0cb.A00 = null;
                        }
                        C001200o c001200o = c0cb.A0F;
                        File databasePath = c001200o.A00.getDatabasePath("chatsettings.db");
                        if (!file.exists()) {
                            File databasePath2 = c001200o.A00.getDatabasePath("chatsettingsbackup.db");
                            if (databasePath2.exists()) {
                                Log.i("chat-settings-store/restore/plain text backup");
                                boolean A0d = AnonymousClass024.A0d(c0cb.A0C, databasePath2, databasePath, false);
                                if (!databasePath2.delete()) {
                                    Log.w("chat-settings-store/restore/unable to delete temp backup file");
                                }
                                if (A0d) {
                                }
                            }
                        } else {
                            try {
                                EnumC03450Ft enumC03450Ft = EnumC03450Ft.CRYPT13;
                                int A00 = C03460Fu.A00(file.getName(), "chatsettingsbackup.db");
                                if (A00 <= 0 || (A00 >= enumC03450Ft.version && (enumC03450Ft = EnumC03450Ft.A02(A00)) == null)) {
                                    enumC03450Ft = EnumC03450Ft.UNENCRYPTED;
                                }
                                C0HH.A00(enumC03450Ft, c0cb.A0T, c0cb.A04, c0cb.A0I, c0cb.A06, c0cb.A0C, c0cb.A0S, file).A02(c001200o, databasePath, 0, 0, false, null);
                            } catch (Exception e) {
                                Log.e("chat-settings-store/restore failed", e);
                            }
                        }
                        if (C03480Fw.A00) {
                            C03390Fn.A03(c001200o.A00);
                        }
                    }
                }
            } catch (Exception e2) {
                Log.w("verifymsgstore/failed to restore chat settings", e2);
            }
            AbstractC06480Tm abstractC06480Tm = this.A00;
            AbstractC40441sG abstractC40441sG = abstractC06480Tm.A0P;
            synchronized (abstractC40441sG) {
                AbstractList abstractList = (AbstractList) abstractC40441sG.A06();
                if (!abstractList.isEmpty()) {
                    abstractC40441sG.A08((File) abstractList.get(0));
                }
            }
            try {
                C40431sF c40431sF = abstractC06480Tm.A0R;
                synchronized (c40431sF) {
                    ArrayList A09 = c40431sF.A09();
                    if (!A09.isEmpty()) {
                        c40431sF.A0C((File) A09.get(0));
                    }
                }
            } catch (Exception e3) {
                Log.w("verifymsgstore/failed to restore stickers db", e3);
            }
            try {
                abstractC06480Tm.A0H.A01();
            } catch (Exception e4) {
                Log.w("verifymsgstore/failed to restore commerce db", e4);
            }
        }
    }

    @Override // X.AbstractC42741wF
    public void A0C(long j) {
        if (!((AbstractC42741wF) this).A02 || j <= 0) {
            return;
        }
        SystemClock.sleep(j);
    }

    @Override // X.AbstractC42741wF
    public void A0D(C03860Hk c03860Hk) {
        if (((AbstractC42741wF) this).A02 && c03860Hk.A00 == 2) {
            AbstractC06480Tm abstractC06480Tm = this.A00;
            if (abstractC06480Tm.A01 instanceof RestoreFromBackupActivity) {
                return;
            }
            C018508q c018508q = ((C2La) abstractC06480Tm).A01;
            c018508q.A02.post(new Runnable() { // from class: X.1JM
                @Override // java.lang.Runnable
                public final void run() {
                    C002701i.A19(C03850Hj.this.A00.A01, C0M6.A03);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC42741wF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0E(X.C03860Hk r4) {
        /*
            r3 = this;
            X.0To r0 = X.AbstractC06480Tm.A08
            if (r0 == 0) goto L10
            X.0Tm r0 = r3.A00
            android.app.Activity r1 = r0.A01
            r0 = 100
            X.C002701i.A18(r1, r0)
            r0 = 0
            X.AbstractC06480Tm.A08 = r0
        L10:
            int r1 = r4.A00
            if (r1 == 0) goto L20
            r0 = 3
            if (r1 == r0) goto L20
            r0 = 4
            if (r1 == r0) goto L20
            r0 = 5
            if (r1 == r0) goto L20
            r0 = 6
            if (r1 != r0) goto L60
        L20:
            java.util.concurrent.atomic.AtomicReference r1 = X.AbstractC06480Tm.A09
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L60
            java.lang.Object r4 = r1.get()
            X.0Hk r4 = (X.C03860Hk) r4
        L2e:
            int r1 = r4.A00
            if (r1 == 0) goto L3e
            r0 = 3
            if (r1 == r0) goto L3e
            r0 = 4
            if (r1 == r0) goto L3e
            r0 = 5
            if (r1 == r0) goto L3e
            r0 = 6
            if (r1 != r0) goto L6c
        L3e:
            java.lang.String r0 = "verifymsgstore/runpreparemsgstoretask setting onePrepareMsgstoreTaskAlreadyFinished to true"
            com.whatsapp.util.Log.i(r0)
            X.0Tm r0 = r3.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A06
            r2 = 1
            boolean r0 = r0.getAndSet(r2)
            if (r0 == 0) goto L6c
            java.lang.String r1 = "verifymsgstore/runpreparemsgstoretask this attempt failed but another attempt in parallel proceeded further than this stage, therefore, aborting this attempt "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            return r2
        L60:
            java.util.concurrent.atomic.AtomicReference r1 = X.AbstractC06480Tm.A09
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L2e
            r1.set(r4)
            goto L2e
        L6c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03850Hj.A0E(X.0Hk):boolean");
    }

    public void A0F(long j, long j2, int i, int i2) {
        ((C0HS) this).A02.A00(Integer.valueOf(i + ((int) ((((float) j) / ((float) j2)) * i2))));
    }
}
