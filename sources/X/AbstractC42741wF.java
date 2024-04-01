package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1wF */
/* loaded from: classes2.dex */
public abstract class AbstractC42741wF extends C0HS {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ C2La A03;

    public AbstractC42741wF(C2La c2La, boolean z, boolean z2, boolean z3) {
        this.A03 = c2La;
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x002c, code lost:
        if (r1 == 1) goto L163;
     */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r23) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC42741wF.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C03860Hk c03860Hk = (C03860Hk) obj;
        if (A0E(c03860Hk)) {
            return;
        }
        int i = c03860Hk.A00;
        if (i != 2 && i != 1) {
            C000200d.A1F(C000200d.A0P("verifymsgstore/failed "), i);
        } else {
            Log.i("verifymsgstore/success");
            C2La c2La = this.A03;
            c2La.A0B.A01.clear();
            c2La.A0J.A0N(true, false, 3);
            c2La.A0M.A04();
            C05E c05e = c2La.A0E.A00;
            c05e.A05();
            if (c05e.A07.exists() && !c2La.A0G.A0H()) {
                C0E6 c0e6 = c2La.A02;
                c0e6.A00.A01(GetStatusPrivacyJob.A00());
            }
            boolean z = this.A00;
            if (!z) {
                Log.i("verifymsgstore/preparemsgstore/notregname/send-active");
                c2La.A0L.A05(true);
            }
            c2La.A04.A04();
            if (!z) {
                c2La.A0K.A03();
            }
        }
        C2La c2La2 = this.A03;
        c2La2.A01();
        c2La2.A03(c03860Hk);
    }

    public C03860Hk A0A() {
        final C2S5 c2s5 = (C2S5) this;
        return c2s5.A00.A0D.A0A(false, new InterfaceC42751wG() { // from class: X.3mh
            /* JADX WARN: Code restructure failed: missing block: B:121:0x00d2, code lost:
                if (r10 != null) goto L19;
             */
            /* JADX WARN: Removed duplicated region for block: B:167:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x019a  */
            @Override // X.InterfaceC42751wG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final X.C03860Hk ARr() {
                /*
                    Method dump skipped, instructions count: 574
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C80083mh.ARr():X.0Hk");
            }
        });
    }

    public void A0B() {
        boolean z;
        C2S4 c2s4 = ((C2S5) this).A00;
        C0CB c0cb = c2s4.A0O;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = c0cb.A0Q.A03("chat_setting_store", c0cb.A0F.A00.getDatabasePath("chatsettings.db")) == 19;
        C000200d.A1C("PrepareDirectTransferMsgStoreHelper/successfully replaced chat setting ", z4);
        C000200d.A1C("PrepareDirectTransferMsgStoreHelper/successfully replaced wall paper ", c2s4.A0P.A09());
        C40431sF c40431sF = c2s4.A0R;
        synchronized (c40431sF) {
            try {
                File A06 = c40431sF.A09.A06();
                if (c40431sF.A0E.A03("sticker_store", A06) == 19 && A06 != null) {
                    z = c40431sF.A0C(A06);
                    if (z) {
                        C0CD A03 = c40431sF.A03().A00.A03();
                        C03790Hb A00 = A03.A00();
                        try {
                            C0CF A0B = A03.A02.A0B("UPDATE stickers SET file_path = REPLACE(file_path, ?, ?);");
                            SQLiteStatement sQLiteStatement = A0B.A00;
                            sQLiteStatement.bindString(1, "/com.whatsapp/");
                            sQLiteStatement.bindString(2, "/com.whatsapp.w4b/");
                            A0B.A00();
                            A00.A00();
                            A03.close();
                            C0H1 c0h1 = c40431sF.A06.A04;
                            C0CD A04 = c0h1.A01.A04();
                            C03790Hb A002 = A04.A00();
                            C0CF A01 = c0h1.A02.A01("UPDATE media_refs SET path = REPLACE (path, ?, ?);");
                            A01.A05(1, "/com.whatsapp/");
                            A01.A05(2, "/com.whatsapp.w4b/");
                            A01.A00();
                            A002.A00();
                            A002.close();
                            A04.close();
                        } finally {
                        }
                    }
                }
            } catch (IOException e) {
                Log.e("StickerDBStorage/getFileToRestoreFrom: failed to copy sticker file", e);
            }
            z = false;
        }
        C000200d.A1C("PrepareDirectTransferMsgStoreHelper/successfully restored stickers ", z);
        C03350Fj c03350Fj = c2s4.A02;
        Cursor query = c03350Fj.A01.A00.getContentResolver().query(C03350Fj.A00("share_preferences", c03350Fj.A02.A0H(), c03350Fj.A02.A0J()), null, null, null, null);
        if (query == null) {
            z2 = false;
        } else {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(2);
                    int hashCode = string.hashCode();
                    if (hashCode != -891985903) {
                        if (hashCode != 104431) {
                            if (hashCode == 64711720 && string.equals("boolean")) {
                                c03350Fj.A02.A0D().putBoolean(query.getString(0), query.getInt(1) == 1).apply();
                            }
                        } else if (string.equals("int")) {
                            c03350Fj.A02.A0D().putInt(query.getString(0), query.getInt(1)).apply();
                        }
                    } else if (string.equals("string")) {
                        c03350Fj.A02.A0D().putString(query.getString(0), query.getString(1)).apply();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            query.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                }
            }
            query.close();
        }
        C000200d.A1C("PrepareDirectTransferMsgStoreHelper/successfully restored some shared preferences setting ", z2);
        if (z4 && z && z2) {
            z3 = true;
        }
        c2s4.A01.A01.A01 = Boolean.valueOf(!z3);
    }

    public void A0C(long j) {
        if (j > 0) {
            SystemClock.sleep(j);
        }
    }

    public void A0D(C03860Hk c03860Hk) {
    }

    public boolean A0E(C03860Hk c03860Hk) {
        return false;
    }
}
