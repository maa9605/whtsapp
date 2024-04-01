package X;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.1Y3  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y3 implements Closeable, InterfaceC19710vs {
    public SharedMemory A00;
    public ByteBuffer A01;
    public final long A02;

    public C1Y3(int i) {
        C07K.A1X(i > 0);
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.A00 = create;
            this.A01 = create.mapReadWrite();
            this.A02 = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    public final void A00(int i, InterfaceC19710vs interfaceC19710vs, int i2, int i3) {
        if (interfaceC19710vs instanceof C1Y3) {
            C07K.A1Z(!isClosed());
            C07K.A1Z(!interfaceC19710vs.isClosed());
            C07K.A14(i, interfaceC19710vs.ADA(), i2, i3, ADA());
            this.A01.position(i);
            interfaceC19710vs.A8d().position(i2);
            byte[] bArr = new byte[i3];
            this.A01.get(bArr, 0, i3);
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
                StringBuilder A0P = C000200d.A0P("Copying from AshmemMemoryChunk ");
                A0P.append(Long.toHexString(j));
                A0P.append(" to AshmemMemoryChunk ");
                A0P.append(Long.toHexString(ADf));
                A0P.append(" which are the same ");
                Log.w("AshmemMemoryChunk", A0P.toString());
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
    public ByteBuffer A8d() {
        return this.A01;
    }

    @Override // X.InterfaceC19710vs
    public int ADA() {
        C07K.A1Z(!isClosed());
        return this.A00.getSize();
    }

    @Override // X.InterfaceC19710vs
    public long ADf() {
        return this.A02;
    }

    @Override // X.InterfaceC19710vs
    public synchronized byte AR3(int i) {
        C07K.A1Z(isClosed() ? false : true);
        C07K.A1X(i >= 0);
        C07K.A1X(i < ADA());
        return this.A01.get(i);
    }

    @Override // X.InterfaceC19710vs
    public synchronized int AR4(int i, byte[] bArr, int i2, int i3) {
        int A07;
        if (bArr != null) {
            C07K.A1Z(isClosed() ? false : true);
            A07 = C07K.A07(i, i3, ADA());
            C07K.A14(i, bArr.length, i2, A07, ADA());
            this.A01.position(i);
            this.A01.get(bArr, i2, A07);
        } else {
            throw null;
        }
        return A07;
    }

    @Override // X.InterfaceC19710vs
    public synchronized int AWH(int i, byte[] bArr, int i2, int i3) {
        int A07;
        C07K.A1Z(isClosed() ? false : true);
        A07 = C07K.A07(i, i3, ADA());
        C07K.A14(i, bArr.length, i2, A07, ADA());
        this.A01.position(i);
        this.A01.put(bArr, i2, A07);
        return A07;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, X.InterfaceC19710vs
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.A01);
            this.A00.close();
            this.A01 = null;
            this.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
        if (r2.A00 == null) goto L11;
     */
    @Override // X.InterfaceC19710vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isClosed() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r0 = r2.A01     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto La
            android.os.SharedMemory r1 = r2.A00     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            if (r1 != 0) goto Lb
        La:
            r0 = 1
        Lb:
            monitor-exit(r2)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Y3.isClosed():boolean");
    }
}
