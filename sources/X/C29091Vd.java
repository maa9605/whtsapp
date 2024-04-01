package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Vd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29091Vd implements InterfaceC16530qZ {
    public static final String A03 = AbstractC16430qO.A01("CommandHandler");
    public final Context A00;
    public final Map A02 = new HashMap();
    public final Object A01 = new Object();

    public C29091Vd(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC16530qZ
    public void AK7(String workSpecId, boolean needsReschedule) {
        synchronized (this.A01) {
            InterfaceC16530qZ interfaceC16530qZ = (InterfaceC16530qZ) this.A02.remove(workSpecId);
            if (interfaceC16530qZ != null) {
                interfaceC16530qZ.AK7(workSpecId, needsReschedule);
            }
        }
    }
}
