package java.lang;

import X.AnonymousClass088;
import X.AnonymousClass092;
import X.AnonymousClass097;
import X.C000200d;
import X.C002301c;
import X.C018508q;
import X.C01C;
import X.C02160Ac;
import X.C09H;
import X.C0CD;
import X.C0HC;
import X.C0HD;
import X.C0L6;
import X.C0TS;
import X.C1u5;
import X.C25L;
import X.C29X;
import X.C2Il;
import X.C2L7;
import X.C2UX;
import X.C40411sD;
import X.C41701uN;
import X.C43871y8;
import X.C48902Hi;
import X.C49182Ix;
import X.C52662b7;
import X.C53782hV;
import X.C53922hj;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Hilt_VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0101000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape0S0101000_I0(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A04;
        C0CD A03;
        AnonymousClass097 anonymousClass097;
        C09H c09h;
        switch (this.A02) {
            case 0:
                ((SettingsGoogleDrive) this.A01).A0M.A0A(this.A00);
                return;
            case 1:
                int i = this.A00;
                C000200d.A0r("cameraui/error ", i);
                C29X c29x = ((C2Il) this.A01).A01;
                if (c29x.A1M.A04()) {
                    c29x.A0s.A07(R.string.error_camera_disabled_during_video_call, 1);
                    c29x.A02();
                    return;
                }
                if (i != 2) {
                    if (C02160Ac.A01(c29x.A0L, "android.permission.CAMERA") != 0) {
                        Log.w("cameraui/no-camera-permission");
                        c29x.A0s.A07(R.string.cannot_start_camera_no_permission, 1);
                    } else if (C0L6.A01()) {
                        c29x.A0s.A07(R.string.error_video_messages_disabled_during_call, 1);
                    } else if (i == 3) {
                        c29x.A0s.A07(R.string.photo_capture_failed, 1);
                    } else {
                        C018508q c018508q = c29x.A0s;
                        if (i == 4) {
                            c018508q.A07(R.string.video_capture_failed, 1);
                        } else {
                            c018508q.A07(R.string.cannot_start_camera, 1);
                        }
                    }
                }
                c29x.A02();
                return;
            case 2:
                int i2 = this.A00;
                C49182Ix c49182Ix = ((C2L7) this.A01).A05.A00;
                c49182Ix.A00 = null;
                c49182Ix.A0E.A04(i2);
                return;
            case 3:
                C43871y8 c43871y8 = (C43871y8) this.A01;
                int i3 = this.A00;
                c43871y8.A0K();
                c43871y8.A07(i3, 0);
                return;
            case 4:
                ((C48902Hi) this.A01).A01.A00(this.A00);
                return;
            case 5:
                C2UX c2ux = (C2UX) this.A01;
                int i4 = this.A00;
                if (i4 == 403) {
                    c2ux.A00.A07(R.string.group_error_description_not_allowed, 0);
                    return;
                } else if (i4 == 406) {
                    int A07 = c2ux.A01.A07(C01C.A35);
                    c2ux.A00.A0E(c2ux.A02.A0A(R.plurals.description_reach_limit, A07, Integer.valueOf(A07)), 0);
                    c2ux.A05.A0T(false);
                    return;
                } else if (i4 != 409) {
                    c2ux.A00.A07(R.string.group_error_description, 0);
                    return;
                } else {
                    c2ux.A05.A0D(c2ux.A04);
                    return;
                }
            case 6:
                C000200d.A0p("LinkPreviewViewModel/CTWAListener/errorCode/", this.A00);
                return;
            case 7:
                C1u5 c1u5 = (C1u5) this.A01;
                int i5 = this.A00;
                C41701uN c41701uN = c1u5.A0v;
                if (c41701uN.A07.compareAndSet(false, true)) {
                    A03 = c41701uN.A03.A01.A03();
                    try {
                        Cursor A072 = A03.A02.A07("SELECT message_row_id FROM mms_thumbnail_metadata WHERE transferred = 0 AND direct_path IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL  ORDER BY message_row_id DESC  LIMIT ? ", new String[]{String.valueOf(100)});
                        LinkedList linkedList = new LinkedList();
                        while (A072.moveToNext()) {
                            linkedList.add(Long.valueOf(A072.getLong(0)));
                        }
                        A072.close();
                        A03.close();
                        linkedList.size();
                        c41701uN.A02(linkedList, new Random());
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                if (i5 != 0) {
                    C40411sD c40411sD = c1u5.A0Y;
                    C0HC c0hc = new C0HC();
                    c0hc.A02 = "msgstore/getRetryAutodownloadMessages";
                    c0hc.A03 = true;
                    c0hc.A03();
                    ArrayList<AnonymousClass097> arrayList = new ArrayList();
                    long A05 = c40411sD.A0D.A05(c1u5.A0L.A05() - 86400000);
                    try {
                        A03 = c40411sD.A0C.A03();
                    } catch (SQLiteDatabaseCorruptException e) {
                        Log.e(e);
                        c40411sD.A0B.A03();
                    } catch (SQLiteDiskIOException e2) {
                        c40411sD.A0A.A00(1);
                        throw e2;
                    } catch (IllegalStateException e3) {
                        Log.i("msgstore/getRetryAutodownloadMessages/IllegalStateException ", e3);
                    }
                    try {
                        Cursor A073 = A03.A02.A07(C0HD.A0q, new String[]{Long.toString(A05)});
                        if (A073 != null) {
                            while (A073.moveToNext()) {
                                AnonymousClass092 A02 = c40411sD.A05.A02(A073);
                                if ((A02 instanceof AnonymousClass097) && (c09h = (anonymousClass097 = (AnonymousClass097) A02).A02) != null && !c09h.A0P && !c09h.A0a && c09h.A0L) {
                                    arrayList.add(anonymousClass097);
                                }
                                if (arrayList.size() >= 32) {
                                    A073.close();
                                }
                            }
                            A073.close();
                        }
                        A03.close();
                        StringBuilder A0P = C000200d.A0P("msgstore/getRetryAutodownloadMessages ");
                        A0P.append(arrayList.size());
                        A0P.append(" | time spent:");
                        A0P.append(c0hc.A01());
                        Log.i(A0P.toString());
                        int A032 = c1u5.A0K.A03(true);
                        for (AnonymousClass097 anonymousClass0972 : arrayList) {
                            c1u5.A0u.A04(anonymousClass0972, true, A032);
                        }
                        return;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                return;
            case 8:
                BusinessActivityReportViewModel businessActivityReportViewModel = ((C53782hV) this.A01).A00.A00;
                if (businessActivityReportViewModel.A05.A01() == 1) {
                    BusinessActivityReportViewModel.A00(businessActivityReportViewModel);
                    return;
                }
                return;
            case 9:
                ((C53922hj) this.A01).A00.A00();
                return;
            case 10:
                TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A01;
                tokenizedSearchInput.A0O.setVisibility(this.A00);
                tokenizedSearchInput.A02();
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C52662b7 c52662b7 = (C52662b7) this.A01;
                int i6 = this.A00;
                AnonymousClass088.A1C(c52662b7.A05.getContext(), c52662b7.A06, c52662b7.A07.A0A(R.plurals.text_limit_characters_remaining_description, i6, Integer.valueOf(i6)));
                return;
            case 12:
                C25L c25l = (C25L) this.A01;
                int i7 = this.A00;
                CallInfo callInfo = Voip.getCallInfo();
                if (callInfo != null) {
                    C000200d.A1F(C000200d.A0P("voip/service/signal_thread/end_call/"), c25l.A2G);
                    if (i7 == 1) {
                        Integer num = c25l.A0e;
                        if (num != null) {
                            long longValue = num.longValue();
                            if (longValue <= 10000 && callInfo.isCaller && callInfo.callState == Voip.CallState.ACTIVE && callInfo.callDuration <= longValue && SystemClock.elapsedRealtime() - c25l.A08 >= 8000) {
                                c25l.A0h = 1;
                                C002301c c002301c = c25l.A1b;
                                Object[] objArr = new Object[1];
                                UserJid peerJid = Voip.getPeerJid();
                                if (peerJid == null) {
                                    Log.w("voip/getPeerDisplayNameShort/peer_jid_is_null call must have been finished");
                                    A04 = null;
                                } else {
                                    A04 = c25l.A1U.A04(c25l.A1T.A0A(peerJid));
                                }
                                objArr[0] = A04;
                                String A0D = c002301c.A0D(R.string.voip_call_end_call_confirmation, objArr);
                                Context context = c25l.A1F;
                                Intent A022 = VoipActivityV2.A02(context, null, Boolean.valueOf(!c25l.A1H.A00), null, Boolean.TRUE, null);
                                A022.setAction(VoipActivityV2.A1q);
                                A022.putExtra("confirmationString", A0D);
                                context.startActivity(A022);
                                return;
                            }
                        }
                    } else if (i7 == 2) {
                        c25l.A0f = c25l.A0h;
                    }
                    Voip.endCall(true);
                    return;
                }
                return;
            case 13:
                VoipCallControlBottomSheet voipCallControlBottomSheet = (VoipCallControlBottomSheet) this.A01;
                C0TS A0C = voipCallControlBottomSheet.A0D.A0C(this.A00);
                if (A0C != null) {
                    int dimensionPixelOffset = ((Hilt_VoipCallControlBottomSheet) voipCallControlBottomSheet).A00.getResources().getDimensionPixelOffset(R.dimen.call_control_participant_list_scrolling_bottom_offset);
                    View view = A0C.A0H;
                    voipCallControlBottomSheet.A0C.requestChildRectangleOnScreen(view, new Rect(0, 0, view.getWidth(), view.getHeight() + dimensionPixelOffset), false);
                    view.setBackground(new ColorDrawable(voipCallControlBottomSheet.A07));
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view.getBackground(), PropertyValuesHolder.ofInt("alpha", 255, 0));
                    ofPropertyValuesHolder.setTarget(view.getBackground());
                    ofPropertyValuesHolder.setDuration(3000L);
                    ofPropertyValuesHolder.start();
                    BottomSheetBehavior bottomSheetBehavior = voipCallControlBottomSheet.A0E;
                    if (bottomSheetBehavior == null || bottomSheetBehavior.A0B == 3) {
                        return;
                    }
                    bottomSheetBehavior.A0O(3);
                    voipCallControlBottomSheet.A0W = true;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
