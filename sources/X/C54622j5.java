package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiContainerView;

/* renamed from: X.2j5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54622j5 extends C0TS {
    public int A00;
    public C2CI A01;
    public final ImageView A02;
    public final EmojiContainerView A03;
    public final C40081rY A04;
    public final InterfaceC54632j6 A05;
    public final C02O A06;

    public C54622j5(C40081rY c40081rY, C02O c02o, ViewGroup viewGroup, LayoutInflater layoutInflater, InterfaceC54632j6 interfaceC54632j6, int i) {
        super(layoutInflater.inflate(R.layout.emoji_search_preview, viewGroup, false));
        this.A04 = c40081rY;
        this.A05 = interfaceC54632j6;
        this.A06 = c02o;
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        this.A03 = (EmojiContainerView) view.findViewById(R.id.emoji_preview_container);
        this.A02 = (ImageView) view.findViewById(R.id.emoji);
        this.A03.setVisibility(0);
    }

    public final void A0C() {
        this.A02.setImageDrawable(this.A04.A02(this.A0H.getContext(), -1, new C43941yG(this.A01.A00), 0.75f));
    }
}
