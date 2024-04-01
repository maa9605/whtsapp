package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogImageListActivity;

/* renamed from: X.334  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass334 extends C0TS {
    public boolean A00;
    public final ImageView A01;
    public final C1M7 A02;
    public final /* synthetic */ CatalogImageListActivity A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass334(CatalogImageListActivity catalogImageListActivity, C1M7 c1m7, View view) {
        super(view);
        this.A03 = catalogImageListActivity;
        this.A02 = c1m7;
        this.A01 = (ImageView) view.findViewById(R.id.catalog_image_list_image_view);
    }
}
