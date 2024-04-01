package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.google.android.search.verification.client.R;

/* renamed from: X.1h3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C34151h3 implements InterfaceC26601Jw {
    public final /* synthetic */ char A00 = '*';
    public final /* synthetic */ Context A01;

    public /* synthetic */ C34151h3(Context context) {
        this.A01 = context;
    }

    @Override // X.InterfaceC26601Jw
    public final SpannableStringBuilder ADD(String str) {
        char c = this.A00;
        Context context = this.A01;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == c) {
                int i2 = i + 1;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i, i2, 33);
                spannableStringBuilder.setSpan(new C1K0(context, C02160Ac.A00(context, R.color.code_input_hint_color)), i, i2, 33);
            } else if (spannableStringBuilder.charAt(i) != 160) {
                spannableStringBuilder.setSpan(new C1K0(context, C02160Ac.A00(context, R.color.code_input_text)), i, i + 1, 33);
            }
        }
        return spannableStringBuilder;
    }
}
