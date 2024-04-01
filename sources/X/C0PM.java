package X;

/* renamed from: X.0PM  reason: invalid class name */
/* loaded from: classes.dex */
public class C0PM extends C0PJ {
    public long realtimeMs;
    public long uptimeMs;

    @Override // X.C0PJ
    public C0PJ A00(C0PJ c0pj) {
        C0PM c0pm = (C0PM) c0pj;
        this.uptimeMs = c0pm.uptimeMs;
        this.realtimeMs = c0pm.realtimeMs;
        return this;
    }

    @Override // X.C0PJ
    public C0PJ A01(C0PJ c0pj, C0PJ c0pj2) {
        C0PM c0pm = (C0PM) c0pj;
        C0PM c0pm2 = (C0PM) c0pj2;
        if (c0pm2 == null) {
            c0pm2 = new C0PM();
        }
        long j = this.uptimeMs;
        if (c0pm == null) {
            c0pm2.uptimeMs = j;
            c0pm2.realtimeMs = this.realtimeMs;
            return c0pm2;
        }
        c0pm2.uptimeMs = j - c0pm.uptimeMs;
        c0pm2.realtimeMs = this.realtimeMs - c0pm.realtimeMs;
        return c0pm2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0PM.class != obj.getClass()) {
            return false;
        }
        C0PM c0pm = (C0PM) obj;
        return this.uptimeMs == c0pm.uptimeMs && this.realtimeMs == c0pm.realtimeMs;
    }

    public int hashCode() {
        long j = this.uptimeMs;
        long j2 = this.realtimeMs;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("TimeMetrics{uptimeMs=");
        A0P.append(this.uptimeMs);
        A0P.append(", realtimeMs=");
        A0P.append(this.realtimeMs);
        A0P.append('}');
        return A0P.toString();
    }
}
