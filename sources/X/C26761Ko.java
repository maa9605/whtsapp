package X;

import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.whatsapp.util.Log;

/* renamed from: X.1Ko  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C26761Ko {
    public static final String[] A01 = {"image/gif", "video/x.looping_mp4", "image/jpeg", "image/jpg", "image/png", "image/webp.wasticker"};
    public InputContentInfoCompat A00;

    public C26751Kn A00(InputContentInfoCompat inputContentInfoCompat, int i) {
        String[] strArr;
        try {
            try {
                InputContentInfoCompat inputContentInfoCompat2 = this.A00;
                if (inputContentInfoCompat2 != null) {
                    inputContentInfoCompat2.releasePermission();
                }
            } catch (Exception e) {
                Log.e("conversation/InputContentInfoCompat#releasePermission() failed.", e);
            }
            this.A00 = null;
            for (String str : A01) {
                if (inputContentInfoCompat.mImpl.getDescription().hasMimeType(str)) {
                    if ((i & 1) != 0) {
                        try {
                            inputContentInfoCompat.requestPermission();
                        } catch (Exception e2) {
                            Log.e("conversation/InputContentInfoCompat#requestPermission() failed.", e2);
                            return null;
                        }
                    }
                    StringBuilder A0P = C000200d.A0P("conversation/onCommitContent: ");
                    A0P.append(inputContentInfoCompat.mImpl.getContentUri().toString());
                    Log.i(A0P.toString());
                    this.A00 = inputContentInfoCompat;
                    return new C26751Kn(inputContentInfoCompat.mImpl.getContentUri(), str);
                }
            }
            return null;
        } catch (Throwable th) {
            this.A00 = null;
            throw th;
        }
    }
}
