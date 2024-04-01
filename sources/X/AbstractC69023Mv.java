package X;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.net.ssl.SSLException;

/* renamed from: X.3Mv */
/* loaded from: classes2.dex */
public abstract class AbstractC69023Mv {
    public final C76273gK A00;
    public final C76273gK A01;
    public final InputStream A02;

    public AbstractC69023Mv(InputStream inputStream, C76273gK c76273gK) {
        if (inputStream != null && c76273gK != null) {
            this.A02 = inputStream;
            this.A00 = new C76273gK();
            this.A01 = c76273gK;
            return;
        }
        throw new C27871Pc((byte) 80, new SSLException("transportIn or recordStream is null"));
    }

    public C68853Me A00() {
        try {
            if (!(this.A00.available() > 0)) {
                return null;
            }
            C76273gK c76273gK = this.A00;
            c76273gK.A00();
            byte[] bArr = new byte[4];
            if (c76273gK.read(bArr) < 4) {
                c76273gK.reset();
                return new C76653gw();
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte[] bArr2 = new byte[3];
            wrap.get(bArr2);
            int A04 = C40841sx.A04(bArr2);
            if (c76273gK.available() < A04) {
                c76273gK.reset();
                return new C76653gw();
            }
            c76273gK.reset();
            int i = A04 + 4;
            byte[] bArr3 = new byte[i];
            if (c76273gK.read(bArr3) == i) {
                byte b2 = b;
                if (b2 != 1) {
                    if (b2 == 2) {
                        if (i >= 38 && C40841sx.A0k(Arrays.copyOfRange(bArr3, 6, 38), C68963Mp.A09)) {
                            return new C68853Me(bArr3) { // from class: X.3gu
                            };
                        }
                        return new C68853Me(bArr3) { // from class: X.3h2
                        };
                    } else if (b2 != 4) {
                        if (b2 != 8) {
                            if (b2 != 11) {
                                if (b2 != 13) {
                                    if (b2 != 15) {
                                        if (b2 != 20) {
                                            if (b2 == 24) {
                                                return new C68853Me(bArr3) { // from class: X.3gx
                                                };
                                            }
                                            throw new SSLException(C000200d.A0D("Invalid handshake message type ", b2));
                                        }
                                        return new C68853Me(bArr3) { // from class: X.3h1
                                        };
                                    }
                                    return new C68853Me(bArr3) { // from class: X.3h0
                                    };
                                }
                                return new C68853Me(bArr3) { // from class: X.3gm
                                };
                            }
                            return new C68853Me(bArr3) { // from class: X.3gz
                            };
                        }
                        return new C68853Me(bArr3) { // from class: X.3gt
                        };
                    } else {
                        return new C68853Me(bArr3) { // from class: X.3gv
                        };
                    }
                }
                return new C76573go(bArr3);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not read handshake message of length ");
            sb.append(i);
            throw new C27871Pc((byte) 80, new SSLException(sb.toString()));
        } catch (IOException e) {
            throw new C27871Pc((byte) 80, new SSLException(e));
        }
    }

    public C68853Me A01() {
        if (!(this instanceof C76723h3)) {
            C76493gg c76493gg = (C76493gg) this;
            try {
                C68853Me A00 = c76493gg.A00();
                if (A00 == null || (A00 instanceof C76653gw)) {
                    if (c76493gg.A02()) {
                        byte[] bArr = new byte[5];
                        C76273gK c76273gK = ((AbstractC69023Mv) c76493gg).A01;
                        int read = c76273gK.read(bArr);
                        if (read == 5) {
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            byte b = wrap.get();
                            wrap.getShort();
                            byte[] bArr2 = new byte[2];
                            wrap.get(bArr2);
                            int A05 = C40841sx.A05(bArr2);
                            if (b != 23 && b != 20) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Invalid content type ");
                                sb.append((int) b);
                                throw new C27871Pc((byte) 47, new SSLException(sb.toString()));
                            }
                            byte[] bArr3 = new byte[A05];
                            int read2 = c76273gK.read(bArr3);
                            if (read2 != A05) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("read returned fewer than expected bytes ");
                                sb2.append(read2);
                                sb2.append(" != ");
                                sb2.append(A05);
                                throw new C27871Pc((byte) 80, new SSLException(sb2.toString()));
                            } else if (b == 20) {
                                return new C76653gw();
                            } else {
                                byte[] A73 = c76493gg.A01.A73(c76493gg.A00, bArr, bArr3, 0, A05);
                                c76493gg.A00++;
                                C69063Mz c69063Mz = new C69063Mz(A73);
                                byte b2 = c69063Mz.A00;
                                if (b2 == 20) {
                                    return new C76653gw();
                                }
                                switch (b2) {
                                    case 21:
                                        return new C68853Me(c69063Mz.A02) { // from class: X.3gj
                                        };
                                    case 22:
                                        C76273gK c76273gK2 = ((AbstractC69023Mv) c76493gg).A00;
                                        byte[] bArr4 = c69063Mz.A02;
                                        c76273gK2.A01(bArr4, bArr4.length);
                                        return c76493gg.A00();
                                    case 23:
                                        if (((AbstractC69023Mv) c76493gg).A00.available() > 0) {
                                            throw new C27871Pc((byte) 10, new SSLException("App data and handshake messages cannot interleave"));
                                        }
                                        return new C68853Me(c69063Mz.A02) { // from class: X.3gk
                                        };
                                    default:
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Invalid content type ");
                                        sb3.append((int) b2);
                                        throw new C27871Pc((byte) 10, new SSLException(sb3.toString()));
                                }
                            }
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("read returned fewer than expected bytes ");
                        sb4.append(read);
                        sb4.append(" != ");
                        sb4.append(5);
                        throw new C27871Pc((byte) 80, new SSLException(sb4.toString()));
                    }
                    byte[] bArr5 = new byte[16645];
                    int read3 = c76493gg.A02.read(bArr5);
                    if (read3 != -1) {
                        ((AbstractC69023Mv) c76493gg).A01.A01(bArr5, read3);
                        return new C76653gw();
                    }
                    throw new C27871Pc((byte) 80, new SSLException("Transport layer is reached end of file."), true);
                }
                return A00;
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
        try {
            C68853Me A002 = A00();
            if (A002 == null || (A002 instanceof C76653gw)) {
                if (A02()) {
                    byte[] bArr6 = new byte[5];
                    C76273gK c76273gK3 = this.A01;
                    int read4 = c76273gK3.read(bArr6);
                    if (read4 == 5) {
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr6);
                        byte b3 = wrap2.get();
                        wrap2.getShort();
                        byte[] bArr7 = new byte[2];
                        wrap2.get(bArr7);
                        int A052 = C40841sx.A05(bArr7);
                        byte[] bArr8 = new byte[A052];
                        int read5 = c76273gK3.read(bArr8);
                        if (read5 != A052) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("read returned fewer than expected bytes ");
                            sb5.append(read5);
                            sb5.append(" != ");
                            sb5.append(A052);
                            throw new C27871Pc((byte) 80, new SSLException(sb5.toString()));
                        } else if (b3 == 20) {
                            return new C76653gw();
                        } else {
                            switch (b3) {
                                case 21:
                                    return new C68853Me(bArr8) { // from class: X.3gj
                                    };
                                case 22:
                                    this.A00.A01(bArr8, A052);
                                    return A00();
                                case 23:
                                    if (!(this.A00.available() > 0)) {
                                        return new C68853Me(bArr8) { // from class: X.3gk
                                        };
                                    }
                                    throw new C27871Pc((byte) 10, new SSLException("App data and handshake messages cannot interleave"));
                                default:
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Received Message with invalid type ");
                                    sb6.append((int) b3);
                                    throw new C27871Pc((byte) 10, new SSLException(sb6.toString()));
                            }
                        }
                    }
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("read returned fewer than expected bytes ");
                    sb7.append(read4);
                    sb7.append(" != ");
                    sb7.append(5);
                    throw new C27871Pc((byte) 80, new SSLException(sb7.toString()));
                }
                byte[] bArr9 = new byte[16645];
                int read6 = this.A02.read(bArr9);
                if (read6 != -1) {
                    this.A01.A01(bArr9, read6);
                    return new C76653gw();
                }
                throw new C27871Pc((byte) 80, new SSLException("Transport layer is reached end of file."), true);
            }
            return A002;
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

    public boolean A02() {
        try {
            C76273gK c76273gK = this.A01;
            if (c76273gK.available() >= 5) {
                byte[] bArr = new byte[5];
                c76273gK.A00();
                int read = c76273gK.read(bArr);
                if (read == 5) {
                    c76273gK.reset();
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    byte b = wrap.get();
                    short s = wrap.getShort();
                    byte[] bArr2 = new byte[2];
                    wrap.get(bArr2);
                    int A05 = C40841sx.A05(bArr2);
                    if (!C68973Mq.A00.contains(Byte.valueOf(b)) || s != 771) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid record header ");
                        sb.append(C40841sx.A0U(bArr));
                        throw new C27871Pc((byte) 10, new SSLException(sb.toString()), true);
                    } else if (A05 >= 0 && A05 <= 16640) {
                        return c76273gK.available() >= A05 + 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid record header ");
                        sb2.append(C40841sx.A0U(bArr));
                        throw new C27871Pc((byte) 22, new SSLException(sb2.toString()), true);
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("read returned fewer than expected bytes ");
                sb3.append(read);
                sb3.append(" != ");
                sb3.append(5);
                throw new C27871Pc((byte) 80, new SSLException(sb3.toString()));
            }
            return false;
        } catch (IOException e) {
            throw new C27871Pc((byte) 80, new SSLException(e));
        }
    }
}
