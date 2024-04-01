package X;

import java.io.File;

/* renamed from: X.0tt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18530tt {
    public long A00;
    public C18520ts A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ C18570tx A05;

    public C18530tt(C18570tx c18570tx, String str) {
        this.A05 = c18570tx;
        this.A03 = str;
        this.A04 = new long[c18570tx.A06];
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
