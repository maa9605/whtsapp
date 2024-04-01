package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactPicker;
import com.whatsapp.util.Log;

/* renamed from: X.0Ku */
/* loaded from: classes.dex */
public abstract class AbstractActivityC04530Ku extends AbstractActivityC04540Kv {
    public ViewGroup A00;
    public TextView A01;
    public C02E A02;

    public View A1P() {
        View inflate = View.inflate(this, R.layout.share_link_action_item, null);
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
            return inflate;
        }
        throw null;
    }

    public C35481jD A1Q() {
        final C35481jD c35481jD = new C35481jD();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.1IV
            {
                AbstractActivityC04530Ku.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC04530Ku abstractActivityC04530Ku = AbstractActivityC04530Ku.this;
                C35481jD c35481jD2 = c35481jD;
                ClipboardManager A06 = abstractActivityC04530Ku.A02.A06();
                if (A06 == null) {
                    ((ActivityC02290Ap) abstractActivityC04530Ku).A0A.A07(R.string.view_contact_unsupport, 0);
                } else if (TextUtils.isEmpty(c35481jD2.A00)) {
                } else {
                    try {
                        String str = c35481jD2.A00;
                        A06.setPrimaryClip(ClipData.newPlainText(str, str));
                        ((ActivityC02290Ap) abstractActivityC04530Ku).A0A.A07(R.string.link_copied_confirmation, 0);
                    } catch (NullPointerException e) {
                        Log.e("sharelinkactivity/copylink/npe", e);
                        ((ActivityC02290Ap) abstractActivityC04530Ku).A0A.A07(R.string.view_contact_unsupport, 0);
                    }
                }
            }
        };
        ((C1LA) c35481jD).A00 = A1P();
        c35481jD.A00(R.drawable.ic_action_copy, getString(R.string.copy_link), onClickListener);
        return c35481jD;
    }

    public C35491jE A1R() {
        final C35491jE c35491jE = new C35491jE();
        final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.1IX
            {
                AbstractActivityC04530Ku.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC04530Ku abstractActivityC04530Ku = AbstractActivityC04530Ku.this;
                C35491jE c35491jE2 = c35491jE;
                C000200d.A1N(C000200d.A0P("sharelinkactivity/sharelink/"), c35491jE2.A02);
                if (!TextUtils.isEmpty(c35491jE2.A02)) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", c35491jE2.A02);
                    if (!TextUtils.isEmpty(c35491jE2.A01)) {
                        intent.putExtra("android.intent.extra.SUBJECT", c35491jE2.A01);
                    }
                    intent.setType("text/plain");
                    intent.addFlags(524288);
                    abstractActivityC04530Ku.startActivity(Intent.createChooser(intent, c35491jE2.A00));
                }
            }
        };
        findViewById(R.id.link_btn).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1jB
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                Runnable runnable = ((C1LA) c35491jE).A01;
                if (runnable != null) {
                    runnable.run();
                }
                onClickListener.onClick(view);
            }
        });
        ((C1LA) c35491jE).A00 = A1P();
        c35491jE.A00(R.drawable.ic_share, getString(R.string.share_link), onClickListener);
        return c35491jE;
    }

    public C35501jF A1S() {
        final C35501jF c35501jF = new C35501jF();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.1IW
            {
                AbstractActivityC04530Ku.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC04530Ku abstractActivityC04530Ku = AbstractActivityC04530Ku.this;
                C35501jF c35501jF2 = c35501jF;
                C000200d.A1N(C000200d.A0P("sharelinkactivity/sendlink/"), c35501jF2.A00);
                if (!TextUtils.isEmpty(c35501jF2.A00)) {
                    String str = c35501jF2.A00;
                    Intent intent = new Intent(abstractActivityC04530Ku, ContactPicker.class);
                    intent.putExtra("android.intent.extra.TEXT", str);
                    intent.setType("text/plain");
                    intent.addFlags(524288);
                    abstractActivityC04530Ku.startActivity(intent);
                }
            }
        };
        String string = getString(R.string.localized_app_name);
        ((C1LA) c35501jF).A00 = A1P();
        c35501jF.A00(R.drawable.ic_action_forward, getString(R.string.share_link_via_whatsapp, string), onClickListener);
        return c35501jF;
    }

    @Override // X.AbstractActivityC04540Kv, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            setContentView(R.layout.share_link);
            this.A00 = (ViewGroup) findViewById(R.id.share_link_root);
            this.A01 = (TextView) findViewById(R.id.link);
            return;
        }
        throw null;
    }
}
