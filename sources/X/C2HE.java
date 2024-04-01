package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2HE  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2HE implements InterfaceC44051yR {
    public final /* synthetic */ C48732Gl A00;

    public C2HE(C48732Gl c48732Gl) {
        this.A00 = c48732Gl;
    }

    @Override // X.InterfaceC44051yR
    public void AJo() {
        RecyclerView recyclerView = this.A00.A0A.A0Q;
        if (recyclerView != null) {
            recyclerView.post(new RunnableEBaseShape4S0100000_I0_4(this, 5));
        }
    }

    @Override // X.InterfaceC44051yR
    public void ANc(Object obj) {
        RecyclerView recyclerView = this.A00.A0A.A0Q;
        if (recyclerView != null) {
            recyclerView.post(new RunnableEBaseShape3S0200000_I0_3(this, obj, 8));
        }
    }
}
