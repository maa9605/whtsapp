package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.1Y8  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y8 extends OutputStream {
    public int A00;
    public AbstractC19030uj A01;
    public final AbstractC24731Cq A02;

    public C1Y8(AbstractC24731Cq abstractC24731Cq, int i) {
        C07K.A1X(i > 0);
        if (abstractC24731Cq != null) {
            this.A02 = abstractC24731Cq;
            this.A00 = 0;
            this.A01 = AbstractC19030uj.A01(abstractC24731Cq.get(i), this.A02, AbstractC19030uj.A04);
            return;
        }
        throw null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC19030uj abstractC19030uj = this.A01;
        if (abstractC19030uj != null) {
            abstractC19030uj.close();
        }
        this.A01 = null;
        this.A00 = -1;
        try {
            super.close();
        } catch (IOException e) {
            C07K.A1W(e);
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (AbstractC19030uj.A02(this.A01)) {
                int i3 = this.A00 + i2;
                if (AbstractC19030uj.A02(this.A01)) {
                    if (i3 > ((InterfaceC19710vs) this.A01.A04()).ADA()) {
                        AbstractC24731Cq abstractC24731Cq = this.A02;
                        InterfaceC19710vs interfaceC19710vs = (InterfaceC19710vs) abstractC24731Cq.get(i3);
                        ((InterfaceC19710vs) this.A01.A04()).A6b(0, interfaceC19710vs, 0, this.A00);
                        this.A01.close();
                        this.A01 = AbstractC19030uj.A01(interfaceC19710vs, abstractC24731Cq, AbstractC19030uj.A04);
                    }
                    ((InterfaceC19710vs) this.A01.A04()).AWH(this.A00, bArr, i, i2);
                    this.A00 += i2;
                    return;
                }
                throw new C19730vu();
            }
            throw new C19730vu();
        }
        StringBuilder A0P = C000200d.A0P("length=");
        C000200d.A1H(A0P, bArr.length, "; regionStart=", i, "; regionLength=");
        A0P.append(i2);
        throw new ArrayIndexOutOfBoundsException(A0P.toString());
    }
}
