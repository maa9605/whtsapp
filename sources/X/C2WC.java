package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import java.util.Locale;

/* renamed from: X.2WC */
/* loaded from: classes2.dex */
public class C2WC extends C2WD {
    public C42471vn A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final CircularProgressBar A0B;
    public final TextEmojiLabel A0C;
    public final WaImageView A0D;
    public final InterfaceC43821y3 A0E;

    public C2WC(Context context, C09E c09e) {
        super(context, c09e);
        this.A0E = new InterfaceC43821y3() { // from class: X.38M
            {
                C2WC.this = this;
            }

            @Override // X.InterfaceC43821y3
            public int ADA() {
                return C2WC.this.getResources().getDimensionPixelSize(R.dimen.conversation_row_message_thumb_size);
            }

            @Override // X.InterfaceC43821y3
            public void AKM() {
                C2WC.this.A0m();
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                C2WC c2wc = C2WC.this;
                if (bitmap != null) {
                    ImageView imageView = c2wc.A07;
                    imageView.setImageBitmap(bitmap);
                    imageView.setVisibility(0);
                    c2wc.A05.setVisibility(0);
                    return;
                }
                ImageView imageView2 = c2wc.A07;
                imageView2.setTag(null);
                imageView2.setVisibility(8);
                c2wc.A05.setVisibility(8);
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                C2WC c2wc = C2WC.this;
                ImageView imageView = c2wc.A07;
                imageView.setImageDrawable(new ColorDrawable(-7829368));
                imageView.setVisibility(0);
                c2wc.A05.setVisibility(0);
            }
        };
        this.A06 = (ImageView) findViewById(R.id.icon);
        this.A0D = (WaImageView) findViewById(R.id.control_btn);
        this.A04 = findViewById(R.id.control_btn_holder);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progressbar);
        this.A0B = circularProgressBar;
        circularProgressBar.setMax(100);
        this.A0B.A0C = C02160Ac.A00(context, R.color.media_message_progress_determinate);
        this.A0B.A0B = 536870912;
        this.A0C = (TextEmojiLabel) findViewById(R.id.title);
        this.A03 = findViewById(R.id.content);
        this.A0A = (TextView) findViewById(R.id.info);
        this.A02 = findViewById(R.id.bullet_info);
        this.A08 = (TextView) findViewById(R.id.file_size);
        this.A01 = findViewById(R.id.bullet_file_size);
        this.A09 = (TextView) findViewById(R.id.file_type);
        this.A07 = (ImageView) findViewById(R.id.preview);
        this.A05 = findViewById(R.id.preview_separator);
        A0n();
    }

    @Override // X.AbstractC48202Eh
    public boolean A07() {
        return C0DB.A0K(((AbstractC48182Ef) this).A0K, super.getFMessage());
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        if (!(this instanceof C2WH)) {
            return C0DB.A0g(super.getFMessage());
        }
        return C0DB.A0g((C09E) super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0n();
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0J() {
        if (super.getFMessage().A0E().A05()) {
            C42471vn c42471vn = this.A00;
            if (c42471vn != null) {
                c42471vn.A0C(super.getFMessage(), this.A07, this.A0E, false);
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0M() {
        A0j(this.A0B, super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0N() {
        Activity A00 = C018308n.A00(getContext());
        if (A00 instanceof ActivityC02290Ap) {
            C09E c09e = (C09E) super.getFMessage();
            C42461vm c42461vm = ((AbstractC48202Eh) this).A0M;
            if (c42461vm != null) {
                C018508q c018508q = ((AbstractC48182Ef) this).A0G;
                if (c018508q != null) {
                    AbstractC000600i abstractC000600i = ((AbstractC48182Ef) this).A0F;
                    if (abstractC000600i != null) {
                        InterfaceC002901k interfaceC002901k = this.A12;
                        if (interfaceC002901k != null) {
                            C01B c01b = ((AbstractC48182Ef) this).A0K;
                            if (c01b != null) {
                                C018308n c018308n = ((AbstractC48182Ef) this).A0E;
                                if (c018308n != null) {
                                    C40421sE c40421sE = this.A0k;
                                    if (c40421sE != null) {
                                        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) A00;
                                        C02F c02f = ((C2JE) this).A02;
                                        if (c02f != null) {
                                            if (C23X.A03(c09e, c42461vm, c018508q, abstractC000600i, interfaceC002901k, c01b, c018308n, c40421sE, activityC02290Ap, c02f) == 2) {
                                                A0m();
                                                return;
                                            }
                                            return;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0n();
        }
    }

    public final void A0n() {
        CharSequence string;
        View view;
        C09E c09e = (C09E) super.getFMessage();
        C09H c09h = ((AnonymousClass097) c09e).A02;
        if (c09h != null) {
            this.A06.setImageDrawable(C460324r.A03(getContext(), c09e));
            TextEmojiLabel textEmojiLabel = this.A0C;
            if (!TextUtils.isEmpty(c09e.A1B())) {
                string = A0G(c09e.A1B());
            } else {
                string = getContext().getString(R.string.untitled_document);
            }
            textEmojiLabel.setText(string);
            if (c09e.A0E().A05()) {
                this.A00.A0C(c09e, this.A07, this.A0E, false);
            } else {
                ImageView imageView = this.A07;
                imageView.setTag(null);
                imageView.setVisibility(8);
                this.A05.setVisibility(8);
            }
            boolean z = true;
            if (C0DB.A0n(getFMessage())) {
                this.A04.setVisibility(0);
                WaImageView waImageView = this.A0D;
                waImageView.setImageResource(R.drawable.inline_audio_cancel);
                waImageView.setOnClickListener(((C2JE) this).A09);
                AnonymousClass088.A1V(waImageView, R.string.cancel);
                boolean z2 = c09e.A0n.A02;
                Context context = getContext();
                if (z2) {
                    waImageView.setContentDescription(context.getString(R.string.tb_button_uploading));
                    view = this.A03;
                    view.setOnClickListener(((C2JE) this).A0C);
                } else {
                    waImageView.setContentDescription(context.getString(R.string.tb_button_downloading));
                    view = this.A03;
                    view.setOnClickListener(null);
                }
            } else if (C0DB.A0o(getFMessage())) {
                AnonymousClass088.A1T(this.A0D);
                this.A04.setVisibility(8);
                view = this.A03;
                view.setOnClickListener(((C2JE) this).A0C);
                z = false;
            } else {
                WaImageView waImageView2 = this.A0D;
                AnonymousClass088.A1T(waImageView2);
                this.A04.setVisibility(0);
                if (c09e.A0n.A02 && c09h.A0F != null) {
                    waImageView2.setImageResource(R.drawable.inline_audio_upload);
                    waImageView2.setContentDescription(getContext().getString(R.string.retry));
                    waImageView2.setOnClickListener(((C2JE) this).A0B);
                    view = this.A03;
                    view.setOnClickListener(((C2JE) this).A0C);
                } else {
                    waImageView2.setImageResource(R.drawable.inline_audio_download);
                    waImageView2.setContentDescription(getContext().getString(R.string.button_download));
                    AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky = ((C2JE) this).A0A;
                    waImageView2.setOnClickListener(abstractView$OnClickListenerC49532Ky);
                    view = this.A03;
                    view.setOnClickListener(abstractView$OnClickListenerC49532Ky);
                }
            }
            A0M();
            TextView textView = this.A08;
            if (z) {
                textView.setVisibility(0);
                this.A01.setVisibility(0);
                textView.setText(C02180Ae.A0k(((AbstractC48202Eh) this).A0J, ((AnonymousClass097) c09e).A01));
            } else {
                textView.setVisibility(8);
                this.A01.setVisibility(8);
            }
            if (c09e.A00 != 0) {
                TextView textView2 = this.A0A;
                textView2.setVisibility(0);
                this.A02.setVisibility(0);
                textView2.setText(C460324r.A09(((AbstractC48202Eh) this).A0J, ((AnonymousClass097) c09e).A07, c09e.A00));
            } else {
                this.A0A.setVisibility(8);
                this.A02.setVisibility(8);
            }
            CharSequence upperCase = C41961un.A0T(((AnonymousClass097) c09e).A07).toUpperCase(Locale.US);
            if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(c09e.A1B())) {
                upperCase = AnonymousClass024.A0G(c09e.A1B()).toUpperCase(Locale.US);
            }
            this.A09.setText(A0G(upperCase));
            view.setOnLongClickListener(this.A19);
            view.setOnTouchListener(this.A1A);
            A0l(c09e);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_document_left;
    }

    @Override // X.C2JE
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass097 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public C09E getFMessage() {
        return (C09E) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_document_left;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_document_right;
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C09E);
        super.setFMessage(anonymousClass092);
    }
}
