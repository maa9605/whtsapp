package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.07K */
/* loaded from: classes.dex */
public class C07K {
    public static Method A00;
    public static boolean A01;
    public static boolean A02;

    public static boolean A1f(int i) {
        return i >= 28 && i <= 31;
    }

    public static byte A00(Parcel parcel, int i) {
        A1I(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double A01(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0d;
        }
        return Math.max(i, i2) / Math.min(i, i2);
    }

    public static double A02(Parcel parcel, int i) {
        A1I(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float A03(Parcel parcel, int i) {
        A1I(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int A04() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public static int A05(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        if (i == 4) {
                            return 4;
                        }
                        throw new RuntimeException(C000200d.A0D("Could not convert flash mode to optic: ", i));
                    }
                }
            }
            return i2;
        }
        return 0;
    }

    public static int A06(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public static int A07(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    public static int A08(CameraManager cameraManager, String str, CaptureRequest.Builder builder, AnonymousClass456 anonymousClass456, AbstractC885543o abstractC885543o) {
        if (anonymousClass456 != null && abstractC885543o != null) {
            int i = 0;
            int intValue = ((Number) anonymousClass456.A00(AbstractC886243v.A0B)).intValue();
            if (intValue == 4) {
                if (AnonymousClass436.A01(cameraManager, str, 4)) {
                    i = 4;
                }
            } else if (intValue == 3) {
                if (AnonymousClass436.A01(cameraManager, str, 3)) {
                    i = 3;
                }
            } else if (intValue == 1 && AnonymousClass436.A01(cameraManager, str, 1)) {
                i = 1;
            }
            builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
            return i;
        }
        throw new IllegalStateException("Trying to update builder for focus mode after camera closed.");
    }

    public static int A09(Parcel parcel) {
        int readInt = parcel.readInt();
        int A0B = A0B(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new C07L(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = A0B + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new C07L(sb.toString(), parcel);
        }
        return i;
    }

    public static int A0A(Parcel parcel, int i) {
        A1I(parcel, i, 4);
        return parcel.readInt();
    }

    public static int A0B(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static int A0C(Layout layout) {
        int i = 0;
        if (Build.VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            int max = Math.max(0, layout.getLineCount() - 1);
            float lineDescent = layout.getLineDescent(max) - layout.getLineAscent(max);
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            if (spacingAdd >= 0.0f) {
                i = (int) (spacingAdd + 0.5d);
            } else {
                i = -((int) ((-spacingAdd) + 0.5d));
            }
        }
        return layout.getHeight() - i;
    }

    public static int A0D(C07M state) {
        int ordinal = state.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        i = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            StringBuilder sb = new StringBuilder("Could not convert ");
                            sb.append(state);
                            sb.append(" to int");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
            }
            return i;
        }
        return 0;
    }

    public static int A0E(C42C c42c, C42C c42c2) {
        return Long.signum((c42c.A01 * c42c.A00) - (c42c2.A01 * c42c2.A00));
    }

    public static int A0F(C44B c44b) {
        int ordinal = c44b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 0;
            }
            StringBuilder sb = new StringBuilder("Could not convert camera facing from optic: ");
            sb.append(c44b);
            throw new RuntimeException(sb.toString());
        }
        return 1;
    }

    public static int A0G(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 109935:
                    if (str.equals("off")) {
                        return 0;
                    }
                    break;
                case 1628397:
                    if (str.equals("50hz")) {
                        return 1;
                    }
                    break;
                case 1658188:
                    if (str.equals("60hz")) {
                        return 2;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 3;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0H(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1635350969:
                    if (str.equals("blackboard")) {
                        return 7;
                    }
                    break;
                case 3002044:
                    if (str.equals("aqua")) {
                        return 8;
                    }
                    break;
                case 3357411:
                    if (str.equals("mono")) {
                        return 1;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        return 0;
                    }
                    break;
                case 109324790:
                    if (str.equals("sepia")) {
                        return 4;
                    }
                    break;
                case 261182557:
                    if (str.equals("whiteboard")) {
                        return 6;
                    }
                    break;
                case 921111605:
                    if (str.equals("negative")) {
                        return 2;
                    }
                    break;
                case 1473417203:
                    if (str.equals("solarize")) {
                        return 3;
                    }
                    break;
                case 2008448231:
                    if (str.equals("posterize")) {
                        return 5;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0I(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 3551:
                    if (str.equals("on")) {
                        return 1;
                    }
                    break;
                case 109935:
                    if (str.equals("off")) {
                        return 0;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 2;
                    }
                    break;
                case 110547964:
                    if (str.equals("torch")) {
                        return 3;
                    }
                    break;
                case 1081542389:
                    if (str.equals("red-eye")) {
                        return 4;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0J(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -194628547:
                    if (str.equals("continuous-video")) {
                        return 3;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 1;
                    }
                    break;
                case 3108534:
                    if (str.equals("edof")) {
                        return 5;
                    }
                    break;
                case 97445748:
                    if (str.equals("fixed")) {
                        return 0;
                    }
                    break;
                case 103652300:
                    if (str.equals("macro")) {
                        return 2;
                    }
                    break;
                case 173173288:
                    if (str.equals("infinity")) {
                        return 6;
                    }
                    break;
                case 910005312:
                    if (str.equals("continuous-picture")) {
                        return 4;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0K(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        return 2;
                    }
                    break;
                case -1350043241:
                    if (str.equals("theatre")) {
                        return 7;
                    }
                    break;
                case -895760513:
                    if (str.equals("sports")) {
                        return 13;
                    }
                    break;
                case -891172202:
                    if (str.equals("sunset")) {
                        return 10;
                    }
                    break;
                case -333584256:
                    if (str.equals("barcode")) {
                        return 16;
                    }
                    break;
                case -300277408:
                    if (str.equals("steadyphoto")) {
                        return 11;
                    }
                    break;
                case -264202484:
                    if (str.equals("fireworks")) {
                        return 12;
                    }
                    break;
                case 103158:
                    if (str.equals("hdr")) {
                        return 17;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 0;
                    }
                    break;
                case 3535235:
                    if (str.equals("snow")) {
                        return 9;
                    }
                    break;
                case 93610339:
                    if (str.equals("beach")) {
                        return 8;
                    }
                    break;
                case 104817688:
                    if (str.equals("night")) {
                        return 5;
                    }
                    break;
                case 106437350:
                    if (str.equals("party")) {
                        return 14;
                    }
                    break;
                case 729267099:
                    if (str.equals("portrait")) {
                        return 3;
                    }
                    break;
                case 1430647483:
                    if (str.equals("landscape")) {
                        return 4;
                    }
                    break;
                case 1664284080:
                    if (str.equals("night-portrait")) {
                        return 6;
                    }
                    break;
                case 1900012073:
                    if (str.equals("candlelight")) {
                        return 15;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0L(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -939299377:
                    if (str.equals("incandescent")) {
                        return 2;
                    }
                    break;
                case -719316704:
                    if (str.equals("warm-fluorescent")) {
                        return 4;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 1;
                    }
                    break;
                case 109399597:
                    if (str.equals("shade")) {
                        return 8;
                    }
                    break;
                case 474934723:
                    if (str.equals("cloudy-daylight")) {
                        return 6;
                    }
                    break;
                case 1650323088:
                    if (str.equals("twilight")) {
                        return 7;
                    }
                    break;
                case 1902580840:
                    if (str.equals("fluorescent")) {
                        return 3;
                    }
                    break;
                case 1942983418:
                    if (str.equals("daylight")) {
                        return 5;
                    }
                    break;
            }
        }
        return -1;
    }

    public static long A0M(int i, int i2) {
        int floatToRawIntBits = Float.floatToRawIntBits(i);
        return Float.floatToRawIntBits(i2) | (floatToRawIntBits << 32);
    }

    public static long A0N(Parcel parcel, int i) {
        A1I(parcel, i, 8);
        return parcel.readLong();
    }

    public static long A0O(C44K c44k) {
        if (c44k != null) {
            throw null;
        }
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x0114, code lost:
        if (A1f(r1.type) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x013a, code lost:
        if (r2 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0149, code lost:
        if (A1f(r2.type) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x02c9, code lost:
        if (r5 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x02fd, code lost:
        if (r29 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x02ff, code lost:
        if (r20 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0301, code lost:
        r4 = new android.animation.Animator[r20.size()];
        r3 = r20.iterator();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0310, code lost:
        if (r3.hasNext() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0312, code lost:
        r4[r2] = r3.next();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x031c, code lost:
        if (r30 != 0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x031e, code lost:
        r29.playTogether(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0321, code lost:
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0322, code lost:
        r29.playSequentially(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0325, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator A0P(android.content.Context r24, android.content.res.Resources r25, android.content.res.Resources.Theme r26, org.xmlpull.v1.XmlPullParser r27, android.util.AttributeSet r28, android.animation.AnimatorSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07K.A0P(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0117, code lost:
        if (r16 == 0) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.PropertyValuesHolder A0Q(android.content.res.TypedArray r15, int r16, int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07K.A0Q(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static ValueAnimator A0R(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        int resourceId;
        String string;
        PropertyValuesHolder propertyValuesHolder;
        boolean z;
        int i;
        boolean z2;
        int i2;
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray A0G = C07O.A0G(resources, theme, attributeSet, C07N.A02);
        TypedArray A0G2 = C07O.A0G(resources, theme, attributeSet, C07N.A06);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        long A06 = C07O.A06(A0G, xmlPullParser, "duration", 1, 300);
        int i3 = 0;
        long A062 = C07O.A06(A0G, xmlPullParser, "startOffset", 2, 0);
        int A063 = C07O.A06(A0G, xmlPullParser, "valueType", 7, 4);
        if (C07O.A19(xmlPullParser, "valueFrom") && C07O.A19(xmlPullParser, "valueTo")) {
            if (A063 == 4) {
                TypedValue peekValue = A0G.peekValue(5);
                if (peekValue != null) {
                    z = true;
                    i = peekValue.type;
                } else {
                    z = false;
                    i = 0;
                }
                TypedValue peekValue2 = A0G.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                    i2 = peekValue2.type;
                } else {
                    z2 = false;
                    i2 = 0;
                }
                A063 = ((z && A1f(i)) || (z2 && A1f(i2))) ? 3 : 0;
            }
            PropertyValuesHolder A0Q = A0Q(A0G, A063, 5, 6, "");
            if (A0Q != null) {
                valueAnimator2.setValues(A0Q);
            }
        }
        valueAnimator2.setDuration(A06);
        valueAnimator2.setStartDelay(A062);
        valueAnimator2.setRepeatCount(C07O.A06(A0G, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(C07O.A06(A0G, xmlPullParser, "repeatMode", 4, 1));
        if (A0G2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            if (C07O.A19(xmlPullParser, "pathData") && (string = A0G2.getString(1)) != null) {
                String string2 = !C07O.A19(xmlPullParser, "propertyXName") ? null : A0G2.getString(2);
                String string3 = !C07O.A19(xmlPullParser, "propertyYName") ? null : A0G2.getString(3);
                if (string2 == null && string3 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0G2.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                Path A0H = C07O.A0H(string);
                float f = 0.5f * 1.0f;
                PathMeasure pathMeasure = new PathMeasure(A0H, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f2 = 0.0f;
                do {
                    f2 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f2));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(A0H, false);
                int min = Math.min(100, ((int) (f2 / f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f3 = f2 / (min - 1);
                int i4 = 0;
                float f4 = 0.0f;
                while (true) {
                    if (i3 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f4 - ((Number) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f4 += f3;
                    int i5 = i4 + 1;
                    if (i5 < arrayList.size() && f4 > ((Number) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i5;
                    }
                    i3++;
                }
                if (string2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(string2, fArr);
                } else {
                    propertyValuesHolder = null;
                }
                PropertyValuesHolder ofFloat = string3 != null ? PropertyValuesHolder.ofFloat(string3, fArr2) : null;
                if (propertyValuesHolder == null) {
                    i3 = 0;
                    objectAnimator.setValues(ofFloat);
                } else {
                    i3 = 0;
                    if (ofFloat == null) {
                        objectAnimator.setValues(propertyValuesHolder);
                    } else {
                        objectAnimator.setValues(propertyValuesHolder, ofFloat);
                    }
                }
            } else {
                objectAnimator.setPropertyName(!C07O.A19(xmlPullParser, "propertyName") ? null : A0G2.getString(0));
            }
        }
        if (C07O.A19(xmlPullParser, "interpolator") && (resourceId = A0G.getResourceId(i3, i3)) > 0) {
            valueAnimator2.setInterpolator(A0a(context, resourceId));
        }
        A0G.recycle();
        if (A0G2 != null) {
            A0G2.recycle();
        }
        return valueAnimator2;
    }

    public static Rect A0S(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return new Rect(0, 0, options.outWidth, options.outHeight);
    }

    public static Bundle A0T(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A0B);
        return readBundle;
    }

    public static IBinder A0U(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A0B);
        return readStrongBinder;
    }

    public static Parcel A0V(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, A0B);
        parcel.setDataPosition(dataPosition + A0B);
        return obtain;
    }

    public static Parcelable A0W(Parcel parcel, int i, Parcelable.Creator creator) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A0B);
        return parcelable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x032d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x033c A[EXC_TOP_SPLITTER, LOOP:0: B:554:0x033c->B:536:0x04e6, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10, types: [android.text.TextPaint] */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.text.TextPaint] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v14, types: [float] */
    /* JADX WARN: Type inference failed for: r16v15, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v3, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10, types: [float] */
    /* JADX WARN: Type inference failed for: r18v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v12, types: [float] */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9, types: [android.text.TextPaint] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10, types: [android.text.TextUtils$TruncateAt] */
    /* JADX WARN: Type inference failed for: r19v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8, types: [int] */
    /* JADX WARN: Type inference failed for: r19v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.06F] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10, types: [int] */
    /* JADX WARN: Type inference failed for: r20v11, types: [android.text.TextUtils$TruncateAt] */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v2, types: [android.text.TextUtils$TruncateAt] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r20v9, types: [android.text.TextUtils$TruncateAt] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.text.Layout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.text.BoringLayout] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.text.StaticLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.Layout A0X(android.content.Context r28, X.C07S r29, int r30, java.lang.CharSequence r31) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07K.A0X(android.content.Context, X.07S, int, java.lang.CharSequence):android.text.Layout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [float] */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.text.TextUtils$TruncateAt] */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    public static StaticLayout A0Y(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i3, int i4, C07X c07x) {
        try {
            i2 = i3;
            alignment = i4;
            textPaint = truncateAt;
            i = z;
            charSequence = f2;
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, A0Z(c07x), f, charSequence, i, textPaint, i2, alignment);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, A0Z(c07x), f, charSequence, i, textPaint, i2, alignment);
            }
            throw e;
        }
    }

    public static TextDirectionHeuristic A0Z(C07X c07x) {
        if (c07x == C07Y.A04) {
            return TextDirectionHeuristics.LTR;
        }
        if (c07x == C07Y.A05) {
            return TextDirectionHeuristics.RTL;
        }
        if (c07x == C07Y.A01) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (c07x == C07Y.A02) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (c07x == C07Y.A00) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (c07x == C07Y.A03) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x00fc, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00ff, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.animation.Interpolator A0a(android.content.Context r6, int r7) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07K.A0a(android.content.Context, int):android.view.animation.Interpolator");
    }

    public static EnumC015507g A0b(int value) {
        if (value != 0) {
            if (value == 1) {
                return EnumC015507g.LINEAR;
            }
            throw new IllegalArgumentException(C000200d.A0E("Could not convert ", value, " to BackoffPolicy"));
        }
        return EnumC015507g.EXPONENTIAL;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0049: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:96:0x0053, block:B:77:0x0049 */
    public static C015607h A0c(byte[] bytes) {
        InputStream inputStream;
        ObjectInputStream objectInputStream;
        C015607h c015607h = new C015607h();
        if (bytes == null) {
            return c015607h;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e) {
                    e = e;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        throw th;
                    }
                }
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        c015607h.A00.add(new C015707i(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    byteArrayInputStream.close();
                    return c015607h;
                } catch (IOException e4) {
                    e = e4;
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    byteArrayInputStream.close();
                    return c015607h;
                }
            } catch (IOException e6) {
                e6.printStackTrace();
                return c015607h;
            }
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    public static C07j A0d(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        if (value == 4) {
                            return C07j.METERED;
                        }
                        throw new IllegalArgumentException(C000200d.A0E("Could not convert ", value, " to NetworkType"));
                    }
                    return C07j.NOT_ROAMING;
                }
                return C07j.UNMETERED;
            }
            return C07j.CONNECTED;
        }
        return C07j.NOT_REQUIRED;
    }

    public static C07M A0e(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        if (value != 4) {
                            if (value == 5) {
                                return C07M.CANCELLED;
                            }
                            throw new IllegalArgumentException(C000200d.A0E("Could not convert ", value, " to State"));
                        }
                        return C07M.BLOCKED;
                    }
                    return C07M.FAILED;
                }
                return C07M.SUCCEEDED;
            }
            return C07M.RUNNING;
        }
        return C07M.ENQUEUED;
    }

    public static C015807k A0f(float f, Point point) {
        C015807k c015807k = new C015807k();
        c015807k.A04 = f;
        if (point != null) {
            c015807k.A05 = point.x;
            c015807k.A06 = point.y;
        }
        return c015807k;
    }

    public static C015807k A0g(C015907l c015907l) {
        C015807k c015807k = new C015807k();
        c015807k.A08 = c015907l.A03;
        float f = c015907l.A02;
        if (f != Float.MIN_VALUE) {
            c015807k.A03 = f;
        }
        float f2 = c015907l.A00;
        if (f2 != Float.MIN_VALUE) {
            c015807k.A00 = f2;
        }
        return c015807k;
    }

    public static C015807k A0h(C016007m c016007m) {
        C015807k c015807k = new C015807k();
        c015807k.A08 = c016007m;
        return c015807k;
    }

    public static C015807k A0i(C016007m c016007m, float f) {
        C015807k c015807k = new C015807k();
        c015807k.A08 = c016007m;
        c015807k.A03 = f;
        return c015807k;
    }

    public static C42C A0j(int i, double d) {
        double sqrt = Math.sqrt(i / d);
        return new C42C((int) (d * sqrt), (int) sqrt);
    }

    public static C42C A0k(C42C c42c, C42C c42c2) {
        int i = c42c.A01;
        int i2 = c42c.A00;
        double A012 = A01(i, i2);
        int i3 = c42c2.A01;
        int i4 = c42c2.A00;
        if (Math.abs(A012 - A01(i3, i4)) > 0.02f) {
            if ((i3 - i4) * (i - i2) < 0) {
                c42c2 = new C42C(i4, i3);
            }
            float f = c42c2.A00;
            float f2 = c42c2.A01;
            int i5 = (int) ((f / f2) * i);
            if (i5 <= i2) {
                return new C42C(i, i5);
            }
            return new C42C((int) ((f2 / f) * i2), i2);
        }
        return c42c;
    }

    public static C42C A0l(List list, C42C c42c, double d, Set set) {
        C42C c42c2 = null;
        int i = c42c.A01;
        int i2 = c42c.A00;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        if (d <= 0.0d) {
            d = A01(i, i2);
        }
        double d2 = Double.MAX_VALUE;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C42C c42c3 = (C42C) it.next();
            int i3 = c42c3.A01;
            int i4 = c42c3.A00;
            int max2 = Math.max(i3, i4);
            int min2 = Math.min(i3, i4);
            double A012 = A01(i3, i4);
            if (set == null || set.isEmpty() || set.contains(Double.valueOf(A012))) {
                if (max2 == max && min2 == min && Math.abs(A012 - d) <= 0.001d) {
                    return c42c3;
                }
                double abs = Math.abs(d - A012);
                double d3 = abs - d2;
                if (d3 <= 0.001d) {
                    if (Math.abs(d3) > 0.001d) {
                        d2 = abs;
                        c42c2 = null;
                        z = false;
                    }
                    if (max2 >= max && min2 >= min) {
                        if (!z) {
                            z = true;
                        } else if (c42c2 != null && A0E(c42c3, c42c2) < 0) {
                        }
                        c42c2 = c42c3;
                    } else if (!z) {
                        if (c42c2 != null && A0E(c42c3, c42c2) <= 0) {
                        }
                        c42c2 = c42c3;
                    }
                }
            }
        }
        return c42c2;
    }

    public static C44B A0m(int i) {
        if (i != 0) {
            if (i == 1) {
                return C44B.FRONT;
            }
            throw new RuntimeException(C000200d.A0D("Could not convert camera facing to optic: ", i));
        }
        return C44B.BACK;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f5 A[EDGE_INSN: B:100:0x00f5->B:90:0x00f5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C016507r A0n(X.C016107n r16, int r17, int r18, java.lang.CharSequence r19, X.C016207o r20, X.C07S r21) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07K.A0n(X.07n, int, int, java.lang.CharSequence, X.07o, X.07S):X.07r");
    }

    public static InterfaceC016607s A0o(C016107n c016107n, C016807u c016807u, AbstractC016307p abstractC016307p, int i, int i2) {
        Pair pair;
        float f = 0.0f;
        Number number = (Number) c016807u.A00.A00(AnonymousClass083.A02);
        if (number != null) {
            f = number.floatValue();
        }
        List A05 = c016807u.A05();
        if (f == 0.0f) {
            InterfaceC016607s A002 = ((AbstractC016907v) A05.get(0)).A00(c016107n, i, i2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(A002);
            return new InterfaceC016607s(arrayList, abstractC016307p, A002.getWidth(), A002.getHeight(), i, i2) { // from class: X.086
                public final int A00;
                public final int A01;
                public final int A02;
                public final int A03;
                public final AbstractC016307p A04;
                public final List A05;

                @Override // X.InterfaceC016607s
                public Object AAq() {
                    return null;
                }

                @Override // X.InterfaceC016607s
                public int ABn() {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int ABo() {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int ABp() {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int ABq() {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int AE7(int i3) {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int AE8(int i3) {
                    return 0;
                }

                {
                    this.A05 = arrayList;
                    this.A04 = abstractC016307p;
                    this.A02 = r3;
                    this.A00 = r4;
                    this.A03 = i;
                    this.A01 = i2;
                }

                @Override // X.InterfaceC016607s
                public InterfaceC016607s A8q(int i3) {
                    return (InterfaceC016607s) this.A05.get(i3);
                }

                @Override // X.InterfaceC016607s
                public int A8v() {
                    return this.A05.size();
                }

                @Override // X.InterfaceC016607s
                public int AAT() {
                    return this.A01;
                }

                @Override // X.InterfaceC016607s
                public AbstractC016307p ACm() {
                    return this.A04;
                }

                @Override // X.InterfaceC016607s
                public int AE3() {
                    return this.A03;
                }

                @Override // X.InterfaceC016607s
                public int getHeight() {
                    return this.A00;
                }

                @Override // X.InterfaceC016607s
                public int getWidth() {
                    return this.A02;
                }
            };
        } else if (f == 1.0f) {
            InterfaceC016607s A003 = ((AbstractC016907v) A05.get(1)).A00(c016107n, i, i2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(A003);
            return new InterfaceC016607s(arrayList2, abstractC016307p, A003.getWidth(), A003.getHeight(), i, i2) { // from class: X.086
                public final int A00;
                public final int A01;
                public final int A02;
                public final int A03;
                public final AbstractC016307p A04;
                public final List A05;

                @Override // X.InterfaceC016607s
                public Object AAq() {
                    return null;
                }

                @Override // X.InterfaceC016607s
                public int ABn() {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int ABo() {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int ABp() {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int ABq() {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int AE7(int i3) {
                    return 0;
                }

                @Override // X.InterfaceC016607s
                public int AE8(int i3) {
                    return 0;
                }

                {
                    this.A05 = arrayList2;
                    this.A04 = abstractC016307p;
                    this.A02 = r3;
                    this.A00 = r4;
                    this.A03 = i;
                    this.A01 = i2;
                }

                @Override // X.InterfaceC016607s
                public InterfaceC016607s A8q(int i3) {
                    return (InterfaceC016607s) this.A05.get(i3);
                }

                @Override // X.InterfaceC016607s
                public int A8v() {
                    return this.A05.size();
                }

                @Override // X.InterfaceC016607s
                public int AAT() {
                    return this.A01;
                }

                @Override // X.InterfaceC016607s
                public AbstractC016307p ACm() {
                    return this.A04;
                }

                @Override // X.InterfaceC016607s
                public int AE3() {
                    return this.A03;
                }

                @Override // X.InterfaceC016607s
                public int getHeight() {
                    return this.A00;
                }

                @Override // X.InterfaceC016607s
                public int getWidth() {
                    return this.A02;
                }
            };
        } else {
            InterfaceC016607s A004 = ((AbstractC016907v) A05.get(0)).A00(c016107n, i, i2);
            InterfaceC016607s A005 = ((AbstractC016907v) A05.get(1)).A00(c016107n, i, i2);
            int width = (int) (((A005.getWidth() - A004.getWidth()) * f) + A004.getWidth());
            int height = (int) (((A005.getHeight() - A004.getHeight()) * f) + A004.getHeight());
            ArrayList arrayList3 = new ArrayList();
            AnonymousClass087 anonymousClass087 = (AnonymousClass087) c016107n.A03;
            if (anonymousClass087 != null) {
                if (((Pair) AnonymousClass088.A0o(anonymousClass087, c016807u)) != null) {
                    if (c016807u.A8Z(AnonymousClass083.A01, false)) {
                        AnonymousClass089 anonymousClass089 = new AnonymousClass089(((Number) pair.first).intValue());
                        anonymousClass089.A06(new C08D(Float.valueOf(1.0f - f), new C08C() { // from class: X.08B
                            @Override // X.C08C
                            public void A5g(Context context, Object obj, Object obj2, Object obj3) {
                                ((View) obj).setAlpha(((Number) obj2).floatValue());
                            }

                            @Override // X.C08C
                            public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                                return !(obj != null ? obj.equals(obj2) : obj2 == null);
                            }

                            @Override // X.C08C
                            public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                                ((View) obj).setAlpha(1.0f);
                            }
                        }));
                        InterfaceC016607s interfaceC016607s = new InterfaceC016607s(anonymousClass089, A004) { // from class: X.08E
                            public final InterfaceC016607s A00;
                            public final AbstractC016307p A01;

                            @Override // X.InterfaceC016607s
                            public int A8v() {
                                return 1;
                            }

                            @Override // X.InterfaceC016607s
                            public Object AAq() {
                                return null;
                            }

                            @Override // X.InterfaceC016607s
                            public int ABn() {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int ABo() {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int ABp() {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int ABq() {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int AE7(int i3) {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int AE8(int i3) {
                                return 0;
                            }

                            {
                                this.A01 = anonymousClass089;
                                this.A00 = A004;
                            }

                            @Override // X.InterfaceC016607s
                            public InterfaceC016607s A8q(int i3) {
                                return this.A00;
                            }

                            @Override // X.InterfaceC016607s
                            public int AAT() {
                                return this.A00.AAT();
                            }

                            @Override // X.InterfaceC016607s
                            public AbstractC016307p ACm() {
                                return this.A01;
                            }

                            @Override // X.InterfaceC016607s
                            public int AE3() {
                                return this.A00.AE3();
                            }

                            @Override // X.InterfaceC016607s
                            public int getHeight() {
                                return this.A00.getHeight();
                            }

                            @Override // X.InterfaceC016607s
                            public int getWidth() {
                                return this.A00.getWidth();
                            }
                        };
                        AnonymousClass089 anonymousClass0892 = new AnonymousClass089(((Number) pair.second).intValue());
                        anonymousClass0892.A06(new C08D(Float.valueOf(f), new C08C() { // from class: X.08B
                            @Override // X.C08C
                            public void A5g(Context context, Object obj, Object obj2, Object obj3) {
                                ((View) obj).setAlpha(((Number) obj2).floatValue());
                            }

                            @Override // X.C08C
                            public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                                return !(obj != null ? obj.equals(obj2) : obj2 == null);
                            }

                            @Override // X.C08C
                            public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                                ((View) obj).setAlpha(1.0f);
                            }
                        }));
                        InterfaceC016607s interfaceC016607s2 = new InterfaceC016607s(anonymousClass0892, A005) { // from class: X.08E
                            public final InterfaceC016607s A00;
                            public final AbstractC016307p A01;

                            @Override // X.InterfaceC016607s
                            public int A8v() {
                                return 1;
                            }

                            @Override // X.InterfaceC016607s
                            public Object AAq() {
                                return null;
                            }

                            @Override // X.InterfaceC016607s
                            public int ABn() {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int ABo() {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int ABp() {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int ABq() {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int AE7(int i3) {
                                return 0;
                            }

                            @Override // X.InterfaceC016607s
                            public int AE8(int i3) {
                                return 0;
                            }

                            {
                                this.A01 = anonymousClass0892;
                                this.A00 = A005;
                            }

                            @Override // X.InterfaceC016607s
                            public InterfaceC016607s A8q(int i3) {
                                return this.A00;
                            }

                            @Override // X.InterfaceC016607s
                            public int AAT() {
                                return this.A00.AAT();
                            }

                            @Override // X.InterfaceC016607s
                            public AbstractC016307p ACm() {
                                return this.A01;
                            }

                            @Override // X.InterfaceC016607s
                            public int AE3() {
                                return this.A00.AE3();
                            }

                            @Override // X.InterfaceC016607s
                            public int getHeight() {
                                return this.A00.getHeight();
                            }

                            @Override // X.InterfaceC016607s
                            public int getWidth() {
                                return this.A00.getWidth();
                            }
                        };
                        arrayList3.add(interfaceC016607s);
                        arrayList3.add(interfaceC016607s2);
                    } else {
                        arrayList3.add(A004);
                        arrayList3.add(A005);
                    }
                    return new InterfaceC016607s(arrayList3, abstractC016307p, width, height, i, i2) { // from class: X.086
                        public final int A00;
                        public final int A01;
                        public final int A02;
                        public final int A03;
                        public final AbstractC016307p A04;
                        public final List A05;

                        @Override // X.InterfaceC016607s
                        public Object AAq() {
                            return null;
                        }

                        @Override // X.InterfaceC016607s
                        public int ABn() {
                            return 0;
                        }

                        @Override // X.InterfaceC016607s
                        public int ABo() {
                            return 0;
                        }

                        @Override // X.InterfaceC016607s
                        public int ABp() {
                            return 0;
                        }

                        @Override // X.InterfaceC016607s
                        public int ABq() {
                            return 0;
                        }

                        @Override // X.InterfaceC016607s
                        public int AE7(int i3) {
                            return 0;
                        }

                        @Override // X.InterfaceC016607s
                        public int AE8(int i3) {
                            return 0;
                        }

                        {
                            this.A05 = arrayList3;
                            this.A04 = abstractC016307p;
                            this.A02 = width;
                            this.A00 = height;
                            this.A03 = i;
                            this.A01 = i2;
                        }

                        @Override // X.InterfaceC016607s
                        public InterfaceC016607s A8q(int i3) {
                            return (InterfaceC016607s) this.A05.get(i3);
                        }

                        @Override // X.InterfaceC016607s
                        public int A8v() {
                            return this.A05.size();
                        }

                        @Override // X.InterfaceC016607s
                        public int AAT() {
                            return this.A01;
                        }

                        @Override // X.InterfaceC016607s
                        public AbstractC016307p ACm() {
                            return this.A04;
                        }

                        @Override // X.InterfaceC016607s
                        public int AE3() {
                            return this.A03;
                        }

                        @Override // X.InterfaceC016607s
                        public int getHeight() {
                            return this.A00;
                        }

                        @Override // X.InterfaceC016607s
                        public int getWidth() {
                            return this.A02;
                        }
                    };
                }
                throw new IllegalStateException("Controller for component returned null but it should have returned a Pair<Integer, Integer>");
            }
            throw new IllegalStateException("Calculate layout was called without a valid BloksContext");
        }
    }

    public static C08K A0p(Status status) {
        if (status.A02 != null) {
            return new C08K(status) { // from class: X.08J
            };
        }
        return new C08K(status);
    }

    public static C08L A0q(Object obj) {
        return new C08L(obj);
    }

    public static Float A0r(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        if (A0B == 0) {
            return null;
        }
        A1J(parcel, A0B, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static String A0s(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return "action";
                case 3:
                    return "portrait";
                case 4:
                    return "landscape";
                case 5:
                    return "night";
                case 6:
                    return "night-portrait";
                case 7:
                    return "theatre";
                case 8:
                    return "beach";
                case 9:
                    return "snow";
                case 10:
                    return "sunset";
                case GoogleMigrateImporterActivity.A0E /* 11 */:
                    return "steadyphoto";
                case 12:
                    return "fireworks";
                case 13:
                    return "sports";
                case 14:
                    return "party";
                case 15:
                    return "candlelight";
                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                    return "barcode";
                case 17:
                    return "hdr";
                default:
                    return null;
            }
        }
        return "auto";
    }

    public static String A0t(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case GoogleMigrateImporterActivity.A0E /* 11 */:
            case 12:
            default:
                return C000200d.A07(32, "unknown status code: ", i);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
        }
    }

    public static String A0u(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A0B);
        return readString;
    }

    public static String A0v(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static BigDecimal A0w(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + A0B);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigInteger A0x(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A0B);
        return new BigInteger(createByteArray);
    }

    public static ArrayList A0y(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A0B);
        return createStringArrayList;
    }

    public static ArrayList A0z(Parcel parcel, int i, Parcelable.Creator creator) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A0B);
        return createTypedArrayList;
    }

    public static HashSet A10(Object... objArr) {
        HashSet hashSet = new HashSet();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
        return hashSet;
    }

    public static List A11(Size[] sizeArr) {
        int length;
        if (sizeArr != null && (length = sizeArr.length) != 0) {
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(new C42C(sizeArr[i].getWidth(), sizeArr[i].getHeight()));
            }
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public static void A12() {
        if (C08M.A00 >= 18) {
            Trace.endSection();
        }
    }

    public static synchronized void A13() {
        synchronized (C07K.class) {
            if (!A01) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        C008303p.A00("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                C008303p.A00("c++_shared");
                C008303p.A00("static-webp");
                A01 = true;
            }
        }
    }

    public static void A14(int i, int i2, int i3, int i4, int i5) {
        A1X(i4 >= 0);
        A1X(i >= 0);
        A1X(i3 >= 0);
        A1X(i + i4 <= i5);
        A1X(i3 + i4 <= i2);
    }

    public static void A15(int i, int i2, Rect rect, Rect rect2) {
        if (i2 != 0 && i2 != 180) {
            rect.set(0, 0, rect.height(), rect.width());
            if (i == 90 || i == 270) {
                rect2.set(0, 0, rect2.height(), rect2.width());
            }
        } else if (i != 90 && i != 270) {
        } else {
            rect2.set(0, 0, rect2.height(), rect2.width());
        }
    }

    public static void A16(Context context) {
        Context applicationContext = context.getApplicationContext();
        C08N.A02 = applicationContext;
        C08N.A00 = applicationContext.getResources().getDisplayMetrics().density;
    }

    public static void A17(CaptureRequest.Builder builder, AnonymousClass456 anonymousClass456, AbstractC885543o abstractC885543o) {
        if (anonymousClass456 != null && abstractC885543o != null) {
            if (((Boolean) abstractC885543o.A00(AbstractC885543o.A05)).booleanValue()) {
                builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, anonymousClass456.A00(AbstractC886243v.A07));
                return;
            }
            return;
        }
        throw new IllegalStateException("Trying to update builder for exposure compensation after camera closed.");
    }

    public static void A18(CaptureRequest.Builder builder, AnonymousClass456 anonymousClass456, AbstractC885543o abstractC885543o) {
        if (anonymousClass456 == null || abstractC885543o == null) {
            return;
        }
        A1C(builder, abstractC885543o, ((Number) anonymousClass456.A00(AbstractC886243v.A09)).intValue());
    }

    public static void A19(CaptureRequest.Builder builder, AnonymousClass456 anonymousClass456, AbstractC885543o abstractC885543o) {
        if (anonymousClass456 != null && abstractC885543o != null) {
            if (Build.VERSION.SDK_INT >= 22 && ((Boolean) anonymousClass456.A00(AbstractC886243v.A0P)).booleanValue() && ((Boolean) abstractC885543o.A00(AbstractC885543o.A07)).booleanValue()) {
                builder.set(CaptureRequest.CONTROL_SCENE_MODE, 18);
                return;
            } else {
                builder.set(CaptureRequest.CONTROL_SCENE_MODE, 0);
                return;
            }
        }
        throw new IllegalStateException("Trying to update builder for hdr after camera closed.");
    }

    public static void A1A(CaptureRequest.Builder builder, AnonymousClass456 anonymousClass456, AbstractC885543o abstractC885543o) {
        if (anonymousClass456 != null && abstractC885543o != null) {
            if (((Boolean) abstractC885543o.A00(AbstractC885543o.A0B)).booleanValue()) {
                if (((Boolean) anonymousClass456.A00(AbstractC886243v.A0Q)).booleanValue() && !((Boolean) anonymousClass456.A00(AbstractC886243v.A0O)).booleanValue()) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    return;
                } else {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Trying to update builder for optical stabilization after camera closed.");
    }

    public static void A1B(CaptureRequest.Builder builder, AnonymousClass456 anonymousClass456, AbstractC885543o abstractC885543o) {
        if (anonymousClass456 != null && abstractC885543o != null) {
            if (((Boolean) abstractC885543o.A00(AbstractC885543o.A0I)).booleanValue()) {
                if (((Boolean) anonymousClass456.A00(AbstractC886243v.A0R)).booleanValue()) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    return;
                } else {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Trying to update builder for video stabilization after camera closed.");
    }

    public static void A1C(CaptureRequest.Builder builder, AbstractC885543o abstractC885543o, int i) {
        if (((List) abstractC885543o.A00(AbstractC885543o.A0V)).contains(Integer.valueOf(i))) {
            if (i == 0) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i == 1) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i == 2) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i != 3) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 2);
            }
        }
    }

    public static void A1D(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void A1E(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C000200d.A0D("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void A1F(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static void A1G(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C07L(C000200d.A07(37, "Overread allowed size end=", i), parcel);
        }
    }

    public static void A1H(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A0B(parcel, i));
    }

    public static void A1I(Parcel parcel, int i, int i2) {
        int A0B = A0B(parcel, i);
        if (A0B == i2) {
            return;
        }
        String hexString = Integer.toHexString(A0B);
        StringBuilder sb = new StringBuilder(C000200d.A00(hexString, 46));
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(A0B);
        throw new C07L(C000200d.A0M(sb, " (0x", hexString, ")"), parcel);
    }

    public static void A1J(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        StringBuilder sb = new StringBuilder(C000200d.A00(hexString, 46));
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new C07L(C000200d.A0M(sb, " (0x", hexString, ")"), parcel);
    }

    public static void A1K(C44N c44n) {
        if (c44n == null) {
            return;
        }
        int i = c44n.A05;
        int i2 = c44n.A04;
        String str = c44n.A09;
        int i3 = c44n.A06;
        int A0F = A0F(c44n.A08);
        boolean z = c44n.A0A;
        new Object(i, i2, str, i3, A0F) { // from class: X.41w
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final String A04;

            {
                this.A02 = i;
                this.A01 = i2;
                this.A04 = str;
                this.A03 = i3;
                this.A00 = A0F;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C881341w) {
                    C881341w c881341w = (C881341w) obj;
                    if (this.A02 == c881341w.A02 && this.A01 == c881341w.A01 && this.A03 == c881341w.A03 && this.A00 == c881341w.A00) {
                        return this.A04.equals(c881341w.A04);
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                return ((((this.A04.hashCode() + (((this.A02 * 31) + this.A01) * 31)) * 31) + this.A03) * 31) + this.A00;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0042, code lost:
        if (r12 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A1L(com.facebook.rendercore.RenderTreeNode r10, java.lang.Object r11, boolean r12) {
        /*
            android.graphics.Rect r0 = r10.A04
            android.graphics.Rect r10 = r10.A05
            int r4 = r0.left
            int r3 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            boolean r0 = r11 instanceof android.view.View
            if (r0 == 0) goto L60
            android.view.View r11 = (android.view.View) r11
            int r9 = r2 - r4
            int r8 = r1 - r3
            if (r10 == 0) goto L27
            boolean r0 = r11 instanceof X.C08P
            if (r0 != 0) goto L27
            int r7 = r10.left
            int r6 = r10.top
            int r5 = r10.right
            int r0 = r10.bottom
            r11.setPadding(r7, r6, r5, r0)
        L27:
            if (r12 != 0) goto L35
            int r0 = r11.getMeasuredHeight()
            if (r0 != r8) goto L35
            int r0 = r11.getMeasuredWidth()
            if (r0 == r9) goto L44
        L35:
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            r11.measure(r5, r0)
            if (r12 != 0) goto L5c
        L44:
            int r0 = r11.getLeft()
            if (r0 != r4) goto L5c
            int r0 = r11.getTop()
            if (r0 != r3) goto L5c
            int r0 = r11.getRight()
            if (r0 != r2) goto L5c
            int r0 = r11.getBottom()
            if (r0 == r1) goto L5f
        L5c:
            r11.layout(r4, r3, r2, r1)
        L5f:
            return
        L60:
            boolean r0 = r11 instanceof android.graphics.drawable.Drawable
            if (r0 == 0) goto L78
            if (r10 == 0) goto L72
            int r0 = r10.left
            int r4 = r4 + r0
            int r0 = r10.top
            int r3 = r3 + r0
            int r0 = r10.right
            int r2 = r2 - r0
            int r0 = r10.bottom
            int r1 = r1 - r0
        L72:
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            r11.setBounds(r4, r3, r2, r1)
            return
        L78:
            java.lang.String r1 = "Unsupported mounted content "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07K.A1L(com.facebook.rendercore.RenderTreeNode, java.lang.Object, boolean):void");
    }

    public static void A1M(Exception exc) {
        Log.e("Sysconf", "Unable to read _SC_CLK_TCK by reflection", exc);
    }

    public static void A1N(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    public static void A1O(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null value passed to getSnapshot!");
        }
    }

    public static void A1P(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void A1Q(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void A1R(String str) {
        if (C08M.A00 >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void A1S(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void A1T(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void A1U(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void A1V(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A1W(Throwable th) {
        if (!Error.class.isInstance(th)) {
            if (RuntimeException.class.isInstance(th)) {
                throw ((Throwable) RuntimeException.class.cast(th));
            }
            return;
        }
        throw ((Throwable) Error.class.cast(th));
    }

    public static void A1X(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A1Y(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A1Z(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A1a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A1b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A1c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void A1d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void A1e(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static boolean A1g(int i, int i2) {
        if (i != i2) {
            return View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0;
        }
        return true;
    }

    public static boolean A1h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (i != i2 && (mode2 != 0 || mode != 0)) {
            float f = i3;
            if (mode != 1073741824 || Math.abs(size - f) >= 0.5f) {
                if (mode == Integer.MIN_VALUE && mode2 == 0) {
                    if (size < f) {
                        return false;
                    }
                } else if (mode2 != Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || f > size) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A1i(Parcel parcel, int i) {
        A1I(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static boolean A1j(C006802z c006802z, C006802z c006802z2) {
        if (c006802z == c006802z2) {
            return true;
        }
        int i = c006802z.A00;
        if (i != c006802z2.A00) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = c006802z.A02;
            int i3 = i2 << 1;
            Object obj = objArr[i3];
            Object obj2 = objArr[i3 + 1];
            Object obj3 = c006802z2.get(obj);
            if (obj2 == null) {
                if (obj3 != null || !c006802z2.containsKey(obj)) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A1k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean A1l(Set set) {
        return set.contains(C884743g.A04) || set.contains(C884743g.A05) || set.contains(C884743g.A06) || set.contains(C884743g.A07);
    }

    public static boolean A1m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean A1n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static byte[] A1o(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A0B);
        return createByteArray;
    }

    public static byte[] A1p(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length();
            if (length <= 2147483647L) {
                byte[] bArr = new byte[(int) length];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return bArr;
            }
            Log.e("FileUtils", "Cannot read more than 2GB into an array");
            throw new IOException("Cannot read more than 2GB into an array");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x000c, code lost:
        if (r27 != 1) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A1q(int r22, int r23, int r24, int r25, int r26, int r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07K.A1q(int, int, int, int, int, int, java.util.List):int[]");
    }

    public static Object[] A1r(Parcel parcel, int i, Parcelable.Creator creator) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A0B);
        return createTypedArray;
    }

    public static String[] A1s(Parcel parcel, int i) {
        int A0B = A0B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A0B == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + A0B);
        return createStringArray;
    }
}
