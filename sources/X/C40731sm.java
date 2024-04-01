package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1sm */
/* loaded from: classes2.dex */
public final class C40731sm {
    public static int A00(C02590Ca c02590Ca) {
        int i = 0;
        try {
            C02590Ca A0D = c02590Ca.A0D("ephemeral");
            if (A0D != null) {
                i = A0D.A05("expiration", 0);
                return i;
            }
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("GroupProtocolTreeNodeHelper/getEphemeralDuration ");
            A0P.append(e.getMessage());
            Log.e(A0P.toString(), e);
        }
        return i;
    }

    public static int A01(C02590Ca c02590Ca) {
        Pair A09 = A09(c02590Ca);
        if (A09 != null) {
            return ((Number) A09.first).intValue();
        }
        return 0;
    }

    public static int A02(String str) {
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode != 49) {
            if (hashCode == 50 && str.equals("2")) {
                return 2;
            }
        } else if (str.equals("1")) {
            return 1;
        }
        return 0;
    }

    public static int A03(String str) {
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode != 49) {
            if (hashCode == 50 && str.equals("2")) {
                return 2;
            }
        } else if (str.equals("1")) {
            return 1;
        }
        return 0;
    }

    public static long A04(C012005w c012005w, C25N c25n) {
        long A02 = AnonymousClass024.A02(c012005w.A0D(), null);
        C44301yq c44301yq = c25n.A01;
        c44301yq.A0I("STORAGE_USAGE_MEDIA_SIZE", String.valueOf(A02));
        c44301yq.A0I("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME", String.valueOf(c25n.A00.A05()));
        return A02;
    }

    public static long A05(C02590Ca c02590Ca) {
        String str;
        C04P A0A = c02590Ca.A0A("last");
        if (A0A != null && (str = A0A.A03) != null) {
            if ("deny".equals(str) || "error".equals(str) || "none".equals(str)) {
                return 0L;
            }
            return Long.parseLong(str) * 1000;
        }
        return System.currentTimeMillis();
    }

    public static ValueAnimator A06(final View view, int i, final Runnable runnable) {
        int height = view.getHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(height, i);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3SY
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = intValue;
                    view2.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new C015207d());
        ofInt.setDuration(Math.abs(height - i) >> 3);
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: X.2gq
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        return ofInt;
    }

    public static Dialog A07(final Activity activity, final C018508q c018508q, C40081rY c40081rY, final C018608r c018608r, final C002301c c002301c, final Set set, final InterfaceC53402gr interfaceC53402gr) {
        String A0A;
        if (set != null && !set.isEmpty()) {
            if (set.size() == 1) {
                A0A = activity.getString(R.string.delete_status_confirmation);
            } else {
                A0A = c002301c.A0A(R.plurals.delete_status_confirmation_multiple, set.size(), Integer.valueOf(set.size()));
            }
            C019208x c019208x = new C019208x(activity);
            C019308y c019308y = c019208x.A01;
            c019308y.A0J = true;
            c019308y.A0E = C002701i.A0g(A0A, activity, c40081rY);
            c019208x.A06(R.string.delete, new DialogInterface.OnClickListener() { // from class: X.3SZ
                public final /* synthetic */ int A00 = 13;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Activity activity2 = activity;
                    int i2 = this.A00;
                    C018608r c018608r2 = c018608r;
                    Set set2 = set;
                    C018508q c018508q2 = c018508q;
                    C002301c c002301c2 = c002301c;
                    InterfaceC53402gr interfaceC53402gr2 = interfaceC53402gr;
                    C002701i.A18(activity2, i2);
                    c018608r2.A0j(set2, true);
                    if (set2.size() == 1) {
                        c018508q2.A07(R.string.status_deleted, 0);
                    } else {
                        c018508q2.A0E(c002301c2.A0A(R.plurals.statuses_deleted, set2.size(), Integer.valueOf(set2.size())), 0);
                    }
                    interfaceC53402gr2.AJE();
                }
            });
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3SX
                public final /* synthetic */ int A00 = 13;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C002701i.A18(activity, this.A00);
                }
            });
            c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3SW
                public final /* synthetic */ int A00 = 13;

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C002701i.A18(activity, this.A00);
                }
            };
            return c019208x.A00();
        }
        Log.e("dialog/delete no statuses");
        return null;
    }

    public static Cursor A08(int i, int i2, AbstractC005302j abstractC005302j, C40411sD c40411sD) {
        String str;
        if (i == 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return c40411sD.A05(abstractC005302j, -1L);
                    }
                    throw new IllegalArgumentException(C000200d.A0D("Unknown sort type: ", i2));
                }
                return c40411sD.A03(abstractC005302j, -1L);
            }
            return c40411sD.A04(abstractC005302j, -1L);
        } else if (i != 1) {
            if (i == 2) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return c40411sD.A05(null, 5000000L);
                        }
                        throw new IllegalArgumentException(C000200d.A0D("Unknown sort type: ", i2));
                    }
                    return c40411sD.A03(null, 5000000L);
                }
                return c40411sD.A04(null, 5000000L);
            }
            throw new IllegalArgumentException(C000200d.A0D("Unknown gallery type: ", i));
        } else if (i2 == 0) {
            if (c40411sD != null) {
                Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDDescCursor:");
                String str2 = C53412gs.A02;
                String[] strArr = {String.valueOf(5)};
                C0CD A03 = c40411sD.A0C.A03();
                try {
                    Cursor A07 = A03.A02.A07(str2, strArr);
                    A03.close();
                    return A07;
                } finally {
                    try {
                        throw th;
                    } finally {
                        try {
                            A03.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            throw null;
        } else if (i2 == 1) {
            if (c40411sD != null) {
                Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDAscCursor:");
                String str3 = C53412gs.A01;
                String[] strArr2 = {String.valueOf(5)};
                C0CD A032 = c40411sD.A0C.A03();
                try {
                    Cursor A072 = A032.A02.A07(str3, strArr2);
                    A032.close();
                    return A072;
                } finally {
                    try {
                        throw th;
                    } finally {
                        try {
                            A032.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            throw null;
        } else if (i2 == 2) {
            if (c40411sD != null) {
                Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedBySizeCursor:");
                C0CD A033 = c40411sD.A0C.A03();
                try {
                    if (c40411sD.A08.A0E()) {
                        str = C0HD.A0G;
                    } else {
                        str = C53412gs.A03;
                    }
                    Cursor A073 = A033.A02.A07(str, new String[]{String.valueOf(5)});
                    A033.close();
                    return A073;
                } finally {
                    try {
                        throw th;
                    } finally {
                        try {
                            A033.close();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
            throw null;
        } else if (i2 != 3) {
            throw new IllegalArgumentException(C000200d.A0D("Unknown sort type: ", i2));
        } else {
            if (c40411sD != null) {
                Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByForwardingScoreCursor_INTERNAL_ONLY:");
                try {
                    return c40411sD.A0C.A03().A02.A07(C53412gs.A00, new String[]{String.valueOf(3)});
                } finally {
                }
            } else {
                throw null;
            }
        }
    }

    public static Pair A09(C02590Ca c02590Ca) {
        String str;
        Iterator it = c02590Ca.A0H("error").iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            C02590Ca c02590Ca2 = (C02590Ca) it.next();
            if (c02590Ca2 != null) {
                C04P A0A = c02590Ca2.A0A("code");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                C04P A0A2 = c02590Ca2.A0A("text");
                String str2 = A0A2 != null ? A0A2.A03 : null;
                if (str != null) {
                    return new Pair(Integer.valueOf(AnonymousClass024.A01(str, 0)), str2);
                }
            }
        }
    }

    public static SparseArray A0A() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(C0M6.A03, new C53422gt(R.id.search_media_filter_link, R.string.search_links, R.drawable.ic_link, 9.0f, 4.0f, 2.0f));
        sparseArray.put(105, new C53422gt(R.id.search_media_filter_image, R.string.search_images, R.drawable.msg_status_image, 9.0f, 4.0f, 0.0f));
        sparseArray.put(97, new C53422gt(R.id.search_media_filter_audio, R.string.search_audio, R.drawable.msg_status_audio, 8.0f, 4.0f, 0.0f));
        sparseArray.put(103, new C53422gt(R.id.search_media_filter_gif, R.string.search_gifs, R.drawable.msg_status_gif, 10.0f, 6.0f, 0.2f));
        sparseArray.put(118, new C53422gt(R.id.search_media_filter_video, R.string.search_videos, R.drawable.msg_status_video, 9.0f, 5.0f, 0.0f));
        sparseArray.put(100, new C53422gt(R.id.search_media_filter_doc, R.string.search_docs, R.drawable.msg_status_doc, 7.0f, 3.0f, 0.0f));
        return sparseArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x00ca, code lost:
        if (r1.equals("wed") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x010e, code lost:
        if (r9.equals("open_24h") == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C09480eA A0B(X.C02590Ca r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40731sm.A0B(X.0Ca):X.0eA");
    }

    public static C05210Nt A0C(UserJid userJid, C02590Ca c02590Ca) {
        String str;
        String str2;
        C04P A0A;
        try {
            C02590Ca A0D = c02590Ca.A0D("profile");
            if (A0D != null) {
                C04P A0A2 = A0D.A0A("tag");
                if (A0A2 != null) {
                    str = A0A2.A03;
                } else {
                    str = null;
                }
                String A0R = A0R(A0D, "address");
                String A0R2 = A0R(A0D, "description");
                String A0R3 = A0R(A0D, "email");
                Double A0M = A0M(A0D, "latitude");
                Double A0M2 = A0M(A0D, "longitude");
                C02590Ca A0D2 = A0D.A0D("vertical");
                if (A0D2 != null && (A0A = A0D2.A0A("canonical")) != null) {
                    str2 = A0A.A03;
                } else {
                    str2 = null;
                }
                List<C02590Ca> A0H = A0D.A0H("website");
                ArrayList arrayList = new ArrayList();
                for (C02590Ca c02590Ca2 : A0H) {
                    arrayList.add(c02590Ca2.A0F());
                }
                C09480eA A0B = A0B(A0D.A0D("business_hours"));
                boolean A0o = A0o(A0D.A0D("catalog_status"));
                C05210Nt c05210Nt = new C05210Nt(userJid);
                c05210Nt.A06 = str;
                c05210Nt.A01 = new C09510eD(A0R, null, new C09500eC(null, null, A0M, A0M2));
                c05210Nt.A03 = A0R2;
                c05210Nt.A04 = A0R3;
                List list = c05210Nt.A0C;
                if (list != arrayList) {
                    list.clear();
                    list.addAll(arrayList);
                }
                c05210Nt.A07 = str2;
                c05210Nt.A00 = A0B;
                c05210Nt.A09 = A0o;
                return c05210Nt;
            }
            return null;
        } catch (NumberFormatException unused) {
            throw new C0L4("business latitude/longitude failed to parse");
        }
    }

    public static C07E A0D(AbstractC000600i abstractC000600i, C02590Ca c02590Ca) {
        HashMap hashMap = new HashMap();
        if (c02590Ca != null) {
            for (C02590Ca c02590Ca2 : c02590Ca.A0H("device")) {
                hashMap.put(c02590Ca2.A09(DeviceJid.class, "jid", abstractC000600i), Long.valueOf(c02590Ca2.A07("key-index", 0L)));
            }
        }
        return new C07E(hashMap, null);
    }

    public static C2F8 A0E() {
        C2F8 A00 = C2F8.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C2MO A0F() {
        if (C2MO.A03 == null) {
            synchronized (C2MO.class) {
                if (C2MO.A03 == null) {
                    C2MO.A03 = new C2MO(C002801j.A00(), AnonymousClass057.A00, C03U.A00());
                }
            }
        }
        C2MO c2mo = C2MO.A03;
        C02180Ae.A1B(c2mo);
        return c2mo;
    }

    public static C53442gv A0G(C40541sR c40541sR, C0PY c0py) {
        C53442gv c53442gv = (C53442gv) c40541sR.A08().A0j().AVX();
        String str = c0py.A00;
        c53442gv.A02();
        C53432gu c53432gu = (C53432gu) c53442gv.A00;
        if (str != null) {
            c53432gu.A00 |= 32;
            c53432gu.A04 = str;
            String str2 = c0py.A01;
            if (!TextUtils.isEmpty(str2)) {
                c53442gv.A02();
                C53432gu c53432gu2 = (C53432gu) c53442gv.A00;
                if (str2 != null) {
                    c53432gu2.A00 |= 64;
                    c53432gu2.A05 = str2;
                } else {
                    throw null;
                }
            }
            List<C0PZ> list = c0py.A02;
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C0PZ c0pz : list) {
                    C0CT AVX = C53452gw.A04.AVX();
                    int i = c0pz.A03;
                    if (i == 1) {
                        C0CT AVX2 = C53462gx.A03.AVX();
                        String str3 = c0pz.A05;
                        AVX2.A02();
                        C53462gx c53462gx = (C53462gx) AVX2.A00;
                        if (str3 != null) {
                            c53462gx.A00 |= 2;
                            c53462gx.A02 = str3;
                            String str4 = c0pz.A04;
                            AVX2.A02();
                            C53462gx c53462gx2 = (C53462gx) AVX2.A00;
                            if (str4 != null) {
                                c53462gx2.A00 |= 1;
                                c53462gx2.A01 = str4;
                                AVX.A02();
                                C53452gw c53452gw = (C53452gw) AVX.A00;
                                if (c53452gw != null) {
                                    c53452gw.A03 = AVX2.A01();
                                    c53452gw.A01 = 1;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else if (i == 3) {
                        C0CT AVX3 = C53472gy.A03.AVX();
                        String str5 = c0pz.A04;
                        AVX3.A02();
                        C53472gy c53472gy = (C53472gy) AVX3.A00;
                        if (str5 != null) {
                            c53472gy.A00 |= 1;
                            c53472gy.A01 = str5;
                            String str6 = c0pz.A05;
                            AVX3.A02();
                            C53472gy c53472gy2 = (C53472gy) AVX3.A00;
                            if (str6 != null) {
                                c53472gy2.A00 |= 2;
                                c53472gy2.A02 = str6;
                                AVX.A02();
                                C53452gw c53452gw2 = (C53452gw) AVX.A00;
                                if (c53452gw2 != null) {
                                    c53452gw2.A03 = AVX3.A01();
                                    c53452gw2.A01 = 3;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else if (i == 2) {
                        C0CT AVX4 = C53482gz.A03.AVX();
                        String str7 = c0pz.A04;
                        AVX4.A02();
                        C53482gz c53482gz = (C53482gz) AVX4.A00;
                        if (str7 != null) {
                            c53482gz.A00 |= 1;
                            c53482gz.A01 = str7;
                            String str8 = c0pz.A05;
                            AVX4.A02();
                            C53482gz c53482gz2 = (C53482gz) AVX4.A00;
                            if (str8 != null) {
                                c53482gz2.A00 |= 2;
                                c53482gz2.A02 = str8;
                                C0AZ A01 = AVX4.A01();
                                AVX.A02();
                                C53452gw c53452gw3 = (C53452gw) AVX.A00;
                                if (A01 != null) {
                                    c53452gw3.A03 = A01;
                                    c53452gw3.A01 = 2;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        continue;
                    }
                    int i2 = c0pz.A02;
                    AVX.A02();
                    C53452gw c53452gw4 = (C53452gw) AVX.A00;
                    c53452gw4.A00 |= 8;
                    c53452gw4.A02 = i2;
                    arrayList.add(AVX.A01());
                }
                c53442gv.A02();
                C53432gu c53432gu3 = (C53432gu) c53442gv.A00;
                C0CX c0cx = c53432gu3.A02;
                if (!((C0CY) c0cx).A00) {
                    c53432gu3.A02 = C0AZ.A05(c0cx);
                }
                C0Aa.A08(arrayList, c53432gu3.A02);
            }
            return c53442gv;
        }
        throw null;
    }

    public static C010805j A0H(C02590Ca c02590Ca) {
        String str;
        int i;
        C04P A0A = c02590Ca.A0A("v");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        if (!"1".equals(str) && !"2".equals(str)) {
            throw new C0L4(C000200d.A0H("invalid encrypted node version provided: ", str));
        }
        int parseInt = Integer.parseInt(str);
        C04P A0A2 = c02590Ca.A0A("type");
        String str2 = A0A2 != null ? A0A2.A03 : null;
        if ("msg".equals(str2)) {
            i = 0;
        } else if ("pkmsg".equals(str2)) {
            i = 1;
        } else if ("skmsg".equals(str2)) {
            i = 2;
        } else if (!"frskmsg".equals(str2)) {
            throw new C0L4(C000200d.A0H("invalid encrypted node type provided: ", str2));
        } else {
            i = 3;
        }
        return new C010805j(parseInt, i, c02590Ca.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C04410Kb A0I(X.AbstractC000600i r6, X.C02590Ca r7, X.C02590Ca r8) {
        /*
            java.lang.String r0 = "description"
            X.0Ca r4 = r7.A0D(r0)
            if (r4 != 0) goto Lb
            X.0Kb r0 = X.C04410Kb.A04
            return r0
        Lb:
            java.lang.String r0 = "body"
            X.0Ca r3 = r4.A0D(r0)
            java.lang.String r0 = "delete"
            X.0Ca r2 = r4.A0D(r0)
            if (r3 == 0) goto L3f
            if (r2 == 0) goto L3f
            java.lang.String r0 = "Node: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " contains both a body and delete child: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.0L4 r0 = new X.0L4
            r0.<init>(r1)
            throw r0
        L3f:
            X.04P[] r0 = r4.A0I()
            if (r0 == 0) goto L79
            int r0 = r0.length
            if (r0 == 0) goto L79
            if (r3 != 0) goto L7e
            java.lang.String r7 = ""
        L4c:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L77
            java.lang.String r0 = "id"
            X.04P r0 = r4.A0A(r0)
            if (r0 == 0) goto L77
            java.lang.String r3 = r0.A03
        L5d:
            if (r8 == 0) goto L89
            r0 = 0
            java.lang.String r2 = "t"
            long r4 = r8.A07(r2, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r6 = r8.A08(r1, r0, r6)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.0Kb r2 = new X.0Kb
            r2.<init>(r3, r4, r6, r7)
            return r2
        L77:
            r3 = r1
            goto L5d
        L79:
            if (r3 != 0) goto L7e
            X.0Kb r0 = X.C04410Kb.A04
            return r0
        L7e:
            java.lang.String r0 = r3.A0F()
            if (r0 == 0) goto L8a
            java.lang.String r7 = r3.A0F()
            goto L4c
        L89:
            throw r1
        L8a:
            java.lang.String r1 = "Non-empy description tag with no body"
            X.0L4 r0 = new X.0L4
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40731sm.A0I(X.00i, X.0Ca, X.0Ca):X.0Kb");
    }

    public static C04980Ms A0J(C0JM c0jm, C2AW c2aw, C011605s c011605s) {
        String str;
        C2CG A01;
        if (c0jm.A02() && (A01 = c2aw.A01(c0jm.A0B)) != null) {
            String str2 = null;
            byte[] bArr = A01.A00;
            if (bArr != null && bArr.length > 0) {
                str2 = Base64.encodeToString(bArr, 3);
            }
            return new C04980Ms(A01.A09, A01.A05, A01.A04, A01.A06, A01.A08, str2, A01.A01, A01.A03, A01.A02);
        }
        int i = c0jm.A00;
        if (i == 0 && (str = c0jm.A08) != null) {
            i = (int) new File(str).length();
        }
        String str3 = c0jm.A0E;
        String str4 = c0jm.A07;
        String str5 = c0jm.A05;
        String str6 = c0jm.A0B;
        C04980Ms c04980Ms = new C04980Ms(str3, str4, str5, str6, c0jm.A0A, c0jm.A09, i, c0jm.A03, c0jm.A02);
        synchronized (c011605s.A0H) {
            C06F c06f = c011605s.A01;
            if (c06f == null) {
                c06f = new C06F(60);
                c011605s.A01 = c06f;
            }
            c06f.A08(str6, c0jm);
        }
        return c04980Ms;
    }

    public static C25P A0K(List list, Integer num, Long l, C42471vn c42471vn, C0C9 c0c9) {
        if (num == null || l == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass092 A0C = c0c9.A0C(((Number) it.next()).longValue());
                if (A0C instanceof AnonymousClass097) {
                    AnonymousClass097 anonymousClass097 = (AnonymousClass097) A0C;
                    if (!anonymousClass097.A1F()) {
                        return null;
                    }
                    arrayList.add(C43981yK.A05(anonymousClass097, c42471vn));
                }
            }
        }
        return new C25P(arrayList, num.intValue(), l.longValue());
    }

    public static CharSequence A0L(C09G c09g, C002301c c002301c) {
        if (!C0DB.A0n(c09g) && !C0DB.A0o(c09g)) {
            int i = ((AnonymousClass097) c09g).A00;
            if (i != 0) {
                return AnonymousClass029.A0g(c002301c, i);
            }
            return C02180Ae.A0k(c002301c, ((AnonymousClass097) c09g).A01);
        }
        return AnonymousClass029.A0g(c002301c, ((AnonymousClass097) c09g).A00);
    }

    public static Double A0M(C02590Ca c02590Ca, String str) {
        C02590Ca A0D = c02590Ca.A0D(str);
        if (A0D == null || A0D.A0F() == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(A0D.A0F()));
    }

    public static String A0N(int i, AnonymousClass011 anonymousClass011) {
        String obj = UUID.randomUUID().toString();
        C09520eE c09520eE = new C09520eE();
        A0e(c09520eE, 1, obj, i);
        anonymousClass011.A0B(c09520eE, null, false);
        return obj;
    }

    public static String A0O(Context context, C002301c c002301c) {
        return context.getString(R.string.storage_usage_large_files_title, c002301c.A09(280, 5L, String.format(context.getResources().getConfiguration().locale, "%d", 5L)));
    }

    public static String A0P(AnonymousClass092 anonymousClass092) {
        String A0Q = A0Q(anonymousClass092);
        if (TextUtils.isEmpty(A0Q)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(A0Q);
        C05530Pc c05530Pc = anonymousClass092.A0D().A00;
        if (!TextUtils.isEmpty(c05530Pc.A01)) {
            sb.append("\n");
            sb.append(c05530Pc.A01);
        }
        return sb.toString();
    }

    public static String A0Q(AnonymousClass092 anonymousClass092) {
        C05530Pc c05530Pc;
        if (!anonymousClass092.A11() || (c05530Pc = anonymousClass092.A0D().A00) == null || TextUtils.isEmpty(c05530Pc.A00)) {
            return null;
        }
        return c05530Pc.A00;
    }

    public static String A0R(C02590Ca c02590Ca, String str) {
        C02590Ca A0D = c02590Ca.A0D(str);
        if (A0D != null) {
            return A0D.A0F();
        }
        return null;
    }

    public static String A0S(String str) {
        Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str);
        return matcher.find() ? C000200d.A0H(matcher.group(1), matcher.group(2)) : str;
    }

    public static String A0T(String str, long j) {
        return !TextUtils.isEmpty(str) ? C0J8.A00(Uri.parse(str).buildUpon(), "_nc_hot", String.valueOf(j / 1000)).build().toString() : str;
    }

    public static String A0U(String str, C05530Pc c05530Pc) {
        StringBuilder sb = new StringBuilder();
        if (c05530Pc == null) {
            return sb.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        String str2 = c05530Pc.A00;
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(str2);
        }
        String str3 = c05530Pc.A01;
        if (!TextUtils.isEmpty(str3)) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public static String A0V(List list) {
        if (list.size() == 0) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0JM c0jm = (C0JM) it.next();
                if (c0jm != null) {
                    String str = c0jm.A0B;
                    String str2 = c0jm.A08;
                    if (str != null) {
                        messageDigest.update(str.getBytes());
                    } else if (str2 != null) {
                        messageDigest.update(str2.getBytes());
                    }
                }
            }
            return AnonymousClass024.A0I(Base64.encodeToString(messageDigest.digest(), 2));
        } catch (NoSuchAlgorithmException unused) {
            Log.e("StickerUtils/handleSHA256ErrorForStickersChecksum/could not get MD5 message digest");
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                C0JM c0jm2 = (C0JM) list.get(i);
                if (c0jm2 != null) {
                    String str3 = c0jm2.A0B;
                    String str4 = c0jm2.A08;
                    if (str3 != null) {
                        strArr[i] = str3;
                    } else if (str4 != null) {
                        strArr[i] = str4;
                    }
                }
            }
            return String.valueOf(Arrays.hashCode(strArr));
        }
    }

    public static String A0W(List list) {
        if (list.size() == 0) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null) {
                    Object obj = pair.first;
                    if (obj != null) {
                        C0JM c0jm = (C0JM) obj;
                        String str = c0jm.A0B;
                        String str2 = c0jm.A08;
                        if (str != null) {
                            messageDigest.update(str.getBytes());
                        } else if (str2 != null) {
                            messageDigest.update(str2.getBytes());
                        }
                    }
                    Object obj2 = pair.second;
                    if (obj2 != null) {
                        messageDigest.update(String.valueOf(obj2).getBytes());
                    }
                }
            }
            return AnonymousClass024.A0I(Base64.encodeToString(messageDigest.digest(), 2));
        } catch (NoSuchAlgorithmException unused) {
            Log.e("StickerUtils/handleSHA256ErrorForWeightedStickersChecksum/could not get MD5 message digest");
            int size = list.size() << 1;
            String[] strArr = new String[size];
            for (int i = 0; i < size; i += 2) {
                Pair pair2 = (Pair) list.get(i >> 1);
                if (pair2 != null) {
                    Object obj3 = pair2.first;
                    if (obj3 != null) {
                        C0JM c0jm2 = (C0JM) obj3;
                        String str3 = c0jm2.A0B;
                        String str4 = c0jm2.A08;
                        if (str3 != null) {
                            strArr[i] = str3;
                        } else if (str4 != null) {
                            strArr[i] = str4;
                        }
                    }
                    Object obj4 = pair2.second;
                    if (obj4 != null) {
                        strArr[i + 1] = String.valueOf(obj4);
                    }
                }
            }
            return String.valueOf(Arrays.hashCode(strArr));
        }
    }

    public static List A0X(HashSet hashSet, List list) {
        C2CI[] c2ciArr;
        if (hashSet == null) {
            return new ArrayList(0);
        }
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0JM c0jm = (C0JM) it.next();
            C04050If c04050If = c0jm.A04;
            if (c04050If != null && (c2ciArr = c04050If.A06) != null) {
                int length = c2ciArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (hashSet.contains(c2ciArr[i])) {
                        arrayList.add(c0jm);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }

    public static SSLSocketFactory A0Y() {
        SSLContext sSLContext;
        if (Build.VERSION.SDK_INT < 21) {
            try {
                sSLContext = SSLContext.getInstance("Default");
            } catch (NoSuchAlgorithmException unused) {
                sSLContext = null;
            }
            if (sSLContext == null) {
                Log.i("socketfactoryutil/failed to create clean sslcontext for prelollipop devices");
                return (SSLSocketFactory) SSLSocketFactory.getDefault();
            }
            return sSLContext.getSocketFactory();
        }
        return (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    public static void A0Z(Context context) {
        Log.i("statusrankingstore/delete-database");
        File databasePath = context.getDatabasePath("statusranking.db");
        boolean delete = databasePath.delete();
        C002501g.A0O(databasePath, "statusrankingstore");
        StringBuilder sb = new StringBuilder("statusrankingstore/delete-database/result=");
        sb.append(delete);
        Log.i(sb.toString());
    }

    public static void A0a(Context context, Chip chip, int i, int i2) {
        C53422gt c53422gt = (C53422gt) A0A().get(i);
        Drawable A0D = C002701i.A0D(context.getResources(), c53422gt.A03, null);
        int A02 = AnonymousClass088.A02(context, c53422gt.A01);
        if (A0D == null) {
            throw null;
        }
        int max = Math.max(A0D.getIntrinsicWidth(), A0D.getIntrinsicHeight());
        int intrinsicWidth = ((max - A0D.getIntrinsicWidth()) >> 1) + A02;
        int intrinsicHeight = ((max - A0D.getIntrinsicHeight()) >> 1) + A02;
        chip.setChipIcon(C02180Ae.A0Q(new InsetDrawable(A0D, intrinsicWidth, intrinsicHeight, intrinsicWidth, intrinsicHeight), C02160Ac.A00(context, i2)));
        chip.setChipIconSize(AnonymousClass088.A02(context, 20.0f));
        chip.setChipStartPadding(AnonymousClass088.A02(context, 1.0f));
        chip.setTextStartPadding(AnonymousClass088.A02(context, 1.0f));
        chip.setIconStartPadding(AnonymousClass088.A02(context, c53422gt.A02));
        chip.setIconEndPadding(AnonymousClass088.A02(context, c53422gt.A00));
    }

    public static void A0b(AbstractC000600i abstractC000600i, C02590Ca c02590Ca, Map map) {
        String str;
        for (C02590Ca c02590Ca2 : c02590Ca.A0H("participant")) {
            Jid A08 = c02590Ca2.A08(UserJid.class, "jid", abstractC000600i);
            if (A08 != null) {
                C04P A0A = c02590Ca2.A0A("type");
                if (A0A != null) {
                    str = A0A.A03;
                    if (str == null) {
                        throw null;
                    }
                } else {
                    str = "";
                }
                map.put(A08, str);
            }
        }
    }

    public static void A0c(AnonymousClass011 anonymousClass011, Activity activity, C0B5 c0b5, int i) {
        c0b5.AUk(R.string.insufficient_storage_dialog_title, R.string.insufficient_storage_dialog_subtitle, R.string.manage_storage_button_text, new C78593kC(activity, A0N(i, anonymousClass011), i), null);
    }

    public static void A0d(AnonymousClass011 anonymousClass011, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3) {
        C09540eH c09540eH = new C09540eH();
        c09540eH.A03 = num;
        c09540eH.A04 = num2;
        c09540eH.A05 = num3;
        c09540eH.A01 = bool;
        c09540eH.A00 = bool2;
        c09540eH.A02 = num4;
        if (bool3.booleanValue()) {
            c09540eH.A06 = 1;
        }
        anonymousClass011.A09(c09540eH, 1);
        AnonymousClass011.A01(c09540eH, "");
    }

    public static void A0e(C09520eE c09520eE, int i, String str, int i2) {
        c09520eE.A01 = Integer.valueOf(i);
        c09520eE.A06 = str;
        c09520eE.A00 = Integer.valueOf(i2);
        c09520eE.A02 = 2;
    }

    public static void A0f(C2GC c2gc, C05530Pc c05530Pc) {
        if (c05530Pc == null) {
            return;
        }
        String str = c05530Pc.A00;
        if (str != null) {
            c2gc.A02();
            C2FI c2fi = (C2FI) c2gc.A00;
            c2fi.A00 |= 32;
            c2fi.A06 = str;
        }
        String str2 = c05530Pc.A01;
        if (str2 != null) {
            c2gc.A02();
            C2FI c2fi2 = (C2FI) c2gc.A00;
            c2fi2.A00 |= 64;
            c2fi2.A07 = str2;
        }
        List<C2D3> list = c05530Pc.A02;
        if (list != null) {
            for (C2D3 c2d3 : list) {
                C0CT AVX = C53522h3.A05.AVX();
                String str3 = c2d3.A04;
                AVX.A02();
                C53522h3 c53522h3 = (C53522h3) AVX.A00;
                if (str3 != null) {
                    c53522h3.A00 |= 1;
                    c53522h3.A04 = str3;
                    EnumC53532h4 enumC53532h4 = c2d3.A01 == 1 ? EnumC53532h4.RESPONSE : EnumC53532h4.UNKNOWN;
                    AVX.A02();
                    C53522h3 c53522h32 = (C53522h3) AVX.A00;
                    if (enumC53532h4 != null) {
                        c53522h32.A00 |= 4;
                        c53522h32.A01 = enumC53532h4.value;
                        C0CT AVX2 = C2h5.A02.AVX();
                        String str4 = c2d3.A03;
                        AVX2.A02();
                        C2h5 c2h5 = (C2h5) AVX2.A00;
                        if (str4 != null) {
                            c2h5.A00 |= 1;
                            c2h5.A01 = str4;
                            C2h5 c2h52 = (C2h5) AVX2.A01();
                            AVX.A02();
                            C53522h3 c53522h33 = (C53522h3) AVX.A00;
                            if (c2h52 != null) {
                                c53522h33.A02 = c2h52;
                                c53522h33.A00 |= 2;
                                C0AZ A01 = AVX.A01();
                                c2gc.A02();
                                C2FI c2fi3 = (C2FI) c2gc.A00;
                                if (A01 != null) {
                                    C0CX c0cx = c2fi3.A03;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        c2fi3.A03 = c0cx;
                                    }
                                    c0cx.add(A01);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public static void A0g(C09G c09g, AudioPlayerView audioPlayerView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, InterfaceC53542h6 interfaceC53542h6) {
        File file;
        C09H c09h = ((AnonymousClass097) c09g).A02;
        if (c09h != null) {
            boolean z = false;
            if (C0DB.A0n(c09g)) {
                audioPlayerView.setPlayButtonState(4);
                audioPlayerView.setOnControlButtonClickListener(onClickListener);
                audioPlayerView.setSeekbarProgress(0);
                interfaceC53542h6.AOx(1);
                return;
            } else if (C0DB.A0o(c09g)) {
                if (AnonymousClass024.A0j(((AnonymousClass097) c09g).A08) && (file = c09h.A0F) != null) {
                    ((AnonymousClass097) c09g).A08 = file.getName();
                }
                audioPlayerView.setSeekbarColor(C02160Ac.A00(audioPlayerView.getContext(), R.color.music_scrubber));
                audioPlayerView.setOnControlButtonClickListener(onClickListener4);
                interfaceC53542h6.AOx(0);
                return;
            } else {
                C09H c09h2 = ((AnonymousClass097) c09g).A02;
                if (c09g.A0n.A02 && c09h2 != null && c09h2.A0F != null) {
                    z = true;
                }
                if (z) {
                    audioPlayerView.setPlayButtonState(2);
                    audioPlayerView.setOnControlButtonClickListener(onClickListener2);
                    audioPlayerView.setSeekbarColor(C02160Ac.A00(audioPlayerView.getContext(), R.color.music_scrubber));
                    interfaceC53542h6.AOx(3);
                    return;
                }
                audioPlayerView.setPlayButtonState(3);
                audioPlayerView.setOnControlButtonClickListener(onClickListener3);
                audioPlayerView.setSeekbarColor(C02160Ac.A00(audioPlayerView.getContext(), R.color.music_scrubber));
                interfaceC53542h6.AOx(2);
                return;
            }
        }
        throw null;
    }

    public static void A0h(C09G c09g, AudioPlayerView audioPlayerView, C2h8 c2h8, InterfaceC53562h9 interfaceC53562h9, C002301c c002301c, C03120Eg c03120Eg) {
        if (!c03120Eg.A09(c09g)) {
            A0i(c09g, audioPlayerView, c2h8, c002301c);
            return;
        }
        C09560eJ A01 = c03120Eg.A01();
        if (A01 != null) {
            if (!A01.A0K()) {
                A0i(c09g, audioPlayerView, c2h8, c002301c);
            } else {
                audioPlayerView.setPlayButtonState(1);
                audioPlayerView.setSeekbarProgress(A01.A03());
                audioPlayerView.setSeekbarMax(A01.A02);
                c2h8.AN1(0, AnonymousClass029.A0g(c002301c, A01.A03() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
            }
            audioPlayerView.setSeekbarContentDescription(A01.A03());
            A01.A0H = interfaceC53562h9;
        }
    }

    public static void A0i(C09G c09g, AudioPlayerView audioPlayerView, C2h8 c2h8, C002301c c002301c) {
        long j;
        Number number = (Number) C09560eJ.A0q.get(c09g.A0n);
        Integer valueOf = Integer.valueOf(number == null ? 0 : number.intValue());
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(((AnonymousClass097) c09g).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        audioPlayerView.setSeekbarProgress(valueOf != null ? valueOf.intValue() : 0);
        if (valueOf != null) {
            j = valueOf.intValue();
        } else {
            j = 0;
        }
        audioPlayerView.setSeekbarContentDescription(j);
        c2h8.AN1(1, AnonymousClass029.A0g(c002301c, ((AnonymousClass097) c09g).A00));
    }

    public static void A0j(C0JM c0jm) {
        C2CI[] c2ciArr;
        C2CI[] c2ciArr2;
        if (TextUtils.isEmpty(c0jm.A06)) {
            C04050If c04050If = c0jm.A04;
            if (c04050If != null && (c2ciArr2 = c04050If.A06) != null) {
                c0jm.A06 = C0JM.A00(c2ciArr2);
            } else if (TextUtils.isEmpty(c0jm.A08)) {
            } else {
                String str = c0jm.A08;
                if (str != null) {
                    C04050If A00 = C04050If.A00(WebpUtils.fetchWebpMetadata(str));
                    if (A00 == null || (c2ciArr = A00.A06) == null) {
                        return;
                    }
                    c0jm.A06 = C0JM.A00(c2ciArr);
                    return;
                }
                throw null;
            }
        }
    }

    public static void A0k(File file, C003701t c003701t, C01B c01b, Boolean bool, String str) {
        WebpInfo verifyWebpFileIntegrity = WebpUtils.verifyWebpFileIntegrity(file.getAbsolutePath());
        int length = (int) (file.length() / 1024);
        boolean A0C = c003701t.A0C(290);
        int A07 = c01b.A07(C01C.A2h);
        int A072 = c01b.A07(C01C.A2j);
        int A073 = c01b.A07(C01C.A2i);
        if (verifyWebpFileIntegrity != null) {
            if (verifyWebpFileIntegrity.height == 512) {
                if (verifyWebpFileIntegrity.width == 512) {
                    int i = verifyWebpFileIntegrity.numFrames;
                    if (i > 1) {
                        if (A0C) {
                            if (bool != null && !bool.booleanValue()) {
                                throw new C47562Bs(C000200d.A0H("pack is not marked as animated pack but contains animated stickers. sticker: ", str));
                            }
                            if (verifyWebpFileIntegrity.minFrameDurationMS >= A072) {
                                if (verifyWebpFileIntegrity.totalAnimationDurationMS > A073) {
                                    StringBuilder sb = new StringBuilder("total animation duration should be under ");
                                    sb.append(A073);
                                    sb.append(" ms. sticker: ");
                                    sb.append(str);
                                    throw new C47562Bs(sb.toString());
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder("frame duration for any frame should exceed ");
                                sb2.append(A072);
                                sb2.append(" ms. sticker: ");
                                sb2.append(str);
                                throw new C47562Bs(sb2.toString());
                            }
                        } else {
                            throw new C47562Bs("animated stickers are not supported yet.");
                        }
                    } else if (bool != null && bool.booleanValue()) {
                        throw new C47562Bs(C000200d.A0H("pack is marked as animated pack but contains non animated stickers. All stickers in animated pack should be animated sticker. check sticker: ", str));
                    }
                    long j = length;
                    long j2 = (i <= 1 || !A0C) ? 100L : A07;
                    if (j <= j2) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder("sticker file should be less than ");
                    sb3.append(j2);
                    sb3.append(" kB, file: ");
                    sb3.append(str);
                    throw new C47562Bs(sb3.toString());
                }
                throw new C47562Bs(C000200d.A0H("sticker width should be  512, sticker: ", str));
            }
            throw new C47562Bs(C000200d.A0H("sticker height should be 512, sticker: ", str));
        }
        throw new C47562Bs(C000200d.A0H("sticker file might be corrupted or invalid, sticker: ", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004c, code lost:
        if (r3 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0l(X.C01B r7, X.C000400f r8, X.C000500h r9) {
        /*
            X.039 r0 = X.C01C.A0F
            int r0 = r7.A07(r0)
            long r3 = (long) r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            r5 = 0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            return r5
        L13:
            long r6 = r8.A04()
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L32
            float r1 = (float) r3
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r4
            r0 = 1335165689(0x4f9502f9, float:5.0E9)
            float r1 = r1 / r0
            int r0 = (int) r1
            long r2 = r8.A04()
            long r0 = (long) r0
            long r2 = r2 * r0
            float r0 = (float) r2
            float r0 = r0 / r4
            long r3 = (long) r0
        L32:
            long r1 = r8.A02()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 0
            if (r0 > 0) goto L3c
            r3 = 1
        L3c:
            android.content.SharedPreferences r2 = r9.A00
            java.lang.String r1 = "storage_usage_banner_dismissed"
            boolean r0 = r2.getBoolean(r1, r5)
            if (r0 == 0) goto L4c
            if (r3 != 0) goto L4e
            X.C000200d.A0j(r9, r1, r5)
        L4b:
            return r5
        L4c:
            if (r3 == 0) goto L4b
        L4e:
            boolean r0 = r2.getBoolean(r1, r5)
            if (r0 != 0) goto L4b
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40731sm.A0l(X.01B, X.00f, X.00h):boolean");
    }

    public static boolean A0m(C42441vk c42441vk, AnonymousClass092 anonymousClass092) {
        if ((anonymousClass092 instanceof AnonymousClass097) && (!anonymousClass092.A0n.A02 || ((anonymousClass092 instanceof C0JP) && C0DB.A0q((C09B) anonymousClass092)))) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                C43221x3 A00 = c42441vk.A00(c09h);
                if (anonymousClass092.A0m == 3 && c09h.A0a && A00 != null && A00.A0g != null && !C0K7.A02()) {
                    return true;
                }
                if ((anonymousClass092 instanceof AnonymousClass095) && C0DB.A0l(anonymousClass097)) {
                    return true;
                }
                if (!c09h.A0P || c09h.A07 == 1 || c09h.A0F == null) {
                    return false;
                }
            } else {
                throw null;
            }
        }
        return true;
    }

    public static boolean A0n(AnonymousClass092 anonymousClass092) {
        return anonymousClass092.A11() && anonymousClass092.A0D().A00 != null;
    }

    public static boolean A0o(C02590Ca c02590Ca) {
        String str;
        if (c02590Ca != null) {
            C04P A0A = c02590Ca.A0A("status");
            if (A0A != null) {
                str = A0A.A03;
            } else {
                str = null;
            }
            if ("catalog_exists".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0p(C09G c09g, Context context, InterfaceC53582hB interfaceC53582hB, C42461vm c42461vm, C018508q c018508q, C42471vn c42471vn) {
        File file;
        C09H c09h;
        C09H c09h2 = ((AnonymousClass097) c09g).A02;
        if (c09h2 != null) {
            if (c09h2 != null) {
                if (!c09h2.A0a) {
                    if (c09h2.A07 == 1) {
                        c018508q.A05(R.string.gallery_unsafe_audio_removed, 1);
                    } else {
                        if (c09h2.A0P && (file = c09h2.A0F) != null) {
                            File file2 = new File(Uri.fromFile(file).getPath());
                            if (!file2.exists() || !file2.canRead()) {
                                File file3 = new File(Uri.fromFile(c09h2.A0F).getPath());
                                if (!file3.exists() || !file3.canRead()) {
                                    if (!c09g.A0n.A02 && (c09h = ((AnonymousClass097) c09g).A02) != null) {
                                        c09h.A0X = true;
                                        c42471vn.A08(c09g);
                                        interfaceC53582hB.AKL();
                                        return false;
                                    }
                                    ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) C02180Ae.A0G(context, ActivityC02290Ap.class);
                                    if (activityC02290Ap != null) {
                                        c42461vm.A03(activityC02290Ap);
                                    }
                                    return false;
                                }
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        throw null;
    }

    public static boolean A0q(String str, String str2) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str2);
        sb.append("/");
        if (!str.startsWith(sb.toString())) {
            StringBuilder sb2 = new StringBuilder("http://");
            sb2.append(str2);
            sb2.append("/");
            if (!str.startsWith(sb2.toString())) {
                return false;
            }
        }
        return true;
    }
}
