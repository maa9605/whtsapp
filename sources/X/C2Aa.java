package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.Me;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2Aa */
/* loaded from: classes2.dex */
public class C2Aa {
    public static volatile C2Aa A0m;
    public GoogleBackupService A00;
    public final C03020Dv A02;
    public final C04920Mm A03;
    public final C018508q A04;
    public final C02L A05;
    public final C0E4 A06;
    public final C05X A07;
    public final C01B A08;
    public final C0E6 A09;
    public final C0L8 A0A;
    public final C469829b A0B;
    public final C40261rr A0C;
    public final AnonymousClass075 A0D;
    public final C04470Kh A0E;
    public final C41321tj A0F;
    public final C02E A0G;
    public final AnonymousClass012 A0H;
    public final C001200o A0I;
    public final C005102h A0J;
    public final C000500h A0K;
    public final C002301c A0L;
    public final C41181tV A0M;
    public final C42171vH A0N;
    public final C05N A0O;
    public final C05E A0P;
    public final C42721wD A0Q;
    public final C41711uO A0R;
    public final C0ES A0S;
    public final C00S A0T;
    public final C05Y A0U;
    public final C40291rx A0V;
    public final C0EG A0W;
    public final C47302Ar A0X;
    public final C02O A0Y;
    public final C42151vF A0Z;
    public final C05G A0a;
    public final C2CQ A0b;
    public final C47392Ba A0c;
    public final C2CO A0d;
    public final C2CP A0e;
    public final C26S A0f;
    public final AbstractC465527h A0g;
    public final C03070Ea A0h;
    public final C41951um A0i;
    public final InterfaceC002901k A0j;
    public final C41991uq A0k;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final List A0l = new CopyOnWriteArrayList();

    public C2Aa(C001200o c001200o, AnonymousClass012 anonymousClass012, C2CO c2co, C018508q c018508q, C05X c05x, C02L c02l, C03070Ea c03070Ea, InterfaceC002901k interfaceC002901k, C47392Ba c47392Ba, C2CP c2cp, C41991uq c41991uq, C41181tV c41181tV, C0EG c0eg, C01B c01b, C42151vF c42151vF, C0E6 c0e6, C05Y c05y, C40291rx c40291rx, C02E c02e, C002301c c002301c, C40261rr c40261rr, C0ES c0es, C0E4 c0e4, C41951um c41951um, C0L8 c0l8, C41321tj c41321tj, C42171vH c42171vH, C04920Mm c04920Mm, C04470Kh c04470Kh, C05E c05e, AnonymousClass075 anonymousClass075, C000500h c000500h, C2CQ c2cq, C005102h c005102h, C41711uO c41711uO, C26S c26s, AbstractC465527h abstractC465527h, C00S c00s, C47302Ar c47302Ar, C05G c05g, C02O c02o, C03020Dv c03020Dv, C42721wD c42721wD, C469829b c469829b, C05N c05n) {
        this.A0I = c001200o;
        this.A0H = anonymousClass012;
        this.A0d = c2co;
        this.A04 = c018508q;
        this.A07 = c05x;
        this.A05 = c02l;
        this.A0h = c03070Ea;
        this.A0j = interfaceC002901k;
        this.A0c = c47392Ba;
        this.A0e = c2cp;
        this.A0k = c41991uq;
        this.A0M = c41181tV;
        this.A0W = c0eg;
        this.A08 = c01b;
        this.A0Z = c42151vF;
        this.A09 = c0e6;
        this.A0U = c05y;
        this.A0V = c40291rx;
        this.A0G = c02e;
        this.A0L = c002301c;
        this.A0C = c40261rr;
        this.A0S = c0es;
        this.A0i = c41951um;
        this.A0A = c0l8;
        this.A0F = c41321tj;
        this.A06 = c0e4;
        this.A03 = c04920Mm;
        this.A0E = c04470Kh;
        this.A0N = c42171vH;
        this.A0P = c05e;
        this.A0D = anonymousClass075;
        this.A0K = c000500h;
        this.A0b = c2cq;
        this.A0J = c005102h;
        this.A0R = c41711uO;
        this.A0f = c26s;
        this.A0g = abstractC465527h;
        this.A0T = c00s;
        this.A0X = c47302Ar;
        this.A0a = c05g;
        this.A0Y = c02o;
        this.A02 = c03020Dv;
        this.A0Q = c42721wD;
        this.A0B = c469829b;
        this.A0O = c05n;
    }

    public static C2Aa A00() {
        if (A0m == null) {
            synchronized (C2Aa.class) {
                if (A0m == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C2CO A002 = C2CO.A00();
                    C018508q A003 = C018508q.A00();
                    C05X A004 = C05X.A00();
                    C02L A005 = C02L.A00();
                    C03070Ea A006 = C03070Ea.A00();
                    InterfaceC002901k A007 = C002801j.A00();
                    C47392Ba A01 = C47392Ba.A01();
                    if (C2CP.A00 == null) {
                        synchronized (C2CP.class) {
                            if (C2CP.A00 == null) {
                                C2CP.A00 = new C2CP();
                            }
                        }
                    }
                    C2CP c2cp = C2CP.A00;
                    C41991uq A008 = C41991uq.A00();
                    C41181tV A009 = C41181tV.A00();
                    C0EG A0010 = C0EG.A00();
                    C01B A0011 = C01B.A00();
                    C42151vF A0012 = C42151vF.A00();
                    C0E6 A0013 = C0E6.A00();
                    C05Y A012 = C05Y.A01();
                    C40291rx A0014 = C40291rx.A00();
                    C02E A0015 = C02E.A00();
                    C002301c A0016 = C002301c.A00();
                    C40261rr A0017 = C40261rr.A00();
                    C0ES A0018 = C0ES.A00();
                    C0E4 A0019 = C0E4.A00();
                    C41951um A0020 = C41951um.A00();
                    C0L8 A0021 = C0L8.A00();
                    C41321tj A0022 = C41321tj.A00();
                    C42171vH A0023 = C42171vH.A00();
                    C04920Mm A0024 = C04920Mm.A00();
                    C04470Kh A0025 = C04470Kh.A00();
                    C05E A0026 = C05E.A00();
                    AnonymousClass075 A0027 = AnonymousClass075.A00();
                    C02F.A00();
                    C000500h A0028 = C000500h.A00();
                    C2CQ A0029 = C2CQ.A00();
                    C005102h A0030 = C005102h.A00();
                    C41711uO A0031 = C41711uO.A00();
                    C26S A0032 = C26S.A00();
                    AbstractC465527h A0033 = AbstractC465527h.A00();
                    C00S c00s = C00S.A00;
                    if (c00s != null) {
                        A0m = new C2Aa(c001200o, A00, A002, A003, A004, A005, A006, A007, A01, c2cp, A008, A009, A0010, A0011, A0012, A0013, A012, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, c00s, C47302Ar.A00(), C05G.A00(), C02O.A00(), C03020Dv.A00(), C42721wD.A00(), C469829b.A00(), C05N.A00());
                    } else {
                        throw null;
                    }
                }
            }
        }
        return A0m;
    }

    public static String A01(Context context, Class cls) {
        String packageName = context.getPackageName();
        String name = cls.getName();
        int length = packageName.length();
        return (name.startsWith(packageName) && name.length() > length && name.charAt(length) == '.') ? name.substring(length + 1) : name;
    }

    public Intent A02() {
        A09();
        C05X c05x = this.A07;
        c05x.A01 = false;
        c05x.A00 = null;
        c05x.A08.A0Z(null, null);
        C40261rr c40261rr = this.A0C;
        c40261rr.A05();
        this.A0V.A09(false);
        C02L c02l = this.A05;
        c02l.A05();
        C0K1 c0k1 = c02l.A01;
        if (c0k1 != null) {
            C04470Kh c04470Kh = this.A0E;
            c04470Kh.A05.A05(c0k1);
            c04470Kh.A02(c0k1, 0, 0);
        }
        C001200o c001200o = this.A0I;
        File file = new File(c001200o.A00.getFilesDir(), "me");
        if (file.exists()) {
            file.delete();
        }
        c02l.A03();
        A0D(null, null, null);
        this.A0Q.A01();
        Intent intent = new Intent(c001200o.A00, RegisterPhone.class);
        intent.putExtra("com.whatsapp.registration.RegisterPhone.resetstate", true);
        intent.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        intent.addFlags(32768);
        A0B(1);
        this.A0h.A04();
        this.A0c.A06();
        C41951um c41951um = this.A0i;
        c41951um.A04();
        c41951um.A06();
        this.A0P.A00 = false;
        this.A0N.A00 = true;
        C03460Fu.A06(c001200o.A00);
        C000500h c000500h = this.A0K;
        C000200d.A0g(c000500h, "gdrive_successive_backup_failed_count", 0);
        this.A0k.A07();
        c40261rr.A06();
        c000500h.A0e(true);
        this.A0Z.A02(false);
        c000500h.A0g(false);
        c000500h.A0f(false);
        c000500h.A0D().putString("contact_qr_code", null).apply();
        Conversation.A0S(null);
        return intent;
    }

    public final C005402l A03(String str, String str2, String str3) {
        Application application = this.A0I.A00;
        C005402l A00 = C0DU.A00(application);
        A00.A0J = "critical_app_alerts@1";
        A00.A03 = 1;
        A00.A07.tickerText = C005402l.A00(str3);
        A00.A07.when = this.A0H.A05();
        A00.A03(3);
        A00.A05(16, true);
        A00.A0A(str);
        A00.A09(str2);
        C05170Np c05170Np = new C05170Np();
        c05170Np.A07(str2);
        A00.A08(c05170Np);
        A00.A09 = PendingIntent.getActivity(application, 1, new Intent(application, Main.class), 0);
        A00.A07.icon = R.drawable.notifybar;
        return A00;
    }

    public Me A04() {
        C000500h c000500h = this.A0K;
        return new Me(c000500h.A0H(), c000500h.A0J(), c000500h.A0I());
    }

    public void A05() {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A0I.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_RETRY").setPackage("com.whatsapp"), 536870912);
        if (broadcast != null) {
            AlarmManager A02 = this.A0G.A02();
            if (A02 != null) {
                A02.cancel(broadcast);
            } else {
                Log.w("RegistrationManager/cancelRegistrationRetryAlarm AlarmManager is null");
            }
            broadcast.cancel();
        }
    }

    public void A06() {
        C02L c02l = this.A05;
        Me A01 = c02l.A01();
        if (A01 != null) {
            c02l.A04();
            this.A03.A02();
            C00R c00r = (C00R) this.A0T;
            if (c00r.A03.A01()) {
                c00r.A04.A01();
            }
            this.A0c.A06();
            C40261rr c40261rr = this.A0C;
            c40261rr.A06();
            c40261rr.A0D(null);
            this.A0S.A0N(true, true, 3);
            this.A01.post(new RunnableEBaseShape4S0200000_I0_4(this, A01, 5));
            return;
        }
        Log.w("registrationmanager/response/ok already changed?");
    }

    public void A07() {
        this.A0A.A03();
        if (!this.A0a.A02()) {
            Log.i("registrationmanager/loginfailed/ignore as registration not verified");
            return;
        }
        Application application = this.A0I.A00;
        C0B5 c0b5 = this.A04.A00;
        if (c0b5 == null || !AnonymousClass088.A22(c0b5)) {
            this.A0j.AS1(new RunnableEBaseShape4S0200000_I0_4(this, application, 4));
        }
    }

    public void A08() {
        C02L c02l = this.A05;
        c02l.A05();
        if (c02l.A00 != null) {
            Log.i("xmpp/service/reset-registered/updateparams");
            c02l.A05();
            UserJid userJid = c02l.A03;
            C40291rx c40291rx = this.A0V;
            if (c40291rx.A1a) {
                c40291rx.A05 = userJid;
            }
        }
    }

    public void A09() {
        C02O c02o = this.A0Y;
        C001200o c001200o = this.A0I;
        c02o.A01(A01(c001200o.A00, RegisterPhone.class)).edit().clear().apply();
        c02o.A01(A01(c001200o.A00, VerifySms.class)).edit().clear().apply();
    }

    public void A0A() {
        this.A05.A03();
        C000500h c000500h = this.A0K;
        c000500h.A0D().remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        c000500h.A0D().remove("registration_wipe_info_timestamp").apply();
        A0B(1);
    }

    public void A0B(int i) {
        C000500h c000500h = this.A0K;
        if (c000500h.A00.getInt("registration_state", -1) != i) {
            C2CQ c2cq = this.A0b;
            c2cq.A00 = null;
            c2cq.A01 = false;
            c2cq.A02 = false;
            c2cq.A03 = false;
            c2cq.A06 = false;
            c2cq.A07 = false;
            c2cq.A04 = false;
            c2cq.A05 = true;
            c000500h.A0M();
        }
        C000200d.A0g(this.A0a.A00, "registration_state", i);
    }

    public void A0C(long j) {
        if (j < 60000) {
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A0I.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_RETRY").setPackage("com.whatsapp"), 134217728);
        AlarmManager A02 = this.A0G.A02();
        if (A02 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                A02.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, broadcast);
                return;
            } else if (i >= 19) {
                A02.setExact(2, SystemClock.elapsedRealtime() + j, broadcast);
                return;
            } else {
                A02.set(2, SystemClock.elapsedRealtime() + j, broadcast);
                return;
            }
        }
        Log.w("RegistrationManager/startRegistrationRetryAlarm AlarmManager is null");
    }

    public void A0D(String str, String str2, String str3) {
        C000500h c000500h = this.A0K;
        c000500h.A0D().putString("registration_jid", str3).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        c000500h.A0D().remove("registration_wipe_info_timestamp").apply();
        c000500h.A0b(str, str2);
    }

    public boolean A0E() {
        C0EG c0eg = this.A0W;
        c0eg.A05();
        C40291rx c40291rx = this.A0V;
        c40291rx.A09(false);
        Log.i("registrationmanager/complete-change-number");
        Me A04 = A04();
        Log.a(A04.jabber_id != null);
        C02L c02l = this.A05;
        c02l.A05();
        if (c02l.A08(A04, "me")) {
            c02l.A05();
            c02l.A06(A04);
            C05E c05e = this.A0P;
            c05e.A05();
            boolean z = c05e.A01;
            if (!z) {
                C05N c05n = this.A0O;
                if (c05n.A01.A08(false)) {
                    Log.i("registration-manager/complete-change-number/msgstoredb/healthy");
                    this.A0M.A07(false);
                    c05n.A01();
                }
            }
            A08();
            c40291rx.A03();
            if (!z) {
                this.A0F.A04();
            }
            A0B(3);
            this.A0N.A00 = true;
            C001200o c001200o = this.A0I;
            C03460Fu.A06(c001200o.A00);
            Log.i("registration-manager/complete-change-number/changenumber/setregverified");
            C41321tj c41321tj = this.A0F;
            if (c41321tj != null) {
                C468428m c468428m = new C468428m(C22H.A04);
                c468428m.A02();
                c468428m.A06 = true;
                c41321tj.A02(c468428m.A01(), true);
                this.A0X.A02(true, false);
                Log.i("registration-manager/complete-change-number/reinitalized-payments");
                C01B c01b = this.A08;
                if (c01b != null) {
                    synchronized (C01C.class) {
                        C01C.A07 = 0L;
                        c01b.A00.edit().putLong("groups_server_props_last_refresh_time", 0L).apply();
                    }
                    this.A0k.A07();
                    InterfaceC002901k interfaceC002901k = this.A0j;
                    interfaceC002901k.AS1(new RunnableEBaseShape5S0100000_I0_5(this.A0R, 34));
                    if (C0KF.A02()) {
                        new C454321z(this.A0H, c001200o, interfaceC002901k, this.A0U, this.A0K).A00();
                    }
                    c0eg.A05();
                    this.A0C.A06();
                    this.A0K.A0S(3);
                    c40291rx.A0D(true, false, false, false, 0);
                    return true;
                }
                throw null;
            }
            throw null;
        }
        Log.i("registration-manager/complete-change-number/error-saving");
        return false;
    }

    public boolean A0F() {
        Me A04 = A04();
        if (A04.jabber_id == null) {
            return false;
        }
        C02L c02l = this.A05;
        c02l.A05();
        c02l.A06(A04);
        C40291rx c40291rx = this.A0V;
        c40291rx.A1Z = false;
        Log.i("registrationmanager/finishRegistration/set-connection/passive");
        A08();
        c40291rx.A03();
        return true;
    }
}
