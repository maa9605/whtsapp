package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.3lf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79443lf extends C0HS {
    public String A00;
    public final Uri A01;
    public final C41961un A02;
    public final WeakReference A03;

    public C79443lf(C41961un c41961un, InterfaceC70823Tt interfaceC70823Tt, Uri uri) {
        this.A02 = c41961un;
        this.A03 = new WeakReference(interfaceC70823Tt);
        this.A01 = uri;
    }

    public static final C1D9 A00(C33191fV c33191fV, Bitmap bitmap) {
        final int[] iArr = new int[bitmap.getHeight() * bitmap.getWidth()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        C1D4 c1d4 = new C1D4(new C33181fU(new C1D7(width, height, iArr) { // from class: X.1fT
            public final int A00;
            public final int A01;
            public final byte[] A02;

            {
                super(width, height);
                this.A01 = width;
                this.A00 = height;
                byte[] bArr = new byte[width * height];
                this.A02 = bArr;
                for (int i = 0; i < height; i++) {
                    int i2 = i * width;
                    for (int i3 = 0; i3 < width; i3++) {
                        int i4 = i2 + i3;
                        int i5 = iArr[i4];
                        int i6 = (i5 >> 16) & 255;
                        int i7 = (i5 >> 8) & 255;
                        int i8 = i5 & 255;
                        if (i6 == i7 && i7 == i8) {
                            bArr[i4] = (byte) i6;
                        } else {
                            bArr[i4] = (byte) ((((i7 << 1) + i6) + i8) >> 2);
                        }
                    }
                }
            }

            @Override // X.C1D7
            public byte[] A00() {
                int i = super.A01;
                int i2 = super.A00;
                int i3 = this.A01;
                if (i == i3 && i2 == this.A00) {
                    return this.A02;
                }
                int i4 = i * i2;
                byte[] bArr = new byte[i4];
                int i5 = (0 * i3) + 0;
                if (i == i3) {
                    System.arraycopy(this.A02, i5, bArr, 0, i4);
                    return bArr;
                }
                byte[] bArr2 = this.A02;
                for (int i6 = 0; i6 < i2; i6++) {
                    System.arraycopy(bArr2, i5, bArr, i6 * i, i);
                    i5 += i3;
                }
                return bArr;
            }

            @Override // X.C1D7
            public byte[] A01(int i, byte[] bArr) {
                if (i >= 0 && i < super.A00) {
                    int i2 = super.A01;
                    if (bArr == null || bArr.length < i2) {
                        bArr = new byte[i2];
                    }
                    System.arraycopy(this.A02, ((i + 0) * this.A01) + 0, bArr, 0, i2);
                    return bArr;
                }
                throw new IllegalArgumentException(C000200d.A0D("Requested row is outside the image: ", i));
            }
        }));
        C1D9 c1d9 = null;
        try {
            c1d9 = c33191fV.A00(c1d4, null);
            return c1d9;
        } catch (C1D8 unused) {
            return c1d9;
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        try {
            Bitmap A0Z = this.A02.A0Z(this.A01, 2000, 2000);
            C33191fV c33191fV = new C33191fV();
            C1D9 A00 = A00(c33191fV, A0Z);
            while (A00 == null && A0Z.getWidth() / 1.2d >= 320.0d && A0Z.getHeight() / 1.2d >= 480.0d) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A0Z, (int) Math.floor(A0Z.getWidth() / 1.2d), (int) Math.floor(A0Z.getHeight() / 1.2d), true);
                A0Z.recycle();
                A00 = A00(c33191fV, createScaledBitmap);
                A0Z = createScaledBitmap;
            }
            A0Z.recycle();
            if (A00 == null) {
                return 1;
            }
            this.A00 = A00.A01;
            return 2;
        } catch (C42671w8 | IOException unused) {
            Log.e("contactQrActivity/checkImageForQrCode/ioexception");
            return 0;
        } catch (OutOfMemoryError e) {
            Log.e("CheckImageForQrCodeAsyncTask/OOM ", e);
            return 0;
        }
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        int intValue = ((Number) obj).intValue();
        InterfaceC70823Tt interfaceC70823Tt = (InterfaceC70823Tt) this.A03.get();
        if (interfaceC70823Tt != null) {
            interfaceC70823Tt.AOB(this.A00, intValue);
        }
    }
}
