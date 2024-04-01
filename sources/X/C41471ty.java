package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.1ty */
/* loaded from: classes2.dex */
public class C41471ty extends C41481tz {
    public static final String[] A02 = C41481tz.A05;
    public static volatile C41471ty A03;
    public long A00;
    public final C018308n A01;

    public C41471ty(AnonymousClass012 anonymousClass012, C02L c02l, C018308n c018308n, C02E c02e, C000500h c000500h) {
        super(anonymousClass012, c02l, c02e, c000500h);
        this.A00 = -1L;
        this.A01 = c018308n;
    }

    public static C41471ty A00() {
        if (A03 == null) {
            synchronized (C41471ty.class) {
                if (A03 == null) {
                    A03 = new C41471ty(AnonymousClass012.A00(), C02L.A00(), C018308n.A02(), C02E.A00(), C000500h.A00());
                }
            }
        }
        return A03;
    }

    public void A08(Activity activity, AbstractC005302j abstractC005302j) {
        Class cls;
        if (A07(activity)) {
            cls = LocationPicker2.class;
        } else {
            cls = LocationPicker.class;
        }
        Intent intent = new Intent(activity, cls);
        intent.putExtra("jid", abstractC005302j.getRawString());
        intent.putExtra("live_location_mode", true);
        activity.startActivityForResult(intent, 100);
    }

    public void A09(Context context, double d, double d2, String str) {
        String obj;
        String str2 = str;
        if (str != null) {
            try {
                str2 = URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                Log.e("app/failed-url-encode");
            }
        }
        try {
            StringBuilder sb = new StringBuilder("geo:");
            sb.append(d);
            sb.append(",");
            sb.append(d2);
            sb.append("?q=");
            sb.append(d);
            sb.append(",");
            sb.append(d2);
            String obj2 = sb.toString();
            if (str2 != null) {
                obj2 = C000200d.A0J(obj2, "(", str2, ")");
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(obj2)));
        } catch (ActivityNotFoundException e) {
            Log.w("open-map/start-activity ", e);
            C018308n c018308n = this.A01;
            if (DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator() == ',') {
                long j = this.A00;
                if (j < 0) {
                    j = AnonymousClass029.A0B(context, "com.google.android.apps.maps");
                    this.A00 = j;
                    if (j == -1) {
                        this.A00 = 0L;
                    }
                }
                if (j >= 700000000 && j < 702000000) {
                    StringBuilder sb2 = new StringBuilder("https://maps.google.com/maps?q=loc:(");
                    sb2.append(d);
                    sb2.append(",");
                    sb2.append(d2);
                    sb2.append("&z=16");
                    obj = sb2.toString();
                    c018308n.A06(context, new Intent("android.intent.action.VIEW", Uri.parse(obj)));
                }
            }
            StringBuilder sb3 = new StringBuilder("https://maps.google.com/maps?q=loc:");
            sb3.append(d);
            sb3.append(",");
            sb3.append(d2);
            obj = sb3.toString();
            if (str2 != null) {
                obj = C000200d.A0J(obj, " (", str2, ")");
            }
            c018308n.A06(context, new Intent("android.intent.action.VIEW", Uri.parse(obj)));
        }
    }

    public void A0A(Context context, AbstractC005302j abstractC005302j, UserJid userJid) {
        Class cls;
        if (A07(context)) {
            cls = GroupChatLiveLocationsActivity2.class;
        } else {
            cls = GroupChatLiveLocationsActivity.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("jid", abstractC005302j.getRawString());
        intent.putExtra("target", C003101m.A07(userJid));
        context.startActivity(intent);
    }
}
