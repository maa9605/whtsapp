package X;

/* renamed from: X.1sU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC40571sU {
    NONE(0),
    IMAGE(1),
    VIDEO(2);
    
    public final int value;

    EnumC40571sU(int i) {
        this.value = i;
    }

    public static EnumC40571sU A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VIDEO;
            }
            return IMAGE;
        }
        return NONE;
    }
}
