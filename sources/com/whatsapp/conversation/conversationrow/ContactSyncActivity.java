package com.whatsapp.conversation.conversationrow;

import X.ActivityC02290Ap;
import X.AnonymousClass029;
import X.C000200d;
import X.C002701i;
import X.C05Y;
import X.C0O6;
import X.C2J8;
import X.C2L9;
import X.C2NV;
import X.C2NW;
import X.C39N;
import X.EnumC40721sl;
import X.InterfaceC002901k;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class ContactSyncActivity extends C2NV implements C0O6, C2NW {
    public C2J8 A00;
    public C2L9 A01;
    public C39N A02;
    public UserJid A03;
    public C05Y A04;
    public InterfaceC002901k A05;

    @Override // X.C0O6
    public void AJN(int i) {
    }

    @Override // X.C0O6
    public void AJO(int i) {
    }

    @Override // X.C0O6
    public void AJP(int i) {
        if (i == 1 || i == 2) {
            finish();
        }
    }

    @Override // X.C2NW
    public void ANW() {
        this.A02 = null;
        ARS();
    }

    @Override // X.C2NW
    public void APR(EnumC40721sl enumC40721sl) {
        int i;
        String string;
        this.A02 = null;
        ARS();
        if (enumC40721sl != null && enumC40721sl.A00()) {
            finish();
            C2J8 c2j8 = this.A00;
            Intent A00 = Conversation.A00(this, c2j8.A03.A0A(this.A03));
            C002701i.A1C(A00, "ShareContactUtil", c2j8.A0A);
            startActivity(A00);
            return;
        }
        if (enumC40721sl == EnumC40721sl.NETWORK_UNAVAILABLE) {
            i = 1;
            string = getString(R.string.something_went_wrong_network_required);
        } else {
            i = 2;
            string = getString(R.string.something_went_wrong);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", i);
        bundle.putString("message", string);
        bundle.putBoolean("cancelable", false);
        bundle.putString("positive_button", getString(R.string.ok));
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A0P(bundle);
        AnonymousClass029.A1D(A0N(), promptDialogFragment, null);
    }

    @Override // X.C2NW
    public void APS() {
        A1C(getString(R.string.loading_spinner));
    }

    @Override // X.C2NV, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("user_jid"));
        if (nullable != null) {
            this.A03 = nullable;
            if (!((ActivityC02290Ap) this).A0D.A05()) {
                Bundle A01 = C000200d.A01("dialog_id", 1);
                A01.putString("message", getString(R.string.something_went_wrong_network_required));
                A01.putBoolean("cancelable", false);
                A01.putString("positive_button", getString(R.string.ok));
                PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                promptDialogFragment.A0P(A01);
                promptDialogFragment.A14(A0N(), null);
                return;
            }
            C39N c39n = this.A02;
            if (c39n != null) {
                c39n.A05(true);
            }
            C39N c39n2 = new C39N(this.A04, this.A01, this, this.A03);
            this.A02 = c39n2;
            this.A05.ARy(c39n2, new Void[0]);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C39N c39n = this.A02;
        if (c39n != null) {
            c39n.A05(true);
            this.A02 = null;
        }
    }
}
