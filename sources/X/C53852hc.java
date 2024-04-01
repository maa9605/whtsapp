package X;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.2hc */
/* loaded from: classes2.dex */
public class C53852hc {
    public boolean A00;
    public final TextView A01;
    public final TextView A02;
    public final C018508q A03;
    public final C03320Ff A05;
    public final C05W A06;
    public final AnonymousClass008 A08;
    public final C018708s A09;
    public final C0Zn A0A;
    public final AnonymousClass012 A0B;
    public final C002301c A0C;
    public final C03360Fk A0E;
    public final C53862hd A0F;
    public final C0GA A07 = new C0GA() { // from class: X.3qG
        {
            C53852hc.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            ((AbstractC04890Mh) C53852hc.this.A0F).A01.A00();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            C53852hc.this.A0F.A0G(abstractC005302j);
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            C53852hc.this.A0F.A0G(userJid);
        }
    };
    public final C0GC A04 = new C0GC() { // from class: X.3qH
        {
            C53852hc.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            ((AbstractC04890Mh) C53852hc.this.A0F).A01.A00();
        }
    };
    public final C0GE A0D = new C0GE() { // from class: X.3qI
        {
            C53852hc.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            ((AbstractC04890Mh) C53852hc.this.A0F).A01.A00();
        }
    };
    public final Runnable A0G = new RunnableEBaseShape6S0100000_I0_6(this, 39);

    public C53852hc(AnonymousClass012 anonymousClass012, C018508q c018508q, C0L5 c0l5, C05W c05w, C018708s c018708s, C002301c c002301c, AnonymousClass008 anonymousClass008, C03320Ff c03320Ff, C000500h c000500h, C03360Fk c03360Fk, ViewGroup viewGroup) {
        this.A0B = anonymousClass012;
        this.A03 = c018508q;
        this.A06 = c05w;
        this.A09 = c018708s;
        this.A0C = c002301c;
        this.A08 = anonymousClass008;
        this.A05 = c03320Ff;
        this.A0E = c03360Fk;
        this.A0A = c0l5.A04(viewGroup.getContext());
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.status_details, viewGroup, true);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(16908298);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        TextView textView = (TextView) inflate.findViewById(16908292);
        this.A01 = textView;
        textView.setText(c000500h.A0m() ? R.string.no_one_saw_your_status : R.string.no_one_saw_your_status_because_you_disabled_read_receipts);
        this.A0F = new C53862hd(this);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.title);
        this.A02 = textView2;
        C003301p.A06(textView2);
        recyclerView.setAdapter(this.A0F);
        anonymousClass008.A01(this.A07);
        this.A05.A01(this.A04);
        this.A0E.A01(this.A0D);
    }

    public final void A00() {
        C018508q c018508q = this.A03;
        Runnable runnable = this.A0G;
        Handler handler = c018508q.A02;
        handler.removeCallbacks(runnable);
        C53862hd c53862hd = this.A0F;
        if (c53862hd.A0C() > 0) {
            long j = 0;
            for (C71683Xb c71683Xb : c53862hd.A00) {
                long j2 = c71683Xb.A00;
                if (j2 > j) {
                    j = j2;
                }
            }
            handler.postDelayed(runnable, (C02620Cd.A01(j) - System.currentTimeMillis()) + 1000);
        }
    }
}
