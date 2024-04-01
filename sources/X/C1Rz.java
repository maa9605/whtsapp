package X;

import android.view.View;

/* renamed from: X.1Rz  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Rz implements C0TU {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ C0Ud A02;

    public C1Rz(C0Ud c0Ud) {
        this.A02 = c0Ud;
    }

    @Override // X.C0TU
    public void AH6(View view) {
        this.A01 = true;
    }

    @Override // X.C0TU
    public void AH8(View view) {
        if (this.A01) {
            return;
        }
        C0Ud c0Ud = this.A02;
        c0Ud.A03 = null;
        super/*android.view.ViewGroup*/.setVisibility(this.A00);
    }

    @Override // X.C0TU
    public void AHC(View view) {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.A01 = false;
    }
}
