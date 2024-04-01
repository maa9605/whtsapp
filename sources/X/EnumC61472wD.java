package X;

/* renamed from: X.2wD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC61472wD {
    UPTO_DATE(true, true, "UPTO_DATE"),
    FETCH_ERROR(false, false, "FETCH_ERROR"),
    NETWORK_ERROR(false, false, "NETWORK_ERROR"),
    LANGUAGE_UNAVAILABLE(false, true, "LANGUAGE_UNAVAILABLE");
    
    public final boolean fetchSuccessful;
    public final String fieldStatString;
    public final boolean gotDictionary;

    EnumC61472wD(boolean z, boolean z2, String str) {
        this.gotDictionary = z;
        this.fetchSuccessful = z2;
        this.fieldStatString = str;
    }
}
