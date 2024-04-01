package X;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.google.android.search.verification.client.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* renamed from: X.3VN  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VN {
    public static final byte[] A00 = Base64.decode("PkTwKSZqUfAUyR0rPQ8hYJ0wNsQQ3dW1+3SCnyTXIfEAxxS75FwkDf47wNv/c8pP3p0GXKR6OOQmhyERwx74fw1RYSU10I4r1gyBVDbRJ40pidjM41G1I1oN", 0);

    public static String A00(Context context, String str) {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String packageName = context.getPackageName();
        if (packageName != null && "com.whatsapp".equals(packageName)) {
            try {
                byteArrayOutputStream.write(packageName.getBytes("UTF-8"));
                InputStream resourceAsStream = C3VN.class.getResourceAsStream("/res/drawable-hdpi/about_logo.png");
                if (resourceAsStream == null) {
                    resourceAsStream = C3VN.class.getResourceAsStream("/res/drawable-hdpi-v4/about_logo.png");
                }
                if (resourceAsStream == null) {
                    resourceAsStream = C3VN.class.getResourceAsStream("/res/drawable-xxhdpi-v4/about_logo.png");
                }
                if (resourceAsStream == null) {
                    Resources resources = context.getResources();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    displayMetrics.setToDefaults();
                    displayMetrics.density = 1.5f;
                    displayMetrics.densityDpi = 240;
                    displayMetrics.scaledDensity = 1.5f;
                    float f = 240;
                    displayMetrics.xdpi = f;
                    displayMetrics.ydpi = f;
                    resourceAsStream = new Resources(resources.getAssets(), displayMetrics, resources.getConfiguration()).openRawResource(R.drawable.about_logo);
                }
                if (resourceAsStream != null) {
                    byte[] bArr = new byte[8192];
                    try {
                        try {
                            int read = resourceAsStream.read(bArr);
                            while (true) {
                                if (read != -1) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    read = resourceAsStream.read(bArr);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            SecretKey A05 = C02A.A05(byteArrayOutputStream.toByteArray(), A00, 128, 512);
                            A05.getEncoded();
                            try {
                                Mac mac = Mac.getInstance("HMACSHA1");
                                try {
                                    mac.init(A05);
                                    Signature[] A1j = AnonymousClass029.A1j(context);
                                    if (A1j != null && (r1 = A1j.length) != 0) {
                                        for (Signature signature : A1j) {
                                            mac.update(signature.toByteArray());
                                        }
                                        mac.update(C02A.A0D(context));
                                        try {
                                            mac.update(str.getBytes("UTF-8"));
                                            return Base64.encodeToString(mac.doFinal(), 2);
                                        } catch (UnsupportedEncodingException e) {
                                            throw new AssertionError(e);
                                        }
                                    }
                                    throw new AssertionError();
                                } catch (InvalidKeyException e2) {
                                    throw new AssertionError(e2);
                                }
                            } catch (NoSuchAlgorithmException e3) {
                                throw new AssertionError(e3);
                            }
                        } catch (IOException unused2) {
                            throw new AssertionError();
                        }
                    } finally {
                        try {
                            resourceAsStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
                throw new AssertionError();
            } catch (IOException e4) {
                throw new Error(e4);
            }
        }
        throw new AssertionError();
    }
}
