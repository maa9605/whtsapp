package X;

/* renamed from: X.3l6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC79113l6 {
    TEXT(0),
    IMAGE(1),
    DOCUMENT(2),
    VIDEO(3),
    LOCATION(4);
    
    public final int value;

    EnumC79113l6(int i) {
        this.value = i;
    }

    public static EnumC79113l6 A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return LOCATION;
                    }
                    return VIDEO;
                }
                return DOCUMENT;
            }
            return IMAGE;
        }
        return TEXT;
    }
}
