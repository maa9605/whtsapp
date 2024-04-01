package java.lang;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.AnonymousClass012;
import X.AnonymousClass072;
import X.AnonymousClass092;
import X.AnonymousClass220;
import X.AnonymousClass324;
import X.C000200d;
import X.C000500h;
import X.C011405q;
import X.C01B;
import X.C01C;
import X.C02L;
import X.C05140Nm;
import X.C05W;
import X.C0EB;
import X.C0Hr;
import X.C0K1;
import X.C20v;
import X.C23Y;
import X.C27J;
import X.C27K;
import X.C27X;
import X.C2A6;
import X.C2A7;
import X.C2A8;
import X.C2AK;
import X.C2AV;
import X.C2L8;
import X.C41991uq;
import X.C44441z5;
import X.C49182Ix;
import X.C55702m3;
import X.C650235p;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S1200100_I0 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableEBaseShape0S1200100_I0(Object obj, String str, long j, Object obj2, int i) {
        this.A04 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = j;
        this.A02 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set keySet;
        int i;
        UserJid userJid;
        switch (this.A04) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                String str = this.A03;
                long j = this.A00;
                C55702m3 c55702m3 = (C55702m3) this.A02;
                restoreFromBackupActivity.A0h.block();
                restoreFromBackupActivity.A1g(24, null);
                C000200d.A0i(((ActivityC02290Ap) restoreFromBackupActivity).A0F, "gdrive_account_name", str);
                if (j > 0) {
                    ((ActivityC02290Ap) restoreFromBackupActivity).A0F.A0W(str, j);
                }
                if (!(c55702m3 instanceof AnonymousClass324)) {
                    keySet = Collections.emptySet();
                } else {
                    AnonymousClass324 anonymousClass324 = (AnonymousClass324) c55702m3;
                    synchronized (anonymousClass324) {
                        Map map = anonymousClass324.A00;
                        keySet = map != null ? map.keySet() : Collections.emptySet();
                    }
                }
                if (!keySet.isEmpty()) {
                    Log.i("gdrive-activity/create-media-placeholders/before message restore");
                    if (!keySet.isEmpty()) {
                        restoreFromBackupActivity.A0b.AS1(new RunnableEBaseShape0S0200000_I0_0(restoreFromBackupActivity, keySet, 2));
                    }
                }
                restoreFromBackupActivity.A1d();
                return;
            case 1:
                C49182Ix c49182Ix = (C49182Ix) this.A01;
                String str2 = this.A03;
                C2L8 c2l8 = (C2L8) this.A02;
                long j2 = this.A00;
                if (c49182Ix.A05.A04()) {
                    Log.i("CompanionDeviceQrHandler/handleSyncdDirty clean syncD before companion dereg");
                    c49182Ix.A06.A00(new C650235p(c49182Ix, c49182Ix.A08.A05(), str2));
                    C44441z5 c44441z5 = c49182Ix.A05;
                    if (c44441z5.A05()) {
                        return;
                    }
                    c44441z5.A05.A05(0);
                    c44441z5.A01();
                    return;
                }
                c49182Ix.A03.A06();
                c49182Ix.A00(c2l8, j2, false);
                return;
            case 2:
                ((C23Y) this.A01).A02((AbstractC005302j) this.A02, this.A03, Long.valueOf(this.A00));
                return;
            case 3:
                C2AK c2ak = (C2AK) this.A01;
                String str3 = this.A03;
                Jid jid = (Jid) this.A02;
                long j3 = this.A00;
                if (!c2ak.A0z.A0K(str3)) {
                    c2ak.A04(jid, str3, 400, j3);
                    return;
                }
                c2ak.A0s.A08(str3, j3, jid);
                C41991uq c41991uq = c2ak.A1N;
                c41991uq.A08();
                c41991uq.A09();
                return;
            case 4:
                C2AK c2ak2 = (C2AK) this.A01;
                String str4 = this.A03;
                long j4 = this.A00;
                Jid jid2 = (Jid) this.A02;
                ArrayList arrayList = new ArrayList();
                C01B c01b = c2ak2.A06;
                if (c01b.A0E(C01C.A0j)) {
                    AbstractC000600i abstractC000600i = c2ak2.A00;
                    C000500h c000500h = c2ak2.A0J;
                    arrayList.add(new C27J(abstractC000600i, c01b, c000500h.A00.getBoolean("archive_v2_enabled", false), c000500h.A0l()));
                }
                c2ak2.A0y.A02(str4, arrayList, 47);
                c2ak2.A0s.A08(str4, j4, jid2);
                return;
            case 5:
                C2AK c2ak3 = (C2AK) this.A01;
                String str5 = this.A03;
                c2ak3.A0w.A04(str5);
                c2ak3.A0s.A08(str5, this.A00, (Jid) this.A02);
                return;
            case 6:
                C2AK c2ak4 = (C2AK) this.A01;
                String str6 = this.A03;
                long j5 = this.A00;
                Jid jid3 = (Jid) this.A02;
                C2A7 A02 = c2ak4.A1H.A02();
                ArrayList arrayList2 = new ArrayList();
                if (A02 != null) {
                    int i2 = A02.A00;
                    if (!C2A8.A01(i2, c2ak4.A0h)) {
                        AnonymousClass012 anonymousClass012 = c2ak4.A0G;
                        C2A6 c2a6 = c2ak4.A1I;
                        AnonymousClass072 anonymousClass072 = c2ak4.A0I;
                        long A05 = anonymousClass012.A05();
                        long j6 = c2a6.A02().getLong("current_user_notice_banner_dismiss_timestamp", 0L);
                        if (anonymousClass072 != null) {
                            if (!(A05 < j6 + 86400000) && ((i = A02.A01) == 2 || i == 4)) {
                                arrayList2.add(new C27K(c2ak4.A00, c2ak4.A06, i2, i == 4, A02.A02));
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                c2ak4.A0y.A02(str6, arrayList2, 46);
                c2ak4.A0s.A08(str6, j5, jid3);
                return;
            case 7:
                C2AK c2ak5 = (C2AK) this.A01;
                String str7 = this.A03;
                c2ak5.A0z.A0F(str7, 501);
                c2ak5.A0s.A08(str7, this.A00, (Jid) this.A02);
                return;
            case 8:
                C2AK c2ak6 = (C2AK) this.A01;
                String str8 = this.A03;
                c2ak6.A0z.A0F(str8, 501);
                c2ak6.A0s.A08(str8, this.A00, (Jid) this.A02);
                return;
            case 9:
                C2AK c2ak7 = (C2AK) this.A01;
                String str9 = this.A03;
                c2ak7.A0z.A0F(str9, 501);
                c2ak7.A0s.A08(str9, this.A00, (Jid) this.A02);
                return;
            case 10:
                C2AV c2av = (C2AV) this.A01;
                String str10 = this.A03;
                long j7 = this.A00;
                Jid jid4 = (Jid) this.A02;
                List<C0Hr> A08 = c2av.A07.A08();
                String A022 = C0EB.A02(A08);
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet(A08.size());
                for (C0Hr c0Hr : A08) {
                    if (c0Hr != null) {
                        UserJid userJid2 = c0Hr.A0A;
                        if (!C011405q.A03(userJid2)) {
                            hashSet.add(userJid2);
                        }
                    }
                }
                for (C0Hr c0Hr2 : A08) {
                    if (c0Hr2 != null) {
                        AbstractC000600i abstractC000600i2 = c2av.A00;
                        C01B c01b2 = c2av.A02;
                        UserJid userJid3 = c0Hr2.A0A;
                        if (C011405q.A03(userJid3)) {
                            C02L c02l = c2av.A01;
                            c02l.A05();
                            C0K1 c0k1 = c02l.A01;
                            if (c0k1 != null) {
                                userJid = (UserJid) c0k1.A09;
                                if (userJid == null) {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            userJid = userJid3;
                        }
                        C27X c27x = new C27X(abstractC000600i2, c01b2, userJid);
                        List<AnonymousClass092> A023 = c2av.A06.A02(userJid3);
                        if (A023.size() > 0) {
                            c27x.A02 = ((AnonymousClass092) A023.get(A023.size() - 1)).A15();
                            c27x.A0K = new ArrayList();
                            for (AnonymousClass092 anonymousClass092 : A023) {
                                c2av.A0G.A01(anonymousClass092);
                                C20v A024 = c2av.A0D.A02(anonymousClass092, null, false, false);
                                if (A024 != null) {
                                    c27x.A0K.add(A024);
                                }
                            }
                            c27x.A01 = c0Hr2.A01;
                            c27x.A00 = c0Hr2.A00;
                            c27x.A08 = c0Hr2.A07 / 1000;
                            arrayList3.add(c27x);
                        }
                    }
                }
                c2av.A0E.A03(str10, arrayList3, 27, false, A022);
                c2av.A09.A08(str10, j7, jid4);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                AnonymousClass220 anonymousClass220 = (AnonymousClass220) this.A01;
                long j8 = this.A00;
                final UserJid userJid4 = (UserJid) this.A02;
                String str11 = this.A03;
                C05140Nm A04 = anonymousClass220.A0E.A04(j8);
                if (A04 != null) {
                    A04.A00(3);
                }
                final C05W c05w = anonymousClass220.A05;
                c05w.A05.A0R(userJid4, 0L, null);
                c05w.A03.A01.remove(userJid4);
                c05w.A00.post(new Runnable() { // from class: X.1NE
                    @Override // java.lang.Runnable
                    public final void run() {
                        C05W c05w2 = c05w;
                        c05w2.A06.A06(userJid4);
                    }
                });
                anonymousClass220.A0C.A09(str11, j8, userJid4, null, "status");
                return;
            default:
                return;
        }
    }
}
