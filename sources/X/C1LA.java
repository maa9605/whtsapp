package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1LA */
/* loaded from: classes.dex */
public class C1LA {
    public View A00;
    public Runnable A01;

    public void A00(int i, String str, final View.OnClickListener onClickListener) {
        ((TextView) C0AT.A0D(this.A00, R.id.share_link_action_item_text)).setText(str);
        ((ImageView) C0AT.A0D(this.A00, R.id.share_link_action_item_icon)).setImageDrawable(C02160Ac.A03(this.A00.getContext(), i));
        this.A00.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1jC
            {
                C1LA.this = this;
            }

            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                Runnable runnable = C1LA.this.A01;
                if (runnable != null) {
                    runnable.run();
                }
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        });
    }
}
