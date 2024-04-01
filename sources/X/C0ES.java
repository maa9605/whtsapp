package X;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0ES */
/* loaded from: classes.dex */
public class C0ES {
    public static Handler A0o;
    public static volatile C0ES A0p;
    public Integer A01;
    public Integer A02;
    public final AbstractC000600i A04;
    public final C018508q A05;
    public final C02L A06;
    public final C01B A07;
    public final C05W A08;
    public final C018708s A09;
    public final C011505r A0A;
    public final C41581uB A0B;
    public final C0E7 A0C;
    public final AnonymousClass012 A0D;
    public final C000500h A0E;
    public final C01J A0F;
    public final C01R A0G;
    public final C06T A0H;
    public final C05M A0I;
    public final C03340Fh A0J;
    public final C0CA A0K;
    public final C0C9 A0L;
    public final C23Y A0M;
    public final C456923c A0N;
    public final C0FF A0O;
    public final C02960Do A0P;
    public final C0C8 A0Q;
    public final C0GU A0R;
    public final C03180Eq A0S;
    public final C0EC A0T;
    public final C003701t A0U;
    public final C23Z A0V;
    public final C457023d A0W;
    public final C456823b A0X;
    public final C03360Fk A0Y;
    public final C41461tx A0Z;
    public final C05Y A0a;
    public final C0EE A0b;
    public final C0EG A0c;
    public final C0DW A0d;
    public final C04400Ka A0e;
    public final C456723a A0f;
    public final C07A A0g;
    public final C03510Fz A0h;
    public final InterfaceC002901k A0i;
    public final C41991uq A0j;
    public volatile boolean A0m;
    public volatile boolean A0n;
    public AtomicBoolean A03 = new AtomicBoolean();
    public long A00 = 0;
    public final Set A0l = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map A0k = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r9v0, types: [X.23d] */
    public C0ES(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C05M c05m, C41991uq c41991uq, C0EG c0eg, C01B c01b, C0GU c0gu, C05Y c05y, C05W c05w, C23Y c23y, C01R c01r, C018708s c018708s, C002301c c002301c, C0C9 c0c9, C03510Fz c03510Fz, C03180Eq c03180Eq, C41581uB c41581uB, C0EE c0ee, C01J c01j, C0EC c0ec, C06T c06t, C011505r c011505r, C23Z c23z, C0E7 c0e7, C04400Ka c04400Ka, C456723a c456723a, C000500h c000500h, C0CA c0ca, C07A c07a, C03340Fh c03340Fh, C02960Do c02960Do, C0DW c0dw, C41461tx c41461tx, C0C8 c0c8, C456823b c456823b, C456923c c456923c, C03360Fk c03360Fk, C0FF c0ff) {
        ?? r9 = new AnonymousClass009() { // from class: X.23d
        };
        this.A0W = r9;
        this.A0D = anonymousClass012;
        this.A0U = c003701t;
        this.A05 = c018508q;
        this.A04 = abstractC000600i;
        this.A06 = c02l;
        this.A0i = interfaceC002901k;
        this.A0I = c05m;
        this.A0j = c41991uq;
        this.A0c = c0eg;
        this.A07 = c01b;
        this.A0R = c0gu;
        this.A0a = c05y;
        this.A08 = c05w;
        this.A0M = c23y;
        this.A09 = c018708s;
        this.A0S = c03180Eq;
        this.A0L = c0c9;
        this.A0h = c03510Fz;
        this.A0B = c41581uB;
        this.A0b = c0ee;
        this.A0F = c01j;
        this.A0T = c0ec;
        this.A0H = c06t;
        this.A0A = c011505r;
        this.A0V = c23z;
        this.A0C = c0e7;
        this.A0e = c04400Ka;
        this.A0f = c456723a;
        this.A0E = c000500h;
        this.A0K = c0ca;
        this.A0g = c07a;
        this.A0J = c03340Fh;
        this.A0P = c02960Do;
        this.A0d = c0dw;
        this.A0Z = c41461tx;
        this.A0X = c456823b;
        this.A0Q = c0c8;
        this.A0N = c456923c;
        this.A0Y = c03360Fk;
        this.A0O = c0ff;
        this.A0G = c01r;
        A0o = new Handler(c001200o, c018508q, c01b, c05w, c018708s, c002301c, c0c9, c456823b, r9) { // from class: X.23e
            public final C018508q A00;
            public final C01B A01;
            public final C05W A02;
            public final C018708s A03;
            public final C001200o A04;
            public final C002301c A05;
            public final C0C9 A06;
            public final C457023d A07;
            public final C456823b A08;

            {
                super(Looper.getMainLooper());
                this.A04 = c001200o;
                this.A00 = c018508q;
                this.A01 = c01b;
                this.A02 = c05w;
                this.A03 = c018708s;
                this.A05 = c002301c;
                this.A06 = c0c9;
                this.A08 = c456823b;
                this.A07 = r9;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String A0A;
                int i = message.what;
                if (i == 3) {
                    Log.i("groupmgr/conversations/leave group");
                    this.A08.A00(((AnonymousClass092) message.obj).A0n.A00);
                } else if (i == 5) {
                    this.A08.A00((AbstractC005302j) message.obj);
                } else if (i != 6) {
                    switch (i) {
                        case 1001:
                        case 1004:
                            C06C A08 = this.A02.A08((AbstractC005302j) message.obj);
                            if (A08 == null) {
                                return;
                            }
                            this.A00.A0E(this.A04.A00.getString(R.string.failed_to_leave_x_group, A08.A0F), 0);
                            return;
                        case 1002:
                            this.A08.A00((AbstractC005302j) message.obj);
                            this.A00.A07(R.string.group_error_add_participants, 0);
                            return;
                        case 1003:
                            this.A08.A00((AbstractC005302j) message.obj);
                            this.A00.A07(R.string.group_error_remove_participants, 0);
                            return;
                        case 1005:
                            this.A08.A00((AbstractC005302j) message.obj);
                            this.A00.A07(R.string.group_error_change_admins, 0);
                            return;
                        case 1006:
                            this.A08.A00((AbstractC005302j) message.obj);
                            this.A00.A07(R.string.group_error_change_admins, 0);
                            return;
                        case 1007:
                            this.A08.A00((AbstractC005302j) message.obj);
                            this.A00.A07(R.string.group_error_subject, 0);
                            return;
                        default:
                            switch (i) {
                                case 2001:
                                    this.A00.A0I(this.A04.A00.getString(R.string.group_error_create, message.obj), 0);
                                    return;
                                case 2002:
                                    this.A00.A0I(this.A04.A00.getString(R.string.group_error_create_too_many_groups, message.obj), 0);
                                    return;
                                case 2003:
                                    this.A00.A0I(this.A04.A00.getString(R.string.group_error_create_subject_too_long, message.obj), 0);
                                    return;
                                case 2004:
                                    this.A00.A0I(this.A04.A00.getString(R.string.group_error_create_too_many_requests, message.obj), 0);
                                    return;
                                case 2005:
                                    this.A00.A05(R.string.group_error_subject, 0);
                                    return;
                                case 2006:
                                    this.A00.A05(R.string.group_error_subject_not_authorized, 0);
                                    return;
                                case 2007:
                                    this.A00.A05(R.string.group_error_subject_not_in_group, 0);
                                    return;
                                case 2008:
                                    this.A00.A05(R.string.group_error_subject_no_such_group, 0);
                                    return;
                                case 2009:
                                    this.A00.A0I(this.A04.A00.getString(R.string.group_error_subject_too_long, message.obj), 0);
                                    return;
                                case 2010:
                                    this.A00.A05(R.string.group_error_add_participants, 0);
                                    return;
                                case 2011:
                                    this.A00.A05(R.string.group_error_add_participants_not_authorized, 0);
                                    return;
                                case 2012:
                                    this.A00.A05(R.string.group_error_add_participants_not_in_group, 0);
                                    return;
                                case 2013:
                                    break;
                                case 2014:
                                    this.A00.A05(R.string.group_error_remove_participants, 0);
                                    return;
                                case 2015:
                                    this.A00.A05(R.string.group_error_remove_participants_not_authorized, 0);
                                    return;
                                case 2016:
                                    this.A00.A05(R.string.group_error_remove_participants_not_in_group, 0);
                                    return;
                                case 2017:
                                    this.A00.A05(R.string.group_error_remove_participants_no_such_group, 0);
                                    return;
                                case 2018:
                                    this.A00.A05(R.string.group_error_change_admins, 0);
                                    return;
                                case 2019:
                                    this.A00.A05(R.string.group_error_change_admins_not_authorized, 0);
                                    return;
                                case 2020:
                                    this.A00.A05(R.string.group_error_change_admins_not_in_group, 0);
                                    return;
                                case 2021:
                                    this.A00.A05(R.string.group_error_change_admins_no_such_group, 0);
                                    return;
                                case 2022:
                                    this.A00.A05(R.string.group_error_leave, 0);
                                    return;
                                case 2023:
                                    this.A00.A05(R.string.group_error_leave_not_in_group, 0);
                                    return;
                                case 2024:
                                    this.A00.A05(R.string.group_error_leave_no_such_group, 0);
                                    return;
                                case 2025:
                                    this.A00.A05(R.string.group_error_end, 0);
                                    return;
                                default:
                                    switch (i) {
                                        case 3001:
                                            StringBuilder sb = new StringBuilder();
                                            String str = null;
                                            int i2 = 0;
                                            int i3 = 0;
                                            for (Map.Entry entry : ((Map) message.obj).entrySet()) {
                                                UserJid userJid = (UserJid) entry.getKey();
                                                StringBuilder A0U = C000200d.A0U("groupmgr/add-participant/error/", userJid, "/");
                                                A0U.append(entry.getValue());
                                                Log.e(A0U.toString());
                                                int intValue = ((Number) entry.getValue()).intValue();
                                                C06C A0A2 = this.A02.A0A(userJid);
                                                if (intValue == 401) {
                                                    i3++;
                                                    sb.append(this.A04.A00.getString(R.string.error_adding_participant_401, this.A03.A08(A0A2, false)));
                                                    sb.append("\n");
                                                } else if (intValue != 403) {
                                                    if (intValue == 406) {
                                                        i3++;
                                                        sb.append(this.A04.A00.getString(R.string.error_adding_participant_406, this.A03.A08(A0A2, false)));
                                                        sb.append("\n");
                                                    } else if (intValue == 500) {
                                                        i3++;
                                                        sb.append(this.A04.A00.getString(R.string.error_adding_participant_500, this.A03.A08(A0A2, false)));
                                                        sb.append("\n");
                                                    } else if (intValue == 408) {
                                                        i2++;
                                                        if (str == null) {
                                                            str = this.A03.A08(A0A2, false);
                                                        }
                                                    } else if (intValue != 409) {
                                                        i3++;
                                                        sb.append(this.A04.A00.getString(R.string.error_adding_participant, this.A03.A08(A0A2, false)));
                                                        sb.append("\n");
                                                    }
                                                } else if (!this.A01.A0E(C01C.A12)) {
                                                    i3++;
                                                    sb.append(this.A04.A00.getString(R.string.error_adding_participant, this.A03.A08(A0A2, false)));
                                                    sb.append("\n");
                                                }
                                            }
                                            if (i2 > 0) {
                                                if (i2 == 1) {
                                                    A0A = this.A04.A00.getString(R.string.error_adding_participant_408_single, str);
                                                } else {
                                                    A0A = this.A05.A0A(R.plurals.error_adding_participant_408_multi, i2, Integer.valueOf(i2));
                                                }
                                                this.A00.A0I(A0A, 0);
                                                return;
                                            } else if (i3 <= 0) {
                                                return;
                                            } else {
                                                this.A00.A0I(sb.toString(), 0);
                                                return;
                                            }
                                        case 3002:
                                            StringBuilder sb2 = new StringBuilder();
                                            for (Map.Entry entry2 : ((Map) message.obj).entrySet()) {
                                                UserJid userJid2 = (UserJid) entry2.getKey();
                                                StringBuilder A0U2 = C000200d.A0U("groupmgr/remove-participant/error/", userJid2, "/");
                                                A0U2.append(entry2.getValue());
                                                Log.e(A0U2.toString());
                                                int intValue2 = ((Number) entry2.getValue()).intValue();
                                                C06C A0A3 = this.A02.A0A(userJid2);
                                                if (intValue2 != 404) {
                                                    if (intValue2 != 406) {
                                                        sb2.append(this.A04.A00.getString(R.string.error_removing_participant, this.A03.A08(A0A3, false)));
                                                        sb2.append("\n");
                                                    } else {
                                                        sb2.append(this.A04.A00.getString(R.string.error_removing_participant_406, this.A03.A08(A0A3, false)));
                                                        sb2.append("\n");
                                                    }
                                                }
                                            }
                                            if (TextUtils.isEmpty(sb2)) {
                                                return;
                                            }
                                            this.A00.A0I(sb2.toString(), 0);
                                            return;
                                        case 3003:
                                            StringBuilder sb3 = new StringBuilder();
                                            for (Map.Entry entry3 : ((Map) message.obj).entrySet()) {
                                                UserJid userJid3 = (UserJid) entry3.getKey();
                                                StringBuilder A0U3 = C000200d.A0U("groupmgr/add-admins/error/", userJid3, "/");
                                                A0U3.append(entry3.getValue());
                                                Log.e(A0U3.toString());
                                                int intValue3 = ((Number) entry3.getValue()).intValue();
                                                C06C A0A4 = this.A02.A0A(userJid3);
                                                if (intValue3 == 404) {
                                                    sb3.append(this.A04.A00.getString(R.string.error_adding_participant, this.A03.A08(A0A4, false)));
                                                    sb3.append("\n");
                                                } else if (intValue3 != 419) {
                                                    sb3.append(this.A04.A00.getString(R.string.error_adding_participant, this.A03.A08(A0A4, false)));
                                                    sb3.append("\n");
                                                } else {
                                                    sb3.append(this.A04.A00.getString(R.string.failed_announcement_group_add_admin, this.A03.A08(A0A4, false)));
                                                    sb3.append("\n");
                                                }
                                            }
                                            this.A00.A0I(sb3.toString(), 0);
                                            return;
                                        case 3004:
                                            StringBuilder sb4 = new StringBuilder();
                                            for (Map.Entry entry4 : ((Map) message.obj).entrySet()) {
                                                UserJid userJid4 = (UserJid) entry4.getKey();
                                                StringBuilder A0U4 = C000200d.A0U("groupmgr/remove-admins/error/", userJid4, "/");
                                                A0U4.append(entry4.getValue());
                                                Log.e(A0U4.toString());
                                                int intValue4 = ((Number) entry4.getValue()).intValue();
                                                C06C A0A5 = this.A02.A0A(userJid4);
                                                if (intValue4 == 404) {
                                                    sb4.append(this.A04.A00.getString(R.string.error_removing_participant, this.A03.A08(A0A5, false)));
                                                    sb4.append("\n");
                                                } else if (intValue4 != 406) {
                                                    sb4.append(this.A04.A00.getString(R.string.error_removing_participant, this.A03.A08(A0A5, false)));
                                                    sb4.append("\n");
                                                } else {
                                                    sb4.append(this.A04.A00.getString(R.string.error_removing_admin_406, this.A03.A08(A0A5, false)));
                                                    sb4.append("\n");
                                                }
                                            }
                                            this.A00.A0I(sb4.toString(), 0);
                                            return;
                                        case 3005:
                                            this.A00.A05(R.string.group_error_add_participants_too_many_requests, 0);
                                            return;
                                        case 3006:
                                            Log.i("groupmgr/handle groupchat description change");
                                            AnonymousClass092 anonymousClass092 = (AnonymousClass092) message.obj;
                                            this.A06.A0Q(anonymousClass092);
                                            this.A08.A00(anonymousClass092.A0n.A00);
                                            return;
                                        case 3007:
                                            this.A00.A05(R.string.group_error_add_participant_repeated_add_blocked, 0);
                                            break;
                                        case 3008:
                                            Log.i("groupmgr/handle groupchat restrict mode change");
                                            AnonymousClass092 anonymousClass0922 = (AnonymousClass092) message.obj;
                                            this.A06.A0Q(anonymousClass0922);
                                            this.A08.A00(anonymousClass0922.A0n.A00);
                                            return;
                                        default:
                                            switch (i) {
                                                case 3010:
                                                    this.A00.A05(R.string.failed_update_group_info_not_admin, 0);
                                                    return;
                                                case 3011:
                                                    this.A00.A05(R.string.failed_update_group_info_not_participant, 0);
                                                    return;
                                                case 3012:
                                                    this.A00.A05(R.string.failed_update_group_info, 0);
                                                    return;
                                                case 3013:
                                                    int A06 = this.A01.A06();
                                                    this.A00.A0I(this.A05.A0A(R.plurals.failed_announcement_group_revert, A06, Integer.valueOf(A06)), 0);
                                                    return;
                                                case 3014:
                                                    int A07 = this.A01.A07(C01C.A2k);
                                                    this.A00.A0I(this.A05.A0A(R.plurals.failed_announcement_group_toggle_time, A07, Integer.valueOf(A07)), 0);
                                                    return;
                                                case 3015:
                                                    Log.i("groupmgr/handle groupchat description updated");
                                                    AnonymousClass092 anonymousClass0923 = (AnonymousClass092) message.obj;
                                                    this.A06.A0T(anonymousClass0923);
                                                    this.A08.A00(anonymousClass0923.A0n.A00);
                                                    return;
                                                case 3016:
                                                    Log.i("groupmgr/handle groupchat no frequently forwarded change");
                                                    AnonymousClass092 anonymousClass0924 = (AnonymousClass092) message.obj;
                                                    this.A06.A0Q(anonymousClass0924);
                                                    this.A08.A00(anonymousClass0924.A0n.A00);
                                                    return;
                                                case 3017:
                                                    AnonymousClass092 anonymousClass0925 = (AnonymousClass092) message.obj;
                                                    this.A06.A0Q(anonymousClass0925);
                                                    this.A08.A00(anonymousClass0925.A0n.A00);
                                                    return;
                                                case 3018:
                                                    this.A00.A05(R.string.group_error_ephemeral_internal_only, 0);
                                                    return;
                                                default:
                                                    return;
                                            }
                                    }
                            }
                            this.A00.A05(R.string.group_error_add_participants_no_such_group, 0);
                            return;
                    }
                } else {
                    C457023d c457023d = this.A07;
                    C458123v c458123v = (C458123v) message.obj;
                    Iterator it = c457023d.A00.iterator();
                    while (true) {
                        C0G5 c0g5 = (C0G5) it;
                        if (!c0g5.hasNext()) {
                            return;
                        }
                        ((C34451hX) c0g5.next()).A00.A1T(c458123v);
                    }
                }
            }
        };
    }

    public static C0ES A00() {
        if (A0p == null) {
            synchronized (C0ES.class) {
                if (A0p == null) {
                    A0p = new C0ES(C001200o.A01, AnonymousClass012.A00(), C003701t.A00(), C018508q.A00(), AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), C05M.A00(), C41991uq.A00(), C0EG.A00(), C01B.A00(), C0GU.A00(), C05Y.A01(), C05W.A00(), C23Y.A00(), C01R.A02, C018708s.A00(), C002301c.A00(), C0C9.A00(), C03510Fz.A03, C03180Eq.A00(), C41581uB.A00(), C0EE.A00(), C01J.A00(), C0EC.A00(), C06T.A02, C011505r.A00(), C23Z.A00(), C0E7.A00(), C04400Ka.A00(), C456723a.A00(), C000500h.A00(), C0CA.A00(), C07A.A01(), C03340Fh.A00, C02960Do.A02, C0DW.A00(), C41461tx.A00(), C0C8.A00(), C456823b.A01, C456923c.A00(), C03360Fk.A00, C0FF.A00());
                }
            }
        }
        return A0p;
    }

    public static UserJid A01(AnonymousClass092 anonymousClass092) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (C003101m.A0U(abstractC005302j)) {
            if (anonymousClass094.A02 && (anonymousClass092 instanceof C04300Jq)) {
                C04300Jq c04300Jq = (C04300Jq) anonymousClass092;
                int i = c04300Jq.A00;
                if (i != 10) {
                    if (i != 20 && i != 52) {
                        return UserJid.of(anonymousClass092.A0A());
                    }
                    return (UserJid) ((C04360Jw) c04300Jq).A01.get(0);
                }
                return ((C04370Jx) c04300Jq).A00;
            }
            return UserJid.of(anonymousClass092.A0A());
        }
        return UserJid.of(abstractC005302j);
    }

    public static void A02(int i, Object obj) {
        A0o.obtainMessage(i, obj).sendToTarget();
    }

    public static final boolean A03(C06C c06c, String str, long j, C04410Kb c04410Kb, boolean z, boolean z2, boolean z3, boolean z4, UserJid userJid) {
        if (TextUtils.equals(c06c.A0F, str) && TextUtils.equals(c06c.A0J, Long.toString(j)) && TextUtils.equals(c06c.A0B.A02, c04410Kb.A02) && c06c.A0S == z && c06c.A0Z == z2 && c06c.A0Q == z3 && c06c.A0Y == z4 && AnonymousClass024.A0l(c06c.A0A, userJid)) {
            return false;
        }
        c06c.A0F = str;
        c06c.A0J = Long.toString(j);
        if (c04410Kb.A02 != null) {
            c06c.A0B = c04410Kb;
        }
        c06c.A0S = z;
        c06c.A0Z = z2;
        c06c.A0Q = z3;
        c06c.A0Y = z4;
        c06c.A0A = userJid;
        return true;
    }

    public static boolean A04(AnonymousClass092 anonymousClass092) {
        try {
            if (anonymousClass092 instanceof C04360Jw) {
                C04360Jw c04360Jw = (C04360Jw) anonymousClass092;
                int i = ((C04300Jq) c04360Jw).A00;
                if (i != 4 || c04360Jw.A00 != 1) {
                    if (i != 12) {
                        return false;
                    }
                    if (c04360Jw.A00 != 1) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            StringBuilder A0P = C000200d.A0P("groupmgr/importantmsg/null ");
            A0P.append(C0DB.A08(anonymousClass092));
            Log.e(A0P.toString(), e);
            throw e;
        }
    }

    public final int A05(C02630Ce c02630Ce, Map map, boolean z, boolean z2, long j) {
        int i;
        UserJid userJid;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(map.size());
        Iterator it = map.keySet().iterator();
        while (true) {
            int i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            UserJid userJid2 = (UserJid) it.next();
            Object obj = map.get(userJid2);
            if (!"admin".equals(obj)) {
                i2 = 0;
                if ("superadmin".equals(obj)) {
                    i2 = 2;
                }
            }
            C0D7 c0d7 = (C0D7) c02630Ce.A01.get(userJid2);
            if (c0d7 == null) {
                StringBuilder sb = new StringBuilder("groupmgr/sync-add-participant: ");
                sb.append(userJid2);
                Log.i(sb.toString());
                arrayList.add(userJid2);
            } else if (c0d7.A01 != i2) {
                StringBuilder A0U = C000200d.A0U("groupmgr/sync-change-admin-participant: ", userJid2, " was ");
                A0U.append(c0d7.A01);
                Log.i(A0U.toString());
                arrayList2.add(c0d7);
            }
            arrayList3.add(new C0D7(userJid2, C02630Ce.A01(this.A0T.A06(userJid2)), i2, false));
        }
        c02630Ce.A09(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = c02630Ce.A04().iterator();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it2;
            if (!c04250Jl.hasNext()) {
                break;
            }
            Object next = c04250Jl.next();
            if (!map.containsKey(next)) {
                StringBuilder sb2 = new StringBuilder("groupmgr/sync-remove-participant:");
                sb2.append(next);
                Log.i(sb2.toString());
                arrayList4.add(next);
            }
        }
        c02630Ce.A0A(arrayList4);
        if (z) {
            ArrayList A06 = c02630Ce.A06();
            if (!arrayList.isEmpty()) {
                C23Z c23z = this.A0V;
                C07A c07a = this.A0g;
                AbstractC011205o abstractC011205o = c02630Ce.A02;
                long A05 = this.A0D.A05();
                if (z2 && A06.size() == 1) {
                    userJid = ((C0D7) A06.get(0)).A03;
                } else {
                    userJid = null;
                }
                c23z.A02(c07a.A09(null, abstractC011205o, A05, 12, userJid, arrayList, c02630Ce, 0L), 2);
            }
            if (!arrayList4.isEmpty()) {
                this.A0V.A02(this.A0g.A09(null, c02630Ce.A02, this.A0D.A05(), 13, null, arrayList4, null, 0L), 2);
            }
            A0F(c02630Ce.A02, arrayList2, Long.valueOf(j));
        } else {
            C0C8 c0c8 = this.A0Q;
            C0CD A04 = c0c8.A05.A04();
            try {
                C03790Hb A00 = A04.A00();
                C0F3 c0f3 = c0c8.A08;
                if (c0f3.A0E()) {
                    StringBuilder sb3 = new StringBuilder("participant-user-store/saveGroupParticipants/");
                    sb3.append(c02630Ce);
                    Log.i(sb3.toString());
                    C05B c05b = c0f3.A07;
                    AbstractC011205o abstractC011205o2 = c02630Ce.A02;
                    long A02 = c05b.A02(abstractC011205o2);
                    A04 = c0f3.A08.A04();
                    try {
                        C03790Hb A002 = A04.A00();
                        C0CE c0ce = A04.A02;
                        c0ce.A01("group_participant_user", "group_jid_row_id=?", new String[]{String.valueOf(A02)});
                        Iterator it3 = c02630Ce.A05().iterator();
                        while (true) {
                            C04250Jl c04250Jl2 = (C04250Jl) it3;
                            if (!c04250Jl2.hasNext()) {
                                break;
                            }
                            C0D7 c0d72 = (C0D7) c04250Jl2.next();
                            UserJid userJid3 = c0d72.A03;
                            long A01 = c0f3.A01(userJid3);
                            ContentValues contentValues = new ContentValues(4);
                            contentValues.put("group_jid_row_id", Long.valueOf(A02));
                            contentValues.put("user_jid_row_id", Long.valueOf(A01));
                            contentValues.put("rank", Integer.valueOf(c0d72.A01));
                            int i3 = 0;
                            if (c0d72.A02) {
                                i3 = 1;
                            }
                            contentValues.put("pending", Integer.valueOf(i3));
                            c0ce.A02("group_participant_user", contentValues);
                            c0f3.A09.A03(abstractC011205o2, userJid3, A01, c0d72.A00());
                        }
                        A002.A00();
                        A002.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                            try {
                                A04.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                if (c0f3 != null) {
                    C0FE c0fe = c0c8.A07;
                    StringBuilder sb4 = new StringBuilder("msgstore/saveGroupParticipants/");
                    sb4.append(c02630Ce);
                    Log.i(sb4.toString());
                    C0CD A042 = c0fe.A08.A04();
                    try {
                        C03790Hb A003 = A042.A00();
                        AbstractC011205o abstractC011205o3 = c02630Ce.A02;
                        String[] strArr = {abstractC011205o3.getRawString()};
                        C0CE c0ce2 = A042.A02;
                        c0ce2.A01("group_participants", "gjid = ?", strArr);
                        Iterator it4 = c02630Ce.A05().iterator();
                        while (true) {
                            C04250Jl c04250Jl3 = (C04250Jl) it4;
                            if (c04250Jl3.hasNext()) {
                                C0D7 c0d73 = (C0D7) c04250Jl3.next();
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("gjid", abstractC011205o3.getRawString());
                                C02L c02l = c0fe.A01;
                                UserJid userJid4 = c0d73.A03;
                                contentValues2.put("jid", c02l.A0A(userJid4) ? "" : userJid4.getRawString());
                                contentValues2.put("admin", Integer.valueOf(c0d73.A01));
                                contentValues2.put("pending", Integer.valueOf(c0d73.A02 ? 1 : 0));
                                C04430Kd c04430Kd = (C04430Kd) c0d73.A04.get(DeviceJid.of(userJid4));
                                if (c04430Kd != null) {
                                    contentValues2.put("sent_sender_key", Boolean.valueOf(c04430Kd.A00));
                                    c0ce2.A02("group_participants", contentValues2);
                                } else {
                                    throw null;
                                }
                            } else {
                                A003.A00();
                                A003.close();
                                A042.close();
                                if (abstractC011205o3 instanceof C011005l) {
                                    c0c8.A04.A01((C011005l) abstractC011205o3, j);
                                }
                                A00.A00();
                                A00.close();
                                A04.close();
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                            try {
                                A042.close();
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                } else {
                    throw null;
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } finally {
                    try {
                        A04.close();
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
        if (arrayList.isEmpty() && arrayList4.isEmpty()) {
            i = 0;
        } else {
            c02630Ce.A07();
            i = 1;
        }
        return !arrayList2.isEmpty() ? i | 2 : i;
    }

    public int A06(C011005l c011005l) {
        if (this.A08.A08(c011005l) == null) {
            return 0;
        }
        return this.A07.A06();
    }

    public C04300Jq A07(C0I1 c0i1, List list) {
        A0D(c0i1, list, false);
        C07A c07a = this.A0g;
        long A05 = this.A0D.A05();
        C02L c02l = this.A06;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C05V c05v = c07a.A05;
            C04300Jq A00 = C07A.A00(C05V.A00(c05v.A01, c05v.A00, c0i1, true), A05, 9, c07a.A00);
            A00.A0l(null);
            A00.A0u(list);
            A00.A0d(userJid);
            return A00;
        }
        throw null;
    }

    public final synchronized void A08() {
        Integer num = this.A02;
        if (num != null) {
            if (num.intValue() == 3) {
                this.A00 = this.A0D.A05();
            }
            A0A(this.A02.intValue());
            this.A02 = null;
        } else {
            throw null;
        }
    }

    public synchronized void A09(int i) {
        Log.i("groupmgr/groupSyncFailedOrTimedOut");
        this.A0m = false;
        this.A0n = false;
        A0B(i);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.23f] */
    public synchronized void A0A(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/sendGetGroups/ ");
        sb.append(i);
        Log.i(sb.toString());
        this.A01 = Integer.valueOf(i);
        this.A0n = true;
        new InterfaceC010405f(this.A04, this.A0a, this, this.A0B, this.A0b, i) { // from class: X.23f
            public final int A00;
            public final AbstractC000600i A01;
            public final C41581uB A02;
            public final C0ES A03;
            public final C05Y A04;
            public final C0EE A05;

            {
                this.A01 = r1;
                this.A04 = r2;
                this.A03 = this;
                this.A02 = r4;
                this.A05 = r5;
                this.A00 = i;
            }

            public void A00() {
                Log.i("GroupRequestProtocolHelper/sendGetGroups/get-groups");
                C05Y c05y = this.A04;
                String A02 = c05y.A02();
                ArrayList arrayList = new ArrayList();
                int i2 = this.A00;
                if ((i2 & 1) != 0) {
                    arrayList.add(new C02590Ca("participants", null, null, null));
                }
                if ((i2 & 2) != 0) {
                    arrayList.add(new C02590Ca("description", null, null, null));
                }
                c05y.A07(19, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C0N9.A00)}, new C02590Ca[]{new C02590Ca("participating", null, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)}, null), this, 0L);
            }

            @Override // X.InterfaceC010405f
            public void AJI(String str) {
                C000200d.A13("GroupRequestProtocolHelper/onDeliveryFailure/iqId=", str);
                this.A03.A09(this.A00);
            }

            @Override // X.InterfaceC010405f
            public void AJx(String str, C02590Ca c02590Ca) {
                C000200d.A13("GroupRequestProtocolHelper/onError/iqId=", str);
                this.A03.A09(this.A00);
            }

            /* JADX WARN: Removed duplicated region for block: B:186:0x01b1  */
            @Override // X.InterfaceC010405f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void APJ(java.lang.String r39, X.C02590Ca r40) {
                /*
                    Method dump skipped, instructions count: 547
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C457223f.APJ(java.lang.String, X.0Ca):void");
            }
        }.A00();
    }

    public final synchronized void A0B(int i) {
        Integer valueOf;
        int intValue;
        Integer num = this.A02;
        if (num != null) {
            valueOf = Integer.valueOf(i | num.intValue());
            this.A02 = valueOf;
        } else {
            valueOf = Integer.valueOf(i);
            this.A02 = valueOf;
        }
        Integer num2 = this.A01;
        if (num2 != null) {
            intValue = num2.intValue() | valueOf.intValue();
        } else {
            intValue = valueOf.intValue();
        }
        this.A0E.A0S(intValue);
    }

    public final void A0C(AbstractC005302j abstractC005302j, List list) {
        if (this.A0d.A02() && C003101m.A0U(abstractC005302j)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A0L.A0K(abstractC005302j, (UserJid) it.next());
            }
        }
    }

    public final void A0D(AbstractC011205o abstractC011205o, Iterable iterable, boolean z) {
        C02630Ce A01 = this.A0Q.A01(abstractC011205o);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            arrayList.add(new C0D7(userJid, C02630Ce.A01(this.A0T.A06(userJid)), 0, z));
        }
        A01.A09(arrayList);
        if (C003101m.A0Q(abstractC011205o)) {
            C02L c02l = this.A06;
            c02l.A05();
            UserJid userJid2 = c02l.A03;
            if (userJid2 != null) {
                A01.A03(userJid2, this.A0T.A06(userJid2), 2, z, true);
                return;
            }
            throw null;
        }
    }

    public final void A0E(AbstractC011205o abstractC011205o, List list) {
        C000700j.A05(list);
        C02630Ce A01 = this.A0Q.A01(abstractC011205o);
        A01.A0A(list);
        this.A0Z.A0T(abstractC011205o, list);
        if (C003101m.A0P(abstractC011205o)) {
            C01R c01r = this.A0G;
            c01r.A00.submit(new RunnableEBaseShape0S0300000_I0_0(this, A01, abstractC011205o, 23));
            this.A09.A07.remove(abstractC011205o);
        } else {
            A0C(abstractC011205o, list);
        }
        if (list.size() == 1) {
            this.A0V.A02(this.A0g.A08(null, abstractC011205o, this.A0D.A05(), 7, (UserJid) list.get(0), 0L), 2);
        } else {
            this.A0V.A02(this.A0g.A09(null, abstractC011205o, this.A0D.A05(), 14, null, list, A01, 0L), 2);
        }
    }

    public final void A0F(AbstractC011205o abstractC011205o, List list, Long l) {
        this.A0H.A01(new RunnableEBaseShape0S0400000_I0(this, abstractC011205o, list, l, 6), 46);
    }

    public final void A0G(C011005l c011005l, UserJid userJid) {
        StringBuilder sb = new StringBuilder("groupmgr/addGroupParticipantOnCurrentThread/adding participant: ");
        sb.append(userJid);
        sb.append(" to group:");
        sb.append(c011005l);
        Log.i(sb.toString());
        this.A0Q.A01(c011005l).A03(userJid, this.A0T.A06(userJid), 0, false, true);
        this.A09.A07.remove(c011005l);
        C04360Jw A08 = this.A0g.A08(null, c011005l, this.A0D.A05(), 4, userJid, 0L);
        this.A0L.A0j(A08);
        A0o.post(new RunnableEBaseShape2S0200000_I0_2(this, A08, 24));
    }

    public void A0H(C011005l c011005l, UserJid userJid, long j, String str, long j2, String str2, long j3, long j4, Map map, C04410Kb c04410Kb, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5;
        int A05;
        StringBuilder sb = new StringBuilder("groupmgr/onGroupInfoFromList/gjid:");
        sb.append(c011005l);
        sb.append("/creator:");
        sb.append(userJid);
        sb.append("/creation:");
        sb.append(j);
        sb.append("/subject:");
        sb.append(str);
        sb.append("/subject_time:");
        sb.append(j2);
        sb.append("/type:");
        sb.append(str2);
        sb.append("/vid:");
        sb.append(j3);
        sb.append("/inAppSupport:");
        sb.append(z);
        sb.append("/restrictMode:");
        sb.append(z2);
        sb.append("/announcementsOnly:");
        sb.append(z3);
        sb.append("/ephemeralDuration");
        sb.append(i);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("groupmgr/onGroupInfoFromList/");
        sb2.append(map);
        Log.i(sb2.toString());
        C05W c05w = this.A08;
        C06C A0A = c05w.A0A(c011005l);
        boolean A03 = A03(A0A, str, j, c04410Kb, z, z2, z3, z4, userJid);
        if (this.A07.A0E(C01C.A0n) && A0A.A00 != i) {
            A0A.A00 = i;
            A03 = true;
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z6 = !this.A0I.A0E(c011005l);
        if (z6) {
            C23Z c23z = this.A0V;
            C07A c07a = this.A0g;
            C04360Jw A07 = c07a.A07(null, c011005l, j2, 11, null);
            A07.A0l(str);
            A07.A0d(userJid);
            c23z.A02(A07, 1);
            C02L c02l = this.A06;
            if (!c02l.A0A(userJid)) {
                c02l.A05();
                UserJid userJid2 = c02l.A03;
                if (userJid2 != null) {
                    C05V c05v = c07a.A05;
                    C04300Jq A00 = C07A.A00(C05V.A00(c05v.A01, c05v.A00, c011005l, true), j2, 4, c07a.A00);
                    A00.A0d(userJid2);
                    c23z.A02(A00, 2);
                } else {
                    throw null;
                }
            }
        } else {
            this.A0M.A03(c011005l, str, j);
        }
        if (map == null) {
            A05 = 0;
        } else {
            A05 = A05(this.A0Q.A01(c011005l), map, !z6, true, j3);
            if ((A05 & 1) != 0) {
                this.A09.A07.remove(c011005l);
            }
        }
        if (A03) {
            c05w.A0J(A0A);
        }
        if (!this.A0P.A01.containsKey(c011005l)) {
            this.A0e.A02(c011005l, 0, 2, null);
        }
        if ((A05 & 2) != 0) {
            A02(5, c011005l);
        }
        if (z5) {
            A02(3017, this.A0g.A05(null, c011005l, null, A0A.A00, this.A0D.A05()));
        }
        C0FF c0ff = this.A0O;
        if (c0ff.A03()) {
            c0ff.A01.A01(c011005l, j4);
        }
        long j5 = j2 / 1000;
        if (c0ff.A03()) {
            c0ff.A01.A02(c011005l, j5);
        }
        c0ff.A02(c011005l, j3);
    }

    public void A0I(C04420Kc c04420Kc, int i, UserJid userJid, long j) {
        int i2 = i;
        StringBuilder sb = new StringBuilder("groupmgr/onGroupEphemeralChanged/");
        sb.append(c04420Kc);
        sb.append("/");
        sb.append(i);
        Log.i(sb.toString());
        if (i < 0) {
            i2 = 0;
        }
        C011005l A03 = C011005l.A03(C003101m.A04(c04420Kc.A01));
        if (A03 != null) {
            if (!this.A07.A0E(C01C.A0n)) {
                Log.i("groupmgr/onGroupEphemeralChanged/skip");
            } else {
                C05W c05w = this.A08;
                C06C A08 = c05w.A08(A03);
                if (A08 != null) {
                    if (A08.A00 != i2) {
                        Log.i("groupmgr/onGroupEphemeralChanged/changed");
                        C06C A0A = c05w.A0A(A03);
                        if (A0A.A00 != i2) {
                            A0A.A00 = i2;
                            c05w.A05.A0N(A0A);
                            c05w.A03.A00(A0A);
                        }
                        A02(3017, this.A0g.A05(c04420Kc, A03, userJid, i2, j));
                        return;
                    }
                    Log.i("groupmgr/onGroupEphemeralChanged/did not change");
                } else {
                    Log.i("groupmgr/onGroupEphemeralChanged/new group");
                }
            }
            this.A0c.A0L(c04420Kc);
            return;
        }
        throw null;
    }

    public void A0J(C04420Kc c04420Kc, String str, UserJid userJid, long j) {
        StringBuilder sb = new StringBuilder("groupmgr/onGroupNewSubject/");
        sb.append(c04420Kc);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(userJid);
        sb.append("/");
        sb.append(j);
        Log.i(sb.toString());
        C011005l A03 = C011005l.A03(C003101m.A04(c04420Kc.A01));
        if (A03 != null) {
            C05W c05w = this.A08;
            C06C A08 = c05w.A08(A03);
            if (A08 != null) {
                String A082 = this.A09.A08(A08, false);
                if (!A082.equals(str)) {
                    Log.i("groupmgr/onGroupNewSubject/changed");
                    C06C A0A = c05w.A0A(A03);
                    A0A.A0F = str;
                    c05w.A05.A0N(A0A);
                    c05w.A03.A00(A0A);
                    C23Z c23z = this.A0V;
                    C04450Kf c04450Kf = (C04450Kf) this.A0g.A07(c04420Kc, A03, j, 1, null);
                    synchronized (c04450Kf.A0o) {
                        c04450Kf.A00 = str;
                    }
                    c04450Kf.A01 = A082;
                    c04450Kf.A0d(userJid);
                    c23z.A02(c04450Kf, 4);
                    return;
                }
                Log.i("groupmgr/onGroupNewSubject/did not change");
                this.A0c.A0L(c04420Kc);
                return;
            }
            Log.i("groupmgr/onGroupNewSubject/new group");
            C02630Ce c02630Ce = new C02630Ce(A03);
            c05w.A0B(A03, str, j, C04410Kb.A04, false, false, false, false, 0, null);
            this.A0P.A01.put(A03, c02630Ce);
            C23Z c23z2 = this.A0V;
            C04360Jw A07 = this.A0g.A07(c04420Kc, A03, j, 11, null);
            A07.A0l(str);
            A07.A0d(userJid);
            c23z2.A02(A07, 1);
            this.A0c.A0F(A03, null);
            return;
        }
        throw null;
    }

    public void A0K(C04420Kc c04420Kc, boolean z, UserJid userJid, long j) {
        StringBuilder sb = new StringBuilder("groupmgr/onGroupNoFrequentlyForwardedToggled/");
        sb.append(c04420Kc);
        sb.append("/");
        sb.append(z);
        Log.i(sb.toString());
        C011005l A03 = C011005l.A03(C003101m.A04(c04420Kc.A01));
        if (A03 != null) {
            C05W c05w = this.A08;
            C06C A08 = c05w.A08(A03);
            if (A08 != null) {
                if (A08.A0Y != z) {
                    Log.i("groupmgr/onGroupAnnouncementsToggled/changed");
                    C06C A0A = c05w.A0A(A03);
                    if (A0A.A0Y != z) {
                        A0A.A0Y = z;
                        c05w.A05.A0N(A0A);
                        c05w.A03.A00(A0A);
                    }
                    C04360Jw A07 = this.A0g.A07(c04420Kc, A03, j, z ? 53 : 54, null);
                    A07.A0d(userJid);
                    A02(3016, A07);
                    return;
                }
                Log.i("groupmgr/onGroupNoFrequentlyForwardedToggled/did not change");
                this.A0c.A0L(c04420Kc);
                return;
            }
            Log.i("groupmgr/onGroupNoFrequentlyForwardedToggled/new group");
            return;
        }
        throw null;
    }

    public void A0L(C04420Kc c04420Kc, boolean z, UserJid userJid, long j) {
        StringBuilder sb = new StringBuilder("groupmgr/onGroupRestrictModeToggled/");
        sb.append(c04420Kc);
        sb.append("/");
        sb.append(z);
        Log.i(sb.toString());
        C011005l A03 = C011005l.A03(C003101m.A04(c04420Kc.A01));
        if (A03 != null) {
            C05W c05w = this.A08;
            C06C A08 = c05w.A08(A03);
            if (A08 != null) {
                if (A08.A0Z != z) {
                    Log.i("groupmgr/onGroupRestrictModeToggled/changed");
                    C06C A0A = c05w.A0A(A03);
                    if (A0A.A0Z != z) {
                        A0A.A0Z = z;
                        c05w.A05.A0N(A0A);
                        c05w.A03.A00(A0A);
                    }
                    C04360Jw A07 = this.A0g.A07(c04420Kc, A03, j, z ? 29 : 30, null);
                    A07.A0d(userJid);
                    A02(3008, A07);
                    return;
                }
                Log.i("groupmgr/onGroupRestrictModeToggled/did not change");
                this.A0c.A0L(c04420Kc);
                return;
            }
            Log.i("groupmgr/onGroupRestrictModeToggled/new group");
            return;
        }
        throw null;
    }

    public void A0M(List list, boolean z) {
        StringBuilder A0P = C000200d.A0P("groupmgr/onLeaveGroup/");
        A0P.append(Arrays.deepToString(list.toArray()));
        Log.i(A0P.toString());
        C02L c02l = this.A06;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C011005l c011005l = (C011005l) it.next();
                this.A09.A07.remove(c011005l);
                C02630Ce A01 = this.A0Q.A01(c011005l);
                if (A01.A0B(c02l)) {
                    if (A01.A01.remove(userJid) != null) {
                        A01.A07();
                    }
                    this.A0Z.A0U(c011005l);
                    A0C(c011005l, Collections.singletonList(userJid));
                    if (z && this.A0I.A0E(c011005l)) {
                        this.A0V.A02(this.A0g.A08(null, c011005l, this.A0D.A05(), 5, userJid, 0L), 2);
                    } else {
                        A02(3, this.A0g.A08(null, c011005l, this.A0D.A05(), 5, userJid, 0L));
                    }
                }
            }
            return;
        }
        throw null;
    }

    public synchronized void A0N(boolean z, boolean z2, int i) {
        if (z2) {
            if (this.A00 != 0 && this.A0D.A05() - this.A00 < 120000) {
                StringBuilder sb = new StringBuilder();
                sb.append("groupmgr/sendGetGroups/skip backoff param=");
                sb.append(i);
                Log.i(sb.toString());
                return;
            }
        }
        if (i == 3) {
            Log.i("groupmgr/sendGetGroups/all");
            this.A0m = true;
        }
        Integer num = this.A01;
        if (num != null) {
            if (z && (num.intValue() & i) == i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("groupmgr/sendGetGroups/skip inFlight param=");
                sb2.append(i);
                Log.i(sb2.toString());
            } else {
                A0B(i);
            }
        } else {
            A0B(i);
            A08();
        }
    }

    public boolean A0O(C011005l c011005l) {
        C06C A09;
        Iterator it = this.A0Q.A01(c011005l).A06().iterator();
        while (it.hasNext()) {
            C02L c02l = this.A06;
            UserJid userJid = ((C0D7) it.next()).A03;
            if (!c02l.A0A(userJid) && (A09 = this.A08.A09(userJid)) != null && A09.A08 != null) {
                return true;
            }
        }
        return false;
    }
}
