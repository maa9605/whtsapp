package com.whatsapp.biz.catalog;

import X.AbstractView$OnClickListenerC49532Ky;
import X.AnonymousClass024;
import X.AnonymousClass075;
import X.AnonymousClass088;
import X.C002301c;
import X.C018108l;
import X.C018708s;
import X.C02160Ac;
import X.C02180Ae;
import X.C02L;
import X.C05W;
import X.C06C;
import X.C06K;
import X.C0AT;
import X.C0E6;
import X.C0HS;
import X.C0LF;
import X.C0LX;
import X.C1N6;
import X.C2VE;
import X.C36331kd;
import X.InterfaceC002901k;
import X.InterfaceC04730Lp;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.CatalogHeader;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class CatalogHeader extends C2VE implements InterfaceC04730Lp {
    public ImageView A00;
    public TextView A01;
    public C02L A02;
    public TextEmojiLabel A03;
    public C0E6 A04;
    public C06K A05;
    public C05W A06;
    public AnonymousClass075 A07;
    public C018708s A08;
    public C0LF A09;
    public C002301c A0A;
    public GetVNameCertificateJob A0B;
    public InterfaceC002901k A0C;
    public boolean A0D;

    @Override // X.InterfaceC04730Lp
    public void AKm() {
    }

    @Override // X.InterfaceC04730Lp
    public void AKn() {
    }

    public CatalogHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.A01(context, attributeSet);
    }

    public float getAspectRatio() {
        return ((AspectRatioFrameLayout) this).A00;
    }

    public void setOnTextClickListener(AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky) {
        TextView textView = this.A01;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            this.A01.setOnClickListener(abstractView$OnClickListenerC49532Ky);
        }
        TextEmojiLabel textEmojiLabel = this.A03;
        if (textEmojiLabel == null || TextUtils.isEmpty(textEmojiLabel.getText())) {
            return;
        }
        this.A03.setOnClickListener(abstractView$OnClickListenerC49532Ky);
    }

    public void setUp(final UserJid userJid) {
        this.A00 = (ImageView) findViewById(R.id.catalog_list_header_image);
        TextView textView = (TextView) findViewById(R.id.catalog_list_header_business_name);
        this.A01 = textView;
        C0AT.A0M(textView);
        if (!this.A02.A0A(userJid)) {
            C02180Ae.A0Q(C02160Ac.A03(getContext(), R.drawable.chevron_right), -1);
            C0LX.A0C(this.A0A, this.A01);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                textView2.setCompoundDrawablePadding(AnonymousClass088.A02(getContext(), 8.0f));
            }
        }
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.catalog_list_header_business_description);
        this.A03 = textEmojiLabel;
        C0AT.A0M(textEmojiLabel);
        C018108l A0E = this.A07.A04.A0E(userJid);
        if (A0E == null && this.A0B == null) {
            GetVNameCertificateJob getVNameCertificateJob = new GetVNameCertificateJob(userJid);
            this.A0B = getVNameCertificateJob;
            this.A04.A00.A01(getVNameCertificateJob);
        }
        String str = A0E != null ? A0E.A08 : null;
        C06C A0A = this.A06.A0A(userJid);
        TextView textView3 = this.A01;
        if (textView3 != null) {
            if (AnonymousClass024.A0j(str)) {
                str = this.A08.A08(A0A, false);
            }
            textView3.setText(str);
        }
        C06K c06k = this.A05;
        c06k.A08.ARy(new C36331kd(c06k, userJid, new C1N6() { // from class: X.32e
            {
                CatalogHeader.this = this;
            }

            @Override // X.C1N6
            public final void AI2(C05210Nt c05210Nt) {
                CatalogHeader catalogHeader = CatalogHeader.this;
                UserJid userJid2 = userJid;
                if (catalogHeader.A0D) {
                    if (c05210Nt == null) {
                        return;
                    }
                } else if (c05210Nt == null) {
                    catalogHeader.A05.A01(userJid2, null).A00(catalogHeader);
                    catalogHeader.A0D = true;
                    return;
                }
                TextEmojiLabel textEmojiLabel2 = catalogHeader.A03;
                if (textEmojiLabel2 == null) {
                    return;
                }
                textEmojiLabel2.A03(c05210Nt.A03);
            }
        }), new Void[0]);
        this.A0C.ARy(new C0HS(A0A, this.A09, this) { // from class: X.330
            public final C0LF A00;
            public final C06C A01;
            public final WeakReference A02;

            {
                this.A01 = A0A;
                this.A00 = r3;
                this.A02 = new WeakReference(this);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                View view = (View) this.A02.get();
                if (view != null) {
                    return this.A00.A02(view.getContext(), this.A01, 640, 0.0f, true);
                }
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                CatalogHeader catalogHeader = (CatalogHeader) this.A02.get();
                if (catalogHeader != null) {
                    if (bitmap == null) {
                        catalogHeader.A00.setImageResource(R.drawable.avatar_contact_large);
                    } else {
                        catalogHeader.A00.setImageBitmap(bitmap);
                    }
                }
            }
        }, new Void[0]);
    }
}
