package com.whatsapp.contact.picker;

import X.C002301c;
import X.C002701i;
import X.C018708s;
import X.C05W;
import X.C07630Zb;
import X.C0L5;
import X.C0L7;
import X.C0U1;
import X.C0W5;
import X.C0WY;
import X.C28661Tc;
import X.C2M6;
import X.C2NP;
import X.C37D;
import X.C3JD;
import X.InterfaceC05620Pl;
import X.InterfaceC07650Zd;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.InviteNonWhatsAppContactPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class InviteNonWhatsAppContactPickerActivity extends C2NP implements C0WY {
    public MenuItem A00;
    public Toolbar A01;
    public C07630Zb A02;
    public C0W5 A03;
    public C0L7 A04;
    public C05W A05;
    public C018708s A06;
    public C0L5 A07;
    public C3JD A08;
    public C37D A09;
    public C002301c A0A;
    public C2M6 A0B;

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C37D c37d = this.A09;
        if (c37d.A01.A01() == null || !((Boolean) c37d.A01.A01()).booleanValue()) {
            super.onBackPressed();
        } else {
            this.A09.A01.A0B(Boolean.FALSE);
        }
    }

    @Override // X.C2NP, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.invite_non_whatsapp_contact_picker);
        setTitle(R.string.tell_a_friend);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.A01 = toolbar;
        A0k(toolbar);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0M(true);
            this.A02 = new C07630Zb(this, this.A0A, findViewById(R.id.search_holder), this.A01, new InterfaceC07650Zd() { // from class: X.36l
                @Override // X.InterfaceC07650Zd
                public boolean ANY(String str) {
                    return false;
                }

                {
                    InviteNonWhatsAppContactPickerActivity.this = this;
                }

                @Override // X.InterfaceC07650Zd
                public boolean ANX(String str) {
                    InviteNonWhatsAppContactPickerActivity.this.A09.A02(str);
                    return false;
                }
            });
            C3JD c3jd = new C3JD(this, new ArrayList(), this.A04, this.A07.A04(this), this.A0A);
            this.A08 = c3jd;
            ListView A1P = A1P();
            A1P.setAdapter((ListAdapter) c3jd);
            registerForContextMenu(A1P);
            A1P.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2pv
                {
                    InviteNonWhatsAppContactPickerActivity.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = InviteNonWhatsAppContactPickerActivity.this;
                    inviteNonWhatsAppContactPickerActivity.A09.A02.A0B(((InterfaceC54742jH) inviteNonWhatsAppContactPickerActivity.A08.A00.get(i)).A93());
                }
            });
            C37D c37d = (C37D) C002701i.A0J(this, new C28661Tc() { // from class: X.3JA
                {
                    InviteNonWhatsAppContactPickerActivity.this = this;
                }

                @Override // X.C28661Tc, X.C0CR
                public C0MU A6e(Class cls) {
                    if (cls.isAssignableFrom(C37D.class)) {
                        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = InviteNonWhatsAppContactPickerActivity.this;
                        return new C37D(inviteNonWhatsAppContactPickerActivity.A05, inviteNonWhatsAppContactPickerActivity.A0A, inviteNonWhatsAppContactPickerActivity.A06, inviteNonWhatsAppContactPickerActivity.A0B);
                    }
                    throw new IllegalArgumentException("Invalid viewModel");
                }
            }).A00(C37D.class);
            this.A09 = c37d;
            c37d.A04.A0B(0);
            c37d.A00.A0B(new ArrayList());
            this.A09.A02.A05(this, new InterfaceC05620Pl() { // from class: X.36J
                {
                    InviteNonWhatsAppContactPickerActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = InviteNonWhatsAppContactPickerActivity.this;
                    C06C c06c = (C06C) obj;
                    if (c06c != null) {
                        C0W5 c0w5 = inviteNonWhatsAppContactPickerActivity.A03;
                        StringBuilder A0P = C000200d.A0P("sms:");
                        A0P.append(C04630Le.A00(c06c));
                        Uri parse = Uri.parse(A0P.toString());
                        String string = inviteNonWhatsAppContactPickerActivity.getString(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/");
                        int intExtra = inviteNonWhatsAppContactPickerActivity.getIntent().getIntExtra("invite_source", 0);
                        c0w5.A00(inviteNonWhatsAppContactPickerActivity, parse, string, intExtra == 0 ? null : Integer.valueOf(intExtra));
                    }
                }
            });
            this.A09.A03.A05(this, new InterfaceC05620Pl() { // from class: X.36L
                {
                    InviteNonWhatsAppContactPickerActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = InviteNonWhatsAppContactPickerActivity.this;
                    List list = (List) obj;
                    inviteNonWhatsAppContactPickerActivity.A00.setVisible(!list.isEmpty());
                    C3JD c3jd2 = inviteNonWhatsAppContactPickerActivity.A08;
                    c3jd2.A00 = list;
                    c3jd2.A01 = list;
                    c3jd2.notifyDataSetChanged();
                }
            });
            this.A09.A04.A05(this, new InterfaceC05620Pl() { // from class: X.36M
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                }
            });
            this.A09.A01.A05(this, new InterfaceC05620Pl() { // from class: X.36N
                {
                    InviteNonWhatsAppContactPickerActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = InviteNonWhatsAppContactPickerActivity.this;
                    if (((Boolean) obj).booleanValue()) {
                        inviteNonWhatsAppContactPickerActivity.A02.A01();
                    } else {
                        inviteNonWhatsAppContactPickerActivity.A02.A04(true);
                    }
                }
            });
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, this.A02.A02.getString(R.string.search)).setIcon(R.drawable.ic_action_search);
        icon.setShowAsAction(10);
        icon.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: X.1L8
            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                C0WY c0wy = this;
                if (c0wy != null) {
                    ((InviteNonWhatsAppContactPickerActivity) c0wy).A09.A02(null);
                    return true;
                }
                return true;
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return true;
            }
        });
        this.A00 = icon;
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            this.A09.A01.A0B(Boolean.TRUE);
            return true;
        } else if (itemId == 16908332) {
            finish();
            return true;
        } else {
            return false;
        }
    }
}
