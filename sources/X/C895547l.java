package X;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.search.verification.client.R;

/* renamed from: X.47l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C895547l {
    public final C002301c A00;

    public C895547l(C002301c c002301c) {
        this.A00 = c002301c;
    }

    public static DialogInterfaceC019408z A00(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        C019208x c019208x = new C019208x(context);
        c019208x.A01.A0E = str;
        c019208x.A06(R.string.ok, null);
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setOnDismissListener(onDismissListener);
        return A00;
    }

    public static DialogInterfaceC019408z A01(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        C019208x c019208x = new C019208x(context);
        C019308y c019308y = c019208x.A01;
        c019308y.A0I = str;
        c019308y.A0E = str2;
        c019208x.A06(R.string.ok, null);
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setOnDismissListener(onDismissListener);
        return A00;
    }

    public DialogInterfaceC019408z A02(Context context, int i, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2) {
        if (i != 6 && i != 7) {
            switch (i) {
                case -2:
                    break;
                case 400:
                case 403:
                case 2826001:
                    return A00(context, this.A00.A06(R.string.payments_sender_generic_error), onDismissListener);
                case 443:
                    return A00(context, this.A00.A06(R.string.payments_upgrade_error), onDismissListener2);
                case 500:
                case 503:
                case 4002:
                case 2826004:
                    return A00(context, this.A00.A06(R.string.payments_generic_error), onDismissListener2);
                case 10702:
                    return A00(context, this.A00.A06(R.string.payments_bank_generic_error), onDismissListener2);
                case 2826007:
                    C002301c c002301c = this.A00;
                    return A01(context, c002301c.A06(R.string.describe_problem_contact_support), c002301c.A06(R.string.payments_risk_blocked), onDismissListener2);
                case 2826009:
                    C002301c c002301c2 = this.A00;
                    return A01(context, c002301c2.A06(R.string.payments_try_again_later), c002301c2.A06(R.string.payments_risk_try_again_later), onDismissListener2);
                case 2826012:
                    return A00(context, this.A00.A06(R.string.payments_risk_method_blocked), onDismissListener2);
                default:
                    return null;
            }
        }
        return A00(context, this.A00.A06(R.string.no_internet_message), onDismissListener2);
    }

    public DialogInterfaceC019408z A03(Context context, int i, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2) {
        if (i == 8 || i == 9) {
            return A00(context, this.A00.A06(R.string.payments_generic_error), onDismissListener);
        }
        if (i != 1448) {
            return null;
        }
        return A00(context, this.A00.A06(R.string.payments_generic_error), onDismissListener2);
    }

    public final DialogInterfaceC019408z A04(Context context, int i, String str, DialogInterface.OnDismissListener onDismissListener) {
        C002301c c002301c = this.A00;
        return A00(context, String.format(c002301c.A0I(), c002301c.A06(i), str), onDismissListener);
    }
}
