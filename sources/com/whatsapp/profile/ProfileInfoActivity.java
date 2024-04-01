package com.whatsapp.profile;

import X.AbstractActivityC49952Ob;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.C003101m;
import X.C015207d;
import X.C02L;
import X.C04510Kl;
import X.C04630Le;
import X.C05X;
import X.C06C;
import X.C0GA;
import X.C0K1;
import X.C0L7;
import X.C0LF;
import X.C0LX;
import X.C0U1;
import X.C1M6;
import X.C2AO;
import X.C2HC;
import X.C2M5;
import X.C2MG;
import X.C2Oc;
import X.C456723a;
import X.C52652b6;
import X.InterfaceC002901k;
import X.RunnableC70573Su;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.crop.CropImage;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import com.whatsapp.util.WhatsAppLibLoader;

/* loaded from: classes2.dex */
public class ProfileInfoActivity extends AbstractActivityC49952Ob implements C2Oc {
    public Handler A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public C02L A04;
    public C05X A05;
    public C0L7 A06;
    public AnonymousClass008 A07;
    public C0LF A08;
    public C06C A09;
    public AnonymousClass011 A0A;
    public C456723a A0B;
    public ProfileSettingsRowIconText A0C;
    public ProfileSettingsRowIconText A0D;
    public C2AO A0E;
    public C2M5 A0F;
    public C2MG A0G;
    public InterfaceC002901k A0H;
    public WhatsAppLibLoader A0I;
    public Runnable A0J;
    public boolean A0K;
    public final C0GA A0L = new C0GA() { // from class: X.3kn
        {
            ProfileInfoActivity.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            ProfileInfoActivity profileInfoActivity = ProfileInfoActivity.this;
            if (profileInfoActivity.A09 == null || abstractC005302j == null) {
                return;
            }
            C02L c02l = profileInfoActivity.A04;
            c02l.A05();
            if (abstractC005302j.equals(c02l.A03)) {
                C02L c02l2 = profileInfoActivity.A04;
                c02l2.A05();
                profileInfoActivity.A09 = c02l2.A01;
                profileInfoActivity.A1P();
            }
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            if (userJid != null) {
                ProfileInfoActivity profileInfoActivity = ProfileInfoActivity.this;
                C02L c02l = profileInfoActivity.A04;
                c02l.A05();
                if (userJid.equals(c02l.A03)) {
                    profileInfoActivity.A0D.setSubText(profileInfoActivity.A05.A01());
                }
            }
        }
    };

    public final void A1P() {
        this.A02.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.pref_profile_photo_size);
        C02L c02l = this.A04;
        c02l.A05();
        if (C04510Kl.A00(c02l.A03)) {
            this.A03.setEnabled(false);
            this.A02.setVisibility(0);
        } else {
            this.A03.setEnabled(true);
            this.A02.setVisibility(4);
        }
        Bitmap A02 = this.A08.A02(this, this.A09, dimensionPixelSize, -1.0f, false);
        if (A02 == null) {
            C06C c06c = this.A09;
            if (c06c.A02 == 0 && c06c.A01 == 0) {
                this.A02.setVisibility(0);
                Handler handler = this.A00;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    this.A00 = handler;
                    this.A0J = new RunnableEBaseShape4S0100000_I0_4(this, 49);
                }
                handler.removeCallbacks(this.A0J);
                this.A00.postDelayed(this.A0J, 30000L);
            } else {
                this.A02.setVisibility(4);
            }
            if (this.A06 != null) {
                A02 = C0L7.A01(this, R.drawable.avatar_contact, dimensionPixelSize, -1.0f);
                this.A0K = false;
            } else {
                throw null;
            }
        } else {
            this.A0K = true;
        }
        this.A03.setImageBitmap(A02);
    }

    public /* synthetic */ void A1Q() {
        super.onBackPressed();
    }

    public final void A1R(final Runnable runnable) {
        View view = this.A01;
        if (view == null) {
            runnable.run();
        } else {
            view.animate().scaleX(0.0f).scaleY(0.0f).setDuration(125L).setListener(new AnimatorListenerAdapter() { // from class: X.3T3
                public boolean A00 = true;

                {
                    ProfileInfoActivity.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.A00) {
                        this.A00 = false;
                        if (!ProfileInfoActivity.this.A0M) {
                            return;
                        }
                        runnable.run();
                    }
                }
            });
        }
    }

    @Override // X.C2Oc
    public void AI0(String str) {
        AUh(PushnameEmojiBlacklistDialogFragment.A00(str));
    }

    @Override // X.C2Oc
    public void AJh(int i, String str) {
        if (i != 0 || str.length() == 0) {
            return;
        }
        this.A0H.AS1(new RunnableEBaseShape0S1100000_I0(this, str, 18));
        this.A0C.setSubText(str);
    }

    public void lambda$onCreate$2068$ProfileInfoActivity(View view) {
        AUh(EmojiEditTextBottomSheetDialogFragment.A00(0, R.string.settings_dialog_title, R.string.no_empty_name, this.A04.A02(), 25, C52652b6.A01, 8193));
    }

    public void lambda$onCreate$2069$ProfileInfoActivity(View view) {
        if (!this.A0K) {
            this.A0B.A04(this, this.A09, 12);
            return;
        }
        Intent intent = new Intent(this, ViewProfilePhoto.class);
        C02L c02l = this.A04;
        c02l.A05();
        intent.putExtra("jid", C003101m.A07(c02l.A03));
        intent.putExtra("circular_transition", true);
        if (Build.VERSION.SDK_INT >= 21) {
            intent.putExtra("start_transition_status_bar_color", getWindow().getStatusBarColor());
        }
        startActivity(intent, C2HC.A04(this, this.A03, getApplicationContext().getResources().getString(R.string.transition_photo)));
    }

    public /* synthetic */ void lambda$onCreate$2070$ProfileInfoActivity(View view) {
        this.A0B.A04(this, this.A09, 12);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 12:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra("is_reset", false)) {
                        this.A02.setVisibility(0);
                        this.A0B.A06(this.A09);
                    } else {
                        this.A0B.A05(this, intent, 13, this);
                    }
                }
                if (this.A01.getScaleX() != 0.0d || this.A01.getScaleY() != 0.0d) {
                    return;
                }
                this.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125L);
                return;
            case 13:
                this.A0B.A03().delete();
                if (i2 == -1) {
                    if (!this.A0B.A09(this.A09)) {
                        return;
                    }
                    A1P();
                    return;
                } else if (i2 != 0 || intent == null) {
                    return;
                } else {
                    CropImage.A00(this.A0B.A02, intent, this);
                    return;
                }
            case 14:
                if (i2 != -1) {
                    return;
                }
                this.A0C.setSubText(this.A04.A02());
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        RunnableEBaseShape5S0100000_I0_5 runnableEBaseShape5S0100000_I0_5 = new RunnableEBaseShape5S0100000_I0_5(this, 0);
        if (C2HC.A00) {
            A1R(runnableEBaseShape5S0100000_I0_5);
        } else {
            super.onBackPressed();
        }
    }

    @Override // X.AbstractActivityC49952Ob, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C2HC.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(200L);
            changeBounds.setInterpolator(new C015207d());
            changeBounds.excludeTarget(16908335, true);
            changeBounds.excludeTarget(16908336, true);
            changeBounds.excludeTarget(R.id.action_bar_container, true);
            window.setSharedElementEnterTransition(changeBounds);
            window.setSharedElementExitTransition(changeBounds);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.setDuration(220L);
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.setDuration(240L);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
        }
        super.onCreate(bundle);
        if (!this.A0I.A04()) {
            Log.i("aborting due to native libraries missing");
            finish();
            return;
        }
        setContentView(R.layout.profile_info);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        C02L c02l = this.A04;
        c02l.A05();
        C0K1 c0k1 = c02l.A01;
        this.A09 = c0k1;
        if (c0k1 == null) {
            Log.i("profileinfo/create/no-me");
            if (((ActivityC02290Ap) this).A0A != null) {
                startActivity(new Intent(this, Main.class));
                finish();
                return;
            }
            throw null;
        }
        ProfileSettingsRowIconText profileSettingsRowIconText = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_name_card);
        this.A0C = profileSettingsRowIconText;
        profileSettingsRowIconText.setSubText(this.A04.A02());
        this.A0C.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 19));
        ImageView imageView = (ImageView) findViewById(R.id.photo_btn);
        this.A03 = imageView;
        imageView.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 21));
        View findViewById = findViewById(R.id.change_photo_btn);
        this.A01 = findViewById;
        findViewById.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 20));
        if (Build.VERSION.SDK_INT >= 21 && bundle == null) {
            Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
            getWindow().setSharedElementExitTransition(sharedElementEnterTransition.clone());
            getWindow().setSharedElementReenterTransition(sharedElementEnterTransition.clone());
            getWindow().setSharedElementReturnTransition(sharedElementEnterTransition.clone());
            this.A01.setScaleX(0.0f);
            this.A01.setScaleY(0.0f);
            this.A01.setVisibility(0);
            getWindow().getSharedElementEnterTransition().addListener(new C1M6() { // from class: X.3ko
                {
                    ProfileInfoActivity.this = this;
                }

                @Override // X.C1M6, android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    ProfileInfoActivity.this.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125L);
                }
            });
            getWindow().getSharedElementExitTransition().addListener(new C1M6() { // from class: X.3kp
                {
                    ProfileInfoActivity.this = this;
                }

                @Override // X.C1M6, android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    ProfileInfoActivity profileInfoActivity = ProfileInfoActivity.this;
                    profileInfoActivity.A01.setScaleX(1.0f);
                    profileInfoActivity.A01.setScaleY(1.0f);
                    profileInfoActivity.A01.animate().scaleX(0.0f).scaleY(0.0f).setDuration(125L);
                }
            });
            getWindow().getSharedElementReenterTransition().addListener(new C1M6() { // from class: X.3kq
                {
                    ProfileInfoActivity.this = this;
                }

                @Override // X.C1M6, android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    ProfileInfoActivity profileInfoActivity = ProfileInfoActivity.this;
                    profileInfoActivity.A01.setScaleX(0.0f);
                    profileInfoActivity.A01.setScaleY(0.0f);
                    profileInfoActivity.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125L);
                }
            });
        }
        this.A02 = findViewById(R.id.change_photo_progress);
        A1P();
        ProfileSettingsRowIconText profileSettingsRowIconText2 = (ProfileSettingsRowIconText) findViewById(R.id.profile_phone_info);
        C0LX.A03(profileSettingsRowIconText2.A00);
        profileSettingsRowIconText2.setSubText(C04630Le.A00(this.A09));
        profileSettingsRowIconText2.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 13));
        ProfileSettingsRowIconText profileSettingsRowIconText3 = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_status_card);
        this.A0D = profileSettingsRowIconText3;
        profileSettingsRowIconText3.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 14));
        this.A0D.setSubText(this.A05.A01());
        this.A07.A01(this.A0L);
        if (!"android.intent.action.ATTACH_DATA".equals(getIntent().getAction())) {
            setTitle(R.string.settings_profile_info);
            return;
        }
        setTitle(R.string.set_as_profile_photo);
        this.A0B.A05(this, getIntent(), 13, this);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A07.A00(this.A0L);
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A0J);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (C2HC.A00) {
                A1R(new RunnableC70573Su(this));
                return true;
            }
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
