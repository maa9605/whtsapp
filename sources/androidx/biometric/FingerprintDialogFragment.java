package androidx.biometric;

import X.ActivityC02330At;
import X.C019208x;
import X.C019308y;
import X.C02160Ac;
import X.C06570Tx;
import X.C0HK;
import X.C11740iG;
import X.C28451Sa;
import X.DialogInterfaceC019408z;
import X.InterfaceC05620Pl;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class FingerprintDialogFragment extends DialogFragment {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public C28451Sa A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final Runnable A06 = new Runnable() { // from class: X.0iN
        @Override // java.lang.Runnable
        public void run() {
            FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
            Context A0a = fingerprintDialogFragment.A0a();
            if (A0a == null) {
                Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                return;
            }
            fingerprintDialogFragment.A04.A04(1);
            C28451Sa c28451Sa = fingerprintDialogFragment.A04;
            String string = A0a.getString(R.string.fingerprint_dialog_touch_sensor);
            C0HK c0hk = c28451Sa.A0B;
            if (c0hk == null) {
                c0hk = new C0HK();
                c28451Sa.A0B = c0hk;
            }
            C28451Sa.A00(c0hk, string);
        }
    };

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        this.A05.removeCallbacksAndMessages(null);
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        C28451Sa c28451Sa = this.A04;
        c28451Sa.A01 = 0;
        c28451Sa.A04(1);
        C28451Sa c28451Sa2 = this.A04;
        String A0F = A0F(R.string.fingerprint_dialog_touch_sensor);
        C0HK c0hk = c28451Sa2.A0B;
        if (c0hk == null) {
            c0hk = new C0HK();
            c28451Sa2.A0B = c0hk;
        }
        C28451Sa.A00(c0hk, A0F);
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        int i;
        super.A0v(bundle);
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            C28451Sa c28451Sa = (C28451Sa) new C06570Tx(A09).A00(C28451Sa.class);
            this.A04 = c28451Sa;
            C0HK c0hk = c28451Sa.A0C;
            if (c0hk == null) {
                c0hk = new C0HK();
                c28451Sa.A0C = c0hk;
            }
            c0hk.A05(this, new InterfaceC05620Pl() { // from class: X.1Sc
                /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
                    if (r2 == 1) goto L26;
                 */
                /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
                @Override // X.InterfaceC05620Pl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void AIK(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Number r10 = (java.lang.Number) r10
                        androidx.biometric.FingerprintDialogFragment r6 = androidx.biometric.FingerprintDialogFragment.this
                        android.os.Handler r5 = r6.A05
                        java.lang.Runnable r4 = r6.A06
                        r5.removeCallbacks(r4)
                        int r7 = r10.intValue()
                        android.widget.ImageView r0 = r6.A02
                        r3 = 2
                        r8 = 1
                        if (r0 == 0) goto L2c
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r0 = 23
                        if (r1 < r0) goto L2c
                        X.1Sa r0 = r6.A04
                        int r2 = r0.A01
                        android.content.Context r1 = r6.A0a()
                        if (r1 != 0) goto L40
                        java.lang.String r1 = "FingerprintFragment"
                        java.lang.String r0 = "Unable to get asset. Context is null."
                        android.util.Log.w(r1, r0)
                    L2c:
                        android.widget.TextView r1 = r6.A03
                        if (r1 == 0) goto L37
                        if (r7 != r3) goto L3d
                        int r0 = r6.A00
                    L34:
                        r1.setTextColor(r0)
                    L37:
                        r0 = 2000(0x7d0, double:9.88E-321)
                        r5.postDelayed(r4, r0)
                        return
                    L3d:
                        int r0 = r6.A01
                        goto L34
                    L40:
                        if (r2 != 0) goto L6b
                        if (r7 != r8) goto L2c
                        r0 = 2131231263(0x7f08021f, float:1.8078602E38)
                    L47:
                        android.graphics.drawable.Drawable r1 = X.C02160Ac.A03(r1, r0)
                        if (r1 == 0) goto L2c
                        android.widget.ImageView r0 = r6.A02
                        r0.setImageDrawable(r1)
                        if (r2 == 0) goto L61
                        if (r2 != r8) goto L66
                        if (r7 != r3) goto L61
                    L58:
                        boolean r0 = r1 instanceof android.graphics.drawable.AnimatedVectorDrawable
                        if (r0 == 0) goto L61
                        android.graphics.drawable.AnimatedVectorDrawable r1 = (android.graphics.drawable.AnimatedVectorDrawable) r1
                        r1.start()
                    L61:
                        X.1Sa r0 = r6.A04
                        r0.A01 = r7
                        goto L2c
                    L66:
                        if (r2 != r3) goto L61
                        if (r7 != r8) goto L61
                        goto L58
                    L6b:
                        if (r2 != r8) goto L73
                        if (r7 != r3) goto L7d
                        r0 = 2131231262(0x7f08021e, float:1.80786E38)
                        goto L47
                    L73:
                        if (r2 != r3) goto L7b
                        if (r7 != r8) goto L2c
                        r0 = 2131231263(0x7f08021f, float:1.8078602E38)
                        goto L47
                    L7b:
                        if (r2 != r8) goto L2c
                    L7d:
                        r0 = 3
                        if (r7 != r0) goto L2c
                        r0 = 2131231263(0x7f08021f, float:1.8078602E38)
                        goto L47
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1Sc.AIK(java.lang.Object):void");
                }
            });
            C28451Sa c28451Sa2 = this.A04;
            if (c28451Sa2.A0B == null) {
                c28451Sa2.A0B = new C0HK();
            }
            c28451Sa2.A0B.A05(this, new InterfaceC05620Pl() { // from class: X.1Sd
                @Override // X.InterfaceC05620Pl
                public void AIK(Object obj) {
                    CharSequence charSequence = (CharSequence) obj;
                    FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                    Handler handler = fingerprintDialogFragment.A05;
                    Runnable runnable = fingerprintDialogFragment.A06;
                    handler.removeCallbacks(runnable);
                    TextView textView = fingerprintDialogFragment.A03;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                    handler.postDelayed(runnable, 2000L);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.A00 = A17(R.attr.colorError);
        } else {
            Context A0a = A0a();
            if (A0a != null) {
                i = C02160Ac.A00(A0a, R.color.biometric_error_color);
            } else {
                i = 0;
            }
            this.A00 = i;
        }
        this.A01 = A17(16842808);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        CharSequence charSequence;
        CharSequence A03;
        C019208x c019208x = new C019208x(A00());
        C11740iG c11740iG = this.A04.A06;
        if (c11740iG != null) {
            charSequence = c11740iG.A01;
        } else {
            charSequence = null;
        }
        C019308y c019308y = c019208x.A01;
        c019308y.A0I = charSequence;
        View inflate = LayoutInflater.from(c019308y.A0O).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            C11740iG c11740iG2 = this.A04.A06;
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            C11740iG c11740iG3 = this.A04.A06;
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.A02 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.A03 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        C28451Sa c28451Sa = this.A04;
        if ((c28451Sa.A02() & 32768) != 0) {
            A03 = A0F(R.string.confirm_device_credential_password);
        } else {
            A03 = c28451Sa.A03();
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.0iO
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                FingerprintDialogFragment.this.A04.A05(true);
            }
        };
        c019308y.A0F = A03;
        c019308y.A03 = onClickListener;
        c019308y.A0C = inflate;
        c019308y.A01 = 0;
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setCanceledOnTouchOutside(false);
        return A00;
    }

    public final int A17(int i) {
        Context A0a = A0a();
        ActivityC02330At A09 = A09();
        if (A0a != null && A09 != null) {
            TypedValue typedValue = new TypedValue();
            A0a.getTheme().resolveAttribute(i, typedValue, true);
            TypedArray obtainStyledAttributes = A09.obtainStyledAttributes(typedValue.data, new int[]{i});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            return color;
        }
        Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
        return 0;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C28451Sa c28451Sa = this.A04;
        if (c28451Sa.A0E == null) {
            c28451Sa.A0E = new C0HK();
        }
        C28451Sa.A00(c28451Sa.A0E, Boolean.TRUE);
    }
}
