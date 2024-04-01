package X;

import android.view.View;
import android.widget.RadioButton;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2io  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54472io extends AbstractC54482ip {
    public final RadioButton A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final /* synthetic */ C54492iq A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54472io(C54492iq c54492iq, View view) {
        super(view);
        this.A03 = c54492iq;
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.select_list_item_title);
        this.A01 = (TextEmojiLabel) view.findViewById(R.id.select_list_item_description);
        this.A00 = (RadioButton) view.findViewById(R.id.select_list_item_radio_button);
        view.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 29));
    }
}
