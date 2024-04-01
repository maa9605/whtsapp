package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.10C  reason: invalid class name */
/* loaded from: classes.dex */
public interface C10C {
    public static final C10C A00 = new C10C() { // from class: X.1ZW
        @Override // X.C10C
        public List A9j(String str, boolean z) {
            List A03 = C10I.A03(str, z);
            if (A03.isEmpty()) {
                return Collections.emptyList();
            }
            return Collections.singletonList(A03.get(0));
        }

        @Override // X.C10C
        public C10A ABv() {
            C10A c10a;
            List A03 = C10I.A03("audio/raw", false);
            if (!A03.isEmpty() && (c10a = (C10A) A03.get(0)) != null) {
                return new C10A(c10a.A02, null, null, true, false, false);
            }
            return null;
        }
    };

    List A9j(String str, boolean z);

    C10A ABv();
}
