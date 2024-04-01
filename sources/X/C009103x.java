package X;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

/* renamed from: X.03x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C009103x extends AbstractC008203o {
    public int A00;
    public Context A01;
    public C008403q A02;

    public C009103x(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.A01 = context;
            applicationContext = context;
        }
        this.A00 = i;
        this.A02 = new C008403q(new File(applicationContext.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // X.AbstractC008203o
    public int A01(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.A02.A01(str, i, threadPolicy);
    }

    @Override // X.AbstractC008203o
    public void A02(int i) {
        this.A02.A02(i);
    }

    @Override // X.AbstractC008203o
    public String toString() {
        return this.A02.toString();
    }
}
