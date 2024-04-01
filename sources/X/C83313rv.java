package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SegmentedProgressBar;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.3rv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83313rv extends C0TS {
    public long A00;
    public long A01;
    public AnimatorSet A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final AbstractC000600i A08;
    public final WaImageView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final WaTextView A0D;
    public final SegmentedProgressBar A0E;
    public final C002301c A0F;
    public final SizeTickerView A0G;
    public final SizeTickerView A0H;
    public final int[] A0I;

    public C83313rv(AbstractC000600i abstractC000600i, C002301c c002301c, View view) {
        super(view);
        this.A08 = abstractC000600i;
        this.A0F = c002301c;
        SizeTickerView sizeTickerView = (SizeTickerView) C0AT.A0D(view, R.id.used_space_text);
        this.A0H = sizeTickerView;
        View view2 = super.A0H;
        sizeTickerView.A03(0L, C02160Ac.A00(view2.getContext(), R.color.settings_accented_text), false);
        this.A0D = (WaTextView) C0AT.A0D(view, R.id.used_space_description_text);
        SizeTickerView sizeTickerView2 = (SizeTickerView) C0AT.A0D(view, R.id.free_space_text);
        this.A0G = sizeTickerView2;
        sizeTickerView2.A03(0L, C02160Ac.A00(view2.getContext(), R.color.storage_usage_gray), false);
        this.A09 = (WaImageView) C0AT.A0D(view, R.id.free_space_critical_icon);
        this.A0A = (WaTextView) C0AT.A0D(view, R.id.free_space_description_text);
        this.A0E = (SegmentedProgressBar) C0AT.A0D(view, R.id.progress_bar);
        this.A07 = C0AT.A0D(view, R.id.progress_bar_legend_container);
        this.A0B = (WaTextView) C0AT.A0D(view, R.id.media_description_text);
        this.A0C = (WaTextView) C0AT.A0D(view, R.id.other_description_text);
        Context context = view.getContext();
        this.A0I = r1;
        int[] iArr = {C02160Ac.A00(context, R.color.settings_accented_text)};
        this.A0I[1] = C02160Ac.A00(context, R.color.paletteHighlight);
        this.A05 = C02160Ac.A00(context, R.color.settings_item_subtitle_text);
        this.A04 = C02160Ac.A00(context, R.color.storage_usage_red);
        this.A06 = C02160Ac.A00(context, R.color.storage_usage_progress_bar_background_color);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.storage_usage_summary_circle_size);
        Drawable A03 = C02160Ac.A03(context, R.drawable.storage_usage_green_circle);
        A03.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.A0B.setCompoundDrawables(A03, null, null, null);
        Drawable A032 = C02160Ac.A03(context, R.drawable.storage_usage_yellow_circle);
        A032.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.A0C.setCompoundDrawables(A032, null, null, null);
    }
}
