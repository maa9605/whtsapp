package X;

import android.app.Activity;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3DS */
/* loaded from: classes2.dex */
public abstract class C3DS extends C0HS {
    public int A00;
    public C07E A01;
    public C07D A02;
    public C011005l A03;
    public UserJid A04;
    public final C0EG A05;

    public C3DS(C0EG c0eg, C011005l c011005l, UserJid userJid) {
        this.A05 = c0eg;
        this.A03 = c011005l;
        this.A04 = userJid;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Future A01 = this.A05.A01(this.A03, Collections.singletonList(this.A04), new C3DR(this), null);
        if (A01 != null) {
            try {
                A01.get(32000L, TimeUnit.MILLISECONDS);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < 500) {
                    SystemClock.sleep(500 - elapsedRealtime2);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        if (this.A02 == null || this.A01 == null) {
            if (!(this instanceof C68593Ko)) {
                C68533Kg c68533Kg = (C68533Kg) this;
                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) c68533Kg.A01.get();
                if (activityC02290Ap == null) {
                    return;
                }
                activityC02290Ap.ARS();
                c68533Kg.A00.A07(R.string.revoking_invite_failure, 0);
                return;
            }
            ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) ((C68593Ko) this).A00.get();
            if (viewGroupInviteActivity == null) {
                return;
            }
            viewGroupInviteActivity.A1P(R.string.revoking_invite_failure);
        } else if (!(this instanceof C68593Ko)) {
            C68533Kg c68533Kg2 = (C68533Kg) this;
            ActivityC02290Ap activityC02290Ap2 = (ActivityC02290Ap) c68533Kg2.A01.get();
            if (activityC02290Ap2 != null) {
                activityC02290Ap2.ARS();
                c68533Kg2.A00.A07(R.string.revoking_invite_success, 0);
            }
        } else {
            C68593Ko c68593Ko = (C68593Ko) this;
            Activity activity = (Activity) c68593Ko.A00.get();
            if (activity == null) {
                return;
            }
            c68593Ko.A01.A07(R.string.revoking_invite_success, 0);
            activity.finish();
        }
    }
}
