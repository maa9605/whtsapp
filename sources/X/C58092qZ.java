package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.2qZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58092qZ {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final SelectionCheckView A03;

    public C58092qZ(View view) {
        this.A00 = (ImageView) view.findViewById(R.id.contactpicker_row_photo);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.name);
        this.A01 = textEmojiLabel;
        C0AT.A0V(textEmojiLabel, 2);
        C003301p.A06(this.A01);
        this.A03 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.phone_number);
    }
}
