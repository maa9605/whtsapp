package X;

import java.io.File;

/* renamed from: X.2zQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C63222zQ {
    public final int A00;
    public final int A01;
    public final C42621w3 A02;
    public final C43561xb A03;
    public final C05080Nf A04;
    public final String A05;
    public final boolean A06;

    public C63222zQ(String str, int i, C42621w3 c42621w3, C43561xb c43561xb, boolean z, C05080Nf c05080Nf, File file) {
        this.A05 = str;
        this.A00 = i;
        this.A02 = c42621w3;
        this.A03 = c43561xb;
        this.A06 = z;
        this.A04 = c05080Nf;
        if (i > 0) {
            int length = (int) file.length();
            this.A01 = (length - (length % 16)) + 16 + 10;
            return;
        }
        this.A01 = -1;
    }
}
