package X;

import java.io.File;

/* renamed from: X.1KT  reason: invalid class name */
/* loaded from: classes.dex */
public class C1KT {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;

    public C1KT(File file) {
        this.A02 = file;
        this.A00 = file.lastModified();
        this.A01 = file.length();
        this.A03 = file.getName();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1KT) && this.A02.equals(((C1KT) obj).A02);
    }
}
