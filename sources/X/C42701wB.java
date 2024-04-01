package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1wB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42701wB {
    public static volatile C42701wB A09;
    public final C012005w A00;
    public final C01B A01;
    public final AnonymousClass034 A02;
    public final C000400f A03;
    public final C001200o A04;
    public final C02F A05;
    public final C000500h A06;
    public final C42181vJ A07;
    public final C25C A08;

    public C42701wB(C001200o c001200o, C012005w c012005w, AnonymousClass034 anonymousClass034, C01B c01b, C000400f c000400f, C02F c02f, C000500h c000500h, C42181vJ c42181vJ, C25C c25c) {
        this.A04 = c001200o;
        this.A00 = c012005w;
        this.A02 = anonymousClass034;
        this.A01 = c01b;
        this.A03 = c000400f;
        this.A05 = c02f;
        this.A06 = c000500h;
        this.A07 = c42181vJ;
        this.A08 = c25c;
    }

    public static final Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath("media");
        if (str != null) {
            appendPath.appendQueryParameter("query_param_country_code", str);
        }
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("path", str3);
        }
        return appendPath.build();
    }

    public static C42701wB A01() {
        if (A09 == null) {
            synchronized (C42701wB.class) {
                if (A09 == null) {
                    A09 = new C42701wB(C001200o.A01, C012005w.A00(), AnonymousClass034.A00(), C01B.A00(), C000400f.A00(), C02F.A00(), C000500h.A00(), C42181vJ.A00(), C25C.A00());
                }
            }
        }
        return A09;
    }

    public static boolean A02(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder("MediaMigrationUtil/mediaFolderIsEmpty/no-files-in-folder: ");
            sb.append(file);
            Log.i(sb.toString());
            return true;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory() && !A02(file2)) {
                StringBuilder sb2 = new StringBuilder("MediaMigrationUtil/mediaFolderIsEmpty/is-directory-and-contain-media-file-name: ");
                sb2.append(file2);
                Log.i(sb2.toString());
                return false;
            } else if (!file2.isDirectory() && !".nomedia".equals(file2.getName())) {
                StringBuilder sb3 = new StringBuilder("MediaMigrationUtil/mediaFolderIsEmpty/is-file-and-is-media-file-file-name: ");
                sb3.append(file2);
                Log.i(sb3.toString());
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r6.A0J().equals(r5.getString("registration_sibling_app_phone_number", null)) == false) goto L125;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42701wB.A03():void");
    }
}
