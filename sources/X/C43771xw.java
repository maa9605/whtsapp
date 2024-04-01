package X;

import java.io.File;

/* renamed from: X.1xw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43771xw {
    public long A00;
    public C43761xv A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ C43751xu A05;

    public C43771xw(C43751xu c43751xu, String str) {
        this.A05 = c43751xu;
        this.A03 = str;
        this.A04 = new long[c43751xu.A05];
    }

    public File A00(int i) {
        File file = this.A05.A07;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append(".");
        sb.append(i);
        return new File(file, sb.toString());
    }

    public File A01(int i) {
        File file = this.A05.A07;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append(".");
        sb.append(i);
        sb.append(".tmp");
        return new File(file, sb.toString());
    }
}
