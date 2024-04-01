package X;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: X.144 */
/* loaded from: classes.dex */
public class AnonymousClass144 implements AnonymousClass081, Cloneable {
    public int A00 = C24951Dm.A00.incrementAndGet();
    public AnonymousClass085 A01;
    public final int A02;
    public final boolean A03;

    public AnonymousClass144(int i, boolean z) {
        this.A02 = i;
        this.A03 = z;
        this.A01 = new AnonymousClass085(z);
    }

    @Override // X.InterfaceC017007w
    /* renamed from: A00 */
    public AnonymousClass144 AGB() {
        try {
            AnonymousClass144 anonymousClass144 = (AnonymousClass144) super.clone();
            AnonymousClass085 anonymousClass085 = this.A01;
            AnonymousClass085 anonymousClass0852 = new AnonymousClass085(anonymousClass085.A01);
            anonymousClass0852.A00.putAll(anonymousClass085.A00);
            anonymousClass144.A01 = anonymousClass0852;
            return anonymousClass144;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.AnonymousClass082
    /* renamed from: A01 */
    public boolean A8Z(AnonymousClass084 anonymousClass084, boolean z) {
        Object A00 = this.A01.A00(anonymousClass084);
        if (A00 == null) {
            return z;
        }
        if (A00 instanceof Boolean) {
            return ((Boolean) A00).booleanValue();
        }
        return ((Number) A00).intValue() == 1;
    }

    @Override // X.AnonymousClass082
    public List A8u(Object obj) {
        Object A00 = this.A01.A00((AnonymousClass084) obj);
        return A00 == null ? Collections.emptyList() : (List) A00;
    }

    @Override // X.InterfaceC017107x
    public int A8w() {
        return this.A00;
    }

    @Override // X.AnonymousClass081
    public C09P AA3(AnonymousClass084 anonymousClass084) {
        Object A00 = this.A01.A00(anonymousClass084);
        if (A00 == null) {
            return null;
        }
        if (A00 instanceof C09P) {
            return (C09P) A00;
        }
        try {
            return new C020709n((String) A00, null);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Value stored for key: ");
            sb.append(anonymousClass084);
            sb.append(" was accessed as an Expression but parsing failed with ");
            sb.append(e);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // X.AnonymousClass082
    public float AAF(Object obj, float f) {
        Number number = (Number) this.A01.A00((AnonymousClass084) obj);
        return number != null ? number.floatValue() : f;
    }

    @Override // X.AnonymousClass082
    public List AAv(Object obj) {
        Object A00 = this.A01.A00((AnonymousClass084) obj);
        return A00 == null ? Collections.emptyList() : (List) A00;
    }

    @Override // X.AnonymousClass082
    public long AB0(Object obj, long j) {
        Number number = (Number) this.A01.A00((AnonymousClass084) obj);
        return number != null ? number.longValue() : j;
    }

    @Override // X.AnonymousClass082
    public Object ABT(Object obj) {
        return this.A01.A00((AnonymousClass084) obj);
    }

    @Override // X.InterfaceC017007w
    public InterfaceC25281Et ACd() {
        return new InterfaceC25281Et() { // from class: X.1gT
            @Override // X.InterfaceC25281Et
            public boolean ATj(Object obj, AnonymousClass084 anonymousClass084, InterfaceC020509l interfaceC020509l) {
                ((AnonymousClass081) obj).AQy(anonymousClass084.A01, anonymousClass084.A00, AnonymousClass088.A0s(interfaceC020509l));
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:40:0x003e, code lost:
                r1 = true;
             */
            @Override // X.InterfaceC25281Et
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean AUX(java.lang.Object r9, X.AnonymousClass084 r10, X.InterfaceC020509l r11) {
                /*
                    r8 = this;
                    X.082 r9 = (X.AnonymousClass082) r9
                    java.lang.Object r7 = r9.ADg(r10)
                    java.lang.Object r6 = X.AnonymousClass088.A0s(r11)
                    boolean r0 = r6 instanceof java.lang.Number
                    r5 = 1
                    r1 = 0
                    if (r0 == 0) goto L32
                    boolean r0 = r7 instanceof java.lang.Number
                    if (r0 == 0) goto L31
                    java.lang.Number r7 = (java.lang.Number) r7
                    long r3 = r7.longValue()
                    java.lang.Number r6 = (java.lang.Number) r6
                    long r1 = r6.longValue()
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 != 0) goto L31
                    double r3 = r7.doubleValue()
                    double r1 = r6.doubleValue()
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 != 0) goto L31
                    r5 = 0
                L31:
                    return r5
                L32:
                    if (r7 != 0) goto L38
                    if (r6 == 0) goto L3e
                L36:
                    r5 = r5 ^ r1
                    return r5
                L38:
                    boolean r0 = r7.equals(r6)
                    if (r0 == 0) goto L36
                L3e:
                    r1 = 1
                    goto L36
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C33791gT.AUX(java.lang.Object, X.084, X.09l):boolean");
            }
        };
    }

    @Override // X.AnonymousClass082
    public /* bridge */ /* synthetic */ String ADJ(Object obj) {
        return (String) this.A01.A00((AnonymousClass084) obj);
    }

    @Override // X.AnonymousClass082
    public String ADK(Object obj, String str) {
        String str2 = (String) this.A01.A00((AnonymousClass084) obj);
        return str2 != null ? str2 : str;
    }

    @Override // X.AnonymousClass081
    public int ADL() {
        return this.A02;
    }

    @Override // X.AnonymousClass082
    public /* bridge */ /* synthetic */ Object ADg(Object obj) {
        return this.A01.A00((AnonymousClass084) obj);
    }

    @Override // X.AnonymousClass081
    public boolean AF7() {
        return this.A03;
    }

    @Override // X.InterfaceC017007w
    public InterfaceC017007w AGC(C25051Dw c25051Dw, List list) {
        int A00 = c25051Dw.A00(new C1E1(this.A00, list));
        AnonymousClass144 AGB = AGB();
        AGB.A00 = A00;
        return AGB;
    }

    @Override // X.AnonymousClass081
    public void AQy(String str, int i, Object obj) {
        AnonymousClass085 anonymousClass085 = this.A01;
        if (anonymousClass085.A01) {
            anonymousClass085.A00.put(Integer.valueOf(i), obj);
        } else {
            anonymousClass085.A00.put(str, obj);
        }
    }

    @Override // X.InterfaceC017207y
    public String getId() {
        Object A00 = this.A01.A00(C1ES.A02);
        if (A00 == null) {
            return null;
        }
        if (A00 instanceof String) {
            return (String) A00;
        }
        return String.valueOf(A00);
    }
}
