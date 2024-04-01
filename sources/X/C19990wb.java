package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0wb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19990wb {
    public final NativeHolder A00;

    public C19990wb(byte[] bArr, byte[] bArr2) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOOO(0, bArr, bArr2);
            return;
        }
        throw null;
    }
}
