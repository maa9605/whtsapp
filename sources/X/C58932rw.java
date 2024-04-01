package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.2rw */
/* loaded from: classes2.dex */
public class C58932rw {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ProgressBar A06;
    public final C03230Ew A07;
    public final ThumbnailButton A08;
    public final C58772rg A09;
    public final WebPagePreviewView A0A;
    public final C0WZ A0B;
    public final C42471vn A0C;

    public C58932rw(Context context, C03230Ew c03230Ew, C0WZ c0wz, C42471vn c42471vn, C58772rg c58772rg) {
        this.A00 = context;
        this.A07 = c03230Ew;
        this.A0B = c0wz;
        this.A0C = c42471vn;
        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context);
        this.A0A = webPagePreviewView;
        this.A06 = (ProgressBar) webPagePreviewView.findViewById(R.id.large_progress);
        this.A01 = this.A0A.findViewById(R.id.play_frame);
        this.A02 = this.A0A.findViewById(R.id.inline_indication);
        this.A05 = (ImageView) this.A0A.findViewById(R.id.logo_button);
        this.A04 = (ImageView) this.A0A.findViewById(R.id.large_thumb);
        this.A08 = (ThumbnailButton) this.A0A.findViewById(R.id.thumb);
        this.A03 = (FrameLayout) this.A0A.findViewById(R.id.large_thumb_frame);
        this.A09 = c58772rg;
    }

    public final void A00(float f, float f2, float f3) {
        this.A06.setAlpha(f);
        this.A01.setAlpha(f2);
        this.A05.setAlpha(f2);
        this.A02.setAlpha(f3);
    }

    public void A01(AnonymousClass092 anonymousClass092, boolean z, AbstractC48182Ef abstractC48182Ef, C3TK c3tk) {
        A02(anonymousClass092, z, abstractC48182Ef, c3tk);
        if (anonymousClass092.A14(1024)) {
            C58772rg c58772rg = this.A09;
            WebPagePreviewView webPagePreviewView = this.A0A;
            ArrayList ACy = abstractC48182Ef.getRowsContainer() == null ? null : abstractC48182Ef.getRowsContainer().ACy();
            AnonymousClass387 anonymousClass387 = new AnonymousClass387(this, anonymousClass092, z, abstractC48182Ef, c3tk);
            if (c58772rg != null) {
                C0CZ c0cz = anonymousClass092.A0H;
                if (c0cz != null) {
                    C38D c38d = new C38D(c0cz);
                    c38d.A01 = z;
                    webPagePreviewView.setTag(new C58762rf(anonymousClass092, c38d));
                    webPagePreviewView.A01(c38d, ACy);
                    if (c0cz.A07 != null && c0cz.A00 == null) {
                        Set set = c58772rg.A04;
                        String str = anonymousClass092.A0n.A01;
                        if (!set.contains(str)) {
                            set.add(str);
                            c58772rg.A03.AS3(new RunnableEBaseShape1S0500000_I1(c58772rg, webPagePreviewView, c38d, anonymousClass092, anonymousClass387), str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        } else if (!(anonymousClass092 instanceof C0JJ)) {
        } else {
            WebPagePreviewView webPagePreviewView2 = this.A0A;
            C0JJ c0jj = (C0JJ) anonymousClass092;
            ArrayList ACy2 = abstractC48182Ef.getRowsContainer() == null ? null : abstractC48182Ef.getRowsContainer().ACy();
            if (webPagePreviewView2 != null) {
                String str2 = c3tk.A01;
                String str3 = c3tk.A02;
                webPagePreviewView2.A02(c0jj, str2, str3, str3, ACy2, z);
                return;
            }
            throw null;
        }
    }

    public final void A02(final AnonymousClass092 anonymousClass092, boolean z, AbstractC48182Ef abstractC48182Ef, final C3TK c3tk) {
        WebPagePreviewView webPagePreviewView;
        byte[] A1D;
        AnonymousClass094 anonymousClass094;
        Drawable A0L;
        Set A01 = this.A0B.A01(anonymousClass092, c3tk.A02, anonymousClass092.A0B());
        if (A01 != null) {
            WebPagePreviewView webPagePreviewView2 = this.A0A;
            webPagePreviewView = webPagePreviewView2;
            webPagePreviewView2.setLargeThumbFrameVisibility(false);
            ImageView imageView = ((AbstractC48202Eh) abstractC48182Ef).A0E;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            webPagePreviewView2.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(this, c3tk, A01, 0));
        } else if (Build.VERSION.SDK_INT >= 19 && z) {
            ProgressBar progressBar = this.A06;
            progressBar.animate().cancel();
            View view = this.A01;
            view.animate().cancel();
            View view2 = this.A02;
            view2.animate().cancel();
            progressBar.setAlpha(0.0f);
            view.setAlpha(1.0f);
            webPagePreviewView = this.A0A;
            webPagePreviewView.setLargeThumbFrameVisibility(true);
            this.A08.setVisibility(8);
            view2.setAlpha(0.0f);
            ImageView imageView2 = this.A05;
            imageView2.setAlpha(0.0f);
            int i = c3tk.A00;
            if (i != 1 && i != 7) {
                imageView2.animate().cancel();
                imageView2.setVisibility(0);
                imageView2.setImageResource(C72973at.A00(i));
                imageView2.setAlpha(1.0f);
            } else {
                imageView2.setVisibility(8);
            }
            final C657838n c657838n = new C657838n(this, anonymousClass092);
            Context context = this.A00;
            C73053b1 c73053b1 = ((Conversation) C018308n.A01(context, Conversation.class)).A3h;
            if (c73053b1 != null && (anonymousClass094 = c73053b1.A09) != null && anonymousClass094.equals(anonymousClass092.A0n)) {
                c73053b1.A08 = c657838n;
                int i2 = c73053b1.A01;
                if (i2 == 0) {
                    A00(1.0f, 0.0f, 0.0f);
                } else if (i2 == 1) {
                    A00(0.0f, 1.0f, 1.0f);
                } else if (i2 == 2) {
                    A00(0.0f, 1.0f, 0.0f);
                }
            }
            final Bitmap[] bitmapArr = new Bitmap[1];
            webPagePreviewView.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.38l
                {
                    C58932rw.this = this;
                }

                @Override // X.AbstractView$OnClickListenerC49532Ky
                public void A00(View view3) {
                    final Conversation conversation = (Conversation) C018308n.A01(C58932rw.this.A00, Conversation.class);
                    C3TK c3tk2 = c3tk;
                    final String str = c3tk2.A02;
                    final String str2 = c3tk2.A01;
                    final AnonymousClass094 anonymousClass0942 = anonymousClass092.A0n;
                    final C657838n c657838n2 = c657838n;
                    final int i3 = c3tk2.A00;
                    final Bitmap[] bitmapArr2 = bitmapArr;
                    Log.i(String.format("conversation/initInlinePlayback rowKey:%s fullUrl:%s canonicalUrl:%s", anonymousClass0942, str, str2));
                    C73453bf c73453bf = conversation.A3m;
                    if (c73453bf != null && c73453bf.A0S()) {
                        c73453bf.A01();
                    }
                    C73053b1 c73053b12 = conversation.A3h;
                    if (c73053b12 != null && conversation.A3g != null) {
                        c73053b12.A08(str, str2, anonymousClass0942, c657838n2, i3, bitmapArr2);
                        return;
                    }
                    conversation.A0Q = (AccessibilityManager) conversation.getSystemService("accessibility");
                    ConversationListView conversationListView = (ConversationListView) conversation.findViewById(16908298);
                    ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = new ScaleGestureDetector$OnScaleGestureListenerC54382ie(conversation, conversationListView);
                    conversation.A3g = scaleGestureDetector$OnScaleGestureListenerC54382ie;
                    scaleGestureDetector$OnScaleGestureListenerC54382ie.setChildPadding(conversation.getResources().getDimensionPixelSize(R.dimen.inline_video_player_padding));
                    C09750eh c09750eh = new C09750eh(conversation);
                    C54172iE c54172iE = conversationListView.A00;
                    synchronized (c54172iE.A00) {
                        c54172iE.A00.add(c09750eh);
                    }
                    final C34281hG c34281hG = new C34281hG(conversation);
                    conversation.A3g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1KA
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
                            Conversation conversation2 = conversation;
                            conversation2.A3g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            conversation2.A3g.setVisibility(0);
                            C73053b1 c73053b13 = new C73053b1(conversation2.A1o, conversation2, conversation2.A0s, conversation2.A2J, conversation2.A0n, conversation2.A0k, conversation2.A3e, conversation2.A2M, conversation2.A0x, conversation2.A0f, conversation2.A1l, conversation2.A1s, conversation2.A3g, c34281hG, conversation2.A0Q);
                            conversation2.A3h = c73053b13;
                            c73053b13.A08(str, str2, anonymousClass0942, c657838n2, i3, bitmapArr2);
                        }
                    });
                    ((ViewGroup) conversation.getWindow().getDecorView()).addView(conversation.A3g, new ViewGroup.LayoutParams(-1, -1));
                }
            });
            final int A012 = (((C2JE.A01(context) * 72) / 100) - webPagePreviewView.getPaddingLeft()) - webPagePreviewView.getPaddingRight();
            float f = 0.5625f;
            if (c3tk.A00 != 4) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C0CZ c0cz = anonymousClass092.A0H;
                if (c0cz != null) {
                    A1D = c0cz.A00;
                    if (A1D == null) {
                        A1D = c0cz.A09;
                    }
                } else {
                    A1D = anonymousClass092 instanceof C0JJ ? ((C0JJ) anonymousClass092).A1D() : new byte[0];
                }
                BitmapFactory.decodeByteArray(A1D, 0, A1D.length, options);
                float f2 = options.outWidth / options.outHeight;
                if (f2 < 1.0f) {
                    f = Math.max(f2, 0.5625f);
                } else {
                    f = Math.min(f2, 1.0f);
                }
            }
            this.A03.getLayoutParams().height = (int) (A012 * f);
            InterfaceC43821y3 interfaceC43821y3 = new InterfaceC43821y3() { // from class: X.38m
                @Override // X.InterfaceC43821y3
                public void AKM() {
                }

                {
                    C58932rw.this = this;
                }

                @Override // X.InterfaceC43821y3
                public int ADA() {
                    return A012;
                }

                @Override // X.InterfaceC43821y3
                public void AUc(View view3, Bitmap bitmap, AnonymousClass092 anonymousClass0922) {
                    ImageView imageView3 = C58932rw.this.A04;
                    if (bitmap != null) {
                        imageView3.setImageBitmap(bitmap);
                        bitmapArr[0] = bitmap;
                        return;
                    }
                    imageView3.setBackgroundColor(C02160Ac.A00(imageView3.getContext(), R.color.primary_surface));
                    imageView3.setImageDrawable(null);
                }

                @Override // X.InterfaceC43821y3
                public void AUo(View view3) {
                    C58932rw.this.A04.setBackgroundColor(-7829368);
                }
            };
            C0CZ c0cz2 = anonymousClass092.A0H;
            if (c0cz2 != null) {
                C42471vn c42471vn = this.A0C;
                ImageView imageView3 = this.A04;
                if (c42471vn != null) {
                    imageView3.setTag(c0cz2.A07);
                    synchronized (c42471vn) {
                        if (AnonymousClass024.A0c()) {
                            c42471vn.A07();
                        }
                        C0CZ c0cz3 = anonymousClass092.A0H;
                        if (c0cz3 != null) {
                            byte[] bArr = c0cz3.A00;
                            String str = c0cz3.A03;
                            if (bArr == null) {
                                bArr = c0cz3.A09;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append("_micro");
                                str = sb.toString();
                            }
                            Bitmap A06 = c42471vn.A06(str);
                            if (A06 == null) {
                                A06 = c42471vn.A05(anonymousClass092, true, false, bArr);
                                c42471vn.A0E(str, A06);
                            }
                            interfaceC43821y3.AUc(imageView3, A06, anonymousClass092);
                        }
                    }
                } else {
                    throw null;
                }
            } else if (anonymousClass092 instanceof C0JJ) {
                this.A0C.A0C(anonymousClass092, this.A04, interfaceC43821y3, false);
            }
        } else {
            webPagePreviewView = this.A0A;
            webPagePreviewView.setLargeThumbFrameVisibility(false);
            this.A08.setVisibility(0);
            webPagePreviewView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c3tk, 8));
        }
        FrameLayout frameLayout = (FrameLayout) webPagePreviewView.findViewById(R.id.link_preview_frame);
        if (anonymousClass092.A0n.A02) {
            A0L = C02180Ae.A0M(this.A00);
        } else {
            A0L = C02180Ae.A0L(this.A00);
        }
        frameLayout.setForeground(A0L);
    }
}
