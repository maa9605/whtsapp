package X;

/* renamed from: X.2Mb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49712Mb {
    public static volatile C49712Mb A03;
    public boolean A00 = false;
    public final C000500h A01;
    public final C003701t A02;

    public C49712Mb(C003701t c003701t, C000500h c000500h) {
        this.A02 = c003701t;
        this.A01 = c000500h;
    }

    public void A00() {
        boolean z = false;
        if (this.A01.A00.getBoolean("sticker_contextual_suggestion_eligibility", false) && this.A02.A0C(291)) {
            z = true;
        }
        this.A00 = z;
    }
}
