package X;

import android.content.Context;
import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.0PF  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0PF extends SSLSocketFactory {
    public SSLSocketFactory A00;
    public final SSLSessionCache A01;
    public final C03L A02;
    public final SSLContext A03;
    public volatile String[] A04;

    public abstract SSLSocketFactory A02(SSLContext sSLContext, SSLSessionCache sSLSessionCache);

    public C0PF(Context context, C03L c03l) {
        this.A02 = c03l;
        SSLSessionCache sSLSessionCache = null;
        SSLContext A00 = A00(A00(A00(null, "TLS"), "SSLv3"), "SSL");
        if (A00 != null) {
            this.A03 = A00;
            A00.getClientSessionContext().setSessionTimeout(86400);
            A00.getClientSessionContext().setSessionCacheSize(24);
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.exists()) {
                try {
                    sSLSessionCache = new SSLSessionCache(new File(cacheDir, "SSLSessionCache"));
                } catch (IOException unused) {
                }
            }
            this.A01 = sSLSessionCache;
            return;
        }
        NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException("No known algorithm available to provide SSL sockets");
        Log.e(noSuchAlgorithmException);
        throw new RuntimeException(noSuchAlgorithmException);
    }

    public static SSLContext A00(SSLContext sSLContext, String str) {
        if (sSLContext == null) {
            try {
                sSLContext = SSLContext.getInstance(str);
                return sSLContext;
            } catch (NoSuchAlgorithmException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" algorithm not available for SSLContext: ");
                Log.w(sb.toString(), e);
            }
        }
        return sSLContext;
    }

    public final synchronized SSLSocketFactory A01() {
        SSLSocketFactory sSLSocketFactory;
        sSLSocketFactory = this.A00;
        if (sSLSocketFactory == null) {
            sSLSocketFactory = A02(this.A03, this.A01);
            this.A00 = sSLSocketFactory;
        }
        return sSLSocketFactory;
    }

    public void A03(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] strArr = this.A04;
            if (strArr == null) {
                String[] supportedProtocols = sSLSocket.getSupportedProtocols();
                ArrayList arrayList = new ArrayList();
                if (supportedProtocols != null) {
                    for (String str : supportedProtocols) {
                        if (str != null && str.startsWith("TLS")) {
                            arrayList.add(str);
                        }
                    }
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
                this.A04 = strArr;
            }
            if (strArr.length > 0) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        Socket createSocket = A01().createSocket();
        A03(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket createSocket = A01().createSocket(str, i);
        A03(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, str);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = A01().createSocket(str, i, inetAddress, i2);
        A03(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, str);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = A01().createSocket(inetAddress, i);
        A03(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, inetAddress.getHostName());
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = A01().createSocket(inetAddress, i, inetAddress2, i2);
        A03(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, inetAddress.getHostName());
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = A01().createSocket(socket, str, i, z);
        A03(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(createSocket, str);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return A01().getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return A01().getSupportedCipherSuites();
    }
}
