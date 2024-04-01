package X;

import com.whatsapp.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1um */
/* loaded from: classes2.dex */
public class C41951um {
    public static volatile C41951um A0A;
    public final AbstractC000600i A00;
    public final C01B A01;
    public final AnonymousClass012 A02;
    public final AnonymousClass072 A03;
    public final C003701t A04;
    public final C41521u3 A05;
    public final C05G A06;
    public final C41921uj A07;
    public final C2A6 A08;
    public final C2A9 A09;

    public C41951um(AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, C01B c01b, C41521u3 c41521u3, C2A9 c2a9, C05G c05g, C41921uj c41921uj, C2A6 c2a6, AnonymousClass072 anonymousClass072) {
        this.A02 = anonymousClass012;
        this.A04 = c003701t;
        this.A00 = abstractC000600i;
        this.A01 = c01b;
        this.A09 = c2a9;
        this.A05 = c41521u3;
        this.A06 = c05g;
        this.A07 = c41921uj;
        this.A08 = c2a6;
        this.A03 = anonymousClass072;
    }

    public static C41951um A00() {
        if (A0A == null) {
            synchronized (C41951um.class) {
                if (A0A == null) {
                    A0A = new C41951um(AnonymousClass012.A00(), C003701t.A00(), AbstractC000600i.A00(), C01B.A00(), C41521u3.A00(), C2A9.A01(), C05G.A00(), C41921uj.A00(), C2A6.A00(), AnonymousClass072.A00());
                }
            }
        }
        return A0A;
    }

    public C40791ss A01() {
        C2A6 c2a6;
        C2A7 A03;
        if (!(this.A01.A0E(C01C.A2T)) || (A03 = (c2a6 = this.A08).A03()) == null || A03.A01 != 2) {
            return null;
        }
        int i = A03.A00;
        C003701t c003701t = this.A04;
        if (C2A8.A01(i, c003701t)) {
            C000200d.A1F(C000200d.A0P("UserNoticeManager/getBanner/green alert disabled, notice: "), i);
            return null;
        }
        C40781sr A032 = this.A07.A03(A03);
        if (A032 == null) {
            return null;
        }
        C40791ss c40791ss = A032.A02;
        if (c40791ss == null) {
            Log.e("UserNoticeManager/getBanner/no content for stage 2");
            this.A00.A09("UserNoticeManager/getBanner/noContent", null, true);
            return null;
        }
        if (C2A8.A02(c003701t, A03)) {
            AnonymousClass012 anonymousClass012 = this.A02;
            AnonymousClass072 anonymousClass072 = this.A03;
            long A05 = anonymousClass012.A05();
            long j = c2a6.A02().getLong("current_user_notice_banner_dismiss_timestamp", 0L);
            if (anonymousClass072 != null) {
                if (A05 < j + 86400000) {
                    Log.i("UserNoticeManager/getBanner/dismissed banner not shown as per timing");
                    A07();
                    return null;
                }
                Log.i("UserNoticeManager/getBanner/eligible to show dismissible banner");
                c2a6.A01().putLong("current_user_notice_banner_dismiss_timestamp", 0L).apply();
            } else {
                throw null;
            }
        }
        C40891t2 c40891t2 = c40791ss.A00;
        if (!A0C(c40891t2)) {
            Log.i("UserNoticeManager/getBanner/banner not shown as per timing");
            return null;
        }
        A09(c40891t2, C2A8.A02(c003701t, A03));
        Log.i("UserNoticeManager/getBanner/banner shown");
        return c40791ss;
    }

    public C2A7 A02() {
        return this.A08.A03();
    }

    public void A03() {
        C2A7 A03 = this.A08.A03();
        if (A03 == null) {
            Log.e("UserNoticeManager/agreeUserNotice/no current notice to agree");
            this.A00.A09("UserNoticeManager/agreeUserNotice/noContent", null, true);
            return;
        }
        Log.i("UserNoticeManager/agreeUserNotice");
        A0A(A03, 5);
    }

    public void A04() {
        Log.i("UserNoticeManager/deleteAllUserNoticesWithoutCleanup");
        C41921uj c41921uj = this.A07;
        if (c41921uj != null) {
            Log.i("UserNoticeContentManager/deleteAllUserNoticeData");
            File A02 = C41921uj.A02(c41921uj.A02.A00.getFilesDir(), "user_notice");
            if (A02 != null) {
                c41921uj.A07.AS1(new RunnableEBaseShape7S0100000_I0_7(A02, 22));
            }
            c41921uj.A00 = null;
            C2A6 c2a6 = this.A08;
            c2a6.A01().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_banner_dismiss_timestamp").remove("user_notices").apply();
            c2a6.A02.clear();
            return;
        }
        throw null;
    }

    public void A05() {
        A07();
        C2A6 c2a6 = this.A08;
        c2a6.A01().putLong("current_user_notice_banner_dismiss_timestamp", this.A02.A05()).apply();
    }

    public final void A06() {
        Log.i("UserNoticeManager/cleanupAfterDelete");
        A07();
        ((C0OD) this.A09.get()).A01("tag.whatsapp.usernotice.stageupdate");
        C41921uj c41921uj = this.A07;
        if (c41921uj != null) {
            Log.i("UserNoticeContentManager/cancelWork");
            C2A9 c2a9 = c41921uj.A08;
            ((C0OD) c2a9.get()).A01("tag.whatsapp.usernotice.content.fetch");
            ((C0OD) c2a9.get()).A01("tag.whatsapp.usernotice.icon.fetch");
            return;
        }
        throw null;
    }

    public final void A07() {
        Log.i("UserNoticeManager/sendWebClientEmptyUpdate");
        this.A05.A03(-1, false, -1);
    }

    public final void A08(int i, int i2, int i3) {
        if (i2 <= 1) {
            C000200d.A0q("UserNoticeManager/updateWebClient/no update sent, stage: ", i2);
        } else if (i2 != 3 && i2 != 5 && !C2A8.A01(i, this.A04)) {
            boolean z = i2 == 4;
            StringBuilder sb = new StringBuilder("UserNoticeManager/updateWebClient/noticeId: ");
            sb.append(i);
            sb.append(" blocking: ");
            sb.append(z);
            sb.append(" version:");
            C000200d.A1F(sb, i3);
            this.A05.A03(i, z, i3);
        } else {
            A07();
        }
    }

    public final void A09(C40891t2 c40891t2, boolean z) {
        C40911t4 c40911t4 = c40891t2.A00;
        if (c40911t4 != null && c40911t4.A01 != null) {
            Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/set repeat values");
            int i = z ? 1 : 1 + this.A08.A02().getInt("current_user_notice_duration_repeat_index", 0);
            C2A6 c2a6 = this.A08;
            c2a6.A01().putInt("current_user_notice_duration_repeat_index", i).apply();
            c2a6.A01().putLong("current_user_notice_duration_repeat_timestamp", this.A02.A05()).apply();
            return;
        }
        Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/no repeat duration");
    }

    public final void A0A(C2A7 c2a7, int i) {
        int i2 = c2a7.A00;
        C000200d.A0t("UserNoticeManager/updateUserNoticeStage/updating to new stage: ", i, " noticeId: ", i2);
        C2A6 c2a6 = this.A08;
        long A05 = this.A02.A05();
        int i3 = c2a7.A02;
        c2a6.A05(new C2A7(i2, i, A05, i3));
        A08(i2, i, i3);
        c2a6.A01().remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_duration_static_timestamp_start").apply();
        StringBuilder A0R = C000200d.A0R("UserNoticeManager/enqueueStageUpdateWork/notice id: ", i2, " stage: ", i, " version: ");
        A0R.append(i3);
        Log.i(A0R.toString());
        HashMap hashMap = new HashMap();
        hashMap.put("notice_id", Integer.valueOf(i2));
        hashMap.put("stage", Integer.valueOf(i));
        hashMap.put("version", Integer.valueOf(i3));
        C0OF c0of = new C0OF(hashMap);
        C0OF.A01(c0of);
        C0OG c0og = new C0OG();
        c0og.A03 = C07j.CONNECTED;
        C0OH c0oh = new C0OH(c0og);
        C0OJ c0oj = new C0OJ(UserNoticeStageUpdateWorker.class);
        c0oj.A01.add("tag.whatsapp.usernotice.stageupdate");
        c0oj.A00.A09 = c0oh;
        c0oj.A03(EnumC015507g.EXPONENTIAL, 1L, TimeUnit.HOURS);
        c0oj.A00.A0A = c0of;
        String A0F = C000200d.A0F("tag.whatsapp.usernotice.stageupdate.", i2, ".", i);
        ((C0OD) this.A09.get()).A00(A0F, C0OO.REPLACE, (C0ON) c0oj.A00());
    }

    public final void A0B(C2A7 c2a7, C40781sr c40781sr) {
        C40901t3 c40901t3;
        C40901t3 c40901t32;
        C40901t3 c40901t33;
        int i = c2a7.A01;
        StringBuilder A0P = C000200d.A0P("UserNoticeManager/transitionUserNoticeStageIfNecessary/noticeId: ");
        A0P.append(c2a7.A00);
        A0P.append(" currentStage: ");
        A0P.append(i);
        Log.i(A0P.toString());
        if (i == 0) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 0, no timing transition needed");
            A0A(c2a7, 1);
        } else if (i == 5) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 5, no timing transition needed");
        } else if (c40781sr == null) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/no content");
        } else {
            long A05 = this.A02.A05();
            ArrayList arrayList = new ArrayList();
            C40891t2 A0Z = C02180Ae.A0Z(i, c40781sr);
            if (A0Z != null && (c40901t33 = A0Z.A01) != null) {
                arrayList.add(new C2AB(i, 1, c40901t33.A00));
            }
            int A02 = C02180Ae.A02(i, c40781sr);
            while (A02 < 5) {
                C40891t2 A0Z2 = C02180Ae.A0Z(A02, c40781sr);
                if (A0Z2 != null && (c40901t32 = A0Z2.A02) != null) {
                    arrayList.add(new C2AB(A02, 0, c40901t32.A00));
                }
                C40891t2 A0Z3 = C02180Ae.A0Z(A02, c40781sr);
                if (A0Z3 != null && (c40901t3 = A0Z3.A01) != null) {
                    arrayList.add(new C2AB(A02, 1, c40901t3.A00));
                }
                A02++;
            }
            C2AB c2ab = null;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2AB c2ab2 = (C2AB) it.next();
                if (c2ab2.A02 > A05) {
                    break;
                }
                c2ab = c2ab2;
            }
            if (c2ab != null) {
                if (c2ab.A01 == 0) {
                    StringBuilder A0P2 = C000200d.A0P("UserNoticeManager/handleEligibleFutureStartEndTiming/passed start timing: ");
                    A0P2.append(c2ab.A02);
                    A0P2.append(" of stage:");
                    int i2 = c2ab.A00;
                    C000200d.A1F(A0P2, i2);
                    A0A(c2a7, i2);
                    return;
                }
                StringBuilder A0P3 = C000200d.A0P("UserNoticeManager/handleEligibleFutureStartEndTiming/passed end timing: ");
                A0P3.append(c2ab.A02);
                A0P3.append(" of stage: ");
                int i3 = c2ab.A00;
                C000200d.A1F(A0P3, i3);
                A0A(c2a7, C02180Ae.A02(i3, c40781sr));
                return;
            }
            C40891t2 A0Z4 = C02180Ae.A0Z(i, c40781sr);
            C40891t2 A0Z5 = C02180Ae.A0Z(A02, c40781sr);
            if (A0Z5 != null && A0Z5.A02 != null) {
                Log.i("UserNoticeManager/handleNextStageStartTime/next stage start time exists");
            } else if (A0Z4 != null) {
                if (A0Z4.A01 != null) {
                    Log.i("UserNoticeManager/handleCurrentStageEndTiming/current stage end time exists");
                    return;
                }
                C40911t4 c40911t4 = A0Z4.A00;
                if (c40911t4 != null) {
                    Log.i("UserNoticeManager/handleCurrentStageDuration/current stage duration exists");
                    long j = c40911t4.A00;
                    if (j != -1) {
                        long j2 = c2a7.A03;
                        Log.i("UserNoticeManager/handleCurrentStageStaticDuration/static duration exists");
                        if (A05 >= j2 + j) {
                            Log.i("UserNoticeManager/handleCurrentStageStaticDuration/current stage static duration expired");
                            A0A(c2a7, A02);
                            return;
                        }
                        return;
                    }
                    long[] jArr = c40911t4.A01;
                    if (jArr == null) {
                        return;
                    }
                    Log.i("UserNoticeManager/handleCurrentStageRepeatDuration/repeat duration exists");
                    if (this.A08.A02().getInt("current_user_notice_duration_repeat_index", 0) <= jArr.length) {
                        return;
                    }
                    Log.i("UserNoticeManager/handleCurrentStageRepeatDuration/current stage repeat duration complete");
                    A0A(c2a7, A02);
                }
            }
        }
    }

    public final boolean A0C(C40891t2 c40891t2) {
        C40911t4 c40911t4 = c40891t2.A00;
        if (c40911t4 == null) {
            Log.i("UserNoticeManager/shouldShowStage/no duration");
            return true;
        }
        long A05 = this.A02.A05();
        long j = c40911t4.A00;
        if (j != -1) {
            Log.i("UserNoticeManager/shouldShowStageForStaticDuration/has static duration");
            C2A6 c2a6 = this.A08;
            long j2 = c2a6.A02().getLong("current_user_notice_duration_static_timestamp_start", 0L);
            if (j2 == 0) {
                C000200d.A0u("UserNoticeManager/shouldShowStageForStaticDuration/static duration start: ", A05);
                c2a6.A01().putLong("current_user_notice_duration_static_timestamp_start", A05).apply();
                j2 = A05;
            }
            if (A05 >= j2 + j) {
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration expired");
                return false;
            }
            Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration valid");
            return true;
        }
        long[] jArr = c40911t4.A01;
        if (jArr == null) {
            Log.i("UserNoticeManager/shouldShowStage/no repeat duration");
            return true;
        }
        C2A6 c2a62 = this.A08;
        int i = c2a62.A02().getInt("current_user_notice_duration_repeat_index", 0);
        if (i == 0) {
            Log.i("UserNoticeManager/shouldShowStage/allow first repeat");
            return true;
        } else if (i > jArr.length) {
            Log.i("UserNoticeManager/shouldShowStage/no more repeats");
            return false;
        } else {
            boolean z = A05 - c2a62.A02().getLong("current_user_notice_duration_repeat_timestamp", 0L) >= jArr[i - 1];
            C000200d.A1C("UserNoticeManager/shouldShowStage/repeatTimeElapse: ", z);
            return z;
        }
    }
}
