package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0At */
/* loaded from: classes.dex */
public class ActivityC02330At extends ActivityC02340Au implements C0B2, C0B3 {
    public static final int A0A = 65534;
    public static final String A0B = "FragmentActivity";
    public static final String A0C = "android:support:fragments";
    public static final String A0D = "android:support:next_request_index";
    public static final String A0E = "android:support:request_fragment_who";
    public static final String A0F = "android:support:request_indicies";
    public int A00;
    public C07270Xo A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C0UR A08;
    public final C02520Bt A09;

    public void A0W(C0BA c0ba) {
    }

    public ActivityC02330At() {
        this.A08 = new C0UR(new C0UF(this));
        this.A09 = new C02520Bt(this);
        this.A07 = true;
    }

    public ActivityC02330At(int i) {
        super(i);
        this.A08 = new C0UR(new C0UF(this));
        this.A09 = new C02520Bt(this);
        this.A07 = true;
    }

    private int A0F(C0BA c0ba) {
        C07270Xo c07270Xo = this.A01;
        if (c07270Xo.A00() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (true) {
            int i = this.A00;
            if (c07270Xo.A01) {
                c07270Xo.A03();
            }
            if (AnonymousClass030.A00(c07270Xo.A02, c07270Xo.A00, i) >= 0) {
                this.A00 = (i + 1) % A0A;
            } else {
                c07270Xo.A05(i, c0ba.A0S);
                this.A00 = (this.A00 + 1) % A0A;
                return i;
            }
        }
    }

    private void A0G() {
        do {
        } while (A0I(A0N(), EnumC02560Bx.CREATED));
    }

    public static void A0H(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean A0I(AbstractC02800Cx abstractC02800Cx, EnumC02560Bx enumC02560Bx) {
        boolean z = false;
        for (C0BA c0ba : abstractC02800Cx.A0Q.A04()) {
            if (c0ba != null) {
                C0UG c0ug = c0ba.A0F;
                if (c0ug != null && ((C0UF) c0ug).A00 != null) {
                    z |= A0I(c0ba.A0B(), enumC02560Bx);
                }
                if (c0ba.A0K.A02.compareTo(EnumC02560Bx.STARTED) >= 0) {
                    c0ba.A0K.A06(enumC02560Bx);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View A0M(View view, String str, Context context, AttributeSet attributeSet) {
        return this.A08.A00.A03.A0O.onCreateView(view, str, context, attributeSet);
    }

    public AbstractC02800Cx A0N() {
        return this.A08.A00.A03;
    }

    public void A0O() {
        C0m3.A00(this);
    }

    public void A0P() {
        this.A09.A05(C0C1.ON_RESUME);
        AbstractC02800Cx abstractC02800Cx = this.A08.A00.A03;
        abstractC02800Cx.A0L = false;
        abstractC02800Cx.A0M = false;
        abstractC02800Cx.A0J(4);
    }

    public void A0Q() {
        C0VJ.A0B(this);
    }

    public void A0R() {
        invalidateOptionsMenu();
    }

    public void A0S() {
        C0VJ.A0C(this);
    }

    public void A0T() {
        C0VJ.A0E(this);
    }

    public void A0U(AbstractC12840kA abstractC12840kA) {
        C0VJ.A0F(this, abstractC12840kA);
    }

    public void A0V(AbstractC12840kA abstractC12840kA) {
        C0VJ.A0G(this, abstractC12840kA);
    }

    public void A0X(C0BA c0ba, Intent intent, int i) {
        A0Y(c0ba, intent, i, null);
    }

    public void A0Y(C0BA c0ba, Intent intent, int i, Bundle bundle) {
        this.A05 = true;
        try {
            if (i == -1) {
                startActivityForResult(intent, -1, bundle);
                return;
            }
            A0H(i);
            startActivityForResult(intent, ((A0F(c0ba) + 1) << 16) + (i & 65535), bundle);
        } finally {
            this.A05 = false;
        }
    }

    public void A0Z(C0BA c0ba, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.A06 = true;
        try {
            if (i == -1) {
                startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            }
            A0H(i);
            startIntentSenderForResult(intentSender, ((A0F(c0ba) + 1) << 16) + (i & 65535), intent, i2, i3, i4, bundle);
        } finally {
            this.A06 = false;
        }
    }

    public void A0a(C0BA c0ba, String[] strArr, int i) {
        if (i == -1) {
            C0VJ.A0H(this, strArr, i);
            return;
        }
        A0H(i);
        try {
            this.A03 = true;
            C0VJ.A0H(this, strArr, ((A0F(c0ba) + 1) << 16) + (i & 65535));
        } finally {
            this.A03 = false;
        }
    }

    public boolean A0b(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // X.C0B3
    public final void AVy(int i) {
        if (this.A03 || i == -1) {
            return;
        }
        A0H(i);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String obj = sb.toString();
        printWriter.print(obj);
        printWriter.print("mCreated=");
        printWriter.print(this.A02);
        printWriter.print(" mResumed=");
        printWriter.print(this.A04);
        printWriter.print(" mStopped=");
        printWriter.print(this.A07);
        if (getApplication() != null) {
            C0m3.A00(this).A04(obj, fileDescriptor, printWriter, strArr);
        }
        this.A08.A00.A03.A0j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.A08.A00.A03.A0C();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            C07270Xo c07270Xo = this.A01;
            String str = (String) c07270Xo.A02(i4, null);
            int A00 = AnonymousClass030.A00(c07270Xo.A02, c07270Xo.A00, i4);
            if (A00 >= 0) {
                Object[] objArr = c07270Xo.A03;
                Object obj = objArr[A00];
                Object obj2 = C07270Xo.A04;
                if (obj != obj2) {
                    objArr[A00] = obj2;
                    c07270Xo.A01 = true;
                }
            }
            if (str == null) {
                Log.w(A0B, "Activity result delivered for unknown Fragment.");
                return;
            }
            C0BA A02 = this.A08.A00.A03.A0Q.A02(str);
            if (A02 == null) {
                C000200d.A17("Activity result no fragment exists for who: ", str, A0B);
                return;
            } else {
                A02.A0h(i & 65535, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A08.A00.A03.A0C();
        this.A08.A00.A03.A0L(configuration);
    }

    @Override // X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        int length;
        C0UG c0ug = this.A08.A00;
        c0ug.A03.A0f(c0ug, c0ug, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(A0C);
            C0UG c0ug2 = this.A08.A00;
            if (c0ug2 instanceof InterfaceC02380Ay) {
                c0ug2.A03.A0M(parcelable);
                if (bundle.containsKey(A0D)) {
                    this.A00 = bundle.getInt(A0D);
                    int[] intArray = bundle.getIntArray(A0F);
                    String[] stringArray = bundle.getStringArray(A0E);
                    if (intArray != null && stringArray != null && (length = intArray.length) == stringArray.length) {
                        this.A01 = new C07270Xo(length);
                        for (int i = 0; i < length; i++) {
                            this.A01.A05(intArray[i], stringArray[i]);
                        }
                    } else {
                        Log.w(A0B, "Invalid requestCode mapping in savedInstanceState.");
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.A01 == null) {
            this.A01 = new C07270Xo(10);
            this.A00 = 0;
        }
        super.onCreate(bundle);
        this.A09.A05(C0C1.ON_CREATE);
        AbstractC02800Cx abstractC02800Cx = this.A08.A00.A03;
        abstractC02800Cx.A0L = false;
        abstractC02800Cx.A0M = false;
        abstractC02800Cx.A0J(1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            C0UR c0ur = this.A08;
            return onCreatePanelMenu | c0ur.A00.A03.A0u(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View A0M = A0M(view, str, context, attributeSet);
        return A0M == null ? super.onCreateView(view, str, context, attributeSet) : A0M;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View A0M = A0M(null, str, context, attributeSet);
        return A0M == null ? super.onCreateView(str, context, attributeSet) : A0M;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A08.A00.A03.A09();
        this.A09.A05(C0C1.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.A08.A00.A03.A0A();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.A08.A00.A03.A0v(menuItem);
        }
        return this.A08.A00.A03.A0w(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.A08.A00.A03.A0n(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A08.A00.A03.A0C();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.A08.A00.A03.A0N(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.A04 = false;
        this.A08.A00.A03.A0J(3);
        this.A09.A05(C0C1.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.A08.A00.A03.A0o(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        A0P();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return A0b(view, menu) | this.A08.A00.A03.A0t(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity, X.C0B2
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.A08.A00.A03.A0C();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            C07270Xo c07270Xo = this.A01;
            String str = (String) c07270Xo.A02(i3, null);
            int A00 = AnonymousClass030.A00(c07270Xo.A02, c07270Xo.A00, i3);
            if (A00 >= 0) {
                Object[] objArr = c07270Xo.A03;
                Object obj = objArr[A00];
                Object obj2 = C07270Xo.A04;
                if (obj != obj2) {
                    objArr[A00] = obj2;
                    c07270Xo.A01 = true;
                }
            }
            if (str == null) {
                Log.w(A0B, "Activity result delivered for unknown Fragment.");
                return;
            }
            C0BA A02 = this.A08.A00.A03.A0Q.A02(str);
            if (A02 == null) {
                C000200d.A17("Activity result no fragment exists for who: ", str, A0B);
            } else {
                A02.A0N(i & 65535, strArr, iArr);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.A04 = true;
        this.A08.A00.A03.A0C();
        this.A08.A00.A03.A0p(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A0G();
        this.A09.A05(C0C1.ON_STOP);
        Parcelable A04 = this.A08.A00.A03.A04();
        if (A04 != null) {
            bundle.putParcelable(A0C, A04);
        }
        if (this.A01.A00() > 0) {
            bundle.putInt(A0D, this.A00);
            C07270Xo c07270Xo = this.A01;
            int[] iArr = new int[c07270Xo.A00()];
            String[] strArr = new String[c07270Xo.A00()];
            for (int i = 0; i < c07270Xo.A00(); i++) {
                if (c07270Xo.A01) {
                    c07270Xo.A03();
                }
                iArr[i] = c07270Xo.A02[i];
                if (c07270Xo.A01) {
                    c07270Xo.A03();
                }
                strArr[i] = c07270Xo.A03[i];
            }
            bundle.putIntArray(A0F, iArr);
            bundle.putStringArray(A0E, strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.A07 = false;
        if (!this.A02) {
            this.A02 = true;
            AbstractC02800Cx abstractC02800Cx = this.A08.A00.A03;
            abstractC02800Cx.A0L = false;
            abstractC02800Cx.A0M = false;
            abstractC02800Cx.A0J(2);
        }
        this.A08.A00.A03.A0C();
        this.A08.A00.A03.A0p(true);
        this.A09.A05(C0C1.ON_START);
        AbstractC02800Cx abstractC02800Cx2 = this.A08.A00.A03;
        abstractC02800Cx2.A0L = false;
        abstractC02800Cx2.A0M = false;
        abstractC02800Cx2.A0J(3);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.A08.A00.A03.A0C();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.A07 = true;
        A0G();
        AbstractC02800Cx abstractC02800Cx = this.A08.A00.A03;
        abstractC02800Cx.A0M = true;
        abstractC02800Cx.A0J(2);
        this.A09.A05(C0C1.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.A05 && i != -1) {
            A0H(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.A05 && i != -1) {
            A0H(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.A06 && i != -1) {
            A0H(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.A06 && i != -1) {
            A0H(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
