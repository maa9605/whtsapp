package X;

import java.io.File;
import java.util.HashSet;

/* renamed from: X.00i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC000600i {
    public static volatile AbstractC000600i A00;

    public static AbstractC000600i A00() {
        AbstractC000600i abstractC000600i = A00;
        if (abstractC000600i != null) {
            return abstractC000600i;
        }
        throw null;
    }

    public String A05() {
        throw new RuntimeException("Must use overridden implementation");
    }

    public String A06(String str) {
        throw new RuntimeException("Must use overridden implementation");
    }

    public String A07(String str, String str2, boolean z) {
        throw new RuntimeException("Must use overridden implementation");
    }

    public void A08(String str, int i) {
        throw new RuntimeException("Must use overridden implementation");
    }

    public void A09(String str, String str2, boolean z) {
        throw new RuntimeException("Must use overridden implementation");
    }

    public boolean A0A(boolean z, boolean z2, boolean z3, boolean z4, HashSet hashSet, File file, String str) {
        throw new RuntimeException("Must use overridden implementation");
    }
}
