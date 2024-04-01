package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4DS  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4DS extends AbstractC04890Mh {
    public List A00 = new ArrayList();
    public final /* synthetic */ IndiaUpiBankPickerActivity A01;

    public C4DS(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity) {
        this.A01 = indiaUpiBankPickerActivity;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return this.A00.get(i) instanceof String ? 1 : 2;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            return new C4DR(this.A01, from.inflate(R.layout.india_upi_payment_bank_picker_list_row, viewGroup, false));
        }
        return new C4DU(from.inflate(R.layout.india_upi_payment_bank_picker_header_row, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        if (A0D(i) == 1) {
            ((C4DU) c0ts).A00.setText((String) this.A00.get(i));
            return;
        }
        C4DR c4dr = (C4DR) c0ts;
        C0N5 c0n5 = (C0N5) this.A00.get(i);
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = c4dr.A03;
        Drawable A0Q = C02180Ae.A0Q(indiaUpiBankPickerActivity.getResources().getDrawable(R.drawable.bank_logo_placeholder), indiaUpiBankPickerActivity.getResources().getColor(R.color.fb_pay_hub_icon_tint));
        if (!TextUtils.isEmpty(c0n5.A0A())) {
            AnonymousClass241 anonymousClass241 = indiaUpiBankPickerActivity.A0A;
            String A0A = c0n5.A0A();
            if (A0A != null) {
                anonymousClass241.A02(A0A, c4dr.A01, A0Q);
            } else {
                throw null;
            }
        } else {
            c4dr.A01.setImageDrawable(A0Q);
        }
        int i2 = 0;
        c4dr.A02.A06(c0n5.A0B(), indiaUpiBankPickerActivity.A0D, false, 0);
        c0ts.A0H.setOnClickListener(new C3P2(this, c0ts, i));
        c4dr.A00.setVisibility((i == A0C() - 1 || A0D(i + 1) == 1) ? 4 : 4);
    }

    public /* synthetic */ void A0G(C0TS c0ts, int i) {
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A01;
        ((AbstractActivityC92444Kp) indiaUpiBankPickerActivity).A05.A01(c0ts.A0H);
        C0N5 c0n5 = (C0N5) this.A00.get(i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (A0D(i3) != 1) {
                i2++;
            }
        }
        int i4 = i - i2;
        if (indiaUpiBankPickerActivity != null) {
            Intent intent = new Intent(indiaUpiBankPickerActivity, IndiaUpiDeviceBindActivity.class);
            indiaUpiBankPickerActivity.A1Z(intent);
            intent.putExtra("extra_selected_bank", c0n5);
            indiaUpiBankPickerActivity.startActivity(intent);
            indiaUpiBankPickerActivity.finish();
            C37031ll c37031ll = indiaUpiBankPickerActivity.A0F;
            String str = indiaUpiBankPickerActivity.A0B;
            c37031ll.A07 = str;
            c37031ll.A04 = Boolean.valueOf(!TextUtils.isEmpty(str));
            c37031ll.A06 = c0n5.A0B();
            Long valueOf = Long.valueOf(i4);
            c37031ll.A05 = valueOf;
            ((AbstractActivityC92444Kp) indiaUpiBankPickerActivity).A04.A07(c37031ll);
            C37311mD c37311mD = indiaUpiBankPickerActivity.A0G;
            String str2 = indiaUpiBankPickerActivity.A0B;
            c37311mD.A0J = str2;
            c37311mD.A02 = Boolean.valueOf(!TextUtils.isEmpty(str2));
            c37311mD.A0K = c0n5.A0B();
            c37311mD.A0D = valueOf;
            c37311mD.A0P = "nav_bank_select";
            c37311mD.A05 = 1;
            c37311mD.A0J = indiaUpiBankPickerActivity.A0B;
            c37311mD.A04 = 5;
            ((AbstractActivityC92444Kp) indiaUpiBankPickerActivity).A04.A07(c37311mD);
            return;
        }
        throw null;
    }
}
