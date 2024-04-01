package X;

import android.os.Parcelable;

/* renamed from: X.1bu */
/* loaded from: classes.dex */
public abstract class AbstractC31221bu extends AbstractC231215h implements Parcelable {
    @Override // X.AbstractC231215h
    public Object A04(String str) {
        return null;
    }

    @Override // X.AbstractC231215h
    public boolean A06(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass().isInstance(obj)) {
            AbstractC231215h abstractC231215h = (AbstractC231215h) obj;
            for (C31211bt c31211bt : A05().values()) {
                if (A03(c31211bt)) {
                    if (!abstractC231215h.A03(c31211bt) || !A02(c31211bt).equals(abstractC231215h.A02(c31211bt))) {
                        return false;
                    }
                } else if (abstractC231215h.A03(c31211bt)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (C31211bt c31211bt : A05().values()) {
            if (A03(c31211bt)) {
                i = A02(c31211bt).hashCode() + (i * 31);
            }
        }
        return i;
    }
}
