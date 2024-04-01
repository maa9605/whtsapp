package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0wa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19980wa {
    public final NativeHolder A00;

    public C19980wa(byte[] bArr, long j) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOIO(10, j, bArr);
            return;
        }
        throw null;
    }
}
