package X;

/* renamed from: X.0y1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC20710y1 {
    NOT_SO("not_so"),
    X86("x86"),
    ARM("armeabi-v7a"),
    X86_64("x86_64"),
    AARCH64("arm64-v8a"),
    OTHERS("others");
    
    public final String value;

    EnumC20710y1(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
