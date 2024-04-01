package com.whatsapp.payments.ui.widget;

import X.AnonymousClass093;
import X.C02160Ac;
import X.C02180Ae;
import X.C0DV;
import X.C0DX;
import X.C2Ly;
import X.C3SC;
import X.C40841sx;
import X.C4AE;
import X.C4FT;
import X.InterfaceC03590Gh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class PaymentInteropShimmerRow extends C4FT implements C4AE {
    public View A00;
    public View A01;
    public AnonymousClass093 A02;
    public C0DV A03;
    public C2Ly A04;

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.payment_transaction_shimmer, this);
        setOrientation(1);
        this.A00 = findViewById(R.id.payment_shimmer);
        this.A01 = findViewById(R.id.static_shimmer);
        C02180Ae.A17((ImageView) findViewById(R.id.transaction_loading_error), C02160Ac.A00(getContext(), R.color.payments_error_exclamation));
        setOnClickListener(new C3SC(this));
    }

    public /* synthetic */ void A00() {
        C0DX c0dx;
        InterfaceC03590Gh A02 = this.A03.A02(this.A02.A0E);
        if (A02 != null) {
            c0dx = A02.ACJ(this.A02.A0G);
        } else {
            c0dx = null;
        }
        C40841sx.A0V(getContext(), c0dx, this.A02);
    }

    @Override // X.C4AE
    /* renamed from: A01 */
    public void A5j(AnonymousClass093 anonymousClass093) {
        this.A02 = anonymousClass093;
        if (this.A04.A08(anonymousClass093.A0I)) {
            this.A00.setVisibility(8);
            this.A01.setVisibility(0);
            return;
        }
        this.A00.setVisibility(0);
        this.A01.setVisibility(8);
    }

    @Override // X.C4AE
    public void ARG() {
        AnonymousClass093 anonymousClass093 = this.A02;
        if (anonymousClass093 != null) {
            A5j(anonymousClass093);
        }
    }
}
