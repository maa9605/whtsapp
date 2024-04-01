package X;

/* renamed from: X.3lJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC79233lJ {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    
    public final int value;

    EnumC79233lJ(int i) {
        this.value = i;
    }

    public static EnumC79233lJ A00(int i) {
        switch (i) {
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }
}
