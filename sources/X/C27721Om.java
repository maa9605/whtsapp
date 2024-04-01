package X;

/* renamed from: X.1Om  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27721Om {
    public byte A00;
    public AbstractC005302j A01;

    public C27721Om(AbstractC005302j abstractC005302j, byte b) {
        this.A01 = abstractC005302j;
        this.A00 = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C27721Om.class != obj.getClass()) {
            return false;
        }
        C27721Om c27721Om = (C27721Om) obj;
        return this.A00 == c27721Om.A00 && this.A01.equals(c27721Om.A01);
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" ");
        sb.append((int) this.A00);
        return sb.toString();
    }
}
