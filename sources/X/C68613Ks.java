package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3Ks  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68613Ks extends AbstractC67103Ef {
    public C06C A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final /* synthetic */ C2GV A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68613Ks(C2GV c2gv, View view) {
        super(view);
        this.A06 = c2gv;
        this.A04 = (TextEmojiLabel) view.findViewById(R.id.name);
        this.A02 = (TextView) view.findViewById(R.id.status);
        this.A03 = (TextView) view.findViewById(R.id.time_left);
        this.A01 = (ImageView) view.findViewById(R.id.avatar);
        this.A05 = (TextEmojiLabel) view.findViewById(R.id.push_name);
        C0AT.A0V(this.A01, 2);
    }
}
