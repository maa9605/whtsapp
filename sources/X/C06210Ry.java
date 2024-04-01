package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.TypedValue;
import com.google.android.gms.common.SupportErrorDialogFragment;

/* renamed from: X.0Ry */
/* loaded from: classes.dex */
public class C06210Ry extends C06220Rz {
    public static final Object A01 = new Object();
    public static final C06210Ry A00 = new C06210Ry();

    public static Dialog A00(Context context, int i, AbstractDialogInterface$OnClickListenerC230314y abstractDialogInterface$OnClickListenerC230314y, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C230214x.A02(context, i));
        builder.setOnCancelListener(onCancelListener);
        String A012 = C230214x.A01(context, i);
        if (A012 != null) {
            builder.setPositiveButton(A012, abstractDialogInterface$OnClickListenerC230314y);
        }
        String A03 = C230214x.A03(context, i);
        if (A03 != null) {
            builder.setTitle(A03);
        }
        return builder.create();
    }

    public static final C14S A01(Context context, C14T c14t) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C14S c14s = new C14S(c14t);
        context.registerReceiver(c14s, intentFilter);
        c14s.A00 = context;
        if (C0CL.A02(context)) {
            return c14s;
        }
        c14t.A00();
        c14s.A00();
        return null;
    }

    public static void A02(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC02330At) {
            AbstractC02800Cx A0N = ((ActivityC02330At) activity).A0N();
            SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
            C07K.A1Q(dialog, "Cannot display null dialog");
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            supportErrorDialogFragment.A00 = dialog;
            supportErrorDialogFragment.A01 = onCancelListener;
            supportErrorDialogFragment.A14(A0N, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        C13m c13m = new C13m();
        C07K.A1Q(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c13m.A00 = dialog;
        c13m.A01 = onCancelListener;
        c13m.show(fragmentManager, str);
    }

    @Override // X.C06220Rz
    public PendingIntent A03(Context context, int i, int i2) {
        Intent A012 = A01(context, i, null);
        if (A012 != null) {
            return PendingIntent.getActivity(context, i2, A012, 134217728);
        }
        return null;
    }

    public Dialog A04(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return A00(activity, i, new C31101bi(super.A01(activity, i, "d"), activity, i2), onCancelListener);
    }

    public void A05(Activity activity, int i, DialogInterface.OnCancelListener onCancelListener) {
        Dialog A002 = A00(activity, i, new C31101bi(super.A01(activity, i, "d"), activity, 2), onCancelListener);
        if (A002 == null) {
            return;
        }
        A02(activity, A002, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void A06(Activity activity, final AnonymousClass149 anonymousClass149, int i, DialogInterface.OnCancelListener onCancelListener) {
        final Intent A012 = super.A01(activity, i, "d");
        Dialog A002 = A00(activity, i, new AbstractDialogInterface$OnClickListenerC230314y() { // from class: X.1bj
            public final /* synthetic */ int A00 = 2;

            @Override // X.AbstractDialogInterface$OnClickListenerC230314y
            public final void A00() {
                Intent intent = A012;
                if (intent != null) {
                    anonymousClass149.startActivityForResult(intent, this.A00);
                }
            }
        }, onCancelListener);
        if (A002 == null) {
            return;
        }
        A02(activity, A002, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0102, code lost:
        if (r11 == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07(android.content.Context r10, int r11, android.app.PendingIntent r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06210Ry.A07(android.content.Context, int, android.app.PendingIntent):void");
    }
}
