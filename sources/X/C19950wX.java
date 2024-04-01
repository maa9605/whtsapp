package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0wX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19950wX {
    public final NativeHolder A00;

    public C19950wX(int i, long j) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOII(i, j);
            return;
        }
        throw null;
    }

    public C19950wX(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}
