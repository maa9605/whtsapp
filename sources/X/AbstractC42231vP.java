package X;

import android.content.Context;

/* renamed from: X.1vP */
/* loaded from: classes2.dex */
public abstract class AbstractC42231vP {
    public final Context A02;
    public final AbstractC000600i A03;
    public final String A04 = "GoogleMigrateClient";
    public int A00 = 0;
    public C3W0 A01 = null;

    public AbstractC42231vP(Context context, AbstractC000600i abstractC000600i) {
        this.A02 = context;
        this.A03 = abstractC000600i;
    }

    public C81093oL A00() {
        C81093oL c81093oL;
        synchronized (this) {
            this.A00++;
            c81093oL = new C81093oL(this);
        }
        return c81093oL;
    }
}
