package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.util.Pair;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1zI */
/* loaded from: classes2.dex */
public abstract class AbstractC44571zI {
    public final C44351yv A00;

    public AbstractC44571zI(C44351yv c44351yv) {
        this.A00 = c44351yv;
    }

    public String A00() {
        if (this instanceof C44761zb) {
            return "regular_high";
        }
        if (this instanceof C44851zl) {
            return null;
        }
        return !(this instanceof C44861zm) ? !(this instanceof C44661zR) ? !(this instanceof C44721zX) ? !(this instanceof C44701zV) ? !(this instanceof C44871zn) ? ((this instanceof C44791ze) || (this instanceof C44681zT)) ? "regular_high" : !(this instanceof C44831zj) ? !(this instanceof C44741zZ) ? "regular_low" : "regular_high" : "critical_unblock_low" : "critical_block" : "regular_low" : "regular_high" : "regular_low" : "critical_block";
    }

    /* JADX WARN: Finally extract failed */
    public List A01() {
        boolean z;
        if (this instanceof C44761zb) {
            C44761zb c44761zb = (C44761zb) this;
            C0CD A03 = c44761zb.A05.A03();
            try {
                Cursor A032 = c44761zb.A06.A03(null, null);
                List A08 = c44761zb.A08(A032, A03, true);
                ((CursorWrapper) A032).close();
                return A08;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A03.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } else if (this instanceof C44851zl) {
            return Collections.emptyList();
        } else {
            if (this instanceof C44861zm) {
                C44861zm c44861zm = (C44861zm) this;
                return Collections.singletonList(new C44891zp(null, c44861zm.A00.A02(), c44861zm.A01.A05(), null));
            } else if (this instanceof C44661zR) {
                C44661zR c44661zR = (C44661zR) this;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((AbstractCollection) c44661zR.A05.A0F()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C44671zS(null, (AbstractC005302j) it.next(), true, c44661zR.A02.A05(), null, false));
                }
                return arrayList;
            } else if (!(this instanceof C44721zX)) {
                if (!(this instanceof C44701zV)) {
                    if (this instanceof C44871zn) {
                        return Collections.singletonList(((C44871zn) this).A08());
                    }
                    if (this instanceof C44791ze) {
                        return new ArrayList();
                    }
                    if (this instanceof C44681zT) {
                        return Collections.emptyList();
                    }
                    if (this instanceof C44831zj) {
                        C000700j.A08(false, "Please use createBootstrapMutations(initialData) method instead");
                        return ((C44831zj) this).A09(Collections.emptyList());
                    } else if (!(this instanceof C44741zZ)) {
                        C44561zH c44561zH = (C44561zH) this;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = c44561zH.A05.A06().iterator();
                        while (it2.hasNext()) {
                            AbstractC005302j abstractC005302j = (AbstractC005302j) it2.next();
                            arrayList2.add(new C44601zL(null, abstractC005302j, true, c44561zH.A02.A05(), null, false, c44561zH.A00.A02(abstractC005302j, false)));
                        }
                        return arrayList2;
                    } else {
                        return Collections.emptyList();
                    }
                }
                C44701zV c44701zV = (C44701zV) this;
                ArrayList arrayList3 = new ArrayList();
                C05M c05m = c44701zV.A04;
                if (c05m != null) {
                    ArrayList arrayList4 = new ArrayList();
                    ConcurrentHashMap A0C = c05m.A0C();
                    synchronized (c05m) {
                        z = c05m.A00;
                    }
                    if (z) {
                        for (Map.Entry entry : A0C.entrySet()) {
                            AbstractC005302j abstractC005302j2 = (AbstractC005302j) entry.getKey();
                            if (((C0IT) entry.getValue()).A04 == -1 && !c05m.A0G(abstractC005302j2)) {
                                arrayList4.add(abstractC005302j2);
                            }
                        }
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            AbstractC005302j abstractC005302j3 = (AbstractC005302j) it3.next();
                            arrayList3.add(new C44711zW(null, abstractC005302j3, false, c44701zV.A02.A05(), null, false, c44701zV.A00.A02(abstractC005302j3, false)));
                        }
                        return arrayList3;
                    }
                    throw new IllegalStateException("ChatsCache/getMarkedAsUnreadChats: chat haven't initialized");
                }
                throw null;
            } else {
                C44721zX c44721zX = (C44721zX) this;
                ArrayList arrayList5 = new ArrayList();
                C0CB c0cb = c44721zX.A02;
                if (c0cb != null) {
                    HashSet hashSet = new HashSet();
                    C0CD A01 = c0cb.A09().A01();
                    try {
                        Cursor A07 = A01.A02.A07("SELECT jid, mute_end FROM settings WHERE mute_end IS NOT NULL", null);
                        int columnIndex = A07.getColumnIndex("jid");
                        int columnIndex2 = A07.getColumnIndex("mute_end");
                        while (A07.moveToNext()) {
                            AbstractC005302j A02 = AbstractC005302j.A02(A07.getString(columnIndex));
                            if (A02 != null) {
                                hashSet.add(new Pair(A02, Long.valueOf(A07.getLong(columnIndex2))));
                            }
                        }
                        A07.close();
                        A01.close();
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            Pair pair = (Pair) it4.next();
                            AbstractC005302j abstractC005302j4 = (AbstractC005302j) pair.first;
                            long longValue = ((Number) pair.second).longValue();
                            AnonymousClass012 anonymousClass012 = c44721zX.A00;
                            if (longValue > anonymousClass012.A01() || longValue == -1) {
                                arrayList5.add(new C44731zY(null, abstractC005302j4, true, null, false, longValue, anonymousClass012.A05()));
                            }
                        }
                        return arrayList5;
                    } finally {
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public void A02(AbstractC44611zM abstractC44611zM) {
        if (this instanceof C44761zb) {
            C44761zb c44761zb = (C44761zb) this;
            C44771zc c44771zc = (C44771zc) abstractC44611zM;
            AnonymousClass092 A0F = c44761zb.A04.A0F(c44771zc.A01);
            if (A0F != null) {
                c44761zb.A09(c44771zc, A0F);
                c44761zb.A03(c44771zc);
            }
        } else if (this instanceof C44851zl) {
            ((C44851zl) this).A08((C20B) abstractC44611zM, null);
        } else if (this instanceof C44861zm) {
        } else {
            if (this instanceof C44661zR) {
                C44661zR c44661zR = (C44661zR) this;
                C44671zS c44671zS = (C44671zS) abstractC44611zM;
                AbstractC005302j abstractC005302j = c44671zS.A00;
                if (c44661zR.A04.A0E(abstractC005302j)) {
                    c44661zR.A09(c44671zS, abstractC005302j);
                    c44661zR.A03(c44671zS);
                }
            } else if (this instanceof C44721zX) {
                C44721zX c44721zX = (C44721zX) this;
                C44731zY c44731zY = (C44731zY) abstractC44611zM;
                if (c44721zX.A01.A0E(c44731zY.A01)) {
                    c44721zX.A08(c44731zY);
                    c44721zX.A03(c44731zY);
                }
            } else if (this instanceof C44701zV) {
                ((C44701zV) this).A08((C44711zW) abstractC44611zM);
            } else if (this instanceof C44871zn) {
                C000700j.A08(false, "Primary shouldn't process LocaleSettingMutation");
                A03(abstractC44611zM);
            } else if (this instanceof C44791ze) {
                C44791ze c44791ze = (C44791ze) this;
                C44801zf c44801zf = (C44801zf) abstractC44611zM;
                C0C9 c0c9 = c44791ze.A01;
                AnonymousClass092 A0F2 = c0c9.A0F(c44801zf.A02);
                if (A0F2 != null) {
                    c0c9.A0c(Collections.singleton(A0F2), (c44801zf.A03 ? 1 : 0) | 2);
                    c44791ze.A03(c44801zf);
                }
            } else if (this instanceof C44681zT) {
                C44681zT c44681zT = (C44681zT) this;
                C44691zU c44691zU = (C44691zU) abstractC44611zM;
                c44681zT.A06(c44691zU);
                c44681zT.A08(c44691zU);
            } else if (this instanceof C44831zj) {
            } else {
                if (!(this instanceof C44741zZ)) {
                    ((C44561zH) this).A08((C44601zL) abstractC44611zM);
                    return;
                }
                C44741zZ c44741zZ = (C44741zZ) this;
                C44751za c44751za = (C44751za) abstractC44611zM;
                c44741zZ.A06(c44751za);
                c44741zZ.A08(c44751za);
            }
        }
    }

    public final void A03(AbstractC44611zM abstractC44611zM) {
        C44351yv c44351yv = this.A00;
        Set singleton = Collections.singleton(AbstractC44611zM.A00(abstractC44611zM.A06()));
        if (c44351yv != null) {
            if (singleton.isEmpty()) {
                return;
            }
            C0CD A02 = c44351yv.A01.A02();
            try {
                C03790Hb A00 = A02.A00();
                C0Jf c0Jf = new C0Jf(singleton.toArray(C44351yv.A02), 999);
                while (c0Jf.hasNext()) {
                    String[] strArr = (String[]) c0Jf.next();
                    C0CE c0ce = A02.A02;
                    int length = strArr.length;
                    StringBuilder sb = new StringBuilder();
                    sb.append("UPDATE syncd_mutations SET are_dependencies_missing = 0 WHERE mutation_index IN ");
                    sb.append(C05P.A01(length));
                    c0ce.A0D(sb.toString(), strArr);
                }
                A00.A00();
                A00.close();
            } finally {
            }
        } else {
            throw null;
        }
    }

    public final void A04(AbstractC44611zM abstractC44611zM) {
        this.A00.A0I(Collections.singleton(abstractC44611zM.A07));
    }

    public final void A05(AbstractC44611zM abstractC44611zM) {
        abstractC44611zM.A04(false);
        this.A00.A0H(Collections.singleton(abstractC44611zM));
    }

    public final void A06(AbstractC44611zM abstractC44611zM) {
        abstractC44611zM.A04(true);
        this.A00.A0H(Collections.singleton(abstractC44611zM));
    }

    public final void A07(AbstractC44611zM abstractC44611zM, AbstractC44611zM abstractC44611zM2) {
        if (abstractC44611zM2 != null) {
            this.A00.A0F(abstractC44611zM2);
        }
        this.A00.A0H(Collections.singleton(abstractC44611zM));
    }
}
