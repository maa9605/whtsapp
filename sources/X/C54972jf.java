package X;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.2jf */
/* loaded from: classes2.dex */
public class C54972jf extends AbstractC52772bI {
    public C55012jj A00;
    public final int A01;
    public final C06040Rh A02;
    public final C0L7 A03;
    public final C05W A04;
    public final C0Zn A05;
    public final C52682b9 A06;
    public final C29a A07;
    public final C000500h A08;
    public final C05M A09;
    public final C03180Eq A0A;
    public final C003701t A0B;
    public final C0CB A0C;

    public C54972jf(int i, ViewHolder viewHolder, Context context, Activity activity, C52782bL c52782bL, AnonymousClass012 anonymousClass012, C003701t c003701t, C02980Dr c02980Dr, C02L c02l, C001200o c001200o, C05M c05m, C01B c01b, C03750Gx c03750Gx, C0L7 c0l7, C05W c05w, C06040Rh c06040Rh, C0GK c0gk, C018708s c018708s, C002301c c002301c, AbstractC54772jK abstractC54772jK, C40261rr c40261rr, C03180Eq c03180Eq, C0CB c0cb, C0Zn c0Zn, C000500h c000500h, C52682b9 c52682b9, C06K c06k, C0LM c0lm, C29a c29a) {
        super(viewHolder, context, activity, c52782bL, anonymousClass012, c02980Dr, c02l, c001200o, c01b, c03750Gx, c05w, c0gk, c018708s, c002301c, abstractC54772jK, c40261rr, c06k, c0lm, c29a);
        this.A01 = i;
        this.A0B = c003701t;
        this.A09 = c05m;
        this.A03 = c0l7;
        this.A04 = c05w;
        this.A02 = c06040Rh;
        this.A0A = c03180Eq;
        this.A0C = c0cb;
        this.A05 = c0Zn;
        this.A08 = c000500h;
        this.A06 = c52682b9;
        this.A07 = c29a;
    }

    public final void A06(C55002ji c55002ji) {
        View view;
        String str;
        byte b;
        int i;
        int i2;
        C06C c06c = c55002ji.A00;
        C06C c06c2 = c55002ji.A01;
        AnonymousClass092 anonymousClass092 = c55002ji.A02;
        C03370Fl c03370Fl = c55002ji.A03;
        boolean A09 = c03370Fl.A09();
        boolean z = c03370Fl.A0E;
        Context context = super.A02;
        if (context != null) {
            ViewHolder viewHolder = super.A0C;
            final View view2 = viewHolder.A05;
            view2.setVisibility(0);
            TextEmojiLabel textEmojiLabel = viewHolder.A0K;
            textEmojiLabel.setPlaceholder(0);
            Jid A03 = c06c.A03(AbstractC005302j.class);
            if (A03 != null) {
                final AbstractC005302j abstractC005302j = (AbstractC005302j) A03;
                C0Zn c0Zn = this.A05;
                ImageView imageView = viewHolder.A08;
                c0Zn.A02(c06c, imageView);
                C29a c29a = this.A07;
                boolean contains = c29a.AD1().contains(abstractC005302j);
                boolean ARL = c29a.ARL(abstractC005302j);
                if (contains) {
                    view2.setBackgroundResource(R.color.home_row_selection);
                } else {
                    C02180Ae.A11(view2);
                }
                SelectionCheckView selectionCheckView = viewHolder.A0R;
                selectionCheckView.A03(contains, ARL);
                selectionCheckView.setVisibility(contains ? 0 : 8);
                if (C003101m.A0a(abstractC005302j)) {
                    ViewOnClickEBaseShape0S0200000_I0_0 viewOnClickEBaseShape0S0200000_I0_0 = new ViewOnClickEBaseShape0S0200000_I0_0(this, abstractC005302j, 23);
                    imageView.setEnabled(false);
                    imageView.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_0);
                    imageView.setOnLongClickListener(null);
                    View view3 = ((C0TS) viewHolder).A0H;
                    view3.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_0);
                    view3.setOnLongClickListener(null);
                    view = viewHolder.A04;
                    view.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_0);
                    view.setOnLongClickListener(null);
                } else {
                    selectionCheckView.setEnabled(true);
                    imageView.setEnabled(true);
                    StringBuilder sb = new StringBuilder();
                    sb.append(ConversationsFragment.class.getName());
                    sb.append(C003101m.A07(abstractC005302j));
                    C0AT.A0e(imageView, sb.toString());
                    ViewOnClickEBaseShape0S0200000_I0_0 viewOnClickEBaseShape0S0200000_I0_02 = new ViewOnClickEBaseShape0S0200000_I0_0(this, abstractC005302j, 24);
                    ViewOnClickEBaseShape0S0200000_I0_0 viewOnClickEBaseShape0S0200000_I0_03 = new ViewOnClickEBaseShape0S0200000_I0_0(this, abstractC005302j, 25);
                    View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: X.2sq
                        {
                            C54972jf.this = this;
                        }

                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view4) {
                            C54972jf c54972jf = C54972jf.this;
                            AbstractC005302j abstractC005302j2 = abstractC005302j;
                            C29a c29a2 = c54972jf.A07;
                            ViewHolder viewHolder2 = ((AbstractC52772bI) c54972jf).A0C;
                            c29a2.ALf(abstractC005302j2, viewHolder2.A05, viewHolder2.A0R);
                            return true;
                        }
                    };
                    imageView.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_03);
                    imageView.setOnLongClickListener(onLongClickListener);
                    View view4 = ((C0TS) viewHolder).A0H;
                    view4.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_02);
                    view4.setOnLongClickListener(onLongClickListener);
                    view = viewHolder.A04;
                    view.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_03);
                    view.setOnLongClickListener(onLongClickListener);
                }
                view.setVisibility(0);
                textEmojiLabel.setVisibility(0);
                TextEmojiLabel textEmojiLabel2 = viewHolder.A0L;
                textEmojiLabel2.setVisibility(0);
                TextView textView = viewHolder.A0F;
                textView.setVisibility(0);
                ImageView imageView2 = viewHolder.A0E;
                imageView2.setVisibility(0);
                ImageView imageView3 = viewHolder.A0B;
                imageView3.setVisibility(0);
                viewHolder.A00.A00.A01.setVisibility(0);
                viewHolder.A00.A01.A01.setPadding(0, 0, 0, 0);
                C54952jd c54952jd = viewHolder.A00;
                List ACQ = c29a.ACQ();
                AbstractC54772jK abstractC54772jK = this.A0J;
                c54952jd.A01(c06c, ACQ, abstractC54772jK);
                C05M c05m = this.A09;
                int A01 = c05m.A01(abstractC005302j);
                WaImageView waImageView = viewHolder.A0M;
                waImageView.setVisibility(8);
                if (A01 > 0) {
                    C002301c c002301c = this.A0F;
                    long j = A01;
                    textView.setText(c002301c.A0G().format(j));
                    textView.setContentDescription(c002301c.A0A(R.plurals.unread_message_count, j, Integer.valueOf(A01)));
                    textView.setVisibility(0);
                    if (context != null) {
                        textView.setBackground(new C50502Sa(C02160Ac.A00(context, R.color.unread_indicator)));
                        C0IT c0it = (C0IT) c05m.A0C().get(abstractC005302j);
                        int i3 = c0it == null ? 0 : c0it.A03;
                        if (this.A0B.A0C(363) && i3 > 0) {
                            waImageView.setVisibility(0);
                        }
                    } else {
                        throw null;
                    }
                } else if (A01 == -1) {
                    textView.setText("");
                    textView.setContentDescription(context.getString(R.string.marked_unread));
                    textView.setVisibility(0);
                    textView.setBackground(new C50502Sa(C02160Ac.A00(context, R.color.unread_indicator)));
                } else {
                    textView.setVisibility(8);
                }
                if ((anonymousClass092 instanceof C04300Jq) && ((i2 = ((C04300Jq) anonymousClass092).A00) == 2 || i2 == 3)) {
                    viewHolder.A00.A01.A05(anonymousClass092.A0G(), null, abstractC54772jK);
                }
                A05(anonymousClass092, c06c, c06c2);
                ImageView imageView4 = viewHolder.A0C;
                if (imageView4 != null) {
                    if (C23X.A0O(abstractC005302j, c05m, super.A04, this.A08)) {
                        int i4 = this.A01;
                        if (i4 == 0) {
                            imageView4.setVisibility(0);
                        } else if (i4 == 1) {
                            imageView4.setVisibility(A09 ? 0 : 8);
                        } else if (i4 == 2) {
                            imageView4.setVisibility(8);
                        } else {
                            StringBuilder A0P = C000200d.A0P("ConversationViewFiller/this state does not exist. State = ");
                            A0P.append(i4);
                            throw new IllegalStateException(A0P.toString());
                        }
                    } else {
                        imageView4.setVisibility(A09 ? 0 : 8);
                    }
                }
                ImageView imageView5 = viewHolder.A0D;
                if (imageView5 != null) {
                    imageView5.setVisibility(z ? 0 : 8);
                }
                ImageView imageView6 = viewHolder.A0A;
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
                View view5 = viewHolder.A03;
                if (view5 != null) {
                    view5.setVisibility((!c05m.A0F(abstractC005302j) || (this.A01 != 0 && C23X.A0L(super.A04, this.A08))) ? 8 : 0);
                }
                viewHolder.A00.A01.A02(c06c);
                if (!c06c.A0D()) {
                    str = this.A02.A01(c06c);
                    if (str != null) {
                        textEmojiLabel.setText(str);
                        textEmojiLabel2.setVisibility(8);
                        imageView3.setVisibility(8);
                    }
                } else {
                    str = null;
                }
                C54952jd c54952jd2 = viewHolder.A00;
                if (context != null) {
                    int i5 = R.color.conversations_row_date;
                    if (A01 > 0) {
                        i5 = R.color.conversations_row_unread_date;
                    }
                    c54952jd2.A00.A01.setTextColor(C02160Ac.A00(context, i5));
                    if (str != null) {
                        imageView2.setVisibility(8);
                        textEmojiLabel.setTextColor(C02160Ac.A00(context, R.color.composing));
                        C003301p.A06(textEmojiLabel);
                    } else {
                        textEmojiLabel.setTextColor(C02160Ac.A00(context, R.color.list_item_sub_title));
                        textEmojiLabel.setTypeface(null, (anonymousClass092 == null || !((b = anonymousClass092.A0m) == 15 || b == 19)) ? 0 : 2);
                    }
                    if (abstractC005302j.equals(c29a.AAU())) {
                        c29a.A6A();
                        final int i6 = R.color.primary_surface;
                        if (contains) {
                            i6 = R.color.home_row_selection;
                        }
                        if (context != null) {
                            final int A00 = C02160Ac.A00(context, i6) & 16777215;
                            int A002 = C02160Ac.A00(context, R.color.accent_dark_alpha_20);
                            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.2sr
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    View view6 = view2;
                                    int i7 = i6;
                                    int i8 = A00;
                                    view6.setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue());
                                    if (i7 == R.color.primary_surface && ((Number) valueAnimator.getAnimatedValue()).intValue() == i8) {
                                        view6.setBackgroundResource(0);
                                    }
                                }
                            };
                            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                            Integer valueOf = Integer.valueOf(A00);
                            Integer valueOf2 = Integer.valueOf(A002);
                            ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, valueOf, valueOf2);
                            ofObject.setStartDelay(300L);
                            ofObject.setDuration(550L);
                            ofObject.addUpdateListener(animatorUpdateListener);
                            ofObject.start();
                            ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), valueOf2, valueOf);
                            ofObject2.setDuration(2150L);
                            ofObject2.addUpdateListener(animatorUpdateListener);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(ofObject2).after(ofObject);
                            animatorSet.start();
                        }
                    }
                    C05W c05w = this.A04;
                    if (super.A04.A0E(C01C.A0n)) {
                        i = AnonymousClass029.A05(c05m, c05w, abstractC005302j);
                    } else {
                        i = 0;
                    }
                    ImageView imageView7 = viewHolder.A09;
                    imageView7.setVisibility(i > 0 ? 0 : 8);
                    imageView7.setContentDescription(AnonymousClass029.A0b(this.A0F, i));
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
