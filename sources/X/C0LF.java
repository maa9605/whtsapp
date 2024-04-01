package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0LF */
/* loaded from: classes.dex */
public class C0LF {
    public static volatile C0LF A04;
    public C02L A00;
    public C011505r A01;
    public C02F A02;
    public C04400Ka A03;

    public C0LF(C02L c02l, C011505r c011505r, C04400Ka c04400Ka, C02F c02f) {
        this.A00 = c02l;
        this.A01 = c011505r;
        this.A03 = c04400Ka;
        this.A02 = c02f;
    }

    public static C0LF A00() {
        if (A04 == null) {
            synchronized (C0LF.class) {
                if (A04 == null) {
                    A04 = new C0LF(C02L.A00(), C011505r.A00(), C04400Ka.A00(), C02F.A00());
                }
            }
        }
        return A04;
    }

    public Bitmap A01(Context context, C06C c06c, int i, float f) {
        Bitmap createBitmap;
        Rect rect;
        AbstractC005302j abstractC005302j = (AbstractC005302j) c06c.A03(AbstractC005302j.class);
        float f2 = i;
        try {
            boolean z = f2 >= context.getResources().getDisplayMetrics().density * 96.0f;
            if (abstractC005302j != null && ((c06c.A0C() && !C003101m.A0a(c06c.A02())) || (!c06c.A0C() && !c06c.A0D() && !C003101m.A0Y(abstractC005302j) && c06c.A0X))) {
                if (!z) {
                    if (c06c.A02 == 0 || A04(c06c)) {
                        this.A03.A02(abstractC005302j, c06c.A02, 2, null);
                    }
                } else if (c06c.A01 == 0 || A04(c06c)) {
                    this.A03.A02(abstractC005302j, c06c.A01, 1, null);
                }
            }
            if (c06c.A0R) {
                try {
                    InputStream A03 = A03(c06c, z);
                    try {
                        if (A03 == null) {
                            c06c.A0R = false;
                            return null;
                        }
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inDither = true;
                        options.inScaled = false;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        Bitmap bitmap = C002701i.A0M(A03, new C0DH(i, i, null, true, options)).A02;
                        if (bitmap != null) {
                            createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Paint paint = new Paint();
                            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
                            paint.setAntiAlias(true);
                            paint.setDither(true);
                            paint.setFilterBitmap(true);
                            canvas.drawARGB(0, 0, 0, 0);
                            paint.setColor(-1);
                            if (f != 0.0f) {
                                if (f > 0.0f) {
                                    canvas.drawRoundRect(rectF, f, f, paint);
                                } else {
                                    canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
                                }
                            } else {
                                canvas.drawRect(rectF, paint);
                            }
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                            RectF rectF2 = new RectF(0.0f, 0.0f, f2, f2);
                            int width = (bitmap.getWidth() - bitmap.getHeight()) >> 1;
                            if (width > 0) {
                                rect = new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight());
                            } else {
                                rect = new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
                            }
                            canvas.drawBitmap(bitmap, rect, rectF2, paint);
                            bitmap.recycle();
                        } else {
                            createBitmap = null;
                        }
                        if (createBitmap == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("contactPhotosBitmapManager/getphotofast/");
                            sb.append(abstractC005302j);
                            sb.append(" decodeStream returns null");
                            Log.e(sb.toString());
                        }
                        A03.close();
                        return createBitmap;
                    } finally {
                    }
                } catch (IOException unused) {
                }
            }
            return null;
        } catch (OutOfMemoryError e) {
            Log.e("contactPhotosBitmapManager/getphotofast/out-of-memory ", e);
            return null;
        }
    }

    public Bitmap A02(Context context, C06C c06c, int i, float f, boolean z) {
        if (z) {
            C011505r c011505r = this.A01;
            Bitmap bitmap = (Bitmap) c011505r.A02.A02().A01(c06c.A06(i, f));
            if (bitmap != null) {
                return bitmap;
            }
        }
        Bitmap A01 = A01(context, c06c, i, f);
        if (z && A01 != null) {
            C011505r c011505r2 = this.A01;
            c011505r2.A02.A02().A05(c06c.A06(i, f), A01);
        }
        return A01;
    }

    public InputStream A03(C06C c06c, boolean z) {
        File A042;
        if (c06c.A0R) {
            if (z) {
                A042 = this.A01.A03(c06c);
                if (!A042.exists()) {
                    A042 = this.A01.A04(c06c);
                    if (c06c.A01 > 0 && this.A02.A0A(Environment.getExternalStorageState())) {
                        StringBuilder A0P = C000200d.A0P("contactPhotosBitmapManager/getphotostream/");
                        A0P.append(c06c.A02());
                        A0P.append(" full file missing id:");
                        A0P.append(c06c.A01);
                        Log.e(A0P.toString());
                        c06c.A01 = 0;
                    }
                }
            } else {
                A042 = this.A01.A04(c06c);
                if (!A042.exists()) {
                    A042 = this.A01.A03(c06c);
                    if (c06c.A02 > 0) {
                        StringBuilder A0P2 = C000200d.A0P("contactPhotosBitmapManager/getphotostream/");
                        A0P2.append(c06c.A02());
                        A0P2.append(" thumb file missing id:");
                        A0P2.append(c06c.A02);
                        Log.e(A0P2.toString());
                        c06c.A02 = 0;
                    }
                }
            }
            if (A042.exists()) {
                try {
                    return new FileInputStream(A042);
                } catch (FileNotFoundException e) {
                    StringBuilder A0P3 = C000200d.A0P("contactPhotosBitmapManager/getphotostream/");
                    A0P3.append(c06c.A02());
                    A0P3.append(" photo file not found");
                    Log.e(A0P3.toString(), e);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean A04(C06C c06c) {
        return (this.A00.A0A(c06c.A02()) || (c06c instanceof C10190fR) || c06c.A06 + 604800000 >= System.currentTimeMillis()) ? false : true;
    }
}
