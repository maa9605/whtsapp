package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.085  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass085 {
    public final Map A00;
    public final boolean A01;

    public AnonymousClass085(boolean z) {
        HashMap hashMap;
        this.A01 = z;
        if (z) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap();
        }
        this.A00 = hashMap;
    }

    public Object A00(AnonymousClass084 anonymousClass084) {
        if (anonymousClass084 != null) {
            Map map = this.A00;
            if (map != null) {
                return map.get(this.A01 ? Integer.valueOf(anonymousClass084.A00) : anonymousClass084.A01);
            }
            throw new IllegalStateException("VALUES IS NULL");
        }
        throw new IllegalStateException("KEY IS NULL");
    }

    public Set A01() {
        int i;
        Map map = this.A00;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : "";
            if (key instanceof Integer) {
                i = ((Number) key).intValue();
            } else {
                i = -1;
            }
            hashMap.put(new AnonymousClass084(str, i), entry.getValue());
        }
        return hashMap.entrySet();
    }

    public void A02(AnonymousClass084 anonymousClass084, Object obj) {
        if (this.A01) {
            this.A00.put(Integer.valueOf(anonymousClass084.A00), obj);
        } else {
            this.A00.put(anonymousClass084.A01, obj);
        }
    }
}
