package X;

import android.graphics.BitmapFactory;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.nio.ByteBuffer;

/* renamed from: X.1YB */
/* loaded from: classes.dex */
public abstract class C1YB {
    public static final byte[] A03 = {-1, -39};
    public final C1TK A00;
    public final InterfaceC39071pW A01;
    public final PreverificationHelper A02;

    public abstract int A00(int i, int i2, BitmapFactory.Options options);

    public C1YB(InterfaceC39071pW interfaceC39071pW, int i, C1TK c1tk) {
        this.A02 = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.A01 = interfaceC39071pW;
        this.A00 = c1tk;
        for (int i2 = 0; i2 < i; i2++) {
            this.A00.A01(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x009a, code lost:
        if (r6 == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AbstractC19030uj A01(X.C19600vh r12, android.graphics.Bitmap.Config r13, int r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1YB.A01(X.0vh, android.graphics.Bitmap$Config, int):X.0uj");
    }
}
