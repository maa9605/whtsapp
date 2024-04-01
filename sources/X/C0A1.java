package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.0A1  reason: invalid class name */
/* loaded from: classes.dex */
public class C0A1 {
    public static final Charset A04 = Charset.forName("UTF-8");
    public final ByteBuffer A00;
    public final AtomicReferenceArray A01;
    public final AtomicReferenceArray A02;
    public final C021509y[] A03;

    public C0A1(ByteBuffer byteBuffer, C021509y[] c021509yArr, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        this.A00 = byteBuffer;
        this.A03 = c021509yArr;
        this.A01 = atomicReferenceArray;
        this.A02 = atomicReferenceArray2;
    }

    public InterfaceC020509l A00(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A02;
        InterfaceC020509l interfaceC020509l = (InterfaceC020509l) atomicReferenceArray.get(i);
        if (interfaceC020509l != null) {
            return interfaceC020509l;
        }
        int i2 = (i << 4) + this.A03[1].A02;
        ByteBuffer byteBuffer = this.A00;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        byteBuffer.getInt(i2 + 8);
        byteBuffer.getInt();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i3);
        duplicate.limit(i3 + i4);
        byte[] bArr = new byte[duplicate.remaining()];
        duplicate.get(bArr);
        InterfaceC020509l A0f = AnonymousClass088.A0f(new String(bArr, A04));
        return atomicReferenceArray.compareAndSet(i, null, A0f) ? A0f : (InterfaceC020509l) atomicReferenceArray.get(i);
    }

    public C0A2 A01(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A01;
        C0A2 c0a2 = (C0A2) atomicReferenceArray.get(i);
        if (c0a2 != null) {
            return c0a2;
        }
        int i2 = (i << 4) + this.A03[0].A02;
        ByteBuffer byteBuffer = this.A00;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        byteBuffer.getInt(i2 + 8);
        byteBuffer.getInt(i2 + 12);
        C0A2 c0a22 = new C0A2(this, i3, i4);
        return atomicReferenceArray.compareAndSet(i, null, c0a22) ? c0a22 : (C0A2) atomicReferenceArray.get(i);
    }
}
