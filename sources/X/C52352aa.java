package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2aa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52352aa implements InterfaceC52362ab {
    public final C0L7 A00;
    public final C06C A01;

    public C52352aa(C0L7 c0l7) {
        this.A00 = c0l7;
        this.A01 = null;
    }

    public C52352aa(C0L7 c0l7, C06C c06c) {
        this.A00 = c0l7;
        this.A01 = c06c;
    }

    @Override // X.InterfaceC52362ab
    public void AUd(ImageView imageView, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && !z) {
                if (drawable instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    if (layerDrawable.getNumberOfLayers() > 0) {
                        drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
                    }
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(bitmap)});
                transitionDrawable.setCrossFadeEnabled(false);
                transitionDrawable.startTransition(300);
                imageView.setImageDrawable(transitionDrawable);
                return;
            }
            imageView.setImageBitmap(bitmap);
            return;
        }
        AUp(imageView);
    }

    @Override // X.InterfaceC52362ab
    public void AUp(ImageView imageView) {
        int A03;
        C06C c06c = this.A01;
        if (c06c == null) {
            A03 = R.drawable.avatar_contact;
        } else {
            A03 = this.A00.A03(c06c);
        }
        C0L7 c0l7 = this.A00;
        Bitmap A00 = c0l7.A00.A00(imageView.getContext(), A03);
        if ((imageView.getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) imageView.getDrawable()).getBitmap() == A00) {
            return;
        }
        imageView.setImageBitmap(A00);
    }
}
