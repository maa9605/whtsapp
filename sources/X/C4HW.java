package X;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4HW  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HW extends AbstractC91274Eh {
    public final View A00;
    public final Button A01;
    public final TextView A02;
    public final C2OU A03;

    public C4HW(C2OU c2ou, View view) {
        super(view);
        this.A03 = c2ou;
        C0AT.A0D(view, R.id.request_cancel_button);
        this.A01 = (Button) C0AT.A0D(view, R.id.retry_withdrawal_button);
        this.A00 = C0AT.A0D(view, R.id.action_buttons_container);
        this.A02 = (TextView) C0AT.A0D(view, R.id.short_description_text);
    }
}
