package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.io.File;

/* renamed from: X.2XI */
/* loaded from: classes2.dex */
public class C2XI extends C2XJ {
    public C012005w A00;
    public C42441vk A01;
    public C42471vn A02;
    public boolean A03;
    public final View A04;
    public final View A05;
    public final FrameLayout A06;
    public final FrameLayout A07;
    public final ImageView A08;
    public final ImageView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final CircularProgressBar A0C;
    public final TextEmojiLabel A0D;
    public final ConversationRowVideo$RowVideoView A0E;
    public final InterfaceC43821y3 A0F;
    public final AbstractView$OnClickListenerC49532Ky A0G;
    public final boolean A0H;

    public C2XI(Context context, C0JP c0jp) {
        super(context, c0jp);
        this.A0F = new InterfaceC43821y3() { // from class: X.38k
            {
                C2XI.this = this;
            }

            @Override // X.InterfaceC43821y3
            public int ADA() {
                C2XI c2xi = C2XI.this;
                if (c2xi.A0H) {
                    return c2xi.A0E.A06.A02();
                }
                return (C2JE.A01(c2xi.getContext()) * 72) / 100;
            }

            @Override // X.InterfaceC43821y3
            public void AKM() {
                C2XI.this.A0m();
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                if (bitmap != null) {
                    C2XI c2xi = C2XI.this;
                    C2XI.setThumbnail(c2xi, new BitmapDrawable(c2xi.getContext().getResources(), bitmap));
                    c2xi.A0E.A01(bitmap.getWidth(), bitmap.getHeight(), false);
                    return;
                }
                C2XI c2xi2 = C2XI.this;
                c2xi2.A03 = false;
                C2XI.setThumbnail(c2xi2, new ColorDrawable(C02160Ac.A00(c2xi2.getContext(), R.color.dark_gray)));
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                C2XI c2xi = C2XI.this;
                c2xi.A03 = false;
                C2XI.setThumbnail(c2xi, new ColorDrawable(-7829368));
            }
        };
        this.A0G = new ViewOnClickCListenerShape9S0100000_I0_1(this, 8);
        this.A0H = this.A0m.A0C(400);
        this.A0A = (TextView) findViewById(R.id.control_btn);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = (ConversationRowVideo$RowVideoView) C0AT.A0D(this, R.id.thumb);
        this.A0E = conversationRowVideo$RowVideoView;
        conversationRowVideo$RowVideoView.A09 = this.A0H;
        this.A0C = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A0B = (TextView) findViewById(R.id.info);
        this.A07 = (FrameLayout) findViewById(R.id.play_frame);
        this.A09 = (ImageView) findViewById(R.id.play_button);
        this.A08 = (ImageView) findViewById(R.id.cancel_btn);
        this.A06 = (FrameLayout) findViewById(R.id.invisible_press_surface);
        this.A04 = findViewById(R.id.control_frame);
        this.A05 = findViewById(R.id.text_and_date);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.caption);
        this.A0D = textEmojiLabel;
        if (textEmojiLabel != null) {
            C000200d.A0b(textEmojiLabel);
        }
        this.A0C.setMax(100);
        CircularProgressBar circularProgressBar = this.A0C;
        circularProgressBar.A0B = 0;
        circularProgressBar.A06 = 6.0f;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_row_video_corner_progressbar_padding);
        this.A0C.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        A00(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00(boolean r24) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2XI.A00(boolean):void");
    }

    @Override // X.AbstractC48202Eh
    public boolean A07() {
        return C0DB.A0K(((AbstractC48182Ef) this).A0K, super.getFMessage());
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public int A0C(int i) {
        if (!TextUtils.isEmpty(super.getFMessage().A1A())) {
            return super.A0C(i);
        }
        if (C0D6.A00(i, 13) >= 0) {
            return R.drawable.message_got_read_receipt_from_target_onmedia;
        }
        if (C0D6.A00(i, 5) >= 0) {
            return R.drawable.message_got_receipt_from_target_onmedia;
        }
        return C0D6.A00(i, 4) == 0 ? R.drawable.message_got_receipt_from_server_onmedia : R.drawable.message_unsent_onmedia;
    }

    @Override // X.AbstractC48182Ef
    public int A0D(int i) {
        if (TextUtils.isEmpty(super.getFMessage().A1A())) {
            return 0;
        }
        return super.A0D(i);
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A00(false);
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0J() {
        AnonymousClass097 fMessage = super.getFMessage();
        this.A03 = true;
        C42471vn c42471vn = this.A02;
        if (c42471vn != null) {
            c42471vn.A0A(fMessage, this.A0E, this.A0F, fMessage.A0n, false);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48182Ef
    public void A0M() {
        int A00;
        CircularProgressBar circularProgressBar = this.A0C;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A00;
    }

    @Override // X.AbstractC48182Ef
    public void A0N() {
        String str;
        if (((C2JE) this).A02 == null || RequestPermissionActivity.A0Q(getContext(), ((C2JE) this).A02)) {
            AnonymousClass097 fMessage = super.getFMessage();
            C09H c09h = fMessage.A02;
            if (c09h != null) {
                if (c09h.A07 == 1) {
                    ((AbstractC48182Ef) this).A0G.A05(R.string.gallery_unsafe_video_removed, 1);
                    return;
                }
                C43221x3 A00 = this.A01.A00(c09h);
                AnonymousClass094 anonymousClass094 = fMessage.A0n;
                boolean z = anonymousClass094.A02;
                if (!z && c09h.A0a && A00 != null && A00.A0g != null) {
                    A0n();
                    return;
                }
                boolean z2 = c09h.A0P;
                if (z) {
                    if (!z2 && !c09h.A0O && ((str = c09h.A0H) != null || (c09h.A0D >= 0 && c09h.A0E > 0))) {
                        if (c09h.A0D > 0 && c09h.A0E > 0) {
                            ((AbstractC48182Ef) this).A0G.A05(R.string.cannot_play_video_wait_until_processed, 1);
                            return;
                        } else if (C0DD.A0F(this.A00, str).exists()) {
                            ((AbstractC48182Ef) this).A0G.A05(R.string.cannot_play_video_wait_until_processed, 1);
                            return;
                        }
                    }
                } else if (!z2) {
                    return;
                }
                File file = c09h.A0F;
                boolean exists = file != null ? new File(Uri.fromFile(file).getPath()).exists() : false;
                StringBuilder A0P = C000200d.A0P("viewmessage/ from_me:");
                A0P.append(z);
                A0P.append(" type:");
                A0P.append((int) fMessage.A0m);
                A0P.append(" name:");
                A0P.append(fMessage.A08);
                A0P.append(" url:");
                A0P.append(C40841sx.A0N(fMessage.A09));
                A0P.append(" file:");
                A0P.append(c09h.A0F);
                A0P.append(" progress:");
                A0P.append(c09h.A0C);
                A0P.append(" transferred:");
                A0P.append(c09h.A0P);
                A0P.append(" transferring:");
                A0P.append(c09h.A0a);
                A0P.append(" fileSize:");
                A0P.append(c09h.A0A);
                A0P.append(" media_size:");
                A0P.append(fMessage.A01);
                A0P.append(" timestamp:");
                C000200d.A1I(A0P, fMessage.A0E);
                if (!exists) {
                    Log.w("viewmessage/ no file");
                    if (A0m()) {
                        return;
                    }
                    if (((AbstractC48202Eh) this).A0X instanceof C68313Ja) {
                        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) C02180Ae.A0G(getContext(), ActivityC02290Ap.class);
                        if (activityC02290Ap != null) {
                            ((AbstractC48202Eh) this).A0M.A03(activityC02290Ap);
                            return;
                        }
                        return;
                    }
                    Intent intent = new Intent(getContext(), MediaGalleryActivity.class);
                    intent.putExtra("pos", -1);
                    intent.putExtra("alert", true);
                    intent.putExtra("jid", C003101m.A07(anonymousClass094.A00));
                    intent.putExtra("key", anonymousClass094.hashCode());
                    getContext().startActivity(intent);
                    return;
                }
                A0n();
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A00(z2);
        }
    }

    public final void A0n() {
        boolean z = ((AbstractC48202Eh) this).A0X instanceof C68313Ja;
        int i = z ? 3 : 1;
        AnonymousClass097 fMessage = super.getFMessage();
        AnonymousClass317 A09 = C40841sx.A09(getContext());
        A09.A07 = z;
        AnonymousClass094 anonymousClass094 = fMessage.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            A09.A03 = abstractC005302j;
            A09.A04 = anonymousClass094;
            A09.A01 = i;
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0E;
            A09.A02 = conversationRowVideo$RowVideoView;
            A09.A06 = C02180Ae.A0G(getContext(), Conversation.class) != null;
            C2HC.A06(getContext(), new C1M7(getContext()), A09.A00(), conversationRowVideo$RowVideoView, C000200d.A0H("thumb-transition-", anonymousClass094.toString()));
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48182Ef
    public int getBroadcastDrawableId() {
        return TextUtils.isEmpty(super.getFMessage().A1A()) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_video_left;
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
    public C0JP getFMessage() {
        return (C0JP) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_video_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        if (this.A0H) {
            return this.A0E.A06.A02();
        }
        return (C2JE.A01(getContext()) * 72) / 100;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_video_right;
    }

    @Override // X.AbstractC48182Ef
    public Drawable getStarDrawable() {
        return TextUtils.isEmpty(super.getFMessage().A1A()) ? C02160Ac.A03(getContext(), R.drawable.message_star_media) : super.getStarDrawable();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0JP);
        super.setFMessage(anonymousClass092);
    }

    public static void setThumbnail(C2XI c2xi, Drawable drawable) {
        c2xi.A0E.setImageDrawable(drawable);
    }
}
