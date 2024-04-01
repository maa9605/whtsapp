package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.3h5 */
/* loaded from: classes2.dex */
public class C76743h5 extends SSLSocket implements C3MW {
    public int A00;
    public long A01;
    public long A02;
    public C3MT A03;
    public C3MU A04;
    public C76513gi A05;
    public AbstractC69013Mu A06;
    public C27891Pf A07;
    public C27891Pf A08;
    public C69043Mx A09;
    public InputStream A0A;
    public OutputStream A0B;
    public String A0C;
    public Set A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public static String A00(byte b) {
        if (b != 0) {
            if (b != 10) {
                if (b != 20) {
                    if (b != 22) {
                        if (b != 40) {
                            if (b != 80) {
                                if (b != 86) {
                                    if (b != 90) {
                                        if (b != 120) {
                                            if (b != 70) {
                                                if (b != 71) {
                                                    if (b != 109) {
                                                        if (b != 110) {
                                                            if (b != 112) {
                                                                if (b != 113) {
                                                                    if (b != 115) {
                                                                        if (b != 116) {
                                                                            switch (b) {
                                                                                case 42:
                                                                                    return "bad_certificate";
                                                                                case 43:
                                                                                    return "unsupported_certificate";
                                                                                case 44:
                                                                                    return "certificate_revoked";
                                                                                case 45:
                                                                                    return "certificate_expired";
                                                                                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                                                                                    return "certificate_unknown";
                                                                                case 47:
                                                                                    return "illegal_parameter";
                                                                                case 48:
                                                                                    return "unknown_ca";
                                                                                case 49:
                                                                                    return "access_denied";
                                                                                case 50:
                                                                                    return "decode_error";
                                                                                case 51:
                                                                                    return "decrypt_error";
                                                                                default:
                                                                                    return "invalid description";
                                                                            }
                                                                        }
                                                                        return "certificate_required";
                                                                    }
                                                                    return "unknown_psk_identity";
                                                                }
                                                                return "bad_certificate_status_response";
                                                            }
                                                            return "unrecognized_name";
                                                        }
                                                        return "unsupported_version";
                                                    }
                                                    return "missing_extension";
                                                }
                                                return "insufficient_security";
                                            }
                                            return "protocol_version";
                                        }
                                        return "no_application_protocol";
                                    }
                                    return "user_cancelled";
                                }
                                return "inappropriate_fallback";
                            }
                            return "internal_error";
                        }
                        return "handshake_failure";
                    }
                    return "record_overflow";
                }
                return "bad_record_mac";
            }
            return "unexpected_message";
        }
        return "close_notify";
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getEnableSessionCreation() {
        return true;
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getUseClientMode() {
        return true;
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnableSessionCreation(boolean z) {
    }

    @Override // javax.net.ssl.SSLSocket
    public void setUseClientMode(boolean z) {
    }

    public C76743h5() {
        this.A0F = false;
        this.A0E = false;
        this.A0G = false;
        this.A0D = new HashSet();
    }

    public C76743h5(AbstractC69013Mu abstractC69013Mu) {
        this.A0F = false;
        this.A0E = false;
        this.A0G = false;
        this.A0D = new HashSet();
        this.A06 = abstractC69013Mu;
        this.A0C = null;
        this.A00 = -1;
        A04();
    }

    public C76743h5(String str, int i, AbstractC69013Mu abstractC69013Mu) {
        super(str, i);
        this.A0F = false;
        this.A0E = false;
        this.A0G = false;
        this.A0D = new HashSet();
        this.A06 = abstractC69013Mu;
        this.A0C = str;
        this.A00 = i;
        A04();
    }

    public C76743h5(String str, int i, InetAddress inetAddress, int i2, AbstractC69013Mu abstractC69013Mu) {
        super(str, i, inetAddress, i2);
        this.A0F = false;
        this.A0E = false;
        this.A0G = false;
        this.A0D = new HashSet();
        this.A06 = abstractC69013Mu;
        this.A0C = str;
        this.A00 = i;
        A04();
    }

    public C76743h5(InetAddress inetAddress, int i, AbstractC69013Mu abstractC69013Mu) {
        super(inetAddress, i);
        this.A0F = false;
        this.A0E = false;
        this.A0G = false;
        this.A0D = new HashSet();
        this.A06 = abstractC69013Mu;
        this.A0C = null;
        this.A00 = i;
        A04();
    }

    public C76743h5(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, AbstractC69013Mu abstractC69013Mu) {
        super(inetAddress, i, inetAddress2, i2);
        this.A0F = false;
        this.A0E = false;
        this.A0G = false;
        this.A0D = new HashSet();
        this.A06 = abstractC69013Mu;
        this.A0C = inetAddress.getHostName();
        this.A00 = i;
        A04();
    }

    public static byte[] A01(C76513gi c76513gi) {
        ByteBuffer allocate;
        short s;
        byte[] bArr;
        if (c76513gi != null) {
            byte[] bArr2 = c76513gi.A0j;
            if (bArr2 != null && bArr2.length == 32) {
                if (c76513gi.A0l != null) {
                    C68993Ms c68993Ms = new C68993Ms();
                    try {
                        String str = c76513gi.A0O;
                        if (str != null && !str.isEmpty()) {
                            byte[] bytes = str.getBytes("UTF-8");
                            int length = bytes.length;
                            ByteBuffer allocate2 = ByteBuffer.allocate(length + 3);
                            allocate2.put(C40841sx.A0n(length + 1));
                            allocate2.put((byte) length);
                            allocate2.put(bytes);
                            c68993Ms.A01(new C68983Mr((short) 16, allocate2.array()));
                        }
                        ByteBuffer allocate3 = ByteBuffer.allocate(4);
                        allocate3.putShort((short) 2);
                        if (c76513gi.A0I != null) {
                            allocate3.putShort((short) 1027);
                            c68993Ms.A01(new C68983Mr((short) 13, allocate3.array()));
                            ByteBuffer allocate4 = ByteBuffer.allocate(4);
                            allocate4.putShort((short) 2);
                            if (c76513gi.A0H != null) {
                                allocate4.putShort((short) 29);
                                c68993Ms.A01(new C68983Mr((short) 10, allocate4.array()));
                                ByteBuffer allocate5 = ByteBuffer.allocate(2);
                                allocate5.put((byte) 1);
                                allocate5.put(c76513gi.A00);
                                c68993Ms.A01(new C68983Mr((short) 45, allocate5.array()));
                                ByteBuffer allocate6 = ByteBuffer.allocate(5);
                                allocate6.put((byte) 4);
                                allocate6.putShort((short) 772);
                                allocate6.putShort((short) -1254);
                                c68993Ms.A01(new C68983Mr((short) 43, allocate6.array()));
                                ByteBuffer allocate7 = ByteBuffer.allocate(4);
                                allocate7.putShort((short) 2);
                                if (c76513gi.A0I != null) {
                                    allocate7.putShort((short) 1027);
                                    c68993Ms.A01(new C68983Mr((short) 50, allocate7.array()));
                                    if (c76513gi.A0a && c76513gi.A0C.A03 != null && !c76513gi.A0c) {
                                        c68993Ms.A01(new C68983Mr((short) 42, new byte[0]));
                                    }
                                    try {
                                        byte[] bytes2 = c76513gi.A0Q.getBytes("UTF-8");
                                        int length2 = bytes2.length;
                                        ByteBuffer allocate8 = ByteBuffer.allocate(length2 + 5);
                                        allocate8.put(C40841sx.A0n(length2 + 3));
                                        allocate8.put(C40841sx.A0m(length2));
                                        allocate8.put(bytes2);
                                        c68993Ms.A01(new C68983Mr((short) 0, allocate8.array()));
                                        if (c76513gi.A0c && (bArr = c76513gi.A0k) != null) {
                                            ByteBuffer allocate9 = ByteBuffer.allocate(bArr.length + 2);
                                            allocate9.put(C40841sx.A0n(bArr.length));
                                            allocate9.put(bArr);
                                            c68993Ms.A01(new C68983Mr((short) 44, allocate9.array()));
                                        }
                                        C03Q c03q = c76513gi.A0H;
                                        if (c03q != null) {
                                            if (c76513gi.A0c && (s = c76513gi.A0W) != 29) {
                                                StringBuilder A0P = C000200d.A0P("Must use key group sent by HelloRetryRequest: ");
                                                A0P.append((int) s);
                                                A0P.append(" client key group:");
                                                A0P.append(" ");
                                                A0P.append(29);
                                                throw new C27871Pc((byte) 80, new SSLException(A0P.toString()));
                                            } else if (c03q != null) {
                                                ByteBuffer allocate10 = ByteBuffer.allocate(38);
                                                if (c76513gi.A0H != null) {
                                                    allocate10.put(C40841sx.A0n(36));
                                                    allocate10.putShort((short) 29);
                                                    if (c76513gi.A0H != null) {
                                                        allocate10.put(C40841sx.A0n(32));
                                                        allocate10.put(c76513gi.A0i);
                                                        c68993Ms.A01(new C68983Mr((short) 51, allocate10.array()));
                                                        ByteBuffer allocate11 = ByteBuffer.allocate(c68993Ms.A01);
                                                        Iterator it = c68993Ms.A02.iterator();
                                                        while (it.hasNext()) {
                                                            C68983Mr c68983Mr = (C68983Mr) it.next();
                                                            ByteBuffer allocate12 = ByteBuffer.allocate(c68983Mr.A01.length + 4);
                                                            allocate12.putShort(c68983Mr.A00);
                                                            allocate12.put(C40841sx.A0n(c68983Mr.A01.length));
                                                            allocate12.put(c68983Mr.A01);
                                                            allocate11.put(allocate12.array());
                                                        }
                                                        byte[] array = allocate11.array();
                                                        WtCachedPsk wtCachedPsk = c76513gi.A0C.A03;
                                                        if (wtCachedPsk == null) {
                                                            allocate = ByteBuffer.allocate(0);
                                                        } else {
                                                            allocate = ByteBuffer.allocate(wtCachedPsk.ticket.length + 6 + 6 + c76513gi.A02 + 1 + 2);
                                                            byte[] bArr3 = c76513gi.A0C.A03.ticket;
                                                            allocate.putShort((short) 41);
                                                            allocate.put(C40841sx.A0n(allocate.capacity() - 4));
                                                            int length3 = bArr3.length;
                                                            allocate.put(C40841sx.A0n(length3 + 6));
                                                            allocate.put(C40841sx.A0n(length3));
                                                            allocate.put(bArr3);
                                                            WtCachedPsk wtCachedPsk2 = c76513gi.A0C.A03;
                                                            long currentTimeMillis = (wtCachedPsk2.useTestTime ? 3600000L : System.currentTimeMillis()) - wtCachedPsk2.ticketIssuedTime;
                                                            if (currentTimeMillis < 0) {
                                                                currentTimeMillis = 0;
                                                            }
                                                            long j = (currentTimeMillis + wtCachedPsk2.ticketAgeAdd) % 4294967296L;
                                                            if (j < 0) {
                                                                j += 4294967296L;
                                                            }
                                                            if (j >= 0 && j < 4294967296L) {
                                                                allocate.put(new byte[]{(byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)});
                                                            } else {
                                                                StringBuilder sb = new StringBuilder("Invalid argument. The supplied long value = ");
                                                                sb.append(j);
                                                                sb.append(" does not  fit in 4 bytes.");
                                                                throw new C27871Pc((byte) 80, new SSLException(sb.toString()));
                                                            }
                                                        }
                                                        int length4 = array.length + allocate.capacity();
                                                        ByteBuffer allocate13 = ByteBuffer.allocate(c76513gi.A0l.length + 35 + 2 + 2 + 1 + 1 + 2 + length4);
                                                        allocate13.putShort((short) 771);
                                                        allocate13.put(c76513gi.A0j);
                                                        allocate13.put((byte) c76513gi.A0l.length);
                                                        allocate13.put(c76513gi.A0l);
                                                        allocate13.putShort((short) 2);
                                                        if (c76513gi.A0F != null) {
                                                            allocate13.putShort((short) 4865);
                                                            allocate13.put((byte) 1);
                                                            allocate13.put((byte) 0);
                                                            allocate13.put(C40841sx.A0n(length4));
                                                            allocate13.put(array);
                                                            if (c76513gi.A0C.A03 != null) {
                                                                C3N0 c3n0 = c76513gi.A0D;
                                                                if (c3n0 != null) {
                                                                    try {
                                                                        MessageDigest messageDigest = (MessageDigest) c3n0.A00.clone();
                                                                        byte[] copyOfRange = Arrays.copyOfRange(allocate13.array(), 0, allocate13.position());
                                                                        byte[] copyOfRange2 = Arrays.copyOfRange(allocate.array(), 0, allocate.position());
                                                                        messageDigest.update((byte) 1);
                                                                        messageDigest.update(C40841sx.A0m(allocate13.capacity()));
                                                                        messageDigest.update(copyOfRange);
                                                                        messageDigest.update(copyOfRange2);
                                                                        byte[] digest = messageDigest.digest();
                                                                        int i = c76513gi.A02 + 1;
                                                                        ByteBuffer allocate14 = ByteBuffer.allocate(i + 2);
                                                                        allocate14.put(C40841sx.A0n(i));
                                                                        try {
                                                                            byte[] A0s = C40841sx.A0s(c76513gi.A09.A01(c76513gi.A09.A01(c76513gi.A09.A00(new byte[c76513gi.A02], c76513gi.A0C.A03.pskVal), C40841sx.A0q("res binder", MessageDigest.getInstance(c76513gi.A0P).digest(), c76513gi.A02), c76513gi.A02), C40841sx.A0q("finished", new byte[0], c76513gi.A02), c76513gi.A02), digest, c76513gi.A0P);
                                                                            allocate14.put((byte) A0s.length);
                                                                            allocate14.put(A0s);
                                                                            allocate.put(allocate14.array());
                                                                            allocate13.put(allocate.array());
                                                                        } catch (NoSuchAlgorithmException e) {
                                                                            throw new C27871Pc((byte) 80, new SSLException(e));
                                                                        }
                                                                    } catch (CloneNotSupportedException e2) {
                                                                        throw new C27871Pc((byte) 80, new SSLException(e2));
                                                                    }
                                                                } else {
                                                                    throw null;
                                                                }
                                                            }
                                                            return allocate13.array();
                                                        }
                                                        throw null;
                                                    }
                                                    throw null;
                                                }
                                                throw null;
                                            } else {
                                                throw null;
                                            }
                                        }
                                        throw null;
                                    } catch (UnsupportedEncodingException e3) {
                                        throw new C27871Pc((byte) 80, new SSLException(e3));
                                    }
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    } catch (UnsupportedEncodingException e4) {
                        throw new C27871Pc((byte) 80, new SSLException(e4));
                    }
                }
                throw new C27871Pc((byte) 80, new SSLException("Legacy session id is not correctly initialized."));
            }
            throw new C27871Pc((byte) 80, new SSLException("Client random is not correctly initialized."));
        }
        throw new C27871Pc((byte) 80, new SSLException("Illegal argument. Context cannot be null."));
    }

    public final String A02() {
        StringBuilder A0P = C000200d.A0P("host=");
        C76513gi c76513gi = this.A05;
        A0P.append(c76513gi.A0Q);
        A0P.append(" hrr=");
        A0P.append(c76513gi.A0c);
        A0P.append(" r=");
        A0P.append(c76513gi.A0g);
        A0P.append(" ed=");
        A0P.append(c76513gi.A0Z);
        A0P.append(" eda=");
        A0P.append(c76513gi.A0f);
        A0P.append(" s=");
        A0P.append(this.A09.A00.A00.A03);
        return A0P.toString();
    }

    public void A03() {
        C68853Me A01;
        while (!this.A09.A00.A00.equals(C69053My.A08)) {
            AbstractC69023Mv abstractC69023Mv = this.A05.A0A;
            synchronized (abstractC69023Mv) {
                A01 = abstractC69023Mv.A01();
            }
            if (!(A01 instanceof C76653gw)) {
                if (!(A01 instanceof C76523gj)) {
                    this.A09.A00(A01);
                    if (A01 instanceof C76633gu) {
                        byte[] A0l = C40841sx.A0l((byte) 1, A01(this.A05));
                        this.A05.A0B.A01((byte) 22, A0l, 0, A0l.length);
                        this.A05.A0D.A00(A0l);
                    }
                } else {
                    A07(A01);
                    throw null;
                }
            }
        }
        if (!this.A05.A0b) {
            A06((byte) 2, (byte) 116, false, new SSLException("Server must either choose a PSK or send certificates."));
        }
        if (this.A05.A0f) {
            byte[] A0l2 = C40841sx.A0l((byte) 5, new byte[0]);
            this.A05.A0B.A01((byte) 22, A0l2, 0, A0l2.length);
            this.A05.A0D.A00(A0l2);
        }
        C76513gi c76513gi = this.A05;
        if (c76513gi.A0d && !c76513gi.A0e) {
            c76513gi.A0B.A01((byte) 20, new byte[]{1}, 0, 1);
        }
        InterfaceC27881Pd A00 = C03M.A00();
        A00.AEk((byte[]) this.A05.A0U.get("client_hs_key"), (byte[]) this.A05.A0U.get("client_hs_iv"));
        C76513gi c76513gi2 = this.A05;
        c76513gi2.A0B = new C76503gh(c76513gi2.A0N, A00);
        if (c76513gi2.A0X) {
            byte[] A0l3 = C40841sx.A0l((byte) 11, new byte[4]);
            this.A05.A0B.A01((byte) 22, A0l3, 0, A0l3.length);
            this.A05.A0D.A00(A0l3);
        }
        C76513gi c76513gi3 = this.A05;
        if (c76513gi3 != null) {
            byte[] A0l4 = C40841sx.A0l((byte) 20, C40841sx.A0s((byte[]) c76513gi3.A0U.get("client_finished"), c76513gi3.A0D.A01(), c76513gi3.A0P));
            this.A05.A0B.A01((byte) 22, A0l4, 0, A0l4.length);
            this.A09.A00(new C68853Me(A0l4) { // from class: X.3gn
            });
            long currentTimeMillis = System.currentTimeMillis();
            this.A01 = currentTimeMillis;
            this.A0E = true;
            EnumC68813Ma enumC68813Ma = EnumC68813Ma.INFO;
            StringBuilder A0P = C000200d.A0P("Handshake complete : session_resumed ");
            C76513gi c76513gi4 = this.A05;
            A0P.append(c76513gi4.A0g);
            A0P.append(" ");
            A0P.append("early_data_sent ");
            A0P.append(c76513gi4.A0Z);
            A0P.append(" ");
            A0P.append("early_data_accepted ");
            A0P.append(c76513gi4.A0f);
            A0P.append(" ");
            A0P.append("client_cert_requested ");
            A0P.append(c76513gi4.A0X);
            A0P.append(" ");
            A0P.append("time_ms ");
            A0P.append(currentTimeMillis - this.A02);
            C3MZ.A00(enumC68813Ma, A0P.toString());
            HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, this.A08);
            for (HandshakeCompletedListener handshakeCompletedListener : this.A0D) {
                handshakeCompletedListener.handshakeCompleted(handshakeCompletedEvent);
            }
            return;
        }
        throw new C27871Pc((byte) 80, new SSLException("Illegal argument. Context cannot be null."));
    }

    public void A04() {
        if (this.A06 != null) {
            C3MZ.A00 = new AbstractC68823Mb() { // from class: X.3vD
            };
            if (!(this instanceof C85623vv)) {
                this.A0A = super.getInputStream();
                this.A0B = super.getOutputStream();
            } else {
                C85623vv c85623vv = (C85623vv) this;
                Socket socket = c85623vv.A00;
                c85623vv.A0A = socket.getInputStream();
                c85623vv.A0B = socket.getOutputStream();
            }
            this.A03 = new C3MT(this);
            this.A04 = new C3MU(this);
            C76513gi c76513gi = new C76513gi();
            this.A05 = c76513gi;
            try {
                this.A09 = new C69043Mx(c76513gi);
                return;
            } catch (C27871Pc e) {
                throw new IOException(e);
            }
        }
        throw null;
    }

    public final synchronized void A05() {
        this.A0G = true;
        C76513gi c76513gi = this.A05;
        c76513gi.A0R = null;
        c76513gi.A0S = null;
        if (this.A0F) {
            this.A03.A00.close();
            this.A04.A00 = true;
        }
        if (this instanceof C85623vv) {
            C85623vv c85623vv = (C85623vv) this;
            if (c85623vv.A01) {
                c85623vv.A00.close();
                c85623vv.A0A.close();
                c85623vv.A0B.close();
            }
        } else {
            super.close();
            this.A0A.close();
            this.A0B.close();
        }
    }

    public final synchronized void A06(byte b, byte b2, boolean z, SSLException sSLException) {
        if (z) {
            Throwable cause = sSLException.getCause();
            IOException iOException = sSLException;
            if (cause != null) {
                iOException = sSLException.getCause();
            }
            throw iOException;
        }
        if (!this.A0G) {
            EnumC68813Ma enumC68813Ma = EnumC68813Ma.DEBUG;
            StringBuilder sb = new StringBuilder();
            sb.append("Sending Alert : type : ");
            sb.append(b == 2 ? "FATAL" : "WARNING");
            sb.append(" description : ");
            sb.append(A00(b2));
            sb.append("(");
            sb.append((int) b2);
            sb.append(")");
            sb.append(" exception : ");
            sb.append(sSLException == null ? "" : sSLException.toString());
            String obj = sb.toString();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            AbstractC68823Mb abstractC68823Mb = C3MZ.A00;
            String obj2 = stackTrace[2].toString();
            if (!(abstractC68823Mb instanceof C85323vD)) {
                PrintStream printStream = System.err;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(enumC68813Ma);
                sb2.append(": ");
                sb2.append(obj2);
                sb2.append(" : ");
                sb2.append(obj);
                printStream.println(sb2.toString());
                if (sSLException != null) {
                    sSLException.printStackTrace(printStream);
                }
            } else {
                int ordinal = enumC68813Ma.ordinal();
                if (ordinal == 2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj2);
                    sb3.append(" :");
                    sb3.append(obj);
                    Log.i(sb3.toString(), sSLException);
                } else if (ordinal == 3) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj2);
                    sb4.append(" :");
                    sb4.append(obj);
                    Log.w(sb4.toString(), sSLException);
                } else if (ordinal == 4) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(obj2);
                    sb5.append(" :");
                    sb5.append(obj);
                    Log.e(sb5.toString(), sSLException);
                } else if (ordinal == 5) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(" :");
                    sb6.append(obj);
                    Log.a(sb6.toString());
                }
            }
            try {
                this.A05.A0B.A01((byte) 21, new byte[]{b, b2}, 0, 2);
            } catch (Exception e) {
                EnumC68813Ma enumC68813Ma2 = EnumC68813Ma.ERROR;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Encountered exception. Nothing much can be done here. ");
                sb7.append(e);
                C3MZ.A00(enumC68813Ma2, sb7.toString());
            }
            A05();
        }
        if (b == 2) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("WATLS Exception\n");
            sb8.append(A02());
            String obj3 = sb8.toString();
            Throwable th = sSLException;
            if (sSLException != null) {
                Throwable cause2 = sSLException.getCause();
                th = sSLException;
                if (cause2 != null) {
                    th = sSLException.getCause();
                }
            }
            throw new IOException(obj3, th);
        }
    }

    public final void A07(C68853Me c68853Me) {
        byte[] bArr = (byte[]) c68853Me.A00;
        EnumC68813Ma enumC68813Ma = EnumC68813Ma.DEBUG;
        StringBuilder A0P = C000200d.A0P("Received Alert: Level ");
        A0P.append((int) bArr[0]);
        A0P.append(" Description ");
        byte b = bArr[1];
        A0P.append(A00(b));
        A0P.append("(");
        A0P.append((int) b);
        A0P.append(")");
        C3MZ.A00(enumC68813Ma, A0P.toString());
        A05();
        byte b2 = bArr[1];
        if (b2 != 0 && b2 != 50) {
            StringBuilder A0P2 = C000200d.A0P("WATLS Exception\n");
            A0P2.append(A02());
            String obj = A0P2.toString();
            StringBuilder A0P3 = C000200d.A0P("Received alert ");
            A0P3.append((int) b2);
            throw new IOException(obj, new SSLException(A0P3.toString()));
        }
        StringBuilder A0P4 = C000200d.A0P("Received alert ");
        A0P4.append((int) b2);
        throw new IOException(new SSLException(A0P4.toString()));
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0D.add(handshakeCompletedListener);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.A0G) {
            return;
        }
        if (this.A0F) {
            A06((byte) 1, (byte) 0, false, null);
        } else {
            A05();
        }
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        throw new AssertionError("Channels are not supported by WtSocket.");
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledCipherSuites() {
        String[] strArr = new String[2];
        if (((C85333vE) this.A06).A01 != null) {
            strArr[0] = "TLS_AES_128_GCM_SHA256";
            strArr[1] = "use default";
            return strArr;
        }
        throw null;
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getHandshakeSession() {
        return this.A07;
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        C3MT c3mt = this.A03;
        if (c3mt != null) {
            return c3mt;
        }
        throw new IOException("Input stream is closed.");
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getNeedClientAuth() {
        return getNeedClientAuth();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        C3MU c3mu = this.A04;
        if (c3mu != null) {
            return c3mu;
        }
        throw new IOException("Output stream is closed.");
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLParameters getSSLParameters() {
        return this.A06;
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        return this.A08;
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedCipherSuites() {
        String[] strArr = new String[2];
        if (((C85333vE) this.A06).A01 != null) {
            strArr[0] = "TLS_AES_128_GCM_SHA256";
            strArr[1] = "use default";
            return strArr;
        }
        throw null;
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getWantClientAuth() {
        return getWantClientAuth();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.A0G;
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0D.remove(handshakeCompletedListener);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledCipherSuites(String[] strArr) {
        setCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledProtocols(String[] strArr) {
        setProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setNeedClientAuth(boolean z) {
        setNeedClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setSSLParameters(SSLParameters sSLParameters) {
        if (sSLParameters instanceof AbstractC69013Mu) {
            this.A06 = (AbstractC69013Mu) sSLParameters;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public void setWantClientAuth(boolean z) {
        setWantClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() {
        try {
            C3MZ.A00(EnumC68813Ma.INFO, "Start handshake.");
            if (this.A0F) {
                return;
            }
            this.A02 = System.currentTimeMillis();
            this.A0F = true;
            AbstractC69013Mu abstractC69013Mu = this.A06;
            this.A05.A08 = new C76273gK();
            C76513gi c76513gi = this.A05;
            C85333vE c85333vE = (C85333vE) abstractC69013Mu;
            C03O c03o = c85333vE.A01;
            c76513gi.A0F = c03o;
            if (c03o != null) {
                c76513gi.A0P = "SHA-256";
                c76513gi.A02 = 32;
                c76513gi.A09 = new C3MY();
                c76513gi.A0G = new C38121na(c85333vE.A04.A00);
                C76513gi c76513gi2 = this.A05;
                c76513gi2.A0H = c76513gi2.A0G.A02;
                c76513gi2.A0I = c85333vE.A03;
                C38131nb c38131nb = new C38131nb(c85333vE.A02.A00);
                c76513gi2.A0J = c38131nb;
                c38131nb.A00 = c85333vE.A08;
                c76513gi2.A0O = "http/1.1";
                c76513gi2.A0E = c85333vE.A00;
                c76513gi2.A0A = new AbstractC69023Mv(this.A0A, c76513gi2.A08) { // from class: X.3h3
                };
                C76513gi c76513gi3 = this.A05;
                c76513gi3.A0B = new C76733h4(this.A0B);
                if (c85333vE.A05 != null) {
                    c76513gi3.A0K = new C1R2();
                    C76513gi c76513gi4 = this.A05;
                    c76513gi4.A00 = (byte) 1;
                    C03R c03r = c85333vE.A07;
                    if (c03r != null) {
                        String A00 = c03r.A00(this.A0C);
                        if (A00 == null || A00.length() == 0) {
                            try {
                                A00 = c03r.A00(Inet6Address.getByName(this.A0C).getHostAddress());
                            } catch (UnknownHostException unused) {
                                EnumC68813Ma enumC68813Ma = EnumC68813Ma.ERROR;
                                StringBuilder A0P = C000200d.A0P("Failed to normalize the IP address ");
                                A0P.append(this.A0C);
                                C3MZ.A00(enumC68813Ma, A0P.toString());
                            }
                            if (A00 != null) {
                            }
                            c76513gi4 = this.A05;
                            c76513gi4.A0Q = this.A0C;
                        }
                        if (A00.length() > 0) {
                            c76513gi4 = this.A05;
                            c76513gi4.A0Q = A00;
                        }
                        c76513gi4 = this.A05;
                        c76513gi4.A0Q = this.A0C;
                    } else {
                        c76513gi4.A0Q = this.A0C;
                    }
                    c76513gi4.A0U = new HashMap();
                    c76513gi4.A0M = this.A0A;
                    c76513gi4.A0N = this.A0B;
                    c76513gi4.A07 = this.A03.A00;
                    c76513gi4.A0L = c85333vE.A06;
                    c76513gi4.A0b = false;
                    c76513gi4.A0d = true;
                    byte[] bArr = new byte[32];
                    c76513gi4.A0l = bArr;
                    c76513gi4.A0K.A00.nextBytes(bArr);
                    C76513gi c76513gi5 = this.A05;
                    C03I c03i = c76513gi5.A0L;
                    String str = c76513gi5.A0Q;
                    int i = this.A00;
                    if (c76513gi5.A0F != null) {
                        C27891Pf c27891Pf = (C27891Pf) c03i.getSession(C40841sx.A0p(str, i, "TLS_AES_128_GCM_SHA256"));
                        if (c27891Pf != null) {
                            this.A07 = c27891Pf;
                        } else {
                            C76513gi c76513gi6 = this.A05;
                            C03I c03i2 = c76513gi6.A0L;
                            String str2 = c76513gi6.A0Q;
                            int i2 = this.A00;
                            if (c76513gi6.A0F != null) {
                                c27891Pf = new C27891Pf(c03i2, str2, i2, "TLS_AES_128_GCM_SHA256");
                                this.A07 = c27891Pf;
                            } else {
                                throw null;
                            }
                        }
                        C76513gi c76513gi7 = this.A05;
                        c76513gi7.A0C = c27891Pf;
                        this.A08 = c27891Pf;
                        byte[] bArr2 = new byte[32];
                        c76513gi7.A0j = bArr2;
                        c76513gi7.A0K.A00.nextBytes(bArr2);
                        C38121na c38121na = this.A05.A0G;
                        c38121na.A01 = c38121na.A00.A02();
                        C76513gi c76513gi8 = this.A05;
                        C38121na c38121na2 = c76513gi8.A0G;
                        if (c38121na2.A01 == null) {
                            c38121na2.A01 = c38121na2.A00.A02();
                        }
                        c76513gi8.A0i = c38121na2.A01.A01;
                        C76513gi c76513gi9 = this.A05;
                        C38121na c38121na3 = c76513gi9.A0G;
                        if (c38121na3.A01 == null) {
                            c38121na3.A01 = c38121na3.A00.A02();
                        }
                        c76513gi9.A0h = c38121na3.A01.A00;
                        C76513gi c76513gi10 = this.A05;
                        c76513gi10.A0D = new C3N0(c76513gi10.A0P);
                        C76513gi c76513gi11 = this.A05;
                        c76513gi11.A0e = false;
                        c76513gi11.A0Z = false;
                        c76513gi11.A0a = c85333vE.A09;
                        c76513gi11.A0R = new ArrayList();
                        c76513gi11.A0S = new ArrayList();
                        c76513gi11.A06 = 1073741824L;
                        byte[] A0l = C40841sx.A0l((byte) 1, A01(c76513gi11));
                        this.A05.A0B.A01((byte) 22, A0l, 0, A0l.length);
                        C76513gi c76513gi12 = this.A05;
                        C76513gi c76513gi13 = c76513gi12;
                        if (c76513gi12.A0a && c76513gi12.A0C.A03 != null) {
                            if (c76513gi12.A0d) {
                                c76513gi12.A0B.A01((byte) 20, new byte[]{1}, 0, 1);
                                c76513gi13 = this.A05;
                                c76513gi13.A0e = true;
                            }
                            c76513gi13.A0Y = true;
                            this.A09.A00(new C68853Me(A0l) { // from class: X.3gp
                            });
                            return;
                        }
                        this.A09.A00(new C76573go(A0l));
                        A03();
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        } catch (C27871Pc e) {
            A06((byte) 2, e.description, e.errorTransient, e.ex);
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            e = e3;
            String message = e.getMessage();
            if (e.getCause() != null) {
                e = e.getCause();
            }
            A06((byte) 2, (byte) 80, false, new SSLException(message, e));
        }
    }
}
