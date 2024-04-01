package com.whatsapp.util;

import X.AbstractC53222c9;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass029;
import X.AnonymousClass088;
import X.C000200d;
import X.C02180Ae;
import X.C03070Ea;
import X.C06C;
import X.C0D3;
import X.C0EG;
import X.C0HS;
import X.C0LD;
import X.C0MN;
import X.C2AS;
import X.C2CF;
import X.C461325b;
import X.C47522Bo;
import X.C53202c3;
import X.C53242cB;
import X.C53252cC;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.tos.TosUpdateActivity;
import com.whatsapp.twofactor.SetCodeFragment;
import com.whatsapp.twofactor.SetEmailFragment;
import com.whatsapp.twofactor.TwoFactorAuthActivity;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import com.whatsapp.voipcalling.CallLogActivity;
import com.whatsapp.voipcalling.CallRatingActivity;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import com.whatsapp.voipcalling.PermissionDialogFragment;
import com.whatsapp.voipcalling.VoipAppUpdateActivity;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape11S0100000_I0_3 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape11S0100000_I0_3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        Integer num;
        InputMethodManager A0I;
        C0HS c0hs;
        switch (this.A01) {
            case 0:
                ((C461325b) this.A00).A04();
                return;
            case 1:
                C2CF c2cf = (C2CF) this.A00;
                C2AS c2as = c2cf.A06;
                String str = c2cf.A04.A0D;
                C47522Bo c47522Bo = c2as.A0J;
                if (!c47522Bo.A01.containsKey(str) || (c0hs = (C0HS) c47522Bo.A00.get(str)) == null) {
                    return;
                }
                c0hs.A05(true);
                return;
            case 2:
                TosUpdateActivity tosUpdateActivity = (TosUpdateActivity) this.A00;
                tosUpdateActivity.A00 = 1;
                tosUpdateActivity.A1P();
                if (((ActivityC02290Ap) tosUpdateActivity).A0F.A00.getBoolean("tos_v2_page_2_ack", false)) {
                    return;
                }
                C0EG c0eg = tosUpdateActivity.A0C;
                if (c0eg.A02.A06) {
                    Log.i("sendmethods/tosupdate/page-2");
                    c0eg.A07.A09(Message.obtain(null, 0, 171, 0));
                    return;
                }
                return;
            case 3:
                TosUpdateActivity tosUpdateActivity2 = (TosUpdateActivity) this.A00;
                if (tosUpdateActivity2.A01.getVisibility() == 0 && !tosUpdateActivity2.A05.isChecked()) {
                    if (tosUpdateActivity2.A02.getVisibility() != 0) {
                        tosUpdateActivity2.A02.startAnimation(C000200d.A03(0.0f, 1.0f, 120L));
                        tosUpdateActivity2.A02.setVisibility(0);
                    }
                    AnonymousClass088.A1C(tosUpdateActivity2, ((ActivityC02290Ap) tosUpdateActivity2).A0E, tosUpdateActivity2.getString(R.string.tos_age_announce));
                    return;
                }
                C03070Ea c03070Ea = ((ActivityC02270An) tosUpdateActivity2).A0E;
                synchronized (c03070Ea) {
                    Log.i("tosupdate/onTosAccepted");
                    c03070Ea.A02.A0D().putLong("tos_v2_accepted_time", c03070Ea.A01.A05()).apply();
                }
                ((ActivityC02270An) tosUpdateActivity2).A0E.A03();
                tosUpdateActivity2.A0D = true;
                tosUpdateActivity2.finish();
                return;
            case 4:
                TosUpdateActivity tosUpdateActivity3 = (TosUpdateActivity) this.A00;
                C03070Ea c03070Ea2 = ((ActivityC02270An) tosUpdateActivity3).A0E;
                synchronized (c03070Ea2) {
                    Log.i("tosupdate/onTosStageOneDismissed");
                    c03070Ea2.A02.A0D().putLong("tos_v2_last_stage_1_display_time", c03070Ea2.A01.A05()).apply();
                }
                tosUpdateActivity3.A0D = true;
                tosUpdateActivity3.finish();
                return;
            case 5:
                SetCodeFragment.A00((SetCodeFragment) this.A00);
                return;
            case 6:
                SetEmailFragment setEmailFragment = (SetEmailFragment) this.A00;
                if (setEmailFragment != null) {
                    Log.i("setemailfragment/submit");
                    int i = setEmailFragment.A00;
                    if (i == 1) {
                        TwoFactorAuthActivity twoFactorAuthActivity = setEmailFragment.A06;
                        Bundle A01 = C000200d.A01("type", 2);
                        SetEmailFragment setEmailFragment2 = new SetEmailFragment();
                        setEmailFragment2.A0P(A01);
                        twoFactorAuthActivity.A1S(setEmailFragment2, true);
                        return;
                    } else if (i == 2) {
                        TwoFactorAuthActivity twoFactorAuthActivity2 = setEmailFragment.A06;
                        if (TextUtils.equals(twoFactorAuthActivity2.A04, twoFactorAuthActivity2.A05)) {
                            setEmailFragment.A06.A1Q();
                            return;
                        } else {
                            setEmailFragment.A04.setText(R.string.two_factor_auth_email_mismatch);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                throw null;
            case 7:
                C02180Ae.A1A(((UserNoticeBottomSheetDialogFragment) this.A00).A08);
                return;
            case 8:
                AbstractC53222c9 abstractC53222c9 = (AbstractC53222c9) view.getTag();
                if (abstractC53222c9 != null) {
                    C53202c3 c53202c3 = ((C53252cC) abstractC53222c9.A00).A00;
                    C53242cB c53242cB = (C53242cB) this.A00;
                    CallsFragment callsFragment = c53242cB.A0M;
                    if (callsFragment.A01 != null) {
                        callsFragment.A16(c53202c3, c53242cB);
                        return;
                    } else if (c53202c3.A04()) {
                        if (callsFragment.A09() != null && (A0I = c53242cB.A0H.A0I()) != null && callsFragment.A09().getCurrentFocus() != null) {
                            A0I.hideSoftInputFromWindow(callsFragment.A09().getCurrentFocus().getWindowToken(), 0);
                        }
                        AnonymousClass029.A1H((C0D3) c53202c3.A03.get(0), c53242cB.A0C, callsFragment.A09(), 21);
                        return;
                    } else {
                        C06C A02 = c53202c3.A02();
                        int A00 = c53202c3.A00();
                        if (A00 == 0) {
                            num = 2;
                        } else if (A00 != 1) {
                            num = A00 != 2 ? null : 1;
                        } else {
                            num = 9;
                        }
                        c53242cB.A0N.A00(A02, callsFragment.A09(), num.intValue(), true, c53202c3.A05());
                        return;
                    }
                }
                return;
            case 9:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (callLogActivity.A0P.A00(callLogActivity.A0G, callLogActivity, 4, false, false) == 0) {
                    callLogActivity.finish();
                    return;
                }
                return;
            case 10:
                CallLogActivity callLogActivity2 = (CallLogActivity) this.A00;
                if (callLogActivity2.A0P.A00(callLogActivity2.A0G, callLogActivity2, 4, false, true) == 0) {
                    callLogActivity2.finish();
                    return;
                }
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                ((Activity) this.A00).finish();
                return;
            case 12:
                CallRatingActivity callRatingActivity = (CallRatingActivity) this.A00;
                WamCall wamCall = callRatingActivity.A09;
                if (wamCall != null) {
                    wamCall.userRating = Long.valueOf(callRatingActivity.A04.getRating());
                }
                if (callRatingActivity.A04.getRating() < 4.0d && callRatingActivity.A02.getVisibility() != 0) {
                    callRatingActivity.A03.setVisibility(8);
                    callRatingActivity.A02.setVisibility(0);
                    ((TextView) callRatingActivity.findViewById(R.id.call_rating_title)).setText(R.string.call_problems_title);
                    callRatingActivity.A0F = 0;
                    return;
                }
                WamCall wamCall2 = callRatingActivity.A09;
                if (wamCall2 != null) {
                    Integer num2 = callRatingActivity.A0F;
                    wamCall2.userProblems = num2 == null ? null : Long.valueOf(num2.longValue());
                    String A0A = C000200d.A0A(callRatingActivity.A01);
                    callRatingActivity.A09.userDescription = TextUtils.isEmpty(A0A) ? null : A0A;
                }
                callRatingActivity.finish();
                return;
            case 13:
                CallsFragment callsFragment2 = (CallsFragment) this.A00;
                C0LD.A05(callsFragment2.A09(), "com.whatsapp");
                callsFragment2.A0Z = true;
                return;
            case 14:
                ((GroupCallParticipantPickerSheet) this.A00).A1o();
                return;
            case 15:
                PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) this.A00;
                permissionDialogFragment.A01.dismiss();
                C0MN c0mn = permissionDialogFragment.A09;
                if (c0mn != null) {
                    c0mn.AMw(permissionDialogFragment.A00);
                    return;
                }
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                ((Activity) this.A00).finish();
                return;
            case 17:
                Intent intent = new Intent("android.intent.action.VIEW");
                VoipAppUpdateActivity voipAppUpdateActivity = (VoipAppUpdateActivity) this.A00;
                intent.setData(voipAppUpdateActivity.A00.A01());
                voipAppUpdateActivity.startActivity(intent);
                voipAppUpdateActivity.finish();
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
