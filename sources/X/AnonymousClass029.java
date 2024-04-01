package X;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import com.whatsapp.voipcalling.Voip;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.029 */
/* loaded from: classes.dex */
public class AnonymousClass029 {
    public static C02B A00;
    public static C02B A01;
    public static Long A02;
    public static Pattern A03;
    public static Pattern A04;

    public static int A00(int i, int i2, int i3) {
        float f = i3;
        int i4 = ((int) (1.402f * f)) + i;
        float f2 = i2;
        int i5 = i - ((int) ((f * 0.714f) + (0.344f * f2)));
        int i6 = i + ((int) (f2 * 1.772f));
        if (i4 > 255) {
            i4 = 255;
        } else if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > 255) {
            i5 = 255;
        } else if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > 255) {
            i6 = 255;
        } else if (i6 < 0) {
            i6 = 0;
        }
        return i6 | (-16777216) | (i4 << 16) | (i5 << 8);
    }

    public static byte[] A1d(int i) {
        return new byte[]{(byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int A01(int i, boolean z) {
        if (i == R.string.ephemeral_setting_off) {
            if (z) {
                return R.string.ephemeral_setting_off;
            }
            return R.string.ephemeral_setting_off_status;
        } else if (i == R.string.ephemeral_setting_on) {
            if (z) {
                return R.string.ephemeral_setting_on;
            }
            return R.string.ephemeral_setting_on_status;
        } else if (i == R.string.ephemeral_setting_24_hours) {
            if (z) {
                return R.string.ephemeral_setting_24_hours;
            }
            return R.string.ephemeral_setting_24_hours_status;
        } else if (i != R.string.ephemeral_setting_seven_days) {
            return z ? R.string.ephemeral_setting_off : R.string.ephemeral_setting_off_status;
        } else if (z) {
            return R.string.ephemeral_setting_seven_days;
        } else {
            return R.string.ephemeral_setting_seven_days_status;
        }
    }

    public static int A02(Context context) {
        try {
            int A002 = C0CL.A00(context, 12451000);
            if (C0CL.A04(context, A002)) {
                return 18;
            }
            return A002;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("google-utils/checkGooglePlayServicesStatus/unexpected exception/");
            sb.append(e);
            Log.e(sb.toString());
            return 8;
        }
    }

    public static int A03(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        try {
            return C02160Ac.A00(context, typedValue.resourceId);
        } catch (Resources.NotFoundException unused) {
            return C02160Ac.A00(context, i2);
        }
    }

    public static int A04(C02E c02e) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int A012 = C40491sL.A01();
        int i3 = 2011;
        if (A012 >= 1) {
            if (A012 == 1) {
                i2 = 2008;
            } else {
                i2 = 2012;
                if (A012 <= 3) {
                    i2 = 2011;
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        long A002 = C40491sL.A00();
        if (A002 != -1) {
            if (A002 <= 528000) {
                i = 2008;
            } else if (A002 <= 620000) {
                i = 2009;
            } else if (A002 <= 1020000) {
                i = 2010;
            } else if (A002 <= 1220000) {
                i = 2011;
            } else if (A002 <= 1520000) {
                i = 2012;
            } else {
                i = 2014;
                if (A002 <= 2020000) {
                    i = 2013;
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager A013 = c02e.A01();
        if (A013 == null) {
            Log.w("deviceinfo/get-total-memory am=null");
        } else {
            A013.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0) {
                if (j <= 201326592) {
                    i3 = 2008;
                } else if (j <= 304087040) {
                    i3 = 2009;
                } else if (j <= 536870912) {
                    i3 = 2010;
                } else if (j > 1073741824) {
                    if (j <= 1610612736) {
                        i3 = 2012;
                    } else {
                        i3 = 2014;
                        if (j <= 2147483648L) {
                            i3 = 2013;
                        }
                    }
                }
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Number) arrayList.get(arrayList.size() >> 1)).intValue();
        }
        int size = (arrayList.size() >> 1) - 1;
        return ((((Number) arrayList.get(size + 1)).intValue() - ((Number) arrayList.get(size)).intValue()) >> 1) + ((Number) arrayList.get(size)).intValue();
    }

    public static int A05(C05M c05m, C05W c05w, AbstractC005302j abstractC005302j) {
        C0CM A09;
        if (C003101m.A0U(abstractC005302j)) {
            C06C A092 = c05w.A09(abstractC005302j);
            if (A092 != null) {
                return A092.A00;
            }
            return 0;
        } else if (!C003101m.A0b(abstractC005302j) || (A09 = c05m.A09((UserJid) abstractC005302j)) == null) {
            return 0;
        } else {
            return A09.expiration;
        }
    }

    public static int A06(C02O c02o, C02E c02e) {
        SharedPreferences A012 = c02o.A01(C02M.A02);
        int i = A012.getInt("year_class_cached_value_pref", -1);
        if (i == -1) {
            int A042 = A04(c02e);
            A012.edit().putInt("year_class_cached_value_pref", A042).apply();
            return A042;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x005f, code lost:
        if (X.C40491sL.A00() >= 1300000) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0061, code lost:
        r7 = 2012;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0072, code lost:
        if (X.C40491sL.A00() < 1800000) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A07(X.C02O r7, X.C02E r8) {
        /*
            java.lang.String r0 = X.C02M.A02
            android.content.SharedPreferences r6 = r7.A01(r0)
            java.lang.String r5 = "year_class_cached_value_2016_pref"
            r1 = -1
            int r0 = r6.getInt(r5, r1)
            if (r0 != r1) goto L98
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            android.app.ActivityManager r0 = r8.A01()
            if (r0 != 0) goto L2f
            java.lang.String r0 = "deviceinfo/get-total-memory am=null"
            com.whatsapp.util.Log.w(r0)
        L1f:
            int r7 = A04(r8)
        L23:
            android.content.SharedPreferences$Editor r0 = r6.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r5, r7)
            r0.apply()
            return r7
        L2f:
            r0.getMemoryInfo(r1)
            long r3 = r1.totalMem
            r1 = -1
            r7 = 2013(0x7dd, float:2.821E-42)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L1f
            r1 = 805306368(0x30000000, double:3.97874211E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L4f
            int r1 = X.C40491sL.A01()
            r0 = 1
            r7 = 2010(0x7da, float:2.817E-42)
            if (r1 > r0) goto L23
            r7 = 2009(0x7d9, float:2.815E-42)
            goto L23
        L4f:
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L64
            int r1 = X.C40491sL.A00()
            r0 = 1300000(0x13d620, float:1.821688E-39)
            r7 = 2011(0x7db, float:2.818E-42)
            if (r1 < r0) goto L23
        L61:
            r7 = 2012(0x7dc, float:2.82E-42)
            goto L23
        L64:
            r1 = 1610612736(0x60000000, double:7.957484216E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L75
            int r1 = X.C40491sL.A00()
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r1 >= r0) goto L23
            goto L61
        L75:
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L23
            r1 = 3221225472(0xc0000000, double:1.591496843E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L8a
            r7 = 2014(0x7de, float:2.822E-42)
            goto L23
        L8a:
            r1 = 5368709120(0x140000000, double:2.6524947387E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r7 = 2016(0x7e0, float:2.825E-42)
            if (r0 > 0) goto L23
            r7 = 2015(0x7df, float:2.824E-42)
            goto L23
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass029.A07(X.02O, X.02E):int");
    }

    public static int A08(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int A09(byte[] bArr) {
        return (bArr[2] & 255) | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static long A0A(Context context) {
        Long l = A02;
        if (l == null) {
            long j = 0;
            if ("com.whatsapp".equals(context.getPackageName())) {
                long A0B = A0B(context, context.getPackageName());
                if (A0B >= 210915004 && A0B <= 210915008) {
                    Signature[] A1j = A1j(context);
                    String str = null;
                    if (A1j != null && (r3 = A1j.length) != 0) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                            messageDigest.reset();
                            for (Signature signature : A1j) {
                                messageDigest.update(signature.toByteArray());
                            }
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException e) {
                            Log.e(e);
                        }
                    }
                    if ("OKD31QX-GP7GT780Psqq8xDb15k".equals(str)) {
                        j = 1;
                    }
                }
            }
            l = Long.valueOf(j);
            A02 = l;
        }
        return l.longValue();
    }

    public static long A0B(Context context, String str) {
        PackageInfo A0C = A0C(context, str);
        if (A0C != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return A0C.getLongVersionCode();
            }
            return A0C.versionCode;
        }
        return -1L;
    }

    public static PackageInfo A0C(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(str, 0);
            }
            return null;
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Log.e("Failed to get package info", e);
            return null;
        }
    }

    public static Bitmap A0D(ActivityC02290Ap activityC02290Ap, C06C c06c, boolean z, String str, String str2) {
        ContactQrContactCardView contactQrContactCardView;
        Resources resources = activityC02290Ap.getResources();
        C0CN c0cn = (C0CN) activityC02290Ap.A0d();
        int i = c0cn.A01;
        if (Build.VERSION.SDK_INT < 17) {
            if (i != 1) {
                c0cn.A01 = 1;
                c0cn.A0Q();
            }
            contactQrContactCardView = new ContactQrContactCardView(activityC02290Ap);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(resources.getDimension(R.dimen.contact_qr_corner_radius));
            gradientDrawable.setColor(resources.getColor(R.color.contact_qr_card_background));
            contactQrContactCardView.findViewById(R.id.qr_card).setBackground(gradientDrawable);
        } else {
            Configuration configuration = new Configuration();
            configuration.uiMode = (new Configuration().uiMode & (-49)) | 16;
            C0CP c0cp = new C0CP(activityC02290Ap);
            if (c0cp.A03 == null) {
                if (c0cp.A01 == null) {
                    c0cp.A01 = new Configuration(configuration);
                    contactQrContactCardView = new ContactQrContactCardView(c0cp);
                } else {
                    throw new IllegalStateException("Override configuration has already been set");
                }
            } else {
                throw new IllegalStateException("getResources() or getAssets() has already been called");
            }
        }
        contactQrContactCardView.setGravity(17);
        contactQrContactCardView.setStyle(1);
        contactQrContactCardView.A01(c06c, z);
        contactQrContactCardView.setPrompt(str2);
        contactQrContactCardView.setQrCode(str);
        contactQrContactCardView.measure(View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(R.dimen.contact_qr_share_card_width), 1073741824), View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(R.dimen.contact_qr_share_card_height), 1073741824));
        contactQrContactCardView.layout(0, 0, contactQrContactCardView.getMeasuredWidth(), contactQrContactCardView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(contactQrContactCardView.getWidth(), contactQrContactCardView.getHeight(), Bitmap.Config.ARGB_8888);
        contactQrContactCardView.draw(new Canvas(createBitmap));
        if (Build.VERSION.SDK_INT < 17 && c0cn.A01 != i) {
            c0cn.A01 = i;
            c0cn.A0Q();
        }
        return createBitmap;
    }

    public static C0CR A0E(ActivityC02340Au activity) {
        C40511sO A0r = ((C0CQ) C02180Ae.A0f(activity, C0CQ.class)).A0r();
        if (A0r != null) {
            return A0r.A01(activity, activity.getIntent() != null ? activity.getIntent().getExtras() : null, A0r.A01);
        }
        throw null;
    }

    public static C0CR A0F(C0BA fragment) {
        C40511sO A042 = ((C0CS) C02180Ae.A0f(fragment, C0CS.class)).A04();
        if (A042 != null) {
            return A042.A01(fragment, fragment.A06, A042.A02);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x00d9, code lost:
        if (android.text.TextUtils.isEmpty(r11.A0V) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0173, code lost:
        if (X.C003101m.A0Q(r11.A0n.A00) == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C40521sP A0G(X.C02L r10, X.AnonymousClass092 r11, boolean r12, X.C0CM r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass029.A0G(X.02L, X.092, boolean, X.0CM, byte[]):X.1sP");
    }

    public static C0CM A0H(AnonymousClass092 anonymousClass092) {
        Long l = anonymousClass092.A0Q;
        if (anonymousClass092.A10() || (l != null && l.longValue() > 0)) {
            return new C0CM(anonymousClass092.A02, l != null ? l.longValue() : 0L);
        }
        return null;
    }

    public static VoipStanzaChildNode.Builder A0I(VoipStanzaChildNode voipStanzaChildNode) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        return builder;
    }

    public static VoipStanzaChildNode A0J(VoipStanzaChildNode voipStanzaChildNode, C010805j c010805j, byte b) {
        VoipStanzaChildNode.Builder A0I = A0I(voipStanzaChildNode);
        VoipStanzaChildNode fromProtocolTreeNode = c010805j != null ? VoipStanzaChildNode.fromProtocolTreeNode(C40581sV.A01(c010805j, b, null, null)) : null;
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("enc".equals(voipStanzaChildNode2.tag)) {
                    voipStanzaChildNode2 = fromProtocolTreeNode;
                }
                if (voipStanzaChildNode2 != null) {
                    A0I.addChild(voipStanzaChildNode2);
                }
            }
        }
        return A0I.build();
    }

    public static VoipStanzaChildNode A0K(VoipStanzaChildNode voipStanzaChildNode, String str) {
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy == null) {
            return null;
        }
        for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
            if (str.equals(voipStanzaChildNode2.tag)) {
                return voipStanzaChildNode2;
            }
        }
        return null;
    }

    public static VoipStanzaChildNode A0L(VoipStanzaChildNode voipStanzaChildNode, VoipStanzaChildNode[] voipStanzaChildNodeArr) {
        VoipStanzaChildNode.Builder A0I = A0I(voipStanzaChildNode);
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("destination".equals(voipStanzaChildNode2.tag)) {
                    if (voipStanzaChildNodeArr != null) {
                        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder("destination");
                        builder.addChildren(voipStanzaChildNodeArr);
                        voipStanzaChildNode2 = builder.build();
                    }
                }
                if (voipStanzaChildNode2 != null) {
                    A0I.addChild(voipStanzaChildNode2);
                }
            }
        }
        return A0I.build();
    }

    public static VoipStanzaChildNode A0M(C40591sW c40591sW, Map map) {
        ArrayList arrayList;
        boolean z = false;
        C010805j c010805j = null;
        VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
        c010805j = null;
        if (c40591sW.A02 != null) {
            Set keySet = c40591sW.A06.keySet();
            VoipStanzaChildNode voipStanzaChildNode = c40591sW.A03;
            if (map == null) {
                C000700j.A08(true ^ keySet.isEmpty(), "no destination jids");
                arrayList = new ArrayList(keySet);
            } else {
                C000700j.A08(map.keySet().equals(keySet), "some device are not encrypted!");
                arrayList = null;
            }
            AbstractList abstractList = (AbstractList) C40581sV.A06(Collections.emptyMap(), null, arrayList, map, 0, null, null, false);
            if (!abstractList.isEmpty()) {
                voipStanzaChildNodeArr = new VoipStanzaChildNode[abstractList.size()];
                for (int i = 0; i < abstractList.size(); i++) {
                    voipStanzaChildNodeArr[i] = VoipStanzaChildNode.fromProtocolTreeNode((C02590Ca) abstractList.get(i));
                }
            }
            return A0L(voipStanzaChildNode, voipStanzaChildNodeArr);
        }
        C000700j.A08((map == null || map.size() == 1) ? true : true, "cannot have multiple encrypted messages in old format!");
        if (map != null && map.size() == 1) {
            DeviceJid of = DeviceJid.of(c40591sW.A01);
            if (of != null) {
                Object obj = map.get(of);
                if (obj == null) {
                    throw null;
                }
                c010805j = (C010805j) obj;
            } else {
                throw null;
            }
        }
        return A0J(c40591sW.A03, c010805j, c40591sW.A00);
    }

    public static C02600Cb A0N(AnonymousClass012 anonymousClass012, JSONObject jSONObject) {
        String string = jSONObject.getString("auth_token");
        long j = jSONObject.getLong("conn_ttl");
        long j2 = jSONObject.getLong("auth_ttl");
        long j3 = jSONObject.getLong("max_buckets");
        JSONArray jSONArray = jSONObject.getJSONArray("hosts");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(new C40601sX(jSONObject2.getString("hostname"), A0w(jSONObject2, "ip4"), A0w(jSONObject2, "ip6"), A0w(jSONObject2, "class"), A0w(jSONObject2, "fallback_hostname"), A0w(jSONObject2, "fallback_ip4"), A0w(jSONObject2, "fallback_ip6"), A0w(jSONObject2, "fallback_class"), A10(jSONObject2.optJSONArray("upload")), A10(jSONObject2.optJSONArray("download")), A10(jSONObject2.optJSONArray("download_buckets")), A0w(jSONObject2, "type"), jSONObject2.optBoolean("force_ip")));
        }
        return new C02600Cb(string, j, j2, j3, arrayList, anonymousClass012.A03() + (jSONObject.getLong("send_time_abs_ms") - anonymousClass012.A05()), A0w(jSONObject, "last_id"), jSONObject.getBoolean("is_new"), jSONObject.getInt("max_autodownload_retry"), jSONObject.getInt("max_manual_retry"));
    }

    public static File A0O(Context context) {
        File file = new File(context.getCacheDir(), "voip_time_series");
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        if (file.exists()) {
            file.delete();
        }
        if (file.mkdirs()) {
            return file;
        }
        C000200d.A0o(file, C000200d.A0P("VoipUtil failed to create time series directory: "));
        return null;
    }

    public static Byte A0P(VoipStanzaChildNode voipStanzaChildNode) {
        C04P[] attributesCopy = voipStanzaChildNode.getAttributesCopy();
        byte b = 0;
        if (attributesCopy == null) {
            return (byte) 0;
        }
        int length = attributesCopy.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C04P c04p = attributesCopy[i];
            if (!"count".equals(c04p.A02)) {
                i++;
            } else {
                try {
                    b = Byte.parseByte(c04p.A03);
                    break;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
        }
        return Byte.valueOf(b);
    }

    public static CharSequence A0Q(C02E c02e, C02O c02o, CharSequence charSequence) {
        return A0R(c02e, c02o, charSequence, false, -16777216);
    }

    /* JADX WARN: Code restructure failed: missing block: B:347:0x0032, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.CharSequence A0R(X.C02E r16, X.C02O r17, java.lang.CharSequence r18, boolean r19, int r20) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass029.A0R(X.02E, X.02O, java.lang.CharSequence, boolean, int):java.lang.CharSequence");
    }

    public static CharSequence A0S(C002301c c002301c, long j) {
        if (System.currentTimeMillis() - j <= 30000) {
            return c002301c.A06(R.string.linked_device_active_now);
        }
        return A0T(c002301c, j);
    }

    public static CharSequence A0T(C002301c c002301c, long j) {
        int i;
        String A0D;
        int A002 = C02620Cd.A00(System.currentTimeMillis(), j);
        if (A002 == 0) {
            i = R.string.web_session_last_today_at;
        } else if (A002 == 1) {
            i = R.string.web_session_last_yesterday_at;
        } else {
            if (C02620Cd.A07(System.currentTimeMillis(), j)) {
                A0D = C002501g.A09(c002301c, j);
            } else {
                A0D = C002501g.A0D(c002301c, j);
            }
            return c002301c.A0D(R.string.web_session_last_date, C02620Cd.A05(c002301c, A0D, AbstractC40621sZ.A00(c002301c, j)));
        }
        return AbstractC40621sZ.A01(c002301c, c002301c.A0D(i, AbstractC40621sZ.A00(c002301c, j)), j);
    }

    public static CharSequence A0U(C002301c c002301c, long j) {
        String A0D;
        int A002 = C02620Cd.A00(System.currentTimeMillis(), j);
        if (A002 == 0) {
            int currentTimeMillis = (int) ((System.currentTimeMillis() - j) / 60000);
            if (currentTimeMillis < 1) {
                return c002301c.A06(R.string.just_now);
            }
            if (currentTimeMillis < 60) {
                return c002301c.A09(269, currentTimeMillis, String.format(c002301c.A0I(), "%d", Integer.valueOf(currentTimeMillis)));
            }
            A0D = C002501g.A0G(c002301c.A0I(), c002301c.A05(270));
        } else if (A002 == 1) {
            A0D = C002501g.A08(c002301c);
        } else if (C02620Cd.A07(System.currentTimeMillis(), j)) {
            A0D = C002501g.A09(c002301c, j);
        } else {
            A0D = C002501g.A0D(c002301c, j);
        }
        return C02620Cd.A05(c002301c, A0D, AbstractC40621sZ.A00(c002301c, j));
    }

    public static CharSequence A0V(C002301c c002301c, long j, boolean z) {
        if (z) {
            return c002301c.A06(R.string.linked_device_active_now);
        }
        return A0T(c002301c, j);
    }

    public static Integer A0W(C018108l c018108l) {
        if (c018108l == null) {
            return null;
        }
        if (c018108l.A02()) {
            return 2;
        }
        return c018108l.A01() ? 3 : null;
    }

    public static Object A0X(Context context) {
        return C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
    }

    public static Object A0Y(Context context) {
        Application application = (Application) context.getApplicationContext();
        boolean z = application instanceof AnonymousClass005;
        Object[] objArr = {application.getClass()};
        if (z) {
            return ((AnonymousClass005) application).generatedComponent();
        }
        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @AndroidEntryPoint Application. Found: %s", objArr));
    }

    public static String A0Z(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String A0a(AnonymousClass012 anonymousClass012, C02600Cb c02600Cb) {
        if (c02600Cb == null) {
            return null;
        }
        try {
            return A12(anonymousClass012, c02600Cb).toString();
        } catch (JSONException e) {
            Log.e("routingresponse/can't serialize json", e);
            return null;
        }
    }

    public static String A0b(C002301c c002301c, int i) {
        if (i <= 0) {
            return "";
        }
        if (i >= 86400) {
            int i2 = i / 86400;
            return c002301c.A0A(R.plurals.tb_ephemeral_chat_expiration_in_days, i2, Integer.valueOf(i2));
        } else if (i >= 3600) {
            int i3 = i / 3600;
            return c002301c.A0A(R.plurals.tb_ephemeral_chat_expiration_in_hours, i3, Integer.valueOf(i3));
        } else if (i >= 60) {
            int i4 = i / 60;
            return c002301c.A0A(R.plurals.tb_ephemeral_chat_expiration_in_minutes, i4, Integer.valueOf(i4));
        } else {
            return c002301c.A0A(R.plurals.tb_ephemeral_chat_expiration_in_seconds, i, Integer.valueOf(i));
        }
    }

    public static String A0c(C002301c c002301c, int i, int i2) {
        int i3;
        if (i2 != 7) {
            switch (i2) {
                case 0:
                    i3 = 287;
                    return c002301c.A09(i3, i, String.format(c002301c.A0I(), "%d", Integer.valueOf(i)));
                case 1:
                    i3 = 281;
                    return c002301c.A09(i3, i, String.format(c002301c.A0I(), "%d", Integer.valueOf(i)));
                case 2:
                    i3 = 276;
                    return c002301c.A09(i3, i, String.format(c002301c.A0I(), "%d", Integer.valueOf(i)));
                case 3:
                    i3 = 273;
                    return c002301c.A09(i3, i, String.format(c002301c.A0I(), "%d", Integer.valueOf(i)));
                case 4:
                    i3 = 290;
                    return c002301c.A09(i3, i, String.format(c002301c.A0I(), "%d", Integer.valueOf(i)));
                case 5:
                    i3 = 284;
                    return c002301c.A09(i3, i, String.format(c002301c.A0I(), "%d", Integer.valueOf(i)));
                case 6:
                    i3 = 292;
                    return c002301c.A09(i3, i, String.format(c002301c.A0I(), "%d", Integer.valueOf(i)));
            }
        } else if (i == -1) {
            return c002301c.A06(R.string.mute_always);
        }
        throw new IllegalArgumentException("Invalid duration unit");
    }

    public static String A0d(C002301c c002301c, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = 283;
        } else if (i2 != 2) {
            throw new IllegalArgumentException("Invalid or unsupported duration unit");
        } else {
            i3 = 278;
        }
        return c002301c.A09(i3, i, String.format(c002301c.A0I(), "%d", Integer.valueOf(i)));
    }

    public static String A0e(C002301c c002301c, int i, long j) {
        String A042 = c002301c.A04();
        if (!"en".equals(A042) && !"de".equals(A042) && !"es".equals(A042)) {
            if (i <= 30) {
                return c002301c.A0D(R.string.time_and_date, A0h(c002301c, j));
            }
            return c002301c.A0D(R.string.date, C002501g.A0D(c002301c, j));
        } else if (i <= 30) {
            return c002301c.A0D(R.string.time_and_date, C02620Cd.A05(c002301c, C002501g.A0A(c002301c, j), AbstractC40621sZ.A00(c002301c, j)));
        } else {
            if (C002501g.A01 == null) {
                C002501g.A01 = DateFormat.getDateInstance(2, c002301c.A0I());
            }
            return c002301c.A0D(R.string.date, ((DateFormat) C002501g.A01.clone()).format(new Date(j)));
        }
    }

    public static String A0f(C002301c c002301c, long j) {
        if (C02620Cd.A00(System.currentTimeMillis(), j) == 0) {
            return AbstractC40621sZ.A00(c002301c, j);
        }
        return (String) A0U(c002301c, j);
    }

    public static String A0g(C002301c c002301c, long j) {
        long j2;
        long j3;
        String A05;
        String str;
        int i;
        if (j >= 3600) {
            j2 = j / 3600;
            j -= 3600 * j2;
        } else {
            j2 = 0;
        }
        if (j >= 60) {
            j3 = j / 60;
            j -= 60 * j3;
        } else {
            j3 = 0;
        }
        if (j2 > 0) {
            A05 = c002301c.A05(220);
        } else {
            A05 = c002301c.A05(221);
        }
        int length = A05.length();
        StringBuilder sb = new StringBuilder(length);
        Locale A0I = c002301c.A0I();
        int i2 = 0;
        while (i2 < length) {
            char charAt = A05.charAt(i2);
            if (charAt != 'h' && charAt != 'm' && charAt != 's') {
                sb.append(charAt);
                i = 1;
            } else {
                int i3 = i2 + 1;
                if (i3 >= length || A05.charAt(i3) != charAt) {
                    str = "%d";
                    i3 = i2;
                } else {
                    str = "%02d";
                }
                if (charAt == 'h') {
                    i = 1;
                    sb.append(String.format(A0I, str, Long.valueOf(j2)));
                } else if (charAt != 'm') {
                    i = 1;
                    if (charAt == 's') {
                        sb.append(String.format(A0I, str, Long.valueOf(j)));
                    }
                } else {
                    i = 1;
                    sb.append(String.format(A0I, str, Long.valueOf(j3)));
                }
                i2 = i3;
            }
            i2 += i;
        }
        return sb.toString();
    }

    public static String A0h(C002301c c002301c, long j) {
        return C02620Cd.A05(c002301c, C002501g.A0D(c002301c, j), AbstractC40621sZ.A00(c002301c, j));
    }

    public static String A0i(C002301c c002301c, long j) {
        C000700j.A07(j >= 0);
        int i = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i2 = (int) (j2 / 60000);
        String A0c = A0c(c002301c, (int) ((j2 % 60000) / 1000), 0);
        if (i > 0) {
            return c002301c.A0C(237, c002301c.A0C(242, A0c(c002301c, i, 2), A0c(c002301c, i2, 1)), A0c);
        }
        return i2 > 0 ? c002301c.A0C(243, A0c(c002301c, i2, 1), A0c) : A0c;
    }

    public static String A0j(C002301c c002301c, long j) {
        C000700j.A07(j >= 0);
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        if (j3 - (60000 * j4) > 0) {
            j4++;
        }
        if (j4 == 60) {
            j2++;
            j4 = 0;
        }
        if (j2 == 0) {
            int i = (int) j4;
            return c002301c.A0A(R.plurals.time_left, i, A0c(c002301c, i, 1));
        }
        return c002301c.A0A(R.plurals.time_left, (int) (j2 + j4), c002301c.A0C(238, A0d(c002301c, (int) j2, 2), A0d(c002301c, (int) j4, 1)));
    }

    public static String A0k(C002301c c002301c, long j) {
        long j2 = j / 3600000;
        long j3 = (j - (3600000 * j2)) / 60000;
        if (j2 == 0) {
            if (j3 == 0) {
                return A0c(c002301c, (int) (j / 1000), 0);
            }
            return A0c(c002301c, (int) j3, 1);
        } else if (j3 == 0) {
            return A0c(c002301c, (int) j2, 2);
        } else {
            return c002301c.A0C(243, A0c(c002301c, (int) j2, 2), A0c(c002301c, (int) j3, 1));
        }
    }

    public static String A0l(C002301c c002301c, long j) {
        int A002 = C02620Cd.A00(System.currentTimeMillis(), j);
        if (A002 == 0) {
            return C002501g.A0G(c002301c.A0I(), c002301c.A05(270));
        }
        if (A002 == 1) {
            return C002501g.A08(c002301c);
        }
        return C002501g.A0C(c002301c, j);
    }

    public static String A0m(C002301c c002301c, long j, int i, int i2, int i3, Object... objArr) {
        String A0D;
        int A002 = C02620Cd.A00(System.currentTimeMillis(), j);
        int length = objArr.length;
        Object[] copyOf = length == 0 ? new String[1] : Arrays.copyOf(objArr, length + 1);
        if (A002 != 0 && A002 != 1) {
            if (A002 <= 30) {
                A0D = A0h(c002301c, j);
            } else {
                A0D = C002501g.A0D(c002301c, j);
            }
            copyOf[length] = c002301c.A0E(A0D);
            return String.format(c002301c.A0I(), c002301c.A06(i3), copyOf);
        }
        copyOf[length] = c002301c.A0E(AbstractC40621sZ.A00(c002301c, j));
        if (A002 != 0) {
            i = i2;
        }
        return AbstractC40621sZ.A01(c002301c, c002301c.A0D(i, copyOf), j);
    }

    public static String A0n(C002301c c002301c, long j, boolean z) {
        int A002 = C02620Cd.A00(System.currentTimeMillis(), j);
        if (A002 == 0) {
            return AbstractC40621sZ.A00(c002301c, j);
        }
        if (A002 == 1) {
            return C002501g.A08(c002301c);
        }
        if (z) {
            return C002501g.A0I(c002301c, 0).format(new Date(j));
        }
        return C002501g.A0D(c002301c, j);
    }

    public static String A0o(C002301c c002301c, boolean z, List list) {
        int size = list.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return c002301c.A0E((String) list.get(0));
        }
        if (size == 2) {
            if (z) {
                return c002301c.A0C(236, c002301c.A0E((String) list.get(0)), c002301c.A0E((String) list.get(1)));
            }
            return c002301c.A0D(R.string.list_two_items_short, c002301c.A0E((String) list.get(0)), c002301c.A0E((String) list.get(1)));
        }
        String A0C = c002301c.A0C(235, c002301c.A0E((String) list.get(0)), c002301c.A0E((String) list.get(1)));
        for (int i = 2; i < list.size() - 1; i++) {
            A0C = c002301c.A0C(234, A0C, c002301c.A0E((String) list.get(i)));
        }
        if (z) {
            return c002301c.A0C(233, A0C, c002301c.A0E((String) list.get(size - 1)));
        }
        return c002301c.A0D(R.string.list_end_short, A0C, c002301c.A0E((String) list.get(size - 1)));
    }

    public static String A0p(C003701t c003701t, Context context, int i, boolean z) {
        if (i <= 0) {
            return context.getString(A01(R.string.ephemeral_setting_off, z));
        }
        if (c003701t.A0C(407)) {
            if (i == 86400) {
                return context.getString(A01(R.string.ephemeral_setting_24_hours, z));
            }
            if (i == 604800) {
                return context.getString(A01(R.string.ephemeral_setting_seven_days, z));
            }
        }
        if (i == 604800) {
            return context.getString(A01(R.string.ephemeral_setting_on, z));
        }
        int i2 = R.plurals.ephemeral_setting_in_seconds;
        if (i > 86400) {
            i /= 86400;
            i2 = R.plurals.ephemeral_setting_in_days;
        } else if (i >= 3600) {
            i /= 3600;
            i2 = R.plurals.ephemeral_setting_in_hours;
        } else if (i >= 60) {
            i /= 60;
            i2 = R.plurals.ephemeral_setting_in_minutes;
        }
        return context.getResources().getQuantityString(i2, i, Integer.valueOf(i));
    }

    public static String A0q(GroupJid groupJid, List list, C05W c05w, C0C8 c0c8, C018708s c018708s) {
        C06C A08;
        AbstractC011205o abstractC011205o;
        if (groupJid == null || (A08 = c05w.A08(groupJid)) == null || (abstractC011205o = (AbstractC011205o) A08.A03(C011005l.class)) == null) {
            return null;
        }
        C07D A042 = c0c8.A01(abstractC011205o).A04();
        for (Object obj : list) {
            if (!A042.A00.contains(obj)) {
                return null;
            }
        }
        return c018708s.A04(A08);
    }

    public static String A0r(UserJid userJid) {
        StringBuilder A0P = C000200d.A0P("@");
        String str = userJid.user;
        if (str != null) {
            A0P.append(str);
            return A0P.toString();
        }
        throw null;
    }

    public static String A0s(String str) {
        return str.startsWith("call:") ? str.replaceFirst("call:", "") : str;
    }

    public static String A0t(String str) {
        if (str == null) {
            return null;
        }
        return C000200d.A0H("call:", str);
    }

    public static String A0u(String str, int i) {
        if (i != 0) {
            if (i != 2) {
                C000200d.A0p("ContactQrUtils/getUniqueIdFromContactQrCode/invalid code type", i);
                return "";
            }
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            return lastPathSegment != null ? lastPathSegment : "";
        }
        return str.substring(17);
    }

    public static String A0v(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jid) it.next()).getRawString());
        }
        return TextUtils.join(",", arrayList);
    }

    public static String A0w(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList A0x(final android.text.Spannable r12) {
        /*
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            int r0 = r12.length()
            r11 = 0
            java.lang.Object[] r1 = r12.getSpans(r11, r0, r1)
            if (r1 == 0) goto L67
            int r0 = r1.length
            if (r0 == 0) goto L67
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            X.3U6 r0 = new X.3U6
            r0.<init>()
            java.util.Collections.sort(r10, r0)
            int r9 = r10.size()
        L25:
            r8 = -1
            int r7 = r9 + (-1)
            if (r11 >= r7) goto L66
            java.lang.Object r6 = r10.get(r11)
            int r5 = r11 + 1
            java.lang.Object r4 = r10.get(r5)
            int r3 = r12.getSpanStart(r6)
            int r2 = r12.getSpanEnd(r6)
            int r1 = r12.getSpanStart(r4)
            int r0 = r12.getSpanEnd(r4)
            if (r3 > r1) goto L64
            if (r2 <= r1) goto L64
            if (r0 > r2) goto L55
            r12.removeSpan(r4)
        L4d:
            r0 = r5
        L4e:
            if (r0 == r8) goto L64
            r10.remove(r0)
            r9 = r7
            goto L25
        L55:
            int r2 = r2 - r3
            int r0 = r0 - r1
            if (r2 <= r0) goto L5d
            r12.removeSpan(r4)
            goto L4d
        L5d:
            if (r2 >= r0) goto L64
            r12.removeSpan(r6)
            r0 = r11
            goto L4e
        L64:
            r11 = r5
            goto L25
        L66:
            return r10
        L67:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass029.A0x(android.text.Spannable):java.util.ArrayList");
    }

    public static List A0y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C003101m.A0F(UserJid.class, Arrays.asList(str.split(",")));
    }

    public static List A0z(byte[] bArr) {
        try {
            return new ArrayList((Collection) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject());
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            Log.e("ContactUtil/getContactsFromBytes/error getting contacts from data", e);
            return new ArrayList();
        }
    }

    public static Set A10(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    public static JSONArray A11(Set set) {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : set) {
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public static JSONObject A12(AnonymousClass012 anonymousClass012, C02600Cb c02600Cb) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_token", c02600Cb.A08);
        jSONObject.put("conn_ttl", c02600Cb.A05);
        jSONObject.put("auth_ttl", c02600Cb.A03);
        jSONObject.put("max_buckets", c02600Cb.A06);
        List<C40601sX> list = c02600Cb.A0A;
        JSONArray jSONArray = new JSONArray();
        for (C40601sX c40601sX : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("hostname", c40601sX.A04);
            jSONObject2.put("ip4", c40601sX.A05);
            jSONObject2.put("ip6", c40601sX.A06);
            jSONObject2.put("class", c40601sX.A07);
            jSONObject2.put("fallback_hostname", c40601sX.A00);
            jSONObject2.put("fallback_ip4", c40601sX.A01);
            jSONObject2.put("fallback_ip6", c40601sX.A02);
            jSONObject2.put("fallback_class", c40601sX.A03);
            jSONObject2.put("upload", A11(c40601sX.A0B));
            jSONObject2.put("download", A11(c40601sX.A09));
            jSONObject2.put("download_buckets", A11(c40601sX.A0A));
            jSONObject2.put("type", c40601sX.A08);
            jSONObject2.put("force_ip", c40601sX.A0C);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("hosts", jSONArray);
        jSONObject.put("send_time_abs_ms", anonymousClass012.A05() + (c02600Cb.A07 - anonymousClass012.A03()));
        jSONObject.put("last_id", c02600Cb.A09);
        jSONObject.put("is_new", c02600Cb.A0B);
        jSONObject.put("max_autodownload_retry", c02600Cb.A00);
        jSONObject.put("max_manual_retry", c02600Cb.A01);
        return jSONObject;
    }

    public static C02640Cf A13(byte[] bArr) {
        int i = bArr[0] & 255;
        if (i == 5) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            return new C02640Cf(bArr2);
        }
        throw new C02650Cg(C000200d.A0D("Bad key type: ", i));
    }

    public static C02670Ci A14() {
        C40641sb A022 = C40631sa.A00().A02();
        return new C02670Ci(new C02640Cf(A022.A01), new C40651sc(A022.A00));
    }

    public static InterfaceC02660Ch A15(byte[] bArr) {
        return new C40651sc(bArr);
    }

    public static void A16(Context context, C018508q c018508q, C018308n c018308n, C02E c02e, TextEmojiLabel textEmojiLabel, String str, Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new C02740Cr(context, c018508q, c02e, c018308n, entry.getValue().toString()));
        }
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                Object obj = hashMap.get(uRLSpan.getURL());
                if (obj != null) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        textEmojiLabel.A07 = new C02770Cu();
        textEmojiLabel.setAccessibilityHelper(new C02780Cv(c02e, textEmojiLabel));
        textEmojiLabel.setText(spannableStringBuilder);
    }

    public static void A17(Context context, C40081rY c40081rY, C02E c02e, C02O c02o, Editable editable, Paint paint) {
        A18(context, c40081rY, c02e, c02o, editable, paint, 1.3f);
    }

    public static void A18(Context context, C40081rY c40081rY, C02E c02e, C02O c02o, Editable editable, Paint paint, float f) {
        ForegroundColorSpan[] foregroundColorSpanArr;
        C002701i.A1D(editable, context, paint, f, c40081rY);
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
            if (!(foregroundColorSpan instanceof InterfaceC40661sd)) {
                editable.removeSpan(foregroundColorSpan);
            }
        }
        A1A(editable, 0, editable.length(), StyleSpan.class);
        A1A(editable, 0, editable.length(), StrikethroughSpan.class);
        A1A(editable, 0, editable.length(), TypefaceSpan.class);
        A0R(c02e, c02o, editable, true, paint.getColor());
    }

    public static void A19(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), z ? 1 : 2, 1);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("PackageManagerUtils/setActivityRegisteredState/error: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public static void A1A(Editable editable, int i, int i2, Class cls) {
        Object[] spans = editable.getSpans(i, i2, cls);
        if (spans != null) {
            for (Object obj : spans) {
                editable.removeSpan(obj);
            }
        }
    }

    public static void A1B(Window window, boolean z) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & (-8193);
        if (z) {
            i = systemUiVisibility | 8192;
        }
        window.getDecorView().setSystemUiVisibility(i);
    }

    public static void A1C(AbstractC02800Cx abstractC02800Cx, DialogFragment dialogFragment) {
        String name = dialogFragment.getClass().getName();
        if (abstractC02800Cx.A0Q.A01(name) == null) {
            A1D(abstractC02800Cx, dialogFragment, name);
        }
    }

    public static void A1D(AbstractC02800Cx abstractC02800Cx, DialogFragment dialogFragment, String str) {
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, dialogFragment, str, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }

    public static void A1E(C05W c05w, GroupJid groupJid, List list, List list2, ActivityC02330At activityC02330At, boolean z, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (c05w.A0R(userJid) || !z) {
                arrayList.add(userJid);
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            GroupCallParticipantPickerSheet.A00(activityC02330At, groupJid, arrayList, list2, list.size() - arrayList.size(), Integer.valueOf(i));
        } else {
            activityC02330At.startActivity(GroupCallParticipantPicker.A01(activityC02330At, groupJid, arrayList, list2, list.size() - arrayList.size(), i));
        }
        activityC02330At.overridePendingTransition(0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x001a, code lost:
        if (r0 != 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0052, code lost:
        if (r1 == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A1F(X.AnonymousClass011 r5, int r6, java.lang.Integer r7, X.C40711sk r8, X.EnumC40721sl r9, X.C018108l r10, java.lang.Boolean r11, boolean r12) {
        /*
            r4 = 2
            r3 = 0
            r2 = 1
            r1 = 3
            if (r7 != 0) goto Le
            X.1sl r0 = X.EnumC40721sl.NETWORK_UNAVAILABLE
            if (r9 != r0) goto L38
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        Le:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            if (r8 == 0) goto L1c
            int r0 = r8.A01
            if (r0 == 0) goto L36
            if (r0 == r2) goto L34
            if (r0 == r4) goto L1d
        L1c:
            r4 = 7
        L1d:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r9 = A0W(r10)
            if (r7 != 0) goto L28
            r3 = 1
        L28:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            X.C40731sm.A0d(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L34:
            r4 = 3
            goto L1d
        L36:
            r4 = 1
            goto L1d
        L38:
            if (r8 == 0) goto L54
            int r1 = r8.A00
            if (r1 != 0) goto L52
            if (r9 == 0) goto L52
            boolean r0 = r9.A00()
            if (r0 == 0) goto L52
            int r0 = r8.A01
            if (r0 == 0) goto L52
            if (r0 == r4) goto L52
            r0 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto Le
        L52:
            if (r1 != 0) goto L5d
        L54:
            if (r9 == 0) goto L62
            boolean r0 = r9.A00()
            r0 = r0 ^ r2
            if (r0 == 0) goto L62
        L5d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            goto Le
        L62:
            r7 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass029.A1F(X.011, int, java.lang.Integer, X.1sk, X.1sl, X.08l, java.lang.Boolean, boolean):void");
    }

    public static void A1G(AnonymousClass092 anonymousClass092, C40551sS c40551sS) {
        Map map;
        boolean z = c40551sS.A03;
        if (!z && !C002701i.A1R(anonymousClass092)) {
            throw new IllegalArgumentException("message not completely loaded");
        }
        if (anonymousClass092 instanceof AnonymousClass099) {
            byte b = anonymousClass092.A0m;
            if (b != 15) {
                if (anonymousClass092.A10() || b == 36) {
                    C40541sR c40541sR = c40551sS.A01;
                    C40751so c40751so = (C40751so) ((C40531sQ) c40541sR.A00).A0s().AVX();
                    C40541sR c40541sR2 = (C40541sR) c40751so.A04().AVX();
                    ((AnonymousClass099) anonymousClass092).A5o(new C40551sS(c40551sS.A00, c40541sR2, c40551sS.A04, z, c40551sS.A02, c40551sS.A05));
                    c40751so.A02();
                    C40741sn.A09((C40741sn) c40751so.A00, (C40531sQ) c40541sR2.A01());
                    c40541sR.A02();
                    C40531sQ.A0M((C40531sQ) c40541sR.A00, (C40741sn) c40751so.A01());
                    return;
                } else if (anonymousClass092.A0f && (map = anonymousClass092.A0e) != null) {
                    for (C0CM c0cm : map.values()) {
                        if (c0cm.expiration > 0) {
                            C40541sR c40541sR3 = c40551sS.A01;
                            C40751so c40751so2 = (C40751so) ((C40531sQ) c40541sR3.A00).A0s().AVX();
                            C40541sR c40541sR22 = (C40541sR) c40751so2.A04().AVX();
                            ((AnonymousClass099) anonymousClass092).A5o(new C40551sS(c40551sS.A00, c40541sR22, c40551sS.A04, z, c40551sS.A02, c40551sS.A05));
                            c40751so2.A02();
                            C40741sn.A09((C40741sn) c40751so2.A00, (C40531sQ) c40541sR22.A01());
                            c40541sR3.A02();
                            C40531sQ.A0M((C40531sQ) c40541sR3.A00, (C40741sn) c40751so2.A01());
                            return;
                        }
                    }
                }
            }
            ((AnonymousClass099) anonymousClass092).A5o(c40551sS);
            return;
        }
        StringBuilder A0P = C000200d.A0P("MessageUtil/buildE2EMessage/error unrecognized media type during send, message.key=");
        A0P.append(anonymousClass092.A0n);
        A0P.append("; media_wa_type=");
        byte b2 = anonymousClass092.A0m;
        A0P.append((int) b2);
        A0P.append("; media_wa_type=");
        C000200d.A1G(A0P, b2);
    }

    public static void A1H(C0D3 c0d3, C05W c05w, ActivityC02330At activityC02330At, int i) {
        AbstractCollection abstractCollection = (AbstractCollection) c0d3.A04();
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            UserJid of = UserJid.of(((C0D4) it.next()).A02);
            if (of != null) {
                arrayList.add(of);
            }
        }
        A1E(c05w, null, arrayList, arrayList.size() <= 8 ? new ArrayList(arrayList) : null, activityC02330At, false, i);
    }

    public static void A1I(ArrayList arrayList, int i, int i2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C40611sY c40611sY = (C40611sY) it.next();
            int i3 = c40611sY.A00;
            if (i3 > i) {
                c40611sY.A00 = i3 - i2;
            }
            int i4 = c40611sY.A01;
            if (i4 > i) {
                c40611sY.A01 = i4 - i2;
            }
        }
    }

    public static void A1J(boolean expression, String errorMessageTemplate, Object... args) {
        if (!expression) {
            throw new IllegalStateException(String.format(errorMessageTemplate, args));
        }
    }

    public static boolean A1K(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean A1L(Context context) {
        return A02(context) == 0;
    }

    public static boolean A1M(PackageInfo packageInfo) {
        String str;
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            str = A0Z(signatureArr[0]);
        } else {
            str = null;
        }
        return C40761sp.A00.contains(str);
    }

    public static boolean A1N(C01B c01b) {
        return c01b.A07(C01C.A3E) >= 2 && c01b.A07(C01C.A3F) >= 2;
    }

    public static boolean A1O(C01B c01b) {
        return c01b.A07(C01C.A3E) >= 2;
    }

    public static boolean A1P(C01B c01b, C000500h c000500h) {
        return A1N(c01b) && !c01b.A0E(C01C.A1E) && c000500h.A00.getInt("joinable_call_education_shown_count", 0) < 1;
    }

    public static boolean A1Q(C01B c01b, CallInfo callInfo) {
        return A1O(c01b) && callInfo.isInLonelyState();
    }

    public static boolean A1R(C02E c02e, C02O c02o, CharSequence charSequence) {
        return (charSequence == null || AnonymousClass024.A0j(A0Q(c02e, c02o, charSequence))) ? false : true;
    }

    public static boolean A1S(C0D5 c0d5) {
        return c0d5.A04() == 5;
    }

    public static boolean A1T(AnonymousClass092 anonymousClass092, C0CM c0cm) {
        if (c0cm == null) {
            return false;
        }
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (C003101m.A0b(abstractC005302j) || C003101m.A0U(abstractC005302j)) {
            return true;
        }
        return C003101m.A0Q(abstractC005302j) && C0D6.A00(anonymousClass092.A08, 4) >= 0;
    }

    public static boolean A1U(AnonymousClass092 anonymousClass092, C0CM c0cm, byte[] bArr) {
        return anonymousClass092.A0C() != null || anonymousClass092.A14(1024) || anonymousClass092.A14(1) || !(TextUtils.isEmpty(anonymousClass092.A0W) || TextUtils.isEmpty(anonymousClass092.A0V)) || anonymousClass092.A12() || A1T(anonymousClass092, c0cm) || (bArr != null && C003101m.A0Q(anonymousClass092.A0n.A00));
    }

    public static boolean A1V(C03X c03x, int i, String str, double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            c03x.A01(7, "markerId:%d, annotationKey:%s, value:%s", Integer.valueOf(i), str, Double.toString(d));
            return false;
        }
        return true;
    }

    public static boolean A1W(CallInfo callInfo) {
        if (Voip.A09(callInfo)) {
            return callInfo.videoEnabled || (Build.MODEL.equals("Nokia 3.1 Plus") && Build.VERSION.SDK_INT == 28);
        }
        return false;
    }

    public static boolean A1X(String str) {
        String queryParameter;
        return (TextUtils.isEmpty(str) || (queryParameter = Uri.parse(str).getQueryParameter("src")) == null || !queryParameter.equals("qr")) ? false : true;
    }

    public static boolean A1Y(List list, List list2) {
        if (list == null) {
            return list2 == null || list2.isEmpty();
        } else if (list2 == null) {
            return list.isEmpty();
        } else {
            if (list.isEmpty() || list2.isEmpty()) {
                return list.isEmpty() && list2.isEmpty();
            }
            return new HashSet(list).equals(new HashSet(list2));
        }
    }

    public static boolean A1Z(C02640Cf c02640Cf, byte[] bArr, byte[] bArr2) {
        return C40631sa.A00().A03(c02640Cf.A00, bArr, bArr2);
    }

    public static boolean A1a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A1b(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
            if (obj != null && obj2 != null && obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] A1c(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static byte[] A1e(Collection collection) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write((byte[]) it.next());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] A1f(C02640Cf c02640Cf, InterfaceC02660Ch interfaceC02660Ch) {
        if (5 == interfaceC02660Ch.getType()) {
            return C40631sa.A00().A04(c02640Cf.A00, ((C40651sc) interfaceC02660Ch).A00);
        }
        throw new C02650Cg("Public and private keys must be of the same type!");
    }

    public static byte[] A1g(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static byte[] A1h(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static int[] A1i(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = bArr[i4] & 255;
            int i7 = i4 + 1;
            int i8 = bArr[i7] & 255;
            int i9 = i + i4;
            int i10 = bArr[i9] & 255;
            int i11 = i9 + 1;
            int i12 = bArr[i11] & 255;
            int i13 = i3 + i5;
            int i14 = bArr[i13] & 255;
            int i15 = bArr[(i3 >> 2) + i13] & 255;
            if (!z) {
                i14 = i15;
                i15 = i14;
            }
            int i16 = i14 - 128;
            int i17 = i15 - 128;
            iArr[i4] = A00(i6, i16, i17);
            iArr[i7] = A00(i8, i16, i17);
            iArr[i9] = A00(i10, i16, i17);
            iArr[i11] = A00(i12, i16, i17);
            if (i4 != 0 && (i4 + 2) % i == 0) {
                i4 = i9;
            }
            i4 += 2;
            i5++;
        }
        return iArr;
    }

    public static Signature[] A1j(Context context) {
        String packageName = context.getPackageName();
        if (context.getPackageManager() != null) {
            try {
                return context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    public static byte[][] A1k(byte[] bArr) {
        System.arraycopy(bArr, 0, r3[0], 0, 32);
        byte[][] bArr2 = {new byte[32], new byte[32]};
        System.arraycopy(bArr, 32, bArr2[1], 0, 32);
        return bArr2;
    }

    public static byte[][] A1l(byte[] bArr, int i, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            int i4 = i + i2;
            if (bArr.length >= i4 + i3) {
                System.arraycopy(bArr, 0, r3[0], 0, i);
                System.arraycopy(bArr, i, r3[1], 0, i2);
                byte[][] bArr2 = {new byte[i], new byte[i2], new byte[i3]};
                System.arraycopy(bArr, i4, bArr2[2], 0, i3);
                return bArr2;
            }
        }
        StringBuilder A0P = C000200d.A0P("Input too small: ");
        A0P.append(C40771sq.A00(bArr));
        throw new ParseException(A0P.toString(), 0);
    }
}
