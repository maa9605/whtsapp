package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4Hw */
/* loaded from: classes3.dex */
public class C92184Hw extends C4FQ {
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public C0Zn A03;
    public C0L5 A04;

    public C92184Hw(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.payment_setting_profile_detail_row, (ViewGroup) this, true);
        setOrientation(1);
        this.A00 = (ImageView) findViewById(R.id.profile_image);
        this.A02 = (TextView) findViewById(R.id.profile_payment_name);
        this.A01 = (TextView) findViewById(R.id.profile_payment_handler);
        this.A03 = this.A04.A04(getContext());
    }

    public void setIconTint(int i) {
        C02180Ae.A17((ImageView) findViewById(R.id.qr_code_icon), i);
    }
}
