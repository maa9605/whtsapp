package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0we  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C20020we {
    public final NativeHolder A00;

    public C20020we(byte[] bArr, long j) {
        if (JniBridge.getInstance() != null) {
            this.A00 = (NativeHolder) JniBridge.jvidispatchOIO(9, j, bArr);
            return;
        }
        throw null;
    }
}
