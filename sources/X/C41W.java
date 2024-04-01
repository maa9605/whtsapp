package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.biz.catalog.AspectRatioFrameLayout;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.41W  reason: invalid class name */
/* loaded from: classes2.dex */
public class C41W extends AbstractC51892Ys {
    public boolean A00;
    public final WaImageView A01;
    public final MessageThumbView A02;

    public C41W(Context context) {
        super(context);
        A00();
        ((AspectRatioFrameLayout) this).A00 = 1.0f;
        FrameLayout.inflate(context, R.layout.search_message_image_preview, this);
        this.A02 = (MessageThumbView) C0AT.A0D(this, R.id.thumb_view);
        this.A01 = (WaImageView) C0AT.A0D(this, R.id.starred_status);
        this.A02.setContentDescription(context.getString(R.string.image_preview_description));
    }

    @Override // X.AbstractC51892Ys
    public void setMessage(AnonymousClass095 anonymousClass095) {
        ((AbstractC51892Ys) this).A01 = anonymousClass095;
        WaImageView waImageView = this.A01;
        if (anonymousClass095 != null) {
            if (anonymousClass095.A0j) {
                waImageView.setVisibility(0);
            } else {
                waImageView.setVisibility(8);
            }
        }
        MessageThumbView messageThumbView = this.A02;
        messageThumbView.A00 = ((AbstractC51892Ys) this).A00;
        messageThumbView.setMessage(anonymousClass095);
    }
}
