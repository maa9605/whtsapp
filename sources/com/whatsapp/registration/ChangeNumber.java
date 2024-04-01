package com.whatsapp.registration;

import X.AbstractActivityC50002Ot;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.AnonymousClass031;
import X.AnonymousClass075;
import X.C000200d;
import X.C000500h;
import X.C002701i;
import X.C005102h;
import X.C006602x;
import X.C019208x;
import X.C02A;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C04920Mm;
import X.C0AC;
import X.C0AG;
import X.C0AH;
import X.C0AI;
import X.C0C9;
import X.C0EG;
import X.C0KF;
import X.C0LX;
import X.C0U1;
import X.C26L;
import X.C28E;
import X.C2Aa;
import X.C2M0;
import X.C39701qa;
import X.C39711qb;
import X.C3V6;
import X.C3V7;
import X.C3VC;
import X.C40291rx;
import X.C40731sm;
import X.C41461tx;
import X.C41951um;
import X.C79683m3;
import X.C79693m4;
import X.C79703m5;
import X.InterfaceC002901k;
import X.InterfaceC51192Ux;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.JsonWriter;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class ChangeNumber extends AbstractActivityC50002Ot {
    public static String A0T;
    public static String A0U;
    public int A00;
    public int A01;
    public View A04;
    public ScrollView A05;
    public C04920Mm A06;
    public AnonymousClass031 A07;
    public C02L A08;
    public AnonymousClass075 A09;
    public C02E A0A;
    public C005102h A0B;
    public C02F A0C;
    public C000500h A0D;
    public C0C9 A0E;
    public C41461tx A0F;
    public C40291rx A0G;
    public C0EG A0H;
    public C3VC A0I;
    public C2Aa A0J;
    public C2M0 A0K;
    public C41951um A0L;
    public C006602x A0M;
    public InterfaceC002901k A0N;
    public ArrayList A0O;
    public long A02 = 0;
    public long A03 = 0;
    public final Runnable A0S = new RunnableEBaseShape5S0100000_I0_5(this, 25);
    public final InterfaceC51192Ux A0Q = new InterfaceC51192Ux() { // from class: X.3m2
        {
            ChangeNumber.this = this;
        }

        @Override // X.InterfaceC51192Ux
        public void AMU(int i) {
            ChangeNumber.this.A0P.sendEmptyMessage(3);
        }

        @Override // X.InterfaceC51192Ux
        public void AMV(String str) {
            String str2;
            ChangeNumber changeNumber = ChangeNumber.this;
            C02L c02l = changeNumber.A08;
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null && (str2 = userJid.user) != null && str2.equals(str)) {
                changeNumber.A0P.sendEmptyMessage(1);
            } else {
                changeNumber.A0P.sendEmptyMessage(2);
            }
        }
    };
    public final Handler A0P = new C3V6(this, Looper.getMainLooper());
    public final AbstractView$OnClickListenerC49532Ky A0R = new ViewOnClickCListenerShape10S0100000_I0_2(this, 15);

    public final void A1Q() {
        if (this.A05.canScrollVertically(1)) {
            this.A04.setElevation(this.A00);
        } else {
            this.A04.setElevation(0.0f);
        }
    }

    public final void A1R() {
        Log.i("changenumber/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        A15(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_sms).putExtra("permissions", new String[]{"android.permission.RECEIVE_SMS"}).putExtra("message_id", R.string.permission_sms_request).putExtra("force_ui", true), 2);
    }

    public final void A1S() {
        if (isFinishing()) {
            Log.i("changenumber/verify/cancel");
            return;
        }
        C26L.A0N = 0L;
        C000200d.A0i(this.A0D, "registration_code", null);
        this.A0F.A0F();
        StringBuilder sb = new StringBuilder();
        sb.append(C26L.A0O);
        sb.append(C26L.A0P);
        String A0S = C40731sm.A0S(sb.toString());
        byte[] A0E = C02A.A0E(this, A0S);
        if (A0E == null) {
            A0E = C02A.A0B();
            C02A.A09(this, A0E, A0S);
        }
        if (C0KF.A02()) {
            C0KF.A01(getApplicationContext(), this.A0N, this.A0D);
        }
        this.A0N.ARy(new C79703m5(((C26L) this).A09, this.A0D, ((C26L) this).A0E, C26L.A0O, C26L.A0P, A0E, null, null, false, C26L.A0N, this), new Void[0]);
    }

    public final void A1T(boolean z) {
        Intent intent = new Intent(this, VerifySms.class);
        intent.putExtra("changenumber", true);
        intent.putExtra("sms_retry_time", this.A02);
        intent.putExtra("voice_retry_time", this.A03);
        intent.putExtra("use_sms_retriever", z);
        A16(intent, true);
    }

    public final boolean A1U(String str, String str2, C3VC c3vc) {
        switch (C26L.A02(this.A07, str, str2)) {
            case 1:
                int parseInt = Integer.parseInt(str);
                String replaceAll = str2.replaceAll("\\D", "");
                try {
                    replaceAll = this.A07.A02(parseInt, replaceAll);
                } catch (IOException e) {
                    Log.e("changenumber/cc failed trimLeadingZero from CountryPhoneInfo", e);
                }
                StringBuilder sb = new StringBuilder("changenumber/cc=");
                sb.append(str);
                sb.append("/number=");
                sb.append(replaceAll);
                Log.i(sb.toString());
                C26L.A0O = str;
                C26L.A0P = replaceAll;
                return true;
            case 2:
                AUm(C26L.A03(this));
                c3vc.A02.requestFocus();
                return false;
            case 3:
                AUj(R.string.register_bad_cc_valid);
                c3vc.A02.setText("");
                c3vc.A02.requestFocus();
                return false;
            case 4:
                AUj(R.string.register_empty_phone);
                c3vc.A03.requestFocus();
                return false;
            case 5:
                AUm(getString(R.string.register_bad_phone_too_short, this.A0M.A03(((ActivityC02310Ar) this).A01, c3vc.A06)));
                c3vc.A03.requestFocus();
                return false;
            case 6:
                AUm(getString(R.string.register_bad_phone_too_long, this.A0M.A03(((ActivityC02310Ar) this).A01, c3vc.A06)));
                c3vc.A03.requestFocus();
                return false;
            case 7:
                AUm(getString(R.string.register_bad_phone, this.A0M.A03(((ActivityC02310Ar) this).A01, c3vc.A06)));
                c3vc.A03.requestFocus();
                return false;
            default:
                return false;
        }
    }

    @Override // X.C26N
    public void AK8() {
        this.A0S.run();
    }

    @Override // X.C26N
    public void AMO(String str, String str2, byte[] bArr) {
        C41951um c41951um = this.A0L;
        c41951um.A04();
        c41951um.A06();
        this.A0H.A05();
        this.A0G.A09(false);
        this.A08.A03();
        new File(getFilesDir(), "me").delete();
        this.A0J.A0D(C26L.A0O, C26L.A0P, null);
        this.A0J.A0B(4);
        this.A02 = System.currentTimeMillis() + (C28E.A02(str, 0L) * 1000);
        this.A03 = System.currentTimeMillis() + (C28E.A02(str2, 0L) * 1000);
        if (this.A0C.A02("android.permission.RECEIVE_SMS") == 0) {
            A1T(false);
        } else if (AnonymousClass029.A1L(this)) {
            C0AC A01 = new C39701qa((Activity) this).A01(new C39711qb());
            C0AH c0ah = new C0AH() { // from class: X.3lw
                {
                    ChangeNumber.this = this;
                }

                @Override // X.C0AH
                public final void APH(Object obj) {
                    ChangeNumber changeNumber = ChangeNumber.this;
                    Log.i("changenumber/smsretriever/onsuccess");
                    changeNumber.A1T(true);
                }
            };
            if (A01 != null) {
                Executor executor = C0AI.A00;
                A01.A02(executor, c0ah);
                A01.A01(executor, new C0AG() { // from class: X.3lv
                    {
                        ChangeNumber.this = this;
                    }

                    @Override // X.C0AG
                    public final void AKE(Exception exc) {
                        ChangeNumber changeNumber = ChangeNumber.this;
                        Log.e("changenumber/smsretriever/onfailure/ ", exc);
                        changeNumber.A1R();
                    }
                });
                return;
            }
            throw null;
        } else {
            A1R();
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 2) {
                StringBuilder A0P = C000200d.A0P("register/phone/sms permission ");
                A0P.append(i2 == -1 ? "granted" : "denied");
                Log.i(A0P.toString());
                A1T(false);
                return;
            }
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0O = intent.getStringArrayListExtra("selectedJids");
            C04920Mm c04920Mm = this.A06;
            C02L c02l = this.A08;
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                String str = userJid.user;
                ArrayList arrayList = this.A0O;
                if (c04920Mm != null) {
                    Log.i("changenumbermanager/savechangenumbercontacts");
                    try {
                        JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(c04920Mm.A02.A00.openFileOutput("change_number_contacts.json", 0), "UTF-8"));
                        jsonWriter.beginObject();
                        jsonWriter.name("old_jid").value(str);
                        jsonWriter.name("notify_jids").beginArray();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            jsonWriter.value((String) it.next());
                        }
                        jsonWriter.endArray();
                        jsonWriter.endObject();
                        jsonWriter.close();
                    } catch (FileNotFoundException e) {
                        Log.e("ChangeNumberManager/saveChangeNumberContacts/notFoundJson ", e);
                    } catch (IOException e2) {
                        Log.e("ChangeNumberManager/saveChangeNumberContacts/ioErrorJson ", e2);
                    }
                    String A0A = C000200d.A0A(this.A0I.A02);
                    String obj = this.A0I.A03.getText().toString();
                    if (A1U(A0A, obj, this.A0I) && A1U(C000200d.A0A(((C26L) this).A0B.A02), ((C26L) this).A0B.A03.getText().toString(), ((C26L) this).A0B)) {
                        int parseInt = Integer.parseInt(A0A);
                        String replaceAll = obj.replaceAll("\\D", "");
                        try {
                            replaceAll = this.A07.A02(parseInt, replaceAll);
                        } catch (IOException e3) {
                            Log.e("changenumber/phone failed trimLeadingZero from CountryPhoneInfo", e3);
                        }
                        StringBuilder sb = new StringBuilder("changenumber/phone/cc=");
                        sb.append(A0A);
                        sb.append("/number=");
                        sb.append(replaceAll);
                        Log.i(sb.toString());
                        A0T = A0A;
                        A0U = replaceAll;
                        StringBuilder A0P2 = C000200d.A0P("changenumber/submit/cc ");
                        A0P2.append(A0A);
                        A0P2.append(" ph=");
                        A0P2.append(replaceAll);
                        A0P2.append(" jid=");
                        C02L c02l2 = this.A08;
                        c02l2.A05();
                        A0P2.append(c02l2.A03);
                        Log.w(A0P2.toString());
                        if (!this.A0G.A0r.A03()) {
                            Log.w("changenumber/submit/no-connectivity");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(getString(R.string.change_number_check_connectivity));
                            sb2.append(" ");
                            sb2.append(getString(R.string.connectivity_check_connection));
                            sb2.append("\n\n");
                            sb2.append(getString(R.string.connectivity_self_help_instructions));
                            AUm(sb2.toString());
                            return;
                        }
                        C002701i.A19(this, 1);
                        Handler handler = this.A0P;
                        handler.sendEmptyMessageDelayed(4, 30000L);
                        if (!this.A0H.A0V(A0A, replaceAll)) {
                            handler.removeMessages(4);
                            C002701i.A18(this, 1);
                            AUm(getString(R.string.register_check_connectivity, getString(R.string.connectivity_self_help_instructions)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A05.getViewTreeObserver().addOnPreDrawListener(new C3V7(this));
        }
    }

    @Override // X.AbstractActivityC50002Ot, X.C26L, X.C26M, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String simCountryIso;
        super.onCreate(bundle);
        setTitle(R.string.change_number_title);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0M(true);
            setContentView(R.layout.change_number);
            PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) findViewById(R.id.registration_fields);
            PhoneNumberEntry phoneNumberEntry2 = (PhoneNumberEntry) findViewById(R.id.registration_new_fields);
            C3VC c3vc = new C3VC();
            this.A0I = c3vc;
            c3vc.A05 = phoneNumberEntry;
            C3VC c3vc2 = new C3VC();
            ((C26L) this).A0B = c3vc2;
            c3vc2.A05 = phoneNumberEntry2;
            this.A05 = (ScrollView) findViewById(R.id.scroll_view);
            this.A04 = findViewById(R.id.bottom_button_container);
            C3VC c3vc3 = this.A0I;
            WaEditText waEditText = phoneNumberEntry.A02;
            c3vc3.A02 = waEditText;
            waEditText.setContentDescription(getString(R.string.old_country_code_content_description));
            C3VC c3vc4 = ((C26L) this).A0B;
            WaEditText waEditText2 = phoneNumberEntry2.A02;
            c3vc4.A02 = waEditText2;
            waEditText2.setContentDescription(getString(R.string.new_country_code_content_description));
            this.A0I.A03 = phoneNumberEntry.A03;
            C3VC c3vc5 = ((C26L) this).A0B;
            WaEditText waEditText3 = phoneNumberEntry2.A03;
            c3vc5.A03 = waEditText3;
            C0LX.A03(waEditText3);
            C0LX.A03(this.A0I.A03);
            this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
            TelephonyManager A0G = this.A0A.A0G();
            if (A0G != null && (simCountryIso = A0G.getSimCountryIso()) != null) {
                try {
                    A0T = this.A07.A05(simCountryIso);
                } catch (IOException e) {
                    Log.e("changenumber/iso/code failed to get code from CountryPhoneInfo", e);
                }
            }
            phoneNumberEntry.A04 = new C79683m3(this);
            phoneNumberEntry2.A04 = new C79693m4(this);
            C3VC c3vc6 = this.A0I;
            c3vc6.A01 = C28E.A00(c3vc6.A03);
            C3VC c3vc7 = this.A0I;
            c3vc7.A00 = C28E.A00(c3vc7.A02);
            C3VC c3vc8 = ((C26L) this).A0B;
            c3vc8.A01 = C28E.A00(c3vc8.A03);
            C3VC c3vc9 = ((C26L) this).A0B;
            c3vc9.A00 = C28E.A00(c3vc9.A02);
            TextView textView = (TextView) findViewById(R.id.next_btn);
            textView.setText(R.string.next);
            textView.setOnClickListener(this.A0R);
            String str = A0T;
            if (str != null) {
                this.A0I.A02.setText(str);
                ((C26L) this).A0B.A02.setText(A0T);
            }
            String str2 = this.A0I.A06;
            if (str2 != null && str2.length() > 0) {
                C000200d.A14("changenumber/country: ", str2);
                this.A0I.A05.A00(str2);
                ((C26L) this).A0B.A05.A00(str2);
            }
            ((C26L) this).A0J = this.A0D.A00.getString("change_number_new_number_banned", null);
            this.A0J.A0l.add(this.A0Q);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
                this.A05.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3V3
                    {
                        ChangeNumber.this = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        ChangeNumber.this.A1Q();
                    }
                });
                this.A05.getViewTreeObserver().addOnPreDrawListener(new C3V7(this));
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.C26L, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(R.string.register_connecting));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.change_number_new_country_code_suggestion);
            c019208x.A06(R.string.btn_continue, new DialogInterface.OnClickListener() { // from class: X.3UA
                {
                    ChangeNumber.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ChangeNumber.this.A1S();
                }
            });
            return c019208x.A00();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        C2Aa c2Aa = this.A0J;
        c2Aa.A0l.remove(this.A0Q);
        super.onDestroy();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }

    @Override // X.C26L, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        C3VC c3vc = this.A0I;
        c3vc.A01 = C28E.A00(c3vc.A03);
        C3VC c3vc2 = this.A0I;
        c3vc2.A00 = C28E.A00(c3vc2.A02);
        C3VC c3vc3 = ((C26L) this).A0B;
        c3vc3.A01 = C28E.A00(c3vc3.A03);
        C3VC c3vc4 = ((C26L) this).A0B;
        c3vc4.A00 = C28E.A00(c3vc4.A02);
        if (((C26L) this).A0J != null) {
            C000500h c000500h = this.A0D;
            String str = C26L.A0O;
            String str2 = C26L.A0P;
            SharedPreferences.Editor A0D = c000500h.A0D();
            StringBuilder sb = new StringBuilder("+");
            sb.append(str);
            sb.append(str2);
            A0D.putString("change_number_new_number_banned", sb.toString()).apply();
        } else if (this.A0D.A00.getString("change_number_new_number_banned", null) == null) {
        } else {
            C000200d.A0f(this.A0D, "change_number_new_number_banned");
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A0T = bundle.getString("country_code");
        A0U = bundle.getString("phone_number");
        C26L.A0O = bundle.getString("countryCode");
        C26L.A0P = bundle.getString("phoneNumber");
        this.A0O = bundle.getStringArrayList("notifyJids");
        this.A01 = bundle.getInt("mode");
    }

    @Override // X.C26L, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        String str = A0T;
        if (str != null) {
            this.A0I.A02.setText(str);
        }
        C3VC c3vc = this.A0I;
        C28E.A0G(c3vc.A02, c3vc.A00);
        C3VC c3vc2 = this.A0I;
        C28E.A0G(c3vc2.A03, c3vc2.A01);
        C3VC c3vc3 = ((C26L) this).A0B;
        C28E.A0G(c3vc3.A02, c3vc3.A00);
        C3VC c3vc4 = ((C26L) this).A0B;
        C28E.A0G(c3vc4.A03, c3vc4.A01);
        this.A0I.A03.clearFocus();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("country_code", A0T);
        bundle.putCharSequence("phone_number", A0U);
        bundle.putCharSequence("countryCode", C26L.A0O);
        bundle.putCharSequence("phoneNumber", C26L.A0P);
        bundle.putStringArrayList("notifyJids", this.A0O);
        bundle.putInt("mode", this.A01);
    }
}
