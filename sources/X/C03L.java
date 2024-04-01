package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

/* renamed from: X.03L  reason: invalid class name */
/* loaded from: classes.dex */
public final class C03L {
    public static C03L A04;
    public Class A00;
    public Method A01;
    public Method A02;
    public boolean A03;

    public C03L() {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
                this.A00 = cls;
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
                this.A00 = cls;
            }
            this.A02 = cls.getMethod("setUseSessionTickets", Boolean.TYPE);
            this.A01 = this.A00.getMethod("setHostname", String.class);
            this.A03 = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
    }

    public void A00(Socket socket, String str) {
        if (this.A03 && this.A00.isInstance(socket)) {
            try {
                this.A02.invoke(socket, Boolean.TRUE);
                this.A01.invoke(socket, str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
