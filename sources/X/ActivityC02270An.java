package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.BlockingUserInteractionActivity;
import com.whatsapp.InsufficientStorageSpaceActivity;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.tos.TosUpdateActivity;
import java.util.List;

/* renamed from: X.0An */
/* loaded from: classes.dex */
public class ActivityC02270An extends AbstractActivityC02280Ao {
    public C018308n A00;
    public C03230Ew A01;
    public C03150Ej A02;
    public HandlerC06520Tr A03;
    public C06870Vj A04;
    public C03160Eo A05;
    public C03170Ep A06;
    public AnonymousClass034 A07;
    public AnonymousClass012 A08;
    public C0CC A09;
    public C49562Lc A0A;
    public C47232Ak A0B;
    public C2MD A0C;
    public C0EZ A0D;
    public C03070Ea A0E;
    public C2MB A0F;
    public boolean A0G;
    public boolean A0H = true;
    public boolean A0I = true;

    public static void A02() {
    }

    private void A00() {
    }

    private void A01() {
        getResources().getConfiguration().fontScale = getApplicationContext().getResources().getConfiguration().fontScale;
        getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
    }

    private boolean A03() {
        return getApplicationContext().getResources().getConfiguration().fontScale == getResources().getConfiguration().fontScale;
    }

    public void A1G() {
        if (Boolean.TRUE.equals(this.A09.A03.A01())) {
            Intent intent = getIntent();
            Intent intent2 = new Intent(this, BlockingUserInteractionActivity.class);
            intent2.putExtra("original_intent", intent);
            intent2.putExtra("blocking_type", 0);
            finish();
            startActivity(intent2);
        }
    }

    public void A1H() {
        if (this instanceof InsufficientStorageSpaceActivity) {
            return;
        }
        if (this.A0A.A01() != 1 && this.A0A.A01() != 4 && this.A0A.A01() != 3) {
            if (this.A0A.A01() == 0) {
                this.A0A.A02(this, new InterfaceC05620Pl() { // from class: X.1hh
                    {
                        ActivityC02270An.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        ActivityC02270An.this.A1K((Integer) obj);
                    }
                });
                return;
            }
            return;
        }
        Intent intent = getIntent();
        Intent intent2 = new Intent(this, BlockingUserInteractionActivity.class);
        intent2.putExtra("original_intent", intent);
        intent2.putExtra("blocking_type", 1);
        finish();
        startActivity(intent2);
    }

    public void A1I() {
        if (this.A0I) {
            if (this.A0E.A06()) {
                startActivity(new Intent(this, TosUpdateActivity.class));
            }
            if (super.A0B == null) {
                throw null;
            }
        }
    }

    public /* synthetic */ void A1J() {
        C002701i.A18(this, 123);
    }

    public /* synthetic */ void A1K(Integer num) {
        Intent intent = getIntent();
        Intent intent2 = new Intent(this, BlockingUserInteractionActivity.class);
        intent2.putExtra("original_intent", intent);
        intent2.putExtra("blocking_type", 1);
        if (num.intValue() == 1) {
            finish();
            startActivity(intent2);
        }
    }

    public void A1L(List list) {
        if (list.size() == 1) {
            if (C003101m.A0Z((Jid) list.get(0))) {
                super.A0A.A07(R.string.sending_status, 1);
            } else {
                super.A0A.A07(R.string.sending_message, 1);
            }
        } else if (list.contains(C04580Kz.A00)) {
            super.A0A.A07(R.string.sending_messages_and_status, 1);
        } else {
            super.A0A.A07(R.string.sending_messages, 1);
        }
    }

    public void A1M(boolean z) {
        this.A0H = z;
    }

    public void A1N(boolean z) {
        this.A0I = z;
    }

    public boolean A1O() {
        return this.A06.A05();
    }

    @Override // X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!A03()) {
            A01();
        }
        super.onCreate(bundle);
        this.A03 = new HandlerC06520Tr(Looper.getMainLooper(), this.A0B, this.A02);
        C06530Ts c06530Ts = this.A0O;
        if (c06530Ts != null) {
            if (C06530Ts.A02) {
                AbstractC02800Cx A0N = c06530Ts.A01.A0N();
                c06530Ts.A00 = (DialogFragment) A0N.A0Q.A01(C06530Ts.A03);
            }
            this.A06.A01(this);
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 122) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(R.string.register_connecting));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 123) {
            return super.onCreateDialog(i);
        } else {
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.settings_network_service_unavailable);
            c019208x.A06(R.string.ok_short, new DialogInterface.OnClickListener() { // from class: X.1Jc
                {
                    ActivityC02270An.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ActivityC02270An.this.A1J();
                }
            });
            return c019208x.A00();
        }
    }

    @Override // X.ActivityC02320As, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 82 && this.A0G) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.A0G = true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.A0G = false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.A03.hasMessages(0)) {
            this.A03.removeMessages(0);
        }
        this.A0B.A01();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A0H) {
            this.A03.sendEmptyMessageDelayed(0, 3000L);
        }
        if (A1O()) {
            if (!this.A06.A08()) {
                this.A06.A03(false);
                return;
            }
            A15(AppAuthenticationActivity.A00(this), 202);
            overridePendingTransition(0, 0);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A0E.A02();
        A1I();
        A1G();
        A1H();
    }
}
