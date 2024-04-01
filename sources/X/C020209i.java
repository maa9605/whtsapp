package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.09i */
/* loaded from: classes.dex */
public class C020209i {
    public C33401fq A00;
    public C33521g2 A01;
    public AbstractC016907v A02;
    public AbstractC016907v A03;
    public WeakReference A04;
    public List A05;
    public Map A06;
    public Map A07;
    public Map A08 = new HashMap();
    public final C33851gZ A09;
    public final C33921gg A0A;
    public final List A0B;
    public final List A0C;
    public final Map A0D;

    static {
        new Handler(Looper.getMainLooper());
    }

    public C020209i(C0AP c0ap, C33921gg c33921gg, C33851gZ c33851gZ) {
        C0AO c0ao = ((C33381fo) c0ap).A00;
        this.A03 = (AbstractC016907v) c0ao.A00;
        this.A05 = c0ao.A01;
        this.A0C = new ArrayList();
        this.A0D = new HashMap();
        this.A0B = new ArrayList();
        this.A0A = c33921gg;
        this.A09 = c33851gZ;
    }

    public Pair A00(Map map, Map map2, List list) {
        Iterator it = list.iterator();
        HashMap hashMap = null;
        while (it.hasNext()) {
            for (C33911gf c33911gf : (List) it.next()) {
                String str = c33911gf.A01;
                HashMap hashMap2 = map2;
                if (hashMap != null) {
                    hashMap2 = hashMap;
                }
                if (!hashMap2.containsKey(str)) {
                    if (hashMap == null) {
                        hashMap = new HashMap(map2);
                    }
                    hashMap.put(str, c33911gf);
                }
                if (!map.containsKey(str)) {
                    String str2 = c33911gf.A02;
                    if (this.A09 != null) {
                        C09M.A00().A0B.get(str2);
                        throw new RuntimeException(C000200d.A0H("Missing variable module with type: ", str2));
                    }
                    throw null;
                }
            }
        }
        if (hashMap != null) {
            map2 = hashMap;
        }
        return new Pair(map, map2);
    }

    public AbstractC016907v A01() {
        AbstractC016907v abstractC016907v;
        C0AQ.A01("Tree operations are only supported from the UI Thread");
        C33921gg c33921gg = this.A0A;
        if (c33921gg != null) {
            C1YX.A00("Bloks SnapshotComponent", null);
            try {
                List list = this.A0C;
                if (list.isEmpty()) {
                    abstractC016907v = this.A03;
                } else {
                    abstractC016907v = (AbstractC016907v) AnonymousClass088.A0Z(this.A03, new InterfaceC020009g(list) { // from class: X.1gc
                        public final List A00;

                        @Override // X.InterfaceC020009g
                        public void AQA(InterfaceC017007w interfaceC017007w) {
                        }

                        {
                            this.A00 = new ArrayList(list);
                        }

                        @Override // X.InterfaceC020009g
                        public InterfaceC017007w A5R(InterfaceC017007w interfaceC017007w) {
                            List list2;
                            ArrayList arrayList = null;
                            int i = 0;
                            InterfaceC017007w interfaceC017007w2 = interfaceC017007w;
                            while (true) {
                                list2 = this.A00;
                                if (i >= list2.size()) {
                                    break;
                                }
                                Pair pair = (Pair) list2.get(i);
                                if (((InterfaceC25271Es) pair.first).AVP(interfaceC017007w2)) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(pair);
                                    if (((AbstractC25291Eu) pair.second).A01(interfaceC017007w2)) {
                                        if (interfaceC017007w2 == interfaceC017007w) {
                                            interfaceC017007w2 = interfaceC017007w.AGB();
                                        }
                                        ((AbstractC25291Eu) pair.second).A00(interfaceC017007w2);
                                    }
                                }
                                i++;
                            }
                            if (arrayList != null) {
                                list2.removeAll(arrayList);
                            }
                            return interfaceC017007w2;
                        }
                    });
                }
                if (c33921gg != null) {
                    C20500xd.A00();
                    return abstractC016907v;
                }
                throw null;
            } catch (Throwable th) {
                if (c33921gg != null) {
                    C20500xd.A00();
                    throw th;
                }
                throw null;
            }
        }
        throw null;
    }

    public void A02() {
        C0AQ.A01("Tree operations are only supported from the UI Thread");
        C33921gg c33921gg = this.A0A;
        if (c33921gg != null) {
            C1YX.A00("Bloks ModelMutation", null);
            AbstractC016907v A01 = A01();
            boolean z = this.A03 != A01;
            this.A03 = A01;
            this.A0C.clear();
            if (c33921gg != null) {
                C20500xd.A00();
                Map map = this.A08;
                Map map2 = this.A07;
                List list = this.A0B;
                this.A04.get();
                Pair A00 = A00(map, map2, list);
                Map map3 = (Map) A00.first;
                this.A07 = (Map) A00.second;
                list.clear();
                Map map4 = this.A0D;
                if (!map4.isEmpty()) {
                    Map map5 = this.A08;
                    if (map3 == map5) {
                        map3 = new HashMap(map5);
                    }
                    map3.putAll(map4);
                    map4.clear();
                }
                boolean z2 = map3 != this.A08;
                this.A08 = map3;
                C33521g2 c33521g2 = this.A01;
                if (c33521g2 != null) {
                    if (z2 || z) {
                        c33521g2.A00.A02(new C33511g1(c33521g2.A02.A03, c33521g2.A03, (C25051Dw) c33521g2.A01.A00(R.id.bk_context_key_scoped_client_id_mapper)));
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A03(long j, AbstractC25291Eu abstractC25291Eu) {
        C0AQ.A01("Tree operations are only supported from the UI Thread");
        this.A0C.add(new Pair(new InterfaceC25271Es(j) { // from class: X.1ga
            public final long A00;

            {
                this.A00 = j;
            }

            @Override // X.InterfaceC25271Es
            public boolean AVP(InterfaceC017007w interfaceC017007w) {
                return ((long) interfaceC017007w.A8w()) == this.A00;
            }
        }, abstractC25291Eu));
    }

    public void A04(String str, AbstractC25291Eu abstractC25291Eu) {
        C0AQ.A01("Tree operations are only supported from the UI Thread");
        this.A0C.add(new Pair(new InterfaceC25271Es(str) { // from class: X.1gb
            public final String A00;

            {
                this.A00 = str;
            }

            @Override // X.InterfaceC25271Es
            public boolean AVP(InterfaceC017007w interfaceC017007w) {
                return interfaceC017007w.getId() != null && interfaceC017007w.getId().equals(this.A00);
            }
        }, abstractC25291Eu));
    }
}
