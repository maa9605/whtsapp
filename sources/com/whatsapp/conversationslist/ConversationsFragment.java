package com.whatsapp.conversationslist;

import X.AbstractC005302j;
import X.AbstractC09240cu;
import X.AbstractC09260cw;
import X.ActivityC02320As;
import X.ActivityC02330At;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass088;
import X.AnonymousClass092;
import X.C000200d;
import X.C000500h;
import X.C000700j;
import X.C001200o;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C003301p;
import X.C003701t;
import X.C00B;
import X.C00Y;
import X.C011505r;
import X.C018308n;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02180Ae;
import X.C02980Dr;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C03180Eq;
import X.C03300Fd;
import X.C03320Ff;
import X.C03340Fh;
import X.C03360Fk;
import X.C03740Gw;
import X.C03750Gx;
import X.C04300Jq;
import X.C04360Jw;
import X.C05160No;
import X.C05E;
import X.C05M;
import X.C05W;
import X.C05Y;
import X.C06040Rh;
import X.C06C;
import X.C06K;
import X.C06L;
import X.C06M;
import X.C07610Yz;
import X.C08190as;
import X.C09250cv;
import X.C09270cx;
import X.C0AT;
import X.C0AV;
import X.C0BA;
import X.C0C8;
import X.C0CA;
import X.C0CB;
import X.C0D5;
import X.C0DK;
import X.C0DU;
import X.C0DW;
import X.C0E7;
import X.C0EE;
import X.C0ES;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0GG;
import X.C0GK;
import X.C0GU;
import X.C0H4;
import X.C0H9;
import X.C0HA;
import X.C0HC;
import X.C0HS;
import X.C0IU;
import X.C0L5;
import X.C0L7;
import X.C0L8;
import X.C0LM;
import X.C0MJ;
import X.C0MK;
import X.C0U0;
import X.C0W5;
import X.C0We;
import X.C0Zn;
import X.C23X;
import X.C29a;
import X.C2A7;
import X.C2A8;
import X.C2AR;
import X.C2F9;
import X.C2MB;
import X.C2MD;
import X.C2MG;
import X.C2MN;
import X.C2MO;
import X.C2MS;
import X.C2MZ;
import X.C2XW;
import X.C40061rW;
import X.C40081rY;
import X.C40261rr;
import X.C40301ry;
import X.C41151tS;
import X.C41181tV;
import X.C41221tZ;
import X.C41321tj;
import X.C41521u3;
import X.C41541u6;
import X.C41711uO;
import X.C41951um;
import X.C41991uq;
import X.C43081wp;
import X.C44271yn;
import X.C462626b;
import X.C469829b;
import X.C469929c;
import X.C46W;
import X.C470129e;
import X.C470629j;
import X.C470729k;
import X.C471029p;
import X.C471129q;
import X.C471429u;
import X.C49752Mf;
import X.C50772Tc;
import X.C52572ax;
import X.C52612b1;
import X.C52682b9;
import X.C52732bE;
import X.C52752bG;
import X.C52762bH;
import X.C52782bL;
import X.C52802bN;
import X.C52812bO;
import X.C52842bR;
import X.C52852bS;
import X.C52862bT;
import X.C53632hG;
import X.ExecutorC004702d;
import X.InterfaceC002901k;
import X.InterfaceC04900Mj;
import X.InterfaceC52462al;
import X.InterfaceC52742bF;
import X.InterfaceC52832bQ;
import X.InterfaceC53622hF;
import X.ServiceConnectionC471229r;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.Html;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactPicker;
import com.whatsapp.Conversation;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.HomeActivity;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.group.NewGroup;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class ConversationsFragment extends Hilt_ConversationsFragment implements C29a, C0MJ, C0MK, InterfaceC04900Mj {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public ViewGroup A04;
    public ImageView A05;
    public ListView A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public C0U0 A0C;
    public C09250cv A0D;
    public C018308n A0E;
    public C06040Rh A0F;
    public C08190as A0G;
    public C08190as A0H;
    public C018508q A0I;
    public C02L A0J;
    public C01B A0K;
    public C0LM A0L;
    public C0W5 A0M;
    public C018608r A0N;
    public C0L8 A0O;
    public C469829b A0P;
    public GoogleBackupService A0Q;
    public C470129e A0R;
    public C06K A0S;
    public C06M A0T;
    public C06L A0U;
    public C40261rr A0V;
    public C03320Ff A0W;
    public C41541u6 A0X;
    public C0L7 A0Y;
    public C05W A0Z;
    public AnonymousClass008 A0a;
    public C018708s A0b;
    public C011505r A0c;
    public C0Zn A0d;
    public C0L5 A0e;
    public C41321tj A0f;
    public C41221tZ A0g;
    public C41151tS A0h;
    public C2XW A0i;
    public C2XW A0j;
    public C469929c A0k;
    public C471129q A0l;
    public C471429u A0m;
    public C470729k A0n;
    public C470629j A0o;
    public C52842bR A0p;
    public C52752bG A0q;
    public C52782bL A0r;
    public C0E7 A0s;
    public C02E A0t;
    public C462626b A0u;
    public AnonymousClass012 A0v;
    public C001200o A0w;
    public C02F A0x;
    public C000500h A0y;
    public C41181tV A10;
    public C05M A11;
    public C0DK A12;
    public C03340Fh A13;
    public C0CA A14;
    public C0GK A15;
    public C0D5 A16;
    public C0C8 A17;
    public C44271yn A18;
    public C0GU A19;
    public C0H4 A1A;
    public C03180Eq A1B;
    public C05E A1C;
    public C43081wp A1D;
    public C00B A1E;
    public C41711uO A1F;
    public C40081rY A1G;
    public C003701t A1H;
    public C03300Fd A1I;
    public C0HA A1J;
    public AnonymousClass011 A1K;
    public C0ES A1L;
    public C03360Fk A1M;
    public C00Y A1N;
    public AbstractC005302j A1O;
    public AbstractC005302j A1P;
    public C02980Dr A1Q;
    public C05Y A1R;
    public C0EE A1S;
    public C41521u3 A1T;
    public C40301ry A1U;
    public C0DU A1V;
    public C03740Gw A1W;
    public C0DW A1X;
    public C03750Gx A1Y;
    public C2MO A1Z;
    public C2F9 A1a;
    public C0CB A1b;
    public C2MD A1c;
    public C2MN A1d;
    public C49752Mf A1e;
    public C2AR A1f;
    public C2MG A1g;
    public C50772Tc A1h;
    public C41951um A1i;
    public C52762bH A1j;
    public C2MS A1k;
    public C0H9 A1l;
    public C2MZ A1m;
    public C2MB A1n;
    public InterfaceC002901k A1o;
    public C41991uq A1p;
    public ArrayList A1q;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1t = true;
    public final C471029p A23 = new C471029p(this);
    public LinkedHashSet A1r = new LinkedHashSet();
    public Set A1s = new HashSet();
    public final C52682b9 A22 = new C52682b9(Executors.newSingleThreadExecutor());
    public C002301c A0z;
    public final C0IU A25 = new C0IU(this.A0z);
    public final ServiceConnection A1x = new ServiceConnectionC471229r(this);
    public final C0GA A21 = new C0GA() { // from class: X.2bA
        {
            ConversationsFragment.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            ConversationsFragment.A02(ConversationsFragment.this);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            ConversationsFragment conversationsFragment = ConversationsFragment.this;
            ConversationsFragment.A04(conversationsFragment, abstractC005302j);
            conversationsFragment.A0q.A03 = true;
            if (conversationsFragment.A0l != null) {
                conversationsFragment.A18();
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            ConversationsFragment conversationsFragment = ConversationsFragment.this;
            ConversationsFragment.A04(conversationsFragment, userJid);
            conversationsFragment.A0q.A03 = true;
            if (conversationsFragment.A0l != null) {
                conversationsFragment.A18();
            }
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            ConversationsFragment.A04(ConversationsFragment.this, userJid);
        }
    };
    public final C0GC A1z = new C0GC() { // from class: X.2bB
        {
            ConversationsFragment.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            ConversationsFragment.A02(ConversationsFragment.this);
        }

        @Override // X.C0GC
        public void A01(AbstractC005302j abstractC005302j) {
            ConversationsFragment.A04(ConversationsFragment.this, abstractC005302j);
        }
    };
    public final C0GE A26 = new C0GE() { // from class: X.2bC
        {
            ConversationsFragment.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            ConversationsFragment.A02(ConversationsFragment.this);
        }
    };
    public final AbstractC09240cu A1y = new AbstractC09240cu() { // from class: X.2bD
        {
            ConversationsFragment.this = this;
        }

        @Override // X.AbstractC09240cu
        public void A01(UserJid userJid) {
            ConversationsFragment.A04(ConversationsFragment.this, userJid);
        }
    };
    public final C0GG A24 = new C52732bE(this);
    public final InterfaceC52742bF A20 = new InterfaceC52742bF() { // from class: X.39k
        {
            ConversationsFragment.this = this;
        }

        @Override // X.InterfaceC52742bF
        public final void AMj(List list, List list2, List list3) {
            ConversationsFragment conversationsFragment = ConversationsFragment.this;
            ActivityC02330At A09 = conversationsFragment.A09();
            if (A09 != null && !A09.isFinishing()) {
                boolean z = false;
                if (!C46W.A08(conversationsFragment.A0K, conversationsFragment.A1S) && !conversationsFragment.A0s.A05()) {
                    boolean A02 = C0E7.A02(conversationsFragment.A09());
                    int i = R.string.network_required;
                    if (A02) {
                        i = R.string.network_required_airplane_on;
                    }
                    conversationsFragment.A0I.A07(i, 0);
                    return;
                }
                ActivityC02330At A092 = conversationsFragment.A09();
                C01B c01b = conversationsFragment.A0K;
                C0EE c0ee = conversationsFragment.A1S;
                if (list.isEmpty() && list2.isEmpty() && list3.isEmpty()) {
                    z = true;
                }
                conversationsFragment.A0i(C20R.A00(A092, c01b, c0ee, z));
            }
        }
    };

    @Override // X.C0MJ
    public String A8Q() {
        return null;
    }

    @Override // X.C0MJ
    public Drawable A8R() {
        return null;
    }

    @Override // X.C0MJ
    public void AHf() {
    }

    @Override // X.C0MK
    public boolean AVJ() {
        return true;
    }

    public static AbstractC005302j A00(ConversationsFragment conversationsFragment) {
        if (conversationsFragment.A1r.size() == 1) {
            return (AbstractC005302j) conversationsFragment.A1r.iterator().next();
        }
        Log.i("conversations/getSoloSelectionJid/not a solo selection");
        return null;
    }

    public static void A01(View view) {
        AnonymousClass088.A1W(view, new C0AV(16, R.string.contacts_row_action_click), new C0AV(32, R.string.accessibility_contact_long_press));
    }

    public static void A02(ConversationsFragment conversationsFragment) {
        conversationsFragment.A14();
        conversationsFragment.A0q.A03 = true;
        if (conversationsFragment.A0l != null) {
            conversationsFragment.A18();
            conversationsFragment.A1o.AS1(new RunnableEBaseShape2S0100000_I0_2(conversationsFragment.A12, 27));
        }
    }

    public static void A03(ConversationsFragment conversationsFragment, C06C c06c, AbstractC005302j abstractC005302j, boolean z) {
        if (conversationsFragment != null) {
            try {
                Intent A01 = conversationsFragment.A1k.A01(c06c, abstractC005302j, z);
                conversationsFragment.A1C(2);
                conversationsFragment.A0O(A01, 10, null);
                conversationsFragment.A1j.A02(z, 7);
                return;
            } catch (ActivityNotFoundException unused) {
                conversationsFragment.A0I.A07(R.string.activity_not_found, 0);
                return;
            }
        }
        throw null;
    }

    public static void A04(ConversationsFragment conversationsFragment, AbstractC005302j abstractC005302j) {
        View A11;
        if (conversationsFragment.A0l == null || (A11 = conversationsFragment.A11(abstractC005302j)) == null) {
            return;
        }
        ViewHolder viewHolder = (ViewHolder) A11.getTag();
        conversationsFragment.A12.A02(abstractC005302j);
        viewHolder.A01.A03(viewHolder.A02, false);
    }

    @Override // X.C0BA
    public void A0f() {
        Log.i("conversationsFragment/onPause");
        super.A0U = true;
        C52752bG c52752bG = this.A0q;
        C52802bN c52802bN = c52752bG.A01;
        if (c52802bN != null) {
            c52802bN.A05(true);
        }
        c52752bG.A03 = false;
        ObjectAnimator objectAnimator = this.A0q.A00;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        this.A01 = 0L;
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (this.A0o.A01(i)) {
            return;
        }
        if (i != 12) {
            if (i == 150 && i2 == -1) {
                A0O(new Intent(A09(), ContactPicker.class), 12, null);
            }
        } else if (i2 != -1) {
        } else {
            AbstractC005302j A02 = AbstractC005302j.A02(intent.getStringExtra("contact"));
            if (A02 != null) {
                Intent A00 = Conversation.A00(A0a(), this.A0Z.A0A(A02));
                A00.putExtra("show_keyboard", true);
                A00.putExtra("start_t", SystemClock.uptimeMillis());
                C002701i.A1C(A00, "ConversationsFragment:onActivityResult:codeStartChat", this.A0v);
                this.A1Z.A00();
                this.A0h.A00(A02);
                A0i(A00);
                return;
            }
            throw null;
        }
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        ArrayList<String> stringArrayList;
        C0HC c0hc = new C0HC("conversations/create");
        super.A0U = true;
        A0J();
        if (this.A0r == null) {
            this.A0r = new C52782bL(A0a());
        }
        this.A1o.AS1(new RunnableEBaseShape2S0100000_I0_2(this.A0u, 10));
        if (this.A1X.A02()) {
            C05E c05e = this.A1C;
            c05e.A05();
            if (c05e.A01) {
                this.A1o.AS1(new RunnableEBaseShape2S0100000_I0_2(this.A1W, 26));
            }
        }
        this.A0a.A01(this.A21);
        this.A0W.A01(this.A1z);
        this.A13.A00(this.A24);
        this.A0T.A01(this.A1y);
        this.A1M.A01(this.A26);
        this.A1q = A12();
        A0x();
        ListView listView = ((ListFragment) this).A04;
        this.A06 = listView;
        listView.setDivider(this.A1u ? null : new C0We(this.A0z, C02160Ac.A03(A00(), R.drawable.conversations_list_divider)));
        this.A06.setFastScrollEnabled(false);
        this.A06.setScrollbarFadingEnabled(true);
        A16();
        this.A1a.A03(A0a());
        this.A06.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2bM
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            {
                ConversationsFragment.this = this;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i == 0) {
                    ConversationsFragment.this.A1a.A01();
                    return;
                }
                if (i == 1) {
                    ConversationsFragment.this.A1a.A02(2);
                }
                C09250cv c09250cv = ConversationsFragment.this.A0D;
                if (c09250cv != null) {
                    c09250cv.A02(3);
                }
            }
        });
        if (this.A0P.A07() && C40061rW.A0I(this.A0y)) {
            View inflate = A0A().getLayoutInflater().inflate(R.layout.conversations_google_drive_header, (ViewGroup) this.A06, false);
            this.A03 = inflate;
            this.A06.addHeaderView(inflate);
            this.A06.findViewById(R.id.google_drive_progress_view).setVisibility(8);
        }
        C471129q c471129q = new C471129q(this, this.A0Z, this.A0z, this.A1b);
        this.A0l = c471129q;
        this.A06.setAdapter((ListAdapter) c471129q);
        this.A0q.A03 = true;
        A18();
        this.A06.setOnCreateContextMenuListener(this);
        if (bundle != null) {
            this.A1P = AbstractC005302j.A02(bundle.getString("LongPressedRowJid"));
            if (this.A1t && (stringArrayList = bundle.getStringArrayList("SelectedRowJids")) != null) {
                LinkedHashSet linkedHashSet = this.A1r;
                linkedHashSet.clear();
                linkedHashSet.addAll(C003101m.A0F(AbstractC005302j.class, stringArrayList));
                if (!this.A1r.isEmpty()) {
                    A15();
                }
            }
        }
        c0hc.A01();
        this.A1o.AS1(new RunnableEBaseShape2S0100000_I0_2(this, 13));
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        AbstractC005302j abstractC005302j = this.A1P;
        if (abstractC005302j != null) {
            bundle.putString("LongPressedRowJid", abstractC005302j.getRawString());
        }
        bundle.putStringArrayList("SelectedRowJids", C003101m.A0E(this.A1r));
    }

    @Override // X.C0BA
    public void A0m(Menu menu, MenuInflater menuInflater) {
        if (this.A0K != null) {
            menu.add(1, R.id.menuitem_new_group, 0, R.string.menuitem_groupchat).setAlphabeticShortcut('g');
            menu.add(1, R.id.menuitem_new_broadcast, 0, R.string.menuitem_list).setAlphabeticShortcut('b');
            boolean A07 = C46W.A07(this.A0K);
            int i = R.string.menuitem_whatsapp_web;
            if (A07) {
                i = R.string.menuitem_linked_devices;
            }
            menu.add(1, R.id.menuitem_scan_qr, 0, i).setAlphabeticShortcut('q');
            menu.add(1, R.id.menuitem_starred, 0, R.string.menuitem_starred).setAlphabeticShortcut('s');
            if (this.A1X.A04()) {
                menu.add(1, R.id.menuitem_payments, 0, R.string.payments_activity_title);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public boolean A0n(MenuItem menuItem) {
        return this.A0o.A02(A09(), this, menuItem);
    }

    @Override // X.C0BA
    public boolean A0o(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_conversation) {
            ALg();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_new_broadcast) {
            this.A0p.A00(3);
            A0i(new Intent(A09(), ListMembersSelector.class));
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_new_group) {
            this.A0p.A00(2);
            NewGroup.A00(A0A(), 2, null);
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_scan_qr) {
            this.A1o.ARy(new C52852bS(this.A1p, this.A1F, this.A1N, this.A20), new Void[0]);
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_archived_chats) {
            A0i(new Intent(A09(), ArchivedConversationsActivity.class));
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_starred) {
            this.A0p.A00(6);
            A0i(new Intent(A09(), StarredMessagesActivity.class));
            return true;
        } else {
            return false;
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.conversations, viewGroup, false);
        ListView listView = (ListView) C0AT.A0D(inflate, 16908298);
        View inflate2 = A0A().getLayoutInflater().inflate(R.layout.conversations_tip_row, (ViewGroup) listView, false);
        listView.addFooterView(inflate2, null, false);
        this.A0B = (TextView) inflate2.findViewById(R.id.conversations_row_tip_tv);
        this.A1v = AnonymousClass088.A1y(this.A0t.A0H());
        if (!(this instanceof ArchivedConversationsFragment)) {
            C2XW c2xw = new C2XW(A09(), 1);
            this.A0i = c2xw;
            listView.addFooterView(c2xw, null, false);
            this.A0i.setVisibility(false);
        }
        View inflate3 = layoutInflater.inflate(R.layout.conversations_tip_row, (ViewGroup) listView, false);
        listView.addFooterView(inflate3, null, true);
        TextView textView = (TextView) inflate3.findViewById(R.id.conversations_row_tip_tv);
        this.A08 = textView;
        textView.setBackgroundResource(R.drawable.selector_orange_gradient);
        this.A08.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 34));
        AnonymousClass088.A1T(inflate3);
        HomeActivity.A03(inflate, this, A01().getDimensionPixelSize(R.dimen.conversations_row_height));
        this.A04 = (ViewGroup) inflate.findViewById(R.id.banner_holder);
        if (!(this instanceof ArchivedConversationsFragment)) {
            C08190as c08190as = new C08190as(A09());
            this.A0G = c08190as;
            listView.addHeaderView(c08190as, null, true);
        }
        if (this.A1H.A0C(462)) {
            listView.setClipToPadding(false);
            listView.setPadding(0, A01().getDimensionPixelSize(R.dimen.list_ui_refresh_conversation_top_padding), 0, 0);
        }
        return inflate;
    }

    @Override // X.C0BA
    public void A0q() {
        C471429u c471429u;
        Log.i("conversationsFragment/onDestroy");
        super.A0U = true;
        this.A0a.A00(this.A21);
        this.A0W.A00(this.A1z);
        this.A13.A01(this.A24);
        this.A0T.A00(this.A1y);
        this.A1M.A00(this.A26);
        C52752bG c52752bG = this.A0q;
        C52802bN c52802bN = c52752bG.A01;
        if (c52802bN != null) {
            c52802bN.A05(true);
        }
        c52752bG.A03 = false;
        this.A0d.A00();
        GoogleBackupService googleBackupService = this.A0Q;
        if (googleBackupService != null && (c471429u = this.A0m) != null) {
            googleBackupService.A08(c471429u);
        }
        this.A1w = false;
    }

    @Override // X.C0BA
    public void A0s() {
        View findViewById;
        Log.i("conversationsFragment/onResume");
        super.A0U = true;
        this.A1V.A00.clear();
        this.A1l.A01();
        if (this.A0P.A07() && (findViewById = this.A06.findViewById(R.id.google_drive_progress_view)) != null) {
            if (findViewById.getVisibility() == 8) {
                if (C40061rW.A0I(this.A0y)) {
                    findViewById.setVisibility(0);
                    Log.i("conversations/gdrive-header/gdrive-media-restore-pending/show-view");
                    A0A().bindService(new Intent(A09(), GoogleBackupService.class), this.A1x, 1);
                    View view = this.A03;
                    if (view != null) {
                        view.setVisibility(0);
                        this.A06.setHeaderDividersEnabled(true);
                        this.A05 = (ImageView) this.A06.findViewById(R.id.google_drive_image_view);
                        ProgressBar progressBar = (ProgressBar) this.A06.findViewById(R.id.google_drive_progress);
                        this.A07 = progressBar;
                        C02180Ae.A18(progressBar, C02160Ac.A00(A00(), R.color.media_message_progress_determinate));
                        TextView textView = (TextView) this.A06.findViewById(R.id.google_drive_backup_info_title);
                        this.A0A = textView;
                        C003301p.A06(textView);
                        this.A09 = (TextView) this.A06.findViewById(R.id.google_drive_backup_info_message);
                        this.A05.setImageResource(R.drawable.ic_in_progress);
                        ImageView imageView = this.A05;
                        C52812bO c52812bO = new C52812bO();
                        c52812bO.setDuration(2000L);
                        c52812bO.setRepeatCount(-1);
                        c52812bO.setInterpolator(new LinearInterpolator());
                        c52812bO.A00 = 0L;
                        c52812bO.A01 = true;
                        imageView.setAnimation(c52812bO);
                        this.A03.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 33));
                    } else {
                        throw null;
                    }
                }
            } else if (!C40061rW.A0I(this.A0y)) {
                Log.i("conversations/resume/gdrive-header/gdrive-media-restore-done/hide-view");
                this.A06.findViewById(R.id.google_drive_progress_view).setVisibility(8);
                A0A().unbindService(this.A1x);
            }
        }
        C41951um c41951um = this.A1i;
        if (c41951um.A01.A0E(C01C.A2T)) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary");
            C2A7 A02 = c41951um.A02();
            if (A02 == null) {
                Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/no metadata");
            } else {
                int i = A02.A00;
                if (C2A8.A01(i, c41951um.A04)) {
                    StringBuilder A0P = C000200d.A0P("UserNoticeManager/transitionUserNoticeStageIfNecessary/green alert disabled, notice: ");
                    A0P.append(i);
                    Log.i(A0P.toString());
                    c41951um.A07();
                } else {
                    c41951um.A0B(A02, c41951um.A07.A03(A02));
                }
            }
        }
        this.A1h.A00(A00(), false);
        A16();
        A18();
        if (this.A0C != null) {
            A17();
            this.A0C.A06();
        }
        if (this.A1w) {
            this.A1w = false;
            A0i(new Intent(A09(), GoogleDriveNewUserSetupActivity.class));
        }
    }

    @Override // com.whatsapp.conversationslist.Hilt_ConversationsFragment, X.C0BA
    public void A0u(Context context) {
        Log.i("conversations/attach");
        super.A0u(context);
        this.A1j = new C52762bH(this.A1K, this.A0K, this.A0t, this.A0x);
        C0U0 c0u0 = this.A0C;
        if (c0u0 != null) {
            c0u0.A06();
        }
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        Log.i("conversationsFragment/onCreate");
        C0Zn A04 = this.A0e.A04(A0a());
        this.A0d = A04;
        this.A0q = new C52752bG(this, this.A0I, this.A1o, this.A0Z, this.A0b, this.A0z, this.A0c, A04);
        Context A0a = A0a();
        AnonymousClass012 anonymousClass012 = this.A0v;
        C018508q c018508q = this.A0I;
        InterfaceC002901k interfaceC002901k = this.A1o;
        C41181tV c41181tV = this.A10;
        C01B c01b = this.A0K;
        C41541u6 c41541u6 = this.A0X;
        C05W c05w = this.A0Z;
        C41521u3 c41521u3 = this.A1T;
        C0ES c0es = this.A1L;
        C0CB c0cb = this.A1b;
        C00B c00b = this.A1E;
        C2MZ c2mz = this.A1m;
        C0C8 c0c8 = this.A17;
        C470729k c470729k = new C470729k(A0a, anonymousClass012, c018508q, interfaceC002901k, c41181tV, c41541u6, c05w, c41521u3, c0es, c0cb, c00b, c2mz, c0c8, new InterfaceC52832bQ() { // from class: X.2bP
            {
                ConversationsFragment.this = this;
            }

            @Override // X.InterfaceC52832bQ
            public final void A53(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
                ConversationsFragment.this.A1E(charSequence, charSequence2, onClickListener);
            }
        });
        this.A0n = c470729k;
        this.A0o = new C470629j(A0a, super.A0H, anonymousClass012, c018508q, interfaceC002901k, this.A11, this.A1g, c41181tV, c01b, this.A0N, c05w, this.A0z, c0es, this.A1f, this.A1j, c0cb, this.A0O, this.A1k, this.A0f, this.A1U, this.A0y, this.A0S, this.A0g, c2mz, c0c8, c470729k, 10);
        this.A0p = new C52842bR(this.A1K);
        this.A1u = this.A1H.A0C(462);
        super.A0v(bundle);
    }

    public final View A11(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            return null;
        }
        for (int i = 0; i < this.A06.getChildCount(); i++) {
            View childAt = this.A06.getChildAt(i);
            Object tag = childAt.getTag();
            if (tag instanceof ViewHolder) {
                InterfaceC52462al interfaceC52462al = ((ViewHolder) tag).A02;
                if ((interfaceC52462al instanceof C52572ax) && abstractC005302j.equals(((C52572ax) interfaceC52462al).A00)) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public ArrayList A12() {
        if (!(this instanceof ArchivedConversationsFragment)) {
            ArrayList A0A = this.A14.A0A(this.A1b);
            ArrayList arrayList = new ArrayList(A0A.size());
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                arrayList.add(new C52572ax((AbstractC005302j) it.next()));
            }
            return arrayList;
        }
        ArrayList A06 = ((ArchivedConversationsFragment) this).A03.A06();
        ArrayList arrayList2 = new ArrayList(A06.size());
        Iterator it2 = A06.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C52572ax((AbstractC005302j) it2.next()));
        }
        return arrayList2;
    }

    public final ArrayList A13() {
        ArrayList arrayList = this.A1q;
        if (arrayList == null) {
            return A12();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof C52862bT) && !(next instanceof C52612b1)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public void A14() {
        if (A0W()) {
            A16();
            A17();
            C0U0 c0u0 = this.A0C;
            if (c0u0 != null) {
                c0u0.A06();
            }
            C471129q c471129q = this.A0l;
            if (c471129q != null) {
                c471129q.notifyDataSetChanged();
            }
        }
    }

    public void A15() {
        C2XW c2xw = this.A0j;
        if (c2xw != null) {
            c2xw.setEnableState(false);
        }
        C2XW c2xw2 = this.A0i;
        if (c2xw2 != null) {
            c2xw2.setEnableState(false);
        }
        ActivityC02320As activityC02320As = (ActivityC02320As) A09();
        if (activityC02320As != null) {
            this.A0C = activityC02320As.A0e(this.A23);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00a1, code lost:
        if (r1.A0l() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01a1, code lost:
        if (r1.A0l() != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A16() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ConversationsFragment.A16():void");
    }

    public final void A17() {
        Set set;
        ArrayList arrayList = this.A1q;
        if (arrayList != null && !arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = this.A1r;
            if ((linkedHashSet == null || linkedHashSet.isEmpty()) && ((set = this.A1s) == null || set.isEmpty())) {
                return;
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            Iterator it = this.A1q.iterator();
            while (it.hasNext()) {
                AbstractC005302j AAj = ((InterfaceC52462al) it.next()).AAj();
                if (AAj != null) {
                    if (this.A1r.contains(AAj)) {
                        linkedHashSet2.add(AAj);
                    }
                    if (this.A1s.contains(AAj)) {
                        hashSet.add(AAj);
                    }
                }
            }
            this.A1r = linkedHashSet2;
            this.A1s = hashSet;
        }
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [X.2bN, X.0HS] */
    public final void A18() {
        C471129q c471129q = this.A0l;
        if (c471129q.getCount() == 0) {
            if (c471129q != null) {
                C000700j.A07(c471129q.getCount() == 0);
                if (C23X.A0L(this.A0K, this.A0y)) {
                    this.A0B.setVisibility(8);
                }
                View view = super.A0A;
                if (view != null) {
                    ViewGroup viewGroup = (ViewGroup) C0AT.A0D(view, R.id.conversations_empty_no_contacts);
                    ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.conversations_empty_permission_denied);
                    ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.conversations_empty_nux);
                    View findViewById = view.findViewById(R.id.search_no_matches);
                    this.A04.setVisibility(8);
                    C471129q c471129q2 = this.A0l;
                    if (c471129q2 != null && c471129q2.A00.A01()) {
                        findViewById.setVisibility(0);
                        this.A06.setEmptyView(findViewById);
                        viewGroup.setVisibility(8);
                        viewGroup2.setVisibility(8);
                        viewGroup3.setVisibility(8);
                        return;
                    }
                    findViewById.setVisibility(8);
                    if (this.A0Z.A03() > 0) {
                        viewGroup.setVisibility(8);
                        viewGroup2.setVisibility(8);
                        viewGroup3.setVisibility(8);
                        this.A06.setEmptyView(viewGroup3);
                        if (this.A14.A02() != 0) {
                            return;
                        }
                        if (viewGroup3.getChildCount() == 0) {
                            A0A().getLayoutInflater().inflate(R.layout.empty_nux, viewGroup3, true);
                        }
                        viewGroup3.setVisibility(0);
                        A1A();
                        C52752bG c52752bG = this.A0q;
                        if (c52752bG.A03) {
                            if (c52752bG.A02 == null) {
                                c52752bG.A04 = (c52752bG.A0A.A01().getConfiguration().screenLayout & 15) == 1;
                                View A05 = c52752bG.A0A.A05();
                                View findViewById2 = A05.findViewById(R.id.conversations_empty_nux);
                                C002301c c002301c = c52752bG.A0B;
                                if (c002301c.A0N()) {
                                    findViewById2.findViewById(R.id.instruction_arrow).setRotationY(180.0f);
                                }
                                if (Build.VERSION.SDK_INT >= 17) {
                                    View findViewById3 = findViewById2.findViewById(R.id.linear_layout);
                                    if (c002301c.A0M()) {
                                        C0AT.A0W(findViewById3, 1);
                                    } else {
                                        C0AT.A0W(findViewById3, 0);
                                    }
                                }
                                c52752bG.A02 = new ViewOnClickCListenerShape3S0200000_I0(A05, c52752bG, 12);
                            }
                            C52802bN c52802bN = c52752bG.A01;
                            if (c52802bN != null) {
                                c52802bN.A05(true);
                            }
                            c52752bG.A03 = false;
                            ExecutorC004702d executorC004702d = c52752bG.A0C;
                            synchronized (executorC004702d) {
                                executorC004702d.A03.clear();
                            }
                            ?? r0 = new C0HS(c52752bG, c52752bG.A06, c52752bG.A08) { // from class: X.2bN
                                public final C05W A00;
                                public final C011505r A01;
                                public final WeakReference A02;

                                {
                                    this.A02 = new WeakReference(c52752bG);
                                    this.A00 = r3;
                                    this.A01 = r4;
                                }

                                @Override // X.C0HS
                                public Object A07(Object[] objArr) {
                                    if (A04()) {
                                        return null;
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    AnonymousClass060 anonymousClass060 = this.A00.A05;
                                    ContentResolver A07 = anonymousClass060.A03.A07();
                                    int i = 0;
                                    if (A07 == null) {
                                        Log.w("contact-mgr-db/wadbhelper/get-contact-nux-suggest-list cr=null");
                                    } else {
                                        try {
                                            Cursor query = A07.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"raw_contact_id"}, null, null, "times_contacted DESC LIMIT 100");
                                            if (query != null) {
                                                HashSet hashSet = new HashSet();
                                                while (query.moveToNext()) {
                                                    Long valueOf = Long.valueOf(query.getLong(0));
                                                    if (hashSet.add(valueOf)) {
                                                        arrayList.add(valueOf);
                                                    }
                                                }
                                                query.close();
                                            }
                                        } catch (Exception e) {
                                            Log.e("contact-mgr-db/unable to query the phone book for frequent contacts sorted by TIMES_CONTACTED", e);
                                        }
                                    }
                                    if (A04()) {
                                        return null;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    anonymousClass060.A0V(arrayList2, 1, false, false);
                                    if (A04()) {
                                        return null;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    int length = C52752bG.A0D.length;
                                    if (arrayList.isEmpty()) {
                                        Iterator it = arrayList2.iterator();
                                        while (it.hasNext()) {
                                            C06C c06c = (C06C) it.next();
                                            if (i >= length) {
                                                break;
                                            } else if (this.A01.A08(c06c)) {
                                                arrayList3.add(c06c);
                                                i++;
                                            }
                                        }
                                    } else {
                                        C05I c05i = new C05I();
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            C06C c06c2 = (C06C) it2.next();
                                            C04460Kg c04460Kg = c06c2.A08;
                                            c05i.A09(c04460Kg == null ? 0L : c04460Kg.A00, c06c2);
                                        }
                                        HashSet hashSet2 = new HashSet();
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            Number number = (Number) it3.next();
                                            if (i >= length) {
                                                break;
                                            }
                                            C06C c06c3 = (C06C) c05i.A04(number.longValue(), null);
                                            if (c06c3 != null && this.A01.A08(c06c3)) {
                                                arrayList3.add(c06c3);
                                                hashSet2.add(c06c3);
                                                i++;
                                            }
                                        }
                                        Iterator it4 = arrayList2.iterator();
                                        while (it4.hasNext()) {
                                            C06C c06c4 = (C06C) it4.next();
                                            if (i >= length) {
                                                break;
                                            } else if (this.A01.A08(c06c4) && hashSet2.add(c06c4)) {
                                                arrayList3.add(c06c4);
                                                i++;
                                            }
                                        }
                                    }
                                    if (arrayList3.size() < 3) {
                                        arrayList3.clear();
                                    }
                                    return new C0FK(arrayList3, Integer.valueOf(arrayList2.size()));
                                }

                                @Override // X.C0HS
                                public void A09(Object obj) {
                                    String quantityString;
                                    C0FK c0fk = (C0FK) obj;
                                    C52752bG c52752bG2 = (C52752bG) this.A02.get();
                                    if (c52752bG2 != null) {
                                        c52752bG2.A01 = null;
                                        ConversationsFragment conversationsFragment = c52752bG2.A0A;
                                        View view2 = ((C0BA) conversationsFragment).A0A;
                                        ActivityC02330At A09 = conversationsFragment.A09();
                                        if (view2 != null && A09 != null && !A09.isFinishing() && c0fk != null) {
                                            View findViewById4 = view2.findViewById(R.id.conversations_empty_nux);
                                            Object obj2 = c0fk.A00;
                                            AbstractList arrayList = obj2 == null ? new ArrayList() : (AbstractList) obj2;
                                            Object obj3 = c0fk.A01;
                                            int intValue = obj3 == null ? 0 : ((Number) obj3).intValue();
                                            int size = arrayList.size();
                                            int[] iArr = C52752bG.A0D;
                                            int length = iArr.length;
                                            C000700j.A07(size <= length);
                                            if (Build.VERSION.SDK_INT <= 16) {
                                                Collections.reverse(arrayList);
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            for (int i = 0; i < size; i++) {
                                                C06C c06c = (C06C) arrayList.get(i);
                                                ImageView imageView = (ImageView) findViewById4.findViewById(iArr[i]);
                                                c52752bG2.A09.A02(c06c, imageView);
                                                imageView.setVisibility(0);
                                                imageView.setOnClickListener(c52752bG2.A02);
                                                String A04 = c52752bG2.A07.A04(c06c);
                                                arrayList2.add(A04);
                                                imageView.setContentDescription(A04);
                                            }
                                            for (int i2 = size; i2 < length; i2++) {
                                                findViewById4.findViewById(iArr[i2]).setVisibility(8);
                                            }
                                            if (!c52752bG2.A04) {
                                                int min = intValue - Math.min(size, 3);
                                                if (min > 0) {
                                                    if (size == 0) {
                                                        quantityString = A09.getResources().getQuantityString(R.plurals.nux_abbreviated_prompt, min, Integer.valueOf(min));
                                                    } else if (size != 1) {
                                                        Resources resources = A09.getResources();
                                                        if (size != 2) {
                                                            quantityString = resources.getQuantityString(R.plurals.nux_three_more_contact_prompt, min, arrayList2.get(0), arrayList2.get(1), arrayList2.get(2), Integer.valueOf(min));
                                                        } else {
                                                            quantityString = resources.getQuantityString(R.plurals.nux_two_more_contact_prompt, min, arrayList2.get(0), arrayList2.get(1), Integer.valueOf(min));
                                                        }
                                                    } else {
                                                        quantityString = A09.getResources().getQuantityString(R.plurals.nux_one_more_contact_prompt, min, arrayList2.get(0), Integer.valueOf(min));
                                                    }
                                                } else if (size == 0) {
                                                    quantityString = A09.getResources().getQuantityString(R.plurals.nux_abbreviated_prompt, min, Integer.valueOf(min));
                                                } else if (size == 1) {
                                                    quantityString = A09.getString(R.string.nux_one_contact_prompt, arrayList2.get(0));
                                                } else if (size != 2) {
                                                    quantityString = A09.getString(R.string.nux_three_contact_prompt, arrayList2.get(0), arrayList2.get(1), arrayList2.get(2));
                                                } else {
                                                    quantityString = A09.getString(R.string.nux_two_contact_prompt, arrayList2.get(0), arrayList2.get(1));
                                                }
                                            } else {
                                                quantityString = A09.getResources().getQuantityString(R.plurals.nux_abbreviated_prompt, intValue, Integer.valueOf(intValue));
                                            }
                                            TextView textView = (TextView) findViewById4.findViewById(R.id.prompt_text);
                                            textView.setText(Html.fromHtml(quantityString));
                                            textView.setVisibility(0);
                                            C003301p.A06((TextView) findViewById4.findViewById(R.id.instruction_text));
                                            return;
                                        }
                                        Log.w("conversations/updateNuxView: NUX view cannot be updated");
                                    }
                                }
                            };
                            c52752bG.A01 = r0;
                            r0.A02.executeOnExecutor(executorC004702d, new Object[0]);
                            c52752bG.A03 = false;
                        }
                        C52752bG c52752bG2 = this.A0q;
                        ObjectAnimator objectAnimator = c52752bG2.A00;
                        if (objectAnimator == null) {
                            View findViewById4 = c52752bG2.A0A.A05().findViewById(R.id.conversations_empty_nux).findViewById(R.id.instruction_arrow);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById4, "translationX", TypedValue.applyDimension(1, -8.0f, findViewById4.getResources().getDisplayMetrics()));
                            c52752bG2.A00 = ofFloat;
                            ofFloat.setDuration(1100L);
                            c52752bG2.A00.setRepeatCount(-1);
                            c52752bG2.A00.setRepeatMode(2);
                            c52752bG2.A00.setInterpolator(new AccelerateDecelerateInterpolator());
                            c52752bG2.A00.start();
                            return;
                        } else if (objectAnimator.isRunning()) {
                            return;
                        } else {
                            c52752bG2.A00.start();
                            return;
                        }
                    } else if (this.A0x.A03()) {
                        if (viewGroup.getChildCount() == 0) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A0a());
                            viewGroup.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 35));
                        }
                        viewGroup.setVisibility(0);
                        A1A();
                        viewGroup2.setVisibility(8);
                        viewGroup3.setVisibility(8);
                        this.A06.setEmptyView(viewGroup);
                        return;
                    } else {
                        if (viewGroup2.getChildCount() == 0) {
                            A0A().getLayoutInflater().inflate(R.layout.empty_contacts_permissions_needed, viewGroup2, true);
                            viewGroup2.findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 10));
                        }
                        viewGroup2.setVisibility(0);
                        viewGroup.setVisibility(8);
                        viewGroup3.setVisibility(8);
                        this.A06.setEmptyView(viewGroup2);
                        return;
                    }
                }
                return;
            }
            throw null;
        }
        ViewGroup viewGroup4 = this.A04;
        if (viewGroup4 == null) {
            return;
        }
        viewGroup4.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
        if (r4.A1v != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A19() {
        /*
            r4 = this;
            android.widget.TextView r3 = r4.A0B
            X.00h r0 = r4.A0y
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "delete_chat_count"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            r0 = 3
            if (r1 >= r0) goto L15
            boolean r1 = r4.A1v
            r0 = 0
            if (r1 == 0) goto L17
        L15:
            r0 = 8
        L17:
            r3.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ConversationsFragment.A19():void");
    }

    public final void A1A() {
        if (this.A0H == null) {
            C08190as c08190as = new C08190as(A09());
            this.A0H = c08190as;
            this.A04.addView(c08190as);
        }
        if (!this.A0H.A0A()) {
            this.A04.setVisibility(8);
            return;
        }
        this.A0H.A03();
        this.A04.setVisibility(0);
    }

    public final void A1B(int i) {
        Object tag;
        if (this.A1r.isEmpty()) {
            return;
        }
        if (i > 2 || i < 0) {
            Log.w("conversations/undefined animation behaviour. defaulting to IMMEDIATELY_ANIMATE");
            i = 2;
        }
        this.A1s.clear();
        for (int i2 = 0; i2 < this.A06.getChildCount(); i2++) {
            View childAt = this.A06.getChildAt(i2);
            if (childAt != null && (tag = childAt.getTag()) != null && (tag instanceof ViewHolder)) {
                ViewHolder viewHolder = (ViewHolder) tag;
                if (this.A1r.contains(viewHolder.A02.AAj())) {
                    if (i == 0) {
                        View view = viewHolder.A05;
                        view.setBackgroundResource(0);
                        C02180Ae.A11(view);
                        viewHolder.A0R.A03(false, false);
                    } else if (i == 1) {
                        this.A1s.add(viewHolder.A02.AAj());
                    } else if (i == 2) {
                        View view2 = viewHolder.A05;
                        view2.setBackgroundResource(0);
                        C02180Ae.A11(view2);
                        viewHolder.A0R.A03(false, true);
                    }
                }
            }
        }
        this.A1r.clear();
    }

    public final void A1C(int i) {
        A1B(i);
        C0U0 c0u0 = this.A0C;
        if (c0u0 != null) {
            c0u0.A05();
        }
        if (i == 1) {
            A14();
        }
        C2XW c2xw = this.A0j;
        if (c2xw != null) {
            c2xw.setEnableState(true);
        }
        C2XW c2xw2 = this.A0i;
        if (c2xw2 != null) {
            c2xw2.setEnableState(true);
        }
    }

    public final void A1D(AbstractC005302j abstractC005302j, View view, SelectionCheckView selectionCheckView) {
        if (this.A1t) {
            if (this.A1r.contains(abstractC005302j)) {
                this.A1r.remove(abstractC005302j);
                if (this.A1r.isEmpty() && this.A0C != null) {
                    A1C(2);
                }
                view.setBackgroundResource(0);
                view.postDelayed(new RunnableEBaseShape2S0100000_I0_2(view, 14), 1L);
                selectionCheckView.A03(false, true);
                AnonymousClass088.A1C(A09(), this.A0t, A0F(R.string.accessibility_announcement_chat_deselected));
                A01(view);
            } else {
                this.A1r.add(abstractC005302j);
                if (this.A0C == null && (A09() instanceof ActivityC02320As)) {
                    A15();
                }
                view.setBackgroundResource(R.color.home_row_selection);
                selectionCheckView.A03(true, true);
                AnonymousClass088.A1W(view, new C0AV(32, R.string.accessibility_action_long_click_selected_chat_to_deselect));
            }
            C0U0 c0u0 = this.A0C;
            if (c0u0 != null) {
                c0u0.A06();
            }
            if (this.A1r.isEmpty()) {
                return;
            }
            AnonymousClass088.A1C(A09(), this.A0t, this.A0z.A0A(R.plurals.n_items_selected, this.A1r.size(), Integer.valueOf(this.A1r.size())));
        }
    }

    public void A1E(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        if (!(this instanceof ArchivedConversationsFragment)) {
            final ActivityC02330At A09 = A09();
            if (A09 == null) {
                return;
            }
            C09250cv A00 = C09250cv.A00(A09.findViewById(R.id.pager_holder), charSequence, 0);
            A00.A06(charSequence2, onClickListener);
            A00.A05(C02160Ac.A00(A09, R.color.bulkArchiveSnackbarButton));
            C09270cx c09270cx = new C09270cx() { // from class: X.2bV
                {
                    ConversationsFragment.this = this;
                }

                @Override // X.AbstractC09280cy
                public void A00(Object obj, int i) {
                    A09.findViewById(R.id.fab).animate().translationY(0.0f).setDuration(200L).start();
                    ConversationsFragment.this.A0D = null;
                }
            };
            List list = ((AbstractC09260cw) A00).A01;
            if (list == null) {
                list = new ArrayList();
                ((AbstractC09260cw) A00).A01 = list;
            }
            list.add(c09270cx);
            this.A0D = A00;
            A00.A05.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2bW
                {
                    ConversationsFragment.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ConversationsFragment conversationsFragment = ConversationsFragment.this;
                    C09250cv c09250cv = conversationsFragment.A0D;
                    if (c09250cv != null) {
                        c09250cv.A05.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        conversationsFragment.A0A().findViewById(R.id.fab).animate().translationY(-conversationsFragment.A0D.A05.getHeight()).setDuration(250L).setInterpolator(new C015207d()).start();
                    }
                }
            });
            this.A0D.A04();
            return;
        }
        ActivityC02330At A0A = A0A();
        View findViewById = A0A.findViewById(R.id.container);
        if (findViewById != null) {
            C09250cv A002 = C09250cv.A00(findViewById, charSequence, 0);
            A002.A06(charSequence2, onClickListener);
            A002.A05(C02160Ac.A00(A0A, R.color.bulkArchiveSnackbarButton));
            this.A0D = A002;
            A002.A04();
        }
    }

    public final boolean A1F() {
        boolean z = SystemClock.elapsedRealtime() - this.A01 < 1000;
        this.A01 = SystemClock.elapsedRealtime();
        return z;
    }

    @Override // X.C0MK
    public void A5V(C07610Yz c07610Yz) {
        if (TextUtils.isEmpty(this.A0l.A00.A01)) {
            if (this.A02 == 0) {
                this.A02 = SystemClock.uptimeMillis();
            }
        } else if (TextUtils.isEmpty(c07610Yz.A01)) {
            this.A02 = 0L;
        }
        this.A0l.A00 = c07610Yz.clone();
        this.A0l.A02.filter(c07610Yz.A01);
    }

    @Override // X.C29a
    public void A6A() {
        this.A1O = null;
    }

    @Override // X.InterfaceC04900Mj
    public void A7E() {
        this.A1t = false;
    }

    @Override // X.InterfaceC04900Mj
    public void A7Z() {
        this.A1t = true;
    }

    @Override // X.C29a
    public AbstractC005302j AAU() {
        return this.A1O;
    }

    @Override // X.C0MJ
    public String AB1() {
        return A0F(R.string.menuitem_new);
    }

    @Override // X.C0MJ
    public Drawable AB2() {
        return C02160Ac.A03(A00(), R.drawable.ic_action_compose);
    }

    @Override // X.C29a
    public List ACQ() {
        return this.A0l.A01;
    }

    @Override // X.C29a
    public Set AD1() {
        return this.A1r;
    }

    @Override // X.C29a
    public void AIW(AbstractC005302j abstractC005302j, ViewHolder viewHolder) {
        if (this.A0C != null) {
            A1D(abstractC005302j, viewHolder.A05, viewHolder.A0R);
            return;
        }
        C000200d.A0v("conversations/click/jid ", abstractC005302j);
        if (viewHolder.A07.getVisibility() == 0 || A1F()) {
            return;
        }
        Intent A01 = Conversation.A01(A00(), abstractC005302j);
        Conversation.A0M(A01, this.A0l.A00);
        C002701i.A1C(A01, "ConversationsFragment:onClickConversation", this.A0v);
        this.A1Z.A00();
        this.A0h.A00(abstractC005302j);
        A0i(A01);
    }

    @Override // X.C29a
    public void AIX(AbstractC005302j abstractC005302j, View view, SelectionCheckView selectionCheckView) {
        if (this.A0C != null) {
            A1D(abstractC005302j, view, selectionCheckView);
        } else if (A1F()) {
        } else {
            View findViewById = view.findViewById(R.id.contact_photo);
            QuickContactActivity.A00(A09(), findViewById, abstractC005302j, C0AT.A0G(findViewById));
        }
    }

    @Override // X.C29a
    public void AIY(AnonymousClass092 anonymousClass092, ViewHolder viewHolder) {
        if (A1F()) {
            return;
        }
        Intent A04 = Conversation.A04(A00(), ((C52612b1) viewHolder.A02).A00, this.A0l.A00.A01);
        Conversation.A0M(A04, this.A0l.A00);
        View currentFocus = A09().getCurrentFocus();
        if (currentFocus != null) {
            this.A1n.A01(currentFocus);
        }
        C002701i.A1C(A04, "ConversationsFragment:onClickMessage", this.A0v);
        this.A1Z.A00();
        A0i(A04);
    }

    @Override // X.C29a
    public void AIZ(C05160No c05160No) {
        C0ES c0es = this.A1L;
        if (c0es.A0C.A05()) {
            AnonymousClass092 A03 = c0es.A0S.A03(c05160No);
            if (A03 instanceof C04300Jq) {
                Set set = c0es.A0l;
                if (!set.contains(c05160No) && ((C04300Jq) A03).A00 == 3) {
                    set.add(c05160No);
                    c0es.A0L.A0Q(c0es.A0g.A04(c05160No, c0es.A0D.A05(), 2, A03.A0G(), ((C04360Jw) A03).A01));
                    C06C A0A = c0es.A08.A0A(c05160No);
                    C011505r c011505r = c0es.A0A;
                    File A032 = c011505r.A03(A0A);
                    c0es.A0i.AS1(new RunnableEBaseShape0S0500000_I0(c011505r.A04(A0A), c0es, c05160No, A032, A03, 1));
                    return;
                }
                return;
            }
            return;
        }
        boolean A02 = C0E7.A02(A09());
        int i = R.string.network_required;
        if (A02) {
            i = R.string.network_required_airplane_on;
        }
        this.A0I.A07(i, 0);
    }

    @Override // X.C29a
    public void ALf(AbstractC005302j abstractC005302j, View view, SelectionCheckView selectionCheckView) {
        if (this.A1t) {
            A1D(abstractC005302j, view, selectionCheckView);
            return;
        }
        ActivityC02330At A09 = A09();
        if (A09 == null) {
            return;
        }
        this.A1I.A01 = 4;
        A09.openContextMenu(view);
    }

    @Override // X.C0MJ
    public void ALg() {
        if (this.A0x.A03()) {
            A0O(new Intent(A09(), ContactPicker.class), 12, null);
        } else {
            RequestPermissionActivity.A0F(this, R.string.permission_contacts_access_request, R.string.permission_contacts_needed);
        }
    }

    @Override // X.C29a
    public boolean ARL(Jid jid) {
        return this.A1s.remove(jid);
    }

    @Override // X.C0MK
    public void ASF(C06C c06c) {
        if (!(this instanceof ArchivedConversationsFragment)) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) c06c.A03(AbstractC005302j.class);
            this.A1O = abstractC005302j;
            if (abstractC005302j != null) {
                int i = 0;
                while (true) {
                    C471129q c471129q = this.A0l;
                    if (i >= c471129q.getCount()) {
                        i = 0;
                        break;
                    } else if (abstractC005302j.equals(((InterfaceC52462al) c471129q.A06.A1q.get(i)).AAj())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (this.A06.getFirstVisiblePosition() >= i || this.A06.getLastVisiblePosition() <= i) {
                    this.A06.setTranscriptMode(0);
                    this.A06.setSelectionFromTop(i, this.A06.getHeight() / 3);
                }
            }
        }
    }

    @Override // X.C0MK
    public void ATp(boolean z) {
        if (z) {
            this.A1o.AS5(new RunnableEBaseShape2S0100000_I0_2(this, 19));
        }
    }

    @Override // X.C0MK
    public void ATq(boolean z) {
        C09250cv c09250cv;
        if (z || (c09250cv = this.A0D) == null) {
            return;
        }
        c09250cv.A02(3);
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.A0U = true;
        C0U0 c0u0 = this.A0C;
        if (c0u0 != null) {
            c0u0.A06();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x004c, code lost:
        if (r1.A0l() != false) goto L26;
     */
    @Override // X.C0BA, android.view.View.OnCreateContextMenuListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreateContextMenu(android.view.ContextMenu r6, android.view.View r7, android.view.ContextMenu.ContextMenuInfo r8) {
        /*
            r5 = this;
            X.0At r0 = r5.A0A()
            r0.onCreateContextMenu(r6, r7, r8)
            android.widget.AdapterView$AdapterContextMenuInfo r8 = (android.widget.AdapterView.AdapterContextMenuInfo) r8
            android.view.View r0 = r8.targetView
            java.lang.Object r0 = r0.getTag()
            com.whatsapp.conversationslist.ViewHolder r0 = (com.whatsapp.conversationslist.ViewHolder) r0
            if (r0 != 0) goto L19
            java.lang.String r0 = "conversations/context/null"
            com.whatsapp.util.Log.i(r0)
            return
        L19:
            X.2al r1 = r0.A02
            boolean r0 = r1 instanceof X.C52572ax
            if (r0 != 0) goto L20
            return
        L20:
            X.2ax r1 = (X.C52572ax) r1
            X.02j r4 = r1.A00
            if (r4 == 0) goto L56
            r5.A1P = r4
            X.29j r3 = r5.A0o
            if (r4 == 0) goto L54
            boolean r0 = r5 instanceof com.whatsapp.conversationslist.ArchivedConversationsFragment
            if (r0 != 0) goto L52
            r2 = 1
        L31:
            r1 = r5
            boolean r0 = r5 instanceof com.whatsapp.conversationslist.ArchivedConversationsFragment
            if (r0 != 0) goto L3b
            r0 = 1
        L37:
            r3.A00(r6, r4, r2, r0)
            return
        L3b:
            com.whatsapp.conversationslist.ArchivedConversationsFragment r1 = (com.whatsapp.conversationslist.ArchivedConversationsFragment) r1
            X.01B r0 = r1.A02
            X.00h r1 = r1.A0y
            boolean r0 = X.C23X.A0L(r0, r1)
            if (r0 == 0) goto L4e
            boolean r1 = r1.A0l()
            r0 = 1
            if (r1 == 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            r0 = r0 ^ 1
            goto L37
        L52:
            r2 = 0
            goto L31
        L54:
            r0 = 0
            throw r0
        L56:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ConversationsFragment.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    /* loaded from: classes2.dex */
    public class BulkDeleteConversationDialogFragment extends Hilt_ConversationsFragment_BulkDeleteConversationDialogFragment {
        public C018608r A00;
        public C05W A01;
        public C000500h A02;
        public C002301c A03;
        public C03340Fh A04;
        public C2MZ A05;
        public InterfaceC002901k A06;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x A03;
            final List A0F = C003101m.A0F(AbstractC005302j.class, A02().getStringArrayList("selection_jids"));
            int i = ((C0BA) this).A06.getInt("unsent_count", 0);
            int size = ((AbstractCollection) A0F).size();
            InterfaceC53622hF interfaceC53622hF = new InterfaceC53622hF() { // from class: X.39o
                {
                    ConversationsFragment.BulkDeleteConversationDialogFragment.this = this;
                }

                @Override // X.InterfaceC53622hF
                public void AMJ() {
                    ConversationsFragment.BulkDeleteConversationDialogFragment.this.A16(false, false);
                }

                @Override // X.InterfaceC53622hF
                public void AN6(boolean z) {
                    Log.i("conversations/bulk-delete");
                    ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment = ConversationsFragment.BulkDeleteConversationDialogFragment.this;
                    bulkDeleteConversationDialogFragment.A16(false, false);
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC005302j abstractC005302j : A0F) {
                        arrayList.add(bulkDeleteConversationDialogFragment.A01.A0A(abstractC005302j));
                    }
                    ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) bulkDeleteConversationDialogFragment.A09();
                    if (activityC02290Ap != null) {
                        C23X.A0I(activityC02290Ap, arrayList, z, bulkDeleteConversationDialogFragment.A06, bulkDeleteConversationDialogFragment.A00, bulkDeleteConversationDialogFragment.A02, bulkDeleteConversationDialogFragment.A04);
                        return;
                    }
                    throw null;
                }
            };
            boolean z = ((C0BA) this).A06.getBoolean("chatContainsStarredMessages", false);
            String A0A = this.A03.A0A(R.plurals.bulk_delete_conversations, size, Integer.valueOf(size));
            if (z) {
                StringBuilder A0V = C000200d.A0V(A0A, "\n");
                if (i <= 0) {
                    A0V.append(A0F(R.string.starred_messages_in_selection));
                    A0A = A0V.toString();
                } else {
                    A0V.append(A0F(R.string.unsent_and_starred_messages_in_selection));
                    A0A = A0V.toString();
                }
            } else if (i > 0) {
                StringBuilder A0V2 = C000200d.A0V(A0A, "\n");
                A0V2.append(A01().getQuantityString(R.plurals.unsent_messages_in_selection, i, Integer.valueOf(i)));
                A0A = A0V2.toString();
            }
            C2MZ c2mz = this.A05;
            ActivityC02330At A0A2 = A0A();
            if (c2mz.A08()) {
                A03 = c2mz.A04(A0A2, new C53632hG(interfaceC53622hF), size, 0, 2, false);
            } else {
                A03 = c2mz.A03(A0A2, interfaceC53622hF, A0A, true, R.string.delete, size);
            }
            return A03.A00();
        }
    }

    /* loaded from: classes2.dex */
    public class DeleteBroadcastListDialogFragment extends Hilt_ConversationsFragment_DeleteBroadcastListDialogFragment {
        public C018608r A00;
        public C05W A01;
        public C018708s A02;
        public C000500h A03;
        public C03340Fh A04;
        public C2MZ A05;
        public InterfaceC002901k A06;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            String A0G;
            String string = A02().getString("jid");
            AbstractC005302j A02 = AbstractC005302j.A02(string);
            StringBuilder sb = new StringBuilder("Invalid rawJid=");
            sb.append(string);
            C000700j.A04(A02, sb.toString());
            final C06C A0A = this.A01.A0A(A02);
            InterfaceC53622hF interfaceC53622hF = new InterfaceC53622hF() { // from class: X.39p
                {
                    ConversationsFragment.DeleteBroadcastListDialogFragment.this = this;
                }

                @Override // X.InterfaceC53622hF
                public void AMJ() {
                    ConversationsFragment.DeleteBroadcastListDialogFragment.this.A16(false, false);
                }

                @Override // X.InterfaceC53622hF
                public void AN6(boolean z) {
                    Log.i("conversations/delete-list");
                    ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = ConversationsFragment.DeleteBroadcastListDialogFragment.this;
                    deleteBroadcastListDialogFragment.A16(false, false);
                    C06C c06c = A0A;
                    C23X.A0I((ActivityC02290Ap) deleteBroadcastListDialogFragment.A09(), Collections.singletonList(c06c), z, deleteBroadcastListDialogFragment.A06, deleteBroadcastListDialogFragment.A00, deleteBroadcastListDialogFragment.A03, deleteBroadcastListDialogFragment.A04);
                }
            };
            if (((C0BA) this).A06.getBoolean("chatContainsStarredMessages", false)) {
                if (TextUtils.isEmpty(A0A.A0F)) {
                    A0G = A0F(R.string.delete_list_unnamed_starred_dialog_title);
                } else {
                    A0G = A0G(R.string.delete_list_starred_dialog_title, this.A02.A08(A0A, false));
                }
            } else if (TextUtils.isEmpty(A0A.A0F)) {
                A0G = A0F(R.string.delete_list_unnamed_dialog_title);
            } else {
                A0G = A0G(R.string.delete_list_dialog_title, this.A02.A08(A0A, false));
            }
            return this.A05.A02(A0A(), interfaceC53622hF, 1, A0G).A00();
        }
    }

    /* loaded from: classes2.dex */
    public class DeleteContactDialogFragment extends Hilt_ConversationsFragment_DeleteContactDialogFragment {
        public C018608r A00;
        public C05W A01;
        public C018708s A02;
        public C000500h A03;
        public C002301c A04;
        public C03340Fh A05;
        public C2MZ A06;
        public InterfaceC002901k A07;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            String A0A;
            String string = A02().getString("jid");
            C05W c05w = this.A01;
            AbstractC005302j A02 = AbstractC005302j.A02(string);
            StringBuilder sb = new StringBuilder("Invalid rawJid=");
            sb.append(string);
            C000700j.A04(A02, sb.toString());
            final C06C A0A2 = c05w.A0A(A02);
            int i = ((C0BA) this).A06.getInt("unsent_count");
            InterfaceC53622hF interfaceC53622hF = new InterfaceC53622hF() { // from class: X.39q
                {
                    ConversationsFragment.DeleteContactDialogFragment.this = this;
                }

                @Override // X.InterfaceC53622hF
                public void AMJ() {
                    ConversationsFragment.DeleteContactDialogFragment.this.A16(false, false);
                }

                @Override // X.InterfaceC53622hF
                public void AN6(boolean z) {
                    Log.i("conversations/delete-contact");
                    ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment = ConversationsFragment.DeleteContactDialogFragment.this;
                    deleteContactDialogFragment.A16(false, false);
                    C06C c06c = A0A2;
                    C23X.A0I((ActivityC02290Ap) deleteContactDialogFragment.A09(), Collections.singletonList(c06c), z, deleteContactDialogFragment.A07, deleteContactDialogFragment.A00, deleteContactDialogFragment.A03, deleteContactDialogFragment.A05);
                }
            };
            if (((C0BA) this).A06.getBoolean("chatContainsStarredMessages", false)) {
                int i2 = R.string.delete_contact_with_unsent_and_starred_dialog_title;
                if (i == 0) {
                    i2 = R.string.delete_contact_with_starred_dialog_title;
                }
                A0A = A0G(i2, this.A02.A08(A0A2, false));
            } else if (i == 0) {
                A0A = A0G(R.string.delete_contact_dialog_title, this.A02.A08(A0A2, false));
            } else {
                A0A = this.A04.A0A(R.plurals.delete_contact_with_unsent_dialog_title, i, this.A02.A08(A0A2, false), Integer.valueOf(i));
            }
            return this.A06.A02(A0A(), interfaceC53622hF, 0, A0A).A00();
        }
    }

    /* loaded from: classes2.dex */
    public class DeleteGroupDialogFragment extends Hilt_ConversationsFragment_DeleteGroupDialogFragment {
        public C018608r A00;
        public C05W A01;
        public C018708s A02;
        public C000500h A03;
        public C03340Fh A04;
        public C03180Eq A05;
        public C2MZ A06;
        public InterfaceC002901k A07;

        /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
        @Override // androidx.fragment.app.DialogFragment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.app.Dialog A0z(android.os.Bundle r8) {
            /*
                r7 = this;
                android.os.Bundle r1 = r7.A02()
                java.lang.String r0 = "jid"
                java.lang.String r3 = r1.getString(r0)
                X.02j r2 = X.AbstractC005302j.A02(r3)
                java.lang.String r1 = "Invalid rawJid="
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                X.C000700j.A04(r2, r0)
                X.05W r0 = r7.A01
                X.06C r6 = r0.A0A(r2)
                java.lang.String r0 = r6.A0F
                r4 = 2
                if (r0 != 0) goto L81
                X.0Eq r0 = r7.A05
                X.092 r2 = r0.A03(r2)
                boolean r0 = r2 instanceof X.C04300Jq
                if (r0 == 0) goto L81
                r0 = r2
                X.0Jq r0 = (X.C04300Jq) r0
                int r1 = r0.A00
                if (r1 == r4) goto L3e
                r0 = 3
                if (r1 != r0) goto L81
            L3e:
                java.lang.String r5 = r2.A0G()
            L42:
                r2 = 0
                if (r5 != 0) goto L4b
                X.08s r0 = r7.A02
                java.lang.String r5 = r0.A08(r6, r2)
            L4b:
                X.39r r3 = new X.39r
                r3.<init>()
                android.os.Bundle r1 = r7.A06
                java.lang.String r0 = "chatContainsStarredMessages"
                boolean r1 = r1.getBoolean(r0, r2)
                r0 = 1
                if (r1 == 0) goto L75
                r1 = 2131887069(0x7f1203dd, float:1.9408735E38)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r5
                java.lang.String r2 = r7.A0G(r1, r0)
            L66:
                X.2MZ r1 = r7.A06
                X.0At r0 = r7.A0A()
                X.08x r0 = r1.A02(r0, r3, r4, r2)
                X.08z r0 = r0.A00()
                return r0
            L75:
                r1 = 2131887068(0x7f1203dc, float:1.9408733E38)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r5
                java.lang.String r2 = r7.A0G(r1, r0)
                goto L66
            L81:
                r5 = 0
                goto L42
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ConversationsFragment.DeleteGroupDialogFragment.A0z(android.os.Bundle):android.app.Dialog");
        }
    }
}
