package X;

import android.os.Build;
import com.whatsapp.util.OpusRecorder;
import java.io.File;

/* renamed from: X.3bh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C73473bh {
    public final OpusRecorder A00;
    public final File A01;

    public C73473bh(String str) {
        int i = 1;
        if (Build.MANUFACTURER.equals("Google") && Build.MODEL.equals("Pixel 2 XL")) {
            i = 5;
        }
        String A0H = C000200d.A0H(str, ".opus");
        this.A01 = new File(A0H);
        this.A00 = new OpusRecorder(A0H, i);
    }
}
