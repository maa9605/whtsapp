package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;
import com.whatsapp.WaTextView;

/* renamed from: X.4HZ  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4HZ extends AbstractC91274Eh {
    public final WaButton A00;
    public final WaTextView A01;

    public C4HZ(View view) {
        super(view);
        this.A01 = (WaTextView) C0AT.A0D(view, R.id.send_again_descriptions_textview);
        this.A00 = (WaButton) C0AT.A0D(view, R.id.send_again_btn);
    }
}
