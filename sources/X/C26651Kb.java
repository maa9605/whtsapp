package X;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: X.1Kb */
/* loaded from: classes.dex */
public class C26651Kb extends BaseAdapter {
    public final int A00;
    public final Context A01;
    public final C002301c A02;
    public final /* synthetic */ C26701Kg A03;

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public C26651Kb(C26701Kg c26701Kg, Context context, C002301c c002301c, int i) {
        this.A03 = c26701Kg;
        this.A01 = context;
        this.A02 = c002301c;
        this.A00 = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        C26701Kg c26701Kg = this.A03;
        int i = 0;
        if (c26701Kg.A03 == 0) {
            return 0;
        }
        C26691Kf[] c26691KfArr = c26701Kg.A0R;
        int i2 = this.A00;
        C26691Kf c26691Kf = c26691KfArr[i2];
        Context context = this.A01;
        int A00 = c26691Kf.A00(context);
        int i3 = c26701Kg.A03;
        int i4 = ((A00 + i3) - 1) / i3;
        if (c26701Kg.A0Q && c26691KfArr[i2].A00(context) > 0) {
            i = 1;
        }
        return i4 + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x000d, code lost:
        if (r1 != r4.A03) goto L22;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            r5 = 0
            if (r12 == 0) goto Lf
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r1 = r12.getChildCount()
            X.1Kg r4 = r10.A03
            int r0 = r4.A03
            if (r1 == r0) goto L3b
        Lf:
            X.1Kg r4 = r10.A03
            android.content.Context r0 = r4.A0G
            X.1Ka r12 = new X.1Ka
            r12.<init>(r0)
            r3 = 0
        L19:
            int r0 = r4.A03
            if (r3 >= r0) goto L34
            android.content.Context r0 = r10.A01
            X.1X5 r2 = new X.1X5
            r2.<init>(r4, r0)
            int r1 = r4.A01
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            r12.addView(r2)
            int r3 = r3 + 1
            goto L19
        L34:
            r12.setClickable(r5)
            r0 = 2
            X.C0AT.A0V(r12, r0)
        L3b:
            r3 = 0
        L3c:
            int r0 = r4.A03
            if (r3 >= r0) goto La4
            android.view.View r2 = r12.getChildAt(r3)
            X.1X5 r2 = (X.C1X5) r2
            int r8 = r4.A03
            int r8 = r8 * r11
            int r8 = r8 + r3
            X.1Kf[] r9 = r4.A0R
            int r7 = r10.A00
            r1 = r9[r7]
            android.content.Context r0 = r10.A01
            int r0 = r1.A00(r0)
            r6 = 0
            if (r8 >= r0) goto L91
            r0 = r9[r7]
            X.02O r1 = r4.A0P
            int[] r0 = r0.A01(r1, r8)
            r2.setEmoji(r0)
            r0 = 2131232082(0x7f080552, float:1.8080263E38)
            r2.setBackgroundResource(r0)
            r0 = 1
            r2.setClickable(r0)
            android.view.View$OnClickListener r0 = r4.A05
            r2.setOnClickListener(r0)
            r0 = r9[r7]
            int[] r0 = r0.A01(r1, r8)
            boolean r0 = X.C60712uv.A03(r0)
            if (r0 == 0) goto L8a
            X.1Gp r0 = new X.1Gp
            r0.<init>()
            r2.setOnLongClickListener(r0)
        L87:
            int r3 = r3 + 1
            goto L3c
        L8a:
            r2.setOnLongClickListener(r6)
            r2.setLongClickable(r5)
            goto L87
        L91:
            r2.setEmoji(r6)
            r2.setBackground(r6)
            r2.setOnClickListener(r6)
            r2.setClickable(r5)
            r2.setOnLongClickListener(r6)
            r2.setLongClickable(r5)
            goto L87
        La4:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26651Kb.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
