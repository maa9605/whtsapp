package androidx.fragment.app;

import X.C0BA;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;

/* loaded from: classes.dex */
public class ListFragment extends C0BA {
    public View A00;
    public View A01;
    public View A02;
    public ListAdapter A03;
    public ListView A04;
    public TextView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final Runnable A09 = new Runnable() { // from class: X.0d1
        {
            ListFragment.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.A04;
            listView.focusableViewAvailable(listView);
        }
    };
    public final AdapterView.OnItemClickListener A08 = new AdapterView.OnItemClickListener() { // from class: X.0d2
        {
            ListFragment.this = this;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (ListFragment.this == null) {
                throw null;
            }
        }
    };

    @Override // X.C0BA
    public void A0r() {
        this.A07.removeCallbacks(this.A09);
        this.A04 = null;
        this.A06 = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        A0x();
    }

    public final void A0x() {
        if (this.A04 != null) {
            return;
        }
        View view = this.A0A;
        if (view != null) {
            if (view instanceof ListView) {
                this.A04 = (ListView) view;
            } else {
                TextView textView = (TextView) view.findViewById(16711681);
                this.A05 = textView;
                if (textView == null) {
                    this.A00 = view.findViewById(16908292);
                } else {
                    textView.setVisibility(8);
                }
                this.A02 = view.findViewById(16711682);
                this.A01 = view.findViewById(16711683);
                View findViewById = view.findViewById(16908298);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                ListView listView = (ListView) findViewById;
                this.A04 = listView;
                View view2 = this.A00;
                if (view2 != null) {
                    listView.setEmptyView(view2);
                }
            }
            this.A06 = true;
            this.A04.setOnItemClickListener(this.A08);
            ListAdapter listAdapter = this.A03;
            if (listAdapter != null) {
                this.A03 = null;
                A0y(listAdapter);
            } else if (this.A02 != null) {
                A0z(false, false);
            }
            this.A07.post(this.A09);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }

    public void A0y(ListAdapter listAdapter) {
        boolean z = this.A03 != null;
        this.A03 = listAdapter;
        ListView listView = this.A04;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.A06 || z) {
                return;
            }
            A0z(true, A05().getWindowToken() != null);
        }
    }

    public final void A0z(boolean z, boolean z2) {
        A0x();
        View view = this.A02;
        if (view != null) {
            if (this.A06 == z) {
                return;
            }
            this.A06 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(A0a(), 17432577));
                    this.A01.startAnimation(AnimationUtils.loadAnimation(A0a(), 17432576));
                } else {
                    view.clearAnimation();
                    this.A01.clearAnimation();
                }
                this.A02.setVisibility(8);
                this.A01.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(A0a(), 17432576));
                this.A01.startAnimation(AnimationUtils.loadAnimation(A0a(), 17432577));
            } else {
                view.clearAnimation();
                this.A01.clearAnimation();
            }
            this.A02.setVisibility(0);
            this.A01.setVisibility(8);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }
}
