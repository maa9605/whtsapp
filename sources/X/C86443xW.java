package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.Hilt_StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;

/* renamed from: X.3xW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86443xW extends C2C7 {
    public Drawable.ConstantState A00;
    public final /* synthetic */ StickerStoreFeaturedTabFragment A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86443xW(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment, List list) {
        super(stickerStoreFeaturedTabFragment, list);
        this.A01 = stickerStoreFeaturedTabFragment;
    }

    @Override // X.C2C7, X.AbstractC04890Mh
    public int A0C() {
        int A0C = super.A0C();
        int i = A0C + 1;
        if (A0C <= 0) {
            return 0;
        }
        return i;
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return A0C() - 1 != i ? 0 : 1;
    }

    @Override // X.C2C7, X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == 1) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
            return new C82733qz(stickerStoreFeaturedTabFragment, LayoutInflater.from(((Hilt_StickerStoreFeaturedTabFragment) stickerStoreFeaturedTabFragment).A00).inflate(R.layout.sticker_store_get_more_footer, viewGroup, false));
        }
        return super.A0E(viewGroup, i);
    }

    @Override // X.C2C7, X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        Drawable.ConstantState constantState;
        if (A0D(i) == 0) {
            C82813r7 c82813r7 = (C82813r7) c0ts;
            super.A0F(c82813r7, i);
            C42531vt c42531vt = (C42531vt) ((C2C7) this).A00.get(i);
            int i2 = 8;
            if (c42531vt.A0K) {
                c82813r7.A05.setVisibility(0);
            } else {
                c82813r7.A05.setVisibility(8);
            }
            if (c42531vt.A01()) {
                c82813r7.A04.setVisibility(0);
                c82813r7.A06.setVisibility(8);
                c82813r7.A08.setVisibility(8);
                c82813r7.A07.setVisibility(8);
                if (c42531vt.A05) {
                    c82813r7.A0D.setVisibility(4);
                    c82813r7.A09.setVisibility(0);
                } else {
                    c82813r7.A09.setVisibility(4);
                    c82813r7.A0D.setVisibility(0);
                }
            } else if (c42531vt.A05) {
                c82813r7.A06.setVisibility(8);
                c82813r7.A04.setVisibility(4);
                ProgressBar progressBar = c82813r7.A08;
                progressBar.setVisibility(0);
                progressBar.setIndeterminate(true);
            } else if (c42531vt.A02 != null) {
                ImageView imageView = c82813r7.A06;
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.countrypicker_checkmark);
                imageView.setOnClickListener(null);
                imageView.setContentDescription(this.A01.A0F(R.string.sticker_store_downloaded_content_description));
                imageView.setClickable(false);
                imageView.setFocusable(true);
                if (this.A00 == null) {
                    this.A00 = imageView.getBackground().mutate().getConstantState();
                }
                imageView.setBackgroundResource(0);
                c82813r7.A08.setVisibility(8);
                c82813r7.A04.setVisibility(4);
            } else {
                c82813r7.A04.setVisibility(4);
                ImageView imageView2 = c82813r7.A06;
                imageView2.setVisibility(0);
                c82813r7.A08.setVisibility(8);
                imageView2.setImageResource(R.drawable.sticker_store_download);
                if (imageView2.getBackground() == null && (constantState = this.A00) != null) {
                    imageView2.setBackground(constantState.newDrawable(this.A01.A01()));
                }
                imageView2.setContentDescription(this.A01.A0F(R.string.sticker_store_download_pack_content_description));
                imageView2.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c42531vt, 17));
            }
            View view = c82813r7.A03;
            if (!c42531vt.A05 && c42531vt.A02 == null && c42531vt.A06) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }
}
