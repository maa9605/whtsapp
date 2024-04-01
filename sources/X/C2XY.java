package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2XY */
/* loaded from: classes2.dex */
public final class C2XY extends C2XZ implements InterfaceC51582Xa {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextEmojiLabel A0C;
    public C54572iy A0D;
    public C02E A0E;

    @Override // X.InterfaceC51582Xa
    public int getType() {
        return 0;
    }

    public C2XY(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.conversation_block_add_footer, this);
        this.A00 = findViewById(R.id.add_btn);
        this.A02 = findViewById(R.id.content);
        this.A05 = findViewById(R.id.spam_btn);
        this.A01 = findViewById(R.id.block_btn);
        this.A09 = (TextView) findViewById(R.id.header);
        this.A04 = findViewById(R.id.not_spam_btn);
        this.A03 = findViewById(R.id.exit_group_btn);
        this.A06 = (TextView) findViewById(R.id.add_btn_text);
        this.A0B = (TextView) findViewById(R.id.spam_btn_text);
        this.A07 = (TextView) findViewById(R.id.block_btn_text);
        this.A0A = (TextView) findViewById(R.id.not_spam_btn_text);
        this.A08 = (TextView) findViewById(R.id.exit_group_btn_text);
        this.A0C = (TextEmojiLabel) findViewById(R.id.group_privacy_info);
    }

    @Override // X.InterfaceC51582Xa
    public void AEf() {
        this.A02.setVisibility(8);
    }

    @Override // X.InterfaceC51582Xa
    public void ARX(C59382sf c59382sf) {
        int i;
        int i2;
        int i3;
        this.A02.setVisibility(0);
        this.A05.setVisibility(c59382sf.A09);
        View view = this.A04;
        int i4 = c59382sf.A08;
        view.setVisibility(i4);
        View view2 = this.A01;
        int i5 = c59382sf.A02;
        view2.setVisibility(i5);
        this.A00.setVisibility(c59382sf.A00);
        this.A03.setVisibility(c59382sf.A03);
        TextEmojiLabel textEmojiLabel = this.A0C;
        int i6 = c59382sf.A05;
        textEmojiLabel.setVisibility(i6);
        if (i4 == 0 && (i3 = c59382sf.A07) != -1) {
            this.A0A.setText(i3);
        }
        if (i5 == 0 && (i2 = c59382sf.A01) != -1) {
            this.A07.setText(i2);
        }
        if (i6 == 0 && (i = c59382sf.A04) != -1) {
            C000200d.A0b(this.A0C);
            TextEmojiLabel textEmojiLabel2 = this.A0C;
            textEmojiLabel2.setAccessibilityHelper(new C02780Cv(this.A0E, textEmojiLabel2));
            this.A0C.setText(this.A0D.A00(getContext().getString(i)));
        }
        int i7 = c59382sf.A06;
        this.A09.setText(i7);
        this.A09.setContentDescription(getContext().getString(i7));
    }

    @Override // X.InterfaceC51582Xa
    public void setup(C54572iy c54572iy) {
        this.A0D = c54572iy;
        this.A05.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(c54572iy, 26));
        this.A01.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(c54572iy, 25));
        this.A00.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(c54572iy, 24));
        this.A04.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(c54572iy, 23));
        this.A03.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, c54572iy, 19));
        C003301p.A06(this.A0B);
        C003301p.A06(this.A0A);
        C003301p.A06(this.A07);
        C003301p.A06(this.A06);
        C003301p.A06(this.A08);
    }
}
