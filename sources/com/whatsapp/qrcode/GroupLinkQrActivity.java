package com.whatsapp.qrcode;

import X.ActivityC02290Ap;
import X.AnonymousClass029;
import X.C000200d;
import X.C002301c;
import X.C011005l;
import X.C012005w;
import X.C018508q;
import X.C02180Ae;
import X.C02L;
import X.C05W;
import X.C05Y;
import X.C06C;
import X.C0ES;
import X.C0We;
import X.C2Ol;
import X.C70813Ts;
import X.C79403lb;
import X.C79453lg;
import X.InterfaceC002901k;
import X.InterfaceC04550Kw;
import X.InterfaceC458223w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class GroupLinkQrActivity extends C2Ol implements InterfaceC04550Kw, InterfaceC458223w {
    public C012005w A00;
    public C018508q A01;
    public C02L A02;
    public C05W A03;
    public C002301c A04;
    public C06C A05;
    public C0ES A06;
    public C011005l A07;
    public C05Y A08;
    public C70813Ts A09;
    public ContactQrContactCardView A0A;
    public InterfaceC002901k A0B;
    public String A0C;

    public static Intent A00(Context context, GroupJid groupJid) {
        Intent intent = new Intent(context, GroupLinkQrActivity.class);
        intent.putExtra("jid", groupJid.getRawString());
        return intent;
    }

    public final void A1P(boolean z) {
        if (z) {
            AUr(0, R.string.contact_qr_wait);
        }
        C79403lb c79403lb = new C79403lb(this.A01, this.A08, this, z);
        C011005l c011005l = this.A07;
        if (c011005l == null) {
            throw null;
        }
        c79403lb.A00(c011005l);
    }

    @Override // X.InterfaceC458223w
    public void ALI(String str, int i, boolean z) {
        ARS();
        if (str != null) {
            StringBuilder sb = new StringBuilder("invitelink/gotcode/");
            sb.append(str);
            sb.append(" recreate:");
            sb.append(z);
            Log.i(sb.toString());
            this.A06.A0k.put(this.A07, str);
            this.A0C = str;
            this.A0A.setQrCode(TextUtils.isEmpty(str) ? null : C000200d.A0H("https://chat.whatsapp.com/", str));
            if (z) {
                AUj(R.string.reset_link_complete);
                return;
            }
            return;
        }
        C000200d.A0q("invitelink/failed/", i);
        if (i == 401) {
            this.A01.A07(R.string.failed_create_invite_link_not_admin, 0);
        } else if (i != 404) {
            this.A01.A07(R.string.register_try_again_later, 0);
        } else {
            this.A01.A07(R.string.failed_create_invite_link_no_group, 0);
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            return;
        }
        finish();
    }

    @Override // X.InterfaceC04550Kw
    public void ARt() {
        A1P(true);
    }

    public /* synthetic */ void lambda$onCreate$2145$GroupLinkQrActivity(View view) {
        onBackPressed();
    }

    @Override // X.C2Ol, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.group_qr_code);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(new C0We(this.A04, C02180Ae.A0Q(getResources().getDrawable(R.drawable.ic_back_teal), getResources().getColor(R.color.tealActionBarItemDrawableTint))));
        toolbar.setTitle(R.string.contact_qr_title);
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 26));
        A0k(toolbar);
        setTitle(R.string.settings_qr);
        C011005l A04 = C011005l.A04(getIntent().getStringExtra("jid"));
        if (A04 != null) {
            this.A07 = A04;
            this.A05 = this.A03.A0A(A04);
            ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) findViewById(R.id.group_qr_card);
            this.A0A = contactQrContactCardView;
            contactQrContactCardView.A01(this.A05, true);
            this.A0A.setStyle(0);
            this.A0A.setPrompt(getString(R.string.group_link_qr_prompt));
            this.A09 = new C70813Ts();
            String str = (String) this.A06.A0k.get(this.A07);
            this.A0C = str;
            if (!TextUtils.isEmpty(str)) {
                String str2 = this.A0C;
                this.A0A.setQrCode(TextUtils.isEmpty(str2) ? null : C000200d.A0H("https://chat.whatsapp.com/", str2));
            }
            A1P(false);
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_contactqr_share, 0, R.string.contact_qr_share).setIcon(C02180Ae.A0O(this, R.drawable.ic_share, R.color.shareIconTint)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_contactqr_revoke, 0, R.string.contact_qr_revoke);
        return true;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            if (this.A0C == null) {
                A1P(false);
                this.A01.A07(R.string.share_failed, 0);
                return true;
            }
            A12(R.string.contact_qr_wait);
            InterfaceC002901k interfaceC002901k = this.A0B;
            C018508q c018508q = this.A01;
            C02L c02l = this.A02;
            C012005w c012005w = this.A00;
            Object[] objArr = new Object[1];
            String str = this.A0C;
            objArr[0] = TextUtils.isEmpty(str) ? null : C000200d.A0H("https://chat.whatsapp.com/", str);
            C79453lg c79453lg = new C79453lg(c018508q, c02l, c012005w, this, getString(R.string.group_qr_email_body_with_link, objArr));
            Bitmap[] bitmapArr = new Bitmap[1];
            C06C c06c = this.A05;
            String str2 = this.A0C;
            bitmapArr[0] = AnonymousClass029.A0D(this, c06c, true, TextUtils.isEmpty(str2) ? null : C000200d.A0H("https://chat.whatsapp.com/", str2), getString(R.string.group_link_qr_share_prompt));
            interfaceC002901k.ARy(c79453lg, bitmapArr);
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_contactqr_revoke) {
            AUh(RevokeLinkConfirmationDialogFragment.A00(this.A07, true));
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A09.A01(((ActivityC02290Ap) this).A0E, getWindow());
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        this.A09.A00(getWindow());
        super.onStop();
    }
}
