package X;

import java.io.File;

/* renamed from: X.0kS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13010kS {
    public final File A00;
    public final File A01;

    public C13010kS(File file) {
        this.A01 = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.A00 = new File(sb.toString());
    }
}
