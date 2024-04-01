package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: X.05V  reason: invalid class name */
/* loaded from: classes.dex */
public class C05V {
    public static volatile C05V A04;
    public final C02L A00;
    public final AnonymousClass012 A01;
    public static final Random A03 = new Random();
    public static final SecureRandom A02 = new SecureRandom();

    public C05V(AnonymousClass012 anonymousClass012, C02L c02l) {
        this.A01 = anonymousClass012;
        this.A00 = c02l;
    }

    public static AnonymousClass094 A00(AnonymousClass012 anonymousClass012, C02L c02l, AbstractC005302j abstractC005302j, boolean z) {
        return new AnonymousClass094(abstractC005302j, z, A02(anonymousClass012, c02l, false));
    }

    public static C05V A01() {
        if (A04 == null) {
            synchronized (C05V.class) {
                if (A04 == null) {
                    A04 = new C05V(AnonymousClass012.A00(), C02L.A00());
                }
            }
        }
        return A04;
    }

    public static String A02(AnonymousClass012 anonymousClass012, C02L c02l, boolean z) {
        byte[] A032 = A03(anonymousClass012, c02l, z);
        if (A032 != null) {
            return C02A.A03(A032);
        }
        throw new IllegalStateException("message id could not be created");
    }

    public static byte[] A03(AnonymousClass012 anonymousClass012, C02L c02l, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            long A05 = anonymousClass012.A05();
            byte[] bArr = new byte[8];
            for (int i = 7; i >= 0; i--) {
                bArr[i] = (byte) A05;
                A05 >>= 8;
            }
            messageDigest.update(bArr);
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                messageDigest.update(userJid.getRawString().getBytes());
                byte[] bArr2 = new byte[16];
                if (z) {
                    A02.nextBytes(bArr2);
                } else {
                    A03.nextBytes(bArr2);
                }
                messageDigest.update(bArr2);
                return messageDigest.digest();
            }
            throw null;
        } catch (NoSuchAlgorithmException e) {
            Log.w("unable to provide message id hash due to missing md5 algorithm", e);
            return null;
        }
    }
}
