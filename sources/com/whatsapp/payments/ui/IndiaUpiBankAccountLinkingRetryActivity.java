package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.ActivityC02310Ar;
import X.C02L;
import X.C04630Le;
import X.C0N5;
import X.C0U1;
import X.C4KG;
import X.C4L5;
import X.C894947f;
import X.View$OnClickListenerC69583Oz;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class IndiaUpiBankAccountLinkingRetryActivity extends C4L5 {
    public C894947f A00;

    public /* synthetic */ void lambda$onCreate$121$IndiaUpiBankAccountLinkingRetryActivity(View view) {
        int intExtra = getIntent() != null ? getIntent().getIntExtra("try_again", 0) : 0;
        if (((AbstractActivityC92444Kp) this).A0G || intExtra <= 0) {
            Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A1Z(intent);
            startActivity(intent);
        } else if (intExtra == 1) {
            Intent intent2 = new Intent(this, IndiaUpiPaymentBankSetupActivity.class);
            A1Z(intent2);
            startActivity(intent2);
        }
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        findViewById(R.id.hero_account).setVisibility(configuration.orientation == 2 ? 8 : 0);
    }

    @Override // X.C4L5, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_bankaccount_linking_retry);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0H(getString(R.string.payments_retry_setup_activity_title));
            A0c.A0L(true);
        }
        TextView textView = (TextView) findViewById(R.id.bankaccount_linking_retry_title);
        TextView textView2 = (TextView) findViewById(R.id.bankaccount_linking_retry_desc);
        int intExtra = getIntent().getIntExtra("error", 0);
        int intExtra2 = getIntent().getIntExtra("error_type", 0);
        C0N5 c0n5 = (C0N5) getIntent().getParcelableExtra("extra_bank_account");
        String str2 = "";
        if (c0n5 != null) {
            str2 = c0n5.A05;
            str = c0n5.A02;
        } else {
            str = "";
        }
        if (intExtra2 >= 1 && intExtra2 <= 4) {
            C02L c02l = ((C4KG) this).A02;
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                String A0F = ((ActivityC02310Ar) this).A01.A0F(C04630Le.A03(userJid.user));
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.failure_reasons_bullet_list_container);
                TextView textView3 = (TextView) viewGroup.findViewById(R.id.failure_reasons_title);
                ArrayList<String> arrayList = new ArrayList(5);
                if (intExtra2 == 1) {
                    textView.setText(getString(R.string.bankaccount_linking_retry_get_accounts_failure_title, ((ActivityC02310Ar) this).A01.A0E(str2)));
                    if (intExtra == R.string.get_accounts_failure_reason) {
                        if (TextUtils.isEmpty(str)) {
                            string = getString(R.string.get_accounts_failure_reason_without_bank_phone, A0F);
                        } else {
                            string = getString(R.string.get_accounts_failure_reason, A0F, ((ActivityC02310Ar) this).A01.A0F(str));
                        }
                        textView2.setText(string);
                    }
                } else if (intExtra2 == 2) {
                    textView.setText(R.string.device_binding_failure_title);
                    textView3.setText(R.string.device_binding_failure_reasons_bullet_list_title);
                    arrayList = new ArrayList();
                    arrayList.add(getString(R.string.device_binding_failure_reasons_1, A0F));
                    arrayList.add(getString(R.string.device_binding_failure_reasons_2));
                    arrayList.add(getString(R.string.device_binding_failure_reasons_3));
                    if (Build.VERSION.SDK_INT <= 21) {
                        arrayList.add(getString(R.string.device_binding_failure_reasons_4, A0F));
                    }
                } else if (intExtra2 == 3) {
                    textView.setText(R.string.device_binding_failure_title_sms);
                    arrayList = new ArrayList();
                    if (Build.VERSION.SDK_INT <= 21) {
                        arrayList.add(getString(R.string.device_binding_failure_reasons_sms_dual_sim));
                    }
                    String string2 = getString(R.string.device_binding_failure_reasons_bullet_list_title_sms_mismatch, A0F);
                    if (arrayList.isEmpty()) {
                        textView2.setText(string2);
                    } else {
                        textView3.setText(string2);
                    }
                } else if (intExtra2 == 4) {
                    textView.setText(R.string.device_binding_failure_title);
                    textView2.setText(R.string.device_binding_failure_reasons_sms);
                }
                for (String str3 : arrayList) {
                    SpannableString spannableString = new SpannableString(str3);
                    spannableString.setSpan(new BulletSpan((int) getResources().getDimension(R.dimen.payment_text_bullet_distance)) { // from class: X.4A4
                        public static Path A01;
                        public final int A00;

                        {
                            super(r1);
                            this.A00 = r1;
                        }

                        @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
                        public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
                            if (((Spanned) charSequence).getSpanStart(this) == i6) {
                                Paint.Style style = paint.getStyle();
                                paint.setStyle(Paint.Style.FILL);
                                if (canvas.isHardwareAccelerated()) {
                                    if (A01 == null) {
                                        Path path = new Path();
                                        A01 = path;
                                        path.addCircle(0.0f, 0.0f, 7.2000003f, Path.Direction.CW);
                                    }
                                    canvas.save();
                                    canvas.translate((i2 * 6) + i + 6, (i3 + i5) / 2.0f);
                                    canvas.drawPath(A01, paint);
                                    canvas.restore();
                                } else {
                                    canvas.drawCircle((i2 * 6) + i + 6, (i3 + i5) / 2.0f, 6.0f, paint);
                                }
                                paint.setStyle(style);
                            }
                        }

                        @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
                        public int getLeadingMargin(boolean z) {
                            return this.A00 + 12;
                        }
                    }, 0, str3.length(), 0);
                    TextView textView4 = new TextView(this);
                    textView4.setText(spannableString);
                    textView4.setTextColor(getResources().getColor(R.color.secondary_text));
                    textView4.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.payment_bullet_text_size));
                    textView4.setLineSpacing(getResources().getDimensionPixelSize(R.dimen.payment_bullet_text_line_spacing_extra), 1.0f);
                    textView4.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.payment_bullet_text_line_spacing_extra));
                    viewGroup.addView(textView4);
                }
                if (arrayList.size() > 0) {
                    viewGroup.setVisibility(0);
                    textView2.setVisibility(8);
                }
            } else {
                throw null;
            }
        } else if (intExtra > 0) {
            if (!TextUtils.isEmpty(str2) && intExtra2 == 5) {
                textView2.setText(getString(intExtra, ((ActivityC02310Ar) this).A01.A0E(str2)));
            } else if (!TextUtils.isEmpty(str2) && intExtra2 == 6) {
                textView2.setText(getString(intExtra, ((ActivityC02310Ar) this).A01.A0E(str2)));
            } else {
                textView2.setText(intExtra);
            }
        }
        findViewById(R.id.retry_button).setOnClickListener(new View$OnClickListenerC69583Oz(this));
        onConfigurationChanged(getResources().getConfiguration());
    }
}
