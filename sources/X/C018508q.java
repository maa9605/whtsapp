package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.08q */
/* loaded from: classes.dex */
public class C018508q {
    public static volatile C018508q A07;
    public C0B5 A00;
    public C26731Kl A01;
    public final C0E7 A03;
    public final C001200o A04;
    public final AnonymousClass072 A05;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final Executor A06 = new Executor() { // from class: X.0FL
        {
            C018508q.this = this;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C018508q.this.A02.post(runnable);
        }
    };

    public C018508q(C001200o c001200o, C0E7 c0e7, AnonymousClass072 anonymousClass072) {
        this.A04 = c001200o;
        this.A03 = c0e7;
        this.A05 = anonymousClass072;
    }

    public static C018508q A00() {
        if (A07 == null) {
            synchronized (C018508q.class) {
                if (A07 == null) {
                    A07 = new C018508q(C001200o.A01, C0E7.A00(), AnonymousClass072.A00());
                }
            }
        }
        return A07;
    }

    public Toast A01(CharSequence charSequence, int i) {
        C001200o c001200o = this.A04;
        View inflate = LayoutInflater.from(c001200o.A00).inflate(R.layout.toast, (ViewGroup) null);
        ((TextView) C0AT.A0D(inflate, 16908299)).setText(charSequence);
        Toast toast = new Toast(c001200o.A00);
        toast.setView(inflate);
        toast.setDuration(i);
        return toast;
    }

    public final Toast A02(CharSequence charSequence, int i) {
        View view;
        C001200o c001200o = this.A04;
        Toast makeText = Toast.makeText(c001200o.A00, charSequence, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 <= 28) {
            String str = Build.MANUFACTURER;
            if (("google".equalsIgnoreCase(str) || "oneplus".equalsIgnoreCase(str)) && (view = makeText.getView()) != null) {
                Drawable background = view.getBackground();
                TextView textView = (TextView) view.findViewById(16908299);
                if (background != null && textView != null) {
                    background.setColorFilter(C02160Ac.A00(c001200o.A00, R.color.toast_background), PorterDuff.Mode.SRC_IN);
                    textView.setTextColor(C02160Ac.A00(c001200o.A00, R.color.toast_text));
                }
            }
        }
        return makeText;
    }

    public void A03() {
        StringBuilder A0P = C000200d.A0P("app/progress-spinner/remove dt=");
        A0P.append(this.A00);
        Log.i(A0P.toString());
        this.A01 = null;
        C0B5 c0b5 = this.A00;
        if (c0b5 != null) {
            c0b5.ARS();
        } else {
            C06530Ts.A02 = false;
        }
        Log.i("app/progress-spinner/remove done");
    }

    public final void A04(final int i) {
        this.A02.post(new Runnable() { // from class: X.1H5
            {
                C018508q.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C018508q.this.A05(i, 1);
            }
        });
    }

    public void A05(int i, int i2) {
        C0B5 c0b5 = this.A00;
        if (c0b5 != null) {
            c0b5.AUj(i);
        } else {
            A0E(this.A04.A00.getString(i), i2);
        }
    }

    public void A06(int i, int i2) {
        StringBuilder A0P = C000200d.A0P("app/progress-spinner/show dt=");
        A0P.append(this.A00);
        Log.i(A0P.toString());
        this.A01 = new C26731Kl(i, i2);
        C0B5 c0b5 = this.A00;
        if (c0b5 != null) {
            c0b5.AUr(i, i2);
        }
        Log.i("app/progress-spinner/show done");
    }

    public void A07(int i, int i2) {
        A0E(this.A04.A00.getString(i), i2);
    }

    public void A08(C0B5 c0b5) {
        StringBuilder sb = new StringBuilder("app/dt/clear dt=");
        sb.append(c0b5);
        sb.append(" dialog_toast=");
        sb.append(this.A00);
        Log.i(sb.toString());
        C0B5 c0b52 = this.A00;
        if (c0b52 == c0b5) {
            if (this.A01 != null) {
                c0b52.ARS();
            }
            this.A00 = null;
        }
        Log.i("app/dt/clear done");
    }

    public void A09(C0B5 c0b5) {
        if (c0b5 == null && (c0b5 = this.A00) == null) {
            C000700j.A08(false, "dialogToast == null");
            Log.w("app/removeProgressSpinner/ignore dialogToast == null");
            return;
        }
        c0b5.ARS();
    }

    public void A0A(C0B5 c0b5) {
        StringBuilder sb = new StringBuilder("app/dt/set ");
        sb.append(c0b5);
        Log.i(sb.toString());
        this.A00 = c0b5;
        C26731Kl c26731Kl = this.A01;
        if (c26731Kl != null) {
            StringBuilder A0P = C000200d.A0P("app/dt/set show_progress_data=");
            A0P.append(c26731Kl);
            A0P.append(" dialog_toast=");
            A0P.append(this.A00);
            Log.i(A0P.toString());
            C0B5 c0b52 = this.A00;
            C26731Kl c26731Kl2 = this.A01;
            c0b52.AUr(c26731Kl2.A02, c26731Kl2.A01);
            if (this.A01.A00 != null) {
                Log.i("app/dt/set/update");
                this.A00.AVr(this.A01.A00);
            }
        }
        Log.i("app/dt/set done");
    }

    public void A0B(C0B5 c0b5) {
        if (c0b5 == null && (c0b5 = this.A00) == null) {
            C000700j.A08(false, "dialogToast == null");
            A0E(this.A04.A00.getString(R.string.register_wait_message), 0);
            return;
        }
        c0b5.AUr(0, R.string.register_wait_message);
    }

    public void A0C(C0B5 c0b5, int i) {
        if (c0b5 != null) {
            c0b5.AUj(i);
        } else {
            A05(i, 0);
        }
    }

    public void A0D(C0B5 c0b5, String str) {
        if (c0b5 != null) {
            c0b5.AUm(str);
        } else {
            A0I(str, 0);
        }
    }

    public void A0E(CharSequence charSequence, int i) {
        A02(charSequence, i).show();
    }

    public void A0F(final CharSequence charSequence, final int i) {
        if (AnonymousClass024.A0c()) {
            A02(charSequence, i).show();
            return;
        }
        this.A02.post(new Runnable() { // from class: X.1H4
            {
                C018508q.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C018508q.this.A02(charSequence, i).show();
            }
        });
    }

    public void A0G(Runnable runnable) {
        if (AnonymousClass024.A0c()) {
            runnable.run();
        } else {
            this.A02.post(runnable);
        }
    }

    public void A0H(String str) {
        StringBuilder A0P = C000200d.A0P("app/progress-spinner/update-message dt=");
        A0P.append(this.A00);
        Log.i(A0P.toString());
        C26731Kl c26731Kl = this.A01;
        if (c26731Kl != null) {
            c26731Kl.A00 = str;
        } else {
            Log.w("app/progress-spinner/update-message no progress data");
        }
        C0B5 c0b5 = this.A00;
        if (c0b5 != null) {
            c0b5.AVr(str);
        }
        Log.i("app/progress-spinner/update-message done");
    }

    public void A0I(String str, int i) {
        C0B5 c0b5 = this.A00;
        if (c0b5 != null) {
            c0b5.AUm(str);
        } else {
            A02(str, i).show();
        }
    }

    public boolean A0J() {
        if (this.A03.A05()) {
            return true;
        }
        boolean A02 = C0E7.A02(this.A04.A00);
        int i = R.string.network_required;
        if (A02) {
            i = R.string.network_required_airplane_on;
        }
        A07(i, 0);
        return false;
    }
}
