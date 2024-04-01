package X;

/* renamed from: X.2Ac  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47182Ac extends Exception {
    public static final long serialVersionUID = 1;
    public String banMessage;
    public int code;
    public long expiration_time;
    public int expire_time_out;
    public String faqUrl;
    public final int serverErrorCode;
    public final int type;

    public C47182Ac(int i, int i2) {
        this.type = i;
        this.serverErrorCode = i2;
    }
}
