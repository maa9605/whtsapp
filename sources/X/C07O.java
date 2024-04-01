package X;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.07O */
/* loaded from: classes.dex */
public class C07O {
    public static LayoutTransition A00;
    public static Class A01;
    public static Field A02;
    public static Field A03;
    public static Field A04;
    public static Field A05;
    public static Field A06;
    public static Field A07;
    public static Method A08;
    public static Method A09;
    public static Method A0A;
    public static Method A0B;
    public static boolean A0C;
    public static boolean A0D;
    public static boolean A0E;
    public static boolean A0F;
    public static boolean A0G;
    public static boolean A0H;
    public static boolean A0I;
    public static boolean A0J;
    public static boolean A0K;
    public static boolean A0L;
    public static boolean A0M;

    public static float A00(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !A19(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int A01(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }

    public static int A02(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2 - i3);
    }

    public static int A03(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() >> 1) + rect.left) - ((rect2.width() >> 1) + rect2.left));
        }
        return Math.abs(((rect.height() >> 1) + rect.top) - ((rect2.height() >> 1) + rect2.top));
    }

    public static int A04(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int A05(Context context, String str) {
        String permissionToOp;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            if (Build.VERSION.SDK_INT < 23 || (permissionToOp = AppOpsManager.permissionToOp(str)) == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                } else {
                    return -1;
                }
            }
            return (Build.VERSION.SDK_INT < 23 || ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) != 0) ? -2 : 0;
        }
        return -1;
    }

    public static int A06(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !A19(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int A07(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder("`");
        sb.append(str);
        sb.append("`");
        return cursor.getColumnIndexOrThrow(sb.toString());
    }

    public static int A08(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!A0F) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    A09 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                A0F = true;
            }
            Method method = A09;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    A09 = null;
                }
            }
        }
        return 0;
    }

    public static int A09(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static int A0A(C0Y0 c0y0, C0Y1 c0y1, View view, View view2, C0SV c0sv, boolean z) {
        if (c0sv.A0A() == 0 || c0y0.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(C0SV.A06(view) - C0SV.A06(view2)) + 1;
        }
        return Math.min(c0y1.A07(), c0y1.A08(view2) - c0y1.A0B(view));
    }

    public static int A0B(C0Y0 c0y0, C0Y1 c0y1, View view, View view2, C0SV c0sv, boolean z) {
        int A002;
        if (c0sv.A0A() == 0 || (A002 = c0y0.A00()) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return A002;
        }
        return (int) (((c0y1.A08(view2) - c0y1.A0B(view)) / (Math.abs(C0SV.A06(view) - C0SV.A06(view2)) + 1)) * c0y0.A00());
    }

    public static int A0C(C0Y0 c0y0, C0Y1 c0y1, View view, View view2, C0SV c0sv, boolean z, boolean z2) {
        if (c0sv.A0A() == 0 || c0y0.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c0y0.A00() - Math.max(C0SV.A06(view), C0SV.A06(view2))) - 1) : Math.max(0, Math.min(C0SV.A06(view), C0SV.A06(view2)));
        if (z) {
            return Math.round((max * (Math.abs(c0y1.A08(view2) - c0y1.A0B(view)) / (Math.abs(C0SV.A06(view) - C0SV.A06(view2)) + 1))) + (c0y1.A06() - c0y1.A0B(view)));
        }
        return max;
    }

    public static int A0D(Object... objArr) {
        int i = Build.VERSION.SDK_INT;
        int hashCode = Arrays.hashCode(objArr);
        if (i >= 19) {
            return hashCode;
        }
        return hashCode;
    }

    public static ObjectAnimator A0E(Object obj, Property property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(obj, new Property(property, path) { // from class: X.0Y2
            public float A00;
            public final float A01;
            public final PathMeasure A02;
            public final PointF A03;
            public final Property A04;
            public final float[] A05;

            {
                super(Float.class, property.getName());
                this.A05 = new float[2];
                this.A03 = new PointF();
                this.A04 = property;
                PathMeasure pathMeasure = new PathMeasure(path, false);
                this.A02 = pathMeasure;
                this.A01 = pathMeasure.getLength();
            }

            @Override // android.util.Property
            public Object get(Object obj2) {
                return Float.valueOf(this.A00);
            }

            @Override // android.util.Property
            public void set(Object obj2, Object obj3) {
                float floatValue = ((Number) obj3).floatValue();
                this.A00 = floatValue;
                float[] fArr = this.A05;
                this.A02.getPosTan(floatValue * this.A01, fArr, null);
                PointF pointF = this.A03;
                pointF.x = fArr[0];
                pointF.y = fArr[1];
                this.A04.set(obj2, pointF);
            }
        }, 0.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object[], java.lang.Object] */
    public static ColorStateList A0F(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray obtainStyledAttributes;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            int i = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr = new int[20];
            int[] iArr2 = new int[20];
            int i2 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                    int[] iArr3 = C0X4.A00;
                    if (theme == null) {
                        obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr3);
                    } else {
                        obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                    }
                    int color = obtainStyledAttributes.getColor(0, -65281);
                    float f = 1.0f;
                    if (obtainStyledAttributes.hasValue(i)) {
                        f = obtainStyledAttributes.getFloat(i, 1.0f);
                    } else if (obtainStyledAttributes.hasValue(2)) {
                        f = obtainStyledAttributes.getFloat(2, 1.0f);
                    }
                    obtainStyledAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i3 = 0;
                    for (int i4 = 0; i4 < attributeCount; i4++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha) {
                            int i5 = i3 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i3] = attributeNameResource;
                            i3 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr4, i3);
                    int round = (Math.round(Color.alpha(color) * f) << 24) | (color & 16777215);
                    int i6 = i2 + 1;
                    if (i6 > iArr2.length) {
                        int i7 = i2 << 1;
                        if (i2 <= 4) {
                            i7 = 8;
                        }
                        int[] iArr5 = new int[i7];
                        System.arraycopy(iArr2, 0, iArr5, 0, i2);
                        iArr2 = iArr5;
                    }
                    iArr2[i2] = round;
                    if (i6 > iArr.length) {
                        ?? r0 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i2 > 4 ? i2 << 1 : 8);
                        System.arraycopy(iArr, 0, r0, 0, i2);
                        iArr = r0;
                    }
                    iArr[i2] = trimStateSet;
                    iArr = iArr;
                    i2 = i6;
                }
                i = 1;
            }
            int[] iArr6 = new int[i2];
            int[][] iArr7 = new int[i2];
            System.arraycopy(iArr2, 0, iArr6, 0, i2);
            System.arraycopy(iArr, 0, iArr7, 0, i2);
            return new ColorStateList(iArr7, iArr6);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    public static TypedArray A0G(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static Path A0H(String str) {
        Path path = new Path();
        C07Q[] A1C = A1C(str);
        if (A1C != null) {
            try {
                C07Q.A01(A1C, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException(C000200d.A0H("Error in parsing ", str), e);
            }
        }
        return null;
    }

    public static Drawable A0I(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof C0DE) ? new C0Y3(drawable) : drawable : !(drawable instanceof C0DE) ? new C0Y4(drawable) : drawable;
    }

    public static Drawable A0J(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!A0C) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                A02 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            A0C = true;
        }
        Field field = A02;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                A02 = null;
            }
        }
        return null;
    }

    public static ActionMode.Callback A0K(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0Y6)) ? callback : new ActionMode.Callback(callback, textView) { // from class: X.0Y6
            public Class A00;
            public Method A01;
            public boolean A02;
            public boolean A03 = false;
            public final ActionMode.Callback A04;
            public final TextView A05;

            {
                this.A04 = callback;
                this.A05 = textView;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return this.A04.onActionItemClicked(actionMode, menuItem);
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return this.A04.onCreateActionMode(actionMode, menu);
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
                this.A04.onDestroyActionMode(actionMode);
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                boolean z;
                String str;
                TextView textView2 = this.A05;
                Context context = textView2.getContext();
                PackageManager packageManager = context.getPackageManager();
                if (!this.A03) {
                    this.A03 = true;
                    try {
                        Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                        this.A00 = cls;
                        this.A01 = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                        this.A02 = true;
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        this.A00 = null;
                        this.A01 = null;
                        this.A02 = false;
                    }
                }
                try {
                    Method declaredMethod = (this.A02 && this.A00.isInstance(menu)) ? this.A01 : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                    for (int size = menu.size() - 1; size >= 0; size--) {
                        MenuItem item = menu.getItem(size);
                        if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                            declaredMethod.invoke(menu, Integer.valueOf(size));
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    if (context instanceof Activity) {
                        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                            String packageName = context.getPackageName();
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (packageName.equals(activityInfo.packageName) || (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0))) {
                                arrayList.add(resolveInfo);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i2);
                        MenuItem add = menu.add(0, 0, i2 + 100, resolveInfo2.loadLabel(packageManager));
                        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                        if ((textView2 instanceof Editable) && textView2.onCheckIsTextEditor()) {
                            z = true;
                            if (textView2.isEnabled()) {
                                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z);
                                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                            }
                        }
                        z = false;
                        Intent putExtra2 = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z);
                        ActivityInfo activityInfo22 = resolveInfo2.activityInfo;
                        add.setIntent(putExtra2.setClassName(activityInfo22.packageName, activityInfo22.name)).setShowAsAction(1);
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
                return this.A04.onPrepareActionMode(actionMode, menu);
            }
        };
    }

    public static Interpolator A0L(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new Interpolator(f, f2, f3, f4) { // from class: X.0Y7
            public final float[] A00;
            public final float[] A01;

            {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
                PathMeasure pathMeasure = new PathMeasure(path, false);
                float length = pathMeasure.getLength();
                int i = ((int) (length / 0.002f)) + 1;
                this.A00 = new float[i];
                this.A01 = new float[i];
                float[] fArr = new float[2];
                for (int i2 = 0; i2 < i; i2++) {
                    pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
                    this.A00[i2] = fArr[0];
                    this.A01[i2] = fArr[1];
                }
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f5) {
                if (f5 <= 0.0f) {
                    return 0.0f;
                }
                if (f5 >= 1.0f) {
                    return 1.0f;
                }
                int i = 0;
                float[] fArr = this.A00;
                int length = fArr.length - 1;
                while (length - i > 1) {
                    int i2 = (i + length) >> 1;
                    if (f5 < fArr[i2]) {
                        length = i2;
                    } else {
                        i = i2;
                    }
                }
                float f6 = fArr[length];
                float f7 = fArr[i];
                float f8 = f6 - f7;
                if (f8 == 0.0f) {
                    return this.A01[i];
                }
                float[] fArr2 = this.A01;
                float f9 = fArr2[i];
                return ((fArr2[length] - f9) * ((f5 - f7) / f8)) + f9;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x016c, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r9.getPositionDescription());
        r1.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0186, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C07370Xy A0M(android.content.res.TypedArray r24, org.xmlpull.v1.XmlPullParser r25, android.content.res.Resources.Theme r26, java.lang.String r27, int r28) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07O.A0M(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):X.0Xy");
    }

    public static C0Y9 A0N(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0Y9(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        int i3 = 0;
        if (i >= 23) {
            i2 = 1;
            i3 = 1;
        }
        if (i >= 18) {
            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        } else {
            textDirectionHeuristic = null;
        }
        if (i >= 23) {
            i2 = textView.getBreakStrategy();
            i3 = textView.getHyphenationFrequency();
        }
        if (i >= 18) {
            if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else if (i >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            } else {
                boolean z = textView.getLayoutDirection() == 1;
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            }
        }
        return new C0Y9(textPaint, textDirectionHeuristic, i2, i3);
    }

    public static File A0O(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder A0P = C000200d.A0P(".font");
        A0P.append(Process.myPid());
        A0P.append("-");
        A0P.append(Process.myTid());
        A0P.append("-");
        String obj = A0P.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, C000200d.A0D(obj, i));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static String A0P(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(R.string.fingerprint_error_user_canceled);
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        return context.getString(R.string.fingerprint_error_no_fingerprints);
                    case 12:
                        return context.getString(R.string.fingerprint_error_hw_not_present);
                    default:
                        StringBuilder sb = new StringBuilder("Unknown error code: ");
                        sb.append(i);
                        Log.e("BiometricUtils", sb.toString());
                        return context.getString(R.string.default_error_msg);
                }
            }
            return context.getString(R.string.fingerprint_error_lockout);
        }
        return context.getString(R.string.fingerprint_error_hw_not_available);
    }

    public static String A0Q(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static ByteBuffer A0R(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public static List A0S(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void A0T(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    public static void A0U(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                A0U(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof C0Y5) {
                A0U(((C0Y5) drawable).AE4());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        A0U(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static void A0V(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static void A0W(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            drawable.setLayoutDirection(i);
        } else if (i2 >= 17) {
            if (!A0J) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    A0A = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                A0J = true;
            }
            Method method = A0A;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    A0A = null;
                }
            }
        }
    }

    public static void A0X(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (!(drawable instanceof C0DE)) {
        } else {
            ((C0DE) drawable).setTint(i);
        }
    }

    public static void A0Y(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void A0Z(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (!(drawable instanceof C0DE)) {
        } else {
            ((C0DE) drawable).setTintList(colorStateList);
        }
    }

    public static void A0a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (!(drawable instanceof C0DE)) {
        } else {
            ((C0DE) drawable).setTintMode(mode);
        }
    }

    public static void A0b(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static void A0c(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C0YA c0ya = C0YA.A0A;
        if (c0ya != null && c0ya.A05 == view) {
            C0YA.A00(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0YA c0ya2 = C0YA.A09;
            if (c0ya2 != null && c0ya2.A05 == view) {
                c0ya2.A01();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C0YA(view, charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x00e7, code lost:
        if (r4 == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0d(android.view.ViewGroup r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07O.A0d(android.view.ViewGroup, boolean):void");
    }

    public static void A0e(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC02890Dh) {
            ((InterfaceC02890Dh) viewParent).AMK(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT < 21) {
                if (!(viewParent instanceof InterfaceC02900Di)) {
                    return;
                }
                ((InterfaceC02900Di) viewParent).onNestedPreScroll(view, i, i2, iArr);
                return;
            }
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static void A0f(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void A0g(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    public static void A0h(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintList(colorStateList);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (!(imageView instanceof InterfaceC04870Mf)) {
        } else {
            ((InterfaceC04870Mf) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static void A0i(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintMode(mode);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (!(imageView instanceof InterfaceC04870Mf)) {
        } else {
            ((InterfaceC04870Mf) imageView).setSupportImageTintMode(mode);
        }
    }

    public static void A0j(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!A0K) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                A0B = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            A0K = true;
        }
        Method method = A0B;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static void A0k(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i < 21) {
        } else {
            if (!A0H) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    A05 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                A0H = true;
            }
            Field field = A05;
            if (field == null) {
                return;
            }
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
            }
        }
    }

    public static void A0l(TextView textView, int i) {
        int i2;
        if (i >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setFirstBaselineToTopHeight(i);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.top;
            } else {
                i2 = fontMetricsInt.ascent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void A0m(TextView textView, int i) {
        int i2;
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
            } else {
                i2 = fontMetricsInt.descent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void A0n(TextView textView, int i) {
        if (i >= 0) {
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing(i - fontMetricsInt, 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void A0o(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void A0p(TextView textView, ColorStateList colorStateList) {
        if (textView != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                textView.setCompoundDrawableTintList(colorStateList);
                return;
            } else if (!(textView instanceof InterfaceC02720Cp)) {
                return;
            } else {
                ((InterfaceC02720Cp) textView).setSupportCompoundDrawablesTintList(colorStateList);
                return;
            }
        }
        throw null;
    }

    public static void A0q(TextView textView, PorterDuff.Mode mode) {
        if (textView != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                textView.setCompoundDrawableTintMode(mode);
                return;
            } else if (!(textView instanceof InterfaceC02720Cp)) {
                return;
            } else {
                ((InterfaceC02720Cp) textView).setSupportCompoundDrawablesTintMode(mode);
                return;
            }
        }
        throw null;
    }

    public static void A0r(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            Drawable drawable5 = drawable3;
            if (textView.getLayoutDirection() != 1) {
                drawable5 = drawable;
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void A0s(TextView textView, C0YC c0yc) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (c0yc != null) {
                textView.setText((CharSequence) null);
                return;
            }
            throw null;
        }
        C0Y9 A0N = A0N(textView);
        if (c0yc != null) {
            if (A0N.A00(null)) {
                textView.setText(c0yc);
                return;
            }
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:458:0x010d, code lost:
        if (r3[r12].A03.A06 == r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x014e, code lost:
        if (r13.A0I == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0184, code lost:
        if (r2 == 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0186, code lost:
        r27 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x01a1, code lost:
        if (r10.A0l[r39] != 0) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x01cd, code lost:
        if (r27 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x043c, code lost:
        if (r13.A05 != r8) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0451, code lost:
        if (r10 == r0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x050c, code lost:
        if (r13.A05 != r9) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x05ad, code lost:
        if (r9 != null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0606, code lost:
        if (r27 != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x063f, code lost:
        if (r2 == 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0643, code lost:
        r27 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:571:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0562  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0t(X.C0YD r37, X.C0YG r38, int r39) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07O.A0t(X.0YD, X.0YG, int):void");
    }

    public static void A0u(Object obj) {
        if (!A0L) {
            try {
                A01 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            A0L = true;
        }
        Class cls = A01;
        if (cls == null) {
            return;
        }
        if (!A0M) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                A07 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            A0M = true;
        }
        Field field = A07;
        if (field == null) {
            return;
        }
        try {
            LongSparseArray longSparseArray = (LongSparseArray) field.get(obj);
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
    }

    public static void A0v(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        String simpleName = cls.getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = cls.getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A0w(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            } else {
                continue;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static void A0x(XmlSerializer xmlSerializer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static boolean A0y(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        } else if (i != 32783) {
            return i == 33023 || i == 0;
        } else {
            int i2 = Build.VERSION.SDK_INT;
            return i2 < 28 || i2 > 29;
        }
    }

    public static boolean A0z(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0024, code lost:
        if (r11.bottom <= r13.top) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0026, code lost:
        r2 = A02(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002a, code lost:
        if (r10 == 17) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002c, code lost:
        if (r10 == 33) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x002e, code lost:
        if (r10 == 66) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0030, code lost:
        if (r10 != 130) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0032, code lost:
        r1 = r13.bottom;
        r0 = r11.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003b, code lost:
        if (r2 >= java.lang.Math.max(1, r1 - r0)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x003d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003f, code lost:
        r1 = r13.right;
        r0 = r11.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0044, code lost:
        r1 = r11.top;
        r0 = r13.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0049, code lost:
        r1 = r11.left;
        r0 = r13.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0052, code lost:
        if (r11.top >= r13.bottom) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x005a, code lost:
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A10(int r10, android.graphics.Rect r11, android.graphics.Rect r12, android.graphics.Rect r13) {
        /*
            boolean r1 = A0z(r10, r11, r12)
            boolean r0 = A0z(r10, r11, r13)
            r9 = 0
            if (r0 != 0) goto L70
            if (r1 == 0) goto L70
            java.lang.String r7 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r8 = 130(0x82, float:1.82E-43)
            r6 = 33
            r5 = 66
            r4 = 17
            r3 = 1
            if (r10 == r4) goto L68
            if (r10 == r6) goto L4e
            if (r10 == r5) goto L61
            if (r10 != r8) goto L5b
            int r1 = r11.bottom
            int r0 = r13.top
            if (r1 > r0) goto L6f
        L26:
            int r2 = A02(r10, r11, r12)
            if (r10 == r4) goto L49
            if (r10 == r6) goto L44
            if (r10 == r5) goto L3f
            if (r10 != r8) goto L55
            int r1 = r13.bottom
            int r0 = r11.bottom
        L36:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r3, r1)
            if (r2 >= r0) goto L3e
            r9 = 1
        L3e:
            return r9
        L3f:
            int r1 = r13.right
            int r0 = r11.right
            goto L36
        L44:
            int r1 = r11.top
            int r0 = r13.top
            goto L36
        L49:
            int r1 = r11.left
            int r0 = r13.left
            goto L36
        L4e:
            int r1 = r11.top
            int r0 = r13.bottom
            if (r1 < r0) goto L6f
            goto L26
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L61:
            int r1 = r11.right
            int r0 = r13.left
            if (r1 > r0) goto L6f
            return r3
        L68:
            int r1 = r11.left
            int r0 = r13.right
            if (r1 < r0) goto L6f
            return r3
        L6f:
            return r3
        L70:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07O.A10(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean A11(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A12(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean A13(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static boolean A14(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        } else if (viewParent instanceof InterfaceC02900Di) {
            return ((InterfaceC02900Di) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    public static boolean A15(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        } else if (viewParent instanceof InterfaceC02900Di) {
            return ((InterfaceC02900Di) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean A16(File file, Resources resources, int i) {
        try {
            InputStream openRawResource = resources.openRawResource(i);
            try {
                boolean A17 = A17(file, openRawResource);
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return A17;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x004d, code lost:
        if (r5 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A17(java.io.File r8, java.io.InputStream r9) {
        /*
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskWrites()
            r6 = 0
            r5 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L4c
            r4.<init>(r8, r6)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L4c
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
        Lf:
            int r1 = r9.read(r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            r0 = -1
            if (r1 == r0) goto L1a
            r4.write(r2, r6, r1)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
            goto Lf
        L1a:
            r0 = 1
            r4.close()     // Catch: java.io.IOException -> L1e
        L1e:
            android.os.StrictMode.setThreadPolicy(r7)
            return r0
        L22:
            r0 = move-exception
            r5 = r4
            goto L4f
        L25:
            r3 = move-exception
            r5 = r4
            goto L29
        L28:
            r3 = move-exception
        L29:
            java.lang.String r2 = "TypefaceCompatUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "Error copying resource contents to temp file: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.io.IOException -> L48
        L48:
            android.os.StrictMode.setThreadPolicy(r7)
            return r6
        L4c:
            r0 = move-exception
            if (r5 == 0) goto L52
        L4f:
            r5.close()     // Catch: java.io.IOException -> L52
        L52:
            android.os.StrictMode.setThreadPolicy(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07O.A17(java.io.File, java.io.InputStream):boolean");
    }

    public static boolean A18(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            if (obj != obj2) {
                return obj != null && obj.equals(obj2);
            }
            return true;
        } else if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        } else {
            return true;
        }
    }

    public static boolean A19(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean A1A(C07Q[] c07qArr, C07Q[] c07qArr2) {
        int length;
        if (c07qArr == null || c07qArr2 == null || (length = c07qArr.length) != c07qArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (c07qArr[i].A00 != c07qArr2[i].A00 || c07qArr[i].A01.length != c07qArr2[i].A01.length) {
                return false;
            }
        }
        return true;
    }

    public static Drawable[] A1B(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i >= 17) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
        return textView.getCompoundDrawables();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C07Q[] A1C(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07O.A1C(java.lang.String):X.07Q[]");
    }

    public static C07Q[] A1D(C07Q[] c07qArr) {
        if (c07qArr == null) {
            return null;
        }
        int length = c07qArr.length;
        C07Q[] c07qArr2 = new C07Q[length];
        for (int i = 0; i < length; i++) {
            c07qArr2[i] = new C07Q(c07qArr[i]);
        }
        return c07qArr2;
    }
}
