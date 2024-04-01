package com.whatsapp.registration;

import X.AbstractC465527h;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass031;
import X.AnonymousClass088;
import X.C000200d;
import X.C000800k;
import X.C001200o;
import X.C002301c;
import X.C002701i;
import X.C005002g;
import X.C005102h;
import X.C018808t;
import X.C019208x;
import X.C019308y;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C05G;
import X.C05N;
import X.C09I;
import X.C0DZ;
import X.C0E7;
import X.C22B;
import X.C22C;
import X.C22D;
import X.C28E;
import X.C28F;
import X.C2Aa;
import X.C2CQ;
import X.C2DT;
import X.C2MG;
import X.C3V5;
import X.C3VD;
import X.C3VI;
import X.C3VP;
import X.C3Z0;
import X.C3Z4;
import X.C3Z5;
import X.C3Z6;
import X.C3Z7;
import X.C40071rX;
import X.C40291rx;
import X.C41451tw;
import X.C42151vF;
import X.C462626b;
import X.C49622Lq;
import X.C79733m8;
import X.C79803mF;
import X.C79823mH;
import X.C79833mI;
import X.C79893mO;
import X.C79903mP;
import X.DialogInterfaceC019408z;
import X.InterfaceC001000m;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.Main;
import com.whatsapp.Me;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class VerifySms extends C22B implements C22C, C22D {
    public static int A0v = 6;
    public static int A0w = 6;
    public static int A0x;
    public int A00;
    public CountDownTimer A03;
    public View A04;
    public View A05;
    public View A06;
    public ImageButton A07;
    public ProgressBar A08;
    public TextView A09;
    public CodeInputField A0A;
    public AnonymousClass031 A0B;
    public C005002g A0C;
    public TextEmojiLabel A0D;
    public C09I A0E;
    public C000800k A0F;
    public C0E7 A0G;
    public C02E A0H;
    public C462626b A0I;
    public AnonymousClass012 A0J;
    public C001200o A0K;
    public C005102h A0L;
    public C02F A0M;
    public C49622Lq A0N;
    public C41451tw A0O;
    public C018808t A0P;
    public C02O A0Q;
    public C3V5 A0R;
    public C3V5 A0S;
    public C28F A0T;
    public C42151vF A0U;
    public C3VD A0V;
    public C79733m8 A0W;
    public C3VI A0X;
    public C2DT A0Y;
    public C2Aa A0Z;
    public C05G A0a;
    public C79823mH A0b;
    public C2CQ A0c;
    public C3VP A0d;
    public C79903mP A0e;
    public AbstractC465527h A0f;
    public C2MG A0g;
    public C40071rX A0h;
    public InterfaceC002901k A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public long A02 = 0;
    public final C0DZ A0t = C0DZ.A00();
    public final InterfaceC001000m A0u = new InterfaceC001000m() { // from class: X.3m0
        {
            VerifySms.this = this;
        }

        @Override // X.InterfaceC001000m
        public final void AIx(C05050Nc c05050Nc) {
            VerifySms.this.A1W();
        }
    };
    public int A01 = -2;

    public static void A01(String str, String str2, NumberFormatException numberFormatException) {
        StringBuilder sb = new StringBuilder();
        sb.append("verifyvoice/request/");
        sb.append(str);
        sb.append(str2);
        Log.w(sb.toString(), numberFormatException);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
    }

    public static final String A00(Intent intent) {
        Uri data;
        if ("whatsapp".equals(intent.getScheme())) {
            Uri data2 = intent.getData();
            if (data2 == null || !"r".equals(data2.getHost())) {
                return null;
            }
            String queryParameter = data2.getQueryParameter("c");
            C000200d.A14("verifysms/codefromverificationlink/code/", queryParameter);
            return queryParameter;
        } else if (("http".equals(intent.getScheme()) || "https".equals(intent.getScheme())) && (data = intent.getData()) != null && "v.whatsapp.com".equals(data.getHost())) {
            String path = data.getPath();
            String substring = path.substring(path.lastIndexOf("/") + 1);
            C000200d.A14("verifysms/codefromverificationlink/code/", substring);
            return substring;
        } else {
            return null;
        }
    }

    public final long A1P() {
        long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.sms_request_failed_retry_time", -1L);
        System.currentTimeMillis();
        return j;
    }

    public final C79803mF A1Q(boolean z, C79893mO c79893mO) {
        return new C79803mF(z, this.A0k, this.A0l, "voice", null, this.A0K, c79893mO, this.A0H, this, ((ActivityC02290Ap) this).A0F, this.A0Y);
    }

    public final String A1R() {
        SharedPreferences preferences = getPreferences(0);
        String string = preferences.getString("com.whatsapp.registration.VerifySms.sms_cc", null);
        String string2 = preferences.getString("com.whatsapp.registration.VerifySms.sms_phone_number", null);
        if (this.A0k.equals(string) && this.A0l.equals(string2)) {
            return preferences.getString("com.whatsapp.registration.VerifySms.sms_code", null);
        }
        return null;
    }

    public final String A1S() {
        long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.call_countdown_end_time", -1L);
        long currentTimeMillis = j != -1 ? j - System.currentTimeMillis() : -1L;
        C000200d.A0u("verifysms/voice-retry-time/diff/", currentTimeMillis);
        if (currentTimeMillis > 0) {
            return getString(R.string.register_server_sms_next_method_with_wait_time, getString(R.string.verify_voice_call_button), AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, currentTimeMillis));
        }
        return getString(R.string.register_server_sms_next_method, getString(R.string.verify_voice_call_button));
    }

    public final String A1T() {
        long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.call_countdown_end_time", -1L);
        long j2 = -1;
        if (j != -1) {
            j2 = j - System.currentTimeMillis();
        }
        C000200d.A0u("verifysms/voice-retry-time/diff/", j2);
        if (j2 > 0) {
            return getString(R.string.register_server_sms_too_many_tries_try_voice_with_wait_time, getString(R.string.verify_voice_call_button), AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, j2));
        }
        return getString(R.string.register_server_sms_too_many_tries_try_voice, getString(R.string.verify_voice_call_button));
    }

    public final String A1U() {
        long A1P = A1P();
        long currentTimeMillis = A1P != -1 ? A1P - System.currentTimeMillis() : -1L;
        C000200d.A0u("verifysms/sms-retry-time/diff/", currentTimeMillis);
        if (currentTimeMillis > 0) {
            return getString(R.string.register_server_voice_next_method_with_wait_time, getString(R.string.verify_resend_sms_button), AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, currentTimeMillis));
        }
        return getString(R.string.register_server_voice_next_method, getString(R.string.verify_resend_sms_button));
    }

    public final String A1V() {
        long A1P = A1P();
        long currentTimeMillis = System.currentTimeMillis();
        long j = A1P != -1 ? A1P - currentTimeMillis : -1L;
        C000200d.A0u("verifysms/sms-retry-time/diff/", j);
        if (A1P > currentTimeMillis) {
            return getString(R.string.register_server_voice_too_many_tries_try_sms_with_wait_time, getString(R.string.verify_resend_sms_button), AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, j));
        }
        return getString(R.string.register_server_voice_too_many_tries_try_sms, getString(R.string.verify_resend_sms_button));
    }

    public final void A1W() {
        this.A0I.A01();
        NetworkInfo A04 = this.A0G.A04();
        StringBuilder sb = new StringBuilder("verifysms/network/active ");
        sb.append(A04);
        Log.i(sb.toString());
        int type = A04 == null ? -1 : A04.getType();
        int i = this.A01;
        if (type == i) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("verifysms/network/switch old=");
        A0P.append(i);
        A0P.append(" new=");
        A0P.append(type);
        Log.i(A0P.toString());
        this.A01 = type;
        if (type != -1 && hasMessages(1)) {
            Log.i("verifysms/network/switch/has-retry-pending");
            removeMessages(1);
            this.A00 = 0;
            String A1R = A1R();
            if (A1R != null) {
                sendMessage(obtainMessage(1, A1R));
            } else {
                Log.e("verifysms/network/switch/no-saved-code");
            }
        }
    }

    public final void A1X() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.remove("com.whatsapp.registration.VerifySms.code_verification_retry_time");
        if (edit.commit()) {
            return;
        }
        Log.e("verifysms/clear-code-verification-retry-time/error");
    }

    public final void A1Y() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.remove("com.whatsapp.registration.VerifySms.sms_code");
        edit.remove("com.whatsapp.registration.VerifySms.sms_cc");
        edit.remove("com.whatsapp.registration.VerifySms.sms_phone_number");
        if (edit.commit()) {
            return;
        }
        Log.w("verifysms/savedcode/clear/commit failed");
    }

    public final void A1Z() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.remove("com.whatsapp.registration.VerifySms.sms_request_failed_retry_time");
        if (edit.commit()) {
            return;
        }
        Log.e("verifysms/clear-sms-retry-time/error");
    }

    public final void A1a() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.remove("com.whatsapp.registration.VerifySms.call_countdown_end_time");
        if (edit.commit()) {
            return;
        }
        Log.e("verifysms/clear-voice-retry-time/error");
    }

    public final void A1b() {
        try {
            startActivity(new Intent("android.intent.action.VIEW", C40071rX.A00().appendPath("link").appendPath("verification.php").appendQueryParameter("platform", "android").appendQueryParameter("lc", ((ActivityC02310Ar) this).A01.A03()).appendQueryParameter("lg", ((ActivityC02310Ar) this).A01.A04()).build()));
        } catch (ActivityNotFoundException unused) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.activity_not_found, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009f  */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.1Ce] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1c() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifySms.A1c():void");
    }

    public final void A1d() {
        if (this.A0V.A02 || AFE()) {
            C28E.A0E(this, this.A0L, -1);
        }
    }

    public final void A1e() {
        Intent intent;
        A0x = 0;
        A1f();
        removeMessages(1);
        if (!this.A0m) {
            this.A0Z.A0B(1);
            intent = new Intent(this, RegisterPhone.class);
            intent.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        } else {
            this.A0Z.A0B(3);
            Log.i("verifysms/returntoregphone/changenumber/setregverified");
            C2Aa c2Aa = this.A0Z;
            if (c2Aa != null) {
                Log.i("registrationmanager/revert-to-old");
                C02L c02l = c2Aa.A05;
                Me A01 = c02l.A01();
                c02l.A05();
                if (!c02l.A08(A01, "me")) {
                    finish();
                } else {
                    c02l.A05();
                    c02l.A06(A01);
                    C000200d.A0j(c2Aa.A0K, "new_jid", false);
                    c02l.A04();
                    c2Aa.A03.A02();
                    C05N c05n = c2Aa.A0O;
                    if (c05n.A01.A08(false)) {
                        Log.i("registrationmanager/revert/msgstoredb/healthy");
                        c2Aa.A0M.A07(false);
                        c05n.A01();
                        c2Aa.A0V.A03();
                        c2Aa.A0F.A04();
                    } else {
                        C40291rx c40291rx = c2Aa.A0V;
                        if (c40291rx != null) {
                            Message obtain = Message.obtain(null, 0, 0, 0);
                            obtain.getData().putBoolean("should_register", false);
                            c40291rx.A10.sendMessage(obtain);
                        } else {
                            throw null;
                        }
                    }
                }
                intent = new Intent(this, ChangeNumber.class);
            } else {
                throw null;
            }
        }
        A1a();
        A1Z();
        A1X();
        startActivity(intent);
        finish();
    }

    public final void A1f() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("com.whatsapp.registration.VerifySms.verification_state", A0x);
        if (edit.commit()) {
            return;
        }
        Log.w("verifysms/savestate/commit failed");
    }

    public final void A1g() {
        long A1P = A1P();
        long currentTimeMillis = System.currentTimeMillis();
        long j = A1P != -1 ? A1P - currentTimeMillis : -1L;
        if (A1P > currentTimeMillis) {
            this.A0Z.A0C(j);
        }
    }

    public final void A1h() {
        if (this.A0V.A02 || AFE()) {
            C28E.A0E(this, this.A0L, -1);
        }
    }

    public final void A1i() {
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
        this.A03 = null;
        A1X();
        this.A08.setProgress(100);
        this.A09.setText(getString(R.string.verify_description_bottom, Integer.valueOf(A0v)));
        this.A0n = false;
        this.A0A.setEnabled(true);
    }

    public final void A1j() {
        if (this.A0s) {
            if (this.A0r) {
                unregisterReceiver(this.A0b);
                this.A0r = false;
            }
        } else if (this.A0p) {
            unregisterReceiver(this.A0W);
            this.A0p = false;
        }
    }

    public final void A1k() {
        long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.call_countdown_end_time", -1L);
        if (j != -1) {
            long currentTimeMillis = j - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                this.A0R.A01(currentTimeMillis, true);
            } else {
                A1a();
            }
        }
    }

    public final void A1l() {
        if (A0x == 12) {
            this.A05.setVisibility(8);
            this.A04.setVisibility(8);
            this.A06.setVisibility(8);
            return;
        }
        this.A05.setVisibility(0);
        A1k();
    }

    public final void A1m() {
        this.A0D.setText(R.string.register_user_is_banned_top);
        this.A09.setText(R.string.register_user_is_banned_bottom);
        this.A04.setVisibility(8);
        this.A06.setVisibility(8);
        this.A05.setVisibility(8);
        C002701i.A19(this, 124);
    }

    public final void A1n(int i) {
        if (this.A0V.A02 || AFE()) {
            C28E.A0E(this, this.A0L, i);
        } else {
            C002701i.A19(this, i);
        }
    }

    public final void A1o(long j) {
        StringBuilder sb = new StringBuilder("verifysms/save-sms-retry-time/");
        sb.append(j);
        Log.i(sb.toString());
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putLong("com.whatsapp.registration.VerifySms.sms_request_failed_retry_time", j);
        if (edit.commit()) {
            return;
        }
        Log.e("verifysms/save-sms-retry-time/error");
    }

    public final void A1p(long j) {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putLong("com.whatsapp.registration.VerifySms.call_countdown_end_time", j);
        if (edit.commit()) {
            return;
        }
        Log.e("verifysms/save-voice-retry-time/error");
    }

    public final void A1q(final long j) {
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A03 = null;
        }
        if (j < 1000) {
            A1X();
            return;
        }
        this.A0n = true;
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putLong("com.whatsapp.registration.VerifySms.code_verification_retry_time", System.currentTimeMillis() + j);
        if (!edit.commit()) {
            Log.e("verifysms/save-code-verification-retry-time/error");
        }
        this.A0A.setEnabled(false);
        this.A08.setProgress(0);
        this.A09.setText(R.string.verify_description_bottom_code_input_disable);
        this.A03 = new CountDownTimer(j) { // from class: X.3VO
            {
                VerifySms.this = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                VerifySms verifySms = VerifySms.this;
                verifySms.A03 = null;
                verifySms.A0A.setEnabled(true);
                verifySms.A08.setProgress(100);
                verifySms.A09.setText(verifySms.getString(R.string.verify_description_bottom, Integer.valueOf(VerifySms.A0v)));
                verifySms.A0n = false;
                verifySms.A1X();
                String A1R = verifySms.A1R();
                if (A1R != null) {
                    Log.i("verifysms/countdowntimer/done/try-savedcode");
                    verifySms.A00 = 0;
                    InterfaceC002901k interfaceC002901k = verifySms.A0i;
                    String str = verifySms.A0k;
                    String str2 = verifySms.A0l;
                    if (str2 != null) {
                        interfaceC002901k.ARy(new C79833mI(str, str2, "sms", C3Z0.TAPPED_LINK, verifySms, ((ActivityC02290Ap) verifySms).A0F, verifySms.A0Y, verifySms.A0e), A1R);
                        return;
                    }
                    throw null;
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                ProgressBar progressBar = VerifySms.this.A08;
                long j3 = j;
                progressBar.setProgress((int) (((j3 - j2) * 100.0d) / j3));
            }
        }.start();
    }

    public void A1r(String str) {
        int length;
        int i;
        if (str == null || (length = str.length()) != (i = A0w)) {
            return;
        }
        if (length == i) {
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isDigit(str.charAt(i2))) {
                }
            }
            InterfaceC002901k interfaceC002901k = this.A0i;
            String str2 = this.A0k;
            String str3 = this.A0l;
            if (str3 != null) {
                interfaceC002901k.ARy(new C79833mI(str2, str3, "voice", C3Z0.TYPED, this, ((ActivityC02290Ap) this).A0F, this.A0Y, this.A0e), str);
                return;
            }
            throw null;
        }
        C002701i.A19(this, 33);
    }

    public final void A1s(String str) {
        if (this.A0n) {
            Log.i("verifysms/verificationlink/voice/code-entry-blocked-retry-later");
            A1t(str);
            return;
        }
        C000200d.A1F(C000200d.A0P("verifysms/verificationlink/voice/state "), A0x);
        this.A0A.setText(str);
    }

    public final void A1t(String str) {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putString("com.whatsapp.registration.VerifySms.sms_code", str);
        edit.putString("com.whatsapp.registration.VerifySms.sms_cc", this.A0k);
        edit.putString("com.whatsapp.registration.VerifySms.sms_phone_number", this.A0l);
        if (edit.commit()) {
            return;
        }
        Log.w("verifysms/savedcode/save/commit failed");
    }

    public final void A1u(String str) {
        double random = Math.random();
        int i = this.A00;
        this.A00 = i + 1;
        int pow = (int) ((Math.pow(2.0d, i) - 1.0d) * 4000.0d * random);
        C000200d.A0q("verifysms/verifysms/schedule-retry/", pow);
        sendMessageDelayed(obtainMessage(1, str), pow);
    }

    public final void A1v(String str, C3Z4 c3z4) {
        C000200d.A18("verify/request/", str, "/code/ok");
        C000200d.A0j(((ActivityC02290Ap) this).A0F, "new_jid", c3z4.A0G);
        A26(this.A0k, this.A0l, c3z4.A08);
    }

    public final void A1w(String str, C3Z4 c3z4) {
        long A02;
        long A022;
        if (str.equals("sms")) {
            String str2 = c3z4.A0C;
            if (str2 == null) {
                str2 = c3z4.A0B;
            }
            A02 = C28E.A02(str2, -1L) * 1000;
            A022 = C28E.A02(c3z4.A0D, -1L);
        } else if (!str.equals("voice") && !str.equals("flash")) {
            throw new IllegalArgumentException(C000200d.A0H("Invalid method: ", str));
        } else {
            A02 = C28E.A02(c3z4.A0C, -1L) * 1000;
            String str3 = c3z4.A0D;
            if (str3 == null) {
                str3 = c3z4.A0B;
            }
            A022 = C28E.A02(str3, -1L);
        }
        long j = A022 * 1000;
        if (A02 > 0) {
            this.A04.setVisibility(0);
            this.A0S.A01(A02, true);
            A1o(System.currentTimeMillis() + A02);
        } else {
            int i = (A02 > 0L ? 1 : (A02 == 0L ? 0 : -1));
            View view = this.A04;
            if (i < 0) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
                this.A0S.A02(true);
                A1Z();
            }
        }
        if (j > 0) {
            this.A06.setVisibility(0);
            this.A0R.A01(j, true);
            A1p(System.currentTimeMillis() + j);
            return;
        }
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        View view2 = this.A06;
        if (i2 < 0) {
            view2.setVisibility(8);
            return;
        }
        view2.setVisibility(0);
        this.A0R.A02(true);
        A1a();
    }

    public final void A1x(String str, C3Z4 c3z4, String str2) {
        C000200d.A1M(C000200d.A0X("verify", str, "/request/", str, "/bad-parameter/"), c3z4.A0A);
        if (((ActivityC02290Ap) this).A0A != null) {
            C28E.A0H(((ActivityC02290Ap) this).A0F, str2);
            if ("number".equals(c3z4.A0A)) {
                this.A0V.A01(38);
                return;
            }
            this.A0V.A01(27);
            if (!str.equals("sms")) {
                return;
            }
            A1d();
            return;
        }
        throw null;
    }

    public final void A1y(String str, C3Z4 c3z4, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/next-method");
        Log.w(sb.toString());
        C28E.A0H(((ActivityC02290Ap) this).A0F, str2);
        A1w(str, c3z4);
        this.A0V.A01(40);
        A1g();
    }

    public final void A1z(String str, C3Z4 c3z4, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/provider-unroutable");
        Log.e(sb.toString());
        C28E.A0H(((ActivityC02290Ap) this).A0F, str2);
        String str3 = c3z4.A0B;
        if (str3 == null) {
            this.A0V.A02(i);
            return;
        }
        try {
            long parseLong = Long.parseLong(str3) * 1000;
            this.A0Z.A0C(parseLong);
            this.A0V.A03(getString(i2, AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, parseLong)));
            A1p(System.currentTimeMillis() + parseLong);
            this.A0R.A01(parseLong, true);
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("verify");
            sb2.append(str);
            sb2.append("/request/");
            sb2.append(str);
            sb2.append("/unroutable/time-not-int");
            Log.w(sb2.toString(), e);
            this.A0V.A02(i);
        }
    }

    public final void A20(String str, C3Z4 c3z4, String str2, int i, int i2, String str3) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/no-routes");
        Log.w(sb.toString());
        C28E.A0H(((ActivityC02290Ap) this).A0F, str2);
        String str4 = c3z4.A0B;
        if (str4 == null) {
            this.A0V.A02(i);
            this.A0c.A03(str3);
            return;
        }
        try {
            long parseLong = Long.parseLong(str4) * 1000;
            this.A0Z.A0C(parseLong);
            this.A0V.A03(getString(i2, AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, parseLong)));
            A1p(System.currentTimeMillis() + parseLong);
            this.A0R.A01(parseLong, true);
            this.A0c.A03(str3);
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("verify");
            sb2.append(str);
            sb2.append("/request/");
            sb2.append(str);
            sb2.append("/no-routes/time-not-int");
            Log.w(sb2.toString(), e);
            this.A0V.A02(i);
        }
    }

    public final void A21(String str, C3Z5 c3z5, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        C000200d.A1M(sb, c3z5 == C3Z5.ERROR_BAD_TOKEN ? "/bad-token" : "/invalid-skey");
        C28E.A0H(((ActivityC02290Ap) this).A0F, str2);
        this.A0V.A01(43);
    }

    public final void A22(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/blocked");
        Log.e(sb.toString());
        A0x = 12;
        A1f();
        C28E.A0H(((ActivityC02290Ap) this).A0F, str2);
        A1m();
    }

    public final void A23(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/missing-parameter");
        Log.e(sb.toString());
        if (((ActivityC02290Ap) this).A0A != null) {
            C28E.A0H(((ActivityC02290Ap) this).A0F, str2);
            this.A0V.A01(28);
            return;
        }
        throw null;
    }

    public final void A24(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/unspecified");
        Log.w(sb.toString());
        C28E.A0H(((ActivityC02290Ap) this).A0F, str2);
        this.A0V.A01(109);
    }

    public final void A25(String str, String str2, long j) {
        this.A0Z.A0B(7);
        ((ActivityC02290Ap) this).A0F.A0c(str, str2, j, -1L, -1L, this.A0J.A05());
        Intent A00 = VerifyTwoFactorAuth.A00(this, "verify_sms");
        A00.putExtra("changenumber", this.A0m);
        A14(A00);
        finish();
    }

    public final void A26(String str, String str2, String str3) {
        this.A0Z.A0D(str, str2, str3);
        A0x = 0;
        A1f();
        this.A0Z.A05();
        if (this.A0m && !this.A0Z.A0E()) {
            finish();
            return;
        }
        removeMessages(1);
        A1Y();
        if (this.A0V.A02) {
            C28E.A0F(this, this.A0Z, this.A0L, this.A0m);
        } else if (this.A0m) {
            startActivity(new Intent(this, Main.class));
        } else {
            this.A0Z.A0B(2);
            startActivity(new Intent(this, RegisterName.class));
        }
        ((ActivityC02290Ap) this).A0F.A00.edit().remove("flash_call_eligible").remove("is_first_flash_call_request").apply();
        this.A0T.A01();
        this.A0U.A02(false);
        finish();
    }

    public final void A27(boolean z) {
        String str;
        TelephonyManager A0G = this.A0H.A0G();
        if (A0G != null) {
            A0G.getNetworkOperator();
            A0G.getNetworkOperatorName();
            A0G.getSimOperator();
            A0G.getSimOperatorName();
        }
        Log.i("verifysms/request-sms");
        C000200d.A0i(((ActivityC02290Ap) this).A0F, "registration_code", null);
        C79893mO c79893mO = new C79893mO(((ActivityC02290Ap) this).A0F.A08());
        if (((ActivityC02290Ap) this).A0F.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
            c79893mO.A02 = true;
        }
        InterfaceC002901k interfaceC002901k = this.A0i;
        String str2 = this.A0k;
        String str3 = this.A0l;
        C02F c02f = this.A0M;
        if (this.A0s) {
            str = "2";
        } else {
            str = c02f.A02("android.permission.RECEIVE_SMS") == 0 ? "1" : "0";
        }
        interfaceC002901k.ARy(new C79803mF(z, str2, str3, "sms", str, this.A0K, c79893mO, this.A0H, this, ((ActivityC02290Ap) this).A0F, this.A0Y), new String[0]);
    }

    @Override // X.C22D
    public void AEe(boolean z, String str) {
        if (str.equals("sms")) {
            if (z) {
                C002701i.A18(this, 39);
            }
        } else if (!str.equals("voice") && !str.equals("flash")) {
        } else {
            C002701i.A18(this, 25);
        }
    }

    @Override // X.C22C
    public void AEg() {
        C002701i.A18(this, 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:331:0x00b5  */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.2DU] */
    @Override // X.C22D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AIg(java.lang.String r33, X.C3Z5 r34, X.C3Z4 r35) {
        /*
            Method dump skipped, instructions count: 2081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifySms.AIg(java.lang.String, X.3Z5, X.3Z4):void");
    }

    @Override // X.C22C
    public void AIh(String str, C3Z7 c3z7, C3Z6 c3z6) {
        long parseLong;
        C3Z7 c3z72 = C3Z7.FAIL_STALE;
        C3Z7 c3z73 = C3Z7.FAIL_BLOCKED;
        C3Z7 c3z74 = C3Z7.ERROR_UNSPECIFIED;
        C3Z7 c3z75 = C3Z7.FAIL_TOO_MANY_GUESSES;
        C3Z7 c3z76 = C3Z7.FAIL_MISSING;
        C3Z7 c3z77 = C3Z7.SECURITY_CODE;
        C3Z7 c3z78 = C3Z7.FAIL_TEMPORARILY_UNAVAILABLE;
        C3Z7 c3z79 = C3Z7.FAIL_GUESSED_TOO_FAST;
        C3Z7 c3z710 = C3Z7.ERROR_CONNECTIVITY;
        C3Z7 c3z711 = C3Z7.FAIL_MISMATCH;
        C3Z7 c3z712 = C3Z7.YES;
        if (str.equals("sms")) {
            if (c3z7 == c3z712) {
                Log.i("verifysms/verifysms/verified");
                C000200d.A0j(((ActivityC02290Ap) this).A0F, "new_jid", c3z6.A07);
                this.A0S.A02(true);
                A1Y();
                A26(this.A0k, this.A0l, c3z6.A03);
            } else if (c3z7 == c3z711) {
                Log.i("verifysms/verifysms/unauthorized");
                C28E.A0H(((ActivityC02290Ap) this).A0F, "server-send-mismatch");
                A1Y();
                A1n(34);
            } else {
                String A1R = A1R();
                if (c3z7 == c3z710) {
                    Log.w("verifysms/verifysms/connectivity");
                    if (A1R == null) {
                        Log.e("verifysms/verifysms/error/connectivity/saved-code-is-null");
                        A0x = 4;
                        A1f();
                        A1n(21);
                        return;
                    }
                    A1u(A1R);
                } else if (c3z7 == c3z79) {
                    Log.e("verifysms/verifysms/guessed-too-fast");
                    C28E.A0H(((ActivityC02290Ap) this).A0F, "server-send-guessed-too-fast");
                    if (A1R == null) {
                        Log.e("verifysms/verifysms/error/too-fast/saved-code-is-null");
                        A1h();
                        return;
                    }
                    A1u(A1R);
                } else if (c3z7 == c3z78) {
                    Log.e("verifysms/verifysms/error-temporarily-unavailable");
                    C28E.A0H(((ActivityC02290Ap) this).A0F, "server-send-error-temporarily-unavailable");
                    if (A1R == null) {
                        Log.e("verifysms/verifysms/error/temp-unavail/saved-code-is-null");
                        A1h();
                        return;
                    }
                    A1u(A1R);
                } else if (c3z7 == c3z77) {
                    Log.i("verifysms/verifysms/2fa");
                    A25(c3z6.A06, c3z6.A05, c3z6.A00);
                } else {
                    A1Y();
                    if (c3z7 == c3z76) {
                        Log.e("verifysms/verifysms/missing");
                        C28E.A0H(((ActivityC02290Ap) this).A0F, "server-send-missing");
                        this.A0A.setText("");
                    } else if (c3z7 == c3z75) {
                        Log.e("verifysms/verifysms/too-many-guesses");
                        C28E.A0H(((ActivityC02290Ap) this).A0F, "server-send-too-many-guesses");
                        this.A0c.A03("failTooMany");
                        this.A0c.A02("verify-tmg");
                    } else if (c3z7 == c3z74) {
                        Log.e("verifysms/verifysms/error");
                        C28E.A0H(((ActivityC02290Ap) this).A0F, "server-send-error-unspecified");
                    } else if (c3z7 == c3z72) {
                        Log.e("verifysms/verifysms/stale");
                        C28E.A0H(((ActivityC02290Ap) this).A0F, "server-send-error-stale");
                        this.A0A.setText("");
                    }
                    if (c3z7 == c3z73) {
                        Log.e("verifysms/verifysms/blocked");
                        A0x = 12;
                        A1f();
                        C28E.A0H(((ActivityC02290Ap) this).A0F, "server-send-blocked");
                        A1m();
                        A1d();
                        return;
                    }
                    A1h();
                }
            }
        } else if (!str.equals("voice") && !str.equals("flash")) {
        } else {
            if (c3z7 == c3z712) {
                Log.i("verifyvoice/verifyvoice/verified");
                C000200d.A0j(((ActivityC02290Ap) this).A0F, "new_jid", c3z6.A07);
                if (str == "flash") {
                    this.A0T.A01 = "successful";
                }
                A26(this.A0k, this.A0l, c3z6.A03);
            } else if (c3z7 == c3z711) {
                Log.i("verifyvoice/verifyvoice/incorrect");
                this.A0A.setText("");
                String str2 = c3z6.A04;
                if (str2 != null) {
                    try {
                        parseLong = Long.parseLong(str2) * 1000;
                    } catch (NumberFormatException e) {
                        Log.w("verifyvoice/verifyvoice/retryafter failed to parse", e);
                    }
                    if (parseLong <= 0) {
                        this.A0V.A02(R.string.register_voice_input_error_message);
                        A1q(parseLong);
                    }
                    this.A0V.A03(getString(R.string.register_voice_input_error_message_with_time, AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, parseLong)));
                    A1q(parseLong);
                }
                parseLong = 60000;
                this.A0V.A03(getString(R.string.register_voice_input_error_message_with_time, AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, parseLong)));
                A1q(parseLong);
            } else if (c3z7 == c3z74) {
                Log.e("verifyvoice/verifyvoice/error");
                this.A07.setVisibility(0);
                this.A0V.A01(109);
            } else if (c3z7 == c3z76) {
                Log.e("verifyvoice/verifyvoice/error-missing");
                this.A0A.setText("");
                this.A0V.A03(getString(R.string.verify_code_need_to_request_code, getString(R.string.verify_resend_sms_button), getString(R.string.verify_voice_call_button)));
            } else if (c3z7 == c3z75) {
                Log.e("verifyvoice/verifyvoice/error-too-many-guesses");
                this.A0c.A03("failTooMany");
                this.A0c.A02("verify-tmg");
                String str3 = c3z6.A04;
                if (str3 != null) {
                    try {
                        long parseLong2 = Long.parseLong(str3) * 1000;
                        this.A02 = parseLong2;
                        this.A0Z.A0C(parseLong2);
                        this.A0V.A01(36);
                        A1q(this.A02);
                    } catch (NumberFormatException e2) {
                        Log.w("verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter", e2);
                        this.A0V.A01(31);
                    }
                } else {
                    this.A0V.A01(31);
                }
            } else if (c3z7 == c3z79) {
                Log.e("verifyvoice/verifyvoice/error-guessed-too-fast");
                this.A0A.setText("");
                String str4 = c3z6.A04;
                if (str4 != null) {
                    try {
                        long parseLong3 = Long.parseLong(str4) * 1000;
                        this.A0Z.A0C(parseLong3);
                        this.A0V.A03(getString(R.string.register_guessed_too_fast_with_time, AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, parseLong3)));
                        A1q(parseLong3);
                    } catch (NumberFormatException e3) {
                        Log.w("verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter", e3);
                        this.A0V.A02(R.string.register_guessed_too_fast);
                    }
                } else {
                    this.A0V.A02(R.string.register_guessed_too_fast);
                }
            } else if (c3z7 == c3z710) {
                Log.e("verifyvoice/verifyvoice/error-connectivity");
                this.A07.setVisibility(0);
                this.A0V.A03(getString(R.string.register_check_connectivity, getString(R.string.connectivity_self_help_instructions)));
            } else if (c3z7 == c3z73) {
                Log.e("verifyvoice/verifyvoice/error-blocked");
                A0x = 12;
                A1m();
            } else if (c3z7 == c3z72) {
                Log.w("verifyvoice/verifyvoice/stale");
                this.A0A.setText("");
                this.A0V.A02(R.string.register_stale);
            } else if (c3z7 == c3z78) {
                Log.w("verifyvoice/verifyvoice/temporarily-unavailable");
                C28E.A0H(((ActivityC02290Ap) this).A0F, "voice-temporarily-unavailable");
                String str5 = c3z6.A04;
                if (str5 != null) {
                    try {
                        long parseLong4 = Long.parseLong(str5) * 1000;
                        this.A0Z.A0C(parseLong4);
                        this.A0V.A03(getString(R.string.register_temporarily_unavailable_with_time, AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, parseLong4)));
                        A1q(parseLong4);
                    } catch (NumberFormatException e4) {
                        Log.w("verifyvoice/verifyvoice/unable-to-parse-retryAfter", e4);
                        this.A0V.A02(R.string.register_temporarily_unavailable);
                    }
                } else {
                    this.A0V.A02(R.string.register_temporarily_unavailable);
                }
            } else if (c3z7 == c3z77) {
                Log.i("verifyvoice/verifyvoice/2fa");
                A25(c3z6.A06, c3z6.A05, c3z6.A00);
            }
            A1l();
        }
    }

    @Override // X.C22C
    public void ANd() {
        this.A0T.A01 = "failed";
    }

    @Override // X.C22D
    public void AUs(boolean z, String str) {
        if (str.equals("sms")) {
            A0x = 0;
            this.A0S.A00();
            this.A0R.A00();
            if (this.A0s) {
                this.A0r = true;
                registerReceiver(this.A0b, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
            } else {
                IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
                intentFilter.setPriority(Integer.MAX_VALUE);
                registerReceiver(this.A0W, intentFilter);
                this.A0p = true;
            }
            this.A0Z.A05();
            if (z) {
                C002701i.A19(this, 39);
            }
        } else if ((str.equals("voice") || str.equals("flash")) && z) {
            C002701i.A19(this, 25);
        }
        this.A0T.A01();
    }

    @Override // X.C22C
    public void AUt() {
        C002701i.A19(this, 24);
    }

    @Override // android.app.Activity
    public SharedPreferences getPreferences(int i) {
        return this.A0Q.A01(getLocalClassName());
    }

    public void lambda$onCreate$2178$VerifySms(View view) {
        StringBuilder A0P = C000200d.A0P("verifysms/request-call/cc=");
        A0P.append(this.A0k);
        A0P.append("/number=");
        C000200d.A1N(A0P, this.A0l);
        this.A0T.A01 = "ineligible";
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            C000200d.A1F(C000200d.A0P("verifysms/is-flash-call-eligible/api="), i);
        } else {
            TelephonyManager A0G = this.A0H.A0G();
            if (A0G != null && A0G.getSimState() == 1) {
                Log.i("verifysms/is-flash-call-eligible/sim absent");
            } else {
                boolean z = ((ActivityC02290Ap) this).A0F.A00.getBoolean("is_first_flash_call_request", true);
                int i2 = ((ActivityC02290Ap) this).A0F.A00.getInt("flash_call_eligible", 0);
                StringBuilder sb = new StringBuilder("verifysms/is-flash-call-eligible/isFirstFlashCallRequest=");
                sb.append(z);
                sb.append("/flashCallEligible=");
                sb.append(i2);
                Log.i(sb.toString());
                if (z && (i2 == 1 || i2 == 2 || i2 == 3)) {
                    ((ActivityC02290Ap) this).A0F.A00.edit().putBoolean("is_first_flash_call_request", false).apply();
                    Log.i("verifysms/request-flash");
                    if (!this.A0M.A05()) {
                        Log.i("verifysms/request-flash/request-permission");
                        RequestPermissionActivity.A08(this, this.A0M);
                        return;
                    }
                    Log.i("verifysms/request-flash/has-permission");
                    A1c();
                    return;
                }
            }
        }
        Log.i("verifysms/request-voice");
        C79893mO c79893mO = new C79893mO(((ActivityC02290Ap) this).A0F.A08());
        TelephonyManager A0G2 = this.A0H.A0G();
        boolean z2 = false;
        if (A0G2 != null && A0G2.getSimState() == 1) {
            z2 = true;
        }
        c79893mO.A01 = Boolean.valueOf(z2);
        if (((ActivityC02290Ap) this).A0F.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
            c79893mO.A02 = true;
        }
        this.A0i.ARy(A1Q(true, c79893mO), new String[0]);
    }

    public /* synthetic */ void lambda$onCreate$2179$VerifySms(View view) {
        Log.i("verifyvoice/retryverify");
        String code = this.A0A.getCode();
        this.A07.setVisibility(4);
        A1r(code);
    }

    public /* synthetic */ void lambda$onCreate$2180$VerifySms(View view) {
        A27(true);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 700) {
            if (i2 == -1) {
                Log.i("verifysms/activity-result/permission-accepted/request-flash");
                A1c();
                return;
            }
            Log.i("verifysms/activity-result/permission-declined/request-voice");
            C79893mO c79893mO = new C79893mO(((ActivityC02290Ap) this).A0F.A08());
            if (((ActivityC02290Ap) this).A0F.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
                c79893mO.A02 = true;
            }
            c79893mO.A00 = Boolean.FALSE;
            this.A0i.ARy(A1Q(true, c79893mO), new String[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0419, code lost:
        if (r27.A0M.A02("android.permission.RECEIVE_SMS") == 0) goto L81;
     */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.3m8] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.3VP] */
    @Override // X.C22B, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifySms.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(final int i) {
        if (i == 21) {
            C019208x c019208x = new C019208x(this);
            c019208x.A01.A0E = getString(R.string.register_check_connectivity_code_verififcation, getString(R.string.connectivity_self_help_instructions));
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Up
                {
                    VerifySms.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    VerifySms verifySms = VerifySms.this;
                    C002701i.A18(verifySms, 21);
                    verifySms.A1e();
                }
            });
            return c019208x.A00();
        } else if (i != 109) {
            if (i != 500) {
                if (i != 124) {
                    if (i != 125) {
                        switch (i) {
                            case 23:
                                A0x = 0;
                                A1f();
                                this.A0Z.A0B(1);
                                return AnonymousClass088.A0J(((ActivityC02310Ar) this).A01, this, this.A0E, this.A0C, ((ActivityC02270An) this).A00);
                            case 24:
                                ProgressDialog progressDialog = new ProgressDialog(this);
                                progressDialog.setMessage(getString(R.string.register_voice_verifying));
                                progressDialog.setIndeterminate(true);
                                progressDialog.setCancelable(false);
                                return progressDialog;
                            case 25:
                                ProgressDialog progressDialog2 = new ProgressDialog(this);
                                progressDialog2.setMessage(getString(R.string.register_voice_request_message));
                                progressDialog2.setIndeterminate(true);
                                progressDialog2.setCancelable(false);
                                return progressDialog2;
                            default:
                                switch (i) {
                                    case 27:
                                    case 28:
                                        C019208x c019208x2 = new C019208x(this);
                                        c019208x2.A02(R.string.register_unrecoverable_error);
                                        c019208x2.A01.A0J = false;
                                        c019208x2.A06(R.string.register_contact_support, new DialogInterface.OnClickListener() { // from class: X.3Uh
                                            {
                                                VerifySms.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                VerifySms verifySms = VerifySms.this;
                                                C002701i.A18(verifySms, i);
                                                StringBuilder sb = new StringBuilder("+");
                                                sb.append(verifySms.A0k);
                                                sb.append(verifySms.A0l);
                                                verifySms.A0N.A00(verifySms, C000200d.A0H("verify-bp ", sb.toString()), false, null);
                                            }
                                        });
                                        c019208x2.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Uq
                                            {
                                                VerifySms.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                VerifySms verifySms = VerifySms.this;
                                                C002701i.A18(verifySms, i);
                                                verifySms.A1e();
                                            }
                                        });
                                        return c019208x2.A00();
                                    case 29:
                                        C019208x c019208x3 = new C019208x(this);
                                        c019208x3.A01.A0E = A1V();
                                        c019208x3.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Uo
                                            {
                                                VerifySms.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                C002701i.A18(VerifySms.this, i);
                                            }
                                        });
                                        return c019208x3.A00();
                                    case 30:
                                        C019208x c019208x4 = new C019208x(this);
                                        c019208x4.A02(R.string.register_server_voice_too_many_tries);
                                        c019208x4.A01.A0J = false;
                                        c019208x4.A06(R.string.register_contact_support, new DialogInterface.OnClickListener() { // from class: X.3Uu
                                            {
                                                VerifySms.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                VerifySms verifySms = VerifySms.this;
                                                C002701i.A18(verifySms, i);
                                                VerifySms.A0x = 0;
                                                verifySms.A1f();
                                                verifySms.A0Z.A0B(1);
                                                StringBuilder sb = new StringBuilder("+");
                                                sb.append(verifySms.A0k);
                                                sb.append(verifySms.A0l);
                                                String obj = sb.toString();
                                                verifySms.A0l = null;
                                                verifySms.A0N.A00(verifySms, C000200d.A0H("verify-tma ", obj), false, null);
                                            }
                                        });
                                        c019208x4.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Un
                                            {
                                                VerifySms.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                C002701i.A18(VerifySms.this, i);
                                            }
                                        });
                                        return c019208x4.A00();
                                    case 31:
                                        C019208x c019208x5 = new C019208x(this);
                                        c019208x5.A02(R.string.register_voice_input_error_maximum);
                                        c019208x5.A01.A0J = false;
                                        c019208x5.A06(R.string.register_contact_support, new DialogInterface.OnClickListener() { // from class: X.3Uf
                                            {
                                                VerifySms.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                VerifySms verifySms = VerifySms.this;
                                                C002701i.A18(verifySms, i);
                                                VerifySms.A0x = 0;
                                                verifySms.A1f();
                                                verifySms.A0Z.A0B(1);
                                                String str = verifySms.A0l;
                                                if (str == null) {
                                                    str = "";
                                                }
                                                verifySms.A0l = null;
                                                verifySms.A0N.A00(verifySms, C000200d.A0H("verify-tmg ", str), false, null);
                                            }
                                        });
                                        c019208x5.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Uj
                                            {
                                                VerifySms.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                VerifySms verifySms = VerifySms.this;
                                                C002701i.A18(verifySms, i);
                                                verifySms.A1e();
                                            }
                                        });
                                        return c019208x5.A00();
                                    default:
                                        switch (i) {
                                            case 33:
                                                C019208x c019208x6 = new C019208x(this);
                                                C002301c c002301c = ((ActivityC02310Ar) this).A01;
                                                int i2 = A0w;
                                                c019208x6.A01.A0E = c002301c.A0A(R.plurals.register_voice_input_error_length_error, i2, Integer.valueOf(i2));
                                                c019208x6.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Uw
                                                    {
                                                        VerifySms.this = this;
                                                    }

                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                                        C002701i.A18(VerifySms.this, 33);
                                                    }
                                                });
                                                return c019208x6.A00();
                                            case 34:
                                                C019208x c019208x7 = new C019208x(this);
                                                c019208x7.A02(R.string.register_verify_again);
                                                c019208x7.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Uy
                                                    {
                                                        VerifySms.this = this;
                                                    }

                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                                        VerifySms verifySms = VerifySms.this;
                                                        C002701i.A18(verifySms, 34);
                                                        verifySms.A1e();
                                                    }
                                                });
                                                return c019208x7.A00();
                                            case 35:
                                                C019208x c019208x8 = new C019208x(this);
                                                String string = getString(R.string.register_voice_request_error_maximum_with_time, AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, this.A02));
                                                C019308y c019308y = c019208x8.A01;
                                                c019308y.A0E = string;
                                                c019308y.A0J = false;
                                                c019208x8.A06(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.3Us
                                                    {
                                                        VerifySms.this = this;
                                                    }

                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                                        VerifySms verifySms = VerifySms.this;
                                                        C002701i.A18(verifySms, i);
                                                        verifySms.A1b();
                                                    }
                                                });
                                                c019208x8.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Ur
                                                    {
                                                        VerifySms.this = this;
                                                    }

                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                                        VerifySms verifySms = VerifySms.this;
                                                        C002701i.A18(verifySms, i);
                                                        verifySms.A1e();
                                                    }
                                                });
                                                return c019208x8.A00();
                                            case 36:
                                                C019208x c019208x9 = new C019208x(this);
                                                String string2 = getString(R.string.register_voice_input_error_maximum_with_time, AnonymousClass029.A0k(((ActivityC02310Ar) this).A01, this.A02));
                                                C019308y c019308y2 = c019208x9.A01;
                                                c019308y2.A0E = string2;
                                                c019308y2.A0J = false;
                                                c019208x9.A06(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.3Ug
                                                    {
                                                        VerifySms.this = this;
                                                    }

                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                                        VerifySms verifySms = VerifySms.this;
                                                        C002701i.A18(verifySms, i);
                                                        verifySms.A1b();
                                                    }
                                                });
                                                c019208x9.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Ul
                                                    {
                                                        VerifySms.this = this;
                                                    }

                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                                        VerifySms verifySms = VerifySms.this;
                                                        C002701i.A18(verifySms, i);
                                                        verifySms.A1e();
                                                    }
                                                });
                                                return c019208x9.A00();
                                            default:
                                                switch (i) {
                                                    case 38:
                                                        C019208x c019208x10 = new C019208x(this);
                                                        c019208x10.A02(R.string.register_bad_number);
                                                        c019208x10.A01.A0J = false;
                                                        c019208x10.A05(R.string.ok_short, new DialogInterface.OnClickListener() { // from class: X.3Uk
                                                            {
                                                                VerifySms.this = this;
                                                            }

                                                            @Override // android.content.DialogInterface.OnClickListener
                                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                                VerifySms verifySms = VerifySms.this;
                                                                C002701i.A18(verifySms, i);
                                                                verifySms.A1e();
                                                            }
                                                        });
                                                        return c019208x10.A00();
                                                    case 39:
                                                        ProgressDialog progressDialog3 = new ProgressDialog(this);
                                                        progressDialog3.setMessage(getString(R.string.register_sms_request_message));
                                                        progressDialog3.setIndeterminate(true);
                                                        progressDialog3.setCancelable(false);
                                                        return progressDialog3;
                                                    case 40:
                                                        C019208x c019208x11 = new C019208x(this);
                                                        c019208x11.A01.A0E = A1S();
                                                        c019208x11.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Ui
                                                            {
                                                                VerifySms.this = this;
                                                            }

                                                            @Override // android.content.DialogInterface.OnClickListener
                                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                                C002701i.A18(VerifySms.this, i);
                                                            }
                                                        });
                                                        return c019208x11.A00();
                                                    case 41:
                                                        C019208x c019208x12 = new C019208x(this);
                                                        c019208x12.A01.A0E = A1U();
                                                        c019208x12.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Ut
                                                            {
                                                                VerifySms.this = this;
                                                            }

                                                            @Override // android.content.DialogInterface.OnClickListener
                                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                                C002701i.A18(VerifySms.this, i);
                                                            }
                                                        });
                                                        return c019208x12.A00();
                                                    case 42:
                                                        C019208x c019208x13 = new C019208x(this);
                                                        c019208x13.A01.A0E = A1T();
                                                        c019208x13.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Um
                                                            {
                                                                VerifySms.this = this;
                                                            }

                                                            @Override // android.content.DialogInterface.OnClickListener
                                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                                C002701i.A18(VerifySms.this, i);
                                                            }
                                                        });
                                                        return c019208x13.A00();
                                                    case 43:
                                                        String string3 = getString(R.string.register_should_upgrade_market);
                                                        C019208x c019208x14 = new C019208x(this);
                                                        String string4 = getString(R.string.register_bad_token, string3);
                                                        C019308y c019308y3 = c019208x14.A01;
                                                        c019308y3.A0E = string4;
                                                        c019308y3.A0J = false;
                                                        c019208x14.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Uv
                                                            {
                                                                VerifySms.this = this;
                                                            }

                                                            @Override // android.content.DialogInterface.OnClickListener
                                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                                VerifySms verifySms = VerifySms.this;
                                                                C002701i.A18(verifySms, 43);
                                                                verifySms.A1e();
                                                            }
                                                        });
                                                        return c019208x14.A00();
                                                    case 44:
                                                        break;
                                                    default:
                                                        return super.onCreateDialog(i);
                                                }
                                        }
                                }
                        }
                    } else {
                        return C28E.A04(this, this.A0P, this.A0k, this.A0l);
                    }
                }
                return C28E.A03(this, ((ActivityC02310Ar) this).A01, this.A0P, this.A0k, this.A0l, new RunnableEBaseShape5S0100000_I0_5(this, 27));
            }
            Dialog onCreateDialog = super.onCreateDialog(i);
            if (onCreateDialog != null && this.A0q) {
                onCreateDialog.setCancelable(false);
                onCreateDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.3Ux
                    {
                        VerifySms.this = this;
                    }

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        VerifySms.this.A1e();
                    }
                });
            }
            return onCreateDialog;
        } else {
            return C28E.A05(this, this.A0i, this.A0H, this.A0P, this.A0G, this.A0M, this.A0Y);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.registration_help);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        A1j();
        this.A0T.A01();
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A03 = null;
        }
        C3V5 c3v5 = this.A0R;
        if (c3v5 != null) {
            c3v5.A02(true);
        }
        C3V5 c3v52 = this.A0S;
        if (c3v52 != null) {
            c3v52.A02(true);
        }
        this.A0F.A00(this.A0u);
        this.A0X.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        Log.i("verifysms/intent");
        super.onNewIntent(intent);
        String A00 = A00(intent);
        if (A00 != null) {
            if (this.A0o) {
                A1s(A00);
                return;
            }
            C000200d.A14("verifysms/intent/defer-code/", A00);
            this.A0j = A00;
            return;
        }
        int intExtra = intent.getIntExtra("com.whatsapp.verifynumber.dialog", 0);
        if (intExtra == 21) {
            C002701i.A19(this, 21);
        } else if (intExtra != 23) {
            C000200d.A0q("verifysms/intent/unknown ", intExtra);
        } else {
            C002701i.A19(this, 23);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C3VI c3vi = this.A0X;
            C2CQ c2cq = this.A0c;
            StringBuilder A0P = C000200d.A0P("verify-sms +");
            A0P.append(this.A0k);
            A0P.append(this.A0l);
            c3vi.A01(this, c2cq, A0P.toString());
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0Z.A0A();
            A1Z();
            A1a();
            A1X();
            startActivity(EULA.A00(this));
            finishAffinity();
            return true;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        C000200d.A1F(C000200d.A0P("verifysms/pause "), A0x);
        super.onPause();
        C3VD c3vd = this.A0V;
        c3vd.A02 = true;
        C28E.A0H(c3vd.A04, C28E.A00);
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("com.whatsapp.registration.VerifySms.verification_state", A0x);
        if (!edit.commit()) {
            Log.w("verifysms/pause/commit failed");
        }
        String code = this.A0A.getCode();
        if (!TextUtils.isEmpty(code)) {
            C000200d.A0i(((ActivityC02290Ap) this).A0F, "registration_code", code);
        }
    }

    @Override // android.app.Activity
    public void onPrepareDialog(int i, Dialog dialog) {
        if (i != 29) {
            switch (i) {
                case 40:
                    ((DialogInterfaceC019408z) dialog).A04(A1S());
                    return;
                case 41:
                    ((DialogInterfaceC019408z) dialog).A04(A1U());
                    return;
                case 42:
                    ((DialogInterfaceC019408z) dialog).A04(A1T());
                    return;
                default:
                    return;
            }
        }
        ((DialogInterfaceC019408z) dialog).A04(A1V());
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A0V.A00();
        A0x = getPreferences(0).getInt("com.whatsapp.registration.VerifySms.verification_state", 0);
        A0v = ((ActivityC02290Ap) this).A0F.A00.getInt("registration_sms_code_length", 6);
        int i = ((ActivityC02290Ap) this).A0F.A00.getInt("registration_voice_code_length", 6);
        A0w = i;
        this.A0A.A02 = i;
        if (this.A0k != null && this.A0l != null) {
            this.A0Z.A0B(4);
            this.A0c.A02("verify-sms");
            C000200d.A1F(new StringBuilder("verifysms/resume verification_state="), A0x);
            int i2 = A0x;
            if (i2 == 4) {
                C002701i.A19(this, 21);
            } else if (i2 == 8) {
                C002701i.A19(this, 23);
            } else if (i2 != 12) {
                long A1P = A1P() - System.currentTimeMillis();
                if (A1P > 0) {
                    this.A0S.A01(A1P, true);
                } else {
                    A1Z();
                    if (!this.A0o) {
                        A27(false);
                    }
                }
                A1k();
                if (this.A03 == null) {
                    long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.code_verification_retry_time", -1L);
                    System.currentTimeMillis();
                    A1q(j - System.currentTimeMillis());
                }
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                if (displayMetrics.heightPixels / displayMetrics.density >= 500.0f && this.A0A.isEnabled()) {
                    this.A0A.requestFocus();
                    this.A0A.A02(false);
                }
            } else {
                A1m();
            }
            this.A0L.A05(null, 1);
            String str = this.A0j;
            if (str != null) {
                C000200d.A1N(C000200d.A0P("verifysms/resume/scheme/code "), str);
                A1s(this.A0j);
                this.A0j = null;
            }
            this.A0o = true;
            return;
        }
        Log.w("verifysms/resume/cc or num is missing, bounce to regphone");
        A1e();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("use_sms_retriever", this.A0s);
        super.onSaveInstanceState(bundle);
    }
}
