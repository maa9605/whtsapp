package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.02b  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C004502b {
    public final File A00;
    public final File A01;
    public final Object A02 = new Object();

    public C004502b(File file) {
        this.A01 = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.A00 = new File(sb.toString());
    }

    public final void A00() {
        File file = this.A01;
        if (!file.exists() || file.delete()) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("DefaultSharedPreferencesStorage/Couldn't clean up partially-written file ");
        A0P.append(file);
        Log.e(A0P.toString());
    }
}
