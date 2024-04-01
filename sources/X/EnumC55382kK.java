package X;

/* renamed from: X.2kK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC55382kK {
    UNKNOWN(0),
    EMPTY(1),
    TEXT(2),
    DOCUMENT(3),
    IMAGE(4),
    VIDEO(5),
    LOCATION(6);
    
    public final int value;

    EnumC55382kK(int i) {
        this.value = i;
    }

    public static EnumC55382kK A00(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return EMPTY;
            case 2:
                return TEXT;
            case 3:
                return DOCUMENT;
            case 4:
                return IMAGE;
            case 5:
                return VIDEO;
            case 6:
                return LOCATION;
            default:
                return null;
        }
    }
}
