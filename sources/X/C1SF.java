package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.1SF  reason: invalid class name */
/* loaded from: classes.dex */
public class C1SF implements InterfaceC11110hC, DialogInterface.OnClickListener {
    public ListAdapter A00;
    public DialogInterfaceC019408z A01;
    public CharSequence A02;
    public final /* synthetic */ AppCompatSpinner A03;

    @Override // X.InterfaceC11110hC
    public Drawable A8T() {
        return null;
    }

    @Override // X.InterfaceC11110hC
    public int AAW() {
        return 0;
    }

    @Override // X.InterfaceC11110hC
    public int ADo() {
        return 0;
    }

    public C1SF(AppCompatSpinner appCompatSpinner) {
        this.A03 = appCompatSpinner;
    }

    @Override // X.InterfaceC11110hC
    public CharSequence AAV() {
        return this.A02;
    }

    @Override // X.InterfaceC11110hC
    public boolean AFo() {
        DialogInterfaceC019408z dialogInterfaceC019408z = this.A01;
        if (dialogInterfaceC019408z != null) {
            return dialogInterfaceC019408z.isShowing();
        }
        return false;
    }

    @Override // X.InterfaceC11110hC
    public void ASg(ListAdapter listAdapter) {
        this.A00 = listAdapter;
    }

    @Override // X.InterfaceC11110hC
    public void ASk(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC11110hC
    public void AT5(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC11110hC
    public void AT6(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC11110hC
    public void ATi(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    @Override // X.InterfaceC11110hC
    public void AU6(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // X.InterfaceC11110hC
    public void AUb(int i, int i2) {
        if (this.A00 == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.A03;
        C019208x c019208x = new C019208x(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.A02;
        if (charSequence != null) {
            c019208x.A01.A0I = charSequence;
        }
        ListAdapter listAdapter = this.A00;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C019308y c019308y = c019208x.A01;
        c019308y.A0D = listAdapter;
        c019308y.A05 = this;
        c019308y.A00 = selectedItemPosition;
        c019308y.A0L = true;
        DialogInterfaceC019408z A00 = c019208x.A00();
        this.A01 = A00;
        ListView listView = A00.A00.A0L;
        if (Build.VERSION.SDK_INT >= 17) {
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
        }
        this.A01.show();
    }

    @Override // X.InterfaceC11110hC
    public void dismiss() {
        DialogInterfaceC019408z dialogInterfaceC019408z = this.A01;
        if (dialogInterfaceC019408z != null) {
            dialogInterfaceC019408z.dismiss();
            this.A01 = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.A03;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.A00.getItemId(i));
        }
        DialogInterfaceC019408z dialogInterfaceC019408z = this.A01;
        if (dialogInterfaceC019408z != null) {
            dialogInterfaceC019408z.dismiss();
            this.A01 = null;
        }
    }
}
