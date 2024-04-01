package X;

import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.2m1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55682m1 extends SSLSocket {
    public final int A00;
    public final C0EL A01;
    public final SSLSocket A02;

    public C55682m1(SSLSocket sSLSocket, int i, C0EL c0el) {
        this.A00 = i;
        this.A02 = sSLSocket;
        this.A01 = c0el;
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A02.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        this.A02.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.A02.close();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        this.A02.connect(socketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        this.A02.connect(socketAddress, i);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return this.A02.getChannel();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getEnableSessionCreation() {
        return this.A02.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledCipherSuites() {
        return this.A02.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledProtocols() {
        return this.A02.getEnabledProtocols();
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.A02.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        return new C43991yL(this.A02.getInputStream(), this.A01, this.A00);
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        return this.A02.getKeepAlive();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.A02.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.A02.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.A02.getLocalSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getNeedClientAuth() {
        return this.A02.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return this.A02.getOOBInline();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        return new C48142Dy(this.A02.getOutputStream(), this.A01, this.A00);
    }

    @Override // java.net.Socket
    public int getPort() {
        return this.A02.getPort();
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        return this.A02.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return this.A02.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        return this.A02.getReuseAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLParameters getSSLParameters() {
        return this.A02.getSSLParameters();
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        return this.A02.getSendBufferSize();
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        return this.A02.getSession();
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return this.A02.getSoLinger();
    }

    @Override // java.net.Socket
    public synchronized int getSoTimeout() {
        return this.A02.getSoTimeout();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedCipherSuites() {
        return this.A02.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedProtocols() {
        return this.A02.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return this.A02.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        return this.A02.getTrafficClass();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getUseClientMode() {
        return this.A02.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getWantClientAuth() {
        return this.A02.getWantClientAuth();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.A02.isBound();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.A02.isClosed();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.A02.isConnected();
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.A02.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.A02.isOutputShutdown();
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A02.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) {
        this.A02.sendUrgentData(i);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnableSessionCreation(boolean z) {
        this.A02.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledCipherSuites(String[] strArr) {
        this.A02.setEnabledCipherSuites(strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if ("SSLv3".equals(r14[0]) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // javax.net.ssl.SSLSocket
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setEnabledProtocols(java.lang.String[] r14) {
        /*
            r13 = this;
            javax.net.ssl.SSLSocket r3 = r13.A02
            int r10 = r14.length
            java.lang.String r12 = "gdrive/accounting-socket/set-enabled-protocols/current-list: "
            java.lang.String r7 = ", "
            r9 = 1
            if (r10 < r9) goto L17
            java.lang.String r11 = "SSLv3"
            r4 = 0
            if (r10 != r9) goto L26
            r0 = r14[r4]
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L40
        L17:
            java.lang.StringBuilder r1 = X.C000200d.A0P(r12)
            java.lang.String r0 = android.text.TextUtils.join(r7, r14)
            X.C000200d.A1N(r1, r0)
        L22:
            r3.setEnabledProtocols(r14)
            return
        L26:
            if (r10 == r9) goto L40
            r8 = r14
        L29:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r6 = r8.length
            r5 = 0
        L30:
            if (r5 >= r6) goto L45
            r1 = r8[r5]
            boolean r0 = r11.equals(r1)
            if (r0 != 0) goto L3d
            r2.add(r1)
        L3d:
            int r5 = r5 + 1
            goto L30
        L40:
            java.lang.String[] r8 = r13.getSupportedProtocols()
            goto L29
        L45:
            int r0 = r2.size()
            if (r10 != r0) goto L62
            if (r10 == r9) goto L62
            android.text.TextUtils.join(r7, r14)
            android.text.TextUtils.join(r7, r2)
        L53:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L22
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r14 = r2.toArray(r0)
            java.lang.String[] r14 = (java.lang.String[]) r14
            goto L22
        L62:
            java.lang.StringBuilder r1 = X.C000200d.A0P(r12)
            java.lang.String r0 = android.text.TextUtils.join(r7, r14)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            java.lang.String r0 = "gdrive/accounting-socket/set-enabled-protocols/modified-list: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = android.text.TextUtils.join(r7, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55682m1.setEnabledProtocols(java.lang.String[]):void");
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) {
        this.A02.setKeepAlive(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setNeedClientAuth(boolean z) {
        this.A02.setNeedClientAuth(z);
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) {
        this.A02.setOOBInline(z);
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
        this.A02.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
        this.A02.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) {
        this.A02.setReuseAddress(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setSSLParameters(SSLParameters sSLParameters) {
        this.A02.setSSLParameters(sSLParameters);
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) {
        this.A02.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) {
        this.A02.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i) {
        this.A02.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
        this.A02.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) {
        this.A02.setTrafficClass(i);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setUseClientMode(boolean z) {
        this.A02.setUseClientMode(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setWantClientAuth(boolean z) {
        this.A02.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public void shutdownInput() {
        this.A02.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
        this.A02.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() {
        try {
            this.A02.startHandshake();
        } catch (SSLHandshakeException | SSLProtocolException e) {
            StringBuilder A0P = C000200d.A0P("gdrive/accounting-socket-factory/enabled suites ");
            A0P.append(Arrays.toString(getEnabledCipherSuites()));
            A0P.append(" supported suites ");
            A0P.append(Arrays.toString(getSupportedCipherSuites()));
            Log.e(A0P.toString());
            throw e;
        }
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public String toString() {
        return this.A02.toString();
    }
}
