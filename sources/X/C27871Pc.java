package X;

import javax.net.ssl.SSLException;

/* renamed from: X.1Pc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27871Pc extends Exception {
    public final byte description;
    public final boolean errorTransient = false;
    public final SSLException ex;

    public C27871Pc(byte b, SSLException sSLException) {
        this.description = b;
        this.ex = sSLException;
    }

    public C27871Pc(byte b, SSLException sSLException, boolean z) {
        this.description = b;
        this.ex = sSLException;
    }
}
