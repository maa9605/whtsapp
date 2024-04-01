package com.facebook.redex;

import X.AbstractC53222c9;
import X.C0M6;
import X.C2Zb;
import X.C41941ul;
import X.C53242cB;
import X.InterfaceC72193Za;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import com.whatsapp.voipcalling.CallRatingActivity;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape6S0100000_I0_6 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape6S0100000_I0_6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A01) {
            case 0:
                ((InterfaceC72193Za) this.A00).AIa();
                return;
            case 1:
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A00;
                C41941ul c41941ul = userNoticeBottomSheetDialogFragment.A0C;
                if (!TextUtils.isEmpty(userNoticeBottomSheetDialogFragment.A0E.A03)) {
                    c41941ul.A01(4);
                }
                userNoticeBottomSheetDialogFragment.A10();
                return;
            case 2:
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment2 = (UserNoticeBottomSheetDialogFragment) this.A00;
                C41941ul c41941ul2 = userNoticeBottomSheetDialogFragment2.A0C;
                if (!TextUtils.isEmpty(userNoticeBottomSheetDialogFragment2.A0E.A03)) {
                    c41941ul2.A01(6);
                } else {
                    c41941ul2.A01(9);
                }
                userNoticeBottomSheetDialogFragment2.A0D.A03();
                userNoticeBottomSheetDialogFragment2.A10();
                return;
            case 3:
                CompoundButton compoundButton = (CompoundButton) this.A00;
                compoundButton.setChecked(!compoundButton.isChecked());
                return;
            case 4:
                CompoundButton compoundButton2 = (CompoundButton) this.A00;
                compoundButton2.setChecked(!compoundButton2.isChecked());
                return;
            case 5:
                CompoundButton compoundButton3 = (CompoundButton) this.A00;
                compoundButton3.setChecked(!compoundButton3.isChecked());
                return;
            case 6:
                CompoundButton compoundButton4 = (CompoundButton) this.A00;
                compoundButton4.setChecked(!compoundButton4.isChecked());
                return;
            case 7:
                View view2 = (View) this.A00;
                if (view2.isSelected()) {
                    view2.setSelected(false);
                }
                view2.setSelected(true);
                return;
            case 8:
                ((C2Zb) this.A00).A09();
                return;
            case 9:
                ((C2Zb) this.A00).A08();
                return;
            case 10:
                C53242cB c53242cB = (C53242cB) this.A00;
                c53242cB.A0M.A17(((AbstractC53222c9) c53242cB).A00, c53242cB);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                ((CallRatingActivity) this.A00).lambda$onCreate$2643$CallRatingActivity(view);
                return;
            case 12:
                ((CallRatingActivity) this.A00).lambda$onCreate$2642$CallRatingActivity(view);
                return;
            case 13:
                CallsFragment callsFragment = (CallsFragment) this.A00;
                callsFragment.A06.A01(callsFragment.A09(), 1);
                return;
            case 14:
                ((GroupCallParticipantPicker) this.A00).lambda$createRoomView$2689$GroupCallParticipantPicker(view);
                return;
            case 15:
                ((GroupCallParticipantPickerSheet) this.A00).A1p();
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                ((MaximizedParticipantVideoDialogFragment) this.A00).A19(true);
                return;
            case 17:
            default:
                return;
            case 18:
                ((VoipActivityV2) this.A00).lambda$onCreate$2725$VoipActivityV2(view);
                return;
            case 19:
                ((VoipActivityV2) this.A00).lambda$onCreate$2730$VoipActivityV2(view);
                return;
            case C0M6.A01 /* 20 */:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2748$VoipActivityV2(view);
                return;
            case 21:
                ((VoipActivityV2) this.A00).lambda$onCreate$2737$VoipActivityV2(view);
                return;
            case 22:
                ((VoipActivityV2) this.A00).lambda$onCreate$2724$VoipActivityV2(view);
                return;
            case 23:
                ((VoipActivityV2) this.A00).lambda$onCreate$2736$VoipActivityV2(view);
                return;
            case 24:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2747$VoipActivityV2(view);
                return;
            case 25:
                ((VoipActivityV2) this.A00).lambda$onCreate$2729$VoipActivityV2(view);
                return;
            case 26:
                ((VoipActivityV2) this.A00).lambda$onCreate$2728$VoipActivityV2(view);
                return;
            case 27:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2749$VoipActivityV2(view);
                return;
            case 28:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2745$VoipActivityV2(view);
                return;
            case 29:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2744$VoipActivityV2(view);
                return;
            case 30:
                ((VoipActivityV2) this.A00).lambda$showCallFailedScreen$2757$VoipActivityV2(view);
                return;
            case 31:
                ((VoipActivityV2) this.A00).A1r();
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                ((VoipActivityV2) this.A00).A1l();
                return;
            case 33:
                ((VoipCallControlBottomSheet) this.A00).A1J(1);
                return;
            case 34:
                ((VoipCallControlBottomSheet) this.A00).A1J(0);
                return;
            case 35:
                ((Activity) this.A00).finish();
                return;
        }
    }
}
