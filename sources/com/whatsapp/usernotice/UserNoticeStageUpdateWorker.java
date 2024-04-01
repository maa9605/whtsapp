package com.whatsapp.usernotice;

import X.C000200d;
import X.C02180Ae;
import X.C02590Ca;
import X.C04P;
import X.C05Y;
import X.C0C5;
import X.C0OF;
import X.C12090iq;
import X.C1VE;
import X.C28551Sn;
import X.C41941ul;
import X.C41951um;
import X.C72233Ze;
import X.InterfaceC010405f;
import X.InterfaceFutureC09630eS;
import android.content.Context;
import android.util.Pair;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.whatsapp.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class UserNoticeStageUpdateWorker extends ListenableWorker {
    public final C05Y A00;
    public final C41941ul A01;
    public final C41951um A02;

    public UserNoticeStageUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A00 = c0c5.A1H();
        this.A01 = c0c5.A1j();
        this.A02 = c0c5.A1k();
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC09630eS A00() {
        Object c1ve;
        final C12090iq c12090iq = new C12090iq();
        C28551Sn c28551Sn = new C28551Sn(c12090iq);
        c12090iq.A00 = c28551Sn;
        c12090iq.A02 = C72233Ze.class;
        try {
            C0OF c0of = super.A01.A01;
            final int A02 = c0of.A02("notice_id");
            final int A022 = c0of.A02("stage");
            final int A023 = c0of.A02("version");
            if (A02 != -1 && A022 != -1 && A023 != -1) {
                C000200d.A0t("UserNoticeStageUpdateWorker/startWork/noticeId: ", A02, " stage: ", A022);
                C05Y c05y = this.A00;
                String A024 = c05y.A02();
                c05y.A0B(254, A024, new C02590Ca("iq", new C04P[]{new C04P("to", "s.whatsapp.net", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("xmlns", "tos", null, (byte) 0), new C04P("id", A024, null, (byte) 0)}, new C02590Ca("notice", new C04P[]{new C04P("id", Integer.toString(A02), null, (byte) 0), new C04P("stage", Integer.toString(A022), null, (byte) 0)}, null, null)), new InterfaceC010405f() { // from class: X.3sN
                    @Override // X.InterfaceC010405f
                    public void AJI(String str) {
                        Log.e("UserNoticeStageUpdateWorker/onDeliveryFailure");
                        if (((ListenableWorker) UserNoticeStageUpdateWorker.this).A01.A00 > 4) {
                            c12090iq.A00(new C1VE());
                        } else {
                            c12090iq.A00(new C09640eT());
                        }
                    }

                    @Override // X.InterfaceC010405f
                    public void AJx(String str, C02590Ca c02590Ca) {
                        Pair A09 = C40731sm.A09(c02590Ca);
                        StringBuilder sb = new StringBuilder("UserNoticeStageUpdateWorker/onError ");
                        sb.append(A09);
                        Log.e(sb.toString());
                        if (A09 != null && ((Number) A09.first).intValue() == 400) {
                            UserNoticeStageUpdateWorker.this.A01.A02(1);
                        }
                        if (((ListenableWorker) UserNoticeStageUpdateWorker.this).A01.A00 > 4) {
                            c12090iq.A00(new C1VE());
                        } else {
                            c12090iq.A00(new C09640eT());
                        }
                    }

                    @Override // X.InterfaceC010405f
                    public void APJ(String str, C02590Ca c02590Ca) {
                        Log.i("UserNoticeStageUpdateWorker/success");
                        C02590Ca A0D = c02590Ca.A0D("notice");
                        if (A0D != null) {
                            C41951um c41951um = UserNoticeStageUpdateWorker.this.A02;
                            int i = A02;
                            int i2 = A023;
                            if (c41951um != null) {
                                StringBuilder sb = new StringBuilder("UserNoticeManager/handleStaleClientStage/notice id: ");
                                sb.append(i);
                                Log.i(sb.toString());
                                c41951um.A08.A05(new C2A7(i, A0D.A04("stage"), A0D.A06("t") * 1000, i2));
                            } else {
                                throw null;
                            }
                        }
                        if (A022 == 5) {
                            C41951um c41951um2 = UserNoticeStageUpdateWorker.this.A02;
                            int i3 = A02;
                            if (c41951um2 != null) {
                                StringBuilder sb2 = new StringBuilder("UserNoticeManager/handleCleanup/notice id: ");
                                sb2.append(i3);
                                Log.i(sb2.toString());
                                StringBuilder sb3 = new StringBuilder("UserNoticeManager/deleteUserNotice/notice id: ");
                                sb3.append(i3);
                                Log.i(sb3.toString());
                                c41951um2.A07.A04(i3);
                                C2A6 c2a6 = c41951um2.A08;
                                TreeMap treeMap = c2a6.A02;
                                treeMap.remove(Integer.valueOf(i3));
                                C2A7 A03 = c2a6.A03();
                                if (A03 != null && A03.A00 == i3) {
                                    c2a6.A01().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_banner_dismiss_timestamp").apply();
                                }
                                c2a6.A06(new ArrayList(treeMap.values()));
                                c41951um2.A06();
                            } else {
                                throw null;
                            }
                        }
                        c12090iq.A00(new C1VF());
                    }
                }, 32000L);
                c1ve = "Send Stage Update";
            } else {
                c1ve = new C1VE();
            }
            c12090iq.A02 = c1ve;
            return c28551Sn;
        } catch (Exception e) {
            c28551Sn.A00.A06(e);
            return c28551Sn;
        }
    }
}
