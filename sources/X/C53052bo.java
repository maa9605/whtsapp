package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2bo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53052bo implements InterfaceC43821y3 {
    public final int A00;
    public final int A01;

    @Override // X.InterfaceC43821y3
    public void AKM() {
    }

    public C53052bo(Context context) {
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.status_thumbnail_size);
        this.A00 = C02160Ac.A00(context, AnonymousClass029.A1K(context) ? R.color.statusThumbnailLoadingPlaceholder_dark : R.color.statusThumbnailLoadingPlaceholder);
    }

    @Override // X.InterfaceC43821y3
    public int ADA() {
        return this.A01;
    }

    @Override // X.InterfaceC43821y3
    public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
        if (bitmap != null) {
            ((ImageView) view).setImageBitmap(bitmap);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        createBitmap.setPixel(0, 0, this.A00);
        ((ImageView) view).setImageBitmap(createBitmap);
    }

    @Override // X.InterfaceC43821y3
    public void AUo(View view) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(R.drawable.circle_shade_big);
        }
    }
}
