package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.security.keystore.KeyGenParameterSpec;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.facebook.minscript.compiler.MinsCompilerImpl$Helper;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.apache.http.HttpEntity;

/* renamed from: X.088 */
/* loaded from: classes.dex */
public class AnonymousClass088 {
    public static InterfaceC230715c A00;
    public static InterfaceC019509b A01;
    public static ICameraUpdateFactoryDelegate A02;
    public static Boolean A03;
    public static Boolean A04;
    public static Boolean A05;
    public static Method A06;
    public static boolean A07;

    public static boolean A1t(int i) {
        return i == 0 || !((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0);
    }

    public static byte A00(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    public static int A01(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < i) ? size : i;
    }

    public static int A02(Context context, float f) {
        return Math.round((f * context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static int A03(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static int A04(C017708g c017708g, boolean z) {
        int i;
        int i2;
        if (z) {
            i = c017708g.A00;
            i2 = c017708g.A01;
        } else {
            i = c017708g.A01;
            i2 = c017708g.A00;
        }
        byte[][] bArr = c017708g.A02;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    b = b2;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 = (i5 - 5) + 3 + i3;
            }
        }
        return i3;
    }

    public static int A05(AnonymousClass081 anonymousClass081, AnonymousClass087 anonymousClass087) {
        AnonymousClass081 anonymousClass0812 = (AnonymousClass081) anonymousClass081.ABT(C017808h.A02);
        if (anonymousClass0812 != null && !A1z(anonymousClass0812)) {
            return A06(anonymousClass0812, anonymousClass087);
        }
        try {
            String ADJ = anonymousClass081.ADJ(C017808h.A01);
            if (ADJ == null) {
                return 0;
            }
            return C08i.A04(ADJ);
        } catch (C018208m unused) {
            A1i("ColorDrawableUtils", "Error parsing border color in BoxDecoration");
            return 0;
        }
    }

    public static int A06(AnonymousClass081 anonymousClass081, AnonymousClass087 anonymousClass087) {
        try {
            if (anonymousClass087.A03) {
                String ADJ = anonymousClass081.ADJ(C017908j.A00);
                if (ADJ == null) {
                    return 0;
                }
                return C08i.A04(ADJ);
            }
            String ADJ2 = anonymousClass081.ADJ(C017908j.A01);
            if (ADJ2 == null) {
                return 0;
            }
            return C08i.A04(ADJ2);
        } catch (C018208m unused) {
            A1i("ThemedColorUtils", "Error parsing themed color");
            return 0;
        }
    }

    public static int A07(AnonymousClass081 anonymousClass081, AnonymousClass087 anonymousClass087) {
        int i;
        AnonymousClass084 anonymousClass084 = C017808h.A06;
        AnonymousClass081 anonymousClass0812 = (AnonymousClass081) anonymousClass081.ABT(anonymousClass084);
        String ADJ = anonymousClass081.ADJ(anonymousClass084);
        if (ADJ != null) {
            i = C08i.A04(ADJ);
        } else {
            i = 0;
        }
        return (anonymousClass0812 == null || A1z(anonymousClass0812)) ? i : A06(anonymousClass0812, anonymousClass087);
    }

    public static int A08(C016807u c016807u) {
        String str = (String) c016807u.A00.A00(C018008k.A03);
        if (str == null || str.equals("column")) {
            return 1;
        }
        if (str.equals("row")) {
            return 0;
        }
        throw new IllegalArgumentException(C000200d.A0H("Unknown direction: ", str));
    }

    public static int A09(C018108l c018108l) {
        if (c018108l != null) {
            if (c018108l.A01()) {
                return 3;
            }
            return c018108l.A02() ? 2 : 1;
        }
        return 1;
    }

    public static int A0A(String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || str.codePointCount(0, length) != 1) {
            return -1;
        }
        return str.codePointAt(0);
    }

    public static int A0B(String str, C40051rV c40051rV, AnonymousClass034 anonymousClass034, C02F c02f) {
        File file = new File(str);
        if (file.exists()) {
            if (c40051rV == null) {
                return 2;
            }
            if (file.length() != c40051rV.A00) {
                return 4;
            }
            String A08 = C40061rW.A08(anonymousClass034, c02f, file);
            if (A08 != null) {
                return A08.equals(c40051rV.A02) ? 3 : 4;
            }
            StringBuilder sb = new StringBuilder("gdrive/v2/utils/is-local-sameas-remote/md5-is-null/ ");
            sb.append(file);
            Log.i(sb.toString());
            return 1;
        }
        return 1;
    }

    public static int A0C(String str, boolean z) {
        int A0A;
        if (!z || (A0A = A0A(str)) < 32) {
            return -1;
        }
        return A0A;
    }

    public static int A0D(List list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Object obj : list) {
            String obj2 = obj.toString();
            switch (obj2.hashCode()) {
                case -1699597560:
                    if (!obj2.equals("bottom_right")) {
                        StringBuilder sb = new StringBuilder("can't parse corner: ");
                        sb.append(obj);
                        throw new C018208m(sb.toString());
                    }
                    i |= 4;
                    break;
                case -966253391:
                    if (!obj2.equals("top_left")) {
                        StringBuilder sb2 = new StringBuilder("can't parse corner: ");
                        sb2.append(obj);
                        throw new C018208m(sb2.toString());
                    }
                    i |= 1;
                    break;
                case -609197669:
                    if (!obj2.equals("bottom_left")) {
                        StringBuilder sb22 = new StringBuilder("can't parse corner: ");
                        sb22.append(obj);
                        throw new C018208m(sb22.toString());
                    }
                    i |= 8;
                    break;
                case 116576946:
                    if (!obj2.equals("top_right")) {
                        StringBuilder sb222 = new StringBuilder("can't parse corner: ");
                        sb222.append(obj);
                        throw new C018208m(sb222.toString());
                    }
                    i |= 2;
                    break;
                default:
                    StringBuilder sb2222 = new StringBuilder("can't parse corner: ");
                    sb2222.append(obj);
                    throw new C018208m(sb2222.toString());
            }
        }
        return i;
    }

    public static int A0E(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC017207y interfaceC017207y = (InterfaceC017207y) list.get(i);
            if (interfaceC017207y.getId() != null && interfaceC017207y.getId().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static Dialog A0F(final Activity activity, C018308n c018308n, C40071rX c40071rX, C000500h c000500h, final int i) {
        return A0H(activity, c018308n, c40071rX, c000500h, new InterfaceC018408p() { // from class: X.1bd
            @Override // X.InterfaceC018408p
            public final void ANm() {
                C002701i.A18(activity, i);
            }
        });
    }

    public static Dialog A0G(final Activity activity, C018508q c018508q, AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C018608r c018608r, C05W c05w, C018708s c018708s, C002301c c002301c, C018808t c018808t, C000500h c000500h, Set set, AbstractC005302j abstractC005302j, final int i, InterfaceC018908u interfaceC018908u) {
        return A0I(activity, c018508q, anonymousClass012, interfaceC002901k, c40081rY, c018608r, c002301c, c018808t, c000500h, set, new InterfaceC019108w() { // from class: X.08v
            @Override // X.InterfaceC019108w
            public void ANm() {
                C002701i.A18(activity, i);
            }

            @Override // X.InterfaceC019108w
            public void AOg() {
                C002701i.A19(activity, 19);
            }
        }, true, interfaceC018908u, A0u(activity, set, c05w, c018708s, abstractC005302j));
    }

    public static Dialog A0H(final Context context, final C018308n c018308n, final C40071rX c40071rX, final C000500h c000500h, final InterfaceC018408p interfaceC018408p) {
        C019208x c019208x = new C019208x(context);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.15K
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                InterfaceC018408p interfaceC018408p2 = interfaceC018408p;
                C000500h c000500h2 = c000500h;
                interfaceC018408p2.ANm();
                C000200d.A0j(c000500h2, "pref_revoke_nux", false);
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: X.15I
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AnonymousClass088.A1a(interfaceC018408p, c000500h, c40071rX, c018308n, context);
            }
        };
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.15G
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                InterfaceC018408p interfaceC018408p2 = interfaceC018408p;
                C000500h c000500h2 = c000500h;
                interfaceC018408p2.ANm();
                C000200d.A0j(c000500h2, "pref_revoke_nux", false);
            }
        };
        c019208x.A02(R.string.revoke_nux);
        c019208x.A06(R.string.ok, onClickListener);
        c019208x.A05(R.string.learn_more, onClickListener2);
        C019308y c019308y = c019208x.A01;
        c019308y.A0J = true;
        c019308y.A02 = onCancelListener;
        return c019208x.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00be, code lost:
        if (r28.A00.getBoolean("pref_revoke_nux", true) == false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.Dialog A0I(android.content.Context r20, final X.C018508q r21, X.AnonymousClass012 r22, final X.InterfaceC002901k r23, X.C40081rY r24, final X.C018608r r25, final X.C002301c r26, X.C018808t r27, final X.C000500h r28, final java.util.Set r29, final X.InterfaceC019108w r30, boolean r31, final X.InterfaceC018908u r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass088.A0I(android.content.Context, X.08q, X.012, X.01k, X.1rY, X.08r, X.01c, X.08t, X.00h, java.util.Set, X.08w, boolean, X.08u, java.lang.String):android.app.Dialog");
    }

    public static Dialog A0J(C002301c c002301c, final Activity activity, C09I c09i, C005002g c005002g, C018308n c018308n) {
        C09J c09j = new C09J(activity, c002301c, activity, c005002g, c018308n, c09i);
        c09j.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.15L
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                activity.finish();
            }
        });
        return c09j;
    }

    public static Intent A0K(C40071rX c40071rX) {
        return new Intent("android.intent.action.VIEW", c40071rX.A03("general", "30035737", null));
    }

    public static ColorStateList A0L(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A002;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A002 = C09L.A00(context, resourceId)) == null) ? typedArray.getColorStateList(i) : A002;
    }

    public static Point A0M(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager == null) {
            return point;
        }
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    public static PorterDuff.Mode A0N(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static Drawable A0O(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable A012;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A012 = C09L.A01(context, resourceId)) == null) ? typedArray.getDrawable(i) : A012;
    }

    public static Spannable A0P(List list, AnonymousClass087 anonymousClass087, AbstractC016907v abstractC016907v) {
        Context context = C09M.A00().A01;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass081 anonymousClass081 = (AnonymousClass081) it.next();
                int length = spannableStringBuilder.length();
                AnonymousClass080 anonymousClass080 = (AnonymousClass080) anonymousClass081.ABT(C09N.A05);
                String str = "";
                if (anonymousClass080 != null) {
                    C09M.A00();
                    CharSequence A002 = C09O.A00(anonymousClass080);
                    if (A002 != null) {
                        str = A002;
                    }
                } else {
                    str = anonymousClass081.ADK(C09N.A03, "");
                }
                spannableStringBuilder.append((CharSequence) str);
                int length2 = spannableStringBuilder.length();
                AnonymousClass081 anonymousClass0812 = (AnonymousClass081) anonymousClass081.ABT(C09N.A08);
                Integer num = null;
                if (anonymousClass0812 != null) {
                    num = Integer.valueOf(A06(anonymousClass0812, anonymousClass087));
                } else {
                    String ADJ = anonymousClass081.ADJ(C09N.A04);
                    if (ADJ != null) {
                        try {
                            num = Integer.valueOf(C08i.A04(ADJ));
                        } catch (C018208m unused) {
                            A1i("TextNodeUtils", "Error parsing TextSpan color");
                        }
                    }
                }
                if (num != null) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), length, length2, 0);
                }
                String ADJ2 = anonymousClass081.ADJ(C09N.A06);
                if (ADJ2 != null) {
                    try {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, C08i.A02(ADJ2), context.getResources().getDisplayMetrics())), length, length2, 0);
                    } catch (C018208m unused2) {
                        A1i("TextNodeUtils", "Error parsing TextSpan size");
                    }
                }
                String ADJ3 = anonymousClass081.ADJ(C09N.A07);
                if (ADJ3 != null) {
                    try {
                        spannableStringBuilder.setSpan(new StyleSpan(C08i.A07(ADJ3)), length, length2, 0);
                    } catch (C018208m unused3) {
                        A1i("TextNodeUtils", "Error parsing TextSpan textStyle");
                    }
                }
                C09P AA3 = anonymousClass081.AA3(C09N.A01);
                if (AA3 != null) {
                    spannableStringBuilder.setSpan(new ClickableSpan(AA3, abstractC016907v, anonymousClass087) { // from class: X.09Q
                        public final AnonymousClass087 A00;
                        public final AbstractC016907v A01;
                        public final C09P A02;

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                        }

                        {
                            this.A02 = AA3;
                            this.A01 = abstractC016907v;
                            this.A00 = anonymousClass087;
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view) {
                            ArrayList arrayList = new ArrayList();
                            AbstractC016907v abstractC016907v2 = this.A01;
                            InterfaceC020509l A0f = AnonymousClass088.A0f(abstractC016907v2);
                            if (arrayList.size() == 0) {
                                arrayList.add(A0f);
                                C25031Du.A00(abstractC016907v2.A8w(), this.A02, new C021109r(arrayList), this.A00);
                                return;
                            }
                            throw new IllegalArgumentException("arguments have to be continuous");
                        }
                    }, length, length2, 0);
                }
                if (anonymousClass081.A8Z(C09N.A02, false)) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), length, length2, 0);
                }
                String ADJ4 = anonymousClass081.ADJ(C09N.A00);
                if (ADJ4 != null) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(Typeface.create(ADJ4, 0)), length, length2, 0);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableString A0Q(BigDecimal bigDecimal, C09R c09r, C40091rZ c40091rZ, C002301c c002301c, Date date, Context context) {
        if (bigDecimal != null && c09r != null) {
            String A032 = c09r.A03(c002301c, bigDecimal, true);
            if (c40091rZ != null && c40091rZ.A00(date)) {
                SpannableString spannableString = new SpannableString(C000200d.A0I(A032, "  ", c09r.A03(c002301c, c40091rZ.A00, true)));
                spannableString.setSpan(new StrikethroughSpan(), 0, A032.length(), 33);
                return spannableString;
            }
            return new SpannableString(A032);
        }
        return new SpannableString(context.getString(R.string.ask_for_price));
    }

    public static C09S A0R() {
        Log.i("FingerprintHelper-helper/get-crypto-object");
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            signature.initSign((PrivateKey) keyStore.getKey("payment_bio_key_alias", null));
            return new C09S(signature);
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            StringBuilder A0P = C000200d.A0P("FingerprintHelper/getCryptoObject: api=");
            A0P.append(Build.VERSION.SDK_INT);
            A0P.append(" error: ");
            A0P.append(e.toString());
            Log.e(A0P.toString());
            return null;
        }
    }

    public static C09T A0S(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return C09T.STRETCH;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    return C09T.BASELINE;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    return C09T.CENTER;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    return C09T.SPACE_AROUND;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    return C09T.AUTO;
                }
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    return C09T.FLEX_START;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    return C09T.SPACE_BETWEEN;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    return C09T.FLEX_END;
                }
                break;
        }
        throw new C018208m(C000200d.A0H("unknown flex align ", str));
    }

    public static C09X A0T(CameraPosition cameraPosition) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A02;
            C07K.A1Q(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            return new C09X(iCameraUpdateFactoryDelegate.AGe(cameraPosition));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public static C09X A0U(LatLng latLng) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A02;
            C07K.A1Q(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            return new C09X(iCameraUpdateFactoryDelegate.AGg(latLng));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public static C09X A0V(LatLng latLng, float f) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A02;
            C07K.A1Q(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            return new C09X(iCameraUpdateFactoryDelegate.AGi(latLng, f));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public static C09X A0W(LatLngBounds latLngBounds, int i) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A02;
            C07K.A1Q(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            return new C09X(iCameraUpdateFactoryDelegate.AGh(latLngBounds, i));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public static C019609c A0X(Bitmap bitmap) {
        try {
            InterfaceC019509b interfaceC019509b = A01;
            C07K.A1Q(interfaceC019509b, "IBitmapDescriptorFactory is not initialized");
            return new C019609c(interfaceC019509b.AWg(bitmap));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public static C017408c A0Y(String str, String str2) {
        C019709d c019709d = new C019709d(str, str2);
        Class[] clsArr = new Class[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        C07K.A1Q(AbstractC019809e.class, "Null interface");
        hashSet.add(AbstractC019809e.class);
        for (int i = 0; i < 0; i++) {
            C07K.A1Q(clsArr[i], "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        C08f c08f = new C08f(c019709d) { // from class: X.09f
            public final Object A00;

            {
                this.A00 = c019709d;
            }

            @Override // X.C08f
            public Object A6i(AbstractC02210Ah abstractC02210Ah) {
                return this.A00;
            }
        };
        C07K.A1Q(c08f, "Null factory");
        C07K.A1c(true, "Missing required property: factory.");
        return new C017408c(new HashSet(hashSet), new HashSet(hashSet2), 0, 1, c08f, hashSet3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.07w] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v5, types: [X.082] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.081] */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.081] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.09g] */
    public static InterfaceC017007w A0Z(InterfaceC017007w interfaceC017007w, InterfaceC020009g interfaceC020009g) {
        InterfaceC017007w A5R = interfaceC020009g.A5R(interfaceC017007w);
        ?? r7 = A5R;
        if (interfaceC017007w instanceof AbstractC016907v) {
            AbstractC016907v abstractC016907v = (AbstractC016907v) interfaceC017007w;
            List list = abstractC016907v.A07;
            int i = 0;
            InterfaceC017007w interfaceC017007w2 = A5R;
            while (i < list.size()) {
                AnonymousClass080 anonymousClass080 = (AnonymousClass080) list.get(i);
                if (anonymousClass080 instanceof InterfaceC017007w) {
                    InterfaceC017007w A0Z = A0Z((InterfaceC017007w) anonymousClass080, interfaceC020009g);
                    interfaceC017007w2 = interfaceC017007w2;
                    if (A0Z != anonymousClass080) {
                        if (interfaceC017007w2 == interfaceC017007w) {
                            interfaceC017007w2 = interfaceC017007w.AGB();
                        }
                        ((AbstractC016907v) interfaceC017007w2).A07.set(i, A0Z);
                    }
                }
                i++;
                interfaceC017007w2 = interfaceC017007w2;
            }
            AnonymousClass080 anonymousClass0802 = abstractC016907v.A02;
            r7 = interfaceC017007w2;
            if (anonymousClass0802 instanceof InterfaceC017007w) {
                AnonymousClass080 anonymousClass0803 = (AnonymousClass080) A0Z((InterfaceC017007w) anonymousClass0802, interfaceC020009g);
                InterfaceC017007w interfaceC017007w3 = interfaceC017007w2;
                r7 = interfaceC017007w2;
                if (anonymousClass0802 != anonymousClass0803) {
                    if (interfaceC017007w2 == interfaceC017007w) {
                        interfaceC017007w3 = interfaceC017007w.AGB();
                    }
                    ((AbstractC016907v) interfaceC017007w3).A02 = anonymousClass0803;
                    r7 = interfaceC017007w3;
                }
            }
        }
        if (r7 instanceof AnonymousClass081) {
            AnonymousClass081 anonymousClass081 = (AnonymousClass081) r7;
            if (C09M.A00().A03 != null) {
                AnonymousClass084[] A012 = C893746t.A01(anonymousClass081.ADL());
                int i2 = 0;
                AnonymousClass081 anonymousClass0812 = anonymousClass081;
                while (i2 < A012.length) {
                    AnonymousClass080 anonymousClass0804 = (AnonymousClass080) anonymousClass0812.ADg(A012[i2]);
                    if (anonymousClass0804 != null && (anonymousClass0804 instanceof InterfaceC017007w)) {
                        InterfaceC017007w A0Z2 = A0Z((InterfaceC017007w) anonymousClass0804, interfaceC020009g);
                        anonymousClass0812 = anonymousClass0812;
                        if (A0Z2 != anonymousClass0804) {
                            if (anonymousClass0812 == interfaceC017007w) {
                                anonymousClass0812 = (AnonymousClass081) interfaceC017007w.AGB();
                            }
                            AnonymousClass084 anonymousClass084 = A012[i2];
                            anonymousClass0812.AQy(anonymousClass084.A01, anonymousClass084.A00, A0Z2);
                        }
                    }
                    i2++;
                    anonymousClass0812 = anonymousClass0812;
                }
                if (C09M.A00().A03 != null) {
                    AnonymousClass084[] A002 = C893746t.A00(anonymousClass0812.ADL());
                    int i3 = 0;
                    r7 = anonymousClass0812;
                    while (i3 < A002.length) {
                        List AAv = r7.AAv(A002[i3]);
                        List list2 = AAv;
                        for (int i4 = 0; i4 < AAv.size(); i4++) {
                            AnonymousClass080 anonymousClass0805 = (AnonymousClass080) AAv.get(i4);
                            if (anonymousClass0805 instanceof InterfaceC017007w) {
                                InterfaceC017007w A0Z3 = A0Z((InterfaceC017007w) anonymousClass0805, interfaceC020009g);
                                if (A0Z3 != anonymousClass0805) {
                                    if (list2 == AAv) {
                                        list2 = new ArrayList(AAv);
                                    }
                                    list2.set(i4, A0Z3);
                                }
                            }
                        }
                        if (list2 != AAv) {
                            if (r7 == interfaceC017007w) {
                                r7 = (AnonymousClass081) interfaceC017007w.AGB();
                            }
                            AnonymousClass084 anonymousClass0842 = A002[i3];
                            r7.AQy(anonymousClass0842.A01, anonymousClass0842.A00, list2);
                        }
                        i3++;
                        r7 = r7;
                    }
                } else {
                    throw new IllegalStateException("No child attribute mapper configured. Unexpectedly attempting to traverse children nodes.");
                }
            } else {
                throw new IllegalStateException("No child attribute mapper configured. Unexpectedly attempting to traverse children nodes.");
            }
        }
        interfaceC020009g.AQA(r7);
        return r7;
    }

    public static C020209i A0a(AnonymousClass087 anonymousClass087) {
        return (C020209i) anonymousClass087.A00(R.id.bk_context_key_tree);
    }

    public static C09P A0b(InterfaceC020309j interfaceC020309j) {
        if (interfaceC020309j instanceof C020409k) {
            InterfaceC020509l interfaceC020509l = ((C020409k) interfaceC020309j).A00;
            if (interfaceC020509l instanceof C020609m) {
                return ((C020609m) interfaceC020509l).A00;
            }
        }
        String AVG = interfaceC020309j.AVG();
        if (AVG != null) {
            return new C020709n(AVG, null);
        }
        throw null;
    }

    public static AbstractC021009q A0c(int i) {
        return new C020909p(i);
    }

    public static InterfaceC020509l A0d(C09P c09p, C021109r c021109r, C021209s c021209s) {
        C0A4 c0a4;
        ByteBuffer doCompile;
        if (c09p instanceof C020709n) {
            C020709n c020709n = (C020709n) c09p;
            C021209s c021209s2 = new C021209s(c021209s.A00, c021209s.A01, new InterfaceC021309t(c021209s.A02) { // from class: X.09u
                public final InterfaceC021309t A00;

                {
                    this.A00 = r1;
                }

                @Override // X.InterfaceC021309t
                public InterfaceC020509l A7h(C33971gl c33971gl, C021109r c021109r2, C021209s c021209s3) {
                    String str = c33971gl.A00;
                    switch (str.hashCode()) {
                        case -1882328740:
                            if (str.equals("bk.action.f32.Sqrt")) {
                                return new C020909p(Math.sqrt(((Number) c021109r2.A00(0)).doubleValue()));
                            }
                            break;
                        case 975567453:
                            if (str.equals("bk.action.string.ValueOfNumberInBase")) {
                                long longValue = ((Number) c021109r2.A00(0)).longValue();
                                long intValue = ((Number) c021109r2.A00(1)).intValue();
                                if (intValue >= 2 && intValue <= 36) {
                                    return AnonymousClass088.A0f(Long.toString(longValue, (int) intValue));
                                }
                                throw new IllegalArgumentException("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                            }
                            break;
                        case 1377663097:
                            if (str.equals("bk.action.map.Keys")) {
                                return AnonymousClass088.A0f(new ArrayList(((Map) AnonymousClass088.A0q(c021109r2.A00(0))).keySet()));
                            }
                            break;
                        case 1395153511:
                            if (str.equals("bk.action.map.Values")) {
                                return AnonymousClass088.A0f(new ArrayList(((Map) AnonymousClass088.A0q(c021109r2.A00(0))).values()));
                            }
                            break;
                        case 1740388232:
                            if (str.equals("bk.action.f32.Log")) {
                                return new C020909p(Math.log(((Number) c021109r2.A00(0)).doubleValue()));
                            }
                            break;
                        case 1740392092:
                            if (str.equals("bk.action.f32.Pow")) {
                                return new C020909p(Math.pow(((Number) c021109r2.A00(0)).doubleValue(), ((Number) c021109r2.A00(1)).doubleValue()));
                            }
                            break;
                    }
                    InterfaceC021309t interfaceC021309t = this.A00;
                    if (interfaceC021309t != null) {
                        return interfaceC021309t.A7h(c33971gl, c021109r2, c021209s3);
                    }
                    StringBuilder A0P = C000200d.A0P("unknown function ");
                    A0P.append(str);
                    throw new IllegalStateException(A0P.toString());
                }
            });
            C09v c09v = c021209s2.A01;
            if (c020709n != null) {
                C09w c09w = c09v.A00;
                boolean z = true;
                if (c09w != null) {
                    if (c09w != null) {
                        Runnable runnable = new Runnable() { // from class: X.09x
                            @Override // java.lang.Runnable
                            public void run() {
                            }
                        };
                        C020809o c020809o = c020709n.A00;
                        if (c020809o == null) {
                            String str = c020709n.A01;
                            if (str.startsWith("kpaRj")) {
                                doCompile = ByteBuffer.wrap(Base64.decode(str, 0));
                            } else {
                                runnable.run();
                                doCompile = MinsCompilerImpl$Helper.doCompile(str);
                            }
                            doCompile.order(ByteOrder.nativeOrder());
                            ByteBuffer slice = doCompile.slice();
                            slice.order(doCompile.order());
                            int capacity = doCompile.capacity();
                            slice.getInt();
                            slice.getShort();
                            slice.getShort();
                            int i = slice.getInt();
                            int i2 = slice.getInt();
                            int position = doCompile.position();
                            if (i > capacity) {
                                StringBuilder A0R = C000200d.A0R("buffer is smaller than encoded size ", i, " ", capacity, " byteBuffer.order:");
                                A0R.append(doCompile.order());
                                A0R.append(" native order:");
                                A0R.append(ByteOrder.nativeOrder());
                                throw new C0A0(A0R.toString());
                            } else if (i >= position) {
                                int i3 = (i2 << 4) + position;
                                if (i3 <= i) {
                                    C021509y[] c021509yArr = new C021509y[i2];
                                    for (int i4 = 0; i4 < i2; i4++) {
                                        C021509y c021509y = new C021509y();
                                        c021509y.A00 = slice.getInt();
                                        c021509y.A02 = slice.getInt();
                                        c021509y.A01 = slice.getInt();
                                        slice.getInt();
                                        int i5 = c021509y.A02;
                                        if (i5 % 4 != 0) {
                                            throw new C0A0(String.format("section index %d kind %d invalid alignment", Integer.valueOf(i4), Integer.valueOf(c021509y.A00)));
                                        }
                                        int i6 = c021509y.A01;
                                        if (i3 <= i5 && i5 + i6 <= i) {
                                            c021509yArr[i4] = c021509y;
                                        } else {
                                            throw new C0A0(String.format("section index %d kind %d invalid offset/size", Integer.valueOf(i4), Integer.valueOf(c021509y.A00)));
                                        }
                                    }
                                    if (i2 >= 4) {
                                        int i7 = 0;
                                        while (c021509yArr[i7].A00 == i7) {
                                            i7++;
                                            if (i7 >= 4) {
                                                c020809o = new C020809o(new C0A1(slice, c021509yArr, new AtomicReferenceArray(c021509yArr[0].A01 >> 4), new AtomicReferenceArray(c021509yArr[1].A01 >> 4)).A01(0), null);
                                                c020709n.A00 = c020809o;
                                            }
                                        }
                                        throw new C0A0(C000200d.A0D("missing required section ", i7));
                                    }
                                    throw new C0A0("less than required number of sections");
                                }
                                throw new C0A0("encoded size not enough for section headers");
                            } else {
                                throw new C0A0("encoded size is too small");
                            }
                        }
                        if (c09v.A00 != null) {
                            if (c020809o == null) {
                                throw new IllegalStateException("The Lispy expression has not been parsed");
                            }
                            List<Object> unmodifiableList = Collections.unmodifiableList(c021109r.A00);
                            if (C0A3.A00.get() == null) {
                                c0a4 = new C0A4();
                                C0A3.A00.set(c0a4);
                            } else {
                                c0a4 = (C0A4) C0A3.A00.get();
                                z = false;
                            }
                            try {
                                C0A5 c0a5 = new C0A5(c021209s2);
                                int i8 = c0a4.A01;
                                c0a4.A0F(unmodifiableList.size() + 1 + 5);
                                InterfaceC020509l interfaceC020509l = C0A6.A00;
                                Object[] objArr = c0a4.A04;
                                int i9 = c0a4.A01;
                                objArr[i9] = interfaceC020509l;
                                c0a4.A01 = i9 + 1;
                                for (Object obj : unmodifiableList) {
                                    c0a4.A0H(obj);
                                }
                                c0a4.A0I(new C020609m(new C020709n(null, c020809o)), unmodifiableList.size(), interfaceC020509l, 0);
                                C0A5 c0a52 = c0a4.A02;
                                c0a4.A02 = c0a5;
                                c0a4.A0C();
                                c0a4.A02 = c0a52;
                                Object A09 = c0a4.A09(0);
                                c0a4.A0D();
                                int i10 = c0a4.A01;
                                if (i10 == i8) {
                                    return (InterfaceC020509l) A09;
                                }
                                throw new C0A0(C000200d.A0H("InvalidBytecode: ", String.format("Execution ended prematurely: stack size = %d, initial stack size = %d", Integer.valueOf(i10), Integer.valueOf(i8))));
                            } finally {
                                if (z) {
                                    C0A3.A00.remove();
                                }
                            }
                        } else if (c020809o == null) {
                            throw new IllegalStateException("The Lispy expression has not been parsed");
                        } else {
                            throw new IllegalStateException("The Lispy expression was parsed with the wrong environment");
                        }
                    }
                    throw new IllegalStateException("MinScript is not enabled");
                }
                throw new IllegalStateException("Legacy is not enabled");
            }
            throw new RuntimeException("ensureParsed expects OpaqueExpression");
        }
        throw new RuntimeException("Interpreter.evaluate expects OpaqueExpression");
    }

    public static InterfaceC020509l A0e(Object obj) {
        if (obj == null) {
            return C0A6.A00;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Long) {
                return new C0A7(number.longValue());
            }
            return new C020909p(number.doubleValue());
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                arrayList.add(A0e(obj2));
            }
            return A0f(arrayList);
        } else if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                hashMap.put(A0e(entry.getKey()), A0e(entry.getValue()));
            }
            return A0f(hashMap);
        } else if (!(obj instanceof C0A8)) {
            return A0f(obj);
        } else {
            throw new IllegalArgumentException("object should not be wrapped multiple times");
        }
    }

    public static InterfaceC020509l A0f(Object obj) {
        if (obj == null) {
            return C0A6.A00;
        }
        if (!(obj instanceof C0A8)) {
            return new C0A8(obj);
        }
        throw new IllegalStateException("object should not be wrapped multiple times");
    }

    public static C020809o A0g(Object obj) {
        C020809o c020809o = ((C020609m) obj).A00.A00;
        if (c020809o == null) {
            throw new IllegalStateException("The Lispy expression has not been parsed");
        }
        return c020809o;
    }

    public static InteractiveAnnotation A0h(ImageView imageView, AnonymousClass097 anonymousClass097, float f, float f2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        imageView.getImageMatrix().invert(matrix);
        float[] fArr = {f - imageView.getLeft(), f2 - imageView.getTop()};
        float[] fArr2 = {drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()};
        matrix.mapPoints(fArr);
        return A0i(anonymousClass097, fArr, fArr2);
    }

    public static InteractiveAnnotation A0i(AnonymousClass097 anonymousClass097, float[] fArr, float[] fArr2) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        C09H c09h = anonymousClass097.A02;
        if (c09h == null || (interactiveAnnotationArr = c09h.A0V) == null || interactiveAnnotationArr.length <= 0) {
            return null;
        }
        PointF pointF = new PointF(fArr2[0], fArr2[1]);
        SerializablePoint serializablePoint = new SerializablePoint((int) fArr[0], (int) fArr[1]);
        SerializablePoint serializablePoint2 = new SerializablePoint(serializablePoint.x / pointF.x, serializablePoint.y / pointF.y);
        int i = 0;
        while (true) {
            InteractiveAnnotation[] interactiveAnnotationArr2 = c09h.A0V;
            if (i >= interactiveAnnotationArr2.length) {
                return null;
            }
            InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr2[i];
            SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
            if (serializablePointArr != null && interactiveAnnotation.serializableLocation != null) {
                int i2 = 0;
                boolean z = false;
                while (i2 < serializablePointArr.length) {
                    SerializablePoint serializablePoint3 = serializablePointArr[i2];
                    i2++;
                    SerializablePoint serializablePoint4 = serializablePointArr[i2 % serializablePointArr.length];
                    double d = serializablePoint3.x;
                    double d2 = serializablePoint2.x;
                    if ((d <= d2 && d2 < serializablePoint4.x) || (serializablePoint4.x <= d2 && d2 < serializablePoint3.x)) {
                        double d3 = serializablePoint2.y;
                        double d4 = serializablePoint4.y;
                        double d5 = serializablePoint3.y;
                        double d6 = serializablePoint3.x;
                        if (d3 < (((d2 - d6) * (d4 - d5)) / (serializablePoint4.x - d6)) + d5) {
                            z = !z;
                        }
                    }
                }
                if (z) {
                    return interactiveAnnotation;
                }
            }
            i++;
        }
    }

    public static C40171rh A0j(C40101ra c40101ra, String str, AbstractC40111rb abstractC40111rb, String str2) {
        try {
            return (C40171rh) C40161rg.A00(abstractC40111rb, new C40121rc(c40101ra, str), str2);
        } catch (C639331k unused) {
            return null;
        }
    }

    public static Boolean A0k(byte b) {
        if (b != 0) {
            if (b != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static Integer A0l(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1901805651) {
            if (hashCode != 3178655) {
                if (hashCode == 466743410 && str.equals("visible")) {
                    return 0;
                }
            } else if (str.equals("gone")) {
                return 8;
            }
        } else if (str.equals("invisible")) {
            return 4;
        }
        throw new C018208m(C000200d.A0H("unknown visibility ", str));
    }

    public static Object A0m(C0AC c0ac) {
        if (c0ac.A05()) {
            return c0ac.A04();
        }
        if (((C0AD) c0ac).A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c0ac.A03());
    }

    public static Object A0n(C0AC c0ac, long j, TimeUnit timeUnit) {
        boolean z;
        C07K.A1U("Must not be called on the main application thread");
        C07K.A1Q(c0ac, "Task must not be null");
        C07K.A1Q(timeUnit, "TimeUnit must not be null");
        C0AD c0ad = (C0AD) c0ac;
        synchronized (c0ad.A04) {
            z = c0ad.A02;
        }
        if (z) {
            return A0m(c0ac);
        }
        C0AE c0ae = new C0AE();
        Executor executor = C0AI.A01;
        c0ac.A02(executor, c0ae);
        c0ac.A01(executor, c0ae);
        c0ac.A00(executor, c0ae);
        if (c0ae.A00.await(j, timeUnit)) {
            return A0m(c0ac);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Object A0o(AnonymousClass087 anonymousClass087, AnonymousClass081 anonymousClass081) {
        Long valueOf;
        Object obj;
        Object obj2;
        Map map = (Map) anonymousClass087.A00(R.id.bk_context_key_controllers_for_models);
        Map map2 = (Map) anonymousClass087.A00(R.id.bk_context_key_create_controllers_locks);
        long A8w = anonymousClass081.A8w();
        synchronized (anonymousClass087) {
            valueOf = Long.valueOf(A8w);
            obj = map2.get(valueOf);
            if (obj == null) {
                obj = new Object();
                map2.put(valueOf, obj);
            }
        }
        C0AJ c0aj = C09M.A00().A07;
        synchronized (obj) {
            obj2 = map.get(valueOf);
            if (obj2 == null) {
                if (anonymousClass081 instanceof AbstractC016907v) {
                    obj2 = c0aj.A03(anonymousClass087, (C016807u) anonymousClass081);
                } else {
                    obj2 = C09M.A00().A06.A00(anonymousClass087, anonymousClass081);
                }
                if (obj2 != null) {
                    map.put(valueOf, obj2);
                }
            }
        }
        return obj2;
    }

    public static Object A0p(C0AL c0al) {
        C0AM c0am = C0AM.START_ARRAY;
        C0AM AQh = c0al.AQh();
        if (AQh == C0AM.START_OBJECT) {
            return A19(c0al);
        }
        if (AQh == c0am) {
            ArrayList arrayList = new ArrayList();
            if (AQh == c0am) {
                while (c0al.AGm() != C0AM.END_ARRAY) {
                    arrayList.add(A0p(c0al));
                }
            }
            return arrayList;
        } else if (AQh == C0AM.NULL) {
            return null;
        } else {
            if (AQh == C0AM.BOOLEAN) {
                return Boolean.valueOf(c0al.AQi().A5n());
            }
            if (AQh == C0AM.NUMBER) {
                Number AGq = c0al.AQi().AGq();
                if (AGq instanceof Long) {
                    return Long.valueOf(AGq.longValue());
                }
                return Double.valueOf(AGq.doubleValue());
            } else if (AQh == C0AM.STRING) {
                return c0al.AQi().AVG();
            } else {
                StringBuilder A0P = C000200d.A0P("unsupported token type ");
                A0P.append(AQh);
                throw new IllegalStateException(A0P.toString());
            }
        }
    }

    public static Object A0q(InterfaceC020509l interfaceC020509l) {
        if (interfaceC020509l == C0A6.A00) {
            return null;
        }
        return ((C0A8) interfaceC020509l).A00;
    }

    public static Object A0r(InterfaceC020509l interfaceC020509l) {
        if (interfaceC020509l == C0A6.A00) {
            return null;
        }
        return ((C0A8) interfaceC020509l).A00;
    }

    public static Object A0s(Object obj) {
        if (obj instanceof InterfaceC020509l) {
            if (obj == C0A6.A00) {
                return null;
            }
            if (obj instanceof AbstractC021009q) {
                return obj;
            }
            if (obj instanceof C0A8) {
                Object obj2 = ((C0A8) obj).A00;
                if (obj2 instanceof List) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj2) {
                        arrayList.add(A0s(obj3));
                    }
                    return arrayList;
                } else if (obj2 instanceof Map) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) obj2).entrySet()) {
                        hashMap.put(A0s(entry.getKey()), A0s(entry.getValue()));
                    }
                    return hashMap;
                } else {
                    return obj2;
                }
            }
            throw new IllegalArgumentException("Cannot unwrap this Value type");
        }
        return obj;
    }

    public static Object A0t(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static String A0u(Context context, Collection collection, C05W c05w, C018708s c018708s, AbstractC005302j abstractC005302j) {
        String A08;
        if (collection.isEmpty()) {
            return null;
        }
        C06C A0A = abstractC005302j != null ? c05w.A0A(abstractC005302j) : null;
        if (collection.size() == 1) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) collection.iterator().next();
            if (!anonymousClass092.A0n.A02 && A0A != null) {
                if (A0A.A0C()) {
                    AbstractC005302j A0A2 = anonymousClass092.A0A();
                    if (A0A2 != null) {
                        A08 = c018708s.A08(c05w.A0A(A0A2), false);
                    }
                    A08 = "";
                } else {
                    if (c018708s.A08(A0A, false) != null) {
                        A08 = c018708s.A08(A0A, false);
                    }
                    A08 = "";
                }
                return context.getString(R.string.delete_confirmation, A08);
            }
            return context.getString(R.string.delete_confirmation_self);
        }
        return context.getResources().getQuantityString(R.plurals.delete_confirmation_multiple, collection.size(), Integer.valueOf(collection.size()));
    }

    public static String A0v(PowerManager.WakeLock wakeLock) {
        String valueOf = String.valueOf(String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock)));
        String valueOf2 = String.valueOf(TextUtils.isEmpty(null) ? "" : null);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String A0w(C0AN c0an) {
        int A032 = c0an.A03();
        StringBuilder sb = new StringBuilder(A032);
        for (int i = 0; i < A032; i++) {
            byte A022 = c0an.A02(i);
            if (A022 == 34) {
                sb.append("\\\"");
            } else if (A022 == 39) {
                sb.append("\\'");
            } else if (A022 != 92) {
                switch (A022) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (A022 >= 32 && A022 <= 126) {
                            sb.append((char) A022);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((A022 >>> 6) & 3) + 48));
                            sb.append((char) (((A022 >>> 3) & 7) + 48));
                            sb.append((char) ((A022 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String A0x(InterfaceC020509l interfaceC020509l) {
        return interfaceC020509l instanceof AbstractC021009q ? interfaceC020509l.toString() : (String) A0r(interfaceC020509l);
    }

    public static String A0y(Object obj) {
        return (String) A0q((C0A8) obj);
    }

    public static String A0z(String str) {
        return (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) ? str : C000200d.A0H("https://", str);
    }

    public static final String A10(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static String A11(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append('/');
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    public static BigDecimal A12(BigDecimal bigDecimal, C40091rZ c40091rZ, Date date) {
        if (bigDecimal != null) {
            return (c40091rZ == null || !c40091rZ.A00(date)) ? bigDecimal : c40091rZ.A00;
        }
        return null;
    }

    public static PublicKey A13() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("payment_bio_key_alias", 4).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(true).build());
            return keyPairGenerator.generateKeyPair().getPublic();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            StringBuilder A0P = C000200d.A0P("FingerprintHelper/generateKey generateKey: api=");
            A0P.append(Build.VERSION.SDK_INT);
            throw new RuntimeException(A0P.toString(), e);
        }
    }

    public static ArrayList A14(InterfaceC020509l interfaceC020509l) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A0r(interfaceC020509l)).iterator();
        while (it.hasNext()) {
            arrayList.add(A0r((InterfaceC020509l) it.next()));
        }
        return arrayList;
    }

    public static Calendar A15(Calendar calendar, int i, int i2) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(7, i);
        calendar2.set(11, i2 / 60);
        calendar2.set(12, i2 % 60);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static List A16(C020209i c020209i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0AO c0ao = (C0AO) it.next();
            List list2 = c0ao.A01;
            if (c020209i != null) {
                C0AQ.A01("Tree operations are only supported from the UI Thread");
                c020209i.A0B.add(list2);
                arrayList.add(c0ao.A00);
            } else {
                throw null;
            }
        }
        return arrayList;
    }

    public static List A17(Object obj) {
        return (List) A0q((C0A8) obj);
    }

    public static List A18(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass080 anonymousClass080 = (AnonymousClass080) list.get(i);
            if (anonymousClass080 != null) {
                if (anonymousClass080 instanceof AnonymousClass081) {
                    AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
                    if (anonymousClass081.ADL() == 13346) {
                        List AAv = anonymousClass081.AAv(C0AR.A00);
                        for (int i2 = 0; i2 < AAv.size(); i2++) {
                            arrayList.add(AAv.get(i2));
                        }
                    }
                }
                arrayList.add(anonymousClass080);
            }
        }
        return arrayList;
    }

    public static Map A19(C0AL c0al) {
        if (c0al.AQh() == C0AM.START_OBJECT) {
            HashMap hashMap = new HashMap();
            while (c0al.AGm() != C0AM.END_OBJECT) {
                String AQg = c0al.AQg();
                c0al.AGm();
                hashMap.put(AQg, A0p(c0al));
            }
            return hashMap;
        }
        return null;
    }

    public static Map A1A(C40171rh c40171rh, AbstractC40111rb abstractC40111rb, boolean z) {
        HashMap hashMap = new HashMap((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        String str = null;
        do {
            Pair pair = (Pair) C40161rg.A00(abstractC40111rb, new C40181ri(c40171rh, str, z), "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            for (C40051rV c40051rV : (List) pair.first) {
                hashMap.put(c40051rV.A05, c40051rV);
            }
        } while (str != null);
        StringBuilder A0P = C000200d.A0P("gdrive/v2/load-files result ");
        A0P.append(hashMap.size());
        Log.i(A0P.toString());
        return Collections.unmodifiableMap(hashMap);
    }

    public static void A1B(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static void A1C(Context context, C02E c02e, CharSequence charSequence) {
        AccessibilityManager A0H = c02e.A0H();
        if (A0H == null || !A0H.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(16384);
        obtain.setClassName("android.widget.Button");
        obtain.setPackageName(context.getPackageName());
        obtain.getText().add(charSequence);
        A0H.sendAccessibilityEvent(obtain);
    }

    public static void A1D(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void A1E(Parcel parcel, int i, byte b) {
        A1H(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void A1F(Parcel parcel, int i, float f) {
        A1H(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void A1G(Parcel parcel, int i, int i2) {
        A1H(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void A1H(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | (-65536));
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    public static void A1I(Parcel parcel, int i, long j) {
        A1H(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void A1J(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int A032 = A03(parcel, i);
        parcel.writeBundle(bundle);
        A1D(parcel, A032);
    }

    public static void A1K(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int A032 = A03(parcel, i);
        parcel.writeStrongBinder(iBinder);
        A1D(parcel, A032);
    }

    public static void A1L(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                A1H(parcel, i, 0);
                return;
            }
            return;
        }
        int A032 = A03(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        A1D(parcel, A032);
    }

    public static void A1M(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                A1H(parcel, i, 0);
                return;
            }
            return;
        }
        int A032 = A03(parcel, i);
        parcel.writeString(str);
        A1D(parcel, A032);
    }

    public static void A1N(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int A032 = A03(parcel, i);
        parcel.writeStringList(list);
        A1D(parcel, A032);
    }

    public static void A1O(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                A1H(parcel, i, 0);
                return;
            }
            return;
        }
        int A032 = A03(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        A1D(parcel, A032);
    }

    public static void A1P(Parcel parcel, int i, boolean z) {
        A1H(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A1Q(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                A1H(parcel, i, 0);
                return;
            }
            return;
        }
        int A032 = A03(parcel, i);
        parcel.writeByteArray(bArr);
        A1D(parcel, A032);
    }

    public static void A1R(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int A032 = A03(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        A1D(parcel, A032);
    }

    public static void A1S(JsonWriter jsonWriter, Map map) {
        jsonWriter.beginObject();
        for (Map.Entry entry : map.entrySet()) {
            jsonWriter.name((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof Number) {
                jsonWriter.value((Number) value);
            } else if (value instanceof String) {
                jsonWriter.value((String) value);
            } else if (value instanceof Boolean) {
                jsonWriter.value(((Boolean) value).booleanValue());
            } else if (value instanceof Map) {
                A1S(jsonWriter, (Map) value);
            } else {
                StringBuilder sb = new StringBuilder("Unexpected value type ");
                sb.append(value);
                sb.append(" for ");
                sb.append((String) entry.getKey());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        jsonWriter.endObject();
    }

    public static void A1T(View view) {
        C0AT.A0c(view, new C0AS());
    }

    public static void A1U(View view) {
        C0AT.A0c(view, new C0AS() { // from class: X.0AU
            public final /* synthetic */ String A00 = "Button";

            @Override // X.C0AS
            public void A04(View view2, C08420bS c08420bS) {
                this.A01.onInitializeAccessibilityNodeInfo(view2, c08420bS.A02);
                c08420bS.A08(this.A00);
            }
        });
    }

    public static void A1V(View view, int i) {
        A1W(view, new C0AV(16, i));
    }

    public static void A1W(View view, final C0AV... c0avArr) {
        C0AT.A0c(view, new C0AS() { // from class: X.0AW
            @Override // X.C0AS
            public void A04(View view2, C08420bS c08420bS) {
                C0AV[] c0avArr2;
                this.A01.onInitializeAccessibilityNodeInfo(view2, c08420bS.A02);
                for (C0AV c0av : c0avArr) {
                    c08420bS.A06(new C08440bU(c0av.A00, view2.getContext().getString(c0av.A01)));
                }
            }
        });
    }

    public static void A1X(C07S c07s, Integer num) {
        C07Z c07z = C07Z.TEXT_START;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                c07z = C07Z.CENTER;
            } else if (intValue != 8388611 && intValue == 8388613) {
                c07z = C07Z.TEXT_END;
            }
            c07s.A0R = c07z;
        }
    }

    public static void A1Y(C0AX c0ax, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : c0ax.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String replaceFirst = ((String) it.next()).replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceFirst.substring(0, 1).toLowerCase());
                sb2.append(replaceFirst.substring(1, replaceFirst.length() - 4));
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("get");
                sb3.append(replaceFirst);
                Method method2 = (Method) hashMap.get(sb3.toString());
                if (method2 != null) {
                    A1k(sb, i, A10(obj), C0AZ.A06(method2, c0ax, new Object[0]));
                }
            }
            StringBuilder sb4 = new StringBuilder("set");
            sb4.append(replaceFirst);
            if (hashMap2.get(sb4.toString()) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    StringBuilder A0P = C000200d.A0P("get");
                    A0P.append(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (hashMap.containsKey(A0P.toString())) {
                    }
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(replaceFirst.substring(0, 1).toLowerCase());
                sb5.append(replaceFirst.substring(1));
                String obj2 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("get");
                sb6.append(replaceFirst);
                Method method3 = (Method) hashMap.get(sb6.toString());
                StringBuilder sb7 = new StringBuilder("has");
                sb7.append(replaceFirst);
                Method method4 = (Method) hashMap.get(sb7.toString());
                if (method3 != null) {
                    Object A062 = C0AZ.A06(method3, c0ax, new Object[0]);
                    if (method4 == null) {
                        if (A062 instanceof Boolean) {
                            z = !((Boolean) A062).booleanValue();
                        } else if (A062 instanceof Integer) {
                            if (((Number) A062).intValue() != 0) {
                                A1k(sb, i, A10(obj2), A062);
                            }
                        } else if (A062 instanceof Float) {
                            if (((Number) A062).floatValue() != 0.0f) {
                                A1k(sb, i, A10(obj2), A062);
                            }
                        } else if (A062 instanceof Double) {
                            if (((Number) A062).doubleValue() != 0.0d) {
                                A1k(sb, i, A10(obj2), A062);
                            }
                        } else if (A062 instanceof String) {
                            z = A062.equals("");
                        } else if (A062 instanceof C0AN) {
                            z = A062.equals(C0AN.A01);
                        } else if (A062 instanceof C0AX) {
                            if (A062 != ((C0AY) A062).A9k()) {
                                A1k(sb, i, A10(obj2), A062);
                            }
                        } else {
                            if ((A062 instanceof Enum) && ((Enum) A062).ordinal() == 0) {
                            }
                            A1k(sb, i, A10(obj2), A062);
                        }
                        if (!z) {
                            A1k(sb, i, A10(obj2), A062);
                        }
                    } else if (((Boolean) C0AZ.A06(method4, c0ax, new Object[0])).booleanValue()) {
                        A1k(sb, i, A10(obj2), A062);
                    }
                }
            }
        }
        C0Ab c0Ab = ((C0AZ) c0ax).unknownFields;
        if (c0Ab != null) {
            for (int i2 = 0; i2 < c0Ab.count; i2++) {
                A1k(sb, i, String.valueOf(c0Ab.A02[i2] >>> 3), c0Ab.A03[i2]);
            }
        }
    }

    public static void A1Z(final C018308n c018308n, final C40201rk c40201rk, final BusinessProfileFieldView businessProfileFieldView, int i) {
        final boolean z;
        String str;
        if (businessProfileFieldView.getTextView() == null) {
            return;
        }
        businessProfileFieldView.getTextView().setTextColor(C02160Ac.A00(businessProfileFieldView.getContext(), R.color.business_profile_link));
        if (i != 0) {
            if (i == 1) {
                String text = businessProfileFieldView.getText();
                if (TextUtils.isEmpty(text)) {
                    return;
                }
                StringBuilder sb = new StringBuilder("mailto:");
                sb.append(text);
                final Uri parse = Uri.parse(sb.toString());
                businessProfileFieldView.setOnClickListener(new View.OnClickListener() { // from class: X.15C
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AnonymousClass088.A1e(c40201rk, c018308n, businessProfileFieldView, parse);
                    }
                });
                return;
            } else if (i == 2) {
                String text2 = businessProfileFieldView.getText();
                if (!TextUtils.isEmpty(text2)) {
                    StringBuilder A0P = C000200d.A0P("geo:0,0?q=");
                    A0P.append(Uri.encode(text2));
                    final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(A0P.toString()));
                    businessProfileFieldView.setOnClickListener(new View.OnClickListener() { // from class: X.15N
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AnonymousClass088.A1d(c40201rk, c018308n, businessProfileFieldView, intent);
                        }
                    });
                    return;
                }
                return;
            } else {
                return;
            }
        }
        String text3 = businessProfileFieldView.getText();
        if (TextUtils.isEmpty(text3)) {
            return;
        }
        String A0z = A0z(text3);
        if (businessProfileFieldView.getText() != null && businessProfileFieldView.getTextView() != null && businessProfileFieldView.getSubTextView() != null) {
            boolean A2C = A2C(businessProfileFieldView.getText());
            Uri parse2 = Uri.parse(A0z(businessProfileFieldView.getText()));
            if (A2C && parse2 != null && parse2.getPathSegments().size() != 0) {
                int i2 = R.drawable.ic_business_instagram;
                if (!A2C) {
                    i2 = R.drawable.ic_business_link;
                }
                businessProfileFieldView.setIcon(i2);
                if (!A2C) {
                    if (!A2C) {
                        str = "";
                        businessProfileFieldView.setSubText(str);
                        int A002 = C02160Ac.A00(businessProfileFieldView.getContext(), R.color.body_gray);
                        int A003 = C02160Ac.A00(businessProfileFieldView.getContext(), R.color.list_item_info);
                        businessProfileFieldView.getTextView().setTextColor(A002);
                        businessProfileFieldView.getSubTextView().setTextColor(A003);
                        z = true;
                        StringBuilder A0P2 = C000200d.A0P("https://l.wl.co/l?u=");
                        A0P2.append(Uri.encode(A0z));
                        final Uri parse3 = Uri.parse(A0P2.toString());
                        businessProfileFieldView.setOnClickListener(new View.OnClickListener() { // from class: X.15E
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                AnonymousClass088.A1f(c40201rk, z, c018308n, businessProfileFieldView, parse3);
                            }
                        });
                    }
                } else {
                    businessProfileFieldView.setText(businessProfileFieldView.getContext().getString(R.string.business_details_subtitle_instagram), null);
                }
                str = parse2.getPathSegments().get(0);
                businessProfileFieldView.setSubText(str);
                int A0022 = C02160Ac.A00(businessProfileFieldView.getContext(), R.color.body_gray);
                int A0032 = C02160Ac.A00(businessProfileFieldView.getContext(), R.color.list_item_info);
                businessProfileFieldView.getTextView().setTextColor(A0022);
                businessProfileFieldView.getSubTextView().setTextColor(A0032);
                z = true;
                StringBuilder A0P22 = C000200d.A0P("https://l.wl.co/l?u=");
                A0P22.append(Uri.encode(A0z));
                final Uri parse32 = Uri.parse(A0P22.toString());
                businessProfileFieldView.setOnClickListener(new View.OnClickListener() { // from class: X.15E
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AnonymousClass088.A1f(c40201rk, z, c018308n, businessProfileFieldView, parse32);
                    }
                });
            }
        }
        z = false;
        StringBuilder A0P222 = C000200d.A0P("https://l.wl.co/l?u=");
        A0P222.append(Uri.encode(A0z));
        final Uri parse322 = Uri.parse(A0P222.toString());
        businessProfileFieldView.setOnClickListener(new View.OnClickListener() { // from class: X.15E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnonymousClass088.A1f(c40201rk, z, c018308n, businessProfileFieldView, parse322);
            }
        });
    }

    public static void A1a(InterfaceC018408p interfaceC018408p, C000500h c000500h, C40071rX c40071rX, C018308n c018308n, Context context) {
        interfaceC018408p.ANm();
        C000200d.A0j(c000500h, "pref_revoke_nux", false);
        Intent intent = new Intent("android.intent.action.VIEW", c40071rX.A03("android", "26000068", null));
        intent.addFlags(268435456);
        c018308n.A06(context, intent);
    }

    public static /* synthetic */ void A1b(C40231ro c40231ro) {
        ImageView A002 = c40231ro.A00();
        if (A002 != null) {
            A002.setBackgroundResource(R.color.light_gray);
            A002.setImageResource(R.drawable.product_broken_image);
            C02180Ae.A17(A002, C02160Ac.A00(A002.getContext(), R.color.black_alpha_20));
            A002.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    public static /* synthetic */ void A1c(C40231ro c40231ro, Bitmap bitmap) {
        ImageView A002 = c40231ro.A00();
        if (A002 != null) {
            A002.setBackgroundColor(0);
            A002.setImageBitmap(bitmap);
            A002.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public static /* synthetic */ void A1d(C40201rk c40201rk, C018308n c018308n, BusinessProfileFieldView businessProfileFieldView, Intent intent) {
        c40201rk.A00(3, null);
        c018308n.A06(businessProfileFieldView.getContext(), intent);
    }

    public static /* synthetic */ void A1e(C40201rk c40201rk, C018308n c018308n, BusinessProfileFieldView businessProfileFieldView, Uri uri) {
        c40201rk.A00(6, null);
        c018308n.A06(businessProfileFieldView.getContext(), new Intent("android.intent.action.VIEW", uri));
    }

    public static /* synthetic */ void A1f(C40201rk c40201rk, final boolean z, C018308n c018308n, BusinessProfileFieldView businessProfileFieldView, Uri uri) {
        c40201rk.A00(2, new InterfaceC40251rq() { // from class: X.1bf
            @Override // X.InterfaceC40251rq
            public final void AQ7(C37631mj c37631mj) {
                c37631mj.A01 = Integer.valueOf(z ? 2 : 1);
            }
        });
        c018308n.A06(businessProfileFieldView.getContext(), new Intent("android.intent.action.VIEW", uri));
    }

    public static void A1g(C02E c02e) {
        Vibrator vibrator = c02e.A0B;
        if (vibrator == null) {
            vibrator = (Vibrator) c02e.A0H.A00.getSystemService("vibrator");
            c02e.A0B = vibrator;
        }
        if (vibrator != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(30L, 48));
            } else {
                vibrator.vibrate(30L);
            }
        }
    }

    public static void A1h(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            bundle.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            android.util.Log.d("FirebaseMessaging", C000200d.A08(valueOf.length() + str.length() + 22, "Sending event=", str, " params=", valueOf));
        }
        C08U A002 = C08U.A00();
        A002.A03();
        A002.A03.A02(InterfaceC02190Af.class);
        android.util.Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }

    public static void A1i(String str, String str2) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        Log.e(sb.toString());
    }

    public static void A1j(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        Log.e(sb.toString(), th);
    }

    public static final void A1k(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                A1k(sb, i, str, obj2);
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(A0w(new C02230Aj(((String) obj).getBytes(C02220Ai.A00))));
            sb.append('\"');
        } else if (obj instanceof C0AN) {
            sb.append(": \"");
            sb.append(A0w((C0AN) obj));
            sb.append('\"');
        } else if (obj instanceof C0AZ) {
            sb.append(" {");
            A1Y((C0Aa) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    public static void A1l(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            String str2 = (String) hashMap.get(str);
            C000200d.A1T(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                C000200d.A1T(sb, "\"", str2, "\"");
            }
        }
        sb.append("}");
    }

    public static void A1m(HttpURLConnection httpURLConnection) {
        httpURLConnection.getURL();
        httpURLConnection.getRequestMethod();
    }

    public static void A1n(List list, C40261rr c40261rr, Activity activity) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj != null) {
                c40261rr.A07(activity, null, (UserJid) obj);
                return;
            }
            throw null;
        }
        activity.startActivity(new Intent(activity, BlockList.class));
    }

    public static void A1o(HttpEntity httpEntity) {
        if (httpEntity != null) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                Log.e("gdrive-api/consume-entity", e);
            }
        }
    }

    public static boolean A1p() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public static boolean A1q() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static boolean A1r() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean A1s() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean A1u(int i, int i2, int i3) {
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        if (r1.getPackageManager().hasSystemFeature("android.hardware.type.watch") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A1v(android.content.Context r1) {
        /*
            java.lang.Boolean r0 = X.AnonymousClass088.A03
            if (r0 != 0) goto L1e
            boolean r0 = A1q()
            if (r0 == 0) goto L17
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r0)
            r0 = 1
            if (r1 != 0) goto L18
        L17:
            r0 = 0
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass088.A03 = r0
        L1e:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass088.A1v(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0023, code lost:
        if (r4.getPackageManager().hasSystemFeature("cn.google") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A1w(android.content.Context r4) {
        /*
            boolean r0 = A1v(r4)
            r3 = 0
            if (r0 == 0) goto L39
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            r2 = 1
            if (r1 < r0) goto L38
            java.lang.Boolean r0 = X.AnonymousClass088.A04
            if (r0 != 0) goto L2c
            boolean r0 = A1r()
            if (r0 == 0) goto L25
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r0 = "cn.google"
            boolean r1 = r1.hasSystemFeature(r0)
            r0 = 1
            if (r1 != 0) goto L26
        L25:
            r0 = 0
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass088.A04 = r0
        L2c:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L39
            boolean r0 = A1s()
            if (r0 != 0) goto L39
        L38:
            return r2
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass088.A1w(android.content.Context):boolean");
    }

    public static boolean A1x(Intent intent) {
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static boolean A1y(AccessibilityManager accessibilityManager) {
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean A1z(AnonymousClass081 anonymousClass081) {
        try {
            String ADJ = anonymousClass081.ADJ(C017908j.A00);
            if (ADJ == null || C08i.A04(ADJ) == 0) {
                String ADJ2 = anonymousClass081.ADJ(C017908j.A01);
                if (ADJ2 != null) {
                    if (C08i.A04(ADJ2) != 0) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (C018208m unused) {
            A1i("ThemedColorUtils", "Error parsing themed color");
            return false;
        }
    }

    public static boolean A20(AnonymousClass084 anonymousClass084, AnonymousClass084 anonymousClass0842) {
        String str;
        if (anonymousClass084 != null && anonymousClass0842 != null) {
            String str2 = anonymousClass084.A01;
            return !(str2 == null || (str = anonymousClass0842.A01) == null || !str2.equals(str)) || anonymousClass084.A00 == anonymousClass0842.A00;
        }
        throw new IllegalArgumentException("Attempting to compare null BloksAnyTypeStyleKeys");
    }

    public static boolean A21(AnonymousClass084 anonymousClass084, String str, int i, boolean z) {
        if (z) {
            return anonymousClass084.A00 == i;
        }
        return anonymousClass084.A01.equals(str);
    }

    public static boolean A22(C0B5 c0b5) {
        if (c0b5.AFE() || !(c0b5 instanceof ActivityC02290Ap)) {
            return false;
        }
        ((ActivityC02290Ap) c0b5).A19("DoNotShareCodeDialogTag");
        c0b5.AUh(new DisplayExceptionDialogFactory$LoginFailedDialogFragment());
        return true;
    }

    public static boolean A23(C0B5 c0b5, C40291rx c40291rx, C40301ry c40301ry) {
        if (c0b5.AFE() || !(c0b5 instanceof ActivityC02290Ap)) {
            return false;
        }
        c40301ry.A03 = true;
        c40291rx.A09(true);
        c0b5.AUh(new DisplayExceptionDialogFactory$ClockWrongDialogFragment());
        return true;
    }

    public static boolean A24(C0B5 c0b5, C40291rx c40291rx, C40301ry c40301ry) {
        if (c0b5.AFE() || !(c0b5 instanceof ActivityC02290Ap)) {
            return false;
        }
        c40301ry.A03 = true;
        c40291rx.A09(true);
        c0b5.AUh(new DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment());
        return true;
    }

    public static boolean A25(C40101ra c40101ra, AbstractC40111rb abstractC40111rb, int i) {
        Boolean bool = (Boolean) C40161rg.A01(abstractC40111rb, new C40311rz(c40101ra), "gdrive-backup-util/fetch-token", i);
        return bool != null && bool.booleanValue();
    }

    public static boolean A26(File file, C40051rV c40051rV, AbstractC40111rb abstractC40111rb, InterfaceC40331s1 interfaceC40331s1, C40101ra c40101ra) {
        C40341s2 c40341s2 = new C40341s2(c40101ra, file, c40051rV, interfaceC40331s1, abstractC40111rb);
        StringBuilder A0P = C000200d.A0P("gdrive/restore/file ");
        A0P.append(file.getAbsolutePath());
        Boolean bool = (Boolean) C40161rg.A00(abstractC40111rb, c40341s2, A0P.toString());
        return bool != null && bool.booleanValue();
    }

    public static boolean A27(Number number) {
        return number.intValue() != 0;
    }

    public static boolean A28(Object obj) {
        return (obj instanceof C0A8) && (A0q((C0A8) obj) instanceof List);
    }

    public static boolean A29(Object obj) {
        return (obj instanceof C0A8) && (A0q((C0A8) obj) instanceof Map);
    }

    public static boolean A2A(Object obj) {
        return (obj instanceof C0A8) && (((C0A8) obj).A00 instanceof C0A6);
    }

    public static boolean A2B(Object obj) {
        return (obj instanceof C0A8) && (A0q((C0A8) obj) instanceof String);
    }

    public static boolean A2C(String str) {
        Uri parse = Uri.parse(A0z(str));
        return parse.getHost().equalsIgnoreCase("www.instagram.com") || parse.getHost().equalsIgnoreCase("instagram.com") || parse.getHost().equalsIgnoreCase("instagr.am") || parse.getHost().equalsIgnoreCase("www.instagr.am");
    }

    public static byte[] A2D(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C07K.A1P(inputStream);
        C07K.A1P(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
