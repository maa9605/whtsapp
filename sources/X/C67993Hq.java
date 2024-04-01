package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Hq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67993Hq extends AbstractC636430h {
    public long A00;
    public boolean A01;
    public final C2AS A02;
    public final List A03;
    public final Map A04;

    public C67993Hq(C2AS c2as, RecyclerView recyclerView, ShapePickerRecyclerView shapePickerRecyclerView, C3HG c3hg) {
        super(recyclerView, shapePickerRecyclerView, c3hg, true);
        this.A03 = new ArrayList();
        this.A02 = c2as;
        this.A00 = 0L;
        this.A04 = new HashMap();
    }

    @Override // X.AbstractC636430h
    public void A01(C67983Hp c67983Hp, boolean z) {
        super.A01(c67983Hp, z);
        View view = c67983Hp.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView recyclerView = this.A06;
        Resources resources = recyclerView.getContext().getResources();
        int i = R.dimen.shape_picker_sticker_subcategory_item_portrait_width;
        if (z) {
            i = R.dimen.shape_picker_sticker_subcategory_item_landscape_width;
        }
        layoutParams.width = resources.getDimensionPixelSize(i);
        view.setLayoutParams(layoutParams);
        ImageView imageView = c67983Hp.A01;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Resources resources2 = recyclerView.getContext().getResources();
        int i2 = R.dimen.shape_picker_sticker_subcategory_icon_portrait_dimen;
        if (z) {
            i2 = R.dimen.shape_picker_sticker_subcategory_icon_landscape_dimen;
        }
        int dimensionPixelSize = resources2.getDimensionPixelSize(i2);
        layoutParams2.width = dimensionPixelSize;
        layoutParams2.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams2);
    }
}
