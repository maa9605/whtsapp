package com.whatsapp.payments.ui.invites;

import X.AbstractC005302j;
import X.AnonymousClass486;
import X.C018708s;
import X.C05U;
import X.C05V;
import X.C05W;
import X.C06570Tx;
import X.C0AT;
import X.C0EU;
import X.C0L5;
import X.C0LT;
import X.C0Zn;
import X.C3RA;
import X.C3RB;
import X.C463026g;
import X.C464626x;
import X.C4C4;
import X.C78373jo;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class PaymentInviteFragment extends Hilt_PaymentInviteFragment {
    public View A00;
    public View A01;
    public C05W A02;
    public C018708s A03;
    public C0L5 A04;
    public C464626x A05;
    public C78373jo A06;

    @Override // X.C0BA
    public View A0p(final LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.payment_invite_bottom_sheet, viewGroup, false);
        this.A06 = (C78373jo) new C06570Tx(A0A()).A00(C78373jo.class);
        Bundle bundle2 = super.A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("payment_service");
            ArrayList<AbstractC005302j> parcelableArrayList = bundle2.getParcelableArrayList("user_jids");
            if (parcelableArrayList != null) {
                TextView textView = (TextView) C0AT.A0D(inflate, R.id.invite_button);
                if (parcelableArrayList.size() == 1) {
                    final UserJid userJid = (UserJid) parcelableArrayList.get(0);
                    String A06 = this.A03.A06(this.A02.A0A(userJid));
                    ((TextView) C0AT.A0D(inflate, R.id.payment_invite_bottom_sheet_title)).setText(A0G(R.string.payment_invite_bottom_sheet_title, A06));
                    ((TextView) C0AT.A0D(inflate, R.id.payment_invite_bottom_sheet_body)).setText(A0G(R.string.payment_invite_bottom_sheet_body, A06));
                    textView.setText(R.string.payments_invite_button_text);
                    this.A01 = C0AT.A0D(inflate, R.id.invite_ui_loader);
                    this.A00 = C0AT.A0D(inflate, R.id.invite_ui_content);
                    if (bundle2.getBoolean("requires_sync")) {
                        this.A01.setVisibility(0);
                        this.A00.setVisibility(8);
                        if (!(this instanceof IndiaUpiPaymentInviteFragment)) {
                            throw null;
                        }
                        final IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
                        new C4C4(((Hilt_IndiaUpiPaymentInviteFragment) indiaUpiPaymentInviteFragment).A00, indiaUpiPaymentInviteFragment.A00, indiaUpiPaymentInviteFragment.A01, indiaUpiPaymentInviteFragment.A08, indiaUpiPaymentInviteFragment.A02, indiaUpiPaymentInviteFragment.A07, indiaUpiPaymentInviteFragment.A04, indiaUpiPaymentInviteFragment.A09, indiaUpiPaymentInviteFragment.A06, indiaUpiPaymentInviteFragment.A05, null).A00(userJid, new AnonymousClass486() { // from class: X.4EQ
                            @Override // X.AnonymousClass486
                            public void AIz(C4GI c4gi) {
                                if (c4gi.A03 && !c4gi.A04) {
                                    if (c4gi.A05) {
                                        IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment2 = indiaUpiPaymentInviteFragment;
                                        ((PaymentInviteFragment) indiaUpiPaymentInviteFragment2).A01.setVisibility(8);
                                        ((PaymentInviteFragment) indiaUpiPaymentInviteFragment2).A00.setVisibility(0);
                                        return;
                                    }
                                    IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment3 = indiaUpiPaymentInviteFragment;
                                    C0BA c0ba = indiaUpiPaymentInviteFragment3.A0D;
                                    if (c0ba instanceof DialogFragment) {
                                        ((DialogFragment) c0ba).A10();
                                    }
                                    UserJid userJid2 = userJid;
                                    C019208x c019208x = new C019208x(indiaUpiPaymentInviteFragment3.A00());
                                    String A0G = indiaUpiPaymentInviteFragment3.A0G(R.string.payments_nodal_not_allowed, ((PaymentInviteFragment) indiaUpiPaymentInviteFragment3).A03.A06(((PaymentInviteFragment) indiaUpiPaymentInviteFragment3).A02.A0A(userJid2)));
                                    C019308y c019308y = c019208x.A01;
                                    c019308y.A0E = A0G;
                                    c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3R9
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            dialogInterface.dismiss();
                                        }
                                    });
                                    c019308y.A0J = false;
                                    c019208x.A01();
                                    return;
                                }
                                IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment4 = indiaUpiPaymentInviteFragment;
                                C0BA c0ba2 = indiaUpiPaymentInviteFragment4.A0D;
                                if (c0ba2 instanceof DialogFragment) {
                                    ((DialogFragment) c0ba2).A10();
                                }
                                ((PaymentInviteFragment) indiaUpiPaymentInviteFragment4).A06.A00.A0B(1);
                            }

                            /* JADX WARN: Type inference failed for: r3v0, types: [X.3jk, java.lang.Runnable] */
                            @Override // X.AnonymousClass486
                            public void AJs(C28Q c28q) {
                                IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment2 = indiaUpiPaymentInviteFragment;
                                C0BA c0ba = indiaUpiPaymentInviteFragment2.A0D;
                                if (c0ba instanceof DialogFragment) {
                                    ((DialogFragment) c0ba).A10();
                                }
                                ?? r3 = 0;
                                DialogInterfaceC019408z A02 = new C895547l(indiaUpiPaymentInviteFragment2.A03).A02(indiaUpiPaymentInviteFragment2.A00(), c28q.A00, null, null);
                                if (A02 != null) {
                                    A02.show();
                                    return;
                                }
                                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) indiaUpiPaymentInviteFragment2.A0A();
                                int i2 = c28q.A00;
                                if (i2 == 440) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("PAY: ");
                                    sb.append(activityC02290Ap);
                                    sb.append(" op: ");
                                    sb.append("upi-get-vpa");
                                    sb.append(" tos not accepted; showTosAndFinish");
                                    Log.e(sb.toString());
                                    C90944Da.A02(activityC02290Ap, null, null, false);
                                } else if (i2 == 442) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("PAY: ");
                                    sb2.append(activityC02290Ap);
                                    sb2.append(" op: ");
                                    sb2.append("upi-get-vpa");
                                    sb2.append(" tos v2 not accepted; showTosAndFinish");
                                    Log.e(sb2.toString());
                                    C90944Da.A02(activityC02290Ap, null, null, true);
                                } else if (i2 == 443) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("PAY: ");
                                    sb3.append(activityC02290Ap);
                                    sb3.append(" op: ");
                                    sb3.append("upi-get-vpa");
                                    sb3.append(" payment unsupported for client version");
                                    Log.e(sb3.toString());
                                    if (0 != 0) {
                                        r3.run();
                                    }
                                    Intent intent = new Intent(activityC02290Ap, PaymentsUpdateRequiredActivity.class);
                                    intent.addFlags(335544320);
                                    if (0 != 0) {
                                        r3.A00.A1Z(intent);
                                    }
                                    activityC02290Ap.A14(intent);
                                    activityC02290Ap.finish();
                                } else {
                                    C019208x c019208x = new C019208x(indiaUpiPaymentInviteFragment2.A00());
                                    c019208x.A02(R.string.something_went_wrong);
                                    c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3R8
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i3) {
                                            dialogInterface.dismiss();
                                        }
                                    });
                                    c019208x.A01.A0J = false;
                                    c019208x.A01();
                                }
                            }
                        });
                    }
                } else {
                    AbsListView absListView = (AbsListView) C0AT.A0D(inflate, R.id.selected_items);
                    final ArrayList arrayList = new ArrayList();
                    for (AbstractC005302j abstractC005302j : parcelableArrayList) {
                        arrayList.add(this.A02.A0A(abstractC005302j));
                    }
                    final C0Zn A04 = this.A04.A04(A00());
                    absListView.setAdapter((ListAdapter) new ArrayAdapter(A00(), arrayList) { // from class: X.49Z
                        @Override // android.widget.BaseAdapter, android.widget.Adapter
                        public boolean hasStableIds() {
                            return true;
                        }

                        {
                            PaymentInviteFragment.this = this;
                        }

                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public int getCount() {
                            return arrayList.size();
                        }

                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public Object getItem(int i2) {
                            return arrayList.get(i2);
                        }

                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public View getView(int i2, View view, ViewGroup viewGroup2) {
                            C06C c06c = (C06C) arrayList.get(i2);
                            if (c06c != null) {
                                if (view == null) {
                                    view = layoutInflater.inflate(R.layout.payment_invite_selected_contact, viewGroup2, false);
                                }
                                ((TextView) C0AT.A0D(view, R.id.contact_name)).setText(PaymentInviteFragment.this.A03.A08(c06c, false));
                                ImageView imageView = (ImageView) C0AT.A0D(view, R.id.contact_row_photo);
                                A04.A02(c06c, imageView);
                                C0AT.A0V(imageView, 2);
                                AnonymousClass088.A1W(view, new C0AV(1, R.string.payments_multi_invite_contact_content_description));
                                return view;
                            }
                            throw null;
                        }
                    });
                    absListView.setVisibility(0);
                }
                textView.setOnClickListener(new C3RA(this, parcelableArrayList, i));
                C0AT.A0D(inflate, R.id.back).setOnClickListener(new C3RB(this));
                return inflate;
            }
            throw null;
        }
        throw null;
    }

    public void A0y(List list, int i) {
        C464626x c464626x = this.A05;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            long A05 = c464626x.A01.A05() + 7776000000L;
            C0EU c0eu = c464626x.A04;
            Map A08 = c0eu.A08();
            AbstractMap abstractMap = (AbstractMap) A08;
            Number number = (Number) abstractMap.get(abstractC005302j);
            if (number == null || number.longValue() < A05) {
                abstractMap.put(abstractC005302j, Long.valueOf(A05));
                c0eu.A04().edit().putString("payments_invitee_jids_with_expiry", C0EU.A01(A08)).apply();
            }
            C463026g c463026g = c464626x.A05;
            c463026g.A0G.A07(null, "userActionSendPaymentInvite", null);
            C05U c05u = c463026g.A0K;
            long A052 = c463026g.A03.A05();
            C05V c05v = c05u.A07;
            C0LT c0lt = new C0LT(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), A052);
            c0lt.A00 = i;
            c0lt.A01 = A05;
            c0lt.A0U(8192);
            c463026g.A05.A0Q(c0lt);
        }
        this.A06.A00.A0B(2);
        DialogFragment dialogFragment = (DialogFragment) this.A0D;
        if (dialogFragment != null) {
            dialogFragment.A10();
        }
    }
}
