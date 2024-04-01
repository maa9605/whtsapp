package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.232  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass232 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C454522c A04;
    public final C0DC A05;
    public final C04050If A06;
    public final File A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public AnonymousClass232(String str, File file, String str2, String str3, String str4, C0DC c0dc, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, C04050If c04050If, C454522c c454522c, boolean z4, boolean z5) {
        if (z3 && (c0dc == C0DC.A0A || c0dc == C0DC.A0P || c0dc == C0DC.A0C || c0dc == C0DC.A0H || c0dc == C0DC.A06)) {
            C000700j.A0A(c454522c != null, "Image transcoding should have quality settings");
        }
        this.A08 = str;
        this.A07 = file;
        this.A0B = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = c0dc;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
        this.A0D = z;
        this.A0G = z2;
        this.A0C = z3;
        this.A06 = c04050If;
        this.A04 = c454522c;
        this.A0E = z4;
        this.A0F = z5;
    }

    public File A00() {
        Uri parse;
        String str = this.A0B;
        if (str == null || (parse = Uri.parse(str)) == null || !parse.isAbsolute()) {
            return null;
        }
        return AnonymousClass024.A05(parse);
    }
}
