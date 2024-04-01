package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: X.202 */
/* loaded from: classes2.dex */
public class AnonymousClass202 {
    public static volatile AnonymousClass202 A01;
    public final C01B A00;

    public AnonymousClass202(C01B c01b) {
        this.A00 = c01b;
    }

    public static AnonymousClass202 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass202.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass202(C01B.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:673:0x0374, code lost:
        if (r3 != (-1)) goto L297;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AbstractC44611zM A01(boolean r33, java.lang.String r34, X.AnonymousClass206 r35) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass202.A01(boolean, java.lang.String, X.206):X.1zM");
    }

    public final AbstractC44611zM A02(boolean z, String str, C44651zQ c44651zQ, String str2, byte[] bArr, int i, byte[] bArr2) {
        C44841zk c44841zk = C44841zk.A03;
        if (!Arrays.equals(c44841zk.A01, bArr2)) {
            c44841zk = C44841zk.A02;
            if (!Arrays.equals(c44841zk.A01, bArr2)) {
                StringBuilder A0P = C000200d.A0P("Incorrect operation bytes: ");
                A0P.append(new String(bArr2));
                throw new IllegalStateException(A0P.toString());
            }
        }
        try {
            return A01(z, str, new AnonymousClass206(str2, i, c44651zQ, c44841zk, bArr));
        } catch (C0JX | IllegalArgumentException | JSONException e) {
            Log.e("sync-mutation/from-key-value couldn't create sync action data", e);
            return null;
        }
    }

    public boolean A03(String str) {
        switch (str.hashCode()) {
            case -1751563479:
                return str.equals("setting_locale");
            case -1271410875:
                if (!str.equals("clearChat")) {
                    return false;
                }
                break;
            case -748101438:
                return str.equals("archive");
            case 3363353:
                return str.equals("mute");
            case 3540562:
                return str.equals("star");
            case 249675220:
                return str.equals("setting_pushName");
            case 685217037:
                return str.equals("markChatAsRead");
            case 951526432:
                return str.equals("contact");
            case 1262856228:
                return str.equals("sentinel");
            case 1728918981:
                return str.equals("deleteMessageForMe");
            case 1764081571:
                if (!str.equals("deleteChat")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return this.A00.A0E(C01C.A1N);
    }
}
