package X;

import android.graphics.Bitmap;

/* renamed from: X.1Cv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24781Cv extends AbstractC39061pV implements InterfaceC39071pW {
    @Override // X.AbstractC39061pV
    public int A00(int i) {
        return i;
    }

    public C24781Cv(InterfaceC18980ue interfaceC18980ue, C19770vy c19770vy, InterfaceC19780vz interfaceC19780vz) {
        super(interfaceC18980ue, c19770vy, interfaceC19780vz);
    }

    @Override // X.AbstractC39061pV
    public int A01(Object obj) {
        return ((Bitmap) obj).getAllocationByteCount();
    }

    @Override // X.AbstractC39061pV
    public Object A04(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // X.AbstractC39061pV
    public Object A05(C19640vl c19640vl) {
        Bitmap bitmap = (Bitmap) super.A05(c19640vl);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // X.AbstractC39061pV
    public void A07(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // X.AbstractC39061pV
    public boolean A09(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
