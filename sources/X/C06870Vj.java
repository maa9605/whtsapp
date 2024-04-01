package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Vj */
/* loaded from: classes.dex */
public class C06870Vj {
    public static final Map A05;
    public static volatile C06870Vj A06;
    public final C018308n A00;
    public final C018508q A01;
    public final C02E A02;
    public final C002301c A03;
    public final C006602x A04;

    static {
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("terms-of-service", "https://www.whatsapp.com/legal/#terms-of-service");
        Map map = A05;
        map.put("privacy-policy", "https://www.whatsapp.com/legal/#privacy-policy");
        map.put("end-to-end-encryption", "https://faq.whatsapp.com/general/28030015/");
        map.put("facebook-companies", "https://www.facebook.com/help/111814505650678");
        map.put("how-whatsapp-works-with-the-facebook-companies", "https://faq.whatsapp.com/general/26000112/");
        map.put("privacy-policy-managing-and-deleting-your-information", "https://www.whatsapp.com/legal/#privacy-policy-managing-and-deleting-your-information");
        map.put("privacy-policy-our-global-operations", "https://www.whatsapp.com/legal/#privacy-policy-our-global-operations");
        map.put("terms-of-service-age", "https://www.whatsapp.com/legal/#terms-of-service-age");
        map.put("cookies", "https://www.whatsapp.com/legal/#cookies");
    }

    public C06870Vj(C018508q c018508q, C006602x c006602x, C018308n c018308n, C02E c02e, C002301c c002301c) {
        this.A01 = c018508q;
        this.A04 = c006602x;
        this.A00 = c018308n;
        this.A02 = c02e;
        this.A03 = c002301c;
    }

    public Uri A00(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        C002301c c002301c = this.A03;
        buildUpon.appendQueryParameter("lg", c002301c.A04());
        buildUpon.appendQueryParameter("lc", c002301c.A03());
        buildUpon.appendQueryParameter("eea", this.A04.A07(C01C.A0I) ? "1" : "0");
        return buildUpon.build();
    }

    public CharSequence A01(final Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, str.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableStringBuilder.setSpan(new C02740Cr(context, this.A01, this.A02, this.A00, uRLSpan.getURL()) { // from class: X.131
                    public final /* synthetic */ boolean A02 = true;

                    {
                        C06870Vj.this = this;
                    }

                    @Override // X.C02740Cr, X.InterfaceC02760Ct
                    public void onClick(View view) {
                        StringBuilder A0P = C000200d.A0P("wa-link-factory/click-link ");
                        String str2 = this.A06;
                        C000200d.A1N(A0P, str2);
                        String str3 = (String) C06870Vj.A05.get(str2);
                        if (str3 != null) {
                            Uri parse = Uri.parse(str3);
                            if (parse.getAuthority().contains("whatsapp")) {
                                Uri.Builder buildUpon = parse.buildUpon();
                                C002301c c002301c = C06870Vj.this.A03;
                                buildUpon.appendQueryParameter("lg", c002301c.A04());
                                buildUpon.appendQueryParameter("lc", c002301c.A03());
                                buildUpon.appendQueryParameter("eea", this.A02 ? "1" : "0");
                                parse = buildUpon.build();
                            }
                            StringBuilder sb = new StringBuilder("wa-link-factory/open-link ");
                            sb.append(parse);
                            Log.i(sb.toString());
                            C06870Vj.this.A00.AS7(context, parse);
                        }
                    }
                }, spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            }
            for (URLSpan uRLSpan2 : uRLSpanArr) {
                spannableStringBuilder.removeSpan(uRLSpan2);
            }
        }
        return spannableStringBuilder;
    }
}
