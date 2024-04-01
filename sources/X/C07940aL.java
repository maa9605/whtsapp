package X;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.0aL */
/* loaded from: classes.dex */
public class C07940aL {
    public int A00;
    public PendingIntent A01;
    public IconCompat A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Bundle A07;
    public final C12830k9[] A08;
    public final C12830k9[] A09;

    public C07940aL(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(IconCompat.A03(null, "", i), charSequence, pendingIntent, new Bundle(), null, null, 0, true);
    }

    public C07940aL(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C12830k9[] c12830k9Arr, C12830k9[] c12830k9Arr2, int i, boolean z) {
        this.A05 = true;
        this.A02 = iconCompat;
        if (iconCompat != null && iconCompat.A06() == 2) {
            this.A00 = iconCompat.A05();
        }
        this.A03 = C005402l.A00(charSequence);
        this.A01 = pendingIntent;
        this.A07 = bundle == null ? new Bundle() : bundle;
        this.A09 = c12830k9Arr;
        this.A08 = c12830k9Arr2;
        this.A04 = true;
        this.A06 = i;
        this.A05 = z;
    }

    public IconCompat A00() {
        int i;
        IconCompat iconCompat = this.A02;
        if (iconCompat == null && (i = this.A00) != 0) {
            IconCompat A03 = IconCompat.A03(null, "", i);
            this.A02 = A03;
            return A03;
        }
        return iconCompat;
    }
}
