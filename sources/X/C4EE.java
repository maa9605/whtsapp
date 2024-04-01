package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.4EE  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C4EE implements C49X {
    @Override // X.C49X
    public List A7o(List list) {
        return list;
    }

    @Override // X.C49X
    public int ABI(C0N2 c0n2) {
        return 0;
    }

    @Override // X.C49X
    public String ABJ(C0N2 c0n2) {
        return null;
    }

    @Override // X.C49X
    public String ABL(C0N2 c0n2) {
        return null;
    }

    @Override // X.C49X
    public String ABM(C0N2 c0n2) {
        return null;
    }

    @Override // X.C49X
    public boolean AUQ() {
        return true;
    }

    @Override // X.C49X
    public boolean AUU() {
        return true;
    }

    @Override // X.C49X
    public boolean AUV() {
        return true;
    }

    @Override // X.C49X
    public View ACC(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.payment_method_picker_header, (ViewGroup) null);
    }
}
