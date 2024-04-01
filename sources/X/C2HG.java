package X;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.2HG */
/* loaded from: classes2.dex */
public abstract class C2HG {
    public static float A04 = 12.0f;
    public static float A05 = 24.0f;
    public static float A06 = 24.0f;
    public static float A07 = 32.0f;
    public static float A08 = 96.0f;
    public static float A09 = 96.0f;
    public float A00;
    public long A01;
    public final Paint A02;
    public final RectF A03 = new RectF();

    public C2HG() {
        Paint paint = new Paint(1);
        this.A02 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A02.setStrokeJoin(Paint.Join.ROUND);
        this.A02.setStrokeCap(Paint.Cap.ROUND);
    }

    public float A00() {
        return this.A02.getStrokeWidth();
    }

    public C30R A01() {
        if (!(this instanceof C67883Hf)) {
            return new C30R(this.A03, this.A00, this.A02.getColor(), A00());
        }
        C67883Hf c67883Hf = (C67883Hf) this;
        return new C67873He(((C2HG) c67883Hf).A03, ((C2HG) c67883Hf).A00, ((C2HG) c67883Hf).A02.getColor(), c67883Hf.A00(), c67883Hf.A06, c67883Hf.A04);
    }

    public String A02() {
        return !(this instanceof C67893Hg) ? !(this instanceof C67883Hf) ? !(this instanceof C67863Hd) ? !(this instanceof C67853Hc) ? !(this instanceof C67843Hb) ? !(this instanceof C67833Ha) ? !(this instanceof C3HZ) ? !(this instanceof C3HV) ? !(this instanceof C3L7) ? !(this instanceof C3L6) ? !(this instanceof C2HH) ? !(this instanceof C68693Lb) ? !(this instanceof C3La) ? !(this instanceof C2HJ) ? "" : "analog-clock" : "location" : "svg" : "digital-clock" : "emoji" : "sticker" : "arrow" : "oval" : "pen" : "rect" : "speech-bubble-oval" : "speech-bubble-rect" : "text" : "thinking-bubble";
    }

    public void A03() {
        if (this instanceof C3La) {
            RectF rectF = this.A03;
            if (rectF.height() < A04) {
                float width = rectF.width() / rectF.height();
                rectF.set(rectF.centerX() - ((A04 * width) / 2.0f), rectF.centerY() - (A04 / 2.0f), ((A04 * width) / 2.0f) + rectF.centerX(), (A04 / 2.0f) + rectF.centerY());
            }
        } else if (!(this instanceof C2HH)) {
            RectF rectF2 = this.A03;
            if (rectF2.width() < A04) {
                rectF2.set(rectF2.centerX() - (A04 / 2.0f), rectF2.top, (A04 / 2.0f) + rectF2.centerX(), rectF2.bottom);
            }
            if (rectF2.height() < A04) {
                rectF2.set(rectF2.left, rectF2.centerY() - (A04 / 2.0f), rectF2.right, (A04 / 2.0f) + rectF2.centerY());
            }
        } else {
            C2HH c2hh = (C2HH) this;
            float f = (A04 * c2hh.A00) / 116.0f;
            RectF rectF3 = ((C2HG) c2hh).A03;
            if (rectF3.height() < A04 || rectF3.width() < f) {
                float f2 = f / 2.0f;
                rectF3.set(rectF3.centerX() - f2, rectF3.centerY() - (A04 / 2.0f), rectF3.centerX() + f2, (A04 / 2.0f) + rectF3.centerY());
            }
        }
    }

    public void A04() {
        if (this instanceof C2HH) {
            ((C2HH) this).A0N.A00 = false;
        } else if (!(this instanceof C3La)) {
            if (this instanceof C2HJ) {
                ((C2HJ) this).A0F.A00 = false;
            }
        } else {
            ((C3La) this).A0H.A00 = false;
        }
    }

    public void A05(float f) {
        if (this instanceof C3La) {
            RectF rectF = this.A03;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            rectF.set(centerX - ((centerX - rectF.left) * f), centerY - ((centerY - rectF.top) * f), centerX - ((centerX - rectF.right) * f), centerY - ((centerY - rectF.bottom) * f));
            A03();
        } else if (!(this instanceof C2HH)) {
            RectF rectF2 = this.A03;
            float centerX2 = rectF2.centerX();
            float centerY2 = rectF2.centerY();
            rectF2.set(centerX2 - ((centerX2 - rectF2.left) * f), centerY2 - ((centerY2 - rectF2.top) * f), centerX2 - ((centerX2 - rectF2.right) * f), centerY2 - ((centerY2 - rectF2.bottom) * f));
            A03();
        } else {
            RectF rectF3 = this.A03;
            float centerX3 = rectF3.centerX();
            float centerY3 = rectF3.centerY();
            rectF3.set(centerX3 - ((centerX3 - rectF3.left) * f), centerY3 - ((centerY3 - rectF3.top) * f), centerX3 - ((centerX3 - rectF3.right) * f), centerY3 - ((centerY3 - rectF3.bottom) * f));
            A03();
        }
    }

    public void A06(float f) {
        if (this instanceof C67893Hg) {
            this.A02.setStrokeWidth((f * 3.0f) / 5.0f);
        } else if (this instanceof C67863Hd) {
            this.A02.setStrokeWidth((f * 2.0f) / 3.0f);
        } else if (!(this instanceof C67853Hc)) {
            this.A02.setStrokeWidth(f);
        } else {
            this.A02.setStrokeWidth((f * 2.0f) / 3.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x001f, code lost:
        if (r9 == 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0059, code lost:
        if (r9 == 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0093, code lost:
        if (r9 == 2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(float r8, int r9) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HG.A07(float, int):void");
    }

    public void A08(int i) {
        String replace;
        int i2;
        if (!(this instanceof C68693Lb)) {
            if (this instanceof C3La) {
                return;
            }
            this.A02.setColor(i);
            return;
        }
        C68693Lb c68693Lb = (C68693Lb) this;
        Paint paint = ((C2HG) c68693Lb).A02;
        if (paint.getColor() != i) {
            if (c68693Lb.A05 == null) {
                try {
                    AssetManager assets = ((C2HK) c68693Lb).A00.getAssets();
                    StringBuilder sb = new StringBuilder();
                    sb.append("graphics/");
                    sb.append(c68693Lb.A04);
                    InputStream open = assets.open(sb.toString());
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    c68693Lb.A05 = byteArrayOutputStream.toString("UTF-8");
                    open.close();
                } catch (IOException e) {
                    StringBuilder A0P = C000200d.A0P("failed to load SVG from ");
                    A0P.append(c68693Lb.A04);
                    Log.e(A0P.toString(), e);
                }
            }
            if (i == 0) {
                replace = c68693Lb.A05;
            } else {
                String format = String.format(Locale.US, "%06x", Integer.valueOf(i & 16777215));
                String str = c68693Lb.A01 == 3 ? "ffdc5d" : "ffcc4d";
                String str2 = c68693Lb.A05;
                String A0H = C000200d.A0H("fill:#", str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fill:#");
                sb2.append(format);
                replace = str2.replace(A0H, sb2.toString());
                if (c68693Lb.A01 == 3) {
                    int[] iArr = C68693Lb.A08;
                    int length = iArr.length - 2;
                    while (length >= 0) {
                        int red = Color.red(i);
                        int red2 = Color.red(iArr[length]);
                        int i3 = length + 1;
                        int red3 = Color.red(iArr[i3]);
                        if ((red2 <= red && red <= red3) || (red3 <= red && red <= red2)) {
                            i2 = ((Color.blue(iArr[length]) - Color.blue(i)) * 100) / (Color.blue(iArr[length]) - Color.blue(iArr[i3]));
                            break;
                        }
                        length--;
                    }
                    length = 0;
                    i2 = 0;
                    int[] iArr2 = C68693Lb.A09;
                    int i4 = iArr2[length];
                    int i5 = iArr2[length + 1];
                    int i6 = 100 - i2;
                    String format2 = String.format(Locale.US, "%06x", Integer.valueOf(Color.argb(255, ((Color.red(i5) * i2) / 100) + ((Color.red(i4) * i6) / 100), ((Color.green(i5) * i2) / 100) + ((Color.green(i4) * i6) / 100), ((Color.blue(i5) * i2) / 100) + ((Color.blue(i4) * i6) / 100)) & 16777215));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("fill:#");
                    sb3.append(format2);
                    replace = replace.replace("fill:#ef9645", sb3.toString());
                }
            }
            try {
                C18090tA A0P2 = new C18230tO().A0P(new ByteArrayInputStream(replace.getBytes()));
                if (A0P2 != null) {
                    c68693Lb.A03 = A0P2.A00();
                } else {
                    c68693Lb.A03 = null;
                }
            } catch (C18140tF e2) {
                StringBuilder A0P3 = C000200d.A0P("failed to load SVG from ");
                A0P3.append(c68693Lb.A04);
                Log.e(A0P3.toString(), e2);
            }
            paint.setColor(i);
        }
    }

    public void A09(Canvas canvas) {
        C30Q[] c30qArr;
        long j;
        C30Q[] c30qArr2;
        Picture picture;
        TextPaint textPaint;
        float f;
        float f2;
        Picture picture2;
        C30Q c30q;
        C30Q c30q2;
        if (this instanceof C67893Hg) {
            C67893Hg c67893Hg = (C67893Hg) this;
            RectF rectF = ((C2HG) c67893Hg).A03;
            rectF.sort();
            canvas.save();
            Matrix matrix = c67893Hg.A00;
            RectF rectF2 = c67893Hg.A05;
            matrix.setRectToRect(new RectF(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom), rectF, Matrix.ScaleToFit.CENTER);
            Path path = c67893Hg.A04;
            path.reset();
            path.setFillType(Path.FillType.WINDING);
            c67893Hg.A02.transform(matrix, path);
            Paint paint = c67893Hg.A01;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-31);
            path.close();
            canvas.drawPath(path, paint);
            path.reset();
            path.setFillType(Path.FillType.WINDING);
            c67893Hg.A03.transform(matrix, path);
            Paint paint2 = ((C2HG) c67893Hg).A02;
            paint2.setStyle(Paint.Style.STROKE);
            canvas.drawPath(path, paint2);
            canvas.restore();
            c67893Hg.A0H(canvas, 1.3f, 1.0f);
            c67893Hg.A0H(canvas, 1.7f, 0.5f);
        } else if (this instanceof C67883Hf) {
            C67883Hf c67883Hf = (C67883Hf) this;
            if (!TextUtils.isEmpty(c67883Hf.A06)) {
                RectF rectF3 = ((C2HG) c67883Hf).A03;
                rectF3.sort();
                canvas.save();
                float f3 = ((C2HG) c67883Hf).A00;
                if (Math.abs(f3) < 3.0f) {
                    f3 = 0.0f;
                }
                canvas.rotate(f3, rectF3.centerX(), rectF3.centerY());
                float width = rectF3.width() / c67883Hf.A01;
                canvas.translate(((rectF3.width() / 2.0f) + rectF3.left) - ((c67883Hf.A05.getWidth() * width) / 2.0f), rectF3.top);
                canvas.scale(width, width, 0.0f, 0.0f);
                if (c67883Hf.A04 == 3) {
                    TextPaint textPaint2 = c67883Hf.A09;
                    textPaint2.setStrokeWidth(textPaint2.getTextSize() / 12.0f);
                    textPaint2.setStyle(Paint.Style.STROKE);
                    textPaint2.setColor(-16777216);
                    c67883Hf.A05.draw(canvas);
                    textPaint2.setStrokeWidth(0.0f);
                    textPaint2.setStyle(Paint.Style.FILL);
                    textPaint2.setColor(-1);
                    c67883Hf.A05.draw(canvas);
                } else {
                    c67883Hf.A09.setColor(((C2HG) c67883Hf).A02.getColor());
                    c67883Hf.A05.draw(canvas);
                }
                canvas.restore();
            }
        } else if (this instanceof C67853Hc) {
            C67853Hc c67853Hc = (C67853Hc) this;
            RectF rectF4 = ((C2HG) c67853Hc).A03;
            rectF4.sort();
            Paint paint3 = ((C2HG) c67853Hc).A02;
            paint3.setStyle(Paint.Style.STROKE);
            Matrix matrix2 = c67853Hc.A00;
            matrix2.reset();
            matrix2.setRotate(((C2HG) c67853Hc).A00, 0.0f, 0.0f);
            matrix2.postScale(rectF4.width() / 2000.0f, rectF4.height() / 2000.0f);
            matrix2.postTranslate(rectF4.centerX(), rectF4.centerY());
            Path path2 = c67853Hc.A03;
            path2.reset();
            path2.setFillType(Path.FillType.WINDING);
            Path path3 = c67853Hc.A02;
            path3.transform(matrix2, path2);
            Paint paint4 = c67853Hc.A01;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setColor(-31);
            path2.close();
            canvas.drawPath(path2, paint4);
            path2.reset();
            path2.setFillType(Path.FillType.WINDING);
            path3.transform(matrix2, path2);
            canvas.drawPath(path2, paint3);
        } else if (this instanceof C67843Hb) {
            RectF rectF5 = this.A03;
            rectF5.sort();
            canvas.save();
            canvas.rotate(this.A00, rectF5.centerX(), rectF5.centerY());
            canvas.drawRect(rectF5, this.A02);
            canvas.restore();
        } else if (this instanceof C67833Ha) {
            C67833Ha c67833Ha = (C67833Ha) this;
            if (c67833Ha.A04) {
                c67833Ha.A03.A01(canvas, 0);
            }
        } else if (this instanceof C3HZ) {
            RectF rectF6 = this.A03;
            rectF6.sort();
            canvas.save();
            canvas.rotate(this.A00, rectF6.centerX(), rectF6.centerY());
            canvas.drawOval(rectF6, this.A02);
            canvas.restore();
        } else if (this instanceof C3HV) {
            canvas.save();
            float f4 = this.A00;
            RectF rectF7 = this.A03;
            canvas.rotate(f4, rectF7.centerX(), rectF7.centerY());
            float f5 = rectF7.left;
            float f6 = rectF7.bottom;
            float f7 = rectF7.right;
            float f8 = rectF7.top;
            Paint paint5 = this.A02;
            canvas.drawLine(f5, f6, f7, f8, paint5);
            float degrees = f7 == f5 ? 90.0f : (float) Math.toDegrees(Math.atan((f8 - f6) / (f7 - f5)));
            canvas.save();
            canvas.translate(f7, f8);
            canvas.rotate(degrees + (f5 > f7 ? 30 : 150));
            canvas.drawLine(0.0f, 0.0f, paint5.getStrokeWidth() * 5.0f, 0.0f, paint5);
            canvas.rotate(f5 > f7 ? -60 : 60);
            canvas.drawLine(0.0f, 0.0f, paint5.getStrokeWidth() * 5.0f, 0.0f, paint5);
            canvas.restore();
            canvas.restore();
        } else if (this instanceof C3L7) {
            C3L7 c3l7 = (C3L7) this;
            if (c3l7.A01 != null) {
                canvas.save();
                Drawable drawable = c3l7.A01;
                if (drawable instanceof C44121yY) {
                    C44121yY c44121yY = (C44121yY) drawable;
                    c3l7.A0J(canvas, c44121yY);
                    c44121yY.draw(canvas);
                    c44121yY.A06 = true;
                    if (!c44121yY.A07) {
                        c44121yY.start();
                    }
                } else {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    c3l7.A0I(canvas, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
                    bitmapDrawable.draw(canvas);
                }
                canvas.restore();
            }
        } else if (this instanceof C3L6) {
            C3L6 c3l6 = (C3L6) this;
            BitmapDrawable bitmapDrawable2 = c3l6.A00;
            if (bitmapDrawable2 != null) {
                RectF rectF8 = ((C2HG) c3l6).A03;
                bitmapDrawable2.setBounds((int) rectF8.left, (int) rectF8.top, (int) rectF8.right, (int) rectF8.bottom);
                canvas.save();
                canvas.rotate(((C2HG) c3l6).A00, rectF8.centerX(), rectF8.centerY());
                c3l6.A00.draw(canvas);
                canvas.restore();
            }
        } else if (this instanceof C2HH) {
            C2HH c2hh = (C2HH) this;
            C30T c30t = c2hh.A0L;
            float A00 = c30t.A00();
            boolean booleanValue = c2hh.A01.booleanValue();
            if (c30t.A01 && c30t.A00 >= 0.0f) {
                booleanValue = !booleanValue;
            }
            canvas.save();
            RectF rectF9 = ((C2HG) c2hh).A03;
            rectF9.sort();
            canvas.rotate(((C2HG) c2hh).A00, rectF9.centerX(), rectF9.centerY());
            canvas.scale(rectF9.width() / c2hh.A00, rectF9.height() / 116.0f, rectF9.left, rectF9.top);
            canvas.translate(rectF9.left, rectF9.top);
            canvas.scale(A00, A00, c2hh.A00 / 2.0f, 58.0f);
            if (booleanValue) {
                c30qArr = c2hh.A0P;
            } else {
                c30qArr = c2hh.A0Q;
            }
            for (C30Q c30q3 : c30qArr) {
                canvas.drawRoundRect(c30q3.A03, c30q3.A00, c30q3.A01, c30q3.A02);
            }
            if (booleanValue) {
                c2hh.A0J(canvas, c2hh.A0E, c2hh.A0C);
            } else {
                c2hh.A0J(canvas, c2hh.A0I, c2hh.A0G);
            }
            canvas.restore();
            if (!c2hh.A0O) {
                c2hh.A0N.A01(canvas, ((C2HG) c2hh).A00, rectF9);
            }
        } else if (this instanceof C68693Lb) {
            C68693Lb c68693Lb = (C68693Lb) this;
            if (c68693Lb.A03 != null) {
                RectF rectF10 = ((C2HG) c68693Lb).A03;
                rectF10.sort();
                canvas.save();
                canvas.rotate(((C2HG) c68693Lb).A00, rectF10.centerX(), rectF10.centerY());
                if (c68693Lb.A06) {
                    canvas.scale(-1.0f, 1.0f, rectF10.centerX(), rectF10.centerY());
                }
                long j2 = ((C2HG) c68693Lb).A01;
                if (j2 != 0) {
                    int i = c68693Lb.A00;
                    if (i == 1) {
                        float sin = (((float) Math.sin((((c68693Lb.A02 + j2) % 1000) * 6.283185307179586d) / 1000.0d)) * 0.02f) + 1.0f;
                        canvas.scale(sin, sin, rectF10.centerX(), rectF10.centerY());
                    } else if (i == 2) {
                        long j3 = c68693Lb.A02 + j2;
                        canvas.rotate(((float) Math.sin(((((j3 * 10) / 12) % 1000) * 6.283185307179586d) / 1000.0d)) * 2.2f, rectF10.centerX(), rectF10.centerY());
                        canvas.translate(rectF10.centerX(), rectF10.centerY());
                        canvas.skew(((float) Math.sin(((((j3 * 15) / 12) % 1000) * 6.283185307179586d) / 1000.0d)) * 0.03f, 0.0f);
                        canvas.translate(-rectF10.centerX(), -rectF10.centerY());
                    } else if (i == 3) {
                        if ((c68693Lb.A02 + j2) % 4000 > 3300) {
                            canvas.scale(1.0f, (((float) Math.sin(((4000 - j) * 6.283185307179586d) / 700.0d)) * 0.1f) + 1.0f, rectF10.centerX(), rectF10.bottom);
                        }
                    } else if (i == 4) {
                        long j4 = c68693Lb.A02 + j2;
                        canvas.rotate((float) Math.sin(((j4 % 1000) * 6.283185307179586d) / 1000.0d), rectF10.centerX(), rectF10.bottom);
                        canvas.translate(rectF10.centerX(), rectF10.bottom);
                        canvas.skew(((float) Math.sin(((((j4 * 9) / 12) % 1000) * 6.283185307179586d) / 1000.0d)) * 0.02f, 0.0f);
                        canvas.translate(-rectF10.centerX(), -rectF10.bottom);
                    }
                }
                canvas.scale(rectF10.width() / c68693Lb.A03.getWidth(), rectF10.height() / c68693Lb.A03.getHeight(), rectF10.left, rectF10.top);
                canvas.translate(rectF10.left, rectF10.top);
                canvas.save();
                canvas.drawPicture(c68693Lb.A03);
                canvas.restore();
                canvas.restore();
            }
        } else if (!(this instanceof C3La)) {
            C2HJ c2hj = (C2HJ) this;
            boolean z = c2hj.A0G;
            if (!z) {
                canvas.save();
                RectF rectF11 = ((C2HG) c2hj).A03;
                canvas.scale(0.67f, 0.67f, rectF11.centerX(), rectF11.centerY());
            }
            C30T c30t2 = c2hj.A0D;
            float A002 = c30t2.A00();
            boolean booleanValue2 = c2hj.A0A.booleanValue();
            if (c30t2.A01 && c30t2.A00 >= 0.0f) {
                booleanValue2 = !booleanValue2;
            }
            if (booleanValue2) {
                picture2 = c2hj.A04;
            } else {
                picture2 = c2hj.A05;
            }
            RectF rectF12 = ((C2HG) c2hj).A03;
            rectF12.sort();
            canvas.save();
            canvas.rotate(((C2HG) c2hj).A00, rectF12.centerX(), rectF12.centerY());
            canvas.scale(rectF12.width() / picture2.getHeight(), rectF12.height() / picture2.getWidth(), rectF12.left, rectF12.top);
            canvas.translate(rectF12.left, rectF12.top);
            canvas.scale(A002, A002, picture2.getWidth() >> 1, picture2.getHeight() >> 1);
            canvas.save();
            canvas.drawPicture(picture2);
            canvas.restore();
            canvas.drawCircle(picture2.getWidth() >> 1, picture2.getHeight() >> 1, 26.0f, booleanValue2 ? c2hj.A02 : c2hj.A03);
            canvas.save();
            if (booleanValue2) {
                c30q = c2hj.A06;
            } else {
                c30q = c2hj.A08;
            }
            double d = ((c2hj.A01 * 30) / 60.0d) + ((((c2hj.A00 + 9) % 12.0d) / 12.0d) * 360.0d);
            RectF rectF13 = c2hj.A0B;
            rectF13.set(c30q.A03);
            canvas.rotate((int) d, picture2.getWidth() >> 1, picture2.getHeight() >> 1);
            canvas.drawRoundRect(rectF13, c30q.A00, c30q.A01, c30q.A02);
            canvas.restore();
            canvas.save();
            if (booleanValue2) {
                c30q2 = c2hj.A07;
            } else {
                c30q2 = c2hj.A09;
            }
            rectF13.set(c30q2.A03);
            canvas.rotate((int) ((((c2hj.A01 + 45) % 60.0d) / 60.0d) * 360.0d), picture2.getWidth() >> 1, picture2.getHeight() >> 1);
            canvas.drawRoundRect(rectF13, c30q2.A00, c30q2.A01, c30q2.A02);
            canvas.restore();
            canvas.restore();
            if (!z) {
                canvas.restore();
                float width2 = (rectF12.width() * 0.67f) / 2.0f;
                c2hj.A0F.A01(canvas, ((C2HG) c2hj).A00, new RectF(rectF12.centerX() - width2, rectF12.centerY() - width2, rectF12.centerX() + width2, rectF12.centerY() + width2));
            }
        } else {
            C3La c3La = (C3La) this;
            C30T c30t3 = c3La.A0F;
            float A003 = c30t3.A00();
            boolean z2 = c3La.A07;
            if (c30t3.A01 && c30t3.A00 >= 0.0f) {
                z2 = !z2;
            }
            canvas.save();
            RectF rectF14 = ((C2HG) c3La).A03;
            rectF14.sort();
            canvas.rotate(((C2HG) c3La).A00, rectF14.centerX(), rectF14.centerY());
            canvas.scale(rectF14.width() / c3La.A02, rectF14.height() / 130.0f, rectF14.left, rectF14.top);
            canvas.translate(rectF14.left, rectF14.top);
            canvas.scale(A003, A003, c3La.A02 / 2.0f, 65.0f);
            if (z2) {
                c30qArr2 = c3La.A08;
            } else {
                c30qArr2 = c3La.A09;
            }
            for (C30Q c30q4 : c30qArr2) {
                canvas.drawRoundRect(c30q4.A03, c30q4.A00, c30q4.A01, c30q4.A02);
            }
            if (z2) {
                picture = c3La.A04;
                textPaint = c3La.A0E;
                textPaint.setColor(-1);
            } else {
                picture = c3La.A03;
                textPaint = c3La.A0E;
                textPaint.setColor(-16777216);
            }
            float width3 = picture == null ? 0.0f : picture.getWidth();
            float f9 = ((14.0f + width3) + c3La.A02) / 2.0f;
            float ascent = 65.0f - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
            boolean z3 = c3La.A0I;
            if (!z3) {
                canvas.drawText(c3La.A05, f9, ascent, textPaint);
            }
            if (z3) {
                f = 1.6f;
                f2 = c3La.A02 - (width3 * 1.6f);
            } else {
                f = 1.0f;
                f2 = 106.0f;
            }
            float f10 = f2 / 2.0f;
            float f11 = ascent / (f * 2.0f);
            if (picture != null) {
                float f12 = z3 ? 1.6f : 0.9f;
                canvas.save();
                canvas.translate(f10, f11);
                canvas.scale(f12, f12);
                canvas.drawPicture(picture);
                canvas.restore();
            }
            canvas.restore();
            if (!z3) {
                c3La.A0H.A01(canvas, ((C2HG) c3La).A00, rectF14);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0090, code lost:
        if (r1 != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HG.A0A(android.graphics.Canvas):void");
    }

    public void A0B(JSONObject jSONObject) {
        RectF rectF = this.A03;
        rectF.left = jSONObject.getInt("l") / 100.0f;
        rectF.top = jSONObject.getInt("t") / 100.0f;
        rectF.right = jSONObject.getInt("r") / 100.0f;
        rectF.bottom = jSONObject.getInt("b") / 100.0f;
        this.A00 = jSONObject.optInt("rotate", 0) / 100.0f;
        A08(jSONObject.getInt("color"));
        A06(jSONObject.getInt("stroke") / 100.0f);
    }

    public boolean A0C() {
        if ((this instanceof C67883Hf) || (this instanceof C67833Ha) || (this instanceof C3L7) || (this instanceof C3L6) || (this instanceof C2HH)) {
            return false;
        }
        return !(this instanceof C68693Lb) ? ((this instanceof C3La) || (this instanceof C2HJ)) ? false : true : ((C68693Lb) this).A01 != 0;
    }

    public boolean A0D() {
        return ((this instanceof C67883Hf) || (this instanceof C67833Ha) || (this instanceof C2HK) || (this instanceof C3L7) || (this instanceof C3L6) || (this instanceof C2HH)) ? false : true;
    }

    public boolean A0E() {
        if (this instanceof C3L7) {
            return true;
        }
        return (this instanceof C68693Lb) && ((C68693Lb) this).A00 != 0;
    }

    public void A0F(RectF rectF, float f, float f2, float f3, float f4) {
        if (f == f3) {
            f3 += 1.0f;
        }
        if (f2 == f4) {
            f4 += 1.0f;
        }
        RectF rectF2 = this.A03;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A03();
    }

    public void A0G(JSONObject jSONObject) {
        jSONObject.put("type", A02());
        RectF rectF = this.A03;
        jSONObject.put("l", (int) (rectF.left * 100.0f));
        jSONObject.put("t", (int) (rectF.top * 100.0f));
        jSONObject.put("r", (int) (rectF.right * 100.0f));
        jSONObject.put("b", (int) (rectF.bottom * 100.0f));
        float f = this.A00;
        if (f != 0.0f) {
            jSONObject.put("rotate", (int) (f * 100.0f));
        }
        jSONObject.put("color", this.A02.getColor());
        jSONObject.put("stroke", (int) (A00() * 100.0f));
    }
}
