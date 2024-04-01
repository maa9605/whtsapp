package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0nG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC14590nG implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14610nI A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public RunnableC14590nG(C14610nI c14610nI, List list, List list2, int i) {
        this.A01 = c14610nI;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        final C14770nY A00 = C14820nd.A00(new AbstractC14760nX() { // from class: X.1UA
            @Override // X.AbstractC14760nX
            public int A00() {
                return RunnableC14590nG.this.A02.size();
            }

            @Override // X.AbstractC14760nX
            public int A01() {
                return RunnableC14590nG.this.A03.size();
            }

            @Override // X.AbstractC14760nX
            public Object A02(int i, int i2) {
                RunnableC14590nG runnableC14590nG = RunnableC14590nG.this;
                Object obj = runnableC14590nG.A03.get(i);
                Object obj2 = runnableC14590nG.A02.get(i2);
                if (obj != null && obj2 != null) {
                    if (runnableC14590nG.A01.A03.A00 != null) {
                        return null;
                    }
                    throw null;
                }
                throw new AssertionError();
            }

            @Override // X.AbstractC14760nX
            public boolean A03(int i, int i2) {
                RunnableC14590nG runnableC14590nG = RunnableC14590nG.this;
                Object obj = runnableC14590nG.A03.get(i);
                Object obj2 = runnableC14590nG.A02.get(i2);
                if (obj != null) {
                    if (obj2 != null) {
                        if (runnableC14590nG.A01.A03.A00 != null) {
                            return true;
                        }
                        throw null;
                    }
                } else if (obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // X.AbstractC14760nX
            public boolean A04(int i, int i2) {
                RunnableC14590nG runnableC14590nG = RunnableC14590nG.this;
                Object obj = runnableC14590nG.A03.get(i);
                Object obj2 = runnableC14590nG.A02.get(i2);
                if (obj == null) {
                    return obj2 == null;
                } else if (obj2 != null) {
                    if (runnableC14590nG.A01.A03.A00 != null) {
                        C74633da c74633da = (C74633da) obj;
                        C74633da c74633da2 = (C74633da) obj2;
                        int i3 = c74633da.A00;
                        if (i3 == c74633da2.A00) {
                            if (i3 == 0 || i3 == 2 || i3 == 3) {
                                return true;
                            }
                            if (c74633da.A02 == c74633da2.A02) {
                                C28241Qv c28241Qv = c74633da.A01;
                                if (c28241Qv != null) {
                                    C28241Qv c28241Qv2 = c74633da2.A01;
                                    if (c28241Qv2 == null || !c28241Qv.A06.equals(c28241Qv2.A06)) {
                                        return false;
                                    }
                                    int i4 = c28241Qv.A01;
                                    int i5 = c28241Qv2.A01;
                                    if (i4 == 1) {
                                        if (i5 != 1) {
                                            return false;
                                        }
                                    } else if (i4 == 11) {
                                        if (i5 != 11) {
                                            return false;
                                        }
                                    } else if (i5 == 11 || i5 == 1) {
                                        return false;
                                    }
                                } else if (c74633da2.A01 != null) {
                                    return false;
                                }
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    throw null;
                } else {
                    return false;
                }
            }
        });
        this.A01.A05.execute(new Runnable() { // from class: X.0nF
            @Override // java.lang.Runnable
            public void run() {
                RunnableC14590nG runnableC14590nG = RunnableC14590nG.this;
                C14610nI c14610nI = runnableC14590nG.A01;
                if (c14610nI.A00 == runnableC14590nG.A00) {
                    List list = runnableC14590nG.A02;
                    C14770nY c14770nY = A00;
                    c14610nI.A01 = list;
                    c14610nI.A02 = Collections.unmodifiableList(list);
                    c14770nY.A02(c14610nI.A04);
                }
            }
        });
    }
}
