package com.whatsapp.invites;

import X.AnonymousClass012;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.C000200d;
import X.C002301c;
import X.C011005l;
import X.C018508q;
import X.C018708s;
import X.C02160Ac;
import X.C02L;
import X.C03340Fh;
import X.C04570Ky;
import X.C05M;
import X.C05W;
import X.C05Y;
import X.C07700Zi;
import X.C0C8;
import X.C0C9;
import X.C0EG;
import X.C0GG;
import X.C0L5;
import X.C0Zn;
import X.C2H4;
import X.C2H6;
import X.C2H7;
import X.C2JZ;
import X.C3DV;
import X.C68593Ko;
import X.InterfaceC002901k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;

/* loaded from: classes2.dex */
public class ViewGroupInviteActivity extends C2H6 implements C2H7 {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public C018508q A07;
    public C02L A08;
    public C05W A09;
    public C018708s A0A;
    public C0Zn A0B;
    public C0L5 A0C;
    public AnonymousClass012 A0D;
    public C002301c A0E;
    public C05M A0F;
    public C03340Fh A0G;
    public C0C9 A0H;
    public C0C8 A0I;
    public C2JZ A0J;
    public C011005l A0K;
    public UserJid A0L;
    public C05Y A0M;
    public C0EG A0N;
    public C07700Zi A0O;
    public C04570Ky A0P;
    public InterfaceC002901k A0Q;
    public Runnable A0R;
    public boolean A0S;
    public final C0GG A0T = new C2H4(this);

    public final void A1P(int i) {
        this.A05.setText(i);
        this.A03.setVisibility(4);
        this.A01.setVisibility(0);
        this.A02.setVisibility(4);
        this.A00.setVisibility(8);
    }

    @Override // X.C2H7
    public void AOI(UserJid userJid) {
        this.A06.setText(R.string.revoking_invite);
        this.A03.setVisibility(0);
        this.A02.setVisibility(4);
        InterfaceC002901k interfaceC002901k = this.A0Q;
        C018508q c018508q = this.A07;
        C0EG c0eg = this.A0N;
        C011005l c011005l = this.A0K;
        if (c011005l != null) {
            interfaceC002901k.ARy(new C68593Ko(c018508q, c0eg, this, c011005l, userJid), new Void[0]);
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$onCreate$1858$ViewGroupInviteActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$1859$ViewGroupInviteActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$1860$ViewGroupInviteActivity(View view) {
        finish();
    }

    @Override // X.C2H6, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        C07700Zi c07700Zi;
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("from_me") && intent.hasExtra("key_remote_jid") && intent.hasExtra("key_id")) {
            this.A0S = intent.getBooleanExtra("from_me", false);
            UserJid nullable = UserJid.getNullable(intent.getStringExtra("key_remote_jid"));
            this.A0L = nullable;
            if (nullable != null) {
                AnonymousClass092 A05 = this.A0H.A0H.A05(new AnonymousClass094(nullable, this.A0S, intent.getStringExtra("key_id")));
                if (A05 instanceof C04570Ky) {
                    C04570Ky c04570Ky = (C04570Ky) A05;
                    this.A0P = c04570Ky;
                    C011005l c011005l = c04570Ky.A01;
                    this.A0K = c011005l;
                    if (c011005l == null) {
                        this.A07.A07(R.string.failed_accept_bad_invite_link, 1);
                    } else {
                        UserJid of = UserJid.of(c04570Ky.A0n.A00);
                        if (c011005l != null && (str = c04570Ky.A05) != null && of != null) {
                            c07700Zi = new C07700Zi(c011005l, of, str, c04570Ky.A00);
                        } else {
                            c07700Zi = null;
                        }
                        this.A0O = c07700Zi;
                        if (c07700Zi != null) {
                            setTitle(R.string.app_name);
                            setContentView(R.layout.view_group_invite);
                            final View findViewById = findViewById(R.id.invite_container);
                            final View findViewById2 = findViewById(R.id.background);
                            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2xR
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public void onGlobalLayout() {
                                    View view = findViewById;
                                    view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                                    translateAnimation.setDuration(200L);
                                    view.startAnimation(translateAnimation);
                                    findViewById2.startAnimation(translateAnimation);
                                }
                            });
                            this.A0B = this.A0C.A04(this);
                            this.A03 = (ViewGroup) findViewById(R.id.progress);
                            this.A02 = (ViewGroup) findViewById(R.id.group_info);
                            this.A01 = (ViewGroup) findViewById(R.id.error);
                            this.A06 = (TextView) findViewById(R.id.progress_text);
                            this.A05 = (TextView) findViewById(R.id.error_text);
                            this.A04 = (ImageView) findViewById(R.id.group_photo);
                            this.A00 = findViewById(R.id.group_photo_container);
                            C2JZ c2jz = new C2JZ(this, this.A0D, this.A0F, this.A09, this.A0A, this.A0E, this.A0B, (ViewGroup) findViewById(R.id.invite_root));
                            this.A0J = c2jz;
                            c2jz.A0G = false;
                            findViewById(R.id.invite_ignore).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 28));
                            TextView textView = (TextView) findViewById(R.id.invite_accept);
                            textView.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 40));
                            boolean z = this.A0S;
                            int i = R.string.join_group_by_link;
                            if (z) {
                                i = R.string.revoke_invite;
                            }
                            textView.setText(i);
                            findViewById(R.id.ok).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 29));
                            this.A0G.A00(this.A0T);
                            findViewById(R.id.filler).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 27));
                            InterfaceC002901k interfaceC002901k = this.A0Q;
                            C02L c02l = this.A08;
                            C0EG c0eg = this.A0N;
                            C05Y c05y = this.A0M;
                            C05W c05w = this.A09;
                            C018708s c018708s = this.A0A;
                            C0C8 c0c8 = this.A0I;
                            C04570Ky c04570Ky2 = this.A0P;
                            if (c04570Ky2 != null) {
                                C07700Zi c07700Zi2 = this.A0O;
                                if (c07700Zi2 != null) {
                                    interfaceC002901k.ARy(new C3DV(c02l, c0eg, c05y, c05w, c018708s, c0c8, this, c04570Ky2, c07700Zi2), new Void[0]);
                                    if (Build.VERSION.SDK_INT >= 21) {
                                        getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                                        getWindow().setStatusBarColor(0);
                                        getWindow().setNavigationBarColor(C02160Ac.A00(this, R.color.black));
                                    }
                                    findViewById(R.id.invite_container).startAnimation(C000200d.A03(0.0f, 1.0f, 150L));
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        this.A07.A07(R.string.failed_accept_bad_invite_link, 1);
                    }
                }
            }
        }
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0R;
        if (runnable != null) {
            this.A07.A02.removeCallbacks(runnable);
            this.A0R = null;
        }
        this.A0G.A01(this.A0T);
        this.A0B.A00();
    }
}
