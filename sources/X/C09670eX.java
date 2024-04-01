package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0eX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09670eX {
    public static Map A00 = new HashMap();
    public static Map A01 = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r0.booleanValue() != false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.Class r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09670eX.A00(java.lang.Class):int");
    }

    public static InterfaceC13890lz A01(Constructor constructor, Object obj) {
        try {
            constructor.newInstance(obj);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
