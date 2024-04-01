package X;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.00q */
/* loaded from: classes.dex */
public class C001400q extends AbstractC000600i {
    public static final Object A0F = new Object();
    public InterfaceC001000m A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C03T A02;
    public final C02L A03;
    public final C005002g A04;
    public final C000800k A05;
    public final C000400f A06;
    public final C02E A07;
    public final C001200o A08;
    public final C000500h A09;
    public final AnonymousClass011 A0A;
    public final AnonymousClass035 A0B;
    public final C006602x A0C;
    public final C004902f A0D;
    public final InterfaceC002901k A0E;

    public C001400q(C001200o c001200o, C02L c02l, C004902f c004902f, InterfaceC002901k interfaceC002901k, C005002g c005002g, AnonymousClass011 anonymousClass011, C006602x c006602x, C02E c02e, C000400f c000400f, AnonymousClass035 anonymousClass035, C000500h c000500h, C000800k c000800k, C03T c03t) {
        this.A08 = c001200o;
        this.A03 = c02l;
        this.A0D = c004902f;
        this.A0E = interfaceC002901k;
        this.A04 = c005002g;
        this.A0A = anonymousClass011;
        this.A0C = c006602x;
        this.A07 = c02e;
        this.A06 = c000400f;
        this.A0B = anonymousClass035;
        this.A09 = c000500h;
        this.A05 = c000800k;
        this.A02 = c03t;
    }

    public static C001400q A01() {
        if (AbstractC000600i.A00 == null) {
            synchronized (C001400q.class) {
                if (AbstractC000600i.A00 == null) {
                    C001200o c001200o = C001200o.A01;
                    C02L A00 = C02L.A00();
                    C004902f A002 = C004902f.A00();
                    InterfaceC002901k A003 = C002801j.A00();
                    C005002g A004 = C005002g.A00();
                    AnonymousClass011 A005 = AnonymousClass011.A00();
                    C006602x A006 = C006602x.A00();
                    C02E A007 = C02E.A00();
                    C000400f A008 = C000400f.A00();
                    AnonymousClass035 A009 = AnonymousClass035.A00();
                    C000500h A0010 = C000500h.A00();
                    C000800k c000800k = C000800k.A02;
                    if (C03T.A07 == null) {
                        synchronized (C03T.class) {
                            if (C03T.A07 == null) {
                                C03T.A07 = new C03T(AnonymousClass012.A00(), C003701t.A00(), C02O.A00());
                            }
                        }
                    }
                    AbstractC000600i.A00 = new C001400q(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, c000800k, C03T.A07);
                }
            }
        }
        return (C001400q) AbstractC000600i.A00;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0055: MOVE  (r6 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:107:0x0055 */
    public static File A02(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            Log.w("app/CrashLogs/copyFileToCache: Could not close stream", e2);
                        }
                    }
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                            throw th;
                        } catch (IOException e3) {
                            Log.w("app/CrashLogs/copyFileToCache: Could not close stream", e3);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                fileOutputStream = null;
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e5) {
                            Log.w("app/CrashLogs/copyFileToCache: Could not close stream", e5);
                        }
                    }
                }
                fileInputStream.close();
                try {
                    fileOutputStream.close();
                    return file2;
                } catch (IOException e6) {
                    Log.w("app/CrashLogs/copyFileToCache: Could not close stream", e6);
                    return file2;
                }
            } catch (IOException e7) {
                e = e7;
                Log.w("app/CrashLogs/copyFileToCache: Could not copy file", e);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e8) {
                        Log.w("app/CrashLogs/copyFileToCache: Could not close stream", e8);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                        return null;
                    } catch (IOException e9) {
                        Log.w("app/CrashLogs/copyFileToCache: Could not close stream", e9);
                        return null;
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
        }
    }

    public static String A03(HashSet hashSet) {
        StringBuilder sb = new StringBuilder();
        if (hashSet != null && !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0086, code lost:
        if (0 == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A04(X.C28201Qr r7, java.io.File r8) {
        /*
            java.lang.String r4 = "app/CrashLogs/serializeCrashData: Could not close stream"
            r6 = 0
            r0 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L85
            r5.<init>(r8, r0)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L85
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r1 = r7.logFilePath     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "logFilePath"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r1 = r7.attachmentPath     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "attachmentPath"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r1 = r7.fromParam     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "fromParam"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            boolean r1 = r7.forcedUpload     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "forcedUpload"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            boolean r1 = r7.detailedException     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "detailedException"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r1 = r7.tagsString     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "tagsString"
            org.json.JSONObject r2 = r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r1 = r7.attachmentParam     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "attachmentParam"
            org.json.JSONObject r3 = r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            long r1 = r7.timeMillis     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "timeMillis"
            org.json.JSONObject r0 = r3.put(r0, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            r5.write(r0)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            r5.close()     // Catch: java.io.IOException -> L80
            return
        L5d:
            r1 = move-exception
            r6 = r5
            goto L88
        L60:
            r3 = move-exception
            r6 = r5
            goto L64
        L63:
            r3 = move-exception
        L64:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "app/CrashLogs/serializeCrashData: could not serialize crash data at time: "
            r2.append(r0)     // Catch: java.lang.Throwable -> L85
            long r0 = r7.timeMillis     // Catch: java.lang.Throwable -> L85
            r2.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L85
            com.whatsapp.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L84
            r6.close()     // Catch: java.io.IOException -> L80
            return
        L80:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
        L84:
            return
        L85:
            r1 = move-exception
            if (r6 == 0) goto L90
        L88:
            r6.close()     // Catch: java.io.IOException -> L8c
            throw r1
        L8c:
            r0 = move-exception
            com.whatsapp.util.Log.w(r4, r0)
        L90:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001400q.A04(X.1Qr, java.io.File):void");
    }

    @Override // X.AbstractC000600i
    public String A05() {
        C02L c02l = this.A03;
        c02l.A05();
        Me me = c02l.A00;
        if (me != null) {
            return me.jabber_id;
        }
        String replaceAll = c02l.A02().toLowerCase(Locale.US).replaceAll("\\W", "-");
        if (replaceAll.equals("")) {
            ContentResolver A07 = this.A07.A07();
            if (A07 == null) {
                Log.w("crashlogs/get-from-parameter cr=null");
            } else {
                String string = Settings.Secure.getString(A07, "android_id");
                string = (string == null || string.length() < 6) ? "123456" : "123456";
                StringBuilder A0P = C000200d.A0P("new-");
                A0P.append(string.substring(string.length() - 6));
                return A0P.toString();
            }
        }
        return replaceAll;
    }

    @Override // X.AbstractC000600i
    public String A06(String str) {
        return A0B(null).A00();
    }

    @Override // X.AbstractC000600i
    public String A07(String str, String str2, boolean z) {
        final C1KO c1ko = new C1KO();
        C05070Ne c05070Ne = new C05070Ne(this.A0B, "https://crashlogs.whatsapp.net/wa_fls_upload_check", this.A0D.A02(), new InterfaceC05060Nd() { // from class: X.1nW
            @Override // X.InterfaceC05060Nd
            public void AJD(long j) {
            }

            @Override // X.InterfaceC05060Nd
            public void AJz(Map map, String str3) {
                C000200d.A13("app/CrashLogs/uploadServerOkay/error received: ", str3);
            }

            @Override // X.InterfaceC05060Nd
            public void AO0(Map map, String str3) {
                try {
                    if ("only_exception".equals(new JSONObject(str3).optString("upload", ""))) {
                        c1ko.A00 = "exception_only";
                    } else {
                        c1ko.A00 = "exception_and_logs";
                    }
                } catch (JSONException unused) {
                    c1ko.A00 = "exception_and_logs";
                }
            }
        }, false, false);
        List list = c05070Ne.A0C;
        list.add(Pair.create("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af"));
        list.add(Pair.create("from", str));
        list.add(Pair.create("type", str2));
        list.add(Pair.create("support_exception_only_upload", String.valueOf(z)));
        int A01 = c05070Ne.A01(null);
        if (A01 != 200) {
            if (A01 == 403) {
                c1ko.A00 = "no_upload";
                return "no_upload";
            } else if (A01 != 500) {
                throw new IOException(C000200d.A0E("Unknown response code ", A01, " from crash upload server"));
            } else {
                throw new IOException("Response 500 received from server");
            }
        }
        return c1ko.A00;
    }

    @Override // X.AbstractC000600i
    public void A08(String str, int i) {
        new C04080Ik(str).getMessage();
    }

    @Override // X.AbstractC000600i
    public void A09(String str, String str2, boolean z) {
        Set<C09210cr> set;
        Set<String> set2;
        String[] split;
        C04080Ik c04080Ik = new C04080Ik(str);
        C04090Il c04090Il = new C04090Il();
        c04090Il.A02 = str;
        c04090Il.A01 = str2;
        if (z) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (StackTraceElement stackTraceElement : c04080Ik.getStackTrace()) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
                i++;
                if (i == 15) {
                    break;
                }
            }
            c04090Il.A00 = sb.toString();
        }
        this.A0A.A0B(c04090Il, AnonymousClass014.DEFAULT_SAMPLING_RATE, false);
        C03T c03t = this.A02;
        synchronized (c03t) {
            SharedPreferences sharedPreferences = c03t.A00;
            if (sharedPreferences == null) {
                sharedPreferences = c03t.A05.A01("critical_event_client_prefs");
                c03t.A00 = sharedPreferences;
            }
            if (c03t.A02 == null) {
                if (sharedPreferences != null) {
                    if (210915004 != sharedPreferences.getInt("build_version", -1)) {
                        C000200d.A1C("CriticalEventConfigManager/updateConfigFromAbProp/clearing client config due to app upgrade ", c03t.A00.edit().remove("critical_event_client_config").putInt("build_version", 210915004).commit());
                    }
                    String A05 = c03t.A04.A05(414);
                    String string = c03t.A00.getString("critical_event_client_config", "");
                    HashSet hashSet = new HashSet();
                    String[] split2 = A05.split(";");
                    int length = split2.length;
                    int i2 = 2;
                    if (length > 0) {
                        long A01 = c03t.A03.A01() + 3888000000L;
                        int i3 = 0;
                        while (i3 < length) {
                            String[] split3 = split2[i3].split(":");
                            if (split3.length == i2 && !TextUtils.isEmpty(split3[0]) && !TextUtils.isEmpty(split3[1])) {
                                String str3 = split3[0];
                                int A012 = AnonymousClass024.A01(split3[1], -1);
                                if (A012 >= 1) {
                                    hashSet.add(new C09210cr(str3, A012, A01));
                                }
                            }
                            i3++;
                            i2 = 2;
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    String[] split4 = string.split(";");
                    if (split4.length > 0) {
                        for (String str4 : split4) {
                            String[] split5 = str4.split(":");
                            if (split5.length == 3 && !TextUtils.isEmpty(split5[0]) && !TextUtils.isEmpty(split5[1]) && !TextUtils.isEmpty(split5[2])) {
                                String str5 = split5[0];
                                int A013 = AnonymousClass024.A01(split5[1], -1);
                                if (A013 >= 1) {
                                    long A03 = AnonymousClass024.A03(split5[2], -1L);
                                    if (A03 >= 1) {
                                        hashSet2.add(new C09210cr(str5, A013, A03));
                                    }
                                }
                            }
                        }
                    }
                    HashSet hashSet3 = new HashSet();
                    c03t.A02 = hashSet3;
                    HashSet hashSet4 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        hashSet4.add(((C09210cr) it.next()).A02);
                    }
                    HashSet hashSet5 = new HashSet();
                    HashSet hashSet6 = new HashSet();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        C09210cr c09210cr = (C09210cr) it2.next();
                        String str6 = c09210cr.A02;
                        if (hashSet4.contains(str6)) {
                            hashSet6.add(c09210cr);
                            hashSet5.add(str6);
                        }
                    }
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        C09210cr c09210cr2 = (C09210cr) it3.next();
                        String str7 = c09210cr2.A02;
                        if (!hashSet5.contains(str7)) {
                            hashSet6.add(c09210cr2);
                            hashSet5.add(str7);
                        }
                    }
                    hashSet3.addAll(hashSet6);
                    StringBuilder sb2 = new StringBuilder();
                    for (Object obj : c03t.A02) {
                        sb2.append(obj);
                    }
                    c03t.A00.edit().putString("critical_event_client_config", sb2.toString()).apply();
                } else {
                    throw null;
                }
            }
            set = c03t.A02;
            if (set == null) {
                throw null;
            }
        }
        for (C09210cr c09210cr3 : set) {
            if (str.contains(c09210cr3.A02) && c03t.A03.A01() < c09210cr3.A01) {
                if (c03t.A06.nextInt(c09210cr3.A00) == 0) {
                    AnonymousClass024.A0O();
                    Log.e("UNCAUGHT EXCEPTION", c04080Ik);
                    final HashSet hashSet7 = new HashSet(Collections.singletonList("log_files_upload"));
                    String message = c04080Ik.getMessage();
                    synchronized (c03t) {
                        Set set3 = c03t.A01;
                        set2 = set3;
                        if (set3 == null) {
                            String A052 = c03t.A04.A05(426);
                            HashSet hashSet8 = new HashSet();
                            for (String str8 : A052.split(";")) {
                                if (str8.length() > 0) {
                                    hashSet8.add(str8);
                                }
                            }
                            c03t.A01 = hashSet8;
                            set2 = hashSet8;
                        } else if (set3 == null) {
                            throw null;
                        }
                    }
                    for (String str9 : set2) {
                        if (message.contains(str9)) {
                            return;
                        }
                    }
                    try {
                        this.A0E.AS1(new Runnable() { // from class: X.1Qo
                            public final /* synthetic */ boolean A02 = true;
                            public final /* synthetic */ boolean A03 = true;
                            public final /* synthetic */ boolean A04 = true;

                            {
                                C001400q.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C001400q.this.A0A(false, this.A02, this.A03, this.A04, hashSet7, null, null);
                            }
                        });
                        return;
                    } catch (Exception e) {
                        Log.e("crashlogs/upload/failed", e);
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.00q, X.00i] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.00q, X.00i] */
    @Override // X.AbstractC000600i
    public boolean A0A(boolean z, boolean z2, boolean z3, boolean z4, HashSet hashSet, File file, String str) {
        String str2;
        File file2;
        String num;
        String str3;
        str2 = "";
        C001400q rotate = Log.rotate();
        boolean z5 = false;
        if (rotate == 0) {
            Log.w("crash-log/whatsapp/no_file");
            return false;
        }
        File file3 = null;
        try {
            try {
                rotate = this;
                File file4 = file;
                file2 = Log.compress();
                try {
                    C000400f c000400f = rotate.A06;
                    int i = 1048576;
                    int i2 = 5242880;
                    if (z3) {
                        i = 8388608;
                        i2 = 41943040;
                    }
                    file3 = AnonymousClass024.A06(c000400f, file2, i, i2);
                    if (file3 != null) {
                        if (file == null) {
                            str3 = "";
                        } else {
                            try {
                                str3 = file4.getPath();
                            } catch (Exception e) {
                                e = e;
                                Log.e("crash-log/failedupload", e);
                                if (file3 != null) {
                                    if (!z5) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        File A0E = rotate.A0E(file3, currentTimeMillis);
                                        file4 = rotate.A0D(file4);
                                        if (A0E != null) {
                                            str2 = file4 != null ? file4.getPath() : "";
                                            rotate.A0F(new C28201Qr(A0E.getPath(), str2, rotate.A05(), z2, z4, A03(hashSet), str, currentTimeMillis));
                                            rotate.A01.post(new C1Qp(rotate));
                                        }
                                    }
                                    if (file3 != file2) {
                                        file3.delete();
                                        return z5;
                                    }
                                }
                                return z5;
                            } catch (Throwable th) {
                                th = th;
                                if (file3 != null) {
                                    if (!z5) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        File A0E2 = rotate.A0E(file3, currentTimeMillis2);
                                        File A0D = rotate.A0D(file4);
                                        if (A0E2 != null) {
                                            if (A0D != null) {
                                                str2 = A0D.getPath();
                                            }
                                            rotate.A0F(new C28201Qr(A0E2.getPath(), str2, rotate.A05(), z2, z4, A03(hashSet), str, currentTimeMillis2));
                                            rotate.A01.post(new C1Qp(rotate));
                                        }
                                    }
                                    if (file3 != file2) {
                                        file3.delete();
                                    }
                                }
                                throw th;
                            }
                        }
                        z5 = rotate.A0G(file3.getPath(), str3, rotate.A05(), z2, z4, A03(hashSet), str);
                    }
                    if (z) {
                        File file5 = Log.logFile;
                        Date date = new Date();
                        String A0D2 = C003101m.A0D(file5.getName(), date);
                        String A0C = C003101m.A0C(file5.getName(), ".gz");
                        String A08 = C003101m.A08(file5, date, ".gz");
                        int length = A0D2.length() + 1;
                        int length2 = A08.length() - A0C.length();
                        if (length < length2) {
                            try {
                                num = Integer.toString(Integer.parseInt(A08.substring(length, length2)) + 1);
                            } catch (NumberFormatException unused) {
                            }
                            new File(file5.getParent(), C000200d.A0J(A0D2, ".", num, A0C)).createNewFile();
                        }
                        num = "1";
                        new File(file5.getParent(), C000200d.A0J(A0D2, ".", num, A0C)).createNewFile();
                    }
                    if (file3 != null) {
                        if (!z5) {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            File A0E3 = rotate.A0E(file3, currentTimeMillis3);
                            file4 = rotate.A0D(file4);
                            if (A0E3 != null) {
                                str2 = file4 != null ? file4.getPath() : "";
                                rotate.A0F(new C28201Qr(A0E3.getPath(), str2, rotate.A05(), z2, z4, A03(hashSet), str, currentTimeMillis3));
                                rotate.A01.post(new C1Qp(rotate));
                            }
                        }
                        if (file3 != file2) {
                            file3.delete();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                file2 = null;
            }
            return z5;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final C1PX A0B(String str) {
        int memoryClass;
        ActivityManager A01 = this.A07.A01();
        if (A01 == null) {
            Log.w("memorydumpuploadservice/get-upload-params am=null");
            memoryClass = 16;
        } else {
            memoryClass = A01.getMemoryClass();
        }
        C004902f.A01(this.A08, "2.21.9.15-play-release");
        return new C1PX(memoryClass, str);
    }

    public final File A0C() {
        File file = new File(this.A08.A00.getCacheDir(), "Crashes");
        file.mkdirs();
        return file;
    }

    public final File A0D(File file) {
        int i;
        if (file == null) {
            return null;
        }
        try {
            File file2 = new File(A0C(), UUID.randomUUID().toString());
            int i2 = 0;
            while (true) {
                i = i2 + 1;
                if (i2 >= 10 || file2.mkdirs()) {
                    break;
                }
                file2 = new File(A0C(), UUID.randomUUID().toString());
                i2 = i;
            }
            if (i <= 10) {
                return A02(file, new File(file2, file.getName()));
            }
            throw new IOException("max retries reached while creating attachment temp directory");
        } catch (IOException unused) {
            return null;
        }
    }

    public final File A0E(File file, long j) {
        File A0C = A0C();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(".log");
        return A02(file, new File(A0C, sb.toString()));
    }

    public final void A0F(C28201Qr c28201Qr) {
        File A0C = A0C();
        StringBuilder sb = new StringBuilder();
        sb.append(c28201Qr.timeMillis);
        sb.append(".crash");
        A04(c28201Qr, new File(A0C, sb.toString()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0047, code lost:
        if ("log_files_upload".equals(r32) != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0G(java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001400q.A0G(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):boolean");
    }
}
