package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.0Rg */
/* loaded from: classes.dex */
public class C06030Rg {
    public final Context A00;
    public final TextEmojiLabel A01;
    public final C018708s A02;
    public final C2AR A03;

    public C06030Rg(Context context, TextEmojiLabel textEmojiLabel, C018708s c018708s, C2AR c2ar) {
        this.A00 = context;
        this.A01 = textEmojiLabel;
        this.A02 = c018708s;
        this.A03 = c2ar;
    }

    public C06030Rg(View view, int i, C018708s c018708s, C2AR c2ar) {
        this(view.getContext(), (TextEmojiLabel) view.findViewById(i), c018708s, c2ar);
    }

    public void A00() {
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(this.A00.getString(R.string.you));
        textEmojiLabel.setCompoundDrawables(null, null, null, null);
    }

    public void A01(int i) {
        if (i == 0) {
            this.A01.setCompoundDrawables(null, null, null, null);
        } else if (i == 1) {
            this.A01.A02(R.drawable.ic_verified);
        } else if (i == 2) {
            this.A01.A02(R.drawable.ic_verified_large);
        }
    }

    public void A02(C06C c06c) {
        TextEmojiLabel textEmojiLabel;
        if (c06c.A0F()) {
            textEmojiLabel = this.A01;
            textEmojiLabel.A02(R.drawable.ic_verified);
        } else {
            textEmojiLabel = this.A01;
            textEmojiLabel.setCompoundDrawables(null, null, null, null);
        }
        if (C003101m.A0Y(c06c.A02())) {
            textEmojiLabel.setTextColor(C02160Ac.A00(textEmojiLabel.getContext(), R.color.list_item_verified_title));
        } else {
            textEmojiLabel.setTextColor(C02160Ac.A00(textEmojiLabel.getContext(), R.color.list_item_title));
        }
    }

    public void A03(C06C c06c, List list) {
        String A08;
        if (c06c.A0F()) {
            A08 = C018708s.A02(c06c, false);
        } else {
            A08 = this.A02.A08(c06c, false);
        }
        this.A01.A06(A08, list, false, 256);
        A01(c06c.A0F() ? 1 : 0);
    }

    public void A04(CharSequence charSequence, List list) {
        this.A01.A06(charSequence, list, false, 0);
    }
}
