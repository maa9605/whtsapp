package X;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;

/* renamed from: X.01Z */
/* loaded from: classes.dex */
public final class C01Z extends Provider implements InterfaceC002101a {
    public static final String[] A02 = {"AES", "ARC4"};
    public static final String[] A00 = {"MD5", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3"};
    public static final String[] A01 = {"BC", "PKCS12"};

    public C01Z() {
        super("SC", 1.54d, "BouncyCastle Security Provider v1.54");
        AccessController.doPrivileged(new PrivilegedAction() { // from class: X.07H
            {
                C01Z.this = this;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                C01Z c01z = C01Z.this;
                c01z.A01("org.spongycastle.jcajce.provider.digest.", C01Z.A00);
                c01z.A01("org.spongycastle.jcajce.provider.symmetric.", C01Z.A02);
                c01z.A01("org.spongycastle.jcajce.provider.keystore.", C01Z.A01);
                return null;
            }
        });
    }

    public void A00(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException(C000200d.A0I("duplicate provider key (", str, ") found"));
    }

    public final void A01(String str, String[] strArr) {
        int i = 0;
        while (i != strArr.length) {
            Class<?> cls = null;
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                if (classLoader != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(strArr[i]);
                    sb.append("$Mappings");
                    cls = classLoader.loadClass(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(strArr[i]);
                    sb2.append("$Mappings");
                    cls = Class.forName(sb2.toString());
                }
            } catch (ClassNotFoundException unused) {
            }
            if (cls != null) {
                try {
                    ((C07I) cls.newInstance()).A00(this);
                    continue;
                } catch (Exception e) {
                    StringBuilder A0V = C000200d.A0V("cannot create instance of ", str);
                    A0V.append(strArr[i]);
                    A0V.append("$Mappings : ");
                    A0V.append(e);
                    throw new InternalError(A0V.toString());
                }
            }
            i++;
        }
    }
}
