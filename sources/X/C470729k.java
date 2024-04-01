package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.29k */
/* loaded from: classes2.dex */
public class C470729k {
    public final Context A00;
    public final C018508q A01;
    public final C41541u6 A02;
    public final C05W A03;
    public final InterfaceC52832bQ A04;
    public final AnonymousClass012 A05;
    public final C41181tV A06;
    public final C0C8 A07;
    public final C00B A08;
    public final C0ES A09;
    public final C41521u3 A0A;
    public final C0CB A0B;
    public final C2MZ A0C;
    public final InterfaceC002901k A0D;

    public C470729k(Context context, AnonymousClass012 anonymousClass012, C018508q c018508q, InterfaceC002901k interfaceC002901k, C41181tV c41181tV, C41541u6 c41541u6, C05W c05w, C41521u3 c41521u3, C0ES c0es, C0CB c0cb, C00B c00b, C2MZ c2mz, C0C8 c0c8, InterfaceC52832bQ interfaceC52832bQ) {
        this.A00 = context;
        this.A05 = anonymousClass012;
        this.A01 = c018508q;
        this.A0D = interfaceC002901k;
        this.A06 = c41181tV;
        this.A02 = c41541u6;
        this.A03 = c05w;
        this.A0A = c41521u3;
        this.A09 = c0es;
        this.A0B = c0cb;
        this.A08 = c00b;
        this.A0C = c2mz;
        this.A07 = c0c8;
        this.A04 = interfaceC52832bQ;
    }

    public static void A00(C470729k c470729k, AbstractC02800Cx abstractC02800Cx, AbstractC005302j abstractC005302j, boolean z) {
        C06C A0A = c470729k.A03.A0A(abstractC005302j);
        if (abstractC02800Cx != null) {
            if (A0A.A0C()) {
                StringBuilder sb = new StringBuilder("conversations/delete/group:");
                sb.append(A0A);
                Log.i(sb.toString());
                if (c470729k.A09.A0m) {
                    c470729k.A01.A07(R.string.group_updating, 0);
                    return;
                }
                if (!C003101m.A0a(abstractC005302j)) {
                    C0C8 c0c8 = c470729k.A07;
                    C011005l A03 = C011005l.A03(abstractC005302j);
                    if (A03 != null) {
                        if (c0c8.A01(A03).A0B(c0c8.A01)) {
                            c470729k.A0D.ARy(new C52942bb(abstractC02800Cx, new LeaveGroupsDialogFragment(), c470729k.A08, A0A, z), new Object[0]);
                            return;
                        }
                    } else {
                        throw null;
                    }
                }
                ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
                C23X.A0J(A0A, deleteGroupDialogFragment);
                deleteGroupDialogFragment.A02().putBoolean("chatContainsStarredMessages", z);
                deleteGroupDialogFragment.A14(abstractC02800Cx, null);
            } else if (A0A.A0D()) {
                ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = new ConversationsFragment.DeleteBroadcastListDialogFragment();
                C23X.A0J(A0A, deleteBroadcastListDialogFragment);
                deleteBroadcastListDialogFragment.A02().putBoolean("chatContainsStarredMessages", z);
                deleteBroadcastListDialogFragment.A14(abstractC02800Cx, null);
            } else {
                c470729k.A0D.ARy(new C52942bb(abstractC02800Cx, new ConversationsFragment.DeleteContactDialogFragment(), c470729k.A08, A0A, z), new Object[0]);
            }
        }
    }

    public void A01(AbstractC005302j abstractC005302j, long j) {
        if (C003101m.A0a(abstractC005302j)) {
            return;
        }
        C41541u6 c41541u6 = this.A02;
        Set A0F = c41541u6.A0F(abstractC005302j, true);
        if (this.A0B.A0A(abstractC005302j, j) == null) {
            c41541u6.A0U(A0F);
            return;
        }
        c41541u6.A0V(A0F);
        this.A0A.A0D(new C03950Hv(abstractC005302j, 11, 0L, 0L, j, null), 0);
    }
}
