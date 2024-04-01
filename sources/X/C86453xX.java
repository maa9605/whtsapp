package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.Hilt_StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import java.util.List;

/* renamed from: X.3xX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86453xX extends C2C7 {
    public final /* synthetic */ StickerStoreMyTabFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86453xX(StickerStoreMyTabFragment stickerStoreMyTabFragment, List list) {
        super(stickerStoreMyTabFragment, list);
        this.A00 = stickerStoreMyTabFragment;
    }

    @Override // X.C2C7, X.AbstractC04890Mh
    public int A0C() {
        int A0C = super.A0C();
        return A0C > 0 ? A0C + 1 : A0C;
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return A0C() - 1 == i ? 1 : 0;
    }

    @Override // X.C2C7, X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == 1) {
            final View inflate = LayoutInflater.from(((Hilt_StickerStoreMyTabFragment) this.A00).A00).inflate(R.layout.sticker_store_my_drag_footer, viewGroup, false);
            return new C0TS(inflate) { // from class: X.3r0
            };
        }
        return super.A0E(viewGroup, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r6.A04.size() != 0) goto L17;
     */
    @Override // X.C2C7, X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A0D(r9)
            if (r0 != 0) goto L9a
            X.3r7 r8 = (X.C82813r7) r8
            super.A0F(r8, r9)
            java.util.List r0 = r7.A00
            java.lang.Object r6 = r0.get(r9)
            X.1vt r6 = (X.C42531vt) r6
            com.whatsapp.CircularProgressBar r2 = r8.A0G
            boolean r0 = r6.A0N
            r5 = 0
            if (r0 == 0) goto L23
            java.util.List r0 = r6.A04
            int r1 = r0.size()
            r0 = 0
            if (r1 == 0) goto L25
        L23:
            r0 = 8
        L25:
            r2.setVisibility(r0)
            android.widget.ImageView r3 = r8.A06
            r0 = 2131232148(0x7f080594, float:1.8080397E38)
            r3.setImageResource(r0)
            android.widget.ImageView r4 = r8.A07
            r0 = 2131232152(0x7f080598, float:1.8080405E38)
            r4.setImageResource(r0)
            boolean r0 = r6.A01()
            r1 = 4
            if (r0 == 0) goto La6
            r3.setVisibility(r1)
            r4.setVisibility(r1)
            android.view.View r0 = r8.A04
            r0.setVisibility(r5)
            boolean r0 = r6.A05
            if (r0 == 0) goto L9b
            android.widget.TextView r0 = r8.A0D
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r8.A09
            r0.setVisibility(r5)
        L58:
            com.whatsapp.stickers.StickerStoreMyTabFragment r2 = r7.A00
            r0 = 2131889992(0x7f120f48, float:1.9414663E38)
            java.lang.String r0 = r2.A0F(r0)
            r3.setContentDescription(r0)
            r1 = 18
            com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1
            r0.<init>(r7, r6, r1)
            r3.setOnClickListener(r0)
            r0 = 2131890007(0x7f120f57, float:1.9414694E38)
            java.lang.String r0 = r2.A0F(r0)
            r4.setContentDescription(r0)
            r1 = 1
            r4.setLongClickable(r1)
            X.3Xv r0 = X.View$OnClickListenerC71883Xv.A00
            r4.setOnClickListener(r0)
            X.3Xw r0 = new X.3Xw
            r0.<init>()
            r4.setOnTouchListener(r0)
            r3 = 2131886130(0x7f120032, float:1.940683E38)
            X.0AV[] r2 = new X.C0AV[r1]
            r1 = 32
            X.0AV r0 = new X.0AV
            r0.<init>(r1, r3)
            r2[r5] = r0
            X.AnonymousClass088.A1W(r4, r2)
        L9a:
            return
        L9b:
            android.widget.TextView r0 = r8.A0D
            r0.setVisibility(r5)
            android.widget.ProgressBar r0 = r8.A09
            r0.setVisibility(r1)
            goto L58
        La6:
            r3.setVisibility(r5)
            r4.setVisibility(r5)
            android.view.View r0 = r8.A04
            r0.setVisibility(r1)
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86453xX.A0F(X.0TS, int):void");
    }
}
