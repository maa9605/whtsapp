package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaButton;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1;

/* renamed from: X.2rs */
/* loaded from: classes2.dex */
public class C58892rs {
    public int A00;
    public int A01;
    public View A02;
    public AnonymousClass097 A03;
    public boolean A07;
    public boolean A08;
    public final View A0A;
    public final ImageView A0B;
    public final CircularProgressBar A0C;
    public final C03010Du A0D;
    public final C01B A0E;
    public final C018608r A0F;
    public final WaButton A0G;
    public final C02F A0H;
    public final C002301c A0I;
    public final C41771uU A0J;
    public final C42451vl A0K;
    public final C43791xz A0L;
    public final StickerView A0M;
    public final C42471vn A0O;
    public AbstractView$OnClickListenerC49532Ky A04 = new ViewOnClickCListenerShape12S0100000_I1(this, 10);
    public AbstractView$OnClickListenerC49532Ky A05 = new ViewOnClickCListenerShape12S0100000_I1(this, 11);
    public AbstractView$OnClickListenerC49532Ky A06 = new ViewOnClickCListenerShape12S0100000_I1(this, 12);
    public final View.OnClickListener A09 = new ViewOnClickCListenerShape12S0100000_I1(this, 13);
    public final InterfaceC43821y3 A0N = new InterfaceC43821y3() { // from class: X.38g
        {
            C58892rs.this = this;
        }

        @Override // X.InterfaceC43821y3
        public int ADA() {
            return C58892rs.this.A0M.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_row_sticker_size);
        }

        @Override // X.InterfaceC43821y3
        public void AKM() {
            Log.w("ConversationRowSticker/onFileReadError");
            C58892rs.this.A07 = false;
        }

        @Override // X.InterfaceC43821y3
        public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
            if (bitmap != null && (anonymousClass092 instanceof AnonymousClass097)) {
                C58892rs.this.A0M.setImageBitmap(bitmap);
                return;
            }
            C58892rs c58892rs = C58892rs.this;
            c58892rs.A07 = false;
            c58892rs.A0M.setImageResource(R.drawable.sticker_error_in_conversation);
        }

        @Override // X.InterfaceC43821y3
        public void AUo(View view) {
            Log.w("ConversationRowSticker/showPlaceholder");
            C58892rs c58892rs = C58892rs.this;
            c58892rs.A07 = false;
            c58892rs.A0M.setImageResource(R.drawable.sticker_error_in_conversation);
        }
    };

    public C58892rs(View view, C43791xz c43791xz, C03010Du c03010Du, C01B c01b, C018608r c018608r, C002301c c002301c, C42471vn c42471vn, C02F c02f, C42451vl c42451vl, C41771uU c41771uU) {
        this.A00 = 1;
        this.A01 = 3;
        this.A02 = view;
        this.A0M = (StickerView) view.findViewById(R.id.sticker_image);
        CircularProgressBar circularProgressBar = (CircularProgressBar) view.findViewById(R.id.progress_bar);
        this.A0C = circularProgressBar;
        circularProgressBar.A0B = 0;
        this.A0B = (ImageView) view.findViewById(R.id.cancel_download);
        this.A0A = view.findViewById(R.id.control_frame);
        this.A0G = (WaButton) view.findViewById(R.id.control_btn);
        this.A0L = c43791xz;
        this.A0D = c03010Du;
        this.A0E = c01b;
        this.A0F = c018608r;
        this.A0I = c002301c;
        this.A0O = c42471vn;
        this.A0H = c02f;
        this.A0K = c42451vl;
        this.A0J = c41771uU;
        if (c01b.A0E(C01C.A1g)) {
            this.A00 = 7;
            this.A01 = 7;
        }
    }

    public void A00() {
        View view = this.A0A;
        view.setVisibility(0);
        CircularProgressBar circularProgressBar = this.A0C;
        ImageView imageView = this.A0B;
        WaButton waButton = this.A0G;
        C2JE.A09(false, false, false, view, circularProgressBar, imageView, waButton);
        AnonymousClass097 anonymousClass097 = this.A03;
        if (anonymousClass097.A0n.A02 && !C0DB.A0m(anonymousClass097)) {
            StickerView stickerView = this.A0M;
            stickerView.setContentDescription(stickerView.getContext().getString(R.string.retry));
            waButton.setText(R.string.retry);
            waButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
            waButton.setOnClickListener(this.A06);
            stickerView.setOnClickListener(this.A06);
            return;
        }
        StickerView stickerView2 = this.A0M;
        stickerView2.setContentDescription(stickerView2.getContext().getString(R.string.button_download));
        waButton.setText(C0DB.A07(this.A0I, this.A03.A01));
        waButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
        waButton.setOnClickListener(this.A05);
        stickerView2.setOnClickListener(this.A05);
    }

    public void A01() {
        if (!this.A03.A0n.A02) {
            View view = this.A0A;
            view.setVisibility(0);
            CircularProgressBar circularProgressBar = this.A0C;
            ImageView imageView = this.A0B;
            WaButton waButton = this.A0G;
            C2JE.A09(true, false, false, view, circularProgressBar, imageView, waButton);
            StickerView stickerView = this.A0M;
            stickerView.setContentDescription(stickerView.getContext().getString(R.string.image_transfer_in_progress));
            waButton.setOnClickListener(this.A04);
            circularProgressBar.setOnClickListener(this.A04);
        } else {
            this.A0A.setVisibility(8);
        }
        this.A0M.setOnClickListener(null);
    }

    public void A02() {
        View view = this.A0A;
        view.setVisibility(8);
        CircularProgressBar circularProgressBar = this.A0C;
        ImageView imageView = this.A0B;
        WaButton waButton = this.A0G;
        C2JE.A09(false, false, false, view, circularProgressBar, imageView, waButton);
        waButton.setOnClickListener(null);
        this.A0M.setOnClickListener(this.A09);
    }

    public void A03(final C04040Ie c04040Ie, final boolean z) {
        this.A03 = c04040Ie;
        if (z) {
            this.A0M.setImageDrawable(null);
        }
        C0JM A1H = c04040Ie.A1H();
        final C09H c09h = ((AnonymousClass097) c04040Ie).A02;
        if (c09h != null) {
            StickerView stickerView = this.A0M;
            int dimensionPixelSize = stickerView.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_row_sticker_size);
            stickerView.setOnClickListener(null);
            stickerView.setContentDescription(stickerView.getContext().getString(R.string.sticker_message_content_description));
            if (A1H.A0B != null && (c09h.A0F != null || ((AnonymousClass097) c04040Ie).A08 != null)) {
                this.A0L.A06(A1H, 1, stickerView, dimensionPixelSize, dimensionPixelSize, true, false, new InterfaceC44171yd() { // from class: X.384
                    {
                        C58892rs.this = this;
                    }

                    @Override // X.InterfaceC44171yd
                    public final void AP5(boolean z2) {
                        StickerView stickerView2;
                        C58892rs c58892rs = C58892rs.this;
                        C09H c09h2 = c09h;
                        C04040Ie c04040Ie2 = c04040Ie;
                        boolean z3 = z;
                        if (!z2) {
                            c09h2.A0X = true;
                            c58892rs.A04(c04040Ie2, z3);
                            c58892rs.A00();
                            return;
                        }
                        if (!c58892rs.A08 && !c58892rs.A0E.A0E(C01C.A1g)) {
                            stickerView2 = c58892rs.A0M;
                            if (stickerView2.A02) {
                                stickerView2.A00();
                            }
                            stickerView2.A00 = c58892rs.A00;
                        } else {
                            stickerView2 = c58892rs.A0M;
                            stickerView2.A00 = c58892rs.A01;
                            stickerView2.A00();
                        }
                        stickerView2.setOnClickListener(c58892rs.A09);
                    }
                });
            } else {
                A04(c04040Ie, z);
            }
            this.A02.invalidate();
            return;
        }
        throw null;
    }

    public final void A04(C04040Ie c04040Ie, boolean z) {
        if (this.A07 && !z) {
            this.A07 = false;
            this.A0O.A0A(c04040Ie, this.A0M, this.A0N, c04040Ie.A0n, false);
            return;
        }
        this.A07 = false;
        this.A0O.A0C(c04040Ie, this.A0M, this.A0N, false);
    }
}
