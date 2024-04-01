package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.whatsapp.Main;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.0WC */
/* loaded from: classes.dex */
public class C0WC extends C0WD {
    public C03150Ej A00;
    public HandlerC06520Tr A01;
    public C03170Ep A02;
    public AnonymousClass034 A03;
    public C47232Ak A04;
    public C05G A05;

    @Override // X.C0WD, X.ActivityC06980Vx, X.AbstractActivityC06990Vy, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = new HandlerC06520Tr(Looper.getMainLooper(), this.A04, this.A00);
        this.A02.A01(this);
    }

    @Override // X.ActivityC06980Vx, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.A01.hasMessages(0)) {
            this.A01.removeMessages(0);
        }
        this.A04.A01();
    }

    @Override // X.ActivityC06980Vx, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A01.sendEmptyMessageDelayed(0, 3000L);
        if (!this.A05.A02() && this.A05.A01() != 2) {
            StringBuilder A0P = C000200d.A0P("settings/resume/wrong-state ");
            A0P.append(this.A05.A01());
            Log.i(A0P.toString());
            startActivity(new Intent(this, Main.class));
            finish();
        }
        if (Build.VERSION.SDK_INT >= 23 && this.A02.A08()) {
            Intent A00 = AppAuthenticationActivity.A00(this);
            if (!((ActivityC06980Vx) this).A09) {
                ((ActivityC06980Vx) this).A04 = A00;
                ((ActivityC06980Vx) this).A07 = 202;
            } else {
                startActivityForResult(A00, 202);
            }
            overridePendingTransition(0, 0);
            return;
        }
        this.A02.A03(false);
    }
}
