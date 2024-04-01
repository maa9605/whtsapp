package com.whatsapp.voipcalling;

import X.AbstractC02800Cx;
import X.AbstractC04890Mh;
import X.AbstractC74483dL;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass029;
import X.AnonymousClass088;
import X.C000200d;
import X.C000500h;
import X.C000700j;
import X.C002301c;
import X.C003101m;
import X.C005102h;
import X.C018308n;
import X.C018508q;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02180Ae;
import X.C02820Cz;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C03020Dv;
import X.C03080Ec;
import X.C03150Ej;
import X.C03860Hk;
import X.C05480Ox;
import X.C05490Oy;
import X.C05W;
import X.C0AT;
import X.C0BA;
import X.C0DJ;
import X.C0EW;
import X.C0GA;
import X.C0HY;
import X.C0L5;
import X.C0L6;
import X.C0MM;
import X.C0MN;
import X.C0MO;
import X.C0MP;
import X.C0MQ;
import X.C0MR;
import X.C0MS;
import X.C0Zn;
import X.C25L;
import X.C28231Qu;
import X.C28241Qv;
import X.C2IY;
import X.C2M7;
import X.C2U3;
import X.C2Zf;
import X.C40071rX;
import X.C40261rr;
import X.C41641uH;
import X.C49032Ic;
import X.C54552iw;
import X.C74403dD;
import X.C74593dW;
import X.C74733dl;
import X.C84403tg;
import X.C84473tn;
import X.C84803uN;
import X.C84843uR;
import X.C84853uS;
import X.C84863uT;
import X.C86963yq;
import X.DialogInterfaceC019408z;
import X.EnumC74583dV;
import X.InterfaceC002901k;
import X.InterfaceC50852Tl;
import X.InterfaceC52362ab;
import X.InterfaceC74713di;
import X.RunnableC73483bi;
import X.RunnableC73493bj;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.os.Vibrator;
import android.service.notification.StatusBarNotification;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I0_1;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.components.AnimatingArrowsLayout;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallDetailsLayout;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_E2EEInfoDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_EndCallConfirmationDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_ReplyWithMessageDialogFragment;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class VoipActivityV2 extends C0MM implements C0MN, C0MO, C0MP, C0MQ, ViewTreeObserver.OnGlobalLayoutListener, C0MR, C0MS {
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public Drawable A0B;
    public Drawable A0C;
    public Drawable A0D;
    public Handler A0E;
    public View.OnClickListener A0F;
    public View.OnClickListener A0G;
    public View.OnClickListener A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public ViewGroup A0T;
    public ViewGroup A0U;
    public ImageButton A0V;
    public ImageButton A0W;
    public ImageButton A0X;
    public ImageView A0Y;
    public ImageView A0Z;
    public TextView A0a;
    public TextView A0b;
    public TextView A0c;
    public TextView A0d;
    public TextView A0e;
    public TextView A0f;
    public DialogFragment A0g;
    public DialogFragment A0h;
    public DialogFragment A0i;
    public C03020Dv A0j;
    public C02L A0k;
    public C03150Ej A0l;
    public C01B A0m;
    public C40261rr A0n;
    public C05W A0o;
    public AnonymousClass008 A0q;
    public C018708s A0r;
    public C0Zn A0s;
    public C0L5 A0t;
    public C54552iw A0u;
    public ContactPickerFragment A0v;
    public C02E A0w;
    public C005102h A0x;
    public C02F A0y;
    public C0HY A0z;
    public C03080Ec A10;
    public InterfaceC002901k A11;
    public CallDetailsLayout A12;
    public C2M7 A13;
    public C05480Ox A14;
    public CallPictureGrid A15;
    public C2IY A16;
    public MaximizedParticipantVideoDialogFragment A17;
    public VideoCallParticipantView A18;
    public VideoCallParticipantViewLayout A19;
    public AbstractC74483dL A1A;
    public C25L A1B;
    public C41641uH A1C;
    public Voip.CallState A1D;
    public C84803uN A1E;
    public EnumC74583dV A1F;
    public C84843uR A1G;
    public C74593dW A1H;
    public VoipCallControlBottomSheet A1I;
    public VoipCallFooter A1J;
    public VoipCallNewParticipantBanner A1K;
    public C0L6 A1L;
    public C0EW A1M;
    public VoipCameraManager A1N;
    public String A1P;
    public String A1Q;
    public Map A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1i;
    public static final String A1r = C000200d.A0H("com.whatsapp", ".intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN");
    public static final String A1q = C000200d.A0H("com.whatsapp", ".intent.action.SHOW_END_CALL_CONFIRMATION");
    public static final String A1n = C000200d.A0H("com.whatsapp", ".intent.action.END_CALL_AFTER_CONFIRMATION");
    public static final String A1o = C000200d.A0H("com.whatsapp", ".intent.action.REJECT_CALL_FROM_VOIP_UI");
    public static final String A1p = C000200d.A0H("com.whatsapp", ".intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL");
    public boolean A1j = false;
    public final C05490Oy A1m = new C05490Oy() { // from class: X.3uJ
        {
            VoipActivityV2.this = this;
        }

        @Override // X.C05490Oy
        public void A03(C0D3 c0d3) {
            Log.i("voip/VoipActivityV2/onCallEnded");
            VoipActivityV2 voipActivityV2 = VoipActivityV2.this;
            if (voipActivityV2.A0j.A00) {
                return;
            }
            voipActivityV2.finish();
        }

        @Override // X.C05490Oy
        public void A05(C0D3 c0d3, boolean z) {
            Log.i("voip/VoipActivityV2/onCallMissed");
            VoipActivityV2 voipActivityV2 = VoipActivityV2.this;
            if (voipActivityV2.A0j.A00) {
                return;
            }
            voipActivityV2.finish();
        }
    };
    public InterfaceC50852Tl A1O = new C2U3(this);
    public final C84403tg A1l = new C84403tg(this);
    public boolean A1h = true;
    public int A00 = 3;
    public boolean A1U = true;
    public final InterfaceC52362ab A1k = new InterfaceC52362ab() { // from class: X.3uK
        {
            VoipActivityV2.this = this;
        }

        @Override // X.InterfaceC52362ab
        public void AUd(ImageView imageView, Bitmap bitmap, boolean z) {
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
        }

        @Override // X.InterfaceC52362ab
        public void AUp(ImageView imageView) {
            boolean A04 = VoipActivityV2.A04(Voip.getCallInfo());
            int i = R.drawable.avatar_contact_voice_call;
            if (A04) {
                i = R.drawable.avatar_contact_video_call;
            }
            imageView.setImageResource(i);
        }
    };
    public C0GA A0p = null;

    @Override // X.ActivityC02270An
    public boolean A1O() {
        return false;
    }

    public void lambda$onCreate$2727$VoipActivityV2(View view) {
    }

    public static Intent A00(Context context, int i, String str, boolean z) {
        Intent A02 = A02(context, null, Boolean.valueOf(z), null, null, null);
        A02.setAction("com.whatsapp.intent.action.ACCEPT_CALL");
        A02.putExtra("call_ui_action", i);
        A02.putExtra("call_id", str);
        A02.putExtra("isTaskRoot", z);
        return A02;
    }

    public static Intent A01(Context context, UserJid userJid, Boolean bool) {
        ArrayList arrayList = new ArrayList();
        if (userJid != null) {
            arrayList.add(userJid);
        }
        return A02(context, arrayList, bool, null, null, null);
    }

    public static Intent A02(Context context, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        Intent intent = new Intent(context, VoipActivityV2.class);
        if (list != null) {
            intent.putStringArrayListExtra("jid", C003101m.A0E(list));
        }
        if (bool != null) {
            intent.putExtra("isTaskRoot", bool);
        }
        if (bool4 != null) {
            intent.putExtra("newCall", bool4);
        }
        if (bool2 != null) {
            intent.putExtra("video_call", bool2);
        }
        if (bool3 != null || C02180Ae.A0F(context) == null) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static void A03(VoipActivityV2 voipActivityV2, UserJid userJid) {
        C25L c25l;
        CallInfo A1V = voipActivityV2.A1V();
        if (A1V == null || A1V.callState == Voip.CallState.NONE || (c25l = voipActivityV2.A1B) == null) {
            return;
        }
        c25l.A0s.execute(new RunnableEBaseShape4S0200000_I0_4(c25l, userJid, 48));
    }

    public static final boolean A04(CallInfo callInfo) {
        return callInfo != null && callInfo.videoEnabled;
    }

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        ContactPickerFragment contactPickerFragment = this.A0v;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1E(i);
        }
    }

    @Override // X.ActivityC02270An
    public void A1I() {
        if (((ActivityC02270An) this).A0E.A01() != 1) {
            super.A1I();
        }
    }

    @Override // X.C0DS
    public void A1P() {
        ContactPickerFragment contactPickerFragment = this.A0v;
        if (contactPickerFragment != null) {
            contactPickerFragment.A15();
        }
    }

    @Override // X.C0DS
    public void A1R(C03860Hk c03860Hk) {
        ContactPickerFragment contactPickerFragment = this.A0v;
        if (contactPickerFragment != null) {
            contactPickerFragment.A13();
        }
    }

    public final CallInfo A1V() {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            String str = this.A1Q;
            if (str != null && str.equals(callInfo.callWaitingInfo.A04)) {
                return CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
            }
            return callInfo;
        }
        return null;
    }

    public final AbstractC74483dL A1W(UserJid userJid) {
        AbstractC74483dL abstractC74483dL = (AbstractC74483dL) this.A1R.get(userJid);
        if (abstractC74483dL == null) {
            C84853uS c84853uS = new C84853uS(this, this.A19, userJid);
            this.A1R.put(userJid, c84853uS);
            return c84853uS;
        }
        return abstractC74483dL;
    }

    public final Voip.CallState A1X(CallInfo callInfo) {
        Voip.CallState callState = callInfo.callState;
        if (Voip.A0B(callState) && this.A1T) {
            return Voip.CallState.ACCEPT_SENT;
        }
        if (!callInfo.hasOutgoingParticipantInActiveOneToOneCall()) {
            return callState;
        }
        C28241Qv defaultPeerInfo = callInfo.getDefaultPeerInfo();
        if (defaultPeerInfo != null) {
            if (defaultPeerInfo.A01 == 2) {
                return Voip.CallState.CALLING;
            }
            if (callInfo.getDefaultPeerInfo().A01 != 3) {
                return callState;
            }
            return Voip.CallState.PRE_ACCEPT_RECEIVED;
        }
        throw null;
    }

    public final String A1Y(UserJid userJid, int i) {
        if (i != 2) {
            if (i == 9) {
                C25L c25l = this.A1B;
                if (c25l == null || c25l.A2G != 7) {
                    return null;
                }
                return getString(R.string.voip_unavailable);
            } else if (i != 17) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                    return getString(R.string.peer_in_another_call, this.A0r.A08(this.A0o.A0A(userJid), false));
                }
                return getString(R.string.voip_not_answered);
            } else {
                return getString(R.string.voip_unavailable);
            }
        }
        return getString(R.string.voip_declined);
    }

    public final String A1Z(C28241Qv c28241Qv, CallInfo callInfo) {
        String A04 = this.A0r.A04(this.A0o.A0A(c28241Qv.A06));
        if (c28241Qv.A0E || callInfo.callState != Voip.CallState.ACTIVE) {
            return null;
        }
        if (c28241Qv.A01()) {
            return getString(R.string.voip_requested_upgrade_to_video_new, A04);
        }
        boolean z = callInfo.isGroupCall;
        if (z && c28241Qv.A01 == 2) {
            return getString(R.string.calling);
        }
        if (z && c28241Qv.A01 == 3) {
            return getString(R.string.ringing);
        }
        C28241Qv c28241Qv2 = callInfo.self;
        if (c28241Qv2 != null && c28241Qv2.A09) {
            return getString(R.string.voip_on_hold);
        }
        if (c28241Qv.A09) {
            return getString(R.string.voip_on_hold);
        }
        if (c28241Qv.A0C) {
            return getString(R.string.voip_reconnecting);
        }
        if (!callInfo.videoEnabled || c28241Qv.A02() || c28241Qv.A0J || c28241Qv.A04 == 2) {
            return null;
        }
        return getString(R.string.voip_connecting);
    }

    public final String A1a(C28241Qv c28241Qv, CallInfo callInfo, boolean z) {
        String A04 = this.A0r.A04(this.A0o.A0A(c28241Qv.A06));
        if (!callInfo.videoEnabled) {
            if (c28241Qv.A0B) {
                if (z) {
                    return getString(R.string.voip_peer_muted, A04);
                }
                return getString(R.string.voip_pip_peer_muted);
            }
            return null;
        }
        boolean A02 = c28241Qv.A02();
        if (A02 && c28241Qv.A0B && !callInfo.isGroupCall) {
            if (z) {
                return getString(R.string.voip_peer_muted_camera_off, A04);
            }
            return getString(R.string.voip_pip_peer_muted_camera_off);
        } else if (A02) {
            if (z) {
                return getString(R.string.voip_peer_video_stopped, A04);
            }
            return getString(R.string.voip_pip_peer_video_stopped);
        } else if (c28241Qv.A04 == 2) {
            if (!c28241Qv.A0B || callInfo.isGroupCall) {
                if (z) {
                    return getString(R.string.voip_peer_video_paused, A04);
                }
                return getString(R.string.voip_pip_peer_video_paused);
            } else if (z) {
                return getString(R.string.voip_peer_muted_video_paused, A04);
            } else {
                return getString(R.string.voip_peer_muted_video_paused_short);
            }
        } else if (c28241Qv.A0H || c28241Qv.A0G) {
            if (z) {
                return getString(R.string.video_decode_paused);
            }
            return getString(R.string.poor_connection);
        } else if (c28241Qv.A0B && callInfo.getConnectedParticipantsCount() == 2) {
            if (z) {
                return getString(R.string.voip_peer_muted, A04);
            }
            return getString(R.string.voip_pip_peer_muted);
        } else {
            return null;
        }
    }

    public final List A1b(CallInfo callInfo, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (C28241Qv c28241Qv : callInfo.participants.values()) {
            if (!c28241Qv.A0E && (z || ((i = c28241Qv.A01) != 11 && (!AnonymousClass029.A1O(this.A0m) || i == 1)))) {
                arrayList.add(c28241Qv.A06);
            }
        }
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/getPeerParticipantJids ");
        sb.append(arrayList);
        Log.i(sb.toString());
        return arrayList;
    }

    public void A1c() {
        C000200d.A1N(C000200d.A0P("voip/VoipActivityV2/showCallFailedMessage"), this.A1P);
        String str = this.A1P;
        if (str != null) {
            DialogFragment dialogFragment = this.A0i;
            if (dialogFragment != null) {
                dialogFragment.A11();
                this.A0i = null;
                this.A1P = null;
                str = null;
            }
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message", str);
            messageDialogFragment.A0P(bundle);
            this.A0i = messageDialogFragment;
            messageDialogFragment.A14(A0N(), null);
            return;
        }
        C000700j.A08(false, "call failed message not defined");
    }

    public final void A1d() {
        this.A0c.setText("");
        this.A0O.setVisibility(8);
    }

    public final void A1e() {
        CallInfo A1V;
        int i;
        C000700j.A08(this.A0v != null, "contact picker fragment should not be null");
        ContactPickerFragment contactPickerFragment = this.A0v;
        if (contactPickerFragment != null) {
            contactPickerFragment.A0I.A04(false);
            if (AnonymousClass029.A1O(this.A0m)) {
                A19("VoipContactPickerDialogFragment");
                this.A0v = null;
                return;
            }
            final ContactPickerFragment contactPickerFragment2 = this.A0v;
            final ViewGroup viewGroup = this.A0U;
            final RunnableEBaseShape7S0100000_I0_7 runnableEBaseShape7S0100000_I0_7 = new RunnableEBaseShape7S0100000_I0_7(this, 46);
            if (contactPickerFragment2 == null || ((C0BA) contactPickerFragment2).A0g) {
                return;
            }
            A2V(true);
            final TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.A04);
            translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3uI
                {
                    VoipActivityV2.this = this;
                }

                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    translateAnimation.setAnimationListener(null);
                    C0BA c0ba = contactPickerFragment2;
                    if (c0ba != null) {
                        AbstractC02800Cx A0N = VoipActivityV2.this.A0N();
                        if (A0N != null) {
                            C02820Cz c02820Cz = new C02820Cz(A0N);
                            c02820Cz.A06(c0ba);
                            c02820Cz.A08();
                        } else {
                            throw null;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 19) {
                        VoipActivityV2.this.A0L.setImportantForAccessibility(1);
                    }
                    viewGroup.setVisibility(8);
                    runnableEBaseShape7S0100000_I0_7.run();
                }
            });
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(200L);
            viewGroup.startAnimation(translateAnimation);
            if (Build.VERSION.SDK_INT >= 21 && (A1V = A1V()) != null) {
                boolean A1O = AnonymousClass029.A1O(this.A0m);
                Window window = getWindow();
                if (A1V.videoEnabled) {
                    i = R.color.video_call_text_background;
                    if (A1O) {
                        i = R.color.transparent;
                    }
                } else {
                    i = R.color.primary;
                }
                window.setStatusBarColor(C02160Ac.A00(this, i));
                if (A1O) {
                    Window window2 = getWindow();
                    boolean z = A1V.videoEnabled;
                    int i2 = R.color.primary_voip;
                    if (z) {
                        i2 = R.color.black;
                    }
                    window2.setNavigationBarColor(C02160Ac.A00(this, i2));
                }
            }
            C25L c25l = this.A1B;
            if (c25l == null) {
                return;
            }
            c25l.A0I();
        }
    }

    public final void A1f() {
        C0BA A01 = A0N().A0Q.A01("permission_request");
        if (A01 != null) {
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A06(A01);
                c02820Cz.A08();
                return;
            }
            throw null;
        }
    }

    public final void A1g() {
        if (this.A0I != null) {
            Log.i("voip/VoipActivityV2/hideAnswerCallView");
            C02180Ae.A13(this.A0I, 8);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Q.getLayoutParams();
        if (this.A1I == null || layoutParams.bottomMargin != 0) {
            return;
        }
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_btn_stub_height) - getResources().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_rounded_corner_radius);
        this.A0Q.setLayoutParams(layoutParams);
    }

    public final void A1h() {
        Log.i("voip/VoipActivityV2/hideInCallControls");
        this.A1h = false;
        this.A0J.setVisibility(4);
        this.A0S.setVisibility(8);
        this.A0S.setTranslationY(0.0f);
        this.A1J.setVisibility(4);
        this.A0O.setVisibility(8);
        A19("CallControlSheet");
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A19;
        for (int i = 0; i < videoCallParticipantViewLayout.getActiveChildCount(); i++) {
            videoCallParticipantViewLayout.A01(i).A01();
            videoCallParticipantViewLayout.A01(i).A08(false, false);
        }
        View findViewById = findViewById(R.id.debug_views);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void A1i() {
        if (this.A1c) {
            ContactPickerFragment contactPickerFragment = this.A0v;
            if (contactPickerFragment == null || ((C0BA) contactPickerFragment).A0g) {
                ((ActivityC02270An) this).A0F.A01(this.A0R);
            }
        }
    }

    public final void A1j() {
        if (this.A1I == null) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4);
            getWindow().setFlags(1024, 1024);
        }
    }

    public final void A1k() {
        if (this.A0v != null) {
            Log.i("contact picker is already shown, ignore new events");
            return;
        }
        CallInfo A1V = A1V();
        if (A1V == null) {
            return;
        }
        Map map = A1V.participants;
        Bundle bundle = new Bundle();
        bundle.putBoolean("for_group_call", true);
        bundle.putStringArrayList("contacts_to_exclude", C003101m.A0E(map.keySet()));
        if (AnonymousClass029.A1O(this.A0m)) {
            KeyguardManager A04 = this.A0w.A04();
            if (A04 != null && (A04.isKeyguardLocked() || A04.inKeyguardRestrictedInputMode())) {
                A2V(false);
            }
            boolean z = A1V.videoEnabled;
            VoipContactPickerDialogFragment voipContactPickerDialogFragment = new VoipContactPickerDialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_video_call", z);
            voipContactPickerDialogFragment.A0P(bundle2);
            ContactPickerFragment contactPickerFragment = voipContactPickerDialogFragment.A00;
            if (contactPickerFragment != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putBundle("extras", bundle);
                contactPickerFragment.A0P(bundle3);
                this.A0v = contactPickerFragment;
                AUg(voipContactPickerDialogFragment, "VoipContactPickerDialogFragment");
                return;
            }
            throw null;
        }
        ContactPickerFragment contactPickerFragment2 = new ContactPickerFragment();
        this.A0v = contactPickerFragment2;
        Bundle bundle4 = new Bundle();
        bundle4.putBundle("extras", bundle);
        contactPickerFragment2.A0P(bundle4);
        ContactPickerFragment contactPickerFragment3 = this.A0v;
        CallInfo A1V2 = A1V();
        if (A1V2 == null) {
            return;
        }
        KeyguardManager A042 = this.A0w.A04();
        if (A042 != null && (A042.isKeyguardLocked() || A042.inKeyguardRestrictedInputMode())) {
            A2V(false);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.A04, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        View A0D = C0AT.A0D(this.A0R, R.id.contact_picker_fragment);
        A0D.startAnimation(translateAnimation);
        A0D.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0L.setImportantForAccessibility(4);
        }
        AbstractC02800Cx A0N = A0N();
        if (A0N != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            c02820Cz.A09(R.id.contact_picker_fragment, contactPickerFragment3, "ContactPickerFragment", 1);
            c02820Cz.A08();
            if (A1V2.videoEnabled) {
                A1p();
            }
            C25L c25l = this.A1B;
            if (c25l == null) {
                return;
            }
            Log.i("voip/disableProximitySensor");
            if (c25l.A0x) {
                return;
            }
            c25l.A0x = true;
            c25l.A0K.removeMessages(14);
            c25l.A0K.sendEmptyMessageDelayed(14, 500L);
            return;
        }
        throw null;
    }

    public final void A1l() {
        CallInfo A1V = A1V();
        if (A1V == null) {
            return;
        }
        if (this.A0m.A07(C01C.A34) == A1V.participants.size()) {
            VoipErrorDialogFragment.A01(4, VoipErrorDialogFragment.A00()).A14(A0N(), null);
        } else if (8 == A1V.getConnectedParticipantsCount()) {
            VoipErrorDialogFragment.A01(5, new InterfaceC74713di() { // from class: X.3uQ
                {
                    VoipActivityV2.this = this;
                }

                @Override // X.InterfaceC74713di
                public void AGd(DialogInterface dialogInterface) {
                    dialogInterface.dismiss();
                }

                @Override // X.InterfaceC74713di
                public void AQn(DialogInterface dialogInterface) {
                    VoipActivityV2.this.A1k();
                }
            }).A14(A0N(), null);
        } else {
            A1k();
        }
    }

    public final void A1m() {
        CallInfo A1V = A1V();
        if (A1V == null || A1V.callState == Voip.CallState.NONE || !this.A1h || !A2b(A1V)) {
            return;
        }
        this.A0E.removeMessages(3);
        this.A0E.sendEmptyMessageDelayed(3, 5000L);
    }

    public final void A1n() {
        boolean z = false;
        if (AnonymousClass029.A1O(this.A0m)) {
            if (this.A1I == null) {
                VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A19;
                if (videoCallParticipantViewLayout != null && videoCallParticipantViewLayout.getPaddingBottom() != 0) {
                    this.A19.setPadding(0, 0, 0, 0);
                }
                CallInfo A1V = A1V();
                if (A1V != null && A1V.videoEnabled) {
                    z = true;
                }
                VoipCallControlBottomSheet voipCallControlBottomSheet = new VoipCallControlBottomSheet();
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_video_call", z);
                voipCallControlBottomSheet.A0P(bundle);
                this.A1I = voipCallControlBottomSheet;
                this.A1J.setVisibility(8);
                this.A0J.setVisibility(4);
                this.A0S.setTranslationY(0.0f);
                if (A1V != null && !A1V.isPeerRequestingUpgrade()) {
                    if (A1V.isGroupCall || !Voip.A0B(A1V.callState)) {
                        this.A1I.A14(A0N(), "CallControlSheet");
                        VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A1K;
                        if (voipCallNewParticipantBanner != null) {
                            voipCallNewParticipantBanner.A01();
                        }
                        A1g();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.A1J.setVisibility(0);
        this.A0J.setVisibility(0);
    }

    public final void A1o() {
        Log.i("voip/VoipActivityV2/showInCallControls");
        this.A1h = true;
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
        if (voipCallControlBottomSheet == null) {
            this.A0J.setVisibility(0);
            this.A1J.setVisibility(0);
        } else {
            voipCallControlBottomSheet.A14(A0N(), "CallControlSheet");
            this.A1J.setVisibility(8);
            this.A0J.setVisibility(8);
            A1v();
            VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A1K;
            if (voipCallNewParticipantBanner != null) {
                voipCallNewParticipantBanner.A01();
            }
        }
        this.A0S.setVisibility(0);
        this.A0S.setTranslationY(0.0f);
        if (this.A0c.length() > 0) {
            this.A0O.setVisibility(0);
        }
        View findViewById = findViewById(R.id.debug_views);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void A1p() {
        if (this.A1I == null) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-5));
            getWindow().clearFlags(1024);
        }
    }

    public final void A1q() {
        this.A1N.removeCameraErrorListener(this.A1O);
        this.A0E.removeMessages(6);
        Voip.setVideoPreviewPort(null, this.A1Q);
        Voip.setVideoPreviewSize(0, 0);
    }

    public final void A1r() {
        Log.i("voip/VoipActivityV2/toggleIncallControlls");
        CallInfo A1V = A1V();
        if (!A2b(A1V) || this.A1g || this.A1X || this.A0v != null) {
            return;
        }
        this.A0E.removeMessages(3);
        boolean z = !this.A1h;
        this.A1h = z;
        if (z) {
            VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
            if (voipCallControlBottomSheet != null && !voipCallControlBottomSheet.A0W() && this.A00 == 3) {
                voipCallControlBottomSheet.A14(A0N(), "CallControlSheet");
            }
            A1p();
        } else {
            A1j();
        }
        A2F(A1V);
        A21(300L, 250L, A1V);
        if (this.A1h) {
            this.A0E.sendEmptyMessageDelayed(3, 5000L);
        }
    }

    public final void A1s() {
        Log.i("VoipActivityV2 vm unbindService");
        try {
            this.A1C.A00.obtainMessage(5, this).sendToTarget();
        } catch (IllegalArgumentException e) {
            Log.e(e);
        }
        C25L c25l = this.A1B;
        if (c25l != null) {
            c25l.A0p(this);
            this.A1B = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x001e, code lost:
        if (r14.A1T != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0109, code lost:
        if (r14.A00 == 1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0136, code lost:
        if (X.AnonymousClass029.A1Q(r14.A0m, r7) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0178, code lost:
        if (com.whatsapp.voipcalling.Voip.A0B(r1.callState) == false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1t() {
        /*
            Method dump skipped, instructions count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1t():void");
    }

    public final void A1u() {
        TextView textView = (TextView) findViewById(R.id.debug_tx_network_conditioner_param_text_view);
        if (textView != null) {
            if (Voip.isTxNetworkConditionerOn()) {
                StringBuilder A0P = C000200d.A0P("Tx network conditioner is ON !!!\n");
                A0P.append(Voip.getCurrentTxNetworkConditionerParameters());
                textView.setText(A0P.toString());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.debug_rx_network_conditioner_param_text_view);
        if (textView2 != null) {
            if (Voip.isRxNetworkConditionerOn()) {
                StringBuilder A0P2 = C000200d.A0P("Rx network conditioner is ON !!!\n");
                A0P2.append(Voip.getCurrentRxNetworkConditionerParameters());
                textView2.setText(A0P2.toString());
                textView2.setVisibility(0);
                return;
            }
            textView2.setVisibility(8);
        }
    }

    public final void A1v() {
        CallInfo A1V = A1V();
        if (A04(A1V)) {
            for (AbstractC74483dL abstractC74483dL : this.A1R.values()) {
                VideoCallParticipantView videoCallParticipantView = abstractC74483dL.A00;
                if (videoCallParticipantView != null && videoCallParticipantView.getLayoutMode() == 1) {
                    A1w();
                    C28241Qv infoByJid = A1V.getInfoByJid(abstractC74483dL.A03);
                    abstractC74483dL.A05(infoByJid);
                    abstractC74483dL.A06(infoByJid, A1V);
                    return;
                }
            }
        }
    }

    public final void A1w() {
        int i;
        float dimension;
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A19;
        videoCallParticipantViewLayout.setPipMaxRatio(this.A1b ? 0.4f : 0.225f);
        if (this.A1h) {
            if (this.A1I != null) {
                dimension = getResources().getDimension(R.dimen.call_control_bottom_sheet_btn_stub_height);
            } else {
                dimension = getResources().getDimension(R.dimen.call_footer_height);
            }
            i = (int) dimension;
        } else {
            i = 0;
        }
        videoCallParticipantViewLayout.setPipBottomOffset(i);
        this.A19.setPipTopOffset(this.A1h ? (int) getResources().getDimension(R.dimen.call_video_top_bar_height) : 0);
    }

    public final void A1x(int i) {
        String string;
        Log.i("voip/VoipActivityV2/call/accept");
        CallInfo A1V = A1V();
        if (A1V != null && A1V.callState != Voip.CallState.NONE) {
            boolean z = true;
            if (!this.A1T) {
                A1g();
                VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
                if (voipCallControlBottomSheet != null) {
                    voipCallControlBottomSheet.A14(A0N(), "CallControlSheet");
                }
                C02180Ae.A13(this.A0V, 0);
                final CallDetailsLayout callDetailsLayout = this.A12;
                if (callDetailsLayout != null) {
                    Log.i("voip/CallDetailsLayout/animateAvatarLayout");
                    if (A1V.callState == Voip.CallState.NONE) {
                        Log.i("voip/CallDetailsLayout/animateAvatarLayout return directly, no call is going on");
                    } else {
                        int i2 = callDetailsLayout.A00;
                        if (i2 == 1) {
                            C000200d.A1F(C000200d.A0P("voip/CallDetailsLayout/animateAvatarLayout return directly, avatarAnimationState: "), i2);
                        } else if (callDetailsLayout.A04.getVisibility() == 8) {
                            Log.i("voip/CallDetailsLayout/animateAvatarLayout return directly, peerAvatarLayout.getVisibility() == View.GONE ");
                        } else {
                            int height = callDetailsLayout.A0E.getHeight();
                            if (height == 0) {
                                callDetailsLayout.A0E.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            }
                            callDetailsLayout.A00 = 1;
                            final boolean z2 = A1V.videoEnabled;
                            ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[z2 ? 1 : 3];
                            if (!z2) {
                                for (int i3 = 0; i3 < callDetailsLayout.A0E.getChildCount(); i3++) {
                                    C2Zf c2Zf = (C2Zf) callDetailsLayout.A0E.getChildAt(i3);
                                    height = c2Zf.getContactPhotoLayout().getMeasuredHeight();
                                    LinearLayout contactPhotoLayout = c2Zf.getContactPhotoLayout();
                                    if (contactPhotoLayout != null) {
                                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                        scaleAnimation.setInterpolator(new DecelerateInterpolator());
                                        scaleAnimation.setDuration(125L);
                                        contactPhotoLayout.startAnimation(scaleAnimation);
                                    }
                                }
                                float f = -height;
                                objectAnimatorArr[0] = CallDetailsLayout.A00(callDetailsLayout.A0E, "translationY", f);
                                objectAnimatorArr[1] = CallDetailsLayout.A00(callDetailsLayout.A06, "translationY", f);
                                objectAnimatorArr[2] = CallDetailsLayout.A00(callDetailsLayout.A05, "translationY", f);
                            } else {
                                objectAnimatorArr[0] = CallDetailsLayout.A00(callDetailsLayout, "alpha", 0.0f);
                            }
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorArr);
                            animatorSet.start();
                            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.3ct
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationCancel(Animator animator) {
                                    super.onAnimationCancel(animator);
                                    CallDetailsLayout callDetailsLayout2 = callDetailsLayout;
                                    callDetailsLayout2.A00 = 0;
                                    callDetailsLayout2.clearAnimation();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    super.onAnimationEnd(animator);
                                    CallDetailsLayout callDetailsLayout2 = callDetailsLayout;
                                    callDetailsLayout2.A00 = 2;
                                    if (z2) {
                                        callDetailsLayout2.setVisibility(8);
                                    } else {
                                        callDetailsLayout2.A04.setVisibility(8);
                                    }
                                    callDetailsLayout2.clearAnimation();
                                }
                            });
                        }
                    }
                    VoipCallFooter voipCallFooter = this.A1J;
                    if (voipCallFooter != null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(voipCallFooter, "translationY", 0.0f);
                        ofFloat.setInterpolator(new DecelerateInterpolator());
                        ofFloat.setDuration(125L);
                        ofFloat.start();
                    }
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A1J.getLayoutParams();
                    if (layoutParams.bottomMargin != 0) {
                        layoutParams.bottomMargin = 0;
                        this.A1J.setLayoutParams(layoutParams);
                    }
                } else {
                    throw null;
                }
            } else {
                Log.w("callAccepted is true when calling acceptCall()");
            }
            this.A1T = true;
            if (this.A1B != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    boolean z3 = !this.A0y.A09();
                    z = (!A1V.videoEnabled || this.A0y.A07()) ? false : false;
                    if (z3 || z) {
                        StringBuilder sb = new StringBuilder("voip/service/accept noRecordPermission = ");
                        sb.append(z3);
                        sb.append(", noCameraPermission = ");
                        sb.append(z);
                        Log.w(sb.toString());
                        if (!z) {
                            string = getString(R.string.can_not_start_voip_call_without_record_permission);
                        } else {
                            string = z3 ? getString(R.string.can_not_start_video_call_without_mic_and_camera_permission) : getString(R.string.can_not_start_video_call_without_camera_permission);
                        }
                        this.A1B.A0a(27, string);
                        return;
                    }
                }
                this.A1B.A0K();
                if (A2a(A1V.peerJid, A1V.videoEnabled, A1V.isPeerRequestingUpgrade() ? 2 : 0)) {
                    if (Voip.A0B(A1V.callState)) {
                        this.A1B.A0r(this.A1Q, i);
                        return;
                    } else if (A1V.isPeerRequestingUpgrade()) {
                        C25L c25l = this.A1B;
                        c25l.A0X();
                        c25l.A27.setRequestedCamera2SupportLevel(c25l.A25.A05());
                        c25l.A0s.execute(RunnableC73493bj.A00);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            Log.e("voip/VoipActivityV2/call/accept voiceService is null");
        }
    }

    public final void A1y(int i) {
        Log.i("voip/VoipActivityV2/call/reject");
        CallInfo A1V = A1V();
        if (A1V != null && A1V.callState != Voip.CallState.NONE) {
            A1g();
            C25L c25l = this.A1B;
            if (c25l != null) {
                if (Voip.A0B(A1V.callState)) {
                    c25l.A0u(A1V.callId, null, i);
                } else if (!A1V.isPeerRequestingUpgrade()) {
                } else {
                    this.A1B.A0Z(0);
                }
            }
        }
    }

    public final void A1z(int i) {
        VideoCallParticipantView videoCallParticipantView;
        VoipCallFooter voipCallFooter;
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
        if (voipCallControlBottomSheet != null && (voipCallFooter = voipCallControlBottomSheet.A0T) != null) {
            voipCallFooter.A02(i);
        } else {
            this.A1J.A02(i);
            this.A0V.setRotation(i);
        }
        float f = i;
        this.A0W.setRotation(f);
        this.A0X.setRotation(f);
        this.A0O.setRotation(f);
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A19;
        for (int i2 = 0; i2 < videoCallParticipantViewLayout.getActiveChildCount(); i2++) {
            VideoCallParticipantView A01 = videoCallParticipantViewLayout.A01(i2);
            A01.A0H.setRotation(f);
            A01.A0F.setRotation(f);
            A01.A0D.setRotation(f);
        }
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A17;
        if (maximizedParticipantVideoDialogFragment == null || (videoCallParticipantView = maximizedParticipantVideoDialogFragment.A0A) == null) {
            return;
        }
        videoCallParticipantView.A0H.setRotation(f);
        videoCallParticipantView.A0F.setRotation(f);
        videoCallParticipantView.A0D.setRotation(f);
    }

    public final void A20(int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("finish", true);
        VoipErrorDialogFragment.A02(i, new InterfaceC74713di() { // from class: X.3uG
            public final /* synthetic */ boolean A01 = true;

            @Override // X.InterfaceC74713di
            public void AQn(DialogInterface dialogInterface) {
            }

            {
                VoipActivityV2.this = this;
            }

            @Override // X.InterfaceC74713di
            public void AGd(DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                if (this.A01) {
                    VoipActivityV2.this.finish();
                }
            }
        }, bundle).A14(A0N(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00f9, code lost:
        if (r22.A1h != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A21(final long r23, final long r25, final com.whatsapp.voipcalling.CallInfo r27) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A21(long, long, com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A22(Intent intent, CallInfo callInfo) {
        C000700j.A08("com.whatsapp.intent.action.ACCEPT_CALL".equals(intent.getAction()), "should only be called if intent action is ACTION_ACCEPT_INCOMING_CALL");
        String stringExtra = intent.getStringExtra("call_id");
        if (Voip.A09(callInfo)) {
            if (!callInfo.callId.equals(stringExtra)) {
                C28231Qu c28231Qu = callInfo.callWaitingInfo;
                if (c28231Qu.A01 != 1 || !c28231Qu.A04.equals(stringExtra)) {
                    return;
                }
            }
            this.A1T = true;
            this.A01 = 0;
            if (this.A1B != null) {
                A1x(intent.getIntExtra("call_ui_action", 0));
            } else {
                this.A1S = true;
            }
        }
    }

    public final void A23(Intent intent, CallInfo callInfo) {
        C000700j.A08(A1p.equals(intent.getAction()), "should only be called if intent action is ACTION_SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL");
        if (callInfo.callState == Voip.CallState.ACTIVE) {
            String stringExtra = intent.getStringExtra("alertMessage");
            NonActivityDismissDialogFragment nonActivityDismissDialogFragment = new NonActivityDismissDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("text", stringExtra);
            bundle.putBoolean("dismiss", false);
            nonActivityDismissDialogFragment.A0P(bundle);
            nonActivityDismissDialogFragment.A14(A0N(), "VoipAlertDialog");
            return;
        }
        Log.i("voip/VoipActivityV2/new-intent call is gone, ignore the request to show alert message");
        finish();
    }

    public void A24(UserJid userJid) {
        C000700j.A01();
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/videoRenderStarted ");
        sb.append(userJid);
        Log.i(sb.toString());
        A1W(userJid).A04();
        A2I(A1V());
        A1m();
    }

    public final void A25(UserJid userJid) {
        if (this.A1c) {
            new ReplyWithMessageDialogFragment(userJid).A14(A0N(), null);
        }
    }

    public final void A26(UserJid userJid) {
        if (((ActivityC02290Ap) this).A0F.A00.getInt("switch_to_video_call_confirmation_dialog_count", 0) < 5) {
            AUh(new SwitchConfirmationFragment());
        } else if (!A2a(userJid, true, 1)) {
        } else {
            C25L c25l = this.A1B;
            if (c25l == null) {
                throw null;
            }
            c25l.A0J();
        }
    }

    public /* synthetic */ void A27(UserJid userJid) {
        ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, this.A0o.A0A(userJid)));
        if (Build.VERSION.SDK_INT >= 26) {
            A2d(A1V());
        }
    }

    public void A28(C28241Qv c28241Qv) {
        Log.i("VoipActivityV2/restartCameraPreview ");
        this.A0E.removeMessages(12);
        A1q();
        A2N(this.A1A, c28241Qv);
    }

    public final void A29(C28241Qv c28241Qv) {
        A2N(this.A1A, c28241Qv);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ac, code lost:
        if (r9.participants.size() < r6.A07(X.C01C.A34)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00b2, code lost:
        if (r9.isEitherSideRequestingUpgrade() == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2A(com.whatsapp.voipcalling.CallInfo r9) {
        /*
            r8 = this;
            com.whatsapp.voipcalling.Voip$CallState r1 = r8.A1X(r9)
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.NONE
            if (r1 == r0) goto Lda
            boolean r0 = com.whatsapp.voipcalling.Voip.A0B(r1)
            if (r0 != 0) goto Lda
            com.whatsapp.voipcalling.VoipCallControlBottomSheet r0 = r8.A1I
            r4 = 0
            if (r0 == 0) goto L86
            com.whatsapp.voipcalling.VoipCallFooter r3 = r0.A0T
            if (r3 == 0) goto L86
            X.25L r2 = r8.A1B
            if (r2 == 0) goto L84
            X.3dY r0 = r2.A23
            int r1 = r0.A00
        L1f:
            if (r2 == 0) goto L82
            boolean r0 = r2.A0w()
        L25:
            r3.A03(r9, r1, r0)
        L28:
            boolean r0 = r9.videoEnabled
            android.widget.ImageButton r1 = r8.A0V
            if (r0 == 0) goto L77
            r0 = 2131890467(0x7f121123, float:1.9415627E38)
            java.lang.String r0 = r8.getString(r0)
            r1.setContentDescription(r0)
        L38:
            android.widget.ImageButton r0 = r8.A0W
            int r0 = r0.getVisibility()
            r7 = 8
            if (r0 != 0) goto Lb7
            android.widget.ImageButton r5 = r8.A0W
            X.01B r6 = r8.A0m
            boolean r0 = X.AnonymousClass029.A1O(r6)
            r3 = 1
            if (r0 != 0) goto Lae
            com.whatsapp.voipcalling.Voip$CallState r1 = r9.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.ACTIVE
            if (r1 != r0) goto Ld8
            java.util.Map r0 = r9.participants
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.1Qv r0 = (X.C28241Qv) r0
            int r0 = r0.A01
            if (r0 != r3) goto L5e
            int r1 = r1 + 1
            goto L5e
        L77:
            r0 = 2131890594(0x7f1211a2, float:1.9415884E38)
            java.lang.String r0 = r8.getString(r0)
            r1.setContentDescription(r0)
            goto L38
        L82:
            r0 = 0
            goto L25
        L84:
            r1 = 0
            goto L1f
        L86:
            X.25L r3 = r8.A1B
            if (r3 == 0) goto L98
            com.whatsapp.voipcalling.VoipCallFooter r2 = r8.A1J
            X.3dY r0 = r3.A23
            int r1 = r0.A00
            boolean r0 = r3.A0w()
            r2.A03(r9, r1, r0)
            goto L28
        L98:
            com.whatsapp.voipcalling.VoipCallFooter r0 = r8.A1J
            r0.A03(r9, r4, r4)
            goto L28
        L9e:
            if (r1 >= r7) goto Ld8
            java.util.Map r0 = r9.participants
            int r1 = r0.size()
            X.039 r0 = X.C01C.A34
            int r0 = r6.A07(r0)
            if (r1 >= r0) goto Ld8
        Lae:
            boolean r0 = r9.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto Ld8
        Lb4:
            X.C02180Ae.A15(r5, r3)
        Lb7:
            android.widget.ImageButton r2 = r8.A0X
            X.01B r0 = r8.A0m
            boolean r0 = X.AnonymousClass029.A1O(r0)
            if (r0 == 0) goto Lcb
            com.whatsapp.voipcalling.Voip$CallState r1 = r9.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.ACTIVE
            if (r1 == r0) goto Lcb
            boolean r0 = r8.A1T
            if (r0 == 0) goto Ld5
        Lcb:
            boolean r0 = r9.enableAudioVideoSwitch()
            if (r0 == 0) goto Ld5
        Ld1:
            r2.setVisibility(r4)
            return
        Ld5:
            r4 = 8
            goto Ld1
        Ld8:
            r3 = 0
            goto Lb4
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A2A(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A2B(CallInfo callInfo) {
        if (!callInfo.callId.equals(this.A1Q)) {
            return;
        }
        this.A1a = false;
        this.A0E.removeMessages(10);
        if (callInfo.callState == Voip.CallState.NONE || callInfo.callEnding) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("voip/VoipActivityV2/videoStateChanged self_video_state: ");
        A0P.append(callInfo.self.A04);
        A0P.append(", peer_video_state: ");
        A0P.append(callInfo.getDefaultPeerInfo() == null ? "null" : Integer.valueOf(callInfo.getDefaultPeerInfo().A04));
        Log.i(A0P.toString());
        this.A1X = false;
        this.A0E.removeMessages(3);
        this.A12.clearAnimation();
        this.A1J.clearAnimation();
        if (callInfo.isEitherSideRequestingUpgrade()) {
            this.A1T = false;
        }
        A2H(callInfo);
        A2I(callInfo);
    }

    public final void A2C(CallInfo callInfo) {
        C28241Qv c28241Qv;
        C25L c25l = this.A1B;
        if (c25l != null && c25l.A13(callInfo.callId) && callInfo.callState == Voip.CallState.ACTIVE && (c28241Qv = callInfo.self) != null && c28241Qv.A09) {
            Log.i("voip/VoipActivityV2/checkToShowResumeCallButton");
            A2Q(getString(R.string.voip_on_hold), getString(R.string.voip_resume), this.A0H, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0038, code lost:
        if (r15.isEitherSideRequestingUpgrade() == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A2D(final com.whatsapp.voipcalling.CallInfo r15) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A2D(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A2E(CallInfo callInfo) {
        C000700j.A08(A04(callInfo), "can be called only for video call");
        for (AbstractC74483dL abstractC74483dL : this.A1R.values()) {
            C28241Qv infoByJid = callInfo.getInfoByJid(abstractC74483dL.A03);
            abstractC74483dL.A05(infoByJid);
            abstractC74483dL.A06(infoByJid, callInfo);
            MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A17;
            if (maximizedParticipantVideoDialogFragment != null) {
                maximizedParticipantVideoDialogFragment.A18(infoByJid, callInfo);
            }
        }
    }

    public final void A2F(CallInfo callInfo) {
        VoipCallControlBottomSheet voipCallControlBottomSheet;
        if (callInfo == null) {
            return;
        }
        Voip.CallState callState = callInfo.callState;
        boolean z = callState != Voip.CallState.NONE;
        if (this.A0J != null && this.A1J != null) {
            Voip.CallState callState2 = this.A1D;
            this.A1D = callState;
            View view = this.A0K;
            if (view != null) {
                view.setVisibility(8);
            }
            if (!this.A1h) {
                View view2 = this.A0I;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            } else if (Voip.A0B(callState) && !this.A1T) {
                Log.i("voip/VoipActivityV2/updateButtonStates/answerCallView/visible RECEIVED_CALL");
                if (callInfo.isGroupCall && (voipCallControlBottomSheet = this.A1I) != null) {
                    voipCallControlBottomSheet.A14(A0N(), "CallControlSheet");
                    return;
                } else {
                    A2D(callInfo);
                    return;
                }
            } else if (callInfo.isPeerRequestingUpgrade() && !callInfo.self.A01() && !this.A1T) {
                Log.i("voip/VoipActivityV2/updateButtonStates/answerCallView/visible kVideoStateUpgradeRequest");
                A2D(callInfo);
                return;
            } else {
                Log.i("voip/VoipActivityV2/updateButtonStates");
                View view3 = this.A0I;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                VoipCallControlBottomSheet voipCallControlBottomSheet2 = this.A1I;
                if (voipCallControlBottomSheet2 != null) {
                    voipCallControlBottomSheet2.A14(A0N(), "CallControlSheet");
                    return;
                }
                if (z && Voip.A0B(callState2) && this.A1J.getVisibility() != 0) {
                    Log.i("voip/VoipActivityV2/updateButtonStates/animateButtonIn");
                    C02180Ae.A12(this.A0V, 0);
                    VoipCallFooter voipCallFooter = this.A1J;
                    C02180Ae.A12(voipCallFooter.A08, 100);
                    if (voipCallFooter.A00.isShown()) {
                        C02180Ae.A12(voipCallFooter.A04, 100);
                    }
                    C02180Ae.A12(voipCallFooter.A05, 150);
                    C02180Ae.A12(voipCallFooter.A07, 200);
                    if (callInfo.enableAudioVideoSwitch()) {
                        C02180Ae.A12(voipCallFooter.A09, 250);
                    } else {
                        voipCallFooter.A03.setVisibility(8);
                    }
                    if (voipCallFooter.A02.getVisibility() == 0) {
                        C02180Ae.A12(voipCallFooter.A06, 300);
                    }
                }
                this.A0J.setVisibility(0);
                this.A1J.setVisibility(0);
                this.A1J.setTranslationY(0.0f);
                this.A0V.setVisibility(z ? 0 : 4);
                return;
            }
        }
        Log.e("voip/VoipActivityV2/updateButtonStates/null");
    }

    public final void A2G(CallInfo callInfo) {
        C000700j.A01();
        if (this.A08 == 0 || this.A07 == 0 || this.A1a || this.A12.A00 == 1 || callInfo == null || callInfo.callEnding || callInfo.callState == Voip.CallState.NONE || callInfo.self == null) {
            return;
        }
        String str = null;
        switch (A1X(callInfo).ordinal()) {
            case 0:
            case 7:
                return;
            case 1:
                C25L c25l = this.A1B;
                if (c25l != null && c25l.A14) {
                    str = getString(R.string.peer_in_another_call, this.A0r.A08(this.A0o.A0A(callInfo.peerJid), false));
                    break;
                } else {
                    boolean z = callInfo.isJoinableGroupCall;
                    int i = R.string.voip_call_outgoing;
                    if (z) {
                        i = R.string.voip_joinable_waiting_for_others;
                    }
                    str = getString(i);
                    break;
                }
            case 2:
                C25L c25l2 = this.A1B;
                if (c25l2 == null || !c25l2.A14) {
                    str = getString(R.string.voip_call_outgoing_peer_ringing);
                    break;
                }
                break;
            case 3:
            case 9:
                if (callInfo.isGroupCall) {
                    if (!callInfo.videoEnabled) {
                        str = getString(R.string.group_voip_call_label);
                        break;
                    } else {
                        str = getString(R.string.group_video_call_label);
                        break;
                    }
                } else if (!callInfo.videoEnabled) {
                    str = getString(R.string.voip_call_label);
                    break;
                } else {
                    str = getString(R.string.video_call_label);
                    break;
                }
            case 4:
            case 5:
                str = getString(R.string.voip_connecting);
                break;
            case 6:
                if (AnonymousClass029.A1Q(this.A0m, callInfo)) {
                    str = getString(R.string.voip_joinable_waiting_for_others);
                    break;
                } else if (callInfo.videoEnabled) {
                    A1d();
                    C000700j.A08(A04(callInfo), "can be called only for video call");
                    for (AbstractC74483dL abstractC74483dL : this.A1R.values()) {
                        C28241Qv infoByJid = callInfo.getInfoByJid(abstractC74483dL.A03);
                        abstractC74483dL.A06(infoByJid, callInfo);
                        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A17;
                        if (maximizedParticipantVideoDialogFragment != null) {
                            maximizedParticipantVideoDialogFragment.A18(infoByJid, callInfo);
                        }
                    }
                    A2C(callInfo);
                    if (!this.A1Y) {
                        long j = this.A0A;
                        if (j != 0) {
                            if (SystemClock.uptimeMillis() - j > 3000) {
                                this.A1Y = true;
                                return;
                            } else {
                                A2Q(getString(R.string.voip_android_weak_wifi_network_switch_description), null, null, false);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } else {
                    if (callInfo.isCallOnHold()) {
                        str = getString(R.string.voip_on_hold);
                    } else if (!callInfo.isGroupCall) {
                        C28241Qv defaultPeerInfo = callInfo.getDefaultPeerInfo();
                        if (defaultPeerInfo != null) {
                            str = A1Z(defaultPeerInfo, callInfo);
                            if (str == null) {
                                str = A1a(defaultPeerInfo, callInfo, true);
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (!this.A1Y) {
                        long j2 = this.A0A;
                        if (j2 != 0) {
                            if (SystemClock.uptimeMillis() - j2 > 3000) {
                                this.A1Y = true;
                            } else {
                                str = getString(R.string.voip_android_weak_wifi_network_switch_description);
                            }
                        }
                    }
                    if (str == null) {
                        str = AnonymousClass029.A0g(((ActivityC02310Ar) this).A01, callInfo.callDuration / 1000);
                    }
                    if (callInfo.isGroupCall) {
                        CallPictureGrid callPictureGrid = this.A15;
                        callPictureGrid.setCallInfo(callInfo);
                        C84473tn c84473tn = callPictureGrid.A04;
                        ((AbstractC04890Mh) c84473tn).A01.A04(0, c84473tn.A0C(), c84473tn.A07);
                        break;
                    }
                }
                break;
            case 8:
            default:
                C000700j.A08(false, "voip/VoipActivityV2/updateCallStatusBar/unknownCallState");
                break;
        }
        this.A12.A03(str);
        A2C(callInfo);
    }

    public final void A2H(CallInfo callInfo) {
        if (!callInfo.videoEnabled) {
            A2U(true);
        } else if (!this.A1f) {
            C74593dW c74593dW = this.A1H;
            if (c74593dW == null) {
                c74593dW = new C74593dW(this, this);
                this.A1H = c74593dW;
            }
            if (c74593dW.canDetectOrientation()) {
                Log.i("voip/VoipActivityV2/enableOrientationListener");
                this.A1H.enable();
                this.A1f = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x01de, code lost:
        if (r15.isGroupCallEnabled == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01fa, code lost:
        if (r14.A1T != false) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A2I(com.whatsapp.voipcalling.CallInfo r15) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A2I(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:356:0x01f5, code lost:
        if (r4 > 1) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:367:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x035d A[LOOP:4: B:432:0x0357->B:434:0x035d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A2J(com.whatsapp.voipcalling.CallInfo r14) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A2J(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A2K(CallInfo callInfo) {
        C000700j.A08(A04(callInfo), "can be called only for video call");
        for (AbstractC74483dL abstractC74483dL : this.A1R.values()) {
            C28241Qv infoByJid = callInfo.getInfoByJid(abstractC74483dL.A03);
            VideoCallParticipantView videoCallParticipantView = abstractC74483dL.A00;
            if (videoCallParticipantView != null && videoCallParticipantView.A09() && !videoCallParticipantView.A0A()) {
                abstractC74483dL.A06(infoByJid, callInfo);
            }
        }
    }

    public void A2L(CallInfo callInfo, int i) {
        if (i == 1) {
            this.A1T = false;
        } else if (i == 3) {
            if (!callInfo.videoEnabled) {
                return;
            }
            A2N(this.A1A, callInfo.self);
        } else if (i != 4) {
        } else {
            this.A1Q = callInfo.callId;
            Voip.startVideoCaptureStream();
            A2I(callInfo);
        }
    }

    public void A2M(CallInfo callInfo, int i, boolean z) {
        VoipCallFooter voipCallFooter;
        C000700j.A01();
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
        if (voipCallControlBottomSheet == null || (voipCallFooter = voipCallControlBottomSheet.A0T) == null) {
            this.A1J.A03(callInfo, i, z);
        } else {
            voipCallFooter.A03(callInfo, i, z);
        }
    }

    public final void A2N(AbstractC74483dL abstractC74483dL, C28241Qv c28241Qv) {
        this.A0E.removeMessages(6);
        CallInfo A1V = A1V();
        if (A1V != null) {
            if ((A1V.callState == Voip.CallState.RECEIVED_CALL && this.A1i) || !this.A1e || this.A0y.A02("android.permission.CAMERA") != 0) {
                return;
            }
            StringBuilder A0P = C000200d.A0P("voip/VoipActivityV2/startCameraPreview/setting preview surface to presenter ");
            A0P.append(abstractC74483dL.A07);
            A0P.append(" retry: ");
            int i = this.A01;
            this.A01 = i + 1;
            C000200d.A1F(A0P, i);
            if (Voip.setVideoPreviewPort(abstractC74483dL.A01, A1V.callId) == 0) {
                VideoPort videoPort = abstractC74483dL.A01;
                Point point = new Point(0, 0);
                if (videoPort != null) {
                    point = videoPort.getWindowSize();
                }
                Voip.setVideoPreviewSize(point.x, point.y);
                this.A01 = 0;
                abstractC74483dL.A05(c28241Qv);
                this.A1N.addCameraErrorListener(this.A1O);
            } else if (this.A01 >= 10) {
                C25L c25l = this.A1B;
                if (c25l == null) {
                    return;
                }
                c25l.A0b(15, null);
            } else {
                this.A0E.sendEmptyMessageDelayed(6, 500L);
            }
        }
    }

    public void A2O(Voip.CallState callState, CallInfo callInfo) {
        String A1Y;
        if (callInfo == null) {
            Log.w("voip/VoipActivityV2/callStateChanged info == NULL finishing current activity");
            finish();
        } else if (!callInfo.callId.equals(this.A1Q)) {
        } else {
            Voip.CallState A1X = A1X(callInfo);
            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/callStateChanged from ");
            sb.append(callState);
            sb.append(" to ");
            sb.append(A1X);
            Log.i(sb.toString());
            if (A1X != Voip.CallState.NONE && A1X != Voip.CallState.ACTIVE_ELSEWHERE) {
                if (callInfo.videoEnabled && A1X == Voip.CallState.ACTIVE && this.A1i) {
                    A2N(this.A1A, callInfo.self);
                }
                switch (callInfo.callState.ordinal()) {
                    case 0:
                        setVolumeControlStream(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        setVolumeControlStream(0);
                        break;
                    case 3:
                        setVolumeControlStream(2);
                        break;
                }
                A2I(callInfo);
                return;
            }
            DialogFragment dialogFragment = this.A0h;
            if (dialogFragment != null) {
                dialogFragment.A11();
                this.A0h = null;
            }
            getWindow().clearFlags(128);
            int i = callInfo.callResult;
            String str = this.A1P;
            if (str != null) {
                C000200d.A1N(C000200d.A0P("voip/VoipActivityV2/callStateChanged state == NONE showing text: "), str);
                if (this.A1c) {
                    A1c();
                } else {
                    if (this.A0j.A00) {
                        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
                        if (c018508q.A00 != null) {
                            c018508q.A0I(this.A1P, 1);
                        }
                    }
                    C25L c25l = this.A1B;
                    if (c25l != null) {
                        String str2 = this.A1P;
                        C000200d.A14("voip/showCallFailedMessage ", str2);
                        Context context = c25l.A1F;
                        Intent A02 = A02(context, null, Boolean.valueOf(!c25l.A1H.A00), null, Boolean.TRUE, null);
                        A02.putExtra("showCallFailedMessage", str2);
                        context.startActivity(A02);
                    } else {
                        Log.w("can not show call failed message because voice service is null.");
                    }
                }
            } else if ((callState == Voip.CallState.CALLING || callState == Voip.CallState.REJOINING || callState == Voip.CallState.PRE_ACCEPT_RECEIVED || (callState == Voip.CallState.ACTIVE && i != 1)) && !this.A1W && this.A1B != null) {
                C000200d.A0q("voip/VoipActivityV2/callStateChanged state == NONE showing call failed screen, result=", i);
                if (i == 2 || i == 17 || (i == 4 && callState == Voip.CallState.REJOINING)) {
                    if (callState == Voip.CallState.REJOINING) {
                        if (callInfo.isEndedByMe) {
                            finish();
                            return;
                        }
                        A1Y = getString(R.string.voip_joinable_call_ended_while_joining_title);
                    } else if (i == 17) {
                        A1Y = getString(R.string.voip_unavailable);
                    } else if (i == 2) {
                        A1Y = getString(R.string.voip_declined);
                    } else {
                        A1Y = A1Y(callInfo.peerJid, i);
                    }
                    AnonymousClass088.A1C(this, this.A0w, A1Y);
                    if (this.A0O.getVisibility() == 0) {
                        A2Q(A1Y, null, null, false);
                    } else {
                        this.A12.A03(A1Y);
                    }
                    ((Vibrator) getSystemService("vibrator")).vibrate(500L);
                    this.A0E.removeMessages(9);
                    this.A0E.sendEmptyMessageDelayed(9, 500L);
                } else if (callState != Voip.CallState.REJOINING) {
                    UserJid userJid = callInfo.peerJid;
                    boolean z = callInfo.videoEnabled;
                    if (userJid == null) {
                        Log.i("VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null jid");
                        finish();
                    } else {
                        A1s();
                        String A1Y2 = A1Y(userJid, i);
                        this.A12.A03(A1Y2);
                        if (A1Y2 != null) {
                            AnonymousClass088.A1C(this, this.A0w, A1Y2);
                        }
                        A19("CallControlSheet");
                        this.A1J.setVisibility(8);
                        this.A0V.setVisibility(8);
                        if (this.A0K == null) {
                            ViewStub viewStub = (ViewStub) findViewById(R.id.call_failed_btns_stub);
                            StringBuilder sb2 = new StringBuilder("voip/VoipActivityV2/showCallFailedScreen found callFailedButtonsStub:");
                            sb2.append(viewStub);
                            Log.i(sb2.toString());
                            this.A0K = viewStub.inflate();
                        }
                        View findViewById = findViewById(R.id.cancel_call_back_btn);
                        ImageView imageView = (ImageView) findViewById(R.id.call_back_btn);
                        View view = this.A0K;
                        if (z) {
                            view.setBackgroundColor(getResources().getColor(R.color.video_call_text_background));
                            imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_call_accept_video));
                            this.A15.setAlpha(1.0f);
                        } else {
                            view.setBackgroundColor(0);
                            imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_call_accept_voice));
                            this.A15.setAlpha(0.54901963f);
                        }
                        Log.i("VoipActivityV2 vm showing call failed screen");
                        View.OnClickListener onClickListener = this.A0F;
                        if (onClickListener == null) {
                            Log.i("VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null call back button click listener");
                            finish();
                        } else {
                            imageView.setOnClickListener(onClickListener);
                            findViewById.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 30));
                            this.A0K.setVisibility(0);
                            C02180Ae.A12(imageView, 100);
                            C02180Ae.A12(findViewById, 100);
                        }
                    }
                } else {
                    finish();
                }
            } else if (callState == Voip.CallState.ACCEPT_SENT && i == 10 && this.A1B.A2G == 26) {
                A20(7);
            } else if (callState == Voip.CallState.ACCEPT_SENT && callInfo.isGroupCall && AnonymousClass029.A1N(this.A0m) && !callInfo.isEndedByMe && callInfo.callResult == 10) {
                A20(8);
            } else {
                if (this.A1b) {
                    ((ActivityC02290Ap) this).A0A.A07(R.string.voip_android_pip_dismissed_for_call_ended, 1);
                }
                Log.i("voip/VoipActivityV2/callStateChanged state == NONE finishing current activity");
                finish();
            }
            C28231Qu c28231Qu = callInfo.callWaitingInfo;
            if (c28231Qu.A01 == 1) {
                this.A1Q = c28231Qu.A04;
            }
            this.A1T = false;
        }
    }

    public void A2P(VoipCallFooter voipCallFooter, UserJid userJid) {
        voipCallFooter.setMuteButtonClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 29));
        voipCallFooter.setToggleVideoButtonClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 28));
        voipCallFooter.setChatButtonClickListener(new ViewOnClickEBaseShape1S0200000_I0_1(this, userJid, 4));
        voipCallFooter.setSpeakerButtonClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 24));
        voipCallFooter.setBluetoothButtonClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 20));
        voipCallFooter.setEndCallButtonClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 27));
    }

    public final void A2Q(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener, boolean z) {
        this.A0c.setText(charSequence);
        this.A0O.setVisibility(0);
        this.A0c.setCompoundDrawables(null, z ? this.A0D : null, null, null);
        if (charSequence2 == null) {
            this.A0O.setBackground(z ? this.A0C : null);
            this.A0N.setVisibility(8);
            this.A0b.setVisibility(8);
            return;
        }
        C000700j.A08(onClickListener != null, "buttonOnClickListener must be set together with buttonText");
        this.A0O.setBackground(this.A0B);
        this.A0N.setVisibility(0);
        this.A0b.setVisibility(0);
        this.A0b.setText(charSequence2);
        this.A0b.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I0_1(this, onClickListener, 5));
    }

    public final void A2R(String str) {
        this.A0E.removeMessages(7);
        this.A0E.removeMessages(8);
        DialogFragment dialogFragment = this.A0g;
        if (dialogFragment != null && dialogFragment.A0W()) {
            dialogFragment.A11();
            this.A0g = null;
        }
        NonActivityDismissDialogFragment nonActivityDismissDialogFragment = new NonActivityDismissDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("text", str);
        bundle.putBoolean("dismiss", true);
        nonActivityDismissDialogFragment.A0P(bundle);
        this.A0g = nonActivityDismissDialogFragment;
        this.A0E.sendEmptyMessage(8);
        this.A0E.sendEmptyMessageDelayed(7, 6000L);
    }

    public final void A2S(String str, int i) {
        if (AnonymousClass029.A1O(this.A0m)) {
            ((ActivityC02290Ap) this).A0A.A02(str, i).show();
            return;
        }
        int[] iArr = new int[2];
        findViewById(R.id.call_btns).getLocationOnScreen(iArr);
        int height = getWindow().getDecorView().getHeight() - iArr[1];
        Toast A01 = ((ActivityC02290Ap) this).A0A.A01(str, i);
        A01.setGravity(80, 0, height);
        A01.show();
    }

    public void A2T(boolean z) {
        C000700j.A01();
        Window window = getWindow();
        View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            Log.i("voip/voipactivity/ear-near. changing visibility of the window.");
            if (childAt.getVisibility() == 0) {
                attributes.flags |= 1024;
                attributes.screenBrightness = 0.1f;
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                childAt.setVisibility(4);
                window.setAttributes(attributes);
            }
            this.A0E.removeMessages(2);
            this.A0E.sendEmptyMessageDelayed(2, 3000L);
            return;
        }
        Log.i("voip/voipactivity/ear-far. changing visibility of the window.");
        if (childAt.getVisibility() == 4) {
            attributes.flags &= -1025;
            attributes.screenBrightness = -1.0f;
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-3));
            childAt.setVisibility(0);
            window.setAttributes(attributes);
        }
        this.A0E.removeMessages(2);
        CallInfo A1V = A1V();
        if (AnonymousClass029.A1O(this.A0m) || this.A1B == null || A1V == null || A1V.bytesReceived != 0) {
            return;
        }
        Voip.CallState callState = A1V.callState;
        if (callState != Voip.CallState.ACTIVE && callState != Voip.CallState.ACCEPT_SENT && callState != Voip.CallState.ACCEPT_RECEIVED) {
            return;
        }
        A2S(getString(R.string.voip_connecting), 1);
    }

    public final void A2U(boolean z) {
        if (!this.A1f || this.A1H == null) {
            return;
        }
        Log.i("voip/VoipActivityV2/disableOrientationListener");
        this.A1H.disable();
        this.A1f = false;
        if (z) {
            A1z(0);
        }
    }

    public final void A2V(boolean z) {
        Dialog dialog;
        Window window = getWindow();
        if (z) {
            window.addFlags(524288);
        } else {
            window.clearFlags(524288);
        }
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
        if (voipCallControlBottomSheet == null || (dialog = ((DialogFragment) voipCallControlBottomSheet).A03) == null || dialog.getWindow() == null) {
            return;
        }
        if (z) {
            ((DialogFragment) voipCallControlBottomSheet).A03.getWindow().addFlags(524288);
        } else {
            ((DialogFragment) voipCallControlBottomSheet).A03.getWindow().clearFlags(524288);
        }
    }

    public final void A2W(boolean z) {
        CallInfo A1V;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0S.getLayoutParams();
        if (this.A1I != null && (A1V = A1V()) != null && ((A1V.callState != Voip.CallState.ACTIVE && !this.A1T) || AnonymousClass029.A1Q(this.A0m, A1V))) {
            this.A0S.setVisibility(8);
        } else if (z) {
            layoutParams.height = (int) getResources().getDimension(R.dimen.call_video_top_bar_height);
            this.A0S.setLayoutParams(layoutParams);
            View view = this.A0S;
            view.setPadding(view.getPaddingLeft(), this.A06, this.A0S.getPaddingRight(), this.A0S.getPaddingBottom());
            this.A0S.setBackgroundResource(R.drawable.video_call_header_background);
            this.A0X.setImageResource(R.drawable.call_minimize_shadow);
            this.A0W.setImageResource(R.drawable.call_add_participant_shadow);
            this.A0Y.setImageResource(R.drawable.ic_voip_e2ee_padlock_shadow);
            this.A0Y.setImageAlpha(255);
            this.A0e.setTextColor(C02160Ac.A00(this, R.color.white_alpha_80));
            this.A0e.setShadowLayer(10.0f, 0.0f, 0.0f, C02160Ac.A00(this, R.color.black_alpha_50));
        } else {
            layoutParams.height = (int) getResources().getDimension(R.dimen.call_voice_top_bar_height);
            this.A0S.setLayoutParams(layoutParams);
            View view2 = this.A0S;
            view2.setPadding(view2.getPaddingLeft(), 0, this.A0S.getPaddingRight(), this.A0S.getPaddingBottom());
            this.A0Y.setImageResource(R.drawable.ic_voip_e2ee_padlock_flat);
            this.A0Y.setImageAlpha(153);
            this.A0e.setTextColor(C02160Ac.A00(this, R.color.white_alpha_60));
            this.A0e.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.A0X.setImageResource(R.drawable.call_minimize_flat);
            this.A0W.setImageResource(R.drawable.call_add_participant_flat);
            this.A0S.setVisibility(0);
        }
    }

    public final boolean A2X() {
        if (Build.VERSION.SDK_INT < 26 || !this.A0w.A0H.A00.getPackageManager().hasSystemFeature("android.software.picture_in_picture") || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        try {
            return ((AppOpsManager) getSystemService("appops")).checkOp("android:picture_in_picture", Process.myUid(), getPackageName()) == 0;
        } catch (SecurityException e) {
            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/isPictureInPictureAllowed");
            sb.append(e);
            Log.w(sb.toString());
            return false;
        }
    }

    public boolean A2Y(View.OnClickListener onClickListener, View view) {
        Drawable colorDrawable;
        Log.i("voip/VoipActivityV2/videoParticipantView/onLongClick");
        if (!(view instanceof VideoCallParticipantView)) {
            C000700j.A08(false, "long click on non VideoCallParticipantView");
            return false;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        VideoCallParticipantView videoCallParticipantView = (VideoCallParticipantView) view;
        final UserJid jid = videoCallParticipantView.getJid();
        CallInfo A1V = A1V();
        boolean z = true;
        if (jid != null) {
            if (A1V != null && videoCallParticipantView.A09()) {
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A17;
                if (maximizedParticipantVideoDialogFragment != null) {
                    maximizedParticipantVideoDialogFragment.A19(true);
                }
                DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.3cd
                    {
                        VoipActivityV2.this = this;
                    }

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        VoipActivityV2 voipActivityV2 = VoipActivityV2.this;
                        UserJid userJid = jid;
                        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment2 = voipActivityV2.A17;
                        if (maximizedParticipantVideoDialogFragment2 != null && ((DialogFragment) maximizedParticipantVideoDialogFragment2).A03 == dialogInterface) {
                            voipActivityV2.A17 = null;
                        }
                        if (voipActivityV2.A1R.containsKey(userJid)) {
                            ((AbstractC74483dL) voipActivityV2.A1R.get(userJid)).A04();
                        }
                    }
                };
                int i = 2;
                int[] iArr = new int[2];
                videoCallParticipantView.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int width = videoCallParticipantView.getWidth();
                int height = videoCallParticipantView.getHeight();
                if (!C74733dl.A00 && Build.VERSION.SDK_INT >= 21) {
                    Bitmap cachedViewBitmap = this.A19.getCachedViewBitmap();
                    Canvas canvas = new Canvas(cachedViewBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(new LightingColorFilter(-10066330, 0));
                    for (AbstractC74483dL abstractC74483dL : this.A1R.values()) {
                        Bitmap A00 = abstractC74483dL.A00();
                        if (A00 != null && abstractC74483dL.A00 != null) {
                            int[] iArr2 = new int[i];
                            int[] iArr3 = new int[i];
                            this.A19.getLocationOnScreen(iArr3);
                            VideoCallParticipantView videoCallParticipantView2 = abstractC74483dL.A00;
                            videoCallParticipantView2.getLocationOnScreen(iArr2);
                            iArr2[0] = iArr2[0] - iArr3[0];
                            int i4 = iArr2[1] - iArr3[1];
                            iArr2[1] = i4;
                            int i5 = iArr2[0];
                            canvas.drawBitmap(A00, (Rect) null, new Rect(i5, i4, videoCallParticipantView2.getWidth() + i5, videoCallParticipantView2.getHeight() + iArr2[1]), paint);
                            A00.recycle();
                            i = 2;
                        }
                    }
                    FilterUtils.blurNative(cachedViewBitmap, getResources().getDimensionPixelSize(R.dimen.maximized_video_call_background_blur_radius), i);
                    colorDrawable = new BitmapDrawable(getResources(), cachedViewBitmap);
                } else {
                    colorDrawable = new ColorDrawable(-16777216);
                }
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment2 = new MaximizedParticipantVideoDialogFragment(i2, i3, width, height, colorDrawable, onDismissListener, onClickListener, new RunnableEBaseShape7S0100000_I0_7(this, 43));
                this.A17 = maximizedParticipantVideoDialogFragment2;
                maximizedParticipantVideoDialogFragment2.A0B = jid != this.A1A.A03 ? new C84853uS(this, maximizedParticipantVideoDialogFragment2, jid) : new C84863uT(this, "max_preview", maximizedParticipantVideoDialogFragment2, jid);
                if (this.A1h) {
                    this.A1h = false;
                    A1j();
                    A21(300L, 250L, A1V);
                    VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
                    if (voipCallControlBottomSheet != null) {
                        voipCallControlBottomSheet.A1A();
                        return true;
                    }
                    return true;
                }
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment3 = this.A17;
                if (maximizedParticipantVideoDialogFragment3.A0W()) {
                    return true;
                }
                maximizedParticipantVideoDialogFragment3.A14(A0N(), "maximized_video");
                return true;
            }
        } else if (A1V != null) {
            z = false;
        }
        C000700j.A08(z, "null jid or callinfo on long clicked VideoCallParticipantView");
        return false;
    }

    public final boolean A2Z(UserJid userJid) {
        CallInfo A1V = A1V();
        if (this.A1B == null || A1V == null || A1V.callState == Voip.CallState.NONE || !this.A1c) {
            return false;
        }
        return userJid == null || A1V.participants.containsKey(userJid);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001c, code lost:
        if (r8.A0y.A02("android.permission.CAMERA") == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A2a(com.whatsapp.jid.UserJid r9, boolean r10, int r11) {
        /*
            r8 = this;
            r8.A1f()
            X.02F r1 = r8.A0y
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = r1.A02(r0)
            r6 = 1
            r5 = 0
            r7 = 0
            if (r0 == 0) goto L11
            r7 = 1
        L11:
            if (r10 == 0) goto L1e
            X.02F r1 = r8.A0y
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r1.A02(r0)
            r4 = 1
            if (r0 != 0) goto L22
        L1e:
            r4 = 0
            if (r7 != 0) goto L22
            return r6
        L22:
            com.whatsapp.voipcalling.PermissionDialogFragment r3 = new com.whatsapp.voipcalling.PermissionDialogFragment
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r9.getRawString()
            java.lang.String r0 = "jid"
            r2.putString(r0, r1)
            java.lang.String r0 = "microphone"
            r2.putBoolean(r0, r7)
            java.lang.String r0 = "camera"
            r2.putBoolean(r0, r4)
            java.lang.String r0 = "request_code"
            r2.putInt(r0, r11)
            r3.A0P(r2)
            X.0Cx r0 = r8.A0N()
            if (r0 == 0) goto L5b
            X.0Cz r1 = new X.0Cz
            r1.<init>(r0)
            java.lang.String r0 = "permission_request"
            r1.A09(r5, r3, r0, r6)
            r1.A08()
            return r5
        L5b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A2a(com.whatsapp.jid.UserJid, boolean, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A2b(com.whatsapp.voipcalling.CallInfo r5) {
        /*
            r4 = this;
            boolean r0 = r4.A1e
            r3 = 0
            if (r0 == 0) goto L33
            if (r5 == 0) goto L33
            com.whatsapp.voipcalling.Voip$CallState r1 = r5.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.ACTIVE
            if (r1 != r0) goto L33
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L33
            java.util.Map r0 = r5.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L1b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r1 = r2.next()
            X.1Qv r1 = (X.C28241Qv) r1
            boolean r0 = r1.A0J
            if (r0 != 0) goto L31
            boolean r0 = r1.A02()
            if (r0 == 0) goto L1b
        L31:
            r0 = 1
            return r0
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A2b(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    public final boolean A2c(CallInfo callInfo) {
        VoipCallControlBottomSheet voipCallControlBottomSheet;
        return callInfo != null && callInfo.isGroupCall && (voipCallControlBottomSheet = this.A1I) != null && voipCallControlBottomSheet.A0Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0076, code lost:
        if (r4 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A2d(com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r6 = this;
            boolean r0 = A04(r7)
            r2 = 0
            if (r0 == 0) goto Lc2
            int r0 = r6.A00
            if (r0 == 0) goto Lc2
            com.whatsapp.voipcalling.Voip$CallState r1 = r6.A1X(r7)
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.ACTIVE
            if (r1 != r0) goto Lc2
            X.01B r0 = r6.A0m
            boolean r0 = X.AnonymousClass029.A1Q(r0, r7)
            if (r0 != 0) goto Lc2
            boolean r0 = r7.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto Lc2
            com.whatsapp.voipcalling.VoipCallNewParticipantBanner r0 = r6.A1K
            if (r0 == 0) goto L28
            r0.A00()
        L28:
            r6.A1h()
            com.whatsapp.voipcalling.VideoCallParticipantViewLayout r0 = r6.A19
            r0.A03()
            com.whatsapp.voipcalling.CallInfo r5 = r6.A1V()
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r5)
            if (r0 == 0) goto L8a
            java.util.Map r0 = r6.A1R
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L44:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r4 = r1.next()
            X.3dL r4 = (X.AbstractC74483dL) r4
            com.whatsapp.voipcalling.VideoCallParticipantView r0 = r4.A00
            if (r0 == 0) goto L44
            int r0 = r0.getLayoutMode()
            if (r0 != 0) goto L44
            java.util.Map r0 = r5.participants
            com.whatsapp.jid.UserJid r3 = r4.A03
            java.lang.Object r0 = r0.get(r3)
            X.1Qv r0 = (X.C28241Qv) r0
            if (r0 == 0) goto L8a
            boolean r0 = r0.A0F
            if (r0 == 0) goto L8a
            com.whatsapp.voipcalling.VideoCallParticipantView r1 = r4.A00
            X.1Qv r0 = r5.getInfoByJid(r3)
            if (r0 == 0) goto Lc0
            android.graphics.Point r4 = r4.A01(r1, r0)
            if (r4 == 0) goto L8a
        L78:
            int r3 = r4.x
            int r0 = r4.y
            android.util.Rational r1 = new android.util.Rational
            r1.<init>(r3, r0)
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            r0.setAspectRatio(r1)
            goto L9c
        L8a:
            com.whatsapp.voipcalling.VideoCallParticipantViewLayout r0 = r6.A19
            int r1 = r0.getWidth()
            com.whatsapp.voipcalling.VideoCallParticipantViewLayout r0 = r6.A19
            int r0 = r0.getHeight()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r1, r0)
            goto L78
        L9c:
            android.app.PictureInPictureParams r0 = r0.build()     // Catch: java.lang.IllegalStateException -> Laa java.lang.IllegalArgumentException -> Lac
            boolean r0 = r6.enterPictureInPictureMode(r0)     // Catch: java.lang.IllegalStateException -> Laa java.lang.IllegalArgumentException -> Lac
            if (r0 == 0) goto Lb2
            r6.A00 = r2
            r0 = 1
            return r0
        Laa:
            r1 = move-exception
            goto Lad
        Lac:
            r1 = move-exception
        Lad:
            java.lang.String r0 = "voip/VoipActivityV2/minimize exception trying to enter PIP mode"
            com.whatsapp.util.Log.w(r0, r1)
        Lb2:
            r6.A1o()
            com.whatsapp.voipcalling.VideoCallParticipantViewLayout r0 = r6.A19
            r0.A04()
            java.lang.String r0 = "voip/VoipActivityV2/minimize failed to enter PIP mode"
            com.whatsapp.util.Log.w(r0)
            return r2
        Lc0:
            r0 = 0
            throw r0
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A2d(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    @Override // X.C0MQ
    public C84803uN A8h() {
        C84803uN c84803uN = this.A1E;
        if (c84803uN == null) {
            C84803uN c84803uN2 = new C84803uN(this);
            this.A1E = c84803uN2;
            return c84803uN2;
        }
        return c84803uN;
    }

    @Override // X.C0MO
    public C54552iw AAX() {
        C54552iw c54552iw = this.A0u;
        if (c54552iw == null) {
            C86963yq c86963yq = new C86963yq(this, this);
            this.A0u = c86963yq;
            return c86963yq;
        }
        return c54552iw;
    }

    @Override // X.C0MN
    public void AMw(int i) {
        A1f();
        C25L c25l = this.A1B;
        if (c25l == null) {
            return;
        }
        if (i == 0) {
            c25l.A0a(24, null);
        } else if (i != 1) {
            if (i != 2) {
                C000700j.A08(false, "Unknown request code");
            } else {
                c25l.A0Z(0);
            }
        }
    }

    @Override // X.C0MN
    public void AMx(int i, String[] strArr) {
        boolean z;
        A1f();
        CallInfo A1V = A1V();
        if (Voip.A08(A1V) && this.A1B != null) {
            C000700j.A08(A1V != null, "Call Info should not be null");
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    z = false;
                    break;
                } else if ("android.permission.CAMERA".equals(strArr[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (i == 0) {
                if (A1V.videoEnabled && z) {
                    Voip.refreshVideoDevice();
                    A2N(this.A1A, A1V.self);
                }
                if (!Voip.A0B(A1V.callState)) {
                    return;
                }
                this.A1B.A0r(this.A1Q, 1);
            } else if (i == 1) {
                Log.i("voip/VoipActivityV2/onPermissionsGranted switching to video call");
                this.A1B.A0J();
            } else if (i != 2) {
                C000700j.A08(false, "Unknown request code");
            } else if (!A1V.isPeerRequestingUpgrade()) {
            } else {
                Voip.refreshVideoDevice();
                A2N(this.A1A, A1V.self);
                C25L c25l = this.A1B;
                c25l.A0X();
                c25l.A27.setRequestedCamera2SupportLevel(c25l.A25.A05());
                c25l.A0s.execute(RunnableC73493bj.A00);
            }
        }
    }

    @Override // X.C0MP
    public void AOY(C25L c25l) {
        StatusBarNotification[] A0H;
        Log.i("voip/VoipActivityV2/onServiceConnected");
        this.A1B = c25l;
        c25l.A0Z = this;
        if (Build.VERSION.SDK_INT >= 23) {
            for (StatusBarNotification statusBarNotification : c25l.A1m.A0H()) {
                if (statusBarNotification.getId() == 27) {
                    c25l.A1Z.A04(statusBarNotification.getTag());
                }
            }
        } else {
            Iterator it = ((AbstractCollection) c25l.A25.A06()).iterator();
            while (it.hasNext()) {
                c25l.A1Z.A04((String) it.next());
            }
        }
        this.A1B.A17 = false;
        CallInfo A1V = A1V();
        A2O(Voip.CallState.NONE, A1V);
        this.A1B.A0I();
        C25L c25l2 = this.A1B;
        if (c25l2.A0y) {
            c25l2.A0S();
        } else {
            c25l2.A0R();
        }
        if (this.A1S && getIntent() != null && A1V != null && Voip.A0B(A1V.callState)) {
            A1x(getIntent().getIntExtra("call_ui_action", 0));
            this.A1S = false;
        }
        if (!AnonymousClass029.A1O(this.A0m) || A1V == null) {
            return;
        }
        Voip.CallState callState = A1V.callState;
        if ((callState == Voip.CallState.REJOINING || callState == Voip.CallState.RECEIVED_CALL) && !A1V.isCaller && A1V.isGroupCall) {
            int intExtra = getIntent().getIntExtra("lobbyEntryPoint", -1);
            if (intExtra != -1) {
                C25L c25l3 = this.A1B;
                if (c25l3.A0g == null) {
                    c25l3.A0g = Integer.valueOf(intExtra);
                }
            }
            C25L c25l4 = this.A1B;
            if (c25l4.A0A == 0) {
                c25l4.A0A = System.currentTimeMillis();
            }
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A1U && Build.VERSION.SDK_INT >= 21) {
            return super.dispatchTouchEvent(motionEvent);
        }
        C25L c25l = this.A1B;
        if (c25l != null && !c25l.A0x() && c25l.A0y) {
            Log.i("voip/VoipActivityV2/dispatchTouchEvent Touch event ignored");
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void hideView(View view) {
        view.clearAnimation();
        view.setVisibility(4);
    }

    public /* synthetic */ void lambda$onCreate$2724$VoipActivityV2(View view) {
        CallInfo A1V = A1V();
        if (A1V == null || !A1V.self.A01() || this.A1B == null) {
            return;
        }
        Log.i("voip/VoipActivityV2/centerScreenCallStatusButton/cancelSwitchToVideoCallListener");
        this.A1B.A0Y(0);
    }

    public void lambda$onCreate$2725$VoipActivityV2(View view) {
        if (this.A1B != null) {
            Log.i("voip/VoipActivityV2/centerScreenCallStatusButton/resumeWhatsAppCallListener");
            C25L c25l = this.A1B;
            String currentCallId = Voip.getCurrentCallId();
            C000700j.A08(c25l.A0B(currentCallId) != null, "must be called for self managed connection");
            C74403dD A0B = c25l.A0B(currentCallId);
            if (A0B == null || A0B.getState() != 5) {
                return;
            }
            A0B.onUnhold();
        }
    }

    public /* synthetic */ void lambda$onCreate$2728$VoipActivityV2(View view) {
        AUh(new E2EEInfoDialogFragment());
    }

    public void lambda$onCreate$2729$VoipActivityV2(View view) {
        Log.i("voip end call button pressed");
        Voip.CallState currentCallState = Voip.getCurrentCallState();
        if (currentCallState == Voip.CallState.NONE) {
            Log.e("voip end call button pressed in NONE state");
            finish();
        } else if (Voip.A0B(currentCallState)) {
            A1y(2);
        } else {
            Log.i("voip/VoipActivityV2/call/end");
            C25L c25l = this.A1B;
            if (c25l != null) {
                c25l.A0b(1, null);
            }
            this.A1W = true;
        }
    }

    public /* synthetic */ void lambda$onCreate$2730$VoipActivityV2(View view) {
        if (!A2X() || !A2d(A1V())) {
            finish();
        }
        if (getIntent().getBooleanExtra("isTaskRoot", true)) {
            startActivity(new Intent(this, HomeActivity.class));
        }
    }

    public /* synthetic */ void lambda$onCreate$2733$VoipActivityV2(View view) {
        A1l();
    }

    public /* synthetic */ void lambda$onCreate$2735$VoipActivityV2(View view) {
        A1r();
    }

    public void lambda$onCreate$2736$VoipActivityV2(View view) {
        Log.i("voip/VoipActivityV2/videoPipParticipantView/onClick");
        if (!Build.DEVICE.equalsIgnoreCase("j7elte")) {
            CallInfo A1V = A1V();
            if (!A04(A1V)) {
                Log.i("voip/VoipActivityV2/switchVideoSurface. ignore switch when it's not a video call");
                return;
            }
            if (this.A1R.size() == 2) {
                if (this.A18.getLayoutMode() == 1) {
                    C000700j.A08(this.A1R.size() == 2, "This function can only be called when there are exactly two participants");
                    Iterator it = this.A1R.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry.getValue() != this.A1A) {
                                AbstractC74483dL abstractC74483dL = (AbstractC74483dL) entry.getValue();
                                if (abstractC74483dL != null) {
                                    VideoCallParticipantView videoCallParticipantView = this.A1A.A00;
                                    if (videoCallParticipantView != null) {
                                        VideoCallParticipantView videoCallParticipantView2 = abstractC74483dL.A00;
                                        if (videoCallParticipantView2 != null) {
                                            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/switchVideoSurface. show preview on full screen = ");
                                            sb.append(videoCallParticipantView2.getLayoutMode() == 0);
                                            Log.i(sb.toString());
                                            abstractC74483dL.A03();
                                            this.A1A.A03();
                                            this.A1A.A07(videoCallParticipantView2);
                                            abstractC74483dL.A07(videoCallParticipantView);
                                            A2E(A1V);
                                            return;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                            }
                        } else {
                            C000700j.A08(false, "Can not be here");
                            break;
                        }
                    }
                    throw null;
                }
            }
            StringBuilder A0P = C000200d.A0P("voip/VoipActivityV2/switchVideoSurface. switch is allowed only for two participants, # of participants = ");
            A0P.append(this.A1R.size());
            Log.w(A0P.toString());
        }
    }

    public void lambda$onCreate$2737$VoipActivityV2(View view) {
        Log.i("voip/VoipActivityV2/VideoCallParticipantView/cancelButton/onClick");
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C25L c25l = this.A1B;
            if (c25l != null) {
                c25l.A0s.execute(new RunnableEBaseShape7S0100000_I0_7(tag, 42));
            }
        }
    }

    public /* synthetic */ void lambda$setupCallFooter$2744$VoipActivityV2(View view) {
        C28241Qv c28241Qv;
        if (this.A1B != null) {
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null && (c28241Qv = callInfo.self) != null) {
                Voip.muteCall(!c28241Qv.A0B);
            }
            CallInfo A1V = A1V();
            if (A1V != null && A1V.self != null) {
                C25L c25l = this.A1B;
                A2M(A1V, c25l.A08(), c25l.A0w());
            } else {
                return;
            }
        }
        A1m();
    }

    public /* synthetic */ void lambda$setupCallFooter$2745$VoipActivityV2(View view) {
        this.A1j = false;
        CallInfo A1V = A1V();
        if (A1V != null && A1V.callState == Voip.CallState.ACTIVE && !A1V.callEnding && this.A1B != null) {
            Log.i("voip/VoipActivityV2/toggleVideoBtn/clicked");
            C28241Qv c28241Qv = A1V.self;
            C28241Qv defaultPeerInfo = A1V.getDefaultPeerInfo();
            if (defaultPeerInfo != null && !defaultPeerInfo.A07) {
                String A04 = this.A0r.A04(this.A0o.A0A(defaultPeerInfo.A06));
                if (defaultPeerInfo.A08) {
                    A2S(getString(R.string.voip_not_enable_switch_voice_and_video_call, A04), 0);
                } else {
                    A2S(getString(R.string.voip_not_support_switch_voice_and_video_call, A04), 0);
                }
            } else if (c28241Qv.A02()) {
                view.setSelected(false);
                A29(c28241Qv);
                this.A1B.A0O();
            } else {
                int i = c28241Qv.A04;
                if (i == 0) {
                    if (A1V.isGroupCall) {
                        A2S(getString(R.string.voip_not_support_switch_voice_and_video_call_in_group_call), 0);
                    } else {
                        A26(A1V.peerJid);
                    }
                } else if (i == 1) {
                    this.A1B.A0N();
                    view.setSelected(true);
                } else if (!c28241Qv.A01()) {
                } else {
                    this.A1B.A0Y(0);
                }
            }
        }
    }

    public /* synthetic */ void lambda$setupCallFooter$2747$VoipActivityV2(View view) {
        CallInfo A1V = A1V();
        if (A1V == null || A1V.callState == Voip.CallState.NONE) {
            return;
        }
        if (A1V.videoEnabled) {
            C28241Qv c28241Qv = A1V.self;
            if (!c28241Qv.A02()) {
                this.A01 = 0;
                this.A0E.removeMessages(3);
                Voip.switchCamera();
                A29(c28241Qv);
            }
        } else {
            C25L c25l = this.A1B;
            if (c25l != null) {
                c25l.A0M();
            }
        }
        A1m();
    }

    public /* synthetic */ void lambda$setupCallFooter$2748$VoipActivityV2(View view) {
        C25L c25l = this.A1B;
        if (c25l != null) {
            c25l.A0L();
        }
        A1m();
    }

    public /* synthetic */ void lambda$setupCallFooter$2749$VoipActivityV2(View view) {
        this.A0V.callOnClick();
    }

    public /* synthetic */ void lambda$showCallFailedScreen$2757$VoipActivityV2(View view) {
        Log.i("VoipActivityV2 vm cancel onClick");
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A0v;
        if (contactPickerFragment != null) {
            if (contactPickerFragment.A1Y()) {
                return;
            }
            A1e();
        } else if (A2X() && A2d(A1V())) {
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00fd, code lost:
        if (r12.A1M.A04().getBoolean("start_video_call_no_preview", false) == false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.3uR, X.0HS] */
    @Override // X.C0MM, X.C0DS, X.C0DT, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onCreate(android.os.Bundle):void");
    }

    @Override // X.C0DS, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog A0y;
        ContactPickerFragment contactPickerFragment = this.A0v;
        return (contactPickerFragment == null || (A0y = contactPickerFragment.A0y(i)) == null) ? super.onCreateDialog(i) : A0y;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        C0Zn c0Zn;
        super.onDestroy();
        Handler handler = this.A0E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CallDetailsLayout callDetailsLayout = this.A12;
        if (callDetailsLayout != null && (c0Zn = callDetailsLayout.A0E.A02) != null) {
            c0Zn.A00();
        }
        C0GA c0ga = this.A0p;
        if (c0ga != null) {
            this.A0q.A00(c0ga);
        }
        C25L c25l = this.A1B;
        if (c25l != null) {
            c25l.A0p(this);
        }
        A2U(false);
        C0Zn c0Zn2 = this.A0s;
        if (c0Zn2 != null) {
            c0Zn2.A00();
        }
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A19;
        if (videoCallParticipantViewLayout != null) {
            for (VideoPort videoPort : videoCallParticipantViewLayout.A0O.values()) {
                videoPort.release();
            }
            videoCallParticipantViewLayout.A0O.clear();
        }
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
        if (voipCallControlBottomSheet != null && voipCallControlBottomSheet.A0W()) {
            voipCallControlBottomSheet.A16(false, false);
        }
        VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A1K;
        if (voipCallNewParticipantBanner != null) {
            voipCallNewParticipantBanner.A00();
        }
        this.A14.A00(this.A1m);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        VideoCallParticipantViewLayout videoCallParticipantViewLayout;
        int i;
        if (this.A0R.getWidth() == this.A08 && this.A0R.getHeight() == this.A07) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("voip/VoipActivityV2/onGlobalLayout size: ");
        A0P.append(this.A0R.getWidth());
        A0P.append("x");
        A0P.append(this.A0R.getHeight());
        A0P.append(", orientation: ");
        C000200d.A1F(A0P, getResources().getConfiguration().orientation);
        this.A08 = this.A0R.getWidth();
        this.A07 = this.A0R.getHeight();
        CallInfo A1V = A1V();
        A2I(A1V);
        if (this.A1e && A04(A1V)) {
            if (A1V.isGroupCall && A1V.videoEnabled && (i = (videoCallParticipantViewLayout = this.A19).A01) > 2) {
                videoCallParticipantViewLayout.A06(i, true);
            }
            this.A1N.updateCameraPreviewOrientation();
            A2E(A1V);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0055, code lost:
        if (r13 == 86) goto L78;
     */
    @Override // X.ActivityC02270An, X.ActivityC02320As, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/onNewIntent ");
        sb.append(intent);
        sb.append(", action ");
        sb.append(action);
        sb.append(", is finishing ");
        sb.append(isFinishing());
        Log.i(sb.toString());
        super.onNewIntent(intent);
        setIntent(intent);
        this.A1a = false;
        this.A1S = false;
        this.A1Q = intent.getStringExtra("call_id");
        CallInfo A1V = A1V();
        if (A1V == null) {
            return;
        }
        if (this.A1Q == null) {
            this.A1Q = A1V.callId;
        }
        if (this.A1B == null) {
            this.A1C.A00.obtainMessage(4, this).sendToTarget();
        }
        A2H(A1V);
        if ("com.whatsapp.intent.action.ACCEPT_CALL".equals(action)) {
            A22(intent, A1V);
        } else if (!A1r.equals(action) && !"join_call".equals(action)) {
            if (A1q.equals(action)) {
                String stringExtra = intent.getStringExtra("confirmationString");
                if (this.A0h == null && C0L6.A01()) {
                    Log.w("voip/VoipActivityV2/showEndCallConfirmationDialog.");
                    EndCallConfirmationDialogFragment endCallConfirmationDialogFragment = new EndCallConfirmationDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", stringExtra);
                    endCallConfirmationDialogFragment.A0P(bundle);
                    this.A0h = endCallConfirmationDialogFragment;
                    endCallConfirmationDialogFragment.A14(A0N(), null);
                }
            } else {
                if (A1n.equals(action)) {
                    C25L c25l = this.A1B;
                    if (c25l != null) {
                        c25l.A0b(2, null);
                    }
                } else if (A1p.equals(action)) {
                    A23(intent, A1V);
                } else if ("ACTION_AUTOMATION_BRING_TO_FRONT".equals(action)) {
                    C000700j.A08(false, "it can only be used in smoke or automation");
                } else if ("com.whatsapp.intent.action.CALL_BACK".equals(action) && C0L6.A01()) {
                    ((ActivityC02290Ap) this).A0A.A07(R.string.error_call_disabled_during_call, 1);
                } else if (A1o.equals(action)) {
                    A1y(intent.getBooleanExtra("pendingCall", false) ? 7 : 2);
                } else if (isFinishing()) {
                    Log.e("voip/VoipActivityV2/new-intent activity is finishing, do nothing");
                    return;
                } else if (Voip.A09(A1V)) {
                    Log.e("voip/VoipActivityV2/new-intent the WhatsApp call is not active, do nothing");
                    return;
                } else {
                    A2I(A1V);
                    if (intent.getBooleanExtra("newCall", false)) {
                        Log.i("voip/VoipActivityV2/onNewIntent/NewCall clearing states");
                        this.A1T = intent.getBooleanExtra("callAccepted", false);
                        this.A01 = 0;
                        this.A0E.removeMessages(9);
                        DialogFragment dialogFragment = this.A0i;
                        if (dialogFragment != null) {
                            dialogFragment.A11();
                            this.A0i = null;
                            this.A1P = null;
                        }
                    }
                }
            }
        } else {
            this.A1T = false;
            this.A1h = true;
            if (this.A0v != null) {
                A1e();
            }
            VoipCallControlBottomSheet voipCallControlBottomSheet = this.A1I;
            if (voipCallControlBottomSheet != null && voipCallControlBottomSheet.A0W()) {
                voipCallControlBottomSheet.A16(false, false);
            }
            this.A1I = null;
            A1n();
            Voip.stopVideoCaptureStream();
            A2I(A1V);
            this.A1C.A00.obtainMessage(1, new C49032Ic("refresh_notification", null, null)).sendToTarget();
        }
        this.A0x.A05(null, 7);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A0v != null && menuItem.getItemId() == 16908332) {
            A1e();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A1c = false;
        this.A1W = false;
        CallInfo A1V = A1V();
        if (this.A00 == 0) {
            A1h();
            if (this.A1e && A04(A1V)) {
                A21(0L, 0L, A1V);
            }
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        if (z) {
            this.A1b = true;
            if (this.A00 != 0) {
                A1h();
                this.A19.A03();
            }
            this.A00 = 1;
            C25L c25l = this.A1B;
            if (c25l != null) {
                Log.i("VoiceService:onEnterPictureInPicture");
                c25l.A0B = System.currentTimeMillis();
            }
        } else {
            this.A1b = false;
            this.A00 = 2;
            C25L c25l2 = this.A1B;
            if (c25l2 != null) {
                c25l2.A0H();
            }
        }
        CallInfo A1V = A1V();
        if (A1V == null || !A1V.videoEnabled) {
            return;
        }
        A1w();
        A2E(A1V);
        Voip.processPipModeChange(z);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        C25L c25l;
        ContactPickerFragment contactPickerFragment;
        String string;
        super.onResume();
        if (this.A0R == null) {
            return;
        }
        this.A1c = true;
        this.A1d = true;
        CallInfo A1V = A1V();
        if (A1V == null || A1V.callState == Voip.CallState.NONE) {
            return;
        }
        if (!AnonymousClass029.A1O(this.A0m) && A1V.callState == Voip.CallState.RECEIVED_CALL) {
            if (A1V.videoEnabled) {
                if (A1V.isGroupCall) {
                    string = getString(R.string.group_video_call_label);
                } else {
                    string = getString(R.string.video_call_label);
                }
            } else if (A1V.isGroupCall) {
                string = getString(R.string.group_voip_call_label);
            } else {
                string = getString(R.string.voip_call_label);
            }
            AnonymousClass088.A1C(this, this.A0w, getString(R.string.voip_accessibility_incoming_call_label_with_placeholders, string, this.A0r.A08(this.A0o.A0A(A1V.peerJid), false)));
        }
        if (this.A1c && ((contactPickerFragment = this.A0v) == null || ((C0BA) contactPickerFragment).A0g)) {
            ((ActivityC02270An) this).A0F.A01(this.A0R);
        }
        this.A0E.sendEmptyMessageDelayed(1, 500L);
        if (A1V.videoEnabled) {
            if (!A1V.self.A02()) {
                if (A04(A1V)) {
                    if (!A1V.videoPreviewReady) {
                        this.A1A.A04();
                    }
                    if (A1V.videoCaptureStarted) {
                        Log.i("voip/VoipActivityV2/videoCaptureStarted.");
                    }
                    UserJid userJid = A1V.peerJid;
                    C28241Qv infoByJid = A1V.getInfoByJid(userJid);
                    if (infoByJid != null && infoByJid.A0J) {
                        A24(userJid);
                    } else {
                        A2I(A1V);
                    }
                }
            } else if (this.A1j && (c25l = this.A1B) != null) {
                c25l.A0s.execute(RunnableC73483bi.A00);
            }
        }
        if (this.A1j) {
            this.A1j = false;
        }
        if (this.A00 == 2) {
            this.A00 = 3;
            this.A19.A04();
            if (A1r.equals(getIntent().getAction())) {
                return;
            }
            A1o();
            A21(0L, 0L, A1V);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A0v;
        if (contactPickerFragment != null) {
            contactPickerFragment.A16();
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A0v;
        if (contactPickerFragment != null) {
            contactPickerFragment.A16();
            return true;
        }
        return false;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        View view = this.A0R;
        if (view == null) {
            return;
        }
        this.A1e = true;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        C25L c25l = this.A1B;
        if (c25l != null) {
            c25l.A17 = false;
        }
        CallInfo A1V = A1V();
        if (A1V != null && A1V.callState != Voip.CallState.NONE) {
            if (A1V.isPeerRequestingUpgrade()) {
                this.A1T = false;
            }
            A2H(A1V);
            A2I(A1V);
            if (this.A1Z || ("join_call".equals(getIntent().getAction()) && Voip.A0B(A1V.callState))) {
                C41641uH c41641uH = this.A1C;
                c41641uH.A00.obtainMessage(1, new C49032Ic("refresh_notification", null, null)).sendToTarget();
                this.A1Z = false;
            }
            if (A1V.videoEnabled) {
                if (!A1r.equals(getIntent().getAction()) && !A1V.self.A02()) {
                    Voip.startVideoCaptureStream();
                }
                this.A1A.A04();
                C25L c25l2 = this.A1B;
                if (c25l2 != null && this.A1b) {
                    Log.i("VoiceService:onEnterPictureInPicture");
                    c25l2.A0B = System.currentTimeMillis();
                }
            }
            Log.i("voip/VoipActivityV2/bindService");
            this.A1C.A00.obtainMessage(4, this).sendToTarget();
        } else if (getIntent().hasExtra("showCallFailedMessage")) {
            A1c();
        } else {
            finish();
            Log.e("voip/VoipActivityV2/onStart call_not_active, finishing");
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        Voip.CallState callState;
        super.onStop();
        C84843uR c84843uR = this.A1G;
        if (c84843uR != null) {
            c84843uR.A05(true);
        }
        if (getIntent().getBooleanExtra("joinable", false)) {
            return;
        }
        A2U(false);
        this.A1e = false;
        View view = this.A0R;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A17;
        if (maximizedParticipantVideoDialogFragment != null) {
            maximizedParticipantVideoDialogFragment.A19(true);
        }
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A19;
        if (videoCallParticipantViewLayout != null) {
            C0EW c0ew = this.A1M;
            if (videoCallParticipantViewLayout.A0L) {
                videoCallParticipantViewLayout.A0L = false;
                C000200d.A0n(c0ew, "video_call_pip_position", (!videoCallParticipantViewLayout.A0K ? 1 : 0) + (videoCallParticipantViewLayout.A0J ? 0 : 2));
            }
        }
        Handler handler = this.A0E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CallInfo A1V = A1V();
        if (A1V != null && (callState = A1V.callState) != Voip.CallState.NONE) {
            if (callState == Voip.CallState.RECEIVED_CALL && Build.VERSION.SDK_INT >= 21 && !this.A0l.A00 && !this.A1T) {
                Bundle A01 = C000200d.A01("notification_type", 1);
                StringBuilder A0P = C000200d.A0P("voip/VoipActivityV2/onStop post ");
                A0P.append("NOTIFICATION_HEADS_UP");
                Log.i(A0P.toString());
                this.A1C.A00.obtainMessage(1, new C49032Ic("refresh_notification", A01, null)).sendToTarget();
                this.A1Z = true;
            }
            C25L c25l = this.A1B;
            if (c25l != null && this.A1b) {
                c25l.A0H();
            }
            if (A1V.videoEnabled) {
                Voip.stopVideoCaptureStream();
                if (A1V.callState != Voip.CallState.NONE && Build.VERSION.SDK_INT < 19 && this.A18.getLayoutMode() == 1) {
                    Log.i("voip/VoipActivityV2/onStop finish current activity, will recreate on foreground");
                    C25L c25l2 = this.A1B;
                    if (c25l2 != null) {
                        c25l2.A0p(this);
                    }
                    finish();
                }
            }
            if (this.A1B != null && !this.A0j.A00) {
                Log.i("voip/VoipActivityV2/onStop. App is put to background, mark to show VoipActivity again when foregrounded.");
                this.A1B.A17 = true;
            }
            A1s();
            return;
        }
        A1s();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        this.A1d = true;
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        Log.i("voip/VoipActivityV2/onUserLeaveHint");
        if (this.A0v == null && Build.VERSION.SDK_INT >= 26 && A2d(A1V())) {
            return;
        }
        this.A1d = false;
    }

    @Override // android.app.Activity
    public void recreate() {
        if (this.A00 != 3) {
            return;
        }
        super.recreate();
    }

    public void showView(View view) {
        view.setVisibility(0);
        ((AnimatingArrowsLayout) view).A01.start();
    }

    /* loaded from: classes2.dex */
    public class E2EEInfoDialogFragment extends Hilt_VoipActivityV2_E2EEInfoDialogFragment {
        public C018308n A00;
        public C40071rX A01;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(A00());
            c019208x.A02(R.string.encryption_description);
            c019208x.A04(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3cR
                {
                    VoipActivityV2.E2EEInfoDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    VoipActivityV2.E2EEInfoDialogFragment e2EEInfoDialogFragment = VoipActivityV2.E2EEInfoDialogFragment.this;
                    if (e2EEInfoDialogFragment.A0W()) {
                        e2EEInfoDialogFragment.A11();
                    }
                }
            });
            c019208x.A05(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.3cQ
                {
                    VoipActivityV2.E2EEInfoDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    VoipActivityV2.E2EEInfoDialogFragment e2EEInfoDialogFragment = VoipActivityV2.E2EEInfoDialogFragment.this;
                    e2EEInfoDialogFragment.A00.A06(((Hilt_VoipActivityV2_E2EEInfoDialogFragment) e2EEInfoDialogFragment).A00, new Intent("android.intent.action.VIEW", e2EEInfoDialogFragment.A01.A03("general", "28030015", null)));
                    if (e2EEInfoDialogFragment.A0W()) {
                        e2EEInfoDialogFragment.A11();
                    }
                }
            });
            return c019208x.A00();
        }
    }

    /* loaded from: classes2.dex */
    public class EndCallConfirmationDialogFragment extends Hilt_VoipActivityV2_EndCallConfirmationDialogFragment {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            String string = A02().getString("message");
            C019208x c019208x = new C019208x(A00());
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = string;
            c019308y.A0J = true;
            c019208x.A06(R.string.btn_continue, new DialogInterface.OnClickListener() { // from class: X.3cT
                {
                    VoipActivityV2.EndCallConfirmationDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    VoipActivityV2.EndCallConfirmationDialogFragment.this.A11();
                }
            });
            c019208x.A04(R.string.hang_up, new DialogInterface.OnClickListener() { // from class: X.3cS
                {
                    VoipActivityV2.EndCallConfirmationDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    VoipActivityV2.EndCallConfirmationDialogFragment endCallConfirmationDialogFragment = VoipActivityV2.EndCallConfirmationDialogFragment.this;
                    Intent intent = new Intent(((Hilt_VoipActivityV2_EndCallConfirmationDialogFragment) endCallConfirmationDialogFragment).A00, VoipActivityV2.class);
                    intent.setAction(VoipActivityV2.A1n);
                    intent.setFlags(268435456);
                    endCallConfirmationDialogFragment.A0i(intent);
                    endCallConfirmationDialogFragment.A11();
                }
            });
            return c019208x.A00();
        }
    }

    /* loaded from: classes2.dex */
    public class MessageDialogFragment extends Hilt_VoipActivityV2_MessageDialogFragment {
        public C0L6 A00;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            Context A00 = A00();
            String string = A02().getString("message");
            C019208x c019208x = new C019208x(A00);
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = string;
            c019308y.A0J = true;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3cV
                {
                    VoipActivityV2.MessageDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    VoipActivityV2.MessageDialogFragment.this.A11();
                }
            });
            return c019208x.A00();
        }

        @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (A09() == null || C0L6.A01()) {
                return;
            }
            A09().finish();
        }
    }

    /* loaded from: classes2.dex */
    public class NonActivityDismissDialogFragment extends Hilt_VoipActivityV2_NonActivityDismissDialogFragment {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            Context A00 = A00();
            Bundle A02 = A02();
            C019208x c019208x = new C019208x(A00);
            String string = A02.getString("text");
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = string;
            c019308y.A0J = true;
            if (A02.getBoolean("dismiss", false)) {
                c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3cW
                    {
                        VoipActivityV2.NonActivityDismissDialogFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        VoipActivityV2.NonActivityDismissDialogFragment.this.A11();
                    }
                });
            }
            return c019208x.A00();
        }
    }

    /* loaded from: classes2.dex */
    public class ReplyWithMessageDialogFragment extends Hilt_VoipActivityV2_ReplyWithMessageDialogFragment {
        public static final int[] A02 = {R.string.incomming_call_reply_0, R.string.incomming_call_reply_1, R.string.incomming_call_reply_2, R.string.incomming_call_reply_3, R.string.incomming_call_reply_custom};
        public C002301c A00;
        public UserJid A01;

        public ReplyWithMessageDialogFragment(UserJid userJid) {
            this.A01 = userJid;
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(A00());
            final String[] A0O = this.A00.A0O(A02);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3cY
                {
                    VoipActivityV2.ReplyWithMessageDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    VoipActivityV2.ReplyWithMessageDialogFragment replyWithMessageDialogFragment = VoipActivityV2.ReplyWithMessageDialogFragment.this;
                    String[] strArr = A0O;
                    VoipActivityV2 voipActivityV2 = (VoipActivityV2) replyWithMessageDialogFragment.A0A();
                    Intent intent = new Intent(voipActivityV2, Conversation.class);
                    intent.putExtra("jid", replyWithMessageDialogFragment.A01.getRawString());
                    intent.addFlags(335544320);
                    if (i != strArr.length - 1) {
                        intent.putExtra("wa_type", (byte) 0);
                        intent.putExtra("share_msg", strArr[i]);
                        intent.putExtra("has_share", true);
                        Conversation.A0L(((Hilt_VoipActivityV2_ReplyWithMessageDialogFragment) replyWithMessageDialogFragment).A00, intent);
                    } else {
                        intent.putExtra("show_keyboard", true);
                    }
                    C002701i.A1C(intent, "VoipActivityV2", ((WaDialogFragment) replyWithMessageDialogFragment).A00.A00);
                    voipActivityV2.startActivity(intent);
                    voipActivityV2.A1y(2);
                }
            };
            C019308y c019308y = c019208x.A01;
            c019308y.A0M = A0O;
            c019308y.A05 = onClickListener;
            DialogInterfaceC019408z A00 = c019208x.A00();
            A00.setCanceledOnTouchOutside(true);
            return A00;
        }
    }

    /* loaded from: classes2.dex */
    public class SwitchConfirmationFragment extends Hilt_VoipActivityV2_SwitchConfirmationFragment {
        public C000500h A00;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(A00());
            c019208x.A02(R.string.voip_requesting_upgrade_to_video_confirmation_text);
            c019208x.A06(R.string.voip_requesting_upgrade_to_video_confirmation_positive_button_label, new DialogInterface.OnClickListener() { // from class: X.3cZ
                {
                    VoipActivityV2.SwitchConfirmationFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CallInfo A1V;
                    VoipActivityV2.SwitchConfirmationFragment switchConfirmationFragment = VoipActivityV2.SwitchConfirmationFragment.this;
                    C000200d.A0g(switchConfirmationFragment.A00, "switch_to_video_call_confirmation_dialog_count", switchConfirmationFragment.A00.A00.getInt("switch_to_video_call_confirmation_dialog_count", 0) + 1);
                    VoipActivityV2 voipActivityV2 = (VoipActivityV2) switchConfirmationFragment.A09();
                    if (voipActivityV2 != null && (A1V = voipActivityV2.A1V()) != null && !A1V.isGroupCall && A1V.self.A04 == 0 && voipActivityV2.A2a(A1V.peerJid, true, 1)) {
                        C25L c25l = voipActivityV2.A1B;
                        if (c25l != null) {
                            c25l.A0J();
                            return;
                        }
                        throw null;
                    }
                }
            });
            c019208x.A04(R.string.cancel, null);
            DialogInterfaceC019408z A00 = c019208x.A00();
            A00.setCanceledOnTouchOutside(true);
            return A00;
        }
    }
}
