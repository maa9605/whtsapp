package X;

import android.content.Intent;
import android.os.SystemClock;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3m5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79703m5 extends C0HS {
    public long A00;
    public final long A01;
    public final C000500h A02;
    public final C49632Lr A03;
    public final C2DT A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final WeakReference A08;
    public final JSONObject A09;
    public final boolean A0A;
    public final byte[] A0B;

    public C79703m5(C49632Lr c49632Lr, C000500h c000500h, C2DT c2dt, String str, String str2, byte[] bArr, String str3, JSONObject jSONObject, boolean z, long j, C26L c26l) {
        this.A05 = str;
        this.A07 = str2;
        this.A0B = bArr;
        this.A06 = str3;
        this.A09 = jSONObject;
        this.A0A = z;
        this.A01 = j;
        this.A03 = c49632Lr;
        this.A02 = c000500h;
        this.A04 = c2dt;
        this.A08 = new WeakReference(c26l);
    }

    @Override // X.C0HS
    public void A06() {
        C26L c26l = (C26L) this.A08.get();
        if (c26l != null) {
            if (!(c26l instanceof ChangeNumber)) {
                C002701i.A19(c26l, 9);
                return;
            }
            C002701i.A18(c26l, 1);
            C002701i.A19(c26l, 9);
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        long elapsedRealtime;
        long j;
        Set<String> stringSet;
        JSONObject jSONObject;
        byte[] bArr;
        try {
            elapsedRealtime = SystemClock.elapsedRealtime();
            j = this.A01;
        } catch (Exception e) {
            Log.e("checkreinstalled/error", e);
        }
        if (elapsedRealtime < j) {
            this.A00 = (j - elapsedRealtime) / 1000;
            return new C0FK(11, null);
        }
        C49632Lr c49632Lr = this.A03;
        synchronized (c49632Lr) {
            c49632Lr.A00();
            stringSet = c49632Lr.A01.getStringSet("ab_offline_props:offline_exposure_strings", new HashSet(1));
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : stringSet) {
            jSONArray.put(str);
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.put("exposure", jSONArray);
            JSONObject jSONObject2 = this.A09;
            if (jSONObject2 != null) {
                jSONObject.put("metrics", jSONObject2);
            }
        } catch (JSONException e2) {
            Log.e("enterphone/getOfflineAbParams exception: ", e2);
            jSONObject = null;
        }
        C000500h c000500h = this.A02;
        int i = c000500h.A00.getInt("reg_attempts_check_exist", 0) + 1;
        C000200d.A0g(c000500h, "reg_attempts_check_exist", i);
        C2DX c2dx = new C2DX(i);
        C26L c26l = (C26L) this.A08.get();
        if (c26l != null) {
            String str2 = this.A07;
            String A00 = C3VN.A00(c26l, str2);
            if (this.A0A) {
                bArr = C0KF.A04(c26l.getApplicationContext(), str2);
            } else {
                bArr = null;
            }
            C2DT c2dt = this.A04;
            String str3 = this.A05;
            byte[] bArr2 = this.A0B;
            String str4 = this.A06;
            if (str4 == null) {
                str4 = "-1";
            }
            C47902Da A01 = c2dt.A01(str3, str2, bArr2, A00, str4, bArr, jSONObject, c2dx);
            C3Z2 c3z2 = A01.A0D;
            if (c3z2 == C3Z2.OK) {
                return new C0FK(1, A01);
            }
            if (c3z2 == C3Z2.FAIL) {
                C3Z1 c3z1 = A01.A0C;
                if (c3z1 == null) {
                    return new C0FK(4, null);
                }
                if (c3z1 == C3Z1.BLOCKED) {
                    return new C0FK(5, null);
                }
                if (c3z1 == C3Z1.LENGTH_LONG) {
                    return new C0FK(6, null);
                }
                if (c3z1 == C3Z1.LENGTH_SHORT) {
                    return new C0FK(7, null);
                }
                if (c3z1 == C3Z1.FORMAT_WRONG) {
                    return new C0FK(8, null);
                }
                if (c3z1 == C3Z1.TEMPORARILY_UNAVAILABLE) {
                    return new C0FK(9, A01);
                }
                if (c3z1 == C3Z1.OLD_VERSION) {
                    return new C0FK(12, null);
                }
                if (c3z1 == C3Z1.ERROR_BAD_TOKEN) {
                    return new C0FK(14, null);
                }
                if (c3z1 == C3Z1.INVALID_SKEY_SIGNATURE) {
                    return new C0FK(15, null);
                }
                if (c3z1 == C3Z1.SECURITY_CODE) {
                    return new C0FK(16, A01);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("checkreinstalled/possible-migration/");
                sb.append(A01.A0A);
                Log.i(sb.toString());
                return new C0FK(2, A01);
            }
            return new C0FK(4, null);
        }
        return new C0FK(4, null);
    }

    @Override // X.C0HS
    public void A08() {
        C26L c26l = (C26L) this.A08.get();
        if (c26l != null) {
            C002701i.A18(c26l, 9);
            c26l.A00 = null;
        }
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        String str;
        String charSequence;
        String charSequence2;
        String charSequence3;
        C0FK c0fk = (C0FK) obj;
        C26L c26l = (C26L) this.A08.get();
        if (c26l != null) {
            C002701i.A18(c26l, 9);
            c26l.A00 = null;
            Object obj2 = c0fk.A00;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                C47902Da c47902Da = (C47902Da) c0fk.A01;
                String str2 = this.A05;
                String str3 = this.A07;
                long j = this.A00;
                if (c47902Da != null) {
                    int i = c47902Da.A01;
                    if (i != 0) {
                        C000200d.A0g(((ActivityC02290Ap) c26l).A0F, "registration_voice_code_length", i);
                    }
                    int i2 = c47902Da.A00;
                    if (i2 != 0) {
                        C000200d.A0g(((ActivityC02290Ap) c26l).A0F, "registration_sms_code_length", i2);
                    }
                }
                if (intValue != 4 && intValue != 3) {
                    c26l.A0J = null;
                }
                if (intValue == 1) {
                    Log.i("enterphone/reinstalled");
                    c26l.AK8();
                    if (c47902Da != null) {
                        C2Aa c2Aa = c26l.A0F;
                        String str4 = c47902Da.A0E;
                        c2Aa.A0D(str2, str3, str4);
                        C000200d.A0j(((ActivityC02290Ap) c26l).A0F, "new_jid", c47902Da.A0F);
                        if (c26l instanceof RegisterPhone) {
                            RegisterPhone registerPhone = (RegisterPhone) c26l;
                            ((C26L) registerPhone).A0F.A0D(str2, str3, str4);
                            ((C26L) registerPhone).A0C.A02(false);
                            C26L.A0M = 7;
                            registerPhone.A1P();
                            if (((C26L) registerPhone).A0D.A02) {
                                C28E.A0F(registerPhone, registerPhone.A0O, registerPhone.A0E, false);
                            } else {
                                registerPhone.A0O.A0B(2);
                                registerPhone.startActivity(new Intent(registerPhone, RegisterName.class));
                            }
                            registerPhone.finish();
                            return;
                        } else if (!(c26l instanceof ChangeNumber)) {
                            c26l.A0F.A0D(str2, str3, str4);
                            c26l.A0C.A02(false);
                            return;
                        } else {
                            ChangeNumber changeNumber = (ChangeNumber) c26l;
                            ((C26L) changeNumber).A0F.A0D(str2, str3, str4);
                            ((C26L) changeNumber).A0C.A02(false);
                            if (((C26L) changeNumber).A0D.A02) {
                                C28E.A0F(changeNumber, changeNumber.A0J, changeNumber.A0B, false);
                            }
                            changeNumber.A0J.A0E();
                            changeNumber.finish();
                            return;
                        }
                    }
                    throw null;
                } else if (intValue == 2) {
                    Log.i("enterphone/new-installation");
                    C28E.A0H(((ActivityC02290Ap) c26l).A0F, C28E.A00);
                    C26L.A0M = 15;
                    c26l.A1P();
                    c26l.AK8();
                    if (c47902Da != null) {
                        c26l.AMO(c47902Da.A06, c47902Da.A07, c47902Da.A0B);
                        return;
                    }
                    throw null;
                } else if (intValue == 5) {
                    Log.e("enterphone/blocked");
                    StringBuilder sb = new StringBuilder();
                    sb.append("+");
                    sb.append(str2);
                    sb.append(str3);
                    c26l.A0J = sb.toString();
                    C26L.A0O = str2;
                    C26L.A0P = str3;
                    StringBuilder A0P = C000200d.A0P("+");
                    A0P.append(str2);
                    A0P.append(str3);
                    c26l.A0J = A0P.toString();
                    if (c26l.A0D.A02) {
                        return;
                    }
                    C002701i.A19(c26l, ((ActivityC02290Ap) c26l).A0F.A00.getBoolean("underage_account_banned", false) ? 125 : 124);
                    return;
                } else if (intValue == 4) {
                    Log.i("enterphone/error-unspecified");
                    if (c26l.A0D.A02) {
                        return;
                    }
                    C002701i.A19(c26l, 109);
                    return;
                } else if (intValue == 3) {
                    Log.i("enterphone/error-connectivity");
                    c26l.A0D.A03(c26l.getString(R.string.register_check_connectivity, c26l.getString(R.string.connectivity_self_help_instructions)));
                    return;
                } else if (intValue == 6) {
                    Log.i("enterphone/phone-number-too-long");
                    C3VC c3vc = c26l.A0B;
                    TextView textView = c3vc.A04;
                    if (textView == null) {
                        charSequence3 = c26l.A0H.A03(((ActivityC02310Ar) c26l).A01, c3vc.A06);
                    } else {
                        charSequence3 = textView.getText().toString();
                    }
                    c26l.A0D.A03(c26l.getString(R.string.register_bad_phone_too_long, charSequence3));
                    return;
                } else if (intValue == 7) {
                    Log.i("enterphone/phone-number-too-short");
                    C3VC c3vc2 = c26l.A0B;
                    TextView textView2 = c3vc2.A04;
                    if (textView2 == null) {
                        charSequence2 = c26l.A0H.A03(((ActivityC02310Ar) c26l).A01, c3vc2.A06);
                    } else {
                        charSequence2 = textView2.getText().toString();
                    }
                    c26l.A0D.A03(c26l.getString(R.string.register_bad_phone_too_short, charSequence2));
                    return;
                } else if (intValue == 8) {
                    Log.i("enterphone/phone-number-bad-format");
                    C3VC c3vc3 = c26l.A0B;
                    TextView textView3 = c3vc3.A04;
                    if (textView3 == null) {
                        charSequence = c26l.A0H.A03(((ActivityC02310Ar) c26l).A01, c3vc3.A06);
                    } else {
                        charSequence = textView3.getText().toString();
                    }
                    C002301c c002301c = ((ActivityC02310Ar) c26l).A01;
                    StringBuilder A0P2 = C000200d.A0P("+");
                    A0P2.append((Object) c26l.A0B.A02.getText());
                    A0P2.append(C02M.A01);
                    A0P2.append((Object) c26l.A0B.A03.getText());
                    c26l.A0D.A03(c26l.getString(R.string.register_bad_format_with_number, c002301c.A0F(A0P2.toString()), charSequence));
                    return;
                } else if (intValue == 9) {
                    Log.i("enterphone/temporarily-unavailable");
                    if (c47902Da != null) {
                        String str5 = c47902Da.A05;
                        if (str5 != null) {
                            try {
                                long parseLong = Long.parseLong(str5) * 1000;
                                C26L.A0N = SystemClock.elapsedRealtime() + parseLong;
                                c26l.A0F.A0C(parseLong);
                                c26l.A0D.A03(c26l.getString(R.string.register_temporarily_unavailable_with_time, AnonymousClass029.A0k(((ActivityC02310Ar) c26l).A01, parseLong)));
                                return;
                            } catch (NumberFormatException unused) {
                                c26l.A0D.A02(R.string.register_temporarily_unavailable);
                                return;
                            }
                        }
                        c26l.A0D.A02(R.string.register_temporarily_unavailable);
                        return;
                    }
                    throw null;
                } else if (intValue == 12) {
                    Log.i("enterphone/old-version");
                    c26l.A02.A01 = true;
                    c26l.A0D.A01(114);
                    return;
                } else {
                    if (intValue == 14) {
                        str = "enterphone/bad-token";
                    } else if (intValue == 15) {
                        str = "enterphone/invalid-skey";
                    } else if (intValue == 11) {
                        Log.w("enterphone/too-recent");
                        if (j != 0) {
                            long j2 = j * 1000;
                            try {
                                C26L.A0N = SystemClock.elapsedRealtime() + j2;
                                c26l.A0F.A0C(j2);
                                c26l.A0D.A03(c26l.getString(R.string.register_try_is_too_recent, AnonymousClass029.A0k(((ActivityC02310Ar) c26l).A01, j2)));
                                return;
                            } catch (NumberFormatException e) {
                                Log.w("enterphone/too-recent/time-not-int", e);
                                c26l.A0D.A02(R.string.register_try_is_too_recent_unspecified);
                                return;
                            }
                        }
                        Log.w("enterphone/too-recent/time-not-int");
                        c26l.A0D.A02(R.string.register_try_is_too_recent_unspecified);
                        return;
                    } else if (intValue != 16) {
                        return;
                    } else {
                        c26l.AK8();
                        c26l.A0F.A0B(7);
                        if (c47902Da != null) {
                            ((ActivityC02290Ap) c26l).A0F.A0c(c47902Da.A09, c47902Da.A08, c47902Da.A04, -1L, -1L, c26l.A06.A05());
                            C26L.A0O = str2;
                            C26L.A0P = str3;
                            ((ActivityC02290Ap) c26l).A0F.A0b(str2, str3);
                            Intent A00 = VerifyTwoFactorAuth.A00(c26l, "register_phone_number");
                            A00.putExtra("changenumber", c26l.A01.A04());
                            c26l.A14(A00);
                            c26l.finish();
                            return;
                        }
                        throw null;
                    }
                    Log.i(str);
                    c26l.A0D.A03(c26l.getString(R.string.register_should_upgrade_market));
                    return;
                }
            }
            throw null;
        }
    }
}
