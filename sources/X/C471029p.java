package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.Jid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.29p */
/* loaded from: classes2.dex */
public class C471029p implements C0O8 {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public MenuItem A0B;
    public MenuItem A0C;
    public MenuItem A0D;
    public final C52922bZ A0E = new C52922bZ();
    public final /* synthetic */ ConversationsFragment A0F;

    public C471029p(ConversationsFragment conversationsFragment) {
        this.A0F = conversationsFragment;
    }

    @Override // X.C0O8
    public boolean AGv(C0U0 c0u0, MenuItem menuItem) {
        Object tag;
        int itemId = menuItem.getItemId();
        final ConversationsFragment conversationsFragment = this.A0F;
        conversationsFragment.A1I.A01 = conversationsFragment.A1r.size() == 1 ? 1 : 5;
        if (itemId == R.id.menuitem_conversations_archive) {
            ArrayList arrayList = new ArrayList(conversationsFragment.A1r);
            conversationsFragment.A1b.A0F();
            conversationsFragment.A1C(0);
            if (!arrayList.isEmpty()) {
                conversationsFragment.A1o.AS1(new RunnableEBaseShape1S0200000_I0_1(this, arrayList, 24));
            }
            return true;
        } else if (itemId == R.id.menuitem_conversations_unarchive) {
            ArrayList arrayList2 = new ArrayList(conversationsFragment.A1r);
            conversationsFragment.A1C(0);
            conversationsFragment.A06.post(new RunnableEBaseShape1S0200000_I0_1(this, arrayList2, 23));
            if (C23X.A0L(conversationsFragment.A0K, conversationsFragment.A0y)) {
                int size = arrayList2.size();
                conversationsFragment.A1E(conversationsFragment.A01().getQuantityString(R.plurals.conversations_unarchived_confirmation, size, Integer.valueOf(size)), conversationsFragment.A0F(R.string.undo), new ViewOnClickEBaseShape0S0200000_I0_0(this, arrayList2, 26));
            }
            return true;
        } else if (itemId == R.id.menuitem_conversations_delete) {
            conversationsFragment.A1m.A06(conversationsFragment.A0A()).A01.A03(new C0CG() { // from class: X.39i
                {
                    C471029p.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    final C471029p c471029p = C471029p.this;
                    ConversationsFragment conversationsFragment2 = c471029p.A0F;
                    AbstractC005302j A00 = ConversationsFragment.A00(conversationsFragment2);
                    conversationsFragment2.A1P = A00;
                    if (A00 != null) {
                        C470729k c470729k = conversationsFragment2.A0n;
                        c470729k.A0C.A07(new C52932ba(c470729k, ((C0BA) conversationsFragment2).A0H, A00), A00);
                        return;
                    }
                    final AbstractC02800Cx abstractC02800Cx = ((C0BA) conversationsFragment2).A0H;
                    if (abstractC02800Cx == null || conversationsFragment2.A1r.size() == 0) {
                        return;
                    }
                    C2II c2ii = new C2II() { // from class: X.39n
                        @Override // X.C2II
                        public void A6d() {
                            AbstractC02800Cx abstractC02800Cx2 = abstractC02800Cx;
                            ConversationsFragment conversationsFragment3 = c471029p.A0F;
                            conversationsFragment3.A1o.ARy(new C52942bb(abstractC02800Cx2, (DialogFragment) new ConversationsFragment.BulkDeleteConversationDialogFragment(), conversationsFragment3.A1E, (Set) conversationsFragment3.A1r, true), new Object[0]);
                        }

                        @Override // X.C2II
                        public void AEA(boolean z) {
                            AbstractC02800Cx abstractC02800Cx2 = abstractC02800Cx;
                            ConversationsFragment conversationsFragment3 = c471029p.A0F;
                            conversationsFragment3.A1o.ARy(new C52942bb(abstractC02800Cx2, new ConversationsFragment.BulkDeleteConversationDialogFragment(), conversationsFragment3.A1E, conversationsFragment3.A1r, z), new Object[0]);
                        }
                    };
                    C2MZ c2mz = conversationsFragment2.A1m;
                    C53692hM c53692hM = new C53692hM(c2mz.A02, conversationsFragment2.A1r, c2ii);
                    c2mz.A07.ARy(c53692hM, new Void[0]);
                    c2mz.A00.A02.postDelayed(new RunnableEBaseShape4S0200000_I0_4(c53692hM, c2ii, 40), 500L);
                }
            }, null);
            return true;
        } else if (itemId == R.id.menuitem_conversations_leave) {
            AbstractC005302j A00 = ConversationsFragment.A00(conversationsFragment);
            conversationsFragment.A1P = A00;
            if (A00 != null) {
                C470729k c470729k = conversationsFragment.A0n;
                c470729k.A0C.A07(new C52932ba(c470729k, ((C0BA) conversationsFragment).A0H, A00), A00);
            } else {
                AbstractC02800Cx abstractC02800Cx = ((C0BA) conversationsFragment).A0H;
                if (abstractC02800Cx != null) {
                    conversationsFragment.A1o.ARy(new C52942bb(abstractC02800Cx, (DialogFragment) new LeaveGroupsDialogFragment(), conversationsFragment.A1E, (Set) conversationsFragment.A1r, false), new Object[0]);
                    return true;
                }
            }
            return true;
        } else if (itemId == R.id.menuitem_conversations_mute) {
            AbstractC005302j A002 = ConversationsFragment.A00(conversationsFragment);
            conversationsFragment.A1P = A002;
            if (A002 != null) {
                MuteDialogFragment.A01(Collections.singleton(A002)).A14(conversationsFragment.A0C(), null);
                return true;
            }
            MuteDialogFragment.A01(conversationsFragment.A1r).A14(conversationsFragment.A0C(), null);
            return true;
        } else if (itemId == R.id.menuitem_conversations_unmute) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(conversationsFragment.A1r);
            conversationsFragment.A1C(1);
            conversationsFragment.A1o.AS1(new RunnableEBaseShape1S0200000_I0_1(this, linkedHashSet, 25));
            return true;
        } else if (itemId == R.id.menuitem_conversations_pin) {
            HashSet hashSet = new HashSet(conversationsFragment.A1r);
            Set A0F = conversationsFragment.A1b.A0F();
            hashSet.removeAll(A0F);
            int size2 = hashSet.size();
            if (((AbstractCollection) A0F).size() + size2 > 3) {
                conversationsFragment.A0I.A0E(conversationsFragment.A01().getQuantityString(R.plurals.cannot_pin, 3, 3), 0);
                return true;
            }
            conversationsFragment.A1C(1);
            conversationsFragment.A1o.AS1(new RunnableEBaseShape0S0201000_I0(this, size2, hashSet, 2));
            return true;
        } else if (itemId == R.id.menuitem_conversations_unpin) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(conversationsFragment.A1r);
            conversationsFragment.A1C(1);
            conversationsFragment.A1o.AS1(new RunnableEBaseShape1S0200000_I0_1(this, linkedHashSet2, 22));
            return true;
        } else if (itemId == R.id.menuitem_conversations_create_shortcuit) {
            AbstractC005302j A003 = ConversationsFragment.A00(conversationsFragment);
            conversationsFragment.A1P = A003;
            if (A003 != null) {
                conversationsFragment.A0O.A06(conversationsFragment.A0Z.A0A(A003));
            }
            conversationsFragment.A1C(2);
            return true;
        } else {
            if (itemId == R.id.menuitem_conversations_contact_info) {
                AbstractC005302j A004 = ConversationsFragment.A00(conversationsFragment);
                conversationsFragment.A1P = A004;
                if (A004 != null) {
                    C06C A0A = conversationsFragment.A0Z.A0A(A004);
                    conversationsFragment.A1C(2);
                    if (A0A.A08 != null) {
                        ContactInfoActivity.A03(A0A, conversationsFragment.A09(), null);
                        return true;
                    } else if (A0A.A0D()) {
                        ListChatInfo.A01(A0A, conversationsFragment.A0A(), null);
                        return true;
                    } else {
                        GroupChatInfo.A01(A0A, conversationsFragment.A09(), null);
                        return true;
                    }
                }
            } else if (itemId == R.id.menuitem_conversations_add_new_contact) {
                AbstractC005302j A005 = ConversationsFragment.A00(conversationsFragment);
                conversationsFragment.A1P = A005;
                if (A005 != null) {
                    final C06C A0A2 = conversationsFragment.A0Z.A0A(A005);
                    CreateOrAddToContactsDialog createOrAddToContactsDialog = new CreateOrAddToContactsDialog();
                    createOrAddToContactsDialog.A00 = new InterfaceC52962bf() { // from class: X.2be
                        @Override // X.InterfaceC52962bf
                        public void AGz() {
                            ConversationsFragment conversationsFragment2 = conversationsFragment;
                            C06C c06c = A0A2;
                            Jid A03 = c06c.A03(AbstractC005302j.class);
                            if (A03 != null) {
                                ConversationsFragment.A03(conversationsFragment2, c06c, (AbstractC005302j) A03, false);
                                return;
                            }
                            throw null;
                        }

                        @Override // X.InterfaceC52962bf
                        public void AJ8() {
                            ConversationsFragment conversationsFragment2 = conversationsFragment;
                            C06C c06c = A0A2;
                            Jid A03 = c06c.A03(AbstractC005302j.class);
                            if (A03 != null) {
                                ConversationsFragment.A03(conversationsFragment2, c06c, (AbstractC005302j) A03, true);
                                return;
                            }
                            throw null;
                        }
                    };
                    createOrAddToContactsDialog.A14(((C0BA) conversationsFragment).A0H, null);
                    return true;
                }
            } else if (itemId == R.id.menuitem_conversations_mark_read) {
                Iterator it = conversationsFragment.A1r.iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                    if (!C003101m.A0a(abstractC005302j)) {
                        C41221tZ c41221tZ = conversationsFragment.A0g;
                        conversationsFragment.A00();
                        c41221tZ.A03(abstractC005302j, true, true);
                        conversationsFragment.A1U.A04();
                    }
                }
                conversationsFragment.A1C(1);
                return true;
            } else if (itemId == R.id.menuitem_conversations_mark_unread) {
                Iterator it2 = conversationsFragment.A1r.iterator();
                while (it2.hasNext()) {
                    AbstractC005302j abstractC005302j2 = (AbstractC005302j) it2.next();
                    if (!C003101m.A0P(abstractC005302j2) && !C003101m.A0a(abstractC005302j2)) {
                        conversationsFragment.A0g.A01(abstractC005302j2, true);
                    }
                }
                conversationsFragment.A1C(1);
                return true;
            } else if (itemId == R.id.menuitem_conversations_select_all) {
                if (conversationsFragment != null) {
                    conversationsFragment.A1s.clear();
                    for (int i = 0; i < conversationsFragment.A06.getChildCount(); i++) {
                        View childAt = conversationsFragment.A06.getChildAt(i);
                        if (childAt != null && (tag = childAt.getTag()) != null && (tag instanceof ViewHolder)) {
                            ViewHolder viewHolder = (ViewHolder) tag;
                            AbstractC005302j AAj = viewHolder.A02.AAj();
                            if (!conversationsFragment.A1r.contains(AAj)) {
                                conversationsFragment.A1r.add(AAj);
                                viewHolder.A05.setBackgroundResource(R.color.home_row_selection);
                                viewHolder.A0R.A03(true, true);
                            }
                        }
                    }
                    Iterator it3 = conversationsFragment.A13().iterator();
                    while (it3.hasNext()) {
                        AbstractC005302j AAj2 = ((InterfaceC52462al) it3.next()).AAj();
                        if (!conversationsFragment.A1r.contains(AAj2) && !C003101m.A0a(AAj2)) {
                            conversationsFragment.A1r.add(AAj2);
                        }
                    }
                    if (conversationsFragment.A0C != null) {
                        conversationsFragment.A0C.A0B(String.format(conversationsFragment.A0z.A0I(), "%d", Integer.valueOf(conversationsFragment.A1r.size())));
                        conversationsFragment.A0C.A06();
                    }
                    if (!conversationsFragment.A1r.isEmpty()) {
                        AnonymousClass088.A1C(conversationsFragment.A0A(), conversationsFragment.A0t, conversationsFragment.A01().getQuantityString(R.plurals.n_items_selected, conversationsFragment.A1r.size(), Integer.valueOf(conversationsFragment.A1r.size())));
                    }
                    return true;
                }
                throw null;
            }
            return false;
        }
    }

    @Override // X.C0O8
    public boolean AJ5(C0U0 c0u0, Menu menu) {
        this.A06 = menu.add(0, R.id.menuitem_conversations_pin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_pin);
        this.A0A = menu.add(0, R.id.menuitem_conversations_unpin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unpin);
        this.A03 = menu.add(0, R.id.menuitem_conversations_delete, 0, (CharSequence) null).setIcon(R.drawable.ic_action_delete);
        this.A05 = menu.add(0, R.id.menuitem_conversations_mute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_mute);
        this.A09 = menu.add(0, R.id.menuitem_conversations_unmute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unmute);
        MenuItem add = menu.add(0, R.id.menuitem_conversations_archive, 0, (CharSequence) null);
        ConversationsFragment conversationsFragment = this.A0F;
        this.A02 = add.setIcon(C02180Ae.A0O(conversationsFragment.A00(), R.drawable.ic_action_archive, R.color.white));
        this.A08 = menu.add(0, R.id.menuitem_conversations_unarchive, 0, (CharSequence) null).setIcon(C02180Ae.A0O(conversationsFragment.A00(), R.drawable.ic_action_unarchive, R.color.white));
        this.A04 = menu.add(0, R.id.menuitem_conversations_leave, 0, (CharSequence) null);
        this.A01 = menu.add(0, R.id.menuitem_conversations_create_shortcuit, 0, R.string.add_shortcut);
        this.A0D = menu.add(0, R.id.menuitem_conversations_contact_info, 0, R.string.contact_info);
        this.A00 = menu.add(0, R.id.menuitem_conversations_add_new_contact, 0, R.string.add_contact);
        this.A07 = menu.add(0, R.id.menuitem_conversations_mark_read, 0, R.string.mark_read);
        this.A0B = menu.add(0, R.id.menuitem_conversations_mark_unread, 0, R.string.mark_unread);
        this.A0C = menu.add(0, R.id.menuitem_conversations_select_all, 0, R.string.select_all_conversations);
        this.A06.setShowAsAction(2);
        this.A0A.setShowAsAction(2);
        this.A02.setShowAsAction(2);
        this.A08.setShowAsAction(2);
        this.A03.setShowAsAction(2);
        this.A05.setShowAsAction(2);
        this.A09.setShowAsAction(2);
        this.A04.setShowAsAction(8);
        this.A01.setShowAsAction(8);
        this.A0D.setShowAsAction(8);
        this.A00.setShowAsAction(8);
        this.A07.setShowAsAction(8);
        this.A0B.setShowAsAction(8);
        this.A0C.setShowAsAction(8);
        C52922bZ c52922bZ = this.A0E;
        c52922bZ.A00(R.id.menuitem_conversations_leave);
        c52922bZ.A00(R.id.menuitem_conversations_create_shortcuit);
        c52922bZ.A00(R.id.menuitem_conversations_contact_info);
        c52922bZ.A00(R.id.menuitem_conversations_add_new_contact);
        c52922bZ.A00(R.id.menuitem_conversations_mark_read);
        c52922bZ.A00(R.id.menuitem_conversations_mark_unread);
        c52922bZ.A00(R.id.menuitem_conversations_select_all);
        return true;
    }

    @Override // X.C0O8
    public void AJK(C0U0 c0u0) {
        ConversationsFragment conversationsFragment = this.A0F;
        conversationsFragment.A1B(2);
        conversationsFragment.A0C = null;
        C2XW c2xw = conversationsFragment.A0j;
        if (c2xw != null) {
            c2xw.setEnableState(true);
        }
        C2XW c2xw2 = conversationsFragment.A0i;
        if (c2xw2 != null) {
            c2xw2.setEnableState(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x01af, code lost:
        if ((!(r12 instanceof com.whatsapp.conversationslist.ArchivedConversationsFragment)) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01bf, code lost:
        if ((!(r12 instanceof com.whatsapp.conversationslist.ArchivedConversationsFragment)) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x025f, code lost:
        if (r3.A0l() != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00f9 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // X.C0O8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ANE(X.C0U0 r21, android.view.Menu r22) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C471029p.ANE(X.0U0, android.view.Menu):boolean");
    }
}
