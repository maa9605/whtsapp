package androidx.preference;

import X.ActivityC02330At;
import X.C019208x;
import X.C019308y;
import X.C0BA;
import X.DialogInterfaceC019408z;
import X.InterfaceC09430e5;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    public int A00;
    public int A01;
    public BitmapDrawable A02;
    public DialogPreference A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    public void A19(C019208x c019208x) {
    }

    public abstract void A1A(boolean z);

    public boolean A1B() {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        super.A0k(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.A05);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.A07);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.A06);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.A04);
        bundle.putInt("PreferenceDialogFragment.layout", this.A00);
        BitmapDrawable bitmapDrawable = this.A02;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        C0BA A07 = A07();
        if (A07 instanceof InterfaceC09430e5) {
            InterfaceC09430e5 interfaceC09430e5 = (InterfaceC09430e5) A07;
            String string = ((C0BA) this).A06.getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) interfaceC09430e5.A7p(string);
                this.A03 = dialogPreference;
                this.A05 = dialogPreference.A03;
                this.A07 = dialogPreference.A05;
                this.A06 = dialogPreference.A04;
                this.A04 = dialogPreference.A02;
                this.A00 = dialogPreference.A00;
                Drawable drawable = dialogPreference.A01;
                if (drawable != null && !(drawable instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    this.A02 = new BitmapDrawable(A01(), createBitmap);
                    return;
                }
                this.A02 = (BitmapDrawable) drawable;
                return;
            }
            this.A05 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.A07 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.A06 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.A04 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.A00 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap == null) {
                return;
            }
            this.A02 = new BitmapDrawable(A01(), bitmap);
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        View inflate;
        ActivityC02330At A09 = A09();
        this.A01 = -2;
        C019208x c019208x = new C019208x(A09);
        CharSequence charSequence = this.A05;
        C019308y c019308y = c019208x.A01;
        c019308y.A0I = charSequence;
        c019308y.A0A = this.A02;
        c019208x.A08(this.A07, this);
        c019308y.A0F = this.A06;
        c019308y.A03 = this;
        int i = this.A00;
        if (i != 0 && (inflate = A04().inflate(i, (ViewGroup) null)) != null) {
            A18(inflate);
            c019308y.A0C = inflate;
            c019308y.A01 = 0;
        } else {
            c019308y.A0E = this.A04;
        }
        A19(c019208x);
        DialogInterfaceC019408z A00 = c019208x.A00();
        if (A1B()) {
            A00.getWindow().setSoftInputMode(5);
        }
        return A00;
    }

    public DialogPreference A17() {
        DialogPreference dialogPreference = this.A03;
        if (dialogPreference == null) {
            DialogPreference dialogPreference2 = (DialogPreference) ((InterfaceC09430e5) A07()).A7p(((C0BA) this).A06.getString("key"));
            this.A03 = dialogPreference2;
            return dialogPreference2;
        }
        return dialogPreference;
    }

    public void A18(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.A04;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.A01 = i;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        A1A(this.A01 == -1);
    }
}
