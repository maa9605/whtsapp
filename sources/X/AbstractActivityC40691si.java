package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.Me;
import com.whatsapp.WaImageButton;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.components.FloatingActionButton;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.conversation.EditBroadcastRecipientsSelector;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import com.whatsapp.group.EditGroupAdminsSelector;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.group.NewGroup;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import com.whatsapp.voipcalling.JoinableEducationDialogFragment;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1si */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC40691si extends AbstractActivityC40701sj {
    public int A00;
    public int A01;
    public AnimatorSet A02;
    public ValueAnimator A03;
    public MenuItem A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ListView A08;
    public RecyclerView A09;
    public C02L A0A;
    public C07630Zb A0B;
    public C01B A0C;
    public C0W5 A0D;
    public WaImageButton A0E;
    public WaImageButton A0F;
    public C40261rr A0G;
    public C03320Ff A0H;
    public FloatingActionButton A0I;
    public C05W A0J;
    public AnonymousClass008 A0K;
    public C018708s A0L;
    public C0Zn A0M;
    public C0L5 A0N;
    public C57972qN A0O;
    public C653136s A0P;
    public C653336u A0Q;
    public C02F A0R;
    public C002301c A0S;
    public C03360Fk A0T;
    public C2AR A0U;
    public InterfaceC002901k A0V;
    public String A0W;
    public ArrayList A0X;
    public List A0Z;
    public boolean A0b;
    public List A0Y = new ArrayList();
    public final ArrayList A0g = new ArrayList();
    public final List A0h = new ArrayList();
    public final C471529v A0e = new C471529v(this);
    public boolean A0a = true;
    public final C0GA A0d = new C0GA() { // from class: X.36n
        {
            AbstractActivityC40691si.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            AbstractActivityC40691si.this.A1d();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            if (C003101m.A0U(abstractC005302j)) {
                return;
            }
            AbstractActivityC40691si abstractActivityC40691si = AbstractActivityC40691si.this;
            if (C06C.A00(abstractActivityC40691si.A0Y, new C3AD(abstractActivityC40691si.A0J.A0A(abstractC005302j)))) {
                abstractActivityC40691si.A0O.notifyDataSetChanged();
                abstractActivityC40691si.A0e.A01.A00();
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            AbstractActivityC40691si abstractActivityC40691si = AbstractActivityC40691si.this;
            if (C06C.A00(abstractActivityC40691si.A0Y, new C3AC(abstractActivityC40691si.A0J.A0A(userJid)))) {
                abstractActivityC40691si.A0O.notifyDataSetChanged();
                abstractActivityC40691si.A0e.A01.A00();
            }
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            AbstractActivityC40691si abstractActivityC40691si = AbstractActivityC40691si.this;
            if (C06C.A00(abstractActivityC40691si.A0Y, new C3AE(abstractActivityC40691si.A0J.A0A(userJid)))) {
                abstractActivityC40691si.A0O.notifyDataSetChanged();
            }
        }

        @Override // X.C0GA
        public void A05(Collection collection) {
            notifyDataSetChanged();
        }
    };
    public final C0GC A0c = new C0GC() { // from class: X.36o
        {
            AbstractActivityC40691si.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            AbstractActivityC40691si.this.A1d();
        }
    };
    public final C0GE A0f = new C0GE() { // from class: X.36p
        {
            AbstractActivityC40691si.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            AbstractActivityC40691si.this.A1d();
        }
    };

    public int A1R() {
        if (this instanceof GroupCallParticipantPicker) {
            if (!(((GroupCallParticipantPicker) this) instanceof GroupCallParticipantPickerSheet)) {
                return R.string.new_group_call;
            }
            return R.string.menuitem_new_call;
        } else if (this instanceof NotifyContactsSelector) {
            return R.string.change_number_notification;
        } else {
            if (this instanceof GroupMembersSelector) {
                return R.string.new_group;
            }
            if (this instanceof EditGroupAdminsSelector) {
                return R.string.edit_group_admins;
            }
            if (this instanceof EditBroadcastRecipientsSelector) {
                return R.string.edit_broadcast_recipients;
            }
            if (!(this instanceof ListMembersSelector)) {
                return R.string.add_paticipants;
            }
            return R.string.new_list;
        }
    }

    public int A1S() {
        if (this instanceof GroupCallParticipantPicker) {
            return R.plurals.groupcall_reach_limit;
        }
        if (this instanceof NotifyContactsSelector) {
            return R.plurals.notify_contacts_change_number_reach_limit;
        }
        if (this instanceof GroupMembersSelector) {
            return R.plurals.groupchat_reach_limit;
        }
        if (this instanceof EditGroupAdminsSelector) {
            return R.plurals.groupchat_reach_limit;
        }
        if (this instanceof EditBroadcastRecipientsSelector) {
            return R.plurals.broadcast_reach_limit;
        }
        if (!(this instanceof ListMembersSelector)) {
            return R.plurals.groupchat_reach_limit;
        }
        return R.plurals.broadcast_reach_limit;
    }

    public int A1T() {
        if (this instanceof GroupCallParticipantPicker) {
            return 7;
        }
        if (this instanceof NotifyContactsSelector) {
            return Integer.MAX_VALUE;
        }
        if (this instanceof GroupMembersSelector) {
            return this.A0C.A06();
        }
        if (this instanceof EditGroupAdminsSelector) {
            int size = this.A0Y.size();
            if (size == 0) {
                return Integer.MAX_VALUE;
            }
            return Math.min(this.A0C.A06() - 1, size);
        } else if (this instanceof EditBroadcastRecipientsSelector) {
            int A07 = this.A0C.A07(C01C.A2o);
            if (A07 == 0) {
                return Integer.MAX_VALUE;
            }
            return A07;
        } else if (!(this instanceof ListMembersSelector)) {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            return ((AbstractActivityC40691si) addGroupParticipantsSelector).A0C.A06() - addGroupParticipantsSelector.A01.size();
        } else {
            int A072 = this.A0C.A07(C01C.A2o);
            if (A072 == 0) {
                return Integer.MAX_VALUE;
            }
            return A072;
        }
    }

    public int A1U() {
        if (this instanceof GroupCallParticipantPicker) {
            return 1;
        }
        if (this instanceof NotifyContactsSelector) {
            return 0;
        }
        if (this instanceof GroupMembersSelector) {
            return 1;
        }
        if (this instanceof EditGroupAdminsSelector) {
            return 0;
        }
        return ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector)) ? 2 : 1;
    }

    public int A1V() {
        if (this instanceof GroupCallParticipantPicker) {
            return 0;
        }
        if (this instanceof NotifyContactsSelector) {
            return R.string.done;
        }
        if (this instanceof GroupMembersSelector) {
            return R.string.next;
        }
        if (this instanceof EditGroupAdminsSelector) {
            return R.string.done;
        }
        if (this instanceof EditBroadcastRecipientsSelector) {
            return R.string.done;
        }
        if (!(this instanceof ListMembersSelector)) {
            return R.string.done;
        }
        return R.string.create;
    }

    public Drawable A1W() {
        if (this instanceof GroupCallParticipantPicker) {
            return null;
        }
        if (this instanceof NotifyContactsSelector) {
            return C02160Ac.A03(this, R.drawable.ic_fab_check);
        }
        if (this instanceof GroupMembersSelector) {
            return new C0We(this.A0S, C02160Ac.A03(this, R.drawable.ic_fab_next));
        }
        if (this instanceof EditGroupAdminsSelector) {
            return C02160Ac.A03(this, R.drawable.ic_fab_check);
        }
        if (this instanceof EditBroadcastRecipientsSelector) {
            return C02160Ac.A03(this, R.drawable.ic_fab_check);
        }
        if (!(this instanceof ListMembersSelector)) {
            return C02160Ac.A03(this, R.drawable.ic_fab_check);
        }
        return C02160Ac.A03(this, R.drawable.ic_fab_check);
    }

    public final List A1X() {
        List<C06C> list = this.A0h;
        ArrayList arrayList = new ArrayList(list.size());
        for (C06C c06c : list) {
            arrayList.add(c06c.A03(UserJid.class));
        }
        return arrayList;
    }

    public void A1Y() {
        C0SV c0sv;
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null && (c0sv = recyclerView.A0S) != null) {
            int A0A = c0sv.A0A();
            View A0H = this.A09.A0S.A0H(0);
            if (A0A != 0 && A0H != null) {
                int width = this.A09.getWidth();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A0H.getLayoutParams();
                int width2 = A0H.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int paddingRight = this.A09.getPaddingRight();
                if (A0A >= this.A0h.size()) {
                    if (paddingRight > 0) {
                        RecyclerView recyclerView2 = this.A09;
                        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.A09.getPaddingTop(), 0, this.A09.getPaddingBottom());
                        return;
                    }
                    return;
                }
                int i = A0A * width2;
                if (paddingRight == 0 && width >= i - marginLayoutParams.leftMargin && width <= i + marginLayoutParams.rightMargin) {
                    RecyclerView recyclerView3 = this.A09;
                    recyclerView3.setPadding(recyclerView3.getPaddingLeft(), this.A09.getPaddingTop(), width2 >> 1, this.A09.getPaddingBottom());
                }
            }
        }
    }

    public void A1Z() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            ArrayList arrayList = new ArrayList();
            groupCallParticipantPicker.A1n(arrayList, groupCallParticipantPicker.A1X());
            if (groupCallParticipantPicker.A02.A01(arrayList, groupCallParticipantPicker, ((Number) groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")).intValue(), false) == 0) {
                groupCallParticipantPicker.setResult(-1);
                groupCallParticipantPicker.finish();
            }
        }
    }

    public void A1a() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            ArrayList arrayList = new ArrayList();
            groupCallParticipantPicker.A1n(arrayList, groupCallParticipantPicker.A1X());
            if (groupCallParticipantPicker.A02.A01(arrayList, groupCallParticipantPicker, ((Number) groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")).intValue(), true) == 0) {
                groupCallParticipantPicker.setResult(-1);
                groupCallParticipantPicker.finish();
            }
        }
    }

    public void A1b() {
        if (this instanceof GroupCallParticipantPicker) {
            return;
        }
        if (this instanceof NotifyContactsSelector) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("jids", C003101m.A0E(A1X()));
            setResult(-1, intent);
            finish();
        } else if (this instanceof GroupMembersSelector) {
            List A1X = A1X();
            if (((AbstractCollection) A1X).isEmpty()) {
                ((ActivityC02290Ap) this).A0A.A07(R.string.no_valid_participant, 0);
            } else {
                startActivityForResult(new Intent(this, NewGroup.class).putExtra("selected", C003101m.A0E(A1X)).putExtra("entry_point", getIntent().getIntExtra("entry_point", -1)), 1);
            }
        } else if (this instanceof EditGroupAdminsSelector) {
            Intent intent2 = new Intent();
            intent2.putExtra("jids", C003101m.A0E(A1X()));
            setResult(-1, intent2);
            finish();
        } else if (this instanceof EditBroadcastRecipientsSelector) {
            Intent intent3 = new Intent();
            intent3.putExtra("contacts", C003101m.A0E(A1X()));
            setResult(-1, intent3);
            finish();
        } else if (!(this instanceof ListMembersSelector)) {
            ((ActivityC02270An) this).A0F.A01(A1P());
            Intent intent4 = new Intent();
            intent4.putExtra("contacts", C003101m.A0E(A1X()));
            setResult(-1, intent4);
            finish();
        } else {
            ListMembersSelector listMembersSelector = (ListMembersSelector) this;
            C0CA c0ca = listMembersSelector.A02;
            c0ca.A00.A0C();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            synchronized (c0ca.A01) {
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(currentTimeMillis);
                    sb.append("@broadcast");
                    if (!c0ca.A0F(C0I1.A03(sb.toString()))) {
                        break;
                    }
                    currentTimeMillis++;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(currentTimeMillis);
            sb2.append("@broadcast");
            C0I1 A03 = C0I1.A03(sb2.toString());
            if (A03 != null) {
                List A1X2 = listMembersSelector.A1X();
                C0ES c0es = listMembersSelector.A03;
                c0es.A0L.A0Q(c0es.A07(A03, A1X2));
                listMembersSelector.A04.A05(A03, false);
                ((ActivityC02270An) listMembersSelector).A00.A07(listMembersSelector, Conversation.A00(listMembersSelector, ((AbstractActivityC40691si) listMembersSelector).A0J.A06(A03, "", System.currentTimeMillis())));
                listMembersSelector.finish();
                return;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.36s, X.0HS] */
    public final void A1c() {
        C653136s c653136s = this.A0P;
        if (c653136s != null) {
            c653136s.A05(true);
            this.A0P = null;
        }
        ?? r2 = new C0HS(this.A0L, this, this.A0X, this.A0Y) { // from class: X.36s
            public final C018708s A00;
            public final WeakReference A01;
            public final ArrayList A02;
            public final List A03;

            {
                ArrayList arrayList;
                this.A00 = r2;
                if (r4 != null) {
                    arrayList = new ArrayList(r4);
                } else {
                    arrayList = null;
                }
                this.A02 = arrayList;
                this.A03 = r5;
                this.A01 = new WeakReference(this);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                ArrayList arrayList = new ArrayList();
                for (C06C c06c : this.A03) {
                    if (this.A00.A0G(c06c, this.A02, true)) {
                        arrayList.add(c06c);
                    }
                }
                return arrayList;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Collection collection = (Collection) obj;
                AbstractActivityC40691si abstractActivityC40691si = (AbstractActivityC40691si) this.A01.get();
                if (abstractActivityC40691si != null) {
                    abstractActivityC40691si.A0P = null;
                    ArrayList arrayList = abstractActivityC40691si.A0g;
                    arrayList.clear();
                    arrayList.addAll(collection);
                    C57972qN c57972qN = abstractActivityC40691si.A0O;
                    if (c57972qN != null) {
                        c57972qN.notifyDataSetChanged();
                    }
                    abstractActivityC40691si.A1f();
                }
            }
        };
        this.A0P = r2;
        this.A0V.ARy(r2, new Void[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.36u, X.0HS] */
    public final void A1d() {
        C653336u c653336u = this.A0Q;
        if (c653336u != null) {
            c653336u.A05(true);
        }
        C653136s c653136s = this.A0P;
        if (c653136s != null) {
            c653136s.A05(true);
            this.A0P = null;
        }
        ?? r2 = new C0HS(this.A0C, this.A0J, this.A0L, this.A0S, this, this.A0h) { // from class: X.36u
            public final C01B A00;
            public final C05W A01;
            public final C018708s A02;
            public final C002301c A03;
            public final WeakReference A04;
            public final Set A05 = new HashSet();

            {
                this.A00 = r5;
                this.A01 = r6;
                this.A02 = r7;
                this.A03 = r8;
                Iterator it = r10.iterator();
                while (it.hasNext()) {
                    this.A05.add(((C06C) it.next()).A03(UserJid.class));
                }
                this.A04 = new WeakReference(this);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                ArrayList arrayList = new ArrayList();
                AbstractActivityC40691si abstractActivityC40691si = (AbstractActivityC40691si) this.A04.get();
                if (abstractActivityC40691si != null) {
                    abstractActivityC40691si.A1m(arrayList);
                    List list = abstractActivityC40691si.A0Z;
                    if (list != null && !list.isEmpty() && abstractActivityC40691si.A0a) {
                        HashSet hashSet = new HashSet();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            hashSet.add(((C06C) it.next()).A03(UserJid.class));
                        }
                        for (AbstractC005302j abstractC005302j : abstractActivityC40691si.A0Z) {
                            if (abstractC005302j != null && !hashSet.contains(abstractC005302j)) {
                                C06C A0A = this.A01.A0A(abstractC005302j);
                                if (this.A00.A0E(C01C.A0V) || A0A.A08 != null) {
                                    arrayList.add(A0A);
                                }
                            }
                        }
                    }
                    Collections.sort(arrayList, new C57722pt(this.A02, this.A03) { // from class: X.36t
                        @Override // X.C57722pt
                        public int A00(C06C c06c, C06C c06c2) {
                            boolean z = c06c.A08 != null;
                            if (z == (c06c2.A08 != null)) {
                                return super.compare(c06c, c06c2);
                            }
                            return z ? -1 : 1;
                        }
                    });
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C06C c06c = (C06C) it2.next();
                    c06c.A0V = this.A05.contains(c06c.A03(UserJid.class));
                }
                return arrayList;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                List list = (List) obj;
                AbstractActivityC40691si abstractActivityC40691si = (AbstractActivityC40691si) this.A04.get();
                if (abstractActivityC40691si != null) {
                    abstractActivityC40691si.A0Q = null;
                    abstractActivityC40691si.A0Y = list;
                    abstractActivityC40691si.A1c();
                    if (abstractActivityC40691si.A0a) {
                        HashSet hashSet = new HashSet();
                        List list2 = abstractActivityC40691si.A0Z;
                        if (list2 != null && !list2.isEmpty()) {
                            for (C06C c06c : abstractActivityC40691si.A0Y) {
                                if (abstractActivityC40691si.A0Z.contains(c06c.A03(UserJid.class))) {
                                    c06c.A0V = true;
                                    if (!hashSet.contains(c06c.A03(UserJid.class))) {
                                        List list3 = abstractActivityC40691si.A0h;
                                        list3.add(c06c);
                                        hashSet.add(c06c.A03(UserJid.class));
                                        if (list3.size() >= abstractActivityC40691si.A1T()) {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            abstractActivityC40691si.A0e.A01.A00();
                        }
                        abstractActivityC40691si.A0a = false;
                    }
                    List list4 = abstractActivityC40691si.A0h;
                    int size = list4.size();
                    abstractActivityC40691si.A1i(size);
                    abstractActivityC40691si.A1h(size);
                    abstractActivityC40691si.A05.setVisibility(list4.isEmpty() ? 4 : 0);
                    if (!list4.isEmpty()) {
                        abstractActivityC40691si.A1e();
                    }
                    MenuItem menuItem = abstractActivityC40691si.A04;
                    if (menuItem != null) {
                        menuItem.setVisible(!abstractActivityC40691si.A0Y.isEmpty());
                    }
                }
            }
        };
        this.A0Q = r2;
        this.A0V.ARy(r2, new Void[0]);
    }

    public final void A1e() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.selected_list_action_fab_1_margin_right);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.selected_list_action_fab_2_margin_right);
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A03.end();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.A01);
        ofInt.addUpdateListener(new C57992qP(this));
        ofInt.addListener(new C57982qO(this));
        ofInt.setDuration(240L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A02 = animatorSet;
        if (this instanceof GroupCallParticipantPicker) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0E, "translationX", (dimensionPixelSize + this.A00) * (this.A0S.A0M() ? -1 : 1));
            ofFloat.setDuration(240L).setInterpolator(new DecelerateInterpolator());
            ofFloat.setStartDelay(50L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0F, "translationX", (dimensionPixelSize2 + this.A00) * (this.A0S.A0M() ? -1 : 1));
            ofFloat2.setDuration(240L).setInterpolator(new DecelerateInterpolator());
            this.A02.play(ofFloat).with(ofFloat2).after(ofInt);
        } else {
            animatorSet.play(ofInt);
        }
        this.A02.start();
    }

    public final void A1f() {
        View findViewById = findViewById(R.id.contacts_empty_permission_denied);
        View findViewById2 = findViewById(R.id.contacts_empty);
        View findViewById3 = findViewById(R.id.search_no_matches);
        View findViewById4 = findViewById(R.id.init_contacts_progress);
        if (!this.A0R.A03()) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (this.A0Q != null) {
            findViewById4.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.A0W)) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(0);
            ((TextView) findViewById3).setText(getString(R.string.search_no_results, this.A0W));
        } else {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            findViewById3.setVisibility(8);
        }
        int size = this.A0h.size();
        A1i(size);
        A1h(size);
    }

    public final void A1g() {
        if (this.A05.getVisibility() == 0 || !this.A0b) {
            this.A07.setVisibility(8);
        } else {
            this.A07.setVisibility(0);
        }
    }

    public void A1h(int i) {
        if (this instanceof AddGroupParticipantsSelector) {
            FloatingActionButton floatingActionButton = this.A0I;
            if (i == 0) {
                floatingActionButton.A04(true);
            } else {
                floatingActionButton.A05(true);
            }
        } else if (this.A0Y.isEmpty() && this.A0h.isEmpty()) {
            this.A0I.A04(true);
        } else {
            if (!(!(this instanceof GroupCallParticipantPicker))) {
                return;
            }
            this.A0I.A05(true);
        }
    }

    public void A1i(int i) {
        C0U1 A0c = A0c();
        if (A0c != null) {
            int A1T = A1T();
            C000700j.A08(A1T > 0, "Max contacts must be positive");
            if (A1T == Integer.MAX_VALUE) {
                A0c.A0G(this.A0S.A0A(R.plurals.n_contacts_selected, i, Integer.valueOf(i)));
                return;
            } else {
                A0c.A0G(this.A0S.A0A(R.plurals.n_of_m_contacts_selected, i, Integer.valueOf(i), Integer.valueOf(A1T)));
                return;
            }
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1j(X.C58002qQ r6, X.C06C r7) {
        /*
            r5 = this;
            X.0Zn r1 = r5.A0M
            if (r1 == 0) goto L9
            android.widget.ImageView r0 = r6.A01
            r1.A02(r7, r0)
        L9:
            X.0Rg r4 = r6.A03
            java.util.ArrayList r0 = r5.A0X
            r4.A03(r7, r0)
            X.1rr r1 = r5.A0G
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r7.A03(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A0H(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L54
            boolean r0 = r7.A0V
            if (r0 != 0) goto L54
            r6.A00()
        L29:
            android.view.View r2 = r6.A00
            r1 = 0
            com.facebook.redex.ViewOnClickEBaseShape0S0300000_I0 r0 = new com.facebook.redex.ViewOnClickEBaseShape0S0300000_I0
            r0.<init>(r5, r7, r6, r1)
            r2.setOnClickListener(r0)
            int r1 = r5.A1T()
            java.util.List r0 = r5.A0h
            int r0 = r0.size()
            if (r1 != r0) goto L50
            boolean r0 = r7.A0V
            if (r0 != 0) goto L50
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            r2.setAlpha(r0)
        L4a:
            com.whatsapp.components.SelectionCheckView r0 = r6.A04
            r0.setTag(r7)
            return
        L50:
            r2.setAlpha(r3)
            goto L4a
        L54:
            java.lang.String r0 = r7.A0L
            r2 = 0
            if (r0 == 0) goto L92
            boolean r0 = r5 instanceof com.whatsapp.voipcalling.GroupCallParticipantPicker
            if (r0 != 0) goto L90
            r0 = 1
        L5e:
            if (r0 == 0) goto L92
            com.whatsapp.TextEmojiLabel r1 = r6.A02
            r1.setVisibility(r2)
            java.lang.String r0 = r7.A0L
            r1.A03(r0)
        L6a:
            android.widget.ImageView r0 = r6.A01
            r0.setAlpha(r3)
            java.lang.String r0 = r7.A0L
            if (r0 != 0) goto L75
            java.lang.String r0 = ""
        L75:
            r1.A03(r0)
            r0 = 0
            r1.setTypeface(r0, r2)
            r0 = 2131100183(0x7f060217, float:1.781274E38)
            int r1 = X.C02160Ac.A00(r5, r0)
            com.whatsapp.TextEmojiLabel r0 = r4.A01
            r0.setTextColor(r1)
            com.whatsapp.components.SelectionCheckView r1 = r6.A04
            boolean r0 = r7.A0V
            r1.A03(r0, r2)
            goto L29
        L90:
            r0 = 0
            goto L5e
        L92:
            com.whatsapp.TextEmojiLabel r1 = r6.A02
            r0 = 8
            r1.setVisibility(r0)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractActivityC40691si.A1j(X.2qQ, X.06C):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x01a3, code lost:
        if (r5 >= 0) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1k(X.C06C r10) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractActivityC40691si.A1k(X.06C):void");
    }

    public void A1l(C06C c06c) {
        if (this instanceof GroupCallParticipantPicker) {
            String string = getString(R.string.unblock_before_add_group_call, this.A0L.A08(c06c, false));
            C40261rr c40261rr = this.A0G;
            Jid A03 = c06c.A03(UserJid.class);
            if (A03 != null) {
                UnblockDialogFragment.A00(string, R.string.blocked_title, false, new C34Z(c40261rr, this, (UserJid) A03)).A14(A0N(), null);
                return;
            }
            throw null;
        } else if (this instanceof GroupMembersSelector) {
            String string2 = getString(R.string.unblock_before_add_group, this.A0L.A08(c06c, false));
            C40261rr c40261rr2 = this.A0G;
            Jid A032 = c06c.A03(UserJid.class);
            if (A032 != null) {
                AUh(UnblockDialogFragment.A00(string2, R.string.blocked_title, false, new C34Z(c40261rr2, this, (UserJid) A032)));
                return;
            }
            throw null;
        } else if (this instanceof EditBroadcastRecipientsSelector) {
            String string3 = getString(R.string.unblock_before_add_broadcast, this.A0L.A08(c06c, false));
            C40261rr c40261rr3 = this.A0G;
            Jid A033 = c06c.A03(UserJid.class);
            if (A033 != null) {
                AUh(UnblockDialogFragment.A00(string3, R.string.blocked_title, false, new C34Z(c40261rr3, this, (UserJid) A033)));
                return;
            }
            throw null;
        } else if (!(this instanceof ListMembersSelector)) {
            if (this instanceof AddGroupParticipantsSelector) {
                String string4 = getString(R.string.unblock_before_add_group, this.A0L.A08(c06c, false));
                C40261rr c40261rr4 = this.A0G;
                Jid A034 = c06c.A03(UserJid.class);
                if (A034 != null) {
                    UnblockDialogFragment.A00(string4, R.string.blocked_title, false, new C34Z(c40261rr4, this, (UserJid) A034)).A14(A0N(), null);
                    return;
                }
                throw null;
            }
        } else {
            String string5 = getString(R.string.unblock_before_add_broadcast, this.A0L.A08(c06c, false));
            C40261rr c40261rr5 = this.A0G;
            Jid A035 = c06c.A03(UserJid.class);
            if (A035 != null) {
                AUh(UnblockDialogFragment.A00(string5, R.string.blocked_title, false, new C34Z(c40261rr5, this, (UserJid) A035)));
                return;
            }
            throw null;
        }
    }

    public void A1m(ArrayList arrayList) {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            List A0F = C003101m.A0F(UserJid.class, groupCallParticipantPicker.getIntent().getStringArrayListExtra("jids"));
            if (((AbstractCollection) A0F).isEmpty()) {
                ((AbstractActivityC40691si) groupCallParticipantPicker).A0J.A05.A0V(arrayList, 1, false, false);
            } else {
                groupCallParticipantPicker.A1n(arrayList, A0F);
            }
        } else if (!(this instanceof EditGroupAdminsSelector)) {
            this.A0J.A05.A0V(arrayList, 1, false, false);
        } else {
            EditGroupAdminsSelector editGroupAdminsSelector = (EditGroupAdminsSelector) this;
            String stringExtra = editGroupAdminsSelector.getIntent().getStringExtra("gid");
            if (stringExtra != null) {
                C011005l A04 = C011005l.A04(stringExtra);
                if (A04 == null) {
                    return;
                }
                Iterator it = editGroupAdminsSelector.A00.A01(A04).A05().iterator();
                while (true) {
                    C04250Jl c04250Jl = (C04250Jl) it;
                    if (!c04250Jl.hasNext()) {
                        return;
                    }
                    C0D7 c0d7 = (C0D7) c04250Jl.next();
                    C02L c02l = ((AbstractActivityC40691si) editGroupAdminsSelector).A0A;
                    UserJid userJid = c0d7.A03;
                    if (!c02l.A0A(userJid) && (c0d7.A01 != 2 || !((AbstractActivityC40691si) editGroupAdminsSelector).A0C.A0E(C01C.A0z))) {
                        arrayList.add(((AbstractActivityC40691si) editGroupAdminsSelector).A0J.A0A(userJid));
                    }
                }
            } else {
                throw null;
            }
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public /* synthetic */ void lambda$onCreate$1436$MultipleContactPicker(View view) {
        A1Z();
    }

    public /* synthetic */ void lambda$onCreate$1437$MultipleContactPicker(View view) {
        A1a();
    }

    public /* synthetic */ void lambda$onCreate$1439$MultipleContactPicker(View view) {
        this.A0D.A01(this, 9);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A0B.A05()) {
            this.A0B.A04(true);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        C06C c06c = (C06C) A1P().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() != 0) {
            return super.onContextItemSelected(menuItem);
        }
        C40261rr c40261rr = this.A0G;
        Jid A03 = c06c.A03(UserJid.class);
        if (A03 != null) {
            c40261rr.A07(this, null, (UserJid) A03);
            return true;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.2qN, android.widget.ListAdapter] */
    @Override // X.AbstractActivityC40701sj, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int dimensionPixelSize;
        View view;
        String string;
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        if (!(this instanceof GroupCallParticipantPickerSheet)) {
            i = R.layout.multiple_contact_picker;
        } else {
            i = R.layout.group_call_participant_picker_sheet;
        }
        setContentView(layoutInflater.inflate(i, (ViewGroup) null));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0M(true);
            this.A0M = this.A0N.A04(this);
            this.A0B = new C07630Zb(this, this.A0S, findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.36q
                @Override // X.InterfaceC07650Zd
                public boolean ANY(String str) {
                    return false;
                }

                {
                    AbstractActivityC40691si.this = this;
                }

                @Override // X.InterfaceC07650Zd
                public boolean ANX(String str) {
                    AbstractActivityC40691si abstractActivityC40691si = AbstractActivityC40691si.this;
                    abstractActivityC40691si.A0W = str;
                    ArrayList A03 = C09940f2.A03(str, abstractActivityC40691si.A0S);
                    abstractActivityC40691si.A0X = A03;
                    if (A03.isEmpty()) {
                        abstractActivityC40691si.A0X = null;
                    }
                    abstractActivityC40691si.A1c();
                    return false;
                }
            });
            setTitle(A1R());
            ListView A1P = A1P();
            this.A08 = A1P;
            A1P.setFastScrollAlwaysVisible(!(this instanceof GroupCallParticipantPicker));
            this.A08.setScrollBarStyle(33554432);
            List list = this.A0h;
            list.clear();
            if (bundle == null) {
                this.A0Z = C003101m.A0F(UserJid.class, getIntent().getStringArrayListExtra("selected"));
            } else {
                AbstractCollection abstractCollection = (AbstractCollection) C003101m.A0F(UserJid.class, bundle.getStringArrayList("selected_jids"));
                if (!abstractCollection.isEmpty()) {
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        C06C A09 = this.A0J.A09((AbstractC005302j) it.next());
                        if (A09 != null) {
                            A09.A0V = true;
                            list.add(A09);
                        }
                    }
                }
            }
            A1d();
            this.A06 = findViewById(R.id.selected_items_divider);
            this.A09 = (RecyclerView) findViewById(R.id.selected_items);
            this.A00 = getResources().getDimensionPixelSize(R.dimen.selected_contacts_list_action_fab_size);
            this.A09.setPadding(!(this instanceof GroupCallParticipantPicker) ? 0 : getResources().getDimensionPixelSize(R.dimen.selected_contacts_list_left_padding), this.A09.getPaddingTop(), this.A09.getPaddingRight(), this.A09.getPaddingBottom());
            boolean z = this instanceof GroupCallParticipantPicker;
            if (z) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A09.getLayoutParams();
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.selected_contact_list_with_fab_margin_right);
                if (this.A0S.A0M()) {
                    layoutParams.rightMargin = dimensionPixelSize2;
                } else {
                    layoutParams.leftMargin = dimensionPixelSize2;
                }
                this.A09.setLayoutParams(layoutParams);
            }
            final int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
            this.A09.A0k(new AbstractC08920cK() { // from class: X.36r
                @Override // X.AbstractC08920cK
                public void A01(Rect rect, View view2, RecyclerView recyclerView, C0Y0 c0y0) {
                    int i2 = dimensionPixelSize3;
                    rect.set(0, i2, 0, i2);
                }
            });
            SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager();
            smoothScrollLinearLayoutManager.A1Y(0);
            this.A09.setLayoutManager(smoothScrollLinearLayoutManager);
            this.A09.setAdapter(this.A0e);
            this.A09.setItemAnimator(new C2LD());
            this.A08.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2qM
                public int A00 = 0;

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
                }

                {
                    AbstractActivityC40691si.this = this;
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i2) {
                    int i3 = this.A00;
                    if (i3 == 0 && i2 != i3) {
                        ((ActivityC02270An) AbstractActivityC40691si.this).A0F.A01(absListView);
                    }
                    this.A00 = i2;
                }
            });
            this.A08.setFastScrollEnabled(true);
            this.A08.setScrollbarFadingEnabled(true);
            if (this.A0S.A0N()) {
                this.A08.setVerticalScrollbarPosition(1);
                this.A08.setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0);
            } else {
                this.A08.setVerticalScrollbarPosition(2);
                this.A08.setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0);
            }
            this.A08.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2q9
                {
                    AbstractActivityC40691si.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i2, long j) {
                    AbstractActivityC40691si abstractActivityC40691si = AbstractActivityC40691si.this;
                    View findViewById = view2.findViewById(R.id.selection_check);
                    if (findViewById != null) {
                        C06C c06c = (C06C) findViewById.getTag();
                        if (abstractActivityC40691si.A0G.A0H((UserJid) c06c.A03(UserJid.class))) {
                            abstractActivityC40691si.A1l(c06c);
                        } else {
                            abstractActivityC40691si.A1k(c06c);
                        }
                    }
                }
            });
            if (!(this instanceof GroupCallParticipantPicker)) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height);
            } else {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height_big);
            }
            this.A01 = dimensionPixelSize;
            View findViewById = findViewById(R.id.selected_list);
            this.A05 = findViewById;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams2.height = this.A01;
            this.A05.setLayoutParams(layoutParams2);
            this.A05.setVisibility(4);
            this.A0E = (WaImageButton) findViewById(R.id.selected_list_action_fab_1);
            this.A0F = (WaImageButton) findViewById(R.id.selected_list_action_fab_2);
            if (z) {
                this.A0E.setVisibility(0);
                this.A0F.setVisibility(0);
                this.A0E.setImageDrawable(!(this instanceof GroupCallParticipantPicker) ? null : C02180Ae.A0O(this, R.drawable.ic_groupcall_voice, R.color.voipGroupCallPickerButtonTint));
                this.A0F.setImageDrawable(!(this instanceof GroupCallParticipantPicker) ? null : C02180Ae.A0O(this, R.drawable.ic_groupcall_video, R.color.voipGroupCallPickerButtonTint));
                this.A0E.setContentDescription(getString(!(this instanceof GroupCallParticipantPicker) ? 0 : R.string.audio_call));
                this.A0F.setContentDescription(getString(!(this instanceof GroupCallParticipantPicker) ? 0 : R.string.video_call));
                this.A0E.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 4));
                this.A0F.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 2));
                C0LX.A07(this.A0S, this.A0E, 0, dimensionPixelSize3, -this.A00, dimensionPixelSize3);
                C0LX.A07(this.A0S, this.A0F, 0, dimensionPixelSize3, -this.A00, dimensionPixelSize3);
                this.A09.postDelayed(new RunnableEBaseShape1S0100000_I0_1(this, 38), 200L);
            } else {
                this.A0E.setVisibility(8);
                this.A0F.setVisibility(8);
            }
            this.A07 = (ViewGroup) findViewById(R.id.warning);
            if (this instanceof GroupCallParticipantPicker) {
                final GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
                if (groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet) {
                    view = null;
                } else {
                    view = null;
                    if (AnonymousClass029.A1N(((AbstractActivityC40691si) groupCallParticipantPicker).A0C)) {
                        view = groupCallParticipantPicker.getLayoutInflater().inflate(R.layout.group_call_participant_picker_joinable_warning, (ViewGroup) null);
                        TextView textView = (TextView) view.findViewById(R.id.group_participant_warning_text);
                        Spanned fromHtml = Html.fromHtml(groupCallParticipantPicker.A0S.A0A(R.plurals.voip_joinable_new_group_call_warning, 7, 7));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
                        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
                        if (uRLSpanArr != null) {
                            for (URLSpan uRLSpan : uRLSpanArr) {
                                if ("learn_more_link".equals(uRLSpan.getURL())) {
                                    Log.i("GroupCallParticipantPicker/getCustomWarningLayout/learn_more_link link found");
                                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                                    spannableStringBuilder.removeSpan(uRLSpan);
                                    spannableStringBuilder.setSpan(new AbstractC02750Cs(groupCallParticipantPicker) { // from class: X.3y6
                                        @Override // X.InterfaceC02760Ct
                                        public void onClick(View view2) {
                                            AbstractC02800Cx A0N = groupCallParticipantPicker.A0N();
                                            if (A0N != null) {
                                                C02820Cz c02820Cz = new C02820Cz(A0N);
                                                c02820Cz.A09(0, JoinableEducationDialogFragment.A00(false, null), null, 1);
                                                c02820Cz.A05();
                                                return;
                                            }
                                            throw null;
                                        }
                                    }, spanStart, spanEnd, spanFlags);
                                }
                            }
                        }
                        textView.setText(spannableStringBuilder);
                        textView.setMovementMethod(new C02770Cu());
                    }
                }
            } else {
                view = null;
            }
            if (view != null) {
                this.A0b = true;
                this.A07.removeAllViews();
                this.A07.addView(view);
            } else {
                if (this instanceof ListMembersSelector) {
                    ListMembersSelector listMembersSelector = (ListMembersSelector) this;
                    C02L c02l = listMembersSelector.A00;
                    c02l.A05();
                    Me me = c02l.A00;
                    C002301c c002301c = listMembersSelector.A0S;
                    String str = me.cc;
                    string = listMembersSelector.getString(R.string.broadcast_to_recipients_note, c002301c.A0F(C28E.A0C(str, me.jabber_id.substring(str.length()))).replace(' ', (char) 160));
                } else {
                    string = "";
                }
                this.A0b = !TextUtils.isEmpty(string);
                ((TextView) findViewById(R.id.warning_text)).setText(string);
            }
            A1g();
            ?? r0 = new ArrayAdapter(this, this.A0g) { // from class: X.2qN
                {
                    AbstractActivityC40691si.this = this;
                }

                @Override // android.widget.ArrayAdapter, android.widget.Adapter
                public View getView(int i2, View view2, ViewGroup viewGroup) {
                    C58002qQ c58002qQ;
                    Object item = getItem(i2);
                    if (item != null) {
                        C06C c06c = (C06C) item;
                        if (view2 == null) {
                            AbstractActivityC40691si abstractActivityC40691si = AbstractActivityC40691si.this;
                            view2 = abstractActivityC40691si.getLayoutInflater().inflate(R.layout.multiple_contact_picker_row, viewGroup, false);
                            c58002qQ = new C58002qQ(abstractActivityC40691si, abstractActivityC40691si.A0L, abstractActivityC40691si.A0U, view2);
                            view2.setTag(c58002qQ);
                        } else {
                            c58002qQ = (C58002qQ) view2.getTag();
                        }
                        AbstractActivityC40691si.this.A1j(c58002qQ, c06c);
                        return view2;
                    }
                    throw null;
                }
            };
            this.A0O = r0;
            A1Q(r0);
            View findViewById2 = findViewById(R.id.next_btn);
            if (findViewById2 != null) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById2;
                this.A0I = floatingActionButton;
                if (!(this instanceof GroupCallParticipantPicker)) {
                    floatingActionButton.setImageDrawable(A1W());
                    this.A0I.setContentDescription(getString(A1V()));
                    this.A0I.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 28));
                }
                ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 3));
                findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 29));
                registerForContextMenu(this.A08);
                A1f();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C06C c06c = (C06C) A1P().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        if (this.A0G.A0H((UserJid) c06c.A03(UserJid.class))) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            contextMenu.add(0, 0, 0, getString(R.string.block_list_menu_unblock, this.A0L.A08(c06c, false)));
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.search).setIcon(R.drawable.ic_action_search);
        this.A04 = icon;
        icon.setShowAsAction(2);
        this.A04.setVisible(!this.A0Y.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0Y.clear();
        this.A0g.clear();
        C0Zn c0Zn = this.A0M;
        if (c0Zn != null) {
            c0Zn.A00();
            this.A0M = null;
        }
        C653336u c653336u = this.A0Q;
        if (c653336u != null) {
            c653336u.A05(true);
            this.A0Q = null;
        }
        C653136s c653136s = this.A0P;
        if (c653136s != null) {
            c653136s.A05(true);
            this.A0P = null;
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

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A0K.A00(this.A0d);
        this.A0H.A00(this.A0c);
        this.A0T.A00(this.A0f);
    }

    @Override // X.ActivityC02250Al, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0B.A02(bundle);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A0K.A01(this.A0d);
        this.A0H.A01(this.A0c);
        this.A0T.A01(this.A0f);
        notifyDataSetChanged();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        List<C06C> list = this.A0h;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C06C c06c : list) {
                arrayList.add(c06c.A03(UserJid.class));
            }
            bundle.putStringArrayList("selected_jids", C003101m.A0E(arrayList));
        }
        this.A0B.A03(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        this.A0B.A01();
        return false;
    }
}
