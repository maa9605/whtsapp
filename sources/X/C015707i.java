package X;

import android.net.Uri;

/* renamed from: X.07i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C015707i {
    public final Uri A00;
    public final boolean A01;

    public C015707i(Uri uri, boolean triggerForDescendants) {
        this.A00 = uri;
        this.A01 = triggerForDescendants;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || C015707i.class != o.getClass()) {
            return false;
        }
        C015707i c015707i = (C015707i) o;
        return this.A01 == c015707i.A01 && this.A00.equals(c015707i.A00);
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + (this.A01 ? 1 : 0);
    }
}
