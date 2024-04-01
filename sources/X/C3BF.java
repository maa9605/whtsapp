package X;

import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import java.util.ArrayList;

/* renamed from: X.3BF  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3BF extends AbstractC04890Mh {
    public final ArrayList A00 = new ArrayList();
    public final /* synthetic */ GalleryPickerFragment A01;

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        return i;
    }

    public C3BF(GalleryPickerFragment galleryPickerFragment) {
        this.A01 = galleryPickerFragment;
        A0B(true);
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        GalleryPickerFragment galleryPickerFragment = this.A01;
        return new C3BI(galleryPickerFragment, galleryPickerFragment.A04().inflate(R.layout.gallery_picker_item, (ViewGroup) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r10, int r11) {
        /*
            r9 = this;
            X.3BI r10 = (X.C3BI) r10
            java.util.ArrayList r0 = r9.A00
            java.lang.Object r7 = r0.get(r11)
            X.2vW r7 = (X.C61052vW) r7
            r10.A00 = r7
            android.widget.TextView r3 = r10.A03
            com.whatsapp.gallerypicker.GalleryPickerFragment r6 = r10.A05
            X.01c r0 = r6.A0E
            java.text.NumberFormat r2 = r0.A0G()
            int r0 = r7.A00
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            r3.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r10.A04
            java.lang.String r0 = r7.A05
            r1.A03(r0)
            android.widget.ImageView r2 = r10.A01
            int r8 = r7.A02
            if (r8 == 0) goto L87
            r0 = 1
            if (r8 == r0) goto L83
            r0 = 2
            if (r8 == r0) goto L7f
            r0 = 4
            if (r8 == r0) goto L87
            r0 = 5
            if (r8 == r0) goto L83
            r0 = 6
            if (r8 == r0) goto L7f
            r0 = 7
            if (r8 == r0) goto L87
            r1 = 9
            r0 = 2131231280(0x7f080230, float:1.8078637E38)
            if (r8 == r1) goto L49
            r0 = 2131231278(0x7f08022e, float:1.8078633E38)
        L49:
            r2.setImageResource(r0)
            android.widget.ImageView r5 = r10.A02
            java.lang.Object r4 = r5.getTag()
            X.2vg r4 = (X.InterfaceC61152vg) r4
            if (r4 == 0) goto L8b
            java.lang.String r3 = r4.ADR()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r1 = "-"
            r2.append(r1)
            java.lang.String r0 = r7.A04
            r2.append(r0)
            r2.append(r1)
            int r0 = r7.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L8b
            return
        L7f:
            r0 = 2131231278(0x7f08022e, float:1.8078633E38)
            goto L49
        L83:
            r0 = 2131231279(0x7f08022f, float:1.8078635E38)
            goto L49
        L87:
            r0 = 2131231277(0x7f08022d, float:1.807863E38)
            goto L49
        L8b:
            X.2a7 r0 = r6.A0H
            r0.A01(r4)
            X.2a4 r0 = r7.A03
            X.3BG r2 = new X.3BG
            r2.<init>()
            X.3BH r1 = new X.3BH
            r1.<init>()
            r5.setTag(r2)
            X.2a7 r0 = r6.A0H
            r0.A02(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BF.A0F(X.0TS, int):void");
    }
}
