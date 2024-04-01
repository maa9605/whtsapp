package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: X.0LX */
/* loaded from: classes.dex */
public class C0LX {
    public static final Object A00 = new Object();
    public static final boolean A01;

    static {
        A01 = Build.VERSION.SDK_INT >= 17;
    }

    public static int A00(int i) {
        if (!A01 || (8388608 & i) == 0) {
            int i2 = i & 7;
            return i2 == 5 ? (i & (-8)) | 3 : i2 == 3 ? (i & (-8)) | 5 : i;
        }
        return i;
    }

    public static String A01(C002301c c002301c, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char c = c002301c.A0M() ? (char) 8206 : (char) 8207;
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char c = A0D(str) ? (char) 8206 : (char) 8207;
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static void A03(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setTextDirection(3);
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("setTextDirection", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(view, 3);
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            Log.e(e);
        }
    }

    public static void A04(C002301c c002301c, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        ListView listView;
        Drawable divider;
        int intValue;
        RelativeLayout relativeLayout;
        int gravity;
        int i3;
        if (c002301c.A0M()) {
            if (view instanceof TimePicker) {
                String str = Build.MANUFACTURER;
                if (("samsung".equalsIgnoreCase(str) || "accent".equalsIgnoreCase(str)) && ((i3 = Build.VERSION.SDK_INT) == 22 || i3 == 23)) {
                    return;
                }
            }
            C0AT.A0W(view, 0);
        } else if (!(view instanceof InterfaceC07020Wd) && view.getTag(R.id.bidilayout_ignore) == null) {
            view.setPadding(view.getPaddingRight(), view.getPaddingTop(), view.getPaddingLeft(), view.getPaddingBottom());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                TextView textView = (TextView) view;
                textView.setGravity(A00(textView.getGravity()));
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                textView.setCompoundDrawables(compoundDrawables[2], compoundDrawables[1], compoundDrawables[0], compoundDrawables[3]);
            }
            if ((view instanceof RelativeLayout) && (gravity = (relativeLayout = (RelativeLayout) view).getGravity()) != 0) {
                relativeLayout.setGravity(A00(gravity));
            }
            if (view instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) view;
                if (Build.VERSION.SDK_INT >= 24) {
                    intValue = linearLayout.getGravity();
                } else {
                    try {
                        Field declaredField = LinearLayout.class.getDeclaredField("mGravity");
                        declaredField.setAccessible(true);
                        intValue = ((Number) declaredField.get(linearLayout)).intValue();
                    } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
                    }
                }
                if (intValue != 0) {
                    linearLayout.setGravity(A00(intValue));
                }
                A0B(c002301c, linearLayout);
            }
            if ((view instanceof ListView) && (divider = (listView = (ListView) view).getDivider()) != null) {
                listView.setDivider(new C0We(c002301c, divider));
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (i = (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams).leftMargin) != (i2 = marginLayoutParams.rightMargin)) {
                        marginLayoutParams.setMargins(i2, marginLayoutParams.topMargin, i, marginLayoutParams.bottomMargin);
                        if (Build.VERSION.SDK_INT < 17) {
                            try {
                                Field declaredField2 = ViewGroup.MarginLayoutParams.class.getDeclaredField("startMargin");
                                declaredField2.setAccessible(true);
                                declaredField2.setInt(marginLayoutParams, marginLayoutParams.leftMargin);
                                Field declaredField3 = ViewGroup.MarginLayoutParams.class.getDeclaredField("endMargin");
                                declaredField3.setAccessible(true);
                                declaredField3.setInt(marginLayoutParams, marginLayoutParams.rightMargin);
                            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused2) {
                            }
                        }
                    }
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        int[] rules = layoutParams2.getRules();
                        int i5 = rules[0];
                        int i6 = rules[1];
                        rules[1] = i5;
                        rules[0] = i6;
                        int i7 = rules[5];
                        layoutParams2.addRule(5, rules[7]);
                        layoutParams2.addRule(7, i7);
                        int i8 = rules[9];
                        rules[9] = rules[11];
                        rules[11] = i8;
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams3.gravity = A00(layoutParams3.gravity);
                    }
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams4.gravity = A00(layoutParams4.gravity);
                    }
                    if (layoutParams instanceof C0Wg) {
                        C0Wg c0Wg = (C0Wg) layoutParams;
                        if (Build.VERSION.SDK_INT < 17 && (childAt instanceof Guideline) && c0Wg.A0b == 1) {
                            int i9 = c0Wg.A0Q;
                            c0Wg.A0Q = c0Wg.A0R;
                            c0Wg.A0R = i9;
                        }
                        c0Wg.A02 = Math.abs(c0Wg.A02 - 1.0f);
                        int i10 = c0Wg.A0T;
                        c0Wg.A0T = c0Wg.A0l;
                        c0Wg.A0l = i10;
                        int i11 = c0Wg.A0U;
                        c0Wg.A0U = c0Wg.A0k;
                        c0Wg.A0k = i11;
                        childAt.setLayoutParams(c0Wg);
                    }
                    A04(c002301c, childAt);
                }
            }
            if (view instanceof Barrier) {
                Barrier barrier = (Barrier) view;
                int i12 = barrier.A00;
                if (i12 == 0) {
                    barrier.A00 = 1;
                } else if (i12 == 1) {
                    barrier.A00 = 0;
                }
            }
        }
    }

    public static void A05(C002301c c002301c, View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (Build.VERSION.SDK_INT < 17) {
            A07(c002301c, view, i, marginLayoutParams.topMargin, i2, marginLayoutParams.bottomMargin);
            return;
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i2);
        view.setLayoutParams(marginLayoutParams);
    }

    public static void A06(C002301c c002301c, View view, int i, int i2) {
        A08(c002301c, view, i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static void A07(C002301c c002301c, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (c002301c.A0M()) {
            marginLayoutParams.setMargins(i, i2, i3, i4);
        } else {
            marginLayoutParams.setMargins(i3, i2, i, i4);
        }
        if (Build.VERSION.SDK_INT < 17) {
            try {
                Field declaredField = ViewGroup.MarginLayoutParams.class.getDeclaredField("startMargin");
                declaredField.setAccessible(true);
                declaredField.setInt(marginLayoutParams, i);
                Field declaredField2 = ViewGroup.MarginLayoutParams.class.getDeclaredField("endMargin");
                declaredField2.setAccessible(true);
                declaredField2.setInt(marginLayoutParams, i3);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            }
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void A08(C002301c c002301c, View view, int i, int i2, int i3, int i4) {
        int i5 = i;
        if (c002301c.A0N()) {
            i5 = i3;
        }
        if (!c002301c.A0N()) {
            i = i3;
        }
        view.setPadding(i5, i2, i, i4);
    }

    public static void A09(C002301c c002301c, Window window) {
        if (A01) {
            window.getDecorView().setLayoutDirection(c002301c.A0N() ? 1 : 0);
        }
    }

    public static void A0A(C002301c c002301c, EditText editText) {
        if (c002301c.A0N()) {
            editText.setPadding(editText.getResources().getDimensionPixelSize(R.dimen.counter_text_padding), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        } else {
            editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), editText.getResources().getDimensionPixelSize(R.dimen.counter_text_padding), editText.getPaddingBottom());
        }
    }

    public static void A0B(C002301c c002301c, LinearLayout linearLayout) {
        if (c002301c.A0N() && linearLayout.getOrientation() == 0 && !A01) {
            int childCount = linearLayout.getChildCount();
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                arrayList.add(linearLayout.getChildAt(i));
            }
            linearLayout.removeAllViews();
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                linearLayout.addView((View) arrayList.get(i2));
            }
        }
    }

    public static void A0C(C002301c c002301c, TextView textView) {
        if (c002301c.A0N()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(new C0We(c002301c, C02160Ac.A03(textView.getContext(), R.drawable.chevron_right)), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.chevron_right, 0);
        }
    }

    public static boolean A0D(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Log.w("TextEmojiLabel/isTextLTR text is empty or null");
            return true;
        }
        return !((AbstractC014907a) C07Y.A01).A01(charSequence, charSequence.length());
    }
}
