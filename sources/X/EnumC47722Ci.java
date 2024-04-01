package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.2Ci  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC47722Ci implements InterfaceC47732Cj {
    PEOPLE(C47752Cl.A05, R.id.emoji_people_btn, R.id.emoji_people_marker, R.string.emoji_label_people),
    NATURE(C47752Cl.A03, R.id.emoji_nature_btn, R.id.emoji_nature_marker, R.string.emoji_label_nature),
    FOOD(C47752Cl.A02, R.id.emoji_food_btn, R.id.emoji_food_marker, R.string.emoji_label_food),
    ACTIVITY(C47752Cl.A00, R.id.emoji_activity_btn, R.id.emoji_activity_marker, R.string.emoji_label_activity),
    TRAVEL(C47752Cl.A07, R.id.emoji_travel_btn, R.id.emoji_travel_marker, R.string.emoji_label_travel),
    OBJECTS(C47752Cl.A04, R.id.emoji_objects_btn, R.id.emoji_objects_marker, R.string.emoji_label_objects),
    SYMBOLS(C47752Cl.A06, R.id.emoji_symbols_btn, R.id.emoji_symbols_marker, R.string.emoji_label_symbols),
    FLAGS(C47752Cl.A01, R.id.emoji_flags_btn, R.id.emoji_flags_marker, R.string.emoji_label_flags);
    
    public final int buttonId;
    public final int[][] emojiData;
    public final int markerId;
    public final int titleResId;

    EnumC47722Ci(int[][] iArr, int i, int i2, int i3) {
        this.emojiData = iArr;
        this.buttonId = i;
        this.markerId = i2;
        this.titleResId = i3;
    }
}
