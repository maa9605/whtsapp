package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.3Hw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class View$OnClickListenerC68053Hw extends C0TS implements View.OnClickListener {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final SelectionCheckView A04;
    public final /* synthetic */ C48732Gl A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC68053Hw(C48732Gl c48732Gl, View view) {
        super(view);
        this.A05 = c48732Gl;
        this.A01 = view;
        this.A00 = view.findViewById(R.id.filter_thumb);
        this.A02 = (ImageView) view.findViewById(R.id.filter_thumb_image);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A03 = (TextView) view.findViewById(R.id.filter_name);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int A00 = A00();
        C48732Gl c48732Gl = this.A05;
        C48702Gi c48702Gi = c48732Gl.A0A;
        int i = c48702Gi.A02;
        if ((A00 <= 0 || c48732Gl.A01[A00 - 1] != null) && A00 != i) {
            c48702Gi.A05(A00, new RunnableEBaseShape1S0101000_I1(this, A00, 2), new RunnableEBaseShape1S0101000_I1(this, A00, 3));
        }
    }
}
