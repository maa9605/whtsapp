package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.0As */
/* loaded from: classes.dex */
public class ActivityC02320As extends ActivityC02330At implements AnonymousClass091, C0B4 {
    public Resources A00;
    public AbstractC004101x A01;

    public static void A09() {
    }

    public static void A0A() {
    }

    public static void A0B() {
    }

    public static void A0C() {
    }

    public static void A0D() {
    }

    public void A0g() {
    }

    public void A0m(boolean z) {
    }

    public void APM(C0U0 c0u0) {
    }

    public void APN(C0U0 c0u0) {
    }

    @Override // X.AnonymousClass091
    public C0U0 AQW(C0O8 c0o8) {
        return null;
    }

    public ActivityC02320As() {
    }

    public ActivityC02320As(int i) {
        super(i);
    }

    private boolean A0E(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // X.ActivityC02330At
    public void A0R() {
        A0d().A09();
    }

    public C0U1 A0c() {
        return A0d().A05();
    }

    public AbstractC004101x A0d() {
        AbstractC004101x abstractC004101x = this.A01;
        if (abstractC004101x == null) {
            C0CN c0cn = new C0CN(this, null, this, this);
            this.A01 = c0cn;
            return c0cn;
        }
        return abstractC004101x;
    }

    public C0U0 A0e(C0O8 c0o8) {
        return A0d().A07(c0o8);
    }

    public void A0f() {
        A0d().A06();
    }

    public void A0h(int i) {
        A0d().A0R(i);
    }

    public void A0i(Intent intent) {
        navigateUpTo(intent);
    }

    public void A0j(Intent intent) {
        shouldUpRecreateTask(intent);
    }

    public void A0k(Toolbar toolbar) {
        A0d().A0O(toolbar);
    }

    public void A0l(C12850kB c12850kB) {
        Intent ADN = ADN();
        if (ADN != null || (ADN = C002701i.A07(this)) != null) {
            ComponentName component = ADN.getComponent();
            if (component == null) {
                component = ADN.resolveActivity(c12850kB.A00.getPackageManager());
            }
            ArrayList arrayList = c12850kB.A01;
            int size = arrayList.size();
            try {
                Context context = c12850kB.A00;
                for (Intent A08 = C002701i.A08(context, component); A08 != null; A08 = C002701i.A08(context, A08.getComponent())) {
                    arrayList.add(size, A08);
                }
                arrayList.add(ADN);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    public boolean A0n() {
        Intent ADN = ADN();
        if (ADN != null) {
            if (shouldUpRecreateTask(ADN)) {
                C12850kB c12850kB = new C12850kB(this);
                A0l(c12850kB);
                ArrayList arrayList = c12850kB.A01;
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    c12850kB.A00.startActivities(intentArr, null);
                    try {
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            navigateUpTo(ADN);
            return true;
        }
        return false;
    }

    @Override // X.C0B4
    public Intent ADN() {
        return C002701i.A07(this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0d().A0M(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        A0d().A0G(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        C0U1 A0c = A0c();
        if (getWindow().hasFeature(0)) {
            if (A0c == null || !A0c.A0P()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // X.ActivityC02350Av, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0U1 A0c = A0c();
        if (keyCode == 82 && A0c != null && A0c.A0U(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        return A0d().A03(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return A0d().A02();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.A00;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        A0d().A09();
    }

    @Override // X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A00 != null) {
            this.A00.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        A0d().A0H(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        A0g();
    }

    @Override // X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC004101x A0d = A0d();
        A0d.A08();
        A0d.A0I(bundle);
        super.onCreate(bundle);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        A0d().A0A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A0E(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC02330At, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0U1 A0c = A0c();
        if (menuItem.getItemId() != 16908332 || A0c == null || (A0c.A01() & 4) == 0) {
            return false;
        }
        return A0n();
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        A0d().A0J(bundle);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        A0d().A0B();
    }

    @Override // X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A0d().A0K(bundle);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        A0d().A0C();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        A0d().A0D();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A0d().A0P(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        C0U1 A0c = A0c();
        if (getWindow().hasFeature(0)) {
            if (A0c == null || !A0c.A0S()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        A0d().A0F(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        A0d().A0L(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0d().A0N(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        A0d().A0E(i);
    }
}
