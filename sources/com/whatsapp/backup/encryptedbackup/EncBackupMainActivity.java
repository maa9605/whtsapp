package com.whatsapp.backup.encryptedbackup;

import X.AbstractC02800Cx;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02290Ap;
import X.C000200d;
import X.C000700j;
import X.C03310Fe;
import X.C0CR;
import X.C0HK;
import X.C0MU;
import X.C0VJ;
import X.C0VW;
import X.C0WX;
import X.C36281kX;
import X.InterfaceC05620Pl;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.backup.encryptedbackup.ChangePasswordDisableFragment;
import com.whatsapp.backup.encryptedbackup.ChangePasswordDoneFragment;
import com.whatsapp.backup.encryptedbackup.ConfirmChangePasswordFragment;
import com.whatsapp.backup.encryptedbackup.ConfirmDisableFragment;
import com.whatsapp.backup.encryptedbackup.ConfirmEnableFragment;
import com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment;
import com.whatsapp.backup.encryptedbackup.ConnectionErrorDialogFragment;
import com.whatsapp.backup.encryptedbackup.CreatePasswordFragment;
import com.whatsapp.backup.encryptedbackup.DisableDoneFragment;
import com.whatsapp.backup.encryptedbackup.EnableDoneFragment;
import com.whatsapp.backup.encryptedbackup.EnableInfoFragment;
import com.whatsapp.backup.encryptedbackup.EnableWarningFragment;
import com.whatsapp.backup.encryptedbackup.EncBackupMainActivity;
import com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment;
import com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment;
import java.util.HashMap;

/* loaded from: classes.dex */
public class EncBackupMainActivity extends C0WX {
    public AbstractC02800Cx A00;
    public WaImageButton A01;
    public C03310Fe A02;
    public C36281kX A03;

    public static void A00(EncBackupMainActivity encBackupMainActivity, Integer num) {
        if (encBackupMainActivity != null) {
            encBackupMainActivity.setResult(num.intValue(), new Intent());
            encBackupMainActivity.finish();
            return;
        }
        throw null;
    }

    @Override // X.C0WX, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.enc_backup_main_activity);
        this.A00 = A0N();
        C0CR c0cr = new C0CR(this.A02, ((ActivityC02290Ap) this).A0F) { // from class: X.1kY
            public final C03310Fe A00;
            public final C000500h A01;

            {
                this.A00 = r1;
                this.A01 = r2;
            }

            @Override // X.C0CR
            public C0MU A6e(Class cls) {
                return new C36281kX(this.A00, this.A01);
            }
        };
        C0VW ADv = ADv();
        String canonicalName = C36281kX.class.getCanonicalName();
        if (canonicalName != null) {
            String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = ADv.A00;
            C0MU c0mu = (C0MU) hashMap.get(A0H);
            if (!C36281kX.class.isInstance(c0mu)) {
                c0mu = c0cr.A6e(C36281kX.class);
                C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                if (c0mu2 != null) {
                    c0mu2.A01();
                }
            }
            C36281kX c36281kX = (C36281kX) c0mu;
            this.A03 = c36281kX;
            c36281kX.A00.A05(this, new InterfaceC05620Pl() { // from class: X.1k6
                {
                    EncBackupMainActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    final EncBackupMainActivity encBackupMainActivity = EncBackupMainActivity.this;
                    int intValue = ((Number) obj).intValue();
                    AbstractC02800Cx abstractC02800Cx = encBackupMainActivity.A00;
                    if (abstractC02800Cx != null) {
                        C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
                        if (intValue == 200) {
                            c02820Cz.A01(R.id.fragment_container, new EnableWarningFragment(), null);
                            c02820Cz.A03(null);
                        } else if (intValue == 201) {
                            c02820Cz.A01(R.id.fragment_container, new VerifyPasswordFragment(), null);
                            c02820Cz.A03(null);
                        } else if (intValue == 500) {
                            c02820Cz.A01(R.id.fragment_container, new ConfirmEnableFragment(), null);
                            c02820Cz.A03(null);
                        } else if (intValue != 600) {
                            switch (intValue) {
                                case C42311vX.A0A /* 100 */:
                                    c02820Cz.A01(R.id.fragment_container, new EnableInfoFragment(), null);
                                    break;
                                case 101:
                                    c02820Cz.A01(R.id.fragment_container, new ChangePasswordDisableFragment(), null);
                                    break;
                                case 102:
                                    c02820Cz.A01(R.id.fragment_container, new RestorePasswordInputFragment(), null);
                                    break;
                                default:
                                    switch (intValue) {
                                        case 300:
                                            c02820Cz.A01(R.id.fragment_container, new CreatePasswordFragment(), null);
                                            c02820Cz.A03(null);
                                            break;
                                        case 301:
                                            c02820Cz.A01(R.id.fragment_container, new ConfirmDisableFragment(), null);
                                            c02820Cz.A03(null);
                                            break;
                                        case 302:
                                            c02820Cz.A01(R.id.fragment_container, new ConfirmChangePasswordFragment(), null);
                                            c02820Cz.A03(null);
                                            break;
                                        default:
                                            switch (intValue) {
                                                case 400:
                                                    c02820Cz.A01(R.id.fragment_container, new ConfirmPasswordFragment(), null);
                                                    c02820Cz.A03(null);
                                                    break;
                                                case 401:
                                                    c02820Cz.A01(R.id.fragment_container, new DisableDoneFragment(), null);
                                                    encBackupMainActivity.A01.setImageResource(R.drawable.ic_profile_x);
                                                    encBackupMainActivity.A01.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kR
                                                        @Override // X.AbstractView$OnClickListenerC49532Ky
                                                        public void A00(View view) {
                                                            EncBackupMainActivity.A00(encBackupMainActivity, -1);
                                                        }
                                                    });
                                                    break;
                                                case 402:
                                                    c02820Cz.A01(R.id.fragment_container, new ChangePasswordDoneFragment(), null);
                                                    encBackupMainActivity.A01.setImageResource(R.drawable.ic_profile_x);
                                                    encBackupMainActivity.A01.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kS
                                                        @Override // X.AbstractView$OnClickListenerC49532Ky
                                                        public void A00(View view) {
                                                            EncBackupMainActivity.A00(encBackupMainActivity, -1);
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    return;
                                            }
                                    }
                            }
                        } else {
                            c02820Cz.A01(R.id.fragment_container, new EnableDoneFragment(), null);
                            encBackupMainActivity.A01.setImageResource(R.drawable.ic_profile_x);
                            encBackupMainActivity.A01.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kQ
                                @Override // X.AbstractView$OnClickListenerC49532Ky
                                public void A00(View view) {
                                    EncBackupMainActivity.A00(encBackupMainActivity, -1);
                                }
                            });
                        }
                        c02820Cz.A04();
                        encBackupMainActivity.A03.A01.A0B(1);
                        return;
                    }
                    throw null;
                }
            });
            this.A03.A01.A05(this, new InterfaceC05620Pl() { // from class: X.1k2
                {
                    EncBackupMainActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    EncBackupMainActivity encBackupMainActivity = EncBackupMainActivity.this;
                    if (((Number) obj).intValue() == 4) {
                        encBackupMainActivity.AUh(new ConnectionErrorDialogFragment());
                    }
                }
            });
            this.A03.A03.A05(this, new InterfaceC05620Pl() { // from class: X.1k5
                {
                    EncBackupMainActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    EncBackupMainActivity encBackupMainActivity = EncBackupMainActivity.this;
                    encBackupMainActivity.setResult(((Number) obj).intValue(), new Intent());
                    encBackupMainActivity.finish();
                }
            });
            C36281kX c36281kX2 = this.A03;
            Bundle extras = getIntent().getExtras();
            if (c36281kX2 != null) {
                C000700j.A09(extras.containsKey("user_action"), "getIntent().getExtras()[USER_ACTION_ARG] is required but is not present");
                int i = extras.getInt("user_action");
                C0HK c0hk = c36281kX2.A04;
                if (c0hk.A01() == null) {
                    c0hk.A0B(Integer.valueOf(i));
                }
                C0HK c0hk2 = c36281kX2.A00;
                if (c0hk2.A01() == null) {
                    if (i == 1) {
                        c0hk2.A0B(100);
                    } else if (i == 2) {
                        c0hk2.A0B(101);
                    } else if (i == 5) {
                        c0hk2.A0B(102);
                    }
                }
                C0HK c0hk3 = c36281kX2.A01;
                if (c0hk3.A01() == null) {
                    c0hk3.A0B(1);
                }
                WaImageButton waImageButton = (WaImageButton) C0VJ.A0A(this, R.id.enc_backup_toolbar_button);
                this.A01 = waImageButton;
                waImageButton.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kP
                    {
                        EncBackupMainActivity.this = this;
                    }

                    @Override // X.AbstractView$OnClickListenerC49532Ky
                    public void A00(View view) {
                        EncBackupMainActivity encBackupMainActivity = EncBackupMainActivity.this;
                        AbstractC02800Cx abstractC02800Cx = encBackupMainActivity.A00;
                        if (abstractC02800Cx.A03() == 0) {
                            EncBackupMainActivity.A00(encBackupMainActivity, 0);
                        } else {
                            abstractC02800Cx.A0s();
                        }
                    }
                });
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
