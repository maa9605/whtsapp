package X;

/* renamed from: X.0qO */
/* loaded from: classes.dex */
public abstract class AbstractC16430qO {
    public static AbstractC16430qO A00;

    public abstract void A02(String tag, String message, Throwable... throwables);

    public abstract void A03(String tag, String message, Throwable... throwables);

    public abstract void A04(String tag, String message, Throwable... throwables);

    public abstract void A05(String tag, String message, Throwable... throwables);

    public static synchronized AbstractC16430qO A00() {
        AbstractC16430qO abstractC16430qO;
        synchronized (AbstractC16430qO.class) {
            abstractC16430qO = A00;
            if (abstractC16430qO == null) {
                abstractC16430qO = new C1VG(3);
                A00 = abstractC16430qO;
            }
        }
        return abstractC16430qO;
    }

    public static String A01(String tag) {
        int length = tag.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(tag.substring(0, 20));
        } else {
            sb.append(tag);
        }
        return sb.toString();
    }
}
