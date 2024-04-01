package X;

/* renamed from: X.3l9  reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3l9 {
    ZERO(0),
    ONE(1),
    TWO(2),
    FEW(3),
    MANY(4),
    OTHER(5);
    
    public final int value;

    C3l9(int i) {
        this.value = i;
    }

    public static C3l9 A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return OTHER;
                        }
                        return MANY;
                    }
                    return FEW;
                }
                return TWO;
            }
            return ONE;
        }
        return ZERO;
    }
}
