package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.32x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C643232x extends C0TS {
    public View A00;
    public ThumbnailButton A01;
    public final /* synthetic */ CatalogCarouselDetailImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C643232x(CatalogCarouselDetailImageView catalogCarouselDetailImageView, View view) {
        super(view);
        this.A02 = catalogCarouselDetailImageView;
        this.A00 = C0AT.A0D(view, R.id.product_detail_image_container);
        this.A01 = (ThumbnailButton) C0AT.A0D(view, R.id.product_detail_image);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r7 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0C(int r10, int r11, boolean r12) {
        /*
            r9 = this;
            if (r11 != 0) goto L7a
            r2 = 0
        L4:
            r8 = 1
            r7 = 0
            if (r10 >= r11) goto L9
            r7 = 1
        L9:
            if (r10 == r11) goto Lc
            r8 = 0
        Lc:
            android.view.View r0 = r9.A00
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            r1 = -1
            r4.height = r1
            if (r12 == 0) goto L1a
            r0 = -2
            if (r7 != 0) goto L1b
        L1a:
            r0 = -1
        L1b:
            r4.width = r0
            android.view.View r0 = r9.A00
            r0.setLayoutParams(r4)
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A01
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            r4 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4a
            com.whatsapp.biz.catalog.CatalogCarouselDetailImageView r0 = r9.A02
            android.content.Context r0 = r0.getContext()
            android.graphics.Point r0 = X.AnonymousClass088.A0M(r0)
            int r0 = r0.x
            r6.height = r0
            double r1 = (double) r0
            double r1 = r1 * r4
            int r0 = (int) r1
            r6.width = r0
        L44:
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A01
            r0.setLayoutParams(r6)
            return
        L4a:
            r4 = 4611280694460924559(0x3ffe8f5c28f5c28f, double:1.91)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L67
            com.whatsapp.biz.catalog.CatalogCarouselDetailImageView r0 = r9.A02
            android.content.Context r0 = r0.getContext()
            android.graphics.Point r0 = X.AnonymousClass088.A0M(r0)
            int r0 = r0.x
            r6.width = r0
            double r1 = (double) r0
            double r1 = r1 / r4
            int r0 = (int) r1
            r6.height = r0
            goto L44
        L67:
            if (r8 == 0) goto L6e
            r6.height = r1
            r6.width = r1
            goto L44
        L6e:
            r0 = -2
            if (r7 == 0) goto L72
            r0 = -1
        L72:
            r6.height = r0
            if (r7 == 0) goto L77
            r1 = -2
        L77:
            r6.width = r1
            goto L44
        L7a:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = (double) r10
            double r2 = r2 * r0
            double r0 = (double) r11
            double r2 = r2 / r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643232x.A0C(int, int, boolean):void");
    }
}
