package X;

import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: X.3Wj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C71503Wj {
    public static boolean A00;

    public static void A00(SSLContext sSLContext, SSLSessionCache sSLSessionCache) {
        if (sSLContext.getClientSessionContext() == null) {
            Log.w("SSLSessionCacheHack/session context is null");
        } else if (!sSLContext.getClientSessionContext().getClass().getSimpleName().equals("ClientSessionContext")) {
            StringBuilder A0P = C000200d.A0P("SSLSessionCacheHack/session context does not match, class=");
            A0P.append(sSLContext.getClientSessionContext().getClass().getName());
            Log.w(A0P.toString());
        } else {
            try {
                Field declaredField = sSLSessionCache.getClass().getDeclaredField("mSessionCache");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(sSLSessionCache);
                sSLContext.getClientSessionContext().getClass().getMethod("setPersistentCache", Class.forName("com.android.org.conscrypt.SSLClientSessionCache")).invoke(sSLContext.getClientSessionContext(), obj);
            } catch (ClassNotFoundException e) {
                e.toString();
            } catch (Exception e2) {
                StringBuilder A0P2 = C000200d.A0P("SSLSessionCacheHack:");
                A0P2.append(e2.toString());
                Log.e(A0P2.toString());
            }
        }
    }

    public static void A01(SSLContext sSLContext, SSLSessionCache sSLSessionCache, String str, int i) {
        Field declaredField;
        Field declaredField2;
        if (A00 || sSLContext == null || sSLSessionCache == null) {
            return;
        }
        try {
            Field declaredField3 = sSLSessionCache.getClass().getDeclaredField("mSessionCache");
            declaredField3.setAccessible(true);
            Object obj = declaredField3.get(sSLSessionCache);
            Method method = obj.getClass().getMethod("getSessionData", String.class, Integer.TYPE);
            Integer valueOf = Integer.valueOf(i);
            byte[] bArr = (byte[]) method.invoke(obj, str, valueOf);
            if (bArr != null) {
                Method declaredMethod = sSLContext.getClientSessionContext().getClass().getSuperclass().getDeclaredMethod("toSession", byte[].class, String.class, Integer.TYPE);
                declaredMethod.setAccessible(true);
                SSLSession sSLSession = (SSLSession) declaredMethod.invoke(sSLContext.getClientSessionContext(), bArr, str, valueOf);
                if (sSLSession != null) {
                    A02(sSLSession);
                }
            }
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("SSLSessionCacheHack:");
            A0P.append(e.toString());
            Log.i(A0P.toString());
            A00 = true;
        }
        try {
            sSLSessionCache.getClass().getDeclaredField("mSessionCache").setAccessible(true);
            Method method2 = sSLContext.getClientSessionContext().getClass().getMethod("getSession", String.class, Integer.TYPE);
            SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
            Integer valueOf2 = Integer.valueOf(i);
            SSLSession sSLSession2 = (SSLSession) method2.invoke(clientSessionContext, str, valueOf2);
            sSLContext.getClientSessionContext().getSessionTimeout();
            if (sSLSession2 != null) {
                A02(sSLSession2);
            }
            try {
                declaredField = sSLContext.getClass().getDeclaredField("contextSpi");
            } catch (NoSuchFieldException unused) {
                declaredField = sSLContext.getClass().getDeclaredField("spiImpl");
            }
            if (declaredField == null) {
                A00 = true;
                return;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(sSLContext);
            if (obj2 == null) {
                return;
            }
            try {
                declaredField2 = obj2.getClass().getSuperclass().getDeclaredField("sslParameters");
            } catch (NoSuchFieldException unused2) {
                declaredField2 = obj2.getClass().getDeclaredField("sslParameters");
            }
            declaredField2.setAccessible(true);
            Object obj3 = declaredField2.get(obj2);
            try {
                Method declaredMethod2 = obj3.getClass().getDeclaredMethod("getCachedClientSession", sSLContext.getClientSessionContext().getClass(), String.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(obj3, sSLContext.getClientSessionContext(), str, valueOf2);
            } catch (NoSuchMethodException unused3) {
                A00 = true;
            }
        } catch (Exception e2) {
            StringBuilder A0P2 = C000200d.A0P("SSLSessionCacheHack:");
            A0P2.append(e2.toString());
            Log.w(A0P2.toString());
            A00 = true;
        }
    }

    public static void A02(SSLSession sSLSession) {
        long j;
        try {
            j = sSLSession.getPeerCertificates().length;
        } catch (SSLPeerUnverifiedException e) {
            Log.e(e);
            j = -1;
        }
        StringBuilder A0P = C000200d.A0P("age=");
        A0P.append((System.currentTimeMillis() - sSLSession.getCreationTime()) / 1000);
        A0P.append(", creation=");
        A0P.append(sSLSession.getCreationTime());
        A0P.append(", protocol=");
        A0P.append(sSLSession.getProtocol());
        A0P.append(", valid=");
        A0P.append(sSLSession.isValid());
        A0P.append(", peerCertificateCount=");
        A0P.append(j);
        A0P.toString();
    }
}
