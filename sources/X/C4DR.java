package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;

/* renamed from: X.4DR  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4DR extends C0TS {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final /* synthetic */ IndiaUpiBankPickerActivity A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4DR(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, View view) {
        super(view);
        this.A03 = indiaUpiBankPickerActivity;
        this.A01 = (ImageView) view.findViewById(R.id.provider_icon);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.bank_name);
        this.A00 = view.findViewById(R.id.divider);
    }
}
