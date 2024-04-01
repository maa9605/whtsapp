package com.whatsapp.group;

import X.AbstractView$OnClickListenerC49532Ky;
import X.C003101m;
import X.C003701t;
import X.C011005l;
import X.C018508q;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C01C;
import X.C02L;
import X.C03340Fh;
import X.C04250Jl;
import X.C05W;
import X.C06C;
import X.C07D;
import X.C0BA;
import X.C0C8;
import X.C0D7;
import X.C0E7;
import X.C0EG;
import X.C0ES;
import X.C0U1;
import X.C0VJ;
import X.C2KC;
import X.C2O8;
import X.C41991uq;
import X.C456823b;
import X.InterfaceC002901k;
import X.InterfaceC61762wg;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupSettingsActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class GroupSettingsActivity extends C2O8 {
    public C018508q A00;
    public C02L A01;
    public C01B A02;
    public C05W A03;
    public C018708s A04;
    public C0E7 A05;
    public C0C8 A06;
    public C06C A07;
    public C003701t A08;
    public C0ES A09;
    public InterfaceC61762wg A0A = new InterfaceC61762wg() { // from class: X.3CJ
        {
            GroupSettingsActivity.this = this;
        }

        @Override // X.InterfaceC61762wg
        public final void AGo(AbstractC005302j abstractC005302j) {
            GroupSettingsActivity groupSettingsActivity = GroupSettingsActivity.this;
            if (groupSettingsActivity.A0C.equals(abstractC005302j)) {
                groupSettingsActivity.A1P();
            }
        }
    };
    public C456823b A0B;
    public C011005l A0C;
    public C0EG A0D;
    public InterfaceC002901k A0E;

    /* loaded from: classes2.dex */
    public class EditGroupInfoDialogFragment extends Hilt_GroupSettingsActivity_EditGroupInfoDialogFragment {
        public C003701t A00;
    }

    /* loaded from: classes2.dex */
    public class RestrictFrequentlyForwardedDialogFragment extends Hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment {
    }

    /* loaded from: classes2.dex */
    public class SendMessagesDialogFragment extends Hilt_GroupSettingsActivity_SendMessagesDialogFragment {
    }

    public final void A1P() {
        GroupSettingsRowView groupSettingsRowView = (GroupSettingsRowView) C0VJ.A0A(this, R.id.restricted_mode_layout);
        boolean z = this.A07.A0Z;
        int i = R.string.group_settings_all_participants;
        if (z) {
            i = R.string.group_settings_only_admins;
        }
        groupSettingsRowView.setInfoText(i);
        GroupSettingsRowView groupSettingsRowView2 = (GroupSettingsRowView) C0VJ.A0A(this, R.id.announcement_group_layout);
        boolean z2 = this.A07.A0Q;
        int i2 = R.string.group_settings_all_participants;
        if (z2) {
            i2 = R.string.group_settings_only_admins;
        }
        groupSettingsRowView2.setInfoText(i2);
        boolean A0E = this.A02.A0E(C01C.A0u);
        GroupSettingsRowView groupSettingsRowView3 = (GroupSettingsRowView) C0VJ.A0A(this, R.id.frequently_forwarded_layout);
        View findViewById = findViewById(R.id.frequently_forwarded_divider_bottom);
        if (findViewById != null) {
            View findViewById2 = findViewById(R.id.frequently_forwarded_divider_top);
            if (findViewById2 != null) {
                int i3 = 8;
                groupSettingsRowView3.setVisibility(A0E ? 0 : 8);
                findViewById2.setVisibility(A0E ? 0 : 8);
                findViewById.setVisibility(A0E ? 0 : 8);
                if (A0E) {
                    boolean z3 = this.A07.A0Y;
                    int i4 = R.string.group_settings_allow;
                    if (z3) {
                        i4 = R.string.group_settings_dont_allow;
                    }
                    groupSettingsRowView3.setInfoText(i4);
                }
                View findViewById3 = findViewById(R.id.manage_admins_group);
                if (findViewById3 != null) {
                    if (this.A02.A0E(C01C.A0z) && this.A06.A06(this.A0C)) {
                        Iterator it = this.A06.A01(this.A0C).A05().iterator();
                        while (true) {
                            C04250Jl c04250Jl = (C04250Jl) it;
                            if (!c04250Jl.hasNext()) {
                                break;
                            }
                            C0D7 c0d7 = (C0D7) c04250Jl.next();
                            if (!this.A01.A0A(c0d7.A03) && c0d7.A01 != 2) {
                                i3 = 0;
                                break;
                            }
                        }
                    }
                    findViewById3.setVisibility(i3);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 17 && i2 == -1) {
            List A0F = C003101m.A0F(UserJid.class, intent.getStringArrayListExtra("jids"));
            C07D A05 = this.A06.A01(this.A0C).A05();
            HashSet hashSet = new HashSet();
            Iterator it = A05.iterator();
            while (true) {
                C04250Jl c04250Jl = (C04250Jl) it;
                if (!c04250Jl.hasNext()) {
                    break;
                }
                C0D7 c0d7 = (C0D7) c04250Jl.next();
                UserJid userJid = c0d7.A03;
                if (!this.A01.A0A(userJid) && (i3 = c0d7.A01) != 0 && i3 != 2) {
                    hashSet.add(userJid);
                }
            }
            ArrayList arrayList = new ArrayList(A0F);
            arrayList.removeAll(hashSet);
            ArrayList arrayList2 = new ArrayList(hashSet);
            arrayList2.removeAll(A0F);
            if (arrayList.size() == 0 && arrayList2.size() == 0) {
                return;
            }
            if (!this.A05.A05()) {
                boolean A02 = C0E7.A02(this);
                int i4 = R.string.network_required;
                if (A02) {
                    i4 = R.string.network_required_airplane_on;
                }
                this.A00.A07(i4, 0);
            } else if (this.A02.A06() < (arrayList.size() + this.A06.A01(this.A0C).A06().size()) - arrayList2.size()) {
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    hashMap.put(it2.next(), 419);
                }
                C0ES.A02(3003, hashMap);
            } else {
                this.A0E.ARy(new C2KC(this.A00, this.A0D, this.A03, this.A04, this.A09, this, this.A0C, arrayList, arrayList2), new Void[0]);
            }
        }
    }

    @Override // X.C2O8, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.group_settings_title);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            C011005l A04 = C011005l.A04(getIntent().getStringExtra("gid"));
            if (A04 != null) {
                this.A0C = A04;
                this.A07 = this.A03.A0A(A04);
                setContentView(R.layout.group_settings);
                GroupSettingsRowView groupSettingsRowView = (GroupSettingsRowView) C0VJ.A0A(this, R.id.restricted_mode_layout);
                groupSettingsRowView.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.3Ck
                    {
                        GroupSettingsActivity.this = this;
                    }

                    @Override // X.AbstractView$OnClickListenerC49532Ky
                    public void A00(View view) {
                        GroupSettingsActivity groupSettingsActivity = GroupSettingsActivity.this;
                        C011005l c011005l = groupSettingsActivity.A0C;
                        boolean z = groupSettingsActivity.A07.A0Z;
                        GroupSettingsActivity.EditGroupInfoDialogFragment editGroupInfoDialogFragment = new GroupSettingsActivity.EditGroupInfoDialogFragment();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gjid", c011005l.getRawString());
                        bundle2.putBoolean("default", z);
                        editGroupInfoDialogFragment.A0P(bundle2);
                        groupSettingsActivity.AUg(editGroupInfoDialogFragment, null);
                    }
                });
                View A0A = C0VJ.A0A(this, R.id.restricted_mode_separator);
                View A0A2 = C0VJ.A0A(this, R.id.announcement_group_layout_top_shadow);
                if (this.A08.A0C(432)) {
                    A0A.setVisibility(8);
                    A0A2.setVisibility(0);
                    groupSettingsRowView.setDescriptionText(R.string.group_settings_restricted_mode_info_with_disappearing_messages);
                } else {
                    A0A.setVisibility(0);
                    A0A2.setVisibility(8);
                }
                View findViewById = findViewById(R.id.announcement_group_layout);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.3Cl
                        {
                            GroupSettingsActivity.this = this;
                        }

                        @Override // X.AbstractView$OnClickListenerC49532Ky
                        public void A00(View view) {
                            GroupSettingsActivity groupSettingsActivity = GroupSettingsActivity.this;
                            C011005l c011005l = groupSettingsActivity.A0C;
                            boolean z = groupSettingsActivity.A07.A0Q;
                            GroupSettingsActivity.SendMessagesDialogFragment sendMessagesDialogFragment = new GroupSettingsActivity.SendMessagesDialogFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("gjid", c011005l.getRawString());
                            bundle2.putBoolean("default", z);
                            sendMessagesDialogFragment.A0P(bundle2);
                            groupSettingsActivity.AUg(sendMessagesDialogFragment, null);
                        }
                    });
                    GroupSettingsRowView groupSettingsRowView2 = (GroupSettingsRowView) C0VJ.A0A(this, R.id.frequently_forwarded_layout);
                    groupSettingsRowView2.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.3Cm
                        {
                            GroupSettingsActivity.this = this;
                        }

                        @Override // X.AbstractView$OnClickListenerC49532Ky
                        public void A00(View view) {
                            GroupSettingsActivity groupSettingsActivity = GroupSettingsActivity.this;
                            C011005l c011005l = groupSettingsActivity.A0C;
                            boolean z = groupSettingsActivity.A07.A0Y;
                            GroupSettingsActivity.RestrictFrequentlyForwardedDialogFragment restrictFrequentlyForwardedDialogFragment = new GroupSettingsActivity.RestrictFrequentlyForwardedDialogFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("gjid", c011005l.getRawString());
                            bundle2.putBoolean("default", z);
                            restrictFrequentlyForwardedDialogFragment.A0P(bundle2);
                            groupSettingsActivity.AUg(restrictFrequentlyForwardedDialogFragment, null);
                        }
                    });
                    boolean A0E = this.A02.A0E(C01C.A18);
                    int i = R.string.group_settings_frequently_forwarded_title;
                    if (A0E) {
                        i = R.string.group_settings_forward_many_times;
                    }
                    groupSettingsRowView2.setTitleText(i);
                    View findViewById2 = findViewById(R.id.manage_admins);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 37));
                        A1P();
                        C456823b c456823b = this.A0B;
                        c456823b.A00.add(this.A0A);
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

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C456823b c456823b = this.A0B;
        c456823b.A00.remove(this.A0A);
    }

    /* loaded from: classes2.dex */
    public abstract class AdminSettingsDialogFragment extends Hilt_GroupSettingsActivity_AdminSettingsDialogFragment {
        public C018508q A00;
        public C01B A01;
        public C05W A02;
        public C0E7 A03;
        public C03340Fh A04;
        public C0C8 A05;
        public C06C A06;
        public C0ES A07;
        public C011005l A08;
        public C0EG A09;
        public C41991uq A0A;
        public boolean[] A0B = new boolean[1];

        @Override // androidx.fragment.app.DialogFragment, X.C0BA
        public void A0k(Bundle bundle) {
            bundle.putBoolean("default", this.A0B[0]);
            super.A0k(bundle);
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            boolean z;
            String A0F;
            String A0F2;
            String A0F3;
            String A0F4;
            C011005l A04 = C011005l.A04(A02().getString("gjid"));
            if (A04 != null) {
                this.A08 = A04;
                this.A06 = this.A02.A0A(A04);
                if (bundle == null) {
                    z = ((C0BA) this).A06.getBoolean("default");
                } else {
                    z = bundle.getBoolean("default");
                }
                this.A0B[0] = z;
                View inflate = A09().getLayoutInflater().inflate(R.layout.admin_settings_dialog, (ViewGroup) null, false);
                View findViewById = inflate.findViewById(R.id.first_radio_button);
                if (findViewById != null) {
                    CompoundButton compoundButton = (CompoundButton) findViewById;
                    View findViewById2 = inflate.findViewById(R.id.second_radio_button);
                    if (findViewById2 != null) {
                        CompoundButton compoundButton2 = (CompoundButton) findViewById2;
                        if (!(this instanceof RestrictFrequentlyForwardedDialogFragment)) {
                            A0F = A0F(R.string.group_settings_all_participants);
                        } else {
                            A0F = A0F(R.string.group_settings_allow);
                        }
                        compoundButton.setText(A0F);
                        if (!(this instanceof RestrictFrequentlyForwardedDialogFragment)) {
                            A0F2 = A0F(R.string.group_settings_only_admins);
                        } else {
                            A0F2 = A0F(R.string.group_settings_dont_allow);
                        }
                        compoundButton2.setText(A0F2);
                        compoundButton.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 14));
                        compoundButton2.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 13));
                        if (z) {
                            compoundButton2.setChecked(true);
                        } else {
                            compoundButton.setChecked(true);
                        }
                        C019208x c019208x = new C019208x(A09());
                        if (this instanceof SendMessagesDialogFragment) {
                            A0F3 = A0F(R.string.group_settings_announcement_title);
                        } else if (!(this instanceof RestrictFrequentlyForwardedDialogFragment)) {
                            A0F3 = A0F(R.string.group_settings_restricted_mode_title);
                        } else {
                            boolean A0E = this.A01.A0E(C01C.A18);
                            int i = R.string.group_settings_frequently_forwarded_title;
                            if (A0E) {
                                i = R.string.group_settings_forwarded_many_times_title;
                            }
                            A0F3 = A0F(i);
                        }
                        C019308y c019308y = c019208x.A01;
                        c019308y.A0I = A0F3;
                        if (this instanceof SendMessagesDialogFragment) {
                            A0F4 = A0F(R.string.group_settings_announcement_info);
                        } else if (!(this instanceof RestrictFrequentlyForwardedDialogFragment)) {
                            EditGroupInfoDialogFragment editGroupInfoDialogFragment = (EditGroupInfoDialogFragment) this;
                            if (editGroupInfoDialogFragment.A00.A0C(432)) {
                                A0F4 = editGroupInfoDialogFragment.A0F(R.string.group_settings_restricted_mode_info_with_disappearing_messages);
                            } else {
                                A0F4 = editGroupInfoDialogFragment.A0F(R.string.group_settings_restricted_mode_info);
                            }
                        } else {
                            boolean A0E2 = this.A01.A0E(C01C.A18);
                            int i2 = R.string.group_settings_frequently_forwarded_info;
                            if (A0E2) {
                                i2 = R.string.group_settings_forwarded_many_times_info;
                            }
                            A0F4 = A0F(i2);
                        }
                        c019308y.A0E = A0F4;
                        c019308y.A0J = true;
                        c019308y.A0C = inflate;
                        c019308y.A01 = 0;
                        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2wV
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                            }
                        });
                        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2wW
                            {
                                GroupSettingsActivity.AdminSettingsDialogFragment.this = this;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                GroupSettingsActivity.AdminSettingsDialogFragment adminSettingsDialogFragment = GroupSettingsActivity.AdminSettingsDialogFragment.this;
                                if (adminSettingsDialogFragment.A03.A05()) {
                                    boolean z2 = adminSettingsDialogFragment.A0B[0];
                                    if (adminSettingsDialogFragment instanceof GroupSettingsActivity.SendMessagesDialogFragment) {
                                        if (!z2 && adminSettingsDialogFragment.A05.A01(adminSettingsDialogFragment.A08).A01.size() > adminSettingsDialogFragment.A01.A06()) {
                                            C0ES.A02(3013, null);
                                        } else if (adminSettingsDialogFragment.A06.A0Q != z2) {
                                            C0EG c0eg = adminSettingsDialogFragment.A09;
                                            C011005l c011005l = adminSettingsDialogFragment.A08;
                                            c0eg.A0G(c011005l, z2, new C0TD(adminSettingsDialogFragment.A0A, adminSettingsDialogFragment.A07, adminSettingsDialogFragment.A04, c011005l, null, null, 161, null));
                                        } else {
                                            Log.i("SendMessagesDialogFragment/onPositiveButtonClick: skip request, values are equal");
                                        }
                                    } else if (!(adminSettingsDialogFragment instanceof GroupSettingsActivity.RestrictFrequentlyForwardedDialogFragment)) {
                                        if (adminSettingsDialogFragment.A06.A0Z != z2) {
                                            C0EG c0eg2 = adminSettingsDialogFragment.A09;
                                            C011005l c011005l2 = adminSettingsDialogFragment.A08;
                                            c0eg2.A0I(c011005l2, z2, new C0TD(adminSettingsDialogFragment.A0A, adminSettingsDialogFragment.A07, adminSettingsDialogFragment.A04, c011005l2, null, null, 159, null));
                                        } else {
                                            Log.i("EditGroupInfoDialogFragment/onPositiveButtonClick: skip request, values are equal");
                                        }
                                    } else if (adminSettingsDialogFragment.A06.A0Y != z2) {
                                        C0EG c0eg3 = adminSettingsDialogFragment.A09;
                                        C011005l c011005l3 = adminSettingsDialogFragment.A08;
                                        c0eg3.A0H(c011005l3, z2, new C0TD(adminSettingsDialogFragment.A0A, adminSettingsDialogFragment.A07, adminSettingsDialogFragment.A04, c011005l3, null, null, 213, null));
                                    } else {
                                        Log.i("RestrictFrequentlyForwardedDialogFragment/onPositiveButtonClick: skip request, values are equal");
                                    }
                                } else {
                                    adminSettingsDialogFragment.A00.A07(R.string.coldsync_no_network, 0);
                                }
                                adminSettingsDialogFragment.A10();
                            }
                        });
                        return c019208x.A00();
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }
}
