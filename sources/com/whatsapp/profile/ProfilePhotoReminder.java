package com.whatsapp.profile;

import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass222;
import X.AnonymousClass223;
import X.C000500h;
import X.C005002g;
import X.C02E;
import X.C02L;
import X.C02O;
import X.C04510Kl;
import X.C06C;
import X.C0GA;
import X.C0L7;
import X.C0LF;
import X.C2AO;
import X.C2MB;
import X.C2MI;
import X.C40291rx;
import X.C40301ry;
import X.C43981yK;
import X.C455822q;
import X.C456723a;
import X.C47682Ce;
import X.C52652b6;
import X.InterfaceC002901k;
import X.InterfaceC09180cm;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.WaEditText;
import com.whatsapp.crop.CropImage;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class ProfilePhotoReminder extends AnonymousClass222 {
    public static long A0Q = -1;
    public static boolean A0R;
    public Bitmap A00;
    public Handler A01;
    public View A02;
    public ImageView A03;
    public C02L A04;
    public C005002g A05;
    public WaEditText A06;
    public C0L7 A07;
    public AnonymousClass008 A08;
    public C0LF A09;
    public C02E A0A;
    public C06C A0B;
    public C47682Ce A0C;
    public AnonymousClass223 A0D;
    public C2MI A0E;
    public C455822q A0F;
    public C40291rx A0G;
    public C40301ry A0H;
    public C02O A0I;
    public C456723a A0J;
    public C2AO A0K;
    public C2MB A0L;
    public InterfaceC002901k A0M;
    public Runnable A0N;
    public final InterfaceC09180cm A0O = new InterfaceC09180cm() { // from class: X.2b4
        {
            ProfilePhotoReminder.this = this;
        }

        @Override // X.InterfaceC09180cm
        public void AHj() {
            ProfilePhotoReminder.this.A06.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            C002701i.A1H(ProfilePhotoReminder.this.A06, iArr, 25);
        }
    };
    public final C0GA A0P = new C0GA() { // from class: X.2b5
        {
            ProfilePhotoReminder.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            ProfilePhotoReminder profilePhotoReminder = ProfilePhotoReminder.this;
            if (profilePhotoReminder.A0B != null) {
                C02L c02l = profilePhotoReminder.A04;
                c02l.A05();
                if (abstractC005302j.equals(c02l.A03)) {
                    C02L c02l2 = profilePhotoReminder.A04;
                    c02l2.A05();
                    profilePhotoReminder.A0B = c02l2.A01;
                    profilePhotoReminder.A1P();
                }
            }
        }
    };

    public static synchronized void A00(C000500h c000500h, C005002g c005002g) {
        synchronized (ProfilePhotoReminder.class) {
            A0R = true;
            if (c005002g.A04()) {
                Log.w("profilephotoreminder/savelastremindertimestamp/clock is wrong, not saving last profile photo reminder time");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                A0Q = currentTimeMillis;
                c000500h.A0D().putLong("wa_last_reminder_timestamp", currentTimeMillis).apply();
            }
        }
    }

    public static synchronized boolean A01() {
        boolean z;
        synchronized (ProfilePhotoReminder.class) {
            z = A0R;
        }
        return z;
    }

    public final void A1P() {
        Bitmap A02;
        this.A02.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.registration_profile_photo_size);
        float dimension = getResources().getDimension(R.dimen.registration_profile_photo_radius);
        C02L c02l = this.A04;
        c02l.A05();
        if (C04510Kl.A00(c02l.A03)) {
            this.A03.setEnabled(false);
            this.A02.setVisibility(0);
            A02 = this.A00;
            if (A02 == null) {
                A02 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ALPHA_8);
                this.A00 = A02;
            }
        } else {
            this.A03.setEnabled(true);
            this.A02.setVisibility(4);
            A02 = this.A09.A02(this, this.A0B, dimensionPixelSize, dimension, false);
            if (A02 == null) {
                C06C c06c = this.A0B;
                if (c06c.A02 == 0 && c06c.A01 == 0) {
                    this.A02.setVisibility(0);
                    Handler handler = this.A01;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        this.A01 = handler;
                        this.A0N = new RunnableEBaseShape5S0100000_I0_5(this, 2);
                    }
                    handler.removeCallbacks(this.A0N);
                    this.A01.postDelayed(this.A0N, 30000L);
                } else {
                    this.A02.setVisibility(4);
                }
                if (this.A07 != null) {
                    A02 = C0L7.A01(this, R.drawable.avatar_contact, dimensionPixelSize, dimension);
                } else {
                    throw null;
                }
            }
        }
        this.A03.setImageBitmap(A02);
    }

    public /* synthetic */ void lambda$onCreate$2076$ProfilePhotoReminder(View view) {
        this.A0J.A04(this, this.A0B, 12);
    }

    public /* synthetic */ void lambda$onCreate$2078$ProfilePhotoReminder(View view) {
        String trim = this.A06.getText().toString().trim();
        if (C43981yK.A0H(trim, C52652b6.A01)) {
            Log.w("registername/checkmarks in pushname");
            AUh(PushnameEmojiBlacklistDialogFragment.A00(trim));
        } else if (trim.length() == 0) {
            Log.w("registername/no-pushname");
            ((ActivityC02290Ap) this).A0A.A07(R.string.register_failure_noname, 0);
        } else if (!trim.equals(this.A04.A02())) {
            this.A0M.AS1(new RunnableEBaseShape0S1100000_I0(this, trim, 19));
            return;
        }
        finish();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 12) {
            if (i2 != -1) {
                return;
            }
            if (intent != null && intent.getBooleanExtra("is_reset", false)) {
                this.A02.setVisibility(0);
                this.A0J.A06(this.A0B);
                return;
            }
            this.A0J.A05(this, intent, 13, this);
        } else if (i != 13) {
            super.onActivityResult(i, i2, intent);
        } else {
            this.A0J.A03().delete();
            if (i2 == -1) {
                if (!this.A0J.A09(this.A0B)) {
                    return;
                }
                this.A02.setVisibility(0);
            } else if (i2 != 0 || intent == null) {
            } else {
                CropImage.A00(this.A0J.A02, intent, this);
            }
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A0D.A02()) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
        if (X.C0LX.A01 == false) goto L23;
     */
    @Override // X.AnonymousClass222, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ProfilePhotoReminder.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A08.A00(this.A0P);
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacks(this.A0N);
        }
    }
}
