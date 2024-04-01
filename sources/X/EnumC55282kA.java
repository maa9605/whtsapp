package X;

/* renamed from: X.2kA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC55282kA {
    REVOKE(0),
    EPHEMERAL_SETTING(3),
    EPHEMERAL_SYNC_RESPONSE(4),
    HISTORY_SYNC_NOTIFICATION(5),
    APP_STATE_SYNC_KEY_SHARE(6),
    APP_STATE_SYNC_KEY_REQUEST(7),
    MSG_FANOUT_BACKFILL_REQUEST(8),
    INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC(9),
    APP_STATE_FATAL_EXCEPTION_NOTIFICATION(10);
    
    public final int value;

    EnumC55282kA(int i) {
        this.value = i;
    }

    public static EnumC55282kA A00(int i) {
        if (i != 0) {
            switch (i) {
                case 3:
                    return EPHEMERAL_SETTING;
                case 4:
                    return EPHEMERAL_SYNC_RESPONSE;
                case 5:
                    return HISTORY_SYNC_NOTIFICATION;
                case 6:
                    return APP_STATE_SYNC_KEY_SHARE;
                case 7:
                    return APP_STATE_SYNC_KEY_REQUEST;
                case 8:
                    return MSG_FANOUT_BACKFILL_REQUEST;
                case 9:
                    return INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC;
                case 10:
                    return APP_STATE_FATAL_EXCEPTION_NOTIFICATION;
                default:
                    return null;
            }
        }
        return REVOKE;
    }
}
