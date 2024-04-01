package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.storage.StorageUsageMediaPreviewOverflowOverlayView;

/* renamed from: X.3rr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83273rr extends FrameLayout implements AnonymousClass005 {
    public C51682Xk A00;
    public C2UB A01;
    public boolean A02;
    public final WaTextView A03;
    public final StorageUsageMediaPreviewOverflowOverlayView A04;

    public C83273rr(Context context) {
        super(context, null, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        LayoutInflater.from(getContext()).inflate(R.layout.storage_usage_media_preview_overflow_item_view, (ViewGroup) this, true);
        this.A04 = (StorageUsageMediaPreviewOverflowOverlayView) C0AT.A0D(this, R.id.overflow_overlay_view);
        this.A03 = (WaTextView) C0AT.A0D(this, R.id.overflow_text_view);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A01;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A01 = c2ub;
        }
        return c2ub.generatedComponent();
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A04.setFrameDrawable(drawable);
        C51682Xk c51682Xk = this.A00;
        if (c51682Xk != null) {
            c51682Xk.setFrameDrawable(drawable);
        }
    }
}
