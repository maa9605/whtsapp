package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.Button;

/* renamed from: X.2Xc */
/* loaded from: classes2.dex */
public class C51602Xc extends AbstractC51612Xd implements InterfaceC51582Xa {
    public View A00;
    public TextEmojiLabel A01;
    public Button A02;
    public Button A03;
    public C54572iy A04;
    public C02E A05;

    @Override // X.InterfaceC51582Xa
    public int getType() {
        return 1;
    }

    public C51602Xc(Context context) {
        super(context);
        RelativeLayout.inflate(context, R.layout.conversation_block_add_footer_floating, this);
        this.A00 = findViewById(R.id.block_add_footer_floating_content);
        this.A01 = (TextEmojiLabel) findViewById(R.id.header);
        this.A02 = (Button) findViewById(R.id.action_view_1);
        this.A03 = (Button) findViewById(R.id.action_view_2);
    }

    public final void A00(Button button, int i, int i2, int i3) {
        button.setVisibility(0);
        button.setText(getContext().getString(i));
        button.setContentDescription(getContext().getString(i2));
        button.setCompoundDrawablesWithIntrinsicBounds(C02180Ae.A0O(getContext(), i3, R.color.neutralButtonTextColor), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // X.InterfaceC51582Xa
    public void AEf() {
        this.A00.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0070  */
    @Override // X.InterfaceC51582Xa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ARX(X.C59382sf r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51602Xc.ARX(X.2sf):void");
    }

    @Override // X.InterfaceC51582Xa
    public void setup(C54572iy c54572iy) {
        this.A04 = c54572iy;
    }
}
