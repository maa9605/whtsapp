package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Ap */
/* loaded from: classes.dex */
public class ActivityC02290Ap extends AbstractActivityC02300Aq implements C0B5, C0B6 {
    public static final int A0P = -1;
    public static final long A0Q = 500;
    public static final String A0R = "screenshot.jpg";
    public int A00;
    public long A01;
    public Intent A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public Toolbar A07;
    public AbstractC000600i A08;
    public C012005w A09;
    public C018508q A0A;
    public C01B A0B;
    public C06580Ty A0C;
    public C0E7 A0D;
    public C02E A0E;
    public C000500h A0F;
    public C43871y8 A0G;
    public C40081rY A0H;
    public C003701t A0I;
    public C41451tw A0J;
    public Integer A0K;
    public boolean A0N;
    public boolean A0M = true;
    public final C06530Ts A0O = new C06530Ts(this);
    public List A0L = new ArrayList();

    public void A10(int i) {
    }

    private C06580Ty A04() {
        return (C06580Ty) C002701i.A0J(this, new C0CR() { // from class: X.0Tw
            @Override // X.C0CR
            public C0MU A6e(Class cls) {
                if (cls.isAssignableFrom(C06580Ty.class)) {
                    return new C06580Ty();
                }
                throw new IllegalArgumentException("Invalid UIModeViewModel for DialogActivity");
            }
        }).A00(C06580Ty.class);
    }

    private void A05() {
        Intent intent = this.A02;
        if (intent != null) {
            Integer num = this.A0K;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            if (this.A0N) {
                finish();
            }
            this.A02 = null;
            this.A0K = null;
            this.A0N = false;
        }
    }

    public static void A06(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime < j2) {
            SystemClock.sleep(j2 - elapsedRealtime);
        }
    }

    @Override // X.ActivityC02330At
    public void A0W(C0BA c0ba) {
        this.A0L.add(new WeakReference(c0ba));
    }

    @Override // X.ActivityC02320As
    public C0U0 A0e(C0O8 c0o8) {
        C0U0 A0e = super.A0e(c0o8);
        if (A0e != null) {
            A0e.A06();
        }
        return A0e;
    }

    @Override // X.ActivityC02320As
    public void A0k(Toolbar toolbar) {
        super.A0k(toolbar);
        this.A07 = toolbar;
    }

    @Override // X.ActivityC02320As
    public void A0m(boolean z) {
        C0U1 A0c;
        if (this.A03 == null) {
            View inflate = getLayoutInflater().inflate(R.layout.actionbar_progress, (ViewGroup) null, false);
            View findViewById = inflate.findViewById(R.id.progress_bar);
            this.A03 = findViewById;
            if (findViewById != null && (A0c = A0c()) != null) {
                A0c.A0M(true);
                A0c.A0E(inflate, new C0U2());
            }
        }
        View view = this.A03;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Finally extract failed */
    public Uri A0s() {
        FileOutputStream fileOutputStream;
        View rootView = getWindow().getDecorView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
        File A01 = AbstractC012105x.A01(this.A09.A0B(), A0R);
        try {
            fileOutputStream = new FileOutputStream(A01);
        } catch (FileNotFoundException e) {
            StringBuilder A0P2 = C000200d.A0P("File not found: ");
            A0P2.append(e.getMessage());
            Log.e(A0P2.toString());
        } catch (IOException e2) {
            StringBuilder A0P3 = C000200d.A0P("IOException: ");
            A0P3.append(e2.getMessage());
            Log.e(A0P3.toString());
        }
        try {
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return AnonymousClass024.A04(this, A01);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public List A0t() {
        ArrayList arrayList = new ArrayList();
        for (Reference reference : this.A0L) {
            C0BA c0ba = (C0BA) reference.get();
            if (c0ba != null && c0ba.A0W()) {
                arrayList.add(c0ba);
            }
        }
        return arrayList;
    }

    public void A0u() {
    }

    public void A0v() {
    }

    public void A0w() {
    }

    public void A0x() {
    }

    public void A0y() {
        View view;
        if (isFinishing() || (view = this.A04) == null) {
            return;
        }
        view.postDelayed(new Runnable() { // from class: X.0U3
            {
                ActivityC02290Ap.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ActivityC02290Ap.this.ARS();
            }
        }, 300L);
    }

    public void A0z() {
        A11(R.layout.toolbar);
    }

    public void A11(int i) {
        boolean z = false;
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(i, (ViewGroup) null, false);
        toolbar.setFitsSystemWindows(true);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(R.attr.actionBarStyle, typedValue, true);
            TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(typedValue.resourceId, C49582Lf.A00);
            try {
                float dimension = obtainStyledAttributes.getDimension(12, 0.0f);
                obtainStyledAttributes.recycle();
                toolbar.setElevation(dimension);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(R.attr.windowActionBarOverlay, typedValue2, true);
        if (typedValue2.type == 18 && typedValue2.data != 0) {
            z = true;
        }
        if (z) {
            this.A06 = new FrameLayout(this);
            FrameLayout frameLayout = new FrameLayout(this);
            this.A05 = frameLayout;
            this.A06.addView(frameLayout, -1, -1);
            this.A06.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.actionbar_height));
        } else {
            LinearLayout linearLayout = new LinearLayout(this);
            this.A06 = linearLayout;
            this.A05 = linearLayout;
            linearLayout.setOrientation(1);
            this.A06.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.actionbar_height));
        }
        A0k(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: X.1GQ
            {
                ActivityC02290Ap.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC02290Ap.this.finish();
            }
        });
    }

    public void A12(int i) {
        if (AFE()) {
            return;
        }
        AUr(0, i);
    }

    public void A13(int i, int i2, int i3, final InterfaceC06590Tz interfaceC06590Tz) {
        if (AFE()) {
            return;
        }
        C0U4 c0u4 = new C0U4(i2, new Object[0]);
        c0u4.A05 = i;
        c0u4.A0A = new Object[0];
        c0u4.A00 = i2;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.1GR
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                interfaceC06590Tz.AIT();
            }
        };
        c0u4.A03 = i3;
        c0u4.A06 = onClickListener;
        c0u4.A01().A14(A0N(), null);
    }

    public void A14(Intent intent) {
        A16(intent, false);
    }

    public void A15(Intent intent, int i) {
        if (this.A0M) {
            startActivityForResult(intent, i);
            return;
        }
        this.A02 = intent;
        this.A0K = Integer.valueOf(i);
        this.A0N = false;
    }

    public void A16(Intent intent, boolean z) {
        boolean z2;
        if (!this.A0M) {
            this.A02 = intent;
            z2 = false;
        } else {
            startActivity(intent);
            z2 = true;
        }
        if (z) {
            if (z2) {
                finish();
            } else {
                this.A0N = z;
            }
        }
    }

    public void A17(Configuration configuration) {
        this.A0C.A02(configuration);
    }

    public /* synthetic */ void A18(Integer num) {
        if (num.intValue() == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getCanonicalName());
            sb.append(" ActivityLifecycleCallbacks: Recreating");
            Log.i(sb.toString());
            recreate();
        }
    }

    public void A19(String str) {
        if (AFE()) {
            return;
        }
        AbstractC02800Cx A0N = A0N();
        C02820Cz c02820Cz = new C02820Cz(A0N);
        C0BA A01 = A0N.A0Q.A01(str);
        if (A01 != null) {
            c02820Cz.A06(A01);
            c02820Cz.A05();
        }
    }

    public void A1A(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.subtitle_text_size));
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0G(C002701i.A0d(str, this, textPaint, this.A0H));
            return;
        }
        throw null;
    }

    public void A1B(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.title_text_size));
        setTitle(C002701i.A0d(str, this, textPaint, this.A0H));
    }

    public void A1C(String str) {
        if (AFE()) {
            return;
        }
        C06530Ts c06530Ts = this.A0O;
        if (c06530Ts.A00 == null) {
            ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", null);
            bundle.putString("message", str);
            progressDialogFragment.A0P(bundle);
            c06530Ts.A00 = progressDialogFragment;
            progressDialogFragment.A14(c06530Ts.A01.A0N(), C06530Ts.A03);
        }
        C06530Ts.A02 = true;
    }

    public void A1D(String str, String str2) {
        if (AFE()) {
            return;
        }
        C0U4 c0u4 = new C0U4(str2);
        c0u4.A08 = str;
        c0u4.A01().A14(A0N(), null);
    }

    public boolean A1E() {
        if (this.A0D.A05()) {
            return false;
        }
        if (C0E7.A02(this)) {
            AUj(R.string.network_required_airplane_on);
            return true;
        }
        AUj(R.string.network_required);
        return true;
    }

    public boolean A1F(int i) {
        if (this.A0D.A05()) {
            return false;
        }
        AUj(i);
        return true;
    }

    @Override // X.C0B5
    public boolean AFE() {
        return C002701i.A1P(this);
    }

    @Override // X.ActivityC02320As, X.AnonymousClass091
    public void APM(C0U0 c0u0) {
        super.APM(c0u0);
        Toolbar toolbar = this.A07;
        if (toolbar != null) {
            C0AT.A0V(toolbar, 0);
        }
    }

    @Override // X.ActivityC02320As, X.AnonymousClass091
    public void APN(C0U0 c0u0) {
        super.APN(c0u0);
        Toolbar toolbar = this.A07;
        if (toolbar != null) {
            C0AT.A0V(toolbar, 4);
        }
    }

    @Override // X.C0B5
    public void ARS() {
        C06530Ts c06530Ts = this.A0O;
        C06530Ts.A02 = false;
        if (!C002701i.A1P(c06530Ts.A01)) {
            DialogFragment dialogFragment = c06530Ts.A00;
            if (dialogFragment != null) {
                dialogFragment.A11();
            }
            c06530Ts.A00 = null;
        }
    }

    @Override // X.C0B5
    public void AUg(DialogFragment dialogFragment, String str) {
        if (AFE()) {
            return;
        }
        AnonymousClass029.A1D(A0N(), dialogFragment, str);
    }

    @Override // X.C0B5
    public void AUh(DialogFragment dialogFragment) {
        if (AFE()) {
            return;
        }
        AbstractC02800Cx A0N = A0N();
        String name = dialogFragment.getClass().getName();
        if (A0N.A0Q.A01(name) == null) {
            dialogFragment.A14(A0N, name);
        }
    }

    @Override // X.C0B5
    public void AUj(int i) {
        if (AFE()) {
            return;
        }
        C0U4 c0u4 = new C0U4(i, new Object[0]);
        c0u4.A00 = i;
        c0u4.A01().A14(A0N(), null);
    }

    @Override // X.C0B5
    public void AUk(int i, int i2, int i3, final InterfaceC06590Tz interfaceC06590Tz, Object... objArr) {
        if (AFE()) {
            return;
        }
        C0U4 c0u4 = new C0U4(i2, objArr);
        c0u4.A05 = i;
        c0u4.A0A = new Object[0];
        c0u4.A00 = i2;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.1GP
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                interfaceC06590Tz.AIT();
            }
        };
        c0u4.A03 = i3;
        c0u4.A06 = onClickListener;
        c0u4.A04 = R.string.cancel;
        c0u4.A01().A14(A0N(), null);
    }

    @Override // X.C0B5
    public void AUl(int i, int i2, Object... objArr) {
        if (AFE()) {
            return;
        }
        C0U4 c0u4 = new C0U4(i2, objArr);
        c0u4.A05 = i;
        c0u4.A0A = new Object[0];
        c0u4.A00 = i2;
        c0u4.A01().A14(A0N(), null);
    }

    @Override // X.C0B5
    public void AUm(String str) {
        if (AFE()) {
            return;
        }
        new C0U4(str).A01().A14(A0N(), null);
    }

    @Override // X.C0B5
    public void AUr(int i, int i2) {
        if (AFE()) {
            return;
        }
        C06530Ts c06530Ts = this.A0O;
        if (c06530Ts.A00 == null) {
            ProgressDialogFragment A00 = ProgressDialogFragment.A00(i, i2);
            c06530Ts.A00 = A00;
            A00.A14(c06530Ts.A01.A0N(), C06530Ts.A03);
        }
        C06530Ts.A02 = true;
    }

    @Override // X.C0B5
    public void AVr(String str) {
        if (AFE()) {
            return;
        }
        DialogFragment dialogFragment = this.A0O.A00;
        if (dialogFragment == null) {
            C000200d.A19("dialogtoast/update-progress-message/progress-spinner-not-shown \"", str, "\"");
            return;
        }
        Dialog dialog = dialogFragment.A03;
        if (dialog == null) {
            C000200d.A19("dialogtoast/update-progress-message/null-dialog/ \"", str, "\"");
        } else if (!(dialog instanceof ProgressDialog)) {
            C000200d.A19("dialogtoast/update-progress-message/dialog-type-not-progress-dialog/ \"", str, "\"");
        } else {
            ((AlertDialog) dialog).setMessage(str);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.A0M || SystemClock.elapsedRealtime() - this.A01 > 500 || !(motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2)) && super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$setToolbarAsActionBar$13$DialogActivity(View view) {
        finish();
    }

    @Override // X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT < 29) {
            onStateNotSaved();
        }
        if (this.A0M) {
            super.onBackPressed();
        }
    }

    @Override // X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A17(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (r2.data != 0) goto L18;
     */
    @Override // X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            int r0 = X.AbstractC004101x.A00
            r5.A00 = r0
            X.01c r1 = r5.A01
            android.view.Window r0 = r5.getWindow()
            X.C0LX.A09(r1, r0)
            X.0Ty r1 = r5.A04()
            r5.A0C = r1
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1.A00 = r0
            X.0Ty r0 = r5.A0C
            X.0HK r1 = r0.A01
            X.1hI r0 = new X.1hI
            r0.<init>()
            r1.A05(r5, r0)
            super.onCreate(r6)
            X.01c r0 = r5.A01
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L77
            android.content.res.Resources$Theme r4 = r5.getTheme()
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = 2130969297(0x7f0402d1, float:1.7547272E38)
            r3 = 1
            r4.resolveAttribute(r0, r1, r3)
            int r0 = r1.type
            if (r0 != r3) goto L78
            int r0 = r1.data
            r4.applyStyle(r0, r3)
        L51:
            boolean r0 = X.C0LX.A01
            if (r0 != 0) goto L77
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r0 = 2130969623(0x7f040417, float:1.7547933E38)
            r4.resolveAttribute(r0, r2, r3)
            int r1 = r2.type
            r0 = 18
            if (r1 != r0) goto L6b
            int r0 = r2.data
            r1 = 1
            if (r0 == 0) goto L6c
        L6b:
            r1 = 0
        L6c:
            r0 = 2131951968(0x7f130160, float:1.9540365E38)
            r4.applyStyle(r0, r3)
            if (r1 != 0) goto L77
            r5.A0z()
        L77:
            return
        L78:
            r0 = 2131952039(0x7f1301a7, float:1.954051E38)
            r4.applyStyle(r0, r3)
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ActivityC02290Ap.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        C06530Ts c06530Ts = this.A0O;
        DialogFragment dialogFragment = c06530Ts.A00;
        if (dialogFragment != null) {
            dialogFragment.A11();
        }
        c06530Ts.A00 = null;
        this.A02 = null;
        this.A0N = false;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onPause() {
        this.A0A.A08(this);
        super.onPause();
        this.A0M = false;
        this.A01 = SystemClock.elapsedRealtime();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        if (AbstractC004101x.A00 != this.A00) {
            recreate();
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A0A.A0A(this);
        this.A0M = true;
        A05();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A0C.A02(getResources().getConfiguration());
    }

    @Override // X.ActivityC02320As, android.app.Activity
    public void setContentView(int i) {
        setContentView(getLayoutInflater().inflate(i, (ViewGroup) null, false));
    }

    @Override // X.ActivityC02320As, android.app.Activity
    public void setContentView(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0AT.A0N(view);
        }
        if (this.A06 != null) {
            this.A05.addView(view, -1, -1);
            ViewGroup viewGroup = this.A06;
            this.A04 = viewGroup;
            super.setContentView(viewGroup);
            return;
        }
        this.A04 = view;
        super.setContentView(view);
    }
}
