package X;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.search.verification.client.R;
import java.io.IOException;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1g1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33511g1 implements InterfaceC20520xf {
    public final C25051Dw A00;
    public final AbstractC016907v A01;
    public final C09v A02;

    public C33511g1(AbstractC016907v abstractC016907v, C09v c09v, C25051Dw c25051Dw) {
        this.A01 = abstractC016907v;
        this.A02 = c09v;
        this.A00 = c25051Dw;
    }

    @Override // X.InterfaceC20520xf
    public Pair ARo() {
        AbstractC016907v abstractC016907v = this.A01;
        final HashMap hashMap = new HashMap();
        final C09v c09v = this.A02;
        final C25051Dw c25051Dw = this.A00;
        AbstractC016907v abstractC016907v2 = (AbstractC016907v) AnonymousClass088.A0Z(abstractC016907v, new InterfaceC020009g(c09v, hashMap, c25051Dw) { // from class: X.1fg
            public final C25051Dw A00;
            public final C09v A01;
            public final Deque A02 = new ArrayDeque();
            public final Deque A03 = new ArrayDeque();
            public final Map A04;

            {
                this.A01 = c09v;
                this.A04 = hashMap;
                this.A00 = c25051Dw;
            }

            public static AnonymousClass081 A00(AnonymousClass081 anonymousClass081, Map map, List list, final C25051Dw c25051Dw2, ArrayList arrayList) {
                InterfaceC017007w interfaceC017007w = (InterfaceC017007w) anonymousClass081.A8u(C1ES.A01).get(((Number) arrayList.get(0)).intValue());
                AbstractMap abstractMap = (AbstractMap) AnonymousClass088.A0q((InterfaceC020509l) arrayList.get(1));
                Object A0q = AnonymousClass088.A0q((InterfaceC020509l) arrayList.get(2));
                final LinkedList linkedList = new LinkedList(list);
                linkedList.add(A0q);
                String A11 = AnonymousClass088.A11(linkedList);
                if (abstractMap != null) {
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        map.put(C000200d.A0L(new StringBuilder(), (String) AnonymousClass088.A0r((InterfaceC020509l) entry.getKey()), A11), AnonymousClass088.A0s(entry.getValue()));
                    }
                }
                return (AnonymousClass081) AnonymousClass088.A0Z(interfaceC017007w, new InterfaceC020009g() { // from class: X.1g4
                    @Override // X.InterfaceC020009g
                    public void AQA(InterfaceC017007w interfaceC017007w2) {
                    }

                    @Override // X.InterfaceC020009g
                    public InterfaceC017007w A5R(InterfaceC017007w interfaceC017007w2) {
                        return interfaceC017007w2.AGC(C25051Dw.this, linkedList);
                    }
                });
            }

            @Override // X.InterfaceC020009g
            public InterfaceC017007w A5R(InterfaceC017007w interfaceC017007w) {
                List<C1E2> list;
                C1E1 c1e1;
                List emptyList;
                Object clone;
                boolean z = interfaceC017007w instanceof AnonymousClass081;
                C09P c09p = null;
                if (interfaceC017007w instanceof AbstractC016907v) {
                    c09p = ((AbstractC016907v) interfaceC017007w).A03;
                } else if (z) {
                    c09p = ((AnonymousClass081) interfaceC017007w).AA3(C1ES.A03);
                }
                int i = 0;
                int i2 = 1;
                if (c09p != null) {
                    SparseArray sparseArray = new SparseArray();
                    C09M.A00();
                    sparseArray.append(R.id.bloks_global_parser_map, C09M.A00().A09);
                    Map map = this.A04;
                    sparseArray.append(R.id.bloks_interpreter_variables_override, map);
                    C25051Dw c25051Dw2 = this.A00;
                    int A8w = interfaceC017007w.A8w();
                    synchronized (c25051Dw2.A00) {
                        c1e1 = (C1E1) c25051Dw2.A01.get(Integer.valueOf(A8w));
                    }
                    if (c1e1 != null) {
                        emptyList = c1e1.A01;
                    } else {
                        emptyList = Collections.emptyList();
                    }
                    sparseArray.append(R.id.bloks_interpreter_keypath, emptyList);
                    C021209s c021209s = new C021209s(sparseArray, this.A01, C09M.A00().A0A);
                    ArrayList A14 = AnonymousClass088.A14(AnonymousClass088.A0d(c09p, C021109r.A01, c021209s));
                    c021209s.A00.clear();
                    if (!A14.isEmpty()) {
                        ArrayList<C24941Dl> arrayList = new ArrayList();
                        Iterator it = A14.iterator();
                        while (it.hasNext()) {
                            AbstractList abstractList = (AbstractList) it.next();
                            String A0x = AnonymousClass088.A0x((InterfaceC020509l) abstractList.get(i));
                            String str = (String) AnonymousClass088.A0r((InterfaceC020509l) abstractList.get(i2));
                            AnonymousClass084 anonymousClass084 = new AnonymousClass084(str, AnonymousClass088.A0A(str));
                            InterfaceC020509l interfaceC020509l = (InterfaceC020509l) abstractList.get(2);
                            if (z) {
                                AnonymousClass081 anonymousClass081 = (AnonymousClass081) interfaceC017007w;
                                if (C09M.A00().A03 != null) {
                                    int ADL = anonymousClass081.ADL();
                                    AnonymousClass084[] A00 = C893746t.A00(ADL);
                                    int length = A00.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length) {
                                            if (AnonymousClass088.A20(A00[i3], anonymousClass084)) {
                                                ArrayList A142 = AnonymousClass088.A14(interfaceC020509l);
                                                ArrayList arrayList2 = new ArrayList();
                                                for (int i4 = 0; i4 < A142.size(); i4++) {
                                                    arrayList2.add(A00(anonymousClass081, map, emptyList, c25051Dw2, (ArrayList) A142.get(i4)));
                                                }
                                                arrayList.add(new C24941Dl(A0x, anonymousClass084, AnonymousClass088.A0f(arrayList2)));
                                            } else {
                                                i3++;
                                            }
                                        } else if (C09M.A00().A03 != null) {
                                            for (AnonymousClass084 anonymousClass0842 : C893746t.A01(ADL)) {
                                                if (AnonymousClass088.A20(anonymousClass0842, anonymousClass084)) {
                                                    arrayList.add(new C24941Dl(A0x, anonymousClass084, AnonymousClass088.A0f(A00(anonymousClass081, map, emptyList, c25051Dw2, (ArrayList) AnonymousClass088.A0r(interfaceC020509l)))));
                                                    break;
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException("No child attribute mapper configured. Unexpectedly attempting to traverse children nodes.");
                                        }
                                    }
                                    i = 0;
                                    i2 = 1;
                                } else {
                                    throw new IllegalStateException("No child attribute mapper configured. Unexpectedly attempting to traverse children nodes.");
                                }
                            }
                            arrayList.add(new C24941Dl(A0x, anonymousClass084, interfaceC020509l));
                            i = 0;
                            i2 = 1;
                        }
                        if (!arrayList.isEmpty()) {
                            Deque deque = this.A02;
                            if (deque.size() == 0) {
                                clone = new HashMap();
                            } else {
                                clone = ((HashMap) deque.element()).clone();
                            }
                            deque.push(clone);
                            this.A03.push(Integer.valueOf(interfaceC017007w.A8w()));
                            AbstractMap abstractMap = (AbstractMap) deque.element();
                            for (C24941Dl c24941Dl : arrayList) {
                                String str2 = c24941Dl.A02;
                                List list2 = (List) abstractMap.get(str2);
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                    abstractMap.put(str2, list2);
                                }
                                list2.add(new C1E2(c24941Dl.A00, c24941Dl.A01));
                            }
                        }
                    }
                }
                if (interfaceC017007w.getId() != null) {
                    Deque deque2 = this.A02;
                    if (deque2.peek() != null && (list = (List) ((AbstractMap) deque2.peek()).get(interfaceC017007w.getId())) != null) {
                        InterfaceC017007w interfaceC017007w2 = interfaceC017007w;
                        for (C1E2 c1e2 : list) {
                            try {
                                if (interfaceC017007w2.ACd().AUX(interfaceC017007w2, c1e2.A00, (InterfaceC020509l) c1e2.A01)) {
                                    if (interfaceC017007w2 == interfaceC017007w) {
                                        interfaceC017007w2 = interfaceC017007w.AGB();
                                    }
                                    if (!interfaceC017007w2.ACd().ATj(interfaceC017007w2, c1e2.A00, (InterfaceC020509l) c1e2.A01)) {
                                        AnonymousClass084 anonymousClass0843 = c1e2.A00;
                                        AnonymousClass088.A1i("BindUpdater", String.format("Unhandled setProp operation unminifiedKey: %s, minifiedKey: %s", anonymousClass0843.A01, Integer.valueOf(anonymousClass0843.A00)));
                                    }
                                }
                            } catch (IOException unused) {
                            }
                        }
                        list.clear();
                        return interfaceC017007w2;
                    }
                }
                return interfaceC017007w;
            }

            @Override // X.InterfaceC020009g
            public void AQA(InterfaceC017007w interfaceC017007w) {
                Deque deque = this.A03;
                Number number = (Number) deque.peek();
                if (number == null || number.intValue() != interfaceC017007w.A8w()) {
                    return;
                }
                deque.pop();
                this.A02.pop();
            }
        });
        return new Pair(abstractC016907v2, new C25041Dv(abstractC016907v2, hashMap));
    }
}
