package com.whatsapp.blocklist;

import X.AbstractActivityC40281ru;
import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.C018708s;
import X.C01C;
import X.C02160Ac;
import X.C02180Ae;
import X.C03320Ff;
import X.C03360Fk;
import X.C05W;
import X.C06C;
import X.C0DV;
import X.C0DW;
import X.C0E7;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0GZ;
import X.C0L5;
import X.C0L7;
import X.C0Zn;
import X.C2AR;
import X.C3NR;
import X.C40261rr;
import X.C45A;
import X.C463026g;
import X.C50262Ra;
import X.C56492nN;
import X.C57722pt;
import X.C646834h;
import X.C646934i;
import X.C647034j;
import X.InterfaceC03670Gp;
import X.InterfaceC56502nP;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactPicker;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class BlockList extends AbstractActivityC40281ru {
    public C56492nN A00;
    public C40261rr A01;
    public C03320Ff A02;
    public C0L7 A03;
    public C05W A04;
    public AnonymousClass008 A05;
    public C018708s A06;
    public C0Zn A07;
    public C0L5 A08;
    public C0E7 A09;
    public C03360Fk A0A;
    public C0GZ A0B;
    public InterfaceC03670Gp A0C;
    public C463026g A0D;
    public C0DW A0E;
    public C0DV A0F;
    public C2AR A0G;
    public ArrayList A0I = new ArrayList();
    public ArrayList A0H = new ArrayList();
    public final C0GA A0K = new C0GA() { // from class: X.34b
        {
            BlockList.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            BlockList blockList = BlockList.this;
            blockList.A1R();
            blockList.A00.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            BlockList blockList = BlockList.this;
            blockList.A1R();
            blockList.A00.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            BlockList blockList = BlockList.this;
            blockList.A1R();
            blockList.A00.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            BlockList blockList = BlockList.this;
            blockList.A1R();
            blockList.A00.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A05(Collection collection) {
            BlockList blockList = BlockList.this;
            blockList.A1R();
            blockList.A00.notifyDataSetChanged();
            blockList.A1S();
        }
    };
    public final C0GC A0J = new C0GC() { // from class: X.34c
        {
            BlockList.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            BlockList blockList = BlockList.this;
            blockList.A1R();
            blockList.A00.notifyDataSetChanged();
        }
    };
    public final C0GE A0L = new C0GE() { // from class: X.34d
        {
            BlockList.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            BlockList blockList = BlockList.this;
            blockList.A1R();
            blockList.A00.notifyDataSetChanged();
        }
    };

    public final void A1R() {
        HashSet hashSet;
        this.A0H.clear();
        this.A0I.clear();
        Iterator it = ((AbstractCollection) this.A01.A02()).iterator();
        while (it.hasNext()) {
            this.A0I.add(this.A04.A0A((AbstractC005302j) it.next()));
        }
        Collections.sort(this.A0I, new C57722pt(this.A06, ((ActivityC02310Ar) this).A01));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean A0E = ((ActivityC02290Ap) this).A0B.A0E(C01C.A0k);
        Iterator it2 = this.A0I.iterator();
        while (it2.hasNext()) {
            C06C c06c = (C06C) it2.next();
            if (A0E && c06c.A0B()) {
                arrayList2.add(new C646834h(c06c));
            } else {
                arrayList.add(new C646834h(c06c));
            }
        }
        InterfaceC03670Gp interfaceC03670Gp = this.A0C;
        if (interfaceC03670Gp != null && ((C45A) interfaceC03670Gp).A06()) {
            C45A c45a = (C45A) this.A0C;
            synchronized (c45a) {
                hashSet = new HashSet(c45a.A0B);
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            Collections.sort(arrayList4);
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new C647034j((String) it3.next()));
            }
        }
        if (A0E && !arrayList.isEmpty()) {
            this.A0H.add(new C646934i(0));
        }
        this.A0H.addAll(arrayList);
        if (A0E) {
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList5 = this.A0H;
                arrayList5.add(new C646934i(1));
                arrayList5.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                this.A0H.add(new C646934i(2));
            }
        }
        this.A0H.addAll(arrayList3);
    }

    public final void A1S() {
        TextView textView = (TextView) findViewById(R.id.block_list_primary_text);
        TextView textView2 = (TextView) findViewById(R.id.block_list_help);
        View findViewById = findViewById(R.id.block_list_info);
        if (this.A01.A0G()) {
            textView2.setVisibility(0);
            findViewById.setVisibility(0);
            Drawable A03 = C02160Ac.A03(this, R.drawable.ic_add_person_tip);
            if (A03 != null) {
                textView.setText(R.string.no_blocked_contacts);
                textView2.setText(C50262Ra.A00(getString(R.string.block_list_help), C02180Ae.A0Q(A03, C02160Ac.A00(this, R.color.add_person_to_block_tint)), textView2.getPaint()));
                return;
            }
            throw null;
        }
        textView2.setVisibility(8);
        findViewById.setVisibility(8);
        boolean A02 = C0E7.A02(this);
        int i = R.string.network_required;
        if (A02) {
            i = R.string.network_required_airplane_on;
        }
        textView.setText(i);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            UserJid nullable = UserJid.getNullable(intent.getStringExtra("contact"));
            if (nullable != null) {
                this.A01.A0A(this, true, null, true, this.A04.A0A(nullable), null);
                return;
            }
            throw null;
        }
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        InterfaceC03670Gp interfaceC03670Gp;
        InterfaceC56502nP interfaceC56502nP = (InterfaceC56502nP) A1P().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() != 0) {
            return super.onContextItemSelected(menuItem);
        }
        int AAi = interfaceC56502nP.AAi();
        if (AAi != 0) {
            if (AAi == 1 && (interfaceC03670Gp = this.A0C) != null) {
                ((C45A) interfaceC03670Gp).A03(this, this.A0D, ((C647034j) interfaceC56502nP).A00, false, new C3NR() { // from class: X.34V
                    {
                        BlockList.this = this;
                    }

                    @Override // X.C3NR
                    public final void AO5(C28Q c28q) {
                        BlockList blockList = BlockList.this;
                        if (c28q == null) {
                            blockList.A1R();
                            blockList.A00.notifyDataSetChanged();
                            return;
                        }
                        blockList.AUj(R.string.payment_unblock_error);
                    }
                });
            }
            return true;
        }
        C06C c06c = ((C646834h) interfaceC56502nP).A00;
        C40261rr c40261rr = this.A01;
        if (c06c != null) {
            c40261rr.A09(this, c06c, true);
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0080, code lost:
        if ((r8.A04.A05() - r8.A00) >= 86400000) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.2nN, android.widget.ListAdapter] */
    @Override // X.AbstractActivityC40281ru, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.blocklist.BlockList.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        String A08;
        InterfaceC56502nP interfaceC56502nP = (InterfaceC56502nP) A1P().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        int AAi = interfaceC56502nP.AAi();
        if (AAi == 0) {
            A08 = this.A06.A08(((C646834h) interfaceC56502nP).A00, false);
        } else if (AAi != 1) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        } else {
            A08 = ((C647034j) interfaceC56502nP).A00;
        }
        contextMenu.add(0, 0, 0, getString(R.string.block_list_menu_unblock, A08));
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_settings_add_blocked_contact, 0, R.string.menuitem_add).setIcon(R.drawable.ic_action_add_person).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A07.A00();
        this.A05.A00(this.A0K);
        this.A02.A00(this.A0J);
        this.A0A.A00(this.A0L);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_settings_add_blocked_contact) {
            Intent intent = new Intent(this, ContactPicker.class);
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = this.A0I.iterator();
            while (it.hasNext()) {
                Jid A02 = ((C06C) it.next()).A02();
                if (A02 == null) {
                    throw null;
                }
                arrayList.add(A02.getRawString());
            }
            intent.putExtra("block_contact", true);
            intent.putStringArrayListExtra("blocked_list", arrayList);
            startActivityForResult(intent, 10);
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }
}
