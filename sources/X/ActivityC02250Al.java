package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.0Al */
/* loaded from: classes.dex */
public class ActivityC02250Al extends AbstractActivityC02260Am {
    public ListAdapter A00;
    public ListView A01;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public boolean A02 = false;
    public final Runnable A05 = new Runnable() { // from class: X.1Je
        {
            ActivityC02250Al.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListView listView = ActivityC02250Al.this.A01;
            listView.focusableViewAvailable(listView);
        }
    };
    public final AdapterView.OnItemClickListener A04 = new AdapterView.OnItemClickListener() { // from class: X.1Jd
        {
            ActivityC02250Al.this = this;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        }
    };

    @Override // X.ActivityC02320As
    public void A0g() {
        super.A0g();
        View findViewById = findViewById(16908292);
        ListView listView = (ListView) findViewById(16908298);
        this.A01 = listView;
        if (listView != null) {
            if (findViewById != null) {
                listView.setEmptyView(findViewById);
            }
            this.A01.setOnItemClickListener(this.A04);
            if (this.A02) {
                A1Q(this.A00);
            }
            this.A03.post(this.A05);
            this.A02 = true;
            return;
        }
        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
    }

    public ListView A1P() {
        if (this.A01 == null) {
            setContentView(17367060);
        }
        ListView listView = this.A01;
        if (listView != null) {
            return listView;
        }
        throw null;
    }

    public void A1Q(ListAdapter listAdapter) {
        synchronized (this) {
            if (this.A01 == null) {
                setContentView(17367060);
            }
            this.A00 = listAdapter;
            this.A01.setAdapter(listAdapter);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A03.removeCallbacks(this.A05);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        if (this.A01 == null) {
            setContentView(17367060);
        }
        super.onRestoreInstanceState(bundle);
    }
}
