package X;

import java.io.File;

/* renamed from: X.1LO  reason: invalid class name */
/* loaded from: classes.dex */
public class C1LO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final File A05;
    public final String A06;
    public final String A07;

    public C1LO(int i, File file) {
        this.A04 = i;
        this.A05 = file;
        this.A07 = null;
        this.A06 = null;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = -1;
        this.A02 = -1;
    }

    public C1LO(int i, File file, C1LM c1lm, C1LM c1lm2) {
        this.A04 = i;
        this.A05 = file;
        this.A07 = c1lm.A0A;
        this.A01 = c1lm.A00;
        this.A03 = c1lm.A05;
        this.A06 = c1lm2.A0A;
        this.A00 = c1lm2.A00;
        this.A02 = c1lm2.A05;
    }
}
