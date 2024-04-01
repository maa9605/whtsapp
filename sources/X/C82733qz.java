package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;

/* renamed from: X.3qz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82733qz extends C0TS {
    public final /* synthetic */ StickerStoreFeaturedTabFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82733qz(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment, View view) {
        super(view);
        this.A00 = stickerStoreFeaturedTabFragment;
        C003301p.A06((TextView) view.findViewById(R.id.get_more_packs_text));
        view.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 19));
    }
}
