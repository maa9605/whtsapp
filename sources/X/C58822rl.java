package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape2S0101000_I1;
import java.util.ArrayList;

/* renamed from: X.2rl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58822rl {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final /* synthetic */ C2WZ A03;

    public C58822rl(C2WZ c2wz, View view, int i) {
        this.A03 = c2wz;
        this.A00 = (ImageView) view.findViewById(R.id.thumb);
        this.A02 = (TextView) view.findViewById(R.id.date);
        this.A01 = (ImageView) view.findViewById(R.id.album_thumb_status);
        this.A00.setContentDescription(view.getContext().getString(R.string.action_open_image));
        this.A00.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(this, i));
        this.A00.setOnLongClickListener(c2wz.A19);
    }

    public void A00(ArrayList arrayList, AnonymousClass097 anonymousClass097) {
        arrayList.add(new C0FK(this.A00, C2JE.A08(anonymousClass097)));
        TextView textView = this.A02;
        if (textView.getVisibility() == 0) {
            arrayList.add(new C0FK(textView, C2JE.A02(anonymousClass097)));
        }
        ImageView imageView = this.A01;
        if (imageView != null) {
            arrayList.add(new C0FK(imageView, C2JE.A07(anonymousClass097)));
        }
    }
}
