package X;

/* renamed from: X.1sl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC40721sl {
    NETWORK_UNAVAILABLE,
    UP_TO_DATE_UNCHANGED,
    UP_TO_DATE_CHANGED_PHONEBOOK,
    UP_TO_DATE_CHANGED_NO_PHONEBOOK,
    FAILED,
    RATE_LIMITED,
    EXCEPTION;

    public boolean A00() {
        return this == UP_TO_DATE_CHANGED_PHONEBOOK || this == UP_TO_DATE_CHANGED_NO_PHONEBOOK || this == UP_TO_DATE_UNCHANGED;
    }
}
