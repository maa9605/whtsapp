package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2I4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2I4 extends ByteArrayOutputStream {
    public final ByteBuffer A00() {
        ByteBuffer wrap = ByteBuffer.wrap(((ByteArrayOutputStream) this).buf, 0, size());
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.asReadOnlyBuffer();
    }

    public final byte[] A01() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
