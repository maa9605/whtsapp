package X;

import android.app.Dialog;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3yE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86763yE extends C1UN {
    public UserJid A00;
    public final Set A01;
    public final /* synthetic */ VoipCallControlBottomSheet A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86763yE(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        super(VoipCallControlBottomSheet.A0g);
        this.A02 = voipCallControlBottomSheet;
        this.A01 = new HashSet();
    }

    @Override // X.AbstractC04890Mh
    public void A0A(RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                C0TS A0E = recyclerView.A0E(childAt);
                if (A0E instanceof C84913uY) {
                    C84913uY c84913uY = (C84913uY) A0E;
                    c84913uY.A01.clearAnimation();
                    c84913uY.A02.clearAnimation();
                    c84913uY.A06.clearAnimation();
                }
            }
        }
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        Object obj = ((C1UN) this).A00.A02.get(i);
        if (obj != null) {
            return ((C74633da) obj).A00;
        }
        throw null;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == 0) {
            final View inflate = this.A02.A04().inflate(R.layout.voip_call_control_sheet_add_participant_button_row, viewGroup, false);
            return new C0TS(inflate) { // from class: X.3uZ
            };
        } else if (i == 2) {
            final View inflate2 = this.A02.A04().inflate(R.layout.voip_call_control_sheet_inline_rounded_button_row, viewGroup, false);
            return new C0TS(inflate2) { // from class: X.3uZ
            };
        } else if (i != 3) {
            C000700j.A08(i == 1, "Unknown list item type");
            VoipCallControlBottomSheet voipCallControlBottomSheet = this.A02;
            return new C84913uY(voipCallControlBottomSheet, voipCallControlBottomSheet.A04().inflate(R.layout.voip_call_control_sheet_participant_row, viewGroup, false));
        } else {
            final View inflate3 = this.A02.A04().inflate(R.layout.voip_call_control_sheet_inline_rounded_button_row, viewGroup, false);
            return new C0TS(inflate3) { // from class: X.3uZ
            };
        }
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        Object obj = ((C1UN) this).A00.A02.get(i);
        if (obj != null) {
            C74633da c74633da = (C74633da) obj;
            int i2 = c74633da.A00;
            if (i2 == 0) {
                View view = c0ts.A0H;
                view.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 25));
                VoipCallControlBottomSheet voipCallControlBottomSheet = this.A02;
                ((DialogFragment) voipCallControlBottomSheet).A03.getWindow().setSoftInputMode(32);
                view.setClickable(true);
                View A0D = C0AT.A0D(view, R.id.add_participant_icon);
                Dialog dialog = ((DialogFragment) voipCallControlBottomSheet).A03;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                if (dialog != null && dialog.getContext() != null) {
                    TypedValue typedValue = new TypedValue();
                    dialog.getContext().getTheme().resolveAttribute(R.attr.voipAddParticipantButtonColor, typedValue, true);
                    shapeDrawable.getPaint().setColor(typedValue.data);
                }
                A0D.setBackground(shapeDrawable);
                C02180Ae.A14(view, voipCallControlBottomSheet.A0F(R.string.voip_joinable_add_participant_description), voipCallControlBottomSheet.A0F(R.string.voip_joinable_add_participant_click_action_description), false);
                return;
            } else if (i2 == 2) {
                VoipCallControlBottomSheet voipCallControlBottomSheet2 = this.A02;
                if (voipCallControlBottomSheet2 != null) {
                    View view2 = c0ts.A0H;
                    TextView textView = (TextView) view2.findViewById(R.id.button_text);
                    if (textView != null) {
                        textView.setText(R.string.voip_joinable_call_is_fall_info);
                    }
                    view2.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(voipCallControlBottomSheet2, 26));
                    view2.setClickable(true);
                    return;
                }
                throw null;
            } else if (i2 != 3) {
                C000700j.A08(i2 == 1, "Unknown list item type");
                C28241Qv c28241Qv = c74633da.A01;
                if (c28241Qv != null) {
                    boolean z = c74633da.A02;
                    C000700j.A06(c0ts instanceof C84913uY);
                    VoipCallControlBottomSheet voipCallControlBottomSheet3 = this.A02;
                    C05W c05w = voipCallControlBottomSheet3.A0J;
                    UserJid userJid = c28241Qv.A06;
                    C06C A0A = c05w.A0A(userJid);
                    final C84913uY c84913uY = (C84913uY) c0ts;
                    View view3 = c84913uY.A0H;
                    C0AT.A0c(view3, null);
                    view3.setClickable(false);
                    c84913uY.A05.setVisibility(8);
                    c84913uY.A03.setVisibility(8);
                    c84913uY.A06.setVisibility(8);
                    c84913uY.A01.clearAnimation();
                    c84913uY.A02.clearAnimation();
                    c84913uY.A06.clearAnimation();
                    view3.setTag(userJid);
                    if (c28241Qv.A0E) {
                        c84913uY.A04.A00();
                        voipCallControlBottomSheet3.A0L.A04(A0A, c84913uY.A02, true, voipCallControlBottomSheet3.A0e);
                        c84913uY.A02.setOnClickListener(null);
                        C0AT.A0V(c84913uY.A02, 2);
                    } else {
                        c84913uY.A04.A03(A0A, null);
                        voipCallControlBottomSheet3.A0L.A02(A0A, c84913uY.A02);
                        int i3 = c28241Qv.A01;
                        if (i3 == 1) {
                            c84913uY.A01.setAlpha(1.0f);
                            c84913uY.A02.setAlpha(1.0f);
                            if (!z) {
                                ImageView imageView = c84913uY.A03;
                                AnimationSet animationSet = new AnimationSet(false);
                                AlphaAnimation A03 = C000200d.A03(0.0f, 1.0f, 500L);
                                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                                scaleAnimation.setDuration(500L);
                                scaleAnimation.setInterpolator(C07O.A0L(0.2f, 1.65f, 0.55f, 1.0f));
                                animationSet.addAnimation(scaleAnimation);
                                animationSet.addAnimation(A03);
                                imageView.startAnimation(animationSet);
                                c84913uY.A03.setVisibility(0);
                            }
                            view3.setContentDescription(voipCallControlBottomSheet3.A0G(R.string.voip_joinable_connected_participant_description, c84913uY.A04.A01.getText()));
                        } else if (i3 != 11 && z) {
                            c84913uY.A06.setVisibility(0);
                            view3.setContentDescription(voipCallControlBottomSheet3.A0G(R.string.voip_joinable_ringing_participant_description, c84913uY.A04.A01.getText()));
                            C74663dd c74663dd = new C74663dd(c84913uY.A06);
                            c74663dd.setRepeatCount(-1);
                            c74663dd.setAnimationListener(new C0DJ() { // from class: X.3uX
                                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                                public void onAnimationRepeat(Animation animation) {
                                    onAnimationStart(animation);
                                }

                                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                                public void onAnimationStart(Animation animation) {
                                    C84913uY c84913uY2 = C84913uY.this;
                                    VoipCallControlBottomSheet.A01(c84913uY2.A01, 0.2f, 0.5f);
                                    VoipCallControlBottomSheet.A01(c84913uY2.A02, 0.25f, 0.75f);
                                }
                            });
                            c84913uY.A06.startAnimation(c74663dd);
                        } else {
                            c84913uY.A02.setAlpha(0.3f);
                            c84913uY.A01.setAlpha(0.3f);
                            if (z) {
                                c84913uY.A05.setVisibility(0);
                                (AnonymousClass088.A1y(voipCallControlBottomSheet3.A0N.A0H()) ? view3 : c84913uY.A05).setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c28241Qv, 21));
                                c84913uY.A05.setAlpha(0.0f);
                                c84913uY.A05.animate().setDuration(500L).alpha(1.0f).start();
                                C02180Ae.A14(view3, voipCallControlBottomSheet3.A0G(R.string.voip_joinable_invited_participant_with_ring_button_description, c84913uY.A04.A01.getText()), null, false);
                            } else {
                                view3.setContentDescription(voipCallControlBottomSheet3.A0G(R.string.voip_joinable_invited_participant_description, c84913uY.A04.A01.getText()));
                            }
                        }
                    }
                    if (userJid.equals(this.A00)) {
                        VoipCallControlBottomSheet.A02(voipCallControlBottomSheet3, i);
                        return;
                    }
                    return;
                }
                throw null;
            } else if (this.A02 != null) {
                TextView textView2 = (TextView) c0ts.A0H.findViewById(R.id.button_text);
                if (textView2 == null) {
                    return;
                }
                textView2.setText(R.string.voip_joinable_call_inline_education);
                return;
            } else {
                throw null;
            }
        }
        throw null;
    }

    public void A0H(UserJid userJid) {
        UserJid userJid2;
        this.A00 = userJid;
        for (int i = 0; i < A0C(); i++) {
            C28241Qv c28241Qv = ((C74633da) ((C1UN) this).A00.A02.get(i)).A01;
            if (c28241Qv != null && (userJid2 = this.A00) != null && c28241Qv.A06.equals(userJid2)) {
                VoipCallControlBottomSheet.A02(this.A02, i);
            }
        }
    }
}
