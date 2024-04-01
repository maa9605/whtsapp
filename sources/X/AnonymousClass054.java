package X;

import com.whatsapp.util.Log;

/* renamed from: X.054  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass054 {
    public abstract C09700eb A02(byte[] bArr);

    public void A03() {
    }

    public abstract byte[] A04(C09700eb c09700eb);

    public static void A01(String str, Exception exc) {
        StringBuilder sb = new StringBuilder("EncryptedKeyHelper/reportEncryptedKeyHelperProblem/");
        sb.append(str);
        Log.e(sb.toString(), exc);
    }
}
