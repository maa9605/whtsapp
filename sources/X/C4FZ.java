package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4FZ */
/* loaded from: classes3.dex */
public class C4FZ implements C3ZU {
    public View.OnClickListener A00;
    public ImageView A01;

    @Override // X.C3ZU
    public /* synthetic */ void AEh(ViewStub viewStub) {
        C3ZT.A00(this, viewStub);
    }

    public /* synthetic */ void A00(View view) {
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public void A01(Integer num) {
        if (this instanceof C4I1) {
            return;
        }
        if (num == null || 2 != num.intValue()) {
            this.A01.setImageResource(R.drawable.ic_action_arrow_next);
        } else {
            this.A01.setImageResource(R.drawable.input_send);
        }
    }

    @Override // X.C3ZU
    public /* bridge */ /* synthetic */ void A5h(Object obj) {
        if (!(this instanceof C4I1)) {
            A01((Integer) obj);
        }
    }

    @Override // X.C3ZU
    public int AAr() {
        if (!(this instanceof C4I1)) {
            return R.layout.shared_payment_entry_action;
        }
        return R.layout.payment_entry_next_action;
    }

    @Override // X.C3ZU
    public void AQO(View view) {
        if (!(this instanceof C4I1)) {
            ImageView imageView = (ImageView) C0AT.A0D(view, R.id.send_payment_send);
            this.A01 = imageView;
            imageView.setOnClickListener(new C3SD(this));
            return;
        }
        C4I1 c4i1 = (C4I1) this;
        c4i1.A00 = view;
        view.setOnClickListener(new C3SE(c4i1));
        c4i1.A00.setEnabled(false);
        c4i1.A00.setClickable(false);
    }
}
