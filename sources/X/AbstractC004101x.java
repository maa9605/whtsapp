package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.01x */
/* loaded from: classes.dex */
public abstract class AbstractC004101x {
    public static int A00 = -100;
    public static final AnonymousClass036 A01 = new AnonymousClass036(0);
    public static final Object A02 = new Object();

    public abstract MenuInflater A02();

    public abstract View A03(int i);

    public abstract View A04(View view, String str, Context context, AttributeSet attributeSet);

    public abstract C0U1 A05();

    public abstract InterfaceC06600Ua A06();

    public abstract C0U0 A07(C0O8 c0o8);

    public abstract void A08();

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C();

    public abstract void A0D();

    public void A0E(int i) {
    }

    public abstract void A0F(int i);

    public void A0G(Context context) {
    }

    public abstract void A0H(Configuration configuration);

    public abstract void A0I(Bundle bundle);

    public abstract void A0J(Bundle bundle);

    public abstract void A0K(Bundle bundle);

    public abstract void A0L(View view);

    public abstract void A0M(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0N(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void A0O(Toolbar toolbar);

    public abstract void A0P(CharSequence charSequence);

    public abstract boolean A0Q();

    public abstract boolean A0R(int i);

    public static void A00(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (A00 == i) {
        } else {
            A00 = i;
            synchronized (A02) {
                Iterator it = A01.iterator();
                while (true) {
                    C06440Td c06440Td = (C06440Td) it;
                    if (c06440Td.hasNext()) {
                        AbstractC004101x abstractC004101x = (AbstractC004101x) ((WeakReference) c06440Td.next()).get();
                        if (abstractC004101x != null) {
                            abstractC004101x.A0Q();
                        }
                    }
                }
            }
        }
    }

    public static void A01(AbstractC004101x abstractC004101x) {
        synchronized (A02) {
            Iterator it = A01.iterator();
            while (true) {
                C06440Td c06440Td = (C06440Td) it;
                if (c06440Td.hasNext()) {
                    AbstractC004101x abstractC004101x2 = (AbstractC004101x) ((WeakReference) c06440Td.next()).get();
                    if (abstractC004101x2 == abstractC004101x || abstractC004101x2 == null) {
                        c06440Td.remove();
                    }
                }
            }
        }
    }
}
