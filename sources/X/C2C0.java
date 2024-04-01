package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2C0 */
/* loaded from: classes2.dex */
public class C2C0 extends C0HS {
    public C25Z A00;
    public final C2AS A01;

    public C2C0(C2AS c2as) {
        this.A01 = c2as;
    }

    public C2C0(C2AS c2as, C25Z c25z) {
        this.A01 = c2as;
        this.A00 = c25z;
    }

    @Override // X.C0HS
    public void A03(Object... objArr) {
        C25Z c25z;
        if (!A04() && (c25z = this.A00) != null) {
            Object obj = objArr[0];
            if (obj instanceof C3YI) {
                c25z.AMc((C3YI) obj);
            } else if (obj instanceof C42531vt) {
                c25z.AMb((C42531vt) obj);
            } else if (!(obj instanceof String)) {
            } else {
                c25z.AMe((String) obj);
            }
        }
    }

    @Override // X.C0HS
    public /* bridge */ /* synthetic */ Object A07(Object[] objArr) {
        if (!(this instanceof C86483xc)) {
            return A0A((Void[]) objArr);
        }
        A0A((Void[]) objArr);
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C25Z c25z = this.A00;
        if (c25z != null) {
            c25z.AMd();
        }
        this.A00 = null;
    }

    public Void A0A(Void... voidArr) {
        if (A04()) {
            return null;
        }
        C2AS c2as = this.A01;
        List A0C = c2as.A0C();
        if (A04()) {
            return null;
        }
        List A0B = c2as.A0B();
        if (A04()) {
            return null;
        }
        Object[] objArr = {new ArrayList<C42531vt>(A0C, A0B) { // from class: X.3YI
            {
                super(A0B.size() + A0C.size());
                C47592Bv c47592Bv = new C47592Bv(false);
                addAll(A0C);
                addAll(A0B);
                Collections.sort(this, c47592Bv);
            }
        }};
        C2C1 c2c1 = this.A02;
        c2c1.A00(objArr);
        if (A04()) {
            return null;
        }
        List A0F = c2as.A0F(new C47622By(this));
        HashSet hashSet = new HashSet();
        Iterator it = ((AbstractCollection) A0F).iterator();
        while (it.hasNext()) {
            hashSet.add(((C42531vt) it.next()).A0D);
        }
        Iterator it2 = ((AbstractCollection) A0B).iterator();
        while (it2.hasNext()) {
            C42531vt c42531vt = (C42531vt) it2.next();
            String str = c42531vt.A0D;
            if (!hashSet.contains(str)) {
                C000200d.A1M(C000200d.A0P("LoadStickerPickerPacksAsyncTask/doInBackground failed to load pack "), str);
                c2c1.A00(c42531vt);
            }
        }
        return null;
    }
}
