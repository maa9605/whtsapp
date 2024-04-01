package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2Lt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49652Lt {
    public static volatile C49652Lt A02;
    public final C49662Lu A00;
    public final MessageDigest A01;

    public C49652Lt(C49662Lu c49662Lu) {
        this.A00 = c49662Lu;
        try {
            this.A01 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            StringBuilder sb = new StringBuilder("ABOfflineAssign assign will fail due to MD5 algorithm not found: ");
            sb.append(e);
            throw new RuntimeException(sb.toString());
        }
    }
}
