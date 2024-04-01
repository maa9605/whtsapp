package X;

/* renamed from: X.1qp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39851qp extends AbstractC31511cO {
    public static C39851qp A00;

    public C39851qp(AnonymousClass176 anonymousClass176) {
        super(anonymousClass176);
    }

    public static String A02(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            long abs = Math.abs(((Number) obj).longValue());
            int i = (abs > 100L ? 1 : (abs == 100L ? 0 : -1));
            String valueOf = String.valueOf(obj);
            if (i < 0) {
                return valueOf;
            }
            String str = valueOf.charAt(0) != '-' ? "" : "-";
            String valueOf2 = String.valueOf(abs);
            StringBuilder A0P = C000200d.A0P(str);
            int length = valueOf2.length();
            A0P.append(Math.round(Math.pow(10.0d, length - 1)));
            A0P.append("...");
            A0P.append(str);
            A0P.append(Math.round(Math.pow(10.0d, length) - 1.0d));
            return A0P.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
    }

    @Override // X.AbstractC31511cO
    public final void A0D() {
        synchronized (C39851qp.class) {
            A00 = this;
        }
    }

    public final void A0E(C17P c17p, String str) {
        A08(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), c17p.toString());
    }
}
