package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I0_1;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.Hilt_CallsFragment;
import com.whatsapp.voipcalling.Voip;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.261 */
/* loaded from: classes2.dex */
public class AnonymousClass261 extends BaseAdapter implements Filterable {
    public Filter A00;
    public final /* synthetic */ CallsFragment A01;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public AnonymousClass261(CallsFragment callsFragment) {
        this.A01 = callsFragment;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A01.A0W.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        Filter filter = this.A00;
        if (filter == null) {
            C53282cF c53282cF = new C53282cF(this.A01);
            this.A00 = c53282cF;
            return c53282cF;
        }
        return filter;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A01.A0W.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return this.A01.A0W.get(i).hashCode();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return ((InterfaceC53232cA) this.A01.A0W.get(i)).AAh();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        AbstractC53222c9 abstractC53222c9;
        int i2;
        CallsFragment callsFragment;
        int i3;
        int i4;
        View view2 = view;
        CallsFragment callsFragment2 = this.A01;
        final InterfaceC53232cA interfaceC53232cA = (InterfaceC53232cA) callsFragment2.A0W.get(i);
        int AAh = interfaceC53232cA.AAh();
        if (AAh != 0) {
            if (AAh == 1 || AAh == 2) {
                if (view == null) {
                    boolean A0C = callsFragment2.A0K.A0C(367);
                    int i5 = R.layout.calls_row_legacy;
                    if (A0C) {
                        i5 = R.layout.calls_row;
                    }
                    view2 = callsFragment2.A09().getLayoutInflater().inflate(i5, viewGroup, false);
                    if (AAh == 1) {
                        abstractC53222c9 = new C54842jR(callsFragment2.A0S, callsFragment2.A08, callsFragment2.A0A, callsFragment2.A0M, callsFragment2.A0C, callsFragment2, view2);
                    } else {
                        abstractC53222c9 = new C53242cB(callsFragment2.A05, callsFragment2.A0S, callsFragment2.A08, callsFragment2.A0E, callsFragment2.A0A, callsFragment2.A0H, callsFragment2.A0M, callsFragment2.A0J, callsFragment2.A0C, callsFragment2.A0B, callsFragment2, view2);
                    }
                    view2.setTag(abstractC53222c9);
                } else {
                    abstractC53222c9 = (AbstractC53222c9) view2.getTag();
                }
                C0AT.A0c(view2, new C0AS() { // from class: X.2jV
                    {
                        AnonymousClass261.this = this;
                    }

                    @Override // X.C0AS
                    public void A04(View view3, C08420bS c08420bS) {
                        String string;
                        super.A01.onInitializeAccessibilityNodeInfo(view3, c08420bS.A02);
                        if (interfaceC53232cA.AAh() == 1) {
                            string = AnonymousClass261.this.A01.A09().getString(R.string.contacts_row_action_click);
                        } else {
                            string = AnonymousClass261.this.A01.A09().getString(R.string.calls_row_action_click);
                        }
                        c08420bS.A06(new C08440bU(16, string));
                    }
                });
                abstractC53222c9.A00 = interfaceC53232cA;
            } else if (AAh != 3) {
                Log.e("callsfragment/callsadapter/getview Unknown list item type ");
                C000700j.A08(false, "Unknown list item type");
                return null;
            } else {
                if (view == null) {
                    view2 = callsFragment2.A09().getLayoutInflater().inflate(R.layout.joinable_calls_row, viewGroup, false);
                    abstractC53222c9 = new C54832jQ(callsFragment2.A05, callsFragment2, callsFragment2.A0S, callsFragment2.A08, callsFragment2.A0A, callsFragment2.A0M, callsFragment2.A0J, view2, callsFragment2.A0B);
                    view2.setTag(abstractC53222c9);
                } else {
                    abstractC53222c9 = (AbstractC53222c9) view2.getTag();
                }
                abstractC53222c9.A00 = interfaceC53232cA;
            }
            if (abstractC53222c9 instanceof C54832jQ) {
                C54832jQ c54832jQ = (C54832jQ) abstractC53222c9;
                C53202c3 c53202c3 = ((C54862jT) ((AbstractC53222c9) c54832jQ).A00).A00;
                C05W c05w = c54832jQ.A06;
                C018708s c018708s = c54832jQ.A07;
                CallsFragment callsFragment3 = c54832jQ.A0B;
                List A01 = CallsFragment.A01(c53202c3, c05w, c018708s, callsFragment3.A0V, c54832jQ.A05);
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (true) {
                    AbstractList abstractList = (AbstractList) A01;
                    if (i6 >= abstractList.size()) {
                        break;
                    }
                    C06C A09 = c05w.A09((AbstractC005302j) abstractList.get(i6));
                    if (A09 != null && i6 < 3) {
                        arrayList.add(A09);
                    }
                    i6++;
                }
                c54832jQ.A04.A00(arrayList, c54832jQ.A09, c54832jQ.A08);
                Context context = c54832jQ.A00.getContext();
                ArrayList arrayList2 = c53202c3.A03;
                String A00 = CallsFragment.A00(context, A01, ((C0D3) arrayList2.get(0)).A05, c05w, c018708s, c54832jQ.A0A);
                c54832jQ.A03.A04(A00, callsFragment3.A0V);
                ImageView imageView = c54832jQ.A01;
                boolean A05 = c53202c3.A05();
                int i7 = R.drawable.ic_voip_calls_tab_voice_indicator;
                if (A05) {
                    i7 = R.drawable.ic_voip_calls_tab_video_indicator;
                }
                imageView.setImageResource(i7);
                c54832jQ.A00.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I0_1(c54832jQ, c53202c3, 3));
                boolean equals = AnonymousClass029.A0s(((C0D3) arrayList2.get(0)).A03().A02).equals(Voip.getCurrentCallId());
                Context context2 = c54832jQ.A00.getContext();
                View view3 = c54832jQ.A00;
                boolean A052 = c53202c3.A05();
                int i8 = R.string.voip_joinable_voice_call_log_description;
                if (A052) {
                    i8 = R.string.voip_joinable_video_call_log_description;
                }
                String string = context2.getString(i8, A00);
                if (equals) {
                    i2 = R.string.voip_joinable_active_call_log_click_action_description;
                } else {
                    boolean A053 = c53202c3.A05();
                    i2 = R.string.voip_joinable_voice_call_log_click_action_description;
                    if (A053) {
                        i2 = R.string.voip_joinable_video_call_log_click_action_description;
                    }
                }
                C02180Ae.A14(view3, string, context2.getString(i2), false);
                TextView textView = c54832jQ.A02;
                if (equals) {
                    textView.setText(R.string.voip_joinable_ongoing_tap_to_return);
                    return view2;
                }
                textView.setText(R.string.voip_joinable_ongoing);
                return view2;
            } else if (!(abstractC53222c9 instanceof C54842jR)) {
                final C53242cB c53242cB = (C53242cB) abstractC53222c9;
                final C53202c3 c53202c32 = ((C53252cC) ((AbstractC53222c9) c53242cB).A00).A00;
                C06C A02 = c53202c32.A02();
                if (A02 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(CallsFragment.class.getName());
                    sb.append(C003101m.A07(A02.A02()));
                    sb.append(" ");
                    sb.append(c53202c32.A01());
                    String obj = sb.toString();
                    ImageView imageView2 = c53242cB.A04;
                    C0AT.A0e(imageView2, obj);
                    boolean A04 = c53202c32.A04();
                    MultiContactThumbnail multiContactThumbnail = c53242cB.A0K;
                    multiContactThumbnail.setVisibility(A04 ? 0 : 8);
                    imageView2.setVisibility(A04 ? 8 : 0);
                    C06030Rg c06030Rg = c53242cB.A0A;
                    TextEmojiLabel textEmojiLabel = c06030Rg.A01;
                    textEmojiLabel.setSingleLine(!A04);
                    if (A04) {
                        ArrayList arrayList3 = new ArrayList();
                        C05W c05w2 = c53242cB.A0C;
                        C018708s c018708s2 = c53242cB.A0D;
                        callsFragment = c53242cB.A0M;
                        List A012 = CallsFragment.A01(c53202c32, c05w2, c018708s2, callsFragment.A0V, c53242cB.A09);
                        int i9 = 0;
                        while (true) {
                            AbstractList abstractList2 = (AbstractList) A012;
                            if (i9 >= abstractList2.size()) {
                                break;
                            }
                            C06C A092 = c05w2.A09((AbstractC005302j) abstractList2.get(i9));
                            if (A092 != null && i9 < 3) {
                                arrayList3.add(A092);
                            }
                            i9++;
                        }
                        textEmojiLabel.setMaxLines(2);
                        c06030Rg.A04(CallsFragment.A00(multiContactThumbnail.getContext(), A012, ((C0D3) c53202c32.A03.get(0)).A05, c05w2, c018708s2, c53242cB.A0J), callsFragment.A0V);
                        multiContactThumbnail.A00(arrayList3, c53242cB.A0F, c53242cB.A0E);
                    } else {
                        c53242cB.A0G.A02(A02, imageView2);
                        callsFragment = c53242cB.A0M;
                        c06030Rg.A03(A02, callsFragment.A0V);
                    }
                    TextView textView2 = c53242cB.A08;
                    C002301c c002301c = c53242cB.A0I;
                    textView2.setText(AnonymousClass029.A0U(c002301c, c53202c32.A01()));
                    int size = c53202c32.A03.size();
                    if (size > 1) {
                        TextView textView3 = c53242cB.A07;
                        textView3.setText(String.format(c002301c.A0I(), "(%d)", Integer.valueOf(size)));
                        textView3.setVisibility(0);
                    } else {
                        c53242cB.A07.setVisibility(8);
                    }
                    boolean contains = callsFragment.A0h.contains(c53202c32.A03());
                    boolean remove = callsFragment.A0i.remove(c53202c32.A03());
                    View view4 = c53242cB.A01;
                    view4.setBackgroundResource(contains ? R.color.home_row_selection : 0);
                    view4.setSelected(contains);
                    SelectionCheckView selectionCheckView = c53242cB.A0B;
                    selectionCheckView.A03(contains, remove);
                    selectionCheckView.setVisibility(contains ? 0 : 8);
                    C0AT.A0e(imageView2, obj);
                    View$OnClickListenerC54852jS view$OnClickListenerC54852jS = new View$OnClickListenerC54852jS(callsFragment, ((AbstractC53222c9) c53242cB).A00, c53242cB);
                    View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: X.3bl
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view5) {
                            C53242cB c53242cB2 = c53242cB;
                            C53202c3 c53202c33 = c53202c32;
                            CallsFragment callsFragment4 = c53242cB2.A0M;
                            if (!callsFragment4.A0Y) {
                                Log.i("callsfragment/fillcallgroupview/longclicklistener Ignoring long click");
                                return true;
                            }
                            callsFragment4.A16(c53202c33, c53242cB2);
                            return true;
                        }
                    };
                    imageView2.setOnClickListener(view$OnClickListenerC54852jS);
                    imageView2.setOnLongClickListener(onLongClickListener);
                    multiContactThumbnail.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(c53242cB, 10));
                    multiContactThumbnail.setOnLongClickListener(onLongClickListener);
                    int A002 = c53202c32.A00();
                    if (A002 == 0) {
                        i3 = R.drawable.ic_call_outgoing;
                    } else if (A002 != 1) {
                        i3 = R.drawable.ic_call_missed;
                        if (A002 != 2) {
                            i3 = 0;
                        }
                    } else {
                        i3 = R.drawable.ic_call_incoming;
                    }
                    ImageView imageView3 = c53242cB.A03;
                    imageView3.setImageResource(i3);
                    C02180Ae.A17(imageView3, C02160Ac.A00(callsFragment.A00(), C02180Ae.A01(i3)));
                    ContextWrapper contextWrapper = ((Hilt_CallsFragment) callsFragment).A00;
                    int A003 = c53202c32.A00();
                    if (A003 == 0) {
                        i4 = R.string.outgoing_call;
                    } else if (A003 != 1) {
                        i4 = R.string.missed_call;
                        if (A003 != 2) {
                            i4 = 0;
                        }
                    } else {
                        i4 = R.string.incoming_call;
                    }
                    imageView3.setContentDescription(contextWrapper.getString(i4));
                    ImageView imageView4 = c53242cB.A06;
                    imageView4.setTag(c53242cB);
                    AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky = c53242cB.A0L;
                    imageView4.setOnClickListener(abstractView$OnClickListenerC49532Ky);
                    View.OnTouchListener onTouchListener = c53242cB.A00;
                    imageView4.setOnTouchListener(onTouchListener);
                    ImageView imageView5 = c53242cB.A05;
                    imageView5.setTag(c53242cB);
                    imageView5.setOnClickListener(abstractView$OnClickListenerC49532Ky);
                    imageView5.setOnTouchListener(onTouchListener);
                    imageView4.setVisibility(8);
                    imageView5.setVisibility(8);
                    if (c53202c32.A05()) {
                        imageView5.setVisibility(0);
                    } else {
                        imageView4.setVisibility(0);
                    }
                    c53242cB.A02.setVisibility(i != callsFragment.A0W.size() - 1 ? 0 : 8);
                    return view2;
                }
                throw null;
            } else {
                C54842jR c54842jR = (C54842jR) abstractC53222c9;
                C06C A0A = c54842jR.A0A.A0A(((C53272cE) ((AbstractC53222c9) c54842jR).A00).A00);
                C0Zn c0Zn = c54842jR.A0B;
                ImageView imageView6 = c54842jR.A03;
                c0Zn.A02(A0A, imageView6);
                CallsFragment callsFragment4 = c54842jR.A0D;
                imageView6.setOnClickListener(new View$OnClickListenerC54852jS(callsFragment4, ((AbstractC53222c9) c54842jR).A00, c54842jR));
                imageView6.setOnLongClickListener(null);
                C06030Rg c06030Rg2 = c54842jR.A08;
                c06030Rg2.A03(A0A, callsFragment4.A0V);
                c06030Rg2.A01.setSingleLine(true);
                c54842jR.A05.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I0_1(c54842jR, A0A, 1));
                c54842jR.A04.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I0_1(c54842jR, A0A, 0));
                c54842jR.A01.setVisibility(i == callsFragment4.A0W.size() - 1 ? 8 : 0);
                return view2;
            }
        }
        if (view == null) {
            view2 = callsFragment2.A09().getLayoutInflater().inflate(R.layout.calls_tab_list_section, viewGroup, false);
            view2.setEnabled(false);
        }
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view2.getLayoutParams();
        layoutParams.height = -1;
        view2.setLayoutParams(layoutParams);
        TextView textView4 = (TextView) view2.findViewById(R.id.title);
        C003301p.A06(textView4);
        textView4.setText(((C54872jU) interfaceC53232cA).A01);
        view2.findViewById(R.id.list_section_divider).setVisibility(i == 0 ? 8 : 0);
        return view2;
    }
}
