package X;

import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VideoCallParticipantViewLayout;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;

/* renamed from: X.3uN */
/* loaded from: classes2.dex */
public class C84803uN {
    public final /* synthetic */ VoipActivityV2 A00;

    public C84803uN(VoipActivityV2 voipActivityV2) {
        this.A00 = voipActivityV2;
    }

    public void A00(int i, float f) {
        if (f <= 0.0f) {
            VoipActivityV2 voipActivityV2 = this.A00;
            float height = voipActivityV2.A0S.getHeight() * f;
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = voipActivityV2.A19;
            int translationY = videoCallParticipantViewLayout.A0J ? i : (int) (height - voipActivityV2.A0S.getTranslationY());
            VideoCallParticipantView videoCallParticipantView = videoCallParticipantViewLayout.A0N;
            if (videoCallParticipantView.getLayoutMode() == 1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
                C000200d.A0t("VideoCallParticipantViewLayout/movePiPViewWithOutAnimation xOffset: ", 0, ", yOffset: ", translationY);
                C002301c c002301c = videoCallParticipantViewLayout.A0F;
                C0LX.A07(c002301c, videoCallParticipantView, c002301c.A0M() ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin, marginLayoutParams.topMargin, videoCallParticipantViewLayout.A0F.A0M() ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin, marginLayoutParams.bottomMargin);
                marginLayoutParams.topMargin += translationY;
                videoCallParticipantView.setLayoutParams(marginLayoutParams);
            }
            VoipCallNewParticipantBanner voipCallNewParticipantBanner = voipActivityV2.A1K;
            if (voipCallNewParticipantBanner != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) voipCallNewParticipantBanner.getLayoutParams();
                C000200d.A0q("VoipCallNewParticipantBanner/moveBannerYPosition yOffset: ", i);
                marginLayoutParams2.bottomMargin -= i;
                voipCallNewParticipantBanner.setLayoutParams(marginLayoutParams2);
            }
            voipActivityV2.A0S.setTranslationY(height);
            return;
        }
        this.A00.A0S.setTranslationY(0.0f);
    }

    public void A01(boolean z) {
        VideoCallParticipantView videoCallParticipantView;
        BottomSheetBehavior bottomSheetBehavior;
        int i;
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment;
        VoipCallNewParticipantBanner voipCallNewParticipantBanner;
        VoipActivityV2 voipActivityV2 = this.A00;
        if (voipActivityV2.A1I == null) {
            return;
        }
        CallInfo A1V = voipActivityV2.A1V();
        if (z) {
            voipActivityV2.A0S.setVisibility(voipActivityV2.A1I.A0Y ? 8 : 0);
            C0AT.A0V(voipActivityV2.A0L, (voipActivityV2.A1I.A1R() || (A1V != null && A1V.isSelfRequestingUpgrade())) ? 4 : 1);
            if (voipActivityV2.A1I.A1R() && (voipCallNewParticipantBanner = voipActivityV2.A1K) != null) {
                voipCallNewParticipantBanner.A00();
            }
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = voipActivityV2.A19;
            if (videoCallParticipantViewLayout.A01 == 1 && voipActivityV2.A2c(A1V) && videoCallParticipantViewLayout.getPaddingBottom() == 0) {
                voipActivityV2.A19.setPadding(0, 0, 0, voipActivityV2.A1I.A18() - voipActivityV2.getResources().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_rounded_corner_radius));
            }
            MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment2 = voipActivityV2.A17;
            if (maximizedParticipantVideoDialogFragment2 != null && maximizedParticipantVideoDialogFragment2.A0W()) {
                voipActivityV2.A1I.A1A();
                return;
            }
            voipActivityV2.A1m();
        }
        if (voipActivityV2.A1h != z) {
            C000200d.A1C("voip/VoipActivityV2/onSheetVisibilityChanged ", z);
            voipActivityV2.A1h = z;
            if (A1V != null && A1V.videoEnabled) {
                voipActivityV2.A2K(A1V);
                if (!z && (maximizedParticipantVideoDialogFragment = voipActivityV2.A17) != null && !maximizedParticipantVideoDialogFragment.A0W()) {
                    maximizedParticipantVideoDialogFragment.A14(voipActivityV2.A0N(), "maximized_video");
                }
            }
        }
        VoipCallControlBottomSheet voipCallControlBottomSheet = voipActivityV2.A1I;
        boolean z2 = true;
        if (!voipCallControlBottomSheet.A0a || (bottomSheetBehavior = voipCallControlBottomSheet.A0E) == null || ((i = bottomSheetBehavior.A0B) != 2 && i != 1)) {
            z2 = false;
        }
        if (z2 || (videoCallParticipantView = voipActivityV2.A18) == null || videoCallParticipantView.getLayoutMode() != 1) {
            return;
        }
        voipActivityV2.A1v();
    }

    public boolean A02() {
        return VoipActivityV2.A1r.equals(this.A00.getIntent().getAction());
    }
}
