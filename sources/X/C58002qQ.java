package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.2qQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58002qQ {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final C06030Rg A03;
    public final SelectionCheckView A04;
    public final /* synthetic */ AbstractActivityC40691si A05;

    public C58002qQ(AbstractActivityC40691si abstractActivityC40691si, C018708s c018708s, C2AR c2ar, View view) {
        this.A05 = abstractActivityC40691si;
        this.A00 = view.findViewById(R.id.row_container);
        this.A01 = (ImageView) view.findViewById(R.id.contact_photo);
        C06030Rg c06030Rg = new C06030Rg(view, (int) R.id.chat_able_contacts_row_name, c018708s, c2ar);
        this.A03 = c06030Rg;
        C0AT.A0V(c06030Rg.A01, 2);
        C003301p.A06(this.A03.A01);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.chat_able_contacts_row_status);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
    }

    public void A00() {
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(R.string.tap_unblock);
        AbstractActivityC40691si abstractActivityC40691si = this.A05;
        textEmojiLabel.setTextColor(abstractActivityC40691si.getResources().getColor(R.color.gray_alpha_100));
        textEmojiLabel.setTypeface(null, 2);
        C06030Rg c06030Rg = this.A03;
        c06030Rg.A01.setTextColor(abstractActivityC40691si.getResources().getColor(R.color.gray_alpha_100));
        this.A01.setAlpha(0.5f);
        this.A04.A03(false, false);
    }
}
