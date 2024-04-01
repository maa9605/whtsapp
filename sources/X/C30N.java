package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.30N  reason: invalid class name */
/* loaded from: classes2.dex */
public enum C30N {
    CONTENT_STICKERS(C30O.A00, R.string.shape_picker_section_content_stickers),
    SHAPES(C30O.A01, R.string.shape_picker_section_shapes),
    PEOPLE(C30O.A06, R.string.emoji_label_people),
    NATURE(C30O.A04, R.string.emoji_label_nature),
    FOOD(C30O.A03, R.string.emoji_label_food),
    ACTIVITY(C30O.A02, R.string.emoji_label_activity),
    SYMBOLS(C30O.A07, R.string.emoji_label_symbols),
    OBJECTS(C30O.A05, R.string.emoji_label_objects);
    
    public final int sectionResId;
    public final C2K1[] shapeData;

    C30N(C2K1[] c2k1Arr, int i) {
        this.shapeData = c2k1Arr;
        this.sectionResId = i;
    }
}
