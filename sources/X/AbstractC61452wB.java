package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2wB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61452wB {
    public String A00;
    public boolean A02;
    public boolean A03;
    public final List A04 = new ArrayList();
    public ArrayList A01 = new ArrayList();

    public void A00(String str, Collection collection, boolean z) {
        C000700j.A01();
        this.A02 = z;
        if (collection != null) {
            this.A04.addAll(collection);
        }
        this.A00 = str;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C66553Bm) it.next()).A0G(this);
        }
        this.A03 = false;
    }
}
