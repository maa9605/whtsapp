package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.4Ed  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91234Ed implements InterfaceC895747n {
    public final /* synthetic */ C49A A00;
    public final /* synthetic */ C49B A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ AbstractC899949g A03;

    public C91234Ed(AbstractC899949g abstractC899949g, C49A c49a, C49B c49b, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A03 = abstractC899949g;
        this.A00 = c49a;
        this.A01 = c49b;
        this.A02 = pinBottomSheetDialogFragment;
    }

    @Override // X.InterfaceC895747n
    public void AJs(C28Q c28q) {
        this.A02.A1C();
        AbstractC899949g.A00(this.A03);
    }

    @Override // X.InterfaceC895747n
    public void API(String str) {
        this.A03.A03(this.A00.A00(C49B.A00("AUTH", Boolean.TRUE, str, this.A01.A00.A05() / 1000, null, null, new Object[0])), this.A02);
    }
}
