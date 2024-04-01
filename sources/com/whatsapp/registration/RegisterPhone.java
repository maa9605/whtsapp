package com.whatsapp.registration;

import X.AbstractC465527h;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass031;
import X.AnonymousClass088;
import X.C000200d;
import X.C001200o;
import X.C002701i;
import X.C005002g;
import X.C005102h;
import X.C006602x;
import X.C019208x;
import X.C019308y;
import X.C02160Ac;
import X.C02770Cu;
import X.C02780Cv;
import X.C02A;
import X.C02E;
import X.C02F;
import X.C02O;
import X.C05G;
import X.C06870Vj;
import X.C0CA;
import X.C0DJ;
import X.C0DZ;
import X.C0E7;
import X.C0KF;
import X.C0LX;
import X.C0U1;
import X.C0We;
import X.C1KQ;
import X.C26K;
import X.C26L;
import X.C26O;
import X.C26P;
import X.C26Q;
import X.C28E;
import X.C2Aa;
import X.C2CQ;
import X.C2MG;
import X.C3VC;
import X.C3VD;
import X.C3VH;
import X.C3VI;
import X.C40071rX;
import X.C40291rx;
import X.C40301ry;
import X.C40731sm;
import X.C41451tw;
import X.C42161vG;
import X.C42181vJ;
import X.C49622Lq;
import X.C79703m5;
import X.C79783mD;
import X.DialogInterfaceC019408z;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class RegisterPhone extends C26K implements C26O, C26P {
    public static boolean A0j;
    public static boolean A0k;
    public int A01;
    public Dialog A04;
    public ScrollView A05;
    public TextView A06;
    public AnonymousClass031 A07;
    public C005002g A08;
    public TextEmojiLabel A09;
    public C06870Vj A0A;
    public C0E7 A0B;
    public C02E A0C;
    public C001200o A0D;
    public C005102h A0E;
    public C02F A0F;
    public C0CA A0G;
    public C49622Lq A0H;
    public C41451tw A0I;
    public C40291rx A0J;
    public C40301ry A0K;
    public C02O A0L;
    public C79703m5 A0M;
    public C3VI A0N;
    public C2Aa A0O;
    public C05G A0P;
    public C2CQ A0Q;
    public C42181vJ A0S;
    public C42161vG A0T;
    public AbstractC465527h A0U;
    public C2MG A0V;
    public C40071rX A0W;
    public C006602x A0X;
    public InterfaceC002901k A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public int A00 = 30;
    public long A02 = 0;
    public long A03 = 0;
    public C26Q A0R = new C26Q();
    public final C0DZ A0i = C0DZ.A00();

    @Override // X.C26N
    public void AK8() {
    }

    public static Intent A00(Context context) {
        return new Intent(context, RegisterPhone.class);
    }

    public static List A01(AnonymousClass031 anonymousClass031, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1KQ c1kq = (C1KQ) it.next();
            if (C26L.A02(anonymousClass031, c1kq.A00, c1kq.A02) == 1) {
                arrayList.add(c1kq);
            }
        }
        return arrayList;
    }

    public String A1Q() {
        Editable text = ((C26L) this).A0B.A03.getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    public void A1R() {
        this.A0e = false;
        this.A00 = 30;
        if (this.A06.getVisibility() != 0) {
            this.A06.setVisibility(8);
            return;
        }
        AlphaAnimation A03 = C000200d.A03(1.0f, 0.0f, 150L);
        this.A06.startAnimation(A03);
        A03.setAnimationListener(new C0DJ() { // from class: X.3mE
            {
                RegisterPhone.this = this;
            }

            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                RegisterPhone registerPhone = RegisterPhone.this;
                if (registerPhone.A0e) {
                    return;
                }
                registerPhone.A06.setVisibility(8);
            }
        });
    }

    public void A1S() {
        if (this.A0F.A02("android.permission.RECEIVE_SMS") == 0) {
            Log.i("registerphone/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission for SMB");
            A1W(false);
            return;
        }
        Log.i("registerphone/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_sms).putExtra("permissions", new String[]{"android.permission.RECEIVE_SMS"}).putExtra("message_id", R.string.permission_sms_request).putExtra("force_ui", true), 1);
    }

    public void A1T() {
        A0j = false;
        Editable text = ((C26L) this).A0B.A02.getText();
        String obj = text == null ? null : text.toString();
        String A1Q = A1Q();
        if (obj != null && A1Q != null && !obj.equals("") && C28E.A0A(this.A07, A1Q, obj, this.A0Z) != null) {
            new C3VH(this).start();
        } else {
            A1R();
        }
    }

    public final void A1U() {
        Log.i("register/phone/reset-state");
        C26L.A0M = 7;
        A1P();
        C28E.A0H(((ActivityC02290Ap) this).A0F, "");
        C26L.A0N = 0L;
        C000200d.A0i(((ActivityC02290Ap) this).A0F, "registration_code", null);
        this.A0O.A0D(null, null, null);
        this.A0O.A0B(0);
    }

    public final void A1V() {
        Log.i("register/phone/whats-my-number/permission-granted");
        this.A0R.A01 = 1;
        TelephonyManager A0G = this.A0C.A0G();
        if (A0G != null && A0G.getSimState() == 1) {
            Log.i("register/phone/whats-my-number/no-sim");
            this.A0R.A04 = -1;
            ((ActivityC02290Ap) this).A0A.A07(R.string.no_sim_error, 1);
            return;
        }
        List A0D = C28E.A0D(this.A0C, this.A0F, this.A0i);
        int size = ((AbstractCollection) A0D).size();
        List A01 = A01(this.A07, A0D);
        int size2 = ((AbstractCollection) A01).size();
        C26Q c26q = this.A0R;
        c26q.A03 = Integer.valueOf(size != size2 ? 1 : 0);
        c26q.A04 = Integer.valueOf(size2);
        if (size2 == 0) {
            Log.i("register/phone/whats-my-number/unable-to-get-phone-number-from-sim");
            ((ActivityC02290Ap) this).A0A.A07(R.string.no_phone_number_sim_error, 1);
            return;
        }
        Log.i("register/phone/whats-my-number/show-select-phone-number-dialog");
        ((ActivityC02270An) this).A0F.A01(((C26L) this).A0B.A03);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(A01);
        SelectPhoneNumberDialog selectPhoneNumberDialog = new SelectPhoneNumberDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("deviceSimInfoList", arrayList);
        selectPhoneNumberDialog.A0P(bundle);
        AUg(selectPhoneNumberDialog, null);
    }

    public final void A1W(boolean z) {
        C26L.A0M = 0;
        A1P();
        this.A0O.A0B(4);
        long j = this.A02;
        long j2 = this.A03;
        Intent intent = new Intent(this, VerifySms.class);
        intent.putExtra("sms_retry_time", j);
        intent.putExtra("voice_retry_time", j2);
        intent.putExtra("use_sms_retriever", z);
        startActivity(intent);
        finish();
    }

    @Override // X.C26O
    public void AID() {
        ((ActivityC02270An) this).A0F.A02(((C26L) this).A0B.A03);
    }

    @Override // X.C26N
    public void AMO(String str, String str2, byte[] bArr) {
        this.A02 = System.currentTimeMillis() + (C28E.A02(str, 0L) * 1000);
        this.A03 = System.currentTimeMillis() + (C28E.A02(str2, 0L) * 1000);
        if (((C26L) this).A0D.A02) {
            return;
        }
        C002701i.A19(this, 21);
    }

    @Override // X.C26O
    public void AMW(C1KQ c1kq) {
        this.A0R.A02 = 1;
        this.A0b = c1kq.A00;
        String str = c1kq.A02;
        this.A0c = str;
        ((C26L) this).A0B.A03.setText(str);
        ((C26L) this).A0B.A02.setText(this.A0b);
        EditText editText = ((C26L) this).A0B.A03;
        String A1Q = A1Q();
        if (A1Q == null) {
            throw null;
        }
        editText.setSelection(A1Q.length());
    }

    @Override // android.app.Activity
    public SharedPreferences getPreferences(int i) {
        return this.A0L.A01(getLocalClassName());
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (i2 == -1) {
                C26L.A0O = intent.getStringExtra("cc");
                this.A0a = intent.getStringExtra("iso");
                String stringExtra = intent.getStringExtra("country_name");
                ((C26L) this).A0B.A02.setText(C26L.A0O);
                ((C26L) this).A0B.A04.setText(stringExtra);
                ((C26L) this).A0B.A05.A00(this.A0a);
                SharedPreferences preferences = getPreferences(0);
                SharedPreferences.Editor edit = preferences.edit();
                edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", C26L.A0O);
                edit.putString("com.whatsapp.registration.RegisterPhone.country_code", C26L.A0O);
                if (preferences.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1) == -1) {
                    edit.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", Integer.MAX_VALUE);
                }
                edit.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1);
                if (!edit.commit()) {
                    Log.w("registerphone/actresult/commit failed");
                }
            }
            this.A0g = false;
        } else if (i == 1) {
            StringBuilder A0P = C000200d.A0P("register/phone/sms permission ");
            A0P.append(i2 == -1 ? "granted" : "denied");
            Log.i(A0P.toString());
            A1W(false);
        } else if (i != 155) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
        } else {
            this.A0Z = C28E.A0B(this.A0D, this.A0C, this.A0F);
            A1V();
        }
    }

    @Override // X.C26K, X.C26L, X.C26M, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.registerphone);
        this.A0N = new C3VI(this.A0Y, this.A0W, ((ActivityC02310Ar) this).A01, this.A0H, this.A0I);
        this.A0Z = C28E.A0B(this.A0D, this.A0C, this.A0F);
        if (this.A0P.A01() != 1) {
            Log.e("register/phone/create/wrong-state bounce to main");
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey()) {
            A0k(toolbar);
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A0L(false);
                A0c.A0O(false);
            }
        }
        ((TextView) findViewById(R.id.register_phone_toolbar_title)).setText(R.string.register_phone_header_experiment);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", false)) {
                C002701i.A19(this, 125);
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.resetstate", false)) {
                A1U();
            }
            this.A0d = intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
            if (intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code") != null && intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number") != null) {
                getPreferences(0).edit().putString("com.whatsapp.registration.RegisterPhone.input_phone_number", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.phone_number")).putString("com.whatsapp.registration.RegisterPhone.input_country_code", intent.getStringExtra("com.whatsapp.registration.RegisterPhone.country_code")).apply();
            }
            if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
                Log.i("register/phone/link/instructions/dialog");
                AUm(getString(R.string.register_tapped_link_no_phone_number, getString(R.string.ok)));
            }
        } else {
            this.A0d = false;
        }
        C3VC c3vc = new C3VC();
        ((C26L) this).A0B = c3vc;
        c3vc.A05 = (PhoneNumberEntry) findViewById(R.id.registration_fields);
        C3VC c3vc2 = ((C26L) this).A0B;
        PhoneNumberEntry phoneNumberEntry = c3vc2.A05;
        phoneNumberEntry.A04 = new C79783mD(this);
        c3vc2.A02 = phoneNumberEntry.A02;
        c3vc2.A04 = (TextView) findViewById(R.id.registration_country);
        ((C26L) this).A0B.A04.setBackground(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.abc_spinner_textfield_background_material)));
        C3VC c3vc3 = ((C26L) this).A0B;
        WaEditText waEditText = c3vc3.A05.A03;
        c3vc3.A03 = waEditText;
        C0LX.A03(waEditText);
        if (((ActivityC02310Ar) this).A01.A0N()) {
            ((C26L) this).A0B.A05.setPadding(getResources().getDimensionPixelSize(R.dimen.card_h_padding), ((C26L) this).A0B.A05.getPaddingTop(), ((C26L) this).A0B.A05.getPaddingRight(), ((C26L) this).A0B.A05.getPaddingBottom());
        }
        this.A05 = (ScrollView) findViewById(R.id.scroll_view);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.registration_info);
        this.A09 = textEmojiLabel;
        C000200d.A0b(textEmojiLabel);
        TextEmojiLabel textEmojiLabel2 = this.A09;
        textEmojiLabel2.setAccessibilityHelper(new C02780Cv(this.A0C, textEmojiLabel2));
        this.A09.setText(this.A0A.A01(this, getString(R.string.tos_registration_info)));
        this.A09.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.mistyped_undercard_text);
        this.A06 = textView;
        textView.setVisibility(8);
        if (getPreferences(0).getString("com.whatsapp.registration.RegisterPhone.input_country_code", null) == null) {
            TelephonyManager A0G = this.A0C.A0G();
            if (A0G == null) {
                Log.w("register/phone tm=null");
            } else {
                String simCountryIso = A0G.getSimCountryIso();
                if (simCountryIso != null) {
                    try {
                        String A05 = this.A07.A05(simCountryIso);
                        if (A05 != null) {
                            SharedPreferences.Editor edit = getPreferences(0).edit();
                            edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", A05);
                            if (!edit.commit()) {
                                Log.w("register/phone/input_cc/commit failed");
                            }
                        }
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder("register/phone/iso: ");
                        sb.append(simCountryIso);
                        sb.append(" failed to lookupCallingCode from CountryPhoneInfo");
                        Log.e(sb.toString(), e);
                    }
                }
            }
        }
        ((C26L) this).A0B.A04.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 16));
        ((C26L) this).A0B.A03.requestFocus();
        ((C26L) this).A0B.A03.setCursorVisible(true);
        final Button button = (Button) findViewById(R.id.registration_submit);
        button.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 17));
        String str = C26L.A0O;
        if (str != null) {
            ((C26L) this).A0B.A02.setText(str);
        }
        String charSequence = ((C26L) this).A0B.A04.getText().toString();
        if (charSequence.length() > 0) {
            ((C26L) this).A0B.A05.A00(charSequence);
        }
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        if (point.y <= 480) {
            getWindow().setSoftInputMode(3);
        }
        if (this.A08.A04()) {
            Log.w("register/phone/clock-wrong");
            AnonymousClass088.A23(this, this.A0J, this.A0K);
        } else if (this.A08.A03()) {
            Log.w("register/phone/sw-expired");
            AnonymousClass088.A24(this, this.A0J, this.A0K);
        }
        this.A05.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3UP
            {
                RegisterPhone.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                RegisterPhone registerPhone = RegisterPhone.this;
                Button button2 = button;
                int height = registerPhone.A05.getRootView().getHeight() - registerPhone.A05.getHeight();
                if (height > registerPhone.getResources().getDimensionPixelSize(R.dimen.registration_scroll_view_density)) {
                    registerPhone.A05.smoothScrollTo(0, button2.getTop());
                    StringBuilder sb2 = new StringBuilder("register/name/layout heightDiff:");
                    sb2.append(height);
                    C000200d.A1N(sb2, "scroll view");
                }
            }
        });
        Log.i("register/phone/whats-my-number/enabled");
        TextEmojiLabel textEmojiLabel3 = (TextEmojiLabel) findViewById(R.id.description);
        textEmojiLabel3.A07 = new C02770Cu();
        textEmojiLabel3.setAccessibilityHelper(new C02780Cv(this.A0C, textEmojiLabel3));
        textEmojiLabel3.setText(C28E.A06(getString(R.string.register_phone_number_code_confirm_experiment), "whats-my-number", new RunnableEBaseShape5S0100000_I0_5(this, 33)));
        textEmojiLabel3.setLinkTextColor(C02160Ac.A00(this, R.color.text_link_color));
        findViewById(R.id.sms_charge_warning).setVisibility(0);
    }

    @Override // X.C26L, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 21) {
            Log.i("register/phone/dialog/num_confirm");
            String string = getString(R.string.register_phone_phone_number_confirmation_message, ((ActivityC02310Ar) this).A01.A0F(C28E.A0C(C26L.A0O, C26L.A0P)));
            C019208x c019208x = new C019208x(this);
            Spanned fromHtml = Html.fromHtml(string);
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = fromHtml;
            c019308y.A0J = false;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3US
                {
                    RegisterPhone.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    final RegisterPhone registerPhone = RegisterPhone.this;
                    C002701i.A18(registerPhone, 21);
                    ((ActivityC02290Ap) registerPhone).A0F.A0b(C26L.A0O, C26L.A0P);
                    C001200o c001200o = registerPhone.A0D;
                    if (AnonymousClass029.A1L(c001200o.A00)) {
                        C0AC A01 = new C39701qa(c001200o.A00).A01(new C39711qb());
                        C0AH c0ah = new C0AH() { // from class: X.3kB
                            @Override // X.C0AH
                            public final void APH(Object obj) {
                                C26P c26p = registerPhone;
                                Log.i("registerphone/smsretriever/onsuccess");
                                ((RegisterPhone) c26p).A1W(true);
                            }
                        };
                        if (A01 != null) {
                            Executor executor = C0AI.A00;
                            A01.A02(executor, c0ah);
                            A01.A01(executor, new C0AG() { // from class: X.3kD
                                @Override // X.C0AG
                                public final void AKE(Exception exc) {
                                    C26P c26p = registerPhone;
                                    Log.e("registerphone/smsretriever/onfailure/ ", exc);
                                    ((RegisterPhone) c26p).A1S();
                                }
                            });
                            return;
                        }
                        throw null;
                    }
                    registerPhone.A1S();
                }
            });
            c019208x.A05(R.string.register_edit_button, new DialogInterface.OnClickListener() { // from class: X.3UQ
                {
                    RegisterPhone.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    RegisterPhone registerPhone = RegisterPhone.this;
                    C26L.A0M = 0;
                    C002701i.A18(registerPhone, 21);
                }
            });
            DialogInterfaceC019408z A00 = c019208x.A00();
            this.A04 = A00;
            A00.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.3UR
                {
                    RegisterPhone.this = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    RegisterPhone.this.A04 = null;
                }
            });
            return this.A04;
        }
        return super.onCreateDialog(i);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 5, 0, R.string.registration_help);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        if (this.A0M != null) {
            Log.i("register/phone/destroy canceling task");
            this.A0M.A05(true);
            this.A0M = null;
        }
        this.A0N.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("com.whatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
            Log.i("register/phone/newintent/link/instructions/dialog");
            AUm(getString(R.string.register_tapped_link_no_phone_number, getString(R.string.ok)));
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String obj;
        switch (menuItem.getItemId()) {
            case 0:
                this.A0O.A0A();
                startActivity(EULA.A00(this));
                finishAffinity();
                return true;
            case 1:
                String replaceAll = ((C26L) this).A0B.A02.getText().toString().replaceAll("\\D", "");
                String replaceAll2 = ((C26L) this).A0B.A03.getText().toString().replaceAll("\\D", "");
                byte[] A0B = C02A.A0B();
                StringBuilder sb = new StringBuilder();
                sb.append(replaceAll);
                sb.append(replaceAll2);
                C02A.A09(this, A0B, C40731sm.A0S(sb.toString()));
                return true;
            case 2:
                C02A.A06(this);
                return true;
            case 3:
                C0KF.A01(getApplicationContext(), this.A0Y, ((ActivityC02290Ap) this).A0F);
                return true;
            case 4:
                String replaceAll3 = ((C26L) this).A0B.A02.getText().toString().replaceAll("\\D", "");
                String replaceAll4 = ((C26L) this).A0B.A03.getText().toString().replaceAll("\\D", "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceAll3);
                sb2.append(replaceAll4);
                byte[] A0E = C02A.A0E(this, C40731sm.A0S(sb2.toString()));
                StringBuilder A0P = C000200d.A0P("register-phone rc=");
                if (A0E == null) {
                    obj = "(null)";
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    int length = A0E.length;
                    for (int i = 0; i < length; i++) {
                        sb3.append(String.format("%02X", Byte.valueOf(A0E[i])));
                    }
                    obj = sb3.toString();
                }
                C000200d.A1N(A0P, obj);
                return true;
            case 5:
                this.A0Q.A03(((C26L) this).A0L ? "validNumber" : "notValidNumber");
                this.A0Q.A03(((C26L) this).A0K ? "emptyNumber" : "notEmptyNumber");
                this.A0Q.A02("register-phone");
                this.A0N.A01(this, this.A0Q, "register-phone");
                return true;
            case 6:
                startActivity(new Intent().setClassName(this, "com.whatsapp.DebugToolsActivity"));
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // X.C26L, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        C3VD c3vd = ((C26L) this).A0D;
        c3vd.A02 = true;
        C28E.A0H(c3vd.A04, C28E.A00);
        StringBuilder sb = new StringBuilder("register/phone/pause ");
        sb.append(C26L.A0M);
        Log.i(sb.toString());
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putString("com.whatsapp.registration.RegisterPhone.country_code", C26L.A0O);
        edit.putString("com.whatsapp.registration.RegisterPhone.phone_number", C26L.A0P);
        edit.putInt("com.whatsapp.registration.RegisterPhone.verification_state", C26L.A0M);
        edit.putString("com.whatsapp.registration.RegisterPhone.input_phone_number", ((C26L) this).A0B.A03.getText().toString());
        edit.putString("com.whatsapp.registration.RegisterPhone.input_country_code", ((C26L) this).A0B.A02.getText().toString());
        edit.putInt("com.whatsapp.registration.RegisterPhone.country_code_position", C28E.A00(((C26L) this).A0B.A02));
        edit.putInt("com.whatsapp.registration.RegisterPhone.phone_number_position", C28E.A00(((C26L) this).A0B.A03));
        if (edit.commit()) {
            return;
        }
        Log.w("register/phone/pause/commit failed");
    }

    @Override // X.C26L, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        ((C26L) this).A0D.A00();
        SharedPreferences preferences = getPreferences(0);
        C26L.A0O = preferences.getString("com.whatsapp.registration.RegisterPhone.country_code", null);
        C26L.A0P = preferences.getString("com.whatsapp.registration.RegisterPhone.phone_number", null);
        C26L.A0M = preferences.getInt("com.whatsapp.registration.RegisterPhone.verification_state", 7);
        if (this.A0d) {
            this.A0d = false;
            ((C26L) this).A0B.A03.setText("");
        } else {
            String string = preferences.getString("com.whatsapp.registration.RegisterPhone.input_phone_number", null);
            ((C26L) this).A0B.A03.setText(string);
            if (!TextUtils.isEmpty(string)) {
                ((C26L) this).A0K = false;
                ((C26L) this).A0L = true;
            }
        }
        ((C26L) this).A0B.A02.setText(preferences.getString("com.whatsapp.registration.RegisterPhone.input_country_code", null));
        if (TextUtils.isEmpty(((C26L) this).A0B.A02.getText())) {
            ((C26L) this).A0B.A02.requestFocus();
        }
        C28E.A0G(((C26L) this).A0B.A03, preferences.getInt("com.whatsapp.registration.RegisterPhone.phone_number_position", -1));
        C28E.A0G(((C26L) this).A0B.A02, preferences.getInt("com.whatsapp.registration.RegisterPhone.country_code_position", -1));
        C000200d.A1F(new StringBuilder("register/phone/resume "), C26L.A0M);
        if (C26L.A0M == 15) {
            if (C26L.A0O != null && C26L.A0P != null) {
                C002701i.A19(this, 21);
            } else {
                Log.i("register/phone/reset-state");
                C26L.A0M = 7;
                A1P();
            }
        }
        this.A0E.A05(null, 1);
        this.A0O.A0B(1);
        C0CA c0ca = this.A0G;
        c0ca.A00.A0C();
        ArrayList arrayList = c0ca.A01;
        synchronized (arrayList) {
            arrayList.clear();
        }
    }
}
