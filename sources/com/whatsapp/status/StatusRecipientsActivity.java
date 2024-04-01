package com.whatsapp.status;

import X.AbstractActivityC06930Vs;
import X.AbstractActivityC50112Pw;
import X.C018508q;
import X.C0E6;
import X.C0EB;
import X.C0HS;
import X.InterfaceC002901k;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.jobqueue.job.SendStatusPrivacyListJob;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class StatusRecipientsActivity extends AbstractActivityC50112Pw {
    public C018508q A00;
    public C0E6 A01;
    public C0EB A02;
    public InterfaceC002901k A03;

    @Override // X.AbstractActivityC06930Vs
    public int A1R() {
        return R.string.status_recipients_black_list;
    }

    @Override // X.AbstractActivityC06930Vs
    public int A1S() {
        return R.string.unblock_before_status;
    }

    @Override // X.AbstractActivityC06930Vs
    public int A1T() {
        return R.string.status_recipients_white_list;
    }

    @Override // X.AbstractActivityC06930Vs
    public List A1U() {
        return this.A02.A09();
    }

    @Override // X.AbstractActivityC06930Vs
    public List A1V() {
        return this.A02.A0A();
    }

    @Override // X.AbstractActivityC06930Vs
    public void A1b() {
        setResult(-1, new Intent());
        AUr(R.string.processing, R.string.register_wait_message);
        InterfaceC002901k interfaceC002901k = this.A03;
        final C018508q c018508q = this.A00;
        final C0EB c0eb = this.A02;
        final C0E6 c0e6 = this.A01;
        final Set set = this.A0U;
        final boolean z = ((AbstractActivityC06930Vs) this).A0M;
        interfaceC002901k.ARy(new C0HS(c018508q, c0eb, c0e6, this, set, z) { // from class: X.3pQ
            public final C018508q A00;
            public final C0E6 A01;
            public final C0EB A02;
            public final WeakReference A03;
            public final Collection A04;
            public final boolean A05;

            {
                this.A00 = c018508q;
                this.A02 = c0eb;
                this.A01 = c0e6;
                this.A03 = new WeakReference(this);
                this.A04 = set;
                this.A05 = z;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C0EB c0eb2 = this.A02;
                boolean z2 = this.A05;
                int i = z2 ? 2 : 1;
                Collection collection = this.A04;
                c0eb2.A0D(i, collection);
                this.A01.A00.A01(new SendStatusPrivacyListJob(z2 ? 2 : 1, collection, null));
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A03.get();
                if (activityC02290Ap == null || activityC02290Ap.AFE()) {
                    return;
                }
                this.A00.A07(R.string.status_settings_updated, 1);
                activityC02290Ap.finish();
            }
        }, new Void[0]);
    }

    @Override // X.AbstractActivityC06930Vs
    public void A1e(Collection collection) {
        this.A02.A0D(((AbstractActivityC06930Vs) this).A0M ? 2 : 1, collection);
    }

    @Override // X.AbstractActivityC06930Vs
    public boolean A1f() {
        return !((AbstractActivityC06930Vs) this).A0M;
    }
}
