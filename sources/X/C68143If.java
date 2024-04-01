package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3If */
/* loaded from: classes2.dex */
public class C68143If extends AbstractC04890Mh implements Filterable {
    public int A00;
    public int A02;
    public C31V A03;
    public C31W A04;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final C02L A0B;
    public final C018708s A0C;
    public final C0Zn A0D;
    public final C002301c A0E;
    public final C2LU A0F;
    public final C02980Dr A0G;
    public final C2AR A0H;
    public String A05 = "";
    public int A01 = -1;
    public List A07 = new ArrayList();
    public List A06 = new ArrayList();

    public C68143If(Context context, C02980Dr c02980Dr, C02L c02l, C0L5 c0l5, C018708s c018708s, C002301c c002301c, C2AR c2ar, C2LU c2lu, boolean z, boolean z2) {
        this.A0G = c02980Dr;
        this.A0B = c02l;
        this.A0C = c018708s;
        this.A0E = c002301c;
        this.A0H = c2ar;
        this.A0D = c0l5.A04(context);
        this.A0F = c2lu;
        if (z) {
            this.A00 = C02160Ac.A00(context, R.color.mention_primary_text_color_dark_theme);
            this.A02 = C02160Ac.A00(context, R.color.mention_pushname_dark_theme);
            this.A09 = C02160Ac.A00(context, R.color.mention_divider_dark_theme);
        } else {
            this.A00 = C02160Ac.A00(context, R.color.list_item_title);
            this.A02 = C02160Ac.A00(context, R.color.list_item_info);
            this.A09 = C02160Ac.A00(context, R.color.divider_gray);
        }
        this.A0A = (int) context.getResources().getDimension(R.dimen.mention_picker_divider_padding);
        this.A08 = z2;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A07.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C68133Ie(this, (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mentions_row, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        String A00;
        C68133Ie c68133Ie = (C68133Ie) c0ts;
        C06C c06c = (C06C) this.A07.get(i);
        C06030Rg c06030Rg = c68133Ie.A04;
        if (this.A0G != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C02980Dr.A04 ? "\u2068" : "");
            if (c06c.A0E()) {
                A00 = C018708s.A02(c06c, false);
            } else if (!TextUtils.isEmpty(c06c.A0F)) {
                A00 = c06c.A0F;
            } else {
                A00 = C04630Le.A00(c06c);
            }
            sb.append(A00);
            sb.append(C02980Dr.A05 ? "\u2069" : "");
            c06030Rg.A04(A0G(sb.toString()), null);
            c06030Rg.A01(c06c.A0F() ? 1 : 0);
            this.A0D.A02(c06c, c68133Ie.A05);
            c68133Ie.A02.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, c06c, 12));
            View view = c68133Ie.A01;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (i == this.A01) {
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(0);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                }
                view.setBackgroundColor(this.A09);
            } else {
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(this.A0A);
                } else {
                    layoutParams.setMargins(this.A0A, 0, 0, 0);
                }
                view.setBackgroundColor(this.A09);
            }
            view.setLayoutParams(layoutParams);
            if (this.A08) {
                if (i == this.A07.size() - 1) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            if (TextUtils.isEmpty(c06c.A0F) && !c06c.A0E() && !TextUtils.isEmpty(c06c.A0O)) {
                TextEmojiLabel textEmojiLabel = c68133Ie.A03;
                textEmojiLabel.setText(A0G(String.format("~%s", c06c.A0O)));
                textEmojiLabel.setVisibility(0);
                return;
            }
            c68133Ie.A03.setVisibility(8);
            return;
        }
        throw null;
    }

    public final CharSequence A0G(String str) {
        String lowerCase = str.toLowerCase();
        String str2 = this.A05;
        int indexOf = lowerCase.indexOf(str2);
        if (str2.length() <= 0 || indexOf < 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, this.A05.length() + indexOf, 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.Filter, X.31V] */
    @Override // android.widget.Filterable
    public Filter getFilter() {
        C31V c31v = this.A03;
        if (c31v == null) {
            ?? r0 = new Filter() { // from class: X.31V
                {
                    C68143If.this = this;
                }

                @Override // android.widget.Filter
                public Filter.FilterResults performFiltering(CharSequence charSequence) {
                    boolean A04;
                    String str;
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    if (charSequence == null) {
                        filterResults.values = new ArrayList();
                        filterResults.count = 0;
                        return filterResults;
                    } else if (charSequence.length() == 0) {
                        List list = C68143If.this.A06;
                        filterResults.values = list;
                        filterResults.count = list.size();
                        return filterResults;
                    } else if (charSequence.toString().startsWith(" ")) {
                        filterResults.values = new ArrayList();
                        filterResults.count = 0;
                        return filterResults;
                    } else if (charSequence.length() - charSequence.toString().replaceAll(" ", "").length() > 1) {
                        filterResults.values = new ArrayList();
                        filterResults.count = 0;
                        return filterResults;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String lowerCase = charSequence.toString().toLowerCase();
                        String charSequence2 = charSequence.toString();
                        C68143If c68143If = C68143If.this;
                        C002301c c002301c = c68143If.A0E;
                        ArrayList A03 = C09940f2.A03(charSequence2, c002301c);
                        for (C06C c06c : c68143If.A06) {
                            if (c06c.A0E()) {
                                A04 = C09940f2.A04(C018708s.A02(c06c, false), A03, c002301c);
                            } else if (!TextUtils.isEmpty(c06c.A0F)) {
                                A04 = C09940f2.A04(c06c.A0F, A03, c002301c);
                            } else {
                                if (!TextUtils.isEmpty(c06c.A0O)) {
                                    if (C09940f2.A04(c06c.A0O, A03, c002301c)) {
                                        arrayList.add(c06c);
                                    }
                                }
                                Jid A032 = c06c.A03(UserJid.class);
                                if (A032 != null && (str = A032.user) != null && str.contains(lowerCase)) {
                                    arrayList.add(c06c);
                                }
                            }
                            if (A04) {
                                arrayList.add(c06c);
                            }
                        }
                        filterResults.values = arrayList;
                        filterResults.count = arrayList.size();
                        return filterResults;
                    }
                }

                @Override // android.widget.Filter
                public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    String str;
                    Set set;
                    C68143If c68143If = C68143If.this;
                    List list = (List) filterResults.values;
                    c68143If.A07 = list;
                    C31W c31w = c68143If.A04;
                    if (c31w != null) {
                        Collections.sort(list, c31w);
                    }
                    List list2 = c68143If.A07;
                    C31W c31w2 = c68143If.A04;
                    int i = -1;
                    if (c31w2 != null && (set = c31w2.A00) != null) {
                        Iterator it = list2.iterator();
                        int i2 = -1;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (!set.contains(((C06C) it.next()).A03(UserJid.class))) {
                                i = i2;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    c68143If.A01 = i;
                    if (charSequence != null) {
                        str = charSequence.toString().toLowerCase();
                    } else {
                        str = "";
                    }
                    c68143If.A05 = str;
                    ((AbstractC04890Mh) c68143If).A01.A00();
                }
            };
            this.A03 = r0;
            return r0;
        }
        return c31v;
    }
}
