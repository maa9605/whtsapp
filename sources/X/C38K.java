package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.38K  reason: invalid class name */
/* loaded from: classes2.dex */
public class C38K extends C0HS {
    public AbstractC09240cu A00;
    public final C06M A01;
    public final C41321tj A02;
    public final UserJid A03;
    public final WeakReference A04;
    public final CountDownLatch A05 = new CountDownLatch(1);

    public C38K(ActivityC02270An activityC02270An, C41321tj c41321tj, C06M c06m, final UserJid userJid) {
        this.A04 = new WeakReference(activityC02270An);
        this.A01 = c06m;
        this.A02 = c41321tj;
        this.A03 = userJid;
        this.A00 = new AbstractC09240cu() { // from class: X.38J
            @Override // X.AbstractC09240cu
            public void A00(UserJid userJid2) {
                if (userJid.equals(userJid2)) {
                    C38K.this.A05.countDown();
                }
            }
        };
    }

    @Override // X.C0HS
    public void A06() {
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A04.get();
        if (activityC02290Ap != null) {
            activityC02290Ap.AUr(0, R.string.loading_biz_profile);
        }
        this.A01.A01(this.A00);
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        C41321tj c41321tj = this.A02;
        C468428m c468428m = new C468428m(C22H.A06);
        c468428m.A02();
        c468428m.A04 = true;
        UserJid userJid = this.A03;
        if (userJid != null) {
            c468428m.A02.add(userJid);
        }
        if (c41321tj.A01(c468428m.A01()).A00()) {
            try {
                this.A05.await(30000L, TimeUnit.MILLISECONDS);
                return null;
            } catch (InterruptedException unused) {
                Log.w("ConversationRowContact/OpenBusinessProfileNotInContactListTask was interrupted while waiting for biz identity response.");
                return null;
            }
        }
        return null;
    }

    @Override // X.C0HS
    public void A08() {
        this.A01.A00(this.A00);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        this.A01.A00(this.A00);
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A04.get();
        if (activityC02290Ap != null) {
            activityC02290Ap.ARS();
            activityC02290Ap.A14(ContactInfoActivity.A00(this.A03, activityC02290Ap));
        }
    }
}
