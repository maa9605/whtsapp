package X;

import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: X.242  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass242 {
    public Drawable A03;
    public Drawable A04;
    public final C018508q A06;
    public final C41451tw A07;
    public final File A08;
    public long A02 = 1048576;
    public int A00 = 4;
    public int A01 = Integer.MAX_VALUE;
    public boolean A05 = false;

    public AnonymousClass242(C018508q c018508q, C41451tw c41451tw, File file) {
        this.A06 = c018508q;
        this.A07 = c41451tw;
        this.A08 = file;
    }

    public AnonymousClass241 A00() {
        return new AnonymousClass241(this.A06, this.A07, this, this.A01);
    }
}
