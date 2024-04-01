package X;

/* renamed from: X.24O  reason: invalid class name */
/* loaded from: classes2.dex */
public class C24O extends AbstractC44931zt {
    public final String index;
    public final C44841zk operation;
    public final int reason;
    public final AnonymousClass204 syncActionValue;
    public final C44651zQ syncdKeyId;
    public final int version;

    public C24O(int i, String str, Integer num, C44651zQ c44651zQ, C44841zk c44841zk, AnonymousClass204 anonymousClass204) {
        super(C000200d.A0D("MalformedMutationException with reason ", i));
        int i2;
        this.index = str;
        this.reason = i;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        this.version = i2;
        this.syncdKeyId = c44651zQ;
        this.syncActionValue = anonymousClass204;
        this.operation = c44841zk;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }
}
