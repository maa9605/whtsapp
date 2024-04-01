package X;

/* renamed from: X.3lQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC79293lQ {
    UNKNOWN(0),
    FBPAY(1),
    NOVI(2),
    UPI(3);
    
    public final int value;

    EnumC79293lQ(int i) {
        this.value = i;
    }

    public static EnumC79293lQ A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return UPI;
                }
                return NOVI;
            }
            return FBPAY;
        }
        return UNKNOWN;
    }
}
