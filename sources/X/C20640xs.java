package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import java.util.WeakHashMap;

/* renamed from: X.0xs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C20640xs {
    public static final TextUtils.TruncateAt[] A02 = TextUtils.TruncateAt.values();
    public static final C07Z A00 = C07Z.TEXT_START;
    public static final WeakHashMap A01 = new WeakHashMap();

    public static C07Z A00(int i, int i2) {
        C07Z c07z = C07Z.LAYOUT_END;
        C07Z c07z2 = C07Z.LAYOUT_START;
        C07Z c07z3 = C07Z.CENTER;
        switch (i) {
            case 0:
            case 1:
                int i3 = 8388615 & i2;
                if (i3 != 1) {
                    if (i3 != 3) {
                        if (i3 != 5) {
                            if (i3 != 8388611) {
                                if (i3 == 8388613) {
                                    return c07z;
                                }
                                return A00;
                            }
                            return c07z2;
                        }
                        return C07Z.RIGHT;
                    }
                    return C07Z.LEFT;
                }
                return c07z3;
            case 2:
                return C07Z.TEXT_START;
            case 3:
                return C07Z.TEXT_END;
            case 4:
                return c07z3;
            case 5:
                return c07z2;
            case 6:
                return c07z;
            default:
                return A00;
        }
    }

    public static C07S A01(Context context) {
        C07S c07s;
        TypedArray obtainStyledAttributes;
        TypedArray obtainStyledAttributes2;
        TypedArray obtainStyledAttributes3;
        TypedArray obtainStyledAttributes4;
        Resources.Theme theme = context.getTheme();
        WeakHashMap weakHashMap = A01;
        synchronized (weakHashMap) {
            c07s = (C07S) weakHashMap.get(theme);
        }
        if (c07s == null) {
            c07s = new C07S();
            C1YX.A00("LoadTextStyle", null);
            Resources.Theme theme2 = context.getTheme();
            if (Build.VERSION.SDK_INT > 22) {
                obtainStyledAttributes = context.obtainStyledAttributes(null, C20630xq.A01, 0, 0);
            } else {
                synchronized (theme2) {
                    obtainStyledAttributes = context.obtainStyledAttributes(null, C20630xq.A01, 0, 0);
                }
            }
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                if (Build.VERSION.SDK_INT <= 22) {
                    synchronized (theme2) {
                        obtainStyledAttributes4 = theme2.obtainStyledAttributes(resourceId, C20630xq.A00);
                    }
                } else {
                    obtainStyledAttributes4 = theme2.obtainStyledAttributes(resourceId, C20630xq.A00);
                }
                A02(obtainStyledAttributes4, c07s);
                obtainStyledAttributes4.recycle();
            }
            if (Build.VERSION.SDK_INT > 22) {
                obtainStyledAttributes2 = context.obtainStyledAttributes(null, C20630xq.A02, 0, 0);
            } else {
                synchronized (theme2) {
                    obtainStyledAttributes2 = context.obtainStyledAttributes(null, C20630xq.A02, 0, 0);
                }
            }
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId2 != -1) {
                if (Build.VERSION.SDK_INT <= 22) {
                    synchronized (theme2) {
                        obtainStyledAttributes3 = theme2.obtainStyledAttributes(resourceId2, C20630xq.A00);
                    }
                } else {
                    obtainStyledAttributes3 = theme2.obtainStyledAttributes(resourceId2, C20630xq.A00);
                }
                A02(obtainStyledAttributes3, c07s);
                obtainStyledAttributes3.recycle();
            }
            C20500xd.A00();
            synchronized (weakHashMap) {
                weakHashMap.put(theme, c07s);
            }
        }
        return c07s.A00();
    }

    public static void A02(TypedArray typedArray, C07S c07s) {
        int indexCount = typedArray.getIndexCount();
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            if (index == 2) {
                c07s.A0N = typedArray.getColorStateList(index);
                c07s.A0K = 0;
            } else if (index == 0) {
                c07s.A0L = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                int integer = typedArray.getInteger(index, 0);
                if (integer > 0) {
                    c07s.A0P = A02[integer - 1];
                }
            } else if (index == 25) {
                if (Build.VERSION.SDK_INT >= 17) {
                    i = typedArray.getInt(index, -1);
                    c07s.A0R = A00(i, i2);
                }
            } else if (index == 6) {
                i2 = typedArray.getInt(index, -1);
                c07s.A0R = A00(i, i2);
                EnumC016707t enumC016707t = EnumC016707t.TOP;
                int i4 = i2 & 112;
                if (i4 == 16) {
                    enumC016707t = EnumC016707t.CENTER;
                } else if (i4 != 48 && i4 == 80) {
                    enumC016707t = EnumC016707t.BOTTOM;
                }
                c07s.A0S = enumC016707t;
            } else if (index == 15) {
                c07s.A0V = typedArray.getBoolean(index, false);
            } else if (index == 11) {
                c07s.A0H = typedArray.getInteger(index, -1);
            } else if (index == 10) {
                c07s.A0E = typedArray.getInteger(index, -1);
            } else if (index == 14) {
                c07s.A0W = typedArray.getBoolean(index, false);
            } else if (index == 4) {
                c07s.A0C = typedArray.getColor(index, 0);
            } else if (index == 3) {
                c07s.A07 = typedArray.getColor(index, 0);
            } else if (index == 1) {
                c07s.A0M = typedArray.getInteger(index, 0);
            } else if (index == 20) {
                c07s.A00 = typedArray.getDimensionPixelOffset(index, 0);
            } else if (index == 21) {
                c07s.A05 = typedArray.getFloat(index, 0.0f);
            } else if (index == 17) {
                c07s.A02 = typedArray.getFloat(index, 0.0f);
            } else if (index == 18) {
                c07s.A03 = typedArray.getFloat(index, 0.0f);
            } else if (index == 19) {
                c07s.A04 = typedArray.getFloat(index, 0.0f);
            } else if (index == 16) {
                c07s.A0J = typedArray.getColor(index, 0);
            } else if (index == 13) {
                c07s.A0G = typedArray.getInteger(index, -1);
            } else if (index == 12) {
                c07s.A0D = typedArray.getInteger(index, -1);
            } else if (index == 8) {
                c07s.A0I = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                c07s.A0F = typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE);
            } else if (index == 24) {
                String string = typedArray.getString(index);
                if (string != null) {
                    c07s.A0O = Typeface.create(string, 0);
                }
            } else if (index == 26) {
                if (Build.VERSION.SDK_INT >= 23) {
                    c07s.A06 = typedArray.getInt(index, 0);
                }
            } else if (index == 27) {
                if (Build.VERSION.SDK_INT >= 23) {
                    c07s.A0A = typedArray.getInt(index, 0);
                }
            } else if (index == 28 && Build.VERSION.SDK_INT >= 26) {
                c07s.A0B = typedArray.getInt(index, 0);
            }
        }
    }
}
