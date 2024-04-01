package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2hM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53692hM extends C0HS {
    public final C43081wp A00;
    public final C2II A01;
    public final Set A02;

    public C53692hM(C43081wp c43081wp, AbstractC005302j abstractC005302j, C2II c2ii) {
        this.A00 = c43081wp;
        HashSet hashSet = new HashSet();
        this.A02 = hashSet;
        hashSet.add(abstractC005302j);
        this.A01 = c2ii;
    }

    public C53692hM(C43081wp c43081wp, Set set, C2II c2ii) {
        this.A00 = c43081wp;
        this.A02 = new HashSet(set);
        this.A01 = c2ii;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        boolean z;
        Iterator it = this.A02.iterator();
        while (true) {
            if (it.hasNext()) {
                AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                if (!A04()) {
                    if (this.A00.A01(abstractC005302j) > 0) {
                        z = true;
                        break;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
                break;
            }
        }
        if (A04()) {
            return null;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || A04()) {
            return;
        }
        this.A01.AEA(bool.booleanValue());
    }
}
