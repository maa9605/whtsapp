package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1ja  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35711ja extends C0TS {
    public final Button A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public C35711ja(View view) {
        super(view);
        C0AT.A0M(view);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.name);
        this.A02 = (TextView) view.findViewById(R.id.description);
        this.A01 = (ImageView) view.findViewById(R.id.image);
        this.A00 = (Button) view.findViewById(R.id.add_contact_btn);
    }
}
