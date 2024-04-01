package X;

import java.io.Serializable;

/* renamed from: X.3fg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC75873fg implements Serializable {
    public static final long serialVersionUID = 0;

    public static AbstractC75873fg A00(Object obj) {
        if (obj != null) {
            return new C85553vo(obj);
        }
        throw null;
    }

    public Object A01() {
        if (!(this instanceof C85553vo)) {
            throw new IllegalStateException("value is absent");
        }
        return ((C85553vo) this).reference;
    }

    public boolean A02() {
        return this instanceof C85553vo;
    }
}
