package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0DK */
/* loaded from: classes.dex */
public class C0DK {
    public static volatile C0DK A06;
    public List A00;
    public Map A01;
    public final C05W A02;
    public final C0CA A03;
    public final C0EG A04;
    public final Object A05 = new Object();

    public C0DK(C0EG c0eg, C05W c05w, C0CA c0ca) {
        this.A04 = c0eg;
        this.A02 = c05w;
        this.A03 = c0ca;
    }

    public static C0DK A00() {
        if (A06 == null) {
            synchronized (C0DK.class) {
                if (A06 == null) {
                    A06 = new C0DK(C0EG.A00(), C05W.A00(), C0CA.A00());
                }
            }
        }
        return A06;
    }

    public static boolean A01(List list, AbstractC005302j abstractC005302j) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC09100ce) it.next()).A7m(abstractC005302j)) {
                return false;
            }
        }
        return true;
    }

    public C06C A02(AbstractC005302j abstractC005302j) {
        C06C A0A = this.A02.A0A(abstractC005302j);
        Jid jid = A0A.A09;
        if (C003101m.A0U(jid) && !C003101m.A0a(jid) && (A0A.A0A() || TextUtils.isEmpty(A0A.A0J))) {
            this.A04.A0F((C011005l) abstractC005302j, null);
        }
        return A0A;
    }

    public List A03() {
        List list;
        synchronized (this.A05) {
            if (this.A00 == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A00 = copyOnWriteArrayList;
                this.A02.A05.A0V(copyOnWriteArrayList, 0, false, false);
            }
            list = this.A00;
        }
        return list;
    }

    public List A04(int i) {
        AbstractList abstractList = (AbstractList) this.A03.A0B();
        ArrayList arrayList = new ArrayList(Math.min(abstractList.size(), i));
        for (int i2 = 0; i2 < abstractList.size() && arrayList.size() < i; i2++) {
            abstractList.get(i2);
            C06C A02 = A02((AbstractC005302j) abstractList.get(i2));
            if (!TextUtils.isEmpty(A02.A0F)) {
                arrayList.add(A02);
            }
        }
        return arrayList;
    }

    public Map A05() {
        Map map;
        synchronized (this.A05) {
            if (this.A01 == null) {
                List<C06C> A03 = A03();
                this.A01 = new HashMap(A03.size(), 1.0f);
                for (C06C c06c : A03) {
                    C06C c06c2 = (C06C) this.A01.get(c06c.A03(AbstractC005302j.class));
                    if (c06c2 == null || c06c2.A01() > c06c.A01()) {
                        AbstractC005302j abstractC005302j = (AbstractC005302j) c06c.A03(AbstractC005302j.class);
                        if (abstractC005302j != null) {
                            this.A01.put(abstractC005302j, c06c);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) this.A03.A0B()).iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j2 = (AbstractC005302j) it.next();
                    if (this.A01.get(abstractC005302j2) == null) {
                        C06C A02 = A02(abstractC005302j2);
                        arrayList.add(A02);
                        this.A01.put(abstractC005302j2, A02);
                    }
                }
                List list = this.A00;
                if (list == null) {
                    throw null;
                }
                list.addAll(arrayList);
            }
            map = this.A01;
        }
        return map;
    }
}
