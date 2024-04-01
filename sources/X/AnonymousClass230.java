package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;

/* renamed from: X.230  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass230 implements InterfaceC43611xg {
    public final C0DC A00;

    public AnonymousClass230(C0DC c0dc) {
        this.A00 = c0dc;
    }

    @Override // X.InterfaceC43611xg
    public InterfaceC43551xa A9w(final byte[] bArr) {
        return new InterfaceC43551xa() { // from class: X.39w
            @Override // X.InterfaceC43551xa
            public final InputStream A7a(InputStream inputStream) {
                AnonymousClass230 anonymousClass230 = AnonymousClass230.this;
                return new InputStream(inputStream, anonymousClass230.AAo().A7A(bArr)) { // from class: X.2tY
                    public ByteArrayInputStream A00;
                    public boolean A01;
                    public final InputStream A02;
                    public final Cipher A03;
                    public final Mac A04;

                    {
                        this.A02 = inputStream;
                        byte[] bArr2 = r5.A01;
                        this.A03 = C42041uv.A07(bArr2, r5.A00, 1);
                        this.A04 = C42041uv.A08(bArr2, r5.A02);
                    }

                    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        this.A02.close();
                    }

                    @Override // java.io.InputStream
                    public int read() {
                        byte[] bArr2 = new byte[1];
                        while (true) {
                            int read = read(bArr2, 0, 1);
                            if (read == -1) {
                                return -1;
                            }
                            if (read != 0) {
                                return bArr2[0];
                            }
                            Thread.yield();
                        }
                    }

                    @Override // java.io.InputStream
                    public int read(byte[] bArr2) {
                        return read(bArr2, 0, bArr2.length);
                    }

                    @Override // java.io.InputStream
                    public int read(byte[] bArr2, int i, int i2) {
                        ByteArrayInputStream byteArrayInputStream = this.A00;
                        if (byteArrayInputStream != null) {
                            int read = byteArrayInputStream.read(bArr2, i, i2);
                            if (read > 0) {
                                return read;
                            }
                            this.A00 = null;
                            if (this.A01) {
                                return -1;
                            }
                        }
                        int read2 = this.A02.read(bArr2, i, i2);
                        if (read2 == -1) {
                            ByteBuffer allocate = ByteBuffer.allocate(42);
                            try {
                                byte[] doFinal = this.A03.doFinal();
                                allocate.put(doFinal);
                                allocate.put(AnonymousClass029.A1g(this.A04.doFinal(doFinal), 10));
                                allocate.flip();
                                byte[] bArr3 = new byte[allocate.remaining()];
                                allocate.get(bArr3);
                                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr3);
                                this.A00 = byteArrayInputStream2;
                                this.A01 = true;
                                return byteArrayInputStream2.read(bArr2, i, i2);
                            } catch (BadPaddingException | IllegalBlockSizeException e) {
                                throw new AssertionError(e);
                            }
                        } else if (read2 > 0) {
                            byte[] update = this.A03.update(bArr2, i, read2);
                            if (update == null) {
                                return 0;
                            }
                            this.A04.update(update);
                            int length = update.length;
                            if (length <= i2) {
                                System.arraycopy(update, 0, bArr2, i, length);
                                return length;
                            }
                            System.arraycopy(update, 0, bArr2, i, i2);
                            this.A00 = new ByteArrayInputStream(update, i2, length - i2);
                            return i2;
                        } else {
                            return read2;
                        }
                    }
                };
            }
        };
    }

    @Override // X.InterfaceC43611xg
    public InterfaceC59882tZ AAo() {
        final C0DC c0dc = this.A00;
        return new InterfaceC59882tZ(c0dc) { // from class: X.39z
            public final C0DC A00;

            {
                this.A00 = c0dc;
            }

            @Override // X.InterfaceC59882tZ
            public C42621w3 A7A(byte[] bArr) {
                return C42041uv.A03(C002701i.A1Y(bArr, this.A00.A03, 80));
            }
        };
    }
}
