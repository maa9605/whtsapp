package com.whatsapp.mediaview;

import X.AbstractC005302j;
import X.AnonymousClass012;
import X.AnonymousClass088;
import X.AnonymousClass094;
import X.C000500h;
import X.C002301c;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C018808t;
import X.C05Q;
import X.C05W;
import X.C0BA;
import X.C0LD;
import X.C40081rY;
import X.InterfaceC002901k;
import X.InterfaceC018908u;
import X.InterfaceC019108w;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.mediaview.DeleteMessagesDialogFragment;
import com.whatsapp.mediaview.RevokeNuxDialogFragment;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class DeleteMessagesDialogFragment extends Hilt_DeleteMessagesDialogFragment {
    public C018508q A02;
    public C018608r A03;
    public C05W A04;
    public C018708s A05;
    public AnonymousClass012 A06;
    public C000500h A07;
    public C002301c A08;
    public C05Q A09;
    public C40081rY A0A;
    public C018808t A0B;
    public InterfaceC002901k A0C;
    public InterfaceC018908u A01 = new InterfaceC018908u() { // from class: X.3Hx
        @Override // X.InterfaceC018908u
        public final void AJH() {
            C0BA c0ba = DeleteMessagesDialogFragment.this.A0D;
            if (c0ba instanceof InterfaceC018908u) {
                ((InterfaceC018908u) c0ba).AJH();
            }
        }
    };
    public InterfaceC019108w A00 = new InterfaceC019108w() { // from class: X.3ID
        @Override // X.InterfaceC019108w
        public void ANm() {
            DeleteMessagesDialogFragment.this.A16(false, false);
        }

        @Override // X.InterfaceC019108w
        public void AOg() {
            new RevokeNuxDialogFragment().A14(DeleteMessagesDialogFragment.this.A0B(), null);
        }
    };

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle bundle2 = ((C0BA) this).A06;
        if (bundle2 != null && ((Hilt_DeleteMessagesDialogFragment) this).A00 != null) {
            List<AnonymousClass094> A04 = C0LD.A04(bundle2);
            if (A04 == null) {
                A11();
                return super.A0z(bundle);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (AnonymousClass094 anonymousClass094 : A04) {
                linkedHashSet.add(this.A09.A05(anonymousClass094));
            }
            AbstractC005302j A02 = AbstractC005302j.A02(bundle2.getString("jid"));
            Dialog A0I = AnonymousClass088.A0I(((Hilt_DeleteMessagesDialogFragment) this).A00, this.A02, this.A06, this.A0C, this.A0A, this.A03, this.A08, this.A0B, this.A07, linkedHashSet, this.A00, bundle2.getBoolean("is_revokable"), this.A01, AnonymousClass088.A0u(((Hilt_DeleteMessagesDialogFragment) this).A00, linkedHashSet, this.A04, this.A05, A02));
            if (A0I == null) {
                A11();
                return super.A0z(bundle);
            }
            return A0I;
        }
        A11();
        return super.A0z(bundle);
    }
}
