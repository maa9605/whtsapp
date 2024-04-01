package androidx.fragment.app;

import X.AbstractC02800Cx;
import X.ActivityC02330At;
import X.C000200d;
import X.C02820Cz;
import X.C0BA;
import X.C0ZW;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public class DialogFragment extends C0BA implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {
    public Dialog A03;
    public Handler A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0C;
    public Runnable A07 = new Runnable() { // from class: X.0lS
        {
            DialogFragment.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogFragment dialogFragment = DialogFragment.this;
            dialogFragment.A05.onDismiss(dialogFragment.A03);
        }
    };
    public DialogInterface.OnCancelListener A04 = new DialogInterface.OnCancelListener() { // from class: X.0lT
        {
            DialogFragment.this = this;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.A03;
            if (dialog != null) {
                dialogFragment.onCancel(dialog);
            }
        }
    };
    public DialogInterface.OnDismissListener A05 = new DialogInterface.OnDismissListener() { // from class: X.0lU
        {
            DialogFragment.this = this;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.A03;
            if (dialog != null) {
                dialogFragment.onDismiss(dialog);
            }
        }
    };
    public int A01 = 0;
    public int A02 = 0;
    public boolean A08 = true;
    public boolean A0B = true;
    public int A00 = -1;

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        if (!this.A0B) {
            return A03();
        }
        Dialog A0z = A0z(bundle);
        this.A03 = A0z;
        if (A0z != null) {
            A13(A0z, this.A01);
            return (LayoutInflater) this.A03.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.A0F.A01.getSystemService("layout_inflater");
    }

    @Override // X.C0BA
    public void A0e() {
        this.A0U = true;
        if (this.A0A || this.A09) {
            return;
        }
        this.A09 = true;
    }

    @Override // X.C0BA
    public void A0g() {
        this.A0U = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0C = false;
            dialog.show();
        }
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        Bundle bundle2;
        this.A0U = true;
        if (this.A0B) {
            View view = super.A0A;
            if (view != null) {
                if (view.getParent() == null) {
                    this.A03.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            ActivityC02330At A09 = A09();
            if (A09 != null) {
                this.A03.setOwnerActivity(A09);
            }
            this.A03.setCancelable(this.A08);
            this.A03.setOnCancelListener(this.A04);
            this.A03.setOnDismissListener(this.A05);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.A03.onRestoreInstanceState(bundle2);
        }
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        Bundle onSaveInstanceState;
        Dialog dialog = this.A03;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.A01;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.A02;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.A08;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A0B;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.A00;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // X.C0BA
    public void A0r() {
        this.A0U = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            this.A0C = true;
            dialog.setOnDismissListener(null);
            this.A03.dismiss();
            if (!this.A09) {
                onDismiss(this.A03);
            }
            this.A03 = null;
        }
    }

    @Override // X.C0BA
    public void A0t() {
        this.A0U = true;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A0A) {
            return;
        }
        this.A09 = false;
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        this.A06 = new Handler();
        this.A0B = super.A02 == 0;
        if (bundle != null) {
            this.A01 = bundle.getInt("android:style", 0);
            this.A02 = bundle.getInt("android:theme", 0);
            this.A08 = bundle.getBoolean("android:cancelable", true);
            this.A0B = bundle.getBoolean("android:showsDialog", this.A0B);
            this.A00 = bundle.getInt("android:backStackId", -1);
        }
    }

    public int A0x() {
        return this.A02;
    }

    public final Dialog A0y() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sb = new StringBuilder("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public Dialog A0z(Bundle bundle) {
        return new Dialog(A00(), A0x());
    }

    public void A10() {
        A16(false, false);
    }

    public void A11() {
        A16(true, false);
    }

    public void A12(int i, int i2) {
        this.A01 = i;
        if (i == 2 || i == 3) {
            this.A02 = 16973913;
        }
        if (i2 != 0) {
            this.A02 = i2;
        }
    }

    public void A13(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        dialog.requestWindowFeature(1);
    }

    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        this.A09 = false;
        this.A0A = true;
        C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
        c02820Cz.A09(0, this, str, 1);
        c02820Cz.A04();
    }

    public void A15(boolean z) {
        this.A08 = z;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void A16(boolean z, boolean z2) {
        if (this.A09) {
            return;
        }
        this.A09 = true;
        this.A0A = false;
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.A03.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.A06.getLooper()) {
                    onDismiss(this.A03);
                } else {
                    this.A06.post(this.A07);
                }
            }
        }
        this.A0C = true;
        if (this.A00 >= 0) {
            AbstractC02800Cx A0C = A0C();
            int i = this.A00;
            if (i >= 0) {
                A0C.A0g(new C0ZW(A0C, null, i, 1), false);
                this.A00 = -1;
                return;
            }
            throw new IllegalArgumentException(C000200d.A0D("Bad id: ", i));
        }
        C02820Cz c02820Cz = new C02820Cz(A0C());
        c02820Cz.A06(this);
        if (z) {
            c02820Cz.A05();
        } else {
            c02820Cz.A04();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A0C) {
            return;
        }
        A16(true, true);
    }
}
