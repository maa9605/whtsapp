package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Us */
/* loaded from: classes.dex */
public final class C06720Us {
    public static C06720Us A07;
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public static final C0VK A09 = new C06F() { // from class: X.0VK
    };
    public TypedValue A00;
    public C0VQ A01;
    public C006702y A02;
    public C07270Xo A03;
    public WeakHashMap A04;
    public boolean A05;
    public final WeakHashMap A06 = new WeakHashMap(0);

    public static synchronized PorterDuffColorFilter A00(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C06720Us.class) {
            C0VK c0vk = A09;
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c0vk.A04(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                c0vk.A08(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized C06720Us A01() {
        C06720Us c06720Us;
        synchronized (C06720Us.class) {
            if (A07 == null) {
                C06720Us c06720Us2 = new C06720Us();
                A07 = c06720Us2;
                if (Build.VERSION.SDK_INT < 24) {
                    C0VM c0vm = new C0VM() { // from class: X.0VL
                        @Override // X.C0VM
                        public Drawable A6n(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                            try {
                                Resources resources = context.getResources();
                                C07280Xp c07280Xp = new C07280Xp();
                                c07280Xp.inflate(resources, xmlPullParser, attributeSet, theme);
                                return c07280Xp;
                            } catch (Exception e) {
                                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                                return null;
                            }
                        }
                    };
                    C006702y c006702y = c06720Us2.A02;
                    if (c006702y == null) {
                        c006702y = new C006702y();
                        c06720Us2.A02 = c006702y;
                    }
                    c006702y.put("vector", c0vm);
                    C0VM c0vm2 = new C0VM() { // from class: X.0VN
                        @Override // X.C0VM
                        public Drawable A6n(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                            try {
                                Resources resources = context.getResources();
                                C38801p0 c38801p0 = new C38801p0(context);
                                c38801p0.inflate(resources, xmlPullParser, attributeSet, theme);
                                return c38801p0;
                            } catch (Exception e) {
                                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                                return null;
                            }
                        }
                    };
                    C006702y c006702y2 = c06720Us2.A02;
                    if (c006702y2 == null) {
                        c006702y2 = new C006702y();
                        c06720Us2.A02 = c006702y2;
                    }
                    c006702y2.put("animated-vector", c0vm2);
                    C0VM c0vm3 = new C0VM() { // from class: X.0VO
                        @Override // X.C0VM
                        public Drawable A6n(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                            try {
                                return C38241nm.A00(context, context.getResources(), xmlPullParser, attributeSet, theme);
                            } catch (Exception e) {
                                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                                return null;
                            }
                        }
                    };
                    C006702y c006702y3 = c06720Us2.A02;
                    if (c006702y3 == null) {
                        c006702y3 = new C006702y();
                        c06720Us2.A02 = c006702y3;
                    }
                    c006702y3.put("animated-selector", c0vm3);
                }
            }
            c06720Us = A07;
        }
        return c06720Us;
    }

    public static void A02(Drawable drawable, C08020aT c08020aT, int[] iArr) {
        if (C0YO.A03(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = c08020aT.A02;
        if (!z && !c08020aT.A03) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? c08020aT.A00 : null;
            PorterDuff.Mode mode = c08020aT.A03 ? c08020aT.A01 : A08;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = A00(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized ColorStateList A03(Context context, int i) {
        ColorStateList colorStateList;
        C07270Xo c07270Xo;
        WeakHashMap weakHashMap = this.A04;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c07270Xo = (C07270Xo) weakHashMap.get(context)) == null) ? null : (ColorStateList) c07270Xo.A02(i, null);
        if (colorStateList == null) {
            if (this.A01 != null) {
                C0VP c0vp = (C0VP) this.A01;
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateList2 = C09L.A00(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateList2 = C09L.A00(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3];
                    int[] iArr2 = new int[3];
                    ColorStateList A02 = C11490hq.A02(context, R.attr.colorSwitchThumbNormal);
                    if (A02 != null && A02.isStateful()) {
                        iArr[0] = C11490hq.A02;
                        iArr2[0] = A02.getColorForState(iArr[0], 0);
                        iArr[1] = C11490hq.A01;
                        iArr2[1] = C11490hq.A01(context, R.attr.colorControlActivated);
                        iArr[2] = C11490hq.A03;
                        iArr2[2] = A02.getDefaultColor();
                    } else {
                        iArr[0] = C11490hq.A02;
                        iArr2[0] = C11490hq.A00(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = C11490hq.A01;
                        iArr2[1] = C11490hq.A01(context, R.attr.colorControlActivated);
                        iArr[2] = C11490hq.A03;
                        iArr2[2] = C11490hq.A01(context, R.attr.colorSwitchThumbNormal);
                    }
                    colorStateList2 = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateList2 = C0VP.A00(context, C11490hq.A01(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateList2 = C0VP.A00(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateList2 = C0VP.A00(context, C11490hq.A01(context, R.attr.colorAccent));
                } else if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                    if (C0VP.A02(c0vp.A04, i)) {
                        colorStateList2 = C11490hq.A02(context, R.attr.colorControlNormal);
                    } else if (C0VP.A02(c0vp.A05, i)) {
                        colorStateList2 = C09L.A00(context, R.color.abc_tint_default);
                    } else if (C0VP.A02(c0vp.A03, i)) {
                        colorStateList2 = C09L.A00(context, R.color.abc_tint_btn_checkable);
                    } else if (i == R.drawable.abc_seekbar_thumb_material) {
                        colorStateList2 = C09L.A00(context, R.color.abc_tint_seek_thumb);
                    }
                } else {
                    colorStateList2 = C09L.A00(context, R.color.abc_tint_spinner);
                }
            }
            if (colorStateList2 != null) {
                if (this.A04 == null) {
                    this.A04 = new WeakHashMap();
                }
                C07270Xo c07270Xo2 = (C07270Xo) this.A04.get(context);
                if (c07270Xo2 == null) {
                    c07270Xo2 = new C07270Xo(10);
                    this.A04.put(context, c07270Xo2);
                }
                c07270Xo2.A04(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public synchronized Drawable A04(Context context, int i) {
        return A05(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x01bd, code lost:
        if (r8 != false) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.graphics.drawable.Drawable A05(android.content.Context r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06720Us.A05(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable A06(Context context, long j) {
        C05I c05i = (C05I) this.A06.get(context);
        if (c05i == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c05i.A04(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c05i.A07(j);
        }
        return null;
    }

    public final synchronized void A07(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.A06;
            C05I c05i = (C05I) weakHashMap.get(context);
            if (c05i == null) {
                c05i = new C05I();
                weakHashMap.put(context, c05i);
            }
            c05i.A09(j, new WeakReference(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            X.0VQ r1 = r6.A01
            r5 = 1
            if (r1 == 0) goto L65
            X.0VP r1 = (X.C0VP) r1
            if (r1 == 0) goto L63
            android.graphics.PorterDuff$Mode r3 = X.C0UV.A02
            int[] r0 = r1.A02
            boolean r0 = X.C0VP.A02(r0, r8)
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            r2 = -1
            if (r0 == 0) goto L36
            r4 = 2130968768(0x7f0400c0, float:1.7546199E38)
        L1a:
            r1 = -1
        L1b:
            boolean r0 = X.C0YO.A03(r9)
            if (r0 == 0) goto L25
            android.graphics.drawable.Drawable r9 = r9.mutate()
        L25:
            int r0 = X.C11490hq.A01(r7, r4)
            android.graphics.PorterDuffColorFilter r0 = X.C0UV.A00(r0, r3)
            r9.setColorFilter(r0)
            if (r1 == r2) goto L35
            r9.setAlpha(r1)
        L35:
            return r5
        L36:
            int[] r0 = r1.A01
            boolean r0 = X.C0VP.A02(r0, r8)
            if (r0 == 0) goto L42
            r4 = 2130968766(0x7f0400be, float:1.7546195E38)
            goto L1a
        L42:
            int[] r0 = r1.A00
            boolean r0 = X.C0VP.A02(r0, r8)
            if (r0 == 0) goto L4d
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L1a
        L4d:
            r0 = 2131230881(0x7f0800a1, float:1.8077827E38)
            if (r8 != r0) goto L5d
            r4 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r0)
            goto L1b
        L5d:
            r0 = 2131230857(0x7f080089, float:1.8077779E38)
            if (r8 != r0) goto L65
            goto L1a
        L63:
            r0 = 0
            throw r0
        L65:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06720Us.A08(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
