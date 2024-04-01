package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.4Du  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91144Du extends AbstractC04890Mh implements C1LE {
    public Context A00;
    public List A02 = new ArrayList();
    public List A01 = new ArrayList();

    public C91144Du(Context context) {
        this.A00 = context;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A02.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C4HP(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payout_history_row_item, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C4HP c4hp = (C4HP) c0ts;
        c4hp.A0C((AbstractC900449l) this.A02.get(i), i);
        if (((C91374Er) this.A02.get(i)).A02) {
            return;
        }
        c4hp.A00.setVisibility(8);
    }

    @Override // X.C1LE
    public int A9A(int i) {
        return ((C900349k) this.A01.get(i)).count;
    }

    @Override // X.C1LE
    public int AAR() {
        return this.A01.size();
    }

    @Override // X.C1LE
    public long AAS(int i) {
        return -((Calendar) this.A01.get(i)).getTimeInMillis();
    }

    @Override // X.C1LE
    public void AHy(C0TS c0ts, int i) {
        ((C91134Dt) c0ts).A00.setText(this.A01.get(i).toString());
    }

    @Override // X.C1LE
    public C0TS AJ6(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.transaction_history_section_row, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(C02160Ac.A00(this.A00, R.color.primary_surface));
        return new C91134Dt(inflate);
    }

    @Override // X.C1LE
    public boolean AP9(C0TS c0ts, int i, MotionEvent motionEvent) {
        return false;
    }
}
