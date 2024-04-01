package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0wU */
/* loaded from: classes.dex */
public class C19920wU {
    public final NativeHolder A00;

    public C19920wU(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C19920wU(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, long j, String str, String str2) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOIIIOOOOO(i, j, 0L, str, str2, bArr, bArr2, bArr3);
            return;
        }
        throw null;
    }
}
