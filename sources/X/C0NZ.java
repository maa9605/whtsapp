package X;

import com.whatsapp.util.Log;

/* renamed from: X.0NZ  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0NZ extends AbstractServiceC05030Na {
    @Override // X.AbstractServiceC05030Na
    public InterfaceC12730jy A01() {
        try {
            return super.A01();
        } catch (SecurityException e) {
            if (e.getMessage().contains("Caller no longer running")) {
                StringBuilder A0P = C000200d.A0P("WaJobIntentService/'Caller no longer running' failure for ");
                A0P.append(getClass().getSimpleName());
                Log.e(A0P.toString(), e);
                return null;
            }
            throw e;
        }
    }
}
