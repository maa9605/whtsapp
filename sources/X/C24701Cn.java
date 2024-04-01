package X;

import java.io.IOException;

/* renamed from: X.1Cn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24701Cn extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public C24701Cn(String str, Throwable th) {
        super(C000200d.A0H("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public C24701Cn(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
