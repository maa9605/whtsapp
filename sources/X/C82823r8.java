package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* renamed from: X.3r8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82823r8 implements C2C8 {
    public final String A00;
    public final WeakReference A01;

    public C82823r8(ImageView imageView, String str) {
        this.A01 = new WeakReference(imageView);
        this.A00 = str;
        imageView.setTag(str);
    }

    @Override // X.C2C8
    public void ALK(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView == null || !this.A00.equals(imageView.getTag())) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // X.C2C8
    public void ALR() {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView == null || !this.A00.equals(imageView.getTag())) {
            return;
        }
        imageView.setImageResource(R.drawable.selector_sticker_pack_error);
    }

    @Override // X.C2C8
    public void ALW(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView == null || !this.A00.equals(imageView.getTag())) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }
}
