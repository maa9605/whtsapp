package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.0uH */
/* loaded from: classes.dex */
public final class C18760uH {
    public static boolean A0D = true;
    public static BitmapFactory.Options A0E;
    public int A00;
    public int A01;
    public Bitmap A06;
    public BitmapFactory.Options A07;
    public static final Bitmap A0F = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public static final C18640u4 A0I = new C18640u4(128);
    public static final C18640u4 A0H = new C18640u4(32);
    public static final C18640u4 A0G = new C18640u4(20);
    public long A05 = -1;
    public int A04 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public final C18760uH[] A0B = new C18760uH[4];
    public C18760uH A09 = null;
    public C18760uH A08 = null;
    public volatile int A0C = 0;
    public final AbstractRunnableC18610u1 A0A = new AbstractRunnableC18610u1() { // from class: X.1XC
        {
            C18760uH.this = this;
        }

        @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
        public void run() {
            C18760uH c18760uH = C18760uH.this;
            c18760uH.A0C = 0;
            if (c18760uH.A08 == null && c18760uH.A09 == null) {
                c18760uH.A03();
            }
        }
    };

    public C18760uH(int i, int i2) {
        this.A00 = -1;
        this.A01 = -1;
        this.A01 = i;
        this.A00 = i2;
        if (!A0D) {
            BitmapFactory.Options options = A0E;
            if (options == null) {
                options = new BitmapFactory.Options();
                A0E = options;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            this.A07 = options;
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        this.A07 = options2;
        options2.inSampleSize = 1;
        options2.inPreferredConfig = Bitmap.Config.RGB_565;
        options2.inMutable = true;
    }

    public static C18760uH A00(int i, int i2) {
        C18760uH c18760uH = (C18760uH) A0I.A00();
        if (c18760uH == null) {
            return new C18760uH(i, i2);
        }
        c18760uH.A01 = i;
        c18760uH.A00 = i2;
        return c18760uH;
    }

    public static C18760uH A01(byte[] bArr, int i) {
        Bitmap decodeByteArray;
        C18760uH A00 = A00(-1, -1);
        if (A0D) {
            BitmapFactory.Options options = A00.A07;
            if (options.inBitmap == null) {
                options.inBitmap = (Bitmap) A0H.A00();
            }
        }
        try {
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, A00.A07);
            A00.A06 = decodeByteArray;
            if (A0D) {
                A00.A07.inBitmap = null;
            }
        } catch (IllegalArgumentException unused) {
            C18680u8.A07.A01();
            A0D = false;
            A00.A07.inBitmap.recycle();
            A00.A07.inBitmap = null;
            A0H.A01();
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, A00.A07);
            A00.A06 = decodeByteArray;
        }
        if (decodeByteArray == null) {
            A00.A03();
            return null;
        }
        A00.A01 = decodeByteArray.getWidth();
        A00.A00 = A00.A06.getHeight();
        return A00;
    }

    public synchronized Bitmap A02() {
        return this.A06;
    }

    public void A03() {
        this.A01 = -1;
        this.A00 = -1;
        for (int i = 0; i < 4; i++) {
            this.A0B[i] = null;
        }
        A04();
        this.A0C = 0;
        this.A08 = null;
        this.A09 = null;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
        this.A05 = -1L;
        A0I.A02(this);
    }

    public final synchronized void A04() {
        Bitmap bitmap = this.A06;
        if (bitmap != null && bitmap != A0F) {
            if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                A0G.A02(this.A06);
            } else if (A0D) {
                A0H.A02(this.A06);
            } else {
                this.A06.recycle();
            }
            this.A06 = null;
            return;
        }
        this.A06 = null;
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {x=");
        sb.append(this.A02);
        sb.append(", y=");
        sb.append(this.A03);
        sb.append(", zoom=");
        sb.append(this.A04);
        sb.append(", status=");
        sb.append(this.A0C);
        sb.append("}");
        sb.append(this.A06 == null ? "x" : "o");
        return sb.toString();
    }
}
