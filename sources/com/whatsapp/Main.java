package com.whatsapp;

import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000200d;
import X.C002701i;
import X.C003601s;
import X.C005002g;
import X.C019208x;
import X.C02L;
import X.C04920Mm;
import X.C05E;
import X.C06460Th;
import X.C09I;
import X.C0DR;
import X.C0DS;
import X.C0HS;
import X.C2M5;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import java.io.IOException;

/* loaded from: classes.dex */
public class Main extends C0DR {
    public C04920Mm A00;
    public C06460Th A01;
    public C005002g A02;
    public C09I A03;
    public C05E A04;
    public C2M5 A05;
    public InterfaceC002901k A06;
    public WhatsAppLibLoader A07;
    public boolean A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Th, X.0HS] */
    @Override // X.C0DS
    public void A1P() {
        Intent intent;
        C02L c02l = ((C0DS) this).A00;
        c02l.A05();
        if (c02l.A00 == null) {
            if (!isFinishing()) {
                int A01 = this.A0Q.A01();
                if (A01 != 0) {
                    if (A01 != 1) {
                        if (A01 == 2) {
                            Log.i("main/no-me/regname");
                            intent = new Intent(this, RegisterName.class);
                        } else if (A01 == 4) {
                            intent = new Intent(this, VerifySms.class);
                            if (this.A00.A04()) {
                                intent.putExtra("changenumber", true);
                            }
                        } else if (A01 != 5) {
                            if (A01 == 6) {
                                intent = new Intent(this, DeleteAccountConfirmation.class);
                            } else if (A01 != 7) {
                                StringBuilder sb = new StringBuilder("main/invalid/registration state=");
                                sb.append(A01);
                                sb.append("; default to EULA");
                                Log.e(sb.toString());
                                this.A0P.A0B(0);
                                intent = new Intent(this, EULA.class);
                            } else {
                                intent = VerifyTwoFactorAuth.A00(this, "verification_successful");
                                if (this.A00.A04()) {
                                    intent.putExtra("changenumber", true);
                                }
                            }
                        }
                    }
                    this.A0P.A0B(0);
                    intent = new Intent(this, EULA.class);
                } else {
                    intent = new Intent(this, EULA.class);
                    if (getIntent().getBooleanExtra("show_registration_first_dlg", false)) {
                        intent.putExtra("show_registration_first_dlg", true);
                    }
                }
                if (this.A08 && !isFinishing()) {
                    startActivity(intent);
                }
                finish();
            }
            Log.i("main/me App.me is null, can't proceed.");
        } else if (this.A0Q.A01() == 2) {
            Log.i("main/me/regname");
            Intent intent2 = new Intent(this, RegisterName.class);
            if (this.A08 && !isFinishing()) {
                startActivity(intent2);
            }
            finish();
        } else {
            this.A0P.A0B(3);
            Log.i("main/verified/setregverified");
            if (((C0DS) this).A0L.A0m) {
                C06460Th c06460Th = this.A01;
                if (c06460Th != null && c06460Th.A00() == AsyncTask.Status.RUNNING) {
                    Log.i("main/show dialog sync");
                    if (this.A08) {
                        C002701i.A19(this, 104);
                        return;
                    }
                    return;
                }
                ?? r2 = new C0HS() { // from class: X.0Th
                    {
                        Main.this = this;
                    }

                    @Override // X.C0HS
                    public void A06() {
                        C002701i.A19(Main.this, 104);
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        Main main;
                        int i = 0;
                        while (true) {
                            main = Main.this;
                            if (!((C0DS) main).A0L.A0m || i >= 45000) {
                                break;
                            }
                            i += 200;
                            SystemClock.sleep(200L);
                        }
                        if (i < 45000 || !((C0DS) main).A0L.A0m) {
                            return null;
                        }
                        ((C0DS) main).A0L.A09(3);
                        return null;
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        Main main = Main.this;
                        C002701i.A18(main, 104);
                        Log.i("main/gotoActivity");
                        main.A1V();
                    }
                };
                this.A01 = r2;
                this.A06.AS4(r2, new Void[0]);
                return;
            }
            Log.i("main/messageStoreVerified/gotoActivity");
            Log.i("main/gotoActivity");
            A1V();
        }
    }

    public final void A1V() {
        if (isFinishing()) {
            return;
        }
        Intent intent = getIntent();
        if (intent != null && !"android.intent.action.MAIN".equals(intent.getAction()) && (intent.getFlags() & 67108864) != 0 && ((ActivityC02290Ap) this).A0F.A00.getInt("shortcut_version", 0) == 0) {
            Log.i("main/recreate_shortcut");
            RegisterName.A00(this, getString(R.string.app_name));
            RegisterName.A01(this, getString(R.string.app_name));
            C000200d.A0g(((ActivityC02290Ap) this).A0F, "shortcut_version", 1);
        }
        if (this.A08 && !isFinishing()) {
            startActivity(new Intent(this, HomeActivity.class));
            overridePendingTransition(0, 0);
        }
        finish();
    }

    @Override // X.C0DR, X.C0DS, X.C0DT, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        C003601s.A01("Main/onCreate");
        try {
            ((ActivityC02310Ar) this).A02.A06("Main");
            ((ActivityC02270An) this).A0I = false;
            super.onCreate(bundle);
            setTitle(R.string.launcher_app_name);
            if (!this.A07.A04()) {
                Log.i("aborting due to native libraries missing");
                startActivity(new Intent(this, CorruptInstallationActivity.class));
                finish();
            } else if (C005002g.A01()) {
                Log.w("main/device-not-supported");
                setTheme(2131952216);
                AUh(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
            } else {
                int A01 = this.A0Q.A01();
                C02L c02l = ((C0DS) this).A00;
                c02l.A05();
                Me me = c02l.A00;
                if (me == null && A01 == 0) {
                    if (!isFinishing()) {
                        Intent intent = new Intent(this, EULA.class);
                        if (getIntent().getBooleanExtra("show_registration_first_dlg", false)) {
                            intent.putExtra("show_registration_first_dlg", true);
                        }
                        startActivity(intent);
                        finishAffinity();
                    }
                } else if (A01 == 6) {
                    if (!isFinishing()) {
                        startActivity(new Intent(this, DeleteAccountConfirmation.class));
                        finish();
                    }
                } else {
                    if (me != null) {
                        C05E c05e = this.A04;
                        c05e.A05();
                        if (!c05e.A01) {
                            if (A1U()) {
                                int A06 = ((C0DS) this).A0E.A06();
                                StringBuilder sb = new StringBuilder();
                                sb.append("main/create/backupfilesfound ");
                                sb.append(A06);
                                Log.i(sb.toString());
                                if (A06 <= 0) {
                                    A1T(false);
                                } else {
                                    C002701i.A19(this, 105);
                                }
                            }
                            ((ActivityC02270An) this).A0I = true;
                            A1I();
                            ((ActivityC02310Ar) this).A02.A07("Main created");
                        }
                    }
                    this.A08 = true;
                    A1P();
                    ((ActivityC02310Ar) this).A02.A07("Main created");
                }
            }
        } finally {
            C003601s.A00();
        }
    }

    @Override // X.C0DS, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        setTheme(2131952216);
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        Log.i("main/dialog/upgrade");
        ((ActivityC02310Ar) this).A02.A01();
        C019208x c019208x = new C019208x(this);
        c019208x.A03(R.string.upgrade_question);
        c019208x.A02(R.string.upgrade_message);
        c019208x.A01.A0J = false;
        c019208x.A06(R.string.yes, new DialogInterface.OnClickListener() { // from class: X.1HZ
            {
                Main.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Main main = Main.this;
                main.startActivity(new Intent("android.intent.action.VIEW").setDataAndType(null, "application/vnd.android.package-archive").setFlags(1));
                C002701i.A18(main, 0);
                main.finish();
            }
        });
        c019208x.A04(R.string.later, new DialogInterface.OnClickListener() { // from class: X.1HY
            {
                Main.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Main main = Main.this;
                try {
                    boolean createNewFile = main.A03.A01.A06("WhatsApp.upgrade").createNewFile();
                    StringBuilder sb = new StringBuilder();
                    sb.append("upgrade sentinel file created; success=");
                    sb.append(createNewFile);
                    Log.i(sb.toString());
                } catch (IOException e) {
                    Log.e("upgrade/sentinel/fail", e);
                }
                C002701i.A18(main, 0);
                main.A1V();
            }
        });
        return c019208x.A00();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A08 = true;
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        this.A08 = false;
    }
}
