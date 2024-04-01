package com.whatsapp.status;

import X.ActivityC02330At;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass092;
import X.AnonymousClass097;
import X.AnonymousClass265;
import X.AnonymousClass266;
import X.C000200d;
import X.C000400f;
import X.C000500h;
import X.C001200o;
import X.C002301c;
import X.C003101m;
import X.C003701t;
import X.C00A;
import X.C00T;
import X.C011405q;
import X.C018508q;
import X.C018708s;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02180Ae;
import X.C02620Cd;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03320Ff;
import X.C03330Fg;
import X.C03360Fk;
import X.C04580Kz;
import X.C04880Mg;
import X.C05C;
import X.C05W;
import X.C06C;
import X.C07610Yz;
import X.C0AT;
import X.C0B5;
import X.C0CB;
import X.C0EB;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0HK;
import X.C0HS;
import X.C0Hr;
import X.C0L5;
import X.C0L7;
import X.C0MJ;
import X.C0MK;
import X.C0Oi;
import X.C0W5;
import X.C0Zn;
import X.C22X;
import X.C25I;
import X.C25K;
import X.C2AR;
import X.C2DC;
import X.C2DD;
import X.C2DE;
import X.C2EQ;
import X.C36431kn;
import X.C40081rY;
import X.C40731sm;
import X.C42451vl;
import X.C42471vn;
import X.C47252Am;
import X.C48242Em;
import X.C50262Ra;
import X.C53032bm;
import X.C53052bo;
import X.C53062bp;
import X.C53072bq;
import X.C53092bs;
import X.C53112bu;
import X.C53132bw;
import X.InterfaceC002901k;
import X.InterfaceC04240Jk;
import X.InterfaceC05620Pl;
import X.InterfaceC05880Qp;
import X.InterfaceC09330d4;
import X.InterfaceC53102bt;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.Hilt_StatusesFragment;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class StatusesFragment extends Hilt_StatusesFragment implements C0MJ, C0MK, C25I, C25K {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public View A02;
    public C0Oi A03;
    public C018508q A04;
    public C02L A05;
    public C01B A06;
    public C0W5 A07;
    public C03320Ff A08;
    public C0L7 A09;
    public C05W A0A;
    public AnonymousClass008 A0B;
    public C018708s A0C;
    public C0Zn A0D;
    public C0L5 A0E;
    public C000400f A0F;
    public C02E A0G;
    public AnonymousClass012 A0H;
    public C001200o A0I;
    public C02F A0J;
    public C000500h A0K;
    public C002301c A0L;
    public C00A A0M;
    public C22X A0N;
    public C0EB A0O;
    public C40081rY A0P;
    public C003701t A0Q;
    public AnonymousClass011 A0R;
    public C03360Fk A0S;
    public C02O A0T;
    public C0CB A0U;
    public C2AR A0V;
    public StatusExpirationLifecycleOwner A0W;
    public C03330Fg A0X;
    public C53072bq A0Y;
    public C53062bp A0Z;
    public AnonymousClass265 A0b;
    public C2EQ A0c;
    public C2DD A0d;
    public C47252Am A0e;
    public C2DC A0f;
    public C53132bw A0g;
    public C53092bs A0h;
    public C53052bo A0i;
    public C42471vn A0j;
    public InterfaceC002901k A0k;
    public CharSequence A0l;
    public List A0m;
    public boolean A0r;
    public boolean A0t;
    public boolean A0v;
    public final List A13 = new ArrayList();
    public final List A14 = new ArrayList();
    public AnonymousClass266 A0a = new AnonymousClass266();
    public Set A0q = new HashSet();
    public List A0p = new ArrayList();
    public List A0n = new ArrayList();
    public List A0o = new ArrayList();
    public boolean A0u = false;
    public boolean A0s = true;
    public final C0GA A0x = new C0GA() { // from class: X.2bh
        {
            StatusesFragment.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            StatusesFragment statusesFragment = StatusesFragment.this;
            statusesFragment.A0b.getFilter().filter(statusesFragment.A0l);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            StatusesFragment.this.A0b.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            StatusesFragment.this.A0b.notifyDataSetChanged();
        }
    };
    public final C0GC A0w = new C0GC() { // from class: X.2bi
        {
            StatusesFragment.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            StatusesFragment statusesFragment = StatusesFragment.this;
            statusesFragment.A0b.getFilter().filter(statusesFragment.A0l);
        }
    };
    public final InterfaceC09330d4 A11 = new InterfaceC09330d4() { // from class: X.3pN
        {
            StatusesFragment.this = this;
        }

        @Override // X.InterfaceC09330d4
        public final void AP1(AbstractC005302j abstractC005302j) {
            StatusesFragment.this.A11();
        }
    };
    public final C0GE A10 = new C0GE() { // from class: X.2bj
        {
            StatusesFragment.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            StatusesFragment statusesFragment = StatusesFragment.this;
            statusesFragment.A0b.getFilter().filter(statusesFragment.A0l);
        }
    };
    public final C00T A0z = new C00T() { // from class: X.2bk
        {
            StatusesFragment.this = this;
        }

        @Override // X.C00T
        public void A00(AbstractC005302j abstractC005302j) {
            if (C003101m.A0Z(abstractC005302j)) {
                StatusesFragment.this.A11();
            }
        }

        @Override // X.C00T
        public void A02(AnonymousClass092 anonymousClass092) {
            if (C003101m.A0Z(anonymousClass092.A0n.A00)) {
                StatusesFragment statusesFragment = StatusesFragment.this;
                statusesFragment.A0q.add(UserJid.of(anonymousClass092.A0A()));
                statusesFragment.A11();
            }
        }

        @Override // X.C00T
        public void A05(AbstractC005302j abstractC005302j) {
            if (C04580Kz.A00.equals(abstractC005302j)) {
                StatusesFragment.this.A11();
            }
        }

        @Override // X.C00T
        public void A08(AnonymousClass092 anonymousClass092, int i) {
            if (i != 8) {
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                if (C003101m.A0Z(anonymousClass094.A00) && anonymousClass094.A02) {
                    StatusesFragment statusesFragment = StatusesFragment.this;
                    if (statusesFragment.A0a.A00 != null) {
                        C53072bq c53072bq = statusesFragment.A0Y;
                        if (c53072bq != null) {
                            c53072bq.A05(true);
                        }
                        C53072bq c53072bq2 = new C53072bq(statusesFragment.A0N, statusesFragment);
                        statusesFragment.A0Y = c53072bq2;
                        statusesFragment.A0k.ARy(c53072bq2, new Void[0]);
                        return;
                    }
                }
                if (i != 12) {
                    return;
                }
                StatusesFragment.this.A11();
            }
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (C003101m.A0Z(((AnonymousClass092) it.next()).A0n.A00)) {
                    StatusesFragment.this.A11();
                    return;
                }
            }
        }

        @Override // X.C00T
        public void A0C(AnonymousClass092 anonymousClass092, int i) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if (C003101m.A0Z(anonymousClass094.A00)) {
                StatusesFragment statusesFragment = StatusesFragment.this;
                statusesFragment.A11();
                if (anonymousClass094.A02) {
                    if (statusesFragment.A02 != null && ((Hilt_StatusesFragment) statusesFragment).A00 != null) {
                        C000200d.A0j(statusesFragment.A0K, "show_statuses_education", false);
                        statusesFragment.A02.setVisibility(8);
                        return;
                    }
                    return;
                }
                statusesFragment.A0q.remove(UserJid.of(anonymousClass092.A0A()));
            }
        }
    };
    public final Runnable A12 = new RunnableEBaseShape6S0100000_I0_6(this, 30);
    public final InterfaceC05880Qp A0y = new InterfaceC05880Qp() { // from class: X.2bl
        {
            StatusesFragment.this = this;
        }

        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            StatusesFragment statusesFragment = StatusesFragment.this;
            boolean A01 = C000400f.A01();
            int i = R.string.record_need_sd_card_title_shared_storage;
            if (A01) {
                i = R.string.record_need_sd_card_title;
            }
            boolean A012 = C000400f.A01();
            int i2 = R.string.record_need_sd_card_message_shared_storage;
            if (A012) {
                i2 = R.string.record_need_sd_card_message;
            }
            StatusesFragment.A00(statusesFragment, i, i2, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            StatusesFragment.A00(StatusesFragment.this, R.string.alert, R.string.permission_storage_need_access, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            StatusesFragment statusesFragment = StatusesFragment.this;
            boolean A01 = C000400f.A01();
            int i = R.string.record_need_sd_card_title_shared_storage;
            if (A01) {
                i = R.string.record_need_sd_card_title;
            }
            boolean A012 = C000400f.A01();
            int i2 = R.string.record_need_sd_card_message_shared_storage;
            if (A012) {
                i2 = R.string.record_need_sd_card_message;
            }
            StatusesFragment.A00(statusesFragment, i, i2, new Object[0]);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            StatusesFragment.A00(StatusesFragment.this, R.string.alert, R.string.permission_storage_need_access, new Object[0]);
        }
    };

    @Override // X.C25J
    public void AJM(DialogFragment dialogFragment, boolean z) {
    }

    @Override // X.C0MK
    public void ASF(C06C c06c) {
    }

    @Override // X.C0MK
    public boolean AVJ() {
        return true;
    }

    public static void A00(StatusesFragment statusesFragment, int i, int i2, Object[] objArr) {
        C0B5 c0b5 = (C0B5) statusesFragment.A09();
        if (c0b5 != null) {
            c0b5.AUl(i, i2, objArr);
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0f() {
        Log.i("statusesFragment/onPause");
        this.A0f.A04.A04(this);
        super.A0U = true;
    }

    @Override // X.C0BA
    public void A0g() {
        Log.i("statusesFragment/onStart");
        super.A0U = true;
        if (this.A03.A02) {
            A13();
        }
        A16();
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        C48242Em c48242Em;
        if (i == 33) {
            if (i2 != -1) {
                return;
            }
            A15();
        } else if (i != 35) {
            if (i == 151) {
                if (i2 == -1) {
                    A19(this.A0r);
                } else if (i2 != 0 || (c48242Em = this.A0c.A00) == null) {
                } else {
                    c48242Em.A01 = 4;
                }
            }
        } else {
            if (this.A0r) {
                C2DD c2dd = this.A0d;
                C47252Am c47252Am = c2dd.A05;
                c47252Am.A01.post(new RunnableEBaseShape6S0100000_I0_6(c47252Am.A03, 31));
                C2DE c2de = c2dd.A04;
                c2de.A01 = true;
                c2de.A00 = false;
                c2dd.A00();
            }
            this.A0c.A02();
            if (!this.A0r) {
                return;
            }
            C2DC c2dc = this.A0f;
            if (intent == null) {
                return;
            }
            C000500h c000500h = c2dc.A01;
            boolean z = c000500h.A00.getBoolean("is_status_sharing_with_fb_disabled", false);
            boolean booleanExtra = intent.getBooleanExtra("feature_disabled", z);
            if (booleanExtra == z) {
                return;
            }
            C000200d.A0j(c000500h, "is_status_sharing_with_fb_disabled", booleanExtra);
        }
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        boolean z;
        String str;
        Log.i("statusesFragment/onActivityCreated");
        super.A0U = true;
        A0J();
        A0x();
        ListView listView = ((ListFragment) this).A04;
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new C53032bm(this));
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: X.3Wy
            {
                StatusesFragment.this = this;
            }

            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                StatusesFragment statusesFragment = StatusesFragment.this;
                C54802jN c54802jN = (C54802jN) view.getTag();
                ActivityC02330At A09 = statusesFragment.A09();
                if (A09 != null) {
                    if (c54802jN != null) {
                        UserJid userJid = c54802jN.A01;
                        if (!C011405q.A03(userJid) && !C003101m.A0Y(userJid) && !A09.A0N().A0r()) {
                            C0CB c0cb = statusesFragment.A0U;
                            if (userJid != null) {
                                boolean z2 = c0cb.A07(userJid).A0G;
                                UserJid userJid2 = c54802jN.A01;
                                if (z2) {
                                    StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = new StatusConfirmUnmuteDialogFragment();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("jid", userJid2.getRawString());
                                    statusConfirmUnmuteDialogFragment.A0P(bundle2);
                                    C09360d8.A00(statusesFragment, statusConfirmUnmuteDialogFragment);
                                    return true;
                                }
                                StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = new StatusConfirmMuteDialogFragment();
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("jid", userJid2.getRawString());
                                statusConfirmMuteDialogFragment.A0P(bundle3);
                                C09360d8.A00(statusesFragment, statusConfirmMuteDialogFragment);
                                return true;
                            }
                            throw null;
                        }
                        return false;
                    }
                    return false;
                }
                throw null;
            }
        });
        if (this.A0K.A00.getBoolean("show_statuses_education", true)) {
            final C05C c05c = this.A0O.A03;
            final C0HK c0hk = new C0HK();
            synchronized (c05c.A04) {
                Map map = c05c.A05;
                if (map.containsKey("status_distribution")) {
                    str = (String) map.get("status_distribution");
                    z = true;
                } else {
                    z = false;
                    str = null;
                }
            }
            if (z) {
                c0hk.A0A(str);
            } else {
                c05c.A03.AS1(new Runnable() { // from class: X.1OP
                    public final /* synthetic */ String A02 = "status_distribution";

                    @Override // java.lang.Runnable
                    public final void run() {
                        c0hk.A0A(c05c.A02(this.A02));
                    }
                });
            }
            final C36431kn c36431kn = new InterfaceC04240Jk() { // from class: X.1kn
                @Override // X.InterfaceC04240Jk
                public final Object A5S(Object obj) {
                    return Boolean.valueOf(obj != null);
                }
            };
            final C04880Mg c04880Mg = new C04880Mg();
            c04880Mg.A0C(c0hk, new InterfaceC05620Pl() { // from class: X.0d5
                @Override // X.InterfaceC05620Pl
                public void AIK(Object obj) {
                    c04880Mg.A0B(c36431kn.A5S(obj));
                }
            });
            c04880Mg.A05(A0D(), new InterfaceC05620Pl() { // from class: X.3pM
                {
                    StatusesFragment.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    StatusesFragment statusesFragment = StatusesFragment.this;
                    if (!((Boolean) obj).booleanValue()) {
                        if (statusesFragment.A02 == null) {
                            statusesFragment.A0x();
                            ListView listView2 = ((ListFragment) statusesFragment).A04;
                            View inflate = statusesFragment.A0A().getLayoutInflater().inflate(R.layout.status_education_row, (ViewGroup) listView2, false);
                            statusesFragment.A02 = inflate;
                            ((TextView) inflate.findViewById(R.id.text)).setText(statusesFragment.A0G(R.string.status_education_with_placeholder, 24));
                            statusesFragment.A02.findViewById(R.id.cancel).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(statusesFragment, 21));
                            statusesFragment.A02.findViewById(R.id.privacy_settings).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(statusesFragment, 17));
                            FrameLayout frameLayout = new FrameLayout(statusesFragment.A00());
                            frameLayout.addView(statusesFragment.A02);
                            listView2.addHeaderView(frameLayout, null, true);
                        }
                        statusesFragment.A02.setVisibility(0);
                    }
                }
            });
        }
        A05().findViewById(R.id.init_statuses_progress).setVisibility(0);
        this.A0i = new C53052bo(A00());
        AnonymousClass265 anonymousClass265 = new AnonymousClass265(this);
        this.A0b = anonymousClass265;
        A0y(anonymousClass265);
        this.A0B.A01(this.A0x);
        this.A0M.A01(this.A0z);
        this.A08.A01(this.A0w);
        this.A0X.A01(this.A11);
        this.A0S.A01(this.A10);
        A11();
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        bundle.putBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", this.A0r);
        bundle.putBoolean("SHARE_CTA_VISIBILITY_SI_KEY", this.A0d.A04.A00);
    }

    @Override // X.C0BA
    public void A0m(Menu menu, MenuInflater menuInflater) {
        menu.add(2, R.id.menuitem_status_privacy, 0, R.string.status_privacy);
    }

    @Override // X.C0BA
    public boolean A0o(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_status) {
            A15();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_status_privacy) {
            A0i(new Intent(((Hilt_StatusesFragment) this).A00, StatusPrivacyActivity.class));
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_new_text_status) {
            Intent intent = new Intent(((Hilt_StatusesFragment) this).A00, TextStatusComposerActivity.class);
            intent.putExtra("origin", 4);
            A0i(intent);
            return true;
        } else {
            return false;
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.statuses, viewGroup, false);
        HomeActivity.A03(inflate, this, A01().getDimensionPixelSize(R.dimen.statuses_fragment_empty_footer_height));
        return inflate;
    }

    @Override // X.C0BA
    public void A0q() {
        Log.i("statusesFragment/onDestroy");
        super.A0U = true;
        C2DD c2dd = this.A0d;
        C47252Am c47252Am = c2dd.A05;
        c47252Am.A00.A00(c2dd.A03);
        this.A0D.A00();
        this.A0B.A00(this.A0x);
        this.A0M.A00(this.A0z);
        this.A08.A00(this.A0w);
        this.A0X.A00(this.A11);
        this.A0S.A00(this.A10);
        C018508q c018508q = this.A04;
        c018508q.A02.removeCallbacks(this.A12);
        C53062bp c53062bp = this.A0Z;
        if (c53062bp != null) {
            c53062bp.A05(true);
        }
        C53072bq c53072bq = this.A0Y;
        if (c53072bq != null) {
            c53072bq.A05(true);
        }
        A14();
    }

    @Override // X.C0BA
    public void A0s() {
        Log.i("statusesFragment/onResume");
        super.A0U = true;
        this.A0f.A04.A05(this, new InterfaceC05620Pl() { // from class: X.2br
            {
                StatusesFragment.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:44:0x0033, code lost:
                if (r2 != 2) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0058  */
            @Override // X.InterfaceC05620Pl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void AIK(java.lang.Object r7) {
                /*
                    r6 = this;
                    com.whatsapp.status.StatusesFragment r4 = com.whatsapp.status.StatusesFragment.this
                    X.2DM r7 = (X.C2DM) r7
                    java.lang.String r0 = "statusesFragment/onStatusSharingInfoChanged"
                    com.whatsapp.util.Log.i(r0)
                    r3 = 1
                    r5 = 2
                    if (r7 == 0) goto L38
                    android.content.Intent r0 = r7.A01
                    if (r0 == 0) goto L2e
                    r4.A14()
                    java.util.List r1 = r4.A0p
                    java.util.List r0 = r7.A02
                    r1.addAll(r0)
                    boolean r0 = r4.A0r
                    if (r0 != 0) goto L20
                    r3 = 2
                L20:
                    X.2DD r0 = r4.A0d
                    r0.A01(r3)
                    android.content.Intent r2 = r7.A01
                    r1 = 35
                    r0 = 0
                    r4.A0O(r2, r1, r0)
                    return
                L2e:
                    int r2 = r7.A00
                    if (r2 == r3) goto L36
                    r1 = 2
                    if (r2 == r5) goto L3a
                    goto L39
                L36:
                    r1 = 3
                    goto L3a
                L38:
                    r2 = 0
                L39:
                    r1 = 5
                L3a:
                    X.2EQ r0 = r4.A0c
                    X.2Em r0 = r0.A00
                    if (r0 == 0) goto L42
                    r0.A01 = r1
                L42:
                    if (r2 == r3) goto L58
                    if (r2 == r5) goto L4f
                    X.08q r1 = r4.A04
                    r0 = 2131889837(0x7f120ead, float:1.9414349E38)
                    r1.A07(r0, r3)
                    return
                L4f:
                    X.08q r1 = r4.A04
                    r0 = 2131889839(0x7f120eaf, float:1.9414353E38)
                    r1.A05(r0, r3)
                    return
                L58:
                    X.08q r1 = r4.A04
                    r0 = 2131889838(0x7f120eae, float:1.941435E38)
                    r1.A05(r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C53082br.AIK(java.lang.Object):void");
            }
        });
    }

    @Override // X.C0BA
    public void A0t() {
        Log.i("statusesFragment/onStop");
        super.A0U = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r11.getBoolean("SHARE_CTA_VISIBILITY_SI_KEY", false) == false) goto L11;
     */
    @Override // X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0v(android.os.Bundle r11) {
        /*
            r10 = this;
            java.lang.String r0 = "statusesFragment/onCreate"
            com.whatsapp.util.Log.i(r0)
            r5 = r10
            X.0L5 r1 = r10.A0E
            android.content.ContextWrapper r0 = r10.A00
            X.0Zn r0 = r1.A04(r0)
            r10.A0D = r0
            super.A0v(r11)
            X.08q r6 = r10.A04
            X.01k r7 = r10.A0k
            X.0EB r8 = r10.A0O
            X.22X r9 = r10.A0N
            com.whatsapp.status.StatusExpirationLifecycleOwner r4 = new com.whatsapp.status.StatusExpirationLifecycleOwner
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A0W = r4
            X.01B r1 = r10.A06
            X.03B r0 = X.C01C.A2K
            boolean r0 = r1.A0E(r0)
            r10.A0v = r0
            r4 = 0
            if (r11 == 0) goto L38
            java.lang.String r0 = "SHARE_CTA_VISIBILITY_SI_KEY"
            boolean r0 = r11.getBoolean(r0, r4)
            r3 = 1
            if (r0 != 0) goto L39
        L38:
            r3 = 0
        L39:
            X.2Am r2 = r10.A0e
            X.2EQ r0 = r10.A0c
            X.2DD r1 = new X.2DD
            r1.<init>(r2, r0, r4, r3)
            r10.A0d = r1
            X.2Am r0 = r1.A05
            X.3pR r1 = r1.A03
            X.2DB r0 = r0.A00
            r0.A01(r1)
            if (r11 == 0) goto L57
            java.lang.String r0 = "WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY"
            boolean r0 = r11.getBoolean(r0, r4)
            r10.A0r = r0
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.StatusesFragment.A0v(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2bp, X.0HS] */
    public void A11() {
        C53062bp c53062bp = this.A0Z;
        if (c53062bp != null) {
            c53062bp.A05(true);
        }
        ?? r2 = new C0HS(this.A0O, this.A0U, this) { // from class: X.2bp
            public final C0EB A00;
            public final C0CB A01;
            public final WeakReference A02;

            {
                this.A00 = r2;
                this.A01 = r3;
                this.A02 = new WeakReference(this);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                List A08 = this.A00.A08();
                AnonymousClass266 anonymousClass266 = new AnonymousClass266();
                Iterator it = ((AbstractCollection) A08).iterator();
                while (it.hasNext()) {
                    C0Hr c0Hr = (C0Hr) it.next();
                    UserJid userJid = c0Hr.A0A;
                    if (C011405q.A03(userJid)) {
                        anonymousClass266.A00 = c0Hr;
                    } else if (this.A01.A07(userJid).A0G) {
                        anonymousClass266.A01.add(c0Hr);
                    } else if (c0Hr.A01 > 0) {
                        anonymousClass266.A02.add(c0Hr);
                    } else {
                        anonymousClass266.A03.add(c0Hr);
                    }
                }
                Collections.sort(anonymousClass266.A02, new Comparator() { // from class: X.3Wx
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        boolean z = r1;
                        C0Hr c0Hr2 = (C0Hr) obj;
                        C0Hr c0Hr3 = (C0Hr) obj2;
                        UserJid userJid2 = c0Hr2.A0A;
                        if (C011405q.A03(userJid2)) {
                            return -1;
                        }
                        UserJid userJid3 = c0Hr3.A0A;
                        if (C011405q.A03(userJid3)) {
                            return 1;
                        }
                        if (z) {
                            if (C003101m.A0Y(userJid2)) {
                                return -1;
                            }
                            if (C003101m.A0Y(userJid3)) {
                                return 1;
                            }
                        }
                        return -(c0Hr2.A07 > c0Hr3.A07 ? 1 : (c0Hr2.A07 == c0Hr3.A07 ? 0 : -1));
                    }
                });
                Collections.sort(anonymousClass266.A03, new Comparator() { // from class: X.3Wx
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        boolean z = r1;
                        C0Hr c0Hr2 = (C0Hr) obj;
                        C0Hr c0Hr3 = (C0Hr) obj2;
                        UserJid userJid2 = c0Hr2.A0A;
                        if (C011405q.A03(userJid2)) {
                            return -1;
                        }
                        UserJid userJid3 = c0Hr3.A0A;
                        if (C011405q.A03(userJid3)) {
                            return 1;
                        }
                        if (z) {
                            if (C003101m.A0Y(userJid2)) {
                                return -1;
                            }
                            if (C003101m.A0Y(userJid3)) {
                                return 1;
                            }
                        }
                        return -(c0Hr2.A07 > c0Hr3.A07 ? 1 : (c0Hr2.A07 == c0Hr3.A07 ? 0 : -1));
                    }
                });
                Collections.sort(anonymousClass266.A01, new Comparator() { // from class: X.3Wx
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        boolean z = r1;
                        C0Hr c0Hr2 = (C0Hr) obj;
                        C0Hr c0Hr3 = (C0Hr) obj2;
                        UserJid userJid2 = c0Hr2.A0A;
                        if (C011405q.A03(userJid2)) {
                            return -1;
                        }
                        UserJid userJid3 = c0Hr3.A0A;
                        if (C011405q.A03(userJid3)) {
                            return 1;
                        }
                        if (z) {
                            if (C003101m.A0Y(userJid2)) {
                                return -1;
                            }
                            if (C003101m.A0Y(userJid3)) {
                                return 1;
                            }
                        }
                        return -(c0Hr2.A07 > c0Hr3.A07 ? 1 : (c0Hr2.A07 == c0Hr3.A07 ? 0 : -1));
                    }
                });
                return anonymousClass266;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                AnonymousClass266 anonymousClass266 = (AnonymousClass266) obj;
                StatusesFragment statusesFragment = (StatusesFragment) this.A02.get();
                if (statusesFragment != null) {
                    statusesFragment.A0Z = null;
                    statusesFragment.A0a = anonymousClass266;
                    if (anonymousClass266.A01.size() == 0) {
                        statusesFragment.A0s = true;
                    }
                    statusesFragment.A0b.getFilter().filter(statusesFragment.A0l);
                    long j = 0;
                    int i = 0;
                    for (C0Hr c0Hr : statusesFragment.A0a.A02) {
                        i++;
                        long j2 = c0Hr.A06;
                        if (j2 > j) {
                            j = j2;
                        }
                    }
                    ActivityC02330At A09 = statusesFragment.A09();
                    if (A09 instanceof HomeActivity) {
                        HomeActivity homeActivity = (HomeActivity) A09;
                        if (j != 0) {
                            homeActivity.A04 = j;
                        }
                        C018508q c018508q = ((ActivityC02290Ap) homeActivity).A0A;
                        c018508q.A02.removeCallbacks(homeActivity.A1t);
                        if (homeActivity.A03 == 300) {
                            homeActivity.A1Z();
                        } else {
                            long j3 = ((ActivityC02290Ap) homeActivity).A0F.A00.getLong("last_notified_status_row_id", 0L);
                            C0ZV A0H = homeActivity.A0O.A0H(HomeActivity.A00(((ActivityC02310Ar) homeActivity).A01, 300));
                            if (j3 < j) {
                                A0H.A00 = i;
                                homeActivity.A1d();
                            } else if (A0H.A00 != 0) {
                                A0H.A00 = 0;
                                homeActivity.A1d();
                            }
                        }
                    }
                    C2EQ c2eq = statusesFragment.A0c;
                    C48242Em c48242Em = c2eq.A00;
                    if (c48242Em != null && !c48242Em.A04) {
                        c2eq.A03(statusesFragment.A0a.A02.size());
                    }
                    statusesFragment.A12();
                    statusesFragment.A16();
                    statusesFragment.A0W.A00();
                    C53072bq c53072bq = statusesFragment.A0Y;
                    if (c53072bq != null) {
                        c53072bq.A05(true);
                    }
                    C53072bq c53072bq2 = new C53072bq(statusesFragment.A0N, statusesFragment);
                    statusesFragment.A0Y = c53072bq2;
                    statusesFragment.A0k.ARy(c53072bq2, new Void[0]);
                }
            }
        };
        this.A0Z = r2;
        this.A0k.ARy(r2, new Void[0]);
    }

    public final void A12() {
        View view = super.A0A;
        if (view != null) {
            if (this.A0a.A00()) {
                if (this.A0Z != null) {
                    view.findViewById(R.id.init_statuses_progress).setVisibility(0);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                    view.findViewById(R.id.welcome_statuses_message).setVisibility(8);
                    view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
                    view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                } else if (this.A0A.A03() > 0) {
                    view.findViewById(R.id.init_statuses_progress).setVisibility(8);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                    view.findViewById(R.id.welcome_statuses_message).setVisibility(0);
                    view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
                    view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                    TextView textView = (TextView) view.findViewById(R.id.welcome_statuses_message);
                    Context context = textView.getContext();
                    String A0F = A0F(R.string.welcome_statuses_message);
                    Drawable A03 = C02160Ac.A03(context, R.drawable.ic_new_status_tip);
                    if (A03 != null) {
                        textView.setText(C50262Ra.A00(A0F, C02180Ae.A0Q(A03, C02160Ac.A00(context, R.color.secondary_text)), textView.getPaint()));
                        return;
                    }
                    throw null;
                } else {
                    if (this.A0J.A03()) {
                        ViewGroup viewGroup = (ViewGroup) C0AT.A0D(view, R.id.statuses_empty_no_contacts);
                        if (viewGroup.getChildCount() == 0) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(((Hilt_StatusesFragment) this).A00);
                            viewGroup.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 22));
                        }
                        viewGroup.setVisibility(0);
                        view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                    } else {
                        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.contacts_empty_permission_denied);
                        if (viewGroup2.getChildCount() == 0) {
                            A0A().getLayoutInflater().inflate(R.layout.empty_contacts_permissions_needed, viewGroup2, true);
                            viewGroup2.findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 40));
                        }
                        viewGroup2.setVisibility(0);
                        view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
                    }
                    view.findViewById(R.id.init_statuses_progress).setVisibility(8);
                    view.findViewById(R.id.search_no_matches).setVisibility(8);
                    view.findViewById(R.id.welcome_statuses_message).setVisibility(8);
                }
            } else if (TextUtils.isEmpty(this.A0l)) {
            } else {
                view.findViewById(R.id.init_statuses_progress).setVisibility(8);
                view.findViewById(R.id.search_no_matches).setVisibility(0);
                ((TextView) view.findViewById(R.id.search_no_matches)).setText(A0G(R.string.search_no_results, this.A0l));
                view.findViewById(R.id.welcome_statuses_message).setVisibility(8);
                view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
                view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
            }
        }
    }

    public final void A13() {
        if (this.A0u) {
            C2EQ c2eq = this.A0c;
            c2eq.A00 = new C48242Em(c2eq.A09.nextLong());
            if (this.A0Z == null) {
                this.A0c.A03(this.A0a.A02.size());
            }
        }
    }

    public final void A14() {
        for (Uri uri : this.A0p) {
            this.A0I.A00.revokeUriPermission(uri, 1);
        }
        this.A0p.clear();
    }

    public final void A15() {
        Intent A02 = RequestPermissionActivity.A02(((Hilt_StatusesFragment) this).A00, this.A0J, 33);
        if (A02 == null) {
            if (this.A0F.A0A(this.A0y)) {
                if (this.A0F.A02() < ((this.A06.A07(C01C.A3Y) << 10) << 10)) {
                    AnonymousClass011 anonymousClass011 = this.A0R;
                    ActivityC02330At A09 = A09();
                    C0B5 c0b5 = (C0B5) A09;
                    if (c0b5 != null) {
                        C40731sm.A0c(anonymousClass011, A09, c0b5, 5);
                        return;
                    }
                    throw null;
                }
                if (this.A02 != null) {
                    C000200d.A0j(this.A0K, "show_statuses_education", false);
                    this.A02.setVisibility(8);
                }
                Intent intent = new Intent(((Hilt_StatusesFragment) this).A00, CameraActivity.class);
                intent.putExtra("jid", C04580Kz.A00.getRawString());
                intent.putExtra("origin", 4);
                A0i(intent);
                return;
            }
            return;
        }
        A0O(A02, 33, null);
    }

    public final void A16() {
        C018508q c018508q = this.A04;
        Runnable runnable = this.A12;
        c018508q.A02.removeCallbacks(runnable);
        if (this.A0a.A00() || A09() == null) {
            return;
        }
        AnonymousClass266 anonymousClass266 = this.A0a;
        long j = 0;
        for (C0Hr c0Hr : anonymousClass266.A02) {
            long j2 = c0Hr.A07;
            if (j2 > j) {
                j = j2;
            }
        }
        for (C0Hr c0Hr2 : anonymousClass266.A03) {
            long j3 = c0Hr2.A07;
            if (j3 > j) {
                j = j3;
            }
        }
        for (C0Hr c0Hr3 : anonymousClass266.A01) {
            long j4 = c0Hr3.A07;
            if (j4 > j) {
                j = j4;
            }
        }
        C0Hr c0Hr4 = anonymousClass266.A00;
        if (c0Hr4 != null) {
            long j5 = c0Hr4.A07;
            if (j5 > j) {
                j = j5;
            }
        }
        this.A04.A02.postDelayed(runnable, (C02620Cd.A01(j) - System.currentTimeMillis()) + 1000);
    }

    public final void A17(ImageView imageView) {
        if (this.A0s) {
            imageView.setImageDrawable(A01().getDrawable(R.drawable.ic_chevron_down));
        } else {
            imageView.setImageDrawable(A01().getDrawable(R.drawable.ic_chevron_up));
        }
    }

    public final void A18(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0h.A00(this.A0N.A01(((C0Hr) it.next()).A0A));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((AbstractCollection) this.A0N.A02(((C0Hr) it2.next()).A0A)).iterator();
            while (it3.hasNext()) {
                this.A0h.A00((AnonymousClass092) it3.next());
            }
        }
    }

    public final void A19(boolean z) {
        boolean A02;
        C48242Em c48242Em;
        ActivityC02330At A09 = A09();
        if (A09 == null) {
            return;
        }
        this.A0r = z;
        if (z) {
            C2DC c2dc = this.A0f;
            A02 = c2dc.A02(new ArrayList(this.A0d.A05.A03.values()), A09, this, c2dc.A02);
        } else {
            C2DC c2dc2 = this.A0f;
            A02 = c2dc2.A02(new ArrayList(this.A0d.A05.A03.values()), A09, this, c2dc2.A03);
        }
        if (!A02 && !this.A0f.A00.A06() && (c48242Em = this.A0c.A00) != null) {
            c48242Em.A01 = 4;
        }
    }

    public final void A1A(final boolean z, Animator.AnimatorListener animatorListener) {
        final View view;
        ValueAnimator ofInt;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.A0b.getCount(); i++) {
            if (this.A0b.getItemViewType(i) == 0) {
                C53112bu c53112bu = (C53112bu) ((InterfaceC53102bt) this.A0b.A03.A0n.get(i));
                C0CB c0cb = this.A0U;
                UserJid userJid = c53112bu.A01.A0A;
                if (c0cb.A07(userJid).A0G && !C011405q.A03(userJid) && (view = c53112bu.A00) != null) {
                    if (z) {
                        view.measure(0, 0);
                    }
                    final int measuredHeight = view.getMeasuredHeight();
                    int[] iArr = new int[2];
                    if (z) {
                        iArr[0] = 0;
                        iArr[1] = measuredHeight;
                        ofInt = ValueAnimator.ofInt(iArr);
                    } else {
                        iArr[0] = measuredHeight;
                        iArr[1] = 0;
                        ofInt = ValueAnimator.ofInt(iArr);
                    }
                    ofInt.addListener(new AnimatorListenerAdapter() { // from class: X.2bv
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            View view2 = view;
                            int i2 = measuredHeight;
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = i2;
                                view2.setLayoutParams(layoutParams);
                            }
                            view2.setAlpha(1.0f);
                        }
                    });
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3Wz
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float animatedFraction;
                            View view2 = view;
                            boolean z2 = z;
                            int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = intValue;
                                view2.setLayoutParams(layoutParams);
                            }
                            if (z2) {
                                animatedFraction = valueAnimator.getAnimatedFraction();
                            } else {
                                animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                            }
                            view2.setAlpha(animatedFraction);
                        }
                    });
                    arrayList.add(ofInt);
                }
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.setInterpolator(new DecelerateInterpolator());
        this.A00.setDuration(250L);
        this.A00.addListener(animatorListener);
        this.A00.playTogether(arrayList);
        this.A00.start();
    }

    @Override // X.C0MK
    public void A5V(C07610Yz c07610Yz) {
        this.A0l = c07610Yz.A01;
        this.A0b.getFilter().filter(this.A0l);
    }

    @Override // X.C0MJ
    public String A8Q() {
        return A0F(R.string.menuitem_new_text_status);
    }

    @Override // X.C0MJ
    public Drawable A8R() {
        return C02180Ae.A0O(A00(), R.drawable.ic_text_status_compose, R.color.fabSecondaryContent);
    }

    @Override // X.C0MJ
    public String AB1() {
        return A0F(R.string.menuitem_new_status);
    }

    @Override // X.C0MJ
    public Drawable AB2() {
        return C02180Ae.A0O(A00(), R.drawable.ic_camera, R.color.white);
    }

    @Override // X.C0MJ
    public void AHf() {
        Intent intent = new Intent(((Hilt_StatusesFragment) this).A00, TextStatusComposerActivity.class);
        intent.putExtra("origin", 4);
        A0i(intent);
    }

    @Override // X.C0MJ
    public void ALg() {
        A15();
    }

    @Override // X.C0MK
    public void ATp(boolean z) {
        this.A0t = z;
        this.A0b.getFilter().filter(this.A0l);
    }

    @Override // X.C0MK
    public void ATq(boolean z) {
        this.A0u = z;
        if (z) {
            C000500h c000500h = this.A0K;
            c000500h.A0D().putLong("status_tab_last_opened_time", this.A0H.A05()).apply();
            A13();
            if (this.A0Q.A0C(249)) {
                this.A0k.AS1(new RunnableEBaseShape6S0100000_I0_6(this, 28));
                return;
            }
            return;
        }
        C2DD c2dd = this.A0d;
        if (c2dd.A04.A00) {
            C47252Am c47252Am = c2dd.A05;
            c47252Am.A01.post(new RunnableEBaseShape6S0100000_I0_6(c47252Am.A03, 31));
            C48242Em c48242Em = c2dd.A02.A00;
            if (c48242Em != null) {
                c48242Em.A00 = 1;
            }
            C2DE c2de = c2dd.A04;
            c2de.A01 = false;
            c2de.A00 = false;
            c2dd.A00();
        }
        this.A0c.A02();
        if (this.A0v) {
            this.A0s = true;
            this.A0b.getFilter().filter(this.A0l);
        }
        C53132bw c53132bw = this.A0g;
        if (c53132bw != null) {
            Log.i("statusdownload/cancel-all-status-downloads");
            C42451vl c42451vl = c53132bw.A02;
            Iterator it = ((AbstractCollection) c42451vl.A04()).iterator();
            while (it.hasNext()) {
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) it.next();
                if (C003101m.A0Z(anonymousClass097.A0n.A00)) {
                    c42451vl.A07(anonymousClass097, false, false);
                }
            }
            c53132bw.A03.clear();
            c53132bw.A00 = null;
            c53132bw.A01 = null;
            return;
        }
        throw null;
    }
}
