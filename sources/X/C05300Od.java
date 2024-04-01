package X;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0Od  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05300Od {
    public static volatile C05300Od A0j;
    public GoogleBackupService A00;
    public final C018508q A01;
    public final C02L A02;
    public final C05X A03;
    public final C0P5 A04;
    public final C0L8 A05;
    public final C469829b A06;
    public final C47422Bd A07;
    public final AnonymousClass272 A08;
    public final C40261rr A09;
    public final C41541u6 A0A;
    public final C47402Bb A0B;
    public final C001200o A0C;
    public final C02F A0D;
    public final C000500h A0E;
    public final C01J A0F;
    public final C0CC A0G;
    public final C05N A0H;
    public final C05E A0I;
    public final C42721wD A0J;
    public final C47412Bc A0K;
    public final C0F8 A0L;
    public final C013406l A0M;
    public final C42331vZ A0N;
    public final C47212Ai A0O;
    public final C41461tx A0P;
    public final C43121wt A0Q;
    public final C42451vl A0R;
    public final C40291rx A0S;
    public final C0EG A0T;
    public final C40301ry A0U;
    public final C47302Ar A0V;
    public final C2Aa A0W;
    public final C47392Ba A0X;
    public final C0CB A0Y;
    public final AbstractC465527h A0Z;
    public final C2AS A0a;
    public final C03070Ea A0b;
    public final C41951um A0c;
    public final InterfaceC002901k A0d;
    public final C47432Be A0e;
    public final C43361xH A0f;
    public final C41991uq A0g;
    public final C42951wb A0h;
    public final CopyOnWriteArrayList A0i = new CopyOnWriteArrayList();

    public C05300Od(C001200o c001200o, C018508q c018508q, C05X c05x, C02L c02l, C03070Ea c03070Ea, InterfaceC002901k interfaceC002901k, C47392Ba c47392Ba, C47212Ai c47212Ai, C41991uq c41991uq, C0EG c0eg, C41541u6 c41541u6, C43361xH c43361xH, C013406l c013406l, C0P5 c0p5, C40291rx c40291rx, C40261rr c40261rr, C42951wb c42951wb, C47402Bb c47402Bb, C0CB c0cb, C47412Bc c47412Bc, C47422Bd c47422Bd, C43121wt c43121wt, C01J c01j, C2AS c2as, C41951um c41951um, C0L8 c0l8, C0CC c0cc, AnonymousClass272 anonymousClass272, C40301ry c40301ry, C05E c05e, C2Aa c2Aa, C02F c02f, C000500h c000500h, C0F8 c0f8, C42331vZ c42331vZ, C42451vl c42451vl, C47432Be c47432Be, C41461tx c41461tx, AbstractC465527h abstractC465527h, C47302Ar c47302Ar, C42721wD c42721wD, C469829b c469829b, C05N c05n) {
        this.A0C = c001200o;
        this.A01 = c018508q;
        this.A03 = c05x;
        this.A02 = c02l;
        this.A0b = c03070Ea;
        this.A0d = interfaceC002901k;
        this.A0X = c47392Ba;
        this.A0O = c47212Ai;
        this.A0g = c41991uq;
        this.A0T = c0eg;
        this.A0A = c41541u6;
        this.A0f = c43361xH;
        this.A0M = c013406l;
        this.A04 = c0p5;
        this.A0S = c40291rx;
        this.A0h = c42951wb;
        this.A09 = c40261rr;
        this.A0B = c47402Bb;
        this.A0Y = c0cb;
        this.A0K = c47412Bc;
        this.A07 = c47422Bd;
        this.A0Q = c43121wt;
        this.A0F = c01j;
        this.A0a = c2as;
        this.A0c = c41951um;
        this.A05 = c0l8;
        this.A0G = c0cc;
        this.A08 = anonymousClass272;
        this.A0U = c40301ry;
        this.A0I = c05e;
        this.A0W = c2Aa;
        this.A0D = c02f;
        this.A0E = c000500h;
        this.A0L = c0f8;
        this.A0N = c42331vZ;
        this.A0R = c42451vl;
        this.A0e = c47432Be;
        this.A0P = c41461tx;
        this.A0Z = abstractC465527h;
        this.A0V = c47302Ar;
        this.A0J = c42721wD;
        this.A06 = c469829b;
        this.A0H = c05n;
    }

    public static C05300Od A00() {
        if (A0j == null) {
            synchronized (C05300Od.class) {
                if (A0j == null) {
                    C001200o c001200o = C001200o.A01;
                    C018508q A00 = C018508q.A00();
                    C05X A002 = C05X.A00();
                    C02L A003 = C02L.A00();
                    C03070Ea A004 = C03070Ea.A00();
                    InterfaceC002901k A005 = C002801j.A00();
                    C47392Ba A01 = C47392Ba.A01();
                    C47212Ai A006 = C47212Ai.A00();
                    C41991uq A007 = C41991uq.A00();
                    C0EG A008 = C0EG.A00();
                    C41541u6 A009 = C41541u6.A00();
                    C43361xH A0010 = C43361xH.A00();
                    C013406l A0011 = C013406l.A00();
                    if (C47442Bf.A00 == null) {
                        synchronized (C47442Bf.class) {
                            if (C47442Bf.A00 == null) {
                                C47442Bf.A00 = new C47442Bf();
                            }
                        }
                    }
                    C47442Bf c47442Bf = C47442Bf.A00;
                    C40291rx A0012 = C40291rx.A00();
                    C40261rr A0013 = C40261rr.A00();
                    C42951wb A0014 = C42951wb.A00();
                    C47402Bb A0015 = C47402Bb.A00();
                    C0CB A0016 = C0CB.A00();
                    C47412Bc A0017 = C47412Bc.A00();
                    C47422Bd A0018 = C47422Bd.A00();
                    C43121wt A0019 = C43121wt.A00();
                    C01J A0020 = C01J.A00();
                    C2AS A0021 = C2AS.A00();
                    C41951um A0022 = C41951um.A00();
                    C0L8 A0023 = C0L8.A00();
                    C0CC A012 = C0CC.A01();
                    AnonymousClass272 A0024 = AnonymousClass272.A00();
                    C40301ry A0025 = C40301ry.A00();
                    C05E A0026 = C05E.A00();
                    C2Aa A0027 = C2Aa.A00();
                    C02F A0028 = C02F.A00();
                    C000500h A0029 = C000500h.A00();
                    C0F8 A0030 = C0F8.A00();
                    C42331vZ A0031 = C42331vZ.A00();
                    C42451vl A0032 = C42451vl.A00();
                    if (C47432Be.A01 == null) {
                        synchronized (C47432Be.class) {
                            if (C47432Be.A01 == null) {
                                C47432Be.A01 = new C47432Be(AnonymousClass062.A00());
                            }
                        }
                    }
                    A0j = new C05300Od(c001200o, A00, A002, A003, A004, A005, A01, A006, A007, A008, A009, A0010, A0011, c47442Bf, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A012, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, C47432Be.A01, C41461tx.A00(), AbstractC465527h.A00(), C47302Ar.A00(), C42721wD.A00(), C469829b.A00(), C05N.A00());
                }
            }
        }
        return A0j;
    }

    public void A01() {
        String[] fileList;
        this.A0W.A0B(6);
        Iterator it = this.A0i.iterator();
        while (it.hasNext()) {
            ((C00U) it.next()).ALc();
        }
        C42451vl c42451vl = this.A0R;
        synchronized (c42451vl.A0S) {
            Iterator it2 = ((ArrayList) c42451vl.A04()).iterator();
            while (it2.hasNext()) {
                c42451vl.A07((AnonymousClass097) it2.next(), true, true);
            }
        }
        this.A0U.A0C(false);
        AnonymousClass272 anonymousClass272 = this.A08;
        synchronized (anonymousClass272) {
            anonymousClass272.A00.clear();
            anonymousClass272.A01.clear();
            anonymousClass272.A02.clear();
        }
        final ConditionVariable conditionVariable = new ConditionVariable(false);
        final AbstractC47452Bg abstractC47452Bg = new AbstractC47452Bg() { // from class: X.0P6
            @Override // X.InterfaceC470229f
            public void AGu(boolean z) {
                C000200d.A1N(C000200d.A0P("deleteacctconfirm/gdrive-observer/deletion-finished/"), z ? "success" : "failed");
                conditionVariable.open();
            }
        };
        final ConditionVariable conditionVariable2 = new ConditionVariable(false);
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: X.0P7
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C05300Od c05300Od = C05300Od.this;
                c05300Od.A00 = ((BinderC52972bg) iBinder).A00;
                conditionVariable2.open();
                c05300Od.A00.A07(abstractC47452Bg);
                c05300Od.A00.A04();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                conditionVariable2.close();
                C05300Od.this.A00 = null;
            }
        };
        final Application application = this.A0C.A00;
        application.bindService(new Intent(application, GoogleBackupService.class), serviceConnection, 1);
        C02L c02l = this.A02;
        c02l.A05();
        if (c02l.A00 != null) {
            final Intent intent = new Intent("action_delete");
            intent.putExtra("account_name", this.A0E.A0F());
            C02L c02l2 = this.A02;
            c02l2.A05();
            UserJid userJid = c02l2.A03;
            if (userJid != null) {
                intent.putExtra("jid_user", userJid.user);
                this.A0d.AS1(new Runnable() { // from class: X.1Li
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConditionVariable conditionVariable3 = conditionVariable2;
                        Context context = application;
                        Intent intent2 = intent;
                        conditionVariable3.block();
                        C40061rW.A0F(context, intent2);
                    }
                });
            } else {
                throw null;
            }
        } else {
            Log.i("deleteacctconfirm/app.me is null/no google drive backup deletion");
        }
        File filesDir = application.getFilesDir();
        filesDir.toString();
        for (String str : application.fileList()) {
        }
        AnonymousClass024.A0S(filesDir);
        this.A0d.AS1(new Runnable() { // from class: X.0P8
            @Override // java.lang.Runnable
            public final void run() {
                Log.rotate();
            }
        });
        this.A05.A03();
        C47402Bb c47402Bb = this.A0B;
        synchronized (c47402Bb) {
            c47402Bb.A02().edit().clear().commit();
        }
        String externalStorageState = Environment.getExternalStorageState();
        C000200d.A14("deleteacctconfirm/externalmedia-state ", externalStorageState);
        if (this.A0D.A0A(externalStorageState)) {
            C0CC c0cc = this.A0G;
            if (c0cc != null) {
                for (EnumC03450Ft enumC03450Ft : EnumC03450Ft.values()) {
                    C003101m.A0c(c0cc.A0G(enumC03450Ft), -1, "", false, false);
                }
                C003101m.A0c(c0cc.A0E(), -1, "", false, false);
            } else {
                throw null;
            }
        }
        this.A0T.A05();
        this.A0S.A09(false);
        this.A0d.ARy(new C0HS() { // from class: X.0P9
            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C05300Od c05300Od = C05300Od.this;
                if (c05300Od.A06.A07()) {
                    Log.i("deleteacctconfirm/delete-account-cleanup waiting for googleDriveService object to be received.");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (conditionVariable2.block(60000L)) {
                        long currentTimeMillis2 = 60000 - (System.currentTimeMillis() - currentTimeMillis);
                        Log.i("deleteacctconfirm/delete-account-cleanup waiting for Google Drive cleanup to finish.");
                        if (currentTimeMillis2 > 0 && conditionVariable.block(currentTimeMillis2)) {
                            Log.i("deleteacctconfirm/delete-account-cleanup Google Drive deletion is finished.");
                        } else {
                            Log.e("deleteacctconfirm/delete-account-cleanup Google Drive account deletion timed out.");
                        }
                    } else {
                        Log.e("deleteacctconfirm/delete-account-cleanup unable to get Google Drive service object.");
                    }
                    try {
                        GoogleBackupService googleBackupService = c05300Od.A00;
                        if (googleBackupService != null) {
                            googleBackupService.A08(abstractC47452Bg);
                            return null;
                        }
                        return null;
                    } catch (IllegalStateException e) {
                        Log.e("deleteacctconfirm/delete-account-cleanup", e);
                        return null;
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x020d  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x02be  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x02c5  */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A09(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 724
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0P9.A09(java.lang.Object):void");
            }
        }, new Void[0]);
    }

    public void A02() {
        Application application = this.A0C.A00;
        C0PA.A01(application, R.xml.preferences_account);
        C0PA.A01(application, R.xml.preferences_chat);
        C0PA.A01(application, R.xml.preferences_chat_history);
        C0PA.A01(application, R.xml.preferences_contacts);
        C0PA.A01(application, R.xml.preferences_data_usage);
    }
}
