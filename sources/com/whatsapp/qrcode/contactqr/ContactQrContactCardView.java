package com.whatsapp.qrcode.contactqr;

import X.AbstractC40501sN;
import X.AnonymousClass075;
import X.C003301p;
import X.C018108l;
import X.C018708s;
import X.C02160Ac;
import X.C02L;
import X.C06030Rg;
import X.C06C;
import X.C0AT;
import X.C0L7;
import X.C0LF;
import X.C1D6;
import X.C1DD;
import X.C1DV;
import X.C24921Dj;
import X.C2AR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.QrImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public class ContactQrContactCardView extends AbstractC40501sN {
    public View A00;
    public View A01;
    public C02L A02;
    public QrImageView A03;
    public C06030Rg A04;
    public C06030Rg A05;
    public WaTextView A06;
    public ThumbnailButton A07;
    public C0L7 A08;
    public AnonymousClass075 A09;
    public C018708s A0A;
    public C0LF A0B;
    public C2AR A0C;

    public ContactQrContactCardView(Context context) {
        super(context);
        A00(context);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public final void A00(Context context) {
        LinearLayout.inflate(context, R.layout.contact_qr_contact_card, this);
        this.A07 = (ThumbnailButton) C0AT.A0D(this, R.id.profile_picture);
        this.A05 = new C06030Rg(this, (int) R.id.title, this.A0A, this.A0C);
        this.A04 = new C06030Rg(this, (int) R.id.subtitle, this.A0A, this.A0C);
        this.A00 = C0AT.A0D(this, R.id.qr_code_container);
        this.A03 = (QrImageView) C0AT.A0D(this, R.id.qr_code);
        this.A06 = (WaTextView) C0AT.A0D(this, R.id.prompt);
        this.A01 = C0AT.A0D(this, R.id.qr_shadow);
    }

    public void A01(C06C c06c, boolean z) {
        if (c06c.A0R && z) {
            this.A07.setImageBitmap(this.A0B.A02(getContext(), c06c, getResources().getDimensionPixelSize(R.dimen.contact_qr_avatar_size), getResources().getDimensionPixelSize(R.dimen.contact_qr_avatar_radius), false));
        } else {
            this.A08.A06(this.A07, c06c);
        }
        if (c06c.A0C()) {
            C06030Rg c06030Rg = this.A05;
            c06030Rg.A01.setText(this.A0A.A08(c06c, false));
            C06030Rg c06030Rg2 = this.A04;
            c06030Rg2.A01.setText(getContext().getString(R.string.group_qr_share_subtitle));
        } else if (!c06c.A0B()) {
            C06030Rg c06030Rg3 = this.A05;
            c06030Rg3.A01.setText(c06c.A0O);
            C06030Rg c06030Rg4 = this.A04;
            c06030Rg4.A01.setText(getContext().getString(R.string.contact_qr_share_subtitle));
        } else {
            C018108l A00 = this.A09.A00((UserJid) c06c.A03(UserJid.class));
            if (c06c.A0E() || (A00 != null && A00.A03 == 3)) {
                C06030Rg c06030Rg5 = this.A05;
                c06030Rg5.A01.setText(c06c.A0O);
                this.A05.A01(1);
                C06030Rg c06030Rg6 = this.A04;
                c06030Rg6.A01.setText(getContext().getString(R.string.business_info_official_business_account));
                return;
            }
            C06030Rg c06030Rg7 = this.A05;
            c06030Rg7.A01.setText(c06c.A0O);
            C06030Rg c06030Rg8 = this.A04;
            c06030Rg8.A01.setText(getContext().getString(R.string.message_qr_whatsapp_business_account));
        }
    }

    public void setPrompt(String str) {
        this.A06.setText(str);
    }

    public void setQrCode(String str) {
        try {
            this.A03.setQrCode(C24921Dj.A01(str, C1DV.M, new EnumMap(C1D6.class)));
            this.A03.invalidate();
        } catch (C1DD e) {
            Log.e("ContactQrContactCardView/failed to set QR code", e);
        }
    }

    public void setStyle(int i) {
        C003301p.A06(this.A05.A01);
        if (i == 1) {
            setBackgroundColor(C02160Ac.A00(getContext(), R.color.contact_qr_share_card_background_color));
            setPadding(0, getResources().getDimensionPixelOffset(R.dimen.contact_qr_share_card_padding_top), 0, getPaddingBottom());
            ((ViewGroup.MarginLayoutParams) this.A06.getLayoutParams()).setMargins(0, this.A06.getResources().getDimensionPixelSize(R.dimen.contact_qr_share_card_prompt_margin_top), 0, 0);
            WaTextView waTextView = this.A06;
            waTextView.setTextSize(0, waTextView.getResources().getDimensionPixelSize(R.dimen.contact_qr_share_card_prompt_text_size));
            this.A06.setTextColor(C02160Ac.A00(getContext(), R.color.white_alpha_54));
            this.A01.setVisibility(0);
            return;
        }
        this.A00.setContentDescription(getContext().getString(R.string.accessibility_my_qr_code));
    }
}
