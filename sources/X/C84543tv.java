package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GroupCallLogActivity;
import java.util.List;

/* renamed from: X.3tv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84543tv extends AbstractC04890Mh {
    public int A00 = Integer.MAX_VALUE;
    public List A01;
    public final /* synthetic */ GroupCallLogActivity A02;

    public C84543tv(GroupCallLogActivity groupCallLogActivity) {
        this.A02 = groupCallLogActivity;
    }

    public static void A00(C84543tv c84543tv, AbstractC005302j abstractC005302j) {
        int i = 0;
        for (C0D4 c0d4 : c84543tv.A01) {
            if (c0d4.A02.equals(abstractC005302j)) {
                C84543tv c84543tv2 = c84543tv.A02.A0C;
                if (i >= c84543tv.A00) {
                    i++;
                }
                c84543tv2.A02(i);
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1 == 0) goto L10;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0C() {
        /*
            r3 = this;
            java.util.List r0 = r3.A01
            int r2 = r0.size()
            com.whatsapp.voipcalling.GroupCallLogActivity r0 = r3.A02
            X.01B r0 = r0.A00
            boolean r0 = X.AnonymousClass029.A1O(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L1c
            int r1 = r3.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L1c
            r0 = 1
            if (r1 != 0) goto L1d
        L1c:
            r0 = 0
        L1d:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84543tv.A0C():int");
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        int i2;
        if (i < this.A00) {
            return 0;
        }
        return ((AnonymousClass029.A1O(this.A02.A00) ^ true) && i == (i2 = this.A00) && i2 > 0) ? 2 : 1;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return new C84553tw(this.A02, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_call_participant_row, viewGroup, false));
        }
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_call_participant_row_divider, viewGroup, false);
        return new C0TS(inflate) { // from class: X.3tu
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
        if (r8 != false) goto L24;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r10, int r11) {
        /*
            r9 = this;
            int r7 = r9.A0D(r11)
            r5 = 2
            if (r7 == r5) goto L87
            com.whatsapp.voipcalling.GroupCallLogActivity r4 = r9.A02
            X.01B r0 = r4.A00
            boolean r8 = X.AnonymousClass029.A1O(r0)
            X.3tw r10 = (X.C84553tw) r10
            X.01B r0 = r4.A00
            boolean r0 = X.AnonymousClass029.A1O(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L23
            int r0 = r9.A00
            if (r11 <= r0) goto L23
            if (r0 == 0) goto L23
            int r11 = r11 + (-1)
        L23:
            java.util.List r0 = r9.A01
            java.lang.Object r6 = r0.get(r11)
            X.0D4 r6 = (X.C0D4) r6
            java.util.List r0 = r9.A01
            java.lang.Object r0 = r0.get(r11)
            X.0D4 r0 = (X.C0D4) r0
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.05W r0 = r4.A01
            X.06C r3 = r0.A0A(r1)
            X.0Zn r1 = r4.A05
            android.widget.ImageView r0 = r10.A02
            r1.A02(r3, r0)
            android.widget.ImageView r2 = r10.A02
            r1 = 3
            com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1 r0 = new com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1
            r0.<init>(r9, r10, r3, r1)
            r2.setOnClickListener(r0)
            X.0Rg r1 = r10.A04
            r0 = 0
            r1.A03(r3, r0)
            r1 = 0
            r2 = 1
            if (r7 != r2) goto La3
            if (r8 != 0) goto La5
            android.widget.TextView r0 = r10.A03
            r0.setVisibility(r1)
            int r1 = r6.A00
            if (r1 == r2) goto L9a
            if (r1 == r5) goto L91
            r0 = 4
            if (r1 == r0) goto L88
            android.widget.TextView r1 = r10.A03
            r0 = 2131890731(0x7f12122b, float:1.9416162E38)
            r1.setText(r0)
        L6f:
            android.widget.ImageButton r2 = r10.A01
            r1 = 19
            com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1
            r0.<init>(r9, r3, r1)
            r2.setOnClickListener(r0)
            android.widget.ImageButton r2 = r10.A00
            r1 = 20
            com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1
            r0.<init>(r9, r3, r1)
            r2.setOnClickListener(r0)
        L87:
            return
        L88:
            android.widget.TextView r1 = r10.A03
            r0 = 2131890617(0x7f1211b9, float:1.941593E38)
            r1.setText(r0)
            goto L6f
        L91:
            android.widget.TextView r1 = r10.A03
            r0 = 2131890703(0x7f12120f, float:1.9416105E38)
            r1.setText(r0)
            goto L6f
        L9a:
            android.widget.TextView r1 = r10.A03
            r0 = 2131887776(0x7f1206a0, float:1.9410169E38)
            r1.setText(r0)
            goto L6f
        La3:
            if (r8 == 0) goto L6f
        La5:
            X.0D3 r0 = r4.A0A
            if (r0 == 0) goto L6f
            X.0aM r0 = r0.A09
            boolean r0 = r0.A03
            if (r0 != 0) goto L6f
            if (r11 != 0) goto L6f
            android.widget.TextView r0 = r10.A03
            r0.setVisibility(r1)
            android.widget.TextView r2 = r10.A03
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131100181(0x7f060215, float:1.7812736E38)
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
            android.widget.TextView r1 = r10.A03
            r0 = 2131887775(0x7f12069f, float:1.9410167E38)
            r1.setText(r0)
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84543tv.A0F(X.0TS, int):void");
    }
}
