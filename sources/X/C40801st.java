package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1st  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40801st {
    public File A00;
    public File A01;
    public final String A02;

    public C40801st(String str) {
        this.A02 = str;
    }

    public File A00(Context context) {
        File file;
        File file2 = this.A01;
        if (file2 == null || !file2.exists() || (file = this.A00) == null || !file.exists()) {
            return null;
        }
        return AnonymousClass029.A1K(context) ? this.A00 : this.A01;
    }
}
