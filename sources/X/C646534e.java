package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.34e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C646534e implements C2nO {
    public final Context A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final C06030Rg A03;
    public final C0Zn A04;
    public final C002301c A05;

    public C646534e(Context context, C018708s c018708s, C002301c c002301c, C2AR c2ar, C0Zn c0Zn, View view) {
        this.A00 = context;
        this.A05 = c002301c;
        this.A04 = c0Zn;
        this.A01 = (ImageView) view.findViewById(R.id.contactpicker_row_photo);
        C06030Rg c06030Rg = new C06030Rg(view, (int) R.id.contactpicker_row_name, c018708s, c2ar);
        this.A03 = c06030Rg;
        C003301p.A06(c06030Rg.A01);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.contactpicker_row_status);
    }

    @Override // X.C2nO
    public void AHz(InterfaceC56502nP interfaceC56502nP) {
        C06C c06c = ((C646834h) interfaceC56502nP).A00;
        ImageView imageView = this.A01;
        C0AT.A0e(imageView, C003101m.A07(c06c.A02()));
        imageView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c06c, 7));
        this.A04.A02(c06c, imageView);
        C06030Rg c06030Rg = this.A03;
        c06030Rg.A03(c06c, null);
        String A0F = this.A05.A0F(C04630Le.A00(c06c));
        if (c06030Rg.A01.getText().toString().equals(A0F)) {
            TextEmojiLabel textEmojiLabel = this.A02;
            textEmojiLabel.setVisibility(8);
            textEmojiLabel.setText("");
            return;
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        textEmojiLabel2.setVisibility(0);
        textEmojiLabel2.setText(A0F);
    }
}
