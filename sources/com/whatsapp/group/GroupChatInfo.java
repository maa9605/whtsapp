package com.whatsapp.group;

import X.AbstractActivityC49232Jf;
import X.AbstractC000600i;
import X.AbstractC005302j;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.AnonymousClass075;
import X.AnonymousClass088;
import X.C000500h;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C00A;
import X.C00B;
import X.C00T;
import X.C011005l;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02780Cv;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03320Ff;
import X.C03340Fh;
import X.C03360Fk;
import X.C03370Fl;
import X.C03690Gr;
import X.C04470Kh;
import X.C05M;
import X.C05W;
import X.C05X;
import X.C06C;
import X.C0AT;
import X.C0BA;
import X.C0C8;
import X.C0CB;
import X.C0DV;
import X.C0DW;
import X.C0E7;
import X.C0EG;
import X.C0ES;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0GG;
import X.C0HS;
import X.C0L5;
import X.C0LF;
import X.C0TD;
import X.C0VJ;
import X.C0We;
import X.C0Zn;
import X.C1M7;
import X.C22I;
import X.C2AR;
import X.C2H7;
import X.C2HC;
import X.C2KD;
import X.C2MB;
import X.C2MG;
import X.C2MH;
import X.C2MI;
import X.C2MN;
import X.C2MS;
import X.C2MZ;
import X.C2NE;
import X.C3CA;
import X.C3ZD;
import X.C40081rY;
import X.C40411sD;
import X.C41181tV;
import X.C41321tj;
import X.C41461tx;
import X.C41471ty;
import X.C41711uO;
import X.C41991uq;
import X.C43081wp;
import X.C43871y8;
import X.C455822q;
import X.C456723a;
import X.C456823b;
import X.C456923c;
import X.C47682Ce;
import X.C49222Jd;
import X.C49262Ji;
import X.C52762bH;
import X.C61702wa;
import X.C61722wc;
import X.C61732wd;
import X.C61742we;
import X.C61752wf;
import X.C66733Cf;
import X.C68533Kg;
import X.DialogC54592j1;
import X.InterfaceC453821q;
import X.InterfaceC453921s;
import X.InterfaceC53622hF;
import X.InterfaceC54602j2;
import X.InterfaceC61762wg;
import X.InterfaceC72193Za;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ChatInfoLayout;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.crop.CropImage;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0110000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class GroupChatInfo extends AbstractActivityC49232Jf implements C2H7 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ImageView A0B;
    public LinearLayout A0C;
    public ListView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public C018508q A0I;
    public C02L A0J;
    public C05X A0K;
    public C01B A0L;
    public C018608r A0M;
    public C03320Ff A0N;
    public ChatInfoLayout A0O;
    public C05W A0P;
    public AnonymousClass008 A0Q;
    public AnonymousClass075 A0R;
    public C018708s A0S;
    public C04470Kh A0T;
    public C0Zn A0U;
    public C0L5 A0V;
    public C0LF A0W;
    public C41321tj A0X;
    public C0E7 A0Y;
    public C02E A0Z;
    public AnonymousClass012 A0a;
    public C02F A0b;
    public C41181tV A0c;
    public C05M A0d;
    public C03340Fh A0e;
    public C2NE A0f;
    public C456923c A0g;
    public C0C8 A0h;
    public C03690Gr A0i;
    public C40411sD A0j;
    public C00A A0k;
    public C43081wp A0l;
    public C00B A0m;
    public C06C A0n;
    public C06C A0o;
    public C41711uO A0p;
    public C47682Ce A0q;
    public C2MI A0r;
    public AnonymousClass011 A0s;
    public C455822q A0t;
    public C61722wc A0u;
    public C49222Jd A0v;
    public C61742we A0w;
    public C66733Cf A0x;
    public C61752wf A0y;
    public C0ES A0z;
    public C456823b A10;
    public C03360Fk A11;
    public C49262Ji A12;
    public C011005l A13;
    public C41461tx A14;
    public C41471ty A15;
    public C0EG A16;
    public C0DW A17;
    public C0DV A18;
    public C02O A19;
    public C22I A1A;
    public C456723a A1B;
    public C0CB A1C;
    public C2MN A1D;
    public C2AR A1E;
    public C2MG A1F;
    public ReadMoreTextView A1G;
    public MediaCard A1H;
    public C52762bH A1I;
    public C2MS A1J;
    public C2MZ A1K;
    public C2MH A1L;
    public C0HS A1M;
    public C41991uq A1N;
    public ArrayList A1O = new ArrayList();
    public final HashMap A1X = new HashMap();
    public final C0GA A1R = new C0GA() { // from class: X.3CW
        {
            GroupChatInfo.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            GroupChatInfo.A02(GroupChatInfo.this);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            if (C003101m.A0U(abstractC005302j)) {
                GroupChatInfo groupChatInfo = GroupChatInfo.this;
                if (abstractC005302j.equals(groupChatInfo.A13)) {
                    groupChatInfo.A0A.setVisibility(8);
                    groupChatInfo.A0T.A01(groupChatInfo.A0n);
                    groupChatInfo.A1r();
                    return;
                }
                return;
            }
            GroupChatInfo groupChatInfo2 = GroupChatInfo.this;
            C06C.A00(groupChatInfo2.A1O, new C3AD(groupChatInfo2.A0P.A0A(abstractC005302j)));
            groupChatInfo2.A0u.A00();
        }

        @Override // X.C0GA
        public void A02(AbstractC005302j abstractC005302j) {
            if (C003101m.A0U(abstractC005302j)) {
                GroupChatInfo groupChatInfo = GroupChatInfo.this;
                if (abstractC005302j.equals(groupChatInfo.A13)) {
                    groupChatInfo.A0A.setVisibility(0);
                }
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            if (C003101m.A0U(userJid)) {
                return;
            }
            GroupChatInfo groupChatInfo = GroupChatInfo.this;
            C06C.A00(groupChatInfo.A1O, new C3AC(groupChatInfo.A0P.A0A(userJid)));
            groupChatInfo.A0u.A00();
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            if (userJid != null) {
                GroupChatInfo groupChatInfo = GroupChatInfo.this;
                C02L c02l = groupChatInfo.A0J;
                c02l.A05();
                if (userJid.equals(c02l.A03)) {
                    groupChatInfo.A0u.notifyDataSetChanged();
                    return;
                }
                C06C.A00(groupChatInfo.A1O, new C3AE(groupChatInfo.A0P.A0A(userJid)));
                groupChatInfo.A0u.A00();
            }
        }
    };
    public final C0GC A1Q = new C0GC() { // from class: X.3CY
        {
            GroupChatInfo.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            GroupChatInfo.A02(GroupChatInfo.this);
        }
    };
    public final C0GE A1U = new C0GE() { // from class: X.3CZ
        {
            GroupChatInfo.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            GroupChatInfo.A02(GroupChatInfo.this);
        }
    };
    public final C0GG A1S = new C0GG() { // from class: X.3Ca
        {
            GroupChatInfo.this = this;
        }

        @Override // X.C0GG
        public void A03(AbstractC005302j abstractC005302j) {
            if (abstractC005302j != null) {
                GroupChatInfo groupChatInfo = GroupChatInfo.this;
                if (abstractC005302j.equals(groupChatInfo.A13)) {
                    C018508q c018508q = groupChatInfo.A0I;
                    c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(groupChatInfo, 30));
                }
            }
        }

        @Override // X.C0GG
        public void A05(AbstractC005302j abstractC005302j) {
            GroupChatInfo groupChatInfo = GroupChatInfo.this;
            if (abstractC005302j.equals(groupChatInfo.A13)) {
                groupChatInfo.A1e();
            }
        }
    };
    public final InterfaceC61762wg A1T = new InterfaceC61762wg() { // from class: X.3CI
        {
            GroupChatInfo.this = this;
        }

        @Override // X.InterfaceC61762wg
        public final void AGo(AbstractC005302j abstractC005302j) {
            GroupChatInfo groupChatInfo = GroupChatInfo.this;
            if (groupChatInfo.A13.equals(abstractC005302j)) {
                groupChatInfo.A1g();
            }
        }
    };
    public final CompoundButton.OnCheckedChangeListener A1P = new C61702wa(this);
    public final InterfaceC453821q A1V = new InterfaceC453821q() { // from class: X.3Cb
        {
            GroupChatInfo.this = this;
        }

        @Override // X.InterfaceC453821q
        public void AOv(AbstractC005302j abstractC005302j) {
            GroupChatInfo groupChatInfo = GroupChatInfo.this;
            if (abstractC005302j.equals(groupChatInfo.A13)) {
                C018508q c018508q = groupChatInfo.A0I;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(groupChatInfo, 33));
            }
        }

        @Override // X.InterfaceC453821q
        public void APC(AbstractC005302j abstractC005302j) {
            GroupChatInfo groupChatInfo = GroupChatInfo.this;
            if (abstractC005302j.equals(groupChatInfo.A13)) {
                C018508q c018508q = groupChatInfo.A0I;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(groupChatInfo, 32));
            }
        }
    };
    public final InterfaceC453921s A1W = new InterfaceC453921s() { // from class: X.3Cc
        @Override // X.InterfaceC453921s
        public void ANe(C0K0 c0k0) {
        }

        {
            GroupChatInfo.this = this;
        }

        @Override // X.InterfaceC453921s
        public void ANf(AbstractC005302j abstractC005302j, UserJid userJid) {
            GroupChatInfo groupChatInfo = GroupChatInfo.this;
            if (abstractC005302j.equals(groupChatInfo.A13)) {
                C018508q c018508q = groupChatInfo.A0I;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(groupChatInfo, 35));
            }
        }

        @Override // X.InterfaceC453921s
        public void ANg(AbstractC005302j abstractC005302j, UserJid userJid) {
            GroupChatInfo groupChatInfo = GroupChatInfo.this;
            if (abstractC005302j.equals(groupChatInfo.A13)) {
                C018508q c018508q = groupChatInfo.A0I;
                c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(groupChatInfo, 34));
            }
        }
    };

    public static void A00(C06C c06c, Activity activity) {
        Intent intent = new Intent(activity, GroupChatInfo.class);
        intent.putExtra("gid", C003101m.A07(c06c.A02()));
        intent.putExtra("show_description", true);
        activity.startActivity(intent);
    }

    public static void A01(C06C c06c, Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, GroupChatInfo.class);
        intent.putExtra("gid", C003101m.A07(c06c.A02()));
        intent.putExtra("circular_transition", true);
        activity.startActivity(intent, bundle);
    }

    public static void A02(GroupChatInfo groupChatInfo) {
        C06C A08 = groupChatInfo.A0P.A08(groupChatInfo.A13);
        groupChatInfo.A0n = A08;
        if (A08 != null) {
            groupChatInfo.A1m();
            groupChatInfo.A1h();
            groupChatInfo.A1i();
            groupChatInfo.A1n();
        }
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void A1c(ArrayList arrayList) {
        super.A1c(arrayList);
        if (this.A01.getVisibility() == 8 && (arrayList == null || arrayList.isEmpty() || !this.A0h.A05(this.A13))) {
            findViewById(R.id.header_bottom_shadow).setVisibility(0);
        } else {
            findViewById(R.id.header_bottom_shadow).setVisibility(8);
        }
    }

    public C011005l A1d() {
        C06C c06c = this.A0n;
        if (c06c == null) {
            return null;
        }
        return (C011005l) c06c.A03(C011005l.class);
    }

    public final void A1e() {
        if (!super.A0M) {
            return;
        }
        startActivity(new Intent(getApplicationContext(), HomeActivity.class).addFlags(603979776));
    }

    public final void A1f() {
        int A06 = this.A0z.A06(this.A13);
        if (this.A1O.size() < A06) {
            C011005l c011005l = this.A13;
            Intent intent = new Intent(this, AddGroupParticipantsSelector.class);
            intent.putExtra("gid", c011005l.getRawString());
            startActivityForResult(intent, 12);
            return;
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A03(R.string.alert);
        c019208x.A01.A0E = getResources().getQuantityString(R.plurals.groupchat_reach_limit, A06, Integer.valueOf(A06));
        c019208x.A06(R.string.ok, null);
        c019208x.A00().show();
    }

    public final void A1g() {
        this.A0n = this.A0P.A0A(this.A13);
        A1j();
        A1r();
        A1h();
        A1i();
        A1n();
        A1m();
        this.A0y.A00.setVisibility(8);
        boolean A06 = this.A0h.A06(this.A13);
        A1p();
        A1o();
        A1u(A06);
        View findViewById = findViewById(R.id.add_participant_layout);
        if (findViewById != null) {
            findViewById.setVisibility(A06 ? 0 : 8);
            invalidateOptionsMenu();
            this.A0u.A00();
            return;
        }
        throw null;
    }

    public final void A1h() {
        ListItemWithRightIcon listItemWithRightIcon = (ListItemWithRightIcon) C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.encryption_info_view);
        boolean z = this.A0n.A0S;
        int i = R.string.contact_encryption;
        int i2 = R.string.group_info_encrypted;
        if (z) {
            i = R.string.settings_security;
            i2 = R.string.security_card_description_for_in_app_support;
        }
        listItemWithRightIcon.setTitle(getString(i));
        listItemWithRightIcon.setDescription(getString(i2));
        listItemWithRightIcon.setOnClickListener(new ViewOnClickCListenerShape2S0110000_I0(this, z, 1));
        listItemWithRightIcon.setVisibility(0);
    }

    public final void A1i() {
        int A07 = this.A0L.A07(C01C.A35);
        View view = this.A01;
        if (A07 > 0) {
            view.setVisibility(0);
            String str = this.A0n.A0B.A02;
            if (!TextUtils.isEmpty(str)) {
                this.A08.setVisibility(8);
                this.A03.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AnonymousClass029.A0Q(this.A0Z, this.A19, C002701i.A0d(str, this, this.A1G.getPaint(), ((ActivityC02290Ap) this).A0H)));
                this.A1L.A01(this, spannableStringBuilder);
                this.A1G.A06(spannableStringBuilder, null, false, 0);
                return;
            } else if (!this.A0h.A05(this.A13) || (!this.A0h.A06(this.A13) && this.A0n.A0Z)) {
                this.A08.setVisibility(8);
                this.A01.setVisibility(8);
                return;
            } else {
                this.A03.setVisibility(8);
                this.A08.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }

    public final void A1j() {
        String A0m;
        C06C A09;
        this.A0O.setTitleText(this.A0S.A08(this.A0n, false));
        this.A0O.setTitleVerified(this.A0n.A0F());
        long A03 = AnonymousClass024.A03(this.A0n.A0J, Long.MIN_VALUE);
        C05W c05w = this.A0P;
        AbstractC005302j abstractC005302j = (AbstractC005302j) this.A0n.A03(GroupJid.class);
        UserJid userJid = null;
        if (abstractC005302j != null && (A09 = c05w.A09(abstractC005302j)) != null) {
            userJid = A09.A0A;
        }
        boolean A0A = this.A0J.A0A(userJid);
        boolean z = userJid != null;
        if (this.A0n.A0S) {
            A0m = getString(R.string.whatsapp_support);
        } else if (A03 == Long.MIN_VALUE) {
            A0m = A0A ? getString(R.string.group_creator_you) : z ? getString(R.string.group_creator_name, ((ChatInfoActivity) this).A09.A0E(this.A0S.A08(this.A0P.A0A(userJid), false))) : null;
        } else {
            long A06 = this.A0a.A06(A03);
            C002301c c002301c = ((ChatInfoActivity) this).A09;
            A0m = A0A ? AnonymousClass029.A0m(c002301c, A06, R.string.group_creator_you_with_time_today, R.string.group_creator_you_with_time_yesterday, R.string.group_creator_you_with_time, new Object[0]) : z ? AnonymousClass029.A0m(c002301c, A06, R.string.group_creator_name_with_time_today, R.string.group_creator_name_with_time_yesterday, R.string.group_creator_name_with_time, c002301c.A0E(this.A0S.A08(this.A0P.A0A(userJid), false))) : AnonymousClass029.A0m(c002301c, A06, R.string.group_create_time_today, R.string.group_create_time_yesterday, R.string.group_create_time, new Object[0]);
        }
        this.A0O.setSubtitleText(A0m);
    }

    public final void A1k() {
        if (this.A0b.A06()) {
            this.A1B.A04(this, this.A0n, 13);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_group_photo_update_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_group_photo_update;
        }
        RequestPermissionActivity.A05(this, R.string.permission_storage_need_write_access_on_group_photo_update_request, i2);
    }

    public final void A1l() {
        C49222Jd c49222Jd = this.A0v;
        if (c49222Jd != null) {
            c49222Jd.A05(true);
        }
        A1V();
        A0m(true);
        C49222Jd c49222Jd2 = new C49222Jd(this.A0a, this.A0I, this.A0P, this.A18, this.A0i, this.A0j, this.A0l, this.A0f, this.A17, this.A0g, this, this.A0n);
        this.A0v = c49222Jd2;
        ((ChatInfoActivity) this).A0J.ARy(c49222Jd2, new Void[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00a1, code lost:
        if (r1 == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1m() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupChatInfo.A1m():void");
    }

    public final void A1n() {
        boolean A1w = A1w();
        View findViewById = findViewById(R.id.group_settings_separator);
        if (findViewById != null) {
            findViewById.setVisibility(A1w ? 0 : 8);
            View findViewById2 = findViewById(R.id.group_settings_layout);
            if (findViewById2 != null) {
                findViewById2.setVisibility(A1w ? 0 : 8);
                C61752wf c61752wf = this.A0y;
                boolean A1x = A1x();
                ImageButton imageButton = c61752wf.A01;
                int i = R.drawable.ic_action_info;
                if (A1x) {
                    i = R.drawable.ic_action_edit_shadow;
                }
                imageButton.setImageResource(i);
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0060, code lost:
        if (r5.getVisibility() == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1o() {
        /*
            r9 = this;
            android.view.View r1 = r9.A04
            r0 = 2131362891(0x7f0a044b, float:1.8345575E38)
            android.view.View r8 = X.C0AT.A0D(r1, r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.view.View r1 = r9.A04
            r0 = 2131362890(0x7f0a044a, float:1.8345573E38)
            android.view.View r7 = X.C0AT.A0D(r1, r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.View r1 = r9.A04
            r0 = 2131363695(0x7f0a076f, float:1.8347206E38)
            android.view.View r5 = X.C0AT.A0D(r1, r0)
            android.view.View r1 = r9.A04
            r0 = 2131361905(0x7f0a0071, float:1.8343576E38)
            android.view.View r6 = X.C0AT.A0D(r1, r0)
            android.view.View r1 = r9.A04
            r0 = 2131362483(0x7f0a02b3, float:1.8344748E38)
            android.view.View r3 = X.C0AT.A0D(r1, r0)
            X.0C8 r1 = r9.A0h
            X.05l r0 = r9.A13
            boolean r0 = r1.A05(r0)
            r4 = 8
            r2 = 0
            if (r0 == 0) goto Lad
            r0 = 2131887381(0x7f120515, float:1.9409367E38)
            r8.setText(r0)
            r0 = 2131231501(0x7f08030d, float:1.8079085E38)
            r7.setImageResource(r0)
            r5.setVisibility(r4)
            r6.setVisibility(r2)
            r3.setVisibility(r2)
        L53:
            android.view.View r0 = r9.A01
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L62
            int r0 = r5.getVisibility()
            r3 = 0
            if (r0 != 0) goto L63
        L62:
            r3 = 1
        L63:
            com.whatsapp.ui.media.MediaCard r1 = r9.A1H
            if (r1 == 0) goto Lc3
            r0 = 8
            if (r3 == 0) goto L6c
            r0 = 0
        L6c:
            r1.setTopShadowVisibility(r0)
            r0 = 2131363206(0x7f0a0586, float:1.8346214E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r3 == 0) goto L81
            android.view.View r0 = r9.A01
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L81
            r4 = 0
        L81:
            r1.setVisibility(r4)
            X.05l r0 = r9.A13
            if (r0 == 0) goto Lac
            X.0ES r0 = r9.A0z
            X.01t r1 = r0.A0U
            r0 = 308(0x134, float:4.32E-43)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto Lac
            X.05l r0 = r9.A13
            java.lang.String r1 = r0.user
            java.lang.String r0 = "-"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lac
            android.view.View r1 = r9.A04
            r0 = 2131362920(0x7f0a0468, float:1.8345634E38)
            android.view.View r0 = X.C0AT.A0D(r1, r0)
            r0.setVisibility(r2)
        Lac:
            return
        Lad:
            r0 = 2131887066(0x7f1203da, float:1.9408729E38)
            r8.setText(r0)
            r0 = 2131231339(0x7f08026b, float:1.8078756E38)
            r7.setImageResource(r0)
            r5.setVisibility(r2)
            r6.setVisibility(r4)
            r3.setVisibility(r4)
            goto L53
        Lc3:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupChatInfo.A1o():void");
    }

    public final void A1p() {
        boolean A05 = this.A0h.A05(this.A13);
        boolean A0h = this.A14.A0h(A1d());
        List A0B = this.A14.A0B(this.A13);
        if (A05) {
            AbstractList abstractList = (AbstractList) A0B;
            if (!abstractList.isEmpty() || A0h) {
                this.A07.setVisibility(0);
                if (A0h) {
                    if (abstractList.isEmpty()) {
                        this.A0F.setText(R.string.contact_info_live_location_description_you_are_sharing);
                        return;
                    } else if (abstractList.size() == 1) {
                        this.A0F.setText(getString(R.string.contact_info_live_location_description_you_and_friend_are_sharing, ((ChatInfoActivity) this).A09.A0E(this.A0S.A08(this.A0P.A0A((AbstractC005302j) abstractList.get(0)), false))));
                        return;
                    } else {
                        this.A0F.setText(getResources().getQuantityString(R.plurals.contact_info_live_location_description_you_and_other_people_are_sharing, abstractList.size(), Integer.valueOf(abstractList.size())));
                        return;
                    }
                }
                this.A0F.setText(getResources().getQuantityString(R.plurals.contact_info_live_location_description, abstractList.size(), Integer.valueOf(abstractList.size())));
                return;
            }
        }
        this.A07.setVisibility(8);
    }

    public final void A1q() {
        C03370Fl A07 = this.A1C.A07(this.A13);
        View findViewById = findViewById(R.id.notifications_info);
        if (findViewById != null) {
            findViewById.setVisibility(A07.A0H ? 0 : 8);
            return;
        }
        throw null;
    }

    public final void A1r() {
        C0HS c0hs = this.A1M;
        if (c0hs != null) {
            c0hs.A05(true);
        }
        C0HS c0hs2 = new C0HS(this.A0W, this, this.A0n) { // from class: X.3Ce
            public final C0LF A00;
            public final C06C A01;
            public final WeakReference A02;

            {
                this.A00 = r2;
                this.A02 = new WeakReference(this);
                this.A01 = r4;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                Context context = (Context) this.A02.get();
                if (context != null) {
                    return this.A00.A02(context, this.A01, 640, 0.0f, false);
                }
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                GroupChatInfo groupChatInfo = (GroupChatInfo) this.A02.get();
                if (groupChatInfo != null) {
                    if (bitmap != null) {
                        groupChatInfo.A1Z(bitmap);
                    } else {
                        groupChatInfo.A1W(R.drawable.avatar_group_large, R.color.avatar_group_large);
                    }
                    if (C04510Kl.A00(groupChatInfo.A1d())) {
                        groupChatInfo.A0A.setVisibility(0);
                    }
                }
            }
        };
        this.A1M = c0hs2;
        ((ChatInfoActivity) this).A0J.ARy(c0hs2, new Void[0]);
    }

    public void A1s(C1M7 c1m7) {
        if (!this.A0h.A05(this.A13)) {
            AUj(R.string.failed_update_photo_not_authorized);
        } else if (this.A0n.A0R) {
            if (((ChatInfoActivity) this).A0K) {
                return;
            }
            Intent intent = new Intent(this, ViewProfilePhoto.class);
            intent.putExtra("jid", C003101m.A07(this.A0n.A02()));
            if (Build.VERSION.SDK_INT >= 21) {
                intent.putExtra("start_transition_status_bar_color", getWindow().getStatusBarColor());
            }
            startActivityForResult(intent, 15, C2HC.A04(this, this.A0B, c1m7.A00(R.string.transition_photo)));
        } else {
            A1k();
        }
    }

    public final void A1t(List list) {
        if (this.A0Y.A05()) {
            AUr(R.string.participant_adding, R.string.register_wait_message);
            this.A16.A06(new C2KD(this, this.A1N, this.A0z, this.A0e, this.A13, list));
            return;
        }
        boolean A02 = C0E7.A02(getApplicationContext());
        int i = R.string.network_required;
        if (A02) {
            i = R.string.network_required_airplane_on;
        }
        this.A0I.A04(i);
        A1g();
    }

    public final void A1u(boolean z) {
        int i = z ? 1 : 0;
        ChatInfoLayout chatInfoLayout = this.A0O;
        Integer valueOf = Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material));
        if (valueOf != null) {
            chatInfoLayout.A03(valueOf.intValue(), getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material) * i);
            return;
        }
        throw null;
    }

    public final void A1v(boolean z) {
        C06C c06c = this.A0o;
        if (c06c == null) {
            this.A0I.A07(R.string.group_add_contact_failed, 0);
            return;
        }
        C2MS c2ms = this.A1J;
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            Intent A01 = c2ms.A01(c06c, (AbstractC005302j) A03, z);
            A01.setFlags(524288);
            try {
                startActivityForResult(A01, 10);
                this.A1I.A02(z, 8);
                return;
            } catch (ActivityNotFoundException unused) {
                C002701i.A19(this, 5);
                return;
            }
        }
        throw null;
    }

    public final boolean A1w() {
        return this.A0h.A05(this.A13) && this.A0h.A06(this.A13);
    }

    public final boolean A1x() {
        boolean A05 = this.A0h.A05(this.A13);
        boolean A06 = this.A0h.A06(this.A13);
        if (A05) {
            return A06 || !this.A0n.A0Z;
        }
        return false;
    }

    @Override // X.C2H7
    public void AOI(UserJid userJid) {
        A12(R.string.revoking_invite);
        ((ChatInfoActivity) this).A0J.ARy(new C68533Kg(this.A0I, this.A16, this, this.A13, userJid), new Void[0]);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, android.app.Activity
    public void finishAfterTransition() {
        if (C2HC.A00) {
            this.A04.setTransitionName(null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A04);
            transitionSet.addTransition(slide);
            Slide slide2 = new Slide(80);
            slide2.addTarget(this.A0D);
            transitionSet.addTransition(slide2);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    public /* synthetic */ void lambda$onCreate$1791$GroupChatInfo(View view) {
        if (this.A0h.A05(this.A13)) {
            if (!this.A0h.A06(this.A13) && this.A0n.A0Z) {
                AUj(R.string.failed_update_group_info_not_admin);
                return;
            }
            C002701i.A19(this, 7);
            this.A0c.A03(this.A13);
        }
    }

    public /* synthetic */ void lambda$onCreate$1792$GroupChatInfo(View view) {
        A1T();
    }

    public /* synthetic */ void lambda$updateEphemeralMessagesSetting$1799$GroupChatInfo(View view) {
        if (!A1w() && (!((ActivityC02290Ap) this).A0I.A0C(432) || !A1x())) {
            Toast.makeText(this, (int) R.string.ephemeral_toast_admin_only, 0).show();
            return;
        }
        C011005l c011005l = this.A13;
        int i = this.A0n.A00;
        Intent intent = new Intent(this, ChangeEphemeralSettingActivity.class);
        intent.putExtra("jid", c011005l.getRawString());
        intent.putExtra("current_setting", i);
        startActivity(intent);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            this.A0X.A06();
            this.A1I.A00();
        } else if (i == 151) {
            if (i2 != -1) {
                return;
            }
            this.A0T.A01(this.A0n);
            A1r();
            A1k();
        } else if (i == 16) {
            A1q();
        } else if (i != 17) {
            switch (i) {
                case 12:
                    if (i2 != -1) {
                        return;
                    }
                    A1t(C003101m.A0F(UserJid.class, intent.getStringArrayListExtra("contacts")));
                    return;
                case 13:
                    if (i2 != -1) {
                        return;
                    }
                    if (intent != null && intent.getBooleanExtra("is_reset", false)) {
                        this.A0Q.A04(A1d());
                        this.A0A.setVisibility(0);
                        this.A1B.A06(this.A0n);
                        return;
                    }
                    this.A1B.A05(this, intent, 14, this);
                    return;
                case 14:
                    this.A1B.A03().delete();
                    if (i2 == -1) {
                        this.A0Q.A04(A1d());
                        if (!this.A1B.A09(this.A0n)) {
                            return;
                        }
                        this.A0A.setVisibility(0);
                        return;
                    } else if (i2 != 0 || intent == null) {
                        return;
                    } else {
                        CropImage.A00(this.A1B.A02, intent, this);
                        return;
                    }
                default:
                    return;
            }
        } else if (i2 == 0) {
            InviteGroupParticipantsActivity.A01(this, ((ActivityC02290Ap) this).A04, intent, 17).A04();
        } else if (i2 != -1) {
        } else {
            A1l();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C0BA A06 = A0N().A06(R.id.search_container);
        if (A06 instanceof GroupParticipantsSearchFragment) {
            ((GroupParticipantsSearchFragment) A06).A0z();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        this.A0o = ((C61732wd) ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).A05;
        int itemId = menuItem.getItemId();
        C06C c06c = this.A0o;
        if (c06c != null) {
            switch (itemId) {
                case 0:
                    if (c06c.A08 != null) {
                        ContactInfoActivity.A03(c06c, this, null);
                        return true;
                    }
                    break;
                case 1:
                    ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, c06c));
                    return true;
                case 2:
                    A1v(true);
                    return true;
                case 3:
                    A1v(false);
                    return true;
                case 4:
                    if (c06c.A03(UserJid.class) != null) {
                        Jid A03 = this.A0o.A03(UserJid.class);
                        if (A03 != null) {
                            startActivity(ContactInfoActivity.A00((UserJid) A03, this), null);
                            return true;
                        }
                        throw null;
                    }
                    Log.e("group-chat-info/view-business-profile/error no-resource");
                    return true;
                case 5:
                    C002701i.A19(this, 6);
                    return true;
                case 6:
                    final C61742we c61742we = this.A0w;
                    Jid A032 = c06c.A03(UserJid.class);
                    if (A032 != null) {
                        if (c61742we.A05.A05()) {
                            int A06 = c61742we.A02.A06();
                            C0C8 c0c8 = c61742we.A07;
                            C011005l c011005l = c61742we.A09;
                            if (A06 > c0c8.A01(c011005l).A06().size()) {
                                c61742we.A00.AUr(R.string.participant_adding, R.string.register_wait_message);
                                c61742we.A0A.A07(new C0TD(c61742we.A0B, c61742we.A08, c61742we.A06, c011005l, Collections.singletonList(A032)) { // from class: X.3Kh
                                    @Override // X.C0TD
                                    public void A01() {
                                        c61742we.A00.A0y();
                                    }
                                });
                                return true;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put(A032, 419);
                            C0ES.A02(3003, hashMap);
                            return true;
                        }
                        C018508q c018508q = c61742we.A01;
                        boolean A02 = C0E7.A02(c61742we.A00.getApplicationContext());
                        int i = R.string.network_required;
                        if (A02) {
                            i = R.string.network_required_airplane_on;
                        }
                        c018508q.A07(i, 0);
                        return true;
                    }
                    throw null;
                case 7:
                    final C61742we c61742we2 = this.A0w;
                    Jid A033 = c06c.A03(UserJid.class);
                    if (A033 != null) {
                        UserJid userJid = (UserJid) A033;
                        if (c61742we2.A02.A0E(C01C.A0z) && c61742we2.A07.A08(c61742we2.A09, userJid)) {
                            c61742we2.A00.AUl(0, R.string.error_removing_admin_406, c61742we2.A04.A08(c61742we2.A03.A0A(userJid), false));
                            return true;
                        } else if (!c61742we2.A05.A05()) {
                            C018508q c018508q2 = c61742we2.A01;
                            boolean A022 = C0E7.A02(c61742we2.A00);
                            int i2 = R.string.network_required;
                            if (A022) {
                                i2 = R.string.network_required_airplane_on;
                            }
                            c018508q2.A07(i2, 0);
                            return true;
                        } else {
                            c61742we2.A00.AUr(R.string.participant_removing, R.string.register_wait_message);
                            c61742we2.A0A.A09(new C0TD(c61742we2.A0B, c61742we2.A08, c61742we2.A06, c61742we2.A09, Collections.singletonList(userJid)) { // from class: X.3Ki
                                @Override // X.C0TD
                                public void A01() {
                                    c61742we2.A00.A0y();
                                }
                            });
                            return true;
                        }
                    }
                    throw null;
                case 8:
                    Intent intent = new Intent(this, IdentityVerificationActivity.class);
                    intent.putExtra("jid", C003101m.A07(this.A0o.A03(UserJid.class)));
                    startActivity(intent);
                    return true;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, X.3Cf] */
    @Override // X.AbstractActivityC49232Jf, com.whatsapp.chatinfo.ChatInfoActivity, X.C2IC, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        UserJid nullable;
        super.onCreate(bundle);
        this.A1I = new C52762bH(this.A0s, this.A0L, this.A0Z, this.A0b);
        A0S();
        setTitle(R.string.group_info);
        ((ChatInfoActivity) this).A0F.A01 = 3;
        this.A0U = this.A0V.A04(this);
        setContentView(R.layout.groupchat_info);
        this.A0O = (ChatInfoLayout) findViewById(R.id.content);
        View findViewById = findViewById(R.id.toolbar);
        if (findViewById != null) {
            Toolbar toolbar = (Toolbar) findViewById;
            toolbar.setTitle("");
            toolbar.A09();
            A0k(toolbar);
            A0c().A0L(true);
            toolbar.setNavigationIcon(new C0We(((ChatInfoActivity) this).A09, C02160Ac.A03(this, R.drawable.ic_back_shadow)));
            this.A0D = A1P();
            View inflate = getLayoutInflater().inflate(R.layout.groupchat_info_header, (ViewGroup) this.A0D, false);
            this.A05 = inflate;
            C0AT.A0V(inflate, 2);
            String str = null;
            this.A0D.addHeaderView(this.A05, null, false);
            this.A04 = findViewById(R.id.header);
            this.A1H = (MediaCard) findViewById(R.id.media_card_view);
            this.A09 = findViewById(R.id.participants_card);
            TextView textView = (TextView) findViewById(R.id.participants_title);
            this.A0H = textView;
            C0AT.A0M(textView);
            this.A0G = (TextView) findViewById(R.id.participants_info);
            this.A06 = findViewById(R.id.invites_card);
            this.A0E = (TextView) findViewById(R.id.invites_info);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.invites_recycler_view);
            this.A0O.A01();
            View inflate2 = getLayoutInflater().inflate(R.layout.groupchat_info_footer, (ViewGroup) this.A0D, false);
            this.A02 = inflate2;
            AnonymousClass088.A1T(inflate2);
            this.A0D.addFooterView(this.A02, null, false);
            this.A0C = new LinearLayout(this);
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            this.A0C.setPadding(0, 0, 0, point.y);
            C0AT.A0V(this.A0C, 2);
            this.A0D.addFooterView(this.A0C, null, false);
            C011005l A04 = C011005l.A04(getIntent().getStringExtra("gid"));
            this.A13 = A04;
            if (A04 != null) {
                this.A0n = this.A0P.A0A(A04);
                this.A1X.clear();
                C1M7 c1m7 = new C1M7(this);
                this.A06.setVisibility(8);
                this.A12 = new C49262Ji(this, this.A0S, ((ChatInfoActivity) this).A09, c1m7, this.A1E, this.A0U);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                linearLayoutManager.A1Y(1);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(this.A12);
                C61722wc c61722wc = new C61722wc(this);
                this.A0u = c61722wc;
                if (bundle != null) {
                    c61722wc.A03 = bundle.getBoolean("group_participants_list_expanded", false);
                }
                A1m();
                this.A0D.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2wN
                    {
                        GroupChatInfo.this = this;
                    }

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                        GroupChatInfo.this.onListItemClicked(view);
                    }
                });
                this.A0n.toString();
                A1u(this.A0h.A06(this.A13));
                View findViewById2 = findViewById(R.id.add_participant_layout);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(this.A0h.A06(this.A13) ? 0 : 8);
                    findViewById2.findViewById(R.id.add_participant_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 34));
                    findViewById2.findViewById(R.id.invite_via_link_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 35));
                    View findViewById3 = findViewById(R.id.participants_search);
                    if (findViewById3 != null) {
                        findViewById3.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 25));
                        View findViewById4 = findViewById(R.id.live_location_card);
                        if (findViewById4 != null) {
                            this.A07 = findViewById4;
                            View findViewById5 = findViewById(R.id.live_location_info);
                            if (findViewById5 != null) {
                                this.A0F = (TextView) findViewById5;
                                C0EG c0eg = this.A16;
                                C011005l c011005l = this.A13;
                                if (!this.A0n.A0A() && !TextUtils.isEmpty(this.A0n.A0J)) {
                                    str = "interactive";
                                }
                                c0eg.A0F(c011005l, str);
                                A1r();
                                A1l();
                                A1h();
                                View findViewById6 = findViewById(R.id.starred_messages_layout);
                                if (findViewById6 != null) {
                                    findViewById6.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 26));
                                    View findViewById7 = findViewById(R.id.payment_transactions_layout);
                                    if (findViewById7 != null) {
                                        findViewById7.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 27));
                                        View findViewById8 = findViewById(R.id.exit_group_btn);
                                        if (findViewById8 != null) {
                                            findViewById8.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 28));
                                            View findViewById9 = findViewById(R.id.report_group_btn);
                                            if (findViewById9 != null) {
                                                findViewById9.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 29));
                                                InterfaceC72193Za interfaceC72193Za = new InterfaceC72193Za() { // from class: X.3CG
                                                    {
                                                        GroupChatInfo.this = this;
                                                    }

                                                    @Override // X.InterfaceC72193Za
                                                    public final void AIa() {
                                                        GroupChatInfo groupChatInfo = GroupChatInfo.this;
                                                        Intent intent = new Intent(groupChatInfo, MediaGalleryActivity.class);
                                                        intent.putExtra("jid", groupChatInfo.A13.getRawString());
                                                        groupChatInfo.startActivity(intent);
                                                    }
                                                };
                                                MediaCard mediaCard = this.A1H;
                                                if (mediaCard != null) {
                                                    mediaCard.setSeeMoreClickListener(interfaceC72193Za);
                                                    ImageView imageView = (ImageView) findViewById(R.id.picture);
                                                    this.A0B = imageView;
                                                    AnonymousClass088.A1V(imageView, R.string.action_open_image);
                                                    this.A0O.setOnPhotoClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, c1m7, 29));
                                                    this.A0A = findViewById(R.id.photo_progress);
                                                    this.A0D.setAdapter((ListAdapter) this.A0u);
                                                    registerForContextMenu(this.A0D);
                                                    this.A0n.toString();
                                                    A1j();
                                                    ImageButton imageButton = (ImageButton) findViewById(R.id.change_subject_btn);
                                                    this.A0y = new C61752wf(imageButton, findViewById(R.id.change_subject_progress), this.A13, this, this.A0I, this.A1N, this.A16, this.A0L, ((ChatInfoActivity) this).A09, this.A0S, this.A0P, this.A0z, this.A0Y, this.A0e, this.A0h);
                                                    imageButton.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 33));
                                                    AnonymousClass088.A1V(imageButton, R.string.accessibility_action_click_change_group_subject);
                                                    this.A0w = new C61742we(this.A0Y, this.A16, this.A0I, this.A0L, this.A0z, this.A1N, this.A0e, this.A0h, this.A0P, this.A0S, this, this.A13);
                                                    this.A1G = (ReadMoreTextView) findViewById(R.id.group_description);
                                                    if (getIntent().getBooleanExtra("show_description", false)) {
                                                        this.A1G.setLinesLimit(0);
                                                        this.A0c.A03(this.A13);
                                                    }
                                                    ReadMoreTextView readMoreTextView = this.A1G;
                                                    readMoreTextView.setAccessibilityHelper(new C02780Cv(this.A0Z, readMoreTextView));
                                                    this.A1G.A03 = new C3ZD() { // from class: X.3CH
                                                        {
                                                            GroupChatInfo.this = this;
                                                        }

                                                        @Override // X.C3ZD
                                                        public final boolean AIV() {
                                                            GroupChatInfo groupChatInfo = GroupChatInfo.this;
                                                            groupChatInfo.A0c.A03(groupChatInfo.A13);
                                                            return false;
                                                        }
                                                    };
                                                    this.A03 = findViewById(R.id.has_description_view);
                                                    this.A08 = findViewById(R.id.no_description_view);
                                                    this.A00 = findViewById(R.id.change_description_progress);
                                                    this.A01 = findViewById(R.id.description_card);
                                                    A1i();
                                                    this.A01.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 11));
                                                    A1o();
                                                    View findViewById10 = findViewById(R.id.live_location_card);
                                                    if (findViewById10 != null) {
                                                        findViewById10.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 30));
                                                        this.A14.A0X(this.A1V);
                                                        this.A14.A0Y(this.A1W);
                                                        A1n();
                                                        View findViewById11 = findViewById(R.id.group_settings_layout);
                                                        if (findViewById11 != null) {
                                                            findViewById11.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 31));
                                                            A1q();
                                                            View findViewById12 = findViewById(R.id.notifications_layout);
                                                            if (findViewById12 != null) {
                                                                findViewById12.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 32));
                                                                View findViewById13 = findViewById(R.id.media_visibility_layout);
                                                                if (findViewById13 != null) {
                                                                    findViewById13.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 10));
                                                                    A1b(this.A1C.A07(this.A13), C0AT.A0D(((ActivityC02290Ap) this).A04, R.id.mute_layout), this.A1P);
                                                                    A1d();
                                                                    ?? r1 = new C00T(this.A13, new C3CA(this)) { // from class: X.3Cf
                                                                        public final C3CA A00;
                                                                        public final C011005l A01;

                                                                        {
                                                                            this.A01 = r1;
                                                                            this.A00 = r2;
                                                                        }

                                                                        @Override // X.C00T
                                                                        public void A08(AnonymousClass092 anonymousClass092, int i) {
                                                                            if (anonymousClass092 != null && this.A01.equals(anonymousClass092.A0n.A00) && C0DB.A0C(anonymousClass092.A0m) && i == 3) {
                                                                                this.A00.A00.A1l();
                                                                            } else if (!A0D(anonymousClass092)) {
                                                                            } else {
                                                                                this.A00.A00.A1l();
                                                                            }
                                                                        }

                                                                        @Override // X.C00T
                                                                        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
                                                                            if (collection != null && !collection.isEmpty()) {
                                                                                Iterator it = collection.iterator();
                                                                                while (it.hasNext()) {
                                                                                    if (this.A01.equals(((AnonymousClass092) it.next()).A0n.A00)) {
                                                                                        this.A00.A00.A1l();
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            } else if (abstractC005302j == null || this.A01.equals(abstractC005302j)) {
                                                                                this.A00.A00.A1l();
                                                                            }
                                                                        }

                                                                        @Override // X.C00T
                                                                        public void A0B(Collection collection, Map map, Map map2) {
                                                                            Iterator it = collection.iterator();
                                                                            while (it.hasNext()) {
                                                                                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                                                                                if (this.A01.equals(anonymousClass092.A0n.A00) && (C0DB.A0C(anonymousClass092.A0m) || anonymousClass092.A0j)) {
                                                                                    this.A00.A00.A1l();
                                                                                    return;
                                                                                } else if (A0D(anonymousClass092)) {
                                                                                    this.A00.A00.A1l();
                                                                                }
                                                                            }
                                                                        }

                                                                        @Override // X.C00T
                                                                        public void A0C(AnonymousClass092 anonymousClass092, int i) {
                                                                            if (anonymousClass092 != null) {
                                                                                C011005l c011005l2 = this.A01;
                                                                                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                                                                                if (c011005l2.equals(anonymousClass094.A00) && !anonymousClass094.A02 && anonymousClass092.A0m == 5) {
                                                                                    this.A00.A00.A1l();
                                                                                    return;
                                                                                }
                                                                            }
                                                                            if (!A0D(anonymousClass092)) {
                                                                                return;
                                                                            }
                                                                            this.A00.A00.A1l();
                                                                        }

                                                                        public final boolean A0D(AnonymousClass092 anonymousClass092) {
                                                                            if ((anonymousClass092 instanceof C04570Ky) && anonymousClass092.A0n.A02) {
                                                                                return this.A01.equals(((C04570Ky) anonymousClass092).A01);
                                                                            }
                                                                            return false;
                                                                        }
                                                                    };
                                                                    this.A0x = r1;
                                                                    this.A0k.A01(r1);
                                                                    this.A0Q.A01(this.A1R);
                                                                    this.A0N.A01(this.A1Q);
                                                                    this.A0e.A00(this.A1S);
                                                                    this.A11.A01(this.A1U);
                                                                    if (bundle != null && (nullable = UserJid.getNullable(bundle.getString("selected_jid"))) != null) {
                                                                        this.A0o = this.A0P.A0A(nullable);
                                                                    }
                                                                    if (Build.VERSION.SDK_INT >= 21) {
                                                                        if (!getIntent().getBooleanExtra("circular_transition", false)) {
                                                                            View findViewById14 = findViewById(R.id.picture);
                                                                            if (findViewById14 != null) {
                                                                                findViewById14.setTransitionName(c1m7.A00(R.string.transition_photo));
                                                                            } else {
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            this.A04.setTransitionName(c1m7.A00(R.string.transition_photo));
                                                                        }
                                                                    }
                                                                    this.A10.A00.add(this.A1T);
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
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            Log.e("group_info/on_create: exiting due to null gid");
            finish();
            return;
        }
        throw null;
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        C06C c06c = ((C61732wd) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView.getTag()).A05;
        if (c06c == null) {
            return;
        }
        UserJid userJid = (UserJid) c06c.A03(UserJid.class);
        if (userJid != null) {
            if (this.A1X.containsKey(userJid)) {
                return;
            }
            String A04 = this.A0S.A04(c06c);
            contextMenu.add(0, 1, 0, getString(R.string.message_contact_name, A04));
            if (c06c.A08 == null) {
                contextMenu.add(0, 2, 0, R.string.add_contact);
                contextMenu.add(0, 3, 0, R.string.add_exist);
            } else if (c06c.A0B()) {
                contextMenu.add(0, 4, 0, R.string.view_business_profile);
            } else {
                contextMenu.add(0, 0, 0, getString(R.string.view_contact_name, A04));
            }
            if (this.A0h.A06(this.A13)) {
                if (!this.A0h.A07(this.A13, userJid)) {
                    contextMenu.add(0, 6, 0, R.string.make_contact_group_admin);
                } else if (this.A0L.A0E(C01C.A0z)) {
                    contextMenu.add(0, 7, 0, R.string.dismiss_contact_group_admin);
                }
                contextMenu.add(0, 5, 0, getString(R.string.remove_contact_name_from_group, A04));
            }
            contextMenu.add(0, 8, 0, R.string.verify_identity);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            return this.A1K.A01(this, new InterfaceC53622hF() { // from class: X.3CV
                {
                    GroupChatInfo.this = this;
                }

                @Override // X.InterfaceC53622hF
                public void AMJ() {
                    C002701i.A18(GroupChatInfo.this, 1);
                }

                @Override // X.InterfaceC53622hF
                public void AN6(boolean z) {
                    Log.i("group_info/onclick_deleteGroup");
                    final GroupChatInfo groupChatInfo = GroupChatInfo.this;
                    if (!groupChatInfo.A0h.A05(groupChatInfo.A13)) {
                        ((ChatInfoActivity) groupChatInfo).A0J.ARy(new C35O(groupChatInfo, groupChatInfo.A13, groupChatInfo.A0M, z), new Void[0]);
                    } else if (groupChatInfo.A0Y.A05()) {
                        groupChatInfo.AUr(R.string.participant_removing, R.string.register_wait_message);
                        groupChatInfo.A16.A08(new C0TD(groupChatInfo.A1N, groupChatInfo.A0z, groupChatInfo.A0e, groupChatInfo.A13) { // from class: X.3Kd
                            @Override // X.C0TD
                            public void A01() {
                                groupChatInfo.A0y();
                            }
                        });
                    } else {
                        groupChatInfo.A0I.A07(R.string.failed_to_leave_group, 0);
                    }
                }
            }, 2, getString(R.string.delete_group_dialog_title, this.A0S.A08(this.A0n, false))).A00();
        } else if (i == 3) {
            String string = getString(R.string.end_group_dialog_title, this.A0S.A08(this.A0n, false));
            C019208x c019208x = new C019208x(this);
            CharSequence A0g = C002701i.A0g(string, this, ((ActivityC02290Ap) this).A0H);
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = A0g;
            c019308y.A0J = true;
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2wP
                {
                    GroupChatInfo.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(GroupChatInfo.this, 3);
                }
            });
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2wQ
                {
                    GroupChatInfo.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    final GroupChatInfo groupChatInfo = GroupChatInfo.this;
                    Log.i("group_info/onclick_endGroup");
                    if (groupChatInfo.A0Y.A05()) {
                        groupChatInfo.AUr(R.string.participant_removing, R.string.register_wait_message);
                        groupChatInfo.A0e.A07(groupChatInfo.A13, true);
                        C0EG c0eg = groupChatInfo.A16;
                        C0TD c0td = new C0TD(groupChatInfo.A1N, groupChatInfo.A0z, groupChatInfo.A0e, groupChatInfo.A13) { // from class: X.3Ke
                            @Override // X.C0TD
                            public void A01() {
                                groupChatInfo.A0y();
                            }
                        };
                        if (c0eg.A02.A06) {
                            Log.i("sendmethods/sendEndGroup");
                            c0eg.A07.A09(Message.obtain(null, 0, 93, 0, c0td));
                        }
                        groupChatInfo.A1e();
                        return;
                    }
                    groupChatInfo.A0I.A07(R.string.failed_to_leave_group, 0);
                }
            });
            return c019208x.A00();
        } else if (i == 4) {
            C455822q c455822q = this.A0t;
            C018508q c018508q = this.A0I;
            C2MB c2mb = ((ActivityC02270An) this).A0F;
            AbstractC000600i abstractC000600i = ((ActivityC02290Ap) this).A08;
            C40081rY c40081rY = ((ActivityC02290Ap) this).A0H;
            C43871y8 c43871y8 = ((ActivityC02290Ap) this).A0G;
            C47682Ce c47682Ce = this.A0q;
            C02E c02e = this.A0Z;
            C002301c c002301c = ((ChatInfoActivity) this).A09;
            C2MI c2mi = this.A0r;
            C000500h c000500h = ((ActivityC02290Ap) this).A0F;
            C02O c02o = this.A19;
            C018708s c018708s = this.A0S;
            C05W c05w = this.A0P;
            Jid A03 = this.A0n.A03(C011005l.class);
            if (A03 != null) {
                C06C A08 = c05w.A08((AbstractC005302j) A03);
                if (A08 != null) {
                    String A082 = c018708s.A08(A08, false);
                    final C61752wf c61752wf = this.A0y;
                    return new DialogC54592j1(this, c455822q, c018508q, c2mb, abstractC000600i, c40081rY, c43871y8, c47682Ce, c02e, c002301c, c2mi, c000500h, c02o, 4, R.string.edit_group_subject_dialog_title, A082, new InterfaceC54602j2() { // from class: X.3CM
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x001b, code lost:
                            if (r3.A0Z == false) goto L25;
                         */
                        @Override // X.InterfaceC54602j2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void AR9(java.lang.String r12) {
                            /*
                                r11 = this;
                                X.2wf r5 = r1
                                X.05W r0 = r5.A05
                                X.05l r9 = r5.A0C
                                X.06C r3 = r0.A0A(r9)
                                X.0C8 r0 = r5.A0A
                                boolean r2 = r0.A05(r9)
                                boolean r0 = r0.A06(r9)
                                r8 = 1
                                r7 = 0
                                if (r0 != 0) goto L1d
                                boolean r1 = r3.A0Z
                                r0 = 1
                                if (r1 != 0) goto L1e
                            L1d:
                                r0 = 0
                            L1e:
                                if (r2 != 0) goto L29
                                X.0Ap r1 = r5.A02
                                r0 = 2131887449(0x7f120559, float:1.9409505E38)
                                r1.AUj(r0)
                            L28:
                                return
                            L29:
                                if (r0 == 0) goto L34
                                X.0Ap r1 = r5.A02
                                r0 = 2131887448(0x7f120558, float:1.9409503E38)
                                r1.AUj(r0)
                                return
                            L34:
                                X.08s r0 = r5.A06
                                java.lang.String r0 = r0.A08(r3, r7)
                                r10 = r12
                                boolean r0 = android.text.TextUtils.equals(r0, r12)
                                if (r0 != 0) goto L28
                                X.0E7 r0 = r5.A07
                                boolean r0 = r0.A05()
                                if (r0 == 0) goto L9d
                                int r2 = X.C43981yK.A01(r12)
                                X.01B r1 = r5.A04
                                X.039 r0 = X.C01C.A3z
                                int r0 = r1.A07(r0)
                                if (r2 > r0) goto L85
                                android.view.View r0 = r5.A00
                                r0.setVisibility(r7)
                                android.widget.ImageButton r1 = r5.A01
                                r0 = 8
                                r1.setVisibility(r0)
                                java.lang.String r1 = "group_info/change subject:"
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                r0.<init>(r1)
                                r0.append(r12)
                                java.lang.String r0 = r0.toString()
                                com.whatsapp.util.Log.i(r0)
                                X.0EG r0 = r5.A0D
                                X.1uq r6 = r5.A0E
                                X.0ES r7 = r5.A0B
                                X.0Fh r8 = r5.A09
                                X.3Kj r4 = new X.3Kj
                                r4.<init>(r5, r6, r7, r8, r9, r10)
                                r0.A0B(r4)
                                return
                            L85:
                                X.08q r6 = r5.A03
                                X.01c r5 = r5.A08
                                r4 = 2131755221(0x7f1000d5, float:1.9141315E38)
                                long r2 = (long) r0
                                java.lang.Object[] r1 = new java.lang.Object[r8]
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                r1[r7] = r0
                                java.lang.String r0 = r5.A0A(r4, r2, r1)
                                r6.A0E(r0, r7)
                                return
                            L9d:
                                X.08q r1 = r5.A03
                                r0 = 2131888429(0x7f12092d, float:1.9411493E38)
                                r1.A07(r0, r7)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C3CM.AR9(java.lang.String):void");
                        }
                    }, this.A0L.A07(C01C.A3z), R.string.small_case_subject, R.string.no_emtpy_subject, 16385);
                }
                throw null;
            }
            throw null;
        } else if (i == 5) {
            Log.w("groupchatinfo/add existing contact: activity not found, probably tablet");
            C019208x c019208x2 = new C019208x(this);
            c019208x2.A02(R.string.activity_not_found);
            c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2wM
                {
                    GroupChatInfo.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(GroupChatInfo.this, 5);
                }
            });
            return c019208x2.A00();
        } else if (i != 6) {
            if (i != 7) {
                return super.onCreateDialog(i);
            }
            int A07 = this.A0L.A07(C01C.A35);
            DialogC54592j1 dialogC54592j1 = new DialogC54592j1(this, this.A0t, this.A0I, ((ActivityC02270An) this).A0F, ((ActivityC02290Ap) this).A08, ((ActivityC02290Ap) this).A0H, ((ActivityC02290Ap) this).A0G, this.A0q, this.A0Z, ((ChatInfoActivity) this).A09, this.A0r, ((ActivityC02290Ap) this).A0F, this.A19, 7, R.string.edit_group_description_dialog_title, this.A0n.A0B.A02, new InterfaceC54602j2() { // from class: X.3CL
                {
                    GroupChatInfo.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x001b, code lost:
                    if (r9.A0n.A0Z == false) goto L26;
                 */
                @Override // X.InterfaceC54602j2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void AR9(java.lang.String r13) {
                    /*
                        r12 = this;
                        com.whatsapp.group.GroupChatInfo r9 = com.whatsapp.group.GroupChatInfo.this
                        X.0C8 r1 = r9.A0h
                        X.05l r0 = r9.A13
                        boolean r4 = r1.A05(r0)
                        X.0C8 r1 = r9.A0h
                        X.05l r0 = r9.A13
                        boolean r0 = r1.A06(r0)
                        r7 = 1
                        r2 = 0
                        if (r0 != 0) goto L1d
                        X.06C r0 = r9.A0n
                        boolean r0 = r0.A0Z
                        r3 = 1
                        if (r0 != 0) goto L1e
                    L1d:
                        r3 = 0
                    L1e:
                        java.lang.String r1 = "\n\\s*\n\\s*[\n\\s]+"
                        java.lang.String r0 = "\n\n"
                        java.lang.String r11 = r13.replaceAll(r1, r0)
                        if (r4 != 0) goto L2f
                        r0 = 2131887449(0x7f120559, float:1.9409505E38)
                        r9.AUj(r0)
                    L2e:
                        return
                    L2f:
                        if (r3 == 0) goto L38
                        r0 = 2131887448(0x7f120558, float:1.9409503E38)
                        r9.AUj(r0)
                        return
                    L38:
                        X.06C r0 = r9.A0n
                        X.0Kb r0 = r0.A0B
                        java.lang.String r0 = r0.A02
                        boolean r0 = android.text.TextUtils.equals(r0, r11)
                        if (r0 != 0) goto L2e
                        X.0E7 r0 = r9.A0Y
                        boolean r0 = r0.A05()
                        if (r0 == 0) goto L8c
                        int r3 = X.C43981yK.A01(r11)
                        X.01B r1 = r9.A0L
                        X.039 r0 = X.C01C.A35
                        int r6 = r1.A07(r0)
                        if (r3 > r6) goto L73
                        X.01k r1 = r9.A0J
                        X.012 r4 = r9.A0a
                        X.08q r5 = r9.A0I
                        X.02L r6 = r9.A0J
                        X.0EG r7 = r9.A16
                        X.0Fh r8 = r9.A0e
                        X.06C r10 = r9.A0n
                        X.3Kf r3 = new X.3Kf
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                        java.lang.Void[] r0 = new java.lang.Void[r2]
                        r1.ARy(r3, r0)
                        return
                    L73:
                        X.08q r5 = r9.A0I
                        android.content.res.Resources r4 = r9.getResources()
                        r3 = 2131755039(0x7f10001f, float:1.9140946E38)
                        java.lang.Object[] r1 = new java.lang.Object[r7]
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                        r1[r2] = r0
                        java.lang.String r0 = r4.getQuantityString(r3, r6, r1)
                        r5.A0E(r0, r2)
                        return
                    L8c:
                        X.08q r1 = r9.A0I
                        r0 = 2131888428(0x7f12092c, float:1.9411491E38)
                        r1.A07(r0, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C3CL.AR9(java.lang.String):void");
                }
            }, A07, R.string.description_hint, 0, 147457);
            dialogC54592j1.A05 = true;
            dialogC54592j1.A00 = A07 / 10;
            dialogC54592j1.A03 = getString(R.string.group_description_helper);
            return dialogC54592j1;
        } else {
            C06C c06c = this.A0o;
            if (c06c != null) {
                String string2 = getString(R.string.remove_participant_dialog_title, this.A0S.A08(c06c, false), this.A0S.A08(this.A0n, false));
                C019208x c019208x3 = new C019208x(this);
                CharSequence A0g2 = C002701i.A0g(string2, this, ((ActivityC02290Ap) this).A0H);
                C019308y c019308y2 = c019208x3.A01;
                c019308y2.A0E = A0g2;
                c019308y2.A0J = true;
                c019208x3.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2wO
                    {
                        GroupChatInfo.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C002701i.A18(GroupChatInfo.this, 6);
                    }
                });
                c019208x3.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2wT
                    {
                        GroupChatInfo.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        final GroupChatInfo groupChatInfo = GroupChatInfo.this;
                        C002701i.A18(groupChatInfo, 6);
                        UserJid userJid = (UserJid) groupChatInfo.A0o.A03(UserJid.class);
                        if (groupChatInfo.A1X.containsKey(userJid)) {
                            C0ES c0es = groupChatInfo.A0z;
                            C011005l c011005l = groupChatInfo.A13;
                            if (c0es != null) {
                                c0es.A0E(c011005l, Collections.singletonList(userJid));
                                c0es.A05.A02.post(new RunnableEBaseShape2S0200000_I0_2(c0es, c011005l, 25));
                                groupChatInfo.A1g();
                                return;
                            }
                            throw null;
                        } else if (groupChatInfo.A0L.A0E(C01C.A0z) && groupChatInfo.A0h.A08(groupChatInfo.A13, userJid)) {
                            groupChatInfo.AUl(0, R.string.error_removing_participant_406, groupChatInfo.A0S.A08(groupChatInfo.A0P.A0A(userJid), false));
                        } else if (!groupChatInfo.A0Y.A05()) {
                            C018508q c018508q2 = groupChatInfo.A0I;
                            boolean A02 = C0E7.A02(groupChatInfo.getApplicationContext());
                            int i3 = R.string.network_required;
                            if (A02) {
                                i3 = R.string.network_required_airplane_on;
                            }
                            c018508q2.A04(i3);
                            groupChatInfo.A1g();
                        } else {
                            groupChatInfo.AUr(R.string.participant_removing, R.string.register_wait_message);
                            groupChatInfo.A16.A0A(new C0TD(groupChatInfo.A1N, groupChatInfo.A0z, groupChatInfo.A0e, groupChatInfo.A13, Collections.singletonList(userJid)) { // from class: X.3Kc
                                @Override // X.C0TD
                                public void A01() {
                                    groupChatInfo.A0y();
                                }
                            });
                        }
                    }
                });
                return c019208x3.A00();
            }
            return super.onCreateDialog(i);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0h.A06(this.A13)) {
            menu.add(0, 1, 0, R.string.add_paticipants).setIcon(R.drawable.ic_action_add_person_shadow).setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C41461tx c41461tx = this.A14;
        c41461tx.A0X.remove(this.A1V);
        C41461tx c41461tx2 = this.A14;
        c41461tx2.A0Y.remove(this.A1W);
        C66733Cf c66733Cf = this.A0x;
        if (c66733Cf != null) {
            this.A0k.A00(c66733Cf);
        }
        this.A0Q.A00(this.A1R);
        this.A0N.A00(this.A1Q);
        this.A0e.A01(this.A1S);
        this.A0U.A00();
        C456823b c456823b = this.A10;
        c456823b.A00.remove(this.A1T);
        this.A11.A00(this.A1U);
    }

    public void onListItemClicked(View view) {
        C06C c06c = ((C61732wd) view.getTag()).A05;
        if (c06c != null) {
            if (this.A1X.containsKey(c06c.A03(UserJid.class))) {
                A1t(Collections.singletonList(c06c.A03(UserJid.class)));
                return;
            }
            this.A0o = c06c;
            view.showContextMenu();
            return;
        }
        C61722wc c61722wc = this.A0u;
        if (c61722wc.A03) {
            return;
        }
        c61722wc.A03 = true;
        c61722wc.notifyDataSetChanged();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            A1f();
            return true;
        } else if (itemId == 2) {
            A1d();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C0VJ.A0B(this);
            return true;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        A1p();
        if (this.A0d.A0G(this.A13)) {
            A1e();
        }
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C06C c06c = this.A0o;
        if (c06c != null) {
            bundle.putString("selected_jid", C003101m.A07(c06c.A02()));
        }
        bundle.putBoolean("group_participants_list_expanded", this.A0u.A03);
    }

    /* loaded from: classes2.dex */
    public class DescriptionConflictDialogFragment extends Hilt_GroupChatInfo_DescriptionConflictDialogFragment {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(A0A());
            c019208x.A02(R.string.group_error_description_conflict);
            c019208x.A01.A0J = true;
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2wS
                {
                    GroupChatInfo.DescriptionConflictDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    GroupChatInfo.DescriptionConflictDialogFragment.this.A10();
                }
            });
            c019208x.A06(R.string.retry, new DialogInterface.OnClickListener() { // from class: X.2wR
                {
                    GroupChatInfo.DescriptionConflictDialogFragment.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x0032, code lost:
                    if (r10.A0n.A0Z == false) goto L24;
                 */
                @Override // android.content.DialogInterface.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.content.DialogInterface r14, int r15) {
                    /*
                        r13 = this;
                        com.whatsapp.group.GroupChatInfo$DescriptionConflictDialogFragment r3 = com.whatsapp.group.GroupChatInfo.DescriptionConflictDialogFragment.this
                        java.lang.String r0 = "group_info/onclick_setDescription"
                        com.whatsapp.util.Log.i(r0)
                        X.0At r10 = r3.A09()
                        com.whatsapp.group.GroupChatInfo r10 = (com.whatsapp.group.GroupChatInfo) r10
                        android.os.Bundle r1 = r3.A02()
                        java.lang.String r0 = "description"
                        java.lang.String r6 = r1.getString(r0)
                        if (r6 == 0) goto Laf
                        X.0C8 r1 = r10.A0h
                        X.05l r0 = r10.A13
                        boolean r5 = r1.A05(r0)
                        X.0C8 r1 = r10.A0h
                        X.05l r0 = r10.A13
                        boolean r0 = r1.A06(r0)
                        r8 = 1
                        r2 = 0
                        if (r0 != 0) goto L34
                        X.06C r0 = r10.A0n
                        boolean r0 = r0.A0Z
                        r4 = 1
                        if (r0 != 0) goto L35
                    L34:
                        r4 = 0
                    L35:
                        java.lang.String r1 = "\n\\s*\n\\s*[\n\\s]+"
                        java.lang.String r0 = "\n\n"
                        java.lang.String r12 = r6.replaceAll(r1, r0)
                        if (r5 != 0) goto L49
                        r0 = 2131887449(0x7f120559, float:1.9409505E38)
                        r10.AUj(r0)
                    L45:
                        r3.A10()
                        return
                    L49:
                        if (r4 == 0) goto L52
                        r0 = 2131887448(0x7f120558, float:1.9409503E38)
                        r10.AUj(r0)
                        goto L45
                    L52:
                        X.06C r0 = r10.A0n
                        X.0Kb r0 = r0.A0B
                        java.lang.String r0 = r0.A02
                        boolean r0 = android.text.TextUtils.equals(r0, r12)
                        if (r0 != 0) goto L45
                        X.0E7 r0 = r10.A0Y
                        boolean r0 = r0.A05()
                        if (r0 == 0) goto La6
                        int r4 = X.C43981yK.A01(r12)
                        X.01B r1 = r10.A0L
                        X.039 r0 = X.C01C.A35
                        int r7 = r1.A07(r0)
                        if (r4 > r7) goto L8d
                        X.01k r1 = r10.A0J
                        X.012 r5 = r10.A0a
                        X.08q r6 = r10.A0I
                        X.02L r7 = r10.A0J
                        X.0EG r8 = r10.A16
                        X.0Fh r9 = r10.A0e
                        X.06C r11 = r10.A0n
                        X.3Kf r4 = new X.3Kf
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                        java.lang.Void[] r0 = new java.lang.Void[r2]
                        r1.ARy(r4, r0)
                        goto L45
                    L8d:
                        X.08q r6 = r10.A0I
                        android.content.res.Resources r5 = r10.getResources()
                        r4 = 2131755039(0x7f10001f, float:1.9140946E38)
                        java.lang.Object[] r1 = new java.lang.Object[r8]
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                        r1[r2] = r0
                        java.lang.String r0 = r5.getQuantityString(r4, r7, r1)
                        r6.A0E(r0, r2)
                        goto L45
                    La6:
                        X.08q r1 = r10.A0I
                        r0 = 2131888428(0x7f12092c, float:1.9411491E38)
                        r1.A07(r0, r2)
                        goto L45
                    Laf:
                        r0 = 0
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.DialogInterface$OnClickListenerC61612wR.onClick(android.content.DialogInterface, int):void");
                }
            });
            return c019208x.A00();
        }
    }
}
