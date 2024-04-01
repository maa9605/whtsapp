package X;

import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.1vx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42571vx {
    public final Drawable A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;

    public C42571vx(Drawable drawable) {
        this.A02 = "DOWNLOADED";
        this.A00 = drawable;
        this.A01 = 0;
        this.A03 = true;
    }

    public C42571vx(String str, Drawable drawable, Integer num, boolean z) {
        this.A02 = str;
        this.A00 = drawable;
        this.A01 = num;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C42571vx c42571vx = (C42571vx) obj;
            return this.A02.equals(c42571vx.A02) && this.A00 == c42571vx.A00 && AnonymousClass024.A0l(this.A01, c42571vx.A01) && this.A03 == c42571vx.A03;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01, Boolean.valueOf(this.A03)});
    }
}
