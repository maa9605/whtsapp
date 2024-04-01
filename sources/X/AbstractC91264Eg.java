package X;

import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;
import com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import java.util.List;

/* renamed from: X.4Eg */
/* loaded from: classes3.dex */
public abstract class AbstractC91264Eg extends C0TS {
    public AbstractC91264Eg(View view) {
        super(view);
    }

    public void A0C(AbstractC900449l abstractC900449l, int i) {
        View peerPaymentTransactionRow;
        if (this instanceof C4HU) {
            ((C4HU) this).A00.setText(((C91294Ej) abstractC900449l).A00);
        } else if (this instanceof C4HT) {
            throw null;
        } else {
            if (this instanceof C4HQ) {
                C4HQ c4hq = (C4HQ) this;
                C91384Es c91384Es = (C91384Es) abstractC900449l;
                c4hq.A01.setImageDrawable(C02180Ae.A0O(c4hq.A0H.getContext(), c91384Es.A00, c91384Es.A01));
                c4hq.A02.setText(c91384Es.A04);
                if (c91384Es.A05) {
                    c4hq.A00.setVisibility(8);
                    return;
                }
                c4hq.A00.setText(c91384Es.A03);
                c4hq.A00.setOnClickListener(c91384Es.A02);
            } else if (this instanceof C4HP) {
                C4HP c4hp = (C4HP) this;
                C91374Er c91374Er = (C91374Er) abstractC900449l;
                c4hp.A01.setText(c91374Er.A00);
                c4hp.A02.setText(c91374Er.A01);
                c4hp.A00.setVisibility(0);
            } else if (this instanceof C4HO) {
                C4HO c4ho = (C4HO) this;
                c4ho.A01.setText(((C91364Eq) abstractC900449l).A00);
                C02180Ae.A17(c4ho.A00, C02160Ac.A00(c4ho.A0H.getContext(), R.color.fb_pay_hub_icon_tint));
            } else if (this instanceof C4HN) {
                C4HN c4hn = (C4HN) this;
                C91354Ep c91354Ep = (C91354Ep) abstractC900449l;
                byte[] bArr = c91354Ep.A09;
                if (bArr != null) {
                    c4hn.A01.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                }
                c4hn.A04.setText(c91354Ep.A03);
                String str = c91354Ep.A04;
                if (str != null) {
                    c4hn.A03.setText(str);
                }
                c4hn.A03.setVisibility(c91354Ep.A04 == null ? 8 : 0);
                if (c91354Ep.A08) {
                    c4hn.A02.setVisibility(0);
                    ((ImageView) C0AT.A0D(c4hn.A02, R.id.warning_icon)).setImageDrawable(C02180Ae.A0O(c4hn.A0H.getContext(), c91354Ep.A00, c91354Ep.A01));
                    ((TextView) C0AT.A0D(c4hn.A02, R.id.warning_message)).setText(c91354Ep.A06);
                    if (c91354Ep.A07) {
                        c4hn.A00.setVisibility(0);
                        c4hn.A00.setText(c91354Ep.A05);
                        c4hn.A00.setOnClickListener(c91354Ep.A02);
                        return;
                    }
                    c4hn.A00.setVisibility(8);
                    return;
                }
                c4hn.A02.setVisibility(8);
            } else if (!(this instanceof C4HM)) {
                if (this instanceof C92324Il) {
                    C4HE c4he = (C4HE) this;
                    C91344Eo c91344Eo = (C91344Eo) abstractC900449l;
                    ImageView imageView = c4he.A03;
                    View view = c4he.A0H;
                    C02180Ae.A17(imageView, C02160Ac.A00(view.getContext(), R.color.fb_pay_hub_icon_tint));
                    String str2 = c91344Eo.A02;
                    String str3 = c91344Eo.A01;
                    View.OnClickListener onClickListener = c91344Eo.A00;
                    c4he.A08 = str2;
                    c4he.A07 = str3;
                    c4he.A00 = onClickListener;
                    List list = c4he.A09;
                    list.clear();
                    c4he.A04.removeAllViews();
                    list.addAll(c91344Eo.A03);
                    c4he.A0D();
                    for (int i2 = 0; i2 < Math.min(list.size(), 2); i2++) {
                        AnonymousClass093 anonymousClass093 = (AnonymousClass093) list.get(i2);
                        LinearLayout linearLayout = c4he.A04;
                        int size = list.size();
                        C91484Fc c91484Fc = new C91484Fc(view.getContext());
                        if (anonymousClass093 != null) {
                            long j = anonymousClass093.A04;
                            if (j > 0) {
                                c91484Fc.A01.setText(C002501g.A0D(c91484Fc.A03, c91484Fc.A02.A06(j)));
                            }
                            c91484Fc.A00.setText(c91484Fc.A04.A0C(anonymousClass093));
                            int i3 = size - 1;
                            View findViewById = c91484Fc.findViewById(R.id.divider);
                            if (i2 < i3) {
                                findViewById.setVisibility(0);
                            } else {
                                findViewById.setVisibility(8);
                            }
                            linearLayout.addView(c91484Fc);
                        } else {
                            throw null;
                        }
                    }
                } else if (!(this instanceof C92314Ik)) {
                    if (!(this instanceof C4HI)) {
                        C4HF c4hf = (C4HF) this;
                        C91284Ei c91284Ei = (C91284Ei) abstractC900449l;
                        ImageView imageView2 = c4hf.A00;
                        View view2 = c4hf.A0H;
                        imageView2.setImageDrawable(C02180Ae.A0O(view2.getContext(), c91284Ei.A00, c91284Ei.A01));
                        c4hf.A01.setText(c91284Ei.A03);
                        view2.setOnClickListener(c91284Ei.A02);
                        return;
                    }
                    C4HI c4hi = (C4HI) this;
                    C92004Hd c92004Hd = (C92004Hd) abstractC900449l;
                    c4hi.A00.setText(c92004Hd.A01);
                    c4hi.A0H.setOnClickListener(c92004Hd.A00);
                } else {
                    C92314Ik c92314Ik = (C92314Ik) this;
                    C92014He c92014He = (C92014He) abstractC900449l;
                    c92314Ik.A00 = c92014He.A01;
                    String str4 = c92014He.A04;
                    if (str4 != null) {
                        ((C4HE) c92314Ik).A06.setText(str4);
                        ((C4HE) c92314Ik).A06.setVisibility(0);
                    }
                    ImageView imageView3 = ((C4HE) c92314Ik).A03;
                    View view3 = c92314Ik.A0H;
                    C02180Ae.A17(imageView3, C02160Ac.A00(view3.getContext(), R.color.settings_icon));
                    String str5 = c92014He.A03;
                    String str6 = c92014He.A02;
                    View.OnClickListener onClickListener2 = c92014He.A00;
                    ((C4HE) c92314Ik).A08 = str5;
                    ((C4HE) c92314Ik).A07 = str6;
                    ((C4HE) c92314Ik).A00 = onClickListener2;
                    List list2 = ((C4HE) c92314Ik).A09;
                    list2.clear();
                    ((C4HE) c92314Ik).A04.removeAllViews();
                    list2.addAll(c92014He.A05);
                    c92314Ik.A0D();
                    for (int i4 = 0; i4 < Math.min(list2.size(), 2); i4++) {
                        AnonymousClass093 anonymousClass0932 = (AnonymousClass093) list2.get(i4);
                        LinearLayout linearLayout2 = ((C4HE) c92314Ik).A04;
                        int size2 = list2.size();
                        if (anonymousClass0932.A02 == 1000 && anonymousClass0932.A0N) {
                            peerPaymentTransactionRow = LayoutInflater.from(view3.getContext()).inflate(R.layout.payment_transaction_interop_shimmer, (ViewGroup) linearLayout2, false);
                        } else {
                            peerPaymentTransactionRow = new PeerPaymentTransactionRow(view3.getContext());
                        }
                        if (peerPaymentTransactionRow instanceof PeerPaymentTransactionRow) {
                            PeerPaymentTransactionRow peerPaymentTransactionRow2 = (PeerPaymentTransactionRow) peerPaymentTransactionRow;
                            peerPaymentTransactionRow2.A0N = c92314Ik.A00;
                            peerPaymentTransactionRow2.A5j(anonymousClass0932);
                        } else if (peerPaymentTransactionRow instanceof PaymentInteropShimmerRow) {
                            ((PaymentInteropShimmerRow) peerPaymentTransactionRow).A5j(anonymousClass0932);
                        }
                        int i5 = size2 - 1;
                        View findViewById2 = peerPaymentTransactionRow.findViewById(R.id.divider);
                        if (i4 < i5) {
                            findViewById2.setVisibility(0);
                        } else {
                            findViewById2.setVisibility(8);
                        }
                        linearLayout2.addView(peerPaymentTransactionRow);
                    }
                }
            }
        }
    }
}
