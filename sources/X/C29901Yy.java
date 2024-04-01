package X;

import java.util.zip.ZipEntry;

/* renamed from: X.1Yy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29901Yy extends C20730y6 implements Comparable {
    public final int A00;
    public final ZipEntry A01;

    public C29901Yy(String str, ZipEntry zipEntry, int i) {
        super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())));
        this.A01 = zipEntry;
        this.A00 = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return super.A01.compareTo(((C20730y6) obj).A01);
    }
}
