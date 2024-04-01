package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Xe  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51622Xe extends AbstractC51632Xf {
    public AnonymousClass031 A00;
    public C02L A01;
    public C06K A02;
    public C05W A03;
    public C001200o A04;
    public C002301c A05;

    public C51622Xe(Context context) {
        super(context);
    }

    @Override // X.AbstractC51592Xb
    public int getNegativeButtonTextResId() {
        return R.string.contact_qr_reciprocal_footer_dismiss;
    }

    @Override // X.AbstractC51592Xb
    public int getPositiveButtonIconResId() {
        return R.drawable.ic_settings_name;
    }

    @Override // X.AbstractC51592Xb
    public int getPositiveButtonTextResId() {
        return R.string.contact_qr_share_my_contact_button;
    }
}
