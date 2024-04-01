package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLException;

/* renamed from: X.3Mx */
/* loaded from: classes2.dex */
public class C69043Mx {
    public final C68873Mg A00;

    public C69043Mx(C76513gi c76513gi) {
        C68863Mf[] c68863MfArr;
        C68913Mk[] c68913MkArr;
        C68893Mi c68893Mi = new C68893Mi();
        try {
            for (C68863Mf c68863Mf : C69053My.A0C) {
                EnumC68903Mj enumC68903Mj = EnumC68903Mj.START;
                if (c68893Mi.A01.get(c68863Mf) == null) {
                    EnumC68903Mj enumC68903Mj2 = c68863Mf.A02;
                    if (enumC68903Mj2 == enumC68903Mj && c68893Mi.A00 != null) {
                        StringBuilder A0P = C000200d.A0P("Start state already exists, new state invalid: ");
                        A0P.append(c68863Mf.A03);
                        throw new C68883Mh(A0P.toString());
                    }
                    c68893Mi.A01.put(c68863Mf, new C68923Ml());
                    if (enumC68903Mj2 == enumC68903Mj) {
                        c68893Mi.A00 = c68863Mf;
                    }
                } else {
                    StringBuilder A0P2 = C000200d.A0P("State already added: ");
                    A0P2.append(c68863Mf.A03);
                    throw new C68883Mh(A0P2.toString());
                }
            }
            for (C68913Mk c68913Mk : C68953Mo.A0V) {
                C68923Ml c68923Ml = (C68923Ml) c68893Mi.A01.get(c68913Mk.A02);
                if (c68923Ml != null) {
                    if (c68893Mi.A01.get(c68913Mk.A01) != null) {
                        c68923Ml.A00.add(c68913Mk);
                    } else {
                        StringBuilder A0P3 = C000200d.A0P("Cannot find output state for transition ");
                        A0P3.append(c68913Mk.A04);
                        throw new C68883Mh(A0P3.toString());
                    }
                } else {
                    StringBuilder A0P4 = C000200d.A0P("Cannot find input state for transition ");
                    A0P4.append(c68913Mk.A04);
                    throw new C68883Mh(A0P4.toString());
                }
            }
            EnumC68903Mj enumC68903Mj3 = EnumC68903Mj.END;
            if (c68893Mi.A00 != null) {
                for (C68863Mf c68863Mf2 : c68893Mi.A01.keySet()) {
                    if (c68863Mf2.A02 == enumC68903Mj3) {
                        HashSet hashSet = new HashSet();
                        for (Map.Entry entry : c68893Mi.A01.entrySet()) {
                            if (((C68923Ml) entry.getValue()).A00.size() == 0 && ((C68863Mf) entry.getKey()).A02 != enumC68903Mj3) {
                                StringBuilder A0P5 = C000200d.A0P("Non-end state with no outbound transitions: ");
                                A0P5.append(((C68863Mf) entry.getKey()).A03);
                                throw new C68883Mh(A0P5.toString());
                            }
                            C68923Ml c68923Ml2 = (C68923Ml) entry.getValue();
                            if (c68923Ml2 != null) {
                                HashSet hashSet2 = new HashSet();
                                Iterator it = c68923Ml2.A00.iterator();
                                while (it.hasNext()) {
                                    hashSet2.add(((C68913Mk) it.next()).A01);
                                }
                                hashSet.addAll(hashSet2);
                            } else {
                                throw null;
                            }
                        }
                        if (c68893Mi.A01.size() - hashSet.size() <= 1) {
                            if (c68893Mi.A01.size() - hashSet.size() == 1 && hashSet.contains(c68893Mi.A00)) {
                                throw new C68883Mh("Non-start state(s) with no incoming transitions exist(s)");
                            }
                            c68893Mi.A02 = true;
                            this.A00 = new C68873Mg(c68893Mi, c76513gi);
                            return;
                        }
                        throw new C68883Mh("Non-start state(s) with no incoming transitions exist(s)");
                    }
                }
                throw new C68883Mh("State machine must have an end state");
            }
            throw new C68883Mh("State machine must have a start state");
        } catch (C68883Mh e) {
            e = e;
            throw new C27871Pc((byte) 80, new SSLException("Failed to init finite state machine.", e.getCause() != null ? e.getCause() : e));
        }
    }

    public synchronized void A00(C68853Me c68853Me) {
        AbstractC68833Mc abstractC68833Mc;
        AbstractC68833Mc abstractC68833Mc2;
        try {
            C68873Mg c68873Mg = this.A00;
            C68893Mi c68893Mi = c68873Mg.A02;
            C68863Mf c68863Mf = c68873Mg.A00;
            if (c68893Mi.A02) {
                Iterator it = ((C68923Ml) c68893Mi.A01.get(c68863Mf)).A00.iterator();
                while (it.hasNext()) {
                    C68913Mk c68913Mk = (C68913Mk) it.next();
                    if (c68913Mk.A03.isInstance(c68853Me)) {
                        C68863Mf c68863Mf2 = c68913Mk.A01;
                        C68863Mf c68863Mf3 = c68873Mg.A00;
                        if (c68863Mf2 != c68863Mf3 && (abstractC68833Mc2 = c68863Mf3.A01) != null) {
                            abstractC68833Mc2.A00(c68853Me, c68873Mg.A01, c68913Mk, 1);
                        }
                        AbstractC68833Mc abstractC68833Mc3 = c68913Mk.A00;
                        if (abstractC68833Mc3 != null) {
                            abstractC68833Mc3.A00(c68853Me, c68873Mg.A01, c68913Mk, 2);
                        }
                        if (c68863Mf2 != c68873Mg.A00 && (abstractC68833Mc = c68863Mf2.A00) != null) {
                            abstractC68833Mc.A00(c68853Me, c68873Mg.A01, c68913Mk, 3);
                        }
                        c68873Mg.A00 = c68863Mf2;
                    }
                }
                StringBuilder A0P = C000200d.A0P("No valid transition from state: ");
                A0P.append(c68863Mf.A03);
                throw new C68883Mh(A0P.toString());
            }
            throw new C68883Mh("State machine map is not initialized - call build()");
        } catch (C68883Mh e) {
            e = e;
            if (!(e.getCause() instanceof C27871Pc)) {
                if (e.getCause() != null) {
                    e = e.getCause();
                }
                throw new C27871Pc((byte) 80, new SSLException("Internal Error", e));
            }
            throw ((C27871Pc) e.getCause());
        }
    }
}
