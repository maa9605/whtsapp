package X;

import java.io.IOException;

/* renamed from: X.129  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass129 extends IOException {
    public final AnonymousClass126 dataSpec;
    public final int type;

    public AnonymousClass129(IOException iOException, AnonymousClass126 anonymousClass126, int i) {
        super(iOException);
        this.dataSpec = anonymousClass126;
        this.type = i;
    }

    public AnonymousClass129(String str, AnonymousClass126 anonymousClass126) {
        super(str);
        this.dataSpec = anonymousClass126;
        this.type = 1;
    }

    public AnonymousClass129(String str, IOException iOException, AnonymousClass126 anonymousClass126) {
        super(str, iOException);
        this.dataSpec = anonymousClass126;
        this.type = 1;
    }
}
