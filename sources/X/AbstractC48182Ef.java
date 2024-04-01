package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.preference.WaFontListPreference;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Ef */
/* loaded from: classes2.dex */
public abstract class AbstractC48182Ef extends AbstractC48192Eg {
    public static float A1K;
    public static float A1L;
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public FrameLayout A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public C0AS A0D;
    public C018308n A0E;
    public AbstractC000600i A0F;
    public C018508q A0G;
    public C03230Ew A0H;
    public C02L A0I;
    public C03010Du A0J;
    public C01B A0K;
    public TextEmojiLabel A0L;
    public TextEmojiLabel A0M;
    public C018608r A0N;
    public C49462Ko A0O;
    public AnonymousClass272 A0P;
    public C40261rr A0Q;
    public C05W A0R;
    public AnonymousClass075 A0S;
    public C018708s A0T;
    public C3JS A0U;
    public C2MM A0V;
    public C02E A0W;
    public AnonymousClass012 A0X;
    public C000500h A0Y;
    public C0DK A0Z;
    public C0C9 A0a;
    public AnonymousClass078 A0b;
    public C0C8 A0c;
    public C0GU A0d;
    public C0H4 A0e;
    public C0WZ A0f;
    public AnonymousClass074 A0g;
    public C0EA A0h;
    public C0EB A0i;
    public C00B A0j;
    public C40421sE A0k;
    public C40081rY A0l;
    public C003701t A0m;
    public C0HA A0n;
    public AnonymousClass011 A0o;
    public C0ES A0p;
    public C41491u0 A0q;
    public C02980Dr A0r;
    public C009905a A0s;
    public C2MY A0t;
    public C0DW A0u;
    public C0DV A0v;
    public C2MO A0w;
    public C02O A0x;
    public C2AR A0y;
    public C43791xz A0z;
    public C40071rX A10;
    public C42471vn A11;
    public InterfaceC002901k A12;
    public C2IY A13;
    public Runnable A14;
    public Runnable A15;
    public boolean A16;
    public final View.OnClickListener A17;
    public final View.OnKeyListener A18;
    public final View.OnLongClickListener A19;
    public final View.OnTouchListener A1A;
    public final View A1B;
    public final ViewGroup A1C;
    public final ImageView A1D;
    public final TextView A1E;
    public final C655937u A1F;
    public final C656037v A1G;
    public final C656237x A1H;
    public final C54192iG A1I;
    public final Runnable A1J;

    public void A0N() {
    }

    public void A0W(AbstractC005302j abstractC005302j) {
    }

    public int getMessageCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
        if (r2 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC48182Ef(android.content.Context r12, X.AnonymousClass092 r13) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48182Ef.<init>(android.content.Context, X.092):void");
    }

    public static float A03(Resources resources) {
        float f = A1K;
        if (f == 0.0f) {
            f = resources.getDimension(R.dimen.conversation_divider_row_tv) / resources.getDisplayMetrics().scaledDensity;
            A1K = f;
        }
        int i = 0;
        int i2 = WaFontListPreference.A00;
        if (i2 == -1) {
            i = -2;
        } else if (i2 == 1) {
            i = 4;
        }
        return f + i;
    }

    public static float A04(Resources resources, C002301c c002301c) {
        return (A05(resources, c002301c, WaFontListPreference.A00) * 24.0f) / 27.0f;
    }

    public static float A05(Resources resources, C002301c c002301c, int i) {
        if (A1L == 0.0f) {
            A1L = resources.getDimension(R.dimen.conversation_text_row_tv) / resources.getDisplayMetrics().scaledDensity;
        }
        int i2 = 0;
        if (i == -1) {
            i2 = -2;
        } else if (i == 1) {
            i2 = 4;
        }
        if (c002301c.A04().equals("ar") || c002301c.A04().equals("fa")) {
            i2++;
        }
        return A1L + i2;
    }

    public static void A06(AbstractC48182Ef abstractC48182Ef, AnonymousClass092 anonymousClass092) {
        if (abstractC48182Ef != null) {
            if (anonymousClass092.A08 == 7) {
                anonymousClass092.A0Q();
                abstractC48182Ef.A0a.A0T(anonymousClass092);
            }
            byte b = anonymousClass092.A0m;
            if (!C0DB.A0C(b) && !C0DB.A0E(b)) {
                abstractC48182Ef.A0N.A0S(anonymousClass092);
                return;
            } else {
                abstractC48182Ef.A0J.A04((AnonymousClass097) anonymousClass092);
                return;
            }
        }
        throw null;
    }

    public int A0C(int i) {
        if (C0D6.A00(i, 13) >= 0) {
            return R.drawable.message_got_receipt_from_target;
        }
        if (C0D6.A00(i, 5) >= 0) {
            return R.drawable.message_got_receipt_from_target;
        }
        return C0D6.A00(i, 4) == 0 ? R.drawable.message_got_receipt_from_server : R.drawable.message_unsent;
    }

    public int A0D(int i) {
        return C0D6.A00(i, 13) >= 0 ? R.color.msgStatusReadTint : R.color.msgStatusTint;
    }

    public Conversation A0E() {
        return (Conversation) C02180Ae.A0G(getContext(), Conversation.class);
    }

    public C58772rg A0F() {
        return new C58772rg(this.A0m, this.A0G, this.A12, this.A0b);
    }

    public CharSequence A0G(CharSequence charSequence) {
        InterfaceC04690Ll rowsContainer;
        ArrayList ACy;
        return (TextUtils.isEmpty(charSequence) || (rowsContainer = getRowsContainer()) == null || (ACy = rowsContainer.ACy()) == null || ACy.isEmpty()) ? charSequence : AbstractC54772jK.A03(getContext(), charSequence, ACy, AbstractC54772jK.A01, super.A0J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0011, code lost:
        if (r1 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0H() {
        /*
            r2 = this;
            boolean r0 = r2.A0f()
            if (r0 == 0) goto L23
            X.0Ll r0 = r2.getRowsContainer()
            if (r0 == 0) goto L13
            boolean r1 = r0.AEZ()
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L23
            X.0Ll r1 = r2.getRowsContainer()
            if (r1 == 0) goto L23
            X.092 r0 = r2.getFMessage()
            r1.AV2(r0)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48182Ef.A0H():void");
    }

    public void A0I() {
        A0e(false);
    }

    public void A0J() {
        if (this instanceof C2X7) {
            C58892rs c58892rs = ((C2X7) this).A06;
            if (c58892rs != null) {
                c58892rs.A07 = true;
                C42471vn c42471vn = c58892rs.A0O;
                if (c42471vn != null) {
                    AnonymousClass097 anonymousClass097 = c58892rs.A03;
                    c42471vn.A0A(anonymousClass097, c58892rs.A0M, c58892rs.A0N, anonymousClass097.A0n, false);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    public void A0K() {
        UserJid A01;
        AnonymousClass092 fMessage = getFMessage();
        C0DB.A08(fMessage);
        Conversation A0E = A0E();
        if (A0E != null) {
            if (C0DB.A0U(fMessage)) {
                A01 = ((C04370Jx) fMessage).A00;
            } else {
                AnonymousClass094 anonymousClass094 = fMessage.A0n;
                if (C003101m.A0U(anonymousClass094.A00) && (!anonymousClass094.A02 || fMessage.A08 == 6)) {
                    A01 = C0ES.A01(fMessage);
                }
                StringBuilder A0P = C000200d.A0P("conversation/getdialogitems/remote_resource is null! ");
                A0P.append(C0DB.A08(fMessage));
                Log.i(A0P.toString());
            }
            if (A01 != null) {
                ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment = new ConversationRow$ConversationRowDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("jid", A01.getRawString());
                conversationRow$ConversationRowDialogFragment.A0P(bundle);
                A0E.AUg(conversationRow$ConversationRowDialogFragment, null);
                return;
            }
            StringBuilder A0P2 = C000200d.A0P("conversation/getdialogitems/remote_resource is null! ");
            A0P2.append(C0DB.A08(fMessage));
            Log.i(A0P2.toString());
        }
    }

    public void A0L() {
        InterfaceC04690Ll rowsContainer;
        if (!A0f() || (rowsContainer = getRowsContainer()) == null) {
            return;
        }
        this.A0U.setRowSelected(rowsContainer.AVe(getFMessage()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0104, code lost:
        if (r2 == 100) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0M() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48182Ef.A0M():void");
    }

    public final void A0O() {
        Handler handler = getHandler();
        if (handler == null) {
            Runnable runnable = this.A1J;
            removeCallbacks(runnable);
            post(runnable);
            return;
        }
        Runnable runnable2 = this.A1J;
        if (handler.hasMessages(0, runnable2)) {
            return;
        }
        Message obtain = Message.obtain(handler, runnable2);
        obtain.what = 0;
        obtain.obj = runnable2;
        obtain.sendToTarget();
    }

    public final void A0P() {
        View view = super.A0D;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        C3JS c3js = new C3JS(this, getContext());
        this.A0U = c3js;
        super.A0D = c3js;
        c3js.setClickable(true);
        super.A0D.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 12));
        setClipToPadding(false);
        addView(super.A0D, new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A0Q(int i) {
        AnonymousClass092 fMessage = getFMessage();
        ((AbstractC48202Eh) this).A01 = i;
        View view = this.A1B;
        if (view != null) {
            AnonymousClass094 anonymousClass094 = fMessage.A0n;
            if (!anonymousClass094.A02 && C003101m.A0U(anonymousClass094.A00)) {
                if (i > 1 && fMessage.A0B == 0 && fMessage.A0m == 0 && !C0DB.A0c(fMessage) && !A0g()) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            } else {
                view.setVisibility(8);
            }
        }
        boolean z = fMessage.A0n.A02;
        int i2 = (z ? AbstractC48202Eh.A0d : AbstractC48202Eh.A0c).top;
        int i3 = (z ? AbstractC48202Eh.A0d : AbstractC48202Eh.A0c).bottom;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i4 = (int) ((getContext().getResources().getDisplayMetrics().density * 4.0f) / 3.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.normal_bubble_vertical_margin);
        int i5 = ((AbstractC48202Eh) this).A01;
        if (i5 == 1) {
            setPadding(paddingLeft, dimensionPixelSize + i2, paddingRight, i4);
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height_collapse_body));
        } else if (i5 == 2) {
            setPadding(paddingLeft, i4, paddingRight, i4);
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height_collapse_body));
        } else if (i5 != 3) {
            setPadding(paddingLeft, i2 + dimensionPixelSize, paddingRight, dimensionPixelSize + i3);
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height));
        } else {
            setPadding(paddingLeft, i4, paddingRight, dimensionPixelSize + i3);
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height_collapse_body));
        }
    }

    public void A0R(Spannable spannable) {
        URLSpan[] uRLSpanArr;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new C02740Cr(getContext(), this.A0G, this.A0W, this.A0H, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
    }

    public final void A0S(Spannable spannable, TextEmojiLabel textEmojiLabel, AnonymousClass092 anonymousClass092, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        String string;
        C02740Cr c02740Cr;
        String A0H = this.A0Y.A0H();
        C0DV c0dv = this.A0v;
        C0DW c0dw = this.A0u;
        if (z3) {
            try {
                Linkify.addLinks(spannable, 2);
                C04310Jr.A06(spannable);
                C02180Ae.A10(spannable, A0H);
                C02180Ae.A0z(spannable, c0dv, c0dw);
            } catch (Exception unused) {
            }
        }
        ArrayList<URLSpan> A0x = AnonymousClass029.A0x(spannable);
        if (A0x == null || A0x.isEmpty()) {
            i = 0;
            i2 = 0;
        } else {
            if (C23X.A0Q(anonymousClass092, this.A0R, this.A0Z, this.A0p, this.A0I, this.A0h)) {
                C0WZ c0wz = this.A0f;
                i2 = 0;
                for (URLSpan uRLSpan : A0x) {
                    if (c0wz.A01(anonymousClass092, uRLSpan.getURL(), anonymousClass092.A0B()) != null) {
                        i2++;
                    }
                }
                i = 0;
                for (URLSpan uRLSpan2 : A0x) {
                    String url = uRLSpan2.getURL();
                    int spanStart = spannable.getSpanStart(uRLSpan2);
                    int spanEnd = spannable.getSpanEnd(uRLSpan2);
                    int spanFlags = spannable.getSpanFlags(uRLSpan2);
                    Set A01 = this.A0f.A01(anonymousClass092, url, anonymousClass092.A0B());
                    if (A01 != null) {
                        c02740Cr = new C02740Cr(getContext(), this.A0G, this.A0W, this.A0H, url, A01) { // from class: X.3LN
                            public final Set A00;

                            {
                                this.A00 = A01;
                            }

                            @Override // X.C02740Cr, X.InterfaceC02760Ct
                            public void onClick(View view) {
                                Set set = this.A00;
                                if (set == null) {
                                    super.onClick(view);
                                    return;
                                }
                                ((ActivityC02290Ap) C018308n.A00(view.getContext())).AUh(SuspiciousLinkWarningDialogFragment.A00(this.A06, set));
                            }
                        };
                    } else {
                        boolean startsWith = url.startsWith("wapay");
                        Context context = getContext();
                        C018508q c018508q = this.A0G;
                        c02740Cr = startsWith ? new C02740Cr(context, c018508q, this.A0W, this.A0t, url) : new C02740Cr(context, c018508q, this.A0W, this.A0H, url);
                    }
                    C2RZ[] c2rzArr = (C2RZ[]) spannable.getSpans(spanStart, spanEnd, C2RZ.class);
                    if (c2rzArr != null && (r11 = c2rzArr.length) > 0) {
                        c02740Cr.A02 = true;
                        for (C2RZ c2rz : c2rzArr) {
                            c2rz.A03 = true;
                        }
                    }
                    spannable.setSpan(c02740Cr, spanStart, spanEnd, spanFlags);
                    i++;
                }
            } else {
                i = 0;
                i2 = 0;
            }
            for (Object obj : A0x) {
                spannable.removeSpan(obj);
            }
        }
        if (!z && i <= 0) {
            if (textEmojiLabel.A06 != null) {
                textEmojiLabel.setFocusable(false);
                C0AT.A0V(textEmojiLabel, 0);
            }
            textEmojiLabel.setAccessibilityHelper(null);
        } else if (textEmojiLabel.A06 == null) {
            textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A0W, textEmojiLabel));
            textEmojiLabel.setFocusable(false);
        }
        if (i2 > 0) {
            if (this.A05 == null) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.suspicious_link_indicator_holder);
                this.A05 = viewGroup;
                if (viewGroup != null) {
                    LayoutInflater.from(getContext()).inflate(R.layout.suspicious_link_indicator, this.A05, true);
                    C003301p.A06((TextView) this.A05.findViewById(R.id.suspicious_link_indicator));
                }
            }
            ViewGroup viewGroup2 = this.A05;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                TextView textView = (TextView) this.A05.findViewById(R.id.suspicious_link_indicator);
                if (i > 1) {
                    string = super.A0J.A0A(R.plurals.suspicious_links_label, i2, Integer.valueOf(i2));
                } else {
                    string = getContext().getString(R.string.suspicious_link_label);
                }
                textView.setText(string);
            }
            ImageView imageView = super.A0E;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ViewGroup viewGroup3 = this.A05;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        }
        if (i > 0 || z2) {
            textEmojiLabel.setText(A0G(spannable), TextView.BufferType.SPANNABLE);
        }
    }

    public final void A0T(ImageView imageView, Drawable drawable, int i, View.OnClickListener onClickListener, int i2) {
        imageView.setImageDrawable(drawable);
        imageView.setBackgroundResource(R.drawable.forward_background);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(i2);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(this.A19);
        imageView.setContentDescription(imageView.getContext().getString(i));
    }

    public final void A0U(TextView textView, int i, AnonymousClass092 anonymousClass092) {
        if (anonymousClass092.A0f) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if (anonymousClass094.A02 && !C003101m.A0P(anonymousClass094.A00)) {
                Drawable A0O = C02180Ae.A0O(getContext(), i, R.color.messageBroadcastColor);
                if (super.A0J.A0N()) {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C0We(super.A0J, A0O), (Drawable) null);
                    return;
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(A0O, (Drawable) null, (Drawable) null, (Drawable) null);
                    return;
                }
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public void A0V(TextView textView, List list, long j) {
        long j2;
        String str;
        C04140Is A04;
        Iterator it = list.iterator();
        long j3 = 0;
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) it.next();
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                C41491u0 c41491u0 = this.A0q;
                long j4 = anonymousClass097.A01;
                if (!c09h.A0X && (str = c09h.A0I) != null && (A04 = c41491u0.A04(str)) != null) {
                    j2 = A04.A09;
                } else {
                    j2 = 0;
                }
                j3 += j4 - j2;
                if (this.A0q.A04(c09h.A0I) == null) {
                    break;
                }
                i++;
            } else {
                throw null;
            }
        }
        if (i == list.size()) {
            textView.setText(C0DB.A07(super.A0J, j3));
            return;
        }
        textView.setText(C0DB.A07(super.A0J, j));
        new C0HS(this.A0q, super.A0J, textView, list) { // from class: X.38G
            public final C002301c A00;
            public final C41491u0 A01;
            public final WeakReference A02;
            public final List A03;

            {
                this.A01 = r2;
                this.A00 = r3;
                this.A03 = list;
                this.A02 = new WeakReference(textView);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                long j5;
                String str2;
                C04140Is A05;
                C41491u0 c41491u02 = this.A01;
                long j6 = 0;
                for (AnonymousClass097 anonymousClass0972 : this.A03) {
                    C09H c09h2 = anonymousClass0972.A02;
                    if (c09h2 != null) {
                        long j7 = anonymousClass0972.A01;
                        if (!c09h2.A0X && (str2 = c09h2.A0I) != null && (A05 = c41491u02.A05(str2, false, false)) != null) {
                            j5 = A05.A09;
                        } else {
                            j5 = 0;
                        }
                        j6 += j7 - j5;
                    } else {
                        throw null;
                    }
                }
                return Long.valueOf(j6);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
                if ((r1 instanceof java.util.List) != false) goto L5;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A09(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Number r5 = (java.lang.Number) r5
                    java.lang.ref.WeakReference r0 = r4.A02
                    java.lang.Object r3 = r0.get()
                    android.widget.TextView r3 = (android.widget.TextView) r3
                    if (r3 == 0) goto L2a
                    java.lang.Object r1 = r3.getTag()
                    boolean r0 = r1 instanceof java.util.List
                    if (r0 == 0) goto L2a
                L14:
                    java.util.List r0 = r4.A03
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L29
                    X.01c r2 = r4.A00
                    long r0 = r5.longValue()
                    java.lang.String r0 = X.C0DB.A07(r2, r0)
                    r3.setText(r0)
                L29:
                    return
                L2a:
                    r1 = 0
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C38G.A09(java.lang.Object):void");
            }
        }.A02.execute(new Void[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x001d, code lost:
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0X(X.AnonymousClass092 r3, boolean r4) {
        /*
            r2 = this;
            X.092 r1 = r2.getFMessage()
            r0 = 0
            if (r1 == r3) goto L8
            r0 = 1
        L8:
            r2.setFMessage(r3)
            if (r0 != 0) goto Lf
            if (r4 == 0) goto L12
        Lf:
            r2.A0e(r0)
        L12:
            X.0Ll r0 = r2.getRowsContainer()
            if (r0 == 0) goto L1f
            boolean r1 = r0.AEZ()
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L41
            boolean r0 = r2 instanceof X.C2XA
            if (r0 != 0) goto L3f
            r0 = 1
        L27:
            if (r0 == 0) goto L41
            r2.A0P()
            X.3JS r1 = r2.A0U
            X.0Ll r0 = r2.getRowsContainer()
            boolean r0 = r0.AFX(r3)
            r1.setRowSelected(r0)
        L39:
            X.2iG r0 = r2.A1I
            java.util.Set r1 = r0.A00
            monitor-enter(r1)
            goto L4b
        L3f:
            r0 = 0
            goto L27
        L41:
            android.view.View r1 = r2.A0D
            if (r1 == 0) goto L39
            r0 = 8
            r1.setVisibility(r0)
            goto L39
        L4b:
            r1.clear()     // Catch: java.lang.Throwable -> L50
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48182Ef.A0X(X.092, boolean):void");
    }

    public void A0Y(AnonymousClass092 anonymousClass092, boolean z) {
        A0X(anonymousClass092, z);
    }

    public void A0Z(C04160Iu c04160Iu, View view, boolean z) {
        UserJid userJid = c04160Iu.A01;
        if (userJid == null) {
            this.A0G.A07(R.string.catalog_something_went_wrong_error, 0);
            return;
        }
        this.A0O.A01(3);
        C49462Ko c49462Ko = this.A0O;
        int i = 18;
        int i2 = 33;
        if (z) {
            i = 17;
            i2 = 32;
        }
        c49462Ko.A02(i, Integer.valueOf(i2), c04160Iu.A04, userJid);
        ProductDetailActivity.A01(c04160Iu, view, z, getContext(), this.A0P, this.A11, this.A0I.A0A(userJid), 1);
    }

    public void A0a(String str, TextEmojiLabel textEmojiLabel, AnonymousClass092 anonymousClass092, boolean z) {
        A0b(str, textEmojiLabel, anonymousClass092, z, true);
    }

    public void A0b(String str, final TextEmojiLabel textEmojiLabel, final AnonymousClass092 anonymousClass092, boolean z, boolean z2) {
        int i;
        C0GP c0gp;
        C58712ra A8N;
        Context context = textEmojiLabel.getContext();
        InterfaceC04690Ll rowsContainer = getRowsContainer();
        final boolean z3 = false;
        if (rowsContainer != null) {
            i = rowsContainer.ADT(anonymousClass092);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        if (z2) {
            textEmojiLabel.setTextSize(getTextFontSize());
        }
        if (anonymousClass092.A03 >= 127 && i == 1) {
            c0gp = new C0GP(i, 308, str.length());
        } else {
            c0gp = new C0GP(i, 768, str.length());
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (z) {
            AnonymousClass029.A0Q(this.A0W, this.A0x, spannableStringBuilder);
        }
        C002701i.A0F(spannableStringBuilder, context, textEmojiLabel.getPaint(), 1.3f, c0gp, this.A0l);
        int i2 = c0gp.A03;
        if (i2 > 0) {
            spannableStringBuilder = spannableStringBuilder.delete((Character.charCount(str.codePointAt(i2 - 1)) - 1) + i2, spannableStringBuilder.length());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getContext().getString(R.string.read_more));
            spannableStringBuilder2.setSpan(new AbstractC02750Cs(context) { // from class: X.3JR
                {
                    AbstractC48182Ef.this = this;
                }

                @Override // X.InterfaceC02760Ct
                public void onClick(View view) {
                    AbstractC48182Ef abstractC48182Ef = AbstractC48182Ef.this;
                    AnonymousClass092 fMessage = abstractC48182Ef.getFMessage();
                    InterfaceC04690Ll rowsContainer2 = abstractC48182Ef.getRowsContainer();
                    if (rowsContainer2 != null) {
                        int ADT = rowsContainer2.ADT(fMessage);
                        if (ADT == 0) {
                            ADT = 1;
                        }
                        rowsContainer2.ATz(fMessage, ADT + 1);
                        abstractC48182Ef.A0I();
                    }
                }
            }, 0, spannableStringBuilder2.length(), 18);
            spannableStringBuilder.append((CharSequence) "... ");
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            z3 = true;
        }
        this.A0r.A03(context, spannableStringBuilder, anonymousClass092.A0c, true);
        if (rowsContainer != null && (A8N = rowsContainer.A8N()) != null) {
            A0S(spannableStringBuilder, textEmojiLabel, anonymousClass092, z3, true, false);
            A8N.A00(spannableStringBuilder, textEmojiLabel, anonymousClass092.A0n, new InterfaceC58672rW() { // from class: X.37w
                {
                    AbstractC48182Ef.this = this;
                }

                @Override // X.InterfaceC58672rW
                public final void ARW(Spannable spannable) {
                    AbstractC48182Ef.this.A0S(spannable, textEmojiLabel, anonymousClass092, z3, false, false);
                }
            });
            return;
        }
        A0S(spannableStringBuilder, textEmojiLabel, anonymousClass092, z3, true, true);
    }

    public void A0c(boolean z) {
        ScaleAnimation scaleAnimation;
        if ((this instanceof C2X7) || this.A08 == null) {
            return;
        }
        if (z) {
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            this.A08.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.2ri
                {
                    AbstractC48182Ef.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    AbstractC48182Ef abstractC48182Ef = AbstractC48182Ef.this;
                    abstractC48182Ef.A08.getViewTreeObserver().removeOnPreDrawListener(this);
                    InterfaceC04690Ll rowsContainer = abstractC48182Ef.getRowsContainer();
                    Drawable popupDrawable = abstractC48182Ef.getPopupDrawable();
                    if (rowsContainer == null || popupDrawable == null) {
                        return true;
                    }
                    rowsContainer.A5Q(abstractC48182Ef.A08, popupDrawable);
                    return true;
                }
            });
        } else {
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            this.A08.setVisibility(0);
            scaleAnimation.setAnimationListener(new C0DJ() { // from class: X.38E
                {
                    AbstractC48182Ef.this = this;
                }

                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    AbstractC48182Ef.this.A08.setVisibility(4);
                }
            });
            scaleAnimation.setInterpolator(new AnticipateInterpolator());
        }
        scaleAnimation.setDuration(500L);
        this.A08.startAnimation(scaleAnimation);
    }

    public void A0d(boolean z) {
        if (z) {
            TextView textView = this.A0A;
            if (textView == null) {
                TextView textView2 = new TextView(getContext());
                this.A0A = textView2;
                textView2.setId(R.id.conversation_row_date_divider);
                this.A0A.setTextColor(C02160Ac.A00(getContext(), R.color.conversation_divider_text));
                this.A0A.setBackgroundResource(R.drawable.date_balloon_normal);
                this.A0A.setGravity(17);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(R.dimen.conversation_date_divider_marginbottom);
                addView(this.A0A, marginLayoutParams);
                textView = this.A0A;
                super.A0B = textView;
            }
            textView.setText(AnonymousClass029.A0l(super.A0J, getFMessage().A0E).toUpperCase(super.A0J.A0I()));
            this.A0A.setTextSize(A03(getResources()));
            this.A0A.setVisibility(0);
            this.A16 = true;
            return;
        }
        TextView textView3 = this.A0A;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        this.A16 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:409:0x0433, code lost:
        if (r5 == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x043b, code lost:
        if (r14 != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x043d, code lost:
        r7 = com.google.android.search.verification.client.R.drawable.ic_frequently_forwarded;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0440, code lost:
        r12 = new java.lang.StringBuilder();
        r11 = X.C02M.A01;
        r12.append(r11);
        r12.append(getContext().getString(r13));
        r12.append(r11);
        r18.A0B.setText(r12.toString());
        r12 = r18.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0463, code lost:
        if (r12 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0465, code lost:
        r13 = r12.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0469, code lost:
        if (r14 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x046b, code lost:
        r11 = r18.A0K.A0E(X.C01C.A18);
        r5 = com.google.android.search.verification.client.R.string.highly_forwarded_message_header;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0476, code lost:
        if (r11 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0478, code lost:
        r5 = com.google.android.search.verification.client.R.string.accessibility_forwarded_many_times;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x047b, code lost:
        r12.setContentDescription(r13.getString(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0488, code lost:
        if (r18.A0J.A0N() == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x048a, code lost:
        r18.A0B.setCompoundDrawablesWithIntrinsicBounds(0, 0, r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x048f, code lost:
        r5 = X.C02160Ac.A00(getContext(), com.google.android.search.verification.client.R.color.forwarded_message_arrow_tint);
        r7 = r18.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x049c, code lost:
        if (r5 == 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x049e, code lost:
        r5 = android.content.res.ColorStateList.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x04a2, code lost:
        X.C07O.A0p(r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0614, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0617, code lost:
        r18.A0B.setCompoundDrawablesWithIntrinsicBounds(r7, 0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x061e, code lost:
        r5 = com.google.android.search.verification.client.R.string.forwarded_message_header;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0e(boolean r19) {
        /*
            Method dump skipped, instructions count: 2033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48182Ef.A0e(boolean):void");
    }

    public boolean A0f() {
        return ((this instanceof C2XA) || (this instanceof C51572Wz) || (this instanceof C2WL) || (this instanceof C2WA)) ? false : true;
    }

    public boolean A0g() {
        return ((this instanceof C2WJ) || !C0DB.A0f(getFMessage()) || super.A0P) ? false : true;
    }

    public boolean A0h(AnonymousClass094 anonymousClass094) {
        if (this instanceof C2XA) {
            List<AnonymousClass092> list = ((C2XA) this).A06;
            if (list != null) {
                for (AnonymousClass092 anonymousClass092 : list) {
                    if (anonymousClass092.A0n.equals(anonymousClass094)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } else if (!(this instanceof C2WZ)) {
            if (this instanceof C2WJ) {
                return false;
            }
            return getFMessage().A0n.equals(anonymousClass094);
        } else {
            List<AnonymousClass092> list2 = ((C2WZ) this).A07;
            if (list2 != null) {
                for (AnonymousClass092 anonymousClass0922 : list2) {
                    if (anonymousClass0922.A0n.equals(anonymousClass094)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    public boolean A0i(boolean z) {
        return Build.VERSION.SDK_INT >= 19 && (C02180Ae.A0F(getContext()) instanceof Conversation) && z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A1I.A00();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return this.A18.onKey(this, keyEvent.getKeyCode(), keyEvent);
    }

    public int getBroadcastDrawableId() {
        return R.drawable.broadcast_status_icon;
    }

    @Override // X.AbstractC48202Eh
    public int getBubbleMarginStart() {
        int i;
        int A00 = C003301p.A00(getContext());
        if (C0DB.A0N(this.A0X, this.A0s, getFMessage())) {
            i = getResources().getDimensionPixelSize(R.dimen.bubble_margin_failed);
        } else {
            i = 0;
        }
        return (!(super.A0X instanceof C68313Ja) ? 0 : getContext().getResources().getDimensionPixelSize(R.dimen.bubble_margin_starred)) + A00 + i;
    }

    public C0Zn getContactPhotosLoader() {
        Activity A0F = C02180Ae.A0F(getContext());
        if (A0F instanceof InterfaceC04800Lw) {
            return ((InterfaceC04800Lw) A0F).A94();
        }
        return null;
    }

    public int getForwardedTextAnchorId() {
        return R.id.quoted_message_holder;
    }

    public byte getMessageType() {
        return getFMessage().A0m;
    }

    private float getNameInGroupTextFontSize() {
        return A04(getResources(), super.A0J);
    }

    public Drawable getPopupDrawable() {
        return C02180Ae.A0O(getContext(), R.drawable.message_star_teal_anim, R.color.messageStarAnimationColor);
    }

    public Drawable getStarDrawable() {
        return C02180Ae.A0O(getContext(), R.drawable.message_star, R.color.messageStarColor);
    }

    public float getTextFontSize() {
        return A05(getResources(), super.A0J, WaFontListPreference.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // X.AbstractC48202Eh, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean A0N;
        int height;
        boolean A0N2;
        super.onLayout(z, i, i2, i3, i4);
        View view = super.A0D;
        if (view != null) {
            view.layout(0, 0, getWidth(), getHeight());
        }
        View view2 = this.A1B;
        if (view2 != null && view2.getVisibility() == 0) {
            View view3 = (View) view2.getParent();
            View findViewById = findViewById(R.id.pushname_in_group_tv);
            view2.layout(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getWidth() - view3.getPaddingRight(), view2.getMeasuredHeight() + view3.getPaddingTop());
            if (super.A0J.A0N()) {
                findViewById.layout(view2.getPaddingLeft(), view2.getPaddingTop(), findViewById.getWidth() + view2.getPaddingLeft(), findViewById.getHeight() + view2.getPaddingTop());
            } else {
                findViewById.layout((view2.getWidth() - view2.getPaddingRight()) - findViewById.getWidth(), view2.getPaddingTop(), view2.getWidth() - view2.getPaddingRight(), findViewById.getHeight() + view2.getPaddingTop());
            }
        }
        ImageView imageView = this.A07;
        if (imageView != null) {
            int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
            int intrinsicHeight = this.A07.getDrawable().getIntrinsicHeight();
            int top = super.A0C.getTop();
            if (super.A0P) {
                height = getResources().getDimensionPixelSize(R.dimen.conversation_row_layout_top_size) + top;
            } else {
                height = ((((super.A0C.getHeight() - super.A0C.getPaddingTop()) - super.A0C.getPaddingBottom()) - intrinsicHeight) >> 1) + super.A0C.getPaddingTop() + top;
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_row_layout_top_size) + C003301p.A00(getContext());
            C658038p c658038p = super.A0X;
            if (!(c658038p instanceof C68313Ja)) {
                A0N2 = c658038p.A03.A0M();
            } else {
                A0N2 = c658038p.A03.A0N();
            }
            if (A0N2) {
                this.A07.layout((getWidth() - intrinsicWidth) - dimensionPixelSize, height, getWidth() - dimensionPixelSize, intrinsicHeight + height);
            } else {
                this.A07.layout(dimensionPixelSize, height, intrinsicWidth + dimensionPixelSize, intrinsicHeight + height);
            }
        }
        ImageView quickActionButton = getQuickActionButton();
        if (quickActionButton != null) {
            if (getFMessage().A0n.A02) {
                C658038p c658038p2 = super.A0X;
                if (!(c658038p2 instanceof C68313Ja)) {
                    A0N = c658038p2.A03.A0M();
                } else {
                    A0N = c658038p2.A03.A0N();
                }
            } else {
                A0N = super.A0J.A0N();
            }
            if (A0N) {
                quickActionButton.layout(super.A0C.getLeft() - quickActionButton.getMeasuredWidth(), ((super.A0C.getBottom() + super.A0C.getTop()) >> 1) - (quickActionButton.getMeasuredHeight() >> 1), super.A0C.getLeft(), (quickActionButton.getMeasuredHeight() >> 1) + ((super.A0C.getBottom() + super.A0C.getTop()) >> 1));
                return;
            }
            quickActionButton.layout(super.A0C.getRight(), ((super.A0C.getBottom() + super.A0C.getTop()) >> 1) - (quickActionButton.getMeasuredHeight() >> 1), quickActionButton.getMeasuredWidth() + super.A0C.getRight(), (quickActionButton.getMeasuredHeight() >> 1) + ((super.A0C.getBottom() + super.A0C.getTop()) >> 1));
        }
    }

    @Override // X.AbstractC48202Eh, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.A01 != 0) {
            if (View.MeasureSpec.getMode(i2) == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.A01, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.A01, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2));
            }
        }
        super.onMeasure(i, i2);
        ImageView quickActionButton = getQuickActionButton();
        if (quickActionButton != null) {
            quickActionButton.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setForwardButtonAction(Runnable runnable) {
        this.A14 = runnable;
    }

    public void setMaxHeight(int i) {
        this.A01 = i;
    }

    public void setSearchButtonAction(Runnable runnable) {
        this.A15 = runnable;
    }
}
