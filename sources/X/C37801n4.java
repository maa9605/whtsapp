package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.1n4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C37801n4 implements InterfaceC10010f9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C02980Dr A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C37801n4(C02980Dr c02980Dr, Context context, int i, boolean z) {
        this.A02 = c02980Dr;
        this.A01 = context;
        this.A00 = i;
        this.A03 = z;
    }

    @Override // X.InterfaceC10010f9
    public final void ANr(SpannableStringBuilder spannableStringBuilder, int i, int i2, final C06C c06c) {
        C02980Dr c02980Dr = this.A02;
        final Context context = this.A01;
        final int i3 = this.A00;
        boolean z = this.A03;
        final C02L c02l = c02980Dr.A00;
        spannableStringBuilder.setSpan(new AbstractC02750Cs(context, c02l, i3, c06c) { // from class: X.1MN
            public final C02L A00;
            public final C06C A01;

            {
                this.A01 = c06c;
                this.A00 = c02l;
            }

            @Override // X.InterfaceC02760Ct
            public void onClick(View view) {
                C02L c02l2 = this.A00;
                C06C c06c2 = this.A01;
                if (c02l2.A0A(c06c2.A02())) {
                    return;
                }
                ContactInfoActivity.A03(c06c2, C018308n.A00(view.getContext()), null);
            }
        }, i, i2, 33);
        if (z) {
            spannableStringBuilder.setSpan(new C10200fS(context.getApplicationContext()), i + 1, i2, 33);
        }
    }
}
