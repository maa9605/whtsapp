package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.01i */
/* loaded from: classes.dex */
public final class C002701i {
    public static Field A00;
    public static boolean A01;
    public static boolean A02;

    public static int A00(byte b, int i, boolean z) {
        if (b != 1) {
            if (b == 2) {
                return i == 1 ? 5 : 4;
            }
            if (b != 3) {
                if (b != 4) {
                    if (b != 5) {
                        if (b != 9) {
                            if (b != 16) {
                                if (b != 20) {
                                    if (b != 35) {
                                        if (b != 49) {
                                            if (b != 52) {
                                                if (b != 54) {
                                                    switch (b) {
                                                        case 12:
                                                            return 12;
                                                        case 13:
                                                            return 11;
                                                        case 14:
                                                            return 13;
                                                        default:
                                                            switch (b) {
                                                                case 42:
                                                                    break;
                                                                case 43:
                                                                    break;
                                                                case 44:
                                                                    return 24;
                                                                case 45:
                                                                    return 25;
                                                                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                                                                    return 26;
                                                                default:
                                                                    return z ? 9 : 1;
                                                            }
                                                    }
                                                } else {
                                                    return 20;
                                                }
                                            } else {
                                                return 29;
                                            }
                                        } else {
                                            return 28;
                                        }
                                    } else {
                                        return 21;
                                    }
                                } else {
                                    return 16;
                                }
                            } else {
                                return 14;
                            }
                        } else {
                            return 8;
                        }
                    } else {
                        return 6;
                    }
                } else {
                    return 7;
                }
            }
            return 3;
        }
        return 2;
    }

    public static int A01(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 10:
            case 15:
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
            case 17:
            default:
                return 2;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return 17;
            case 12:
                return 18;
            case 13:
                return 11;
            case 14:
                return 1;
            case 18:
                return 20;
            case 19:
                return 21;
        }
    }

    public static boolean A1M(int i) {
        return i == -2 || i == -1 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 9 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17 || i == 20 || i == 21 || i == 27 || i == 29 || i == 30 || i == 31 || i == 32 || i == 33 || i == 51 || i == 52 || i == 53 || i == 54 || i == 56;
    }

    public static boolean A1N(int i) {
        return i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 34 || i == 35 || i == 36 || i == 46 || i == 47 || i == 48 || i == 49 || i == 50 || i == 55;
    }

    public static boolean A1O(int i) {
        return i == 37 || i == 39 || i == 40 || i == 41 || i == 42 || i == 43 || i == 44 || i == 45 || i == 64 || i == 65;
    }

    public static int A02(int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i - 1) / i5) + 1;
        int i7 = ((i2 - 1) / i5) + 1;
        while (((i6 - 1) / 2) + 1 >= i3 && ((i7 - 1) / 2) + 1 >= i4) {
            i6 = ((i6 - 1) / 2) + 1;
            i7 = ((i7 - 1) / 2) + 1;
            i5 <<= 1;
        }
        return i5;
    }

    public static int A03(int i, int i2, C0DH c0dh) {
        int i3 = 1;
        StringBuilder sb = new StringBuilder("bitmaputils/wrong raw image/");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        C000700j.A08(true, sb.toString());
        int i4 = c0dh.A02.inSampleSize;
        Long l = c0dh.A03;
        if (l != null) {
            int i5 = i;
            int i6 = i2;
            while (i5 * i6 > l.longValue()) {
                i5 = ((i5 - 1) / 2) + 1;
                i6 = ((i6 - 1) / 2) + 1;
                i3 <<= 1;
            }
        }
        if (c0dh.A04) {
            i = Math.max(i, i2);
            i2 = i;
        }
        return A02(i, i2, c0dh.A01, c0dh.A00, Math.max(i4, i3));
    }

    public static int A04(C002301c c002301c, String str) {
        C09R A0P = A0P(str);
        String A03 = A0P.A01(c002301c, C09R.A00(A0P.A00), true).A03(1.0d);
        String A022 = A0P.A02(c002301c);
        int length = A03.length();
        int length2 = A022.length();
        return (length < length2 || !A03.substring(0, length2).equals(A022)) ? 2 : 1;
    }

    public static int A05(CharSequence charSequence) {
        C43931yF c43931yF = new C43931yF(charSequence);
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            c43931yF.A00 = i;
            int descriptor = EmojiDescriptor.getDescriptor(c43931yF);
            if (descriptor == -1) {
                return 0;
            }
            i += c43931yF.A03(i, descriptor);
            i2++;
            if (i2 > 3) {
                return 0;
            }
        }
        return i2;
    }

    public static int A06(Exception exc) {
        if (exc instanceof UnknownHostException) {
            return 2;
        }
        if (exc instanceof SocketTimeoutException) {
            return 3;
        }
        return exc instanceof ConnectException ? 19 : 18;
    }

    public static Intent A07(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String A0h = A0h(activity, activity.getComponentName());
            if (A0h == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, A0h);
            try {
                if (A0h(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
                sb.append(A0h);
                sb.append("' in manifest");
                Log.e("NavUtils", sb.toString());
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent A08(Context context, ComponentName componentName) {
        String A0h = A0h(context, componentName);
        if (A0h == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), A0h);
        if (A0h(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static Intent A09(Context context, C018808t c018808t, String str, String str2, Integer num, ArrayList arrayList, ArrayList arrayList2, Bundle bundle) {
        Intent intent;
        if (c018808t.A01() && !C02180Ae.A1Y(str)) {
            intent = new Intent(context, ContactUsActivity.class);
            intent.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from", str);
            intent.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", str2);
            if (bundle != null) {
                Bundle bundle2 = new Bundle();
                String string = bundle.getString("com.whatsapp.support.DescribeProblemActivity.from");
                String string2 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.serverstatus");
                String string3 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.emailAddress");
                String string4 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.description");
                if (!TextUtils.isEmpty(string)) {
                    bundle2.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.from", string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    bundle2.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", string2);
                }
                if (!TextUtils.isEmpty(string3)) {
                    bundle2.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.emailAddress", string3);
                }
                if (!TextUtils.isEmpty(string4)) {
                    bundle2.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.description", string4);
                }
                intent.putExtras(bundle2);
            }
        } else {
            intent = new Intent(context, DescribeProblemActivity.class);
            intent.putExtra("com.whatsapp.support.DescribeProblemActivity.from", str);
            intent.putExtra("com.whatsapp.support.DescribeProblemActivity.serverstatus", str2);
            if (num != null) {
                intent.putExtra("com.whatsapp.support.DescribeProblemActivity.type", num);
            }
            if (arrayList != null) {
                intent.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs", arrayList);
            }
            if (arrayList2 != null) {
                intent.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles", arrayList2);
            }
            if (bundle != null) {
                intent.putExtras(bundle);
                return intent;
            }
        }
        return intent;
    }

    public static Bitmap A0A(InputStream inputStream, BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT >= 21) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        return A0M(inputStream, new C0DH(Integer.MAX_VALUE, Integer.MAX_VALUE, null, false, options)).A02;
    }

    public static Typeface A0B(Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return A0C(context, R.font.payment_icons_regular, new TypedValue(), 0, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:278:0x01d9, code lost:
        if (r34 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x002e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface A0C(final android.content.Context r30, int r31, android.util.TypedValue r32, final int r33, final X.C0X1 r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002701i.A0C(android.content.Context, int, android.util.TypedValue, int, X.0X1, boolean):android.graphics.Typeface");
    }

    public static Drawable A0D(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static Bundle A0E(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        synchronized (C0XI.A02) {
            if (C0XI.A01) {
                return null;
            }
            try {
                try {
                    Field field = C0XI.A00;
                    if (field == null) {
                        field = Notification.class.getDeclaredField("extras");
                        if (!Bundle.class.isAssignableFrom(field.getType())) {
                            Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                            C0XI.A01 = true;
                            return null;
                        }
                        field.setAccessible(true);
                        C0XI.A00 = field;
                    }
                    Bundle bundle = (Bundle) field.get(notification);
                    if (bundle == null) {
                        bundle = new Bundle();
                        C0XI.A00.set(notification, bundle);
                    }
                    return bundle;
                } catch (IllegalAccessException e) {
                    Log.e("NotificationCompat", "Unable to access notification extras", e);
                    C0XI.A01 = true;
                    return null;
                }
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                C0XI.A01 = true;
                return null;
            }
        }
    }

    public static SpannableStringBuilder A0F(CharSequence charSequence, Context context, Paint paint, float f, C0GQ c0gq, C40081rY c40081rY) {
        C2RX c2rx;
        if (paint == null) {
            c2rx = A0W(context.getApplicationContext());
        } else {
            c2rx = new C2RX(context, paint, f);
        }
        return A0G(charSequence, context, c2rx, c0gq, c40081rY);
    }

    public static SpannableStringBuilder A0G(CharSequence charSequence, Context context, C2RX c2rx, C0GQ c0gq, C40081rY c40081rY) {
        Object imageSpan;
        SpannableStringBuilder spannableStringBuilder = null;
        if (charSequence == null) {
            return null;
        }
        C43931yF c43931yF = new C43931yF(charSequence);
        int length = charSequence.length();
        Paint paint = new Paint();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c43931yF.A00 = i;
            int descriptor = EmojiDescriptor.getDescriptor(c43931yF);
            int A022 = c43931yF.A02(i, descriptor);
            if (descriptor != -1) {
                if (spannableStringBuilder == null) {
                    if (charSequence instanceof SpannableStringBuilder) {
                        spannableStringBuilder = (SpannableStringBuilder) charSequence;
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    }
                }
                BitmapDrawable A012 = c40081rY.A01(context, descriptor, c43931yF);
                if (A012 != null) {
                    if (AbstractC43921yD.A00) {
                        StringBuilder sb = new StringBuilder(A022);
                        for (int i3 = 0; i3 < A022; i3++) {
                            sb.append((char) 65535);
                        }
                        spannableStringBuilder.replace(i2, i2 + A022, (CharSequence) sb, 0, A022);
                    }
                    int i4 = i2 + A022;
                    CharSequence subSequence = spannableStringBuilder.subSequence(i2, i4);
                    Paint paint2 = c2rx.A02;
                    Paint.FontMetricsInt A002 = C2RY.A00(paint2);
                    if (A002 != null) {
                        int textSize = (int) ((paint2.getTextSize() * c2rx.A00 * 1.1f) + 0.5f);
                        A012.setBounds(0, 0, textSize, textSize);
                        imageSpan = new C2RZ(c2rx.A01, A012, A002, subSequence);
                    } else {
                        int textSize2 = paint2.getFontMetrics() != null ? (int) ((paint2.getTextSize() * c2rx.A00 * 1.1f) + 0.5f) : (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f);
                        A012.setBounds(0, 0, textSize2, textSize2);
                        imageSpan = new ImageSpan(A012, 0);
                    }
                    spannableStringBuilder.setSpan(imageSpan, i2, i4, 33);
                    if (c0gq != null && !c0gq.APQ(true, i)) {
                        return spannableStringBuilder;
                    }
                } else if (!C0XJ.A00(paint, charSequence.subSequence(i, i + A022).toString())) {
                    spannableStringBuilder.setSpan(new ReplacementSpan() { // from class: X.2Rb
                        @Override // android.text.style.ReplacementSpan
                        public void draw(Canvas canvas, CharSequence charSequence2, int i5, int i6, float f, int i7, int i8, int i9, Paint paint3) {
                            canvas.drawText("□", f, i8, paint3);
                        }

                        @Override // android.text.style.ReplacementSpan
                        public int getSize(Paint paint3, CharSequence charSequence2, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
                            return (int) Math.ceil(paint3.measureText("□"));
                        }
                    }, i2, i2 + A022, 33);
                }
            } else if (c0gq != null && !c0gq.APQ(false, i)) {
                return spannableStringBuilder;
            }
            i2 += A022;
            i += A022;
        }
        return charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : spannableStringBuilder;
    }

    public static Pair A0H(AnonymousClass035 anonymousClass035, URL url, String str, long j, long j2, C05080Nf c05080Nf, boolean z, boolean z2, boolean z3) {
        C0PE c0pe;
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            if (z) {
                C0XK A03 = anonymousClass035.A03(false);
                c0pe = A03;
                if (z2) {
                    httpsURLConnection.setHostnameVerifier(new C0XL(c05080Nf.A05, HttpsURLConnection.getDefaultHostnameVerifier()));
                    c0pe = A03;
                }
            } else {
                c0pe = anonymousClass035.A04();
            }
            int A92 = c0pe.A92();
            httpsURLConnection.setSSLSocketFactory(c0pe);
            httpsURLConnection.setConnectTimeout(15000);
            httpsURLConnection.setReadTimeout(30000);
            httpsURLConnection.setRequestProperty("User-Agent", str);
            httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpsURLConnection.setRequestProperty("Host", c05080Nf.A05);
            if (j != 0 || j2 != -1) {
                StringBuilder sb = new StringBuilder("bytes=");
                sb.append(j);
                sb.append("-");
                String obj = sb.toString();
                if (j2 != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(j2);
                    obj = sb2.toString();
                }
                httpsURLConnection.setRequestProperty("Range", obj);
            }
            if (z3) {
                httpsURLConnection.setRequestProperty("X-FB-Socket-Option", "TCP_CONGESTION=bbr");
            }
            try {
                int responseCode = httpsURLConnection.getResponseCode();
                boolean z4 = c0pe.A92() == A92;
                if (responseCode != 200 && responseCode != 206) {
                    String str2 = null;
                    if (httpsURLConnection.getErrorStream() != null) {
                        try {
                            InputStream errorStream = httpsURLConnection.getErrorStream();
                            C43351xG c43351xG = new C43351xG(errorStream, 1024L);
                            str2 = AnonymousClass024.A0D(c43351xG);
                            c43351xG.A02.close();
                            if (errorStream != null) {
                                errorStream.close();
                            }
                        } catch (IOException e) {
                            com.whatsapp.util.Log.e("MediaDownloadConnection/download/can't get string from error stream", e);
                        }
                    }
                    StringBuilder A0P = C000200d.A0P("MediaDownloadConnection/download failed; url=");
                    A0P.append(C40841sx.A0S(url));
                    A0P.append(" responseCode=");
                    A0P.append(responseCode);
                    A0P.append(" responseBody=");
                    A0P.append(str2);
                    com.whatsapp.util.Log.w(A0P.toString());
                    if (responseCode == 416) {
                        String headerField = httpsURLConnection.getHeaderField("Content-Range");
                        if (TextUtils.isEmpty(headerField) || !headerField.startsWith("*/")) {
                            throw new C50282Rc(responseCode, str2);
                        }
                    } else {
                        throw new C50282Rc(responseCode, str2);
                    }
                }
                return new Pair(httpsURLConnection, Boolean.valueOf(z4));
            } catch (IOException e2) {
                com.whatsapp.util.Log.w("MediaDownloadConnection/exception while getting response code", e2);
                throw new C50292Rd(e2, "failed with IOException while retrieving response") { // from class: X.2Re
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r2 = this;
                            boolean r0 = r3 instanceof java.net.UnknownHostException
                            if (r0 == 0) goto L9
                            r1 = 2
                        L5:
                            r2.<init>(r4, r3, r1)
                            return
                        L9:
                            boolean r0 = r3 instanceof java.net.SocketTimeoutException
                            r1 = 19
                            if (r0 == 0) goto L5
                            r1 = 3
                            goto L5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C50302Re.<init>(java.lang.Exception, java.lang.String):void");
                    }

                    @Override // java.lang.Throwable
                    public String toString() {
                        StringBuilder A0P2 = C000200d.A0P("ConnectionFailureException: ");
                        A0P2.append(getMessage());
                        return A0P2.toString();
                    }
                };
            } catch (IllegalArgumentException e3) {
                throw new C50292Rd
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x013c: THROW  
                      (wrap: X.2Rd : 0x0139: CONSTRUCTOR  (r0v8 X.2Rd A[REMOVE]) = (r2v3 'e3' java.lang.IllegalArgumentException), ("failed with IllegalArgumentException while retrieving response") call: X.2Re.<init>(java.lang.Exception, java.lang.String):void type: CONSTRUCTOR)
                     in method: X.01i.A0H(X.035, java.net.URL, java.lang.String, long, long, X.0Nf, boolean, boolean, boolean):android.util.Pair, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:365)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:313)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:798)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:387)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                    	... 28 more
                    */
                /*
                    Method dump skipped, instructions count: 326
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C002701i.A0H(X.035, java.net.URL, java.lang.String, long, long, X.0Nf, boolean, boolean, boolean):android.util.Pair");
            }

            public static C0XN A0I(Context context, C0UH c0uh, C0BA c0ba, boolean z) {
                int i;
                C0XM c0xm = c0ba.A0C;
                int i2 = c0xm == null ? 0 : c0xm.A01;
                int i3 = c0xm == null ? 0 : c0xm.A00;
                c0ba.A0M(0);
                View A002 = c0uh.A00(c0ba.A02);
                if (A002 != null && A002.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                    A002.setTag(R.id.visible_removing_fragment_view_tag, null);
                }
                ViewGroup viewGroup = c0ba.A0B;
                if (viewGroup == null || viewGroup.getLayoutTransition() == null) {
                    if (i3 != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(i3));
                        if (equals) {
                            try {
                                Animation loadAnimation = AnimationUtils.loadAnimation(context, i3);
                                if (loadAnimation != null) {
                                    return new C0XN(loadAnimation);
                                }
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                            }
                        }
                        try {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i3);
                            if (loadAnimator != null) {
                                return new C0XN(loadAnimator);
                            }
                        } catch (RuntimeException e2) {
                            if (!equals) {
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i3);
                                if (loadAnimation2 != null) {
                                    return new C0XN(loadAnimation2);
                                }
                            } else {
                                throw e2;
                            }
                        }
                    }
                    if (i2 == 0) {
                        return null;
                    }
                    if (i2 == 4097) {
                        i = R.anim.fragment_open_exit;
                        if (z) {
                            i = R.anim.fragment_open_enter;
                        }
                    } else if (i2 == 4099) {
                        i = R.anim.fragment_fade_exit;
                        if (z) {
                            i = R.anim.fragment_fade_enter;
                        }
                    } else if (i2 != 8194) {
                        return null;
                    } else {
                        i = R.anim.fragment_close_exit;
                        if (z) {
                            i = R.anim.fragment_close_enter;
                        }
                    }
                    return new C0XN(AnimationUtils.loadAnimation(context, i));
                }
                return null;
            }

            public static C06570Tx A0J(ActivityC02330At activityC02330At, C0CR c0cr) {
                return new C06570Tx(activityC02330At.ADv(), c0cr);
            }

            public static C0DI A0K(InterfaceC50312Rf interfaceC50312Rf, C0DH c0dh) {
                try {
                    return A0N(interfaceC50312Rf.A6Y(), c0dh);
                } catch (IOException e) {
                    com.whatsapp.util.Log.e("bitmaputils/decoder failed", e);
                    return new C0DI(null, 0, 0);
                }
            }

            public static C0DI A0L(final File file, C0DH c0dh) {
                if (Build.VERSION.SDK_INT >= 21) {
                    BitmapFactory.Options options = c0dh.A02;
                    if (!options.inJustDecodeBounds) {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    }
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    if (i > 0 && i2 > 0) {
                        options.inSampleSize = A03(i, i2, c0dh);
                        options.inJustDecodeBounds = false;
                        return new C0DI(BitmapFactory.decodeFile(file.getAbsolutePath(), options), i, i2);
                    }
                    com.whatsapp.util.Log.e("bitmapcache/decode bad image");
                    return new C0DI(null, i, i2);
                }
                return A0K(new InterfaceC50312Rf() { // from class: X.0XO
                    @Override // X.InterfaceC50312Rf
                    public final byte[] A6Y() {
                        return AnonymousClass024.A0n(file);
                    }
                }, c0dh);
            }

            public static C0DI A0M(final InputStream inputStream, C0DH c0dh) {
                return A0K(new InterfaceC50312Rf() { // from class: X.0XP
                    @Override // X.InterfaceC50312Rf
                    public final byte[] A6Y() {
                        return AnonymousClass024.A0o(inputStream);
                    }
                }, c0dh);
            }

            public static C0DI A0N(byte[] bArr, C0DH c0dh) {
                BitmapFactory.Options options = c0dh.A02;
                if (!options.inJustDecodeBounds) {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                }
                int i = options.outWidth;
                int i2 = options.outHeight;
                if (i > 0 && i2 > 0) {
                    options.inSampleSize = A03(i, i2, c0dh);
                    options.inJustDecodeBounds = false;
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    return new C0DI(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), i, i2);
                }
                com.whatsapp.util.Log.e("bitmaputils/decode bad image");
                return new C0DI(null, i, i2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
                if (r1 == 3) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static X.C018108l A0O(android.database.Cursor r12) {
                /*
                    r0 = 1
                    java.lang.String r0 = r12.getString(r0)
                    com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.getNullable(r0)
                    if (r4 != 0) goto Ld
                    r0 = 0
                    return r0
                Ld:
                    r0 = 0
                    r12.getLong(r0)
                    r0 = 2
                    long r5 = r12.getLong(r0)
                    r0 = 3
                    java.lang.String r7 = r12.getString(r0)
                    r0 = 5
                    java.lang.String r8 = r12.getString(r0)
                    r0 = 9
                    int r1 = r12.getInt(r0)
                    r0 = 1
                    if (r1 == r0) goto L30
                    r0 = 2
                    if (r1 == r0) goto L30
                    r0 = 3
                    r9 = 0
                    if (r1 != r0) goto L31
                L30:
                    r9 = r0
                L31:
                    r0 = 10
                    byte[] r10 = r12.getBlob(r0)
                    r0 = 11
                    int r11 = r12.getInt(r0)
                    r0 = 12
                    java.lang.String r0 = r12.getString(r0)
                    int r3 = X.C40731sm.A03(r0)
                    r0 = 13
                    java.lang.String r0 = r12.getString(r0)
                    int r2 = X.C40731sm.A02(r0)
                    r0 = 14
                    long r0 = r12.getLong(r0)
                    X.0Ns r12 = new X.0Ns
                    r12.<init>(r3, r2, r0)
                    X.08l r3 = new X.08l
                    r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C002701i.A0O(android.database.Cursor):X.08l");
            }

            public static C09R A0P(String str) {
                return !TextUtils.isEmpty(str) ? new C09R(str) : C09R.A01;
            }

            public static C0XQ A0Q() {
                C40641sb A022 = C40631sa.A00().A02();
                return new C0XQ(new C0IR(A022.A01, (byte) 5), new C0R8(A022.A00, (byte) 5));
            }

            public static C0R8 A0R(InterfaceC02660Ch interfaceC02660Ch) {
                return new C0R8(((C40651sc) interfaceC02660Ch).A00, (byte) interfaceC02660Ch.getType());
            }

            public static C0IR A0S(byte[] bArr) {
                if (bArr.length >= 33) {
                    int i = bArr[0] & 255;
                    if (i == 5) {
                        byte[] bArr2 = new byte[32];
                        System.arraycopy(bArr, 1, bArr2, 0, 32);
                        return new C0IR(bArr2, (byte) 5);
                    }
                    throw new Exception(C000200d.A0D("Bad key type: ", i)) { // from class: X.0Nw
                    };
                }
                throw new Exception("Invalid byte array") { // from class: X.0Nw
                };
            }

            public static C0IO A0T(DeviceJid deviceJid) {
                C000700j.A04(deviceJid, "Provided jid must not be null");
                String str = deviceJid.user;
                C000700j.A04(str, "User part of provided jid must not be null");
                return new C0IO(str, deviceJid.device);
            }

            public static C0IO A0U(C0XR c0xr) {
                return new C0IO(c0xr.A01, c0xr.A00);
            }

            public static C0QS A0V(C0XS c0xs) {
                return new C0QS(c0xs.A00, A0U(c0xs.A01));
            }

            public static C2RX A0W(Context context) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dialog_emoji_size);
                Paint paint = new Paint();
                paint.setTextSize(dimensionPixelSize);
                return new C2RX(context, paint);
            }

            public static DeviceJid A0X(C0IO c0io) {
                try {
                    return DeviceJid.getFromUserJidAndDeviceId(UserJid.getFromIdentifier(c0io.A01), c0io.A00);
                } catch (C011305p unused) {
                    StringBuilder sb = new StringBuilder("Invalid signal protocol address: ");
                    sb.append(c0io);
                    com.whatsapp.util.Log.e(sb.toString());
                    return null;
                }
            }

            public static C05530Pc A0Y(String str) {
                C50322Rg c50322Rg;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        ArrayList arrayList = new ArrayList();
                        JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                                JSONObject optJSONObject = jSONObject2.optJSONObject("native_flow_info");
                                if (optJSONObject != null) {
                                    String string = optJSONObject.getString("name");
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                                    c50322Rg = new C50322Rg(string, optJSONObject2 == null ? null : optJSONObject2.toString());
                                } else {
                                    c50322Rg = null;
                                }
                                arrayList.add(new C2D3(jSONObject2.optString("id"), jSONObject2.optString("displayText"), jSONObject2.optBoolean("selected"), jSONObject2.optInt("button_type", 0), c50322Rg));
                            }
                        }
                        return new C05530Pc(jSONObject.optString("content"), jSONObject.optString("footer"), arrayList);
                    }
                    throw null;
                } catch (JSONException e) {
                    com.whatsapp.util.Log.w("ButtonsConverter/parseJSON/deserialization error", e);
                    return null;
                }
            }

            public static C50332Rh A0Z(JSONObject jSONObject) {
                C50362Rk c50362Rk;
                if (jSONObject == null) {
                    return null;
                }
                String optString = jSONObject.optString("business_owner_jid");
                try {
                    UserJid userJid = UserJid.get(optString);
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject.optJSONArray("product_sections");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("product_section_products");
                            ArrayList arrayList2 = new ArrayList();
                            if (optJSONArray2 != null) {
                                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                    arrayList2.add(new C50342Ri(optJSONArray2.optJSONObject(i2).optString("product_id")));
                                }
                            }
                            arrayList.add(new C50352Rj(optJSONObject.optString("product_sections_title"), arrayList2));
                        }
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("product_header_info");
                    if (optJSONObject2 != null) {
                        String optString2 = optJSONObject2.optString("product_header_info_thumb");
                        c50362Rk = new C50362Rk(TextUtils.isEmpty(optString2) ? null : Base64.decode(optString2, 0), optJSONObject2.optString("product_header_info_id"), optJSONObject2.optBoolean("product_header_is_rejected", false));
                    } else {
                        c50362Rk = new C50362Rk(null, "", false);
                    }
                    return new C50332Rh(arrayList, c50362Rk, userJid);
                } catch (C011305p e) {
                    StringBuilder sb = new StringBuilder("MultiElementConverter/parseProductListInfo/Invalid jid: ");
                    sb.append(optString);
                    com.whatsapp.util.Log.e(sb.toString(), e);
                    return null;
                }
            }

            public static C0XT A0a(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C0XT(jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("footerText", null), jSONObject.optString("buttonText"), A12(jSONObject.optJSONArray("sections")), A0Z(jSONObject.optJSONObject("product_info")), jSONObject.optInt("selectListType"));
                } catch (JSONException e) {
                    com.whatsapp.util.Log.w("MultiElementConverter/parseJSON/deserialization error", e);
                    return null;
                }
            }

            public static C0JU A0b(AnonymousClass094 anonymousClass094, long j, byte b) {
                if (b != 35) {
                    if (b != 47) {
                        if (b != 38) {
                            if (b != 39) {
                                return null;
                            }
                            return new C44991zz(anonymousClass094, j);
                        }
                        return new C44911zr(anonymousClass094, j);
                    }
                    return new C0XU(anonymousClass094, j);
                }
                return new C04200Je(anonymousClass094, j);
            }

            public static CharSequence A0c(CharSequence charSequence, int i, int i2, int i3) {
                int length = charSequence.length();
                if (i >= 0 && i2 <= length && i <= i2) {
                    C43931yF c43931yF = new C43931yF(charSequence);
                    int i4 = 0;
                    int i5 = i;
                    while (i5 < i2) {
                        i5 += c43931yF.A01(i5);
                        i4++;
                        if (i4 >= i3) {
                            return charSequence.subSequence(i, i5);
                        }
                    }
                    return null;
                }
                throw new IndexOutOfBoundsException();
            }

            public static CharSequence A0d(CharSequence charSequence, Context context, Paint paint, C40081rY c40081rY) {
                SpannableStringBuilder A0F = A0F(charSequence, context, paint, 1.0f, null, c40081rY);
                return A0F != null ? A0F : charSequence;
            }

            public static CharSequence A0e(CharSequence charSequence, Context context, Paint paint, C40081rY c40081rY) {
                return A0f(charSequence, context, paint, new C0GQ() { // from class: X.2Rl
                    public int A01 = 0;
                    public int A00 = 0;
                    public final int A02 = 128;

                    @Override // X.C0GQ
                    public int AAu() {
                        return this.A00;
                    }

                    @Override // X.C0GQ
                    public boolean APQ(boolean z, int i) {
                        if (z) {
                            this.A01++;
                        }
                        if (this.A01 >= this.A02) {
                            this.A00 = i;
                            return false;
                        }
                        return true;
                    }
                }, c40081rY);
            }

            public static CharSequence A0f(CharSequence charSequence, Context context, Paint paint, C0GQ c0gq, C40081rY c40081rY) {
                SpannableStringBuilder A0F = A0F(charSequence, context, paint, 1.0f, c0gq, c40081rY);
                int AAu = c0gq.AAu();
                if (AAu <= 0) {
                    return A0F != null ? A0F : charSequence;
                }
                if (A0F == null) {
                    A0F = new SpannableStringBuilder(charSequence);
                }
                SpannableStringBuilder delete = A0F.delete((Character.charCount(Character.codePointAt(charSequence, AAu - 1)) - 1) + AAu, A0F.length());
                delete.append((CharSequence) "…");
                return delete;
            }

            public static CharSequence A0g(CharSequence charSequence, Context context, C40081rY c40081rY) {
                SpannableStringBuilder A0G = A0G(charSequence, context, A0W(context.getApplicationContext()), null, c40081rY);
                return A0G != null ? A0G : charSequence;
            }

            public static String A0h(Context context, ComponentName componentName) {
                String string;
                PackageManager packageManager = context.getPackageManager();
                int i = 640;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    i = 269222528;
                } else if (i2 >= 24) {
                    i = 787072;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
                String str = activityInfo.parentActivityName;
                if (str != null) {
                    return str;
                }
                Bundle bundle = activityInfo.metaData;
                if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
                    return null;
                }
                if (string.charAt(0) == '.') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(string);
                    return sb.toString();
                }
                return string;
            }

            public static String A0i(AnonymousClass031 anonymousClass031, String str, String str2) {
                try {
                    str2 = anonymousClass031.A02(Integer.parseInt(str), str2);
                    return str2;
                } catch (IOException e) {
                    com.whatsapp.util.Log.e("phonenumberutils/trim/error", e);
                    return str2;
                }
            }

            public static String A0j(C002301c c002301c, String str, String str2, BigDecimal bigDecimal, int i, boolean z) {
                C09R A0P = A0P(str);
                StringBuilder sb = new StringBuilder();
                if (!z) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(A0P.A01(c002301c, i, false).A05(bigDecimal));
                sb.append(" ");
                sb.append(str);
                return sb.toString();
            }

            public static String A0k(C002301c c002301c, String str, BigDecimal bigDecimal, int i, boolean z) {
                return A0P(str).A01(c002301c, i, z).A05(bigDecimal);
            }

            public static String A0l(C002301c c002301c, String str, BigDecimal bigDecimal, boolean z) {
                NumberFormat decimalFormat = DecimalFormat.getInstance(c002301c.A0I());
                decimalFormat.setMaximumFractionDigits(bigDecimal.scale());
                decimalFormat.setMinimumFractionDigits(bigDecimal.scale());
                String format = decimalFormat.format(bigDecimal);
                return z ? C000200d.A0I(format, " ", str) : format;
            }

            public static String A0m(C002301c c002301c, String str, BigDecimal bigDecimal, boolean z) {
                return A0P(str).A01(c002301c, bigDecimal.scale(), z).A05(bigDecimal);
            }

            public static String A0n(C05530Pc c05530Pc) {
                JSONObject jSONObject;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("content", c05530Pc.A00);
                    jSONObject2.put("footer", c05530Pc.A01);
                    JSONArray jSONArray = new JSONArray();
                    List<C2D3> list = c05530Pc.A02;
                    if (list != null) {
                        for (C2D3 c2d3 : list) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("id", c2d3.A04);
                            String str = c2d3.A03;
                            if (str != null) {
                                jSONObject3.put("displayText", str);
                            }
                            jSONObject3.put("selected", c2d3.A00);
                            jSONObject3.put("button_type", c2d3.A01);
                            C50322Rg c50322Rg = c2d3.A02;
                            if (c50322Rg != null) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("name", c50322Rg.A00);
                                String str2 = c50322Rg.A01;
                                if (str2 != null && str2.length() > 0) {
                                    jSONObject4.put("params", new JSONObject(str2));
                                }
                                jSONObject3.put("native_flow_info", jSONObject4);
                            }
                            jSONArray.put(jSONObject3);
                        }
                    }
                    jSONObject2.put("buttons", jSONArray);
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    com.whatsapp.util.Log.w("ButtonsConverter/toJSONObject/serialization error", e);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return jSONObject.toString();
                }
                return null;
            }

            public static String A0o(C0XT c0xt) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("title", c0xt.A05);
                    jSONObject.put("description", c0xt.A03);
                    jSONObject.put("footerText", c0xt.A04);
                    jSONObject.put("buttonText", c0xt.A02);
                    jSONObject.put("selectListType", c0xt.A00);
                    jSONObject.put("sections", A13(c0xt));
                    jSONObject.put("product_info", A14(c0xt));
                } catch (JSONException e) {
                    com.whatsapp.util.Log.w("MultiElementConverter/toJSONObject/serialization error", e);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return jSONObject.toString();
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:75:0x0064 A[FALL_THROUGH] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x006a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.String A0p(java.lang.CharSequence r9) {
                /*
                    if (r9 != 0) goto L4
                    r0 = 0
                    return r0
                L4:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    X.1yF r4 = new X.1yF
                    r4.<init>(r9)
                    int r3 = r9.length()
                    r2 = 0
                L13:
                    if (r2 >= r3) goto L8a
                    r4.A00 = r2
                    int r1 = com.whatsapp.emoji.EmojiDescriptor.getDescriptor(r4)
                    int r8 = r4.A02(r2, r1)
                    r0 = -1
                    if (r1 == r0) goto L80
                    int r6 = android.os.Build.VERSION.SDK_INT
                    int r0 = r1 >> 12
                    r1 = r0 & 7
                    r7 = 9633(0x25a1, float:1.3499E-41)
                    r0 = 1
                    if (r1 != r0) goto L6e
                    r4.A00 = r2
                L2f:
                    int r6 = r4.A00()
                    r0 = 65039(0xfe0f, float:9.1139E-41)
                    if (r6 == r0) goto L2f
                    r0 = 9748(0x2614, float:1.366E-41)
                    if (r6 == r0) goto L64
                    r0 = 9749(0x2615, float:1.3661E-41)
                    if (r6 == r0) goto L64
                    switch(r6) {
                        case 9745: goto L64;
                        case 9757: goto L64;
                        case 57872: goto L64;
                        case 60417: goto L64;
                        case 60418: goto L64;
                        case 60419: goto L64;
                        case 60420: goto L64;
                        case 60421: goto L64;
                        case 60422: goto L64;
                        case 60423: goto L64;
                        case 60424: goto L64;
                        case 60425: goto L64;
                        case 60426: goto L64;
                        case 60427: goto L64;
                        case 60428: goto L64;
                        case 60429: goto L64;
                        case 60430: goto L64;
                        case 60431: goto L64;
                        case 60432: goto L64;
                        case 60433: goto L64;
                        case 60434: goto L64;
                        case 60435: goto L64;
                        case 60436: goto L64;
                        case 60437: goto L64;
                        case 60438: goto L64;
                        case 60439: goto L64;
                        case 127760: goto L64;
                        case 127762: goto L64;
                        case 127770: goto L64;
                        case 127819: goto L64;
                        case 127824: goto L64;
                        case 127868: goto L64;
                        case 127943: goto L64;
                        case 127945: goto L64;
                        case 127972: goto L64;
                        case 128019: goto L64;
                        case 128021: goto L64;
                        case 128022: goto L64;
                        case 128042: goto L64;
                        case 128101: goto L64;
                        case 128108: goto L64;
                        case 128109: goto L64;
                        case 128113: goto L64;
                        case 128114: goto L64;
                        case 128115: goto L64;
                        case 128173: goto L64;
                        case 128182: goto L64;
                        case 128183: goto L64;
                        case 128236: goto L64;
                        case 128237: goto L64;
                        case 128239: goto L64;
                        case 128245: goto L64;
                        case 128256: goto L64;
                        case 128257: goto L64;
                        case 128258: goto L64;
                        case 128260: goto L64;
                        case 128261: goto L64;
                        case 128262: goto L64;
                        case 128263: goto L64;
                        case 128264: goto L64;
                        case 128265: goto L64;
                        case 128277: goto L64;
                        case 128300: goto L64;
                        case 128301: goto L64;
                        case 128348: goto L64;
                        case 128349: goto L64;
                        case 128350: goto L64;
                        case 128351: goto L64;
                        case 128353: goto L64;
                        case 128354: goto L64;
                        case 128355: goto L64;
                        case 128356: goto L64;
                        case 128357: goto L64;
                        case 128358: goto L64;
                        case 128359: goto L64;
                        case 128512: goto L64;
                        case 128519: goto L64;
                        case 128520: goto L64;
                        case 128526: goto L64;
                        case 128528: goto L64;
                        case 128529: goto L64;
                        case 128533: goto L64;
                        case 128535: goto L64;
                        case 128537: goto L64;
                        case 128539: goto L64;
                        case 128543: goto L64;
                        case 128550: goto L64;
                        case 128551: goto L64;
                        case 128556: goto L64;
                        case 128558: goto L64;
                        case 128559: goto L64;
                        case 128564: goto L64;
                        case 128566: goto L64;
                        case 128641: goto L64;
                        case 128642: goto L64;
                        case 128646: goto L64;
                        case 128648: goto L64;
                        case 128650: goto L64;
                        case 128651: goto L64;
                        case 128653: goto L64;
                        case 128654: goto L64;
                        case 128656: goto L64;
                        case 128660: goto L64;
                        case 128662: goto L64;
                        case 128664: goto L64;
                        case 128667: goto L64;
                        case 128668: goto L64;
                        case 128669: goto L64;
                        case 128670: goto L64;
                        case 128671: goto L64;
                        case 128672: goto L64;
                        case 128673: goto L64;
                        case 128675: goto L64;
                        case 128678: goto L64;
                        case 128686: goto L64;
                        case 128687: goto L64;
                        case 128688: goto L64;
                        case 128689: goto L64;
                        case 128691: goto L64;
                        case 128692: goto L64;
                        case 128693: goto L64;
                        case 128695: goto L64;
                        case 128696: goto L64;
                        case 128703: goto L64;
                        case 128705: goto L64;
                        case 128706: goto L64;
                        case 128707: goto L64;
                        case 128708: goto L64;
                        case 128709: goto L64;
                        default: goto L43;
                    }
                L43:
                    switch(r6) {
                        case 57884: goto L64;
                        case 57885: goto L64;
                        case 57886: goto L64;
                        case 57887: goto L64;
                        case 57888: goto L64;
                        case 57889: goto L64;
                        case 57890: goto L64;
                        case 57891: goto L64;
                        case 57892: goto L64;
                        case 57893: goto L64;
                        default: goto L46;
                    }
                L46:
                    switch(r6) {
                        case 58634: goto L64;
                        case 58635: goto L64;
                        case 58636: goto L64;
                        case 58637: goto L64;
                        case 58638: goto L64;
                        case 58639: goto L64;
                        case 58640: goto L64;
                        case 58641: goto L64;
                        case 58642: goto L64;
                        case 58643: goto L64;
                        case 58644: goto L64;
                        default: goto L49;
                    }
                L49:
                    switch(r6) {
                        case 127757: goto L64;
                        case 127758: goto L64;
                        default: goto L4c;
                    }
                L4c:
                    switch(r6) {
                        case 127766: goto L64;
                        case 127767: goto L64;
                        case 127768: goto L64;
                        default: goto L4f;
                    }
                L4f:
                    switch(r6) {
                        case 127772: goto L64;
                        case 127773: goto L64;
                        case 127774: goto L64;
                        default: goto L52;
                    }
                L52:
                    switch(r6) {
                        case 127794: goto L64;
                        case 127795: goto L64;
                        default: goto L55;
                    }
                L55:
                    switch(r6) {
                        case 128000: goto L64;
                        case 128001: goto L64;
                        case 128002: goto L64;
                        case 128003: goto L64;
                        case 128004: goto L64;
                        case 128005: goto L64;
                        case 128006: goto L64;
                        case 128007: goto L64;
                        case 128008: goto L64;
                        case 128009: goto L64;
                        case 128010: goto L64;
                        case 128011: goto L64;
                        default: goto L58;
                    }
                L58:
                    switch(r6) {
                        case 128015: goto L64;
                        case 128016: goto L64;
                        default: goto L5b;
                    }
                L5b:
                    char[] r0 = java.lang.Character.toChars(r6)
                    r5.append(r0)
                L62:
                    int r2 = r2 + r8
                    goto L13
                L64:
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r0 = 19
                    if (r1 >= r0) goto L5b
                    r5.append(r7)
                    goto L62
                L6e:
                    r0 = 23
                    if (r6 < r0) goto L7c
                    int r0 = r2 + r8
                    java.lang.CharSequence r0 = r9.subSequence(r2, r0)
                    r5.append(r0)
                    goto L62
                L7c:
                    r5.append(r7)
                    goto L62
                L80:
                    int r0 = r2 + r8
                    java.lang.CharSequence r0 = r9.subSequence(r2, r0)
                    r5.append(r0)
                    goto L62
                L8a:
                    java.lang.String r0 = r5.toString()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C002701i.A0p(java.lang.CharSequence):java.lang.String");
            }

            public static String A0q(CharSequence charSequence) {
                StringBuilder sb = new StringBuilder();
                C43931yF c43931yF = new C43931yF(charSequence);
                int length = charSequence.length();
                int i = 0;
                while (i < length) {
                    c43931yF.A00 = i;
                    int descriptor = EmojiDescriptor.getDescriptor(c43931yF);
                    int A022 = c43931yF.A02(i, descriptor);
                    if (descriptor != -1) {
                        for (int i2 = 0; i2 < ((descriptor >> 12) & 7); i2++) {
                            sb.append(' ');
                        }
                    } else {
                        sb.append(charSequence.subSequence(i, i + A022));
                    }
                    i += A022;
                }
                return sb.toString();
            }

            public static String A0r(String str) {
                int i = Build.VERSION.SDK_INT;
                boolean z = i < 24;
                if ("fil-PH".equals(str)) {
                    return z ? "tl-PH" : str;
                }
                if (!z) {
                    switch (str.hashCode()) {
                        case 93261389:
                            if (str.equals("az-AZ")) {
                                return "az-Latn-AZ";
                            }
                            break;
                        case 106369665:
                            if (str.equals("pa-IN")) {
                                return "pa-Guru-IN";
                            }
                            break;
                        case 109646445:
                            if (str.equals("sr-BA")) {
                                return "sr-Cyrl-BA";
                            }
                            break;
                        case 109646959:
                            if (str.equals("sr-RS")) {
                                return "sr-Cyrl-RS";
                            }
                            break;
                        case 109647137:
                            if (str.equals("sr-XK")) {
                                return "sr-Cyrl-XK";
                            }
                            break;
                        case 111732429:
                            if (str.equals("uz-UZ")) {
                                return "uz-Latn-UZ";
                            }
                            break;
                        case 115813226:
                            if (str.equals("zh-CN")) {
                                return "zh-Hans-CN";
                            }
                            break;
                        case 115813762:
                            if (str.equals("zh-TW")) {
                                return "zh-Hant-TW";
                            }
                            break;
                    }
                } else {
                    Object obj = AbstractC003201n.A01;
                    synchronized (obj) {
                        if (AbstractC003201n.A00 == null) {
                            String[] locales = Resources.getSystem().getAssets().getLocales();
                            if (i >= 21) {
                                AbstractC003201n.A00 = new HashSet(Arrays.asList(locales));
                            } else {
                                AbstractC003201n.A00 = new HashSet(locales.length);
                                for (String str2 : locales) {
                                    AbstractC003201n.A00.add(str2.replace('_', '-'));
                                }
                            }
                        }
                    }
                    synchronized (obj) {
                        if (AbstractC003201n.A00.contains(str)) {
                            return str;
                        }
                        boolean contains = AbstractC003201n.A00.contains(AbstractC003201n.A09(str).getLanguage());
                        if (!contains) {
                            switch (str.hashCode()) {
                                case 93023040:
                                    if (str.equals("ar-AE")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023074:
                                    if (str.equals("ar-BH")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023138:
                                    if (str.equals("ar-DJ")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023177:
                                    if (str.equals("ar-ER")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023295:
                                    if (str.equals("ar-IL")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023358:
                                    if (str.equals("ar-KM")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023368:
                                    if (str.equals("ar-KW")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023378:
                                    if (str.equals("ar-LB")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023482:
                                    if (str.equals("ar-OM")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023532:
                                    if (str.equals("ar-QA")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93023594:
                                    if (str.equals("ar-SA")) {
                                        return "ar-EG";
                                    }
                                    break;
                                case 93827654:
                                    if (str.equals("bn-IN")) {
                                        return "bn-BD";
                                    }
                                    break;
                                case 96597995:
                                    if (str.equals("en-BI")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598097:
                                    if (str.equals("en-ER")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598208:
                                    if (str.equals("en-IE")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598215:
                                    if (str.equals("en-IL")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598274:
                                    if (str.equals("en-KI")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598350:
                                    if (str.equals("en-MW")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598352:
                                    if (str.equals("en-MY")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598431:
                                    if (str.equals("en-PK")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598505:
                                    if (str.equals("en-RW")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598522:
                                    if (str.equals("en-SI")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598532:
                                    if (str.equals("en-SS")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598570:
                                    if (str.equals("en-TZ")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 96598582:
                                    if (str.equals("en-UG")) {
                                        return "en-GB";
                                    }
                                    break;
                                case 97640743:
                                    if (str.equals("fr-DJ")) {
                                        return "fr-FR";
                                    }
                                    break;
                                case 97641233:
                                    if (str.equals("fr-TD")) {
                                        return "fr-FR";
                                    }
                                    break;
                                case 99487714:
                                    if (str.equals("hr-BA")) {
                                        return "hr-HR";
                                    }
                                    break;
                                case 104135123:
                                    if (str.equals("ms-BN")) {
                                        return "ms-MY";
                                    }
                                    break;
                                case 109617005:
                                    if (str.equals("sq-MK")) {
                                        return "sq-AL";
                                    }
                                    break;
                                case 109617346:
                                    if (str.equals("sq-XK")) {
                                        return "sq-AL";
                                    }
                                    break;
                                case 109646445:
                                    if (str.equals("sr-BA")) {
                                        return "sr-RS";
                                    }
                                    break;
                                case 109647137:
                                    if (str.equals("sr-XK")) {
                                        return "sr-RS";
                                    }
                                    break;
                                case 110063884:
                                    if (str.equals("ta-MY")) {
                                        return "ta-IN";
                                    }
                                    break;
                                default:
                                    return str;
                            }
                        }
                    }
                }
                return str;
            }

            public static String A0s(String str) {
                if (str == null) {
                    return null;
                }
                Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str.replaceAll("\\D", ""));
                if (matcher.find()) {
                    return matcher.group(1);
                }
                return null;
            }

            public static String A0t(String str) {
                if (AbstractC43921yD.A00) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < str.length(); i++) {
                        char charAt = str.charAt(i);
                        int i2 = 0 | charAt;
                        if (C43981yK.A0F(i2)) {
                            sb.append(Character.toChars(i2));
                        } else {
                            sb.append(charAt);
                        }
                    }
                    return sb.toString();
                }
                return str;
            }

            public static String A0u(String str, int i) {
                C43931yF c43931yF = new C43931yF(str);
                int i2 = 0;
                int i3 = 0;
                while (i2 < str.length() && i3 < i) {
                    c43931yF.A00 = i2;
                    int descriptor = EmojiDescriptor.getDescriptor(c43931yF);
                    if (descriptor != -1) {
                        i3++;
                    }
                    i2 += c43931yF.A02(i2, descriptor);
                }
                return str.substring(0, i2);
            }

            public static String A0v(String str, List list) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                    byte[] A1X = A1X(list);
                    byte b = (byte) 0;
                    byte[] A1h = AnonymousClass029.A1h(new byte[]{b, b}, A1X, str.getBytes());
                    for (int i = 0; i < 5200; i++) {
                        messageDigest.update(A1h);
                        A1h = messageDigest.digest(A1X);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0y(A1h, 0));
                    sb.append(A0y(A1h, 5));
                    sb.append(A0y(A1h, 10));
                    sb.append(A0y(A1h, 15));
                    sb.append(A0y(A1h, 20));
                    sb.append(A0y(A1h, 25));
                    return sb.toString();
                } catch (NoSuchAlgorithmException e) {
                    throw new AssertionError(e);
                }
            }

            public static String A0w(List list, List list2) {
                StringBuilder sb = new StringBuilder();
                StringBuilder A0P = C000200d.A0P("SELECT ");
                A0P.append(C0HD.A10);
                A0P.append(" FROM ");
                A0P.append("message_view AS message JOIN ( ");
                sb.append(A0P.toString());
                sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name=?");
                list2.add(list.get(0));
                for (int i = 1; i < list.size(); i++) {
                    sb.append(" INTERSECT ");
                    sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name=?");
                    list2.add(list.get(i));
                }
                sb.append(") ON message._id = message_row_id");
                return sb.toString();
            }

            public static String A0x(Locale locale) {
                String str = (String) C2Qt.A01.get(AbstractC003201n.A01(locale));
                return str == null ? locale.getDisplayLanguage(locale) : str;
            }

            public static String A0y(byte[] bArr, int i) {
                return String.format("%05d", Long.valueOf(((bArr[i + 4] & 255) | (((((bArr[i] & 255) << 32) | ((bArr[i + 1] & 255) << 24)) | ((bArr[i + 2] & 255) << 16)) | ((bArr[i + 3] & 255) << 8))) % 100000));
            }

            public static String A0z(int[] iArr) {
                StringBuilder sb = new StringBuilder(iArr.length);
                for (int i : iArr) {
                    if (AbstractC43921yD.A00 && C43981yK.A0F(i)) {
                        sb.append(Character.toChars(i & 65535));
                    } else {
                        sb.append(Character.toChars(i));
                    }
                }
                return sb.toString();
            }

            public static BigDecimal A10(C002301c c002301c, String str, String str2) {
                C09R A0P = A0P(str);
                try {
                    return new BigDecimal(A0P.A01(c002301c, C09R.A00(A0P.A00), false).A02(str2).toString());
                } catch (Exception e) {
                    com.whatsapp.util.Log.w("Currency parse threw: ", e);
                    try {
                        return new BigDecimal(str2);
                    } catch (Exception e2) {
                        com.whatsapp.util.Log.w("Currency parse fallback threw: ", e2);
                        return null;
                    }
                }
            }

            public static List A11(Collection collection) {
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(A0T((DeviceJid) it.next()));
                }
                return arrayList;
            }

            public static List A12(JSONArray jSONArray) {
                ArrayList arrayList = new ArrayList();
                if (jSONArray == null) {
                    return arrayList;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONArray optJSONArray = jSONObject.optJSONArray("items");
                    String optString = jSONObject.optString("title");
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            arrayList2.add(new C0XV(jSONObject2.optString("id"), jSONObject2.optString("title"), jSONObject2.optString("description")));
                        }
                    }
                    arrayList.add(new C50382Rm(optString, arrayList2));
                }
                return arrayList;
            }

            public static JSONArray A13(C0XT c0xt) {
                JSONArray jSONArray = new JSONArray();
                List<C50382Rm> list = c0xt.A06;
                if (list == null) {
                    return jSONArray;
                }
                for (C50382Rm c50382Rm : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("title", c50382Rm.A00);
                    JSONArray jSONArray2 = new JSONArray();
                    for (C0XV c0xv : c50382Rm.A01) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", c0xv.A01);
                        jSONObject2.put("title", c0xv.A02);
                        jSONObject2.put("description", c0xv.A00);
                        jSONArray2.put(jSONObject2);
                    }
                    jSONObject.put("items", jSONArray2);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }

            public static JSONObject A14(C0XT c0xt) {
                C50332Rh c50332Rh = c0xt.A01;
                if (c50332Rh == null) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (C50352Rj c50352Rj : c50332Rh.A02) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("product_sections_title", c50352Rj.A00);
                    JSONArray jSONArray2 = new JSONArray();
                    for (C50342Ri c50342Ri : c50352Rj.A01) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("product_id", c50342Ri.A00);
                        jSONArray2.put(jSONObject3);
                    }
                    jSONObject2.put("product_section_products", jSONArray2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("product_sections", jSONArray);
                jSONObject.put("business_owner_jid", c50332Rh.A00.getRawString());
                JSONObject jSONObject4 = new JSONObject();
                C50362Rk c50362Rk = c50332Rh.A01;
                byte[] bArr = c50362Rk.A02;
                if (bArr != null) {
                    jSONObject4.put("product_header_info_thumb", Base64.encodeToString(bArr, 0));
                }
                jSONObject4.put("product_header_info_id", c50362Rk.A01);
                jSONObject4.put("product_header_is_rejected", c50362Rk.A00);
                jSONObject.put("product_header_info", jSONObject4);
                return jSONObject;
            }

            public static C0XS A15(C0QS c0qs) {
                C0IO c0io = c0qs.A00;
                return new C0XS(c0qs.A01, new C0XR(c0io.A01, c0io.A00));
            }

            public static C0XY A16(C0XW c0xw) {
                C02670Ci c02670Ci = new C02670Ci(new C02640Cf(c0xw.A00().A01.A01), new C40651sc(c0xw.A00().A00.A01));
                C0XX c0xx = c0xw.A00;
                return new C0XY(c0xx.A01, c0xx.A02, c02670Ci, c0xx.A05.A06());
            }

            public static void A17(int i, int i2) {
                if (i < 0 || i >= i2) {
                    throw new IndexOutOfBoundsException();
                }
            }

            public static void A18(Activity activity, int i) {
                if (A1P(activity)) {
                    return;
                }
                activity.removeDialog(i);
            }

            public static void A19(Activity activity, int i) {
                if (A1P(activity)) {
                    return;
                }
                activity.showDialog(i);
            }

            /* JADX WARN: Code restructure failed: missing block: B:533:0x0222, code lost:
                if (r13.A00 == null) goto L87;
             */
            /* JADX WARN: Code restructure failed: missing block: B:812:0x0a0a, code lost:
                if (r2 == null) goto L395;
             */
            /* JADX WARN: Finally extract failed */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void A1A(final android.app.Application r81) {
                /*
                    Method dump skipped, instructions count: 2623
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C002701i.A1A(android.app.Application):void");
            }

            public static void A1B(Intent intent, String str) {
                if (intent.hasExtra("perf_origin")) {
                    return;
                }
                intent.putExtra("perf_origin", str);
            }

            public static void A1C(Intent intent, String str, AnonymousClass012 anonymousClass012) {
                if (!intent.hasExtra("perf_start_time_ns")) {
                    if (anonymousClass012.A00 != null) {
                        intent.putExtra("perf_start_time_ns", System.nanoTime());
                    } else {
                        throw null;
                    }
                }
                if (intent.hasExtra("perf_origin")) {
                    return;
                }
                intent.putExtra("perf_origin", str);
            }

            public static void A1D(Editable editable, Context context, Paint paint, float f, C40081rY c40081rY) {
                BitmapDrawable A012;
                Object imageSpan;
                Paint.FontMetricsInt A002;
                String str;
                if (A01) {
                    return;
                }
                A01 = true;
                String obj = editable.toString();
                int length = obj.length();
                for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, length, ImageSpan.class)) {
                    editable.removeSpan(imageSpan2);
                }
                boolean z = AbstractC43921yD.A00;
                if (z) {
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int codePointAt = obj.codePointAt(i);
                        int charCount = Character.charCount(codePointAt);
                        if (charCount > 1 && C43981yK.A0F(codePointAt)) {
                            int i3 = i2 + charCount;
                            if (z && C43981yK.A0F(codePointAt)) {
                                str = new String(Character.toChars(codePointAt & 65535));
                            } else {
                                str = new String(Character.toChars(codePointAt));
                            }
                            editable.replace(i2, i3, str);
                            i2 -= charCount - 1;
                        }
                        i += charCount;
                        i2 += charCount;
                    }
                    obj = editable.toString();
                }
                C43931yF c43931yF = new C43931yF(obj);
                int length2 = obj.length();
                int i4 = 0;
                while (i4 < length2) {
                    c43931yF.A00 = i4;
                    int descriptor = EmojiDescriptor.getDescriptor(c43931yF);
                    int A022 = c43931yF.A02(i4, descriptor);
                    if (descriptor != -1 && (A012 = c40081rY.A01(context, descriptor, c43931yF)) != null) {
                        if (paint != null && (A002 = C2RY.A00(paint)) != null) {
                            int textSize = (int) ((paint.getTextSize() * f) + 0.5f);
                            A012.setBounds(0, 0, textSize, textSize);
                            imageSpan = new C2RZ(context, A012, A002, obj.substring(i4, i4 + A022));
                        } else {
                            A012.setBounds(0, 0, (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f), (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f));
                            imageSpan = new ImageSpan(A012, 0);
                        }
                        editable.setSpan(imageSpan, i4, i4 + A022, 33);
                    }
                    i4 += A022;
                }
                A01 = false;
            }

            public static void A1E(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
                if (!A02) {
                    try {
                        Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                        A00 = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e) {
                        StringBuilder A0P = C000200d.A0P("forceSetFactory2 Could not find field 'mFactory2' on class ");
                        A0P.append(LayoutInflater.class.getName());
                        A0P.append("; inflation may have unexpected results.");
                        Log.e("LayoutInflaterCompatHC", A0P.toString(), e);
                    }
                    A02 = true;
                }
                Field field = A00;
                if (field != null) {
                    try {
                        field.set(layoutInflater, factory2);
                    } catch (IllegalAccessException e2) {
                        StringBuilder sb = new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                        sb.append(layoutInflater);
                        sb.append("; inflation may have unexpected results.");
                        Log.e("LayoutInflaterCompatHC", sb.toString(), e2);
                    }
                }
            }

            public static void A1F(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
                layoutInflater.setFactory2(factory2);
                if (Build.VERSION.SDK_INT < 21) {
                    LayoutInflater.Factory factory = layoutInflater.getFactory();
                    if (factory instanceof LayoutInflater.Factory2) {
                        A1E(layoutInflater, (LayoutInflater.Factory2) factory);
                    } else {
                        A1E(layoutInflater, factory2);
                    }
                }
            }

            public static void A1G(final View view, final Runnable runnable, final Handler handler) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.2Rv
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        Handler handler2 = handler;
                        Message obtain = Message.obtain(handler2, runnable);
                        obtain.setAsynchronous(true);
                        handler2.sendMessageAtFrontOfQueue(obtain);
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                });
            }

            public static void A1H(EditText editText, int[] iArr, int i) {
                int max = Math.max(0, editText.getSelectionStart());
                int max2 = Math.max(0, editText.getSelectionEnd());
                if (max > max2) {
                    max2 = max;
                    max = max2;
                }
                if (i > 0) {
                    StringBuilder sb = new StringBuilder(editText.getText().toString());
                    sb.replace(max, max2, A0z(iArr));
                    if (C43981yK.A01(sb) > i) {
                        return;
                    }
                }
                editText.getText().replace(max, max2, A0z(iArr));
                int i2 = 0;
                for (int i3 : iArr) {
                    i2 += AbstractC43921yD.A00 ? 1 : Character.charCount(i3);
                }
                if (max <= editText.length() - i2) {
                    editText.setSelection(max + i2);
                }
            }

            public static void A1I(C02E c02e, final C03120Eg c03120Eg) {
                TelephonyManager A0G = c02e.A0G();
                if (A0G == null) {
                    com.whatsapp.util.Log.i("appinit/async tm=null");
                } else {
                    A0G.listen(new PhoneStateListener() { // from class: X.2Rw
                        @Override // android.telephony.PhoneStateListener
                        public void onCallStateChanged(int i, String str) {
                            if (i == 0) {
                                com.whatsapp.util.Log.i("phone/state idle");
                            } else if (i == 1) {
                                com.whatsapp.util.Log.i("phone/state ringing");
                                c03120Eg.A03();
                            } else if (i == 2) {
                                com.whatsapp.util.Log.i("phone/state offhook");
                            }
                        }
                    }, 32);
                }
            }

            public static void A1J(boolean z) {
                if (!z) {
                    throw new IllegalArgumentException();
                }
            }

            public static void A1K(boolean z) {
                if (!z) {
                    throw new IllegalStateException();
                }
            }

            public static void A1L(boolean z, Object obj) {
                if (!z) {
                    throw new IllegalArgumentException(String.valueOf(obj));
                }
            }

            public static boolean A1P(Activity activity) {
                if (activity.isFinishing() || activity.isChangingConfigurations()) {
                    return true;
                }
                return Build.VERSION.SDK_INT >= 17 && activity.isDestroyed();
            }

            public static boolean A1Q(C0IR c0ir, byte[] bArr, byte[] bArr2) {
                if (c0ir.A00 == 5) {
                    return C40631sa.A00().A03(c0ir.A01, bArr, bArr2);
                }
                throw new AssertionError("PublicKey type is invalid");
            }

            public static boolean A1R(AnonymousClass092 anonymousClass092) {
                if (anonymousClass092 != null) {
                    if (A1S(anonymousClass092)) {
                        AnonymousClass092 A0C = anonymousClass092.A0C();
                        return A0C == null || A1S(A0C);
                    }
                    return false;
                }
                return true;
            }

            public static boolean A1S(AnonymousClass092 anonymousClass092) {
                C04030Id A18;
                if (anonymousClass092.A0E() == null || anonymousClass092.A0E().A06()) {
                    return !(anonymousClass092 instanceof AnonymousClass097) || (A18 = ((AnonymousClass097) anonymousClass092).A18()) == null || A18.A05();
                }
                return false;
            }

            public static boolean A1T(String str, String str2, String str3, String str4) {
                int hashCode = str4.hashCode();
                if (hashCode != 1693) {
                    if (hashCode != 49686) {
                        if (hashCode != 1695) {
                            if (hashCode == 1696 && str4.equals("55")) {
                                return A1V(str, str2, str3, str4, "9", 4);
                            }
                        } else if (str4.equals("54")) {
                            return A1V(str, str2, str3, str4, "9", 2);
                        }
                    } else if (str4.equals("237")) {
                        return A1V(str, str2, str3, str4, "6", 3);
                    }
                } else if (str4.equals("52")) {
                    return A1V(str, str2, str3, str4, "1", 2);
                }
                return false;
            }

            public static boolean A1U(String str, String str2, String str3, String str4, int i) {
                if (str.length() >= i) {
                    StringBuilder sb = new StringBuilder(str);
                    sb.insert(i, str4);
                    String obj = sb.toString();
                    return obj.equals(str2) || obj.equals(str3);
                }
                return false;
            }

            public static boolean A1V(String str, String str2, String str3, String str4, String str5, int i) {
                String A0H = C000200d.A0H(str4, str2);
                boolean A1U = A1U(str, str2, A0H, str5, i);
                boolean A1U2 = A1U(str3, str2, A0H, str5, i);
                int length = i - str4.length();
                return A1U || A1U2 || A1U(str2, str, str3, str5, length) || A1U(A0H, str, str3, str5, i) || A1U(str, str2, A0H, str5, length) || A1U(str3, str2, A0H, str5, length);
            }

            public static byte[] A1W(C0R8 c0r8, byte[] bArr) {
                if (c0r8.A00 == 5) {
                    return C40631sa.A00().A05(c0r8.A01, bArr);
                }
                throw new AssertionError("PrivateKey type is invalid");
            }

            public static byte[] A1X(List list) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0IP) it.next()).A00.A00());
                }
                Collections.sort(arrayList, new AnonymousClass294());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    byte[] bArr = (byte[]) it2.next();
                    byteArrayOutputStream.write(bArr, 0, bArr.length);
                }
                return byteArrayOutputStream.toByteArray();
            }

            public static byte[] A1Y(byte[] bArr, byte[] bArr2, int i) {
                return A1Z(bArr, new byte[32], bArr2, i);
            }

            public static byte[] A1Z(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
                try {
                    Mac mac = Mac.getInstance("HmacSHA256");
                    mac.init(new SecretKeySpec(bArr2, "HmacSHA256"));
                    byte[] doFinal = mac.doFinal(bArr);
                    try {
                        int ceil = (int) Math.ceil(i / 32.0d);
                        byte[] bArr4 = new byte[0];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        for (int i2 = 1; i2 < ceil + 1; i2++) {
                            Mac mac2 = Mac.getInstance("HmacSHA256");
                            mac2.init(new SecretKeySpec(doFinal, "HmacSHA256"));
                            mac2.update(bArr4);
                            if (bArr3 != null) {
                                mac2.update(bArr3);
                            }
                            mac2.update((byte) i2);
                            bArr4 = mac2.doFinal();
                            int min = Math.min(i, bArr4.length);
                            byteArrayOutputStream.write(bArr4, 0, min);
                            i -= min;
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                        throw new AssertionError(e);
                    }
                } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
