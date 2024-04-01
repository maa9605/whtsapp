package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.4Ha  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91974Ha extends AbstractC91274Eh {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final WaTextView A04;
    public final C02E A05;

    public C91974Ha(C02E c02e, View view) {
        super(view);
        this.A05 = c02e;
        this.A00 = view.getContext();
        this.A04 = (WaTextView) C0AT.A0D(view, R.id.status_icon);
        this.A01 = (TextView) C0AT.A0D(view, R.id.transaction_status);
        this.A02 = (TextView) C0AT.A0D(view, R.id.transaction_time);
        this.A03 = (TextEmojiLabel) C0AT.A0D(view, R.id.status_error_text);
    }
}
