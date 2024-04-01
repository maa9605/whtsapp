package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4E4  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4E4 extends AbstractC04890Mh {
    public List A00 = new ArrayList();
    public final /* synthetic */ C4KM A01;

    public C4E4(C4KM c4km) {
        this.A01 = c4km;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return ((AbstractC900449l) this.A00.get(i)).A00;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return this.A01.A1P(viewGroup, i);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        ImageView imageView;
        C0DX ACJ;
        if (c0ts instanceof AbstractC91264Eg) {
            ((AbstractC91264Eg) c0ts).A0C((AbstractC900449l) this.A00.get(i), i);
        } else if (c0ts instanceof AbstractC91274Eh) {
            AbstractC91274Eh abstractC91274Eh = (AbstractC91274Eh) c0ts;
            AbstractC900449l abstractC900449l = (AbstractC900449l) this.A00.get(i);
            if (abstractC91274Eh instanceof C91984Hb) {
                C91984Hb c91984Hb = (C91984Hb) abstractC91274Eh;
                C91454Ez c91454Ez = (C91454Ez) abstractC900449l;
                c91984Hb.A01.setText(c91454Ez.A04);
                c91984Hb.A00.setText(c91454Ez.A03);
                Drawable drawable = c91454Ez.A00;
                if (drawable != null) {
                    c91984Hb.A00.setCompoundDrawables(drawable, null, null, null);
                }
                View.OnClickListener onClickListener = c91454Ez.A01;
                if (onClickListener != null) {
                    c91984Hb.A0H.setOnClickListener(onClickListener);
                }
                View.OnLongClickListener onLongClickListener = c91454Ez.A02;
                if (onLongClickListener != null) {
                    c91984Hb.A0H.setOnLongClickListener(onLongClickListener);
                }
            } else if (abstractC91274Eh instanceof C91974Ha) {
                C91974Ha c91974Ha = (C91974Ha) abstractC91274Eh;
                C91444Ey c91444Ey = (C91444Ey) abstractC900449l;
                WaTextView waTextView = c91974Ha.A04;
                Drawable background = waTextView.getBackground();
                Context context = c91974Ha.A00;
                background.setColorFilter(context.getResources().getColor(c91444Ey.A00), PorterDuff.Mode.SRC_IN);
                waTextView.setText(c91444Ey.A01);
                waTextView.setContentDescription(c91444Ey.A02);
                if (!TextUtils.isEmpty(c91444Ey.A03)) {
                    TextView textView = c91974Ha.A01;
                    textView.setTypeface(C003301p.A03(context));
                    textView.setText(c91444Ey.A03);
                    textView.setTextColor(context.getResources().getColor(c91444Ey.A00));
                    if (!TextUtils.isEmpty(c91444Ey.A05)) {
                        c91974Ha.A02.setText(c91444Ey.A05);
                    }
                } else {
                    TextView textView2 = c91974Ha.A01;
                    textView2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
                    textView2.setText(c91444Ey.A04);
                    textView2.setTextColor(C02160Ac.A00(context, R.color.settings_item_subtitle_text));
                    c91974Ha.A02.setText("");
                }
                if (!TextUtils.isEmpty(c91444Ey.A07)) {
                    TextEmojiLabel textEmojiLabel = c91974Ha.A03;
                    C000200d.A0b(textEmojiLabel);
                    textEmojiLabel.setAccessibilityHelper(new C02780Cv(c91974Ha.A05, textEmojiLabel));
                    textEmojiLabel.setText(C28E.A07(c91444Ey.A07, c91444Ey.A08, context.getResources().getColor(R.color.link_color), null));
                    return;
                }
                c91974Ha.A03.setText(c91444Ey.A06);
            } else if (abstractC91274Eh instanceof C4HZ) {
                C4HZ c4hz = (C4HZ) abstractC91274Eh;
                C91434Ex c91434Ex = (C91434Ex) abstractC900449l;
                c4hz.A01.setText(c4hz.A0H.getContext().getString(R.string.payments_send_payment_again_descriptions, c91434Ex.A01));
                c4hz.A00.setOnClickListener(c91434Ex.A00);
            } else if (abstractC91274Eh instanceof C4HY) {
                C4HY c4hy = (C4HY) abstractC91274Eh;
                C91424Ew c91424Ew = (C91424Ew) abstractC900449l;
                if (!TextUtils.isEmpty(c91424Ew.A05)) {
                    c4hy.A05.setText(c91424Ew.A05);
                    c4hy.A04.setText(c91424Ew.A04);
                    if (!TextUtils.isEmpty(c91424Ew.A06)) {
                        c4hy.A06.setText(c91424Ew.A06);
                    }
                } else {
                    c4hy.A03.setVisibility(8);
                }
                if (c91424Ew.A03 != null) {
                    C0Zn A04 = c4hy.A08.A04(c4hy.A00);
                    C06C c06c = c91424Ew.A03;
                    imageView = c4hy.A01;
                    A04.A02(c06c, imageView);
                } else {
                    C0L7 c0l7 = c4hy.A07;
                    imageView = c4hy.A01;
                    c0l7.A05(imageView, R.drawable.avatar_contact);
                }
                c4hy.A03.setOnClickListener(c91424Ew.A02);
                imageView.setVisibility(c91424Ew.A00);
                c4hy.A02.setVisibility(c91424Ew.A01);
            } else if (abstractC91274Eh instanceof C4HX) {
                C4HX c4hx = (C4HX) abstractC91274Eh;
                c4hx.A01.setOnClickListener(((C4F0) abstractC900449l).A00);
                C02180Ae.A17(c4hx.A00, C02160Ac.A00(c4hx.A00.getContext(), R.color.settings_icon));
            } else if (abstractC91274Eh instanceof C4HW) {
                C4HW c4hw = (C4HW) abstractC91274Eh;
                C91414Ev c91414Ev = (C91414Ev) abstractC900449l;
                TextView textView3 = c4hw.A02;
                textView3.setText(c91414Ev.A04);
                textView3.setVisibility(c91414Ev.A00);
                if (c91414Ev.A03 != null) {
                    View view = c4hw.A00;
                    Button button = (Button) view.findViewById(R.id.request_cancel_button);
                    C2OU c2ou = c4hw.A03;
                    C2OS c2os = c91414Ev.A02;
                    C901849z c901849z = c91414Ev.A03;
                    AnonymousClass093 anonymousClass093 = c901849z.A01;
                    AnonymousClass092 anonymousClass092 = c901849z.A02;
                    Button button2 = c4hw.A01;
                    AbstractC27991Pp abstractC27991Pp = c91414Ev.A01;
                    if (c2ou != null) {
                        view.setVisibility(8);
                        if (anonymousClass093.A01 == 110) {
                            View findViewById = view.findViewById(R.id.request_decline_button);
                            if (findViewById != null) {
                                View findViewById2 = view.findViewById(R.id.request_pay_button);
                                if (findViewById2 != null) {
                                    findViewById.setVisibility(8);
                                    findViewById2.setVisibility(8);
                                    view.setVisibility(0);
                                    button2.setVisibility(0);
                                    InterfaceC03590Gh A02 = c2ou.A0A.A02(anonymousClass093.A0E);
                                    if (A02 != null && (ACJ = A02.ACJ(anonymousClass093.A0G)) != null) {
                                        button2.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(ACJ, view.getContext(), anonymousClass092, 1));
                                        return;
                                    }
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        } else if (anonymousClass093.A0L()) {
                            c2ou.A04(view, c2os, anonymousClass093, true, button);
                            return;
                        } else {
                            c2ou.A03(view, c2os, anonymousClass093, anonymousClass092, true, abstractC27991Pp, button);
                            return;
                        }
                    }
                    throw null;
                }
            } else if (abstractC91274Eh instanceof C4HV) {
            } else {
                if (abstractC91274Eh instanceof C4HS) {
                    ((C4HS) abstractC91274Eh).A00.setText(((C91404Eu) abstractC900449l).A00);
                } else if (abstractC91274Eh instanceof C4HR) {
                    final C4HR c4hr = (C4HR) abstractC91274Eh;
                    C91394Et c91394Et = (C91394Et) abstractC900449l;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c91394Et.A00.A0G());
                    c4hr.A06.A03(c4hr.A0H.getContext(), spannableStringBuilder, c91394Et.A00.A0c, true);
                    c4hr.A0D(spannableStringBuilder, c4hr.A00, true);
                    c4hr.A03.A00(spannableStringBuilder, c4hr.A00, c91394Et.A00.A0n, new InterfaceC58672rW() { // from class: X.3jr
                        @Override // X.InterfaceC58672rW
                        public final void ARW(Spannable spannable) {
                            C4HR.this.A0C(spannable);
                        }
                    });
                } else if (abstractC91274Eh instanceof C4HL) {
                    C4HL c4hl = (C4HL) abstractC91274Eh;
                    C92024Hf c92024Hf = (C92024Hf) abstractC900449l;
                    c4hl.A01.setText(c92024Hf.A01);
                    String str = c92024Hf.A00;
                    if (str != null) {
                        c4hl.A00.setText(str);
                        c4hl.A00.setVisibility(0);
                    }
                } else if (abstractC91274Eh instanceof C4HK) {
                    ((C4HK) abstractC91274Eh).A00.setOnClickListener(((C91324Em) abstractC900449l).A00);
                } else if (abstractC91274Eh instanceof C4HJ) {
                } else {
                    if (!(abstractC91274Eh instanceof C4HH)) {
                        throw null;
                    }
                    C4HH c4hh = (C4HH) abstractC91274Eh;
                    C91994Hc c91994Hc = (C91994Hc) abstractC900449l;
                    String str2 = c91994Hc.A00;
                    if (str2 != null) {
                        c4hh.A01.setText(str2);
                        c4hh.A01.setVisibility(0);
                        c4hh.A00.setVisibility(8);
                    } else {
                        c4hh.A01.setVisibility(8);
                        c4hh.A00.setVisibility(0);
                    }
                    c4hh.A02.setText(c91994Hc.A01);
                }
            }
        } else if (c0ts instanceof C4HE) {
            ((AbstractC91264Eg) c0ts).A0C((AbstractC900449l) this.A00.get(i), i);
        } else {
            throw new RuntimeException(C014406v.A01("PaymentComponentListActivity", "unsupported holder"));
        }
    }
}
