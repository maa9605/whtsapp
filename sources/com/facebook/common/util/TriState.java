package com.facebook.common.util;

/* loaded from: classes.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    public boolean asBoolean() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
                    sb.append(this);
                    throw new IllegalStateException(sb.toString());
                }
                throw new IllegalStateException("No boolean equivalent for UNSET");
            }
            return false;
        }
        return true;
    }

    public boolean asBoolean(boolean z) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return z;
                }
                StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
            }
            return false;
        }
        return true;
    }

    public Boolean asBooleanObject() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return null;
                }
                StringBuilder sb = new StringBuilder("Unrecognized TriState value: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static TriState fromDbValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return UNSET;
            }
            return NO;
        }
        return YES;
    }

    public int getDbValue() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            return ordinal != 1 ? 3 : 2;
        }
        return 1;
    }

    public boolean isSet() {
        return this != UNSET;
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }
}
