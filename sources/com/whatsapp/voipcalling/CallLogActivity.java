package com.whatsapp.voipcalling;

import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.C002301c;
import X.C002501g;
import X.C002701i;
import X.C003301p;
import X.C018708s;
import X.C019208x;
import X.C02160Ac;
import X.C02F;
import X.C03320Ff;
import X.C03360Fk;
import X.C06030Rg;
import X.C06C;
import X.C07950aM;
import X.C0AT;
import X.C0D3;
import X.C0DK;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0HY;
import X.C0L7;
import X.C0LF;
import X.C0U1;
import X.C0We;
import X.C10000f8;
import X.C2AR;
import X.C2IY;
import X.C2MS;
import X.C2QP;
import X.C40261rr;
import X.C41321tj;
import X.C52762bH;
import X.C74243cw;
import X.C84453tl;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import com.whatsapp.voipcalling.CallLogActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class CallLogActivity extends C2QP {
    public View A00;
    public ImageView A01;
    public ListView A02;
    public TextView A03;
    public C06030Rg A04;
    public C40261rr A05;
    public C03320Ff A06;
    public C0L7 A07;
    public AnonymousClass008 A08;
    public C018708s A09;
    public C0LF A0A;
    public C41321tj A0B;
    public AnonymousClass012 A0C;
    public C02F A0D;
    public C0HY A0E;
    public C0DK A0F;
    public C06C A0G;
    public AnonymousClass011 A0H;
    public C03360Fk A0I;
    public UserJid A0J;
    public C2AR A0K;
    public C52762bH A0L;
    public C2MS A0M;
    public InterfaceC002901k A0N;
    public C84453tl A0O;
    public C2IY A0P;
    public ArrayList A0Q;
    public final C0GA A0S = new C0GA() { // from class: X.3ti
        {
            CallLogActivity.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            CallLogActivity.this.A1P();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            CallLogActivity callLogActivity = CallLogActivity.this;
            if (callLogActivity.A0J.equals(abstractC005302j)) {
                callLogActivity.A1P();
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            CallLogActivity callLogActivity = CallLogActivity.this;
            if (callLogActivity.A0J.equals(userJid)) {
                callLogActivity.A1P();
            }
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            CallLogActivity callLogActivity = CallLogActivity.this;
            if (callLogActivity.A0J.equals(userJid)) {
                callLogActivity.A1P();
            }
        }
    };
    public final C0GC A0R = new C0GC() { // from class: X.3tj
        {
            CallLogActivity.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            CallLogActivity.this.A1P();
        }
    };
    public final C0GE A0T = new C0GE() { // from class: X.3tk
        {
            CallLogActivity.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            CallLogActivity.this.A1P();
        }
    };

    public final void A1P() {
        Log.i("calllog/update");
        C06C A02 = this.A0F.A02(this.A0J);
        this.A0G = A02;
        this.A07.A06(this.A01, A02);
        this.A04.A03(this.A0G, null);
        String str = this.A0G.A0L;
        if (str != null && !str.isEmpty()) {
            this.A03.setVisibility(0);
            this.A03.setText(this.A0G.A0L);
        } else {
            this.A03.setVisibility(8);
        }
        C84453tl c84453tl = this.A0O;
        if (c84453tl != null) {
            c84453tl.A05(true);
        }
        C84453tl c84453tl2 = new C84453tl(this, this);
        this.A0O = c84453tl2;
        this.A0N.ARy(c84453tl2, new Void[0]);
    }

    public final void A1Q(boolean z) {
        Jid A03 = this.A0G.A03(AbstractC005302j.class);
        if (A03 != null) {
            try {
                startActivityForResult(this.A0M.A01(this.A0G, (AbstractC005302j) A03, z), z ? 10 : 11);
                this.A0L.A02(z, 1);
                return;
            } catch (ActivityNotFoundException | SecurityException e) {
                Log.w("calllog/opt system contact list could not found", e);
                C002701i.A19(this, 2);
                return;
            }
        }
        throw null;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11 && i != 10) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            this.A0B.A06();
        }
        this.A0L.A00();
    }

    @Override // X.C2QP, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0L = new C52762bH(this.A0H, ((ActivityC02290Ap) this).A0B, ((ActivityC02290Ap) this).A0E, this.A0D);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            setTitle(R.string.call_details);
            setContentView(R.layout.contact_call_log_v2);
            UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
            if (nullable != null) {
                this.A0J = nullable;
                this.A02 = (ListView) findViewById(16908298);
                View inflate = getLayoutInflater().inflate(R.layout.contact_call_log_header_v2, (ViewGroup) this.A02, false);
                C0AT.A0V(inflate, 2);
                this.A02.addHeaderView(inflate, null, false);
                View findViewById = findViewById(R.id.header);
                this.A00 = findViewById;
                findViewById.setClickable(true);
                C06030Rg c06030Rg = new C06030Rg(this, (TextEmojiLabel) findViewById(R.id.conversation_contact_name), this.A09, this.A0K);
                this.A04 = c06030Rg;
                C003301p.A06(c06030Rg.A01);
                this.A03 = (TextView) findViewById(R.id.conversation_contact_status);
                findViewById(R.id.divider).setBackground(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.list_header_divider)));
                this.A02.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.3cv
                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }

                    {
                        CallLogActivity.this = this;
                    }

                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        int i4;
                        CallLogActivity callLogActivity = CallLogActivity.this;
                        View childAt = callLogActivity.A02.getChildAt(0);
                        if (childAt != null) {
                            if (callLogActivity.A02.getWidth() > callLogActivity.A02.getHeight()) {
                                if (callLogActivity.A02.getFirstVisiblePosition() == 0) {
                                    i4 = childAt.getTop();
                                } else {
                                    i4 = (-callLogActivity.A00.getHeight()) + 1;
                                }
                                View view = callLogActivity.A00;
                                view.offsetTopAndBottom(i4 - view.getTop());
                            } else if (callLogActivity.A00.getTop() == 0) {
                            } else {
                                View view2 = callLogActivity.A00;
                                view2.offsetTopAndBottom(-view2.getTop());
                            }
                        }
                    }
                });
                this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3cr
                    {
                        CallLogActivity.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        int i;
                        CallLogActivity callLogActivity = CallLogActivity.this;
                        View childAt = callLogActivity.A02.getChildAt(0);
                        if (childAt != null) {
                            if (callLogActivity.A02.getWidth() > callLogActivity.A02.getHeight()) {
                                if (callLogActivity.A02.getFirstVisiblePosition() == 0) {
                                    i = childAt.getTop();
                                } else {
                                    i = (-callLogActivity.A00.getHeight()) + 1;
                                }
                                View view = callLogActivity.A00;
                                view.offsetTopAndBottom(i - view.getTop());
                            } else if (callLogActivity.A00.getTop() == 0) {
                            } else {
                                View view2 = callLogActivity.A00;
                                view2.offsetTopAndBottom(-view2.getTop());
                            }
                        }
                    }
                });
                this.A01 = (ImageView) findViewById(R.id.photo_btn);
                StringBuilder sb = new StringBuilder();
                sb.append(getApplicationContext().getResources().getString(R.string.transition_photo));
                sb.append("-avatar");
                String obj = sb.toString();
                C0AT.A0e(this.A01, obj);
                this.A01.setOnClickListener(new C10000f8(this, this.A0J, obj));
                View findViewById2 = findViewById(R.id.call_btn);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 9));
                    View findViewById3 = findViewById(R.id.video_call_btn);
                    if (findViewById3 != null) {
                        findViewById3.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 10));
                        C74243cw c74243cw = new C74243cw(this);
                        this.A02.setAdapter((ListAdapter) c74243cw);
                        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("calls");
                        if (parcelableArrayListExtra != null) {
                            this.A0Q = new ArrayList();
                            Iterator it = parcelableArrayListExtra.iterator();
                            while (it.hasNext()) {
                                C07950aM c07950aM = (C07950aM) ((Parcelable) it.next());
                                C0D3 A04 = this.A0E.A04(new C07950aM(c07950aM.A01, c07950aM.A03, c07950aM.A02, c07950aM.A00));
                                if (A04 != null) {
                                    this.A0Q.add(A04);
                                }
                            }
                            c74243cw.A00 = this.A0Q;
                            c74243cw.notifyDataSetChanged();
                            ArrayList arrayList = this.A0Q;
                            if (!arrayList.isEmpty()) {
                                long A06 = this.A0C.A06(((C0D3) arrayList.get(0)).A08);
                                TextView textView = (TextView) findViewById(R.id.calls_title);
                                if (DateUtils.isToday(A06)) {
                                    C002301c c002301c = ((ActivityC02310Ar) this).A01;
                                    textView.setText(C002501g.A0G(c002301c.A0I(), c002301c.A05(270)));
                                } else if (DateUtils.isToday(86400000 + A06)) {
                                    textView.setText(C002501g.A08(((ActivityC02310Ar) this).A01));
                                } else {
                                    textView.setText(DateUtils.formatDateTime(this, A06, 16));
                                }
                            } else {
                                finish();
                            }
                        }
                        A1P();
                        this.A08.A01(this.A0S);
                        this.A06.A01(this.A0R);
                        this.A0I.A01(this.A0T);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            Log.i("calllog/dialog-add-contact");
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.add_contact_as_new_or_existing);
            c019208x.A06(R.string.new_contact, new DialogInterface.OnClickListener() { // from class: X.3bo
                {
                    CallLogActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    CallLogActivity callLogActivity = CallLogActivity.this;
                    C002701i.A18(callLogActivity, 1);
                    callLogActivity.A1Q(true);
                }
            });
            c019208x.A05(R.string.existing_contact, new DialogInterface.OnClickListener() { // from class: X.3bn
                {
                    CallLogActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    CallLogActivity callLogActivity = CallLogActivity.this;
                    C002701i.A18(callLogActivity, 1);
                    callLogActivity.A1Q(false);
                }
            });
            return c019208x.A00();
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            Log.w("calllog/add to contacts: activity not found, probably tablet");
            C019208x c019208x2 = new C019208x(this);
            c019208x2.A02(R.string.activity_not_found);
            c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3bm
                {
                    CallLogActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(CallLogActivity.this, 2);
                }
            });
            return c019208x2.A00();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_new_conversation, 0, R.string.menuitem_new).setIcon(R.drawable.ic_action_message).setAlphabeticShortcut('n').setShowAsAction(2);
        menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.clear_single_log).setIcon(R.drawable.ic_action_delete);
        C06C c06c = this.A0G;
        if (c06c != null && c06c.A08 == null) {
            menu.add(0, R.id.menuitem_add_to_contacts, 0, R.string.add_contact);
        }
        menu.add(0, R.id.menuitem_unblock_contact, 0, R.string.unblock);
        menu.add(0, R.id.menuitem_block_contact, 0, R.string.block);
        return true;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A08.A00(this.A0S);
        this.A06.A00(this.A0R);
        this.A0I.A00(this.A0T);
        C84453tl c84453tl = this.A0O;
        if (c84453tl != null) {
            c84453tl.A05(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0083, code lost:
        if (r0.A0B() == false) goto L34;
     */
    @Override // X.ActivityC02290Ap, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r9) {
        /*
            r8 = this;
            int r1 = r9.getItemId()
            r6 = 1
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 != r0) goto Le
            r8.finish()
            return r6
        Le:
            int r1 = r9.getItemId()
            r0 = 2131363519(0x7f0a06bf, float:1.834685E38)
            if (r1 != r0) goto L29
            java.lang.String r0 = "calllog/delete"
            com.whatsapp.util.Log.i(r0)
            java.util.ArrayList r1 = r8.A0Q
            if (r1 == 0) goto L28
            X.0HY r0 = r8.A0E
            r0.A0A(r1)
            r8.finish()
        L28:
            return r6
        L29:
            int r1 = r9.getItemId()
            r0 = 2131363555(0x7f0a06e3, float:1.8346922E38)
            if (r1 != r0) goto L46
            java.lang.String r0 = "calllog/new_conversation"
            com.whatsapp.util.Log.i(r0)
            X.08n r1 = r8.A00
            X.06C r0 = r8.A0G
            android.content.Intent r0 = com.whatsapp.Conversation.A00(r8, r0)
            r1.A07(r8, r0)
            r8.finish()
            return r6
        L46:
            int r1 = r9.getItemId()
            r0 = 2131363511(0x7f0a06b7, float:1.8346833E38)
            if (r1 != r0) goto L53
            X.C002701i.A19(r8, r6)
            return r6
        L53:
            int r1 = r9.getItemId()
            r0 = 2131363592(0x7f0a0708, float:1.8346997E38)
            if (r1 != r0) goto L64
            X.1rr r1 = r8.A05
            X.06C r0 = r8.A0G
            r1.A09(r8, r0, r6)
            return r6
        L64:
            int r1 = r9.getItemId()
            r0 = 2131363515(0x7f0a06bb, float:1.834684E38)
            r5 = 0
            if (r1 != r0) goto Lbb
            com.whatsapp.jid.UserJid r7 = r8.A0J
            X.01B r1 = r8.A0B
            X.03B r0 = X.C01C.A0k
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L85
            X.06C r0 = r8.A0G
            if (r0 == 0) goto L85
            boolean r0 = r0.A0B()
            r4 = 1
            if (r0 != 0) goto L86
        L85:
            r4 = 0
        L86:
            com.whatsapp.blocklist.BlockConfirmationDialogFragment r3 = new com.whatsapp.blocklist.BlockConfirmationDialogFragment
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r7.getRawString()
            java.lang.String r0 = "jid"
            r2.putString(r0, r1)
            java.lang.String r1 = "entryPoint"
            java.lang.String r0 = "call_log"
            r2.putString(r1, r0)
            java.lang.String r0 = "fromSpamPanel"
            r2.putBoolean(r0, r5)
            java.lang.String r0 = "showBlockReasons"
            r2.putBoolean(r0, r4)
            java.lang.String r0 = "showSuccessToast"
            r2.putBoolean(r0, r6)
            java.lang.String r0 = "showReportAndBlock"
            r2.putBoolean(r0, r5)
            r3.A0P(r2)
            r8.AUh(r3)
            return r6
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallLogActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean A0H = this.A05.A0H((UserJid) this.A0G.A03(UserJid.class));
        MenuItem findItem = menu.findItem(R.id.menuitem_unblock_contact);
        if (findItem != null) {
            findItem.setVisible(A0H);
        }
        MenuItem findItem2 = menu.findItem(R.id.menuitem_block_contact);
        if (findItem2 != null) {
            findItem2.setVisible(!A0H);
        }
        return true;
    }
}
