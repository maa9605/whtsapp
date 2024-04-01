package com.whatsapp.support;

import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.C000200d;
import X.C000400f;
import X.C006602x;
import X.C018808t;
import X.C01C;
import X.C02180Ae;
import X.C04940Mo;
import X.C0DV;
import X.C0N2;
import X.C0U1;
import X.C28D;
import X.C28H;
import X.C28I;
import X.C36741lI;
import X.C40071rX;
import X.C41961un;
import X.C42671w8;
import X.C49082Ij;
import X.C51722Xo;
import X.C55142jw;
import X.C61892wt;
import X.C72153Yw;
import X.C83363s0;
import X.C83373s1;
import X.C90694Cb;
import X.InterfaceC002901k;
import X.InterfaceC55152jx;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0101000_I0;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.support.faq.SearchFAQ;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DescribeProblemActivity extends C28H implements C28I, C28D {
    public int A00;
    public Uri A01;
    public EditText A02;
    public C04940Mo A03;
    public C000400f A04;
    public AnonymousClass011 A05;
    public C018808t A06;
    public C55142jw A07;
    public InterfaceC55152jx A08;
    public C0DV A09;
    public C49082Ij A0A;
    public C72153Yw A0B;
    public C40071rX A0C;
    public C006602x A0D;
    public C41961un A0E;
    public InterfaceC002901k A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public Uri[] A0K = new Uri[3];

    public final String A1P() {
        ArrayList<String> stringArrayListExtra;
        if (getIntent().hasExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles") && (stringArrayListExtra = getIntent().getStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles")) != null && !stringArrayListExtra.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.payments_support_email_topic_prefix));
            sb.append(" ");
            StringBuilder sb2 = new StringBuilder(sb.toString());
            for (int i = 0; i < stringArrayListExtra.size(); i++) {
                sb2.append(stringArrayListExtra.get(i));
                if (i < stringArrayListExtra.size() - 1) {
                    sb2.append(", ");
                }
            }
            StringBuilder A0P = C000200d.A0P("\n\n");
            A0P.append(this.A02.getText().toString().trim());
            sb2.append(A0P.toString());
            return sb2.toString();
        }
        return C000200d.A0A(this.A02);
    }

    public final void A1Q() {
        List list;
        A1S(3, A1P());
        C49082Ij c49082Ij = this.A0A;
        String str = this.A0H;
        String str2 = this.A0G;
        String str3 = this.A0I;
        String A1P = A1P();
        Uri[] uriArr = this.A0K;
        InterfaceC55152jx interfaceC55152jx = this.A08;
        if (interfaceC55152jx != null) {
            list = interfaceC55152jx.ABy();
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uriArr) {
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        c49082Ij.A00(this, str, A1P, str2, str3, arrayList, list, true);
    }

    public final void A1R(int i, Uri uri) {
        this.A0K[i] = uri;
        View findViewById = findViewById(R.id.screenshots);
        if (findViewById != null) {
            C51722Xo c51722Xo = (C51722Xo) ((ViewGroup) findViewById).getChildAt(i);
            if (uri != null) {
                Point point = new Point();
                getWindowManager().getDefaultDisplay().getSize(point);
                int i2 = point.x / 3;
                try {
                    c51722Xo.setScreenshot(this.A0E.A0Z(uri, i2 / 2, i2));
                    c51722Xo.setContentDescription(getString(R.string.describe_problem_screenshot));
                    return;
                } catch (C42671w8 e) {
                    StringBuilder sb = new StringBuilder("descprob/screenshot/not-an-image ");
                    sb.append(uri);
                    Log.e(sb.toString(), e);
                    AUj(R.string.error_file_is_not_a_image);
                    c51722Xo.setContentDescription(getString(R.string.describe_problem_add_screenshot));
                    return;
                } catch (IOException e2) {
                    StringBuilder sb2 = new StringBuilder("descprob/screenshot/io-exception ");
                    sb2.append(uri);
                    Log.e(sb2.toString(), e2);
                    AUj(R.string.error_load_image);
                    c51722Xo.setContentDescription(getString(R.string.describe_problem_add_screenshot));
                    return;
                }
            }
            Bitmap bitmap = c51722Xo.A02;
            if (bitmap != null) {
                bitmap.recycle();
                c51722Xo.A02 = null;
            }
            c51722Xo.A02();
            c51722Xo.setContentDescription(getString(R.string.describe_problem_add_screenshot));
            return;
        }
        throw null;
    }

    public final void A1S(int i, String str) {
        C36741lI c36741lI = new C36741lI();
        c36741lI.A00 = Integer.valueOf(i);
        c36741lI.A01 = str;
        c36741lI.A02 = ((ActivityC02310Ar) this).A01.A04();
        this.A05.A09(c36741lI, 1);
        AnonymousClass011.A01(c36741lI, "");
    }

    @Override // X.C28I
    public void AJl() {
        this.A07 = null;
        A1Q();
    }

    @Override // X.C28D
    public void ANt(boolean z) {
        finish();
    }

    @Override // X.C28I
    public void AOP(C61892wt c61892wt) {
        String str = this.A0H;
        String str2 = c61892wt.A02;
        ArrayList<? extends Parcelable> arrayList = c61892wt.A05;
        String str3 = this.A0I;
        int i = c61892wt.A00;
        ArrayList<String> arrayList2 = c61892wt.A06;
        ArrayList<String> arrayList3 = c61892wt.A03;
        ArrayList<String> arrayList4 = c61892wt.A07;
        ArrayList<String> arrayList5 = c61892wt.A04;
        List list = c61892wt.A08;
        Intent intent = new Intent(this, SearchFAQ.class);
        intent.putExtra("com.whatsapp.support.faq.SearchFAQ.from", str);
        intent.putExtra("com.whatsapp.support.faq.SearchFAQ.problem", str2);
        intent.putExtra("com.whatsapp.support.faq.SearchFAQ.status", str3);
        intent.putExtra("com.whatsapp.support.faq.SearchFAQ.count", i);
        intent.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.titles", arrayList2);
        intent.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.descriptions", arrayList3);
        intent.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.urls", arrayList4);
        intent.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.ids", arrayList5);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        if (list != null) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                Pair pair = (Pair) list.get(i2);
                StringBuilder sb = new StringBuilder();
                sb.append((String) pair.first);
                sb.append(":");
                sb.append((String) pair.second);
                strArr[i2] = sb.toString();
            }
            intent.putExtra("com.whatsapp.support.faq.SearchFAQ.additionalDetails", strArr);
        }
        A15(intent, 32);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if ((i & 16) != 16) {
            if (i != 32) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 != -1) {
            } else {
                finish();
            }
        } else if (i2 == -1) {
            if (intent.getBooleanExtra("is_removed", false)) {
                A1R(i - 16, null);
                return;
            }
            Uri data = intent.getData();
            if (data != null) {
                try {
                    grantUriPermission("com.whatsapp", data, 1);
                } catch (SecurityException e) {
                    Log.w("descprob/permission", e);
                }
                A1R(i - 16, data);
                return;
            }
            AUj(R.string.error_load_image);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        A1S(1, null);
        super.onBackPressed();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0B.A00();
    }

    @Override // X.C28H, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.describe_problem_contact_support);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0M(true);
            setContentView(R.layout.describe_problem);
            View findViewById = findViewById(R.id.scroll_view);
            this.A02 = (EditText) findViewById(R.id.describe_problem_description_et);
            View findViewById2 = findViewById(R.id.describe_problem_error);
            Button button = (Button) findViewById(R.id.next_btn);
            button.setEnabled(this.A02.getText().toString().length() >= 1);
            this.A02.addTextChangedListener(new C83373s1(button));
            button.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, findViewById2, 48));
            Intent intent = getIntent();
            this.A0H = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.from");
            this.A0I = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.serverstatus");
            this.A0G = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.emailAddress");
            this.A01 = this.A0C.A01(null);
            if (C02180Ae.A1Y(this.A0H)) {
                String A0A = ((ActivityC02290Ap) this).A0B.A0A(C01C.A4D);
                if (!TextUtils.isEmpty(A0A)) {
                    this.A0G = A0A;
                }
                String A0A2 = ((ActivityC02290Ap) this).A0B.A0A(C01C.A4E);
                if (!TextUtils.isEmpty(A0A2)) {
                    this.A01 = Uri.parse(A0A2);
                }
            }
            View findViewById3 = findViewById(R.id.screenshots);
            if (findViewById3 != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById3;
                viewGroup.removeAllViews();
                if (C02180Ae.A1Y(this.A0H)) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs");
                    ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles");
                    this.A08 = this.A09.A03().AC5();
                    String stringExtra = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentBankPhone");
                    C0N2 c0n2 = (C0N2) intent.getParcelableExtra("com.whatsapp.support.DescribeProblemActivity.paymentMethod");
                    String stringExtra2 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId");
                    String stringExtra3 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentBankTxnId");
                    String stringExtra4 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentErrorCode");
                    String stringExtra5 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentStatus");
                    ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.payment_information_container);
                    InterfaceC55152jx interfaceC55152jx = this.A08;
                    if (interfaceC55152jx != null && !"payments:account-details".equals(this.A0H)) {
                        C90694Cb c90694Cb = (C90694Cb) interfaceC55152jx;
                        c90694Cb.A02 = stringExtra2;
                        c90694Cb.A00 = stringExtra3;
                        c90694Cb.A01 = stringExtra4;
                        c90694Cb.A03 = stringExtra5;
                        c90694Cb.A04 = stringArrayListExtra;
                        viewGroup2.addView(interfaceC55152jx.A5p(this, c0n2, stringExtra));
                        viewGroup2.setVisibility(0);
                    }
                    TextView textView = (TextView) findViewById(R.id.optional_title);
                    if (stringArrayListExtra2 != null && !stringArrayListExtra2.isEmpty()) {
                        StringBuilder sb = new StringBuilder(stringArrayListExtra2.get(0));
                        for (int i = 1; i < stringArrayListExtra2.size(); i++) {
                            if (i == 1) {
                                sb.append(" (");
                            }
                            sb.append(stringArrayListExtra2.get(i));
                            if (i == stringArrayListExtra2.size() - 1) {
                                sb.append(")");
                            } else {
                                sb.append(", ");
                            }
                        }
                        textView.setText(sb.toString());
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    View findViewById4 = findViewById(R.id.add_screenshots);
                    InterfaceC55152jx interfaceC55152jx2 = this.A08;
                    if (interfaceC55152jx2 != null && !interfaceC55152jx2.AEY()) {
                        findViewById4.setVisibility(8);
                        viewGroup.setVisibility(8);
                    }
                }
                int intExtra = intent.getIntExtra("com.whatsapp.support.DescribeProblemActivity.type", 0);
                this.A00 = intExtra;
                if (intExtra != 1 && intExtra != 2 && intExtra != 3) {
                    A0c.A08(R.string.describe_problem_contact_support);
                } else {
                    A0c.A08(R.string.describe_problem_contact_us);
                }
                String stringExtra6 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.description");
                if (stringExtra6 != null && stringExtra6.length() > 0) {
                    this.A02.setText(stringExtra6);
                    this.A0J = true;
                }
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.medium_thumbnail_padding);
                int i2 = 0;
                do {
                    C51722Xo c51722Xo = new C51722Xo(this);
                    c51722Xo.setOnClickListener(new ViewOnClickEBaseShape0S0101000_I0(this, i2, 7));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    layoutParams.bottomMargin = dimensionPixelSize;
                    layoutParams.rightMargin = dimensionPixelSize;
                    layoutParams.topMargin = dimensionPixelSize;
                    layoutParams.leftMargin = dimensionPixelSize;
                    viewGroup.addView(c51722Xo, layoutParams);
                    String stringExtra7 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.uri");
                    if (i2 == 0 && stringExtra7 != null) {
                        Uri parse = Uri.parse(stringExtra7);
                        this.A0K[0] = parse;
                        c51722Xo.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        c51722Xo.setImageURI(parse);
                    }
                    i2++;
                } while (i2 < 3);
                if (bundle != null) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("screenshots");
                    for (int i3 = 0; i3 < parcelableArray.length; i3++) {
                        if (parcelableArray[i3] != null) {
                            A1R(i3, (Uri) parcelableArray[i3]);
                        }
                    }
                }
                if (this.A00 == 2) {
                    A1Q();
                }
                C72153Yw c72153Yw = new C72153Yw(findViewById, findViewById(R.id.bottom_button_container), getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
                this.A0B = c72153Yw;
                c72153Yw.A00();
                this.A0B.A02(this, (TextView) findViewById(R.id.describe_problem_help), getString(R.string.describe_problem_help_center), new ClickableSpan() { // from class: X.3Yr
                    {
                        DescribeProblemActivity.this = this;
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        DescribeProblemActivity describeProblemActivity = DescribeProblemActivity.this;
                        describeProblemActivity.startActivity(new Intent("android.intent.action.VIEW", describeProblemActivity.A01));
                    }
                }, R.style.DescribeProblemInlineLink);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 2) {
            return super.onCreateDialog(i);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.searching));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C55142jw c55142jw = this.A07;
        if (c55142jw != null) {
            c55142jw.A05(false);
        }
        C83363s0 c83363s0 = this.A0A.A00;
        if (c83363s0 != null) {
            c83363s0.A05(false);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A1S(1, null);
        finish();
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A02.clearFocus();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("screenshots", this.A0K);
    }
}
