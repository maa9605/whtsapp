package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

/* renamed from: X.0Vx */
/* loaded from: classes.dex */
public class ActivityC06980Vx extends AbstractActivityC06990Vy implements C0B5 {
    public int A00;
    public int A01;
    public long A02;
    public ProgressDialog A03;
    public Intent A04;
    public C018508q A05;
    public WaPreferenceFragment A06;
    public Integer A07;
    public String A08;
    public boolean A0A;
    public boolean A09 = true;
    public final C01o A0B = new C01o() { // from class: X.1hJ
        {
            ActivityC06980Vx.this = this;
        }

        @Override // X.C01o
        public final void ALd() {
            ActivityC06980Vx.this.A0A = true;
        }
    };

    @Override // X.ActivityC02320As
    public C0U1 A0c() {
        C0CN c0cn = (C0CN) A0d();
        c0cn.A0X();
        return c0cn.A0B;
    }

    @Override // X.C0B5
    public boolean AFE() {
        return C002701i.A1P(this);
    }

    @Override // X.C0B5
    public void ARS() {
        this.A03 = null;
        C002701i.A18(this, 501);
    }

    @Override // X.C0B5
    public void AUg(DialogFragment dialogFragment, String str) {
        throw new IllegalStateException("Unsupported operation");
    }

    @Override // X.C0B5
    public void AUh(DialogFragment dialogFragment) {
        throw new IllegalStateException("Unsupported operation");
    }

    @Override // X.C0B5
    public void AUj(int i) {
        this.A00 = i;
        C002701i.A19(this, 500);
    }

    @Override // X.C0B5
    public void AUk(int i, int i2, int i3, InterfaceC06590Tz interfaceC06590Tz, Object... objArr) {
        this.A01 = i;
        this.A00 = i2;
        C002701i.A19(this, 500);
    }

    @Override // X.C0B5
    public void AUl(int i, int i2, Object... objArr) {
        this.A01 = i;
        this.A00 = i2;
        C002701i.A19(this, 500);
    }

    @Override // X.C0B5
    public void AUm(String str) {
        this.A08 = str;
        C002701i.A19(this, 500);
    }

    @Override // X.C0B5
    public void AUr(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        C002701i.A19(this, 501);
    }

    @Override // X.C0B5
    public void AVr(String str) {
        ProgressDialog progressDialog = this.A03;
        if (progressDialog != null) {
            progressDialog.setMessage(str);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.A09 || SystemClock.elapsedRealtime() - this.A02 > 500 || !(motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2)) && super.dispatchTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$setContentView$17$DialogPreferenceActivity(View view) {
        finish();
    }

    @Override // X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A09) {
            super.onBackPressed();
        } else {
            Log.e("dialogtoasttreferenceactivity/onbackpressed/activity no active");
        }
    }

    @Override // X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ((ActivityC02310Ar) this).A01.A0J();
        super.onConfigurationChanged(configuration);
        A0d().A0H(configuration);
    }

    @Override // X.AbstractActivityC06990Vy, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.A0A = false;
        C0LX.A09(((ActivityC02310Ar) this).A01, getWindow());
        getTheme().applyStyle(R.style.NoActionBar, true);
        getLayoutInflater().setFactory2(new LayoutInflater.Factory2(A0d()) { // from class: X.1Lb
            public final AbstractC004101x A00;

            {
                this.A00 = r1;
            }

            @Override // android.view.LayoutInflater.Factory2
            public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
                if ("TextView".equals(str)) {
                    return new WaTextView(context, attributeSet);
                }
                return this.A00.A04(null, str, context, attributeSet);
            }

            @Override // android.view.LayoutInflater.Factory
            public View onCreateView(String str, Context context, AttributeSet attributeSet) {
                return onCreateView(null, str, context, attributeSet);
            }
        });
        A0d().A0I(bundle);
        super.onCreate(bundle);
        View findViewById = findViewById(16908298);
        if (findViewById != null) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingLeft2 = findViewById.getPaddingLeft();
            ViewParent parent = findViewById.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                paddingLeft += view.getPaddingLeft();
                paddingLeft2 += view.getPaddingRight();
                view.setPadding(0, 0, 0, 0);
            }
            findViewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
            findViewById.setScrollBarStyle(33554432);
        }
        C002301c c002301c = ((ActivityC02310Ar) this).A01;
        c002301c.A0A.add(this.A0B);
    }

    @Override // android.app.Activity
    public Dialog onCreateDialog(int i) {
        String str;
        if (i == 500) {
            C019208x c019208x = new C019208x(this);
            if (TextUtils.isEmpty(this.A08)) {
                str = ((ActivityC02310Ar) this).A01.A06(this.A00);
            } else {
                str = this.A08;
            }
            c019208x.A01.A0E = str;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1GT
                {
                    ActivityC06980Vx.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(ActivityC06980Vx.this, 500);
                }
            });
            int i2 = this.A01;
            if (i2 != 0) {
                c019208x.A03(i2);
            }
            return c019208x.A00();
        } else if (i != 501) {
            Dialog A10 = this.A06.A10(i);
            return A10 == null ? super.onCreateDialog(i) : A10;
        } else {
            ProgressDialog progressDialog = new ProgressDialog(this);
            int i3 = this.A01;
            if (i3 != 0) {
                progressDialog.setTitle(i3);
            }
            progressDialog.setMessage(((ActivityC02310Ar) this).A01.A06(this.A00));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            this.A03 = progressDialog;
            return progressDialog;
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        A0d().A0A();
        C002301c c002301c = ((ActivityC02310Ar) this).A01;
        c002301c.A0A.remove(this.A0B);
        this.A04 = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onPause() {
        this.A05.A08(this);
        super.onPause();
        this.A09 = false;
        this.A02 = SystemClock.elapsedRealtime();
    }

    @Override // X.ActivityC02320As, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((C0CN) A0d()).A0V();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        C0CN c0cn = (C0CN) A0d();
        c0cn.A0X();
        C0U1 c0u1 = c0cn.A0B;
        if (c0u1 != null) {
            c0u1.A0K(true);
        }
    }

    @Override // android.app.Activity
    public void onPrepareDialog(int i, Dialog dialog) {
        String str;
        if (i != 500) {
            super.onPrepareDialog(i, dialog);
            return;
        }
        DialogInterfaceC019408z dialogInterfaceC019408z = (DialogInterfaceC019408z) dialog;
        if (TextUtils.isEmpty(this.A08)) {
            str = ((ActivityC02310Ar) this).A01.A06(this.A00);
        } else {
            str = this.A08;
        }
        dialogInterfaceC019408z.A04(str);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A08 = bundle.getString("dialogToastMessage");
        this.A00 = bundle.getInt("dialogToastMessageId", 0);
        this.A01 = bundle.getInt("dialogToastTitleId", 0);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onResume() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(".onResume");
        Log.i(sb.toString());
        if (this.A0A) {
            this.A0A = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A05.A0A(this);
        this.A09 = true;
        Intent intent = this.A04;
        if (intent != null) {
            Integer num = this.A07;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            this.A04 = null;
            this.A07 = null;
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(".onSaveInstanceState");
        Log.i(sb.toString());
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("dialogToastMessage", this.A08);
        bundle.putInt("dialogToastMessageId", this.A00);
        bundle.putInt("dialogToastTitleId", this.A01);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        A0d().A0D();
    }

    @Override // X.ActivityC02320As, android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A0d().A0P(charSequence);
    }

    @Override // X.ActivityC02320As, android.app.Activity
    public void setContentView(int i) {
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(R.layout.toolbar, (ViewGroup) null, false);
        toolbar.setTitle(getTitle());
        if (Build.VERSION.SDK_INT >= 21) {
            toolbar.setElevation(getResources().getDimension(R.dimen.actionbar_elevation));
        }
        if (((ActivityC02310Ar) this).A01.A0N()) {
            toolbar.setNavigationIcon(R.drawable.ic_back_rtl);
        } else {
            toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_material);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material));
        ViewGroup frameLayout = new FrameLayout(this);
        getLayoutInflater().inflate(i, frameLayout, true);
        linearLayout.addView(frameLayout, -1, -1);
        setContentView(linearLayout);
        A0k(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: X.1GS
            {
                ActivityC06980Vx.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC06980Vx.this.finish();
            }
        });
    }

    @Override // X.ActivityC02320As, android.app.Activity
    public void setContentView(View view) {
        A0d().A0L(view);
    }
}
