package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Xg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51642Xg extends AbstractC51652Xh {
    public C06S A00;
    public C72763aY A01;

    public C51642Xg(Context context) {
        super(context);
    }

    @Override // X.AbstractC51592Xb
    public int getNegativeButtonTextResId() {
        return R.string.no_thanks;
    }

    @Override // X.AbstractC51592Xb
    public int getPositiveButtonIconResId() {
        return R.drawable.ic_settings_contacts;
    }

    @Override // X.AbstractC51592Xb
    public int getPositiveButtonTextResId() {
        return R.string.vcards_view_all;
    }
}
