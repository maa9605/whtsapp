package X;

import java.util.Arrays;

/* renamed from: X.35o  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C650135o extends C0JV {
    public boolean A00;

    public C650135o(C0JV c0jv) {
        super(c0jv.A05, c0jv.A06, c0jv.A07, c0jv.A00, c0jv.A04, c0jv.A01, c0jv.A03, c0jv.A08, c0jv.A02);
    }

    @Override // X.C0JV
    public boolean equals(Object obj) {
        if (obj == null || C650135o.class != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && this.A00 == ((C650135o) obj).A00;
    }

    @Override // X.C0JV
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Boolean.valueOf(this.A00)});
    }

    @Override // X.C0JV
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", isSyncing: ");
        sb.append(this.A00);
        return sb.toString();
    }
}
