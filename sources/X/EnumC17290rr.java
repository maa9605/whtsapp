package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0rr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17290rr implements Executor {
    public static final /* synthetic */ EnumC17290rr[] A00;
    public static final EnumC17290rr A01;

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }

    static {
        EnumC17290rr enumC17290rr = new EnumC17290rr();
        A01 = enumC17290rr;
        A00 = new EnumC17290rr[]{enumC17290rr};
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        command.run();
    }

    public static EnumC17290rr valueOf(String name) {
        return (EnumC17290rr) Enum.valueOf(EnumC17290rr.class, name);
    }

    public static EnumC17290rr[] values() {
        return (EnumC17290rr[]) A00.clone();
    }
}
