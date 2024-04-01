package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.2SE */
/* loaded from: classes2.dex */
public class C2SE {
    public final C2S6 A00;
    public final Random A01;
    public final SSLSocketFactory A02;

    public C2SE(AnonymousClass035 anonymousClass035, C2S6 c2s6, Random random) {
        this.A02 = anonymousClass035.A02();
        this.A00 = c2s6;
        this.A01 = random;
    }

    public static C2S7 A00(SSLSocketFactory sSLSocketFactory, InetSocketAddress inetSocketAddress, int i, boolean z, String str) {
        Socket createSocket = SocketFactory.getDefault().createSocket();
        if (str != null) {
            StringBuilder A0V = C000200d.A0V(str, "/try_connect/");
            A0V.append(inetSocketAddress.getAddress());
            A0V.append(" (method? ");
            A0V.append(z);
            A0V.append(')');
            Log.i(A0V.toString());
        }
        createSocket.connect(inetSocketAddress, i);
        if (z) {
            createSocket = sSLSocketFactory.createSocket(createSocket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
            ((SSLSocket) createSocket).startHandshake();
        }
        return new C2S7(createSocket);
    }

    public C2S7 A01(C08120af c08120af) {
        Object obj;
        C2S7 c2s7;
        Socket socket;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        InetAddress[] inetAddressArr = c08120af.A04;
        int length = inetAddressArr.length;
        for (InetAddress inetAddress : inetAddressArr) {
            if (inetAddress.getAddress().length > 4) {
                arrayList2.add(inetAddress);
            } else {
                arrayList.add(inetAddress);
            }
        }
        if (Build.VERSION.SDK_INT < 20) {
            if (!arrayList.isEmpty()) {
                InetSocketAddress inetSocketAddress = new InetSocketAddress((InetAddress) arrayList.get(this.A01.nextInt(arrayList.size())), c08120af.A00);
                StringBuilder sb = new StringBuilder("ConnectionSocketFactory/ipV4Only/try_connect/");
                sb.append(inetSocketAddress);
                sb.append(" (method? ");
                boolean z = c08120af.A03;
                sb.append(z);
                sb.append(')');
                Log.i(sb.toString());
                return A00(this.A02, inetSocketAddress, 30000, z, null);
            }
            throw new IOException("Connection sequence can connect to IpV4 only, but no IpV4 available.");
        } else if (arrayList.size() > 0 && arrayList2.size() > 0) {
            Random random = this.A01;
            InetSocketAddress inetSocketAddress2 = new InetSocketAddress((InetAddress) arrayList.get(random.nextInt(arrayList.size())), c08120af.A00);
            InetSocketAddress inetSocketAddress3 = new InetSocketAddress((InetAddress) arrayList2.get(random.nextInt(arrayList2.size())), c08120af.A00);
            C2S6 c2s6 = this.A00;
            boolean z2 = c08120af.A03;
            if (c2s6 != null) {
                C2SD c2sd = new C2SD();
                synchronized (c2s6) {
                    c2s6.A01 = false;
                    if (c2s6.A00 == null) {
                        c2s6.A00 = c2s6.A02.A02();
                    }
                }
                ThreadPoolExecutor threadPoolExecutor = c2s6.A03;
                threadPoolExecutor.execute(new RunnableEBaseShape0S0311000_I0(c2s6, inetSocketAddress3, 30000, z2, c2sd, 1));
                try {
                    ReentrantLock reentrantLock = c2sd.A02;
                    reentrantLock.lockInterruptibly();
                    for (long nanos = TimeUnit.MILLISECONDS.toNanos(250L); nanos > 0 && c2sd.A00 == null; nanos = c2sd.A01.awaitNanos(nanos)) {
                    }
                    Object obj2 = c2sd.A00;
                    reentrantLock.unlock();
                    socket = (Socket) obj2;
                } catch (InterruptedException e) {
                    Log.e("HappyEyeball/try_connect exception short wait for ipv6", e);
                }
                if (socket != null) {
                    c2s7 = new C2S7(socket);
                    StringBuilder A0P = C000200d.A0P("ConnectionSocketFactory/try_connect/happyEyeball/");
                    A0P.append(c2s7.toString());
                    A0P.append(" (method? ");
                    A0P.append(z2);
                    A0P.append(");");
                    Log.i(A0P.toString());
                    return c2s7;
                }
                Log.i("happyEyeball/couldn't connect to ipv6 in 250 ms");
                threadPoolExecutor.execute(new RunnableEBaseShape0S0311000_I0(c2s6, inetSocketAddress2, 30000, z2, c2sd, 0));
                try {
                    ReentrantLock reentrantLock2 = c2sd.A02;
                    reentrantLock2.lockInterruptibly();
                    while (true) {
                        obj = c2sd.A00;
                        if (obj != null) {
                            break;
                        }
                        c2sd.A01.await();
                    }
                    reentrantLock2.unlock();
                    Socket socket2 = (Socket) obj;
                    if (socket2 != null && socket2.isConnected() && socket2 != C2S6.A04) {
                        c2s7 = new C2S7(socket2);
                        StringBuilder A0P2 = C000200d.A0P("ConnectionSocketFactory/try_connect/happyEyeball/");
                        A0P2.append(c2s7.toString());
                        A0P2.append(" (method? ");
                        A0P2.append(z2);
                        A0P2.append(");");
                        Log.i(A0P2.toString());
                        return c2s7;
                    }
                } catch (InterruptedException e2) {
                    Log.w("HappyEyeball", e2);
                }
                throw new IOException("HappyEyeball/couldn't connect to neither of ips");
            }
            throw null;
        } else {
            arrayList.size();
            arrayList2.size();
            if (inetAddressArr != null) {
                InetSocketAddress inetSocketAddress4 = new InetSocketAddress(inetAddressArr[this.A01.nextInt(length)], c08120af.A00);
                StringBuilder sb2 = new StringBuilder("ConnectionSocketFactory/try_connect/");
                sb2.append(inetSocketAddress4);
                sb2.append(" (method? ");
                boolean z3 = c08120af.A03;
                sb2.append(z3);
                sb2.append(')');
                Log.i(sb2.toString());
                return A00(this.A02, inetSocketAddress4, 30000, z3, null);
            }
            throw null;
        }
    }
}
