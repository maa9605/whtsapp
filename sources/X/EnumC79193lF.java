package X;

/* renamed from: X.3lF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC79193lF {
    SANS_SERIF(0),
    SERIF(1),
    NORICAN_REGULAR(2),
    BRYNDAN_WRITE(3),
    BEBASNEUE_REGULAR(4),
    OSWALD_HEAVY(5);
    
    public final int value;

    EnumC79193lF(int i) {
        this.value = i;
    }

    public static EnumC79193lF A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return OSWALD_HEAVY;
                        }
                        return BEBASNEUE_REGULAR;
                    }
                    return BRYNDAN_WRITE;
                }
                return NORICAN_REGULAR;
            }
            return SERIF;
        }
        return SANS_SERIF;
    }
}
