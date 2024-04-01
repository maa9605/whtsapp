package com.whatsapp.group;

import X.ActivityC02290Ap;
import X.C02590Ca;
import X.C04260Jm;
import X.C04P;
import X.C05Y;
import X.C2Nz;
import X.C2O0;
import X.C461825l;
import X.C49672Lv;
import X.InterfaceC010405f;
import X.InterfaceC05620Pl;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class GroupAddBlacklistPickerActivity extends C2Nz implements C2O0 {
    public C49672Lv A00;
    public boolean A01;

    @Override // X.AbstractActivityC06930Vs
    public int A1S() {
        return 0;
    }

    @Override // X.AbstractActivityC06930Vs
    public int A1T() {
        return 0;
    }

    @Override // X.AbstractActivityC06930Vs
    public void A1e(Collection collection) {
    }

    @Override // X.AbstractActivityC06930Vs
    public boolean A1f() {
        return false;
    }

    @Override // X.AbstractActivityC06930Vs
    public int A1R() {
        return R.string.group_add_permission_blacklist;
    }

    @Override // X.AbstractActivityC06930Vs
    public List A1U() {
        return new ArrayList(this.A00.A02());
    }

    @Override // X.AbstractActivityC06930Vs
    public List A1V() {
        return new LinkedList();
    }

    @Override // X.AbstractActivityC06930Vs
    public void A1W() {
        this.A00.A01().A05(this, new InterfaceC05620Pl() { // from class: X.3CC
            {
                GroupAddBlacklistPickerActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = GroupAddBlacklistPickerActivity.this;
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        groupAddBlacklistPickerActivity.A1X();
                        return;
                    }
                    groupAddBlacklistPickerActivity.finish();
                    ((ActivityC02290Ap) groupAddBlacklistPickerActivity).A0A.A07(R.string.failed_to_update_privacy_settings, 1);
                }
            }
        });
    }

    @Override // X.AbstractActivityC06930Vs
    public void A1b() {
        if (this.A01) {
            AUh(new NobodyDeprecatedDialogFragment());
        } else {
            A1g();
        }
    }

    public final void A1g() {
        Set hashSet;
        ((ActivityC02290Ap) this).A0A.A06(0, R.string.info_update_dialog_title);
        final C49672Lv c49672Lv = this.A00;
        final Set set = this.A0U;
        if (c49672Lv != null) {
            final C461825l c461825l = new C461825l();
            String string = c49672Lv.A02.A00.getString("group_add_blacklist_hash", null);
            if (string != null) {
                hashSet = c49672Lv.A02();
            } else {
                hashSet = new HashSet();
            }
            HashSet hashSet2 = new HashSet(set);
            HashSet hashSet3 = new HashSet();
            for (Object obj : hashSet) {
                if (!hashSet2.remove(obj)) {
                    hashSet3.add(obj);
                }
            }
            C05Y c05y = c49672Lv.A03;
            String A02 = c05y.A02();
            C02590Ca[] c02590CaArr = new C02590Ca[hashSet3.size() + hashSet2.size()];
            int i = 2;
            C04P[] c04pArr = new C04P[string != null ? 3 : 2];
            c04pArr[0] = new C04P("name", "groupadd", null, (byte) 0);
            c04pArr[1] = new C04P("value", "contact_blacklist", null, (byte) 0);
            if (string != null) {
                c04pArr[2] = new C04P("dhash", string, null, (byte) 0);
            }
            C04P c04p = new C04P("action", "add", null, (byte) 0);
            C04P c04p2 = new C04P("action", "remove", null, (byte) 0);
            Iterator it = hashSet2.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C04P[] c04pArr2 = new C04P[i];
                c04pArr2[0] = c04p;
                c04pArr2[1] = new C04P("jid", (Jid) it.next());
                c02590CaArr[i2] = new C02590Ca("user", c04pArr2, null, null);
                i2++;
                i = 2;
            }
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                c02590CaArr[i2] = new C02590Ca("user", new C04P[]{c04p2, new C04P("jid", (Jid) it2.next())}, null, null);
                i2++;
            }
            c05y.A07(228, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("to", C04260Jm.A00), new C04P("xmlns", "privacy", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("privacy", (C04P[]) null, new C02590Ca("category", c04pArr, c02590CaArr, null))), new InterfaceC010405f() { // from class: X.3DG
                @Override // X.InterfaceC010405f
                public void AJI(String str) {
                    c461825l.A0A(Boolean.FALSE);
                }

                @Override // X.InterfaceC010405f
                public void AJx(String str, C02590Ca c02590Ca) {
                    c461825l.A0A(Boolean.FALSE);
                }

                @Override // X.InterfaceC010405f
                public void APJ(String str, C02590Ca c02590Ca) {
                    String str2;
                    C04P A0A = c02590Ca.A0E("privacy").A0E("category").A0A("dhash");
                    if (A0A != null && (str2 = A0A.A03) != null) {
                        C49672Lv c49672Lv2 = c49672Lv;
                        C49672Lv.A00(c49672Lv2, set, str2);
                        C000200d.A0g(c49672Lv2.A02, "privacy_groupadd", 3);
                        c461825l.A0A(Boolean.TRUE);
                        return;
                    }
                    c49672Lv.A01();
                    c461825l.A0A(Boolean.FALSE);
                }
            }, 32000L);
            c461825l.A05(this, new InterfaceC05620Pl() { // from class: X.3CB
                {
                    GroupAddBlacklistPickerActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = GroupAddBlacklistPickerActivity.this;
                    Boolean bool = (Boolean) obj2;
                    if (bool != null) {
                        ((ActivityC02290Ap) groupAddBlacklistPickerActivity).A0A.A03();
                        if (bool.booleanValue()) {
                            groupAddBlacklistPickerActivity.setResult(-1);
                        } else {
                            ((ActivityC02290Ap) groupAddBlacklistPickerActivity).A0A.A07(R.string.coldsync_no_network, 1);
                        }
                        groupAddBlacklistPickerActivity.finish();
                    }
                }
            });
            return;
        }
        throw null;
    }

    @Override // X.C2O0
    public void A6W() {
        A1g();
    }

    @Override // X.C2Nz, X.AbstractActivityC06930Vs, X.AbstractActivityC06940Vt, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = getIntent().getBooleanExtra("was_nobody", false);
    }
}
