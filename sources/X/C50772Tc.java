package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2Tc */
/* loaded from: classes2.dex */
public class C50772Tc {
    public static volatile C50772Tc A03;
    public final C018308n A00;
    public final C003701t A01;
    public final C41951um A02;

    public C50772Tc(C003701t c003701t, C018308n c018308n, C41951um c41951um) {
        this.A01 = c003701t;
        this.A00 = c018308n;
        this.A02 = c41951um;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0100 A[LOOP:0: B:117:0x00fa->B:119:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(android.content.Context r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50772Tc.A00(android.content.Context, boolean):void");
    }

    public void A01(String str, Map map, Context context) {
        int hashCode = str.hashCode();
        if (hashCode != -745876118) {
            if (hashCode == 1499924893 && str.equals("open-link")) {
                String str2 = (String) map.get("link");
                if (str2 == null) {
                    Log.e("UserNoticeLinkActionHandler/handleOpenLink null url");
                    return;
                }
                this.A00.A06(context, new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                return;
            }
        } else if (str.equals("open-modal")) {
            A00(context, false);
            return;
        }
        StringBuilder sb = new StringBuilder("UserNoticeLinkActionHandler/handleAction unknown action: ");
        sb.append(str);
        sb.append(" with params: ");
        sb.append(map);
        Log.e(sb.toString());
    }
}
