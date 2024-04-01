package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.media.FaceDetector;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Ae */
/* loaded from: classes.dex */
public final class C02180Ae {
    public static long A00;
    public static C02910Dj A01;
    public static File A02;
    public static Thread A03;

    public static float A00(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int A01(int i) {
        if (i == R.drawable.ic_call_incoming) {
            return R.color.voipIncomingCallIconTint;
        }
        if (i == R.drawable.ic_call_outgoing) {
            return R.color.voipOutgoingCallIconTint;
        }
        return R.color.voipMissedCallIconTint;
    }

    public static int A02(int i, C40781sr c40781sr) {
        if (i == 0) {
            return 1;
        }
        if (i >= 2 || c40781sr.A02 == null) {
            if (i >= 3 || c40781sr.A04 == null) {
                return (i >= 4 || c40781sr.A03 == null) ? 5 : 4;
            }
            return 3;
        }
        return 2;
    }

    public static int A03(Resources resources, C0D7 c0d7) {
        int[] intArray = resources.getIntArray(R.array.group_participant_name_colors);
        return intArray[c0d7.A00 % intArray.length];
    }

    public static int A04(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C0D8) {
            return 1;
        }
        if (anonymousClass092 instanceof C0DA) {
            return ((C0DA) anonymousClass092).A18().size();
        }
        if (C0DB.A0d(anonymousClass092)) {
            C09E c09e = (C09E) anonymousClass092;
            C09H c09h = ((AnonymousClass097) c09e).A02;
            if (c09h != null) {
                return c09h.A01;
            }
            return c09e.A00;
        }
        return 0;
    }

    public static int A05(C0DC c0dc) {
        if (c0dc == C0DC.A0D) {
            return 1;
        }
        if (C0DC.A0A == c0dc || C0DC.A0C == c0dc) {
            return 0;
        }
        if (C0DC.A05 == c0dc) {
            return 2;
        }
        if (C0DC.A07 == c0dc) {
            return 3;
        }
        if (C0DC.A0N == c0dc) {
            return 4;
        }
        if (C0DC.A04 == c0dc) {
            return 5;
        }
        if (C0DC.A0I == c0dc) {
            return 6;
        }
        if (C0DC.A0E == c0dc) {
            return 8;
        }
        return C0DC.A0F == c0dc ? 9 : -1;
    }

    public static int A06(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public static int A07(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static int A08(float[] fArr) {
        int round;
        int round2;
        int round3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round(f4 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round(f4 * 255.0f);
                break;
            case 2:
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(Math.max(0, Math.min(255, round)), Math.max(0, Math.min(255, round2)), Math.max(0, Math.min(255, round3)));
    }

    public static long A09(byte[] bArr, int i) {
        return ((bArr[i + 2] << 16) & 16711680) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280);
    }

    public static long A0A(byte[] bArr, int i) {
        return ((bArr[i + 2] << 16) & 16711680) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280);
    }

    public static long A0B(byte[] bArr, int i) {
        return ((bArr[i + 2] << 16) & 16711680) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280);
    }

    public static long A0C(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & 4278190080L) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    public static long A0D(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & 4278190080L) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    public static long A0E(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & 4278190080L) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    public static Activity A0F(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Activity A0G(Context context, Class cls) {
        Activity A0F = A0F(context);
        if (A0F == null || !cls.isAssignableFrom(A0F.getClass())) {
            return null;
        }
        return A0F;
    }

    public static Intent A0H(List list, CharSequence charSequence, IntentSender intentSender) {
        Intent intent;
        int i;
        int i2 = 0;
        Intent intent2 = (Intent) list.get(0);
        if (Build.VERSION.SDK_INT >= 22 && intentSender != null) {
            intent = Intent.createChooser(intent2, charSequence, intentSender);
        } else {
            intent = Intent.createChooser(intent2, charSequence);
        }
        int size = list.size() - 1;
        if (size > 0) {
            Parcelable[] parcelableArr = new Intent[size];
            do {
                i = i2 + 1;
                parcelableArr[i2] = list.get(i);
                i2 = i;
            } while (i < size);
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", parcelableArr);
        }
        return intent;
    }

    public static Bitmap A0I(File file) {
        return A0K(file, new C40821sv(-1));
    }

    public static Bitmap A0J(File file, long j) {
        if (j == 0) {
            return A0I(file);
        }
        try {
            C40831sw c40831sw = new C40831sw();
            c40831sw.A00(file);
            Bitmap frameAtTime = c40831sw.getFrameAtTime(j);
            c40831sw.close();
            return frameAtTime;
        } catch (Exception | NoSuchMethodError unused) {
            return null;
        }
    }

    public static Bitmap A0K(File file, C40821sv c40821sv) {
        Bitmap A08;
        byte[] embeddedPicture;
        if (file == null) {
            Log.e("mediafileutils/createVideoThumbnail/file=null");
            return null;
        }
        if (C40841sx.A0i(file)) {
            try {
                C40851sy A012 = C40851sy.A01(file, true);
                Bitmap A09 = A012.A09(0);
                A012.close();
                return A09;
            } catch (IOException e) {
                Log.e("gif file not read ", e);
            }
        }
        int i = c40821sv.A00;
        boolean z = c40821sv.A01;
        try {
            C40831sw c40831sw = new C40831sw();
            C000700j.A0A(true, "Shouldn't set data source many times");
            c40831sw.A00(file);
            Bitmap scaledFrameAtTime = (Build.VERSION.SDK_INT < 27 || i <= 0) ? null : c40831sw.getScaledFrameAtTime(0L, 0, i, i);
            if (scaledFrameAtTime == null) {
                scaledFrameAtTime = c40831sw.getFrameAtTime(0L);
            }
            if (scaledFrameAtTime == null) {
                scaledFrameAtTime = c40831sw.getFrameAtTime();
            }
            if (scaledFrameAtTime == null && (embeddedPicture = c40831sw.getEmbeddedPicture()) != null) {
                scaledFrameAtTime = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, C0DD.A02);
            }
            if (scaledFrameAtTime != null && i > 0 && scaledFrameAtTime != (A08 = C0DD.A08(scaledFrameAtTime, null, i, i))) {
                scaledFrameAtTime.recycle();
                scaledFrameAtTime = A08;
            }
            if (scaledFrameAtTime != null && (Build.VERSION.SDK_INT <= 19 || (z && scaledFrameAtTime.getConfig() != Bitmap.Config.ARGB_8888))) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                scaledFrameAtTime.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                scaledFrameAtTime.recycle();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDither = true;
                options.inInputShareable = true;
                options.inPurgeable = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                scaledFrameAtTime = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, C0DD.A02);
            }
            if (scaledFrameAtTime == null) {
                Log.w("mediafileutils/createVideoThumbnail/no bitmap created");
            }
            c40831sw.close();
            return scaledFrameAtTime;
        } catch (IOException e2) {
            Log.e("mediafileutils/createVideoThumbnail/unable to load video", e2);
            return null;
        } catch (RuntimeException e3) {
            Log.e("mediafileutils/createVideoThumbnail/corrupt video file", e3);
            return null;
        }
    }

    public static Drawable A0L(Context context) {
        Drawable A032 = C02160Ac.A03(context, R.drawable.balloon_incoming_frame);
        int A002 = C02160Ac.A00(context, R.color.bubbleIncomingTint);
        if (A032 != null) {
            if (A002 != 0) {
                return A0Q(A032, A002);
            }
            return A032;
        }
        throw null;
    }

    public static Drawable A0M(Context context) {
        Drawable A032 = C02160Ac.A03(context, R.drawable.balloon_outgoing_frame);
        int A002 = C02160Ac.A00(context, R.color.bubbleOutgoingTint);
        if (A032 != null) {
            if (A002 != 0) {
                return A0Q(A032, A002);
            }
            return A032;
        }
        throw null;
    }

    public static Drawable A0N(Context context, int i) {
        Drawable A032 = C02160Ac.A03(context, i);
        if (A032 != null) {
            return A032;
        }
        throw null;
    }

    public static Drawable A0O(Context context, int i, int i2) {
        Integer num;
        Drawable A032 = C02160Ac.A03(context, i);
        if (A032 != null) {
            Drawable mutate = A032.mutate();
            try {
                num = Integer.valueOf(C02160Ac.A00(context, i2));
            } catch (Resources.NotFoundException unused) {
                num = null;
            }
            return (num == null || num.intValue() == 0) ? mutate : A0Q(mutate, C02160Ac.A00(context, i2));
        }
        throw null;
    }

    public static Drawable A0P(Context context, Drawable drawable) {
        ColorStateList A022 = C02160Ac.A02(context, R.color.ripple_tint);
        if (Build.VERSION.SDK_INT >= 21 && A022 != null) {
            return new RippleDrawable(A022, drawable, null);
        }
        if (!(drawable instanceof C0DE)) {
            drawable = C07O.A0I(drawable);
        }
        C07O.A0a(drawable, PorterDuff.Mode.MULTIPLY);
        C07O.A0Z(drawable, new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{C02160Ac.A00(context, R.color.ripple_compat_tint), C02160Ac.A00(context, R.color.multiply_none)}));
        return drawable;
    }

    public static Drawable A0Q(Drawable drawable, int i) {
        if (i == 0) {
            return drawable;
        }
        Drawable A0I = C07O.A0I(drawable);
        C07O.A0X(A0I, i);
        return A0I;
    }

    public static PowerManager.WakeLock A0R(PowerManager powerManager, int i, String str) {
        StringBuilder sb = new StringBuilder("com.whatsapp");
        sb.append(":");
        sb.append(str);
        return powerManager.newWakeLock(i, sb.toString());
    }

    public static SpannableString A0S(Context context, String str, C83563sK c83563sK) {
        Object[] spans;
        Spanned fromHtml = Html.fromHtml(str);
        String obj = fromHtml.toString();
        SpannableString spannableString = new SpannableString(obj);
        for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
            int spanStart = fromHtml.getSpanStart(obj2);
            int spanEnd = fromHtml.getSpanEnd(obj2);
            int spanFlags = fromHtml.getSpanFlags(obj2);
            if (obj2 instanceof URLSpan) {
                URLSpan uRLSpan = (URLSpan) obj2;
                if (c83563sK != null) {
                    String url = uRLSpan.getURL();
                    obj2 = new C40871t0(context, url, A0m(url), A0r(url), c83563sK);
                }
            }
            spannableString.setSpan(obj2, spanStart, spanEnd, spanFlags);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair A0T(X.C002301c r13, long r14, boolean r16) {
        /*
            r8 = 0
            r6 = 1
            r12 = 0
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 >= 0) goto Lb5
            r11 = 1
            long r3 = -r14
        La:
            r1 = 900000(0xdbba0, double:4.44659E-318)
            java.lang.String r5 = "%.1f"
            java.lang.String r10 = "%.0f"
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L63
            float r1 = (float) r3
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            r7 = 279(0x117, float:3.91E-43)
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 == 0) goto L26
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L9c
            r10 = r5
        L26:
            r5 = r10
        L27:
            if (r11 == 0) goto L2a
            float r1 = -r1
        L2a:
            java.util.Locale r3 = r13.A0I()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r0[r12] = r2
            java.lang.String r4 = java.lang.String.format(r3, r5, r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r12] = r2
            java.lang.String r3 = java.lang.String.format(r1, r5, r0)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r12] = r4
            java.util.Locale r1 = r13.A0I()
            X.0DF r0 = r13.A02()
            X.0DG r0 = r0.A02
            java.lang.String r0 = r0.A03(r7, r3)
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            java.lang.String r0 = r13.A0E(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
            return r0
        L63:
            r1 = 900000000(0x35a4e900, double:4.446590813E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L73
            float r1 = (float) r3
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r0
            r7 = 280(0x118, float:3.92E-43)
        L71:
            r2 = 0
            goto L9d
        L73:
            r1 = 900000000000(0xd18c2e2800, double:4.44659081257E-312)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L84
            float r1 = (float) r3
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            r7 = 275(0x113, float:3.85E-43)
            goto L71
        L84:
            r1 = 900000000000000(0x3328b944c4000, double:4.44659081257122E-309)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            float r1 = (float) r3
            if (r0 > 0) goto L95
            r0 = 1399379109(0x5368d4a5, float:1.0E12)
            float r1 = r1 / r0
            r7 = 289(0x121, float:4.05E-43)
            goto L71
        L95:
            r0 = 1482907561(0x58635fa9, float:9.9999999E14)
            float r1 = r1 / r0
            r7 = 286(0x11e, float:4.01E-43)
            goto L71
        L9c:
            r2 = 1
        L9d:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto La6
            java.lang.String r5 = "%.2f"
            goto L27
        La6:
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L27
            if (r16 == 0) goto Lb2
            if (r2 != 0) goto Lb2
            goto L27
        Lb2:
            r5 = r10
            goto L27
        Lb5:
            r11 = 0
            r3 = r14
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02180Ae.A0T(X.01c, long, boolean):android.util.Pair");
    }

    public static Pair A0U(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        C0DI A0L = C002701i.A0L(file, new C0DH(400, 400, null, true, options));
        Bitmap bitmap = A0L.A02;
        Pair pair = null;
        if (bitmap == null) {
            return null;
        }
        if ((bitmap.getWidth() & 1) == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight());
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            bitmap = createBitmap;
        }
        FaceDetector.Face[] faceArr = new FaceDetector.Face[1];
        if (new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), 1).findFaces(bitmap, faceArr) > 0 && faceArr[0].confidence() > 0.3f) {
            PointF pointF = new PointF();
            faceArr[0].getMidPoint(pointF);
            pair = new Pair(Integer.valueOf((int) ((pointF.x * A0L.A01) / bitmap.getWidth())), Integer.valueOf((int) ((pointF.y * A0L.A00) / bitmap.getHeight())));
        }
        bitmap.recycle();
        return pair;
    }

    public static AnimationSet A0V(final View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.up);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), R.anim.down);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(view.getContext(), R.anim.shake);
        final AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(loadAnimation);
        animationSet.addAnimation(loadAnimation3);
        animationSet.addAnimation(loadAnimation2);
        animationSet.setRepeatMode(1);
        animationSet.setRepeatCount(-1);
        animationSet.setStartOffset(750L);
        animationSet.setAnimationListener(new C0DJ() { // from class: X.1t1
            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AnimationSet animationSet2 = animationSet;
                animationSet2.setStartOffset(1500L);
                view.startAnimation(animationSet2);
            }
        });
        return animationSet;
    }

    public static C40791ss A0W(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("text");
        String string2 = jSONObject.getString("iconDescription");
        String string3 = jSONObject.getString("action");
        JSONObject jSONObject2 = jSONObject.getJSONObject("icon");
        return new C40791ss(string, jSONObject2.getString("light"), jSONObject2.getString("dark"), string2, string3, A0a(jSONObject.getJSONObject("timing")));
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003f: INVOKE  (r0v0 ?? I:java.lang.StringBuilder), (r3 I:int) type: VIRTUAL call: java.lang.StringBuilder.append(int):java.lang.StringBuilder, block:B:25:0x0038 */
    public static C40781sr A0X(int i, InputStream inputStream) {
        int append;
        try {
            JSONObject A0N = AnonymousClass024.A0N(inputStream);
            if (A0N != null) {
                return new C40781sr(i, A0N.getInt("policyVersion"), A0W(A0N.optJSONObject("banner")), A0b(A0N.optJSONObject("modal"), true), A0b(A0N.optJSONObject("blocking-modal"), false));
            }
            throw null;
        } catch (IOException | JSONException e) {
            StringBuilder sb = new StringBuilder("Failed to parse user notice content for notice id: ");
            sb.append(append);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public static C40901t3 A0Y(JSONObject jSONObject) {
        TimeZone timeZone;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("time");
        String string2 = jSONObject.getString("reference");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        if ("utc".equalsIgnoreCase(string2)) {
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            timeZone = TimeZone.getDefault();
        }
        try {
            simpleDateFormat.setTimeZone(timeZone);
            Date parse = simpleDateFormat.parse(string);
            if (parse != null) {
                return new C40901t3(parse.getTime());
            }
            throw null;
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder("UserNoticeTiming/getDate/Unable to parse date: ");
            sb.append(string);
            sb.append(" reference: ");
            sb.append(string2);
            Log.e(sb.toString());
            throw new RuntimeException(e);
        }
    }

    public static C40891t2 A0Z(int i, C40781sr c40781sr) {
        if (i != 0 && i != 1) {
            if (i == 2) {
                C40791ss c40791ss = c40781sr.A02;
                if (c40791ss != null) {
                    return c40791ss.A00;
                }
            } else if (i == 3) {
                C40811su c40811su = c40781sr.A04;
                if (c40811su != null) {
                    return c40811su.A00;
                }
                return null;
            } else if (i == 4) {
                C40811su c40811su2 = c40781sr.A03;
                if (c40811su2 != null) {
                    return c40811su2.A00;
                }
                return null;
            } else if (i != 5) {
                throw new IllegalStateException(C000200d.A0D("Unexpected value: ", i));
            }
        }
        return null;
    }

    public static C40891t2 A0a(JSONObject jSONObject) {
        C40901t3 A0Y = A0Y(jSONObject.optJSONObject("start"));
        JSONObject optJSONObject = jSONObject.optJSONObject("duration");
        C40911t4 c40911t4 = null;
        long[] jArr = null;
        if (optJSONObject != null) {
            int optInt = optJSONObject.optInt("static", -1);
            long j = optInt != -1 ? optInt * 3600000 : -1L;
            JSONArray optJSONArray = optJSONObject.optJSONArray("repeat");
            if (optJSONArray != null) {
                jArr = new long[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    jArr[i] = optJSONArray.getInt(i) * 3600000;
                }
            }
            c40911t4 = new C40911t4(j, jArr);
        }
        return new C40891t2(A0Y, c40911t4, A0Y(jSONObject.optJSONObject("end")));
    }

    public static C40811su A0b(JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("iconDescription");
        String string3 = jSONObject.getString("buttonText");
        JSONObject jSONObject2 = jSONObject.getJSONObject("icon");
        String string4 = jSONObject2.getString("light");
        String string5 = jSONObject2.getString("dark");
        C40891t2 A0a = A0a(jSONObject.getJSONObject("timing"));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("bullets");
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            String string6 = jSONObject3.getString("text");
            JSONObject optJSONObject = jSONObject3.optJSONObject("icon");
            if (optJSONObject != null) {
                str3 = optJSONObject.getString("light");
                str2 = optJSONObject.getString("dark");
            } else {
                str2 = str3;
            }
            arrayList.add(new C40921t5(string6, str3, str2));
            i++;
            str3 = null;
        }
        String optString = jSONObject.optString("body");
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        String optString2 = jSONObject.optString("footer");
        if (TextUtils.isEmpty(optString2)) {
            optString2 = null;
        }
        if (z) {
            str = jSONObject.getString("dismissText");
        } else {
            str = null;
        }
        return new C40811su(string4, string5, string2, string, arrayList, string3, A0a, optString, optString2, str);
    }

    public static C40931t6 A0c(C002301c c002301c, long j) {
        String format;
        double d = j;
        int i = 0;
        while (i < 3 && d > 1000.0d) {
            d /= 1000.0d;
            i++;
        }
        Locale A0I = c002301c.A0I();
        String str = "";
        int i2 = 279;
        if (j == 0) {
            format = String.format(A0I, "%d", 0);
            str = String.format(Locale.US, "%d", 0);
        } else if (i == 0) {
            Double valueOf = Double.valueOf(d / 1000.0d);
            format = String.format(A0I, "%1$.1f", valueOf);
            str = String.format(Locale.US, "%1$.1f", valueOf);
        } else if (i == 1) {
            Double valueOf2 = Double.valueOf(d);
            format = String.format(A0I, "%1$.0f", valueOf2);
            str = String.format(Locale.US, "%1$.0f", valueOf2);
        } else if (i == 2) {
            Double valueOf3 = Double.valueOf(d);
            format = String.format(A0I, "%1$.1f", valueOf3);
            str = String.format(Locale.US, "%1$.1f", valueOf3);
            i2 = 280;
        } else if (i != 3) {
            format = "";
        } else {
            Double valueOf4 = Double.valueOf(d);
            format = String.format(A0I, "%1$.1f", valueOf4);
            str = String.format(Locale.US, "%1$.1f", valueOf4);
            i2 = 275;
        }
        String A032 = c002301c.A02().A02.A03(i2, str);
        int indexOf = A032.indexOf("%1$s");
        C000700j.A07(indexOf != -1);
        return new C40931t6(A032.substring(0, indexOf), format, A032.substring(indexOf + 4));
    }

    public static synchronized File A0d(Context context, C012005w c012005w, C02O c02o, C0DC c0dc, String str, int i) {
        File file;
        synchronized (C02180Ae.class) {
            A02 = C0DD.A0E(c012005w, c02o, str, c0dc, 0, i);
            SharedPreferences.Editor edit = c02o.A01(C02M.A02).edit();
            edit.putString("external_file_image", A02.getAbsolutePath());
            edit.apply();
            file = A02;
        }
        return file;
    }

    public static synchronized File A0e(C02O c02o) {
        File file;
        String string;
        synchronized (C02180Ae.class) {
            if (A02 == null && (string = c02o.A01(C02M.A02).getString("external_file_image", null)) != null) {
                A02 = new File(string);
            }
            file = A02;
        }
        return file;
    }

    public static Object A0f(Object component, Class entryPoint) {
        if (component instanceof C0C6) {
            return entryPoint.cast(component);
        }
        if (component instanceof AnonymousClass005) {
            return entryPoint.cast(((AnonymousClass005) component).generatedComponent());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", component.getClass(), C0C6.class, AnonymousClass005.class));
    }

    public static String A0g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt((int) (Math.random() * 62)));
        }
        return sb.toString();
    }

    public static String A0h(Context context, C018708s c018708s, C0DK c0dk, C09B c09b, C40941t7 c40941t7) {
        int i;
        synchronized (c40941t7) {
            i = c40941t7.A02;
        }
        if (c40941t7.A08()) {
            return context.getString(R.string.unable_to_finish_download);
        }
        if (i == 9) {
            return context.getString(R.string.unable_to_finish_download);
        }
        if (i == 4) {
            boolean A012 = C000400f.A01();
            int i2 = R.string.insufficient_space_for_download_shared_storage;
            if (A012) {
                i2 = R.string.insufficient_space_for_download;
            }
            return context.getString(i2);
        } else if (i != 5) {
            if (i == 8) {
                return context.getString(R.string.invalid_url_for_download);
            }
            if (i != 0) {
                return context.getString(R.string.unable_to_finish_download);
            }
            return null;
        } else {
            AbstractC005302j abstractC005302j = c09b.A0n.A00;
            if (C003101m.A0U(abstractC005302j) || C003101m.A0Z(abstractC005302j)) {
                abstractC005302j = c09b.A0G;
            }
            if (abstractC005302j != null) {
                return context.getString(R.string.too_old_for_download, c018708s.A08(c0dk.A02(abstractC005302j), false));
            }
            return context.getString(R.string.invalid_url_for_download);
        }
    }

    public static String A0i(Context context, AnonymousClass092 anonymousClass092) {
        if (C0DB.A0d(anonymousClass092)) {
            String A1B = ((AnonymousClass097) anonymousClass092).A1B();
            return TextUtils.isEmpty(A1B) ? context.getString(R.string.conversations_most_recent_contact) : AnonymousClass024.A0H(A1B);
        }
        return null;
    }

    public static String A0j(C002301c c002301c, int i, long j, boolean z) {
        String A04;
        Pair A0T = A0T(c002301c, j, z);
        String str = (String) A0T.second;
        Object[] objArr = {A0T.first};
        Locale A0I = c002301c.A0I();
        C0DF A022 = c002301c.A02();
        if (A022.A07) {
            A04 = c002301c.A00.getResources().getQuantityString(i, str.equals("1") ? 1 : 2);
        } else {
            A04 = A022.A03.A04(i, true, str);
            if (A04 == null) {
                try {
                    r4 = (int) Double.parseDouble(str);
                } catch (NumberFormatException unused) {
                }
                A04 = c002301c.A00.getResources().getQuantityString(i, r4);
            }
        }
        return String.format(A0I, A04, objArr);
    }

    public static String A0k(C002301c c002301c, long j) {
        return (String) A0T(c002301c, j, false).first;
    }

    public static String A0l(C002301c c002301c, long j) {
        C40931t6 A0c = A0c(c002301c, j);
        StringBuilder sb = new StringBuilder();
        sb.append(A0c.A01);
        sb.append(A0c.A02);
        sb.append(A0c.A00);
        return sb.toString();
    }

    public static String A0m(String str) {
        if (str.startsWith("whatsapp:user-notice")) {
            StringBuilder sb = new StringBuilder("h://");
            sb.append(str);
            String queryParameter = Uri.parse(sb.toString()).getQueryParameter("action");
            return queryParameter == null ? "" : queryParameter;
        }
        return "open-link";
    }

    public static String A0n(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String A0o(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("server_params", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("params", jSONObject2);
        return jSONObject3.toString();
    }

    public static String A0p(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", Integer.valueOf(bArr[i] & 255)));
        }
        return sb.toString();
    }

    public static List A0q(C40951t8 c40951t8, AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C0D8) {
            return Collections.singletonList(((C0D8) anonymousClass092).A18());
        }
        if (anonymousClass092 instanceof C0DA) {
            return ((C0DA) anonymousClass092).A18();
        }
        List list = null;
        if (C0DB.A0d(anonymousClass092)) {
            C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
            if (c09h != null) {
                File file = c09h.A0F;
                if (file != null) {
                    Uri fromFile = Uri.fromFile(file);
                    if (c40951t8 != null) {
                        try {
                            list = C40961t9.A00(c40951t8.A02(fromFile));
                            return list;
                        } catch (IOException e) {
                            Log.e("vcardloader/splitvcards/exception", e);
                        }
                    } else {
                        throw null;
                    }
                }
            } else {
                throw null;
            }
        }
        return list;
    }

    public static Map A0r(String str) {
        HashMap hashMap = new HashMap();
        if (!str.startsWith("whatsapp:user-notice")) {
            hashMap.put("link", str);
            return hashMap;
        }
        StringBuilder sb = new StringBuilder("h://");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        for (String str2 : parse.getQueryParameterNames()) {
            if (!"action".equals(str2)) {
                hashMap.put(str2, parse.getQueryParameter(str2));
            }
        }
        return hashMap;
    }

    public static ThreadPoolExecutor A0s(int i, int i2, TimeUnit timeUnit, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, 1, timeUnit, new LinkedBlockingDeque<Runnable>() { // from class: X.1tA
            @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
            public boolean offer(Object obj) {
                return isEmpty() && super.offer(obj);
            }
        }, new ThreadFactory(str) { // from class: X.1tB
            public final String A00;
            public final AtomicInteger A01 = new AtomicInteger(0);

            {
                this.A00 = str;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                RunnableEBaseShape7S0100000_I0_7 runnableEBaseShape7S0100000_I0_7 = new RunnableEBaseShape7S0100000_I0_7(runnable, 23);
                StringBuilder sb = new StringBuilder();
                sb.append(this.A00);
                sb.append(this.A01.getAndIncrement());
                return new Thread(runnableEBaseShape7S0100000_I0_7, sb.toString());
            }
        });
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: X.3Ye
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                try {
                    threadPoolExecutor2.getQueue().put(runnable);
                } catch (InterruptedException e) {
                    Log.e(e);
                }
            }
        });
        return threadPoolExecutor;
    }

    public static C41001tD A0t(int i, int i2) {
        if (i == 1 || i == 5) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 4) {
                        return new C41001tD(new C40991tC());
                    }
                    throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
                }
                return new C41001tD(new C41011tE());
            }
            return new C41001tD(new C0DP());
        }
        throw new IllegalStateException("unknown type scheme for PBE encryption.");
    }

    public static void A0u(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void A0v(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void A0w(long j, byte[] bArr, int i) {
        A0u((int) (j >>> 32), bArr, i);
        A0u((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void A0x(Context context, C005102h c005102h, String str) {
        A0y(context, c005102h, context.getString(R.string.error_notification_title), str, 2);
    }

    public static void A0y(Context context, C005102h c005102h, String str, String str2, int i) {
        Log.i("errorreporter/reporterror");
        PendingIntent activity = PendingIntent.getActivity(context, 1, new Intent(context, Main.class), 0);
        C005402l A002 = C0DU.A00(context);
        A002.A0J = "critical_app_alerts@1";
        A002.A0I = "err";
        A002.A03 = 1;
        A002.A07.tickerText = C005402l.A00(str);
        A002.A0A(str);
        A002.A09(str2);
        A002.A09 = activity;
        A002.A07.icon = R.drawable.notifybar_error;
        if (Build.VERSION.SDK_INT >= 21) {
            A002.A06 = 1;
        }
        c005102h.A03(null, i, A002.A01());
    }

    public static void A0z(Spannable spannable, C0DV c0dv, C0DW c0dw) {
        Pattern AC9;
        if (!c0dw.A04() || (AC9 = c0dv.A03().AC9()) == null) {
            return;
        }
        Matcher matcher = AC9.matcher(spannable);
        while (matcher.find()) {
            Pair A002 = C41021tF.A00(spannable, new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())), C41021tF.A01);
            int intValue = ((Number) A002.first).intValue();
            int intValue2 = ((Number) A002.second).intValue();
            StringBuilder A0P = C000200d.A0P("wapay://pay/");
            A0P.append((Object) spannable.subSequence(intValue, intValue2));
            spannable.setSpan(new URLSpan(A0P.toString()), intValue, intValue2, 0);
        }
    }

    public static void A10(Spannable spannable, String str) {
        C0DZ A002 = C0DZ.A00();
        C02840Db c02840Db = new C02840Db(A002, spannable, A002.A0G(Integer.parseInt(str)), EnumC02830Da.A05);
        while (c02840Db.hasNext()) {
            C02850Dc c02850Dc = (C02850Dc) c02840Db.next();
            int i = c02850Dc.A00;
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(c02850Dc.A02.length() + i));
            if (!C41021tF.A01(spannable, pair)) {
                pair = C41021tF.A00(spannable, pair, C41021tF.A02);
                if (C41021tF.A01(spannable, pair) && pair != null) {
                }
            }
            StringBuilder A0P = C000200d.A0P("tel:");
            A0P.append((Object) spannable.subSequence(((Number) pair.first).intValue(), ((Number) pair.second).intValue()));
            spannable.setSpan(new URLSpan(A0P.toString()), ((Number) pair.first).intValue(), ((Number) pair.second).intValue(), 33);
        }
    }

    public static void A11(View view) {
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public static void A12(View view, int i) {
        StringBuilder sb = new StringBuilder("voip/VoipAnimationUtils/animateButtonIn delay:");
        sb.append(i);
        Log.i(sb.toString());
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        scaleAnimation.setDuration(300L);
        scaleAnimation.setStartOffset(i);
        view.startAnimation(scaleAnimation);
    }

    public static void A13(final View view, final int i) {
        if (view == null) {
            return;
        }
        AlphaAnimation alphaAnimation = i == 0 ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(125L);
        alphaAnimation.setStartOffset(0);
        alphaAnimation.setAnimationListener(new C0DJ() { // from class: X.1tH
            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(i);
            }
        });
        view.startAnimation(alphaAnimation);
    }

    public static void A14(final View view, final String str, final String str2, final boolean z) {
        C0AT.A0c(view, new C0AS() { // from class: X.1tI
            @Override // X.C0AS
            public void A04(View view2, C08420bS c08420bS) {
                View.AccessibilityDelegate accessibilityDelegate = super.A01;
                AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                c08420bS.A08("Button");
                accessibilityNodeInfo.setSelected(false);
                accessibilityNodeInfo.setContentDescription(str);
                String str3 = str2;
                if (str3 != null) {
                    c08420bS.A06(new C08440bU(16, str3));
                }
                View view3 = (View) view.getParent();
                if (!z || view3 == null) {
                    return;
                }
                int[] iArr = new int[2];
                view3.getLocationOnScreen(iArr);
                int i = iArr[0];
                accessibilityNodeInfo.setBoundsInScreen(new Rect(i, iArr[1], view3.getWidth() + i, view3.getHeight() + iArr[1]));
            }
        });
    }

    public static void A15(View view, boolean z) {
        view.setEnabled(z);
        view.setAlpha(z ? 1.0f : 0.4f);
    }

    public static void A16(View view, boolean z, boolean z2) {
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                if (z2) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setDuration(125L);
                    scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                    scaleAnimation.setFillBefore(true);
                    view.startAnimation(scaleAnimation);
                }
            }
        } else if (view.getVisibility() != 0) {
        } else {
            if (z2) {
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(125L);
                scaleAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation2.setFillBefore(true);
                view.startAnimation(scaleAnimation2);
            }
            view.setVisibility(4);
        }
    }

    public static void A17(ImageView imageView, int i) {
        C07O.A0i(imageView, PorterDuff.Mode.SRC_IN);
        C07O.A0h(imageView, i == 0 ? null : ColorStateList.valueOf(i));
    }

    public static void A18(ProgressBar progressBar, int i) {
        if (progressBar != null && Build.VERSION.SDK_INT < 21) {
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                progressBar.setIndeterminateDrawable(indeterminateDrawable);
            }
            Drawable progressDrawable = progressBar.getProgressDrawable();
            if (progressDrawable != null) {
                progressDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                progressBar.setProgressDrawable(progressDrawable);
            }
        }
    }

    public static void A19(TextView textView, int i) {
        Drawable[] compoundDrawables;
        if (i == 0) {
            return;
        }
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static void A1A(NestedScrollView nestedScrollView) {
        int childCount = nestedScrollView.getChildCount();
        if (childCount == 0) {
            return;
        }
        View childAt = nestedScrollView.getChildAt(childCount - 1);
        nestedScrollView.A08(nestedScrollView.getPaddingBottom() + childAt.getHeight() + childAt.getScrollY(), false);
    }

    public static void A1B(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void A1C(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        int i = 0;
        if (cls.isArray()) {
            sb.append("[");
            while (i < Array.getLength(obj)) {
                A1C(Array.get(obj, i), sb);
                sb.append(",");
                i++;
            }
            sb.replace(sb.length() - 1, sb.length(), "]");
        } else if (cls.equals(String.class)) {
            sb.append("\"");
            sb.append(obj);
            sb.append("\"");
        } else if (!cls.isPrimitive() && !cls.equals(Integer.class) && !cls.equals(Long.class) && !cls.equals(Short.class) && !cls.equals(Double.class) && !cls.equals(Float.class) && !cls.equals(BigDecimal.class)) {
            try {
                sb.append("{");
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                while (i < length) {
                    Field field = declaredFields[i];
                    if (!Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        sb.append("\"");
                        sb.append(field.getName());
                        sb.append("\"");
                        sb.append(":");
                        A1C(field.get(obj), sb);
                        sb.append(",");
                    }
                    i++;
                }
                sb.replace(sb.length() - 1, sb.length(), "}");
            } catch (IllegalAccessException unused) {
                Log.e("PAY: failed to convert to json string");
            }
        } else {
            sb.append(String.valueOf(obj));
        }
    }

    public static void A1D(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": GLES20 error: ");
        sb.append(glGetError);
        throw new RuntimeException(sb.toString());
    }

    public static void A1E(Throwable th) {
        String obj;
        Throwable th2 = th;
        while (true) {
            if (th2 != null) {
                if (th2 instanceof UnknownHostException) {
                    obj = "";
                    break;
                }
                th2 = th2.getCause();
            } else {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                obj = stringWriter.toString();
                break;
            }
        }
        if (A01 != null) {
            Log.w(C000200d.A0J("SignalProtocolLogger (", "SessionRecordV2", "): ", obj));
        }
    }

    public static void A1F(C41061tJ c41061tJ, C41071tK c41071tK, C41081tL c41081tL) {
        int[] iArr = new int[10];
        int[] iArr2 = c41061tJ.A01;
        int[] iArr3 = c41071tK.A02;
        int[] iArr4 = c41071tK.A01;
        A1U(iArr2, iArr3, iArr4);
        int[] iArr5 = c41061tJ.A02;
        A1W(iArr5, iArr3, iArr4);
        int[] iArr6 = c41061tJ.A03;
        A1V(iArr6, iArr2, c41081tL.A02);
        A1V(iArr5, iArr5, c41081tL.A01);
        int[] iArr7 = c41061tJ.A00;
        A1V(iArr7, c41081tL.A00, c41071tK.A00);
        A1V(iArr2, c41071tK.A03, c41081tL.A03);
        A1U(iArr, iArr2, iArr2);
        A1W(iArr2, iArr6, iArr5);
        A1U(iArr5, iArr6, iArr5);
        A1U(iArr6, iArr, iArr7);
        A1W(iArr7, iArr, iArr7);
    }

    public static void A1G(C41061tJ c41061tJ, C41071tK c41071tK, C41091tM c41091tM) {
        int[] iArr = new int[10];
        int[] iArr2 = c41061tJ.A01;
        int[] iArr3 = c41071tK.A02;
        int[] iArr4 = c41071tK.A01;
        A1U(iArr2, iArr3, iArr4);
        int[] iArr5 = c41061tJ.A02;
        A1W(iArr5, iArr3, iArr4);
        int[] iArr6 = c41061tJ.A03;
        A1V(iArr6, iArr2, c41091tM.A02);
        A1V(iArr5, iArr5, c41091tM.A01);
        int[] iArr7 = c41061tJ.A00;
        A1V(iArr7, c41091tM.A00, c41071tK.A00);
        int[] iArr8 = c41071tK.A03;
        A1U(iArr, iArr8, iArr8);
        A1W(iArr2, iArr6, iArr5);
        A1U(iArr5, iArr6, iArr5);
        A1U(iArr6, iArr, iArr7);
        A1W(iArr7, iArr, iArr7);
    }

    public static void A1H(C41101tN c41101tN, C41061tJ c41061tJ) {
        int[] iArr = c41101tN.A00;
        int[] iArr2 = c41061tJ.A01;
        int[] iArr3 = c41061tJ.A00;
        A1V(iArr, iArr2, iArr3);
        int[] iArr4 = c41101tN.A01;
        int[] iArr5 = c41061tJ.A02;
        int[] iArr6 = c41061tJ.A03;
        A1V(iArr4, iArr5, iArr6);
        A1V(c41101tN.A02, iArr6, iArr3);
    }

    public static void A1I(C41071tK c41071tK, C41061tJ c41061tJ) {
        int[] iArr = c41071tK.A01;
        int[] iArr2 = c41061tJ.A01;
        int[] iArr3 = c41061tJ.A00;
        A1V(iArr, iArr2, iArr3);
        int[] iArr4 = c41071tK.A02;
        int[] iArr5 = c41061tJ.A02;
        int[] iArr6 = c41061tJ.A03;
        A1V(iArr4, iArr5, iArr6);
        A1V(c41071tK.A03, iArr6, iArr3);
        A1V(c41071tK.A00, iArr2, iArr5);
    }

    public static void A1J(byte[] bArr) {
        long A0B = (A0B(bArr, 47) >>> 2) & 2097151;
        long A0E = (A0E(bArr, 49) >>> 7) & 2097151;
        long A0E2 = (A0E(bArr, 52) >>> 4) & 2097151;
        long A0B2 = (A0B(bArr, 55) >>> 1) & 2097151;
        long A0E3 = (A0E(bArr, 57) >>> 6) & 2097151;
        long A0E4 = A0E(bArr, 60) >>> 3;
        long j = A0E4 * 666643;
        long j2 = A0E4 * 470296;
        long j3 = A0E4 * 654183;
        long A0E5 = ((A0E(bArr, 36) >>> 6) & 2097151) - (A0E4 * 997805);
        long A0B3 = (A0E4 * 136657) + ((A0B(bArr, 39) >>> 3) & 2097151);
        long A0B4 = (A0B(bArr, 42) & 2097151) - (A0E4 * 683901);
        long A0E6 = (A0E3 * 654183) + j2 + ((A0E(bArr, 31) >>> 4) & 2097151);
        long A0B5 = (j3 + ((A0B(bArr, 34) >>> 1) & 2097151)) - (A0E3 * 997805);
        long j4 = A0B2 * 470296;
        long A0B6 = j4 + (A0E3 * 666643) + ((A0B(bArr, 26) >>> 2) & 2097151);
        long j5 = A0B2 * 654183;
        long A0E7 = j5 + (A0E3 * 470296) + j + ((A0E(bArr, 28) >>> 7) & 2097151);
        long j6 = (A0B2 * 136657) + A0B5;
        long j7 = ((A0E3 * 136657) + A0E5) - (A0B2 * 683901);
        long j8 = A0E2 * 470296;
        long A0E8 = j8 + (A0B2 * 666643) + ((A0E(bArr, 23) >>> 5) & 2097151);
        long j9 = (A0E2 * 136657) + (A0E6 - (A0B2 * 997805));
        long j10 = A0E * 470296;
        long j11 = (A0E * 654183) + A0E8;
        long j12 = (A0E * 136657) + (A0E7 - (A0E2 * 997805));
        long j13 = j9 - (A0E * 683901);
        long A0E9 = (A0B * 666643) + ((A0E(bArr, 15) >>> 6) & 2097151);
        long j14 = A0B * 470296;
        long j15 = A0B * 654183;
        long A0B7 = j15 + j10 + (A0E2 * 666643) + (A0B(bArr, 21) & 2097151);
        long j16 = (A0B * 136657) + (((A0E2 * 654183) + A0B6) - (A0E * 997805));
        long j17 = (A0E9 + 1048576) >> 21;
        long A0B8 = j14 + (A0E * 666643) + ((A0B(bArr, 18) >>> 3) & 2097151) + j17;
        long j18 = A0E9 - (j17 << 21);
        long j19 = (A0B7 + 1048576) >> 21;
        long j20 = (j11 - (A0B * 997805)) + j19;
        long j21 = A0B7 - (j19 << 21);
        long j22 = (j16 + 1048576) >> 21;
        long j23 = (j12 - (A0B * 683901)) + j22;
        long j24 = j16 - (j22 << 21);
        long j25 = (j13 + 1048576) >> 21;
        long j26 = (j6 - (A0E2 * 683901)) + j25;
        long j27 = j13 - (j25 << 21);
        long j28 = (j7 + 1048576) >> 21;
        long j29 = (A0B3 - (A0E3 * 683901)) + j28;
        long j30 = j7 - (j28 << 21);
        long j31 = (A0B4 + 1048576) >> 21;
        long A0E10 = ((A0E(bArr, 44) >>> 5) & 2097151) + j31;
        long j32 = A0B4 - (j31 << 21);
        long j33 = (A0B8 + 1048576) >> 21;
        long j34 = j21 + j33;
        long j35 = A0B8 - (j33 << 21);
        long j36 = (j20 + 1048576) >> 21;
        long j37 = j24 + j36;
        long j38 = j20 - (j36 << 21);
        long j39 = (j23 + 1048576) >> 21;
        long j40 = j27 + j39;
        long j41 = j23 - (j39 << 21);
        long j42 = (j26 + 1048576) >> 21;
        long j43 = j30 + j42;
        long j44 = j26 - (j42 << 21);
        long j45 = (j29 + 1048576) >> 21;
        long j46 = j32 + j45;
        long j47 = j29 - (j45 << 21);
        long j48 = (A0E10 * 470296) + j18;
        long j49 = (A0E10 * 654183) + j35;
        long j50 = (A0E10 * 136657) + j38;
        long j51 = j37 - (A0E10 * 683901);
        long A0E11 = (j46 * 666643) + ((A0E(bArr, 10) >>> 4) & 2097151);
        long j52 = j46 * 470296;
        long A0B9 = j52 + (A0E10 * 666643) + ((A0B(bArr, 13) >>> 1) & 2097151);
        long j53 = (j46 * 654183) + j48;
        long j54 = (j46 * 136657) + (j34 - (A0E10 * 997805));
        long j55 = (j47 * 470296) + A0E11;
        long j56 = (j47 * 654183) + A0B9;
        long j57 = j53 - (j47 * 997805);
        long j58 = (j47 * 136657) + (j49 - (j46 * 997805));
        long j59 = j54 - (j47 * 683901);
        long j60 = j43 * 470296;
        long A0E12 = j60 + (j47 * 666643) + ((A0E(bArr, 7) >>> 7) & 2097151);
        long j61 = j58 - (j43 * 683901);
        long j62 = j44 * 666643;
        long j63 = j44 * 470296;
        long A0B10 = j63 + (j43 * 666643) + ((A0B(bArr, 5) >>> 2) & 2097151);
        long j64 = ((j43 * 654183) + j55) - (j44 * 997805);
        long j65 = (j44 * 136657) + (j56 - (j43 * 997805));
        long j66 = ((j43 * 136657) + j57) - (j44 * 683901);
        long A0B11 = (j40 * 666643) + (A0B(bArr, 0) & 2097151);
        long A0E13 = (j40 * 470296) + j62 + ((A0E(bArr, 2) >>> 5) & 2097151);
        long j67 = (j40 * 654183) + A0B10;
        long j68 = ((j44 * 654183) + A0E12) - (j40 * 997805);
        long j69 = (j40 * 136657) + j64;
        long j70 = (A0B11 + 1048576) >> 21;
        long j71 = A0E13 + j70;
        long j72 = A0B11 - (j70 << 21);
        long j73 = (j67 + 1048576) >> 21;
        long j74 = j68 + j73;
        long j75 = j67 - (j73 << 21);
        long j76 = (j69 + 1048576) >> 21;
        long j77 = (j65 - (j40 * 683901)) + j76;
        long j78 = j69 - (j76 << 21);
        long j79 = (j66 + 1048576) >> 21;
        long j80 = j61 + j79;
        long j81 = j66 - (j79 << 21);
        long j82 = (j59 + 1048576) >> 21;
        long j83 = (j50 - (j46 * 683901)) + j82;
        long j84 = j59 - (j82 << 21);
        long j85 = (j51 + 1048576) >> 21;
        long j86 = j41 + j85;
        long j87 = j51 - (j85 << 21);
        long j88 = (j71 + 1048576) >> 21;
        long j89 = j75 + j88;
        long j90 = j71 - (j88 << 21);
        long j91 = (j74 + 1048576) >> 21;
        long j92 = j78 + j91;
        long j93 = j74 - (j91 << 21);
        long j94 = (j77 + 1048576) >> 21;
        long j95 = j81 + j94;
        long j96 = j77 - (j94 << 21);
        long j97 = (j80 + 1048576) >> 21;
        long j98 = j84 + j97;
        long j99 = j80 - (j97 << 21);
        long j100 = (j83 + 1048576) >> 21;
        long j101 = j87 + j100;
        long j102 = j83 - (j100 << 21);
        long j103 = (j86 + 1048576) >> 21;
        long j104 = j103 + 0;
        long j105 = j86 - (j103 << 21);
        long j106 = (j104 * 666643) + j72;
        long j107 = (j104 * 470296) + j90;
        long j108 = j106 >> 21;
        long j109 = j107 + j108;
        long j110 = j106 - (j108 << 21);
        long j111 = j109 >> 21;
        long j112 = (j104 * 654183) + j89 + j111;
        long j113 = j109 - (j111 << 21);
        long j114 = j112 >> 21;
        long j115 = (j93 - (j104 * 997805)) + j114;
        long j116 = j112 - (j114 << 21);
        long j117 = j115 >> 21;
        long j118 = (j104 * 136657) + j92 + j117;
        long j119 = j115 - (j117 << 21);
        long j120 = j118 >> 21;
        long j121 = (j96 - (j104 * 683901)) + j120;
        long j122 = j118 - (j120 << 21);
        long j123 = j121 >> 21;
        long j124 = j95 + j123;
        long j125 = j121 - (j123 << 21);
        long j126 = j124 >> 21;
        long j127 = j99 + j126;
        long j128 = j124 - (j126 << 21);
        long j129 = j127 >> 21;
        long j130 = j98 + j129;
        long j131 = j127 - (j129 << 21);
        long j132 = j130 >> 21;
        long j133 = j102 + j132;
        long j134 = j130 - (j132 << 21);
        long j135 = j133 >> 21;
        long j136 = j101 + j135;
        long j137 = j133 - (j135 << 21);
        long j138 = j136 >> 21;
        long j139 = j105 + j138;
        long j140 = j136 - (j138 << 21);
        long j141 = j139 >> 21;
        long j142 = j141 + 0;
        long j143 = (666643 * j142) + j110;
        long j144 = j125 - (j142 * 683901);
        long j145 = j143 >> 21;
        long j146 = (470296 * j142) + j113 + j145;
        long j147 = j143 - (j145 << 21);
        long j148 = j146 >> 21;
        long j149 = (654183 * j142) + j116 + j148;
        long j150 = j146 - (j148 << 21);
        long j151 = j149 >> 21;
        long j152 = (j119 - (997805 * j142)) + j151;
        long j153 = j149 - (j151 << 21);
        long j154 = j152 >> 21;
        long j155 = (136657 * j142) + j122 + j154;
        long j156 = j152 - (j154 << 21);
        long j157 = j155 >> 21;
        long j158 = j144 + j157;
        long j159 = j155 - (j157 << 21);
        long j160 = j158 >> 21;
        long j161 = j128 + j160;
        long j162 = j158 - (j160 << 21);
        long j163 = j161 >> 21;
        long j164 = j131 + j163;
        long j165 = j161 - (j163 << 21);
        long j166 = j164 >> 21;
        long j167 = j134 + j166;
        long j168 = j164 - (j166 << 21);
        long j169 = j167 >> 21;
        long j170 = j137 + j169;
        long j171 = j167 - (j169 << 21);
        long j172 = j170 >> 21;
        long j173 = j140 + j172;
        long j174 = j170 - (j172 << 21);
        long j175 = j173 >> 21;
        long j176 = (j139 - (j141 << 21)) + j175;
        long j177 = j173 - (j175 << 21);
        bArr[0] = (byte) (j147 >> 0);
        bArr[1] = (byte) (j147 >> 8);
        bArr[2] = (byte) ((j147 >> 16) | (j150 << 5));
        bArr[3] = (byte) (j150 >> 3);
        bArr[4] = (byte) (j150 >> 11);
        bArr[5] = (byte) ((j150 >> 19) | (j153 << 2));
        bArr[6] = (byte) (j153 >> 6);
        bArr[7] = (byte) ((j153 >> 14) | (j156 << 7));
        bArr[8] = (byte) (j156 >> 1);
        bArr[9] = (byte) (j156 >> 9);
        bArr[10] = (byte) ((j156 >> 17) | (j159 << 4));
        bArr[11] = (byte) (j159 >> 4);
        bArr[12] = (byte) (j159 >> 12);
        bArr[13] = (byte) ((j159 >> 20) | (j162 << 1));
        bArr[14] = (byte) (j162 >> 7);
        bArr[15] = (byte) ((j162 >> 15) | (j165 << 6));
        bArr[16] = (byte) (j165 >> 2);
        bArr[17] = (byte) (j165 >> 10);
        bArr[18] = (byte) ((j165 >> 18) | (j168 << 3));
        bArr[19] = (byte) (j168 >> 5);
        bArr[20] = (byte) (j168 >> 13);
        bArr[21] = (byte) (j171 >> 0);
        bArr[22] = (byte) (j171 >> 8);
        bArr[23] = (byte) ((j171 >> 16) | (j174 << 5));
        bArr[24] = (byte) (j174 >> 3);
        bArr[25] = (byte) (j174 >> 11);
        bArr[26] = (byte) ((j174 >> 19) | (j177 << 2));
        bArr[27] = (byte) (j177 >> 6);
        bArr[28] = (byte) ((j177 >> 14) | (j176 << 7));
        bArr[29] = (byte) (j176 >> 1);
        bArr[30] = (byte) (j176 >> 9);
        bArr[31] = (byte) (j176 >> 17);
    }

    public static void A1K(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = (((((((((((((i5 + ((i4 + ((i3 + ((i2 + ((i + (((i10 * 19) + EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) >> 25)) >> 26)) >> 25)) >> 26)) >> 25)) >> 26) + i6) >> 25) + i7) >> 26) + i8) >> 25) + i9) >> 26) + i10) >> 25) * 19) + i;
        int i12 = i11 >> 26;
        int i13 = i2 + i12;
        int i14 = i11 - (i12 << 26);
        int i15 = i13 >> 25;
        int i16 = i3 + i15;
        int i17 = i13 - (i15 << 25);
        int i18 = i16 >> 26;
        int i19 = i4 + i18;
        int i20 = i16 - (i18 << 26);
        int i21 = i19 >> 25;
        int i22 = i5 + i21;
        int i23 = i19 - (i21 << 25);
        int i24 = i22 >> 26;
        int i25 = i6 + i24;
        int i26 = i22 - (i24 << 26);
        int i27 = i25 >> 25;
        int i28 = i7 + i27;
        int i29 = i25 - (i27 << 25);
        int i30 = i28 >> 26;
        int i31 = i8 + i30;
        int i32 = i28 - (i30 << 26);
        int i33 = i31 >> 25;
        int i34 = i9 + i33;
        int i35 = i31 - (i33 << 25);
        int i36 = i34 >> 26;
        int i37 = i10 + i36;
        int i38 = i34 - (i36 << 26);
        int i39 = i37 - ((i37 >> 25) << 25);
        bArr[0] = (byte) (i14 >> 0);
        bArr[1] = (byte) (i14 >> 8);
        bArr[2] = (byte) (i14 >> 16);
        bArr[3] = (byte) ((i14 >> 24) | (i17 << 2));
        bArr[4] = (byte) (i17 >> 6);
        bArr[5] = (byte) (i17 >> 14);
        bArr[6] = (byte) ((i17 >> 22) | (i20 << 3));
        bArr[7] = (byte) (i20 >> 5);
        bArr[8] = (byte) (i20 >> 13);
        bArr[9] = (byte) ((i20 >> 21) | (i23 << 5));
        bArr[10] = (byte) (i23 >> 3);
        bArr[11] = (byte) (i23 >> 11);
        bArr[12] = (byte) ((i23 >> 19) | (i26 << 6));
        bArr[13] = (byte) (i26 >> 2);
        bArr[14] = (byte) (i26 >> 10);
        bArr[15] = (byte) (i26 >> 18);
        bArr[16] = (byte) (i29 >> 0);
        bArr[17] = (byte) (i29 >> 8);
        bArr[18] = (byte) (i29 >> 16);
        bArr[19] = (byte) ((i29 >> 24) | (i32 << 1));
        bArr[20] = (byte) (i32 >> 7);
        bArr[21] = (byte) (i32 >> 15);
        bArr[22] = (byte) ((i32 >> 23) | (i35 << 3));
        bArr[23] = (byte) (i35 >> 5);
        bArr[24] = (byte) (i35 >> 13);
        bArr[25] = (byte) ((i35 >> 21) | (i38 << 4));
        bArr[26] = (byte) (i38 >> 4);
        bArr[27] = (byte) (i38 >> 12);
        bArr[28] = (byte) ((i38 >> 20) | (i39 << 6));
        bArr[29] = (byte) (i39 >> 2);
        bArr[30] = (byte) (i39 >> 10);
        bArr[31] = (byte) (i39 >> 18);
    }

    public static void A1L(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
    }

    public static void A1M(int[] iArr) {
        iArr[0] = 1;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
    }

    public static void A1N(int[] iArr, byte[] bArr) {
        long A0C = A0C(bArr, 0);
        long A09 = A09(bArr, 4) << 6;
        long A092 = A09(bArr, 10) << 3;
        long A0C2 = A0C(bArr, 16);
        long A093 = A09(bArr, 23) << 5;
        long A094 = (A09(bArr, 29) & 8388607) << 2;
        long j = (A094 + 16777216) >> 25;
        long j2 = (19 * j) + A0C;
        long j3 = A094 - (j << 25);
        long j4 = (A09 + 16777216) >> 25;
        long A095 = (A09(bArr, 7) << 5) + j4;
        long j5 = A09 - (j4 << 25);
        long j6 = (A092 + 16777216) >> 25;
        long A096 = (A09(bArr, 13) << 2) + j6;
        long j7 = A092 - (j6 << 25);
        long j8 = (A0C2 + 16777216) >> 25;
        long A097 = (A09(bArr, 20) << 7) + j8;
        long j9 = A0C2 - (j8 << 25);
        long j10 = (A093 + 16777216) >> 25;
        long A098 = (A09(bArr, 26) << 4) + j10;
        long j11 = A093 - (j10 << 25);
        long j12 = (j2 + 33554432) >> 26;
        long j13 = j5 + j12;
        long j14 = j2 - (j12 << 26);
        long j15 = (A095 + 33554432) >> 26;
        long j16 = j7 + j15;
        long j17 = A095 - (j15 << 26);
        long j18 = (A096 + 33554432) >> 26;
        long j19 = j9 + j18;
        long j20 = A096 - (j18 << 26);
        long j21 = (A097 + 33554432) >> 26;
        long j22 = j11 + j21;
        long j23 = A097 - (j21 << 26);
        long j24 = (A098 + 33554432) >> 26;
        iArr[0] = (int) j14;
        iArr[1] = (int) j13;
        iArr[2] = (int) j17;
        iArr[3] = (int) j16;
        iArr[4] = (int) j20;
        iArr[5] = (int) j19;
        iArr[6] = (int) j23;
        iArr[7] = (int) j22;
        iArr[8] = (int) (A098 - (j24 << 26));
        iArr[9] = (int) (j3 + j24);
    }

    public static void A1O(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = i5;
        iArr[5] = i6;
        iArr[6] = i7;
        iArr[7] = i8;
        iArr[8] = i9;
        iArr[9] = i10;
    }

    public static void A1P(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        A1R(iArr3, iArr2);
        A1R(iArr4, iArr3);
        int i = 1;
        A1R(iArr4, iArr4);
        A1V(iArr4, iArr2, iArr4);
        A1V(iArr3, iArr3, iArr4);
        A1R(iArr5, iArr3);
        A1V(iArr4, iArr4, iArr5);
        A1R(iArr5, iArr4);
        int i2 = 1;
        do {
            A1R(iArr5, iArr5);
            i2++;
        } while (i2 < 5);
        A1V(iArr4, iArr5, iArr4);
        A1R(iArr5, iArr4);
        int i3 = 1;
        do {
            A1R(iArr5, iArr5);
            i3++;
        } while (i3 < 10);
        A1V(iArr5, iArr5, iArr4);
        A1R(iArr6, iArr5);
        int i4 = 1;
        do {
            A1R(iArr6, iArr6);
            i4++;
        } while (i4 < 20);
        A1V(iArr5, iArr6, iArr5);
        A1R(iArr5, iArr5);
        int i5 = 1;
        do {
            A1R(iArr5, iArr5);
            i5++;
        } while (i5 < 10);
        A1V(iArr4, iArr5, iArr4);
        A1R(iArr5, iArr4);
        int i6 = 1;
        do {
            A1R(iArr5, iArr5);
            i6++;
        } while (i6 < 50);
        A1V(iArr5, iArr5, iArr4);
        A1R(iArr6, iArr5);
        int i7 = 1;
        do {
            A1R(iArr6, iArr6);
            i7++;
        } while (i7 < 100);
        A1V(iArr5, iArr6, iArr5);
        A1R(iArr5, iArr5);
        int i8 = 1;
        do {
            A1R(iArr5, iArr5);
            i8++;
        } while (i8 < 50);
        A1V(iArr4, iArr5, iArr4);
        A1R(iArr4, iArr4);
        do {
            A1R(iArr4, iArr4);
            i++;
        } while (i < 5);
        A1V(iArr, iArr4, iArr3);
    }

    public static void A1Q(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        iArr[0] = -i;
        iArr[1] = -i2;
        iArr[2] = -i3;
        iArr[3] = -i4;
        iArr[4] = -i5;
        iArr[5] = -i6;
        iArr[6] = -i7;
        iArr[7] = -i8;
        iArr[8] = -i9;
        iArr[9] = -iArr2[9];
    }

    public static void A1R(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = i << 1;
        int i12 = i6 << 1;
        int i13 = i6 * 38;
        int i14 = i8 * 38;
        int i15 = i10 * 38;
        long j = i;
        long j2 = j * j;
        long j3 = i11;
        long j4 = i2;
        long j5 = j3 * j4;
        long j6 = i3;
        long j7 = j3 * j6;
        long j8 = i4;
        long j9 = j3 * j8;
        long j10 = i5;
        long j11 = j3 * j10;
        long j12 = i6;
        long j13 = j3 * j12;
        long j14 = i7;
        long j15 = j3 * j14;
        long j16 = i8;
        long j17 = j3 * j16;
        long j18 = i9;
        long j19 = j3 * j18;
        long j20 = i10;
        long j21 = j3 * j20;
        long j22 = i2 << 1;
        long j23 = j4 * j22;
        long j24 = j22 * j6;
        long j25 = i4 << 1;
        long j26 = j22 * j10;
        long j27 = i12;
        long j28 = j22 * j14;
        long j29 = i8 << 1;
        long j30 = j22 * j29;
        long j31 = j22 * j18;
        long j32 = i15;
        long j33 = j6 * j6;
        long j34 = i3 << 1;
        long j35 = j34 * j8;
        long j36 = j34 * j10;
        long j37 = j34 * j12;
        long j38 = j34 * j14;
        long j39 = j34 * j16;
        long j40 = i9 * 19;
        long j41 = j6 * j32;
        long j42 = j8 * j25;
        long j43 = j25 * j10;
        long j44 = j25 * j14;
        long j45 = i14;
        long j46 = j25 * j45;
        long j47 = j10 * j10;
        long j48 = i5 << 1;
        long j49 = j48 * j12;
        long j50 = i7 * 19;
        long j51 = j48 * j50;
        long j52 = j10 * j45;
        long j53 = j48 * j40;
        long j54 = j10 * j32;
        long j55 = i13 * j12;
        long j56 = j27 * j50;
        long j57 = j27 * j45;
        long j58 = j50 * j14;
        long j59 = j14 * j45;
        long j60 = (i7 << 1) * j40;
        long j61 = j16 * j45;
        long j62 = j18 * j32;
        long j63 = j2 + (j22 * j32) + (j34 * j40) + j46 + j51 + j55;
        long j64 = j11 + (j22 * j25) + j33 + (j27 * j32) + j60 + j61;
        long j65 = j13 + j26 + j35 + (j14 * j32) + (j29 * j40);
        long j66 = (j63 + 33554432) >> 26;
        long j67 = j5 + j41 + (j25 * j40) + j52 + j56 + j66;
        long j68 = j63 - (j66 << 26);
        long j69 = (j64 + 33554432) >> 26;
        long j70 = j65 + j69;
        long j71 = j64 - (j69 << 26);
        long j72 = (j67 + 16777216) >> 25;
        long j73 = j7 + j23 + (j25 * j32) + j53 + j57 + j58 + j72;
        long j74 = j67 - (j72 << 25);
        long j75 = (j70 + 16777216) >> 25;
        long j76 = j15 + (j22 * j27) + j36 + j42 + (j29 * j32) + (j40 * j18) + j75;
        long j77 = j70 - (j75 << 25);
        long j78 = (j73 + 33554432) >> 26;
        long j79 = j9 + j24 + j54 + (j27 * j40) + j59 + j78;
        long j80 = j73 - (j78 << 26);
        long j81 = (j76 + 33554432) >> 26;
        long j82 = j17 + j28 + j37 + j43 + j62 + j81;
        long j83 = j76 - (j81 << 26);
        long j84 = (j79 + 16777216) >> 25;
        long j85 = j71 + j84;
        long j86 = j79 - (j84 << 25);
        long j87 = (j82 + 16777216) >> 25;
        long j88 = j19 + j30 + j38 + (j25 * j27) + j47 + (j32 * j20) + j87;
        long j89 = j82 - (j87 << 25);
        long j90 = (j85 + 33554432) >> 26;
        long j91 = j77 + j90;
        long j92 = j85 - (j90 << 26);
        long j93 = (j88 + 33554432) >> 26;
        long j94 = j21 + j31 + j39 + j44 + j49 + j93;
        long j95 = j88 - (j93 << 26);
        long j96 = (j94 + 16777216) >> 25;
        long j97 = (19 * j96) + j68;
        long j98 = (j97 + 33554432) >> 26;
        iArr[0] = (int) (j97 - (j98 << 26));
        iArr[1] = (int) (j74 + j98);
        iArr[2] = (int) j80;
        iArr[3] = (int) j86;
        iArr[4] = (int) j92;
        iArr[5] = (int) j91;
        iArr[6] = (int) j83;
        iArr[7] = (int) j89;
        iArr[8] = (int) j95;
        iArr[9] = (int) (j94 - (j96 << 25));
    }

    public static void A1S(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        int i16 = iArr2[4];
        int i17 = iArr2[5];
        int i18 = iArr2[6];
        int i19 = iArr2[7];
        int i20 = i2 ^ i12;
        int i21 = i3 ^ i13;
        int i22 = i4 ^ i14;
        int i23 = i5 ^ i15;
        int i24 = i6 ^ i16;
        int i25 = i7 ^ i17;
        int i26 = i8 ^ i18;
        int i27 = i9 ^ i19;
        int i28 = i10 ^ iArr2[8];
        int i29 = i11 ^ iArr2[9];
        int i30 = -i;
        iArr[0] = i2 ^ (i20 & i30);
        iArr[1] = i3 ^ (i21 & i30);
        iArr[2] = i4 ^ (i22 & i30);
        iArr[3] = i5 ^ (i23 & i30);
        iArr[4] = i6 ^ (i24 & i30);
        iArr[5] = i7 ^ (i25 & i30);
        iArr[6] = i8 ^ (i26 & i30);
        iArr[7] = i9 ^ (i27 & i30);
        iArr[8] = i10 ^ (i28 & i30);
        iArr[9] = i11 ^ (i29 & i30);
    }

    public static void A1T(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        int i16 = iArr2[4];
        int i17 = iArr2[5];
        int i18 = iArr2[6];
        int i19 = iArr2[7];
        int i20 = iArr2[8];
        int i21 = iArr2[9];
        int i22 = -i;
        int i23 = (i2 ^ i12) & i22;
        int i24 = (i3 ^ i13) & i22;
        int i25 = (i4 ^ i14) & i22;
        int i26 = (i5 ^ i15) & i22;
        int i27 = (i6 ^ i16) & i22;
        int i28 = (i7 ^ i17) & i22;
        int i29 = (i8 ^ i18) & i22;
        int i30 = (i9 ^ i19) & i22;
        int i31 = (i10 ^ i20) & i22;
        int i32 = (i11 ^ i21) & i22;
        iArr[0] = i2 ^ i23;
        iArr[1] = i3 ^ i24;
        iArr[2] = i4 ^ i25;
        iArr[3] = i5 ^ i26;
        iArr[4] = i6 ^ i27;
        iArr[5] = i7 ^ i28;
        iArr[6] = i8 ^ i29;
        iArr[7] = i9 ^ i30;
        iArr[8] = i10 ^ i31;
        iArr[9] = i11 ^ i32;
        iArr2[0] = i12 ^ i23;
        iArr2[1] = i13 ^ i24;
        iArr2[2] = i14 ^ i25;
        iArr2[3] = i15 ^ i26;
        iArr2[4] = i16 ^ i27;
        iArr2[5] = i17 ^ i28;
        iArr2[6] = i18 ^ i29;
        iArr2[7] = i19 ^ i30;
        iArr2[8] = i20 ^ i31;
        iArr2[9] = i21 ^ i32;
    }

    public static void A1U(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = iArr3[0];
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        int i15 = iArr3[4];
        int i16 = iArr3[5];
        int i17 = iArr3[6];
        int i18 = iArr3[7];
        int i19 = iArr3[8];
        iArr[0] = i + i11;
        iArr[1] = i2 + i12;
        iArr[2] = i3 + i13;
        iArr[3] = i4 + i14;
        iArr[4] = i5 + i15;
        iArr[5] = i6 + i16;
        iArr[6] = i7 + i17;
        iArr[7] = i8 + i18;
        iArr[8] = i9 + i19;
        iArr[9] = i10 + iArr3[9];
    }

    public static void A1V(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = iArr3[0];
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        int i15 = iArr3[4];
        int i16 = iArr3[5];
        int i17 = iArr3[6];
        int i18 = iArr3[7];
        int i19 = iArr3[8];
        int i20 = iArr3[9];
        int i21 = i12 * 19;
        int i22 = i17 * 19;
        int i23 = i18 * 19;
        int i24 = i20 * 19;
        long j = i;
        long j2 = i11;
        long j3 = j * j2;
        long j4 = i12;
        long j5 = j * j4;
        long j6 = i13;
        long j7 = j * j6;
        long j8 = i14;
        long j9 = j * j8;
        long j10 = i15;
        long j11 = j * j10;
        long j12 = i16;
        long j13 = j * j12;
        long j14 = i17;
        long j15 = j * j14;
        long j16 = i18;
        long j17 = j * j16;
        long j18 = i19;
        long j19 = j * j18;
        long j20 = j * i20;
        long j21 = i2;
        long j22 = j21 * j2;
        long j23 = i2 << 1;
        long j24 = j23 * j4;
        long j25 = j21 * j6;
        long j26 = j23 * j8;
        long j27 = j21 * j10;
        long j28 = j23 * j12;
        long j29 = j21 * j14;
        long j30 = j23 * j16;
        long j31 = j21 * j18;
        long j32 = i24;
        long j33 = j23 * j32;
        long j34 = i3;
        long j35 = j34 * j2;
        long j36 = j34 * j4;
        long j37 = j34 * j6;
        long j38 = j34 * j8;
        long j39 = j34 * j10;
        long j40 = j34 * j12;
        long j41 = j34 * j14;
        long j42 = j16 * j34;
        long j43 = i19 * 19;
        long j44 = j34 * j43;
        long j45 = j34 * j32;
        long j46 = i4;
        long j47 = j46 * j2;
        long j48 = i4 << 1;
        long j49 = j48 * j4;
        long j50 = j46 * j6;
        long j51 = j48 * j8;
        long j52 = j46 * j10;
        long j53 = j48 * j12;
        long j54 = j14 * j46;
        long j55 = i23;
        long j56 = j48 * j55;
        long j57 = j46 * j43;
        long j58 = j48 * j32;
        long j59 = i5;
        long j60 = j59 * j2;
        long j61 = j59 * j4;
        long j62 = j59 * j6;
        long j63 = j59 * j8;
        long j64 = j59 * j10;
        long j65 = j12 * j59;
        long j66 = i22;
        long j67 = j59 * j66;
        long j68 = j59 * j55;
        long j69 = j59 * j43;
        long j70 = j59 * j32;
        long j71 = i6;
        long j72 = j71 * j2;
        long j73 = i6 << 1;
        long j74 = j73 * j4;
        long j75 = j71 * j6;
        long j76 = j73 * j8;
        long j77 = j10 * j71;
        long j78 = i16 * 19;
        long j79 = j73 * j78;
        long j80 = j71 * j66;
        long j81 = j73 * j55;
        long j82 = j71 * j43;
        long j83 = j73 * j32;
        long j84 = i7;
        long j85 = j84 * j2;
        long j86 = j84 * j4;
        long j87 = j84 * j6;
        long j88 = j8 * j84;
        long j89 = i15 * 19;
        long j90 = j84 * j89;
        long j91 = j84 * j78;
        long j92 = j84 * j66;
        long j93 = j84 * j55;
        long j94 = j84 * j43;
        long j95 = j84 * j32;
        long j96 = i8;
        long j97 = j96 * j2;
        long j98 = i8 << 1;
        long j99 = j98 * j4;
        long j100 = j6 * j96;
        long j101 = i14 * 19;
        long j102 = j98 * j101;
        long j103 = j96 * j89;
        long j104 = j98 * j78;
        long j105 = j96 * j66;
        long j106 = j98 * j55;
        long j107 = j96 * j43;
        long j108 = j98 * j32;
        long j109 = i9;
        long j110 = j109 * j2;
        long j111 = j4 * j109;
        long j112 = i13 * 19;
        long j113 = j109 * j112;
        long j114 = j109 * j101;
        long j115 = j109 * j89;
        long j116 = j109 * j78;
        long j117 = j109 * j66;
        long j118 = j109 * j55;
        long j119 = j109 * j43;
        long j120 = j109 * j32;
        long j121 = i10;
        long j122 = j2 * j121;
        long j123 = i10 << 1;
        long j124 = j20 + j31 + j42 + j54 + j65 + j77 + j88 + j100 + j111 + j122;
        long[] jArr = {j3 + j33 + j44 + j56 + j67 + j79 + j90 + j102 + j113 + (i21 * j123), j5 + j22 + j45 + j57 + j68 + j80 + j91 + j103 + j114 + (j112 * j121), j7 + j24 + j35 + j58 + j69 + j81 + j92 + j104 + j115 + (j101 * j123), j9 + j25 + j36 + j47 + j70 + j82 + j93 + j105 + j116 + (j89 * j121), j11 + j26 + j37 + j49 + j60 + j83 + j94 + j106 + j117 + (j78 * j123), j13 + j27 + j38 + j50 + j61 + j72 + j95 + j107 + j118 + (j66 * j121), j15 + j28 + j39 + j51 + j62 + j74 + j85 + j108 + j119 + (j55 * j123), j17 + j29 + j40 + j52 + j63 + j75 + j86 + j97 + j120 + (j121 * j43), j19 + j30 + j41 + j53 + j64 + j76 + j87 + j99 + j110 + (j123 * j32), j124};
        long j125 = jArr[0];
        long j126 = jArr[1];
        long j127 = jArr[2];
        long j128 = jArr[3];
        long j129 = jArr[4];
        long j130 = jArr[5];
        long j131 = jArr[6];
        long j132 = jArr[7];
        long j133 = jArr[8];
        long j134 = (j125 + 33554432) >> 26;
        long j135 = j126 + j134;
        long j136 = j125 - (j134 << 26);
        long j137 = (j129 + 33554432) >> 26;
        long j138 = j130 + j137;
        long j139 = j129 - (j137 << 26);
        long j140 = (j135 + 16777216) >> 25;
        long j141 = j127 + j140;
        long j142 = j135 - (j140 << 25);
        long j143 = (j138 + 16777216) >> 25;
        long j144 = j131 + j143;
        long j145 = j138 - (j143 << 25);
        long j146 = (j141 + 33554432) >> 26;
        long j147 = j128 + j146;
        long j148 = j141 - (j146 << 26);
        long j149 = (j144 + 33554432) >> 26;
        long j150 = j132 + j149;
        long j151 = j144 - (j149 << 26);
        long j152 = (j147 + 16777216) >> 25;
        long j153 = j139 + j152;
        long j154 = j147 - (j152 << 25);
        long j155 = (j150 + 16777216) >> 25;
        long j156 = j133 + j155;
        long j157 = j150 - (j155 << 25);
        long j158 = (j153 + 33554432) >> 26;
        long j159 = j145 + j158;
        long j160 = j153 - (j158 << 26);
        long j161 = (j156 + 33554432) >> 26;
        long j162 = j124 + j161;
        long j163 = j156 - (j161 << 26);
        long j164 = (j162 + 16777216) >> 25;
        long j165 = (19 * j164) + j136;
        long j166 = j162 - (j164 << 25);
        long j167 = (j165 + 33554432) >> 26;
        iArr[0] = (int) (j165 - (j167 << 26));
        iArr[1] = (int) (j142 + j167);
        iArr[2] = (int) j148;
        iArr[3] = (int) j154;
        iArr[4] = (int) j160;
        iArr[5] = (int) j159;
        iArr[6] = (int) j151;
        iArr[7] = (int) j157;
        iArr[8] = (int) j163;
        iArr[9] = (int) j166;
    }

    public static void A1W(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = iArr3[0];
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        int i15 = iArr3[4];
        int i16 = iArr3[5];
        int i17 = iArr3[6];
        int i18 = iArr3[7];
        int i19 = iArr3[8];
        iArr[0] = i - i11;
        iArr[1] = i2 - i12;
        iArr[2] = i3 - i13;
        iArr[3] = i4 - i14;
        iArr[4] = i5 - i15;
        iArr[5] = i6 - i16;
        iArr[6] = i7 - i17;
        iArr[7] = i8 - i18;
        iArr[8] = i9 - i19;
        iArr[9] = i10 - iArr3[9];
    }

    public static boolean A1X(ScrollView scrollView) {
        View childAt = scrollView.getChildAt(0);
        if (childAt != null) {
            return scrollView.getHeight() < scrollView.getPaddingBottom() + (scrollView.getPaddingTop() + childAt.getHeight());
        }
        return false;
    }

    public static boolean A1Y(String str) {
        return "payments:settings".equals(str) || "payments:transaction".equals(str) || "payments:account-details".equals(str) || "payments:request".equals(str);
    }

    public static boolean A1Z(CountDownLatch countDownLatch) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 5000;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j, TimeUnit.MILLISECONDS);
                if (z2) {
                }
            } catch (InterruptedException unused) {
                z2 = true;
                j = 5000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j <= 0) {
                    break;
                }
            }
        }
        Thread.currentThread().interrupt();
        return z;
    }

    public static byte[] A1a(Bitmap bitmap) {
        if (bitmap != null) {
            StringBuilder A0P = C000200d.A0P("orig_thumbnail/width:");
            A0P.append(bitmap.getWidth());
            A0P.append("/height:");
            A0P.append(bitmap.getHeight());
            Log.i(A0P.toString());
            if (bitmap.getWidth() > 100 || bitmap.getHeight() > 100) {
                float max = Math.max(bitmap.getWidth() / 100.0f, bitmap.getHeight() / 100.0f);
                Rect rect = new Rect(0, 0, (int) (bitmap.getWidth() / max), (int) (bitmap.getHeight() / max));
                rect.right = Math.max(rect.right, 1);
                rect.bottom = Math.max(rect.bottom, 1);
                Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                Bitmap.Config config = bitmap.getConfig();
                try {
                    int width = rect.width();
                    int height = rect.height();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    canvas.drawBitmap(bitmap, rect2, rect, paint);
                    bitmap.recycle();
                    StringBuilder sb = new StringBuilder("rescaled_thumbnail/width:");
                    sb.append(createBitmap.getWidth());
                    sb.append("/height:");
                    sb.append(createBitmap.getHeight());
                    Log.i(sb.toString());
                    bitmap = createBitmap;
                } catch (OutOfMemoryError e) {
                    Log.e("video-thumbnail/scale/out-of-memory", e);
                    bitmap.recycle();
                    throw e;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            return byteArray;
        }
        return null;
    }

    public static byte[] A1b(File file) {
        return A1a(A0I(file));
    }

    public static byte[] A1c(File file, long j) {
        if (j == 0) {
            return A1b(file);
        }
        return A1a(A0J(file, j));
    }

    public static byte[] A1d(String str) {
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static byte[] A1e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A1f(C02920Dk c02920Dk, C02930Dl c02930Dl) {
        return C40631sa.A00().A04(c02920Dk.A01, c02930Dl.A01);
    }

    public static byte[] A1g(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static byte[] A1h(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A1i(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
