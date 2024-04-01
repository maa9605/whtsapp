package X;

import android.text.Editable;
import com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.377  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass377 extends C2JT {
    public boolean A00;
    public final /* synthetic */ SharedTextPreviewDialogFragment A01;

    public AnonymousClass377(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A01 = sharedTextPreviewDialogFragment;
    }

    @Override // X.C2JT, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A01;
        AnonymousClass029.A17(sharedTextPreviewDialogFragment.A09(), sharedTextPreviewDialogFragment.A09, ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0C, sharedTextPreviewDialogFragment.A0G, editable, sharedTextPreviewDialogFragment.A0F.getPaint());
        sharedTextPreviewDialogFragment.A1B(editable, this.A00);
    }
}
