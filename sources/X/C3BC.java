package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.ProductGalleryFragment;

/* renamed from: X.3BC  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3BC extends C0TS {
    public AnonymousClass092 A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final /* synthetic */ ProductGalleryFragment A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3BC(ProductGalleryFragment productGalleryFragment, View view) {
        super(view);
        this.A04 = productGalleryFragment;
        this.A01 = view.findViewById(R.id.starred_status);
        this.A02 = (ImageView) view.findViewById(R.id.thumb);
        this.A03 = (TextView) view.findViewById(R.id.title);
    }
}
