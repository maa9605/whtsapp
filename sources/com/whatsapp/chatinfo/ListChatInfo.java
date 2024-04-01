package com.whatsapp.chatinfo;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.AnonymousClass088;
import X.C000200d;
import X.C000500h;
import X.C000700j;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C00A;
import X.C00T;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01C;
import X.C02160Ac;
import X.C02630Ce;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03320Ff;
import X.C03340Fh;
import X.C03360Fk;
import X.C03690Gr;
import X.C04630Le;
import X.C05W;
import X.C06C;
import X.C0AT;
import X.C0C8;
import X.C0CG;
import X.C0CI;
import X.C0D7;
import X.C0DV;
import X.C0DW;
import X.C0ES;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0I1;
import X.C0L5;
import X.C0VJ;
import X.C0We;
import X.C0Zn;
import X.C23Y;
import X.C23Z;
import X.C2AR;
import X.C2HC;
import X.C2IJ;
import X.C2MB;
import X.C2MG;
import X.C2MI;
import X.C2MN;
import X.C2MS;
import X.C2NE;
import X.C2NH;
import X.C40081rY;
import X.C40411sD;
import X.C41321tj;
import X.C41521u3;
import X.C41681uL;
import X.C43081wp;
import X.C43871y8;
import X.C455822q;
import X.C47682Ce;
import X.C52762bH;
import X.C57392pE;
import X.C57402pF;
import X.C61772wh;
import X.C68303Iz;
import X.DialogC54592j1;
import X.InterfaceC53622hF;
import X.InterfaceC54602j2;
import X.InterfaceC72193Za;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.conversation.EditBroadcastRecipientsSelector;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class ListChatInfo extends C2NH {
    public View A00;
    public ListView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public C018508q A05;
    public C02L A06;
    public C018608r A07;
    public C03320Ff A08;
    public ChatInfoLayout A09;
    public C57392pE A0A;
    public C68303Iz A0B;
    public C05W A0C;
    public AnonymousClass008 A0D;
    public C018708s A0E;
    public C0Zn A0F;
    public C0L5 A0G;
    public C41321tj A0H;
    public C02F A0I;
    public C03340Fh A0J;
    public C2NE A0K;
    public C23Y A0L;
    public C0C8 A0M;
    public C03690Gr A0N;
    public C40411sD A0O;
    public C00A A0P;
    public C43081wp A0Q;
    public C06C A0R;
    public C06C A0S;
    public C47682Ce A0T;
    public C2MI A0U;
    public AnonymousClass011 A0V;
    public C455822q A0W;
    public C0ES A0X;
    public C03360Fk A0Y;
    public C41681uL A0Z;
    public C41521u3 A0a;
    public C0DW A0b;
    public C0DV A0c;
    public C02O A0d;
    public C2MN A0e;
    public C2AR A0f;
    public C2MG A0g;
    public C52762bH A0h;
    public C2MS A0i;
    public final ArrayList A0n = new ArrayList();
    public final C0GA A0k = new C0GA() { // from class: X.35b
        {
            ListChatInfo.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            ListChatInfo.A00(ListChatInfo.this);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            if (C003101m.A0U(abstractC005302j)) {
                return;
            }
            ListChatInfo listChatInfo = ListChatInfo.this;
            C06C.A00(listChatInfo.A0n, new C3AD(listChatInfo.A0C.A0A(abstractC005302j)));
            listChatInfo.A0A.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            if (C003101m.A0U(userJid)) {
                return;
            }
            ListChatInfo listChatInfo = ListChatInfo.this;
            C06C.A00(listChatInfo.A0n, new C3AC(listChatInfo.A0C.A0A(userJid)));
            listChatInfo.A0A.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            ListChatInfo listChatInfo = ListChatInfo.this;
            C02L c02l = listChatInfo.A06;
            c02l.A05();
            if (userJid.equals(c02l.A03)) {
                return;
            }
            C06C.A00(listChatInfo.A0n, new C3AE(listChatInfo.A0C.A0A(userJid)));
            listChatInfo.A0A.notifyDataSetChanged();
        }
    };
    public final C0GC A0j = new C0GC() { // from class: X.35c
        {
            ListChatInfo.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            ListChatInfo.A00(ListChatInfo.this);
        }
    };
    public final C0GE A0m = new C0GE() { // from class: X.35d
        {
            ListChatInfo.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            ListChatInfo.A00(ListChatInfo.this);
        }
    };
    public final C00T A0l = new C00T() { // from class: X.35e
        {
            ListChatInfo.this = this;
        }

        @Override // X.C00T
        public void A08(AnonymousClass092 anonymousClass092, int i) {
            if (anonymousClass092 != null) {
                ListChatInfo listChatInfo = ListChatInfo.this;
                if (listChatInfo.A1d().equals(anonymousClass092.A0n.A00) && C0DB.A0C(anonymousClass092.A0m) && i == 3) {
                    listChatInfo.A1h();
                }
            }
        }

        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            if (collection != null && !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ListChatInfo listChatInfo = ListChatInfo.this;
                    if (listChatInfo.A1d().equals(((AnonymousClass092) it.next()).A0n.A00)) {
                        listChatInfo.A1h();
                        return;
                    }
                }
            } else if (abstractC005302j == null || abstractC005302j.equals(ListChatInfo.this.A1d())) {
                ListChatInfo.this.A1h();
            }
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                ListChatInfo listChatInfo = ListChatInfo.this;
                if (listChatInfo.A1d().equals(anonymousClass092.A0n.A00) && (C0DB.A0C(anonymousClass092.A0m) || anonymousClass092.A0j)) {
                    listChatInfo.A1h();
                    return;
                }
            }
        }
    };

    public static void A00(ListChatInfo listChatInfo) {
        ArrayList arrayList = listChatInfo.A0n;
        arrayList.clear();
        HashSet A02 = listChatInfo.A0M.A01(listChatInfo.A1d()).A04().A02();
        C02L c02l = listChatInfo.A06;
        c02l.A05();
        A02.remove(c02l.A03);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            C06C A0A = listChatInfo.A0C.A0A((AbstractC005302j) it.next());
            if (!arrayList.contains(A0A)) {
                arrayList.add(A0A);
            }
        }
        listChatInfo.A1g();
        listChatInfo.A1j();
    }

    public static void A01(C06C c06c, Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, ListChatInfo.class);
        intent.putExtra("gid", C003101m.A07(c06c.A02()));
        intent.putExtra("circular_transition", true);
        activity.startActivity(intent, bundle);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void A1Y(long j) {
        super.A1Y(j);
        findViewById(R.id.actions_card).setVisibility(j == 0 ? 8 : 0);
        A1f();
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void A1c(ArrayList arrayList) {
        super.A1c(arrayList);
        if (arrayList == null || arrayList.isEmpty()) {
            findViewById(R.id.header_bottom_shadow).setVisibility(0);
        } else {
            findViewById(R.id.header_bottom_shadow).setVisibility(8);
        }
    }

    public C0I1 A1d() {
        Jid A03 = this.A0R.A03(C0I1.class);
        StringBuilder A0P = C000200d.A0P("jid is not broadcast jid: ");
        A0P.append(this.A0R.A03(C0I1.class));
        C000700j.A04(A03, A0P.toString());
        return (C0I1) A03;
    }

    public final void A1e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0n.iterator();
        while (it.hasNext()) {
            arrayList.add(((C06C) it.next()).A03(UserJid.class));
        }
        Intent intent = new Intent(this, EditBroadcastRecipientsSelector.class);
        intent.putExtra("selected", C003101m.A0E(arrayList));
        startActivityForResult(intent, 12);
    }

    public final void A1f() {
        C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.starred_messages_separator).setVisibility(8);
        C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.participants_search).setVisibility(8);
        C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.mute_layout).setVisibility(8);
        C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.notifications_layout).setVisibility(8);
        C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.notifications_separator).setVisibility(8);
        C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.media_visibility_layout).setVisibility(8);
        C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.media_visibility_separator).setVisibility(8);
    }

    public final void A1g() {
        ListItemWithRightIcon listItemWithRightIcon = (ListItemWithRightIcon) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.encryption_info_view);
        listItemWithRightIcon.setDescription(getString(R.string.group_info_encrypted));
        listItemWithRightIcon.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 24));
        listItemWithRightIcon.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.3Iz, X.0HS] */
    public final void A1h() {
        long A03 = AnonymousClass024.A03(this.A0R.A0J, Long.MIN_VALUE);
        int i = (A03 > Long.MIN_VALUE ? 1 : (A03 == Long.MIN_VALUE ? 0 : -1));
        TextView textView = this.A02;
        if (i == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(AnonymousClass029.A0m(((ChatInfoActivity) this).A09, A03, R.string.group_creation_time_today, R.string.group_creation_time_yesterday, R.string.group_creation_time, new Object[0]));
            this.A02.setVisibility(0);
        }
        C68303Iz c68303Iz = this.A0B;
        if (c68303Iz != null) {
            c68303Iz.A05(true);
        }
        A1V();
        A0m(true);
        ?? r2 = new C2IJ(this.A05, this.A0c, this.A0N, this.A0O, this.A0Q, this.A0K, this.A0b, this, this.A0R) { // from class: X.3Iz
            public final WeakReference A00;

            {
                this.A00 = new WeakReference(this);
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                ChatInfoActivity chatInfoActivity = (ChatInfoActivity) this.A00.get();
                if (chatInfoActivity != null) {
                    chatInfoActivity.A0m(false);
                    if (chatInfoActivity.findViewById(R.id.media_card_view).getVisibility() == 0) {
                        chatInfoActivity.A1U();
                    }
                    Log.i("list_chat_info/updated");
                }
            }
        };
        this.A0B = r2;
        ((ChatInfoActivity) this).A0J.ARy(r2, new Void[0]);
    }

    public final void A1i() {
        if (TextUtils.isEmpty(this.A0R.A0F)) {
            ChatInfoLayout chatInfoLayout = this.A09;
            Resources resources = getResources();
            ArrayList arrayList = this.A0n;
            chatInfoLayout.setTitleText(resources.getQuantityString(R.plurals.broadcast_n_recipients, arrayList.size(), Integer.valueOf(arrayList.size())));
            return;
        }
        this.A09.setTitleText(this.A0E.A08(this.A0R, false));
    }

    public final void A1j() {
        TextView textView = this.A04;
        Resources resources = getResources();
        ArrayList arrayList = this.A0n;
        textView.setText(resources.getQuantityString(R.plurals.recipients_title, arrayList.size(), Integer.valueOf(arrayList.size())));
        A1k();
        Collections.sort(arrayList, new C61772wh(this.A06, this.A0E));
        this.A0A.notifyDataSetChanged();
        A1i();
    }

    public final void A1k() {
        int A07 = ((ActivityC02290Ap) this).A0B.A07(C01C.A2o);
        ArrayList arrayList = this.A0n;
        if (arrayList.size() <= (A07 * 9) / 10 || A07 == 0) {
            this.A03.setVisibility(8);
            return;
        }
        this.A03.setVisibility(0);
        this.A03.setText(getString(R.string.participants_count, Integer.valueOf(arrayList.size()), Integer.valueOf(A07)));
    }

    public final void A1l(boolean z) {
        C06C c06c = this.A0S;
        boolean z2 = false;
        if (c06c == null) {
            this.A05.A07(R.string.group_add_contact_failed, 0);
            return;
        }
        C2MS c2ms = this.A0i;
        String str = null;
        if (c2ms != null) {
            String A00 = C04630Le.A00(c06c);
            if (c06c.A0B()) {
                if (c2ms.A00 != null) {
                    str = c06c.A05();
                    z2 = true;
                } else {
                    throw null;
                }
            }
            try {
                startActivityForResult(C2MS.A00(A00, str, z, z2), 10);
                this.A0h.A02(z, 9);
                return;
            } catch (ActivityNotFoundException unused) {
                C002701i.A19(this, 4);
                return;
            }
        }
        throw null;
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, android.app.Activity
    public void finishAfterTransition() {
        if (C2HC.A00) {
            this.A00.setTransitionName(null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A00);
            transitionSet.addTransition(slide);
            Slide slide2 = new Slide(80);
            slide2.addTarget(this.A01);
            transitionSet.addTransition(slide2);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    public /* synthetic */ void lambda$onCreate$1301$ListChatInfo(View view) {
        A1e();
    }

    public /* synthetic */ void lambda$onCreate$1303$ListChatInfo(View view) {
        C002701i.A19(this, 3);
    }

    public void lambda$onCreate$1305$ListChatInfo(View view) {
        C0CI A06 = ((ChatInfoActivity) this).A0H.A06(this);
        A06.A01.A03(new C0CG() { // from class: X.35J
            {
                ListChatInfo.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C002701i.A19(ListChatInfo.this, 2);
            }
        }, null);
    }

    public /* synthetic */ void lambda$onCreate$1306$ListChatInfo(View view) {
        startActivity(new Intent(this, StarredMessagesActivity.class).putExtra("jid", A1d().getRawString()));
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 10:
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                this.A0H.A06();
                this.A0h.A00();
                return;
            case 12:
                if (i2 != -1) {
                    return;
                }
                List A0F = C003101m.A0F(UserJid.class, intent.getStringArrayListExtra("contacts"));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = this.A0n;
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C06C) it.next()).A03(UserJid.class));
                }
                AbstractCollection abstractCollection = (AbstractCollection) A0F;
                Iterator it2 = abstractCollection.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!hashSet.contains(next)) {
                        arrayList.add(next);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Jid A03 = ((C06C) it3.next()).A03(UserJid.class);
                    if (!abstractCollection.contains(A03)) {
                        arrayList2.add(A03);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C0ES c0es = this.A0X;
                    C0I1 A1d = A1d();
                    if (c0es != null) {
                        C000700j.A05(arrayList);
                        C02630Ce A01 = c0es.A0Q.A01(A1d);
                        ArrayList arrayList4 = new ArrayList(arrayList.size());
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            UserJid userJid = (UserJid) it4.next();
                            arrayList4.add(new C0D7(userJid, C02630Ce.A01(c0es.A0T.A06(userJid)), 0, false));
                        }
                        A01.A09(arrayList4);
                        c0es.A09.A07.remove(A1d);
                        int size = arrayList.size();
                        C23Z c23z = c0es.A0V;
                        if (size == 1) {
                            c23z.A02(c0es.A0g.A08(null, A1d, c0es.A0D.A05(), 4, (UserJid) arrayList.get(0), 0L), 2);
                        } else {
                            c23z.A02(c0es.A0g.A09(null, A1d, c0es.A0D.A05(), 12, null, arrayList, A01, 0L), 2);
                        }
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            arrayList3.add(this.A0C.A0A((AbstractC005302j) it5.next()));
                        }
                    } else {
                        throw null;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    this.A0X.A0E(A1d(), arrayList2);
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        arrayList3.remove(this.A0C.A0A((AbstractC005302j) it6.next()));
                    }
                }
                this.A0a.A05(A1d(), false);
                A1j();
                return;
            default:
                return;
        }
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        C06C c06c = ((C57402pF) ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).A03;
        this.A0S = c06c;
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            if (c06c.A08 != null) {
                ContactInfoActivity.A03(c06c, this, null);
                return true;
            }
            return true;
        } else if (itemId == 1) {
            ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, c06c));
            return true;
        } else if (itemId == 2) {
            A1l(true);
            return true;
        } else if (itemId == 3) {
            A1l(false);
            return true;
        } else if (itemId == 5) {
            C002701i.A19(this, 6);
            return true;
        } else if (itemId != 6) {
            return false;
        } else {
            Intent intent = new Intent(this, IdentityVerificationActivity.class);
            intent.putExtra("jid", C003101m.A07(this.A0S.A03(UserJid.class)));
            startActivity(intent);
            return true;
        }
    }

    @Override // X.C2NH, com.whatsapp.chatinfo.ChatInfoActivity, X.C2IC, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        UserJid nullable;
        A0h(5);
        super.onCreate(bundle);
        this.A0h = new C52762bH(this.A0V, ((ActivityC02290Ap) this).A0B, ((ActivityC02290Ap) this).A0E, this.A0I);
        this.A0F = this.A0G.A04(this);
        A0S();
        setTitle(R.string.list_info);
        setContentView(R.layout.groupchat_info);
        this.A09 = (ChatInfoLayout) findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.A09();
        A0k(toolbar);
        A0c().A0L(true);
        toolbar.setNavigationIcon(new C0We(((ChatInfoActivity) this).A09, C02160Ac.A03(this, R.drawable.ic_back_shadow)));
        this.A01 = A1P();
        View inflate = getLayoutInflater().inflate(R.layout.groupchat_info_header, (ViewGroup) this.A01, false);
        C0AT.A0V(inflate, 2);
        this.A01.addHeaderView(inflate, null, false);
        this.A00 = findViewById(R.id.header);
        this.A09.A01();
        this.A09.setColor(C02160Ac.A00(this, R.color.primary));
        this.A09.A03(getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material), getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material));
        View inflate2 = getLayoutInflater().inflate(R.layout.groupchat_info_footer, (ViewGroup) this.A01, false);
        this.A01.addFooterView(inflate2, null, false);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setVisibility(4);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        linearLayout.setPadding(0, 0, 0, point.y);
        this.A01.addFooterView(linearLayout, null, false);
        C0I1 A03 = C0I1.A03(getIntent().getStringExtra("gid"));
        if (A03 == null) {
            Log.e("list_chat_info/on_create: exiting due to null listChat jid object");
            finish();
            return;
        }
        this.A0R = this.A0C.A0A(A03);
        ArrayList arrayList = this.A0n;
        this.A0A = new C57392pE(this, this, arrayList);
        this.A00 = findViewById(R.id.header);
        this.A01.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2pD
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }

            {
                ListChatInfo.this = this;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                int i4;
                ListChatInfo listChatInfo = ListChatInfo.this;
                View childAt = listChatInfo.A01.getChildAt(0);
                if (childAt != null) {
                    if (listChatInfo.A01.getWidth() > listChatInfo.A01.getHeight()) {
                        if (listChatInfo.A01.getFirstVisiblePosition() == 0) {
                            i4 = childAt.getTop();
                        } else {
                            i4 = (-listChatInfo.A00.getHeight()) + 1;
                        }
                        View view = listChatInfo.A00;
                        view.offsetTopAndBottom(i4 - view.getTop());
                    } else if (listChatInfo.A00.getTop() == 0) {
                    } else {
                        View view2 = listChatInfo.A00;
                        view2.offsetTopAndBottom(-view2.getTop());
                    }
                }
            }
        });
        this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2p2
            {
                ListChatInfo.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i;
                ListChatInfo listChatInfo = ListChatInfo.this;
                View childAt = listChatInfo.A01.getChildAt(0);
                if (childAt != null) {
                    if (listChatInfo.A01.getWidth() > listChatInfo.A01.getHeight()) {
                        if (listChatInfo.A01.getFirstVisiblePosition() == 0) {
                            i = childAt.getTop();
                        } else {
                            i = (-listChatInfo.A00.getHeight()) + 1;
                        }
                        View view = listChatInfo.A00;
                        view.offsetTopAndBottom(i - view.getTop());
                    } else if (listChatInfo.A00.getTop() == 0) {
                    } else {
                        View view2 = listChatInfo.A00;
                        view2.offsetTopAndBottom(-view2.getTop());
                    }
                }
            }
        });
        this.A01.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2p4
            {
                ListChatInfo.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                ListChatInfo listChatInfo = ListChatInfo.this;
                C06C c06c = ((C57402pF) view.getTag()).A03;
                if (c06c != null) {
                    listChatInfo.A0S = c06c;
                    view.showContextMenu();
                }
            }
        });
        this.A0R.toString();
        View findViewById = findViewById(R.id.add_participant_layout);
        ((TextView) findViewById.findViewById(R.id.add_participant_text)).setText(R.string.edit_broadcast_recipients);
        findViewById.findViewById(R.id.invite_via_link_button).setVisibility(8);
        findViewById.findViewById(R.id.invite_via_link_separator).setVisibility(8);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 35));
        A1f();
        this.A02 = (TextView) findViewById(R.id.conversation_contact_status);
        InterfaceC72193Za interfaceC72193Za = new InterfaceC72193Za() { // from class: X.35H
            {
                ListChatInfo.this = this;
            }

            @Override // X.InterfaceC72193Za
            public final void AIa() {
                ListChatInfo listChatInfo = ListChatInfo.this;
                Intent intent = new Intent(listChatInfo, MediaGalleryActivity.class);
                intent.putExtra("jid", listChatInfo.A1d().getRawString());
                listChatInfo.startActivity(intent);
            }
        };
        MediaCard mediaCard = (MediaCard) findViewById(R.id.media_card_view);
        mediaCard.setSeeMoreClickListener(interfaceC72193Za);
        mediaCard.setTopShadowVisibility(8);
        this.A01.setAdapter((ListAdapter) this.A0A);
        registerForContextMenu(this.A01);
        this.A0R.toString();
        findViewById(R.id.change_subject_btn).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 34));
        TextView textView = (TextView) findViewById(R.id.participants_title);
        this.A04 = textView;
        textView.setText(getResources().getQuantityString(R.plurals.recipients_title, arrayList.size(), Integer.valueOf(arrayList.size())));
        this.A03 = (TextView) findViewById(R.id.participants_info);
        A1k();
        A1W(R.drawable.avatar_broadcast_large, R.color.avatar_broadcast_large);
        ((TextView) findViewById(R.id.exit_group_text)).setText(R.string.delete_list);
        ((ImageView) findViewById(R.id.exit_group_icon)).setImageResource(R.drawable.ic_action_delete);
        View findViewById2 = findViewById(R.id.exit_group_btn);
        findViewById2.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 36));
        AnonymousClass088.A1U(findViewById2);
        findViewById(R.id.report_group).setVisibility(8);
        HashSet A02 = this.A0M.A01(A1d()).A04().A02();
        C02L c02l = this.A06;
        c02l.A05();
        A02.remove(c02l.A03);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            C06C A0A = this.A0C.A0A((AbstractC005302j) it.next());
            if (!arrayList.contains(A0A)) {
                arrayList.add(A0A);
            }
        }
        A1i();
        A1h();
        A1j();
        A1g();
        findViewById(R.id.starred_messages_layout).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 37));
        this.A0D.A01(this.A0k);
        this.A0P.A01(this.A0l);
        this.A08.A01(this.A0j);
        this.A0Y.A01(this.A0m);
        if (bundle != null && (nullable = UserJid.getNullable(bundle.getString("selected_jid"))) != null) {
            this.A0S = this.A0C.A0A(nullable);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Context applicationContext = getApplicationContext();
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                this.A00.setTransitionName(applicationContext.getResources().getString(R.string.transition_photo));
            } else {
                findViewById(R.id.picture).setTransitionName(applicationContext.getResources().getString(R.string.transition_photo));
            }
        }
        this.A09.A04(inflate, inflate2, linearLayout, this.A0A);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        C06C c06c = ((C57402pF) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView.getTag()).A03;
        if (c06c == null) {
            return;
        }
        String A04 = this.A0E.A04(c06c);
        contextMenu.add(0, 1, 0, getString(R.string.message_contact_name, A04));
        if (c06c.A08 == null) {
            contextMenu.add(0, 2, 0, R.string.add_contact);
            contextMenu.add(0, 3, 0, R.string.add_exist);
        } else {
            contextMenu.add(0, 0, 0, getString(R.string.view_contact_name, A04));
        }
        if (this.A0n.size() > 2) {
            contextMenu.add(0, 5, 0, getString(R.string.remove_contact_name_from_list, A04));
        }
        contextMenu.add(0, 6, 0, R.string.verify_identity);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        String string;
        if (i == 2) {
            if (TextUtils.isEmpty(this.A0E.A08(this.A0R, false))) {
                string = getString(R.string.delete_list_unnamed_dialog_title);
            } else {
                string = getString(R.string.delete_list_dialog_title, this.A0E.A08(this.A0R, false));
            }
            return ((ChatInfoActivity) this).A0H.A01(this, new InterfaceC53622hF() { // from class: X.35f
                {
                    ListChatInfo.this = this;
                }

                @Override // X.InterfaceC53622hF
                public void AMJ() {
                    C002701i.A18(ListChatInfo.this, 2);
                }

                @Override // X.InterfaceC53622hF
                public void AN6(boolean z) {
                    Log.i("list_chat_info/onclick_leaveGroup");
                    ListChatInfo listChatInfo = ListChatInfo.this;
                    ((ChatInfoActivity) listChatInfo).A0J.ARy(new C35O(listChatInfo, listChatInfo.A1d(), listChatInfo.A07, z), new Void[0]);
                }
            }, 1, string).A00();
        } else if (i == 3) {
            InterfaceC54602j2 interfaceC54602j2 = new InterfaceC54602j2() { // from class: X.35I
                {
                    ListChatInfo.this = this;
                }

                @Override // X.InterfaceC54602j2
                public final void AR9(String str) {
                    ListChatInfo listChatInfo = ListChatInfo.this;
                    if (!listChatInfo.A0E.A08(listChatInfo.A0R, false).equals(str)) {
                        C06C c06c = listChatInfo.A0R;
                        c06c.A0F = str;
                        listChatInfo.A0C.A0J(c06c);
                        listChatInfo.A0L.A01(listChatInfo.A1d(), str);
                        listChatInfo.A1i();
                        listChatInfo.A0J.A05(listChatInfo.A1d());
                        listChatInfo.A0Z.A03(listChatInfo.A0R);
                    }
                }
            };
            C455822q c455822q = this.A0W;
            C018508q c018508q = this.A05;
            C2MB c2mb = ((ActivityC02270An) this).A0F;
            AbstractC000600i abstractC000600i = ((ActivityC02290Ap) this).A08;
            C40081rY c40081rY = ((ActivityC02290Ap) this).A0H;
            C43871y8 c43871y8 = ((ActivityC02290Ap) this).A0G;
            C47682Ce c47682Ce = this.A0T;
            C02E c02e = ((ActivityC02290Ap) this).A0E;
            C002301c c002301c = ((ChatInfoActivity) this).A09;
            C2MI c2mi = this.A0U;
            C000500h c000500h = ((ActivityC02290Ap) this).A0F;
            C02O c02o = this.A0d;
            C06C A08 = this.A0C.A08(A1d());
            if (A08 != null) {
                return new DialogC54592j1(this, c455822q, c018508q, c2mb, abstractC000600i, c40081rY, c43871y8, c47682Ce, c02e, c002301c, c2mi, c000500h, c02o, 3, R.string.edit_list_name_dialog_title, A08.A0F, interfaceC54602j2, ((ActivityC02290Ap) this).A0B.A07(C01C.A3z), 0, 0, 16385);
            }
            throw null;
        } else if (i == 4) {
            Log.w("listchatinfo/add existing contact: activity not found, probably tablet");
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.activity_not_found);
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2p5
                {
                    ListChatInfo.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(ListChatInfo.this, 4);
                }
            });
            return c019208x.A00();
        } else if (i != 6) {
            return super.onCreateDialog(i);
        } else {
            C06C c06c = this.A0S;
            if (c06c != null) {
                String string2 = getString(R.string.remove_recipient_dialog_title, this.A0E.A08(c06c, false));
                C019208x c019208x2 = new C019208x(this);
                CharSequence A0g = C002701i.A0g(string2, this, ((ActivityC02290Ap) this).A0H);
                C019308y c019308y = c019208x2.A01;
                c019308y.A0E = A0g;
                c019308y.A0J = true;
                c019208x2.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2p6
                    {
                        ListChatInfo.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C002701i.A18(ListChatInfo.this, 6);
                    }
                });
                c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2p3
                    {
                        ListChatInfo.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ListChatInfo listChatInfo = ListChatInfo.this;
                        C002701i.A18(listChatInfo, 6);
                        C06C c06c2 = listChatInfo.A0S;
                        C0ES c0es = listChatInfo.A0X;
                        C0I1 A1d = listChatInfo.A1d();
                        Jid A03 = c06c2.A03(UserJid.class);
                        if (A03 == null) {
                            throw null;
                        }
                        if (c0es != null) {
                            c0es.A0E(A1d, Collections.singletonList(A03));
                            listChatInfo.A0n.remove(c06c2);
                            listChatInfo.A0a.A05(listChatInfo.A1d(), false);
                            listChatInfo.A1g();
                            listChatInfo.A1j();
                            return;
                        }
                        throw null;
                    }
                });
                return c019208x2.A00();
            }
            return super.onCreateDialog(i);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, R.string.add_broadcast_recipient).setIcon(R.drawable.ic_action_add_person_shadow).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0F.A00();
        this.A0D.A00(this.A0k);
        this.A0P.A00(this.A0l);
        this.A08.A00(this.A0j);
        this.A0Y.A00(this.A0m);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            A1e();
            return true;
        }
        if (itemId != 2) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            C0VJ.A0B(this);
        }
        return true;
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C06C c06c = this.A0S;
        if (c06c != null) {
            bundle.putString("selected_jid", C003101m.A07(c06c.A02()));
        }
    }
}
