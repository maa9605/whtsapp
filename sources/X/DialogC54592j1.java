package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import java.util.ArrayList;

/* renamed from: X.2j1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class DialogC54592j1 extends C09K {
    public int A00;
    public WaEditText A01;
    public C48362Ey A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Activity A0D;
    public final AbstractC000600i A0E;
    public final InterfaceC09180cm A0F;
    public final C018508q A0G;
    public final C02E A0H;
    public final C000500h A0I;
    public final C43871y8 A0J;
    public final InterfaceC54602j2 A0K;
    public final C40081rY A0L;
    public final C47682Ce A0M;
    public final C2MI A0N;
    public final C455822q A0O;
    public final C02O A0P;
    public final C2MB A0Q;
    public final String A0R;

    public DialogC54592j1(Activity activity, C455822q c455822q, C018508q c018508q, C2MB c2mb, AbstractC000600i abstractC000600i, C40081rY c40081rY, C43871y8 c43871y8, C47682Ce c47682Ce, C02E c02e, C002301c c002301c, C2MI c2mi, C000500h c000500h, C02O c02o, int i, int i2, String str, InterfaceC54602j2 interfaceC54602j2, int i3, int i4, int i5, int i6) {
        super(activity, c002301c, R.layout.emoji_edittext_dialog, false);
        this.A04 = true;
        this.A06 = true;
        this.A0F = new InterfaceC09180cm() { // from class: X.3AP
            @Override // X.InterfaceC09180cm
            public void AHj() {
                DialogC54592j1.this.A01.dispatchKeyEvent(new KeyEvent(0, 67));
            }

            @Override // X.InterfaceC09180cm
            public void AJi(int[] iArr) {
                DialogC54592j1 dialogC54592j1 = DialogC54592j1.this;
                C002701i.A1H(dialogC54592j1.A01, iArr, dialogC54592j1.A0B);
            }
        };
        this.A0O = c455822q;
        this.A0G = c018508q;
        this.A0Q = c2mb;
        this.A0E = abstractC000600i;
        this.A0L = c40081rY;
        this.A0J = c43871y8;
        this.A0M = c47682Ce;
        this.A0H = c02e;
        this.A0N = c2mi;
        this.A0I = c000500h;
        this.A0P = c02o;
        this.A07 = i;
        this.A0A = i6;
        this.A0D = activity;
        this.A0K = interfaceC54602j2;
        this.A0C = i2;
        this.A0B = i3;
        this.A09 = i4;
        this.A08 = i5;
        this.A0R = str;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.A02.isShowing()) {
            this.A02.dismiss();
        } else {
            super.onBackPressed();
        }
    }

    @Override // X.C09K, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = this.A0C;
        ((TextView) findViewById(R.id.dialog_title)).setText(i);
        setTitle(i);
        final Button button = (Button) findViewById(R.id.ok_btn);
        button.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 44));
        findViewById(R.id.cancel_btn).setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 43));
        ArrayList arrayList = new ArrayList();
        TextView textView = (TextView) findViewById(R.id.counter_tv);
        WaEditText waEditText = (WaEditText) findViewById(R.id.edit_text);
        this.A01 = waEditText;
        C002301c c002301c = super.A02;
        C0LX.A0A(c002301c, waEditText);
        int i2 = this.A0B;
        if (i2 > 0 && this.A00 == 0) {
            textView.setVisibility(0);
        }
        if (i2 > 0) {
            arrayList.add(new C09190cp(i2));
        }
        if (!this.A06) {
            arrayList.add(new InputFilter() { // from class: X.2uu
                @Override // android.text.InputFilter
                public CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                    while (i3 < i4) {
                        if (Character.isWhitespace(charSequence.charAt(i3))) {
                            return "";
                        }
                        i3++;
                    }
                    return null;
                }
            });
        }
        if (!arrayList.isEmpty()) {
            this.A01.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
        WaEditText waEditText2 = this.A01;
        C40081rY c40081rY = this.A0L;
        C02E c02e = this.A0H;
        C02O c02o = this.A0P;
        waEditText2.addTextChangedListener(new C52662b7(c40081rY, c02e, c002301c, c02o, waEditText2, textView, i2, this.A00, this.A05));
        if (!this.A04) {
            this.A01.addTextChangedListener(new C2JT() { // from class: X.3AQ
                @Override // X.C2JT, android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (AnonymousClass024.A0j(editable.toString())) {
                        button.setEnabled(false);
                    } else {
                        button.setEnabled(true);
                    }
                }
            });
        }
        this.A01.setInputType(this.A0A);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        getWindow().setAttributes(attributes);
        Activity activity = this.A0D;
        C455822q c455822q = this.A0O;
        C2MB c2mb = this.A0Q;
        AbstractC000600i abstractC000600i = this.A0E;
        C43871y8 c43871y8 = this.A0J;
        C47682Ce c47682Ce = this.A0M;
        this.A02 = new C48362Ey(activity, c455822q, c2mb, abstractC000600i, c40081rY, c43871y8, c47682Ce, c02e, c002301c, this.A0N, this.A0I, c02o, (KeyboardPopupLayout) findViewById(R.id.emoji_edit_text_layout), (ImageButton) findViewById(R.id.emoji_btn), this.A01);
        AnonymousClass223 anonymousClass223 = new AnonymousClass223((EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A02, activity, c40081rY, c47682Ce, c002301c, c02o);
        anonymousClass223.A00 = new InterfaceC04830Lz() { // from class: X.3AL
            @Override // X.InterfaceC04830Lz
            public final void AJj(C2CI c2ci) {
                DialogC54592j1.this.A0F.AJi(c2ci.A00);
            }
        };
        C48362Ey c48362Ey = this.A02;
        c48362Ey.A0A(this.A0F);
        c48362Ey.A0C = new RunnableEBaseShape2S0200000_I0_2(this, anonymousClass223, 5);
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.2uo
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DialogC54592j1 dialogC54592j1 = DialogC54592j1.this;
                C002701i.A18(dialogC54592j1.A0D, dialogC54592j1.A07);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.dialog_subtitle);
        if (TextUtils.isEmpty(null)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = (TextView) findViewById(R.id.dialog_footer);
        if (TextUtils.isEmpty(this.A03)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(this.A03);
        }
        int i3 = this.A09;
        if (i3 != 0) {
            this.A01.setHint(getContext().getString(i3));
        }
        WaEditText waEditText3 = this.A01;
        String str = this.A0R;
        waEditText3.setText(C002701i.A0g(str, activity, c40081rY));
        if (!TextUtils.isEmpty(str)) {
            this.A01.selectAll();
        }
        this.A01.A02(false);
        getWindow().setSoftInputMode(5);
    }
}
