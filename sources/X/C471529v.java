package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;

/* renamed from: X.29v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C471529v extends AbstractC04890Mh {
    public final /* synthetic */ AbstractActivityC40691si A00;

    public C471529v(AbstractActivityC40691si abstractActivityC40691si) {
        this.A00 = abstractActivityC40691si;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.A0h.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        int i2;
        AbstractActivityC40691si abstractActivityC40691si = this.A00;
        LayoutInflater layoutInflater = abstractActivityC40691si.getLayoutInflater();
        if (!(abstractActivityC40691si instanceof GroupCallParticipantPicker)) {
            i2 = R.layout.selected_contact;
        } else {
            i2 = R.layout.selected_contact_group_call;
        }
        return new AnonymousClass373(layoutInflater.inflate(i2, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        AnonymousClass373 anonymousClass373 = (AnonymousClass373) c0ts;
        AbstractActivityC40691si abstractActivityC40691si = this.A00;
        C06C c06c = (C06C) abstractActivityC40691si.A0h.get(i);
        anonymousClass373.A01.setText(abstractActivityC40691si.A0L.A04(c06c));
        C0Zn c0Zn = abstractActivityC40691si.A0M;
        if (c0Zn != null) {
            c0Zn.A04(c06c, anonymousClass373.A02, false, new C52352aa(c0Zn.A04.A02, c06c));
        }
        View view = anonymousClass373.A00;
        view.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, c06c, 8));
        view.setContentDescription(abstractActivityC40691si.getString(R.string.selected_contact_content_description, abstractActivityC40691si.A0L.A08(c06c, false)));
        AnonymousClass088.A1V(view, R.string.accessibility_action_click_selected_contact_to_deselect);
    }
}
