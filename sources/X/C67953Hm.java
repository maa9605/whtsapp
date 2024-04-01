package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.3Hm */
/* loaded from: classes2.dex */
public class C67953Hm extends AbstractC636430h {
    public static final int[] A01 = {R.drawable.ic_emoji_people, R.drawable.ic_emoji_nature, R.drawable.ic_emoji_food, R.drawable.ic_emoji_activity, R.drawable.ic_emoji_travel, R.drawable.ic_emoji_symbols, R.drawable.ic_emoji_objects, R.drawable.ic_emoji_flags};
    public static final int[] A02 = {R.string.emoji_label_people, R.string.emoji_label_nature, R.string.emoji_label_food, R.string.emoji_label_activity, R.string.emoji_label_travel, R.string.emoji_label_symbols, R.string.emoji_label_objects, R.string.emoji_label_flags};
    public final C67943Hl A00;

    public C67953Hm(final RecyclerView recyclerView, ShapePickerRecyclerView shapePickerRecyclerView, C3HG c3hg) {
        super(recyclerView, shapePickerRecyclerView, c3hg, false);
        Resources resources = recyclerView.getContext().getResources();
        C67943Hl c67943Hl = new C67943Hl(resources.getDimensionPixelSize(R.dimen.shape_picker_emoji_subcategory_item_landscape_width), resources.getDimensionPixelSize(R.dimen.shape_picker_emoji_subcategory_portrait_padding));
        this.A00 = c67943Hl;
        recyclerView.A0k(c67943Hl);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.30g
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                recyclerView.A0N();
            }
        });
    }

    @Override // X.AbstractC636430h
    public void A01(C67983Hp c67983Hp, boolean z) {
        int i;
        super.A01(c67983Hp, z);
        ImageView imageView = c67983Hp.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        RecyclerView recyclerView = this.A06;
        Resources resources = recyclerView.getContext().getResources();
        int i2 = R.dimen.shape_picker_subcategory_selected_portrait_dimen;
        if (z) {
            i2 = R.dimen.shape_picker_subcategory_selected_landscape_dimen;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        int dimensionPixelSize2 = ((int) (dimensionPixelSize - (recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.shape_picker_emoji_subcategory_icon_dimen) * (z ? 0.9f : 1.0f)))) >> 1;
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        View view = c67983Hp.A0H;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (z) {
            i = recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.shape_picker_emoji_subcategory_item_landscape_width);
        } else {
            i = -2;
        }
        layoutParams2.width = i;
        view.setLayoutParams(layoutParams2);
        this.A00.A00 = z;
    }
}
