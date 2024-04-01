package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4HE */
/* loaded from: classes3.dex */
public abstract class C4HE extends AbstractC91264Eg {
    public View.OnClickListener A00;
    public ViewGroup A01;
    public FrameLayout A02;
    public ImageView A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public CharSequence A07;
    public CharSequence A08;
    public final List A09;

    public C4HE(View view) {
        super(view);
        this.A09 = new ArrayList();
        View view2 = this.A0H;
        this.A06 = (TextView) C0AT.A0D(view2, R.id.header);
        this.A01 = (ViewGroup) C0AT.A0D(view2, R.id.see_more_container);
        this.A03 = (ImageView) C0AT.A0D(view2, R.id.see_more_icon);
        this.A05 = (TextView) C0AT.A0D(view2, R.id.see_more_text);
        this.A02 = (FrameLayout) C0AT.A0D(view2, R.id.custom_empty_view_container);
        this.A04 = (LinearLayout) C0AT.A0D(view2, R.id.list_item_container);
    }

    public void A0D() {
        List list = this.A09;
        if (list.size() > 2) {
            this.A01.setVisibility(0);
            this.A05.setText(this.A08);
            this.A01.setOnClickListener(this.A00);
        } else if (list.isEmpty()) {
            if (this.A02.getChildCount() > 0) {
                this.A02.setVisibility(0);
                return;
            }
            this.A01.setVisibility(0);
            this.A05.setText(this.A07);
            this.A01.setOnClickListener(null);
        } else {
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
        }
    }
}
