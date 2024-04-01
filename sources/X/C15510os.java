package X;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* renamed from: X.0os  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15510os {
    public InterfaceC15850pR A01;
    public ArrayList A02;
    public Set A03;
    public Executor A04;
    public Executor A05;
    public boolean A06;
    public boolean A07;
    public final Context A09;
    public final String A0C;
    public final Class A0B = WorkDatabase.class;
    public EnumC15520ot A00 = EnumC15520ot.AUTOMATIC;
    public boolean A08 = true;
    public final C15530ou A0A = new C15530ou();

    public C15510os(Context context, String str) {
        this.A09 = context;
        this.A0C = str;
    }

    public void A00(AbstractC15580oz... abstractC15580ozArr) {
        if (this.A03 == null) {
            this.A03 = new HashSet();
        }
        for (AbstractC15580oz abstractC15580oz : abstractC15580ozArr) {
            this.A03.add(Integer.valueOf(abstractC15580oz.A01));
            this.A03.add(Integer.valueOf(abstractC15580oz.A00));
        }
        C15530ou c15530ou = this.A0A;
        if (c15530ou == null) {
            throw null;
        }
        for (AbstractC15580oz abstractC15580oz2 : abstractC15580ozArr) {
            int i = abstractC15580oz2.A01;
            int i2 = abstractC15580oz2.A00;
            AbstractMap abstractMap = (AbstractMap) c15530ou.A00.get(Integer.valueOf(i));
            if (abstractMap == null) {
                abstractMap = new TreeMap();
                c15530ou.A00.put(Integer.valueOf(i), abstractMap);
            }
            Integer valueOf = Integer.valueOf(i2);
            Object obj = abstractMap.get(valueOf);
            if (obj != null) {
                StringBuilder sb = new StringBuilder("Overriding migration ");
                sb.append(obj);
                sb.append(" with ");
                sb.append(abstractC15580oz2);
                Log.w("ROOM", sb.toString());
            }
            abstractMap.put(valueOf, abstractC15580oz2);
        }
    }
}
