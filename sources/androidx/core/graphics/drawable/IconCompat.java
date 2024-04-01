package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode A09 = PorterDuff.Mode.SRC_IN;
    public int A00;
    public int A01;
    public int A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public Parcelable A05;
    public Object A06;
    public String A07;
    public byte[] A08;

    public IconCompat() {
        this.A02 = -1;
        this.A08 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A09;
        this.A07 = null;
    }

    public IconCompat(int i) {
        this.A02 = -1;
        this.A08 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A09;
        this.A07 = null;
        this.A02 = i;
    }

    public static Resources A00(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    public static Bitmap A01(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) >> 1, (-(bitmap.getHeight() - min)) >> 1);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat A02(Context context, int i) {
        if (context != null) {
            return A03(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat A03(Resources resources, String str, int i) {
        if (str != null) {
            if (i != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.A00 = i;
                if (resources != null) {
                    try {
                        iconCompat.A06 = resources.getResourceName(i);
                        return iconCompat;
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                }
                iconCompat.A06 = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    public static IconCompat A04(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.A06 = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public int A05() {
        int i;
        int i2 = this.A02;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.A06;
            if (i >= 28) {
                return icon.getResId();
            }
            int i3 = 0;
            try {
                i3 = ((Number) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
                return i3;
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return i3;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return i3;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return i3;
            }
        } else if (i2 == 2) {
            return this.A00;
        } else {
            StringBuilder sb = new StringBuilder("called getResId() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public int A06() {
        int i;
        int i2 = this.A02;
        int i3 = -1;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.A06;
            if (i >= 28) {
                return icon.getType();
            }
            try {
                i3 = ((Number) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
                return i3;
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(icon);
                Log.e("IconCompat", sb.toString(), e);
                return i3;
            } catch (NoSuchMethodException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(icon);
                Log.e("IconCompat", sb2.toString(), e2);
                return i3;
            } catch (InvocationTargetException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to get icon type ");
                sb3.append(icon);
                Log.e("IconCompat", sb3.toString(), e3);
                return i3;
            }
        }
        return i2;
    }

    public Icon A07() {
        Icon createWithBitmap;
        int i = this.A02;
        if (i != -1) {
            if (i == 1) {
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.A06);
            } else if (i == 2) {
                createWithBitmap = Icon.createWithResource(A08(), this.A00);
            } else if (i == 3) {
                createWithBitmap = Icon.createWithData((byte[]) this.A06, this.A00, this.A01);
            } else if (i == 4) {
                createWithBitmap = Icon.createWithContentUri((String) this.A06);
            } else if (i == 5) {
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.A06);
                } else {
                    createWithBitmap = Icon.createWithBitmap(A01((Bitmap) this.A06, false));
                }
            } else {
                throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = this.A03;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = this.A04;
            if (mode != A09) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
        return (Icon) this.A06;
    }

    public String A08() {
        int i;
        int i2 = this.A02;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.A06;
            if (i >= 28) {
                return icon.getResPackage();
            }
            try {
                return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        } else if (i2 == 2) {
            return ((String) this.A06).split(":", -1)[0];
        } else {
            StringBuilder sb = new StringBuilder("called getResPackage() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void A09(Context context) {
        if (this.A02 == 2) {
            String str = (String) this.A06;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                int identifier = A00(context, str5).getIdentifier(str4, str3, str5);
                if (this.A00 != identifier) {
                    StringBuilder sb = new StringBuilder("Id has changed for ");
                    sb.append(str5);
                    sb.append("/");
                    sb.append(str4);
                    Log.i("IconCompat", sb.toString());
                    this.A00 = identifier;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x002f, code lost:
        if (r7 != 5) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r8 = this;
            int r7 = r8.A02
            r0 = -1
            if (r7 != r0) goto Lc
            java.lang.Object r0 = r8.A06
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.String r0 = "Icon(typ="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r6 = 5
            r5 = 4
            r4 = 3
            r2 = 2
            r1 = 1
            if (r7 == r1) goto Ld1
            if (r7 == r2) goto Lcd
            if (r7 == r4) goto Lc9
            if (r7 == r5) goto Lc5
            if (r7 == r6) goto Lc1
            java.lang.String r0 = "UNKNOWN"
        L24:
            r3.append(r0)
            if (r7 == r1) goto L9f
            if (r7 == r2) goto L77
            if (r7 == r4) goto L60
            if (r7 == r5) goto L55
            if (r7 == r6) goto L9f
        L31:
            android.content.res.ColorStateList r1 = r8.A03
            if (r1 == 0) goto L3d
            java.lang.String r0 = " tint="
            r3.append(r0)
            r3.append(r1)
        L3d:
            android.graphics.PorterDuff$Mode r1 = r8.A04
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.A09
            if (r1 == r0) goto L4b
            java.lang.String r0 = " mode="
            r3.append(r0)
            r3.append(r1)
        L4b:
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L55:
            java.lang.String r0 = " uri="
            r3.append(r0)
            java.lang.Object r0 = r8.A06
            r3.append(r0)
            goto L31
        L60:
            java.lang.String r0 = " len="
            r3.append(r0)
            int r0 = r8.A00
            r3.append(r0)
            int r1 = r8.A01
            if (r1 == 0) goto L31
            java.lang.String r0 = " off="
            r3.append(r0)
            r3.append(r1)
            goto L31
        L77:
            java.lang.String r0 = " pkg="
            r3.append(r0)
            java.lang.String r0 = r8.A08()
            r3.append(r0)
            java.lang.String r0 = " id="
            r3.append(r0)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            int r0 = r8.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.String r0 = "0x%08x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r3.append(r0)
            goto L31
        L9f:
            java.lang.String r0 = " size="
            r3.append(r0)
            java.lang.Object r0 = r8.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r0 = r0.getWidth()
            r3.append(r0)
            java.lang.String r0 = "x"
            r3.append(r0)
            java.lang.Object r0 = r8.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r0 = r0.getHeight()
            r3.append(r0)
            goto L31
        Lc1:
            java.lang.String r0 = "BITMAP_MASKABLE"
            goto L24
        Lc5:
            java.lang.String r0 = "URI"
            goto L24
        Lc9:
            java.lang.String r0 = "DATA"
            goto L24
        Lcd:
            java.lang.String r0 = "RESOURCE"
            goto L24
        Ld1:
            java.lang.String r0 = "BITMAP"
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
