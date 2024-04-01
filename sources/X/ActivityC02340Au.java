package X;

import X.ActivityC02340Au;
import X.C0C1;
import X.InterfaceC02360Aw;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.ImmLeaksCleaner;

/* renamed from: X.0Au */
/* loaded from: classes.dex */
public class ActivityC02340Au extends ActivityC02350Av implements InterfaceC02360Aw, InterfaceC02380Ay, InterfaceC02390Az, C0B0, C0B1 {
    public int A00;
    public C0CR A01;
    public C0VW A02;
    public final C0U8 A03;
    public final C02520Bt A04;
    public final C0U5 A05;

    public static void A0J() {
    }

    public ActivityC02340Au() {
        this.A04 = new C02520Bt(this);
        this.A05 = new C0U5(this);
        this.A03 = new C0U8(new Runnable() { // from class: X.0U7
            {
                ActivityC02340Au.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                super/*android.app.Activity*/.onBackPressed();
            }
        });
        AbstractC02530Bu AAs = AAs();
        if (AAs != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                AAs.A02(new C0UA() { // from class: androidx.activity.ComponentActivity$2
                    {
                        ActivityC02340Au.this = this;
                    }

                    @Override // X.C0UA
                    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
                        Window window;
                        View peekDecorView;
                        if (c0c1 != C0C1.ON_STOP || (window = ActivityC02340Au.this.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                    }
                });
            }
            AAs().A02(new C0UA() { // from class: androidx.activity.ComponentActivity$3
                {
                    ActivityC02340Au.this = this;
                }

                @Override // X.C0UA
                public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
                    if (c0c1 == C0C1.ON_DESTROY) {
                        ActivityC02340Au activityC02340Au = ActivityC02340Au.this;
                        if (activityC02340Au.isChangingConfigurations()) {
                            return;
                        }
                        activityC02340Au.ADv().A00();
                    }
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 > i || i > 23) {
                return;
            }
            AAs().A02(new ImmLeaksCleaner(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public ActivityC02340Au(int i) {
        this();
        this.A00 = i;
    }

    public void A0L() {
        getLastNonConfigurationInstance();
    }

    public C0CR A9l() {
        if (getApplication() != null) {
            C0CR c0cr = this.A01;
            if (c0cr != null) {
                return c0cr;
            }
            C38511oL c38511oL = new C38511oL(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            this.A01 = c38511oL;
            return c38511oL;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // X.ActivityC02350Av, X.InterfaceC02360Aw
    public AbstractC02530Bu AAs() {
        return this.A04;
    }

    @Override // X.C0B0
    public final C0U8 ABe() {
        return this.A03;
    }

    @Override // X.InterfaceC02390Az
    public final C0U6 ACx() {
        return this.A05.A00;
    }

    @Override // X.InterfaceC02380Ay
    public C0VW ADv() {
        if (getApplication() != null) {
            C0VW c0vw = this.A02;
            if (c0vw == null) {
                C10390fy c10390fy = (C10390fy) getLastNonConfigurationInstance();
                if (c10390fy != null) {
                    this.A02 = c10390fy.A00;
                }
                C0VW c0vw2 = this.A02;
                if (c0vw2 == null) {
                    C0VW c0vw3 = new C0VW();
                    this.A02 = c0vw3;
                    return c0vw3;
                }
                return c0vw2;
            }
            return c0vw;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.A03.A00();
    }

    @Override // X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05.A00(bundle);
        C0C3.A00(this);
        int i = this.A00;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C10390fy c10390fy;
        C0VW c0vw = this.A02;
        if (c0vw == null && ((c10390fy = (C10390fy) getLastNonConfigurationInstance()) == null || (c0vw = c10390fy.A00) == null)) {
            return null;
        }
        C10390fy c10390fy2 = new C10390fy();
        c10390fy2.A00 = c0vw;
        return c10390fy2;
    }

    @Override // X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC02530Bu AAs = AAs();
        if (AAs instanceof C02520Bt) {
            ((C02520Bt) AAs).A06(EnumC02560Bx.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.A05.A00.A02(bundle);
    }
}
