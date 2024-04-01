package X;

/* renamed from: X.0PK  reason: invalid class name */
/* loaded from: classes.dex */
public class C0PK extends C0PJ {
    public final C006802z mMetricsMap = new C006802z();
    public final C006802z mMetricsValid = new C006802z();

    @Override // X.C0PJ
    public /* bridge */ /* synthetic */ C0PJ A00(C0PJ c0pj) {
        A03((C0PK) c0pj);
        return this;
    }

    @Override // X.C0PJ
    public /* bridge */ /* synthetic */ C0PJ A01(C0PJ c0pj, C0PJ c0pj2) {
        boolean z;
        C0PK c0pk = (C0PK) c0pj;
        C0PK c0pk2 = (C0PK) c0pj2;
        if (c0pk2 != null) {
            if (c0pk == null) {
                c0pk2.A03(this);
            } else {
                int i = this.mMetricsMap.A00;
                for (int i2 = 0; i2 < i; i2++) {
                    Class cls = (Class) this.mMetricsMap.A02[i2 << 1];
                    if (A05(cls) && c0pk.A05(cls)) {
                        z = true;
                        C0PJ A02 = c0pk2.A02(cls);
                        if (A02 != null) {
                            A02(cls).A01(c0pk.A02(cls), A02);
                        }
                    } else {
                        z = false;
                    }
                    c0pk2.A04(cls, z);
                }
            }
            return c0pk2;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }

    public C0PJ A02(Class cls) {
        return (C0PJ) cls.cast(this.mMetricsMap.getOrDefault(cls, null));
    }

    public void A03(C0PK c0pk) {
        int i = this.mMetricsMap.A00;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls = (Class) this.mMetricsMap.A02[i2 << 1];
            C0PJ A02 = c0pk.A02(cls);
            if (A02 != null) {
                A02(cls).A00(A02);
                A04(cls, c0pk.A05(cls));
            } else {
                A04(cls, false);
            }
        }
    }

    public void A04(Class cls, boolean z) {
        this.mMetricsValid.put(cls, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public boolean A05(Class cls) {
        Boolean bool = (Boolean) this.mMetricsValid.getOrDefault(cls, null);
        return bool != null && bool.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0PK.class != obj.getClass()) {
            return false;
        }
        C0PK c0pk = (C0PK) obj;
        return C07K.A1j(this.mMetricsValid, c0pk.mMetricsValid) && C07K.A1j(this.mMetricsMap, c0pk.mMetricsMap);
    }

    public int hashCode() {
        return this.mMetricsValid.hashCode() + (this.mMetricsMap.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Composite Metrics{\n");
        int i = this.mMetricsMap.A00;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 << 1;
            A0P.append(this.mMetricsMap.A02[i3 + 1]);
            A0P.append(A05((Class) this.mMetricsMap.A02[i3]) ? " [valid]" : " [invalid]");
            A0P.append('\n');
        }
        A0P.append("}");
        return A0P.toString();
    }
}
