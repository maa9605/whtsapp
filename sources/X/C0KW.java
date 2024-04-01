package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0KW  reason: invalid class name */
/* loaded from: classes.dex */
public class C0KW {
    public final long A00;
    public final File A01;
    public final AtomicBoolean A02;
    public final AtomicInteger A03 = new AtomicInteger();

    public C0KW(File file, boolean z) {
        this.A01 = file;
        this.A02 = new AtomicBoolean(z);
        long length = file.length();
        this.A00 = length;
        if (length != 0 || file.exists()) {
            return;
        }
        StringBuilder sb = new StringBuilder("mediafilereference/file does not exist: ");
        sb.append(file);
        Log.e(sb.toString());
    }
}
