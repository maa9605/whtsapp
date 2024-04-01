package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass075;
import X.C000200d;
import X.C002301c;
import X.C002701i;
import X.C018708s;
import X.C01B;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C04460Kg;
import X.C04630Le;
import X.C05W;
import X.C06C;
import X.C09360d8;
import X.C0AT;
import X.C0GA;
import X.C0L5;
import X.C0Zn;
import X.C2AR;
import X.C2MS;
import X.C40081rY;
import X.C41321tj;
import X.C42371vd;
import X.C52762bH;
import X.InterfaceC002901k;
import X.InterfaceC05810Qi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment;

/* loaded from: classes2.dex */
public class ScannedCodeDialogFragment extends Hilt_ScannedCodeDialogFragment {
    public int A00;
    public ImageView A03;
    public C09360d8 A04;
    public C02L A05;
    public C01B A06;
    public C05W A07;
    public AnonymousClass008 A08;
    public C42371vd A09;
    public AnonymousClass075 A0A;
    public C018708s A0B;
    public C0Zn A0C;
    public C0L5 A0D;
    public C41321tj A0E;
    public C02E A0F;
    public C02F A0G;
    public C002301c A0H;
    public C06C A0I;
    public C40081rY A0J;
    public AnonymousClass011 A0K;
    public UserJid A0L;
    public InterfaceC05810Qi A0M;
    public C2AR A0N;
    public C52762bH A0O;
    public C2MS A0P;
    public InterfaceC002901k A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public final C0GA A0U = new C0GA() { // from class: X.3lt
        {
            ScannedCodeDialogFragment.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            ScannedCodeDialogFragment scannedCodeDialogFragment = ScannedCodeDialogFragment.this;
            if (abstractC005302j.equals(scannedCodeDialogFragment.A0L)) {
                scannedCodeDialogFragment.A0C.A02(scannedCodeDialogFragment.A0I, scannedCodeDialogFragment.A03);
            }
        }
    };
    public View.OnClickListener A01 = new ViewOnClickEBaseShape3S0100000_I0_3(this, 34);
    public View.OnClickListener A02 = new ViewOnClickEBaseShape3S0100000_I0_3(this, 33);

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        this.A08.A00(this.A0U);
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.A0E.A06();
                Intent A02 = Conversation.A02(A00(), this.A0L);
                A02.putExtra("added_by_qr_code", true);
                this.A04.A01(this, A02);
            }
            A16(false, false);
            this.A0O.A00();
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String obj;
        Bundle A02 = A02();
        this.A00 = A02.getInt("ARG_TYPE");
        this.A0L = UserJid.getNullable(A02.getString("ARG_JID"));
        this.A0S = A02.getString("ARG_MESSAGE");
        this.A0R = A02.getString("ARG_SOURCE");
        this.A0T = A02.getString("ARG_QR_CODE_ID");
        C05W c05w = this.A07;
        UserJid userJid = this.A0L;
        if (userJid != null) {
            this.A0I = c05w.A0A(userJid);
            boolean A0A = this.A05.A0A(this.A0L);
            View inflate = A0A().getLayoutInflater().inflate(R.layout.view_scanned_qr_code, (ViewGroup) null);
            TextView textView = (TextView) C0AT.A0D(inflate, R.id.title);
            TextView textView2 = (TextView) C0AT.A0D(inflate, R.id.positive_button);
            this.A03 = (ImageView) C0AT.A0D(inflate, R.id.profile_picture);
            View A0D = C0AT.A0D(inflate, R.id.contact_info);
            TextView textView3 = (TextView) C0AT.A0D(inflate, R.id.result_title);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C0AT.A0D(inflate, R.id.result_subtitle);
            if (!this.A0I.A09()) {
                textView3.setText(this.A0H.A0F(C04630Le.A02(this.A0L)));
                C018708s c018708s = this.A0B;
                C06C c06c = this.A0I;
                if (c018708s.A00.A0A(c06c.A02())) {
                    obj = c018708s.A03.A00.getString(R.string.you);
                } else if (c06c.A08 != null) {
                    obj = c018708s.A08(c06c, false);
                } else {
                    if (!TextUtils.isEmpty(c06c.A0O)) {
                        StringBuilder A0P = C000200d.A0P("~");
                        A0P.append(c06c.A0O);
                        obj = A0P.toString();
                    }
                    textEmojiLabel.setVisibility(8);
                }
                if (obj != null) {
                    textEmojiLabel.A06(obj, null, false, 0);
                }
                textEmojiLabel.setVisibility(8);
            } else {
                A0D.getContext();
                TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) A0D.findViewById(R.id.result_title);
                C018708s c018708s2 = this.A0B;
                C06C c06c2 = this.A0I;
                if (c018708s2 != null) {
                    textView3.setText(C002701i.A0d(c06c2.A05(), ((Hilt_ScannedCodeDialogFragment) this).A00, textView3.getPaint(), this.A0J));
                    textEmojiLabel2.A02(R.drawable.ic_verified);
                    textEmojiLabel.setText(A0F(R.string.business_info_official_business_account));
                } else {
                    throw null;
                }
            }
            this.A0C.A02(this.A0I, this.A03);
            int i = this.A00;
            if (i != 0) {
                if (i == 1) {
                    A16(false, false);
                    return inflate;
                } else if (i == 2) {
                    textView.setText(A0F(R.string.qr_title_add_account));
                    textView2.setText(R.string.message_qr_continue_to_chat);
                    textView2.setOnClickListener(this.A01);
                    C0AT.A0D(inflate, R.id.details_row).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 35));
                    return inflate;
                } else {
                    throw new IllegalArgumentException("Unhandled type");
                }
            }
            textView.setText(A0F(R.string.qr_title_add_account));
            if (A0A) {
                textView2.setText(A0F(R.string.ok));
                textView2.setOnClickListener(this.A02);
                return inflate;
            }
            C04460Kg c04460Kg = this.A0I.A08;
            int i2 = R.string.contact_qr_add_contact_add;
            if (c04460Kg != null) {
                i2 = R.string.contact_qr_contact_message;
            }
            textView2.setText(A0F(i2));
            textView2.setOnClickListener(this.A01);
            C0AT.A0D(inflate, R.id.details_row).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 32));
            return inflate;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0q() {
        super.A0U = true;
        this.A0C.A00();
    }

    @Override // com.whatsapp.qrcode.contactqr.Hilt_ScannedCodeDialogFragment, com.whatsapp.Hilt_RoundedBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A0O = new C52762bH(this.A0K, this.A06, this.A0F, this.A0G);
        if (context instanceof InterfaceC05810Qi) {
            this.A0M = (InterfaceC05810Qi) context;
        }
        this.A08.A01(this.A0U);
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        this.A0C = this.A0D.A04(A00());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        InterfaceC05810Qi interfaceC05810Qi = this.A0M;
        if (interfaceC05810Qi != null) {
            interfaceC05810Qi.ANV();
        }
    }
}
