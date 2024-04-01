package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2bb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52942bb extends C0HS {
    public C06C A00;
    public ProgressDialogFragment A01;
    public Set A02;
    public final DialogFragment A03;
    public final C00B A04;
    public final WeakReference A05;
    public final boolean A06;

    public C52942bb(AbstractC02800Cx abstractC02800Cx, DialogFragment dialogFragment, C00B c00b, C06C c06c, boolean z) {
        this.A05 = new WeakReference(abstractC02800Cx);
        this.A04 = c00b;
        this.A03 = dialogFragment;
        this.A00 = c06c;
        this.A06 = z;
    }

    public C52942bb(AbstractC02800Cx abstractC02800Cx, DialogFragment dialogFragment, C00B c00b, Set set, boolean z) {
        this.A05 = new WeakReference(abstractC02800Cx);
        this.A04 = c00b;
        this.A03 = dialogFragment;
        this.A02 = set;
        this.A06 = z;
    }

    @Override // X.C0HS
    public void A06() {
        AbstractC02800Cx abstractC02800Cx = (AbstractC02800Cx) this.A05.get();
        if (abstractC02800Cx != null) {
            ProgressDialogFragment A00 = ProgressDialogFragment.A00(R.string.processing, R.string.register_wait_message);
            this.A01 = A00;
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, A00, "count_progress", 1);
            c02820Cz.A05();
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        C06C c06c = this.A00;
        if (c06c != null) {
            return Integer.valueOf(this.A04.A01((AbstractC005302j) c06c.A03(AbstractC005302j.class)));
        }
        C00B c00b = this.A04;
        Set set = this.A02;
        if (c00b != null) {
            int i = 0;
            if (set != null) {
                Iterator it = c00b.A02().iterator();
                while (it.hasNext()) {
                    if (set.contains(((AnonymousClass092) it.next()).A0n.A00)) {
                        i++;
                    }
                }
            }
            return Integer.valueOf(i);
        }
        throw null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        DialogFragment dialogFragment;
        Number number = (Number) obj;
        AbstractC02800Cx abstractC02800Cx = (AbstractC02800Cx) this.A05.get();
        if (abstractC02800Cx == null || abstractC02800Cx.A0H) {
            return;
        }
        ProgressDialogFragment progressDialogFragment = this.A01;
        if (progressDialogFragment.A0Y()) {
            progressDialogFragment.A16(false, false);
        } else {
            progressDialogFragment.A02 = true;
        }
        C06C c06c = this.A00;
        if (c06c != null) {
            dialogFragment = this.A03;
            C23X.A0J(c06c, dialogFragment);
        } else {
            Set set = this.A02;
            dialogFragment = this.A03;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("selection_jids", C003101m.A0E(set));
            dialogFragment.A0P(bundle);
        }
        Bundle bundle2 = ((C0BA) dialogFragment).A06;
        bundle2.putInt("unsent_count", number.intValue());
        bundle2.putBoolean("chatContainsStarredMessages", this.A06);
        C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
        c02820Cz.A09(0, dialogFragment, null, 1);
        c02820Cz.A05();
    }
}
