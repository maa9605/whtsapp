package X;

import java.util.HashMap;

/* renamed from: X.1vk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42441vk {
    public static final C42441vk A01 = new C42441vk();
    public final HashMap A00 = new HashMap();

    public C43221x3 A00(C09H c09h) {
        C43221x3 c43221x3;
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            c43221x3 = (C43221x3) hashMap.get(c09h);
        }
        return c43221x3;
    }
}
