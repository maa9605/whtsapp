package X;

/* renamed from: X.1wZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC42931wZ {
    NOT_STARTED(0),
    FORCE_UPGRADE(1),
    DEVELOPMENT(2),
    PRODUCTION(3);
    
    public final int value;

    EnumC42931wZ(int i) {
        this.value = i;
    }

    public static EnumC42931wZ A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PRODUCTION;
                }
                return DEVELOPMENT;
            }
            return FORCE_UPGRADE;
        }
        return NOT_STARTED;
    }
}
