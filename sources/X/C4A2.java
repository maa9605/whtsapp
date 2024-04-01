package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.4A2  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4A2 {
    public int A00(int i) {
        if (i != 403) {
            if (i != 404) {
                if (i == 429) {
                    return R.string.virality_payments_not_enabled_description_limit_hit;
                }
                if (i == 443) {
                    return R.string.virality_payments_not_enabled_description_app_upgrade_needed;
                }
                if (i != 445) {
                    return R.string.payments_generic_error;
                }
            }
            return R.string.virality_payments_not_enabled_description_link_expired;
        }
        return R.string.virality_payments_ineligible;
    }
}
