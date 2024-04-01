package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0jL */
/* loaded from: classes.dex */
public class C12390jL {
    public static SparseIntArray A03;
    public static final int[] A04 = {0, 4, 8};
    public HashMap A01 = new HashMap();
    public boolean A02 = true;
    public HashMap A00 = new HashMap();

    public static final String A02(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A03 = sparseIntArray;
        sparseIntArray.append(76, 25);
        A03.append(77, 26);
        A03.append(79, 29);
        A03.append(80, 30);
        A03.append(86, 36);
        A03.append(85, 35);
        A03.append(58, 4);
        A03.append(57, 3);
        A03.append(55, 1);
        A03.append(94, 6);
        A03.append(95, 7);
        A03.append(65, 17);
        A03.append(66, 18);
        A03.append(67, 19);
        A03.append(0, 27);
        A03.append(81, 32);
        A03.append(82, 33);
        A03.append(64, 10);
        A03.append(63, 9);
        A03.append(98, 13);
        A03.append(101, 16);
        A03.append(99, 14);
        A03.append(96, 11);
        A03.append(100, 15);
        A03.append(97, 12);
        A03.append(89, 40);
        A03.append(74, 39);
        A03.append(73, 41);
        A03.append(88, 42);
        A03.append(72, 20);
        A03.append(87, 37);
        A03.append(62, 5);
        A03.append(75, 82);
        A03.append(84, 82);
        A03.append(78, 82);
        A03.append(56, 82);
        A03.append(54, 82);
        A03.append(5, 24);
        A03.append(7, 28);
        A03.append(23, 31);
        A03.append(24, 8);
        A03.append(6, 34);
        A03.append(8, 2);
        A03.append(3, 23);
        A03.append(4, 21);
        A03.append(2, 22);
        A03.append(13, 43);
        A03.append(26, 44);
        A03.append(21, 45);
        A03.append(22, 46);
        A03.append(20, 60);
        A03.append(18, 47);
        A03.append(19, 48);
        A03.append(14, 49);
        A03.append(15, 50);
        A03.append(16, 51);
        A03.append(17, 52);
        A03.append(25, 53);
        A03.append(90, 54);
        A03.append(68, 55);
        A03.append(91, 56);
        A03.append(69, 57);
        A03.append(92, 58);
        A03.append(70, 59);
        A03.append(59, 61);
        A03.append(61, 62);
        A03.append(60, 63);
        A03.append(27, 64);
        A03.append(106, 65);
        A03.append(33, 66);
        A03.append(107, 67);
        A03.append(103, 79);
        A03.append(1, 38);
        A03.append(102, 68);
        A03.append(93, 69);
        A03.append(71, 70);
        A03.append(31, 71);
        A03.append(29, 72);
        A03.append(30, 73);
        A03.append(32, 74);
        A03.append(28, 75);
        A03.append(104, 76);
        A03.append(83, 77);
        A03.append(C0M6.A03, 78);
        A03.append(53, 80);
        A03.append(52, 81);
    }

    public static int A00(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static final C12340jG A01(Context context, AttributeSet attributeSet) {
        C12340jG c12340jG = new C12340jG();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12420jO.A0H);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index != 1 && 23 != index && 24 != index) {
                c12340jG.A03.A06 = true;
                c12340jG.A02.A0w = true;
                c12340jG.A04.A04 = true;
                c12340jG.A05.A0C = true;
            }
            switch (A03.get(index)) {
                case 1:
                    C12350jH c12350jH = c12340jG.A02;
                    int resourceId = obtainStyledAttributes.getResourceId(index, c12350jH.A08);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH.A08 = resourceId;
                    break;
                case 2:
                    C12350jH c12350jH2 = c12340jG.A02;
                    c12350jH2.A09 = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH2.A09);
                    break;
                case 3:
                    C12350jH c12350jH3 = c12340jG.A02;
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c12350jH3.A0A);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH3.A0A = resourceId2;
                    break;
                case 4:
                    C12350jH c12350jH4 = c12340jG.A02;
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c12350jH4.A0B);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH4.A0B = resourceId3;
                    break;
                case 5:
                    c12340jG.A02.A0r = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    C12350jH c12350jH5 = c12340jG.A02;
                    c12350jH5.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, c12350jH5.A0E);
                    break;
                case 7:
                    C12350jH c12350jH6 = c12340jG.A02;
                    c12350jH6.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, c12350jH6.A0F);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C12350jH c12350jH7 = c12340jG.A02;
                        c12350jH7.A0G = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH7.A0G);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    C12350jH c12350jH8 = c12340jG.A02;
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c12350jH8.A0H);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH8.A0H = resourceId4;
                    break;
                case 10:
                    C12350jH c12350jH9 = c12340jG.A02;
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c12350jH9.A0I);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH9.A0I = resourceId5;
                    break;
                case GoogleMigrateImporterActivity.A0E /* 11 */:
                    C12350jH c12350jH10 = c12340jG.A02;
                    c12350jH10.A0J = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH10.A0J);
                    break;
                case 12:
                    C12350jH c12350jH11 = c12340jG.A02;
                    c12350jH11.A0K = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH11.A0K);
                    break;
                case 13:
                    C12350jH c12350jH12 = c12340jG.A02;
                    c12350jH12.A0L = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH12.A0L);
                    break;
                case 14:
                    C12350jH c12350jH13 = c12340jG.A02;
                    c12350jH13.A0M = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH13.A0M);
                    break;
                case 15:
                    C12350jH c12350jH14 = c12340jG.A02;
                    c12350jH14.A0N = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH14.A0N);
                    break;
                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                    C12350jH c12350jH15 = c12340jG.A02;
                    c12350jH15.A0O = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH15.A0O);
                    break;
                case 17:
                    C12350jH c12350jH16 = c12340jG.A02;
                    c12350jH16.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, c12350jH16.A0P);
                    break;
                case 18:
                    C12350jH c12350jH17 = c12340jG.A02;
                    c12350jH17.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, c12350jH17.A0Q);
                    break;
                case 19:
                    C12350jH c12350jH18 = c12340jG.A02;
                    c12350jH18.A01 = obtainStyledAttributes.getFloat(index, c12350jH18.A01);
                    break;
                case C0M6.A01 /* 20 */:
                    C12350jH c12350jH19 = c12340jG.A02;
                    c12350jH19.A03 = obtainStyledAttributes.getFloat(index, c12350jH19.A03);
                    break;
                case 21:
                    C12350jH c12350jH20 = c12340jG.A02;
                    c12350jH20.A0a = obtainStyledAttributes.getLayoutDimension(index, c12350jH20.A0a);
                    break;
                case 22:
                    C12370jJ c12370jJ = c12340jG.A04;
                    int i2 = obtainStyledAttributes.getInt(index, c12370jJ.A03);
                    c12370jJ.A03 = i2;
                    c12370jJ.A03 = A04[i2];
                    break;
                case 23:
                    C12350jH c12350jH21 = c12340jG.A02;
                    c12350jH21.A0c = obtainStyledAttributes.getLayoutDimension(index, c12350jH21.A0c);
                    break;
                case 24:
                    C12350jH c12350jH22 = c12340jG.A02;
                    c12350jH22.A0V = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH22.A0V);
                    break;
                case 25:
                    C12350jH c12350jH23 = c12340jG.A02;
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c12350jH23.A0W);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH23.A0W = resourceId6;
                    break;
                case 26:
                    C12350jH c12350jH24 = c12340jG.A02;
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c12350jH24.A0X);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH24.A0X = resourceId7;
                    break;
                case 27:
                    C12350jH c12350jH25 = c12340jG.A02;
                    c12350jH25.A0d = obtainStyledAttributes.getInt(index, c12350jH25.A0d);
                    break;
                case 28:
                    C12350jH c12350jH26 = c12340jG.A02;
                    c12350jH26.A0e = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH26.A0e);
                    break;
                case 29:
                    C12350jH c12350jH27 = c12340jG.A02;
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c12350jH27.A0f);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH27.A0f = resourceId8;
                    break;
                case 30:
                    C12350jH c12350jH28 = c12340jG.A02;
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c12350jH28.A0g);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH28.A0g = resourceId9;
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C12350jH c12350jH29 = c12340jG.A02;
                        c12350jH29.A0h = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH29.A0h);
                        break;
                    } else {
                        break;
                    }
                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                    C12350jH c12350jH30 = c12340jG.A02;
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c12350jH30.A0i);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH30.A0i = resourceId10;
                    break;
                case 33:
                    C12350jH c12350jH31 = c12340jG.A02;
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c12350jH31.A0j);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH31.A0j = resourceId11;
                    break;
                case 34:
                    C12350jH c12350jH32 = c12340jG.A02;
                    c12350jH32.A0k = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH32.A0k);
                    break;
                case 35:
                    C12350jH c12350jH33 = c12340jG.A02;
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c12350jH33.A0l);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH33.A0l = resourceId12;
                    break;
                case 36:
                    C12350jH c12350jH34 = c12340jG.A02;
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c12350jH34.A0m);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH34.A0m = resourceId13;
                    break;
                case 37:
                    C12350jH c12350jH35 = c12340jG.A02;
                    c12350jH35.A05 = obtainStyledAttributes.getFloat(index, c12350jH35.A05);
                    break;
                case 38:
                    c12340jG.A00 = obtainStyledAttributes.getResourceId(index, c12340jG.A00);
                    break;
                case 39:
                    C12350jH c12350jH36 = c12340jG.A02;
                    c12350jH36.A04 = obtainStyledAttributes.getFloat(index, c12350jH36.A04);
                    break;
                case 40:
                    C12350jH c12350jH37 = c12340jG.A02;
                    c12350jH37.A06 = obtainStyledAttributes.getFloat(index, c12350jH37.A06);
                    break;
                case 41:
                    C12350jH c12350jH38 = c12340jG.A02;
                    c12350jH38.A0U = obtainStyledAttributes.getInt(index, c12350jH38.A0U);
                    break;
                case 42:
                    C12350jH c12350jH39 = c12340jG.A02;
                    c12350jH39.A0n = obtainStyledAttributes.getInt(index, c12350jH39.A0n);
                    break;
                case 43:
                    C12370jJ c12370jJ2 = c12340jG.A04;
                    c12370jJ2.A00 = obtainStyledAttributes.getFloat(index, c12370jJ2.A00);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C12380jK c12380jK = c12340jG.A05;
                        c12380jK.A0B = true;
                        c12380jK.A00 = obtainStyledAttributes.getDimension(index, c12380jK.A00);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    C12380jK c12380jK2 = c12340jG.A05;
                    c12380jK2.A02 = obtainStyledAttributes.getFloat(index, c12380jK2.A02);
                    break;
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                    C12380jK c12380jK3 = c12340jG.A05;
                    c12380jK3.A03 = obtainStyledAttributes.getFloat(index, c12380jK3.A03);
                    break;
                case 47:
                    C12380jK c12380jK4 = c12340jG.A05;
                    c12380jK4.A04 = obtainStyledAttributes.getFloat(index, c12380jK4.A04);
                    break;
                case 48:
                    C12380jK c12380jK5 = c12340jG.A05;
                    c12380jK5.A05 = obtainStyledAttributes.getFloat(index, c12380jK5.A05);
                    break;
                case 49:
                    C12380jK c12380jK6 = c12340jG.A05;
                    c12380jK6.A06 = obtainStyledAttributes.getDimension(index, c12380jK6.A06);
                    break;
                case 50:
                    C12380jK c12380jK7 = c12340jG.A05;
                    c12380jK7.A07 = obtainStyledAttributes.getDimension(index, c12380jK7.A07);
                    break;
                case 51:
                    C12380jK c12380jK8 = c12340jG.A05;
                    c12380jK8.A08 = obtainStyledAttributes.getDimension(index, c12380jK8.A08);
                    break;
                case 52:
                    C12380jK c12380jK9 = c12340jG.A05;
                    c12380jK9.A09 = obtainStyledAttributes.getDimension(index, c12380jK9.A09);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C12380jK c12380jK10 = c12340jG.A05;
                        c12380jK10.A0A = obtainStyledAttributes.getDimension(index, c12380jK10.A0A);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    C12350jH c12350jH40 = c12340jG.A02;
                    c12350jH40.A0o = obtainStyledAttributes.getInt(index, c12350jH40.A0o);
                    break;
                case 55:
                    C12350jH c12350jH41 = c12340jG.A02;
                    c12350jH41.A0R = obtainStyledAttributes.getInt(index, c12350jH41.A0R);
                    break;
                case 56:
                    C12350jH c12350jH42 = c12340jG.A02;
                    c12350jH42.A0p = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH42.A0p);
                    break;
                case 57:
                    C12350jH c12350jH43 = c12340jG.A02;
                    c12350jH43.A0S = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH43.A0S);
                    break;
                case 58:
                    C12350jH c12350jH44 = c12340jG.A02;
                    c12350jH44.A0q = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH44.A0q);
                    break;
                case 59:
                    C12350jH c12350jH45 = c12340jG.A02;
                    c12350jH45.A0T = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH45.A0T);
                    break;
                case 60:
                    C12380jK c12380jK11 = c12340jG.A05;
                    c12380jK11.A01 = obtainStyledAttributes.getFloat(index, c12380jK11.A01);
                    break;
                case 61:
                    C12350jH c12350jH46 = c12340jG.A02;
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c12350jH46.A0C);
                    if (resourceId14 == -1) {
                        resourceId14 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12350jH46.A0C = resourceId14;
                    break;
                case 62:
                    C12350jH c12350jH47 = c12340jG.A02;
                    c12350jH47.A0D = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH47.A0D);
                    break;
                case 63:
                    C12350jH c12350jH48 = c12340jG.A02;
                    c12350jH48.A00 = obtainStyledAttributes.getFloat(index, c12350jH48.A00);
                    break;
                case 64:
                    C12360jI c12360jI = c12340jG.A03;
                    int resourceId15 = obtainStyledAttributes.getResourceId(index, c12360jI.A02);
                    if (resourceId15 == -1) {
                        resourceId15 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c12360jI.A02 = resourceId15;
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        c12340jG.A03.A05 = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        c12340jG.A03.A05 = C12110is.A00[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c12340jG.A03.A03 = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    C12360jI c12360jI2 = c12340jG.A03;
                    c12360jI2.A01 = obtainStyledAttributes.getFloat(index, c12360jI2.A01);
                    break;
                case 68:
                    C12370jJ c12370jJ3 = c12340jG.A04;
                    c12370jJ3.A01 = obtainStyledAttributes.getFloat(index, c12370jJ3.A01);
                    break;
                case 69:
                    c12340jG.A02.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c12340jG.A02.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case C0M6.A02 /* 72 */:
                    C12350jH c12350jH49 = c12340jG.A02;
                    c12350jH49.A0Y = obtainStyledAttributes.getInt(index, c12350jH49.A0Y);
                    break;
                case 73:
                    C12350jH c12350jH50 = c12340jG.A02;
                    c12350jH50.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, c12350jH50.A0Z);
                    break;
                case 74:
                    c12340jG.A02.A0t = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    C12350jH c12350jH51 = c12340jG.A02;
                    c12350jH51.A0x = obtainStyledAttributes.getBoolean(index, c12350jH51.A0x);
                    break;
                case 76:
                    C12360jI c12360jI3 = c12340jG.A03;
                    c12360jI3.A04 = obtainStyledAttributes.getInt(index, c12360jI3.A04);
                    break;
                case 77:
                    c12340jG.A02.A0s = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    C12370jJ c12370jJ4 = c12340jG.A04;
                    c12370jJ4.A02 = obtainStyledAttributes.getInt(index, c12370jJ4.A02);
                    break;
                case 79:
                    C12360jI c12360jI4 = c12340jG.A03;
                    c12360jI4.A00 = obtainStyledAttributes.getFloat(index, c12360jI4.A00);
                    break;
                case 80:
                    C12350jH c12350jH52 = c12340jG.A02;
                    c12350jH52.A0v = obtainStyledAttributes.getBoolean(index, c12350jH52.A0v);
                    break;
                case 81:
                    C12350jH c12350jH53 = c12340jG.A02;
                    c12350jH53.A0u = obtainStyledAttributes.getBoolean(index, c12350jH53.A0u);
                    break;
                case 82:
                    StringBuilder A0P = C000200d.A0P("unused attribute 0x");
                    A0P.append(Integer.toHexString(index));
                    A0P.append("   ");
                    A0P.append(A03.get(index));
                    Log.w("ConstraintSet", A0P.toString());
                    break;
                default:
                    StringBuilder A0P2 = C000200d.A0P("Unknown attribute 0x");
                    A0P2.append(Integer.toHexString(index));
                    A0P2.append("   ");
                    A0P2.append(A03.get(index));
                    Log.w("ConstraintSet", A0P2.toString());
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return c12340jG;
    }

    public static final int[] A03(View view, String str) {
        int i;
        Object obj;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int length = split.length;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String trim = split[i2].trim();
            try {
                i = C12410jN.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                if (trim != null && (hashMap = constraintLayout.A0F) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.A0F.get(trim);
                } else {
                    obj = null;
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Number) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public final C12340jG A04(int i) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.A00.put(valueOf, new C12340jG());
        }
        return (C12340jG) this.A00.get(valueOf);
    }

    public void A05(int i, int i2, int i3, int i4) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.A00.put(valueOf, new C12340jG());
        }
        C12340jG c12340jG = (C12340jG) this.A00.get(valueOf);
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C12350jH c12350jH = c12340jG.A02;
                    c12350jH.A0W = i3;
                    c12350jH.A0X = -1;
                    return;
                } else if (i4 == 2) {
                    C12350jH c12350jH2 = c12340jG.A02;
                    c12350jH2.A0X = i3;
                    c12350jH2.A0W = -1;
                    return;
                } else {
                    StringBuilder A0P = C000200d.A0P("left to ");
                    A0P.append(A02(i4));
                    A0P.append(" undefined");
                    throw new IllegalArgumentException(A0P.toString());
                }
            case 2:
                if (i4 == 1) {
                    C12350jH c12350jH3 = c12340jG.A02;
                    c12350jH3.A0f = i3;
                    c12350jH3.A0g = -1;
                    return;
                } else if (i4 == 2) {
                    C12350jH c12350jH4 = c12340jG.A02;
                    c12350jH4.A0g = i3;
                    c12350jH4.A0f = -1;
                    return;
                } else {
                    StringBuilder A0P2 = C000200d.A0P("right to ");
                    A0P2.append(A02(i4));
                    A0P2.append(" undefined");
                    throw new IllegalArgumentException(A0P2.toString());
                }
            case 3:
                if (i4 == 3) {
                    C12350jH c12350jH5 = c12340jG.A02;
                    c12350jH5.A0m = i3;
                    c12350jH5.A0l = -1;
                    c12350jH5.A08 = -1;
                    return;
                } else if (i4 == 4) {
                    C12350jH c12350jH6 = c12340jG.A02;
                    c12350jH6.A0l = i3;
                    c12350jH6.A0m = -1;
                    c12350jH6.A08 = -1;
                    return;
                } else {
                    StringBuilder A0P3 = C000200d.A0P("right to ");
                    A0P3.append(A02(i4));
                    A0P3.append(" undefined");
                    throw new IllegalArgumentException(A0P3.toString());
                }
            case 4:
                if (i4 == 4) {
                    C12350jH c12350jH7 = c12340jG.A02;
                    c12350jH7.A0A = i3;
                    c12350jH7.A0B = -1;
                    c12350jH7.A08 = -1;
                    return;
                } else if (i4 == 3) {
                    C12350jH c12350jH8 = c12340jG.A02;
                    c12350jH8.A0B = i3;
                    c12350jH8.A0A = -1;
                    c12350jH8.A08 = -1;
                    return;
                } else {
                    StringBuilder A0P4 = C000200d.A0P("right to ");
                    A0P4.append(A02(i4));
                    A0P4.append(" undefined");
                    throw new IllegalArgumentException(A0P4.toString());
                }
            case 5:
                if (i4 == 5) {
                    C12350jH c12350jH9 = c12340jG.A02;
                    c12350jH9.A08 = i3;
                    c12350jH9.A0A = -1;
                    c12350jH9.A0B = -1;
                    c12350jH9.A0m = -1;
                    c12350jH9.A0l = -1;
                    return;
                }
                StringBuilder A0P5 = C000200d.A0P("right to ");
                A0P5.append(A02(i4));
                A0P5.append(" undefined");
                throw new IllegalArgumentException(A0P5.toString());
            case 6:
                if (i4 == 6) {
                    C12350jH c12350jH10 = c12340jG.A02;
                    c12350jH10.A0j = i3;
                    c12350jH10.A0i = -1;
                    return;
                } else if (i4 == 7) {
                    C12350jH c12350jH11 = c12340jG.A02;
                    c12350jH11.A0i = i3;
                    c12350jH11.A0j = -1;
                    return;
                } else {
                    StringBuilder A0P6 = C000200d.A0P("right to ");
                    A0P6.append(A02(i4));
                    A0P6.append(" undefined");
                    throw new IllegalArgumentException(A0P6.toString());
                }
            case 7:
                if (i4 == 7) {
                    C12350jH c12350jH12 = c12340jG.A02;
                    c12350jH12.A0H = i3;
                    c12350jH12.A0I = -1;
                    return;
                } else if (i4 == 6) {
                    C12350jH c12350jH13 = c12340jG.A02;
                    c12350jH13.A0I = i3;
                    c12350jH13.A0H = -1;
                    return;
                } else {
                    StringBuilder A0P7 = C000200d.A0P("right to ");
                    A0P7.append(A02(i4));
                    A0P7.append(" undefined");
                    throw new IllegalArgumentException(A0P7.toString());
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(A02(i2));
                sb.append(" to ");
                sb.append(A02(i4));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public void A06(Context context, int i) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = viewGroup.getChildCount();
        this.A00.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            C0Wg c0Wg = (C0Wg) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.A00.containsKey(Integer.valueOf(id))) {
                    this.A00.put(Integer.valueOf(id), new C12340jG());
                }
                C12340jG c12340jG = (C12340jG) this.A00.get(Integer.valueOf(id));
                HashMap hashMap = this.A01;
                HashMap hashMap2 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    C12290jA c12290jA = (C12290jA) hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2.put(str, new C12290jA(c12290jA, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("getMap");
                            sb.append(str);
                            try {
                                hashMap2.put(str, new C12290jA(c12290jA, cls.getMethod(sb.toString(), new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e) {
                                e = e;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                            }
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                    }
                }
                c12340jG.A01 = hashMap2;
                c12340jG.A00(id, c0Wg);
                C12370jJ c12370jJ = c12340jG.A04;
                c12370jJ.A03 = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    c12370jJ.A00 = childAt.getAlpha();
                    C12380jK c12380jK = c12340jG.A05;
                    c12380jK.A01 = childAt.getRotation();
                    c12380jK.A02 = childAt.getRotationX();
                    c12380jK.A03 = childAt.getRotationY();
                    c12380jK.A04 = childAt.getScaleX();
                    c12380jK.A05 = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        c12380jK.A06 = pivotX;
                        c12380jK.A07 = pivotY;
                    }
                    c12380jK.A08 = childAt.getTranslationX();
                    c12380jK.A09 = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        c12380jK.A0A = childAt.getTranslationZ();
                        if (c12380jK.A0B) {
                            c12380jK.A00 = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    C12350jH c12350jH = c12340jG.A02;
                    c12350jH.A0x = barrier.A02.A02;
                    c12350jH.A0z = barrier.getReferencedIds();
                    c12350jH.A0Y = barrier.A00;
                    c12350jH.A0Z = barrier.A02.A01;
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void A07(ConstraintLayout constraintLayout) {
        String str;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.A00.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.A00.containsKey(Integer.valueOf(id))) {
                StringBuilder A0P = C000200d.A0P("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                A0P.append(str);
                Log.w("ConstraintSet", A0P.toString());
            } else if (id != -1) {
                if (id != -1) {
                    if (this.A00.containsKey(Integer.valueOf(id))) {
                        Integer valueOf = Integer.valueOf(id);
                        hashSet.remove(valueOf);
                        C12340jG c12340jG = (C12340jG) this.A00.get(valueOf);
                        if (childAt instanceof Barrier) {
                            c12340jG.A02.A0b = 1;
                        }
                        C12350jH c12350jH = c12340jG.A02;
                        int i2 = c12350jH.A0b;
                        if (i2 != -1 && i2 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.A00 = c12350jH.A0Y;
                            barrier.setMargin(c12350jH.A0Z);
                            barrier.setAllowsGoneWidget(c12350jH.A0x);
                            int[] iArr = c12350jH.A0z;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str2 = c12350jH.A0t;
                                if (str2 != null) {
                                    int[] A032 = A03(barrier, str2);
                                    c12350jH.A0z = A032;
                                    barrier.setReferencedIds(A032);
                                }
                            }
                        }
                        C0Wg c0Wg = (C0Wg) childAt.getLayoutParams();
                        c0Wg.A00();
                        c12340jG.A01(c0Wg);
                        HashMap hashMap = c12340jG.A01;
                        Class<?> cls = childAt.getClass();
                        for (String str3 : hashMap.keySet()) {
                            C12290jA c12290jA = (C12290jA) hashMap.get(str3);
                            String A0H = C000200d.A0H("set", str3);
                            try {
                                switch (c12290jA.A03.ordinal()) {
                                    case 0:
                                        try {
                                            cls.getMethod(A0H, Integer.TYPE).invoke(childAt, Integer.valueOf(c12290jA.A02));
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            StringBuilder A0W = C000200d.A0W(" Custom Attribute \"", str3, "\" not found on ");
                                            A0W.append(cls.getName());
                                            Log.e("TransitionLayout", A0W.toString());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(" Custom Attribute \"");
                                            sb.append(str3);
                                            sb.append("\" not found on ");
                                            String name = cls.getName();
                                            sb.append(name);
                                            Log.e("TransitionLayout", sb.toString());
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(name);
                                            sb2.append(" must have a method ");
                                            sb2.append(A0H);
                                            Log.e("TransitionLayout", sb2.toString());
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            StringBuilder A0W2 = C000200d.A0W(" Custom Attribute \"", str3, "\" not found on ");
                                            A0W2.append(cls.getName());
                                            Log.e("TransitionLayout", A0W2.toString());
                                            e.printStackTrace();
                                        }
                                    case 1:
                                        cls.getMethod(A0H, Float.TYPE).invoke(childAt, Float.valueOf(c12290jA.A00));
                                        break;
                                    case 2:
                                        cls.getMethod(A0H, Integer.TYPE).invoke(childAt, Integer.valueOf(c12290jA.A01));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(A0H, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c12290jA.A01);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(A0H, CharSequence.class).invoke(childAt, c12290jA.A05);
                                        break;
                                    case 5:
                                        cls.getMethod(A0H, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c12290jA.A06));
                                        break;
                                    case 6:
                                        cls.getMethod(A0H, Float.TYPE).invoke(childAt, Float.valueOf(c12290jA.A00));
                                        break;
                                }
                            } catch (IllegalAccessException e4) {
                                e = e4;
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                            } catch (InvocationTargetException e6) {
                                e = e6;
                            }
                        }
                        childAt.setLayoutParams(c0Wg);
                        C12370jJ c12370jJ = c12340jG.A04;
                        if (c12370jJ.A02 == 0) {
                            childAt.setVisibility(c12370jJ.A03);
                        }
                        if (Build.VERSION.SDK_INT >= 17) {
                            childAt.setAlpha(c12370jJ.A00);
                            C12380jK c12380jK = c12340jG.A05;
                            childAt.setRotation(c12380jK.A01);
                            childAt.setRotationX(c12380jK.A02);
                            childAt.setRotationY(c12380jK.A03);
                            childAt.setScaleX(c12380jK.A04);
                            childAt.setScaleY(c12380jK.A05);
                            float f = c12380jK.A06;
                            if (!Float.isNaN(f)) {
                                childAt.setPivotX(f);
                            }
                            float f2 = c12380jK.A07;
                            if (!Float.isNaN(f2)) {
                                childAt.setPivotY(f2);
                            }
                            childAt.setTranslationX(c12380jK.A08);
                            childAt.setTranslationY(c12380jK.A09);
                            if (Build.VERSION.SDK_INT >= 21) {
                                childAt.setTranslationZ(c12380jK.A0A);
                                if (c12380jK.A0B) {
                                    childAt.setElevation(c12380jK.A00);
                                }
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("WARNING NO CONSTRAINTS for view ");
                        sb3.append(id);
                        Log.v("ConstraintSet", sb3.toString());
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            C12340jG c12340jG2 = (C12340jG) this.A00.get(number);
            C12350jH c12350jH2 = c12340jG2.A02;
            int i3 = c12350jH2.A0b;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(number.intValue());
                int[] iArr2 = c12350jH2.A0z;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str4 = c12350jH2.A0t;
                    if (str4 != null) {
                        int[] A033 = A03(barrier2, str4);
                        c12350jH2.A0z = A033;
                        barrier2.setReferencedIds(A033);
                    }
                }
                barrier2.A00 = c12350jH2.A0Y;
                barrier2.setMargin(c12350jH2.A0Z);
                C0Wg c0Wg2 = new C0Wg();
                barrier2.A02();
                c12340jG2.A01(c0Wg2);
                constraintLayout.addView(barrier2, c0Wg2);
            }
            if (c12350jH2.A0y) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(number.intValue());
                C0Wg c0Wg3 = new C0Wg();
                c12340jG2.A01(c0Wg3);
                constraintLayout.addView(guideline, c0Wg3);
            }
        }
    }
}
