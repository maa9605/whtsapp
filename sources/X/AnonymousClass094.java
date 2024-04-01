package X;

/* renamed from: X.094 */
/* loaded from: classes.dex */
public class AnonymousClass094 {
    public final AbstractC005302j A00;
    public final String A01;
    public final boolean A02;

    public AnonymousClass094(AbstractC005302j abstractC005302j, boolean z, String str) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = abstractC005302j;
    }

    public AnonymousClass094(AnonymousClass094 anonymousClass094) {
        this.A02 = anonymousClass094.A02;
        this.A01 = anonymousClass094.A01;
        this.A00 = anonymousClass094.A00;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AnonymousClass094.class == obj.getClass()) {
            AnonymousClass094 anonymousClass094 = (AnonymousClass094) obj;
            if (this.A02 != anonymousClass094.A02) {
                return false;
            }
            String str = this.A01;
            if (str == null) {
                if (anonymousClass094.A01 != null) {
                    return false;
                }
            } else if (!str.equals(anonymousClass094.A01)) {
                return false;
            }
            AbstractC005302j abstractC005302j = this.A00;
            AbstractC005302j abstractC005302j2 = anonymousClass094.A00;
            if (abstractC005302j == null) {
                if (abstractC005302j2 != null) {
                    return false;
                }
            } else if (!abstractC005302j.equals(abstractC005302j2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.A02 ? 1231 : 1237) + 31) * 31;
        String str = this.A01;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        AbstractC005302j abstractC005302j = this.A00;
        return hashCode + (abstractC005302j != null ? abstractC005302j.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Key[id=");
        A0P.append(this.A01);
        A0P.append(", from_me=");
        A0P.append(this.A02);
        A0P.append(", remote_jid=");
        A0P.append(this.A00);
        A0P.append("]");
        return A0P.toString();
    }
}
