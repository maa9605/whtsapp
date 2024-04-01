package X;

/* renamed from: X.2k8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC55262k8 {
    NONE(0),
    GIPHY(1),
    TENOR(2);
    
    public final int value;

    EnumC55262k8(int i) {
        this.value = i;
    }

    public static EnumC55262k8 A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return TENOR;
            }
            return GIPHY;
        }
        return NONE;
    }
}
