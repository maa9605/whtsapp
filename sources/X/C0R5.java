package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0R5  reason: invalid class name */
/* loaded from: classes.dex */
public class C0R5 {
    public final NativeHolder A00;

    public C0R5(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C0R5(String str, String str2, int i) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOIOO(0, i, str, str2);
            return;
        }
        throw null;
    }
}
