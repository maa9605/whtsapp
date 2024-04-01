package X;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.1Y5  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y5 implements Closeable, InterfaceC19710vs {
    public ByteBuffer A00;
    public final int A01;
    public final long A02 = System.identityHashCode(this);

    public C1Y5(int i) {
        this.A00 = ByteBuffer.allocateDirect(i);
        this.A01 = i;
    }

    public final void A00(int i, InterfaceC19710vs interfaceC19710vs, int i2, int i3) {
        if (interfaceC19710vs instanceof C1Y5) {
            C07K.A1Z(!isClosed());
            C07K.A1Z(!interfaceC19710vs.isClosed());
            C07K.A14(i, interfaceC19710vs.ADA(), i2, i3, this.A01);
            this.A00.position(i);
            interfaceC19710vs.A8d().position(i2);
            byte[] bArr = new byte[i3];
            this.A00.get(bArr, 0, i3);
            interfaceC19710vs.A8d().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // X.InterfaceC19710vs
    public void A6b(int i, InterfaceC19710vs interfaceC19710vs, int i2, int i3) {
        if (interfaceC19710vs != null) {
            long ADf = interfaceC19710vs.ADf();
            long j = this.A02;
            if (ADf == j) {
                StringBuilder A0P = C000200d.A0P("Copying from BufferMemoryChunk ");
                A0P.append(Long.toHexString(j));
                A0P.append(" to BufferMemoryChunk ");
                A0P.append(Long.toHexString(ADf));
                A0P.append(" which are the same ");
                Log.w("BufferMemoryChunk", A0P.toString());
                C07K.A1X(false);
            }
            if (ADf < j) {
                synchronized (interfaceC19710vs) {
                    synchronized (this) {
                        A00(i, interfaceC19710vs, i2, i3);
                    }
                }
                return;
            }
            synchronized (this) {
                synchronized (interfaceC19710vs) {
                    A00(i, interfaceC19710vs, i2, i3);
                }
            }
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC19710vs
    public synchronized ByteBuffer A8d() {
        return this.A00;
    }

    @Override // X.InterfaceC19710vs
    public int ADA() {
        return this.A01;
    }

    @Override // X.InterfaceC19710vs
    public long ADf() {
        return this.A02;
    }

    @Override // X.InterfaceC19710vs
    public synchronized byte AR3(int i) {
        C07K.A1Z(isClosed() ? false : true);
        C07K.A1X(i >= 0);
        C07K.A1X(i < this.A01);
        return this.A00.get(i);
    }

    @Override // X.InterfaceC19710vs
    public synchronized int AR4(int i, byte[] bArr, int i2, int i3) {
        int A07;
        if (bArr != null) {
            C07K.A1Z(isClosed() ? false : true);
            int i4 = this.A01;
            A07 = C07K.A07(i, i3, i4);
            C07K.A14(i, bArr.length, i2, A07, i4);
            this.A00.position(i);
            this.A00.get(bArr, i2, A07);
        } else {
            throw null;
        }
        return A07;
    }

    @Override // X.InterfaceC19710vs
    public synchronized int AWH(int i, byte[] bArr, int i2, int i3) {
        int A07;
        C07K.A1Z(isClosed() ? false : true);
        int i4 = this.A01;
        A07 = C07K.A07(i, i3, i4);
        C07K.A14(i, bArr.length, i2, A07, i4);
        this.A00.position(i);
        this.A00.put(bArr, i2, A07);
        return A07;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, X.InterfaceC19710vs
    public synchronized void close() {
        this.A00 = null;
    }

    @Override // X.InterfaceC19710vs
    public synchronized boolean isClosed() {
        return this.A00 == null;
    }
}
