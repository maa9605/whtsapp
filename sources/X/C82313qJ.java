package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3qJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82313qJ extends C0TS {
    public UserJid A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public C82313qJ(View view) {
        super(view);
        ImageView imageView = (ImageView) view.findViewById(R.id.contact_photo);
        this.A01 = imageView;
        imageView.setEnabled(false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.contact_name);
        this.A03 = textEmojiLabel;
        C003301p.A06(textEmojiLabel);
        this.A02 = (TextView) view.findViewById(R.id.date_time);
    }
}
