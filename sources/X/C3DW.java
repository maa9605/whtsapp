package X;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3DW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3DW extends C0HS {
    public int A00;
    public C011005l A01;
    public final C0EG A02;
    public final C07700Zi A03;
    public final WeakReference A04;

    public C3DW(C0EG c0eg, ViewGroupInviteActivity viewGroupInviteActivity, C07700Zi c07700Zi) {
        this.A02 = c0eg;
        this.A04 = new WeakReference(viewGroupInviteActivity);
        this.A03 = c07700Zi;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Future A02 = this.A02.A02(this.A03, new C0T9() { // from class: X.3DF
            @Override // X.C0T9
            public final void ARw(Jid jid) {
                C3DW.this.A01 = (C011005l) jid;
            }
        }, new C0I3() { // from class: X.3DE
            @Override // X.C0I3
            public final void ARv(int i) {
                C3DW.this.A00 = i;
            }
        }, null);
        if (A02 == null) {
            Log.e("ViewGroupInviteActivity/JoinGroupTask callback is null");
        } else {
            try {
                A02.get(32000L, TimeUnit.MILLISECONDS);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < 500) {
                    SystemClock.sleep(500 - elapsedRealtime2);
                    return null;
                }
            } catch (Exception e) {
                Log.w("ViewGroupInviteActivityJoinGroupTask send join timed out", e);
                return null;
            }
        }
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A04.get();
        if (viewGroupInviteActivity != null) {
            C011005l c011005l = this.A01;
            int i = this.A00;
            if (c011005l != null) {
                if (viewGroupInviteActivity.A0F.A0E(c011005l)) {
                    C0C8 c0c8 = viewGroupInviteActivity.A0I;
                    if (c0c8.A01(c011005l).A0B(c0c8.A01)) {
                        Intent A02 = Conversation.A02(viewGroupInviteActivity, c011005l);
                        C002701i.A1C(A02, "ViewGroupInviteActivity:onGroupJoined", viewGroupInviteActivity.A0D);
                        viewGroupInviteActivity.A16(A02, true);
                        return;
                    }
                }
                Runnable runnable = viewGroupInviteActivity.A0R;
                if (runnable == null) {
                    runnable = new RunnableEBaseShape8S0100000_I1_0(viewGroupInviteActivity, 41);
                    viewGroupInviteActivity.A0R = runnable;
                }
                viewGroupInviteActivity.A07.A02.postDelayed(runnable, 32000L);
                return;
            }
            if (i != 400) {
                if (i == 404) {
                    viewGroupInviteActivity.A1P(R.string.group_error_accept_invite_group_does_not_exist);
                    return;
                } else if (i == 419) {
                    viewGroupInviteActivity.A1P(R.string.group_error_accept_invite_group_full);
                    return;
                } else if (i != 500) {
                    if (i == 409) {
                        viewGroupInviteActivity.A1P(R.string.group_error_accept_invite_already_in_group);
                        return;
                    } else if (i != 410) {
                        viewGroupInviteActivity.A1P(R.string.register_try_again_later);
                        return;
                    } else {
                        viewGroupInviteActivity.A1P(R.string.group_error_accept_invite_invalid);
                        return;
                    }
                }
            }
            viewGroupInviteActivity.A1P(R.string.group_error_accept_invite_failure);
        }
    }
}
