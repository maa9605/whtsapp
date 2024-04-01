package X;

import android.os.Bundle;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

/* renamed from: X.0PR  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0PR extends C0DS {
    public boolean A00;

    public C0PR(boolean z) {
        super(true);
        this.A00 = false;
    }

    @Override // X.C0DT, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A1Z((RestoreFromBackupActivity) this);
    }

    @Override // X.C0DS, X.C0DT, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
