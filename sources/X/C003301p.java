package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: X.01p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C003301p {
    public static Typeface A00;
    public static Typeface A01;
    public static Boolean A02;

    public static int A00(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        return Math.round((((float) context.getResources().getDisplayMetrics().widthPixels) / f >= 360.0f ? 8.0f : 2.0f) * f);
    }

    public static int A01(Context context) {
        return (int) (context.getResources().getDisplayMetrics().density * 83.333336f);
    }

    public static int A02(Context context) {
        int i;
        float f;
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.densityDpi;
            f = displayMetrics.density;
        } else {
            i = context.getResources().getConfiguration().densityDpi;
            f = context.getResources().getDisplayMetrics().density;
        }
        if (i >= 320) {
            return (int) (f * 25.0f);
        }
        if (i >= 240) {
            return 38;
        }
        return i >= 160 ? 25 : 19;
    }

    public static Typeface A03(Context context) {
        Typeface typeface = A01;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                Typeface create = Typeface.create("sans-serif-medium", 0);
                A01 = create;
                return create;
            }
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
            A01 = createFromAsset;
            return createFromAsset;
        }
        return typeface;
    }

    public static void A04() {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(20.0f);
        textPaint.setTypeface(Typeface.DEFAULT);
        float measureText = textPaint.measureText("ABCabc123");
        if (Build.VERSION.SDK_INT >= 21) {
            A02 = Boolean.TRUE;
        } else {
            A02 = Boolean.valueOf(measureText == 105.0f);
        }
    }

    public static void A05(EditText editText) {
        float f = editText.getContext().getResources().getDisplayMetrics().density;
        if (f >= 1.5f) {
            editText.setMaxLines(6);
        } else if (f >= 1.0f) {
            editText.setMaxLines(5);
        } else {
            editText.setMaxLines(4);
        }
    }

    public static void A06(TextView textView) {
        if (A02 == null) {
            A04();
        }
        if (A02.booleanValue()) {
            textView.setTypeface(A03(textView.getContext()));
            return;
        }
        Typeface typeface = A00;
        if (typeface == null) {
            typeface = Typeface.create(Typeface.DEFAULT, 1);
            A00 = typeface;
        }
        textView.setTypeface(typeface);
        textView.getPaint().setFakeBoldText((A00.getStyle() & 1) == 0);
    }
}
