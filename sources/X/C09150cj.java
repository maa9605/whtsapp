package X;

import android.content.Intent;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0cj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09150cj extends C0HS {
    public int A00;
    public C011005l A01;
    public final C0EG A02;
    public final String A03;
    public final WeakReference A04;

    public C09150cj(C0EG c0eg, AcceptInviteLinkActivity acceptInviteLinkActivity, String str) {
        this.A02 = c0eg;
        this.A04 = new WeakReference(acceptInviteLinkActivity);
        this.A03 = str;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        Future A05;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0EG c0eg = this.A02;
        String str = this.A03;
        C0T9 c0t9 = new C0T9() { // from class: X.1h0
            @Override // X.C0T9
            public final void ARw(Jid jid) {
                C09150cj.this.A01 = (C011005l) jid;
            }
        };
        C0I3 c0i3 = new C0I3() { // from class: X.1gz
            @Override // X.C0I3
            public final void ARv(int i) {
                C09150cj.this.A00 = i;
            }
        };
        C010005b c010005b = c0eg.A02;
        if (c010005b.A06 && c010005b.A02) {
            C05Y c05y = c0eg.A07;
            String A02 = c05y.A02();
            try {
                A05 = c05y.A05(A02, Message.obtain(null, 0, C0M6.A03, 0, new C07590Yx(A02, str, c0t9, c0i3)), false);
            } catch (C0S4 unused) {
            }
            if (A05 != null) {
                try {
                    A05.get(32000L, TimeUnit.MILLISECONDS);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 < 500) {
                        SystemClock.sleep(500 - elapsedRealtime2);
                        return null;
                    }
                    return null;
                } catch (Exception e) {
                    Log.w("acceptlink/sendjoin/failed/timeout", e);
                    return null;
                }
            }
        }
        Log.e("acceptlink/sendjoin/failed/callback is null");
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        final AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A04.get();
        if (acceptInviteLinkActivity != null) {
            C011005l c011005l = this.A01;
            int i = this.A00;
            if (c011005l != null) {
                if (acceptInviteLinkActivity.A07.A0E(c011005l)) {
                    C0C8 c0c8 = acceptInviteLinkActivity.A09;
                    if (c0c8.A01(c011005l).A0B(c0c8.A01)) {
                        StringBuilder sb = new StringBuilder("acceptlink/processcode/exists/");
                        sb.append(c011005l);
                        Log.i(sb.toString());
                        Intent A02 = Conversation.A02(acceptInviteLinkActivity, c011005l);
                        C002701i.A1C(A02, "AcceptInviteLinkActivity", acceptInviteLinkActivity.A05);
                        acceptInviteLinkActivity.A16(A02, true);
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder("acceptlink/sendjoin/willwait/");
                sb2.append(c011005l);
                Log.i(sb2.toString());
                StringBuilder sb3 = new StringBuilder("acceptlink/wait/");
                sb3.append(acceptInviteLinkActivity.A0B);
                Log.i(sb3.toString());
                Runnable runnable = acceptInviteLinkActivity.A0F;
                if (runnable == null) {
                    runnable = new Runnable() { // from class: X.1FO
                        @Override // java.lang.Runnable
                        public final void run() {
                            AcceptInviteLinkActivity acceptInviteLinkActivity2 = AcceptInviteLinkActivity.this;
                            Log.i("acceptlink/wait/timeout");
                            acceptInviteLinkActivity2.finish();
                        }
                    };
                    acceptInviteLinkActivity.A0F = runnable;
                }
                ((ActivityC02290Ap) acceptInviteLinkActivity).A0A.A02.postDelayed(runnable, 32000L);
                return;
            }
            C000200d.A0p("acceptlink/sendjoin/failed/", i);
            if (i == 401) {
                acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_link_banned);
            } else if (i == 404) {
                acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_link_no_group);
            } else if (i == 419) {
                acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_group_full);
            } else if (i != 409) {
                if (i != 410) {
                    acceptInviteLinkActivity.A1P(R.string.register_try_again_later);
                } else {
                    acceptInviteLinkActivity.A1P(R.string.failed_accept_invite_link_reset);
                }
            } else {
                Intent A022 = Conversation.A02(acceptInviteLinkActivity, acceptInviteLinkActivity.A0B);
                C002701i.A1C(A022, "AcceptInviteLinkActivity", acceptInviteLinkActivity.A05);
                acceptInviteLinkActivity.A16(A022, true);
                acceptInviteLinkActivity.A0D.A0F(acceptInviteLinkActivity.A0B, null);
            }
        }
    }
}
