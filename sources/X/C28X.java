package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.28X  reason: invalid class name */
/* loaded from: classes2.dex */
public class C28X {
    public final C04P[] A00;

    public C28X(C04P[] c04pArr) {
        this.A00 = c04pArr;
    }

    public String A00() {
        C04P[] c04pArr = this.A00;
        if (c04pArr.length <= 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            StringBuilder sb = new StringBuilder();
            for (C04P c04p : c04pArr) {
                sb.append(c04p.A02);
                sb.append(c04p.A03);
            }
            return Base64.encodeToString(messageDigest.digest(sb.toString().trim().getBytes()), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
