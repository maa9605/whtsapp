package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* renamed from: X.46l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C892946l {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass087 A01;
    public final /* synthetic */ AnonymousClass081 A02;

    public C892946l(AnonymousClass081 anonymousClass081, AnonymousClass087 anonymousClass087, ImageView imageView) {
        this.A02 = anonymousClass081;
        this.A01 = anonymousClass087;
        this.A00 = imageView;
    }

    public void A00(Bitmap bitmap) {
        AnonymousClass081 anonymousClass081 = this.A02;
        if (anonymousClass081 == null) {
            this.A00.setImageBitmap(bitmap);
            return;
        }
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(AnonymousClass088.A06(anonymousClass081, this.A01), PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        this.A00.setImageBitmap(createBitmap);
    }
}
