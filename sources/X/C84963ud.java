package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3ud  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84963ud implements InterfaceC52362ab {
    public final C0L7 A00 = C0L7.A02();

    @Override // X.InterfaceC52362ab
    public void AUd(ImageView imageView, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            AUp(imageView);
        }
    }

    @Override // X.InterfaceC52362ab
    public void AUp(ImageView imageView) {
        C0L7 c0l7 = this.A00;
        imageView.setImageBitmap(c0l7.A00.A00(imageView.getContext(), R.drawable.avatar_contact));
    }
}
