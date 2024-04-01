package X;

import java.io.IOException;

/* renamed from: X.2Rd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50292Rd extends Exception {
    public final int downloadStatus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50292Rd(IOException iOException) {
        super(null, iOException);
        int A06 = C002701i.A06(iOException);
        this.downloadStatus = A06;
    }

    public C50292Rd(String str, Exception exc, int i) {
        super(str, exc);
        this.downloadStatus = i;
    }
}
