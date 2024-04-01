package X;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0k1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12760k1 {
    public int A00;
    public ArrayList A01;
    public boolean A02;
    public boolean A03;
    public final PendingIntent A04;
    public final Bundle A05;
    public final IconCompat A06;
    public final CharSequence A07;

    public C12760k1(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat A03 = IconCompat.A03(null, "", i);
        Bundle bundle = new Bundle();
        this.A02 = true;
        this.A03 = true;
        this.A06 = A03;
        this.A07 = C005402l.A00(charSequence);
        this.A04 = pendingIntent;
        this.A05 = bundle;
        this.A01 = null;
        this.A00 = 0;
    }

    public C07940aL A00() {
        CharSequence[] charSequenceArr;
        Set set;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.A01;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C12830k9 c12830k9 = (C12830k9) it.next();
                if (!c12830k9.A04 && (((charSequenceArr = c12830k9.A05) == null || charSequenceArr.length == 0) && (set = c12830k9.A03) != null && !set.isEmpty())) {
                    arrayList.add(c12830k9);
                } else {
                    arrayList2.add(c12830k9);
                }
            }
        }
        return new C07940aL(this.A06, this.A07, this.A04, this.A05, arrayList2.isEmpty() ? null : (C12830k9[]) arrayList2.toArray(new C12830k9[arrayList2.size()]), arrayList.isEmpty() ? null : (C12830k9[]) arrayList.toArray(new C12830k9[arrayList.size()]), this.A00, this.A03);
    }
}
