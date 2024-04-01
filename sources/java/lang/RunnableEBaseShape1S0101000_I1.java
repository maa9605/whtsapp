package java.lang;

import X.AbstractC04890Mh;
import X.AbstractC66843Cq;
import X.AnonymousClass024;
import X.C002701i;
import X.C01C;
import X.C04510Kl;
import X.C2JQ;
import X.C48702Gi;
import X.C48732Gl;
import X.C61752wf;
import X.C66833Cp;
import X.C68523Kf;
import X.C68563Kj;
import X.C73453bf;
import X.C76263gJ;
import X.C79503ll;
import X.C85343vF;
import X.C85943wX;
import X.View$OnClickListenerC68053Hw;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S0101000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape1S0101000_I1(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A02) {
            case 0:
                int i = this.A00;
                C61752wf c61752wf = ((C68563Kj) this.A01).A00;
                if (c61752wf == null) {
                    throw null;
                }
                if (i == 400 || i == 401 || i == 404) {
                    c61752wf.A03.A07(R.string.group_error_subject, 0);
                    return;
                } else if (i == 406) {
                    int A07 = c61752wf.A04.A07(C01C.A3z);
                    c61752wf.A03.A0E(c61752wf.A08.A0A(R.plurals.subject_reach_limit, A07, Integer.valueOf(A07)), 0);
                    c61752wf.A0D.A0T(false);
                    return;
                } else {
                    return;
                }
            case 1:
                int i2 = this.A00;
                AbstractC66843Cq abstractC66843Cq = ((C66833Cp) this.A01).A00;
                String str = abstractC66843Cq.A06;
                GroupChatInfo groupChatInfo = (GroupChatInfo) ((C68523Kf) abstractC66843Cq).A00.get();
                if (groupChatInfo != null) {
                    if (i2 == 403) {
                        groupChatInfo.A0I.A07(R.string.group_error_description_not_allowed, 0);
                        return;
                    } else if (i2 == 406) {
                        int A072 = groupChatInfo.A0L.A07(C01C.A35);
                        groupChatInfo.A0I.A0E(groupChatInfo.getResources().getQuantityString(R.plurals.description_reach_limit, A072, Integer.valueOf(A072)), 0);
                        groupChatInfo.A16.A0T(false);
                        return;
                    } else if (i2 != 409) {
                        groupChatInfo.A0I.A07(R.string.group_error_description, 0);
                        return;
                    } else {
                        groupChatInfo.A16.A0D(groupChatInfo.A13);
                        GroupChatInfo.DescriptionConflictDialogFragment descriptionConflictDialogFragment = new GroupChatInfo.DescriptionConflictDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("description", str);
                        descriptionConflictDialogFragment.A0P(bundle);
                        groupChatInfo.AUg(descriptionConflictDialogFragment, null);
                        return;
                    }
                }
                return;
            case 2:
                View$OnClickListenerC68053Hw view$OnClickListenerC68053Hw = (View$OnClickListenerC68053Hw) this.A01;
                int i3 = this.A00;
                C48732Gl c48732Gl = view$OnClickListenerC68053Hw.A05;
                C48702Gi c48702Gi = c48732Gl.A0A;
                int i4 = c48702Gi.A02;
                RecyclerView recyclerView = c48702Gi.A0Q;
                View$OnClickListenerC68053Hw view$OnClickListenerC68053Hw2 = (View$OnClickListenerC68053Hw) recyclerView.A0C(i4);
                if (view$OnClickListenerC68053Hw2 != null) {
                    view$OnClickListenerC68053Hw2.A04.A03(false, true);
                    view$OnClickListenerC68053Hw2.A00.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                } else {
                    c48732Gl.A02(i4);
                }
                int size = C2JQ.A00.size();
                if (i3 > 0 && i3 < (size >> 1)) {
                    i3--;
                } else if (i3 > (size >> 1) && i3 < size - 1) {
                    i3++;
                }
                recyclerView.A0Z(i3);
                SelectionCheckView selectionCheckView = view$OnClickListenerC68053Hw.A04;
                selectionCheckView.setScaleX(1.0f);
                selectionCheckView.setScaleY(1.0f);
                selectionCheckView.A03(true, true);
                view$OnClickListenerC68053Hw.A00.animate().scaleX(c48732Gl.A05).scaleY(c48732Gl.A04).setDuration(100L).start();
                return;
            case 3:
                int i5 = this.A00;
                C48732Gl c48732Gl2 = ((View$OnClickListenerC68053Hw) this.A01).A05;
                c48732Gl2.A02[i5 - 1] = false;
                ((AbstractC04890Mh) c48732Gl2).A01.A04(i5, 1, null);
                return;
            case 4:
                C76263gJ c76263gJ = (C76263gJ) this.A01;
                int i6 = this.A00;
                Integer valueOf = Integer.valueOf(i6);
                if (AnonymousClass024.A0l(valueOf, c76263gJ.A00.A01())) {
                    return;
                }
                c76263gJ.A05.A01("current_screen", false, null).A0A(valueOf);
                if (i6 == 2) {
                    c76263gJ.A09.A03(c76263gJ.A06.A00, GoogleMigrateService.class, new Intent());
                    return;
                } else if (i6 == 5 || i6 == 6) {
                    c76263gJ.A09.A02(c76263gJ.A06.A00, GoogleMigrateService.class);
                    c76263gJ.A01.A0A(2);
                    return;
                } else if (i6 == 7) {
                    c76263gJ.A01.A0A(1);
                    return;
                } else if (i6 == 4 || i6 == 3) {
                    c76263gJ.A09.A02(c76263gJ.A06.A00, GoogleMigrateService.class);
                    return;
                } else {
                    return;
                }
            case 5:
                C04510Kl c04510Kl = (C04510Kl) this.A01;
                c04510Kl.A04((GroupJid) c04510Kl.A0J, this.A00);
                return;
            case 6:
                C04510Kl c04510Kl2 = (C04510Kl) this.A01;
                c04510Kl2.A03(c04510Kl2.A0J, this.A00);
                return;
            case 7:
                ((C85943wX) this.A01).A08.AI9(this.A00);
                return;
            case 8:
                ((C79503ll) this.A01).A00.A05.AI9(this.A00);
                return;
            case 9:
                C002701i.A19(((C73453bf) this.A01).A0Q, this.A00);
                return;
            case 10:
                ((C85343vF) this.A01).A00.A05.A04(this.A00);
                return;
            default:
                return;
        }
    }
}
