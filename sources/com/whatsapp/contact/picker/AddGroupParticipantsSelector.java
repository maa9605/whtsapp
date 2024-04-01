package com.whatsapp.contact.picker;

import X.AbstractActivityC40691si;
import X.AnonymousClass088;
import X.C011005l;
import X.C02160Ac;
import X.C06030Rg;
import X.C06C;
import X.C0C8;
import X.C2NL;
import X.C58002qQ;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class AddGroupParticipantsSelector extends C2NL {
    public C0C8 A00;
    public final Set A01 = new HashSet();

    @Override // X.AbstractActivityC40691si
    public void A1i(int i) {
    }

    @Override // X.AbstractActivityC40691si
    public void A1j(C58002qQ c58002qQ, C06C c06c) {
        super.A1j(c58002qQ, c06c);
        boolean contains = this.A01.contains(c06c.A03(UserJid.class));
        boolean A0H = ((AbstractActivityC40691si) this).A0G.A0H((UserJid) c06c.A03(UserJid.class));
        View view = c58002qQ.A00;
        AnonymousClass088.A1T(view);
        if (!contains && !A0H) {
            c58002qQ.A02.setTypeface(null, 0);
            C06030Rg c06030Rg = c58002qQ.A03;
            c06030Rg.A01.setTextColor(C02160Ac.A00(this, R.color.list_item_title));
            return;
        }
        TextEmojiLabel textEmojiLabel = c58002qQ.A02;
        int i = R.string.tap_unblock;
        if (contains) {
            i = R.string.contact_already_in_group;
        }
        textEmojiLabel.setText(i);
        c58002qQ.A01.setEnabled(false);
        textEmojiLabel.setTypeface(null, 2);
        textEmojiLabel.setVisibility(0);
        C06030Rg c06030Rg2 = c58002qQ.A03;
        c06030Rg2.A01.setTextColor(C02160Ac.A00(this, R.color.list_item_disabled));
        if (!contains) {
            return;
        }
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setFocusable(true);
    }

    @Override // X.AbstractActivityC40691si
    public void A1k(C06C c06c) {
        if (this.A01.contains(c06c.A03(UserJid.class))) {
            return;
        }
        super.A1k(c06c);
    }

    @Override // X.C2NL, X.AbstractActivityC40691si, X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C011005l A04 = C011005l.A04(getIntent().getStringExtra("gid"));
        if (A04 != null) {
            this.A01.addAll(this.A00.A01(A04).A04().A02());
        }
    }
}
