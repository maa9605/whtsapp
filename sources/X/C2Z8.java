package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.TextData;
import com.whatsapp.status.playback.widget.TextStatusContentView;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2Z8 */
/* loaded from: classes2.dex */
public class C2Z8 extends FrameLayout implements AnonymousClass005 {
    public C02E A00;
    public C40081rY A01;
    public C02O A02;
    public C3XU A03;
    public TextStatusContentView A04;
    public C2UB A05;
    public List A06;
    public boolean A07;

    public C2Z8(Context context) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            ((AbstractC07960aN) generatedComponent()).A2h(this);
        }
        this.A06 = new ArrayList();
        this.A04 = (TextStatusContentView) LayoutInflater.from(context).inflate(R.layout.status_playback_text, (ViewGroup) this, true).findViewById(R.id.message_text);
    }

    public static C2Z8 A00(Context context, C0JJ c0jj, boolean z) {
        int i;
        String substring;
        int min;
        C2Z8 c2z8 = new C2Z8(context);
        TextData textData = c0jj.A01;
        if (textData != null) {
            c2z8.setTextContentProperties(textData);
        }
        String A03 = C48222Ej.A03(c0jj.A19());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A03);
        AnonymousClass029.A0Q(c2z8.A00, c2z8.A02, spannableStringBuilder);
        C002701i.A0d(spannableStringBuilder, c2z8.getContext(), c2z8.A04.getPaint(), c2z8.A01);
        C04310Jr.A06(spannableStringBuilder);
        int i2 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int i3 = R.color.transparent;
        if (z) {
            i3 = R.color.white_alpha_20;
        }
        int A00 = C02160Ac.A00(c2z8.getContext(), i3);
        int length = uRLSpanArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            URLSpan uRLSpan = uRLSpanArr[i2];
            String url = uRLSpan.getURL();
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            spannableStringBuilder.removeSpan(uRLSpan);
            try {
                String host = new URL(url).getHost();
                int indexOf = url.indexOf(host);
                if (indexOf < 0) {
                    StringBuilder sb = new StringBuilder("cannot find host ");
                    sb.append(host);
                    sb.append(" in ");
                    sb.append(url);
                    Log.e(sb.toString());
                    substring = url.substring(0, Math.min(34, url.length()));
                } else {
                    String substring2 = url.substring(host.length() + indexOf);
                    if (host.toLowerCase(Locale.US).startsWith("www.")) {
                        host = host.substring(4);
                    }
                    int length2 = substring2.length();
                    if (length2 > 12 || length2 + host.length() > 34) {
                        min = Math.min(length2, Math.max(length2 - 12, (host.length() + length2) - 34));
                        substring2 = substring2.substring(0, length2 - min);
                    } else {
                        min = 0;
                    }
                    if (substring2.length() == 1) {
                        substring2 = "";
                    }
                    substring = C000200d.A0H(host, substring2);
                    int length3 = substring.length();
                    if (length3 > 34) {
                        StringBuilder A0P = C000200d.A0P("…");
                        A0P.append(substring.substring(length3 - 34));
                        substring = A0P.toString();
                    }
                    if (min > 0) {
                        substring = C000200d.A0H(substring, "…");
                    }
                }
                i = 0;
            } catch (MalformedURLException e) {
                StringBuilder sb2 = new StringBuilder("unvalid url ");
                sb2.append(url);
                Log.e(sb2.toString(), e);
                i = 0;
                substring = url.substring(0, Math.min(34, url.length()));
            }
            spannableStringBuilder.setSpan(new C3ZJ(substring, url, A00), spanStart, spanEnd, i);
            i4 += spanEnd - spanStart;
            ImageSpan[] imageSpanArr = (ImageSpan[]) spannableStringBuilder.getSpans(spanStart, spanEnd, ImageSpan.class);
            int length4 = imageSpanArr.length;
            while (i < length4) {
                spannableStringBuilder.removeSpan(imageSpanArr[i]);
                i++;
            }
            i2++;
            i5 = 0;
        }
        c2z8.A04.setText(spannableStringBuilder);
        int A01 = C43981yK.A01(A03);
        int length5 = A03.length();
        int i6 = 0;
        while (i6 < length5 && A01 > 0) {
            int codePointAt = A03.codePointAt(i6);
            if (Character.isWhitespace(codePointAt)) {
                A01--;
            }
            i6 += Character.charCount(codePointAt);
        }
        c2z8.A03 = new C3XU((Math.min((A01 - i4) + length, (int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS) * 60) + 2000);
        c2z8.A06.clear();
        while (i5 < length) {
            c2z8.A06.add(uRLSpanArr[i5].getURL());
            i5++;
        }
        return c2z8;
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A05;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A05 = c2ub;
        }
        return c2ub.generatedComponent();
    }

    public List getDisplayedUrls() {
        return this.A06;
    }

    public C3XU getStaticContentPlayer() {
        return this.A03;
    }

    private void setTextContentProperties(TextData textData) {
        int i = textData.textColor;
        if (i != 0) {
            this.A04.setTextColor(i);
        }
        int i2 = textData.backgroundColor;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        this.A04.setTypeface(C48222Ej.A02(getContext(), textData.fontStyle));
    }
}
