package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3w4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85693w4 extends AbstractC35271is {
    public C25f[] A01;
    public final C002301c A02;
    public final HashSet A05 = new HashSet();
    public final HashMap A04 = new HashMap();
    public final HashMap A03 = new HashMap();
    public HashMap A00 = new HashMap();

    public C85693w4(C002301c c002301c, C25f[] c25fArr) {
        this.A02 = c002301c;
        this.A01 = c25fArr;
        A0K(c25fArr);
    }

    @Override // X.C0ZT
    public int A0B() {
        return this.A01.length;
    }

    @Override // X.AbstractC35271is
    public int A0F(Object obj) {
        Object tag = ((View) obj).getTag();
        HashMap hashMap = this.A04;
        if (!hashMap.containsKey(tag)) {
            this.A03.remove(tag);
            return -2;
        }
        int intValue = ((Number) hashMap.get(tag)).intValue();
        HashMap hashMap2 = this.A03;
        if (hashMap2.containsKey(tag) && intValue == ((Number) hashMap2.get(tag)).intValue()) {
            return -1;
        }
        hashMap2.put(tag, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // X.AbstractC35271is
    public Object A0G(ViewGroup viewGroup, int i) {
        if (!this.A02.A0M()) {
            i = (this.A01.length - 1) - i;
        }
        C25f c25f = this.A01[i];
        if (c25f != null) {
            View AJ3 = c25f.AJ3(viewGroup, i);
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                this.A01[i].A5I((AbstractC15200oF) it.next());
            }
            String id = this.A01[i].getId();
            AJ3.setTag(id);
            this.A00.put(id, this.A01[i]);
            viewGroup.addView(AJ3, 0);
            return AJ3;
        }
        throw null;
    }

    @Override // X.AbstractC35271is
    public void A0I(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        if (!this.A02.A0M()) {
            i = (this.A01.length - 1) - i;
        }
        Object tag = view.getTag();
        viewGroup.removeView(view);
        C25f c25f = (C25f) this.A00.remove(tag);
        if (c25f != null) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                c25f.ARR((AbstractC15200oF) it.next());
            }
            c25f.AJJ(viewGroup, i, view);
        }
    }

    @Override // X.AbstractC35271is
    public boolean A0J(View view, Object obj) {
        return view == obj;
    }

    public final void A0K(C25f[] c25fArr) {
        this.A01 = c25fArr;
        HashMap hashMap = this.A04;
        hashMap.clear();
        for (int i = 0; i < c25fArr.length; i++) {
            String id = c25fArr[i].getId();
            int i2 = i;
            if (!this.A02.A0M()) {
                i2 = (this.A01.length - 1) - i;
            }
            hashMap.put(id, Integer.valueOf(i2));
        }
    }
}
