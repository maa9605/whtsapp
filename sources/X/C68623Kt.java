package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3Kt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68623Kt extends AbstractC67103Ef {
    public C06C A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final /* synthetic */ C2GV A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68623Kt(C2GV c2gv, View view) {
        super(view);
        this.A04 = c2gv;
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.name);
        this.A01 = (ImageView) view.findViewById(R.id.avatar);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.push_name);
        C0AT.A0V(this.A01, 2);
    }
}
