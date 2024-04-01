package X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.google.android.search.verification.client.R;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: X.3Cu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66883Cu implements InterfaceC70853Tw {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public C66883Cu(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    @Override // X.InterfaceC70853Tw
    public void AI9(int i) {
        Log.e("idverification/cameraerror");
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (identityVerificationActivity.A0R.A04()) {
            ((ActivityC02290Ap) identityVerificationActivity).A0A.A07(R.string.error_camera_disabled_during_video_call, 1);
        } else if (i != 2) {
            ((ActivityC02290Ap) identityVerificationActivity).A0A.A07(R.string.cannot_start_camera, 1);
        }
        identityVerificationActivity.A1V(null);
    }

    @Override // X.InterfaceC70853Tw
    public void ANK() {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (identityVerificationActivity.A1Z()) {
            if (identityVerificationActivity.findViewById(R.id.main_layout).getVisibility() != 8) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                identityVerificationActivity.A04 = translateAnimation;
                translateAnimation.setInterpolator(new AccelerateInterpolator());
                identityVerificationActivity.A04.setDuration(identityVerificationActivity.getResources().getInteger(17694721));
                identityVerificationActivity.findViewById(R.id.main_layout).startAnimation(identityVerificationActivity.A04);
                identityVerificationActivity.findViewById(R.id.scan_code).setVisibility(8);
                identityVerificationActivity.findViewById(R.id.result).setVisibility(8);
                identityVerificationActivity.A04.setAnimationListener(new C0DJ() { // from class: X.3Ct
                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        C66883Cu.this.A00.A0O.A01.ARd();
                    }
                });
                identityVerificationActivity.findViewById(R.id.main_layout).setVisibility(8);
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(identityVerificationActivity.getResources().getInteger(17694720));
            identityVerificationActivity.findViewById(R.id.verify_identity_qr_tip).startAnimation(alphaAnimation);
            identityVerificationActivity.findViewById(R.id.verify_identity_qr_tip).setVisibility(0);
        }
    }

    @Override // X.InterfaceC70853Tw
    public void ANU(C1D9 c1d9) {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        Animation animation = identityVerificationActivity.A04;
        if (animation == null || animation.hasEnded()) {
            if (identityVerificationActivity != null) {
                String str = c1d9.A01;
                if (str == null) {
                    identityVerificationActivity.A0O.A01.ARd();
                    return;
                }
                try {
                    byte[] bytes = str.getBytes("ISO-8859-1");
                    int A1P = identityVerificationActivity.A1P(bytes);
                    Arrays.toString(bytes);
                    String A04 = identityVerificationActivity.A0E.A04(identityVerificationActivity.A0K);
                    if (A1P == -4) {
                        identityVerificationActivity.A0O.A01.ARd();
                        return;
                    } else if (A1P == -3) {
                        identityVerificationActivity.A07.setText(identityVerificationActivity.getString(R.string.verify_identity_result_wrong_you, A04));
                        identityVerificationActivity.A07.setVisibility(0);
                        identityVerificationActivity.A0O.A01.ARd();
                        return;
                    } else if (A1P == -2) {
                        identityVerificationActivity.A07.setText(identityVerificationActivity.getString(R.string.verify_identity_result_wrong_contact, A04));
                        identityVerificationActivity.A07.setVisibility(0);
                        identityVerificationActivity.A0O.A01.ARd();
                        return;
                    } else if (A1P == 1) {
                        identityVerificationActivity.A1V(new RunnableEBaseShape8S0100000_I1_0(identityVerificationActivity, 38));
                        return;
                    } else if (A1P != 2) {
                        return;
                    } else {
                        identityVerificationActivity.A1V(new RunnableEBaseShape8S0100000_I1_0(identityVerificationActivity, 39));
                        return;
                    }
                } catch (UnsupportedEncodingException unused) {
                    identityVerificationActivity.A0O.A01.ARd();
                    return;
                }
            }
            throw null;
        }
    }
}
