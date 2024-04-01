package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.search.verification.client.R;

/* renamed from: X.09K  reason: invalid class name */
/* loaded from: classes.dex */
public class C09K extends Dialog {
    public final int A00;
    public final Activity A01;
    public final C002301c A02;

    public C09K(Activity activity, C002301c c002301c, int i, boolean z) {
        super(activity, z ? R.style.FullScreenDialogNoFloating : R.style.FullScreenDialog);
        this.A02 = c002301c;
        this.A01 = activity;
        this.A00 = i;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        C0LX.A09(this.A02, getWindow());
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(window.getLayoutInflater().inflate(this.A00, (ViewGroup) null, false));
            getWindow().setLayout(-1, -1);
            return;
        }
        throw null;
    }
}
