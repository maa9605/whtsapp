package com.whatsapp.biz;

import X.AbstractActivityC49802Mm;
import X.AbstractC09240cu;
import X.ActivityC02290Ap;
import X.AnonymousClass008;
import X.C002301c;
import X.C018308n;
import X.C018708s;
import X.C02L;
import X.C03320Ff;
import X.C03360Fk;
import X.C06C;
import X.C06K;
import X.C06L;
import X.C06M;
import X.C0DK;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0U1;
import X.C32C;
import X.C40201rk;
import X.C41471ty;
import X.C55992mW;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* loaded from: classes2.dex */
public class BusinessProfileExtraFieldsActivity extends AbstractActivityC49802Mm {
    public C018308n A00;
    public C02L A01;
    public C55992mW A02;
    public C06K A03;
    public C06M A04;
    public C06L A05;
    public C40201rk A06;
    public C03320Ff A07;
    public AnonymousClass008 A08;
    public C018708s A09;
    public C002301c A0A;
    public C0DK A0B;
    public C06C A0C;
    public C03360Fk A0D;
    public UserJid A0E;
    public C41471ty A0F;
    public final C0GA A0I = new C0GA() { // from class: X.32E
        {
            BusinessProfileExtraFieldsActivity.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            BusinessProfileExtraFieldsActivity.this.A1P();
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            if (userJid != null) {
                BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = BusinessProfileExtraFieldsActivity.this;
                if (userJid.equals(businessProfileExtraFieldsActivity.A0E)) {
                    businessProfileExtraFieldsActivity.A1P();
                }
            }
        }
    };
    public final C0GC A0H = new C0GC() { // from class: X.32F
        {
            BusinessProfileExtraFieldsActivity.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            BusinessProfileExtraFieldsActivity.this.A1P();
        }
    };
    public final C0GE A0J = new C0GE() { // from class: X.32G
        {
            BusinessProfileExtraFieldsActivity.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            BusinessProfileExtraFieldsActivity.this.A1P();
        }
    };
    public final AbstractC09240cu A0G = new AbstractC09240cu() { // from class: X.32H
        {
            BusinessProfileExtraFieldsActivity.this = this;
        }

        @Override // X.AbstractC09240cu
        public void A01(UserJid userJid) {
            if (userJid != null) {
                BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = BusinessProfileExtraFieldsActivity.this;
                if (userJid.equals(businessProfileExtraFieldsActivity.A0E)) {
                    businessProfileExtraFieldsActivity.A03.A04(businessProfileExtraFieldsActivity.A0E, new C32C(businessProfileExtraFieldsActivity));
                }
            }
        }
    };

    public void A1P() {
        C06C A02 = this.A0B.A02(this.A0E);
        this.A0C = A02;
        setTitle(this.A09.A08(A02, false));
    }

    @Override // X.AbstractActivityC49802Mm, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            this.A0E = nullable;
            A1P();
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A0L(true);
            }
            setContentView(R.layout.smb_extra_business_profile_activity_view);
            this.A02 = new C55992mW(((ActivityC02290Ap) this).A0I, this.A01, this.A00, this.A0F, this.A09, this.A0A, this.A05, this.A06, this, ((ActivityC02290Ap) this).A04, this.A0C, true);
            this.A03.A04(this.A0E, new C32C(this));
            this.A08.A01(this.A0I);
            this.A07.A01(this.A0H);
            this.A04.A01(this.A0G);
            this.A0D.A01(this.A0J);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A08.A00(this.A0I);
        this.A07.A00(this.A0H);
        this.A04.A00(this.A0G);
        this.A0D.A00(this.A0J);
    }
}
