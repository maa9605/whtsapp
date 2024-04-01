package X;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.net.ssl.SSLException;

/* renamed from: X.3Mw */
/* loaded from: classes2.dex */
public abstract class AbstractC69033Mw {
    public void A00(byte b, byte[] bArr, int i, int i2) {
        if (this instanceof C76733h4) {
            C76733h4 c76733h4 = (C76733h4) this;
            if (i2 <= 16384) {
                try {
                    ByteBuffer allocate = ByteBuffer.allocate(i2 + 5);
                    allocate.put(b);
                    if (b == 22 && !c76733h4.A01) {
                        c76733h4.A01 = true;
                        allocate.putShort((short) 769);
                    } else {
                        allocate.putShort((short) 771);
                    }
                    allocate.put(C40841sx.A0n(i2));
                    allocate.put(bArr, i, i2);
                    c76733h4.A00.write(allocate.array());
                    return;
                } catch (SocketException e) {
                    e = e;
                    throw new C27871Pc((byte) 80, new SSLException(e), true);
                } catch (SocketTimeoutException e2) {
                    e = e2;
                    throw new C27871Pc((byte) 80, new SSLException(e), true);
                } catch (IOException e3) {
                    throw new C27871Pc((byte) 80, new SSLException(e3));
                }
            }
            throw new C27871Pc((byte) 22, new SSLException(C000200d.A0F("record size cannot exceed max length. ", i2, " > ", 16384)));
        }
        C76503gh c76503gh = (C76503gh) this;
        if (i2 <= 16384) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
            ByteBuffer allocate2 = ByteBuffer.allocate(copyOfRange.length + 1 + 0);
            allocate2.put(copyOfRange);
            allocate2.put(b);
            allocate2.put(new byte[0]);
            byte[] array = allocate2.array();
            ByteBuffer allocate3 = ByteBuffer.allocate(5);
            allocate3.put((byte) 23);
            allocate3.putShort((short) 771);
            int length = array.length;
            if (c76503gh.A01.ACe() != null) {
                allocate3.put(C40841sx.A0n(length + 16));
                byte[] A7b = c76503gh.A01.A7b(c76503gh.A00, allocate3.array(), array, 0, length);
                c76503gh.A00++;
                try {
                    ByteBuffer allocate4 = ByteBuffer.allocate(A7b.length + 5);
                    allocate4.put(allocate3.array());
                    allocate4.put(A7b);
                    c76503gh.A02.write(allocate4.array());
                    return;
                } catch (SocketException e4) {
                    e = e4;
                    throw new C27871Pc((byte) 80, new SSLException(e), true);
                } catch (SocketTimeoutException e5) {
                    e = e5;
                    throw new C27871Pc((byte) 80, new SSLException(e), true);
                } catch (IOException e6) {
                    throw new C27871Pc((byte) 80, new SSLException(e6));
                }
            }
            throw null;
        }
        throw new C27871Pc((byte) 22, new SSLException(C000200d.A0F("record size cannot exceed max length. ", i2, " > ", 16384)));
    }

    public synchronized void A01(byte b, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (!C68973Mq.A00.contains(Byte.valueOf(b))) {
                throw new C27871Pc((byte) 80, new SSLException("Invalid content type"));
            }
            while (i2 > 16384) {
                A00(b, bArr, i, 16384);
                i += 16384;
                i2 -= 16384;
            }
            if (i2 > 0) {
                A00(b, bArr, i, i2);
            }
        } else {
            throw new C27871Pc((byte) 80, new SSLException("Data cannot be null"));
        }
    }
}
