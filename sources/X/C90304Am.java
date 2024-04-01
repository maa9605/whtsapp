package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.4Am  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90304Am {
    public static final Map A01 = new WeakHashMap();
    public final InterfaceC007103c A00;

    public C90304Am(InterfaceC007103c interfaceC007103c) {
        this.A00 = interfaceC007103c;
    }

    public synchronized C90294Al A00(Context context) {
        C90294Al c90294Al;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A01;
        c90294Al = (C90294Al) map.get(context);
        if (c90294Al == null) {
            c90294Al = (C90294Al) this.A00.get();
            map.put(context, c90294Al);
        }
        return c90294Al;
    }
}
