package X;

import java.nio.ByteBuffer;

/* renamed from: X.1ZK */
/* loaded from: classes.dex */
public class C1ZK extends AbstractC21590za {
    public long A00;
    public ByteBuffer A01;
    public final int A02;
    public final C21610zc A03 = new C21610zc();

    public C1ZK(int i) {
        this.A02 = i;
    }

    public final ByteBuffer A02(int i) {
        int i2 = this.A02;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.A01;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public void A03() {
        super.A00 = 0;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public void A04(int i) {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            this.A01 = A02(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.A01.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer A02 = A02(i2);
        if (position > 0) {
            this.A01.position(0);
            this.A01.limit(position);
            A02.put(this.A01);
        }
        this.A01 = A02;
    }
}
