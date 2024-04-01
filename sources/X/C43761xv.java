package X;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.1xv */
/* loaded from: classes2.dex */
public final class C43761xv {
    public boolean A00;
    public final C43771xw A01;
    public final /* synthetic */ C43751xu A02;

    public C43761xv(C43751xu c43751xu, C43771xw c43771xw) {
        this.A02 = c43751xu;
        this.A01 = c43771xw;
    }

    public OutputStream A00() {
        FilterOutputStream filterOutputStream;
        synchronized (this.A02) {
            C43771xw c43771xw = this.A01;
            if (c43771xw.A01 == this) {
                filterOutputStream = new FilterOutputStream(new FileOutputStream(c43771xw.A01(0))) { // from class: X.2oD
                    {
                        C43761xv.this = this;
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        try {
                            ((FilterOutputStream) this).out.close();
                        } catch (IOException unused) {
                            C43761xv.this.A00 = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
                    public void flush() {
                        try {
                            ((FilterOutputStream) this).out.flush();
                        } catch (IOException unused) {
                            C43761xv.this.A00 = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream
                    public void write(int i) {
                        try {
                            ((FilterOutputStream) this).out.write(i);
                        } catch (IOException unused) {
                            C43761xv.this.A00 = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream
                    public void write(byte[] bArr, int i, int i2) {
                        try {
                            ((FilterOutputStream) this).out.write(bArr, i, i2);
                        } catch (IOException unused) {
                            C43761xv.this.A00 = true;
                        }
                    }
                };
            } else {
                throw new IllegalStateException();
            }
        }
        return filterOutputStream;
    }
}
