package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4AC */
/* loaded from: classes3.dex */
public abstract class C4AC extends LinearLayout {
    public int A00;
    public View.OnClickListener A01;
    public ViewGroup A02;
    public FrameLayout A03;
    public ImageView A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public CharSequence A08;
    public CharSequence A09;
    public final List A0A;

    public C4AC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = new ArrayList();
        this.A00 = 2;
        LayoutInflater.from(context).inflate(R.layout.payment_expandable_listview, (ViewGroup) this, true);
        setOrientation(1);
        this.A07 = (TextView) C0AT.A0D(this, R.id.header);
        this.A02 = (ViewGroup) C0AT.A0D(this, R.id.see_more_container);
        this.A04 = (ImageView) C0AT.A0D(this, R.id.see_more_icon);
        this.A06 = (TextView) C0AT.A0D(this, R.id.see_more_text);
        this.A03 = (FrameLayout) C0AT.A0D(this, R.id.custom_empty_view_container);
        this.A05 = (LinearLayout) C0AT.A0D(this, R.id.list_item_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C69133Ng.A1p);
            try {
                this.A00 = obtainStyledAttributes.getInt(2, 2);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId > 0) {
                    this.A04.setImageDrawable(context.getResources().getDrawable(resourceId));
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 > 0) {
                    this.A06.setText(resourceId2);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void A00(List list) {
        View peerPaymentTransactionRow;
        List list2 = this.A0A;
        list2.clear();
        this.A05.removeAllViews();
        if (list.isEmpty()) {
            if (this.A03.getChildCount() > 0) {
                this.A03.setVisibility(0);
                this.A02.setVisibility(8);
            } else {
                this.A02.setVisibility(0);
                this.A06.setText(this.A08);
                this.A02.setOnClickListener(null);
            }
        } else {
            this.A03.setVisibility(8);
            if (list.size() > this.A00) {
                this.A02.setVisibility(0);
                this.A06.setText(this.A09);
                this.A02.setOnClickListener(this.A01);
            } else {
                this.A02.setVisibility(8);
            }
        }
        list2.addAll(list.subList(0, Math.min(list.size(), this.A00)));
        for (int i = 0; i < list2.size(); i++) {
            TransactionsExpandableView transactionsExpandableView = (TransactionsExpandableView) this;
            AnonymousClass093 anonymousClass093 = (AnonymousClass093) list.get(i);
            C4AN c4an = transactionsExpandableView.A00;
            if (c4an != null) {
                if (anonymousClass093.A02 == 1000 && anonymousClass093.A0N) {
                    peerPaymentTransactionRow = LayoutInflater.from(c4an.A00).inflate(R.layout.payment_transaction_interop_shimmer, (ViewGroup) transactionsExpandableView, false);
                } else {
                    peerPaymentTransactionRow = new PeerPaymentTransactionRow(c4an.A00, c4an.A01);
                }
                Object obj = list.get(i);
                int size = list2.size();
                if (transactionsExpandableView.A00 != null) {
                    ((C4AE) peerPaymentTransactionRow).A5j(obj);
                    int i2 = size - 1;
                    View findViewById = peerPaymentTransactionRow.findViewById(R.id.divider);
                    if (i < i2) {
                        findViewById.setVisibility(0);
                    } else {
                        findViewById.setVisibility(8);
                    }
                    this.A05.addView(peerPaymentTransactionRow);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public ImageView getSeeMoreImageView() {
        return this.A04;
    }

    public int getSizeLimit() {
        return this.A00;
    }

    public void setCustomEmptyView(View view) {
        this.A03.addView(view);
    }

    public void setTitle(CharSequence charSequence) {
        this.A07.setText(charSequence);
        this.A07.setVisibility(0);
    }
}
