package com.whatsapp;

import X.AbstractC005302j;
import X.AbstractC011205o;
import X.ActivityC02270An;
import X.AnonymousClass008;
import X.C000200d;
import X.C003101m;
import X.C011005l;
import X.C018708s;
import X.C02160Ac;
import X.C05W;
import X.C06C;
import X.C08950cN;
import X.C0AT;
import X.C0C8;
import X.C0GA;
import X.C0K0;
import X.C0LF;
import X.C0W4;
import X.C0W5;
import X.C21O;
import X.C28641Sz;
import X.C2AR;
import X.C2HC;
import X.C2IY;
import X.C41461tx;
import X.C41471ty;
import X.ViewTreeObserver$OnPreDrawListenerC72513a7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.util.FloatingChildLayout;
import java.util.Map;

/* loaded from: classes.dex */
public class QuickContactActivity extends C0W4 {
    public ImageView A00;
    public C0W5 A01;
    public C05W A02;
    public AnonymousClass008 A03;
    public C018708s A04;
    public C0LF A05;
    public C0C8 A06;
    public C06C A07;
    public C41461tx A08;
    public C41471ty A09;
    public C2AR A0A;
    public FloatingChildLayout A0B;
    public C2IY A0C;
    public boolean A0D;
    public final C0GA A0E = new C0GA() { // from class: X.1j5
        {
            QuickContactActivity.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            QuickContactActivity.this.A1Q();
        }
    };

    public static void A00(Activity activity, View view, AbstractC005302j abstractC005302j, String str) {
        C08950cN c08950cN;
        if (abstractC005302j == null) {
            return;
        }
        Intent intent = new Intent(activity, QuickContactActivity.class);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i = iArr[0];
        rect.left = (int) ((i * 1.0f) + 0.5f);
        rect.top = (int) ((iArr[1] * 1.0f) + 0.5f);
        rect.right = (int) (((view.getWidth() + i) * 1.0f) + 0.5f);
        rect.bottom = (int) (((view.getHeight() + iArr[1]) * 1.0f) + 0.5f);
        intent.setSourceBounds(rect);
        if (str != null) {
            intent.putExtra("transition_name", str);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            intent.putExtra("status_bar_color", activity.getWindow().getStatusBarColor());
        }
        intent.putExtra("jid", C003101m.A07(abstractC005302j));
        if (Build.VERSION.SDK_INT >= 23) {
            c08950cN = new C28641Sz(ActivityOptions.makeBasic());
        } else {
            c08950cN = new C08950cN();
        }
        activity.startActivity(intent, c08950cN.A01());
        activity.overridePendingTransition(0, 0);
    }

    public void A1P() {
        FloatingChildLayout floatingChildLayout = this.A0B;
        if (floatingChildLayout.A01 == 0) {
            floatingChildLayout.A01 = 1;
            floatingChildLayout.A07.invalidate();
            floatingChildLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC72513a7(floatingChildLayout, new RunnableEBaseShape7S0100000_I0_7(floatingChildLayout, 24)));
        }
        FloatingChildLayout floatingChildLayout2 = this.A0B;
        Runnable runnable = new Runnable() { // from class: X.1IH
            {
                QuickContactActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QuickContactActivity.this.A0D = false;
            }
        };
        if (floatingChildLayout2.A03 == 0) {
            floatingChildLayout2.A03 = 1;
            floatingChildLayout2.A02(false, runnable);
        }
    }

    public final void A1Q() {
        Bitmap A02 = this.A05.A02(this, this.A07, getResources().getDimensionPixelSize(R.dimen.quick_contact_profile_photo_size), 0.0f, false);
        if (A02 != null) {
            this.A00.setImageBitmap(A02);
        } else if (this.A07.A0C()) {
            this.A00.setImageResource(R.drawable.avatar_group_large);
        } else {
            C06C c06c = this.A07;
            if (c06c.A0D()) {
                this.A00.setImageResource(R.drawable.avatar_broadcast_large);
            } else if (C003101m.A0Y(c06c.A02())) {
                this.A00.setImageResource(R.drawable.avatar_server_psa_large);
            } else {
                this.A00.setImageResource(R.drawable.avatar_contact_large);
            }
        }
    }

    public /* synthetic */ void A1R() {
        this.A0B.invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getIntent().getIntExtra("status_bar_color", C02160Ac.A00(this, R.color.primary_dark)));
        }
        FloatingChildLayout.A01(this.A0B, new Runnable() { // from class: X.1IM
            {
                QuickContactActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final QuickContactActivity quickContactActivity = QuickContactActivity.this;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.1II
                    @Override // java.lang.Runnable
                    public final void run() {
                        quickContactActivity.A1S();
                    }
                }, 60L);
            }
        });
    }

    public /* synthetic */ void A1S() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(0);
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public void A1T(Intent intent) {
        if (this.A0D) {
            return;
        }
        C06C c06c = this.A07;
        if (c06c.A0R) {
            boolean z = true;
            if (c06c.A0C()) {
                C0C8 c0c8 = this.A06;
                Jid A03 = this.A07.A03(C011005l.class);
                if (A03 != null) {
                    if (!c0c8.A01((AbstractC011205o) A03).A0B(c0c8.A01)) {
                        AUj(R.string.failed_update_photo_not_authorized);
                        return;
                    }
                } else {
                    throw null;
                }
            }
            Intent intent2 = new Intent(getApplicationContext(), ViewProfilePhoto.class);
            intent2.putExtra("jid", C003101m.A07(this.A07.A02()));
            if (!C2HC.A00) {
                startActivity(intent2);
                A1U(false);
                return;
            }
            String stringExtra = getIntent().getStringExtra("transition_name");
            if (stringExtra == null) {
                stringExtra = getApplicationContext().getResources().getString(R.string.transition_photo);
            } else {
                intent2.putExtra("circular_return_name", stringExtra);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                intent2.putExtra("start_transition_alpha", 0.5f);
            } else {
                z = false;
            }
            intent2.putExtra("start_transition_status_bar_color", getWindow().getStatusBarColor());
            intent2.putExtra("return_transition_status_bar_color", intent.getIntExtra("status_bar_color", C02160Ac.A00(this, R.color.primary_dark)));
            C0AT.A0e(this.A00, stringExtra);
            startActivity(intent2, C2HC.A04(this, this.A00, stringExtra));
            if (z) {
                A1U(false);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.1IA
                    {
                        QuickContactActivity.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        QuickContactActivity.this.A1U(false);
                    }
                }, getResources().getInteger(17694721));
            }
        }
    }

    public final void A1U(boolean z) {
        if (z) {
            final FloatingChildLayout floatingChildLayout = this.A0B;
            if (floatingChildLayout.A01 == 1) {
                floatingChildLayout.A01 = 3;
                if (floatingChildLayout.A04.isRunning()) {
                    floatingChildLayout.A04.reverse();
                } else {
                    ValueAnimator ofInt = ValueAnimator.ofInt(127, 0);
                    floatingChildLayout.A04 = ofInt;
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3Zv
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            floatingChildLayout.setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue() << 24);
                        }
                    });
                    floatingChildLayout.A04.setDuration(floatingChildLayout.A00).start();
                }
            }
            FloatingChildLayout floatingChildLayout2 = this.A0B;
            Runnable runnable = new Runnable() { // from class: X.1IB
                {
                    QuickContactActivity.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QuickContactActivity.this.A1R();
                }
            };
            int i = floatingChildLayout2.A03;
            if (i != 1 && i != 2) {
                finish();
                overridePendingTransition(0, 0);
                return;
            }
            floatingChildLayout2.A03 = 3;
            floatingChildLayout2.A07.invalidate();
            floatingChildLayout2.A02(true, runnable);
            return;
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public boolean A1V() {
        if (this.A0B.A03 == 2) {
            A1U(true);
        }
        return true;
    }

    public void lambda$onCreate$2858$QuickContactActivity(View view) {
        C21O c21o;
        double doubleExtra = getIntent().getDoubleExtra("location_latitude", 0.0d);
        double doubleExtra2 = getIntent().getDoubleExtra("location_longitude", 0.0d);
        if (doubleExtra == 0.0d && doubleExtra2 == 0.0d) {
            C41461tx c41461tx = this.A08;
            AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("gjid"));
            if (A02 != null) {
                Jid A03 = this.A07.A03(UserJid.class);
                if (A03 != null) {
                    synchronized (c41461tx.A0S) {
                        Map map = (Map) c41461tx.A0C().get(A02);
                        long A05 = c41461tx.A0G.A05();
                        if (map != null && (c21o = (C21O) map.get(A03)) != null && C41461tx.A02(c21o.A00, A05)) {
                            C0K0 c0k0 = (C0K0) c41461tx.A0d.get(c21o.A01);
                            if (c0k0 != null) {
                                doubleExtra = c0k0.A00;
                                doubleExtra2 = c0k0.A01;
                            }
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        if (doubleExtra != 0.0d && doubleExtra2 != 0.0d) {
            this.A09.A09(this, doubleExtra, doubleExtra2, this.A04.A08(this.A07, false));
        }
        A1U(false);
    }

    public /* synthetic */ void lambda$onCreate$2861$QuickContactActivity(View view) {
        ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, this.A07));
        A1U(false);
    }

    public /* synthetic */ void lambda$onCreate$2862$QuickContactActivity(View view) {
        if (this.A0C.A06(this.A07, this, 7, true)) {
            A1U(false);
        }
    }

    public /* synthetic */ void lambda$onCreate$2863$QuickContactActivity(View view) {
        if (this.A0C.A00(this.A07, this, 7, true, true) == 0) {
            A1U(false);
        }
    }

    public void lambda$onCreate$2864$QuickContactActivity(View view) {
        if (this.A07.A0C()) {
            GroupChatInfo.A01(this.A07, this, null);
        } else {
            C06C c06c = this.A07;
            if (c06c.A0D()) {
                ListChatInfo.A01(c06c, this, null);
            } else {
                ContactInfoActivity.A03(c06c, this, null);
            }
        }
        A1U(false);
    }

    public void lambda$onCreate$2865$QuickContactActivity(View view) {
        C0W5 c0w5 = this.A01;
        StringBuilder A0P = C000200d.A0P("smsto:");
        A0P.append(this.A07.A08.A01);
        c0w5.A00(this, Uri.parse(A0P.toString()), getString(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/"), 16);
        A1U(false);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        A1U(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1  */
    @Override // X.C0W4, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QuickContactActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A03.A00(this.A0E);
    }
}
