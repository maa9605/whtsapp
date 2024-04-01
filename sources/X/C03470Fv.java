package X;

/* renamed from: X.0Fv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03470Fv {
    public Long A00;
    public final AbstractC005302j A01;
    public final Long A02;

    public C03470Fv(AbstractC005302j abstractC005302j, Long l) {
        this.A01 = abstractC005302j;
        this.A02 = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C03470Fv.class != obj.getClass()) {
            return false;
        }
        C03470Fv c03470Fv = (C03470Fv) obj;
        if (this.A01.equals(c03470Fv.A01)) {
            return this.A02.equals(c03470Fv.A02);
        }
        return false;
    }

    public int hashCode() {
        return this.A02.hashCode() + (this.A01.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("MutedChat{chatJid=");
        A0P.append(this.A01);
        A0P.append(", muteEndTimestampMs=");
        A0P.append(this.A02);
        A0P.append('}');
        return A0P.toString();
    }
}
