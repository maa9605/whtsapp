package X;

import android.content.Context;

/* renamed from: X.0vW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19490vW {
    public final Context A05;
    public Integer A02 = null;
    public boolean A04 = true;
    public int A00 = -1;
    public final C19510vY A06 = new Object() { // from class: X.0vY
        public int A00 = 2048;
        public int A01;
        public InterfaceC18950ub A02;
        public boolean A03;
        public boolean A04;

        {
            final Boolean bool = Boolean.FALSE;
            this.A02 = new InterfaceC18950ub() { // from class: X.1XL
                @Override // X.InterfaceC18950ub
                public Object get() {
                    return bool;
                }
            };
            this.A03 = true;
            this.A04 = true;
            this.A01 = 20;
        }
    };
    public boolean A03 = true;
    public C19570ve A01 = new Object() { // from class: X.0ve
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0vY] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ve] */
    public C19490vW(Context context) {
        if (context != null) {
            this.A05 = context;
            return;
        }
        throw null;
    }
}
