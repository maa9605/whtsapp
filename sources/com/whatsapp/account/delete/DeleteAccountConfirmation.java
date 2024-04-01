package com.whatsapp.account.delete;

import X.AbstractActivityC06450Tg;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C002701i;
import X.C00U;
import X.C019208x;
import X.C05300Od;
import X.C05G;
import X.C05Y;
import X.C0DW;
import X.C0E7;
import X.C0EG;
import X.C0U1;
import X.C469829b;
import X.ViewTreeObserver$OnPreDrawListenerC27051Lu;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class DeleteAccountConfirmation extends AbstractActivityC06450Tg {
    public int A00;
    public Handler A01;
    public View A02;
    public ScrollView A03;
    public C00U A04;
    public C05300Od A05;
    public C469829b A06;
    public C0E7 A07;
    public C0EG A08;
    public C0DW A09;
    public C05G A0A;

    public final void A1P() {
        if (this.A03.canScrollVertically(1)) {
            this.A02.setElevation(this.A00);
        } else {
            this.A02.setElevation(0.0f);
        }
    }

    public void lambda$onCreate$970$DeleteAccountConfirmation(View view) {
        if (!this.A07.A05()) {
            Log.i("deleteaccountconfirm/no-connectivity");
            C002701i.A19(this, 2);
            return;
        }
        C002701i.A19(this, 1);
        this.A01.sendEmptyMessageDelayed(0, 60000L);
        C0EG c0eg = this.A08;
        String A04 = ((ActivityC02310Ar) this).A01.A04();
        String A03 = ((ActivityC02310Ar) this).A01.A03();
        String stringExtra = getIntent().getStringExtra("additionalComments");
        int intExtra = getIntent().getIntExtra("deleteReason", -1);
        if (c0eg.A02.A06) {
            Log.i("sendmethods/sendremoveaccount");
            C05Y c05y = c0eg.A07;
            Message obtain = Message.obtain(null, 0, 27, 0);
            obtain.getData().putString("lg", A04);
            obtain.getData().putString("lc", A03);
            obtain.getData().putString("userFeedback", stringExtra);
            obtain.getData().putInt("deleteReason", intExtra);
            c05y.A09(obtain);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A03.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC27051Lu(this));
        }
    }

    @Override // X.AbstractActivityC06450Tg, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = new Handler(this.A0A, this) { // from class: X.1Lv
            public final C05G A00;
            public final WeakReference A01;

            {
                super(Looper.getMainLooper());
                this.A00 = r2;
                this.A01 = new WeakReference(this);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Activity activity = (Activity) this.A01.get();
                if (activity == null) {
                    Log.w("delete account confirmation was garbage collected with messages still enqueued");
                } else if (message.what == 0) {
                    Log.i("deleteacctconfirm/timeout/expired");
                    C002701i.A18(activity, 1);
                    if (this.A00.A01() != 0) {
                        Log.w("deleteacctconfirm/dialog-delete-failed");
                        C002701i.A19(activity, 3);
                    }
                }
            }
        };
        this.A04 = new C00U() { // from class: X.1jj
            {
                DeleteAccountConfirmation.this = this;
            }

            @Override // X.C00U
            public void ALb() {
                DeleteAccountConfirmation deleteAccountConfirmation = DeleteAccountConfirmation.this;
                C002701i.A18(deleteAccountConfirmation, 1);
                deleteAccountConfirmation.A16(EULA.A00(deleteAccountConfirmation), true);
            }

            @Override // X.C00U
            public void ALc() {
                DeleteAccountConfirmation.this.A01.removeMessages(0);
            }
        };
        setTitle(R.string.settings_delete_account);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(R.layout.delete_account_confirmation);
        this.A03 = (ScrollView) findViewById(R.id.scroll_view);
        this.A02 = findViewById(R.id.bottom_button_container);
        findViewById(R.id.delete_account_submit).setOnClickListener(new View.OnClickListener() { // from class: X.1Ll
            {
                DeleteAccountConfirmation.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountConfirmation.this.lambda$onCreate$970$DeleteAccountConfirmation(view);
            }
        });
        TextView textView = (TextView) findViewById(R.id.delete_account_confirmation_info);
        String string = getString(R.string.settings_delete_account_confirmation_info);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
        if (this.A06.A07() && ((ActivityC02290Ap) this).A0F.A0F() != null && this.A09.A04()) {
            string = getString(R.string.settings_delete_account_confirmation_info_drive_and_payments, string);
        } else if (this.A06.A07() && ((ActivityC02290Ap) this).A0F.A0F() != null) {
            string = getString(R.string.settings_delete_account_confirmation_info_drive, string);
        } else if (this.A09.A04()) {
            string = getString(R.string.settings_delete_account_confirmation_info_payments, string);
        }
        textView.setText(string);
        this.A05.A0i.add(this.A04);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
            this.A03.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.1Lt
                {
                    DeleteAccountConfirmation.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    DeleteAccountConfirmation.this.A1P();
                }
            });
            this.A03.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC27051Lu(this));
        }
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(R.string.delete_account_processing));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i == 2) {
            C019208x c019208x = new C019208x(this);
            c019208x.A01.A0E = getString(R.string.register_check_connectivity, getString(R.string.connectivity_self_help_instructions));
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1Lm
                {
                    DeleteAccountConfirmation.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(DeleteAccountConfirmation.this, 2);
                }
            });
            return c019208x.A00();
        } else if (i != 3) {
            return super.onCreateDialog(i);
        } else {
            C019208x c019208x2 = new C019208x(this);
            c019208x2.A02(R.string.delete_account_failed);
            c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1Lk
                {
                    DeleteAccountConfirmation.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(DeleteAccountConfirmation.this, 3);
                }
            });
            return c019208x2.A00();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C05300Od c05300Od = this.A05;
        c05300Od.A0i.remove(this.A04);
        this.A01.removeMessages(0);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        int A01 = this.A0A.A01();
        if (this.A0A.A02() || A01 == 6) {
            return;
        }
        StringBuilder sb = new StringBuilder("deleteaccountconfirm/wrong-state bounce to main ");
        sb.append(A01);
        Log.e(sb.toString());
        startActivity(new Intent(this, Main.class));
        finish();
    }
}
