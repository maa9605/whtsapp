package X;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.07v */
/* loaded from: classes.dex */
public abstract class AbstractC016907v implements InterfaceC017007w, InterfaceC017107x, InterfaceC017207y, InterfaceC017307z, C07T, AnonymousClass080 {
    public AnonymousClass080 A02;
    public C09P A03;
    public C09P A04;
    public String A05;
    public LinkedList A06;
    public List A07 = new ArrayList();
    public C1EP A01 = new C1EP();
    public int A00 = C24951Dm.A00.incrementAndGet();

    public final InterfaceC016607s A00(C016107n c016107n, int i, int i2) {
        final C20430xW A00 = c016107n.A00();
        InterfaceC016607s interfaceC016607s = (InterfaceC016607s) A00.A02.get(this);
        if (interfaceC016607s != null && AnonymousClass088.A1u(interfaceC016607s.AE3(), i, interfaceC016607s.getWidth()) && AnonymousClass088.A1u(interfaceC016607s.AAT(), i2, interfaceC016607s.getHeight())) {
            C1YX.A00("Bloks cacheTraversal: ", getClass());
            A03(new C1EQ() { // from class: X.1gO
                @Override // X.C1EQ
                public boolean AW0(AbstractC016907v abstractC016907v) {
                    C20430xW c20430xW = A00;
                    Object obj = c20430xW.A02.get(abstractC016907v);
                    if (obj != null) {
                        c20430xW.A03.put(abstractC016907v, obj);
                    }
                    long j = abstractC016907v.A00;
                    Object A04 = c20430xW.A00.A04(j, null);
                    if (A04 != null) {
                        c20430xW.A01.A09(j, A04);
                        return false;
                    }
                    return false;
                }
            });
            C20500xd.A00();
            return interfaceC016607s;
        }
        C1YX.A00("Bloks Layout: ", getClass());
        AbstractC016307p A01 = A01(c016107n);
        InterfaceC016607s A002 = C09M.A00().A07.A00(c016107n, (C016807u) this, A01, i, i2);
        A00.A03.put(this, A002);
        C20500xd.A00();
        return A002;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0046, code lost:
        if (r2.A06 != 0.0f) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0053, code lost:
        if (r4.A04 == X.EnumC20560xj.VIEW) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.AbstractC016307p A01(X.C016107n r9) {
        /*
            r8 = this;
            X.0xj r5 = X.EnumC20560xj.DRAWABLE
            java.lang.Object r3 = r9.A03
            X.087 r3 = (X.AnonymousClass087) r3
            X.0xW r2 = r9.A00()
            r1 = r8
            X.07u r1 = (X.C016807u) r1
            X.09M r0 = X.C09M.A00()
            X.0AJ r0 = r0.A07
            X.07p r4 = r0.A01(r3, r1, r2)
            X.1EP r2 = r8.A01
            float r0 = r2.A02
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = r2.A03
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = r2.A01
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = r2.A00
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = r2.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = r2.A05
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = r2.A06
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L49
        L48:
            r0 = 1
        L49:
            java.lang.String r2 = "Trying to apply View attributes to a Drawable Node is not yet supported"
            if (r0 != 0) goto L9c
            if (r4 == 0) goto L75
            X.0xj r1 = r4.A04
            X.0xj r0 = X.EnumC20560xj.VIEW
            if (r1 != r0) goto L75
        L55:
            X.1EP r0 = r8.A01
            X.1gR r1 = new X.1gR
            r1.<init>(r0)
            X.08D r0 = new X.08D
            r0.<init>(r4, r1)
            r4.A06(r0)
            X.0xj r0 = r4.A04
            if (r0 == r5) goto Lcf
            X.1gP r1 = new X.1gP
            r1.<init>()
            X.08D r0 = new X.08D
            r0.<init>(r4, r1)
            r4.A06(r0)
        L75:
            java.util.List r0 = r8.A07
            if (r0 == 0) goto Lce
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lce
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L84:
            java.util.List r0 = r8.A07
            int r0 = r0.size()
            if (r7 >= r0) goto La7
            java.util.List r0 = r8.A07
            java.lang.Object r1 = r0.get(r7)
            boolean r0 = r1 instanceof X.AnonymousClass081
            if (r0 == 0) goto L99
            r6.add(r1)
        L99:
            int r7 = r7 + 1
            goto L84
        L9c:
            if (r4 != 0) goto L55
            int r0 = r8.A00
            long r0 = (long) r0
            X.089 r4 = new X.089
            r4.<init>(r0)
            goto L55
        La7:
            if (r4 != 0) goto Lbb
            int r0 = r8.A00
            long r0 = (long) r0
            X.089 r4 = new X.089
            r4.<init>(r0)
            X.0xj r0 = r4.A04
            if (r0 != r5) goto Lbb
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        Lbb:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto Lce
            X.1gQ r1 = new X.1gQ
            r1.<init>(r3, r6, r8)
            X.08D r0 = new X.08D
            r0.<init>(r4, r1)
            r4.A06(r0)
        Lce:
            return r4
        Lcf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC016907v.A01(X.07n):X.07p");
    }

    @Override // X.InterfaceC017007w
    /* renamed from: A02 */
    public AbstractC016907v AGB() {
        try {
            AbstractC016907v abstractC016907v = (AbstractC016907v) super.clone();
            AnonymousClass080 anonymousClass080 = this.A02;
            if (anonymousClass080 instanceof C07T) {
                abstractC016907v.A02 = (AnonymousClass080) ((C07T) anonymousClass080).AGA();
            }
            List list = abstractC016907v.A07;
            if (list != null) {
                abstractC016907v.A07 = new ArrayList(list);
            }
            return abstractC016907v;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("This should not be possible", e);
        }
    }

    public boolean A03(C1EQ c1eq) {
        return c1eq.AW0(this);
    }

    @Override // X.InterfaceC017107x
    public int A8w() {
        return this.A00;
    }

    @Override // X.InterfaceC017007w
    public final InterfaceC25281Et ACd() {
        return new InterfaceC25281Et() { // from class: X.1gN
            @Override // X.InterfaceC25281Et
            public boolean ATj(Object obj, AnonymousClass084 anonymousClass084, InterfaceC020509l interfaceC020509l) {
                AbstractC016907v abstractC016907v = (AbstractC016907v) obj;
                if (AnonymousClass088.A20(anonymousClass084, C1ES.A00)) {
                    abstractC016907v.A01.A00 = ((Number) interfaceC020509l).floatValue();
                    return true;
                } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A05)) {
                    abstractC016907v.A01.A01 = ((Number) interfaceC020509l).floatValue();
                    return true;
                } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A08)) {
                    abstractC016907v.A01.A04 = ((Number) interfaceC020509l).floatValue();
                    return true;
                } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A09)) {
                    abstractC016907v.A01.A05 = ((Number) interfaceC020509l).floatValue();
                    return true;
                } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A0A)) {
                    abstractC016907v.A01.A06 = ((Number) interfaceC020509l).floatValue();
                    return true;
                } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A06)) {
                    abstractC016907v.A01.A02 = ((Number) interfaceC020509l).floatValue();
                    return true;
                } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A07)) {
                    abstractC016907v.A01.A03 = ((Number) interfaceC020509l).floatValue();
                    return true;
                } else if (abstractC016907v != null) {
                    ((AnonymousClass081) abstractC016907v).AQy(anonymousClass084.A01, anonymousClass084.A00, AnonymousClass088.A0s(interfaceC020509l));
                    return true;
                } else {
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
                r5 = true;
             */
            @Override // X.InterfaceC25281Et
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean AUX(java.lang.Object r9, X.AnonymousClass084 r10, X.InterfaceC020509l r11) {
                /*
                    r8 = this;
                    X.07v r9 = (X.AbstractC016907v) r9
                    if (r9 == 0) goto L44
                    X.082 r9 = (X.AnonymousClass082) r9
                    java.lang.Object r7 = r9.ADg(r10)
                    java.lang.Object r6 = X.AnonymousClass088.A0s(r11)
                    boolean r0 = r6 instanceof java.lang.Number
                    r5 = 0
                    r1 = 1
                    if (r0 == 0) goto L36
                    boolean r0 = r7 instanceof java.lang.Number
                    if (r0 == 0) goto L34
                    java.lang.Number r7 = (java.lang.Number) r7
                    long r3 = r7.longValue()
                    java.lang.Number r6 = (java.lang.Number) r6
                    long r1 = r6.longValue()
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 != 0) goto L34
                    double r3 = r7.doubleValue()
                    double r1 = r6.doubleValue()
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 == 0) goto L35
                L34:
                    r5 = 1
                L35:
                    return r5
                L36:
                    if (r7 != 0) goto L3c
                    if (r6 == 0) goto L42
                L3a:
                    r5 = r5 ^ r1
                    return r5
                L3c:
                    boolean r0 = r7.equals(r6)
                    if (r0 == 0) goto L3a
                L42:
                    r5 = 1
                    goto L3a
                L44:
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33731gN.AUX(java.lang.Object, X.084, X.09l):boolean");
            }
        };
    }

    @Override // X.InterfaceC017007w
    public InterfaceC017007w AGC(C25051Dw c25051Dw, List list) {
        int A00 = c25051Dw.A00(new C1E1(this.A00, list));
        AbstractC016907v AGB = AGB();
        AGB.A00 = A00;
        return AGB;
    }

    @Override // X.InterfaceC017307z
    public boolean ASi(AnonymousClass087 anonymousClass087, AnonymousClass084 anonymousClass084, InterfaceC020509l interfaceC020509l) {
        View view = this.A01.A07;
        if (view != null) {
            if (AnonymousClass088.A20(anonymousClass084, C1ES.A00)) {
                float floatValue = ((Number) interfaceC020509l).floatValue();
                this.A01.A00 = floatValue;
                view.setAlpha(floatValue);
                return true;
            } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A05)) {
                float floatValue2 = ((Number) interfaceC020509l).floatValue();
                this.A01.A01 = floatValue2;
                view.setRotation(floatValue2);
                return true;
            } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A08)) {
                float floatValue3 = ((Number) interfaceC020509l).floatValue();
                this.A01.A04 = floatValue3;
                view.setTranslationX(floatValue3);
                return true;
            } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A09)) {
                float floatValue4 = ((Number) interfaceC020509l).floatValue();
                this.A01.A05 = floatValue4;
                view.setTranslationY(floatValue4);
                return true;
            } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A0A)) {
                float floatValue5 = ((Number) interfaceC020509l).floatValue();
                this.A01.A06 = floatValue5;
                if (Build.VERSION.SDK_INT >= 21) {
                    view.setTranslationZ(floatValue5);
                }
                return true;
            } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A06)) {
                float floatValue6 = ((Number) interfaceC020509l).floatValue();
                this.A01.A02 = floatValue6;
                view.setScaleX(floatValue6);
                return true;
            } else if (AnonymousClass088.A20(anonymousClass084, C1ES.A07)) {
                float floatValue7 = ((Number) interfaceC020509l).floatValue();
                this.A01.A03 = floatValue7;
                view.setScaleY(floatValue7);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC017207y
    public String getId() {
        return this.A05;
    }
}
