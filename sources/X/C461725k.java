package X;

import android.util.Pair;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.25k */
/* loaded from: classes2.dex */
public final class C461725k extends ArrayList<AbstractC52452ak> {
    public C52592az latestBucket = null;
    public final C52602b0 timeBucketsProvider;
    public static final C52472am A03 = new C52472am(Integer.valueOf((int) R.string.search_section_starred_messages), 1);
    public static final C52472am A00 = new C52472am(Integer.valueOf((int) R.string.search_section_messages), 1);
    public static final C52472am A02 = new C52472am(Boolean.TRUE, 13);
    public static final C52472am A01 = new C52472am(Boolean.FALSE, 13);

    public C461725k(C002301c c002301c) {
        this.timeBucketsProvider = new C52602b0(c002301c);
    }

    public int A00(int i) {
        if (i < 0 || i >= size()) {
            return -1;
        }
        return get(i).A00;
    }

    public AnonymousClass092 A01(int i) {
        return (AnonymousClass092) get(i).A01;
    }

    public void A02(AnonymousClass092 anonymousClass092, boolean z) {
        C52592az A002 = this.timeBucketsProvider.A00(anonymousClass092.A0E);
        if (AnonymousClass024.A0l(A002, this.latestBucket)) {
            return;
        }
        add(new C52472am(new Pair(A002.toString(), Boolean.valueOf(z)), 12));
        this.latestBucket = A002;
    }

    public void A03(List list) {
        add(new C52472am(new ArrayList(list), 6));
    }

    public void A04(List list, boolean z) {
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            if (anonymousClass092 != null) {
                if (z) {
                    A02(anonymousClass092, false);
                }
                if (anonymousClass092 instanceof C0JJ) {
                    if (C04310Jr.A05(anonymousClass092.A0G(), true) != null) {
                        add(new C52472am(anonymousClass092, 19));
                    } else {
                        add(new C52472am(anonymousClass092, 7));
                    }
                } else if (anonymousClass092 instanceof C09E) {
                    add(new C52472am(anonymousClass092, 11));
                } else if (anonymousClass092 instanceof C0KD) {
                    add(new C52472am(anonymousClass092, 20));
                } else if (anonymousClass092 instanceof C09G) {
                    if (anonymousClass092.A04 != 1) {
                        add(new C52472am(anonymousClass092, 14));
                    } else {
                        add(new C52472am(anonymousClass092, 15));
                    }
                } else if (anonymousClass092 instanceof AnonymousClass095) {
                    add(new C52472am(anonymousClass092, 16));
                } else if (anonymousClass092 instanceof C0JP) {
                    add(new C52472am(anonymousClass092, 17));
                } else if (anonymousClass092 instanceof C0LO) {
                    add(new C52472am(anonymousClass092, 18));
                } else if (anonymousClass092 instanceof C0D8) {
                    add(new C52472am(anonymousClass092, 21));
                } else if (anonymousClass092 instanceof C0DA) {
                    add(new C52472am(anonymousClass092, 21));
                } else {
                    add(new C52612b1(anonymousClass092));
                }
            }
        }
    }
}
