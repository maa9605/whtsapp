package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CopyableTextView;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.4KP */
/* loaded from: classes3.dex */
public abstract class C4KP extends C4K9 implements View.OnClickListener {
    public int A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public CopyableTextView A06;
    public C0N2 A07;
    public C018808t A08;
    public C0GZ A09;
    public C28M A0A;
    public C0GR A0B;
    public C0DV A0C;
    public C77393i8 A0D;
    public PayToolbar A0E;
    public InterfaceC002901k A0F;
    public boolean A0G;
    public final C014406v A0H = C014406v.A00("PaymentMethodDetailsActivity", "payment-settings", "COMMON");
    public final C78223jY A0I = new C78223jY(this);

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        if (i == R.string.payment_method_is_removed) {
            finish();
        } else {
            super.A10(i);
        }
    }

    public final int A1P(int i) {
        TypedArray typedArray;
        try {
            typedArray = obtainStyledAttributes(i, new int[]{16843071});
        } catch (Resources.NotFoundException e) {
            Log.e(e.getMessage());
            typedArray = null;
        }
        if (typedArray == null) {
            return -1;
        }
        return typedArray.getDimensionPixelOffset(0, -1);
    }

    public DialogInterfaceC019408z A1Q(CharSequence charSequence, String str, final boolean z) {
        final int i = z ? 200 : 201;
        C019208x c019208x = new C019208x(this);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = charSequence;
        c019308y.A0J = true;
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Qe
            {
                C4KP.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C002701i.A18(C4KP.this, i);
            }
        });
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3Qf
            {
                C4KP.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C4KP.this.A1R(i, z);
            }
        };
        c019308y.A0H = str;
        c019308y.A06 = onClickListener;
        c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3Qd
            {
                C4KP.this = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C002701i.A18(C4KP.this, i);
            }
        };
        return c019208x.A00();
    }

    public /* synthetic */ void A1R(int i, boolean z) {
        C002701i.A18(this, i);
        A1V(z);
    }

    public void A1S(C0N2 c0n2) {
        C014406v c014406v = this.A0H;
        StringBuilder A0P = C000200d.A0P("paymentMethodNotificationObserver is called ");
        A0P.append(c0n2 != null);
        c014406v.A07(null, A0P.toString(), null);
        A1U(c0n2, this.A07 == null);
    }

    public /* synthetic */ void A1T(C0N2 c0n2) {
        A1U(c0n2, true);
    }

    public void A1U(C0N2 c0n2, boolean z) {
        C0N8 c0n8;
        if (c0n2 == null) {
            finish();
            return;
        }
        this.A07 = c0n2;
        this.A0G = c0n2.A01 == 2;
        this.A05.setText(c0n2.A0A);
        ImageView imageView = (ImageView) findViewById(R.id.payment_method_icon);
        if (c0n2 instanceof C0N7) {
            imageView.setImageResource(C40841sx.A00((C0N7) c0n2));
        } else {
            Bitmap A04 = c0n2.A04();
            if (A04 != null) {
                imageView.setImageBitmap(A04);
            } else {
                imageView.setImageResource(R.drawable.av_bank);
            }
        }
        boolean z2 = this instanceof BrazilPaymentCardDetailsActivity;
        int i = R.color.settings_icon;
        if (z2) {
            i = R.color.fb_pay_hub_icon_tint;
        }
        int A00 = C02160Ac.A00(this, i);
        this.A00 = A00;
        C02180Ae.A17(this.A02, A00);
        C02180Ae.A17(this.A03, this.A00);
        ImageView imageView2 = this.A02;
        boolean z3 = this.A0G;
        int i2 = R.drawable.ic_settings_unstarred;
        if (z3) {
            i2 = R.drawable.ic_settings_starred;
        }
        imageView2.setImageResource(i2);
        TextView textView = this.A04;
        boolean z4 = this.A0G;
        int i3 = R.string.default_payment_method_unset;
        if (z4) {
            i3 = R.string.default_payment_method_set;
        }
        textView.setText(i3);
        if (!this.A0G) {
            this.A01.setOnClickListener(this);
        }
        if (!C40841sx.A0f(c0n2) || (c0n8 = (C0N8) c0n2.A06) == null || c0n8.A0R) {
            return;
        }
        findViewById(R.id.default_payment_method_container).setVisibility(8);
    }

    public void A1V(boolean z) {
        if (!(this instanceof IndiaUpiBankAccountDetailsActivity)) {
            C4Kv c4Kv = (C4Kv) this;
            c4Kv.A12(R.string.register_wait_message);
            C4EA c4ea = new C4EA(c4Kv, null, 0);
            if (z) {
                new C48I(c4Kv, ((ActivityC02290Ap) c4Kv).A0A, c4Kv.A0D, c4Kv.A0C, c4Kv.A07, c4Kv.A01, c4Kv.A04, ((ActivityC02290Ap) c4Kv).A0D, c4Kv.A05, c4Kv.A06, c4Kv.A02).A00(c4ea);
                return;
            } else {
                c4Kv.A05.A0D(((C4KP) c4Kv).A07.A07, c4ea, null, null);
                return;
            }
        }
        ((IndiaUpiBankAccountDetailsActivity) this).A1X(z);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            Intent intent2 = new Intent();
            intent2.putExtra("extra_remove_payment_account", intent != null ? intent.getIntExtra("extra_remove_payment_account", 0) : 0);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.default_payment_method_row) {
            if (!this.A0G) {
                A12(R.string.register_wait_message);
                if (this instanceof C4Kv) {
                    C4Kv c4Kv = (C4Kv) this;
                    InterfaceC03640Gm interfaceC03640Gm = new InterfaceC03640Gm() { // from class: X.4E9
                        {
                            C4KP.this = c4Kv;
                        }

                        public final void A00(C28Q c28q) {
                            int i;
                            C28T c28t = r2;
                            if (c28t != null) {
                                c28t.AG6(r3, c28q);
                            }
                            C4KP c4kp = C4KP.this;
                            c4kp.ARS();
                            if (c28q != null) {
                                InterfaceC06790Va interfaceC06790Va = r4;
                                if (interfaceC06790Va == null || (i = interfaceC06790Va.A9z(c28q.A00, null)) == 0) {
                                    i = R.string.payment_method_cannot_be_set_default;
                                }
                                c4kp.AUj(i);
                            }
                        }

                        @Override // X.InterfaceC03640Gm
                        public void ANw(C28Q c28q) {
                            C014406v c014406v = C4KP.this.A0H;
                            StringBuilder sb = new StringBuilder("setDefault/onRequestError. paymentNetworkError: ");
                            sb.append(c28q);
                            c014406v.A07(null, sb.toString(), null);
                            A00(c28q);
                        }

                        @Override // X.InterfaceC03640Gm
                        public void AO1(C28Q c28q) {
                            C014406v c014406v = C4KP.this.A0H;
                            StringBuilder sb = new StringBuilder("setDefault/onResponseError. paymentNetworkError: ");
                            sb.append(c28q);
                            c014406v.A03(sb.toString());
                            A00(c28q);
                        }

                        @Override // X.InterfaceC03640Gm
                        public void AO2(C468228k c468228k) {
                            C4KP c4kp = C4KP.this;
                            c4kp.A0H.A07(null, "setDefault Success", null);
                            C28T c28t = r2;
                            if (c28t != null) {
                                c28t.AG6(r3, null);
                            }
                            c4kp.A02.setImageResource(R.drawable.ic_settings_starred);
                            c4kp.A04.setText(R.string.default_payment_method_set);
                            c4kp.A01.setOnClickListener(null);
                            c4kp.ARS();
                            c4kp.AUj(R.string.payment_method_set_as_default);
                        }
                    };
                    C463026g c463026g = c4Kv.A05;
                    String str = ((C4KP) c4Kv).A07.A07;
                    if (c463026g != null) {
                        c463026g.A0B(new C02590Ca("account", new C04P[]{new C04P("action", "edit-default-credential", null, (byte) 0), new C04P("credential-id", str, null, (byte) 0), new C04P("version", "2", null, (byte) 0)}, null, null), interfaceC03640Gm);
                        return;
                    }
                    throw null;
                }
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
                indiaUpiBankAccountDetailsActivity.A12(R.string.register_wait_message);
                indiaUpiBankAccountDetailsActivity.A09.A03.A04();
                final C4CV c4cv = indiaUpiBankAccountDetailsActivity.A09;
                final C90944Da c90944Da = indiaUpiBankAccountDetailsActivity.A0A;
                final InterfaceC03640Gm interfaceC03640Gm2 = new InterfaceC03640Gm() { // from class: X.4E9
                    {
                        C4KP.this = indiaUpiBankAccountDetailsActivity;
                    }

                    public final void A00(C28Q c28q) {
                        int i;
                        C28T c28t = c4cv;
                        if (c28t != null) {
                            c28t.AG6(r3, c28q);
                        }
                        C4KP c4kp = C4KP.this;
                        c4kp.ARS();
                        if (c28q != null) {
                            InterfaceC06790Va interfaceC06790Va = c90944Da;
                            if (interfaceC06790Va == null || (i = interfaceC06790Va.A9z(c28q.A00, null)) == 0) {
                                i = R.string.payment_method_cannot_be_set_default;
                            }
                            c4kp.AUj(i);
                        }
                    }

                    @Override // X.InterfaceC03640Gm
                    public void ANw(C28Q c28q) {
                        C014406v c014406v = C4KP.this.A0H;
                        StringBuilder sb = new StringBuilder("setDefault/onRequestError. paymentNetworkError: ");
                        sb.append(c28q);
                        c014406v.A07(null, sb.toString(), null);
                        A00(c28q);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO1(C28Q c28q) {
                        C014406v c014406v = C4KP.this.A0H;
                        StringBuilder sb = new StringBuilder("setDefault/onResponseError. paymentNetworkError: ");
                        sb.append(c28q);
                        c014406v.A03(sb.toString());
                        A00(c28q);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO2(C468228k c468228k) {
                        C4KP c4kp = C4KP.this;
                        c4kp.A0H.A07(null, "setDefault Success", null);
                        C28T c28t = c4cv;
                        if (c28t != null) {
                            c28t.AG6(r3, null);
                        }
                        c4kp.A02.setImageResource(R.drawable.ic_settings_starred);
                        c4kp.A04.setText(R.string.default_payment_method_set);
                        c4kp.A01.setOnClickListener(null);
                        c4kp.ARS();
                        c4kp.AUj(R.string.payment_method_set_as_default);
                    }
                };
                C4IA c4ia = (C4IA) indiaUpiBankAccountDetailsActivity.A01.A06;
                C014406v c014406v = indiaUpiBankAccountDetailsActivity.A0E;
                C000700j.A04(c4ia, c014406v.A02(c014406v.A02, "onMakeDefaultPaymentMethod Unable to get IndiaUpiMethodData").toString());
                final C4CB c4cb = indiaUpiBankAccountDetailsActivity.A08;
                String str2 = c4ia.A0D;
                String str3 = c4ia.A0E;
                final String str4 = c4ia.A0A;
                final String str5 = indiaUpiBankAccountDetailsActivity.A01.A07;
                if (c4cb != null) {
                    if (TextUtils.isEmpty(str2)) {
                        C4C4 c4c4 = new C4C4(c4cb.A00, c4cb.A01, c4cb.A02, c4cb.A08, c4cb.A03, c4cb.A07, c4cb.A04, c4cb.A09, c4cb.A06, c4cb.A05, null);
                        AnonymousClass486 anonymousClass486 = new AnonymousClass486() { // from class: X.4C9
                            public final /* synthetic */ boolean A04 = true;

                            @Override // X.AnonymousClass486
                            public void AIz(C4GI c4gi) {
                                c4cb.A01(c4gi.A01, c4gi.A02, str4, str5, this.A04, interfaceC03640Gm2);
                            }

                            @Override // X.AnonymousClass486
                            public void AJs(C28Q c28q) {
                                Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to set default payment method");
                                InterfaceC03640Gm interfaceC03640Gm3 = interfaceC03640Gm2;
                                if (interfaceC03640Gm3 != null) {
                                    interfaceC03640Gm3.ANw(c28q);
                                }
                            }
                        };
                        C02L c02l = c4c4.A02;
                        c02l.A05();
                        c4c4.A00(c02l.A03, new C4C3(c4c4, anonymousClass486));
                        return;
                    }
                    c4cb.A01(str2, str3, str4, str5, true, interfaceC03640Gm2);
                    return;
                }
                throw null;
            }
        } else if (view.getId() != R.id.help_row) {
        } else {
            InterfaceC002901k interfaceC002901k = this.A0F;
            C77393i8 c77393i8 = this.A0D;
            if (c77393i8 != null && c77393i8.A00() == AsyncTask.Status.RUNNING) {
                this.A0D.A05(false);
            }
            Bundle A02 = C000200d.A02("com.whatsapp.support.DescribeProblemActivity.from", "payments:account-details");
            C0N0 c0n0 = this.A07.A06;
            if (c0n0 != null) {
                A02.putString("com.whatsapp.support.DescribeProblemActivity.paymentBankPhone", c0n0.A07());
            }
            C77393i8 c77393i82 = new C77393i8(this, ((ActivityC02290Ap) this).A0B, ((ActivityC02310Ar) this).A01, this.A08, this.A0J, this.A0B, "payments:account-details", this.A07, null, A02);
            this.A0D = c77393i82;
            interfaceC002901k.ARy(c77393i82, new Void[0]);
        }
    }

    @Override // X.C4K9, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = this instanceof BrazilPaymentCardDetailsActivity;
        int i = R.layout.payment_method_details;
        if (z) {
            i = R.layout.fb_pay_container;
        }
        setContentView(i);
        ((ViewGroup) findViewById(R.id.scroll_view_layout)).addView(getLayoutInflater().inflate(R.layout.payment_method_details_view, (ViewGroup) null));
        if (getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().get("extra_bank_account") != null) {
            if (z) {
                PayToolbar payToolbar = (PayToolbar) findViewById(R.id.pay_service_toolbar);
                this.A0E = payToolbar;
                A0k(payToolbar);
            }
            if (!(!(this instanceof IndiaUpiBankAccountDetailsActivity))) {
                findViewById(R.id.help_section).setVisibility(8);
            }
            this.A05 = (TextView) findViewById(R.id.payment_method_bank_name);
            this.A06 = (CopyableTextView) findViewById(R.id.payment_method_account_id);
            this.A01 = findViewById(R.id.default_payment_method_row);
            this.A02 = (ImageView) findViewById(R.id.default_payment_method_icon);
            this.A04 = (TextView) findViewById(R.id.default_payment_method_text);
            this.A03 = (ImageView) findViewById(R.id.help_icon);
            findViewById(R.id.help_row).setOnClickListener(this);
            this.A0A.A01(this.A0I);
            C03560Ge A01 = this.A0C.A01();
            C0N2 c0n2 = (C0N2) getIntent().getExtras().get("extra_bank_account");
            if (c0n2 != null) {
                String str = c0n2.A07;
                C0CI c0ci = new C0CI();
                A01.A03.AS1(new RunnableEBaseShape0S1200000_I0(A01, str, c0ci, 9));
                c0ci.A01.A03(new C0CG() { // from class: X.3jZ
                    {
                        C4KP.this = this;
                    }

                    @Override // X.C0CG
                    public final void A54(Object obj) {
                        C4KP.this.A1T((C0N2) obj);
                    }
                }, ((ActivityC02290Ap) this).A0A.A06);
                return;
            }
            throw null;
        }
        this.A0H.A03("got null bank account; finishing");
        finish();
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        String string;
        if (i != 200) {
            if (i != 201) {
                return super.onCreateDialog(i);
            }
            return A1Q(getString(R.string.delete_payment_method_dialog_title), getString(R.string.remove), false);
        }
        C0DV c0dv = this.A0C;
        c0dv.A04();
        if (((AbstractCollection) c0dv.A07.A0V(1)).size() > 0) {
            string = getString(R.string.delete_payment_accounts_dialog_title_with_warning);
        } else {
            string = getString(R.string.delete_payment_method_dialog_title);
        }
        return A1Q(C002701i.A0g(string, this, ((ActivityC02290Ap) this).A0H), getString(R.string.remove), true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, getString(R.string.remove_payment_method));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_remove_payment_method) {
            if (!(this instanceof BrazilPaymentCardDetailsActivity)) {
                C0DV c0dv = this.A0C;
                c0dv.A04();
                List A0A = c0dv.A08.A0A();
                C014406v c014406v = this.A0H;
                StringBuilder A0P = C000200d.A0P("#methods=");
                AbstractCollection abstractCollection = (AbstractCollection) A0A;
                A0P.append(abstractCollection.size());
                c014406v.A07(null, A0P.toString(), null);
                if (abstractCollection.size() <= 1) {
                    C002701i.A19(this, 200);
                    return true;
                }
                C002701i.A19(this, 201);
                return true;
            }
            C002701i.A19(this, 201);
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        this.A0A.A00(this.A0I);
        super.onStop();
    }
}
