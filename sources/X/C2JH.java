package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import java.util.Arrays;

/* renamed from: X.2JH */
/* loaded from: classes2.dex */
public abstract class C2JH extends C2JE {
    public int A00;
    public final View A01;
    public final WaTextView A02;
    public final ViewOnceDownloadProgressView A03;

    public int getDateCompensationMarginSize() {
        return 0;
    }

    public C2JH(Context context, AnonymousClass097 anonymousClass097) {
        super(context, anonymousClass097);
        this.A00 = 0;
        this.A01 = C0AT.A0D(this, R.id.view_once_media_container_small);
        this.A02 = (WaTextView) C0AT.A0D(this, R.id.view_once_media_type_small);
        this.A03 = (ViewOnceDownloadProgressView) C0AT.A0D(this, R.id.view_once_download_small);
    }

    public static void A00(ViewOnceDownloadProgressView viewOnceDownloadProgressView, AnonymousClass097 anonymousClass097, int i, boolean z) {
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (z) {
                    viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_one, R.drawable.ic_ephemeral_ring, R.color.view_once_media_type);
                } else {
                    viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_one, R.drawable.ic_ephemeral_ring, R.color.view_once_media_type);
                }
            } else if (i == 3) {
                viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_retry, -1, R.color.green_circle_background);
            } else if (z) {
                viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_one, R.drawable.ic_ephemeral_ring, R.color.view_once_media_type);
            } else {
                viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_download, R.drawable.ic_ephemeral_ring, R.color.view_once_media_type);
            }
        } else {
            viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_cancel, -1, R.color.view_once_media_type);
        }
        C41771uU c41771uU = viewOnceDownloadProgressView.A02;
        if (c41771uU != null) {
            C23X.A02(c41771uU, viewOnceDownloadProgressView.A00, anonymousClass097);
        }
        viewOnceDownloadProgressView.setVisibility(0);
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0e(false);
        A0n();
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0n();
        }
    }

    public void A0n() {
        C2JG c2jg = (C2JG) this;
        int ADw = ((C09C) c2jg.getFMessage()).ADw();
        if (ADw == 0) {
            AnonymousClass097 fMessage = c2jg.getFMessage();
            int A01 = C0DB.A01(fMessage);
            A00(((C2JH) c2jg).A03, fMessage, A01, true);
            View view = ((C2JH) c2jg).A01;
            c2jg.A0r(view, A01, true);
            if (A01 == 2) {
                view.setOnClickListener(c2jg.A02);
                view.setOnLongClickListener(c2jg.A19);
            }
            c2jg.A0o();
            WaTextView waTextView = ((C2JH) c2jg).A02;
            waTextView.setTextColor(c2jg.getResources().getColor(R.color.view_once_media_type));
            waTextView.setTypeface(Typeface.DEFAULT, 0);
        } else if (ADw == 1) {
            c2jg.A0p();
            ((C2JH) c2jg).A02.setText(c2jg.getContext().getString(R.string.view_once_opened));
            View view2 = ((C2JH) c2jg).A01;
            view2.setOnClickListener(c2jg.A02);
            view2.setOnLongClickListener(c2jg.A19);
        } else if (ADw == 2) {
            c2jg.A0p();
            ((C2JH) c2jg).A02.setText(c2jg.getContext().getString(R.string.view_once_expired));
            View view3 = ((C2JH) c2jg).A01;
            view3.setOnClickListener(c2jg.A02);
            view3.setOnLongClickListener(c2jg.A19);
        }
    }

    public void A0o() {
        if (this.A00 == 0) {
            A0q();
        }
        this.A02.setWidth(getDateCompensationMarginSize() + this.A00);
    }

    public final void A0p() {
        this.A03.A00(R.drawable.ic_ephemeral_ring, -1, R.color.view_once_viewed);
        WaTextView waTextView = this.A02;
        waTextView.setTextColor(getResources().getColor(R.color.view_once_viewed));
        waTextView.setTypeface(Typeface.DEFAULT, 2);
        A0o();
        this.A01.setVisibility(0);
    }

    public final void A0q() {
        for (Number number : Arrays.asList(Integer.valueOf((int) R.string.retry), Integer.valueOf((int) R.string.view_once_photo), Integer.valueOf((int) R.string.view_once_video), Integer.valueOf((int) R.string.view_once_expired), Integer.valueOf((int) R.string.view_once_opened))) {
            String string = getContext().getString(number.intValue());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new C10200fS(getContext()), 0, string.length(), 0);
            this.A00 = Math.max(this.A00, (int) Layout.getDesiredWidth(spannableStringBuilder, this.A02.getPaint()));
        }
    }

    public void A0r(View view, int i, boolean z) {
        AnonymousClass088.A1T(view);
        C0AT.A0V(view, 1);
        if (i == 0) {
            view.setContentDescription(getContext().getString(R.string.tb_button_uploading));
            view.setOnClickListener(((C2JE) this).A09);
            AnonymousClass088.A1V(view, R.string.cancel);
        } else if (i == 1) {
            view.setContentDescription(getContext().getString(R.string.tb_button_downloading));
            view.setOnClickListener(((C2JE) this).A09);
            AnonymousClass088.A1V(view, R.string.cancel);
        } else if (i != 2) {
            if (i == 3) {
                view.setContentDescription(getContext().getString(R.string.retry));
                view.setOnClickListener(((C2JE) this).A0B);
                AnonymousClass088.A1V(view, R.string.retry);
            } else if (i == 4) {
                view.setContentDescription(getContext().getString(getMediaTypeString()));
                view.setOnClickListener(((C2JE) this).A0A);
                AnonymousClass088.A1V(view, R.string.button_download);
            } else if (i == 5) {
                if (z) {
                    view.setOnClickListener(null);
                    C0AT.A0V(view, 2);
                } else {
                    view.setContentDescription(getContext().getString(getMediaTypeString()));
                    view.setOnClickListener(((C2JE) this).A0A);
                    AnonymousClass088.A1V(view, R.string.button_download);
                }
            }
        } else if (z) {
            view.setOnClickListener(null);
            C0AT.A0V(view, 2);
        } else {
            view.setContentDescription(getContext().getString(getMediaTypeString()));
            view.setOnClickListener(((C2JE) this).A0C);
            AnonymousClass088.A1V(view, R.string.view);
        }
        if (!(this instanceof C2JG)) {
            C2XO c2xo = (C2XO) this;
            WaTextView waTextView = c2xo.A03;
            Context context = c2xo.getContext();
            String string = c2xo.getContext().getString(c2xo.getMediaTypeString());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new C10200fS(context), 0, string.length(), 0);
            waTextView.setText(spannableStringBuilder);
        } else if (i == 3) {
            WaTextView waTextView2 = this.A02;
            Context context2 = getContext();
            String string2 = getContext().getString(R.string.retry);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
            spannableStringBuilder2.setSpan(new C10200fS(context2), 0, string2.length(), 0);
            waTextView2.setText(spannableStringBuilder2);
        } else {
            this.A02.setText(getContext().getString(getMediaTypeString()));
        }
        view.setVisibility(0);
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_view_once_media_left;
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_view_once_media_left;
    }

    public int getMediaTypeString() {
        if (getFMessage() instanceof C09A) {
            return R.string.view_once_video;
        }
        return R.string.view_once_photo;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_view_once_media_right;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0q();
        A0o();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof AnonymousClass097);
        super.setFMessage(anonymousClass092);
    }
}
