package X;

/* renamed from: X.20t  reason: invalid class name */
/* loaded from: classes2.dex */
public class C20t extends C451920u {
    public final C0RV A00;

    public C20t(AbstractC000600i abstractC000600i, C01B c01b, C04280Jo c04280Jo, boolean z) {
        super(abstractC000600i, c01b, z);
        super.A00 = 16;
        AnonymousClass094 anonymousClass094 = c04280Jo.A0n;
        this.A0D = anonymousClass094.A01;
        this.A0A = anonymousClass094.A00;
        this.A08 = c04280Jo.A0E / 1000;
        this.A0L = anonymousClass094.A02;
        this.A00 = A00(c04280Jo.A1B());
    }

    public static C0RV A00(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return C0RV.CALL_MISSED_GROUP_VIDEO;
                    }
                    throw new IllegalArgumentException(C000200d.A0D("unexpected missed call type ", i));
                }
                return C0RV.CALL_MISSED_GROUP_VOICE;
            }
            return C0RV.CALL_MISSED_VIDEO;
        }
        return C0RV.CALL_MISSED_VOICE;
    }
}
