package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0Xp */
/* loaded from: classes.dex */
public class C07280Xp extends AbstractC07290Xq {
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public ColorFilter A00;
    public PorterDuffColorFilter A01;
    public C07300Xr A02;
    public boolean A03;
    public boolean A04;
    public final Matrix A05;
    public final Rect A06;
    public final float[] A07;

    public C07280Xp() {
        this.A03 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A02 = new C07300Xr();
    }

    public C07280Xp(C07300Xr c07300Xr) {
        this.A03 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A02 = c07300Xr;
        this.A01 = A01(c07300Xr.A03, c07300Xr.A07);
    }

    public static C07280Xp A00(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C07280Xp c07280Xp = new C07280Xp();
            Drawable A0D = C002701i.A0D(resources, i, theme);
            ((AbstractC07290Xq) c07280Xp).A00 = A0D;
            new C07310Xs(A0D.getConstantState());
            return c07280Xp;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    C07280Xp c07280Xp2 = new C07280Xp();
                    c07280Xp2.inflate(resources, xml, asAttributeSet, theme);
                    return c07280Xp2;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public PorterDuffColorFilter A01(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = super.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A06;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.A00;
        if (colorFilter == null) {
            colorFilter = this.A01;
        }
        Matrix matrix = this.A05;
        canvas.getMatrix(matrix);
        float[] fArr = this.A07;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (rect.width() * abs));
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C07O.A08(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C07300Xr c07300Xr = this.A02;
        Bitmap bitmap = c07300Xr.A04;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c07300Xr.A04.getHeight()) {
            c07300Xr.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c07300Xr.A0A = true;
        }
        if (!this.A03) {
            this.A02.A00(min, min2);
        } else {
            C07300Xr c07300Xr2 = this.A02;
            if (c07300Xr2.A0A || c07300Xr2.A02 != c07300Xr2.A03 || c07300Xr2.A06 != c07300Xr2.A07 || c07300Xr2.A0B != c07300Xr2.A09 || c07300Xr2.A00 != c07300Xr2.A08.A05) {
                c07300Xr2.A00(min, min2);
                C07300Xr c07300Xr3 = this.A02;
                c07300Xr3.A02 = c07300Xr3.A03;
                c07300Xr3.A06 = c07300Xr3.A07;
                c07300Xr3.A00 = c07300Xr3.A08.A05;
                c07300Xr3.A0B = c07300Xr3.A09;
                c07300Xr3.A0A = false;
            }
        }
        C07300Xr c07300Xr4 = this.A02;
        if ((c07300Xr4.A08.A05 < 255) || colorFilter != null) {
            if (c07300Xr4.A05 == null) {
                Paint paint2 = new Paint();
                c07300Xr4.A05 = paint2;
                paint2.setFilterBitmap(true);
            }
            c07300Xr4.A05.setAlpha(c07300Xr4.A08.A05);
            c07300Xr4.A05.setColorFilter(colorFilter);
            paint = c07300Xr4.A05;
        } else {
            paint = null;
        }
        canvas.drawBitmap(c07300Xr4.A04, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                return drawable.getAlpha();
            }
            return 0;
        }
        return this.A02.A08.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.A02.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return drawable.getColorFilter();
            }
            return null;
        }
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = super.A00;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C07310Xs(drawable.getConstantState());
        }
        this.A02.A01 = getChangingConfigurations();
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.A02.A08.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.A02.A08.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        ColorStateList A0F;
        Drawable drawable = super.A00;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        C07300Xr c07300Xr = this.A02;
        c07300Xr.A08 = new C07320Xt();
        TypedArray A0G = C07O.A0G(resources, theme, attributeSet, C07N.A0B);
        C07300Xr c07300Xr2 = this.A02;
        C07320Xt c07320Xt = c07300Xr2.A08;
        int A06 = C07O.A06(A0G, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i = 3;
        if (A06 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (A06 != 5) {
            if (A06 != 9) {
                switch (A06) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c07300Xr2.A07 = mode;
        if (C07O.A19(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            A0G.getValue(1, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                if (i2 >= 28 && i2 <= 31) {
                    A0F = ColorStateList.valueOf(typedValue.data);
                } else {
                    Resources resources2 = A0G.getResources();
                    try {
                        XmlResourceParser xml = resources2.getXml(A0G.getResourceId(1, 0));
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                A0F = C07O.A0F(resources2, xml, asAttributeSet, theme);
                            }
                        } while (next != 1);
                        throw new XmlPullParserException("No start tag found");
                    } catch (Exception e) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    }
                }
                if (A0F != null) {
                    c07300Xr2.A03 = A0F;
                }
            } else {
                StringBuilder sb = new StringBuilder("Failed to resolve attribute at index ");
                sb.append(1);
                sb.append(": ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        boolean z = c07300Xr2.A09;
        if (C07O.A19(xmlPullParser, "autoMirrored")) {
            z = A0G.getBoolean(5, z);
        }
        c07300Xr2.A09 = z;
        c07320Xt.A03 = C07O.A00(A0G, xmlPullParser, "viewportWidth", 7, c07320Xt.A03);
        float A00 = C07O.A00(A0G, xmlPullParser, "viewportHeight", 8, c07320Xt.A02);
        c07320Xt.A02 = A00;
        if (c07320Xt.A03 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A0G.getPositionDescription());
            sb2.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb2.toString());
        } else if (A00 > 0.0f) {
            c07320Xt.A01 = A0G.getDimension(3, c07320Xt.A01);
            float dimension = A0G.getDimension(2, c07320Xt.A00);
            c07320Xt.A00 = dimension;
            if (c07320Xt.A01 <= 0.0f) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(A0G.getPositionDescription());
                sb3.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb3.toString());
            } else if (dimension > 0.0f) {
                c07320Xt.setAlpha(C07O.A00(A0G, xmlPullParser, "alpha", 4, c07320Xt.getAlpha()));
                String string = A0G.getString(0);
                if (string != null) {
                    c07320Xt.A0A = string;
                    c07320Xt.A0E.put(string, c07320Xt);
                }
                A0G.recycle();
                c07300Xr.A01 = getChangingConfigurations();
                c07300Xr.A0A = true;
                C07300Xr c07300Xr3 = this.A02;
                C07320Xt c07320Xt2 = c07300Xr3.A08;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c07320Xt2.A0F);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                for (int i3 = 1; eventType != i3 && (xmlPullParser.getDepth() >= depth || eventType != i); i3 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C07330Xu c07330Xu = (C07330Xu) arrayDeque.peek();
                        if ("path".equals(name)) {
                            C07350Xw c07350Xw = new C07350Xw();
                            TypedArray A0G2 = C07O.A0G(resources, theme, attributeSet, C07N.A0A);
                            c07350Xw.A0B = null;
                            if (C07O.A19(xmlPullParser, "pathData")) {
                                String string2 = A0G2.getString(0);
                                if (string2 != null) {
                                    ((AbstractC07360Xx) c07350Xw).A02 = string2;
                                }
                                String string3 = A0G2.getString(2);
                                if (string3 != null) {
                                    ((AbstractC07360Xx) c07350Xw).A03 = C07O.A1C(string3);
                                }
                                c07350Xw.A09 = C07O.A0M(A0G2, xmlPullParser, theme, "fillColor", 1);
                                c07350Xw.A00 = C07O.A00(A0G2, xmlPullParser, "fillAlpha", 12, c07350Xw.A00);
                                int A062 = C07O.A06(A0G2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = c07350Xw.A07;
                                if (A062 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (A062 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (A062 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                c07350Xw.A07 = cap;
                                int A063 = C07O.A06(A0G2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = c07350Xw.A08;
                                if (A063 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (A063 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (A063 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                c07350Xw.A08 = join;
                                c07350Xw.A02 = C07O.A00(A0G2, xmlPullParser, "strokeMiterLimit", 10, c07350Xw.A02);
                                c07350Xw.A0A = C07O.A0M(A0G2, xmlPullParser, theme, "strokeColor", 3);
                                c07350Xw.A01 = C07O.A00(A0G2, xmlPullParser, "strokeAlpha", 11, c07350Xw.A01);
                                c07350Xw.A03 = C07O.A00(A0G2, xmlPullParser, "strokeWidth", 4, c07350Xw.A03);
                                c07350Xw.A04 = C07O.A00(A0G2, xmlPullParser, "trimPathEnd", 6, c07350Xw.A04);
                                c07350Xw.A05 = C07O.A00(A0G2, xmlPullParser, "trimPathOffset", 7, c07350Xw.A05);
                                c07350Xw.A06 = C07O.A00(A0G2, xmlPullParser, "trimPathStart", 5, c07350Xw.A06);
                                ((AbstractC07360Xx) c07350Xw).A01 = C07O.A06(A0G2, xmlPullParser, "fillType", 13, ((AbstractC07360Xx) c07350Xw).A01);
                            }
                            A0G2.recycle();
                            c07330Xu.A0C.add(c07350Xw);
                            String str = ((AbstractC07360Xx) c07350Xw).A02;
                            if (str != null) {
                                c07320Xt2.A0E.put(str, c07350Xw);
                            }
                            c07300Xr3.A01 |= ((AbstractC07360Xx) c07350Xw).A00;
                            z2 = false;
                        } else if ("clip-path".equals(name)) {
                            C07380Xz c07380Xz = new C07380Xz();
                            if (C07O.A19(xmlPullParser, "pathData")) {
                                TypedArray A0G3 = C07O.A0G(resources, theme, attributeSet, C07N.A08);
                                String string4 = A0G3.getString(0);
                                if (string4 != null) {
                                    c07380Xz.A02 = string4;
                                }
                                String string5 = A0G3.getString(1);
                                if (string5 != null) {
                                    c07380Xz.A03 = C07O.A1C(string5);
                                }
                                c07380Xz.A01 = C07O.A06(A0G3, xmlPullParser, "fillType", 2, 0);
                                A0G3.recycle();
                            }
                            c07330Xu.A0C.add(c07380Xz);
                            String str2 = c07380Xz.A02;
                            if (str2 != null) {
                                c07320Xt2.A0E.put(str2, c07380Xz);
                            }
                            c07300Xr3.A01 = c07380Xz.A00 | c07300Xr3.A01;
                        } else if ("group".equals(name)) {
                            C07330Xu c07330Xu2 = new C07330Xu();
                            TypedArray A0G4 = C07O.A0G(resources, theme, attributeSet, C07N.A09);
                            c07330Xu2.A09 = null;
                            c07330Xu2.A02 = C07O.A00(A0G4, xmlPullParser, "rotation", 5, c07330Xu2.A02);
                            c07330Xu2.A00 = A0G4.getFloat(1, c07330Xu2.A00);
                            c07330Xu2.A01 = A0G4.getFloat(2, c07330Xu2.A01);
                            c07330Xu2.A03 = C07O.A00(A0G4, xmlPullParser, "scaleX", 3, c07330Xu2.A03);
                            c07330Xu2.A04 = C07O.A00(A0G4, xmlPullParser, "scaleY", 4, c07330Xu2.A04);
                            c07330Xu2.A05 = C07O.A00(A0G4, xmlPullParser, "translateX", 6, c07330Xu2.A05);
                            c07330Xu2.A06 = C07O.A00(A0G4, xmlPullParser, "translateY", 7, c07330Xu2.A06);
                            String string6 = A0G4.getString(0);
                            if (string6 != null) {
                                c07330Xu2.A08 = string6;
                            }
                            c07330Xu2.A02();
                            A0G4.recycle();
                            c07330Xu.A0C.add(c07330Xu2);
                            arrayDeque.push(c07330Xu2);
                            String str3 = c07330Xu2.A08;
                            if (str3 != null) {
                                c07320Xt2.A0E.put(str3, c07330Xu2);
                            }
                            c07300Xr3.A01 = c07330Xu2.A07 | c07300Xr3.A01;
                        }
                    } else if (eventType == i && "group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser.next();
                    i = 3;
                }
                if (!z2) {
                    this.A01 = A01(c07300Xr.A03, c07300Xr.A07);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(A0G.getPositionDescription());
                sb4.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(A0G.getPositionDescription());
            sb5.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb5.toString());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return C07O.A13(drawable);
        }
        return this.A02.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C07300Xr c07300Xr = this.A02;
        if (c07300Xr != null) {
            C07320Xt c07320Xt = c07300Xr.A08;
            if (c07320Xt.A09 == null) {
                c07320Xt.A09 = Boolean.valueOf(c07320Xt.A0F.A00());
            }
            if (c07320Xt.A09.booleanValue()) {
                return true;
            }
            ColorStateList colorStateList = this.A02.A03;
            return colorStateList != null && colorStateList.isStateful();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.A04 && super.mutate() == this) {
            this.A02 = new C07300Xr(this.A02);
            this.A04 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C07300Xr c07300Xr = this.A02;
        ColorStateList colorStateList = c07300Xr.A03;
        if (colorStateList != null && (mode = c07300Xr.A07) != null) {
            this.A01 = A01(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C07320Xt c07320Xt = c07300Xr.A08;
        if (c07320Xt.A09 == null) {
            c07320Xt.A09 = Boolean.valueOf(c07320Xt.A0F.A00());
        }
        if (c07320Xt.A09.booleanValue()) {
            boolean A01 = c07300Xr.A08.A0F.A01(iArr);
            c07300Xr.A0A |= A01;
            if (A01) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        C07320Xt c07320Xt = this.A02.A08;
        if (c07320Xt.A05 != i) {
            c07320Xt.A05 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C07O.A0b(drawable, z);
        } else {
            this.A02.A09 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.A00 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTint(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C07O.A0X(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C07O.A0Z(drawable, colorStateList);
            return;
        }
        C07300Xr c07300Xr = this.A02;
        if (c07300Xr.A03 != colorStateList) {
            c07300Xr.A03 = colorStateList;
            this.A01 = A01(colorStateList, c07300Xr.A07);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C07O.A0a(drawable, mode);
            return;
        }
        C07300Xr c07300Xr = this.A02;
        if (c07300Xr.A07 != mode) {
            c07300Xr.A07 = mode;
            this.A01 = A01(c07300Xr.A03, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
