package X;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4Hy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C92204Hy extends C4FS {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;

    public C92204Hy(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.payment_card_view, (ViewGroup) this, true);
        setBottomDividerSpaceVisibility(0);
        this.A02 = (TextView) findViewById(R.id.card_name);
        this.A03 = (TextView) findViewById(R.id.card_number);
        this.A01 = (ImageView) findViewById(R.id.card_network_icon);
        this.A00 = (ImageView) findViewById(R.id.card_view_background);
        this.A00.setImageDrawable(new C4AB(context));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00.setClipToOutline(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + ((int) ((View.MeasureSpec.getSize(i) - (getPaddingRight() + getPaddingLeft())) * 0.62f)), 1073741824));
    }

    public void setBottomDividerSpaceVisibility(int i) {
        setPadding(AnonymousClass088.A02(getContext(), 24.0f), 0, AnonymousClass088.A02(getContext(), 24.0f), AnonymousClass088.A02(getContext(), i == 0 ? 24.0f : 0.0f));
    }

    public void setCard(C0N7 c0n7) {
        int A00;
        this.A02.setText(getContext().getString(R.string.fb_pay_card_name, C0N7.A07(c0n7.A01), C0N2.A02(c0n7.A00)));
        this.A03.setText(getContext().getString(R.string.fb_pay_card_number, c0n7.A0A));
        ImageView imageView = this.A01;
        if (c0n7.A01 == 0) {
            A00 = R.drawable.card_default;
        } else {
            A00 = C40841sx.A00(c0n7);
        }
        imageView.setImageResource(A00);
    }

    public void setCardNameTextViewVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public void setCardNetworkIconVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public void setCardNumberTextColor(int i) {
        this.A03.setTextColor(i);
    }
}
