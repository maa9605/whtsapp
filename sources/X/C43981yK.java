package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1yK */
/* loaded from: classes2.dex */
public final class C43981yK {
    public static boolean A0F(int i) {
        return i >= 126980 && i <= 129750;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x000c, code lost:
        if (r8 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x002d, code lost:
        if (r2 != r8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(int r14, int r15, int r16, long r17) {
        /*
            r8 = r16
            r0 = -1
            r7 = 2147483647(0x7fffffff, float:NaN)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == r0) goto Le
            r2 = r8
            if (r8 != r0) goto L11
        Le:
            r8 = 2147483647(0x7fffffff, float:NaN)
        L11:
            r3 = -1
            r13 = 0
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 != 0) goto L94
            r9 = r13
        L19:
            r0 = 2
            r4 = 0
            r10 = 1
            if (r2 < r0) goto L2f
            if (r8 < r0) goto L2f
            if (r9 == 0) goto L2c
            long r11 = r9.longValue()
            r5 = 0
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2f
        L2c:
            r1 = 1
            if (r2 == r8) goto L30
        L2f:
            r1 = 0
        L30:
            java.lang.String r0 = "bitmaputils/bitmapspec/wrong/"
            java.lang.String r3 = ","
            java.lang.StringBuilder r0 = X.C000200d.A0R(r0, r2, r3, r8, r3)
            r0.append(r9)
            r0.append(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            X.C000700j.A08(r1, r0)
            if (r1 != 0) goto L90
            r8 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
        L4e:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            if (r14 < 0) goto L58
            if (r15 < 0) goto L58
            r4 = 1
        L58:
            java.lang.String r1 = "bitmaputils/wrong raw image/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r14)
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            X.C000700j.A08(r4, r0)
            if (r4 == 0) goto La8
            int r9 = r2.inSampleSize
            if (r13 == 0) goto L99
            r1 = r14
            r0 = r15
        L77:
            long r3 = (long) r1
            long r5 = (long) r0
            long r3 = r3 * r5
            long r5 = r13.longValue()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L99
            r2 = 2
            int r1 = r1 + (-1)
            int r1 = r1 / r2
            int r1 = r1 + 1
            int r0 = r0 + (-1)
            int r0 = r0 / r2
            int r0 = r0 + 1
            int r10 = r10 << 1
            goto L77
        L90:
            r13 = r9
            r7 = r2
            r11 = 1
            goto L4e
        L94:
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            goto L19
        L99:
            if (r11 == 0) goto La0
            int r14 = java.lang.Math.max(r14, r15)
            r15 = r14
        La0:
            int r0 = java.lang.Math.max(r9, r10)
            int r10 = X.C002701i.A02(r14, r15, r7, r8, r0)
        La8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43981yK.A00(int, int, int, long):int");
    }

    public static int A01(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return A02(charSequence, 0, charSequence.length());
    }

    public static int A02(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        if (length == 0) {
            return 0;
        }
        C43931yF c43931yF = new C43931yF(charSequence);
        while (i < i2) {
            i += c43931yF.A01(i);
            i3++;
        }
        return i3;
    }

    public static Bitmap A03(int i, long j, ParcelFileDescriptor parcelFileDescriptor) {
        int i2;
        int i3;
        try {
            if (parcelFileDescriptor == null) {
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                options.inJustDecodeBounds = true;
                C61002vR.A00().A02(fileDescriptor, options);
                if (!options.mCancel && (i2 = options.outWidth) != -1 && (i3 = options.outHeight) != -1) {
                    options.inSampleSize = A00(i2, i3, i, j);
                    options.inJustDecodeBounds = false;
                    options.inDither = false;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    return C61002vR.A00().A02(fileDescriptor, options);
                }
                try {
                    parcelFileDescriptor.close();
                } catch (Throwable unused) {
                }
                return null;
            } catch (OutOfMemoryError e) {
                Log.e("Util", "Got oom exception ", e);
                try {
                    parcelFileDescriptor.close();
                } catch (Throwable unused2) {
                }
                return null;
            }
        } finally {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable unused3) {
            }
        }
    }

    public static C2CI A04(String str) {
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(str, i);
            i += Character.charCount(codePointAt);
            iArr[i2] = codePointAt;
            i2++;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return new C2CI(iArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x002a, code lost:
        if (r2 != 29) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.AbstractC53492h0 A05(X.AnonymousClass097 r10, X.C42471vn r11) {
        /*
            r0 = r10
            X.09H r1 = r10.A02
            if (r1 == 0) goto L2c
            java.io.File r5 = r1.A0F
            if (r5 == 0) goto L2c
            byte r2 = r10.A0m
            r1 = 1
            if (r2 == r1) goto L6b
            r1 = 2
            if (r2 == r1) goto L5f
            r1 = 3
            if (r2 == r1) goto L53
            r1 = 9
            if (r2 == r1) goto L42
            r1 = 13
            if (r2 == r1) goto L36
            r1 = 25
            if (r2 == r1) goto L6b
            r1 = 26
            if (r2 == r1) goto L42
            r1 = 28
            if (r2 == r1) goto L53
            r1 = 29
            if (r2 == r1) goto L36
        L2c:
            long r1 = r10.A0E
            X.3KH r3 = new X.3KH
            r3.<init>(r1)
        L33:
            r3.A00 = r0
            return r3
        L36:
            long r6 = r10.A0E
            int r1 = r10.A00
            long r8 = (long) r1
            X.3KE r3 = new X.3KE
            r4 = r3
            r4.<init>(r5, r6, r8)
            goto L33
        L42:
            long r6 = r10.A0E
            r1 = r0
            X.09E r1 = (X.C09E) r1
            int r1 = r1.A00
            long r8 = (long) r1
            java.lang.String r10 = r10.A07
            r4 = r11
            X.3KD r3 = new X.3KD
            r3.<init>(r4, r5, r6, r8, r10)
            goto L33
        L53:
            long r6 = r10.A0E
            int r1 = r10.A00
            long r8 = (long) r1
            X.3KI r3 = new X.3KI
            r4 = r3
            r4.<init>(r5, r6, r8)
            goto L33
        L5f:
            long r6 = r10.A0E
            int r1 = r10.A00
            long r8 = (long) r1
            X.3KC r3 = new X.3KC
            r4 = r3
            r4.<init>(r5, r6, r8)
            goto L33
        L6b:
            long r1 = r10.A0E
            X.3KF r3 = new X.3KF
            r3.<init>(r5, r1)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43981yK.A05(X.097, X.1vn):X.2h0");
    }

    public static String A06(Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append("-gallery_thumb");
        return sb.toString();
    }

    public static String A07(String str, String str2, String str3, String str4) {
        String A0H = C000200d.A0H("https://static.whatsapp.net/downloadable?category=", str);
        if (str2 != null) {
            A0H = C000200d.A0I(A0H, "&locale=", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A0H = C000200d.A0I(A0H, "&existing_id=", str3);
        }
        return !TextUtils.isEmpty(str4) ? C000200d.A0I(A0H, "&version=", str4) : A0H;
    }

    public static String A08(Map map) {
        if (map == null || map.isEmpty()) {
            return "https://static.whatsapp.net/downloadable?";
        }
        Uri.Builder buildUpon = Uri.parse("https://static.whatsapp.net/downloadable?").buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public static void A09(AbstractC000600i abstractC000600i, C02590Ca c02590Ca, C2KE c2ke, String str) {
        int i;
        Pair pair;
        String str2;
        C02590Ca A0D = c02590Ca.A0D(str);
        if (A0D != null) {
            List<C02590Ca> A0H = A0D.A0H("participant");
            ArrayList arrayList = new ArrayList();
            A0B(abstractC000600i, UserJid.class, A0D, arrayList, "participant", "jid");
            ArrayList arrayList2 = new ArrayList();
            A0E(A0D, arrayList2, "participant", "type");
            ArrayList arrayList3 = new ArrayList();
            A0E(A0D, arrayList3, "participant", "error");
            ArrayList arrayList4 = new ArrayList();
            for (C02590Ca c02590Ca2 : A0H) {
                C02590Ca A0D2 = c02590Ca2.A0D("add_request");
                if (A0D2 == null) {
                    arrayList4.add(null);
                } else {
                    C04P A0A = A0D2.A0A("code");
                    if (A0A != null) {
                        str2 = A0A.A03;
                    } else {
                        str2 = null;
                    }
                    C04P A0A2 = A0D2.A0A("expiration");
                    arrayList4.add(new Pair(str2, A0A2 != null ? A0A2.A03 : null));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                String str3 = (String) arrayList3.get(i2);
                if (str3 != null) {
                    try {
                        i = Integer.valueOf(str3).intValue();
                    } catch (Exception unused) {
                        i = 499;
                    }
                    c2ke.A01.put(obj, Integer.valueOf(i));
                    if (i == 403 && (pair = (Pair) arrayList4.get(i2)) != null) {
                        try {
                            c2ke.A02.put(obj, new C70693Tg((String) pair.first, Long.valueOf((String) pair.second).longValue()));
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    Object obj2 = arrayList2.get(i2);
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    c2ke.A03.put(obj, obj2);
                }
            }
            return;
        }
        throw null;
    }

    public static void A0A(AbstractC000600i abstractC000600i, C02590Ca c02590Ca, Map map, Map map2, String str) {
        int i;
        C02590Ca A0D = c02590Ca.A0D(str);
        if (A0D != null) {
            ArrayList arrayList = new ArrayList();
            A0B(abstractC000600i, UserJid.class, A0D, arrayList, "participant", "jid");
            ArrayList arrayList2 = new ArrayList();
            A0E(A0D, arrayList2, "participant", "type");
            ArrayList arrayList3 = new ArrayList();
            A0E(A0D, arrayList3, "participant", "error");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                String str2 = (String) arrayList3.get(i2);
                if (str2 != null) {
                    try {
                        i = Integer.valueOf(str2);
                    } catch (Exception unused) {
                        i = 499;
                    }
                    map2.put(obj, i);
                } else {
                    Object obj2 = arrayList2.get(i2);
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    map.put(obj, obj2);
                }
            }
            return;
        }
        throw null;
    }

    public static void A0B(AbstractC000600i abstractC000600i, Class cls, C02590Ca c02590Ca, List list, String str, String str2) {
        for (C02590Ca c02590Ca2 : c02590Ca.A0H(str)) {
            list.add(c02590Ca2.A08(cls, str2, abstractC000600i));
        }
    }

    public static void A0C(AnonymousClass011 anonymousClass011, C2MQ c2mq) {
        int i;
        C36901lY c36901lY = new C36901lY();
        if (!(c2mq instanceof C53702hN)) {
            i = 0;
        } else {
            i = 1;
        }
        c36901lY.A00 = Integer.valueOf(i);
        anonymousClass011.A0B(c36901lY, null, false);
    }

    public static void A0D(C51682Xk c51682Xk, InterfaceC52102a4 interfaceC52102a4, Bitmap bitmap, int i, Drawable drawable, boolean z) {
        AnonymousClass097 anonymousClass097;
        Context context = c51682Xk.getContext();
        if (bitmap == null) {
            c51682Xk.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int type = interfaceC52102a4.getType();
            if (type == 0) {
                c51682Xk.setBackgroundColor(i);
                c51682Xk.setImageResource(R.drawable.ic_missing_thumbnail_picture);
                return;
            } else if (type == 1 || type == 2) {
                c51682Xk.setBackgroundColor(i);
                c51682Xk.setImageResource(R.drawable.ic_missing_thumbnail_video);
                return;
            } else if (type != 3) {
                if (type != 4) {
                    c51682Xk.setBackgroundColor(i);
                    c51682Xk.setImageResource(0);
                    return;
                }
                c51682Xk.setBackgroundColor(i);
                c51682Xk.setImageDrawable(C460324r.A05(context, interfaceC52102a4.ABN(), null, true));
                return;
            } else {
                InterfaceC52102a4 interfaceC52102a42 = c51682Xk.A04;
                if ((interfaceC52102a42 instanceof AbstractC53492h0) && (anonymousClass097 = ((AbstractC53492h0) interfaceC52102a42).A00) != null && ((AnonymousClass092) anonymousClass097).A04 == 1) {
                    c51682Xk.setBackgroundColor(C02160Ac.A00(context, R.color.action_mode));
                    c51682Xk.setImageResource(R.drawable.icon_ppt_large);
                    return;
                }
                c51682Xk.setBackgroundColor(C02160Ac.A00(context, R.color.music_scrubber));
                c51682Xk.setImageResource(R.drawable.icon_audio_large);
                return;
            }
        }
        c51682Xk.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c51682Xk.setBackgroundColor(0);
        c51682Xk.A00 = bitmap;
        if (z) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(context.getResources(), bitmap)});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(150);
            c51682Xk.setImageDrawable(transitionDrawable);
            return;
        }
        c51682Xk.setImageBitmap(bitmap);
    }

    public static void A0E(C02590Ca c02590Ca, List list, String str, String str2) {
        String str3;
        for (C02590Ca c02590Ca2 : c02590Ca.A0H(str)) {
            C04P A0A = c02590Ca2.A0A(str2);
            if (A0A != null) {
                str3 = A0A.A03;
            } else {
                str3 = null;
            }
            list.add(str3);
        }
    }

    public static boolean A0G(String str) {
        char[] charArray;
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_') {
                return false;
            }
        }
        return true;
    }

    public static boolean A0H(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
