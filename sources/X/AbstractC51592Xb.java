package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Xb */
/* loaded from: classes2.dex */
public abstract class AbstractC51592Xb extends FrameLayout implements AnonymousClass005 {
    public ViewGroup A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public TextView A03;
    public C002301c A04;
    public C2UB A05;
    public boolean A06;

    public abstract int getNegativeButtonTextResId();

    public abstract int getPositiveButtonIconResId();

    public abstract int getPositiveButtonTextResId();

    public AbstractC51592Xb(Context context) {
        super(context);
        A00();
        FrameLayout.inflate(context, R.layout.conversation_footer, this);
        this.A00 = (ViewGroup) findViewById(R.id.content);
        this.A03 = (TextView) findViewById(R.id.header);
        this.A02 = (ViewGroup) findViewById(R.id.positive_btn);
        this.A01 = (ViewGroup) findViewById(R.id.negative_btn);
        ((ImageView) findViewById(R.id.positive_btn_icon)).setImageResource(getPositiveButtonIconResId());
        TextView textView = (TextView) findViewById(R.id.positive_btn_text);
        C003301p.A06(textView);
        textView.setText(getPositiveButtonTextResId());
        TextView textView2 = (TextView) findViewById(R.id.negative_btn_text);
        C003301p.A06(textView2);
        textView2.setText(getNegativeButtonTextResId());
    }

    public void A00() {
        if (this instanceof AbstractC51652Xh) {
            AbstractC51652Xh abstractC51652Xh = (AbstractC51652Xh) this;
            if (abstractC51652Xh.A00) {
                return;
            }
            abstractC51652Xh.A00 = true;
            ((AbstractC07960aN) abstractC51652Xh.generatedComponent()).A1g((C51642Xg) abstractC51652Xh);
        } else if (!(this instanceof AbstractC51632Xf)) {
            if (this.A06) {
                return;
            }
            this.A06 = true;
            ((AbstractC07960aN) generatedComponent()).A1d(this);
        } else {
            AbstractC51632Xf abstractC51632Xf = (AbstractC51632Xf) this;
            if (abstractC51632Xf.A00) {
                return;
            }
            abstractC51632Xf.A00 = true;
            ((AbstractC07960aN) abstractC51632Xf.generatedComponent()).A1f((C51622Xe) abstractC51632Xf);
        }
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A05;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A05 = c2ub;
        }
        return c2ub.generatedComponent();
    }
}
