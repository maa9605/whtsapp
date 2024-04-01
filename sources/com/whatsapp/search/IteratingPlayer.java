package com.whatsapp.search;

import X.AbstractC09080cc;
import X.AbstractC15200oF;
import X.C018508q;
import X.C0C1;
import X.C0MW;
import X.InterfaceC09590eN;
import android.view.View;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.search.IteratingPlayer;

/* loaded from: classes.dex */
public class IteratingPlayer implements InterfaceC09590eN, C0MW {
    public boolean A03;
    public final RecyclerView A05;
    public final C018508q A06;
    public int A01 = 0;
    public int A02 = 0;
    public int A00 = 0;
    public final Runnable A07 = new RunnableEBaseShape6S0100000_I0_6(this, 5);
    public final AbstractC15200oF A04 = new AbstractC15200oF() { // from class: X.3nZ
        {
            IteratingPlayer.this = this;
        }

        @Override // X.AbstractC15200oF
        public void A00(RecyclerView recyclerView, int i) {
            IteratingPlayer iteratingPlayer = IteratingPlayer.this;
            if (i == 0) {
                iteratingPlayer.A02();
                iteratingPlayer.A03(iteratingPlayer.A01);
                iteratingPlayer.A00();
                return;
            }
            iteratingPlayer.A01();
        }
    };

    public IteratingPlayer(C018508q c018508q, RecyclerView recyclerView) {
        this.A06 = c018508q;
        this.A05 = recyclerView;
    }

    public final void A00() {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        C018508q c018508q = this.A06;
        c018508q.A02.postDelayed(this.A07, 2000L);
    }

    public final void A01() {
        this.A03 = false;
        AbstractC09080cc abstractC09080cc = (AbstractC09080cc) this.A05.A0D(this.A00, false);
        if (abstractC09080cc != null) {
            abstractC09080cc.A0G(false);
        }
        C018508q c018508q = this.A06;
        c018508q.A02.removeCallbacks(this.A07);
    }

    public final void A02() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A05.A0S;
        if (linearLayoutManager == null) {
            A00();
            return;
        }
        this.A01 = linearLayoutManager.A1F();
        this.A02 = linearLayoutManager.A1H();
    }

    public final void A03(int i) {
        if (this.A01 <= 0 && this.A02 <= 0) {
            A01();
            return;
        }
        int i2 = this.A00;
        RecyclerView recyclerView = this.A05;
        AbstractC09080cc abstractC09080cc = (AbstractC09080cc) recyclerView.A0D(i2, false);
        if (abstractC09080cc != null) {
            abstractC09080cc.A0G(false);
        }
        int min = Math.min(Math.max(i, this.A01), this.A02);
        int i3 = min;
        do {
            AbstractC09080cc abstractC09080cc2 = (AbstractC09080cc) recyclerView.A0D(i3, false);
            if (abstractC09080cc2 != null && abstractC09080cc2.A0H()) {
                AbstractC09080cc abstractC09080cc3 = (AbstractC09080cc) recyclerView.A0D(i3, false);
                if (abstractC09080cc3 != null) {
                    abstractC09080cc3.A0G(true);
                }
                this.A00 = i3;
                return;
            }
            i3++;
            int i4 = this.A02;
            if (i3 > i4) {
                i3 = this.A01;
            }
            if (min == i3 || i3 > i4) {
                break;
            }
        } while (i3 >= this.A01);
        A01();
    }

    @Override // X.InterfaceC09590eN
    public void AIQ(View view) {
        A02();
        A00();
    }

    @Override // X.InterfaceC09590eN
    public void AIR(View view) {
        A02();
    }

    @OnLifecycleEvent(C0C1.ON_START)
    public void onStart() {
        A00();
    }

    @OnLifecycleEvent(C0C1.ON_STOP)
    public void onStop() {
        A01();
    }
}
