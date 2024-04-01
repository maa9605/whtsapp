package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Gt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67763Gt implements InterfaceC61152vg {
    public Context A00;
    public C2Xu A01;
    public final int A02;
    public final Uri A03;
    public final C002301c A04;
    public final C40081rY A05;
    public final C42611w2 A06;
    public final C43791xz A07;
    public final C41961un A08;
    public final AtomicBoolean A09 = new AtomicBoolean(false);

    public C67763Gt(C002301c c002301c, C40081rY c40081rY, C41961un c41961un, C43791xz c43791xz, Uri uri, C42611w2 c42611w2, C2Xu c2Xu, int i) {
        this.A00 = c2Xu.getContext();
        this.A04 = c002301c;
        this.A05 = c40081rY;
        this.A08 = c41961un;
        this.A07 = c43791xz;
        this.A03 = uri;
        this.A06 = c42611w2;
        this.A01 = c2Xu;
        this.A02 = i;
    }

    @Override // X.InterfaceC61152vg
    public String ADR() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03.toString());
        sb.append("-thumb");
        return sb.toString();
    }

    @Override // X.InterfaceC61152vg
    public Bitmap AG1() {
        Bitmap bitmap;
        AtomicBoolean atomicBoolean = this.A09;
        if (!atomicBoolean.get() && this.A01.getTag() == this) {
            C42611w2 c42611w2 = this.A06;
            Uri fromFile = Uri.fromFile(c42611w2.A04());
            C41961un c41961un = this.A08;
            byte A0X = c41961un.A0X(this.A03);
            if (A0X == 1) {
                try {
                    int i = this.A02;
                    bitmap = c41961un.A0Z(fromFile, i, i);
                } catch (C42671w8 | IOException unused) {
                    bitmap = MediaGalleryFragmentBase.A0Q;
                }
            } else if (A0X == 3 || A0X == 13) {
                File A05 = c42611w2.A05();
                if (A05 != null) {
                    Bitmap A0I = C02180Ae.A0I(A05);
                    if (A0I != null) {
                        Bitmap.Config config = A0I.getConfig();
                        int i2 = this.A02;
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        bitmap = Bitmap.createBitmap(i2, i2, config);
                        Canvas canvas = new Canvas(bitmap);
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        paint.setDither(true);
                        int width = A0I.getWidth();
                        int height = A0I.getHeight();
                        canvas.drawBitmap(A0I, width > height ? new Rect((width - height) >> 1, 0, (width + height) >> 1, height) : new Rect(0, (height - width) >> 1, width, (height + width) >> 1), new Rect(0, 0, i2, i2), paint);
                        A0I.recycle();
                    } else {
                        bitmap = MediaGalleryFragmentBase.A0Q;
                    }
                } else {
                    throw null;
                }
            } else {
                bitmap = null;
            }
            if (atomicBoolean.get()) {
                return null;
            }
            if (bitmap != null && c42611w2.A08() != null) {
                if (!bitmap.isMutable()) {
                    bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                }
                C2EK A03 = C2EK.A03(c42611w2.A08(), this.A00, this.A05, this.A04, this.A07);
                if (A03 != null) {
                    A03.A07(bitmap, 0, false, false);
                }
            }
            return bitmap == null ? MediaGalleryFragmentBase.A0Q : bitmap;
        }
        return null;
    }
}
