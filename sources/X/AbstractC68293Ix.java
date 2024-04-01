package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Date;

/* renamed from: X.3Ix  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC68293Ix extends AnonymousClass337 {
    public final FrameLayout A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final C2N3 A05;
    public final C2S1 A06;
    public final C002301c A07;
    public final Date A08;

    public AbstractC68293Ix(C018508q c018508q, C02L c02l, C018308n c018308n, C05W c05w, C002301c c002301c, AnonymousClass272 anonymousClass272, View view, C2N3 c2n3, C2S1 c2s1) {
        super(c02l, c018308n, c05w, view);
        this.A07 = c002301c;
        this.A00 = (FrameLayout) view.findViewById(R.id.catalog_item_view);
        this.A01 = (ImageView) view.findViewById(R.id.catalog_list_product_image);
        this.A04 = (TextEmojiLabel) view.findViewById(R.id.catalog_list_product_title);
        this.A02 = (TextView) view.findViewById(R.id.catalog_list_product_price);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.catalog_list_product_description);
        this.A05 = c2n3;
        this.A06 = c2s1;
        this.A08 = new Date();
    }
}
