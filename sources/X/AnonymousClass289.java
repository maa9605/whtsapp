package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.289 */
/* loaded from: classes2.dex */
public class AnonymousClass289 implements InterfaceC05040Nb {
    public static volatile AnonymousClass289 A0X;
    public final C01L A00;
    public final C04920Mm A01;
    public final AnonymousClass031 A02;
    public final AbstractC000600i A03;
    public final C02L A04;
    public final C01B A05;
    public final C010005b A06;
    public final C03170Ep A07;
    public final C469829b A08;
    public final AnonymousClass075 A09;
    public final C000800k A0A;
    public final AnonymousClass034 A0B;
    public final C000400f A0C;
    public final C0E7 A0D;
    public final C02E A0E;
    public final C001200o A0F;
    public final C02F A0G;
    public final C000500h A0H;
    public final C0CC A0I;
    public final C28K A0J;
    public final C003701t A0K;
    public final C0HA A0L;
    public final C04000Ia A0M;
    public final C0EE A0N;
    public final C0DW A0O;
    public final C28F A0P;
    public final C42151vF A0Q;
    public final C0CB A0R;
    public final AbstractC41801uX A0S;
    public final C006602x A0T;
    public final C47262An A0U;
    public final C41981up A0V;
    public final C41991uq A0W;

    public AnonymousClass289(C001200o c001200o, AbstractC000600i abstractC000600i, C02L c02l, C41981up c41981up, C41991uq c41991uq, AnonymousClass034 anonymousClass034, C01B c01b, C003701t c003701t, C47262An c47262An, C006602x c006602x, C01L c01l, C42151vF c42151vF, C03170Ep c03170Ep, C02E c02e, AnonymousClass031 anonymousClass031, C28F c28f, C010005b c010005b, C0CB c0cb, C0HA c0ha, C000400f c000400f, C0EE c0ee, C0CC c0cc, C04920Mm c04920Mm, C0E7 c0e7, AnonymousClass075 anonymousClass075, C02F c02f, C000500h c000500h, C0DW c0dw, C04000Ia c04000Ia, C28K c28k, C000800k c000800k, AbstractC41801uX abstractC41801uX, C469829b c469829b) {
        this.A0F = c001200o;
        this.A03 = abstractC000600i;
        this.A04 = c02l;
        this.A0V = c41981up;
        this.A0W = c41991uq;
        this.A0B = anonymousClass034;
        this.A05 = c01b;
        this.A0K = c003701t;
        this.A0U = c47262An;
        this.A0T = c006602x;
        this.A00 = c01l;
        this.A0Q = c42151vF;
        this.A07 = c03170Ep;
        this.A0E = c02e;
        this.A02 = anonymousClass031;
        this.A0P = c28f;
        this.A06 = c010005b;
        this.A0R = c0cb;
        this.A0L = c0ha;
        this.A0C = c000400f;
        this.A0N = c0ee;
        this.A0I = c0cc;
        this.A01 = c04920Mm;
        this.A0D = c0e7;
        this.A09 = anonymousClass075;
        this.A0G = c02f;
        this.A0H = c000500h;
        this.A0O = c0dw;
        this.A0M = c04000Ia;
        this.A0J = c28k;
        this.A0A = c000800k;
        this.A0S = abstractC41801uX;
        this.A08 = c469829b;
    }

    public static String A00(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.e("findmissingpermissions/no-package-manager");
                return "";
            }
            PackageInfo packageInfo = packageManager.getPackageInfo("com.whatsapp", 4096);
            StringBuilder sb = new StringBuilder();
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                int i = 0;
                while (true) {
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    if (i >= iArr.length) {
                        break;
                    }
                    if ((iArr[i] & 2) == 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(strArr[i]);
                    }
                    i++;
                }
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(e);
            return "";
        }
    }

    public static String A01(NetworkInfo networkInfo) {
        StringBuilder sb = new StringBuilder();
        if (networkInfo != null) {
            A04(sb, networkInfo.getTypeName());
            String subtypeName = networkInfo.getSubtypeName();
            if (!TextUtils.isEmpty(subtypeName)) {
                sb.append(" (");
                A04(sb, subtypeName);
                sb.append(')');
            }
        } else {
            sb.append("NONE");
        }
        return sb.toString();
    }

    public static String A02(String str) {
        StringBuilder sb = new StringBuilder(str.length() << 1);
        A04(sb, str);
        return sb.toString();
    }

    public static void A03(String str, Object obj, Object obj2) {
        if (obj2 instanceof JSONObject) {
            try {
                ((JSONObject) obj2).put(str, obj);
            } catch (JSONException e) {
                Log.e("debug-builder/json/error ", e);
            }
        } else if (obj2 instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) obj2;
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append('\n');
        }
    }

    public static void A04(StringBuilder sb, String str) {
        if (str == null) {
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append('.');
        }
    }

    public final String A05() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        try {
            C2DQ A02 = this.A0U.A02(0, TimeUnit.MILLISECONDS);
            Set set = A02.A00;
            if (set != null) {
                sb.append("TK-NP-");
                sb.append(set.size());
                sb.append(' ');
            }
            Set set2 = A02.A01;
            if (set2 != null) {
                sb.append("TK-NS-");
                sb.append(set2.size());
                sb.append(' ');
            }
        } catch (Exception unused) {
            sb.append("TK-FG-0 ");
        }
        try {
            Class.forName("org.acra.ACRA");
            sb.append("NW-WAP-1 ");
        } catch (ClassNotFoundException unused2) {
        }
        if (C02A.A0A(this.A0E)) {
            sb.append("DC-RTED ");
        }
        if (C02A.A08()) {
            sb.append("DC-BACRM ");
        }
        sb.append("FE-GDE ");
        if (this.A08.A07()) {
            sb.append("FE-GDC ");
            Log.i("debug-builder/generate-diagnostics/gdrive-capable");
        } else {
            Log.i("debug-builder/generate-diagnostics/gdrive-not-capable");
        }
        sb.append("FE-VIDC ");
        Log.i("debug-builder/generate-diagnostics/video-call-capable");
        C001200o c001200o = this.A0F;
        if (this.A0G.A02("android.permission.RECEIVE_SMS") != 0 && AnonymousClass029.A1L(c001200o.A00)) {
            z = true;
        }
        if (z) {
            sb.append("FE-SMSRTV ");
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public final String A06() {
        String str;
        String str2;
        C02L c02l = this.A04;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            StringBuilder A0P = C000200d.A0P("+");
            A0P.append(userJid.user);
            str = A0P.toString();
        } else {
            str = "unregistered";
        }
        if (this.A01.A04()) {
            String A0H = C000200d.A0H("chnum ", str);
            Me A01 = c02l.A01();
            return (A01 == null || (str2 = A01.jabber_id) == null) ? A0H : C000200d.A0L(C000200d.A0V(A0H, " ("), str2, ")");
        }
        return str;
    }

    public final void A07(Object obj, Context context, SimpleDateFormat simpleDateFormat) {
        String format;
        String format2;
        String str;
        long A08 = this.A0I.A08();
        if (A08 == 0) {
            format = "never";
        } else {
            format = A08 == -1 ? "unknown" : simpleDateFormat.format(new Date(A08));
        }
        A03("Last local backup time", format, obj);
        C000500h c000500h = this.A0H;
        String A0F = c000500h.A0F();
        boolean z = !TextUtils.isEmpty(A0F);
        A03("Google account added", Boolean.valueOf(z), obj);
        if (z) {
            long A0A = c000500h.A0A(A0F);
            if (A0A == 0) {
                format2 = "never";
            } else {
                format2 = A0A == -1 ? "unknown" : simpleDateFormat.format(new Date(A0A));
            }
            A03("Last successful Google Drive backup time", format2, obj);
            long A0B = c000500h.A0B(A0F);
            if (A0B > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(A0B);
                sb.append(" (");
                sb.append(Formatter.formatFileSize(context, A0B));
                sb.append(")");
                A03("Size of Google Drive backup", sb.toString(), obj);
            }
            A03("Backup to Google Drive frequency", C40061rW.A05(c000500h.A03()), obj);
            int A04 = c000500h.A04();
            if (A04 != 0) {
                str = A04 != 1 ? "unknown" : "wifi or cellular";
            } else {
                str = "wifi only";
            }
            A03("Backed up over", str, obj);
            A03("Videos included in backup", Boolean.valueOf(c000500h.A00.getBoolean("gdrive_include_videos_in_backup", false)), obj);
        }
    }
}
