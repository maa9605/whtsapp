package com.whatsapp.group;

import X.ActivityC02250Al;
import X.C002301c;
import X.C02160Ac;
import X.C07630Zb;
import X.C0AT;
import X.C0DJ;
import X.C0We;
import X.C2MB;
import X.C61722wc;
import X.InterfaceC07650Zd;
import android.graphics.Canvas;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoLayout;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;

/* loaded from: classes2.dex */
public class GroupParticipantsSearchFragment extends Hilt_GroupParticipantsSearchFragment {
    public ChatInfoLayout A00;
    public C002301c A01;
    public C61722wc A02;
    public C2MB A03;
    public boolean A04;

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        this.A0U = true;
        final GroupChatInfo groupChatInfo = (GroupChatInfo) A09();
        View A05 = A05();
        AbsListView absListView = (AbsListView) A05.findViewById(16908298);
        C61722wc c61722wc = groupChatInfo.A0u;
        this.A02 = c61722wc;
        absListView.setAdapter((ListAdapter) c61722wc);
        C61722wc c61722wc2 = this.A02;
        boolean z = c61722wc2.A03;
        this.A04 = z;
        if (!z) {
            c61722wc2.A03 = true;
            c61722wc2.notifyDataSetChanged();
        }
        groupChatInfo.registerForContextMenu(absListView);
        absListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.2wU
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                groupChatInfo.onListItemClicked(view);
            }
        });
        absListView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2wi
            public int A00 = 0;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView2, int i, int i2, int i3) {
            }

            {
                GroupParticipantsSearchFragment.this = this;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView2, int i) {
                int i2 = this.A00;
                if (i2 == 0 && i != i2) {
                    GroupParticipantsSearchFragment.this.A03.A01(absListView2);
                }
                this.A00 = i;
            }
        });
        View findViewById = A05.findViewById(R.id.search_holder);
        C07630Zb.A00(findViewById);
        final SearchView searchView = (SearchView) findViewById.findViewById(R.id.search_view);
        ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(C02160Ac.A00(((Hilt_GroupParticipantsSearchFragment) this).A00, R.color.search_text_color));
        searchView.setIconifiedByDefault(false);
        View A0y = A0y();
        if (A0y == null) {
            searchView.setIconified(false);
        } else {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, A0y.getTop() - absListView.getPaddingTop(), 0.0f);
            translateAnimation.setDuration(240L);
            translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3Ch
                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    searchView.setIconified(false);
                }
            });
            absListView.startAnimation(translateAnimation);
        }
        searchView.setQueryHint(A0F(R.string.search_hint));
        searchView.A0B = new InterfaceC07650Zd() { // from class: X.3Ci
            @Override // X.InterfaceC07650Zd
            public boolean ANY(String str) {
                return false;
            }

            @Override // X.InterfaceC07650Zd
            public boolean ANX(String str) {
                groupChatInfo.A0u.A04.filter(str);
                return false;
            }
        };
        ((ImageView) searchView.findViewById(R.id.search_mag_icon)).setImageDrawable(new InsetDrawable(C02160Ac.A03(((Hilt_GroupParticipantsSearchFragment) this).A00, R.drawable.ic_back_teal)) { // from class: X.2wj
            @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
            }
        });
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation2.setDuration(240L);
        findViewById.startAnimation(translateAnimation2);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.search_back);
        imageView.setImageDrawable(new C0We(this.A01, C02160Ac.A03(((Hilt_GroupParticipantsSearchFragment) this).A00, R.drawable.ic_back_teal)));
        imageView.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this, 36));
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.group_participants_search_fragment, viewGroup, false);
    }

    public final View A0y() {
        ActivityC02250Al activityC02250Al = (ActivityC02250Al) A09();
        View view = null;
        if (activityC02250Al != null) {
            int childCount = activityC02250Al.A1P().getChildCount();
            for (int i = 0; i < childCount && view == null; i++) {
                View childAt = activityC02250Al.A1P().getChildAt(i);
                if (childAt.getTag() != null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public void A0z() {
        View view = this.A0A;
        if (view == null) {
            return;
        }
        View A0y = A0y();
        SearchView searchView = (SearchView) view.findViewById(R.id.search_view);
        searchView.A0H("");
        searchView.setIconified(true);
        GroupChatInfo groupChatInfo = (GroupChatInfo) A09();
        if (groupChatInfo != null) {
            groupChatInfo.A0u.A04.filter(null);
        }
        View findViewById = view.findViewById(R.id.search_holder);
        findViewById.setVisibility(8);
        C61722wc c61722wc = this.A02;
        boolean z = this.A04;
        if (c61722wc.A03 != z) {
            c61722wc.A03 = z;
            c61722wc.notifyDataSetChanged();
        }
        if (A0y != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(240L);
            findViewById.startAnimation(alphaAnimation);
            View findViewById2 = view.findViewById(16908298);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, A0y.getTop() - findViewById2.getPaddingTop());
            translateAnimation.setDuration(240L);
            translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3Cj
                {
                    GroupParticipantsSearchFragment.this = this;
                }

                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    GroupParticipantsSearchFragment.this.A0H.A0s();
                }
            });
            findViewById2.startAnimation(translateAnimation);
        } else {
            this.A0H.A0s();
        }
        C0AT.A0V(this.A00, 1);
    }
}
