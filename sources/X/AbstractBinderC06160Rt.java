package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0Rt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC06160Rt extends AbstractBinderC06120Rp {
    public static final WeakReference A01 = new WeakReference(null);
    public WeakReference A00;

    public AbstractBinderC06160Rt(byte[] bArr) {
        super(bArr);
        this.A00 = A01;
    }

    public abstract byte[] A03();

    @Override // X.AbstractBinderC06120Rp
    public final byte[] A02() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.A00.get();
            if (bArr == null) {
                bArr = A03();
                this.A00 = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
