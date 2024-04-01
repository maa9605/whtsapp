package com.whatsapp.ephemeral;

import X.AbstractActivityC49912Np;
import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass072;
import X.C000200d;
import X.C003101m;
import X.C011005l;
import X.C018508q;
import X.C018608r;
import X.C03340Fh;
import X.C05U;
import X.C05V;
import X.C0CM;
import X.C0EG;
import X.C0ES;
import X.C0GA;
import X.C0KU;
import X.C0TD;
import X.C2nQ;
import X.C36821lQ;
import X.C38801p0;
import X.C40071rX;
import X.C40261rr;
import X.C41991uq;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* loaded from: classes2.dex */
public class ChangeEphemeralSettingActivity extends AbstractActivityC49912Np {
    public int A00;
    public int A01;
    public C38801p0 A02;
    public C018608r A03;
    public C40261rr A04;
    public AnonymousClass008 A05;
    public AnonymousClass072 A06;
    public C03340Fh A07;
    public AnonymousClass011 A08;
    public C0ES A09;
    public AbstractC005302j A0A;
    public C0EG A0B;
    public C40071rX A0C;
    public C41991uq A0D;
    public final C0GA A0E = new C0GA() { // from class: X.3Ad
        {
            ChangeEphemeralSettingActivity.this = this;
        }

        @Override // X.C0GA
        public void A05(Collection collection) {
            ChangeEphemeralSettingActivity changeEphemeralSettingActivity = ChangeEphemeralSettingActivity.this;
            AbstractC005302j abstractC005302j = changeEphemeralSettingActivity.A0A;
            if (C003101m.A0b(abstractC005302j) && changeEphemeralSettingActivity.A04.A0H(UserJid.of(abstractC005302j)) && !changeEphemeralSettingActivity.isFinishing()) {
                C018508q c018508q = ((ActivityC02290Ap) changeEphemeralSettingActivity).A0A;
                int i = changeEphemeralSettingActivity.A01;
                int i2 = R.string.ephemeral_unblock_to_turn_setting_on;
                if (i == 0) {
                    i2 = R.string.ephemeral_unblock_to_turn_setting_off;
                }
                c018508q.A07(i2, 1);
                changeEphemeralSettingActivity.finish();
            }
        }
    };

    public static void A00(final C40261rr c40261rr, final ActivityC02290Ap activityC02290Ap, final UserJid userJid, int i) {
        final Intent intent = new Intent(activityC02290Ap, ChangeEphemeralSettingActivity.class);
        intent.putExtra("jid", userJid.getRawString());
        intent.putExtra("current_setting", i);
        if (!c40261rr.A0H(userJid)) {
            activityC02290Ap.startActivity(intent);
            return;
        }
        int i2 = R.string.ephemeral_unblock_to_turn_setting_on;
        if (i > 0) {
            i2 = R.string.ephemeral_unblock_to_turn_setting_off;
        }
        activityC02290Ap.AUh(UnblockDialogFragment.A00(activityC02290Ap.getString(i2), R.string.blocked_title, false, new C2nQ() { // from class: X.3Ab
            @Override // X.C2nQ
            public final void AVi() {
                Activity activity = activityC02290Ap;
                C40261rr c40261rr2 = c40261rr;
                final Intent intent2 = intent;
                UserJid userJid2 = userJid;
                final WeakReference weakReference = new WeakReference(activity);
                c40261rr2.A07(activity, new InterfaceC40271rs() { // from class: X.3Ac
                    @Override // X.InterfaceC40271rs
                    public final void AOE(boolean z) {
                        Context context;
                        WeakReference weakReference2 = weakReference;
                        Intent intent3 = intent2;
                        if (z && (context = (Context) weakReference2.get()) != null) {
                            context.startActivity(intent3);
                        }
                    }
                }, userJid2);
            }
        }));
    }

    public final void A1P() {
        AbstractC005302j abstractC005302j = this.A0A;
        if (abstractC005302j != null) {
            boolean A0b = C003101m.A0b(abstractC005302j);
            if (A0b && this.A04.A0H((UserJid) abstractC005302j)) {
                C018508q c018508q = ((ActivityC02290Ap) this).A0A;
                int i = this.A01;
                int i2 = R.string.ephemeral_unblock_to_turn_setting_on;
                if (i == 0) {
                    i2 = R.string.ephemeral_unblock_to_turn_setting_off;
                }
                c018508q.A07(i2, 1);
                return;
            }
            int i3 = this.A01;
            if (i3 == -1 || this.A00 == i3) {
                return;
            }
            if (((ActivityC02290Ap) this).A0D.A05()) {
                AbstractC005302j abstractC005302j2 = this.A0A;
                if (C003101m.A0V(abstractC005302j2)) {
                    C011005l c011005l = (C011005l) abstractC005302j2;
                    int i4 = this.A01;
                    this.A0B.A0E(c011005l, i4, new C0TD(this.A0D, this.A09, this.A07, c011005l, null, null, 224, null));
                    C36821lQ c36821lQ = new C36821lQ();
                    c36821lQ.A00 = Long.valueOf(i4);
                    this.A08.A0B(c36821lQ, null, false);
                    return;
                } else if (A0b) {
                    UserJid userJid = (UserJid) abstractC005302j2;
                    int i5 = this.A01;
                    C018608r c018608r = this.A03;
                    C0CM A09 = c018608r.A0Q.A09(userJid);
                    if (A09 == null || A09.expiration != i5) {
                        C05U c05u = c018608r.A12;
                        long A05 = c018608r.A0J.A05();
                        C05V c05v = c05u.A07;
                        C0KU c0ku = new C0KU(C05V.A00(c05v.A01, c05v.A00, userJid, true), i5, A05);
                        c0ku.A0G = userJid;
                        c0ku.A0d = null;
                        c018608r.A0U.A0Q(c0ku);
                    }
                    C36821lQ c36821lQ2 = new C36821lQ();
                    c36821lQ2.A00 = Long.valueOf(i5);
                    this.A08.A0B(c36821lQ2, null, false);
                    return;
                } else {
                    StringBuilder A0P = C000200d.A0P("Ephemeral not supported for this type of jid, type=");
                    A0P.append(abstractC005302j2.getType());
                    Log.e(A0P.toString());
                    return;
                }
            }
            ((ActivityC02290Ap) this).A0A.A07(R.string.ephemeral_setting_internet_needed, 1);
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$onCreate$1731$ChangeEphemeralSettingActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        A1P();
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f5, code lost:
        if (X.C003101m.A0b(r5) != false) goto L64;
     */
    @Override // X.AbstractActivityC49912Np, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ephemeral.ChangeEphemeralSettingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A05.A00(this.A0E);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A1P();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A01);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        C38801p0 c38801p0 = this.A02;
        if (c38801p0 != null) {
            c38801p0.start();
        }
        EphemeralNUXDialog.A00(((ActivityC02290Ap) this).A0F, A0N(), true);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        C38801p0 c38801p0 = this.A02;
        if (c38801p0 != null) {
            c38801p0.stop();
        }
        super.onStop();
    }
}
