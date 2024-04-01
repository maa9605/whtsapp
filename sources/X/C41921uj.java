package X;

import android.content.Context;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.Me;
import com.whatsapp.usernotice.UserNoticeContentWorker;
import com.whatsapp.usernotice.UserNoticeIconWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1uj */
/* loaded from: classes2.dex */
public class C41921uj {
    public static volatile C41921uj A09;
    public C40781sr A00;
    public final C02L A01;
    public final C001200o A02;
    public final AnonymousClass072 A03;
    public final C002301c A04;
    public final C003701t A05;
    public final C41941ul A06;
    public final InterfaceC002901k A07;
    public final C2A9 A08;

    public C41921uj(C003701t c003701t, C001200o c001200o, C02L c02l, InterfaceC002901k interfaceC002901k, C002301c c002301c, C2A9 c2a9, C41941ul c41941ul, AnonymousClass072 anonymousClass072) {
        this.A05 = c003701t;
        this.A02 = c001200o;
        this.A01 = c02l;
        this.A07 = interfaceC002901k;
        this.A04 = c002301c;
        this.A08 = c2a9;
        this.A06 = c41941ul;
        this.A03 = anonymousClass072;
    }

    public static C41921uj A00() {
        if (A09 == null) {
            synchronized (C41921uj.class) {
                if (A09 == null) {
                    A09 = new C41921uj(C003701t.A00(), C001200o.A01, C02L.A00(), C002801j.A00(), C002301c.A00(), C2A9.A01(), C41941ul.A00(), AnonymousClass072.A00());
                }
            }
        }
        return A09;
    }

    public static final File A01(Context context, int i) {
        File A02 = A02(context.getFilesDir(), "user_notice");
        if (A02 == null) {
            return null;
        }
        return A02(A02, String.valueOf(i));
    }

    public static File A02(File file, String str) {
        File file2 = new File(file, str);
        if (file2.exists() || file2.mkdir()) {
            return file2;
        }
        C000200d.A0o(file2, C000200d.A0P("UserNoticeContentManager/getDir/could not make directory "));
        return null;
    }

    public C40781sr A03(C2A7 c2a7) {
        C40791ss c40791ss;
        int i = c2a7.A00;
        C003701t c003701t = this.A05;
        if (C2A8.A01(i, c003701t)) {
            C000200d.A1F(C000200d.A0P("UserNoticeContentManager/getUserNoticeContentFromLocal/green alert disabled, notice id: "), i);
            return null;
        } else if (C2A8.A02(c003701t, c2a7)) {
            C001200o c001200o = this.A02;
            AnonymousClass072 anonymousClass072 = this.A03;
            int A03 = c003701t.A03(356);
            if (A03 == 0) {
                Log.i("GreenAlertUtils/buildBanner/no duration received");
                c40791ss = null;
            } else {
                c40791ss = new C40791ss(c001200o.A00.getString(R.string.green_alert_banner), new C40891t2(new C40901t3(1609459200000L), new C40911t4(A03 * 3600000, null), null)) { // from class: X.2AC
                };
            }
            C40811su A00 = C2A8.A00(c003701t, anonymousClass072, true);
            C40811su A002 = C2A8.A00(c003701t, anonymousClass072, false);
            if (c40791ss == null || A00 == null || A002 == null) {
                return null;
            }
            return new C40781sr(1, 1, c40791ss, A00, A002);
        } else {
            int i2 = c2a7.A02;
            int i3 = c2a7.A01;
            C000200d.A1F(C000200d.A0R("UserNoticeContentManager/getUserNoticeContentFromLocal/notice id: ", i, " version: ", i2, " stage: "), i3);
            if (i3 == 5) {
                Log.i("UserNoticeContentManager/getUserNoticeContentFromLocal/end stage, skip local content");
                return null;
            }
            C40781sr c40781sr = this.A00;
            if (c40781sr != null && c40781sr.A00 == i && c40781sr.A01 == i2) {
                C000200d.A0t("UserNoticeContentManager/getUserNoticeContentFromLocal/has content for notice id: ", i, " version: ", i2);
                A06(this.A00, i);
                return this.A00;
            }
            if (A09(i, "content.json")) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(A01(this.A02.A00, i), "content.json"));
                    C40781sr A0X = C02180Ae.A0X(i, fileInputStream);
                    this.A00 = A0X;
                    if (A0X != null) {
                        A06(A0X, i);
                        C40781sr c40781sr2 = this.A00;
                        fileInputStream.close();
                        return c40781sr2;
                    }
                    Log.e("UserNoticeContentManager/getUserNoticeContentFromLocal/error parsing");
                    A04(i);
                    this.A06.A02(3);
                    fileInputStream.close();
                    return null;
                } catch (IOException e) {
                    Log.e("UserNoticeContentManager/getUserNoticeContentFromLocal/exception", e);
                }
            }
            return null;
        }
    }

    public void A04(int i) {
        C000200d.A0q("UserNoticeContentManager/deleteUserNoticeData/notice id: ", i);
        File A01 = A01(this.A02.A00, i);
        if (A01 != null) {
            this.A07.AS1(new RunnableEBaseShape7S0100000_I0_7(A01, 22));
        }
        this.A00 = null;
    }

    public void A05(int i) {
        EnumC015507g enumC015507g = EnumC015507g.EXPONENTIAL;
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/fetchAndStoreUserNoticeContent/notice id ");
        sb.append(i);
        Log.i(sb.toString());
        HashMap hashMap = new HashMap();
        hashMap.put("notice_id", Integer.valueOf(i));
        C02L c02l = this.A01;
        c02l.A05();
        Me me = c02l.A00;
        if (me == null) {
            C000200d.A0p("UserNoticeContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notice id ", i);
            return;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("whatsapp.com").appendPath("user-notice").appendPath("v1").appendQueryParameter("id", String.valueOf(i));
        C002301c c002301c = this.A04;
        Uri build = appendQueryParameter.appendQueryParameter("lg", c002301c.A04()).appendQueryParameter("lc", c002301c.A03()).appendQueryParameter("cc", C006602x.A01(me.cc)).appendQueryParameter("platform", "android").appendQueryParameter("img-size", this.A02.A00.getResources().getDisplayMetrics().densityDpi <= 240 ? "hdpi" : "xxhdpi").build();
        build.toString();
        hashMap.put("url", build.toString());
        C0OF c0of = new C0OF(hashMap);
        C0OF.A01(c0of);
        C0OG c0og = new C0OG();
        c0og.A03 = C07j.CONNECTED;
        C0OH c0oh = new C0OH(c0og);
        C0OJ c0oj = new C0OJ(UserNoticeContentWorker.class);
        c0oj.A01.add("tag.whatsapp.usernotice.content.fetch");
        c0oj.A00.A09 = c0oh;
        c0oj.A03(enumC015507g, 1L, TimeUnit.HOURS);
        c0oj.A00.A0A = c0of;
        C0OM A00 = c0oj.A00();
        C0OJ c0oj2 = new C0OJ(UserNoticeIconWorker.class);
        c0oj2.A01.add("tag.whatsapp.usernotice.icon.fetch");
        c0oj2.A00.A09 = c0oh;
        c0oj2.A03(enumC015507g, 1L, TimeUnit.HOURS);
        C0OF c0of2 = new C0OF(hashMap);
        C0OF.A01(c0of2);
        c0oj2.A00.A0A = c0of2;
        C0OM A002 = c0oj2.A00();
        String A0D = C000200d.A0D("tag.whatsapp.usernotice.content.fetch.", i);
        C0OD c0od = (C0OD) this.A08.get();
        C0OO c0oo = C0OO.REPLACE;
        if (c0od != null) {
            List singletonList = Collections.singletonList(A00);
            C0OP c0op = (C0OP) c0od;
            if (!singletonList.isEmpty()) {
                C0OR c0or = new C0OR(c0op, A0D, c0oo, singletonList, null);
                List singletonList2 = Collections.singletonList(A002);
                if (!singletonList2.isEmpty()) {
                    c0or = new C0OR(c0or.A03, c0or.A04, C0OO.KEEP, singletonList2, Collections.singletonList(c0or));
                }
                c0or.A02();
                return;
            }
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        throw null;
    }

    public final void A06(C40781sr c40781sr, int i) {
        C000200d.A0q("UserNoticeContentManager/populateIconFiles/notice id: ", i);
        A07(c40781sr.A02, "banner_icon_light.png", "banner_icon_dark.png", i);
        A07(c40781sr.A04, "modal_icon_light.png", "modal_icon_dark.png", i);
        A07(c40781sr.A03, "blocking_modal_icon_light.png", "blocking_modal_icon_dark.png", i);
    }

    public final void A07(C40801st c40801st, String str, String str2, int i) {
        if (c40801st == null || !A09(i, str, str2)) {
            return;
        }
        File A01 = A01(this.A02.A00, i);
        c40801st.A01 = new File(A01, str);
        c40801st.A00 = new File(A01, str2);
    }

    public boolean A08(int i, String str, InputStream inputStream) {
        try {
            File A01 = A01(this.A02.A00, i);
            if (A01 == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("UserNoticeContentWorker/storeUserNoticeContent/storing user notice for ");
            sb.append(i);
            Log.i(sb.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(new File(A01, str));
            AnonymousClass024.A0V(inputStream, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            Log.e("UserNoticeContentWorker/storeUserNoticeContent/failed to store", e);
            return false;
        }
    }

    public final boolean A09(int i, String... strArr) {
        File[] listFiles;
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArr);
        File A01 = A01(this.A02.A00, i);
        if (A01 != null && (listFiles = A01.listFiles()) != null) {
            for (File file : listFiles) {
                hashSet.remove(file.getName());
            }
        }
        boolean isEmpty = hashSet.isEmpty();
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/userNoticeFilesExist/notice id ");
        sb.append(i);
        sb.append(" files exists: ");
        sb.append(isEmpty);
        Log.i(sb.toString());
        return isEmpty;
    }
}
