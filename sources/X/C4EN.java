package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.4EN */
/* loaded from: classes3.dex */
public class C4EN extends AbstractC04890Mh implements C1LE {
    public List A00;
    public final Context A01;
    public final C002301c A02;
    public final C0C9 A03;
    public final C2OS A04;
    public final C014406v A05;
    public final C49Y A06;
    public final C900249j A07;
    public final C03750Gx A08;

    public C4EN(Context context, C03750Gx c03750Gx, C002301c c002301c, C014406v c014406v, C0C9 c0c9, List list, C900249j c900249j, C49Y c49y, C2OS c2os) {
        this.A01 = context;
        this.A00 = new ArrayList(list);
        this.A04 = c2os;
        this.A05 = c014406v;
        this.A03 = c0c9;
        this.A02 = c002301c;
        this.A08 = c03750Gx;
        this.A07 = c900249j;
        this.A06 = c49y;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        AnonymousClass093 anonymousClass093 = (AnonymousClass093) this.A00.get(i);
        if (anonymousClass093.A02 == 1000 && anonymousClass093.A0N) {
            return 2000;
        }
        return SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == 2000) {
            return new C0TS(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_interop_shimmer, viewGroup, false)) { // from class: X.4EL
            };
        }
        return new C4EM(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_row_container, viewGroup, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
        if (r6.A02(((X.AnonymousClass093) r9.A00.get(r11)).A04).equals(r6.A02(((X.AnonymousClass093) r9.A00.get(r5)).A04)) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
        if (r5 == r9.A00.size()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:
        r10.A00.findViewById(com.google.android.search.verification.client.R.id.divider).setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
        r6 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r9.A06).A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
        r0 = r9.A03.A0E(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ca, code lost:
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cc, code lost:
        r5 = r0.A0G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
        r2 = r9.A08;
        r3 = r2.A0G(r7);
        r1 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
        if (X.C09940f2.A04(r5, r6, r1) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00de, code lost:
        r2 = r10.A00;
        r2.A09.A06(r5, ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r10.A01.A06).A0K, false, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ed, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ee, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f4, code lost:
        if (X.C09940f2.A04(r3, r6, r1) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
        r2 = r10.A00;
        r2.A0A.A06(r3, ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r10.A01.A06).A0K, false, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0106, code lost:
        r3 = r2.A0C(r7);
        r2 = r10.A00;
        r2.A08.A06(r3, ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r10.A01.A06).A0K, false, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0119, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r10, int r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4EN.A0F(X.0TS, int):void");
    }

    @Override // X.C1LE
    public int A9A(int i) {
        return ((C900349k) ((PaymentTransactionHistoryActivity) this.A06).A0S.get(i)).count;
    }

    @Override // X.C1LE
    public int AAR() {
        return ((PaymentTransactionHistoryActivity) this.A06).A0S.size();
    }

    @Override // X.C1LE
    public long AAS(int i) {
        return -((Calendar) ((PaymentTransactionHistoryActivity) this.A06).A0S.get(i)).getTimeInMillis();
    }

    @Override // X.C1LE
    public void AHy(C0TS c0ts, int i) {
        ((C4EK) c0ts).A00.setText(((PaymentTransactionHistoryActivity) this.A06).A0S.get(i).toString());
    }

    @Override // X.C1LE
    public C0TS AJ6(ViewGroup viewGroup) {
        Context context = this.A01;
        View inflate = C018308n.A00(context).getLayoutInflater().inflate(R.layout.transaction_history_section_row, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(C02160Ac.A00(context, R.color.primary_surface));
        return new C4EK(inflate);
    }

    @Override // X.C1LE
    public boolean AP9(C0TS c0ts, int i, MotionEvent motionEvent) {
        return false;
    }
}
