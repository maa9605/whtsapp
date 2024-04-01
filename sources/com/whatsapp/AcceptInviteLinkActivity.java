package com.whatsapp;

import X.AbstractActivityC06850Vh;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02290Ap;
import X.AnonymousClass012;
import X.C000200d;
import X.C002301c;
import X.C002701i;
import X.C011005l;
import X.C018708s;
import X.C02160Ac;
import X.C02L;
import X.C03340Fh;
import X.C05M;
import X.C05W;
import X.C05Y;
import X.C09120cg;
import X.C09140ci;
import X.C09150cj;
import X.C09170cl;
import X.C0C8;
import X.C0EG;
import X.C0GG;
import X.C0L5;
import X.C0S4;
import X.C0Yw;
import X.C0Zn;
import X.C2JZ;
import X.C52622b3;
import X.InterfaceC002901k;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class AcceptInviteLinkActivity extends AbstractActivityC06850Vh {
    public C02L A00;
    public C05W A01;
    public C018708s A02;
    public C0Zn A03;
    public C0L5 A04;
    public AnonymousClass012 A05;
    public C002301c A06;
    public C05M A07;
    public C03340Fh A08;
    public C0C8 A09;
    public C2JZ A0A;
    public C011005l A0B;
    public C05Y A0C;
    public C0EG A0D;
    public InterfaceC002901k A0E;
    public Runnable A0F;
    public final C0GG A0G = new C09120cg(this);

    public static String A00(Uri uri) {
        if (uri == null) {
            return null;
        }
        if ("whatsapp".equals(uri.getScheme())) {
            if ("chat".equals(uri.getHost())) {
                String queryParameter = uri.getQueryParameter("code");
                if (queryParameter == null) {
                    return uri.getLastPathSegment();
                }
                return queryParameter;
            }
            return null;
        } else if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) {
            if ("chat.whatsapp.com".equals(uri.getHost())) {
                return uri.getLastPathSegment();
            }
            if ("whatsapp.com".equals(uri.getHost()) && "chat".equals(uri.getLastPathSegment())) {
                return uri.getQueryParameter("code");
            }
            return null;
        } else {
            return null;
        }
    }

    public static void A01(Activity activity, Intent intent) {
        String A00;
        Uri data = intent.getData();
        String action = intent.getAction();
        if ("android.nfc.action.NDEF_DISCOVERED".equals(action)) {
            NdefMessage ndefMessage = (NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
            if (!"application/com.whatsapp.join".equals(new String(ndefMessage.getRecords()[0].getType(), Charset.forName("US-ASCII")))) {
                return;
            }
            A00 = new String(ndefMessage.getRecords()[0].getPayload(), Charset.forName("US-ASCII"));
            if (TextUtils.isEmpty(A00)) {
                Log.e("acceptlink/nfc/no-code");
            } else {
                C000200d.A14("acceptlink/nfc/code/", A00);
            }
        } else if (!"android.intent.action.VIEW".equals(action) || (A00 = A00(data)) == null) {
            return;
        }
        intent.setData(null);
        Intent intent2 = new Intent(activity, AcceptInviteLinkActivity.class);
        intent2.putExtra("code", A00);
        activity.startActivity(intent2);
    }

    public static void A02(AcceptInviteLinkActivity acceptInviteLinkActivity, String str, C52622b3 c52622b3, int i) {
        if (c52622b3 != null) {
            C05M c05m = acceptInviteLinkActivity.A07;
            C011005l c011005l = c52622b3.A01;
            if (c05m.A0E(c011005l) && acceptInviteLinkActivity.A09.A05(c011005l)) {
                StringBuilder A0P = C000200d.A0P("acceptlink/processcode/exists/");
                A0P.append(c011005l);
                Log.i(A0P.toString());
                ((ActivityC02290Ap) acceptInviteLinkActivity).A0A.A07(R.string.accept_invite_link_already_in_group, 1);
                acceptInviteLinkActivity.A1Q(str, c52622b3, true);
                return;
            } else if (!acceptInviteLinkActivity.AFE()) {
                StringBuilder A0P2 = C000200d.A0P("acceptlink/processcode/showconfirmation/");
                A0P2.append(c011005l);
                Log.i(A0P2.toString());
                acceptInviteLinkActivity.A1Q(str, c52622b3, false);
                return;
            } else {
                StringBuilder A0P3 = C000200d.A0P("acceptlink/processcode/activityended/");
                A0P3.append(c011005l);
                Log.i(A0P3.toString());
                return;
            }
        }
        C000200d.A0p("acceptlink/processcode/failed/", i);
        if (i == 0) {
            acceptInviteLinkActivity.A1P(R.string.network_required);
        } else if (i == 401) {
            acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_link_banned);
        } else if (i == 404) {
            acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_link_no_group);
        } else if (i == 406) {
            acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_link_invalid);
        } else if (i == 410) {
            acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_link_reset);
        } else if (i != 419) {
            acceptInviteLinkActivity.A1P(R.string.register_try_again_later);
        } else {
            acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_group_full);
        }
    }

    public final void A1P(int i) {
        findViewById(R.id.progress).setVisibility(4);
        findViewById(R.id.group_info).setVisibility(4);
        findViewById(R.id.error).setVisibility(0);
        ((TextView) findViewById(R.id.error_text)).setText(i);
        findViewById(R.id.ok).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.0ch
            {
                AcceptInviteLinkActivity.this = this;
            }

            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                AcceptInviteLinkActivity.this.finish();
            }
        });
    }

    public final void A1Q(final String str, final C52622b3 c52622b3, final boolean z) {
        this.A0A.A01(c52622b3, 0L);
        C011005l c011005l = c52622b3.A01;
        C0EG c0eg = this.A0D;
        C09140ci c09140ci = new C09140ci(this);
        if (c0eg.A02.A06 && c0eg.A02.A02) {
            C05Y c05y = c0eg.A07;
            String A02 = c05y.A02();
            try {
                c05y.A05(A02, Message.obtain(null, 0, 112, 0, new C0Yw(A02, c011005l, str, c09140ci)), false);
            } catch (C0S4 unused) {
            }
        }
        TextView textView = (TextView) findViewById(R.id.invite_accept);
        if (z) {
            textView.setText(R.string.group_invite_message);
        } else {
            textView.setText(R.string.join_group);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: X.1FP
            {
                AcceptInviteLinkActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AcceptInviteLinkActivity.this.A1R(z, c52622b3, str);
            }
        });
        findViewById(R.id.invite_ignore).setOnClickListener(new View.OnClickListener() { // from class: X.1FR
            {
                AcceptInviteLinkActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AcceptInviteLinkActivity.this.lambda$displayGroupInfo$2795$AcceptInviteLinkActivity(view);
            }
        });
        findViewById(R.id.progress).setVisibility(8);
        findViewById(R.id.group_info).setVisibility(0);
    }

    public void A1R(boolean z, C52622b3 c52622b3, String str) {
        Log.i("acceptlink/confirmation/ok");
        if (z) {
            Intent A02 = Conversation.A02(this, c52622b3.A01);
            C002701i.A1C(A02, "AcceptInviteLinkActivity", this.A05);
            A16(A02, true);
            return;
        }
        C011005l c011005l = c52622b3.A01;
        StringBuilder sb = new StringBuilder("acceptlink/sendjoin/");
        sb.append(str);
        sb.append(" ");
        sb.append(c011005l);
        Log.i(sb.toString());
        ((TextView) findViewById(R.id.progress_text)).setText(R.string.joining_group);
        findViewById(R.id.progress).setVisibility(0);
        findViewById(R.id.group_info).setVisibility(4);
        findViewById(R.id.error).setVisibility(4);
        this.A0B = c011005l;
        this.A0E.ARy(new C09150cj(this.A0D, this, str), new Void[0]);
    }

    public /* synthetic */ void lambda$displayGroupInfo$2795$AcceptInviteLinkActivity(View view) {
        Log.i("acceptlink/confirmation/ok");
        finish();
    }

    public /* synthetic */ void lambda$onCreate$2791$AcceptInviteLinkActivity(View view) {
        finish();
    }

    @Override // X.AbstractActivityC06850Vh, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.app_name);
        setContentView(R.layout.view_group_invite);
        final View findViewById = findViewById(R.id.invite_container);
        final View findViewById2 = findViewById(R.id.background);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0ck
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
        this.A03 = this.A04.A04(this);
        findViewById(R.id.filler).setOnClickListener(new View.OnClickListener() { // from class: X.1FQ
            {
                AcceptInviteLinkActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AcceptInviteLinkActivity.this.finish();
            }
        });
        String stringExtra = getIntent().getStringExtra("code");
        if (TextUtils.isEmpty(stringExtra)) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.failed_accept_bad_invite_link, 1);
            finish();
        } else {
            C000200d.A14("acceptlink/processcode/", stringExtra);
            this.A0E.ARy(new C09170cl(this.A00, this.A0D, this.A0C, this.A01, this.A02, this, stringExtra), new Void[0]);
        }
        C2JZ c2jz = new C2JZ(this, this.A05, this.A07, this.A01, this.A02, this.A06, this.A03, (ViewGroup) findViewById(R.id.invite_root));
        this.A0A = c2jz;
        c2jz.A0G = true;
        this.A08.A00(this.A0G);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(C02160Ac.A00(this, R.color.black));
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A08.A01(this.A0G);
        Runnable runnable = this.A0F;
        if (runnable != null) {
            ((ActivityC02290Ap) this).A0A.A02.removeCallbacks(runnable);
        }
        this.A03.A00();
    }
}
