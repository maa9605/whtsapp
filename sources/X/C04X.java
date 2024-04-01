package X;

import com.whatsapp.util.Log;

/* renamed from: X.04X  reason: invalid class name */
/* loaded from: classes.dex */
public class C04X {
    public static volatile C04X A01;
    public AbstractC000600i A00;

    public C04X(AbstractC000600i abstractC000600i) {
        this.A00 = abstractC000600i;
    }

    public void A00(Exception exc) {
        Log.e("wamsysJniBridge/caught exception", exc);
        if (this.A00 == null) {
            throw null;
        }
        exc.getMessage();
    }
}
