package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0j5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12240j5 {
    public C0YD A00;
    public C0YD A01;
    public boolean A06 = true;
    public boolean A07 = true;
    public ArrayList A05 = new ArrayList();
    public InterfaceC12210j2 A03 = null;
    public C12200j1 A02 = new C12200j1();
    public ArrayList A04 = new ArrayList();

    public C12240j5(C0YD c0yd) {
        this.A00 = c0yd;
        this.A01 = c0yd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r20 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A00(X.C0YD r19, int r20) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12240j5.A00(X.0YD, int):int");
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.1o8] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.1o8] */
    public void A01() {
        ArrayList arrayList = this.A05;
        arrayList.clear();
        this.A01.A0c.A09();
        this.A01.A0d.A09();
        C0YD c0yd = this.A01;
        arrayList.add(c0yd.A0c);
        arrayList.add(c0yd.A0d);
        Iterator it = ((C0YE) c0yd).A00.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            final C0YF c0yf = (C0YF) it.next();
            if (c0yf instanceof C28581Sq) {
                arrayList.add(new AbstractC28611St(c0yf) { // from class: X.1oA
                    @Override // X.AbstractC28611St
                    public boolean A0A() {
                        return false;
                    }

                    {
                        super(c0yf);
                        c0yf.A0c.A09();
                        c0yf.A0d.A09();
                        this.A01 = ((C28581Sq) c0yf).A01;
                    }

                    @Override // X.AbstractC28611St
                    public void A07() {
                        C0YF c0yf2 = this.A03;
                        C28581Sq c28581Sq = (C28581Sq) c0yf2;
                        int i = c28581Sq.A02;
                        int i2 = c28581Sq.A03;
                        if (c28581Sq.A01 == 1) {
                            C28601Ss c28601Ss = this.A05;
                            if (i != -1) {
                                c28601Ss.A08.add(c0yf2.A0Z.A0c.A05);
                                this.A03.A0Z.A0c.A05.A07.add(this.A05);
                                this.A05.A00 = i;
                            } else if (i2 != -1) {
                                c28601Ss.A08.add(c0yf2.A0Z.A0c.A04);
                                this.A03.A0Z.A0c.A04.A07.add(this.A05);
                                this.A05.A00 = -i2;
                            } else {
                                c28601Ss.A09 = true;
                                c28601Ss.A08.add(c0yf2.A0Z.A0c.A04);
                                this.A03.A0Z.A0c.A04.A07.add(this.A05);
                            }
                            A0B(this.A03.A0c.A05);
                            A0B(this.A03.A0c.A04);
                            return;
                        }
                        C28601Ss c28601Ss2 = this.A05;
                        if (i != -1) {
                            c28601Ss2.A08.add(c0yf2.A0Z.A0d.A05);
                            this.A03.A0Z.A0d.A05.A07.add(this.A05);
                            this.A05.A00 = i;
                        } else if (i2 != -1) {
                            c28601Ss2.A08.add(c0yf2.A0Z.A0d.A04);
                            this.A03.A0Z.A0d.A04.A07.add(this.A05);
                            this.A05.A00 = -i2;
                        } else {
                            c28601Ss2.A09 = true;
                            c28601Ss2.A08.add(c0yf2.A0Z.A0d.A04);
                            this.A03.A0Z.A0d.A04.A07.add(this.A05);
                        }
                        A0B(this.A03.A0d.A05);
                        A0B(this.A03.A0d.A04);
                    }

                    @Override // X.AbstractC28611St
                    public void A08() {
                        C0YF c0yf2 = this.A03;
                        if (((C28581Sq) c0yf2).A01 == 1) {
                            c0yf2.A0P = this.A05.A02;
                        } else {
                            c0yf2.A0Q = this.A05.A02;
                        }
                    }

                    @Override // X.AbstractC28611St
                    public void A09() {
                        this.A05.A00();
                    }

                    public final void A0B(C28601Ss c28601Ss) {
                        this.A05.A07.add(c28601Ss);
                        c28601Ss.A08.add(this.A05);
                    }

                    @Override // X.AbstractC28611St, X.InterfaceC12230j4
                    public void AVk(InterfaceC12230j4 interfaceC12230j4) {
                        C28601Ss c28601Ss = this.A05;
                        if (c28601Ss.A0A && !c28601Ss.A0B) {
                            this.A05.A01((int) ((((C28601Ss) c28601Ss.A08.get(0)).A02 * ((C28581Sq) this.A03).A00) + 0.5f));
                        }
                    }
                });
            } else {
                if (c0yf.A0H()) {
                    C38431o8 c38431o8 = c0yf.A0a;
                    C38431o8 c38431o82 = c38431o8;
                    if (c38431o8 == null) {
                        ?? r0 = new AbstractC28611St(c0yf, 0) { // from class: X.1o8
                            public int A00;
                            public ArrayList A01;

                            {
                                C0YF c0yf2;
                                AbstractC28611St abstractC28611St;
                                int i;
                                AbstractC28611St abstractC28611St2;
                                ArrayList arrayList2 = new ArrayList();
                                this.A01 = arrayList2;
                                super.A01 = r7;
                                C0YF c0yf3 = this.A03;
                                C0YF A06 = c0yf3.A06(r7);
                                while (true) {
                                    c0yf2 = c0yf3;
                                    c0yf3 = A06;
                                    if (A06 == null) {
                                        break;
                                    }
                                    A06 = A06.A06(r7);
                                }
                                this.A03 = c0yf2;
                                if (r7 == 0) {
                                    abstractC28611St = c0yf2.A0c;
                                } else if (r7 != 1) {
                                    abstractC28611St = null;
                                } else {
                                    abstractC28611St = c0yf2.A0d;
                                }
                                arrayList2.add(abstractC28611St);
                                C0YF A05 = c0yf2.A05(r7);
                                while (A05 != null) {
                                    if (r7 == 0) {
                                        abstractC28611St2 = A05.A0c;
                                    } else if (r7 != 1) {
                                        abstractC28611St2 = null;
                                    } else {
                                        abstractC28611St2 = A05.A0d;
                                    }
                                    arrayList2.add(abstractC28611St2);
                                    A05 = A05.A05(r7);
                                }
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    AbstractC28611St abstractC28611St3 = (AbstractC28611St) it2.next();
                                    int i2 = super.A01;
                                    if (i2 == 0) {
                                        abstractC28611St3.A03.A0a = this;
                                    } else if (i2 == 1) {
                                        abstractC28611St3.A03.A0b = this;
                                    }
                                }
                                int i3 = super.A01;
                                if (i3 == 0 && ((C0YD) this.A03.A0Z).A0A) {
                                    ArrayList arrayList3 = this.A01;
                                    if (arrayList3.size() > 1) {
                                        this.A03 = ((AbstractC28611St) arrayList3.get(arrayList3.size() - 1)).A03;
                                    }
                                }
                                C0YF c0yf4 = this.A03;
                                if (i3 == 0) {
                                    i = c0yf4.A0A;
                                } else {
                                    i = c0yf4.A0L;
                                }
                                this.A00 = i;
                            }

                            @Override // X.AbstractC28611St
                            public long A04() {
                                ArrayList arrayList2 = this.A01;
                                int size = arrayList2.size();
                                long j = 0;
                                for (int i = 0; i < size; i++) {
                                    AbstractC28611St abstractC28611St = (AbstractC28611St) arrayList2.get(i);
                                    j = abstractC28611St.A04.A00 + abstractC28611St.A04() + j + abstractC28611St.A05.A00;
                                }
                                return j;
                            }

                            @Override // X.AbstractC28611St
                            public void A07() {
                                Iterator it2 = this.A01.iterator();
                                while (it2.hasNext()) {
                                    ((AbstractC28611St) it2.next()).A07();
                                }
                                ArrayList arrayList2 = this.A01;
                                int size = arrayList2.size();
                                if (size < 1) {
                                    return;
                                }
                                C0YF c0yf2 = ((AbstractC28611St) arrayList2.get(0)).A03;
                                C0YF c0yf3 = ((AbstractC28611St) arrayList2.get(size - 1)).A03;
                                if (super.A01 == 0) {
                                    C0YJ c0yj = c0yf2.A0W;
                                    C0YJ c0yj2 = c0yf3.A0X;
                                    C28601Ss A01 = AbstractC28611St.A01(c0yj, 0);
                                    int A00 = c0yj.A00();
                                    int i = 0;
                                    while (true) {
                                        ArrayList arrayList3 = this.A01;
                                        if (i >= arrayList3.size()) {
                                            break;
                                        }
                                        C0YF c0yf4 = ((AbstractC28611St) arrayList3.get(i)).A03;
                                        if (c0yf4.A0N != 8) {
                                            A00 = c0yf4.A0W.A00();
                                            break;
                                        }
                                        i++;
                                    }
                                    if (A01 != null) {
                                        C28601Ss c28601Ss = this.A05;
                                        c28601Ss.A08.add(A01);
                                        c28601Ss.A00 = A00;
                                        A01.A07.add(c28601Ss);
                                    }
                                    C28601Ss A012 = AbstractC28611St.A01(c0yj2, 0);
                                    int A002 = c0yj2.A00();
                                    ArrayList arrayList4 = this.A01;
                                    int size2 = arrayList4.size() - 1;
                                    while (true) {
                                        if (size2 < 0) {
                                            break;
                                        }
                                        C0YF c0yf5 = ((AbstractC28611St) arrayList4.get(size2)).A03;
                                        if (c0yf5.A0N != 8) {
                                            A002 = c0yf5.A0X.A00();
                                            break;
                                        }
                                        size2--;
                                    }
                                    if (A012 != null) {
                                        C28601Ss c28601Ss2 = this.A04;
                                        c28601Ss2.A08.add(A012);
                                        c28601Ss2.A00 = -A002;
                                        A012.A07.add(c28601Ss2);
                                    }
                                } else {
                                    C0YJ c0yj3 = c0yf2.A0Y;
                                    C0YJ c0yj4 = c0yf3.A0S;
                                    C28601Ss A013 = AbstractC28611St.A01(c0yj3, 1);
                                    int A003 = c0yj3.A00();
                                    int i2 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = this.A01;
                                        if (i2 >= arrayList5.size()) {
                                            break;
                                        }
                                        C0YF c0yf6 = ((AbstractC28611St) arrayList5.get(i2)).A03;
                                        if (c0yf6.A0N != 8) {
                                            A003 = c0yf6.A0Y.A00();
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (A013 != null) {
                                        C28601Ss c28601Ss3 = this.A05;
                                        c28601Ss3.A08.add(A013);
                                        c28601Ss3.A00 = A003;
                                        A013.A07.add(c28601Ss3);
                                    }
                                    C28601Ss A014 = AbstractC28611St.A01(c0yj4, 1);
                                    int A004 = c0yj4.A00();
                                    ArrayList arrayList6 = this.A01;
                                    int size3 = arrayList6.size() - 1;
                                    while (true) {
                                        if (size3 < 0) {
                                            break;
                                        }
                                        C0YF c0yf7 = ((AbstractC28611St) arrayList6.get(size3)).A03;
                                        if (c0yf7.A0N != 8) {
                                            A004 = c0yf7.A0S.A00();
                                            break;
                                        }
                                        size3--;
                                    }
                                    if (A014 != null) {
                                        C28601Ss c28601Ss4 = this.A04;
                                        c28601Ss4.A08.add(A014);
                                        c28601Ss4.A00 = -A004;
                                        A014.A07.add(c28601Ss4);
                                    }
                                }
                                this.A05.A03 = this;
                                this.A04.A03 = this;
                            }

                            @Override // X.AbstractC28611St
                            public void A08() {
                                int i = 0;
                                while (true) {
                                    ArrayList arrayList2 = this.A01;
                                    if (i >= arrayList2.size()) {
                                        return;
                                    }
                                    ((AbstractC28611St) arrayList2.get(i)).A08();
                                    i++;
                                }
                            }

                            @Override // X.AbstractC28611St
                            public void A09() {
                                this.A07 = null;
                                Iterator it2 = this.A01.iterator();
                                while (it2.hasNext()) {
                                    ((AbstractC28611St) it2.next()).A09();
                                }
                            }

                            @Override // X.AbstractC28611St
                            public boolean A0A() {
                                ArrayList arrayList2 = this.A01;
                                int size = arrayList2.size();
                                for (int i = 0; i < size; i++) {
                                    if (!((AbstractC28611St) arrayList2.get(i)).A0A()) {
                                        return false;
                                    }
                                }
                                return true;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:100:0x0182, code lost:
                                r0 = java.lang.Math.max(r0, r15);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:101:0x0188, code lost:
                                if (r1 <= 0) goto L112;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:102:0x018a, code lost:
                                r0 = java.lang.Math.min(r1, r0);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:103:0x018e, code lost:
                                if (r0 == r2) goto L102;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:105:0x0191, code lost:
                                r15 = r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:106:0x0193, code lost:
                                r2 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:107:0x0196, code lost:
                                r19 = r19 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:108:0x019a, code lost:
                                if (r16 <= 0) goto L137;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:109:0x019c, code lost:
                                r6 = r6 - r16;
                                r1 = 0;
                                r7 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:110:0x01a0, code lost:
                                if (r1 >= r11) goto L136;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:111:0x01a2, code lost:
                                r2 = (X.AbstractC28611St) r23.A01.get(r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:112:0x01b0, code lost:
                                if (r2.A03.A0N == 8) goto L135;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:113:0x01b2, code lost:
                                if (r1 <= 0) goto L127;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:114:0x01b4, code lost:
                                if (r1 < r10) goto L127;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:115:0x01b6, code lost:
                                r7 = r7 + r2.A05.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:116:0x01bb, code lost:
                                r7 = r7 + r2.A06.A02;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:117:0x01c0, code lost:
                                if (r1 >= r8) goto L134;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:118:0x01c2, code lost:
                                if (r1 >= r9) goto L133;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:119:0x01c4, code lost:
                                r7 = r7 + (-r2.A04.A00);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:120:0x01ca, code lost:
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:121:0x01cd, code lost:
                                r1 = 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:122:0x01cf, code lost:
                                r1 = 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:123:0x01d2, code lost:
                                if (r23.A00 != 2) goto L141;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:124:0x01d4, code lost:
                                if (r16 != 0) goto L141;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:125:0x01d6, code lost:
                                r23.A00 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:126:0x01d9, code lost:
                                if (r7 <= r12) goto L143;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:127:0x01db, code lost:
                                r23.A00 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:128:0x01dd, code lost:
                                if (r18 <= 0) goto L147;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:129:0x01df, code lost:
                                if (r6 != 0) goto L147;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:130:0x01e1, code lost:
                                if (r10 != r9) goto L147;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:131:0x01e3, code lost:
                                r23.A00 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:132:0x01e5, code lost:
                                r2 = r23.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:133:0x01e8, code lost:
                                if (r2 != 1) goto L200;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:134:0x01ea, code lost:
                                r0 = r18;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:135:0x01ec, code lost:
                                if (r0 <= 1) goto L197;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:136:0x01ee, code lost:
                                r12 = (r12 - r7) / (r18 - 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:137:0x01f3, code lost:
                                if (r6 <= 0) goto L154;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:138:0x01f5, code lost:
                                r12 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:139:0x01f6, code lost:
                                r2 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:140:0x01f7, code lost:
                                if (r2 >= r11) goto L195;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:141:0x01f9, code lost:
                                r1 = r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:142:0x01fa, code lost:
                                if (r13 == false) goto L159;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:143:0x01fc, code lost:
                                r1 = r11 - (r2 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:144:0x0200, code lost:
                                r3 = (X.AbstractC28611St) r23.A01.get(r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:145:0x020e, code lost:
                                if (r3.A03.A0N != 8) goto L164;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:146:0x0210, code lost:
                                r0 = r19;
                                r3.A05.A01(r0);
                                r3.A04.A01(r0);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:147:0x021c, code lost:
                                r2 = r2 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:148:0x021f, code lost:
                                if (r2 <= 0) goto L194;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:149:0x0221, code lost:
                                if (r13 == false) goto L193;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:150:0x0223, code lost:
                                r19 = r19 - r12;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:151:0x0225, code lost:
                                if (r2 < r10) goto L194;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:152:0x0227, code lost:
                                r0 = r3.A05.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:153:0x022b, code lost:
                                if (r13 == false) goto L191;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:154:0x022d, code lost:
                                r19 = r19 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:155:0x022f, code lost:
                                r3.A04.A01(r19);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:156:0x0236, code lost:
                                r5 = r3.A06;
                                r4 = r5.A02;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:157:0x023e, code lost:
                                if (r3.A02 != r20) goto L177;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:159:0x0243, code lost:
                                if (r3.A00 != 1) goto L177;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:160:0x0245, code lost:
                                r4 = r5.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:161:0x0247, code lost:
                                if (r13 == false) goto L190;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:162:0x0249, code lost:
                                r19 = r19 - r4;
                                r3.A05.A01(r19);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:163:0x0252, code lost:
                                r3.A09 = true;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:164:0x0255, code lost:
                                if (r2 >= r8) goto L189;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:165:0x0257, code lost:
                                if (r2 >= r9) goto L188;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:166:0x0259, code lost:
                                r0 = -r3.A04.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:167:0x025e, code lost:
                                if (r13 == false) goto L186;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:168:0x0260, code lost:
                                r19 = r19 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:169:0x0263, code lost:
                                r19 = r19 + r4;
                                r3.A04.A01(r19);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:170:0x026d, code lost:
                                r19 = r19 + r12;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:171:0x0270, code lost:
                                if (r13 == false) goto L192;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:173:0x0273, code lost:
                                r19 = r19 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:174:0x0275, code lost:
                                r3.A05.A01(r19);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:175:0x027d, code lost:
                                r19 = r19 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:176:0x0280, code lost:
                                if (r0 != 1) goto L199;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:177:0x0282, code lost:
                                r12 = (r12 - r7) / 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:178:0x0287, code lost:
                                r12 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:179:0x028a, code lost:
                                if (r2 != 0) goto L246;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:180:0x028c, code lost:
                                r12 = (r12 - r7) / (r18 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:181:0x0291, code lost:
                                if (r6 <= 0) goto L204;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:182:0x0293, code lost:
                                r12 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:183:0x0294, code lost:
                                r2 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:184:0x0295, code lost:
                                if (r2 >= r11) goto L244;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:185:0x0297, code lost:
                                r1 = r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:186:0x0298, code lost:
                                if (r13 == false) goto L209;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:187:0x029a, code lost:
                                r1 = r11 - (r2 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:188:0x029e, code lost:
                                r3 = (X.AbstractC28611St) r23.A01.get(r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:189:0x02ac, code lost:
                                if (r3.A03.A0N != 8) goto L214;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:190:0x02ae, code lost:
                                r0 = r19;
                                r3.A05.A01(r0);
                                r3.A04.A01(r0);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:191:0x02ba, code lost:
                                r2 = r2 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:192:0x02bd, code lost:
                                if (r13 == false) goto L243;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:193:0x02bf, code lost:
                                r19 = r19 - r12;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:194:0x02c1, code lost:
                                if (r2 <= 0) goto L242;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:195:0x02c3, code lost:
                                if (r2 < r10) goto L242;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:196:0x02c5, code lost:
                                r0 = r3.A05.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:197:0x02c9, code lost:
                                if (r13 == false) goto L240;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:198:0x02cb, code lost:
                                r19 = r19 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:199:0x02cd, code lost:
                                r3.A04.A01(r19);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:200:0x02d4, code lost:
                                r5 = r3.A06;
                                r4 = r5.A02;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:201:0x02dc, code lost:
                                if (r3.A02 != r20) goto L227;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:203:0x02e1, code lost:
                                if (r3.A00 != 1) goto L227;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:204:0x02e3, code lost:
                                r4 = java.lang.Math.min(r4, r5.A00);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:205:0x02e9, code lost:
                                if (r13 == false) goto L239;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:206:0x02eb, code lost:
                                r19 = r19 - r4;
                                r3.A05.A01(r19);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:207:0x02f4, code lost:
                                if (r2 >= r8) goto L238;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:208:0x02f6, code lost:
                                if (r2 >= r9) goto L237;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:209:0x02f8, code lost:
                                r0 = -r3.A04.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:210:0x02fd, code lost:
                                if (r13 == false) goto L235;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:211:0x02ff, code lost:
                                r19 = r19 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:212:0x0302, code lost:
                                r19 = r19 + r4;
                                r3.A04.A01(r19);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:213:0x030c, code lost:
                                if (r13 == false) goto L241;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:215:0x030f, code lost:
                                r19 = r19 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:216:0x0311, code lost:
                                r3.A05.A01(r19);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:217:0x0319, code lost:
                                r19 = r19 + r12;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:218:0x031c, code lost:
                                r19 = r19 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:220:0x0320, code lost:
                                if (r2 != 2) goto L300;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:222:0x0324, code lost:
                                if (r23.A01 != 0) goto L299;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:223:0x0326, code lost:
                                r2 = r23.A03.A02;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:224:0x032a, code lost:
                                if (r13 == false) goto L253;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:225:0x032c, code lost:
                                r2 = 1.0f - r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:226:0x0330, code lost:
                                r0 = (int) (((r12 - r7) * r2) + 0.5f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:227:0x0337, code lost:
                                if (r0 < 0) goto L298;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:228:0x0339, code lost:
                                if (r6 <= 0) goto L256;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:229:0x033b, code lost:
                                r0 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:230:0x033c, code lost:
                                r2 = r19 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:231:0x033e, code lost:
                                if (r13 == false) goto L259;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:232:0x0340, code lost:
                                r2 = r19 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:233:0x0342, code lost:
                                r1 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:234:0x0343, code lost:
                                if (r1 >= r11) goto L296;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:235:0x0345, code lost:
                                r3 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:236:0x0346, code lost:
                                if (r13 == false) goto L264;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:237:0x0348, code lost:
                                r3 = r11 - (r1 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:238:0x034c, code lost:
                                r4 = (X.AbstractC28611St) r23.A01.get(r3);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:239:0x035a, code lost:
                                if (r4.A03.A0N != 8) goto L269;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:240:0x035c, code lost:
                                r4.A05.A01(r2);
                                r4.A04.A01(r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:241:0x0366, code lost:
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:242:0x0369, code lost:
                                if (r1 <= 0) goto L295;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:243:0x036b, code lost:
                                if (r1 < r10) goto L295;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:244:0x036d, code lost:
                                r0 = r4.A05.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:245:0x0371, code lost:
                                if (r13 == false) goto L293;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:246:0x0373, code lost:
                                r2 = r2 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:247:0x0374, code lost:
                                r4.A04.A01(r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:248:0x0379, code lost:
                                r6 = r4.A06;
                                r5 = r6.A02;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:249:0x0381, code lost:
                                if (r4.A02 != r20) goto L280;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:251:0x0386, code lost:
                                if (r4.A00 != 1) goto L280;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:252:0x0388, code lost:
                                r5 = r6.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:253:0x038a, code lost:
                                if (r13 == false) goto L292;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:254:0x038c, code lost:
                                r2 = r2 - r5;
                                r4.A05.A01(r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:255:0x0392, code lost:
                                if (r1 >= r8) goto L291;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:256:0x0394, code lost:
                                if (r1 >= r9) goto L290;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:257:0x0396, code lost:
                                r0 = -r4.A04.A00;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:258:0x039b, code lost:
                                if (r13 == false) goto L288;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:259:0x039d, code lost:
                                r2 = r2 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:260:0x039f, code lost:
                                r2 = r2 + r5;
                                r4.A04.A01(r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:261:0x03a6, code lost:
                                if (r13 == false) goto L294;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:263:0x03a9, code lost:
                                r2 = r2 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:264:0x03aa, code lost:
                                r4.A05.A01(r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:265:0x03b0, code lost:
                                r2 = r2 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:266:0x03b2, code lost:
                                r2 = r23.A03.A06;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:311:?, code lost:
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:312:?, code lost:
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:313:?, code lost:
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:314:?, code lost:
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:65:0x00f0, code lost:
                                if (r13 == false) goto L74;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:66:0x00f2, code lost:
                                r19 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:68:0x00f6, code lost:
                                if (r7 <= r12) goto L80;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:69:0x00f8, code lost:
                                r0 = (int) (((r7 - r12) / 2.0f) + 0.5f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:70:0x0100, code lost:
                                if (r13 == false) goto L79;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
                                r19 = r19 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:72:0x0104, code lost:
                                if (r6 <= 0) goto L301;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:73:0x0106, code lost:
                                r5 = r12 - r7;
                                r0 = (int) ((r5 / r6) + 0.5f);
                                r4 = 0;
                                r16 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:74:0x0113, code lost:
                                if (r4 >= r11) goto L118;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:75:0x0115, code lost:
                                r15 = (X.AbstractC28611St) r23.A01.get(r4);
                                r0 = r15.A03;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:76:0x0123, code lost:
                                if (r0.A0N == 8) goto L117;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:78:0x0129, code lost:
                                if (r15.A02 != r20) goto L116;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:79:0x012b, code lost:
                                r3 = r15.A06;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:80:0x012f, code lost:
                                if (r3.A0B != false) goto L115;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:82:0x0134, code lost:
                                if (r17 <= 0.0f) goto L114;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:83:0x0136, code lost:
                                r2 = (int) (((r0.A0j[r23.A01] * r5) / r17) + 0.5f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:85:0x0145, code lost:
                                if (r23.A01 != 0) goto L106;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:86:0x0147, code lost:
                                r1 = r0.A0F;
                                r0 = r0.A0H;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
                                if (r15.A00 != 1) goto L105;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
                                r15 = java.lang.Math.min(r2, r3.A00);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:89:0x0158, code lost:
                                r0 = java.lang.Math.max(r0, r15);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:90:0x015e, code lost:
                                if (r1 <= 0) goto L100;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
                                r0 = java.lang.Math.min(r1, r0);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0164, code lost:
                                if (r0 == r2) goto L102;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:93:0x0166, code lost:
                                r16 = r16 + 1;
                                r2 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
                                r3.A01(r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:95:0x016c, code lost:
                                r4 = r4 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:96:0x016f, code lost:
                                r15 = r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:97:0x0171, code lost:
                                r1 = r0.A0E;
                                r0 = r0.A0G;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:98:0x017a, code lost:
                                if (r15.A00 != 1) goto L113;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:99:0x017c, code lost:
                                r15 = java.lang.Math.min(r2, r3.A00);
                             */
                            @Override // X.AbstractC28611St, X.InterfaceC12230j4
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void AVk(X.InterfaceC12230j4 r24) {
                                /*
                                    Method dump skipped, instructions count: 953
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C38431o8.AVk(X.0j4):void");
                            }

                            public String toString() {
                                StringBuilder A0P = C000200d.A0P("ChainRun ");
                                A0P.append(super.A01 == 0 ? "horizontal : " : "vertical : ");
                                String obj = A0P.toString();
                                Iterator it2 = this.A01.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    String A0H = C000200d.A0H(obj, "<");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(A0H);
                                    sb.append(next);
                                    obj = C000200d.A0H(sb.toString(), "> ");
                                }
                                return obj;
                            }
                        };
                        c0yf.A0a = r0;
                        c38431o82 = r0;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c38431o82);
                } else {
                    arrayList.add(c0yf.A0c);
                }
                if (c0yf.A0I()) {
                    C38431o8 c38431o83 = c0yf.A0b;
                    C38431o8 c38431o84 = c38431o83;
                    if (c38431o83 == null) {
                        ?? r02 = new AbstractC28611St(c0yf, 1) { // from class: X.1o8
                            public int A00;
                            public ArrayList A01;

                            {
                                C0YF c0yf2;
                                AbstractC28611St abstractC28611St;
                                int i;
                                AbstractC28611St abstractC28611St2;
                                ArrayList arrayList2 = new ArrayList();
                                this.A01 = arrayList2;
                                super.A01 = r7;
                                C0YF c0yf3 = this.A03;
                                C0YF A06 = c0yf3.A06(r7);
                                while (true) {
                                    c0yf2 = c0yf3;
                                    c0yf3 = A06;
                                    if (A06 == null) {
                                        break;
                                    }
                                    A06 = A06.A06(r7);
                                }
                                this.A03 = c0yf2;
                                if (r7 == 0) {
                                    abstractC28611St = c0yf2.A0c;
                                } else if (r7 != 1) {
                                    abstractC28611St = null;
                                } else {
                                    abstractC28611St = c0yf2.A0d;
                                }
                                arrayList2.add(abstractC28611St);
                                C0YF A05 = c0yf2.A05(r7);
                                while (A05 != null) {
                                    if (r7 == 0) {
                                        abstractC28611St2 = A05.A0c;
                                    } else if (r7 != 1) {
                                        abstractC28611St2 = null;
                                    } else {
                                        abstractC28611St2 = A05.A0d;
                                    }
                                    arrayList2.add(abstractC28611St2);
                                    A05 = A05.A05(r7);
                                }
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    AbstractC28611St abstractC28611St3 = (AbstractC28611St) it2.next();
                                    int i2 = super.A01;
                                    if (i2 == 0) {
                                        abstractC28611St3.A03.A0a = this;
                                    } else if (i2 == 1) {
                                        abstractC28611St3.A03.A0b = this;
                                    }
                                }
                                int i3 = super.A01;
                                if (i3 == 0 && ((C0YD) this.A03.A0Z).A0A) {
                                    ArrayList arrayList3 = this.A01;
                                    if (arrayList3.size() > 1) {
                                        this.A03 = ((AbstractC28611St) arrayList3.get(arrayList3.size() - 1)).A03;
                                    }
                                }
                                C0YF c0yf4 = this.A03;
                                if (i3 == 0) {
                                    i = c0yf4.A0A;
                                } else {
                                    i = c0yf4.A0L;
                                }
                                this.A00 = i;
                            }

                            @Override // X.AbstractC28611St
                            public long A04() {
                                ArrayList arrayList2 = this.A01;
                                int size = arrayList2.size();
                                long j = 0;
                                for (int i = 0; i < size; i++) {
                                    AbstractC28611St abstractC28611St = (AbstractC28611St) arrayList2.get(i);
                                    j = abstractC28611St.A04.A00 + abstractC28611St.A04() + j + abstractC28611St.A05.A00;
                                }
                                return j;
                            }

                            @Override // X.AbstractC28611St
                            public void A07() {
                                Iterator it2 = this.A01.iterator();
                                while (it2.hasNext()) {
                                    ((AbstractC28611St) it2.next()).A07();
                                }
                                ArrayList arrayList2 = this.A01;
                                int size = arrayList2.size();
                                if (size < 1) {
                                    return;
                                }
                                C0YF c0yf2 = ((AbstractC28611St) arrayList2.get(0)).A03;
                                C0YF c0yf3 = ((AbstractC28611St) arrayList2.get(size - 1)).A03;
                                if (super.A01 == 0) {
                                    C0YJ c0yj = c0yf2.A0W;
                                    C0YJ c0yj2 = c0yf3.A0X;
                                    C28601Ss A01 = AbstractC28611St.A01(c0yj, 0);
                                    int A00 = c0yj.A00();
                                    int i = 0;
                                    while (true) {
                                        ArrayList arrayList3 = this.A01;
                                        if (i >= arrayList3.size()) {
                                            break;
                                        }
                                        C0YF c0yf4 = ((AbstractC28611St) arrayList3.get(i)).A03;
                                        if (c0yf4.A0N != 8) {
                                            A00 = c0yf4.A0W.A00();
                                            break;
                                        }
                                        i++;
                                    }
                                    if (A01 != null) {
                                        C28601Ss c28601Ss = this.A05;
                                        c28601Ss.A08.add(A01);
                                        c28601Ss.A00 = A00;
                                        A01.A07.add(c28601Ss);
                                    }
                                    C28601Ss A012 = AbstractC28611St.A01(c0yj2, 0);
                                    int A002 = c0yj2.A00();
                                    ArrayList arrayList4 = this.A01;
                                    int size2 = arrayList4.size() - 1;
                                    while (true) {
                                        if (size2 < 0) {
                                            break;
                                        }
                                        C0YF c0yf5 = ((AbstractC28611St) arrayList4.get(size2)).A03;
                                        if (c0yf5.A0N != 8) {
                                            A002 = c0yf5.A0X.A00();
                                            break;
                                        }
                                        size2--;
                                    }
                                    if (A012 != null) {
                                        C28601Ss c28601Ss2 = this.A04;
                                        c28601Ss2.A08.add(A012);
                                        c28601Ss2.A00 = -A002;
                                        A012.A07.add(c28601Ss2);
                                    }
                                } else {
                                    C0YJ c0yj3 = c0yf2.A0Y;
                                    C0YJ c0yj4 = c0yf3.A0S;
                                    C28601Ss A013 = AbstractC28611St.A01(c0yj3, 1);
                                    int A003 = c0yj3.A00();
                                    int i2 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = this.A01;
                                        if (i2 >= arrayList5.size()) {
                                            break;
                                        }
                                        C0YF c0yf6 = ((AbstractC28611St) arrayList5.get(i2)).A03;
                                        if (c0yf6.A0N != 8) {
                                            A003 = c0yf6.A0Y.A00();
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (A013 != null) {
                                        C28601Ss c28601Ss3 = this.A05;
                                        c28601Ss3.A08.add(A013);
                                        c28601Ss3.A00 = A003;
                                        A013.A07.add(c28601Ss3);
                                    }
                                    C28601Ss A014 = AbstractC28611St.A01(c0yj4, 1);
                                    int A004 = c0yj4.A00();
                                    ArrayList arrayList6 = this.A01;
                                    int size3 = arrayList6.size() - 1;
                                    while (true) {
                                        if (size3 < 0) {
                                            break;
                                        }
                                        C0YF c0yf7 = ((AbstractC28611St) arrayList6.get(size3)).A03;
                                        if (c0yf7.A0N != 8) {
                                            A004 = c0yf7.A0S.A00();
                                            break;
                                        }
                                        size3--;
                                    }
                                    if (A014 != null) {
                                        C28601Ss c28601Ss4 = this.A04;
                                        c28601Ss4.A08.add(A014);
                                        c28601Ss4.A00 = -A004;
                                        A014.A07.add(c28601Ss4);
                                    }
                                }
                                this.A05.A03 = this;
                                this.A04.A03 = this;
                            }

                            @Override // X.AbstractC28611St
                            public void A08() {
                                int i = 0;
                                while (true) {
                                    ArrayList arrayList2 = this.A01;
                                    if (i >= arrayList2.size()) {
                                        return;
                                    }
                                    ((AbstractC28611St) arrayList2.get(i)).A08();
                                    i++;
                                }
                            }

                            @Override // X.AbstractC28611St
                            public void A09() {
                                this.A07 = null;
                                Iterator it2 = this.A01.iterator();
                                while (it2.hasNext()) {
                                    ((AbstractC28611St) it2.next()).A09();
                                }
                            }

                            @Override // X.AbstractC28611St
                            public boolean A0A() {
                                ArrayList arrayList2 = this.A01;
                                int size = arrayList2.size();
                                for (int i = 0; i < size; i++) {
                                    if (!((AbstractC28611St) arrayList2.get(i)).A0A()) {
                                        return false;
                                    }
                                }
                                return true;
                            }

                            @Override // X.AbstractC28611St, X.InterfaceC12230j4
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void AVk(X.InterfaceC12230j4 r24) {
                                /*
                                    Method dump skipped, instructions count: 953
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C38431o8.AVk(X.0j4):void");
                            }

                            public String toString() {
                                StringBuilder A0P = C000200d.A0P("ChainRun ");
                                A0P.append(super.A01 == 0 ? "horizontal : " : "vertical : ");
                                String obj = A0P.toString();
                                Iterator it2 = this.A01.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    String A0H = C000200d.A0H(obj, "<");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(A0H);
                                    sb.append(next);
                                    obj = C000200d.A0H(sb.toString(), "> ");
                                }
                                return obj;
                            }
                        };
                        c0yf.A0b = r02;
                        c38431o84 = r02;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c38431o84);
                } else {
                    arrayList.add(c0yf.A0d);
                }
                if (c0yf instanceof C28591Sr) {
                    arrayList.add(new AbstractC28611St(c0yf) { // from class: X.1oB
                        @Override // X.AbstractC28611St
                        public boolean A0A() {
                            return false;
                        }

                        @Override // X.AbstractC28611St
                        public void A07() {
                            C0YF c0yf2 = this.A03;
                            if (c0yf2 instanceof C38411o6) {
                                C28601Ss c28601Ss = this.A05;
                                c28601Ss.A09 = true;
                                C38411o6 c38411o6 = (C38411o6) c0yf2;
                                int i = c38411o6.A00;
                                boolean z = c38411o6.A02;
                                int i2 = 0;
                                if (i == 0) {
                                    c28601Ss.A04 = EnumC12250j6.LEFT;
                                    while (i2 < ((C28591Sr) c38411o6).A00) {
                                        C0YF c0yf3 = ((C28591Sr) c38411o6).A01[i2];
                                        if (z || c0yf3.A0N != 8) {
                                            C28601Ss c28601Ss2 = c0yf3.A0c.A05;
                                            c28601Ss2.A07.add(this.A05);
                                            this.A05.A08.add(c28601Ss2);
                                        }
                                        i2++;
                                    }
                                    A0B(this.A03.A0c.A05);
                                    A0B(this.A03.A0c.A04);
                                } else if (i == 1) {
                                    c28601Ss.A04 = EnumC12250j6.RIGHT;
                                    while (i2 < ((C28591Sr) c38411o6).A00) {
                                        C0YF c0yf4 = ((C28591Sr) c38411o6).A01[i2];
                                        if (z || c0yf4.A0N != 8) {
                                            C28601Ss c28601Ss3 = c0yf4.A0c.A04;
                                            c28601Ss3.A07.add(this.A05);
                                            this.A05.A08.add(c28601Ss3);
                                        }
                                        i2++;
                                    }
                                    A0B(this.A03.A0c.A05);
                                    A0B(this.A03.A0c.A04);
                                } else if (i == 2) {
                                    c28601Ss.A04 = EnumC12250j6.TOP;
                                    while (i2 < ((C28591Sr) c38411o6).A00) {
                                        C0YF c0yf5 = ((C28591Sr) c38411o6).A01[i2];
                                        if (z || c0yf5.A0N != 8) {
                                            C28601Ss c28601Ss4 = c0yf5.A0d.A05;
                                            c28601Ss4.A07.add(this.A05);
                                            this.A05.A08.add(c28601Ss4);
                                        }
                                        i2++;
                                    }
                                    A0B(this.A03.A0d.A05);
                                    A0B(this.A03.A0d.A04);
                                } else if (i == 3) {
                                    c28601Ss.A04 = EnumC12250j6.BOTTOM;
                                    while (i2 < ((C28591Sr) c38411o6).A00) {
                                        C0YF c0yf6 = ((C28591Sr) c38411o6).A01[i2];
                                        if (z || c0yf6.A0N != 8) {
                                            C28601Ss c28601Ss5 = c0yf6.A0d.A04;
                                            c28601Ss5.A07.add(this.A05);
                                            this.A05.A08.add(c28601Ss5);
                                        }
                                        i2++;
                                    }
                                    A0B(this.A03.A0d.A05);
                                    A0B(this.A03.A0d.A04);
                                }
                            }
                        }

                        @Override // X.AbstractC28611St
                        public void A08() {
                            C0YF c0yf2 = this.A03;
                            if (c0yf2 instanceof C38411o6) {
                                int i = ((C38411o6) c0yf2).A00;
                                if (i != 0 && i != 1) {
                                    c0yf2.A0Q = this.A05.A02;
                                } else {
                                    c0yf2.A0P = this.A05.A02;
                                }
                            }
                        }

                        @Override // X.AbstractC28611St
                        public void A09() {
                            this.A07 = null;
                            this.A05.A00();
                        }

                        public final void A0B(C28601Ss c28601Ss) {
                            this.A05.A07.add(c28601Ss);
                            c28601Ss.A08.add(this.A05);
                        }

                        @Override // X.AbstractC28611St, X.InterfaceC12230j4
                        public void AVk(InterfaceC12230j4 interfaceC12230j4) {
                            C38411o6 c38411o6 = (C38411o6) this.A03;
                            int i = c38411o6.A00;
                            int i2 = 0;
                            int i3 = -1;
                            for (C28601Ss c28601Ss : this.A05.A08) {
                                int i4 = c28601Ss.A02;
                                if (i3 == -1 || i4 < i3) {
                                    i3 = i4;
                                }
                                if (i2 < i4) {
                                    i2 = i4;
                                }
                            }
                            if (i != 0 && i != 2) {
                                this.A05.A01(i2 + c38411o6.A01);
                            } else {
                                this.A05.A01(i3 + c38411o6.A01);
                            }
                        }
                    });
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC28611St) it2.next()).A09();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC28611St abstractC28611St = (AbstractC28611St) it3.next();
            if (abstractC28611St.A03 != this.A01) {
                abstractC28611St.A07();
            }
        }
        ArrayList arrayList2 = this.A04;
        arrayList2.clear();
        C12260j7.A02 = 0;
        A06(this.A00.A0c, 0, arrayList2);
        A06(this.A00.A0d, 1, this.A04);
        this.A06 = false;
    }

    public void A02() {
        C38441o9 c38441o9;
        C0YH c0yh = C0YH.FIXED;
        C0YH c0yh2 = C0YH.MATCH_CONSTRAINT;
        C0YH c0yh3 = C0YH.WRAP_CONTENT;
        Iterator it = ((C0YE) this.A00).A00.iterator();
        while (it.hasNext()) {
            C0YF c0yf = (C0YF) it.next();
            if (!c0yf.A0i) {
                C0YH[] c0yhArr = c0yf.A0o;
                boolean z = false;
                C0YH c0yh4 = c0yhArr[0];
                C0YH c0yh5 = c0yhArr[1];
                int i = c0yf.A0D;
                int i2 = c0yf.A0C;
                boolean z2 = c0yh4 == c0yh3 || (c0yh4 == c0yh2 && i == 1);
                if (c0yh5 == c0yh3 || (c0yh5 == c0yh2 && i2 == 1)) {
                    z = true;
                }
                C38441o9 c38441o92 = c0yf.A0c.A06;
                boolean z3 = c38441o92.A0B;
                C38441o9 c38441o93 = c0yf.A0d.A06;
                boolean z4 = c38441o93.A0B;
                if (z3) {
                    if (z4) {
                        A03(c0yf, c0yh, c38441o92.A02, c0yh, c38441o93.A02);
                        c0yf.A0i = true;
                    } else if (z) {
                        A03(c0yf, c0yh, c38441o92.A02, c0yh3, c38441o93.A02);
                        C38441o9 c38441o94 = c0yf.A0d.A06;
                        int A00 = c0yf.A00();
                        if (c0yh5 == c0yh2) {
                            c38441o94.A00 = A00;
                        } else {
                            c38441o94.A01(A00);
                            c0yf.A0i = true;
                        }
                    }
                } else if (z4 && z2) {
                    A03(c0yf, c0yh3, c38441o92.A02, c0yh, c38441o93.A02);
                    C38441o9 c38441o95 = c0yf.A0c.A06;
                    int A01 = c0yf.A01();
                    if (c0yh4 == c0yh2) {
                        c38441o95.A00 = A01;
                    } else {
                        c38441o95.A01(A01);
                        c0yf.A0i = true;
                    }
                }
                if (c0yf.A0i && (c38441o9 = c0yf.A0d.A01) != null) {
                    c38441o9.A01(c0yf.A07);
                }
            }
        }
    }

    public final void A03(C0YF c0yf, C0YH c0yh, int i, C0YH c0yh2, int i2) {
        C12200j1 c12200j1 = this.A02;
        c12200j1.A05 = c0yh;
        c12200j1.A06 = c0yh2;
        c12200j1.A00 = i;
        c12200j1.A04 = i2;
        ((C28621Su) this.A03).A00(c0yf, c12200j1);
        C12200j1 c12200j12 = this.A02;
        c0yf.A09(c12200j12.A03);
        c0yf.A08(c12200j12.A02);
        c0yf.A0h = c12200j12.A07;
        int i3 = c12200j12.A01;
        c0yf.A07 = i3;
        c0yf.A0h = i3 > 0;
    }

    public final void A04(C0YD c0yd) {
        C0YH[] c0yhArr;
        C0YH c0yh;
        C0YH c0yh2 = C0YH.MATCH_PARENT;
        C0YH c0yh3 = C0YH.MATCH_CONSTRAINT;
        C0YH c0yh4 = C0YH.WRAP_CONTENT;
        C0YH c0yh5 = C0YH.FIXED;
        Iterator it = ((C0YE) c0yd).A00.iterator();
        while (it.hasNext()) {
            C0YF c0yf = (C0YF) it.next();
            C0YH[] c0yhArr2 = c0yf.A0o;
            C0YH c0yh6 = c0yhArr2[0];
            C0YH c0yh7 = c0yhArr2[1];
            if (c0yf.A0N == 8) {
                c0yf.A0i = true;
            } else {
                float f = c0yf.A04;
                if (f < 1.0f && c0yh6 == c0yh3) {
                    c0yf.A0D = 2;
                }
                float f2 = c0yf.A03;
                if (f2 < 1.0f && c0yh7 == c0yh3) {
                    c0yf.A0C = 2;
                }
                if (c0yf.A01 > 0.0f) {
                    if (c0yh6 == c0yh3 && (c0yh7 == c0yh4 || c0yh7 == c0yh5)) {
                        c0yf.A0D = 3;
                    } else if (c0yh7 == c0yh3 && (c0yh6 == c0yh4 || c0yh6 == c0yh5)) {
                        c0yf.A0C = 3;
                    } else if (c0yh6 == c0yh3 && c0yh7 == c0yh3) {
                        if (c0yf.A0D == 0) {
                            c0yf.A0D = 3;
                        }
                        if (c0yf.A0C == 0) {
                            c0yf.A0C = 3;
                        }
                    }
                }
                if (c0yh6 == c0yh3 && c0yf.A0D == 1 && (c0yf.A0W.A03 == null || c0yf.A0X.A03 == null)) {
                    c0yh6 = c0yh4;
                }
                if (c0yh7 == c0yh3 && c0yf.A0C == 1 && (c0yf.A0Y.A03 == null || c0yf.A0S.A03 == null)) {
                    c0yh7 = c0yh4;
                }
                C38471oC c38471oC = c0yf.A0c;
                c38471oC.A02 = c0yh6;
                int i = c0yf.A0D;
                c38471oC.A00 = i;
                C38481oD c38481oD = c0yf.A0d;
                c38481oD.A02 = c0yh7;
                int i2 = c0yf.A0C;
                ((AbstractC28611St) c38481oD).A00 = i2;
                if ((c0yh6 == c0yh2 || c0yh6 == c0yh5 || c0yh6 == c0yh4) && (c0yh7 == c0yh2 || c0yh7 == c0yh5 || c0yh7 == c0yh4)) {
                    int A01 = c0yf.A01();
                    if (c0yh6 == c0yh2) {
                        A01 = (c0yd.A01() - c0yf.A0W.A01) - c0yf.A0X.A01;
                        c0yh6 = c0yh5;
                    }
                    int A00 = c0yf.A00();
                    if (c0yh7 == c0yh2) {
                        A00 = (c0yd.A00() - c0yf.A0Y.A01) - c0yf.A0S.A01;
                        c0yh7 = c0yh5;
                    }
                    A03(c0yf, c0yh6, A01, c0yh7, A00);
                    c0yf.A0c.A06.A01(c0yf.A01());
                    c0yf.A0d.A06.A01(c0yf.A00());
                    c0yf.A0i = true;
                } else {
                    if (c0yh6 == c0yh3 && (c0yh7 == c0yh4 || c0yh7 == c0yh5)) {
                        if (i == 3) {
                            if (c0yh7 == c0yh4) {
                                A03(c0yf, c0yh4, 0, c0yh4, 0);
                            }
                            int A002 = c0yf.A00();
                            A03(c0yf, c0yh5, (int) ((A002 * c0yf.A01) + 0.5f), c0yh5, A002);
                            c0yf.A0c.A06.A01(c0yf.A01());
                            c0yf.A0d.A06.A01(c0yf.A00());
                            c0yf.A0i = true;
                        } else if (i == 1) {
                            A03(c0yf, c0yh4, 0, c0yh7, 0);
                            c0yf.A0c.A06.A00 = c0yf.A01();
                        } else if (i == 2) {
                            C0YH c0yh8 = c0yd.A0o[0];
                            if (c0yh8 == c0yh5 || c0yh8 == c0yh2) {
                                A03(c0yf, c0yh5, (int) ((f * c0yd.A01()) + 0.5f), c0yh7, c0yf.A00());
                                c0yf.A0c.A06.A01(c0yf.A01());
                                c0yf.A0d.A06.A01(c0yf.A00());
                                c0yf.A0i = true;
                            }
                        } else {
                            C0YJ[] c0yjArr = c0yf.A0n;
                            if (c0yjArr[0].A03 == null || c0yjArr[1].A03 == null) {
                                A03(c0yf, c0yh4, 0, c0yh7, 0);
                                c0yf.A0c.A06.A01(c0yf.A01());
                                c0yf.A0d.A06.A01(c0yf.A00());
                                c0yf.A0i = true;
                            }
                        }
                    }
                    if (c0yh7 == c0yh3 && (c0yh6 == c0yh4 || c0yh6 == c0yh5)) {
                        if (i2 == 3) {
                            if (c0yh6 == c0yh4) {
                                A03(c0yf, c0yh4, 0, c0yh4, 0);
                            }
                            int A012 = c0yf.A01();
                            float f3 = c0yf.A01;
                            if (c0yf.A08 == -1) {
                                f3 = 1.0f / f3;
                            }
                            A03(c0yf, c0yh5, A012, c0yh5, (int) ((A012 * f3) + 0.5f));
                            c0yf.A0c.A06.A01(c0yf.A01());
                            c0yf.A0d.A06.A01(c0yf.A00());
                            c0yf.A0i = true;
                        } else if (i2 == 1) {
                            A03(c0yf, c0yh6, 0, c0yh4, 0);
                            c0yf.A0d.A06.A00 = c0yf.A00();
                        } else if (i2 == 2) {
                            C0YH c0yh9 = c0yd.A0o[1];
                            if (c0yh9 == c0yh5 || c0yh9 == c0yh2) {
                                A03(c0yf, c0yh6, c0yf.A01(), c0yh5, (int) ((f2 * c0yd.A00()) + 0.5f));
                                c0yf.A0c.A06.A01(c0yf.A01());
                                c0yf.A0d.A06.A01(c0yf.A00());
                                c0yf.A0i = true;
                            }
                        } else {
                            C0YJ[] c0yjArr2 = c0yf.A0n;
                            if (c0yjArr2[2].A03 == null || c0yjArr2[3].A03 == null) {
                                A03(c0yf, c0yh4, 0, c0yh7, 0);
                                c0yf.A0c.A06.A01(c0yf.A01());
                                c0yf.A0d.A06.A01(c0yf.A00());
                                c0yf.A0i = true;
                            }
                        }
                    }
                    if (c0yh6 == c0yh3 && c0yh7 == c0yh3) {
                        if (i == 1 || i2 == 1) {
                            A03(c0yf, c0yh4, 0, c0yh4, 0);
                            c0yf.A0c.A06.A00 = c0yf.A01();
                            c0yf.A0d.A06.A00 = c0yf.A00();
                        } else if (i2 == 2 && i == 2 && ((c0yh = (c0yhArr = c0yd.A0o)[0]) == c0yh5 || c0yh == c0yh5)) {
                            C0YH c0yh10 = c0yhArr[1];
                            if (c0yh10 == c0yh5 || c0yh10 == c0yh5) {
                                A03(c0yf, c0yh5, (int) ((f * c0yd.A01()) + 0.5f), c0yh5, (int) ((f2 * c0yd.A00()) + 0.5f));
                                c0yf.A0c.A06.A01(c0yf.A01());
                                c0yf.A0d.A06.A01(c0yf.A00());
                                c0yf.A0i = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A05(C28601Ss c28601Ss, int i, C28601Ss c28601Ss2, ArrayList arrayList, C12260j7 c12260j7) {
        C12260j7 c12260j72 = c12260j7;
        AbstractC28611St abstractC28611St = c28601Ss.A06;
        if (abstractC28611St.A07 == null) {
            C0YD c0yd = this.A00;
            if (abstractC28611St == c0yd.A0c || abstractC28611St == c0yd.A0d) {
                return;
            }
            if (c12260j7 == null) {
                c12260j72 = new C12260j7(abstractC28611St);
                arrayList.add(c12260j72);
            }
            abstractC28611St.A07 = c12260j72;
            c12260j72.A01.add(abstractC28611St);
            for (InterfaceC12230j4 interfaceC12230j4 : abstractC28611St.A05.A07) {
                if (interfaceC12230j4 instanceof C28601Ss) {
                    A05((C28601Ss) interfaceC12230j4, i, c28601Ss2, arrayList, c12260j72);
                }
            }
            for (InterfaceC12230j4 interfaceC12230j42 : abstractC28611St.A04.A07) {
                if (interfaceC12230j42 instanceof C28601Ss) {
                    A05((C28601Ss) interfaceC12230j42, i, c28601Ss2, arrayList, c12260j72);
                }
            }
            if (i == 1 && (abstractC28611St instanceof C38481oD)) {
                for (InterfaceC12230j4 interfaceC12230j43 : ((C38481oD) abstractC28611St).A00.A07) {
                    if (interfaceC12230j43 instanceof C28601Ss) {
                        A05((C28601Ss) interfaceC12230j43, 1, c28601Ss2, arrayList, c12260j72);
                    }
                }
            }
            for (C28601Ss c28601Ss3 : abstractC28611St.A05.A08) {
                A05(c28601Ss3, i, c28601Ss2, arrayList, c12260j72);
            }
            for (C28601Ss c28601Ss4 : abstractC28611St.A04.A08) {
                A05(c28601Ss4, i, c28601Ss2, arrayList, c12260j72);
            }
            if (i == 1 && (abstractC28611St instanceof C38481oD)) {
                for (C28601Ss c28601Ss5 : ((C38481oD) abstractC28611St).A00.A08) {
                    A05(c28601Ss5, 1, c28601Ss2, arrayList, c12260j72);
                }
            }
        }
    }

    public final void A06(AbstractC28611St abstractC28611St, int i, ArrayList arrayList) {
        for (InterfaceC12230j4 interfaceC12230j4 : abstractC28611St.A05.A07) {
            if (interfaceC12230j4 instanceof C28601Ss) {
                A05((C28601Ss) interfaceC12230j4, i, abstractC28611St.A04, arrayList, null);
            } else if (interfaceC12230j4 instanceof AbstractC28611St) {
                A05(((AbstractC28611St) interfaceC12230j4).A05, i, abstractC28611St.A04, arrayList, null);
            }
        }
        for (InterfaceC12230j4 interfaceC12230j42 : abstractC28611St.A04.A07) {
            if (interfaceC12230j42 instanceof C28601Ss) {
                A05((C28601Ss) interfaceC12230j42, i, abstractC28611St.A05, arrayList, null);
            } else if (interfaceC12230j42 instanceof AbstractC28611St) {
                A05(((AbstractC28611St) interfaceC12230j42).A04, i, abstractC28611St.A05, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC12230j4 interfaceC12230j43 : ((C38481oD) abstractC28611St).A00.A07) {
                if (interfaceC12230j43 instanceof C28601Ss) {
                    A05((C28601Ss) interfaceC12230j43, 1, null, arrayList, null);
                }
            }
        }
    }
}
