package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0tI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18170tI {
    public static final Map A00;

    static {
        EnumC18080t9 enumC18080t9 = EnumC18080t9.percent;
        EnumC18080t9 enumC18080t92 = EnumC18080t9.pt;
        HashMap hashMap = new HashMap(9);
        A00 = hashMap;
        hashMap.put("xx-small", new C17900sr(0.694f, enumC18080t92));
        Map map = A00;
        map.put("x-small", new C17900sr(0.833f, enumC18080t92));
        map.put("small", new C17900sr(10.0f, enumC18080t92));
        map.put("medium", new C17900sr(12.0f, enumC18080t92));
        map.put("large", new C17900sr(14.4f, enumC18080t92));
        map.put("x-large", new C17900sr(17.3f, enumC18080t92));
        map.put("xx-large", new C17900sr(20.7f, enumC18080t92));
        map.put("smaller", new C17900sr(83.33f, enumC18080t9));
        map.put("larger", new C17900sr(120.0f, enumC18080t9));
    }
}
