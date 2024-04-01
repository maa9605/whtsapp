package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3DI  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3DI extends C0TS {
    public ImageView A00;
    public TextEmojiLabel A01;
    public TextEmojiLabel A02;
    public C06030Rg A03;

    public C3DI(C018708s c018708s, C2AR c2ar, View view) {
        super(view);
        this.A03 = new C06030Rg(view, (int) R.id.name, c018708s, c2ar);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.status);
        this.A00 = (ImageView) view.findViewById(R.id.avatar);
        view.findViewById(R.id.divider);
        view.findViewById(R.id.invite);
        this.A01 = (TextEmojiLabel) view.findViewById(R.id.push_name);
        C0AT.A0V(this.A00, 2);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setFocusable(true);
        view.setClickable(true);
    }
}
