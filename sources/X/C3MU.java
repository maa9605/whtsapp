package X;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import javax.net.ssl.SSLException;

/* renamed from: X.3MU  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3MU extends OutputStream {
    public boolean A00 = false;
    public final C3MW A01;

    public C3MU(C3MW c3mw) {
        this.A01 = c3mw;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00 = true;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (!this.A00) {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
            return;
        }
        throw new IOException("Stream is closed.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        if (!this.A00) {
            write(bArr, 0, bArr.length);
            return;
        }
        throw new IOException("Stream is closed.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        List list;
        if (!this.A00) {
            C76743h5 c76743h5 = (C76743h5) this.A01;
            if (c76743h5 != null) {
                try {
                    final C3MX c3mx = new C3MX(bArr, i, i2);
                    if (c76743h5.A0F && !c76743h5.A0E) {
                        C76513gi c76513gi = c76743h5.A05;
                        if (c76513gi.A0Y && c76513gi.A0R != null && (list = c76513gi.A0S) != null) {
                            c76513gi.A0Z = true;
                            long j = i2;
                            long j2 = c76513gi.A0C.A03.maxEarlyDataSize;
                            if (c76513gi.A04 + j > j2) {
                                c76513gi.A04 = j2;
                                long j3 = c76513gi.A05 + j;
                                long j4 = c76513gi.A06;
                                if (j3 <= j4) {
                                    c76513gi.A05 = j3;
                                    list.add(c3mx);
                                    return;
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("Client request exceeded the max spillover limit ");
                                sb.append(j3);
                                sb.append(" > ");
                                sb.append(j4);
                                throw new C27871Pc((byte) 80, new SSLException(sb.toString()));
                            }
                            c76743h5.A09.A00(new C68853Me(c3mx) { // from class: X.3gr
                            });
                            c76743h5.A05.A0R.add(c3mx);
                            c76743h5.A05.A04 += j;
                            return;
                        }
                    }
                    c76743h5.A09.A00(new C76543gl(c3mx));
                    return;
                } catch (C27871Pc e) {
                    c76743h5.A06((byte) 2, e.description, e.errorTransient, e.ex);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    if (e.getCause() != null) {
                        e = e.getCause();
                    }
                    c76743h5.A06((byte) 2, (byte) 80, false, new SSLException(e));
                    return;
                }
            }
            throw null;
        }
        throw new IOException("Stream is closed.");
    }
}
