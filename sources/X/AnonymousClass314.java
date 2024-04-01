package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.314  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass314 extends BitmapDrawable {
    public final AnonymousClass097 A00;

    public AnonymousClass314(AnonymousClass097 anonymousClass097, Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.A00 = anonymousClass097;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C09H c09h = this.A00.A02;
        if (c09h != null) {
            int i = c09h.A06;
            return i <= 0 ? super.getIntrinsicHeight() : i;
        }
        throw null;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C09H c09h = this.A00.A02;
        if (c09h != null) {
            int i = c09h.A08;
            return i <= 0 ? super.getIntrinsicWidth() : i;
        }
        throw null;
    }
}
