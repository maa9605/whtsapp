package com.whatsapp.biz.catalog.view.activity;

import X.AbstractActivityC49852Mv;
import X.AbstractActivityC49862Mw;
import X.C018308n;
import X.C018708s;
import X.C018808t;
import X.C019208x;
import X.C05W;
import X.C06C;
import X.C2MG;
import X.C40261rr;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.ShareCatalogLinkActivity;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class CatalogListActivity extends AbstractActivityC49852Mv {
    public C40261rr A00;
    public C05W A01;
    public C018708s A02;
    public C018808t A03;
    public C2MG A04;

    public static void A00(C018308n c018308n, UserJid userJid, Context context) {
        Intent intent = new Intent(context, CatalogListActivity.class);
        intent.putExtra("cache_jid", userJid.getRawString());
        intent.putExtra("source", (Serializable) null);
        c018308n.A06(context, intent);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 106) {
            return super.onCreateDialog(i);
        }
        final C06C A0A = this.A01.A0A(((AbstractActivityC49862Mw) this).A0K);
        C019208x c019208x = new C019208x(this);
        c019208x.A01.A0E = getString(R.string.cannot_send_to_blocked_contact_1, this.A02.A08(A0A, false));
        c019208x.A06(R.string.unblock, new DialogInterface.OnClickListener() { // from class: X.2mt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                CatalogListActivity catalogListActivity = CatalogListActivity.this;
                C06C c06c = A0A;
                C40261rr c40261rr = catalogListActivity.A00;
                Jid A03 = c06c.A03(UserJid.class);
                if (A03 != null) {
                    c40261rr.A07(catalogListActivity, null, (UserJid) A03);
                    C002701i.A18(catalogListActivity, 106);
                    return;
                }
                throw null;
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2mu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C002701i.A18(CatalogListActivity.this, 106);
            }
        });
        return c019208x.A00();
    }

    @Override // X.AbstractActivityC49862Mw, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.catalog, menu);
        MenuItem findItem = menu.findItem(R.id.menu_edit);
        menu.findItem(R.id.menu_share).setVisible(((AbstractActivityC49862Mw) this).A0O);
        findItem.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AbstractActivityC49862Mw, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (R.id.menu_share != itemId) {
            if (16908332 == itemId) {
                onBackPressed();
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        }
        UserJid userJid = ((AbstractActivityC49862Mw) this).A0K;
        Intent intent = new Intent(this, ShareCatalogLinkActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("jid", userJid.getRawString());
        startActivity(intent);
        return true;
    }
}
