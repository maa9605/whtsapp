package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.26L */
/* loaded from: classes2.dex */
public abstract class C26L extends C26M implements C26N {
    public static int A0M = 7;
    public static long A0N;
    public static String A0O;
    public static String A0P;
    public ProgressDialog A00;
    public C04920Mm A01;
    public C005002g A02;
    public C09I A03;
    public C0E7 A04;
    public C02E A05;
    public AnonymousClass012 A06;
    public C02F A07;
    public C49622Lq A08;
    public C49632Lr A09;
    public C018808t A0A;
    public C3VC A0B;
    public C42151vF A0C;
    public C3VD A0D;
    public C2DT A0E;
    public C2Aa A0F;
    public C2MG A0G;
    public C006602x A0H;
    public InterfaceC002901k A0I;
    public String A0J;
    public boolean A0L = false;
    public boolean A0K = true;

    public static int A02(AnonymousClass031 anonymousClass031, String str, String str2) {
        try {
            int length = str.length();
            if (length >= 1 && length <= 3) {
                try {
                    if (C0Sa.A01.indexOfKey(Integer.parseInt(str)) >= 0) {
                        if (str2 != null && str2.length() != 0 && str2.replaceAll("\\D", "").length() != 0) {
                            int parseInt = Integer.parseInt(str);
                            String A02 = anonymousClass031.A02(parseInt, str2.replaceAll("\\D", ""));
                            int length2 = A02.length();
                            anonymousClass031.A06();
                            Iterator it = anonymousClass031.A01.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C10120fK c10120fK = (C10120fK) it.next();
                                if (c10120fK.A00 == parseInt) {
                                    int A00 = c10120fK.A00(length2);
                                    if (A00 != 0) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("enterphone/num/error/invalid cc=");
                                        sb.append(parseInt);
                                        sb.append(" phone=");
                                        sb.append(A02);
                                        sb.append(" res=");
                                        sb.append(A00);
                                        Log.w(sb.toString());
                                        return A00 < 0 ? 5 : 6;
                                    }
                                }
                            }
                            int i = length + length2;
                            if (i > 15 || i < 8) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("enterphone/num/error/length cc=");
                                sb2.append(str);
                                sb2.append(" ph=");
                                sb2.append(A02);
                                Log.w(sb2.toString());
                                return 7;
                            }
                            return 1;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("enterphone/num/error/empty cc=");
                        sb3.append(str);
                        Log.w(sb3.toString());
                        return 4;
                    }
                } catch (NumberFormatException unused) {
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("enterphone/cc/bad-name ");
                sb4.append(str);
                Log.w(sb4.toString());
                return 3;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("enterphone/cc/bad-length cc=");
            sb5.append(str);
            Log.w(sb5.toString());
            return 2;
        } catch (IOException e) {
            Log.e("enterphone/error trimLeadingZero or nativeNameFromCallingCode from CountryPhoneInfo IOException", e);
            return 7;
        }
    }

    public static String A03(Context context) {
        return context.getString(R.string.register_bad_cc_length_with_placeholders, 1, 3);
    }

    public void A1P() {
        if (this instanceof RegisterPhone) {
            SharedPreferences.Editor edit = ((RegisterPhone) this).getPreferences(0).edit();
            edit.putInt("com.whatsapp.registration.RegisterPhone.verification_state", A0M);
            if (edit.commit()) {
                return;
            }
            Log.w("registerphone/savestate/commit failed");
        }
    }

    @Override // X.C26M, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0D = new C3VD(this, ((ActivityC02290Ap) this).A0F);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 9) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(R.string.register_connecting));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            this.A00 = progressDialog;
            return progressDialog;
        } else if (i != 22) {
            if (i != 109) {
                if (i != 114) {
                    if (i != 124) {
                        if (i != 125) {
                            return super.onCreateDialog(i);
                        }
                        return C28E.A04(this, this.A0A, A0O, A0P);
                    }
                    return C28E.A03(this, ((ActivityC02310Ar) this).A01, this.A0A, A0O, A0P, null);
                }
                return AnonymousClass088.A0J(((ActivityC02310Ar) this).A01, this, this.A03, this.A02, ((ActivityC02270An) this).A00);
            }
            return C28E.A05(this, this.A0I, this.A05, this.A0A, this.A04, this.A07, this.A0E);
        } else {
            Log.w("enterphone/dialog/unrecoverable-error");
            StringBuilder sb = new StringBuilder("register-phone2 +");
            sb.append(A0O);
            sb.append(A0P);
            final String obj = sb.toString();
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.register_unrecoverable_error);
            c019208x.A06(R.string.register_contact_support, new DialogInterface.OnClickListener() { // from class: X.3UL
                {
                    C26L.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C26L c26l = C26L.this;
                    String str = obj;
                    C002701i.A18(c26l, 22);
                    c26l.A08.A00(c26l, str, false, null);
                }
            });
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3UM
                {
                    C26L.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(C26L.this, 22);
                }
            });
            return c019208x.A00();
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        C3VD c3vd = this.A0D;
        c3vd.A02 = true;
        C28E.A0H(c3vd.A04, C28E.A00);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A0D.A00();
    }
}
