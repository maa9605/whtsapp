package X;

import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import java.util.List;

/* renamed from: X.3kb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C78833kb implements InterfaceC53342en, InterfaceC48372Ez, InterfaceC70513So {
    public C48352Ex A00;
    public InterfaceC48372Ez A01;
    public InterfaceC04740Lq A02;
    public PickerSearchDialogFragment A03;
    public InterfaceC53342en A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public final C461225a A08;

    public C78833kb(C461225a c461225a) {
        this.A08 = c461225a;
    }

    public void A00(boolean z) {
        this.A06 = z;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment != null) {
            pickerSearchDialogFragment.A18();
        }
    }

    @Override // X.InterfaceC48372Ez
    public void AKr(C49302Jn c49302Jn) {
        InterfaceC48372Ez interfaceC48372Ez = this.A01;
        if (interfaceC48372Ez != null) {
            interfaceC48372Ez.AKr(c49302Jn);
        }
    }

    @Override // X.InterfaceC70513So
    public void AOR(List list) {
        this.A05 = list;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment instanceof StickerSearchDialogFragment) {
            ((StickerSearchDialogFragment) pickerSearchDialogFragment).A0A.A00.A0B(list);
        }
    }

    @Override // X.InterfaceC53342en
    public void AP7(C0JM c0jm, Integer num) {
        InterfaceC53342en interfaceC53342en = this.A04;
        if (interfaceC53342en != null) {
            interfaceC53342en.AP7(c0jm, num);
        }
    }
}
