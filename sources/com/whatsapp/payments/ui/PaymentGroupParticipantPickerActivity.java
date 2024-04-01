package com.whatsapp.payments.ui;

import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.C003101m;
import X.C018708s;
import X.C02L;
import X.C05W;
import X.C06570Tx;
import X.C06C;
import X.C07630Zb;
import X.C0C8;
import X.C0DV;
import X.C0DW;
import X.C0GA;
import X.C0GZ;
import X.C0HS;
import X.C0L5;
import X.C0U1;
import X.C0Zn;
import X.C2AR;
import X.C40261rr;
import X.C49T;
import X.C49U;
import X.C4E7;
import X.C4E8;
import X.C4K8;
import X.C78373jo;
import X.InterfaceC002901k;
import X.InterfaceC07650Zd;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class PaymentGroupParticipantPickerActivity extends C4K8 {
    public ListView A00;
    public C02L A01;
    public C07630Zb A02;
    public C40261rr A03;
    public C05W A04;
    public AnonymousClass008 A05;
    public C018708s A06;
    public C0Zn A07;
    public C0L5 A08;
    public C0C8 A09;
    public GroupJid A0A;
    public C0GZ A0B;
    public C0DW A0C;
    public C0DV A0D;
    public C4E7 A0E;
    public C49U A0F;
    public C4E8 A0G;
    public C78373jo A0H;
    public C2AR A0I;
    public InterfaceC002901k A0J;
    public ArrayList A0K;
    public final ArrayList A0M = new ArrayList();
    public final C0GA A0L = new C0GA() { // from class: X.4E5
        {
            PaymentGroupParticipantPickerActivity.this = this;
        }

        @Override // X.C0GA
        public void A05(Collection collection) {
            PaymentGroupParticipantPickerActivity.this.A0F.notifyDataSetChanged();
        }
    };

    public void A1P(View view) {
        C06C c06c = ((C49T) view.getTag()).A04;
        if (c06c != null) {
            UserJid userJid = (UserJid) c06c.A03(UserJid.class);
            if (!this.A03.A0H(userJid) && this.A0C.A06(userJid)) {
                if (userJid != null) {
                    Intent intent = getIntent();
                    intent.putExtra("extra_jid", this.A0A.getRawString());
                    intent.putExtra("extra_receiver_jid", C003101m.A07(userJid));
                    setResult(-1, intent);
                    finish();
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A02.A05()) {
            this.A02.A04(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        C06C c06c = (C06C) this.A00.getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (c06c != null && menuItem.getItemId() == 0) {
            C40261rr c40261rr = this.A03;
            Jid A03 = c06c.A03(UserJid.class);
            if (A03 != null) {
                c40261rr.A07(this, null, (UserJid) A03);
                return true;
            }
            throw null;
        }
        return super.onContextItemSelected(menuItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0HS, X.4E8] */
    @Override // X.C4K8, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onCreate(bundle);
        this.A0H = (C78373jo) new C06570Tx(this).A00(C78373jo.class);
        this.A07 = this.A08.A04(this);
        setContentView(R.layout.payment_group_participant_picker);
        this.A0A = GroupJid.getNullable(getIntent().getStringExtra("extra_jid"));
        this.A0F = new C49U(this, this, this.A0M);
        ListView listView = (ListView) findViewById(R.id.group_participant_picker_list);
        this.A00 = listView;
        listView.setAdapter((ListAdapter) this.A0F);
        this.A00.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.3Qb
            {
                PaymentGroupParticipantPickerActivity.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                PaymentGroupParticipantPickerActivity.this.A1P(view);
            }
        });
        registerForContextMenu(this.A00);
        this.A05.A01(this.A0L);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        this.A02 = new C07630Zb(this, ((ActivityC02310Ar) this).A01, findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.4E6
            @Override // X.InterfaceC07650Zd
            public boolean ANY(String str) {
                return false;
            }

            {
                PaymentGroupParticipantPickerActivity.this = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.0HS, X.4E7] */
            @Override // X.InterfaceC07650Zd
            public boolean ANX(String str) {
                PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = PaymentGroupParticipantPickerActivity.this;
                ArrayList A03 = C09940f2.A03(str, ((ActivityC02310Ar) paymentGroupParticipantPickerActivity).A01);
                paymentGroupParticipantPickerActivity.A0K = A03;
                if (A03.isEmpty()) {
                    paymentGroupParticipantPickerActivity.A0K = null;
                }
                C4E7 c4e7 = paymentGroupParticipantPickerActivity.A0E;
                if (c4e7 != null) {
                    c4e7.A05(true);
                    paymentGroupParticipantPickerActivity.A0E = null;
                }
                ?? r3 = new C0HS(paymentGroupParticipantPickerActivity.A0K) { // from class: X.4E7
                    public final ArrayList A00;

                    {
                        this.A00 = r3 != null ? new ArrayList(r3) : null;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = this.A00;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity2 = PaymentGroupParticipantPickerActivity.this;
                            Iterator it = paymentGroupParticipantPickerActivity2.A0M.iterator();
                            while (it.hasNext()) {
                                C06C c06c = (C06C) it.next();
                                Jid A032 = c06c.A03(UserJid.class);
                                if (paymentGroupParticipantPickerActivity2.A06.A0G(c06c, arrayList2, true) && !hashSet.contains(A032)) {
                                    arrayList.add(c06c);
                                    hashSet.add(A032);
                                }
                                if (A04()) {
                                    break;
                                }
                            }
                            return arrayList;
                        }
                        arrayList.addAll(PaymentGroupParticipantPickerActivity.this.A0M);
                        return arrayList;
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity2 = PaymentGroupParticipantPickerActivity.this;
                        paymentGroupParticipantPickerActivity2.A0E = null;
                        C49U c49u = paymentGroupParticipantPickerActivity2.A0F;
                        c49u.A00 = (List) obj;
                        c49u.notifyDataSetChanged();
                    }
                };
                paymentGroupParticipantPickerActivity.A0E = r3;
                paymentGroupParticipantPickerActivity.A0J.ARy(r3, new Void[0]);
                return false;
            }
        });
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.payments_pick_group_participant_activity_title);
            A0c.A0L(true);
        }
        C4E7 c4e7 = this.A0E;
        if (c4e7 != null) {
            c4e7.A05(true);
            this.A0E = null;
        }
        ?? r2 = new C0HS() { // from class: X.4E8
            {
                PaymentGroupParticipantPickerActivity.this = this;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = PaymentGroupParticipantPickerActivity.this;
                Iterator it = paymentGroupParticipantPickerActivity.A09.A01(paymentGroupParticipantPickerActivity.A0A).A05().iterator();
                while (true) {
                    C04250Jl c04250Jl = (C04250Jl) it;
                    if (c04250Jl.hasNext()) {
                        C06C A0A = paymentGroupParticipantPickerActivity.A04.A0A(((C0D7) c04250Jl.next()).A03);
                        ArrayList arrayList = paymentGroupParticipantPickerActivity.A0M;
                        if (!arrayList.contains(A0A) && !paymentGroupParticipantPickerActivity.A01.A0A(A0A.A02())) {
                            arrayList.add(A0A);
                        }
                    } else {
                        Collections.sort(paymentGroupParticipantPickerActivity.A0M, new C61772wh(paymentGroupParticipantPickerActivity.A01, paymentGroupParticipantPickerActivity.A06));
                        return null;
                    }
                }
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = PaymentGroupParticipantPickerActivity.this;
                paymentGroupParticipantPickerActivity.ARS();
                C49U c49u = paymentGroupParticipantPickerActivity.A0F;
                ArrayList arrayList = paymentGroupParticipantPickerActivity.A0M;
                c49u.A00 = arrayList;
                c49u.notifyDataSetChanged();
                C0U1 A0c2 = paymentGroupParticipantPickerActivity.A0c();
                if (A0c2 != null) {
                    A0c2.A0G(((ActivityC02310Ar) paymentGroupParticipantPickerActivity).A01.A0A(R.plurals.n_contacts, arrayList.size(), Integer.valueOf(arrayList.size())));
                }
            }
        };
        this.A0G = r2;
        this.A0J.ARy(r2, new Void[0]);
        A12(R.string.register_wait_message);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C06C c06c = (C06C) ((AdapterView) view).getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        if (c06c == null || !this.A03.A0H((UserJid) c06c.A03(UserJid.class))) {
            return;
        }
        contextMenu.add(0, 0, 0, getString(R.string.block_list_menu_unblock, this.A06.A08(c06c, false)));
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, getString(R.string.search)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A07.A00();
        this.A05.A00(this.A0L);
        C4E7 c4e7 = this.A0E;
        if (c4e7 != null) {
            c4e7.A05(true);
            this.A0E = null;
        }
        C4E8 c4e8 = this.A0G;
        if (c4e8 != null) {
            c4e8.A05(true);
            this.A0G = null;
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        this.A02.A01();
        return false;
    }
}
