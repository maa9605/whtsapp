package com.facebook.msys.mci;

/* loaded from: classes.dex */
public class DefaultUUID implements UUID {
    public static final UUID mUUID = new DefaultUUID();

    @Override // com.facebook.msys.mci.UUID
    public String createString() {
        return java.util.UUID.randomUUID().toString();
    }

    public static UUID get() {
        return mUUID;
    }
}
