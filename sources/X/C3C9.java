package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.greenalert.GreenAlertActivity;
import java.util.TreeMap;

/* renamed from: X.3C9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3C9 extends C0ZT {
    public final InterfaceC13310l3 A00;
    public final C018308n A01;
    public final AbstractC000600i A02;
    public final C018508q A03;
    public final C06870Vj A04;
    public final C02E A05;
    public final AnonymousClass072 A06;
    public final C002301c A07;
    public final C003701t A08;
    public final C40071rX A09;
    public final C006602x A0A;

    @Override // X.C0ZT
    public int A0B() {
        return 2;
    }

    @Override // X.C0ZT
    public boolean A0E(View view, Object obj) {
        return view == obj;
    }

    public C3C9(C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C006602x c006602x, C018308n c018308n, C06870Vj c06870Vj, C40071rX c40071rX, C02E c02e, C002301c c002301c, AnonymousClass072 anonymousClass072, InterfaceC13310l3 interfaceC13310l3) {
        this.A08 = c003701t;
        this.A03 = c018508q;
        this.A02 = abstractC000600i;
        this.A0A = c006602x;
        this.A01 = c018308n;
        this.A04 = c06870Vj;
        this.A09 = c40071rX;
        this.A05 = c02e;
        this.A07 = c002301c;
        this.A06 = anonymousClass072;
        this.A00 = interfaceC13310l3;
    }

    public static final void A00(View view, int i, int i2) {
        ((ImageView) C0AT.A0D(view, R.id.green_alert_education_image)).setImageResource(i);
        ((TextView) C0AT.A0D(view, R.id.green_alert_education_image_caption)).setText(Html.fromHtml(view.getContext().getString(i2)));
    }

    @Override // X.C0ZT
    public Object A0C(ViewGroup viewGroup, int i) {
        NestedScrollView nestedScrollView;
        int A0F = A0F(i);
        if (A0F == 0) {
            nestedScrollView = (NestedScrollView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.green_alert_education_page, viewGroup, false);
            TextView textView = (TextView) C0AT.A0D(nestedScrollView, R.id.green_alert_education_title);
            C0AT.A0M(textView);
            textView.setText(R.string.green_alert_education_page_1_title);
            ((TextView) C0AT.A0D(nestedScrollView, R.id.green_alert_education_intro)).setText(R.string.green_alert_education_page_1_intro);
            A00(C0AT.A0D(nestedScrollView, R.id.green_alert_education_image_and_caption_1), R.drawable.ga_edu_1, R.string.green_alert_education_page_1_caption_1);
            A00(C0AT.A0D(nestedScrollView, R.id.green_alert_education_image_and_caption_2), R.drawable.ga_edu_2, R.string.green_alert_education_page_1_caption_2);
            View A0D = C0AT.A0D(nestedScrollView, R.id.green_alert_education_image_and_caption_3);
            String A0I = A0I(C2A8.A00);
            ((ImageView) C0AT.A0D(A0D, R.id.green_alert_education_image)).setImageResource(R.drawable.ga_edu_3);
            A0L((TextEmojiLabel) C0AT.A0D(A0D, R.id.green_alert_education_image_caption), A0D.getContext().getString(R.string.green_alert_education_page_1_caption_3, "0"), A0I);
        } else if (A0F == 1) {
            nestedScrollView = (NestedScrollView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.green_alert_tos_page, viewGroup, false);
            TextView textView2 = (TextView) C0AT.A0D(nestedScrollView, R.id.green_alert_tos_title);
            C0AT.A0M(textView2);
            textView2.setText(A0G(nestedScrollView.getContext(), GreenAlertActivity.A0S));
            ((TextView) C0AT.A0D(nestedScrollView, R.id.green_alert_tos_intro)).setText(Html.fromHtml(A0G(nestedScrollView.getContext(), GreenAlertActivity.A0M)));
            A0L((TextEmojiLabel) C0AT.A0D(nestedScrollView, R.id.green_alert_tos_bullets_header), A0H(nestedScrollView.getContext(), GreenAlertActivity.A0N, "0"), A0I(C2A8.A00));
            A0K(C0AT.A0D(nestedScrollView, R.id.green_alert_tos_bullet_1), R.drawable.ga_tos_1, A0G(nestedScrollView.getContext(), GreenAlertActivity.A0O), new String[0]);
            A0K(C0AT.A0D(nestedScrollView, R.id.green_alert_tos_bullet_2), R.drawable.ga_tos_2, A0G(nestedScrollView.getContext(), GreenAlertActivity.A0P), new String[0]);
            if (C2A8.A04(this.A0A, this.A06)) {
                C0AT.A0D(nestedScrollView, R.id.green_alert_tos_bullet_3).setVisibility(8);
            } else {
                C0AT.A0D(nestedScrollView, R.id.green_alert_tos_bullet_3).setVisibility(0);
                A0K(C0AT.A0D(nestedScrollView, R.id.green_alert_tos_bullet_3), R.drawable.ga_tos_3, A0H(nestedScrollView.getContext(), GreenAlertActivity.A0Q, "0"), A0I(C2A8.A02));
            }
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0AT.A0D(nestedScrollView, R.id.green_alert_tos_footer);
            Context context = nestedScrollView.getContext();
            int[] iArr = GreenAlertActivity.A0R;
            Object[] objArr = new Object[4];
            objArr[0] = "0";
            objArr[1] = "1";
            Context context2 = nestedScrollView.getContext();
            C003701t c003701t = this.A08;
            AbstractC000600i abstractC000600i = this.A02;
            int[][] iArr2 = C2A8.A05;
            int A03 = c003701t.A03(358);
            int i2 = 0;
            while (true) {
                if (i2 < iArr2.length) {
                    if (A03 == iArr2[i2][0]) {
                        break;
                    }
                    i2++;
                } else {
                    abstractC000600i.A09("greenAlert/misconfigured blocking time", String.valueOf(A03), false);
                    i2 = 0;
                    break;
                }
            }
            objArr[2] = context2.getString(iArr2[i2][1]);
            objArr[3] = "2";
            A0L(textEmojiLabel, A0H(context, iArr, objArr), A0J(C2A8.A03), A0J(C2A8.A01), A0I(C2A8.A04));
        } else {
            StringBuilder A0P = C000200d.A0P("Unknown abstract page: ");
            A0P.append(A0F(i));
            throw new IllegalArgumentException(A0P.toString());
        }
        nestedScrollView.A0E = this.A00;
        nestedScrollView.setTag(Integer.valueOf(A0F));
        viewGroup.addView(nestedScrollView);
        return nestedScrollView;
    }

    @Override // X.C0ZT
    public void A0D(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final int A0F(int i) {
        if (i < 0 || i >= 2) {
            return -1;
        }
        return this.A07.A0N() ? (2 - i) - 1 : i;
    }

    public final String A0G(Context context, int[] iArr) {
        C006602x c006602x = this.A0A;
        return context.getString((C2A8.A04(c006602x, this.A06) || (c006602x.A08("BR") && iArr == GreenAlertActivity.A0R)) ? iArr[1] : iArr[0]);
    }

    public final String A0H(Context context, int[] iArr, Object... objArr) {
        C006602x c006602x = this.A0A;
        return context.getString((C2A8.A04(c006602x, this.A06) || (c006602x.A08("BR") && iArr == GreenAlertActivity.A0R)) ? iArr[1] : iArr[0], objArr);
    }

    public final String A0I(String[] strArr) {
        String str;
        C40071rX c40071rX = this.A09;
        C006602x c006602x = this.A0A;
        if (C2A8.A04(c006602x, this.A06)) {
            str = strArr[2];
        } else if (c006602x.A08("BR")) {
            str = strArr[1];
        } else {
            str = strArr[0];
        }
        return c40071rX.A02("security-and-privacy", str).toString();
    }

    public final String A0J(String[] strArr) {
        String str;
        C06870Vj c06870Vj = this.A04;
        C006602x c006602x = this.A0A;
        if (C2A8.A04(c006602x, this.A06)) {
            str = strArr[2];
        } else if (c006602x.A08("BR")) {
            str = strArr[1];
        } else {
            str = strArr[0];
        }
        return c06870Vj.A00(str).toString();
    }

    public final void A0K(View view, int i, String str, String... strArr) {
        ((ImageView) C0AT.A0D(view, R.id.green_alert_tos_bullet_image)).setImageResource(i);
        A0L((TextEmojiLabel) C0AT.A0D(view, R.id.green_alert_tos_bullet_text), str, strArr);
    }

    public final void A0L(TextEmojiLabel textEmojiLabel, String str, String... strArr) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        TreeMap treeMap = new TreeMap();
        for (int i = 0; i < length; i++) {
            String valueOf = String.valueOf(i);
            objArr[i] = valueOf;
            treeMap.put(valueOf, Uri.parse(strArr[i]));
        }
        AnonymousClass029.A16(textEmojiLabel.getContext(), this.A03, this.A01, this.A05, textEmojiLabel, String.format(this.A07.A0I(), str, objArr), treeMap);
    }
}
